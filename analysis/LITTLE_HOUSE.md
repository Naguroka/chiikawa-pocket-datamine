# Chiikawa Pocket — The "Little House" Items (Treasure System), Fully Verified

*Everything below was cross-validated against manually collected in-game values — every number matched the datamined tables exactly (e.g. Picnic Chiikawa's "ATK+415%/HP+30% at Lv66" = effect groups 90101/90102 evaluated at 66; Garland's "+2.18a%" = group 91541 at Lv9). Naming: the game client calls these the "little house" items; in code/data they are the **`Treasure`** system. (The `MyRoom` room editor is a separate, purely cosmetic feature — see the appendix.)*

---

## 1. What these items are

There are **23 "little house" items**, all UltraRare, in **5 series** — exactly the categories shown in the tab:

| Series | In-game category | Items |
|---|---|---|
| 1 (ids 1001–1007) | **You Look Like…** | 7 outfits, one per main character |
| 2 (ids 2001–2004) | **Chairs** | Fluffy Sofa, Red Sofa, Bead Cushion, Rocking Chair |
| 3 (ids 3001–3004) | **Decorations** | Round Table, Yellow Chest, Stack of Books, Candle & Shelf |
| 4 (ids 4001–4004) | **Wall Items** | Weeding Art, Wall Clock, Poster, Wall Shelves |
| 5 (ids 5001–5004) | **Ornaments** | Star Sticker, Decorative Flowers, Lively Lights, Garland |

Each item has **two** bonuses:
- **"Bonus Effect" (owned)** — active permanently just for owning it, scales with the item's level.
- **"Equip Bonus"** — active while equipped/displayed, scales with the item's level; some have conditions (star-rarity of your gear, outfit specialties in the party, or account progress).

Items level with **buttons ×100 per EXP** (`TreasureExperience`, exp group 91, max Lv100). Owned effects additionally get a **promotion multiplier** (group 93001: ×1.2 at promo 1 → ×21).

## 2. Owned ("Bonus Effect") values — verified

Every item = **Attack (tier curve) + one secondary stat**:

| Series | Attack @Lv1 → Lv100 | Secondary @Lv1 → Lv100 |
|---|---|---|
| You Look Like (1001–1007) | 2.525 → 5.00 | **HP +30%** (flat) |
| Chairs (2001–2004) | 5.10 → 15.00 | Special Attack Damage 1.02 → 3.00 |
| Decorations (3001–3004) | 7.65 → 22.50 | Normal Attack Damage 1.02 → 3.00 |
| Wall Items (4001–4004) | 10.20 → 30.00 | Normal Attack Damage 1.53 → 4.50 |
| Ornaments (5001–5004) | 12.75 → 37.50 | Special Attack Damage 1.53 → 4.50 |

(values are multipliers: 5.10 = "ATK +510%", 14.75 ≈ "ATK +1.47a%" — matches in-game displays at Lv66/Lv44/Lv9/etc.)

## 3. Equip bonuses — verified

### 3.1 You Look Like (targeted at one character)
| Item | Equip bonus @Lv1/50/100 |
|---|---|
| Picnic Chiikawa (1001) | Chiikawa's ATK ×2.04 / 4.00 / 6.00 |
| Picnic Hachiware (1002) | Hachiware's ATK ×2.04 / 4.00 / 6.00 |
| …Momonga, Kurimaju, Rakko, Shisa (1003–1007) | same curve for that character |

### 3.2 Chairs
| Item | Equip bonus | Condition |
|---|---|---|
| Fluffy Sofa (2001) | ATK ×6.12/12/18 | equipped weapon is 5★+ (HyperRare+) |
| Red Sofa (2002) | ATK, **scales with # of your outfits at Lv100+** (rate 1.00@Lv1 → 125@Lv100 per outfit; cap ≈1a–1.3a%) | — |
| Bead Cushion (2003) | Special Attack & Assist Damage, **scales with your total Booth Level** (rate 0.015 → 1.5 per level; cap ~465% at Lv44) | — |
| Rocking Chair (2004) | HP ×1.02 → 3.00 | — |

### 3.3 Decorations
| Item | Equip bonus | Condition |
|---|---|---|
| Round Table (3001) | HP ×1.22/2.40/3.60 | equipped tool/armor is 6★+ (UltraRare+) |
| Yellow Chest (3002) | ATK ×16.32/32/48 | **≥4 outfit specialties in the party** |
| Stack of Books (3003) | Special Attack Damage, **scales with total Cooking Level** (rate 0.005 → 0.5 per level; cap ~944%) | — |
| Candle & Shelf (3004) | Critical Damage ×2.448 → 7.20 ("+374.4%" at Lv28 ✓) | — |

### 3.4 Wall Items
| Item | Equip bonus | Condition |
|---|---|---|
| Weeding Art (4001) | ATK ×16.32/32/48 | equipped assist is 6★+ (UltraRare+) |
| **Wall Clock (4002)** | **Critical Damage ×6.12/12/18 ("+612%" at Lv1 ✓)** | **6 outfit specialties in the party** |
| Poster (4003) | ATK, **scales with total Weeding distance** (rate 0.002 → 0.2 per unit; cap ~2.04a) | — |
| Wall Shelves (4004) | Special Attack Damage ×10.2 → 30 | — |

### 3.5 Ornaments
| Item | Equip bonus | Condition |
|---|---|---|
| Star Sticker (5001) | ATK ×20.4/40/60 **and** HP ×1.02/2/3 | 7★ (LegendRare) weapon for ATK; 7★ tool for HP |
| Decorative Flowers (5002) | ATK ×30.6/60/90 | **≥1 outfit specialty in the party** |
| Lively Lights (5003) | VS Boss Damage, **scales with # of outfits at Lv200+** (rate 1.5 → 150 per outfit; cap ~1.5a) | — |
| Garland (5004) | Special Attack & Assist Damage ×20.2 → 40 ("+2.18a%" at Lv9 ✓) | — |

### 3.6 The fine print on the scaling types
- **Level-scaled** (most items): value = curve(item level). Straightforward.
- **Progress-scaled** (Red Sofa, Bead Cushion, Stack of Books, Poster, Lively Lights): value = **your account progress counter × per-unit rate** (the rate grows with item level; the in-game "Max" grows too — displayed Max ≈ maxRate × capCurve at your item level). Counters: total Booth Level (2), total Cooking Level (3), total Weeding distance (1), outfits at Lv100+ (5), outfits at Lv200+ (6).
- **Conditional** (star gates / specialties): the bonus is **zero** until the condition is met. "Outfit specialty" = a costume carrying a cooking-specialty tag — 23–28 costumes share each main tag, so any normal 6-costume team satisfies the ×6 condition.

## 4. What this means for team comps

1. **Check the gates before equipping:** Fluffy Sofa needs a 5★+ weapon, Round Table a 6★+ tool, Weeding Art a 6★+ assist, Star Sticker 7★ weapon+tool. Equip the gate gear or the bonus is dead weight.
2. **Specialty coverage:** Yellow Chest (≥4), Wall Clock (=6), Decorative Flowers (≥1) — keep a cooking-specialty tag on every formation costume (nearly all costumes have one).
3. **Progress effects favor established accounts:** Stack of Books/Bead Cushion/Poster/Lively Lights pay off from your *total* kitchen/cooking/weeding/outfit progress — they grow passively as you play everything else.
4. **Best items by use case:**
   - Boss walls: **Lively Lights** (VS Boss Damage, scales to huge values with Lv200 outfits), **Wall Clock** if crit-built (×18 crit damage at Lv100 with full-specialty team), **Candle & Shelf** (×7.2 crit damage, unconditional).
   - Raw attack: **Decorative Flowers** (×90 @1 specialty), **Yellow Chest** (×48 @4), **Red Sofa** (with many Lv100 outfits).
   - Skill damage: **Garland** (×40 at Lv100), **Wall Shelves** (×30).
   - Character-targeted: the **You Look Like** of your carry (×6 attack at Lv100 for that character).
5. **Level them:** the owned bonus is level-scaled (buttons ×100/EXP); promotion (93001) multiplies owned effects up to ×21.

---

## Appendix: what "MyRoom" actually is (disambiguation)

The code has a separate **`MyRoom`** feature (the room editor: `MyRoomInterior` furniture, `MyRoomCloset` outfit skins, character feeding/emotion, ticket shop). It's **cosmetic only** — no combat stats — and is *not* where the wall clock & co. get their bonuses. The bonuses documented above all live in the **Treasure** system.
