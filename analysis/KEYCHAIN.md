# Chiikawa Pocket — The Keychain (Keyholder) System, Fully Mapped

*From the v2.4.1 datamine. In-game these are the keychains you clip onto characters; in code: `Keyholder` / `KeyholderGroup` / `KeyholderRarityUp` / `CustomPossessionEffect`. Close cousin of the little-house (Treasure) system — same "own vs equip" shape, but with character targeting.*

---

## 1. Structure

- **1,078 keychain items = 154 groups × 7 rarities each** (Normal, NormalRare, Rare, SuperRare, HyperRare, UltraRare, LegendRare).
- Each **group** is a **main character + assist character pair** (e.g. group 1 = Chiikawa + assist 3005) and carries:
  - **one equip effect** (active while the keychain is equipped on the formation),
  - **ten rarity-tier effects** that unlock as you merge the keychain up through rarities.
- You equip keychains on the keyholder formation; the bonuses multiply into the shared account stats (or the targeted character — see §3).

## 2. Equip effects (targeted, level-scaled)

Every group's equip effect is a `CustomPossessionEffect` — **targeted** and **level-scaled**:

- **SpecificCharacter[the group's main character]** → that character's **Attack**.
- Values scale with the keychain's level. Examples (Lv1 / Lv50 / Lv100):
  - Group 1 (Chiikawa+3005): Chiikawa ATK **×10.0 / 29.8 / 50.0**
  - Group 2: ×10.8 / 32.2 / 54.0 · Group 3: ×11.6 / 34.6 / 58.0 · Group 4: ×12.4 / 37.0 / 62.0 · Group 5: ×13.2 / 39.3 / 66.0
- The code **gates** these: if the targeted character isn't in play, the bonus contributes nothing (verified in the decompiled `CalculateStatusTargetCharacter`). So equip keychains that match your actual formation.

## 3. Rarity-tier effects (the merge ladder)

Each group has **10 effects** unlocked one per rarity tier. They mix party-wide and targeted stats — group 1 example (Lv1 / Lv100):

| Tier | Effect | Target | ×Lv1 / ×Lv100 |
|---|---|---|---|
| 1 | Health | Party | 3.33 / 10 |
| 2 | AssistSkillDamage | assist 3005 | 3 / 6 |
| 3 | MobDamageRate | Party | 0.4 / 2 |
| 4 | SkillDamageRate | Party | 1.6 / 8 |
| 5 | SkillDamageRate | Party | 24 / 120 |
| 6 | NormalAttackDamageRate | Party | 100 / 500 |
| 7 | Attack | Party | 20 / 100 |
| 8 | Health | Party | 8 / 40 |
| 9 | CriticalDamage | Party | 20 / 100 |
| 10 | **AssistSkillDamage** | assist 3005 | **3000 / 6000** |

Across all 511 custom effects in the game: 287 target an assist character (AssistSkillDamage/AssistCrit/AssistAttack), 161 target a specific main character (Attack), 42 are party-wide (Attack/Health/CritDamage/SkillRate/BossRate).

## 4. Merging (KeyholderRarityUp) — verified costs

| Step | Cost |
|---|---|
| Normal → NormalRare → Rare → SuperRare | **3 copies of the same keychain** per step |
| SuperRare → HyperRare → UltraRare → LegendRare | **1 copy of the same keychain + 2 other keychains of the same rarity** per step |

Each rarity tier on each group unlocks the next effect in §3 — so merging is permanent account power, and even "duplicate" pulls matter.

## 5. How to use them (team-comp view)

1. **Match keychains to your carry:** a SpecificCharacter keychain only pays out while that character is in your team. Equip your main DPS's keychains first.
2. **Assist synergy:** AssistCharacter-targeted effects (AssistSkillDamage up to ×6000 at tier 10, Lv100) make that assist character's skill a nuke — pair with the assist skill in your formation.
3. **Merge aggressively:** tier-10 effects are the biggest single bonuses in the game; duplicates are merge fuel, not trash.
4. **Level the equipped keychains:** equip values scale with keychain level (×10 → ×50+).

## 6. Keychains vs little-house items (Treasures)

| | Keychains | Little-house (Treasure) |
|---|---|---|
| Own bonus | rarity-tier effects (merge to unlock) | level-scaled Attack + secondary stat |
| Equip bonus | targeted (specific character / assist) | party-wide, sometimes conditional (star gates, specialty counts, progress-scaled) |
| Progression | merge duplicates (3 copies, then 1+2) | level with buttons ×100/EXP |
| Best for | character-focused builds, assist nukes | general multipliers, boss/crit setups |
