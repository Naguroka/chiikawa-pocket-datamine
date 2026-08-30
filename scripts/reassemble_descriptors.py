#!/usr/bin/env python3
"""Reassemble base64 FileDescriptorProto blobs from Il2CppDumper stringliteral.json,
extract proto schemas (field name/number/label/type) for WithNetwork.Master messages."""
import json, re, base64, os

BASE = r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled"
SL = json.load(open(os.path.join(BASE, 'dumps', 'il2cppdumper', 'stringliteral.json')))
B64 = re.compile(r'^[A-Za-z0-9+/=]+$')

# ---- minimal protobuf reader ----
class PB:
    def __init__(self, d): self.d, self.p, self.n = d, 0, len(d)
    def varint(self):
        r = 0; s = 0
        while True:
            b = self.d[self.p]; self.p += 1
            r |= (b & 0x7f) << s
            if not (b & 0x80): return r
            s += 7
    def field(self):
        key = self.varint()
        return key >> 3, key & 7
    def bytes(self, n):
        b = self.d[self.p:self.p+n]; self.p += n; return b
    def skip(self, wt):
        if wt == 0: self.varint()
        elif wt == 1: self.p += 8
        elif wt == 2: self.p += self.varint()
        elif wt == 5: self.p += 4
        else: raise ValueError(f'wt {wt}')
    def eof(self): return self.p >= self.n

def parse_field_desc(d):
    pb = PB(d); f = {}
    while not pb.eof():
        num, wt = pb.field()
        if num == 1 and wt == 2: f['name'] = pb.bytes(pb.varint()).decode('utf8', 'replace')
        elif num == 3 and wt == 0: f['number'] = pb.varint()
        elif num == 4 and wt == 0: f['label'] = pb.varint()
        elif num == 5 and wt == 0: f['type'] = pb.varint()
        elif num == 6 and wt == 2: f['type_name'] = pb.bytes(pb.varint()).decode('utf8', 'replace')
        elif num == 10 and wt == 2: f['json_name'] = pb.bytes(pb.varint()).decode('utf8', 'replace')
        else: pb.skip(wt)
    return f

def parse_msg_desc(d):
    pb = PB(d); m = {'fields': [], 'nested': [], 'enums': []}
    while not pb.eof():
        num, wt = pb.field()
        if num == 1 and wt == 2: m['name'] = pb.bytes(pb.varint()).decode('utf8', 'replace')
        elif num == 2 and wt == 2: m['fields'].append(parse_field_desc(pb.bytes(pb.varint())))
        elif num == 3 and wt == 2: m['nested'].append(parse_msg_desc(pb.bytes(pb.varint())))
        elif num == 4 and wt == 2: m['enums'].append(parse_enum_desc(pb.bytes(pb.varint())))
        else: pb.skip(wt)
    return m

def parse_enum_desc(d):
    pb = PB(d); e = {'values': {}}
    while not pb.eof():
        num, wt = pb.field()
        if num == 1 and wt == 2: e['name'] = pb.bytes(pb.varint()).decode('utf8', 'replace')
        elif num == 2 and wt == 2:
            vd = pb.bytes(pb.varint()); vpb = PB(vd); vn, vv = None, None
            while not vpb.eof():
                n2, wt2 = vpb.field()
                if n2 == 1 and wt2 == 2: vn = vpb.bytes(vpb.varint()).decode('utf8', 'replace')
                elif n2 == 2 and wt2 == 0: vv = vpb.varint()
                else: vpb.skip(wt2)
            if vn is not None: e['values'][vv] = vn
        else: pb.skip(wt)
    return e

def parse_file_desc(d):
    pb = PB(d); fd = {'messages': [], 'enums': [], 'services': []}
    while not pb.eof():
        num, wt = pb.field()
        if num == 1 and wt == 2: fd['name'] = pb.bytes(pb.varint()).decode('utf8', 'replace')
        elif num == 2 and wt == 2: fd['package'] = pb.bytes(pb.varint()).decode('utf8', 'replace')
        elif num == 4 and wt == 2: fd['messages'].append(parse_msg_desc(pb.bytes(pb.varint())))
        elif num == 5 and wt == 2: fd['enums'].append(parse_enum_desc(pb.bytes(pb.varint())))
        else: pb.skip(wt)
    return fd

# ---- reassemble ----
# descriptor base64 fragments are 60 chars wide (C# codegen split); the last
# fragment of each file carries '=' padding (or is short). Other short literals
# ("ToString" etc) are false positives and must be excluded.
cands = [x['value'] for x in SL if B64.match(x.get('value', ''))]
chunks = [c for c in cands if len(c) == 60 or (len(c) >= 4 and c.endswith('='))]
print(f"chunks: {len(chunks)}")
files = []
buf = ''
segs = 0
for c in chunks:
    buf += c
    if c.endswith('='):
        segs += 1
        try:
            raw = base64.b64decode(buf)
        except Exception:
            buf = ''
            continue
        buf = ''
        if len(raw) > 8 and raw[0] == 0x0a and b'.proto' in raw[:200]:
            try:
                fd = parse_file_desc(raw)
                if 'name' in fd:
                    files.append(fd)
            except Exception:
                pass
def measure_file_desc(pb):
    """Walk one FileDescriptorProto, return bytes consumed (None if runs past end)."""
    start = pb.p
    try:
        while not pb.eof():
            num, wt = pb.field()
            pb.skip(wt)
        return pb.p - start
    except Exception:
        return None

print(f"segments: {segs}")
# chain-parse: a segment may contain several concatenated FileDescriptorProtos
buf = ''
seg_raws = []
for c in chunks:
    buf += c
    if c.endswith('='):
        try:
            seg_raws.append(base64.b64decode(buf))
        except Exception:
            pass
        buf = ''
for raw in seg_raws:
    off = 0
    while off < len(raw) - 8:
        if raw[off] != 0x0a:
            off += 1
            continue
        try:
            fd = parse_file_desc(raw[off:])
            if 'name' not in fd or '.proto' not in fd.get('name', ''):
                off += 1
                continue
            pb = PB(raw[off:])
            consumed = measure_file_desc(pb)
            files.append(fd)
            if consumed is None or consumed <= 0:
                break
            off += consumed
        except Exception:
            off += 1

print(f"descriptor files: {len(files)}")
out = os.path.join(BASE, 'analysis', 'proto_descriptors.json')
json.dump(files, open(out, 'w'), indent=1)
for fd in files:
    print(f"  {fd.get('name')} pkg={fd.get('package')} msgs={len(fd['messages'])} enums={len(fd['enums'])}")
