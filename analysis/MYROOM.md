# MyRoom (code name) ≠ the "little house" item bonuses

**Read [`LITTLE_HOUSE.md`](LITTLE_HOUSE.md) instead** — it documents the effect-bearing items (wall clock, sofas, "You Look Like" outfits), which are the **`Treasure`** system.

This file previously (and incorrectly) mixed three systems. For the record:

- **`Treasure`** = the little-house items with owned + equip bonuses → documented fully in [`LITTLE_HOUSE.md`](LITTLE_HOUSE.md).
- **`MyRoom`** (the code's name for the room editor) = furniture placement (`MyRoomInterior`), outfit skins (`MyRoomCloset`), character feeding/petting with an emotion meter (`MyRoomEmotion*`, `MyRoomClientConfig`), ticket shop. **Cosmetic only — no combat stats.**
- **`HomeItem`** = the other furniture collection (114 items, each granting the same Attack ×1.15/1.20/1.30 at item Lv1/2/3 for owning them) — see `MECHANICS.md` §3.3.
