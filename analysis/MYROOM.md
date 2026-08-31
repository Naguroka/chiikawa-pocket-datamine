# Chiikawa Pocket — The Little House ("MyRoom") Deep Dive

*All from the v2.4.1 datamine. Naming note: in the game client this feature is called the **"little house"** (the Edit tab). In the code and data tables it's called **`MyRoom`** — same thing. This guide also covers the furniture-with-effects items (the wall clock & friends), which are technically the **Treasure** system shown in the house.*

---

## 1. The three layers of the little house (don't mix them up)

| Layer | Tables | What it does |
|---|---|---|
| **House items (HomeItem)** | `HomeItem` | The *collectible furniture buffs* — all 114 give the same Attack ×1.15/1.20/1.30 (item Lv1/2/3) for **owning** them. Placement is cosmetic. |
| **MyRoom ("little house" proper)** | `MyRoomInterior`, `MyRoomCloset`, `MyRoomRoomBackground`, `MyRoomRoomSize`, `MyRoomCharacter`, `MyRoomFood`, `MyRoomEmotion*`, `MyRoomClientConfig`, `MyRoomTicketShop` | The *room editor*: place furniture, dress characters ("You Look Like" skins), feed/pet them. **Cosmetic + emotion economy — zero combat stats.** |
| **Treasures shown in the house** | `Treasure`, `TreasureEquipEffect`, `TreasurePossessionEffect`, `CustomPossessionEffect` | The effect-bearing display items — **the wall clock, sofas, etc.** These DO change combat, including the tag-conditional equip bonuses. |

The confusion is understandable: the wall clock *looks* like a house item, but mechanically it's **Treasure 4002**, and its "+612% Critical Damage" is a **CustomPossessionEffect** with a formation condition.

## 2. MyRoom proper (the editor) — what it does and doesn't do

- **Interior** (75 items: 39 floor furniture, 15 wall, 11 wall furniture, 10 flooring; 12 have character animations): purely decorative.
- **Closet** (75 "You Look Like" items: Head/Body/Hand/Accessory skins): dress-up for the room character. Cosmetic.
- **Room backgrounds** (37) and **room sizes** (3: 8×8, 10×10, 12×12 grids).
- **Character care**: feeding (`MyRoomFood`, tastes per character), petting/emotion (`MyRoomEmotionStateRange`/`ActionDelta`) with emotion value −1000…+1000 that decays 10/s (`MyRoomClientConfig`), baths, daily-login missions, and a **ticket shop** (`MyRoomTicketShop`).
- **No combat stats come from any of this.** It's the chill zone. Its only account value is missions/rewards (currencies, tickets) and engagement conditions (`MyRoomDailyLoginCount`, `MyRoomSelectInteriorPlacementCount`, etc. — those feed *missions*, not stats).

## 3. Treasures — the house items that actually matter

### 3.1 The effect chain (verified end-to-end)

```
Treasure.equipEffectIds → TreasureEquipEffect → (Custom | Default)
   Custom  → CustomPossessionEffect (target: Party/SpecificCharacter/AssistCharacter + condition)
   Default → plain PossessionEffect (level-scaled)
Treasure.possessionEffectIds → TreasurePossessionEffect → plain effect (promotion-scaled, group 93001)
```

There are **23 treasures**, all UltraRare, in **5 groups** (7+4+4+4+4). Each gives: own/possession effects (always on) + one equip effect (while equipped/displayed).

### 3.2 Every equip effect, with values at treasure Lv1 / Lv50 / Lv100

| Treasure | Effect (Lv1 → Lv100) | Target | Condition |
|---|---|---|---|
| 1001–1007 (grp1) | Attack **2.04 / 4.00 / 6.00** | one specific main character each | none |
| 2001 | Attack **6.12 / 12 / 18** | Party | FormationWeaponRarity Match 4 (≈SR weapon equipped) |
| 2002 | Attack **1.00 / 50 / 125** | Party | **none** |
| 2003 | SkillDamageRate **0.01 / 0.75 / 1.50** | Party | none |
| 2004 | Health (promo-scaled) | Party | none |
| 3001 | Health **1.22 / 2.40 / 3.60** | Party | FormationArmorRarity Match 5 (≈HR armor) |
| 3002 | Attack **16.32 / 32 / 48** | Party | ≥4 outfit specialties in party |
| 3003 | UniqueSkillDamageRate **0.01 / 0.25 / 0.50** | Party | none |
| 3004 | CriticalDamage (promo-scaled) | Party | none |
| 4001 | Attack **16.32 / 32 / 48** | Party | FormationAssistSkillRarity Match 5 |
| **4002 — the wall clock** | **CriticalDamage 6.12 / 12 / 18** | Party | **6 outfit specialties in party** |
| 4003 | Attack **0.00 / 0.10 / 0.20** | Party | none |
| 4004 | UniqueSkillDamageRate (promo-scaled) | Party | none |
| 5001 | Attack **20.40 / 40 / 60** + Health **1.02 / 2 / 3** | Party | UR(6) weapon + UR(6) armor equipped |
| 5002 | Attack **30.60 / 60 / 90** | Party | ≥1 outfit specialty in party |
| 5003 | **BossDamageRate 1.50 / 75 / 150** | Party | **none** |
| 5004 | SkillDamageRate (promo-scaled) | Party | none |

Values are multipliers on your stat (e.g. the wall clock's `6.12` = CriticalDamage ×6.12 ≈ "+612%" — exactly what the game shows at Lv1; ×18 at Lv100).

### 3.3 What "outfit specialties" means (the tag condition)

Each costume has a **cooking-specialty tag** (tags 11–16+, the same specialty used by kitchens). The condition types:

- `FormationCostumeCookingTagCount` **Match/≥ N** — the number of formation costumes carrying an outfit specialty. The ladder in the data: treasure 5002 needs **1**, 3002 needs **4**, the wall clock needs **6 (a full team)**.
- `FormationWeaponRarity / FormationArmorRarity / FormationAssistSkillRarity Match N` — an equipped item of at least rarity N (4 ≈ SuperRare, 5 ≈ HyperRare, 6 ≈ UltraRare).

**How hard is a full-specialty team?** Cooking tags are common: 23–28 costumes share each of the main tags (tag 15: 28 costumes, 11: 25, 16: 24, 14/13/12: 23 each) — every costume in the game appears to carry one cooking specialty, so a 6-specialty team is just… any 6 costumes with specialties, which is most teams. The condition is really a "did you build an actual team" check, not a hard one.

## 4. How this affects team composition

1. **Specialty coverage becomes a formation checkbox.** With treasures 3002/4002/5002 live, *every* formation costume should carry an outfit specialty (they almost all do — verify your 6th slot isn't specialty-less).
2. **Equip treasures to match your fight:**
   - **Boss wall → Treasure 5003** (BossDamageRate up to ×150 at Lv100, unconditional). Nothing else comes close for the 30-second check.
   - **Raw scaling → Treasure 2002** (Attack ×125 at Lv100, unconditional).
   - **Easy condition, big payoff → Treasure 5002** (Attack ×90 at Lv100 with just 1 specialty costume) and **3002** (×48 with 4).
   - **Crit build → the wall clock (4002)**: ×18 crit damage at Lv100 when the whole team has specialties — pairs with crit-rate buffs (remember `E = 1 + critRate × (critDmg − 1)`; ×18 crit damage makes any crit-rate you have enormously valuable).
   - **Character-targeted (1001–1007):** ×6 attack at Lv100 for one specific main character — equip the one matching your carry.
3. **Gear-rarity gates (2001/3001/4001/5001):** keep at least one SR+ weapon, HR+ armor, HR+ assist equipped; 5001 wants UR weapon AND armor for ×60 attack + ×3 health.
4. **Promotion matters:** equip effects scale with treasure level (the +612% was just Lv1) — treasure EXP (buttons ×100/EXP, `TreasureExperience` max Lv100) and promotion groups 93001/93002 multiply both own and equip effects.

## 5. TL;DR

- The "little house" editor (furniture/closet/care) is cosmetic — the wall clock's bonus comes from it being a **Treasure**, not a house item.
- Best equips: **5003** (boss), **2002** (attack, no condition), **5002/3002** (tag-gated attack), **4002** (crit-damage ×18 with a full-specialty team), plus the character-matching 1001–1007.
- Level your treasures (buttons) — the values above are Lv1; they grow 10–50× by Lv100.
