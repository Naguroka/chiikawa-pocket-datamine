#!/usr/bin/env python3
"""Extract method RVA targets for interesting classes from dump.cs -> targets.json"""
import re, json, os

BASE = r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled"
DUMP = os.path.join(BASE, 'dumps', 'il2cppdumper', 'dump.cs')

PATTERNS = [
    r'HuntCalculator', r'\w*StatusCalculator', r'CookingResourceCalculator', r'CookingStageCalculator',
    r'CookingMenuStatusCalculator', r'CookingFormationCalculator', r'CookingMenuLicenseCalculator',
    r'StudyTimeCalculator', r'LevelRangeValue$', r'LevelRangeValueGroup$', r'DamageValue',
    r'HpValue', r'BigDecimal', r'HuntSimulator', r'HuntProcessor', r'IdleReward\w*',
    r'GachaDraw\w*Calculator\w*', r'\w*DamageRateValue', r'\w*CoolTime\w*Calculator\w*',
]

cls_re = re.compile(r'^// Namespace: (.*)$|^public (?:sealed |static |abstract )?(?:class|struct) (\w+)')
rva_re = re.compile(r'^\s*// RVA: 0x([0-9A-Fa-f]+) Offset: 0x([0-9A-Fa-f]+)')
sig_re = re.compile(r'^\s*(?:public|private|internal|protected|static).* (\w+)\((.*)\)')

targets = []
cur_ns, cur_cls, capture = '', None, False
pend_rva = None
with open(DUMP, encoding='utf-8', errors='replace') as f:
    for line in f:
        line = line.rstrip('\n')
        m = cls_re.match(line)
        if m:
            if m.group(1) is not None:
                cur_ns = m.group(1)
            if m.group(2):
                cur_cls = m.group(2)
                capture = any(re.fullmatch(p, cur_cls) for p in PATTERNS)
            continue
        if not capture:
            continue
        m = rva_re.match(line)
        if m:
            pend_rva = (int(m.group(1), 16), int(m.group(2), 16))
            continue
        m = sig_re.match(line)
        if m and pend_rva and pend_rva[0] > 0:
            targets.append({
                'class': cur_cls, 'ns': cur_ns, 'method': m.group(1),
                'args': m.group(2)[:120], 'rva': pend_rva[0], 'offset': pend_rva[1],
            })
            pend_rva = None

out = os.path.join(BASE, 'analysis', 'decompile_targets.json')
json.dump(targets, open(out, 'w'), indent=1)
print(f"{len(targets)} target methods")
from collections import Counter
for c, n in Counter(t['class'] for t in targets).most_common(40):
    print(f"  {c}: {n}")
