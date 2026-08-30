#!/usr/bin/env python3
"""Mirror-test of the webapp engine math against the datamined tables."""
import json, os, itertools

BASE = r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled"
MD = os.path.join(BASE, 'analysis', 'masterdata')
def load(n): return json.load(open(os.path.join(MD, n + '.json'), encoding='utf-8'))

costumes = {c['id']: c for c in load('Costume')}
skills = {s['id']: s for s in load('HuntSkill')}
effects = {e['id']: e for e in load('HuntSkillEffect')}
lrv = {r['id']: r for r in load('LevelRangeValue')}
lrvg = load('LevelRangeValueGroup')

groups = {}
for g in lrvg:
    groups[g['id']] = [lrv[i] for i in g['levelRangeValueIds'] if i in lrv]

def evalLRV(r, L):
    t = r['levelRangeType']
    if t == 'Default':
        total = r['rangeEndLevel'] - r['rangeStartLevel']
        v = float(r['endValue']) if total == 0 else float(r['startValue']) + (float(r['endValue']) - float(r['startValue'])) * (L - r['rangeStartLevel']) / total
    elif t == 'AddConstant':
        v = float(r['startValue']) + float(r['endValue']) * (L - r['rangeStartLevel']) if L > 0 else 0.0
    else:
        v = float(r['startValue'])
    if r['valueType'] == 'Permil': v /= 1000
    return v

def evalGroup(gid, L):
    rows = groups.get(gid, [])
    for r in rows:
        end = r['rangeEndLevel'] or 10**9
        if r['rangeStartLevel'] <= L <= end:
            return evalLRV(r, L)
    return evalLRV(rows[-1], L) if rows else 1.0

# --- checks ---
print("== skill 311 (should be 1.6 -> 18.43) ==")
s311e = effects[311]
row311 = lrv[s311e['effectLevelRangeValueId']]
print(evalLRV(row311, 1), evalLRV(row311, 100))

print("== costume 11001 attack rate group", costumes[11001]['attackRateLevelRagneGroupId'], "==")
for L in (1, 25, 50, 100, 150, 200):
    print(f"  L{L}: ar={evalGroup(costumes[11001]['attackRateLevelRagneGroupId'], L):.4f} asr={evalGroup(costumes[11001]['attackSpeedLevelRagneGroupId'], L):.4f}")

print("== a few costumes' rates ==")
for cid in (11001, 16001, 21001, 31001):
    c = costumes.get(cid)
    if not c: continue
    print(f"  #{cid} char{c['characterId']} rar{c['costumeRarityId']} skill{c['uniqueHuntSkillId']} coef{c['skillCoefficient']} ar(L100)={evalGroup(c['attackRateLevelRagneGroupId'],100):.3f}")

# --- mock team calc (mirror of app.js) ---
inp = dict(critRate=0.1, critDmg=1.5, normalRate=1.0, skillRate=1.0, uniqueRate=1.0,
           bossRate=1.5, mobRate=1.0, atkSpeed=0.66, cdr=0.0, defDebuff=1.0, tagWeight=2,
           mode='balanced', survival='safe')
BUFF_TYPES = {'StatusAttackUp':'attack','StatusAttackSpeedUp':'atkSpeed','StatusCriticalRateUp':'critRate',
 'StatusCriticalAttackUp':'critDmg','StatusBossDamageUp':'bossRate','StatusMobDamageUp':'mobRate',
 'StatusAttackDown':'enemyAtkDown','StatusDefenceDown':'defDown','StatusSpeedDown':'enemySpeedDown',
 'StatusCriticalDefenceDown':'critDefDown','RecastReset':'recastReset'}

def slotCalc(c, cLv, inp, bossFrac=0.4, aoeValue=1.0):
    s = skills.get(c['uniqueHuntSkillId'])
    ar = evalGroup(c['attackRateLevelRagneGroupId'], cLv)
    asr = evalGroup(c['attackSpeedLevelRagneGroupId'], cLv)
    swings = inp['atkSpeed'] * asr
    critE = 1 + inp['critRate'] * (inp['critDmg'] - 1)
    bm = bossFrac * inp['bossRate'] + (1 - bossFrac) * inp['mobRate']
    normal = inp['normalRate'] * ar * swings * bm * inp['defDebuff'] * critE
    out = dict(id=c['id'], ar=ar, swings=swings, normalDPS=normal, skillDPS=0, dps=0,
               buffs=[], debuffs=[], hasAoE=False, isNuke=False, isBuff=False, isDebuffer=False, tags=c['tagIds'])
    if not s:
        out['dps'] = normal; return out
    slv = min(100, cLv)
    cycle = s['recastTime'] / 1000 * (1 - inp['cdr']) + s['skillCastTime'] / 1000 + 0.5
    sdps = 0
    for eid in s['skillEffectIds']:
        e = effects[eid]
        v = evalLRV(lrv[e['effectLevelRangeValueId']], slv) if e['effectLevelRangeValueId'] in lrv else 0
        if e['skillEffectType'] == 'Attack':
            d = v * c['skillCoefficient'] * ar * inp['skillRate'] * inp['uniqueRate'] * bm * inp['defDebuff'] * critE / cycle
            if e['targetRangeType'] == 'Range':
                out['hasAoE'] = True; d *= aoeValue
            sdps += d; out['isNuke'] = True
        elif e['skillEffectType'] in BUFF_TYPES:
            up = min(1, e['buffEffectTime'] / cycle)
            if e['targetType'] == 'Enemy':
                out['debuffs'].append((BUFF_TYPES[e['skillEffectType']], v, up)); out['isDebuffer'] = True
            else:
                out['buffs'].append((BUFF_TYPES[e['skillEffectType']], v, up)); out['isBuff'] = True
    out['skillDPS'] = sdps; out['dps'] = normal + sdps
    return out

def teamCalc(slots, inp):
    import copy
    eff = copy.deepcopy(inp)
    atkM, defA = 1.0, 1.0
    for s in slots:
        for k, v, up in s['buffs']:
            if k == 'attack': atkM *= 1 + v * up
            elif k == 'critRate': eff['critRate'] = min(1, eff['critRate'] + v * up)
            elif k == 'critDmg': eff['critDmg'] += v * up
            elif k == 'bossRate': eff['bossRate'] *= 1 + v * up
            elif k == 'mobRate': eff['mobRate'] *= 1 + v * up
        for k, v, up in s['debuffs']:
            if k in ('defDown', 'critDefDown'): defA *= 1 + v * up
    total = sum(slotCalc(costumes[s['id']], 100, eff)['dps'] for s in slots)
    tags = {}
    for s in slots:
        for t in s['tags']: tags[t] = tags.get(t, 0) + 1
    tagM = 1.0
    for t, n in tags.items():
        if n >= 2: tagM *= 1 + inp['tagWeight'] / 100 * (n - 1)
    return total * atkM * defA * tagM, atkM, defA, tagM

# mock roster: a spread of real costumes
roster_ids = [11001, 16001, 21001, 31001, 11002, 12001, 13001, 14001, 15001, 17001, 18001, 19001]
roster_ids = [i for i in roster_ids if i in costumes]
calcs = {cid: slotCalc(costumes[cid], 100, inp) for cid in roster_ids}
print("\n== standalone DPS (attack=1) ==")
for cid, r in sorted(calcs.items(), key=lambda kv: -kv[1]['dps']):
    print(f"  #{cid}: normal={r['normalDPS']:.3f} skill={r['skillDPS']:.3f} dps={r['dps']:.3f} aoe={r['hasAoE']} buff={r['isBuff']} deb={r['isDebuffer']}")

team = [calcs[i] for i in roster_ids[:6]]
best, bs = None, -1
W = {'safe': [1]*6, 'wall': [0.78,0.86,0.94,1.0,1.08,1.16]}[inp['survival']]
wn = sum(W)/6
for perm in itertools.permutations(team):
    sc = sum(p['dps'] * W[i]/wn for i, p in enumerate(perm))
    nukes = [i for i, p in enumerate(perm) if p['isNuke']]
    for i, p in enumerate(perm):
        if p['isBuff'] or p['isDebuffer']:
            sc += 0.015 * len([n for n in nukes if n > i]) * sc / 6
    if sc > bs: bs, best = sc, perm
print("\n== best order (mock) ==")
for i, p in enumerate(best):
    print(f"  slot{i+1}: #{p['id']} dps={p['dps']:.3f} nuke={p['isNuke']} buff={p['isBuff']} deb={p['isDebuffer']} aoe={p['hasAoE']}")
tot, aM, dA, tM = teamCalc(list(best), inp)
print(f"team DPS={tot:.3f} (buff {aM:.3f} x debuff {dA:.3f} x tags {tM:.3f})")
