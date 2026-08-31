# Chiikawa Pocket — Every Formula That Matters (Player's Math Reference)

*All formulas below were pulled directly from the game's code and data (v2.4.1). This is the complete math of the game, explained for humans: each formula comes with a plain-English reading and a worked example using real game numbers.*

---

## 0. First: how to read the game's numbers

The game runs on **BigDecimal** (arbitrary-precision decimal) — numbers go into the 10¹⁷⁰⁺ range, so it prints them with letter suffixes. The suffix is **bijective base-26** (Excel-column style, confirmed in the code): each tier is ×1000.

| Suffix | Means | Suffix | Means |
|---|---|---|---|
| a | ×10³ (thousand) | n | ×10⁴² |
| b | ×10⁶ (million) | o | ×10⁴⁵ |
| c | ×10⁹ (billion) | … | … |
| d | ×10¹² (trillion) | z | ×10⁷⁸ |
| e | ×10¹⁵ | aa | ×10⁸¹ |
| f | ×10¹⁸ | ab | ×10⁸⁴ |
| g | ×10²¹ | … | … |
| h | ×10²⁴ | bf | ×10¹⁷⁴ |
| i | ×10²⁷ | bg | ×10¹⁷⁷ |

So `264i` attack = 264×10²⁷ = 2.64×10²⁹, and `6.83bf` gold = 6.83×10¹⁷⁴. Just read the letters as "how many thousands, counted in alphabet."

**Two more conventions used everywhere below:**
- **Permil** = per-mille (÷1000). Most multipliers in the data are stored as Permil: `1600 Permil = 1.6×`.
- **Dates** are .NET ticks (100 ns units since year 1) — irrelevant for play, included for completeness.

---

## 1. The damage formula (the heart of the game)

### 1.1 Normal attacks

```
damage = Attack
       × NormalAttackDamageRate            (your stat, from levels/equipment)
       × CostumeAttackRate                 (the attacking costume's rate, ~1.0–1.5+)
       × (boss ? BossDamageRate : MobDamageRate)   (only one applies, by target)
       × DefenceDebuffAmp                  (defence-shred effects ON the enemy, >1 = they take more)
       ÷ AttackDebuff                      (attack-suppression effects ON YOU, >1 = you deal less)
```

Then the critical roll (one random roll per hit, `rand(0,1) < CritRate`):

```
if crit: damage ×= CriticalDamage × CriticalDefenceDebuffAmp
if ConstantDamage > 0: damage = ConstantDamage (flat, never crits, ignores everything above)
```

**Plain English:** every "rate" is a separate multiplier from a separate source — they multiply, so improving any one of them multiplies your final damage by that factor. Debuffs you put on enemies multiply your damage; debuffs enemies put on you divide it. A "fixed damage" effect short-circuits the whole formula to a flat number.

**Example:** Attack = 10⁹, NormalRate 1.2, costume rate 1.1, BossDamageRate 1.5, enemy defence-shred 1.3, no debuff on you, crit lands with CritDamage 2.2×:
`10⁹ × 1.2 × 1.1 × 1.5 × 1.3 ÷ 1 × 2.2 = 5.66×10⁹` damage.

### 1.2 Skills

Same skeleton, with the skill's own multiplier replacing the normal-attack rate, plus a unique-skill bonus:

```
skillDamage = Attack × SkillMultiplier(skill level) × SkillCoefficient(costume)
            × CostumeAttackRate × SkillDamageRate × UniqueSkillDamageRate(if unique skill)
            × bossOrMobRate × DefenceDebuffAmp ÷ AttackDebuff
            [× CriticalDamage × CritDefenceAmp if crit]
```

**Example (real data):** Super Rare skill #341 at level 100 = 650× multiplier (56× at level 1), coefficient 1.0, 9 s cooldown. With Attack 10⁹ and the same rates as above: `10⁹ × 650 × 1.1 × 1.5 × 1.3 × 2.2 ≈ 2.9×10¹²` — *and it hits every enemy* (AoE).

### 1.3 Critical hits — the expected-value formula you'll actually use

Base crit rate is **0%**; base crit damage is **1.2×**. One roll decides the whole hit. For planning, your average damage multiplier from crits is:

```
E[crit] = 1 + CritRate × (CritDamage − 1)
```

| CritRate | CritDmg | E[crit] |
|---|---|---|
| 10% | 1.2× | 1.02× |
| 20% | 2.2× | 1.24× |
| 40% (buffed) | 2.2× | 1.48× |
| 40% | 3.0× | 1.80× |
| 100% | 3.0× | 3.00× |

**Lesson:** crit rate is worthless at 0 (don't level crit damage first); after ~20% rate, crit damage becomes one of the strongest stats in the game because its per-level gain (+1%) is additive and huge.

---

## 2. How your stats are computed

### 2.1 The master formula (every stat, always)

```
finalStat = BaseValue × CorrectValue × StatusUpRate + StatusUpValue
```

- **BaseValue** — the leveled base (from status-enhance levels: +10 attack/level etc.)
- **CorrectValue** — your equipment/collection multiplier (default 1; this is where the ×10²⁰+ late-game inflation comes from — thousands of possession effects and gear multiplying here)
- **StatusUpRate** — in-battle buff multiplier (default 1)
- **StatusUpValue** — in-battle flat buffs (default 0)

**Example:** Base attack 722,350 (level 72,235 × +10), collection multiplier 3.65×10²³, no active buffs:
`722,350 × 3.65×10²³ × 1 + 0 ≈ 2.64×10²⁹` = the `264i` shown on screen. **This is why collection progress (everything you own) matters more than any single level** — the base is linear, the multiplier is the engine.

### 2.2a Bonus taxonomy (own vs equip vs targeted)

- **Own (possession) effects** — active just for owning the item. Home items: all 114 share one Attack effect, ×1.15/×1.20/×1.30 at item level 1/2/3.
- **Equip effects** — active only while the item is equipped on the formation (weapons/armor/assists/treasures/keyholders).
- **Targeted (custom) effects** — `Party` / `SpecificCharacter[ids]` / `AssistCharacter[ids]`; granted by keyholder equip slots, art-book completions, and **treasure equip effects** (via `TreasureEquipEffect`); value scales with the item's level; the bonus is **zeroed when the targeted character isn't in play** (verified in the decompiled `CalculateStatusTargetCharacter` gate). Tag-conditional examples: treasure 4002 (the "wall clock") grants CriticalDamage ×6.12/×12/×18 at Lv1/50/100 when the formation has 6 outfit specialties (costumes carrying a cooking-specialty tag) — see `MYROOM.md`.
- **Costume possession effects** — unlock in tiers as the costume's own level rises (`CostumeEnhanceProgress ≥ threshold`).

### 2.2 How every bonus feeds in (elements)

Each stat is built from its BaseValue plus a list of modifier "elements", applied **in order**:

| Element type | Effect on running total | Meaning |
|---|---|---|
| **Add** | `+ value` | flat addition |
| **Multiply** | `× value` | direct multiplier |
| **Shorten** | `× (1 − value)` | cooldown-type reduction (0.2 = 20% off) |
| **BaseMultiplyAdd** | `+ BaseValue × value` | "+X% of base" as an additive amount |

**Example:** base 1000, with elements [BaseMultiplyAdd 0.5, Multiply 1.2, Add 100]:
`(1000 → +500 = 1500 → ×1.2 = 1800 → +100 = 1900)`.

### 2.3 Per-level base gains (the constants)

From `HuntStatusConfig`: **Attack +10/level · HP +10/level (base 100) · HP-regen +0.7/level (base 6.3/s) · Crit rate +0.1%/level · Crit damage +1%/level (base 1.2×) · Advanced attack +0.1 · Mob damage +0.1**. Plus the global per-level-up bonus of **+150 flat and +10%** (Config #8/#9).

---

## 3. Level scaling — the universal primitive (LevelRangeValue)

Almost everything that scales with a level (skill power, possession effects, costume rates) uses one of three curves, then a unit conversion:

| Curve | Formula (level L) | Use |
|---|---|---|
| **Default (linear)** | `start + (end−start) × (L−startLv) / (endLv−startLv)` | smooth scaling between two endpoints; **no clamping** (extrapolates past the range) |
| **AddConstant** | `start + end × (L−startLv)` (L>0, else 0) | flat growth per level |
| **FixedLevel** | `start` (once L ≥ startLv) | unlock-style constant |

Then: **Permil → ÷1000**, RealNumber → as-is. Groups chain several ranges (each covers a level band).

**Example:** skill #311: `1600→18430 Permil over L1–100`. At L50: `1600 + (18430−1600)×49/99 = 9931 Permil = 9.93×`. At L100: 18.43×. At L120 (extrapolated): ~21.8× — the game really does extrapolate.

---

## 4. Skills, cooldowns, buffs

### 4.1 The skill cycle (how often a skill fires)

```
cycleTime = recastTime × (1 − CooldownReduction) + castTime + queueDelay
```

- recastTime & castTime from the skill table (e.g. 8000 ms recast, 3000 ms cast)
- queueDelay ≈ 0.5 s for unique skills, 2 s for assist skills (per-queue FIFO gaps)
- CooldownReduction applies as `×(1 − rate)` (the "Shorten" element)

**Example:** 8 s recast, 3 s cast, 20% CDR: `8×0.8 + 3 + 0.5 = 9.9 s` between casts. Recast-reset effects refill the timer by `rate × (max − current)` instantly (rate 1 = full reset).

### 4.2 Buff/debuff uptime and stacking

- Every buff/debuff is an entry in a **64-slot list**; they all apply simultaneously (same-type effects stack).
- Buff types: party attack/attack-speed/crit-rate/crit-damage up, boss/mob damage up; debuff types: enemy attack/defence/speed down, crit-defence down; plus RecastReset.
- Effective contribution of a timed buff:

```
uptime = buffDuration / cycleTime      (≤ 1)
team multiplier ≈ 1 + effectValue × uptime
```

**Example:** the +40% crit-rate buff (5 s duration, 6 s recast, 3 s cast → cycle ≈ 9.5 s): uptime ≈ 0.53, so it contributes +21% crit rate on average. Two such buffs from different units stack additively in the crit expectation.

### 4.3 The skill queue (who fires first)

Ready skills enter a **FIFO queue in formation order**; the unique queue releases one skill per 0.5 s, the assist queue one per 2 s (max 32 queued). Simultaneous readiness → leftmost unit first. **Consequence: enablers (buffs/debuffs) belong left of your nuke, or the first nuke fires unbuffed.**

---

## 5. Formation math

- **Targeting:** single-target attacks always hit the **leftmost enabled** slot (the "lead"). For *your* team this only decides the hit animation — **your party shares ONE HP pool** (all friend units wrap the same shared `HpValue`), so the whole team is eliminated together when the pool empties; formation icons do **not** grey out one by one. *Enemies* have individual HP and die front-to-back one at a time. AoE hits everything regardless of order.
- **Per-unit damage:** `SharedAccountAttack × CostumeAttackRate × hitMultiplier × …` — all units share account stats; only the costume rate and skill differ.
- **Team power (CP display):**

```
CP ≈ HP × 0.6 + Σ per costume (NormalAttackPower × 500 + SkillPower × 500)
```

(coefficients from `HuntStatusConfig`; skill power includes crit stats). It's a rough estimate — skill uptime, buffs, tags, and order are invisible to it.

- **Tags:** the formation counts how many costumes share each tag; effects scale off those counts — matching tags is a real multiplier (see `TEAM_SETUP.md`).

---

## 6. Battle-flow constants

Boss fight time limit **30 s** · 10 areas × 10 stages per difficulty · Chiikawa walk speed **7 m/s** (walk distance 4.5 m) · HP regen ticks every **1 s** · speed-up button = **×2.0 game speed** (`GetGameSpeed`) · unique-skill queue 0.5 s / assist 2 s · defeat screen cooldown 3 min · enemy gold split `totalGold ÷ unitCount` per enemy.

---

## 7. Progression costs

### 7.1 Status enhancement costs

Cost per level grows in **bands**: each level band has a coefficient, and within a band `cost(level) = baseCost × coefficient^(levels into band)` (computed from `StatusEnhanceCostRange`: e.g. ×1.25 for L2–3, ×1.6 at L4, …). Different tracks have different base costs (from `Consume` rows):

| Track | Cost/level (start) |
|---|---|
| Attack | 3 gold |
| Health / HP-regen | 2 gold |
| Critical Rate | 100,000,000,000,000 (10¹⁴) gold |

Max level **180,000** per track. That's the deliberate pricing of crit as a late-game sink.

### 7.2 EXP curves

Everything levels on hand-authored **cumulative EXP tables** (60 curves; banded, not closed-form). Examples: costume curves (groups 2–4) run 200 levels ending at 221,700 cumulative (per-level cost 30 → ~7,000, banded); treasure uses group 91 (100 levels); group 1 is a tiny 100-level curve (1,420 total).

### 7.3 Merges, promotions, misc costs

- **Costume promotion:** raises cap 100→200 in five 20-level steps, each with its own material cost (`CostumePromotion`).
- **Keyholder rarity-up:** Normal→Super Rare = **3 copies** of the same keyholder per step; Super Rare→Legend Rare = **1 copy + 2 other keyholders of the same rarity** per step.
- **Treasure enhance:** 100 buttons per EXP point · **Mastery node:** 3 mastery-SP per level (5 levels/node) · **Study level:** its consume group + real-world minutes (some tracks double: 4→8→16→32→64 min).

---

## 8. Idle economy formulas

```
goldPerMinute(stage) = stageBaseGoldPerMinute × GoldAcquireMultiplier
totalIdle = goldPerMinute × minutesAway,   capped at 720 minutes (12 h)
```

- Rewards tick out every 5 min; a bonus reward ticks every 60 min.
- **Ad bonus: +360 idle-minutes per ad, 3×/day, reset 06:00 UTC.**
- Stage-clear pays a one-time `automaticProgressionReward`.
- Stage base rates (real data): stage 10101 = 18/min; stage 11010 = 1.82×10⁹/min; deep stages reach ~10²¹/min. **One more stage permanently raises every future minute.**

---

## 9. Cooking formulas

Production (per kitchen, ticking every 1 minute):

```
output = base × cafeEffectCoeff × kitchenLevelCoeff × slotCoeff × genreCoeff × boostCoeff × buffCoeff
```

| Factor | Value |
|---|---|
| Genre match / mismatch | **1.5× / 1.0×** |
| Main slot / sub slot | **1.0× / 0.3×** |
| Assigned rarity: SR / HR / UR | **3.0× / 1.0× / 0.3×** (inverted!) |
| Motivation boost | **2.0×** |
| Booth level factor / fes-rank | 1.0 / +0.01 |

Best vs worst assignment: `1.5 × 3 × 2 = 9×` output. Cafe EXP: `exp = resourceAmount × resourceToExpCoefficient`. The "omakase" auto-assign scores characters as `Attack×0.5 + HP×5 + CritDmg×0.5 + NormalRate×0.5 + SkillRate×0.5 + Gold×0.5`.

---

## 10. Small-but-useful formulas

- **Buff application:** `buffedStat = base × buffRate` (truncated to int for integer stats) — the game's only buff mechanic; everything is a multiply.
- **Weeding stamina:** `+1 per 15 min`, cap 60 (15 h to fill), hard storage cap 99,999.
- **Blessing:** lasts **40 min** per activation (ad or item).
- **Study remaining time:** `remaining = endAt − now`, with StudySpeed status shortening required minutes; StudyTimeCalculator does the clock math.
- **Gacha unit prices:** 500 gems / 11-draw ≈ **45.45 gems per draw**; 1,500 gems / 35-draw ≈ **42.86** (−5.7%). Ad draw: 11 draws, 10-min cooldown, **3×/day**, reset 15:00 JST. Limited draws: 1–3 uses, some never refresh.
- **Roulette:** 1 free + 4 ad spins per day.
- **Level-up bonus:** every level-up (any track) adds +150 flat and +10% status (Config #8/#9).

---

## 11. Putting it all together — one worked example

You: Attack base 10⁶, collection multiplier 10¹⁰ (→ displayed attack 10¹⁶), crit 25% @ 2.0×, NormalRate 1.3, BossRate 1.5, costume rate 1.5, attack speed 0.66→0.99 swings/s (costume speed rate 1.5), unique skill at L100: 650×, 9.9 s cycle.

```
E[crit]   = 1 + 0.25 × 1.0        = 1.25
normalDPS = 10¹⁶ × 1.3 × 1.5 × 0.99 × 1.5(boss) × 1.25 ≈ 3.62×10¹⁶ /s
skillDPS  = 10¹⁶ × 650 × 1.0 × 1.5 × 1.0 × 1.5 × 1.25 ÷ 9.9 ≈ 1.85×10¹⁸ /s
slot DPS  ≈ 1.88×10¹⁸ /s  → the skill is ~98% of this slot's damage
```

Takeaways the math proves: **skill level/multiplier dominates slot damage** (hence "level your carry's skill to 100 first"); **crit expectation is a team-wide multiplier**; **the base stat is a rounding error next to the collection multiplier** (hence "own everything, merge duplicates"); and **ordering can't fix stats, only sequence and survival** (hence "enablers left, carry right").

*For how to apply all of this: `OPTIMAL_PLAY.md` (strategy), `TEAM_SETUP.md` (formations), `webapp/index.html` (calculator that does this math for your account).*
