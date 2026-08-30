# Chiikawa Pocket — Team Setup, With the Actual Math

*Every rule below comes from the game's own code (v2.4.1). Where the screenshots of a real account help, they're referenced. For how stats and damage work overall, see `MECHANICS.md`.*

---

## 1. What a "team" actually is

Your hunting team = **6 costume slots** arranged left→right in the formation editor. Each slot is "a character wearing a costume", and the costume is what matters: it supplies

- a **unique skill** (the big damage button that auto-fires),
- an **attack-rate multiplier** (scales with costume level, via its own level-scaling group),
- an **attack-speed multiplier**,
- a **skill coefficient** (scales the costume's unique skill),
- **tags** (synergy categories — see §6),
- its own possession/equipment effects.

Here's the part most people get wrong: **all 6 units share the same account-wide stats.** Your Attack, HP, crit rate, boss damage, etc. are computed once (status-enhance levels + every collection/possession bonus) and used by *every* unit. So a "stronger slot" is not a unit with better stats — it's a unit whose **costume has a better skill and better costume multipliers**. Team building = choosing 6 costumes and their **order**; stats come from your whole account.

Equipment (weapon/armor), treasures, assist skills, and keyholders slot in around this: weapons/armor/assist gear equip onto the formation, treasures and keyholders have their own formation screens, and **everything you own also gives its possession bonus whether or not it's in any team** — that's account power, unaffected by ordering.

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

### 3.1 Order decides who tanks — and who dies first

- Single-target enemy attacks (normal attacks and "Single" skills) **always hit the current lead unit** — the leftmost *alive* slot.
- When the lead dies, the next slot becomes lead. Units keep dying left→right.
- The battle is lost when all 6 are dead (or the boss timer runs out).

> You can literally see this on the battle screen: the leftmost formation icons grey out one by one, and the current lead is highlighted. Front slots are death slots.

### 3.2 Order decides skill fire order

- Each skill becomes ready on its own cooldown, then enters a **first-in-first-out queue**.
- Two separate queues: **unique skills fire one every 0.5 s**, **assist skills one every 2 s** (queue capacity 32).
- When several skills are ready in the same moment, they're enqueued **in formation order** — the leftmost unit's skill fires first.
- While a skill is mid-cast (cast time ~3 s) the queue keeps ticking, so a backed-up queue delays everything behind it.

> Ordering consequence: a buff you want active *before* your nuke goes off must sit **to the left of** the nuke. A slow-cooldown nuke placed late still fires late.

### 3.3 What order does NOT change

- Stats, possession bonuses, collection power — identical regardless of arrangement.
- AoE skills hit all enemies regardless of position; there's no "back row safety" against them.
- Movement/positions are cosmetic columns following the same order (dead units simply stop appearing).

### 3.4 The one formula to remember for ordering

```
Survival value of a slot ≈ (how much DPS that costume still has left to give) × (how long it stays alive)
```

Left slots die first, so **DPS value flows to the right**: the further right a costume is, the more total damage it will deal over the fight.

## 4. So what goes where? The optimal arrangement

### The default rule (works 95% of the time)

> **Slot 1 (leftmost): weakest/most expendable costume → Slot 6 (rightmost): your main damage carry.**

Because single-target fire always lands on the leftmost living unit, the left side is the meat shield and the right side is the artillery. Within that skeleton:

1. **Slot 1–2 — sacrifices.** Your least-valuable costumes. They absorb all single-target damage so your carries never get touched. If a unit's skill is weak or purely supportive (e.g. a small buff), it belongs here.
2. **Slot 3–4 — support + wave clear.** Party-wide **buffs** (crit rate, attack up) and **debuffs** (defence down on enemies) go here — early enough to fire before the carry's nuke (queue order), late enough to survive to cast them. An **AoE skill** (e.g. the 56×→650× Super Rare "hit all enemies") lives here to delete waves fast — faster waves = more boss attempts per minute.
3. **Slot 5–6 — boss killers.** Your highest-skill-multiplier costume (Hyper/Ultra Rare nukes, 120×→1,300×+) and your single-target burst. They survive the longest, so they cast the most times — including during the **30-second boss window**, which is the only check that matters.

### Why not the reverse (carry first)?

Putting the carry on the left feels aggressive but is strictly worse in any fight where units die: the carry eats every single-target hit and dies first, losing all its future casts. The only scenario carry-first wins is when nothing ever dies (massive overkill farming) — and even then it merely ties, because wave clear speed is set by the AoE, not by who's first.

### Fine-tuning rules

- **Buff-before-nuke:** a crit-rate or attack buff must be **left of** the nuke it feeds, or it fires after and the first nuke is unbuffed. (Buff → carry pairs: keep them adjacent, buff on the left.)
- **Recast-reset skills:** place them so the reset lands while your long-cooldown nuke is recharging — i.e. reset **left of or equal to** the nuke, never after it in queue behind a full cast cycle.
- **Boss walls (you die at the boss):** shift everything one slot right (more survival) and make slot 6 your anti-boss unit (Boss Damage Rate, single-target nuke). The 30 s limit makes burst > sustain.
- **Waves wipe you before the boss:** move your AoE clearer further right (it must survive to clear) and add a second AoE or a speed-debuff unit left of it.
- **Assists:** assist skills fire on their own 2-second queue and don't collide with unique-skill ordering, so treat assist slots as pure value slots — best assist effects you own, order irrelevant except first-cast priority.

## 5. The team-power number ("CP") — what it is and isn't

The big number on your team (e.g. `961n` on a real account) is computed as:

```
CP ≈ HP-share × 0.6 + Σ per-costume ( NormalAttackPower×500 + SkillPower×500 )
```

(coefficients from `HuntStatusConfig`: HP power ×0.6, normal-attack power ×500, skill power ×500; skill power includes crit stats). It's a **rough DPS+HP estimate** — useful as a progress bar, misleading as a build target. It can't see skill uptime, buff timing, tag synergies, or ordering. **Never pick a costume "because it raises CP" over one with a better actual skill** — the 10× skill-level curve and multipliers in §2 beat CP arithmetic every time.

## 6. Tags: the hidden formation bonus

Costumes carry **tags** (e.g. weapon types, themes), and the game counts how many formation costumes share each tag (`CalculateTagCount` over the formation). Several skills/effects scale off these counts, so:

- **Build around 1–2 tag families** your best costumes share, rather than six unrelated tags.
- Check your main carry's tags first, then fill support slots with tag-matching costumes — a slightly weaker costume that completes a tag bonus usually out-damages a stronger off-tag one, because tag bonuses are multipliers on the same shared stats.

## 7. Worked example (using real datamined numbers)

Say your six costumes are: a Hyper Rare single-target nuke (120×→1,308× skill), a Super Rare AoE (56×→650×), a crit-rate buffer (+10→40% crit for 5 s), a defence-down debuffer, a boss-damage buffer, and a low-rarity costume with a weak skill.

Optimal order and why:

| Slot | Costume | Reason |
|---|---|---|
| 1 | weak low-rarity | pure meat shield; losing it costs nothing |
| 2 | boss-damage buffer | second shield, but its buff still lands before the nuke |
| 3 | defence-down debuffer | shreds enemy defence early so everything after hits harder |
| 4 | crit-rate buffer | +crit must be active **before** the nuke fires (FIFO queue) |
| 5 | Super Rare AoE | survives to clear every wave; feeds faster boss attempts |
| 6 | Hyper Rare nuke | survives longest → most casts, and it's alive for the 30 s boss window |

Expected damage check: with the crit buff active at +40% and base crit damage 1.2×, the carry's expected multiplier is `1 + 0.4×0.2 = 1.08×`… but if you've leveled crit damage to 2.2×, it becomes `1 + 0.4×1.2 = 1.48×` — **the same buff is worth 5× more just because crit damage was leveled**. That's why the crit-damage track pairs with crit buffers on the team.

## 8. TL;DR

1. Six slots share your account stats — costume choice and **order** are the whole decision.
2. Left = shield, right = carry. Single-target hits always strike the leftmost living unit.
3. Skills fire in formation order (0.5 s unique / 2 s assist gaps) — buffs and debuffs left of your nuke.
4. AoE in the middle for wave speed, biggest nuke far right for the 30-second boss check.
5. CP is a rough estimate, not a build guide; tags are the hidden multiplier — match them.
