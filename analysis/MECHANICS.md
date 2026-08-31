# Chiikawa Pocket — Complete Mechanics Guide (Plain English)

*Everything in this document was extracted directly from the game's code and data files (version 2.4.1). No guessing — every number and formula below is what the game actually runs.*

---

## 1. What kind of game this is

Chiikawa Pocket is an **idle game** (also called an "incremental" or "AFK" game). Your characters automatically walk forward and fight enemies in "Hunts" (討伐). Each stage you beat makes you earn more gold per minute, *even while the game is closed*. You spend that gold (and other resources) to make your team stronger, which lets you beat harder stages, which earns gold even faster. That loop is the whole game; everything else — cooking, studying, gardening, collecting — exists to feed bonuses into that loop.

Numbers get *absurdly* large on purpose. Early enemies have 1 HP. Late-game enemies have HP written with 40 digits (the game uses special math, "BigDecimal", to handle this). Don't be scared by big numbers — they're just inflation, and your own numbers inflate the same way.

---

## 2. The battle system (Hunt / 討伐)

### 2.1 How a fight actually works

- Battles are **fully automatic**. Your team walks to the right at a fixed speed (Chiikawa: 7 meters/second), enemies approach from the other side, and everyone attacks on their own timers.
- Each world ("difficulty") has **10 areas**, each area has **10 stages**. Stage structure is waves of enemies ending in a boss. **Boss fights have a 30-second time limit** — if you can't kill the boss in 30s, you lose. This is the game's main "wall": boss DPS checks.
- You can watch at 2× speed (the speed-up button literally multiplies game speed by 2.0).
- Skills fire automatically when their cooldown finishes. There's a small queue delay: 0.5s for unique skills, 2s for assist skills.
- Your HP regenerates a little every second (base 6.3 HP/s, +0.7 per HP-recovery level).
- **Your whole team shares ONE HP pool** — there's a single team HP bar. All six units draw from the same pool, so the party wipes *together* when it hits 0; nobody dies individually (enemies are the opposite: each has its own HP and they fall one by one, front to back).
- If you lose, a defeat screen can only show up every 3 minutes.

### 2.2 The damage formula — exactly what happens when someone hits

This is the real code, translated to plain math:

> **Damage = Attack × (attack's damage multiplier) × (your global attack rate) × (boss OR mob bonus) × (defence-shred) ÷ (enemy-attack suppression)… then critical hits multiply further.**

Every "× multiplier" is a separate number that comes from a different source:

| Multiplier | Where it comes from |
|---|---|
| **Attack** | Your Attack stat (levels, equipment, collections) |
| **Damage multiplier of the hit** | Normal attacks use your "Normal Attack Damage Rate"; skills use their own multiplier from the skill table (see §2.4) |
| **Attack rate** | Your costume's attack-rate bonus (costumes give this, it grows with costume level) |
| **Boss/Mob bonus** | Your "Boss Damage Rate" stat vs bosses, "Mob Damage Rate" vs regular enemies — only one applies at a time |
| **Defence shred** | "Defence Debuff" effects you put on the enemy (bigger than 1 = they take more damage) |
| **Enemy-attack suppression** | "Attack Debuff" effects on you (bigger than 1 = *you* deal less — enemies use these on you too) |
| **Constant damage** | If an effect says "deal fixed damage", that fixed number *replaces* the whole formula (and can never crit) |

### 2.3 Critical hits

- The game rolls a random number 0–1 on every hit; if it's under your **Critical Rate**, the hit crits (one roll decides the whole hit).
- **Base critical rate is 0%.** You only get crit from: the Critical status track (+0.1% per level), and crit-buff skills (e.g. one skill gives +10.3% at level 1 up to +40% at level 100 for 5 seconds).
- **Base critical damage is 1.2×** (crits do 120% damage), +0.01 (1%) per Critical Damage level. A crit also applies any "Critical Defence Debuff" shred on the target.
- Because crit rate starts at 0%, crit builds do nothing until you invest in the Critical track — then crit damage becomes one of the biggest multipliers in the game (the +% per level is additive: level 100 crit-damage = 1.2 + 1.0 = 2.2× on crits).

### 2.4 Skills

Skills are your active firepower. Each has a **cooldown (recast time) in milliseconds** and one or more **effects**. Skill damage uses the same formula as normal attacks, with the skill's own multiplier — and "unique" skills get an extra multiplier (Unique Skill Damage Rate).

Actual skill multipliers from the data (level 1 → level 100, as multiples of your attack):

| Skill rarity | Example | L1 | L100 | Notes |
|---|---|---|---|---|
| Normal | #311 single target | 1.6× | 18.4× | 8s cooldown |
| Normal Rare | #322 single | 6.0× | 60.5× | 5s cooldown |
| Rare | #332 single | 23.4× | 290.7× | 10s cooldown |
| Super Rare | #341 **hits ALL enemies** | 56× | 650× | 9s cooldown |
| Super Rare | #343 crit-damage buff | +200% | +20,000% | 5s buff |
| Hyper Rare | #352 single | 120× | 1,308× | 13s cooldown |

Skill effects aren't just damage. They include: party-wide attack/attack-speed/crit buffs, enemy attack/defence/speed debuffs, boss- and mob-damage buffs, and "Recast Reset" (instantly refills another skill's cooldown). Buffs and debuffs last a fixed time (e.g. 5s) and **stack** — the game keeps a list of up to 64 active effects, each applying its own value.

**Skill levels matter enormously.** A skill at level 100 is roughly 10× stronger than at level 1 (the multiplier scales linearly between the two table values). Cooldown-reduction stats literally multiply your cooldown speed by (1 − reduction).

### 2.5 Attack speed

Every unit attacks on a timer. Your "Attack Speed" stat shortens the interval between attacks (the base enemy attack speed is 0.66; costumes raise yours via level-scaled multipliers). Enemies also have "first attack rate" and "rate per attack" values that pace their swings.

---

## 3. Your stats and where they all come from

### 3.1 The 33 stats

The game tracks 33 different stats. The combat-relevant ones: **Attack, Attack Speed, Health, Health Recover, Critical Rate, Critical Damage, Advanced Attack, Normal Attack Damage Rate, Skill Damage Rate, Unique Skill Damage Rate, Boss Damage Rate, Mob Damage Rate, Attack/Defence/Critical-Defence Debuff, Unique/Assist Skill Cool Time**, plus **Gold Acquire** (idle income!), Battle Time Limit, Costume Experience, and several cooking/study/weeding economy stats. Assist characters have their own mini-set (Assist Attack/Crit/Skill Damage).

### 3.2 How every bonus combines (the important part)

Every single thing in the game — a costume you own, a weapon you equipped, a mastery node, a study you finished, a keyholder on your shelf — contributes to one or more of these stats through one uniform machine:

1. Each stat has a **Base Value** (from your status-enhancement levels).
2. Every source adds an "**element**" to that stat, one of four types:
   - **Add**: adds a flat amount. `+500 attack`
   - **Multiply**: multiplies the running total. `×1.5`
   - **Shorten**: multiplies by (1 − value) — used for cooldowns. `×(1 − 0.2)` = 20% faster cooldown
   - **BaseMultiplyAdd**: adds a *percentage of the Base Value*. `+50% of base attack`
3. The game applies elements one after another, in order, to get the final stat.

Then, in battle, the final stat is used as: **(Base × Correction multiplier × buff multiplier) + flat buffs**. In plain English: *flat bonuses add, percentage bonuses multiply, and they multiply different things — so you want a mix of everything, not all of one type.*

### 3.3 Owning things makes you stronger — the three bonus types

Every item gives **two** bonuses — one for owning it, one for using it. Verified per item type:

| Source | "Own" bonus (always on) | "Equip" bonus (only while used) |
|---|---|---|
| Weapon / Armor / Assist Skill | possessionEffectId | equipmentPossessionEffectId (while equipped on the formation) |
| Treasure | possessionEffectIds[] (via `TreasurePossessionEffect`, promo-scaled) | equipEffectIds[] → `TreasureEquipEffect` → plain or **targeted/conditional** effect (see `MYROOM.md`) |
| Costume | possessionEffectIds[] — unlock in **tiers as the costume's level rises** (`CostumeEnhanceProgress ≥ threshold`) | promotionCostumePossessionEffectId (after promotion) |
| Keyholder | rarity-tier effects (unlock per merge rarity) | equipPossessionEffectId — **targeted** (see below) |
| **Home items (the little house)** | **ALL 114 items share one effect: Attack ×1.15 / ×1.20 / ×1.30 at item level 1/2/3** | *none — placement is cosmetic/economy* |

Key clarifications:

- **Home items:** the stat bonus comes purely from *owning* the item (and leveling it via enhance). Putting it on display in your house is cosmetic and drives the visitor/gift/lottery economy (characters show up, give lottery points and gifts) — it does **not** change the bonus. There are no character/team conditions on home items; every one of them is the same Attack multiplier.
- **Team-targeted bonuses (`CustomPossessionEffect`):** 511 effects that target **the whole party, a specific main character, or a specific assist character** (e.g. "Attack +X for Chiikawa only", "AssistSkillDamage +Y for character 3005"). These come from **keyholder equip effects** (all 154 keyholder groups) and **art-book scene completions**. Values scale with the granting item's level (or with your contents-progress). The code **gates them**: if the targeted character isn't in play, the bonus contributes nothing (verified in the decompiled calculator).
- Everything stacks **multiplicatively** — each owned/equipped item adds its own `×rate` element, which is how hundreds of small bonuses compound into the 10²⁰+ collection multiplier.

### 3.4 Status Enhancement (the gold sink)

Seven upgrade tracks (Attack, Health, Health Recover, Critical Rate, Critical Damage, etc.), each upgradeable to **level 180,000**. Each level gives:

- Attack track: **+10 attack** per level (and similar per-track amounts — HP +10 on a base of 100, crit rate +0.1%, crit damage +1%)
- Plus a universal **+150 flat and +10%** status increase per level-up.

Costs are paid in gold and rise in bands (e.g. ×1.25 cost for levels 2–3, ×1.6 for level 4, …). Different tracks have wildly different price tags: the Attack track costs **3 gold** per level to start, while the Critical Rate track costs **100,000,000,000,000 (100 trillion) gold** per level — it's deliberately a late-game luxury.

### 3.5 Experience curves

Everything that has levels uses per-level EXP tables (60 different curves). Costumes use the 200-level curves (SR/HR/UR rarities), treasures use their own 100-level curve, and so on. Curves are hand-tuned in bands — later levels cost *much* more EXP per level.

---

## 4. Characters, costumes, equipment

- **31 characters** (Chiikawa is the one "main" character; others are friends/assists). Characters themselves are cosmetic-ish; power comes from what they wear.
- **Costumes** (the main gacha prize): each costume has a **unique skill**, an **attack-rate** and **attack-speed** bonus that scales with costume level, a **skill coefficient**, **tags** (synergy categories), and its own possession/equipment effects. Costumes come in Super/Hyper/Ultra Rare tiers, each starting at max level 100, and can be **promoted** 5 times (levels 100→200, each promotion needs rarer materials).
- **Weapons / Armor** (52 each): straightforward stat sticks with possession + equipment effects.
- **Assist Skills** (22): extra auto-cast skills from side characters (2s queue delay), each with possession effects.
- **Treasures** (23): premium collectibles with their own EXP track (buttons ×100 per EXP), equip *and* possession effects, and promotions.
- **Keyholders** (1,078!): keychain collectibles tied to character+assist pairs. Merging duplicates upgrades rarity: **Normal→Rare needs 3 copies of the same keyholder per step; Super Rare onward needs 1 copy + 2 other keyholders of the same rarity** (up to Legend Rare). Each rarity tier on each keyholder group unlocks another possession effect.

---

## 5. The idle economy (offline income)

- You earn gold and items **per minute** based on the highest stage you've reached — each stage has its own gold/minute (stage 1: 18/min; a mid-game stage: 1.8 billion/min; late game: 10²¹/min), multiplied by your **Gold Acquire** stat.
- **Cap: 12 hours** of accrual. Uncollected income stops after 12h — collect at least twice a day.
- Rewards tick out every 5 minutes; a bonus reward ticks every 60 minutes.
- **Ad bonus: watching an ad adds 6 hours' worth of idle income instantly, up to 3 times a day** (resets 06:00 UTC). This is the single best free daily action.
- Beating a stage also pays a one-time "automatic progression" reward.

---

## 6. Cooking (the cafe)

A second production loop: kitchens cook to generate "cooking points" (resource 201) **once per minute**, plus cafe EXP and level-up rewards.

The production formula is a pure multiplication chain:

> **output = base × cafe-effect × kitchen-level × slot × genre × boost × paid-buffs**

With these exact coefficients from the game's config:

- **Genre match: 1.5×** / mismatch 1.0× — put characters on kitchens of their specialty genre
- **Main slot: 1.0× / sub slot: 0.3×** — your best chef belongs in the main slot
- **Rarity of assigned character: SR 3×, HR 1×, UR 0.3×** (yes, SR is weighted highest — it inverts!)
- **Motivation boost: 2×**; fes-rank bonus +0.01
- Kitchen/menus have their own levels; **recipes/menus you unlock also give permanent possession effects** (cooking isn't just a side loop — it feeds your combat stats)
- Paid/28-day buff items multiply cooking idle-time and points further.

There's also an "omakase" (auto-assign) button that scores characters as: Attack×0.5 + HP×5 + CritDamage×0.5 + NormalRate×0.5 + SkillRate×0.5 + Gold×0.5 — i.e. it mostly optimizes for combat stats, with HP weighted 10× the others.

---

## 7. Study, Mastery, Weeding, Blessing

- **Study** (39 topics, 237 levels): pure time-gate. Each level takes real-world minutes (some tracks double each level: 4→8→16→32→64 min…) plus a resource cost. Finished studies give permanent possession effects. The "Study Speed" stat shortens the wait, and there's a 28-day paid study buff. **Always have a study running.**
- **The little house ("MyRoom" in code):** a room editor (75 furniture pieces, 75 "You Look Like" outfit skins, character feeding/petting with an emotion meter) — **cosmetic**, feeding missions/currencies only. The combat-relevant items shown in the house (wall clock, sofas…) are **Treasures** — see `MYROOM.md` for the full equip-effect table, including tag-conditional bonuses like the wall clock's "Critical Damage +612% (Lv1) with 6 outfit specialties in the party".
- **Mastery** (64 nodes, 5 levels each, cost 3 mastery-SP per level): a skill tree of possession effects; later nodes require earlier ones.
- **Weeding** (gardening): spends stamina (1 per 15 min, cap 60, max storable 99,999) to clear garden plots in chunks for rewards. Gardening has its own two stamina stats (max stamina, recover speed).
- **Blessing** (4 types): a 40-minute timed buff activated by watching an ad (or an item), giving possession effects temporarily.
- **Roulette**: 1 free spin + 4 ad spins per day.

## 8. League, Challenge Hunt, events

- **League**: seasonal ranked mode with 5 tiers, its own 250 stages, admission fee per entry, and season/daily shops with ranking rewards.
- **Challenge Hunt**: 3 difficulties of boss-rush with daily rewards (1,100 rows of them) and first-clear rewards.
- **Sub Hunts**: side hunts with ad rewards and difficulty locks.
- Events rotate (art book, missions, passes, shops) driven by date-term tables; the event framework (conditions/evaluate tables) decides what unlocks when.

---

## 9. Gacha & monetization, exactly

- **11-draw: 500 gems. 35-draw: 1,500 gems** (≈14% cheaper per draw). "Auto" variants repeat the 35-draw automatically.
- **Free ad draw: 11 draws, 3×/day**, 10-minute cooldown between, resets 15:00 JST.
- Ticket draws (11 or 35) use rarity-specific tickets instead of gems.
- Some draws are limited (1 or 3 uses *ever* — "Never" refresh).
- **The actual drop rates are computed on the server** (GS2 lottery) and are not in the game files; the client only displays the legally-required rate text. Banners have date terms, content locks, and prize-pool groups keyed to rarities (up to Legend Rare).
- Shop: 2,084 items — gem packs, character packs, season pass (with level track), shop passes, permanent exchanges, gift boxes (timed), comeback and login campaigns.

---

## 10. The one-paragraph summary of "how everything fits"

Kill enemies → beat stages → higher gold/min → collect idle gold (12h cap, ads +6h×3) → spend gold on status levels (attack cheap, crit expensive) → spend gems/tickets on gacha for costumes/keyholders (collection bonuses even unequipped) → level/promote them → cook with genre-matched chefs for points + permanent menu bonuses → keep a study running → weed the garden → masteries as SP allows → blessings during push sessions → repeat at higher difficulty. Every system multiplies into the same 33 stats, and the stats multiply into the damage formula.
