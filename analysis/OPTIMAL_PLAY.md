# Chiikawa Pocket — The Mathematically Optimal Play Guide

*Every recommendation below is derived from the game's actual formulas (see `MECHANICS.md` and `REPORT.md` for the raw math). Where the game itself can't answer something (e.g. server-side gacha rates), we say so honestly instead of guessing.*

---

## 0. The one rule that beats all others

**Your income is determined by your highest cleared stage. Every stage you clear permanently raises your gold per minute — and gold buys the stats that clear stages.**

So the entire strategy reduces to: **push stages as hard as possible, then convert stage income into power as efficiently as possible, then push again.** Anything that doesn't raise your stage or your power-per-gold is a side quest.

---

## 1. The engine: how power actually scales (and why "a bit of everything" wins)

Your damage output is a *product* of independent multipliers:

```
DPS ≈ Attack × AttackSpeed × [1 + CritRate × (CritDamage − 1)]
      × NormalRate/SkillRate × Boss-or-Mob Rate × AttackRate(costume) × debuff amps
```

Math fact: when numbers *multiply*, the biggest total comes from **balanced** factors, not from maxing one. 4×4×4 = 64 beats 8×2×2 = 32. In game terms:

- **Don't dump everything into one stat.** A new multiplier you haven't touched yet is usually worth more than another level in one you've already stacked.
- Flat "Add" bonuses are strongest early (when your base is small); percentage "Multiply / BaseMultiplyAdd" bonuses scale with you and dominate later.
- Because everything multiplies your **base Attack**, base Attack levels are never wasted — they're the soil every multiplier grows from.

**Priority order for stats (general):** Attack (cheap, feeds everything) → Skill/Normal damage rates & costume attack rate → Crit Rate *until it's meaningfully above 0* → Crit Damage → Boss Damage (boss walls) → Attack Speed → Gold Acquire (economy, see §4).

---

## 2. Status Enhancement: where every gold coin goes

You have 7 tracks costing gold, with banded cost growth. The price differences are extreme (from the data):

| Track | Starting cost/level | Per-level gain |
|---|---|---|
| Attack | **3 gold** | +10 attack |
| Health / HP Recover | 2 gold | +10 HP / +0.7 regen |
| Critical Rate | **100 trillion gold** | +0.1% crit |
| (others similar spread) | | |

Optimal policy:

1. **Early game:** max **Attack** (and some Health so you don't get one-shot) — it's 3 gold/level and multiplies everything. This is the best gold-per-power in the game, period.
2. **Mid game:** branch into the multiplier tracks (normal/skill rates, boss rate for boss walls).
3. **Crit is a late-game luxury, on purpose.** The Critical Rate track starts at 10¹⁴ gold/level — the devs priced it as an endgame sink. Don't touch it until gold is meaningless. **Exception:** free crit from skills (the +10–40% crit-rate buff skill) — use it; it makes Crit Damage worthwhile much earlier.
4. **The crit math (know your expected multiplier):** `E = 1 + CritRate × (CritDamage − 1)`.
   - 0% crit → crit damage does literally nothing. Never level crit damage first.
   - 20% crit with 2.2× crit damage → 1.24× average damage (a 24% boost).
   - 50% crit with 3.0× → 2.0× average damage.
   - Rule: level **Crit Rate until 20–30%**, then pile into **Crit Damage** (its +1%/level is huge).
5. **Break-even intuition for "+10 attack vs +0.1% crit rate":** crit level wins when `10/Attack < 0.001×(CritDamage−1)`, i.e. when your attack is above ~10,000/(CritDamage−1). Early game attack wins; late game crit wins. You don't need to compute it — the pattern "attack first, crit later" covers it.

---

## 3. Skills: the 10× level curve is the point

- A skill's multiplier grows **linearly ~10× from level 1 to 100** (e.g. the Super Rare AoE: 56×→650× your attack). Leveling your **main damage skill to 100 is the single biggest power spike available** — do it before spreading levels around.
- **Wave-clear vs boss-kill:** keep one **AoE** skill (hits all enemies) to speed through waves (faster wave-clear = more boss attempts per hour) and one **single-target nuke** for the 30-second boss check. Boss walls are DPS checks, not survival checks — 30s limit means burst > everything.
- **Buff stacking:** the game keeps 64 simultaneous buff/debuff slots and they all apply. Crit-rate + crit-damage buffs multiply each other (crit buff makes crit-damage buff useful; together they're worth far more than either alone — see the E formula).
- **Cooldown reduction** works as `new_time = time × (1 − reduction)` and a recast-reset effect instantly refills another skill's bar — pairing a reset with your longest-cooldown nuke effectively doubles its uptime.

---

## 4. Idle income: the daily math that compounds

- **Cap is 12 hours.** Log in at least **twice a day** (every ≤12h) or you are literally throwing away gold. This is the #1 loss for casual players.
- **Ad bonus: +6 hours of income per ad, 3×/day.** Sequence matters: **push stages FIRST, then watch the 3 ads** — each ad pays 6h at your *current* rate, so using them after reaching a new personal-best stage pays more. Reset is 06:00 UTC.
- **Gold Acquire** stat multiplies all of this — when choosing between otherwise-equal upgrades, the Gold Acquire one pays for itself.
- Push one more stage before bed: overnight accrual is at the new rate forever.

---

## 5. Gacha & collection: the math of pulling

- **Always 35-draw, never 11-draw** (with gems): 1,500/35 ≈ 42.9 gems vs 500/11 ≈ 45.5 — a ~5.7% discount, and tickets follow the same 11/35 pattern.
- **Free 11-draw ×3/day from ads** — free EV every day; reset 15:00 JST.
- **Collection > equipment.** Every costume/weapon/armor/keyholder gives its *possession* bonus even while unequipped. A "bad" pull still makes you permanently stronger. This changes the value equation: **wide collection beats narrow investment**, so pulling on banners with many items you don't own is worth more than sniping one item on a banner where you own most of the pool.
- **Duplicates are not dead pulls** — keyholders merge up: 3 copies per rarity step (Normal→…→Super Rare), then 1 copy + 2 same-rarity fodder per step up to Legend Rare. Each rarity tier unlocks *another permanent possession effect*. Plan merges around groups whose effects you actually want (combat stats first).
- **Honest note on rates:** drop rates are computed server-side; the game files don't contain them, so there is no datamined pity math to optimize around. Budget gems assuming worst case; treat any pity/level structure visible in-game as the only guarantee.
- Limited draws ("Never" refresh, 1–3 uses) are one-time — do them when they appear; daily-limited ones (3/day) fit into the daily routine.

---

## 6. Cooking: 9× output from the same kitchen

The production chain is multiplicative: `base × cafe × kitchen level × slot × genre × boost × buffs`.

Optimal assignment:

1. **Genre-match every kitchen** (1.5×). Mismatched chefs are throwing away a third of output.
2. **Main slot gets your best chef** (1.0× vs sub slot 0.3×) — and note the rarity weights are **inverted**: Super Rare scores **3×**, Hyper Rare 1×, Ultra Rare 0.3×. *Put SR characters in the kitchen; save UR for combat.*
3. **Keep the motivation boost active** (2×).
4. Best case vs worst case: 1.5 × 3 × 2 = **9×** output — the difference is huge for a 1-minute tick that runs all day.
5. **Unlock menus/recipes aggressively** — each gives *permanent combat possession effects*. Cooking is secretly a combat system; treat cafe levels and menu unlocks as stat progression, not chores.
6. Don't trust the auto-assign ("omakase") button for kitchens — its scoring weights HP at 5× (a combat heuristic), not kitchen output. Assign manually.

---

## 7. Study, Mastery, Weeding, Blessing: time management wins

- **Study: never leave the slot empty.** It's a pure real-time gate (levels double: 4→8→16→32→64 min…). The correct order: studies that grant **Study Speed** and economy/combat possession effects first. Start the longest study before logging off.
- **Mastery:** 3 SP per node level — prioritize nodes with **Attack/multiplier/Gold Acquire effects** over defensive/QoL ones, following the same "multipliers first" rule.
- **Treasures (the little-house items, 23 in 5 series):** equip to your fight — **Lively Lights (5003)** for boss walls (VS Boss Damage scaling with Lv200 outfits), **Wall Clock (4002)** with a full-specialty team (crit damage ×18 at Lv100), **Candle & Shelf (3004)** for unconditional crit damage (×7.2), **Decorative Flowers (5002)** (Attack ×90 with 1 specialty costume), **Yellow Chest (3002)** (×48 with 4), **Red Sofa (2002)** (scales with your Lv100 outfit count), **Garland (5004)** for skill damage (×40). Level them with buttons — the "+612%"-style numbers on the cards are just the Lv1 values. Full table: `LITTLE_HOUSE.md`.
- **Keychains:** each of the 154 groups targets its character (attack ×10–66) or assist (AssistSkillDamage up to ×6000 at tier 10) — equip the ones matching your carry/assist and merge duplicates (3 copies per step to Super Rare, then 1+2 to Legend Rare): `KEYCHAIN.md`.
- **Weeding:** stamina refills 1/15 min to a cap of 60 (15h to fill). **Weed once or twice daily and never sit at cap** — stamina sitting at cap is stamina deleted. Spend it on the biggest plot chunks available.
- **Blessing (40 min):** activate only when you're about to **actively push stages or fight a boss wall** — using it before idling wastes the timer. Same logic for any timed combat buff.
- **Roulette:** 1 free + 4 ad spins daily — free EV, do it in the daily routine.

---

## 8. Team building: the DPS checklist

For each combat character/slot, in order of impact:

1. **Costume with the highest-skill-multiplier unique skill** you own (skill rarity drives damage more than any other slot choice: Hyper Rare 120×→1,308× vs Normal 1.6×→18.4×).
2. **Level that skill toward 100** (10× curve) — before leveling a second skill.
3. Costume level & promotions (attack-rate/attack-speed scale with costume level; promotions to Lv200 need materials — focus materials on your main DPS costume first).
4. **Equip items with the best *equipment* effects; own items with the best *possession* effects** — gear scoreboards lie less than you think because possession effects make everything additive.
5. **Tags/synergies:** costumes sharing tags with your formation add tag-count bonuses — build around 1–2 tag families rather than a rainbow.
6. Assist slots: pick assist skills whose effects cover what your main lacks (crit-rate buff if low crit, boss-damage buff for boss walls).

---

## 9. Boss walls (the 30-second check): how to break through

When you hit a wall, in order of cost-effectiveness:

1. **Collect pending idle income and spend it** — you're often 1 status-shop visit from the wall.
2. **Boss Damage Rate** upgrades (it's a dedicated multiplier that only counts vs bosses — exactly what the 30s check tests).
3. **Re-time buffs:** enter the boss with crit/attack buffs freshly stacked (their 5s windows are what kill bosses).
4. **Skill cooldown reduction** so your nuke fires twice within the window instead of once (a second 650× hit beats most stats).
5. If still short: it's an income problem, not a build problem — go farm a few hours of idle (with the 3 ads) and come back. Idle games are patience-compounded; the math always lets you through later.

---

## 10. The optimal daily routine (checklist)

| # | Action | Why (the math) |
|---|---|---|
| 1 | Collect idle income (≤12h since last) | Cap is 12h — never waste accrual |
| 2 | Spend gold on status tracks (attack → rates) | Gold converts to power immediately; idle gold buys nothing |
| 3 | Push stages until you hit a wall | Every stage = permanent income & progression reward |
| 4 | Watch 3 idle-bonus ads **after pushing** | Each pays 6h at your newest (highest) rate |
| 5 | Free ad gacha 11-draw ×3 | Free collection progress (possession effects) |
| 6 | Kitchen: genre-matched SR chefs, boost on | 9× cooking output |
| 7 | Start/continue a study (longest before logging off) | Slot must never idle |
| 8 | Weed the garden (never at stamina cap) | Stamina at cap = deleted |
| 9 | Roulette free + 4 ad spins | Free EV |
| 10 | Blessing only if doing a push session | 40-min timer — don't idle it away |
| 11 | League/Challenge Hunt attempts | Ranking rewards scale with activity |
| 12 | Before bed: push ≥1 stage, collect, restart long study/kitchens | Overnight accrual at the best rate |

---

## 11. Common traps (things that feel right but the math says no)

- **Leveling crit damage with 0% crit rate.** Expected multiplier = 1.00. Do crit *rate* first.
- **Sitting on uncollected idle income past 12h.** It stops completely.
- **Spreading skill levels across five skills.** One skill at L100 (10×) beats five at L30 (~3× each) for your main carry.
- **Using gems on 11-draws.** ~5.7% worse than 35-draws, forever.
- **UR chefs in the kitchen.** Rarity weights are inverted (SR 3× / HR 1× / UR 0.3×) — kitchen ≠ combat.
- **Hoarding duplicates.** Merging unlocks new possession effects per rarity tier — merges are permanent account power.
- **Only equipping, never collecting.** Possession effects mean a full inventory of "useless" items is a real stat page.
- **Blessing/timed buffs before going offline.** The timer runs in real time.

*All of the above follows from the datamined formulas; no superstition. If you only remember three things: push stages before anything, never cap idle/stamina, and balance your multipliers instead of stacking one.*
