# Chiikawa Pocket — Complete Datamine (v2.4.1)

> A full offline datamine of **Chiikawa Pocket (Global)** — `jp.co.applibot.chiikawapocketgl` v2.4.1 (Unity IL2CPP).
> All 236 master-data tables decoded, every game formula recovered from native code and verified, plus guides, a team calculator webapp, and the full deobfuscated codebase structure.
>
> **Unofficial fan research.** Not affiliated with Applibot or the Chiikawa IP holders. Published for educational/datamining purposes. No game binaries are hosted here (see [What's not here](#whats-not-here-and-why)).

---

##  The documentation (start here)

| Doc | What it is |
|---|---|
| **[analysis/MECHANICS.md](analysis/MECHANICS.md)** | How every game system works |
| **[analysis/MATH.md](analysis/MATH.md)** | Every important formula, explained with worked examples |
| **[analysis/OPTIMAL_PLAY.md](analysis/OPTIMAL_PLAY.md)** | The mathematically optimal way to play each mechanic |
| **[analysis/TEAM_SETUP.md](analysis/TEAM_SETUP.md)** | Team/formation math: what order changes, optimal arrangement |
| **[analysis/LITTLE_HOUSE.md](analysis/LITTLE_HOUSE.md)** | The little-house items (Treasure system): verified owned + equip bonuses, conditions, best items |
| **[analysis/KEYCHAIN.md](analysis/KEYCHAIN.md)** | The keychain (Keyholder) system: targeted equip effects, rarity tiers, merge costs |
| **[analysis/MYROOM.md](analysis/MYROOM.md)** | Disambiguation: the code's "MyRoom" (cosmetic editor) vs the little-house items |
| **[analysis/REPORT.md](analysis/REPORT.md)** | The technical datamine report (formats, systems, proof) |
| **[analysis/formulas_decompiled.md](analysis/formulas_decompiled.md)** · **[batch2](analysis/formulas_decompiled_batch2.md)** · **[batch3](analysis/formulas_decompiled_batch3.md)** · **[batch4](analysis/formulas_decompiled_batch4.md)** | 90+ calculator/mechanics functions decompiled to C |
| **[analysis/report_data_digests.md](analysis/report_data_digests.md)** | Big reference tables (all 153 Config constants, EXP curves, 168 skills with scaling, cost bands) |
| **[webapp/](webapp/)** | **Team & Order Calculator** — open `webapp/index.html` in a browser |

##  The game's actual math (the highlights)

**Damage (normal attack):**
```
damage = Attack × NormalAttackDamageRate × CostumeAttackRate
       × (boss ? BossDamageRate : MobDamageRate) × DefenceDebuffAmp ÷ AttackDebuff
if rand(0,1) < CritRate:  ×= CriticalDamage × CriticalDefenceDebuffAmp
if ConstantDamage > 0:    flat override (never crits)
```

**Crit expectation:** `E = 1 + CritRate × (CritDamage − 1)` — base crit rate is **0%** (+0.1%/level), base crit damage **1.2×** (+1%/level).

**Every stat:** `final = BaseValue × CorrectValue × StatusUpRate + StatusUpValue` — your displayed attack is a small linear base × an enormous collection multiplier (why owning everything beats leveling anything).

**Level scaling (everything):** linear `start + (end−start)×(L−startLv)/(endLv−startLv)`, Permil = ÷1000, no clamping. Skill example: Super Rare AoE 56×→650× attack from L1→L100.

**Formation:** single-target hits always strike the leftmost alive slot (front = shield); skills fire in formation order from a FIFO queue (0.5s unique / 2s assist gaps) — buffs go left of your nuke, carry goes far right.

**Economy:** idle gold = stage rate × GoldAcquire, 12h cap, ad = +6h ×3/day; stage rates inflate 18/min → 10²¹/min; enemy HP reaches ~10⁴⁰ (BigDecimal everywhere; letter suffixes are base-26 alphabet — `264i` = 2.64×10²⁹).

**Cooking:** pure multiplier chain — genre match 1.5×, main/sub slot 1.0/0.3×, rarity SR 3×/HR 1×/UR 0.3× (inverted!), boost 2× → 9× from correct assignment.

**Costs:** Attack enhance = 3 gold/level vs Critical Rate = 10¹⁴ gold/level (deliberate late-game sink); gacha 500 gems/11-draw vs 1500/35 (−5.7%); ad draw free 11×3/day.

Full formulas with derivations: **[analysis/MATH.md](analysis/MATH.md)**.

##  The data

- **[analysis/masterdata/](analysis/masterdata/)** — all **236 master-data tables decoded to JSON** (byte-exact): 8,648 stages, 25,008 enemy statuses, 146 costumes, 168 skills/186 effects, 2,823 possession effects, 2,084 shop items, gacha structures, cooking, study, weeding, league…
- **[dumps/MasterData/](dumps/MasterData/)** — the raw `.bytes` master files as pulled from the device
- **[analysis/schema.json](analysis/schema.json)** — extracted message/enum schemas (568 classes, 1,331 enums) + [proto_descriptors.json](analysis/proto_descriptors.json) (partial .proto recovery)
- **[analysis/skills_resolved.json](analysis/skills_resolved.json)** — every skill effect with level-scaled values resolved
- **[dumps/il2cppdumper/dump.cs](dumps/il2cppdumper/dump.cs)** — the deobfuscated C# structure of the entire game (every class, field, method + native address)
- **[dumps/il2cppdumper/DummyDll/](dumps/il2cppdumper/DummyDll/)** — reconstructed managed DLL stubs (all assemblies incl. Assembly-CSharp)
- **[decompiled/jadx-base/](decompiled/jadx-base/)** — decompiled Java layer (mostly platform SDKs; game logic is IL2CPP-side)

##  The calculator webapp

Open **[webapp/index.html](webapp/index.html)** in any browser (no server). Enter your account stats, mark owned costumes, and it computes your best 6-costume team **and** the optimal order — using the real formulas (skill scaling at your levels, crit expectation, buff uptimes, tag synergy, survival/queue-aware ordering over all 720 permutations). Includes a buffs/items browser (149 items with possession/equipment effects) and a math reference tab.

##  How it was datamined (pipeline)

1. Pulled the installed APK splits + runtime master data from an emulator over ADB (root).
2. The shipped `global-metadata.dat` is encrypted — recovered the **decrypted** copy from the running game's memory mapping.
3. Il2CppDumper → full C# structure (`dump.cs`, DummyDll, script.json).
4. Reverse-engineered the MasterData `.bytes` format (tagless, proto-style, varint/fixed-8 mix) and wrote a byte-exact parser → all 236 tables to JSON.
5. Recovered calculation code from `libil2cpp.so` (ARM64) via Capstone disassembly + Ghidra/PyGhidra decompilation of 90+ functions (damage, status aggregation, skill queue, cooking, CP…).

Reproduction scripts (our own): **[scripts/](scripts/)** — parser, schema extractor, disassemblers, decompile drivers, dataset exporters. Downloaded toolchains (Ghidra, jadx, Il2CppDumper) are not included — versions/links in each script header.


## What's not here and why

- **The APK and Unity asset pack** (copyrighted game files; also >800 MB — over GitHub's limits).
- **`libil2cpp.so`, `il2cpp.h`, `script.json`** (binary/oversized; `dump.cs` + DummyDll carry the same information).
- **Gacha rates, master text, idle-reward final values** — computed **server-side** (GS2); they are not in the client, so they can't be datamined offline. Any "rate" you see quoted elsewhere comes from the server, not the APK.
- Toolchains (Ghidra/jadx/Il2CppDumper) — see `scripts/` for what to download.

##  Disclaimer

Fan-made, unofficial research project for education and interoperability discussion. All game data, names, and assets belong to their respective owners (Applibot / Chiikawa IP holders). If you are a rights holder and want anything here removed, open an issue and it will be taken down promptly. No copyrighted game binaries are distributed in this repository.
