# Chiikawa Pocket — Team & Order Calculator (webapp)

Self-contained, no server needed. **Open `index.html` in any browser** (double-click it). Everything runs locally; your roster/inputs persist in the browser (localStorage).

## What it does

- **Team Optimizer tab**
  1. Enter your account stats (crit, rates, attack speed — from the in-game status screen). Attack is normalized to 1, so all DPS results are "× your attack per second".
  2. Pick a fight context (Farm / Balanced / Boss wall) and survival pressure (Safe / Wall).
  3. Mark the costumes you own + set each costume's level.
  4. **Find best team & order** — scores every owned costume with the game's real formulas, picks the best 6 (greedy + swap improvement with buff/tag interactions), then brute-forces all 720 orderings for the optimal arrangement.
  5. **Optimize order of current 6** — keeps your team, just reorders. Lock any slot with the 🔒 button to pin a costume in place.

- **Buffs & Items tab** — browse weapons/armor/assist skills/treasures, **home items** (all give Attack ×1.15/1.20/1.30 at item Lv1/2/3, active by owning — placement is cosmetic), and **keyholders** (equip effects that target the whole party 🎯, a specific character, or an assist — those only count when that character is in play). Toggle **owned** vs **equipped** separately, set levels, and *Apply to account stats* to fold the untargeted multiplicative totals into the optimizer.

- **Math Reference tab** — the exact formulas used (damage, crit expectation, skill cycles, ordering rules), straight from the datamine.

## How the model works (short)

- Per-slot DPS = `normalDPS + skillDPS`, where skill multipliers come from the actual `LevelRangeValue` tables at your costume level, and cycle time = `recast×(1−CDR) + cast + 0.5s queue`.
- Team level: buffs/debuffs apply as `×(1 + value×uptime)` multipliers to the whole team; crit buffs shift the team crit expectation `1 + critRate×(critDmg−1)`.
- Ordering: **your team shares one HP pool** (the party wipes together — nobody tanks or dies early), so order only decides *skill fire sequence*: enablers score for every nuke to their right (FIFO, 0.5s unique / 2s assist gaps); AoE preferred mid-table in farm modes; biggest nuke late-table in boss mode.
- Tag synergy: +2% per extra member sharing a tag (configurable — the exact per-tag values are condition-driven, so this is labeled as an estimate in-app).

## Files

- `index.html` / `style.css` / `app.js` — the app
- `data.js` — auto-generated dataset (146 costumes, 168 skills, 149 items, 2,302 level-range groups, 2,823 possession effects) from the v2.4.1 datamine; regenerate with `python tools/export_webapp_data.py`
