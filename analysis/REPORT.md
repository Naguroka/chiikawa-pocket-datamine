# Chiikawa Pocket (Global) — Full Datamine Report

**Package:** `jp.co.applibot.chiikawapocketgl` · **Version:** 2.4.1 (versionCode 70) · **Engine:** Unity (IL2CPP, metadata v31) · **Backend:** CrossWire/Protobuf RPC + GS2 · **Master data versions in this dump:** up to `260810.1.0` (2026-08-10)

> **Reading order:** `MECHANICS.md` (how every system works, plain English) → `OPTIMAL_PLAY.md` (mathematically optimal strategy) → this file (technical evidence and exact formulas) → `formulas_decompiled*.md` + `masterdata/*.json` (raw proof).

This document is the result of a complete offline datamine: the APKs were pulled from the installed game, the encrypted IL2CPP metadata was recovered from process memory, all 236 master-data tables were decoded to JSON, and the game's calculation code was recovered from native ARM64 and analyzed.

---

## 1. Artifacts produced (project layout)

| Path | Contents |
|---|---|
| `apk/` | Original `base.apk`, `split_config.arm64_v8a.apk`, `split_UnityDataAssetPack.apk` pulled from the emulator |
| `il2cpp/` | `libil2cpp.so` (171 MB), original **encrypted** `global-metadata.dat` and the **decrypted** copy recovered from memory |
| `decompiled/jadx-base/` | jadx decompilation of the Java/Kotlin layer (25,090 classes — mostly SDK/ads/anti-cheat wrappers; game logic is not here) |
| `dumps/il2cppdumper/` | Il2CppDumper output: `dump.cs` (1.95M lines, every C# class/field/method+RVA), `il2cpp.h`, `DummyDll/`, `script.json`, `stringliteral.json` |
| `dumps/MasterData/` | All 238 master-data files pulled from the device (236 `.bytes` tables + tgz) |
| `analysis/masterdata/` | **All 236 tables decoded to JSON** (row-exact, verified byte-perfect) |
| `analysis/schema.json` | Extracted message/enum schemas (568 classes, 1331 enums) |
| `analysis/skills_resolved.json` | All 186 skill effects with level-scaled values resolved |
| `analysis/decompile_targets.json` | 983 calculation-method RVAs queued for decompilation |
| `analysis/report_data_digests.md` | Machine-generated table digests (inventory, Config constants, EXP tables, skills, cost ranges, idle economy) |
| `tools/` | The whole toolchain: jadx, apktool, Il2CppDumper, portable .NET, Ghidra project, and the custom parsers (`extract_schema.py`, `parse_masterdata.py`, `disasm2.py` …) |

## 2. How the game is built (and how it was cracked open)

- **Unity IL2CPP build.** All C# game code is compiled to native ARM64 in `libil2cpp.so`; class/method names survive only in `global-metadata.dat`.
- **Encrypted metadata.** The shipped `global-metadata.dat` is fully encrypted (bad magic `0xE0D78706`, high entropy). The game decrypts it at startup into a private memory mapping of `…/files/il2cpp/Metadata/global-metadata.dat`. **The decrypted metadata (magic `0xFAB11BAF`, v31) was carved out of process memory** via root ADB — no need to touch the encryption at all.
- **Master data.** Downloaded at runtime to `/sdcard/Android/data/<pkg>/files/MasterData/*.bytes` (plus a `.tgz` bundle). These are **not encrypted**.
- **Obfuscation.** None on the C# side: every class, method, field, enum and string literal was recoverable with full names. The Java layer is only platform SDKs (ads, Firebase, Applibot framework, an anti-cheat `bitter.jniwq` package) and is irrelevant to game math.

## 3. MasterData `.bytes` file format (fully reverse-engineered)

Each `.bytes` file is one table = a sequence of records:

```
file   := record*
record := varint payloadLength, payload
payload:= field*                     -- fields in proto-declaration order, NO tags
```

Field encodings (derived from and verified against the generated readers):

| C# type | Encoding |
|---|---|
| `string` | varint byteLength + UTF-8 |
| `int`, `enum`, `bool`, `uint` | 7-bit varint (bool = 1 byte) |
| `long`/`ulong` | **either** varint **or** fixed-8 LE — field-dependent (dates/ticks are fixed-8; counters are varint) |
| `float` | 4-byte LE |
| `double` | 8-byte LE |
| `repeated T` | varint count + items (items use their own encoding) |
| `Rect` (Unity) | 4 floats = 16 bytes (used by Costume/HomeItem/HomeCharacter*/eventZone/bodyZone) |
| `Vector2` | 2 floats = 8 bytes (HomeBackgroundArea.position) |

Every record also carries its own `version` string (e.g. `250330.1.0`) — the data revision of that row. Dates are **.NET ticks** (100 ns since 0001-01-01); big numbers (idle-game inflation) are **BigDecimal stored as decimal strings** (e.g. HP `13500000000000000000000000000000000000000`).

The parser (`tools/parse_masterdata.py`) decodes all 236 tables byte-perfectly; correctness was enforced by requiring every row to consume its payload **exactly** (a self-solving backtracker resolves the varint-vs-fixed8 ambiguity per field).

## 4. Big-picture architecture

- **Server-authoritative** mobile idle game. The client holds master data locally; user data and lotteries (gacha rates!) live server-side (GS2 = Game Server Services; RPC via CrossWire over HTTPS, Protobuf messages — the full proto descriptors are embedded in the binary as base64 and partially recovered).
- **BigDecimal math** (`Applibot.Math.BigDecimal`): arbitrary-precision decimal used for all combat/economy numbers — classic idle-game design where values reach 1e40+.
- **Status system:** everything (characters, costumes, weapons, armor, treasures, home items, mastery, study, collection book, art book, blessings, buffs) feeds a single `HuntBaseStatus` per `StatusType`, composed of `BaseValue` + `Elements[]` (each element = `CalculateType` + `Value`), giving final `Value`.
  - `HuntBaseStatusCalculateType`: `1=Add`, `2=Multiply`, `3=Shorten`, `4=BaseMultiplyAdd`
  - 33 `StatusType`s: Attack, AttackSpeed, Health, HealthRecover, CriticalRate, CriticalDamage, AdvancedAttack, NormalAttackDamageRate, BossDamageRate, MobDamageRate, AttackDebuff, DefenceDebuff, CriticalDefenceDebuff, SkillDamageRate, UniqueSkillCoolTime, AssistSkillCoolTime, UniqueSkillDamageRate, AssistAttack(25), AssistCriticalRate(26), AssistCriticalDamage(27), AssistSkillDamage(28), SkillEffectRate(29), GoldAcquire(50), BattleTimeLimit(51), CostumeExperience(52), Weeding*(100/101), Study*(150/151), CookingMaximumIdleTimeLimit(160), CookingResourceAcquire(161).

---

## 5. Combat math (Hunt / 討伐)

### 5.1 Damage formulas — `Game.Application.InGameHunt.HuntCalculator`

Recovered from ARM64 (functions at `libil2cpp.so` offsets `0x46C662C` / `0x46C68EC`; operands are `BigDecimal`, crit roll is `RandomUtility.GetRandomFloat(0f,1f)`):

**Normal attack** `CalculateNormalAttackDamage(...)` — stack-slot mapping fully resolved (args 8–14 sit at `sp+0x90..0xF0` in declaration order), exact:

```
roll = RandomFloat(0,1)
dmg  = attack × normalAttackDamageRate × attackRate
if roll < criticalRate:  dmg ×= criticalDamageRate          // crit boost
dmg ×= (isTargetBoss ? bossDamageRate : mobDamageRate)
dmg ×= defenceDebuff                                        // defence-shred amplifier (>1 = more dmg)
dmg ÷= attackDebuff                                         // enemy-attack suppression (>1 = less dmg)
if roll < criticalRate:  dmg ×= criticalDefenceDebuff       // crit-specific shred, same roll
if constantDamage > 0:   dmg = constantDamage; isCritical = false   // fixed damage override
return DamageValue{ BigDecimal value=dmg; bool isCritical = (roll<criticalRate) & !constantOverride;
                    bool isDisplayMaxDamage }                         // struct: value@0x0, crit@0x10, disp@0x11
```

**Skill** `CalculateSkillDamage(...)` — identical skeleton, plus a `skillType` branch that applies `uniqueSkillDamageRate` for unique skills; uses `skillAttack` as base.

Supporting helpers (verified by disassembly):
- `GetBuffStatus(int base, float rate) = (int)(base × rate)` — all % buffs are simple multiplies, truncated.
- `GetAttackBuffStatus(BigDecimal base, float rate) = base × (BigDecimal)rate`.
- `DropGoldPerUnit(totalDropGold, unitCount) = totalDropGold / unitCount`.
- `GetGameSpeed(isSpeedUp) = 2.0 : 1.0` (speed-up button = 2×).
- `CalculateRecastRate(recastTime, maxRecastTime)`, `Increase/Decrease/Reset` = float += / −= / = .
- Debuffs (`AttackDebuff`, `DefenceDebuff`, `CriticalDefenceDebuff`, `SpeedDebuff`) are unit status fields fed by `StatusEffect`s; `IsDebuffSkill` maps `SkillEffectType` ≥32 to `DebuffEffectType`.

### 5.2 Unit model — `UnitStatusBase` / `FriendStatus` / enemy statuses

22 combat stats per unit: Attack, Hp, HpRecover, CriticalDamage, CriticalRate, UniqueSkillCoolTime, AssistSkillCoolTime, NormalAttackDamageRate, SkillDamageRate, UniqueSkillDamageRate, BossDamageRate, MobDamageRate, AttackDebuff, DefenceDebuff, CriticalDefenceDebuff, SpeedDebuff + movement: MoveSpeed, AttackStartPosition, Margin, BeforeMoveDelay, AfterMoveDelay, FirstAttackRate, AttackRatePerAttack, ResistanceSkillEffectType (debuff immunity flags), plus a `StatusEffects` list (timed buffs/debuffs applied via `AddStatusEffect`).

Enemies come from `HuntEnemyStatus` (25,008 rows): `hp`/`attack` as **BigDecimal strings**, `attackSpeed` (base 0.66), `moveSpeed`, `attackStartPosition`, `margin`, `firstAttackRate`, `attackRatePerAttack`. Stage 1 enemies: hp 1–9, atk 1–3; late-game enemies reach ~1e40 — pure exponential inflation.

### 5.3 Skills — `HuntSkill` (168) × `HuntSkillEffect` (186) × `LevelRangeValue`

Each skill: `recastTime` ms (cooldown), `skillCastTime` ms, 1+ effects. Each effect: `skillEffectType` (bitflags), target (`Enemy|Friend × Single|Range`), `calculationType` (`Add`=0, `AddPercent`=1, `Multiple`=100), `buffEffectTime` s, and `effectLevelRangeValueId` → level scaling row. Full resolved table in `analysis/skills_resolved.json` and §2 of `report_data_digests.md`. Examples:

| Skill | Effect | L1 | L100 |
|---|---|---|---|
| 311 (Normal) | Attack single | 1.6× atk | 18.43× atk |
| 313 | CritRate Up (Friend range) | +10.3% | +40% |
| 332 (Rare) | Attack single | 23.4× | 290.7× |
| 341 (SuperRare) | Attack **AoE** | 56× | 650× |
| 343 | CritDamage Up | +200% | +20000% |
| 352 (HyperRare) | Attack single | 120× | 1308× |

`SkillEffectType` flags: 1 Attack, 2 AtkUp, 4 AtkSpeedUp, 8 CritRateUp, 16 CritAtkUp, 32 AtkDown, 64 DefDown, 128 SpeedDown, 256 RecastReset, 512 BossDmgUp, 1024 MobDmgUp, 2048 CritDefDown.

### 5.4 LevelRangeValue — the universal level-scaling primitive (3,435 rows)

`GetValue(level)` (struct `WithNetwork.LevelRangeValue`, `0x90CFF08`) evaluates per `LevelRangeType` (all confirmed via Ghidra decompilation — see `analysis/formulas_decompiled.md`):
- **Default(1):** linear interpolation — `value = start + (end−start) × (level−rangeStart)/(rangeEnd−rangeStart)`; if `rangeEnd==rangeStart` returns `endValue`. **No clamping** — out-of-range levels extrapolate.
- **AddConstant(2):** `level>0 → value = start + end × (level−rangeStart)`; `level≤0 → 0`.
- **FixedLevel(3):** `level ≥ rangeStart → startValue`.
Then `ToTypeValue`: `Permil(2)` → **÷1000** (dedicated `_permilDivisor` constant), `RealNumber(1)` → as-is, `Invalid(0)` → throws. `rangeEndLevel=0` means infinite range. A `LevelRangeValueGroup` chains multiple entries (each with its own level band) via `TryGetValue`.

Everything level-scaled in the game (skill effects, possession effects, costume rates) goes through this — a row like `skill 311: 1600→18430 Permil over L1–100` = 1.6×→18.43× multiplier.

### 5.5 Hunt flow constants (from `Config`, all 153 in digests)

Boss fight time limit **30 s**; 10 areas per difficulty × 10 stages per area; Chiikawa walk speed **7 m/s**; walk distance 4.5 m; unique-skill queue wait 500 ms, assist-skill queue 2000 ms; HP recovery tick 1 s; level-up status gain **+150 flat & +10%** (Config #8/#9); defeat-UI interval 3 min; speed-up = 2×.

---

## 6. Progression math

### 6.1 EXP — `Experience` (7,239 rows, 60 curves)

Per-level **cumulative** EXP tables. Group 1 (100 lv): ends at 1,420 total (tiny — early track); Group 2–4 (200 lv): identical curve ending at 221,700 (per-level cost grows 30→~7k, super-linear ≈ quadratic+); Group 5 (15 lv): ends 136,100. Full per-group table in digests §3.

### 6.2 Status enhancement — `StatusEnhance` (7 tracks) × `StatusEnhanceCostRange`

Tracks (Attack/Health/…, `maxLevel=180000`, tiers, per-track `consumeId` currency). Cost grows by level bands: `StatusEnhanceCostRange` rows = `startLevel–endLevel → coefficient` (1.25, 1.6, … — multiplicative per-band cost growth). Level-up effect: **+150 flat status and +10%** per level (Config 8/9).

**Base status growth constants (`HuntStatusConfig`):** Attack **+10**/level; HP **+10**/level on a base of **100**; HP-recover **+0.7**/level on a base of **6.3**; Critical rate **+0.001 (0.1%)**/level.

**Status value composition (verified in `AttackValue`/`CriticalRateValue.GetCalculateValue`, offsets `0x916403C`/`0x916514C`):**
```
finalValue = BaseValue × CorrectValue × StatusUpRate + StatusUpValue
```
(BaseValue = leveled base stat; CorrectValue = equipment/collection multiplier, default 1; StatusUpRate = buff multiplier, default 1; StatusUpValue = flat buff add, default 0. Buffs multiply first, flats land last.)

**Stage scaling shape:** stage 10101 → 18 gold/min; stage 11010 → 1.82×10⁹; stage 51010 → 2.18×10²¹; enemy HP reaches ~1.35×10⁴⁰ — the whole game runs on exponential inflation with difficulty-tier resets.

### 6.3 Equipment & possession effects

Every equipment item (Weapon 52, Armor 52, AssistSkill 22, Costume, Treasure 23) has **two** effects: `possessionEffectId` (permanent collection bonus for merely owning it) and `equipmentPossessionEffectId`/`equipEffectIds` (equipped bonus). `PossessionEffect` (2,823 rows) = `statusType + value + levelRangeValueGroupId + valueType` — i.e. flat or level-scaled status contributions, aggregated per `StatusType` into `HuntBaseStatus` (base + Add/Multiply/Shorten/BaseMultiplyAdd elements). Costume-specific rates: `attackRateLevelRagneGroupId`, `attackSpeedLevelRagneGroupId`, `skillCoefficient`, tags → `Tag` synergies, plus promotion (`CostumePromotion`, `CostumeRarity`).

### 6.4 Other progression systems

- **Treasure** (23): own EXP curve (`TreasureExperience`, group 91, max 100), promotion groups, consume per EXP.
- **Mastery** (64-node tree, `maxLevel` 5 each, consumes resource 204; conditional unlocking via `conditionMasteryId`).
- **Study** (39 studies, 237 level rows): time-gated (`requiredMinutes` per level) + `consumeGroupId`; gives possession effects; `StudyTimeCalculator` handles remaining-time math, `StudySpeed`(151)/`StudyResourceAcquire`(150) statuses modify it.
- **CollectionBook** (62) & **ArtBook** scenes: level → possession effects.
- **Keyholder** (1,078 items / 154 groups, rarity-up tracks) — gacha-collectible keychains feeding statuses.
- **Blessing** (4): timed (40-min activation, Config #34) status boost; **BuffItem** (3): consumable boosts.
- **Weeding** (gardening mini-game): stamina economy (`WeedingStamina`, action stamina 100/101 statuses, stage chunks/blocks tables).
- **League**: 5 tiers, 250 league hunt stages, ranking rewards, admission fee, season/daily shops.
- **ChallengeHunt**: 3 ranks × daily rewards (1,100 rows) + first-reach rewards.

---

## 7. Economy

### 7.1 Idle rewards (offline earnings)

- Accrual cap **720 min (12 h)**; ticks every 5 min; bonus tick 60 min (`IdleRewardGroup`).
- **Ad bonus:** +360 idle-minutes per ad, max **3/day**, resets 06:00 UTC (`IdleBonusReward`).
- Per-stage gold: `HuntStage.baseIdleGoldAmountPerMinute` (BigDecimal string; stage 10101 = 18/min), scaled by `GoldAcquire`(50) status; `IdleStageReward` (10,200 rows) maps stages → additional per-minute rewards; `DropGoldPerUnit = totalGold/unitCount` in battle.
- Progression push: `automaticProgressionReward` (stage 10101 = 30) on stage clear.

### 7.2 Gacha (costume/equipment lottery)

`Gacha` (banners: view conditions, content locks, prize groups, draw groups, EXP group 5, ad-reward tie-ins, banners with date terms) × `GachaDraw` (consume per draw, `drawCount`, `coolTimeMinutes`, `isAd`, `isAuto`, draw limits) × `GachaDrawGroup` (296) × `GachaPrize` (108; level & `viewMaxRarity` up to LegendRare) × `GachaDrawLimit`. **Actual rates are server-side** (GS2 lottery — `GachaGS2LotteryRelation` maps banners to GS2 lottery IDs); the client shows `probabilityAttentionTextKey` text. Draws consume via `Consume` (1,811 rows: type + masterId + amount).

### 7.3 Shop & monetization surface

`ShopItem` (2,084) across shop groups/categories, item types incl. gacha banners (`itemType:"Gacha"` → `shopItemDetailId` = gacha id), packs (`Pack`, `PackDecorateCharacter`), season pass (`SeasonPass`/`SeasonPassLevel`), shop passes, `PermanentExchangeList`, limited-resource items, gift boxes (distribution windows as .NET ticks), comeback/login-bonus campaigns, roulette (1 free + 4 ad spins/day), random rewards (ad-tied), force-appeal (popup) table.

---

## 8. Cooking (cafe production) math

`CookingResourceCalculator` (disassembled): production is a **pure multiplicative stack**:

```
rate = baseResource × cafeEffectCoeff × kitchenLevelCoeff × formationSlotCoeff
       × genreMatchCoeff × boostCoeff × resourceAcquireBuffCoeff
```

Coefficients (from `Config` + `CookingCafeLevel`/`CookingKitchen` tables):
- booth/level factor 1.0; **genre match 1.5× / mismatch 1.0×** (Config 23/24)
- rarity weight: SR 3 / HR 1 / UR 0.3 (Config 25–27)
- **main slot 1.0× / sub slot 0.3×** (Config 28/29)
- motivation boost **2×** (Config 30); fes-rank +0.01 (Config 33)
- resource generation tick **every 1 min** (Config 10); idle-time cap via `CookingMaximumIdleTimeLimit`(160), `CookingResourceAcquire`(161) status.
Auto-select ("omakase") scoring weights: Attack 0.5, HP 5, CritDamage 0.5, NormalAtkRate 0.5, SkillRate 0.5, Gold 0.5 (Config 35–40).
Cafe EXP: `CalculateCafeExp(resourceAmount, resourceToExpCoefficient)`; menus (`CookingMenu`/`CookingRecipe`/`CookingMenuRarity`), licenses, unlock-level-uppers with BigDecimal costs.

---

## 9. Remaining bits

- **MyRoom**: character/food/interior/room-size tables, emotion-action deltas, gift rates (`HomeCharacterGiftRate`), lottery tables for home events, closet/costume defaults — mostly content data, little math.
- **Tutorial/guides/UI**: `Guide`, `TutorialGuide`, `SpeechBalloon` (1k+), `Sticker`, `ProfileCard`, `DescriptionGroup`.
- **Localization**: `LocalizationText` (983 UI strings, EN+JP); master-data `*TextKey` ints are **server-resolved** (not offline-decodable — the master text table is downloaded per-account/session; not present in the APK dump).
- **Anti-tamper:** encrypted `global-metadata.dat` (defeated via memory dump), `.tgz.enc` next to plaintext `.tgz`, `libFastAES.so`, `bitter.jniwq` anti-cheat DEX, `libchecker.so`/`libbuffer.so` native guards. None hinder offline analysis.

## 10. Verification status

- All 236 tables parse **byte-exact** (row payload fully consumed; enforced by the parser).
- Formulas in §5.1/§5.3/§5.4/§6.2/§8 were read directly from ARM64 disassembly **and confirmed by Ghidra decompilation**: 74 priority calculator functions were decompiled to C with IL2CPP names applied (0 failures) — see **`analysis/formulas_decompiled.md`**. The normal-attack formula in §5.1 matches the decompiled C instruction-for-operand.
- The full Ghidra project (imported binary, no full auto-analysis needed) is in `work/ghidra_proj2`; the PyGhidra driver (`tools/decompile_ghidra.py`) can decompile any further function on demand in minutes.
