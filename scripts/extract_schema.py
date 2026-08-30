#!/usr/bin/env python3
"""Extract message/enum schemas from Il2CppDumper dump.cs for Chiikawa Pocket master data."""
import re, json, sys

DUMP = r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled\dumps\il2cppdumper\dump.cs"
OUT  = r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled\analysis\schema.json"

NS_RE   = re.compile(r'^// Namespace: (.*)$')
CLS_RE  = re.compile(r'^public (?:sealed )?class (\w+) : IMessage<\1>')
ENUM_RE = re.compile(r'^public enum (\w+)')
FIELD_RE= re.compile(r'^\s*private (?!static)(?:readonly )?([\w.<>,\[\] ?]+) (\w+)_;')
CONST_RE= re.compile(r'^\s*public const (\w+) (\w+) = (-?\d+);')

enums = {}      # name -> {value: name}
classes = {}    # ns.Name -> [ {name, type, repeated} ]

cur_ns = None
i = 0
lines = open(DUMP, encoding='utf-8', errors='replace').read().splitlines()
n = len(lines)
while i < n:
    line = lines[i].rstrip('\n')
    m = NS_RE.match(line)
    if m:
        cur_ns = m.group(1).strip()
        i += 1
        continue
    m = ENUM_RE.match(line)
    if m:
        name = m.group(1)
        vals = {}
        i += 1
        while i < n and not lines[i].startswith('}'):
            cm = CONST_RE.match(lines[i])
            if cm:
                vals[int(cm.group(3))] = cm.group(2)
            i += 1
        enums[name] = vals
        i += 1
        continue
    m = CLS_RE.match(line)
    if m:
        cname = m.group(1)
        fields = []
        i += 1
        # scan until end of class; fields only appear before "// Methods"
        depth = 1
        while i < n and depth > 0:
            l = lines[i]
            if l.startswith('}'):
                depth -= 1
                if depth == 0:
                    break
                i += 1
                continue
            if l.strip() == '// Methods':
                # skip to end of class
                while i < n and depth > 0:
                    if lines[i].startswith('}'):
                        depth -= 1
                    i += 1
                break
            fm = FIELD_RE.match(l)
            if fm:
                ftype = fm.group(1).strip()
                fname = fm.group(2)
                rep = False
                rm = re.match(r'^RepeatedField<([\w.]+)>$', ftype)
                if rm:
                    rep = True
                    ftype = rm.group(1)
                fields.append({'name': fname, 'type': ftype, 'repeated': rep})
            i += 1
        fq = f"{cur_ns}.{cname}" if cur_ns else cname
        # keep the one in WithNetwork.Master if duplicates
        if fq not in classes:
            classes[fq] = fields
        i += 1
        continue
    i += 1

json.dump({'enums': enums, 'classes': classes}, open(OUT, 'w'), indent=0)
print(f"enums={len(enums)} classes={len(classes)}")
master = [k for k in classes if k.startswith('WithNetwork.Master.')]
print(f"WithNetwork.Master classes={len(master)}")
