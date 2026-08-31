# Chiikawa Pocket — Team Setup, With the Actual Math

*Every rule below comes from the game's own code (v2.4.1), cross-checked against live play on a real account. For how stats and damage work overall, see `MECHANICS.md`.*

> **Correction note (important):** an earlier version of this guide claimed that front units die one-by-one and act as meat shields. **That was wrong**, and thank-you to the reader who reported it. Re-verification against both the code and live battles proved: **your whole team shares ONE HP pool and dies together.** The corrected mechanics — and what order *actually* optimizes — are below.

---

## 1. What a "team" actually is

Your hunting team = **6 costume slots** arranged left→right in the formation editor. Each slot is "a character wearing a costume", and the costume is what matters: it supplies

- a **unique skill** (the big damage button that auto-fires),
- an **attack-rate multiplier** (scales with costume level, via its own level-scaling group),
- an **attack-speed multiplier**,
- a **skill coefficient** (scales the costume's unique skill),
- **tags** (synergy categories — see §6),
- its own possession/equipment effects.

Two things most people get wrong:

1. **All 6 units share the same account-wide stats.** Attack, HP, crit rate, boss damage, etc. are computed once (status-enhance levels + every collection/possession bonus) and used by *every* unit. A "stronger slot" isn't a unit with better stats — it's a unit whose **costume has a better skill and costume multipliers**.
2. **All 6 units share one HP pool.** There is one team HP bar. (Details in §3.1 — this changes what ordering is *for*.)

Equipment (weapon/armor), treasures, assist skills, and keyholders slot in around this, and **everything you own gives its possession bonus whether or not it's in any team** — account power, unaffected by ordering.

## 2. The math of a unit in battle

Each unit's per-hit damage is:

```
UnitDamage = SharedAttack × CostumeAttackRate × HitMultiplier × Boss/MobRate × debuff-amps [× crit]
```

- `SharedAttack` — your account attack (same for all 6 units)
- `CostumeAttackRate` — **the only per-slot attack multiplier** (costume level scaling)
- `HitMultiplier` — normal-attack rate (shared) or the costume's skill multiplier × its skill coefficient
- crit — shared crit rate × shared crit damage

So per slot, DPS differs by exactly two things: **(costume attack rate) × (its skill's multiplier and uptime)**. Attack-speed multipliers shift how often that unit swings.

## 3. What changing the ORDER changes (verified in code)

### 3.1 What order does NOT change: survival — your team shares ONE HP pool

This is the correction, and it's the most misunderstood mechanic in the game:

- **Your party has a single, shared HP pool.** All friend units are built from one shared `FriendStatusData` — one account-level status block, and every unit's `Hp` points at the *same* `HpValue` instance. When any unit is hit, the damage drains that one pool.
- **When the pool hits 0, the whole party is eliminated at once.** There is no "slot 1 dies, then slot 2". The formation icons do **not** grey out one by one — the wipe is all-or-nothing.
- Single-target enemy attacks do land on your **lead unit** (the leftmost enabled slot) — but that only decides *who plays the getting-hit animation*. The damage goes into the same shared pool, so **a "meat shield" slot protects nobody.**
- **Enemies are the opposite:** each enemy unit has its own HP (from `HuntEnemyStatus` rows) and dies individually, front-to-back. That's why *your* single-target attacks visibly drop enemies one at a time while *your* team survives or wipes as a unit.
- HP recovery (base 6.3 HP/s, +0.7/level) heals the shared pool once per second.

> Battle is lost when: **shared team HP reaches 0**, or the **30-second boss timer** expires. Not before, not partially.

### 3.2 Order decides skill fire order (the real optimization)

- Each skill becomes ready on its own cooldown, then enters a **first-in-first-out queue**.
- Two separate queues: **unique skills fire one every 0.5 s**, **assist skills one every 2 s** (queue capacity 32).
- When several skills are ready in the same moment, they're enqueued **in formation order** — the leftmost unit's skill fires first.
- While a skill is mid-cast (cast time ~3 s) the queue keeps ticking, so a backed-up queue delays everything behind it.

> This is what formation order is actually *for*: **sequencing.** Buffs/debuffs must sit left of the nuke they enable, and your cast order is your fight timeline.

### 3.3 What order does NOT change (the full list)

- Survival — shared HP pool, everyone lives and dies together (§3.1).
- Stats, possession bonuses, collection power — identical in any arrangement.
- AoE hits all enemies regardless of position; and since survival is shared, there's no "safe back row" either.

## 4. So what goes where? Ordering by fire sequence

Since nobody tanks and nobody dies early, the only question is: **in what order should skills fire?**

### The default rule

> **Enablers first (left), damage dealers after (right). Put your long-cooldown nuke where it fires exactly when the buffs are already up — and where it's ready again inside the 30-second boss window.**

1. **Slot 1 — your best party buffer or defence-down debuffer.** It fires first (FIFO), so crit/attack buffs and enemy shreds are active before anyone else's first nuke lands. Its own damage being low doesn't matter — its uptime multiplies everyone else's.
2. **Slots 2–3 — second enabler + AoE wave-clear.** A second buff/debuff, then your AoE skill (e.g. the 56×→650× Super Rare "hit all enemies"): it deletes waves so you reach bosses faster (more boss attempts per minute). Position only affects its *cast timing*, not its damage — mid-formation casts early enough to matter.
3. **Slots 4–6 — nukes, biggest last.** Single-target burst for the boss window. "Biggest last" isn't about survival — it's because the boss arrives *last*, and you want your hardest hit's cycle aligned so it fires (ideally twice) inside the 30 s window while all the earlier-placed buffs are active.

### Fine-tuning rules

- **Buff-before-nuke:** a crit-rate or attack buff must be **left of** the nuke it feeds, or the first nuke fires unbuffed. Keep buff→carry pairs adjacent, buff on the left.
- **Recast-reset skills:** place them so the reset lands while your long-cooldown nuke is recharging — left of or equal to the nuke, never after it in queue behind a full cast cycle.
- **Boss walls (30 s check):** move your single-target burst later and your buffs/debuffers earlier — the goal is maximum damage *inside the window*, not surviving it. If the pool empties first, *that's* when you go farm levels/collection (see `OPTIMAL_PLAY.md`).
- **Waves slowing you down:** move the AoE earlier (left). If waves aren't the problem, move it later and put a second enabler in its place.
- **Assists:** assist skills run on their own 2-second queue and don't collide with unique-skill ordering — pure value slots, order irrelevant except first-cast priority.

## 5. The team-power number ("CP") — what it is and isn't

The big number on your team (e.g. `961n` on a real account) is computed as:

```
CP ≈ HP-share × 0.6 + Σ per-costume ( NormalAttackPower×500 + SkillPower×500 )
```

(coefficients from `HuntStatusConfig`: HP power ×0.6, normal-attack power ×500, skill power ×500; skill power includes crit stats). It's a **rough DPS+HP estimate** — useful as a progress bar, misleading as a build target. It can't see skill uptime, buff timing, tag synergies, or ordering. **Never pick a costume "because it raises CP" over one with a better actual skill.**

## 6. Tags: the hidden formation bonus

Costumes carry **tags** (e.g. weapon types, themes), and the game counts how many formation costumes share each tag (`CalculateTagCount` over the formation). Several skills/effects scale off these counts, so:

- **Build around 1–2 tag families** your best costumes share, rather than six unrelated tags.
- Check your main carry's tags first, then fill support slots with tag-matching costumes — a slightly weaker costume that completes a tag bonus usually out-damages a stronger off-tag one, because tag bonuses multiply the same shared stats.

## 7. Worked example (using real datamined numbers)

Six costumes: a Hyper Rare single-target nuke (120×→1,308× skill), a Super Rare AoE (56×→650×), a crit-rate buffer (+10→40% crit for 5 s), a defence-down debuffer, a boss-damage buffer, and a low-rarity costume with a weak skill.

Optimal order and why (sequence logic, not survival logic):

| Slot | Costume | Reason |
|---|---|---|
| 1 | defence-down debuffer | fires first — everything after it hits a shredded enemy |
| 2 | crit-rate buffer | +crit active before any nuke (FIFO order) |
| 3 | boss-damage buffer | all enablers up before the damage skills cycle |
| 4 | Super Rare AoE | clears waves mid-timeline; position only affects cast timing |
| 5 | weak low-rarity | filler; its position changes nothing (shared HP, no tanking) |
| 6 | Hyper Rare nuke | its cycle lands inside the 30 s boss window with every buff live |

Expected damage check: with the crit buff at +40% and base crit damage 1.2×, the carry's expected multiplier is `1 + 0.4×0.2 = 1.08×`… but if crit damage is leveled to 2.2×, it becomes `1 + 0.4×1.2 = 1.48×` — **the same buff is worth 5× more because crit damage was leveled**.

Note what changed vs. naive advice: slots 1–3 aren't "dying for" slot 6 — nobody dies for anybody. They *fire for* slot 6.

## 8. TL;DR

1. Six slots share your account stats **and one HP pool** — your team wipes together, so nobody can tank.
2. Order = **skill fire sequence** (0.5 s unique / 2 s assist FIFO gaps): enablers left, nukes right.
3. AoE for wave speed in the middle; biggest nuke aligned to the 30-second boss window.
4. Your single-target attacks kill *enemies* front-to-back (they have individual HP — you don't).
5. CP is a rough estimate, not a build guide; tags are the hidden multiplier — match them.
