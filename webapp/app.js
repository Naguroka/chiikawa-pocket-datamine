/* Chiikawa Pocket Team Calculator — engine + UI
   All game math from the v2.4.1 datamine (see analysis/REPORT.md). */
'use strict';

/* ============ number formatting (game-style suffixes) ============ */
const SUF = ['', 'K', 'M', 'B', 'T'];
function suffixFor(n) {
  // '', K, M, B, T, aa, ab, ac... like the game
  if (n < 5) return SUF[n];
  let k = n - 5, s = '';
  do { s = String.fromCharCode(97 + (k % 26)) + s; k = Math.floor(k / 26) - 1; } while (k >= 0);
  return s;
}
function fmt(x, digits = 3) {
  if (!isFinite(x)) return '∞';
  if (x === 0) return '0';
  const neg = x < 0; x = Math.abs(x);
  let tier = 0;
  while (x >= 1000 && tier < 100) { x /= 1000; tier++; }
  let v = x >= 100 ? x.toFixed(0) : x >= 10 ? x.toFixed(1) : x.toFixed(2);
  return (neg ? '-' : '') + v + suffixFor(tier);
}
function fmtPct(x, d = 1) { return (x * 100).toFixed(d) + '%'; }

/* ============ game math primitives ============ */
// LevelRangeValue evaluation (matches WithNetwork.LevelRangeValue.GetValue)
function evalLRV(row, L) {
  if (!row) return 0;
  let v;
  if (row.t === 'Default' || row.t === 1) {
    const total = row.e - row.s;
    v = total === 0 ? Number(row.ev) : Number(row.sv) + (Number(row.ev) - Number(row.sv)) * (L - row.s) / total;
  } else if (row.t === 'AddConstant' || row.t === 2) {
    v = L > 0 ? Number(row.sv) + Number(row.ev) * (L - row.s) : 0;
  } else if (row.t === 'FixedLevel' || row.t === 3) {
    v = Number(row.sv);
  } else v = Number(row.sv);
  if (row.vt === 'Permil' || row.vt === 2) v /= 1000;
  return v;
}
function evalGroup(gid, L) {
  const rows = DATA.lrvGroups[String(gid)];
  if (!rows || rows.length === 0) return 1;
  let best = null;
  for (const r of rows) {
    const end = r.e === 0 ? Infinity : r.e;
    if (L >= r.s && L <= end) { best = r; break; }
  }
  if (!best) best = rows[rows.length - 1];
  return evalLRV(best, L);
}
// skill effect value at skill level
function skillValueAt(eff, slv) { return eff.lv ? evalLRV(eff.lv, slv) : 0; }

const BUFF_TYPES = {
  StatusAttackUp: 'attack', StatusAttackSpeedUp: 'atkSpeed', StatusCriticalRateUp: 'critRate',
  StatusCriticalAttackUp: 'critDmg', StatusBossDamageUp: 'bossRate', StatusMobDamageUp: 'mobRate',
  StatusAttackDown: 'enemyAtkDown', StatusDefenceDown: 'defDown', StatusSpeedDown: 'enemySpeedDown',
  StatusCriticalDefenceDown: 'critDefDown', RecastReset: 'recastReset',
};
const RARITY_NAME = { 1: 'SR', 2: 'HR', 3: 'UR' };

/* ============ state ============ */
const DEF_STATE = {
  owned: {},        // costumeId -> level
  locks: {},        // slotIndex(0-5) -> costumeId
  items: {},        // itemKey -> owned bool
  inputs: {},
};
let state = loadState();
function loadState() {
  try {
    const s = JSON.parse(localStorage.getItem('chipok-calc'));
    if (s && s.owned) return Object.assign({}, DEF_STATE, s);
  } catch (e) { /* fresh */ }
  return JSON.parse(JSON.stringify(DEF_STATE));
}
function saveState() { localStorage.setItem('chipok-calc', JSON.stringify(state)); }

function readInputs() {
  const g = id => parseFloat(document.getElementById(id).value) || 0;
  const mode = document.getElementById('in-mode').value;
  return {
    critRate: Math.min(1, Math.max(0, g('in-critRate'))),
    critDmg: Math.max(0, g('in-critDmg')),
    normalRate: g('in-normalRate') || 1,
    skillRate: g('in-skillRate') || 1,
    uniqueRate: g('in-uniqueRate') || 1,
    bossRate: g('in-bossRate') || 1,
    mobRate: g('in-mobRate') || 1,
    atkSpeed: g('in-atkSpeed') || 0.66,
    cdr: Math.min(0.9, Math.max(0, g('in-cdr'))),
    defDebuff: g('in-defDebuff') || 1,
    tagWeight: g('in-tagWeight'),
    mode,
  };
}

/* ============ costume & skill model ============ */
function skillOf(c) { return DATA.skills[String(c.skill)]; }

function costumeSkillProfile(c) {
  // one-time per costume summary of its skill at a given skill level (= costume level, capped 100)
  const s = skillOf(c);
  if (!s) return null;
  return s;
}

// Per-slot DPS with attack normalized to 1. Returns rich breakdown.
function slotCalc(c, cLv, inp, teamCtx) {
  const s = skillOf(c);
  const ar = evalGroup(c.arGroup, cLv);          // costume attack rate (×)
  const asr = evalGroup(c.asGroup, cLv);         // costume attack speed rate (×)
  const swings = inp.atkSpeed * asr;
  const critRate = Math.min(1, teamCtx.critRate);
  const critE = 1 + critRate * (teamCtx.critDmg - 1);

  // normal attack DPS (attack=1)
  const bossFrac = teamCtx.bossFrac;
  const bmRate = bossFrac * inp.bossRate + (1 - bossFrac) * inp.mobRate;
  const normalDPS = 1 * inp.normalRate * ar * swings * bmRate * inp.defDebuff * critE;

  // skill parts
  const out = {
    id: c.id, char: c.char, rarity: c.rarity, lv: cLv, tags: c.tags,
    ar, asr, swings, normalDPS, skillDPS: 0, dps: 0,
    buffs: [], debuffs: [], hasAoE: false, isNuke: false, isBuff: false, isDebuffer: false,
    skillId: c.skill, recastMs: 0, cycle: 0, skillMult: 0,
  };
  if (!s) { out.dps = normalDPS; return out; }

  const slv = Math.min(100, cLv); // skill level scales on its own 1-100 range; use costume lv
  const cycle = (s.recastMs / 1000) * (1 - inp.cdr) + (s.castMs / 1000) + 0.5;
  out.recastMs = s.recastMs; out.cycle = cycle;

  let skillDPS = 0;
  for (const e of s.effects) {
    const v = skillValueAt(e, slv);
    const type = e.type;
    if (type === 'Attack') {
      // damage multiplier on attack
      let mult = v * c.skillCoef;
      let rate = inp.skillRate * (inp.uniqueRate); // costume unique skill
      let d = 1 * mult * ar * rate * bmRate * inp.defDebuff * critE / cycle;
      if (e.range === 'Range') { out.hasAoE = true; d *= teamCtx.aoeValue; }
      skillDPS += d;
      out.skillMult = Math.max(out.skillMult, mult);
      out.isNuke = true;
    } else if (BUFF_TYPES[type]) {
      const bt = BUFF_TYPES[type];
      const uptime = Math.min(1, (e.buffSec || 0) / cycle);
      if (e.target === 'Enemy') {
        out.debuffs.push({ kind: bt, value: v, uptime });
        out.isDebuffer = true;
      } else {
        out.buffs.push({ kind: bt, value: v, uptime });
        out.isBuff = true;
      }
    }
  }
  out.skillDPS = skillDPS;
  out.dps = normalDPS + skillDPS;
  return out;
}

// team context starts from inputs; buffs/debuffs of team modify it
function buildTeamContext(inp) {
  const bossFrac = inp.mode === 'boss' ? 0.85 : inp.mode === 'farm' ? 0.1 : 0.4;
  const aoeValue = inp.mode === 'farm' ? 1.6 : inp.mode === 'boss' ? 0.4 : 1.0;
  return { critRate: inp.critRate, critDmg: inp.critDmg, bossFrac, aoeValue };
}

// score a full ordered team
function teamCalc(orderedSlots, inp) {
  // gather buffs/debuffs (they apply to the whole team)
  const ctx = buildTeamContext(inp);
  let attackMult = 1, defAmp = 1, notes = [];
  for (const s of orderedSlots) {
    for (const b of s.buffs) {
      if (b.kind === 'attack') attackMult *= (1 + b.value * b.uptime);
      else if (b.kind === 'critRate') ctx.critRate = Math.min(1, ctx.critRate + b.value * b.uptime);
      else if (b.kind === 'critDmg') ctx.critDmg += b.value * b.uptime;
      else if (b.kind === 'atkSpeed') attackMult *= (1 + 0.5 * b.value * b.uptime); // dps via more swings (approx)
      else if (b.kind === 'bossRate') { ctx.bossRateBuff = (ctx.bossRateBuff || 0) + b.value * b.uptime; }
      else if (b.kind === 'mobRate') { ctx.mobRateBuff = (ctx.mobRateBuff || 0) + b.value * b.uptime; }
      else if (b.kind === 'recastReset') notes.push('RecastReset present (not scored)');
    }
    for (const d of s.debuffs) {
      if (d.kind === 'defDown') defAmp *= (1 + d.value * d.uptime);
      else if (d.kind === 'critDefDown') defAmp *= (1 + d.value * d.uptime);
    }
  }
  // recompute slot dps under team context (buffs affect everyone)
  const effInp = Object.assign({}, inp);
  effInp.critRate = ctx.critRate; effInp.critDmg = ctx.critDmg;
  effInp.bossRate = inp.bossRate * (1 + (ctx.bossRateBuff || 0));
  effInp.mobRate = inp.mobRate * (1 + (ctx.mobRateBuff || 0));
  const ctx2 = buildTeamContext(effInp);
  let total = 0;
  const recomputed = orderedSlots.map(s => {
    const c = COSTUME_BY_ID[s.id];
    const r = slotCalc(c, s.lv, effInp, ctx2);
    total += r.dps;
    return r;
  });
  // tag synergy
  const tagCounts = {};
  for (const s of recomputed) for (const t of s.tags) tagCounts[t] = (tagCounts[t] || 0) + 1;
  let tagMult = 1;
  const tagList = [];
  for (const [t, n] of Object.entries(tagCounts)) {
    if (n >= 2) { const m = 1 + (inp.tagWeight / 100) * (n - 1); tagMult *= m; tagList.push({ tag: t, n, m }); }
  }
  total *= attackMult * defAmp * tagMult;
  return { total, slots: recomputed, attackMult, defAmp, tagMult, tagList, tagCounts, ctx: effInp, notes };
}

/* ============ ordering model (sequence-based; the team shares ONE HP pool, so
   nobody tanks — order only decides skill fire sequence) ============ */
function orderScore(slots, inp) {
  // baseline: order-independent team dps
  let score = 0;
  for (const s of slots) score += s.dps;
  const nukeIdx = slots.map((s, i) => s.isNuke ? i : -1).filter(i => i >= 0);
  const nukeDps = i => slots[i].dps;
  let seq = 0;
  // enablers (buff/debuff) score for every nuke to their RIGHT (fires after them)
  for (let i = 0; i < 6; i++) {
    const s = slots[i];
    if (s.isBuff || s.isDebuffer) {
      const enabled = nukeIdx.filter(n => n > i).reduce((a, n) => a + nukeDps(n), 0);
      seq += 0.03 * enabled;
      if (nukeIdx.length && nukeIdx.every(n => n < i)) seq -= 0.02 * score; // wasted enabler behind everything
    }
  }
  // fight-context placement
  if (inp.mode === 'boss') {
    // biggest nuke belongs in the last slots (window alignment); AoE devalued
    const best = slots.reduce((a, s, i) => s.skillMult > (slots[a] ? slots[a].skillMult : 0) ? i : a, 0);
    if (best >= 4) seq += 0.05 * score;
  } else {
    // AoE prefers the middle for wave-clear tempo
    for (let i = 0; i < 6; i++) if (slots[i].hasAoE && i >= 2 && i <= 4) seq += 0.02 * score;
  }
  return score + seq;
}

function* permutations(arr) {
  const a = arr.slice();
  function* gen(k) {
    if (k === 1) { yield a.slice(); return; }
    yield* gen(k - 1);
    for (let i = 0; i < k - 1; i++) {
      const j = k % 2 ? 0 : i;
      [a[j], a[k - 1]] = [a[k - 1], a[j]];
      yield* gen(k - 1);
    }
  }
  yield* gen(a.length);
}

/* ============ data indexes ============ */
const COSTUME_BY_ID = {};
for (const c of DATA.costumes) COSTUME_BY_ID[c.id] = c;
const CHAR_NAME = {};
for (const ch of DATA.characters) CHAR_NAME[ch.id] = ch.main ? 'Chiikawa' : `Char ${ch.id}`;

function costumeLabel(c) {
  return `#${c.id} · ${CHAR_NAME[c.char] || 'Char ' + c.char} · ${RARITY_NAME[c.rarity] || c.rarity}`;
}
function skillDesc(c) {
  const s = skillOf(c);
  if (!s) return 'no skill';
  const parts = [];
  for (const e of s.effects) {
    const v1 = skillValueAt(e, 1), v100 = skillValueAt(e, 100);
    if (e.type === 'Attack') parts.push(`${e.range === 'Range' ? 'AoE' : 'Single'} ${fmt(v1)}×→${fmt(v100)}×`);
    else if (BUFF_TYPES[e.type]) {
      const nm = BUFF_TYPES[e.type];
      const sign = e.target === 'Enemy' ? '-' : '+';
      parts.push(`${nm}${e.range === 'Range' ? '(all)' : ''} ${sign}${fmt(v1)}→${sign}${fmt(v100)} ${e.buffSec}s`);
    }
  }
  parts.push(`${s.recastMs / 1000}s cd`);
  return parts.join(' · ');
}

/* ============ roster UI ============ */
function ownedLevel(id) { return state.owned[id]; }
function isLocked(id) { return Object.values(state.locks).includes(id); }

function renderRoster() {
  const el = document.getElementById('roster');
  const filter = (document.getElementById('roster-filter').value || '').toLowerCase();
  const ownedOnly = document.getElementById('roster-ownedonly').checked;
  let shown = 0, ownedN = 0;
  el.innerHTML = '';
  const sorted = DATA.costumes.slice().sort((a, b) => a.sort - b.sort);
  for (const c of sorted) {
    const owned = ownedLevel(c.id) != null;
    if (owned) ownedN++;
    if (ownedOnly && !owned) continue;
    const s = skillOf(c);
    const text = `${c.id} ${CHAR_NAME[c.char]} ${RARITY_NAME[c.rarity]} ${c.tags.join(' ')} ${skillDesc(c)}`.toLowerCase();
    if (filter && !text.includes(filter)) continue;
    shown++;
    const card = document.createElement('div');
    card.className = 'card' + (owned ? ' owned' : '');
    const badges = [];
    badges.push(`<span class="badge r${c.rarity}">${RARITY_NAME[c.rarity]}</span>`);
    if (s) {
      if (s.effects.some(e => e.type === 'Attack' && e.range === 'Range')) badges.push('<span class="badge aoe">AoE</span>');
      if (s.effects.some(e => e.type === 'Attack' && e.range === 'Single')) badges.push('<span class="badge nuke">Nuke</span>');
      if (s.effects.some(e => e.target === 'Friend' && BUFF_TYPES[e.type])) badges.push('<span class="badge buff">Buff</span>');
      if (s.effects.some(e => e.target === 'Enemy' && BUFF_TYPES[e.type])) badges.push('<span class="badge debuff">Debuff</span>');
    }
    for (const t of c.tags) badges.push(`<span class="badge tag">tag ${t}</span>`);
    card.innerHTML = `
      <div class="head"><span class="title">${costumeLabel(c)}</span>
        <button class="lockbtn ${isLocked(c.id) ? 'locked' : ''}" data-lock="${c.id}">${isLocked(c.id) ? '🔒 slot' : 'lock'}</button>
      </div>
      <div class="row">${badges.join('')}</div>
      <div class="row hint">${skillDesc(c)}</div>
      <div class="row lvl">
        <label><input type="checkbox" data-own="${c.id}" ${owned ? 'checked' : ''}> owned</label>
        ${owned ? `<label>costume lv <input type="number" min="1" max="200" value="${ownedLevel(c.id)}" data-lv="${c.id}"></label>` : ''}
      </div>`;
    el.appendChild(card);
  }
  document.getElementById('roster-count').textContent = `(${ownedN} owned, showing ${shown})`;
  el.querySelectorAll('[data-own]').forEach(cb => cb.addEventListener('change', e => {
    const id = +e.target.dataset.own;
    if (e.target.checked) state.owned[id] = 100; else { delete state.owned[id]; deleteSlotLock(id); }
    saveState(); renderRoster();
  }));
  el.querySelectorAll('[data-lv]').forEach(inp => inp.addEventListener('change', e => {
    state.owned[+e.target.dataset.lv] = Math.max(1, Math.min(200, +e.target.value || 1));
    saveState();
  }));
  el.querySelectorAll('[data-lock]').forEach(btn => btn.addEventListener('click', e => {
    toggleLock(+e.target.dataset.lock); saveState(); renderRoster();
  }));
}
function deleteSlotLock(costumeId) {
  for (const [k, v] of Object.entries(state.locks)) if (v === costumeId) delete state.locks[k];
}
function toggleLock(costumeId) {
  if (isLocked(costumeId)) { deleteSlotLock(costumeId); return; }
  for (let i = 0; i < 6; i++) if (state.locks[i] == null) { state.locks[i] = costumeId; return; }
}

/* ============ optimizer ============ */
function ownedCostumes() {
  return Object.entries(state.owned).map(([id, lv]) => ({ c: COSTUME_BY_ID[id], lv: Math.max(1, Math.min(200, lv)) })).filter(x => x.c);
}

function optimize() {
  const inp = readInputs();
  const roster = ownedCostumes();
  const status = document.getElementById('opt-status');
  if (roster.length === 0) { status.textContent = 'Mark some costumes as owned first.'; return; }
  const ctx0 = buildTeamContext(inp);

  // locked slots
  const locked = [];
  for (let i = 0; i < 6; i++) if (state.locks[i] != null && state.owned[state.locks[i]] != null)
    locked.push({ i, c: COSTUME_BY_ID[state.locks[i]], lv: state.owned[state.locks[i]] });
  const lockedIds = new Set(locked.map(l => l.c.id));
  const freeRoster = roster.filter(x => !lockedIds.has(x.c.id));
  const need = 6 - locked.length;
  if (need < 0) { status.textContent = 'Too many locked slots.'; return; }
  if (freeRoster.length < need) { status.textContent = `Need ${need} more owned costumes for the free slots.`; return; }

  // 1. score each costume standalone
  const scored = freeRoster.map(x => ({ x, r: slotCalc(x.c, x.lv, inp, ctx0) }));
  scored.sort((a, b) => b.r.dps - a.r.dps);

  // 2. greedy fill + swap improvement on team score (with buff interactions)
  function teamScoreOf(list) {
    const slots = list.map(x => slotCalc(x.c, x.lv, inp, buildTeamContext(inp)));
    return teamCalc(slots, inp).total;
  }
  let team = scored.slice(0, need).map(s => s.x);
  // role coverage: ensure at least one AoE if mode != boss and available
  if (inp.mode !== 'boss' && need > 0) {
    const hasAoE = team.some(x => slotCalc(x.c, x.lv, inp, ctx0).hasAoE);
    if (!hasAoE) {
      const bestAoE = scored.find(s => slotCalc(s.x.c, s.x.lv, inp, ctx0).hasAoE);
      if (bestAoE && !team.includes(bestAoE.x)) team[team.length - 1] = bestAoE.x;
    }
  }
  let improved = true, guard = 0;
  while (improved && guard++ < 12) {
    improved = false;
    let cur = teamScoreOf(team);
    for (let i = 0; i < team.length; i++) {
      for (const cand of scored) {
        if (team.includes(cand.x)) continue;
        const trial = team.slice(); trial[i] = cand.x;
        const sc = teamScoreOf(trial);
        if (sc > cur * 1.001) { team = trial; cur = sc; improved = true; }
      }
    }
  }

  // 3. optimize order over all members (locked slots keep their positions)
  const freeCalcs = team.map(x => slotCalc(x.c, x.lv, inp, ctx0));
  const lockedCalcs = locked.map(l => ({ i: l.i, r: slotCalc(l.c, l.lv, inp, ctx0) }));
  let best = null, bestScore = -Infinity;
  for (const perm of permutations(freeCalcs)) {
    // place into full 6 with locks
    const full = new Array(6); let p = 0;
    for (const l of lockedCalcs) full[l.i] = l.r;
    for (let i = 0; i < 6; i++) if (!full[i]) full[i] = perm[p++];
    const sc = orderScore(full, inp);
    if (sc > bestScore) { bestScore = sc; best = full; }
  }
  renderResult(best, inp, 'optimized team');
  status.textContent = `Evaluated ${scored.length} owned costumes, ${factorial(need)} orders.`;
}
function factorial(n) { let r = 1; for (let i = 2; i <= n; i++) r *= i; return r; }

function optimizeOrderOnly() {
  const inp = readInputs();
  const roster = ownedCostumes();
  if (roster.length < 6) { document.getElementById('opt-status').textContent = 'Need exactly ≥6 owned costumes; using the first 6 by sort order.'; }
  const six = roster.slice(0, 6);
  if (six.length < 6) { document.getElementById('opt-status').textContent = 'Need 6 owned costumes.'; return; }
  const ctx0 = buildTeamContext(inp);
  const calcs = six.map(x => slotCalc(x.c, x.lv, inp, ctx0));
  let best = null, bestScore = -Infinity;
  for (const perm of permutations(calcs)) {
    const sc = orderScore(perm, inp);
    if (sc > bestScore) { bestScore = sc; best = perm; }
  }
  renderResult(best, inp, 'order-only (your current 6)');
}

/* ============ result rendering ============ */
function renderResult(orderedSlots, inp, title) {
  const tc = teamCalc(orderedSlots, inp);
  const sum = document.getElementById('team-summary');
  const critE = 1 + Math.min(1, tc.ctx.critRate) * (tc.ctx.critDmg - 1);
  sum.innerHTML = `
    <span>Mode: <b>${inp.mode}</b> (${title})</span>
    <span class="big">Team DPS ≈ ${fmt(tc.total)}× your attack</span>
    <span>Crit: ${fmtPct(tc.ctx.critRate)} @ ${tc.ctx.critDmg.toFixed(2)}× (E=${critE.toFixed(3)}×)</span>
    <span>Buff mult: ${tc.attackMult.toFixed(3)}× · Debuff amp: ${tc.defAmp.toFixed(3)}× · Tags: ${tc.tagMult.toFixed(3)}×</span>
    <span>${tc.tagList.map(t => `tag ${t.tag} ×${t.n}`).join(', ') || 'no tag pairs'}</span>`;

  const roles = ['opener', 'enabler', 'enabler', 'tempo', 'dps', 'finisher'];
  const wrap = document.getElementById('team-slots');
  wrap.innerHTML = '';
  tc.slots.forEach((s, i) => {
    const c = COSTUME_BY_ID[s.id];
    const div = document.createElement('div');
    div.className = 'slot' + (i === 5 ? ' carry' : i === 0 ? ' tank' : '');
    const buffTxt = s.buffs.map(b => `${b.kind} +${fmt(b.value)} @${fmtPct(b.uptime, 0)}`).join('<br>');
    const debTxt = s.debuffs.map(d => `${d.kind} ${fmt(d.value)} @${fmtPct(d.uptime, 0)}`).join('<br>');
    div.innerHTML = `
      <div class="pos">${i + 1}</div>
      <div class="role">${roles[i]}</div>
      <div class="name">${costumeLabel(c)} <span class="hint">Lv${s.lv}</span></div>
      <div class="nums">
        <span>atk rate ×<b>${s.ar.toFixed(3)}</b> · swings <b>${s.swings.toFixed(2)}/s</b></span>
        <span>normal <b>${fmt(s.normalDPS)}</b> + skill <b>${fmt(s.skillDPS)}</b></span>
        <span>= <b>${fmt(s.dps)}</b> /s</span>
        ${s.skillMult ? `<span>skill mult <b>${fmt(s.skillMult)}×</b> · cycle <b>${s.cycle.toFixed(1)}s</b></span>` : ''}
        ${buffTxt ? `<span class="badge buff">${buffTxt}</span>` : ''}
        ${debTxt ? `<span class="badge debuff">${debTxt}</span>` : ''}
        <span class="hint">${s.tags.map(t => 'tag ' + t).join(' ')}</span>
      </div>`;
    wrap.appendChild(div);
  });

  // math breakdown
  const lines = [];
  lines.push(`Why this order: your team shares ONE HP pool — nobody tanks and nobody dies early.`);
  lines.push(`Order only decides skill fire sequence (FIFO, 0.5s unique / 2s assist gaps): enablers placed left of nukes.`);
  lines.push('');
  orderedSlots.forEach((s, i) => {
    lines.push(`Slot ${i + 1} ${costumeLabel(COSTUME_BY_ID[s.id])} Lv${s.lv}: normal ${fmt(s.normalDPS)} (1×${inp.normalRate}×${s.ar.toFixed(3)}ar×${s.swings.toFixed(2)}sw×rates) + skill ${fmt(s.skillDPS)} = ${fmt(s.dps)}/s`);
  });
  lines.push('');
  lines.push(`Team: Σdps ${fmt(tc.slots.reduce((a, s) => a + s.dps, 0))} × buff ${tc.attackMult.toFixed(3)} × debuff ${tc.defAmp.toFixed(3)} × tags ${tc.tagMult.toFixed(3)} = ${fmt(tc.total)}/s`);
  if (tc.notes.length) lines.push(tc.notes.join(' '));
  document.getElementById('team-math').textContent = lines.join('\n');
}

/* ============ items tab ============ */
// effect value of a possessionFx row at a given item level
function fxValueAt(fxid, lv) {
  const fx = DATA.possessionFx[String(fxid)];
  if (!fx) return null;
  let v = Number(fx.value);
  let scaled = false;
  if (fx.group && DATA.lrvGroups[String(fx.group)]) { v = evalGroup(fx.group, lv); scaled = true; }
  else if (fx.vt === 'Permil') { v /= 1000; scaled = true; }
  return { status: fx.status, v, scaled };
}
function itemState(key) {
  const s = state.items[key];
  if (s === true) return { own: true, eq: false };   // migrate legacy
  return { own: !!(s && s.own), eq: !!(s && s.eq) };
}
function setItemState(key, patch) {
  const cur = itemState(key);
  state.items[key] = Object.assign(cur, patch);
  saveState();
}
function targetText(cf) {
  if (!cf) return '';
  if (cf.target === 'Party') return '🎯 whole team';
  if (cf.target === 'AssistCharacter') return `🎯 assist ${cf.targetIds.join(',')}`;
  return `🎯 character ${cf.targetIds.join(',')}`;
}
function itemEffectText(it) {
  const parts = [];
  const own = fxValueAt(it.posFx, 1);
  if (own) parts.push(`<b>own:</b> ${own.status} ${fmt(own.v)}${own.scaled ? ' (scales w/ item lv)' : ''}`);
  const eq = fxValueAt(it.equipFx, 1);
  if (eq) parts.push(`<b>equip:</b> ${eq.status} ${fmt(eq.v)}${eq.scaled ? ' (scales)' : ''}`);
  return parts.join(' · ') || 'no effect data';
}
function keyholderText(g) {
  const cf = DATA.customFx[String(g.equipFx)];
  const fx = cf ? fxValueAt(cf.fx, 1) : null;
  const parts = [];
  if (cf && fx) parts.push(`<b>equip:</b> ${fx.status} ${fmt(fx.v)} ${targetText(cf)} (scales w/ level)`);
  const rf = DATA.customFx[String(g.rarityFx[0])];
  const rfx = rf ? fxValueAt(rf.fx, 1) : null;
  if (rf && rfx) parts.push(`<b>rarity tiers:</b> up to ${g.rarityFx.length} effects (e.g. ${rfx.status} ${targetText(rf)})`);
  return parts.join(' · ') || 'no effect data';
}
function renderItems() {
  const el = document.getElementById('items');
  const kind = document.getElementById('item-kind').value;
  el.innerHTML = '';
  const addCard = (key, title, text, showEq, levelSel) => {
    const st = itemState(key);
    const card = document.createElement('div');
    card.className = 'card' + (st.own ? ' owned' : '');
    card.innerHTML = `
      <div class="head"><span class="title">${title}</span></div>
      <div class="row hint">${text}</div>
      <div class="row lvl">
        <label><input type="checkbox" data-own="${key}" ${st.own ? 'checked' : ''}> owned</label>
        ${showEq ? `<label><input type="checkbox" data-eq="${key}" ${st.eq ? 'checked' : ''} ${st.own ? '' : 'disabled'}> equipped</label>` : ''}
        ${levelSel ? `<label>lv <input type="number" min="1" max="${levelSel}" value="${(state.items[key] && state.items[key].lv) || 1}" data-lv="${key}" style="width:4em"></label>` : ''}
      </div>`;
    el.appendChild(card);
  };
  if (!kind || kind === 'weapon' || kind === 'armor' || kind === 'assist' || kind === 'treasure') {
    for (const it of DATA.items) {
      if (kind && it.kind !== kind) continue;
      addCard(it.kind + ':' + it.id, `${it.kind} #${it.id}${it.rarity ? ' · ' + it.rarity : ''}`, itemEffectText(it), true);
    }
  }
  if (!kind || kind === 'home') {
    for (const h of DATA.homeItems) {
      const fx = fxValueAt(h.fx, 1);
      addCard('home:' + h.id, `home item #${h.id} · ${h.type}`,
        `<b>own:</b> ${fx ? fx.status : '?'} ×1.15 / ×1.20 / ×1.30 at item Lv1/2/3 (placement is cosmetic — owning is what counts)`, false, h.maxLv);
    }
  }
  if (!kind || kind === 'keyholder') {
    for (const g of DATA.keyholderGroups) {
      addCard('kh:' + g.id, `keyholder #${g.id} · char ${g.chara} + assist ${g.assist}`, keyholderText(g), true);
    }
  }
  el.querySelectorAll('[data-own]').forEach(cb => cb.addEventListener('change', e => {
    const key = e.target.dataset.own;
    setItemState(key, { own: e.target.checked, eq: e.target.checked ? itemState(key).eq : false });
    saveState(); renderItems();
  }));
  el.querySelectorAll('[data-eq]').forEach(cb => cb.addEventListener('change', e => {
    setItemState(e.target.dataset.eq, { eq: e.target.checked }); saveState(); renderItemSummary();
    e.target.closest('.card').classList.toggle('owned', itemState(e.target.dataset.eq).own || e.target.checked);
  }));
  el.querySelectorAll('[data-lv]').forEach(inp => inp.addEventListener('change', e => {
    const key = e.target.dataset.lv;
    const cur = state.items[key] && typeof state.items[key] === 'object' ? state.items[key] : { own: true, eq: false };
    state.items[key] = Object.assign(cur, { lv: Math.max(1, +e.target.value || 1) });
    saveState(); renderItemSummary();
  }));
  renderItemSummary();
}
function accumFx(sums, fxid, lv, note) {
  const r = fxValueAt(fxid, lv);
  if (!r) return;
  const st = r.status;
  sums[st] = sums[st] || { add: 0, mult: 1, notes: [] };
  if (Math.abs(r.v) < 100 && r.scaled) sums[st].mult += r.v;
  else sums[st].add += r.v;
  if (note) sums[st].notes.push(note);
}
function renderItemSummary() {
  const lv = Math.max(1, +document.getElementById('item-level').value || 1);
  const sums = {};
  for (const it of DATA.items) {
    const st = itemState(it.kind + ':' + it.id);
    if (st.own) accumFx(sums, it.posFx, lv);
    if (st.own && st.eq) accumFx(sums, it.equipFx, lv);
  }
  for (const h of DATA.homeItems) {
    const st = itemState('home:' + h.id);
    if (st.own) accumFx(sums, h.fx, (state.items['home:' + h.id] && state.items['home:' + h.id].lv) || 1, 'home');
  }
  const targeted = [];
  for (const g of DATA.keyholderGroups) {
    const st = itemState('kh:' + g.id);
    if (!(st.own && st.eq)) continue;
    const cf = DATA.customFx[String(g.equipFx)];
    if (!cf) continue;
    if (cf.target === 'Party') accumFx(sums, cf.fx, lv, 'keyholder');
    else {
      const r = fxValueAt(cf.fx, lv);
      if (r) targeted.push(`${r.status} ×${fmt(r.v)} ${targetText(cf)}`);
    }
  }
  const el = document.getElementById('item-summary');
  const txt = Object.entries(sums).map(([st, s]) =>
    `${st}: ${s.mult > 1 ? '×' + s.mult.toFixed(3) : ''}${s.add ? ' +' + fmt(s.add) : ''}`).join(' · ');
  el.innerHTML = (txt ? `<b>Item totals (lv ${lv}):</b> ${txt}` : 'No items checked yet.') +
    (targeted.length ? `<br><span class="hint">🎯 Targeted (only count when that character is in play): ${targeted.join(' · ')}</span>` : '');
  el.dataset.sums = JSON.stringify(sums);
}

/* ============ tabs & events ============ */
function bindTabs() {
  document.querySelectorAll('.tab').forEach(b => b.addEventListener('click', () => {
    document.querySelectorAll('.tab').forEach(x => x.classList.remove('active'));
    document.querySelectorAll('.tabpage').forEach(x => x.classList.remove('active'));
    b.classList.add('active');
    document.getElementById('tab-' + b.dataset.tab).classList.add('active');
    if (b.dataset.tab === 'items') renderItems();
  }));
}
function bindControls() {
  document.getElementById('roster-filter').addEventListener('input', renderRoster);
  document.getElementById('roster-ownedonly').addEventListener('change', renderRoster);
  document.getElementById('btn-allowned').addEventListener('click', () => {
    for (const c of DATA.costumes) state.owned[c.id] = state.owned[c.id] || 100; saveState(); renderRoster();
  });
  document.getElementById('btn-noneowned').addEventListener('click', () => {
    state.owned = {}; state.locks = {}; saveState(); renderRoster();
  });
  document.getElementById('btn-optimize').addEventListener('click', optimize);
  document.getElementById('btn-orderonly').addEventListener('click', optimizeOrderOnly);
  document.getElementById('btn-clearlocks').addEventListener('click', () => { state.locks = {}; saveState(); renderRoster(); });
  document.getElementById('item-kind').addEventListener('change', renderItems);
  document.getElementById('item-level').addEventListener('change', renderItemSummary);
  document.getElementById('btn-applyitems').addEventListener('click', () => {
    const sums = JSON.parse(document.getElementById('item-summary').dataset.sums || '{}');
    const mul = (id, st) => {
      const s = sums[st]; if (!s) return;
      const el = document.getElementById(id);
      el.value = ((parseFloat(el.value) || 1) * (s.mult || 1)).toFixed(3);
    };
    mul('in-bossRate', 'BossDamageRate'); mul('in-mobRate', 'MobDamageRate');
    mul('in-normalRate', 'NormalAttackDamageRate'); mul('in-skillRate', 'SkillDamageRate');
    mul('in-uniqueRate', 'UniqueSkillDamageRate');
    if (sums['CriticalRate']) document.getElementById('in-critRate').value =
      Math.min(1, (parseFloat(document.getElementById('in-critRate').value) || 0) + (sums['CriticalRate'].mult - 1)).toFixed(3);
    if (sums['CriticalDamage']) document.getElementById('in-critDmg').value =
      ((parseFloat(document.getElementById('in-critDmg').value) || 1) + (sums['CriticalDamage'].mult - 1)).toFixed(3);
    document.querySelector('.tab[data-tab=optimizer]').click();
  });
  // persist inputs
  const ids = ['in-critRate', 'in-critDmg', 'in-normalRate', 'in-skillRate', 'in-uniqueRate',
    'in-bossRate', 'in-mobRate', 'in-atkSpeed', 'in-cdr', 'in-defDebuff', 'in-tagWeight', 'in-mode'];
  for (const id of ids) {
    const el = document.getElementById(id);
    if (state.inputs[id] != null) el.value = state.inputs[id];
    el.addEventListener('change', () => { state.inputs[id] = el.value; saveState(); });
  }
}

bindTabs();
bindControls();
renderRoster();
