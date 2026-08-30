#!/usr/bin/env python3
"""Generate data-digest markdown sections for the Chiikawa Pocket datamine report."""
import json, os, io, sys
from collections import defaultdict, Counter

BASE = r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled"
MD = os.path.join(BASE, 'analysis', 'masterdata')
OUT = os.path.join(BASE, 'analysis')

def load(n):
    return json.load(open(os.path.join(MD, n + '.json'), encoding='utf-8'))

w = io.StringIO()

# ---------- 1. Table inventory ----------
files = sorted(f[:-5] for f in os.listdir(MD) if f.endswith('.json'))
w.write("## Master Data Table Inventory (236 tables)\n\n")
w.write("| Table | Rows | | Table | Rows |\n|---|---|---|---|---|\n")
rows = {f: len(load(f)) for f in files}
half = (len(files) + 1) // 2
for i in range(half):
    a = files[i]
    b = files[i + half] if i + half < len(files) else None
    w.write(f"| {a} | {rows[a]} | | {b or ''} | {rows.get(b,'') if b else ''} |\n")
w.write("\n")

# ---------- 2. Config constants ----------
cfg = load('Config')
w.write("## Global Config Constants (153)\n\nJapanese label = in-game label. Value is string-typed (number).\n\n")
w.write("| ID | Label (JP) | Value |\n|---|---|---|\n")
for c in cfg:
    w.write(f"| {c['id']} | {c['label']} | {c['value']} |\n")
w.write("\n")

# ---------- 3. Experience curves ----------
exp = load('Experience')
groups = defaultdict(list)
for e in exp:
    groups[e['groupId']].append((e['level'], int(e['accumulativeExperience'])))
w.write("## Experience Tables (60 groups)\n\n")
w.write("| Group | Levels | Total EXP at max | First steps (per-level cost) |\n|---|---|---|---|\n")
for g in sorted(groups):
    rs = sorted(groups[g])
    diffs = [rs[i+1][1]-rs[i][1] for i in range(min(5, len(rs)-1))]
    w.write(f"| {g} | 1-{rs[-1][0]} | {rs[-1][1]} | {diffs} |\n")
w.write("\n")

# ---------- 4. Skills ----------
skills = load('HuntSkill'); effects = load('HuntSkillEffect'); lrv = load('LevelRangeValue')
lrvbyid = {r['id']: r for r in lrv}; effbyid = {e['id']: e for e in effects}
w.write("## Hunt Skills (168) with resolved level scaling\n\n")
w.write("Values are Permil (=value/1000) unless noted. Multiple = damage multiplier on attack; AddPercent = additive to status.\n\n")
w.write("| Skill | Rarity | Recast ms | Effect | Target | Calc | Buff s | L1 value | L100 value |\n|---|---|---|---|---|---|---|---|---|\n")
for s in skills:
    for eid in s['skillEffectIds']:
        e = effbyid.get(eid)
        if not e: continue
        lv = lrvbyid.get(e['effectLevelRangeValueId'])
        if lv:
            v0 = int(lv['startValue']) / 1000 if lv['valueType'] == 'Permil' else lv['startValue']
            v1 = int(lv['endValue']) / 1000 if lv['valueType'] == 'Permil' else lv['endValue']
        else:
            v0 = v1 = '?'
        w.write(f"| {s['id']} | {s['rarity']} | {s['recastTime']} | {e['skillEffectType']} | {e['targetType']}/{e['targetRangeType']} | {e['calculationType']} | {e['buffEffectTime']} | {v0} | {v1} |\n")
w.write("\n")

# ---------- 5. Status enhance ----------
se = load('StatusEnhance'); ser = load('StatusEnhanceCostRange')
w.write("## Status Enhancement tracks\n\n")
w.write("| ID | Status | MaxLv | ConsumeId | CostRangeGroup | Tier |\n|---|---|---|---|---|---|\n")
for s in se:
    w.write(f"| {s['id']} | {s['statusType']} | {s['maxLevel']} | {s['consumeId']} | {s['statusEnhanceCostRangeGroupId']} | {s['tier']} |\n")
w.write("\n### StatusEnhanceCostRange (cost coefficient by level band)\n\n")
w.write("| Group | Levels | Coefficient |\n|---|---|---|\n")
for r in sorted(ser, key=lambda x: (x['groupId'], x['startLevel'])):
    w.write(f"| {r['groupId']} | {r['startLevel']}-{r['endLevel']} | {r['coefficient']} |\n")
w.write("\n")

# ---------- 6. Idle economy ----------
w.write("## Idle reward system\n\n")
g = load('IdleRewardGroup')[0]
b = load('IdleBonusReward')[0]
w.write(f"- Max idle accrual: **{g['maxIdleMinutes']} min ({g['maxIdleMinutes']//60}h)**; reward tick every {g['receiveDelayMinutes']} min; bonus delay {g['bonusReceiveDelayMinutes']} min\n")
w.write(f"- Ad bonus: {b['idleRewardMinutes']} idle-minutes per watch, {b['limitPerDay']}x/day, resets {b['limitResetHourUtc']}:00 UTC\n")
st = load('HuntStage')
w.write(f"- Stages: {len(st)}; baseIdleGoldAmountPerMinute grows per stage (e.g. stage 10101 = {st[0]['baseIdleGoldAmountPerMinute']})\n\n")

open(os.path.join(OUT, 'report_data_digests.md'), 'w', encoding='utf-8').write(w.getvalue())
print("written", os.path.join(OUT, 'report_data_digests.md'), len(w.getvalue()), "chars")
