#!/usr/bin/env python3
"""Parse Chiikawa Pocket MasterData .bytes files (custom BinaryWriter-style serialization) to JSON."""
import json, os, struct, sys, glob, itertools

BASE = r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled"
SCHEMA = json.load(open(os.path.join(BASE, 'analysis', 'schema.json')))
CLASSES = SCHEMA['classes']
ENUMS = {name: {int(k): v for k, v in vals.items()} for name, vals in SCHEMA['enums'].items()}
MASTER_NS = 'WithNetwork.Master.'
OUTDIR = os.path.join(BASE, 'analysis', 'masterdata')
os.makedirs(OUTDIR, exist_ok=True)

PRIMS = {'string', 'int', 'long', 'uint', 'ulong', 'bool', 'float', 'double', 'short', 'ushort', 'byte', 'sbyte'}

# Record classes (true deserialization targets) sometimes differ from the
# network DTO classes: Rect = 4 floats, Vector2 = 2 floats raw.
OVERRIDES = {
    ('Costume', 'eventZone'): 'rect', ('Costume', 'bodyZone'): 'rect',
    ('HomeCharacter', 'eventZone'): 'rect', ('HomeCharacter', 'bodyZone'): 'rect',
    ('HomeCharacterGroup', 'eventZone'): 'rect', ('HomeCharacterGroup', 'bodyZone'): 'rect',
    ('HomeItem', 'eventZone'): 'rect', ('HomeItem', 'bodyZone'): 'rect',
    ('HomeBackgroundArea', 'position'): 'vec2',
}

class Reader:
    __slots__ = ('d', 'p', 'n')
    def __init__(self, data, pos=0):
        self.d, self.p, self.n = data, pos, len(data)
    def varint(self):
        r = 0; s = 0
        d = self.d
        while True:
            b = d[self.p]; self.p += 1
            r |= (b & 0x7f) << s
            if not (b & 0x80):
                return r
            s += 7
    def bytes(self, n):
        b = self.d[self.p:self.p+n]; self.p += n
        return b
    def u8(self):
        b = self.d[self.p]; self.p += 1
        return b
    def f32(self):
        v = struct.unpack_from('<f', self.d, self.p)[0]; self.p += 4; return v
    def f64(self):
        v = struct.unpack_from('<d', self.d, self.p)[0]; self.p += 8; return v
    def i64(self):
        v = struct.unpack_from('<q', self.d, self.p)[0]; self.p += 8; return v
    def u64(self):
        v = struct.unpack_from('<Q', self.d, self.p)[0]; self.p += 8; return v
    def eof(self):
        return self.p >= self.n

def to_i32(v):
    v &= 0xffffffff
    return v - 0x100000000 if v >= 0x80000000 else v

def to_i64(v):
    v &= 0xffffffffffffffff
    return v - 0x10000000000000000 if v >= 0x8000000000000000 else v

def resolve_type(t, cur_ns):
    """returns (kind, extra) where kind in prim/enum/msg"""
    if t in PRIMS:
        return ('prim', t)
    if t in ENUMS:
        return ('enum', t)
    # nested message: try same namespace, then global suffix match
    if cur_ns:
        fq = cur_ns + '.' + t
        if fq in CLASSES:
            return ('msg', fq)
    if t in CLASSES:
        return ('msg', t)
    # well-known protobuf types
    if '.' in t:
        short = t.split('.')[-1]
        if short in CLASSES:
            return ('msg', short)
    return ('unknown', t)

def read_field(r, ftype, cur_ns, enc='v', depth=0):
    kind, extra = resolve_type(ftype, cur_ns)
    if kind == 'prim':
        t = extra
        if t == 'string':
            n = r.varint()
            return r.bytes(n).decode('utf-8', errors='replace')
        if t in ('int', 'short', 'sbyte'):
            if enc == 'f':
                v = struct.unpack_from('<i', r.d, r.p)[0]; r.p += 4; return v
            return to_i32(r.varint())
        if t in ('uint', 'ushort', 'byte'):
            if enc == 'f':
                v = struct.unpack_from('<I', r.d, r.p)[0]; r.p += 4; return v
            return r.varint() & 0xffffffff
        if t == 'long':
            return r.i64() if enc == 'f' else to_i64(r.varint())
        if t == 'ulong':
            return r.u64() if enc == 'f' else r.varint()
        if t == 'bool':
            return r.u8() != 0
        if t == 'float':
            return r.f32()
        if t == 'double':
            return r.f64()
    elif kind == 'enum':
        v = to_i32(r.varint())
        name = ENUMS[extra].get(v)
        return name if name is not None else v
    elif kind == 'msg':
        n = r.varint()
        sub = Reader(r.bytes(n))
        return parse_message(sub, extra, depth+1)
    raise ValueError(f"unknown field type {ftype} (ns {cur_ns})")

def parse_message(r, cls_fq, assign=None, depth=0):
    assign = assign or {}
    fields = CLASSES[cls_fq]
    table = cls_fq.rsplit('.', 1)[-1]
    ns = cls_fq.rsplit('.', 1)[0] if '.' in cls_fq else ''
    obj = {}
    for idx, f in enumerate(fields):
        enc = assign.get(idx, 'v')
        ov = OVERRIDES.get((table, f['name']))
        if ov == 'rect':
            obj[f['name']] = [r.f32(), r.f32(), r.f32(), r.f32()]
        elif ov == 'vec2':
            obj[f['name']] = [r.f32(), r.f32()]
        elif f['repeated']:
            cnt = r.varint()
            arr = []
            for _ in range(cnt):
                arr.append(read_field(r, f['type'], ns, 'v', depth))
            obj[f['name']] = arr
        else:
            obj[f['name']] = read_field(r, f['type'], ns, enc, depth)
    return obj

def parse_table(path):
    name = os.path.splitext(os.path.basename(path))[0]
    cls_fq = MASTER_NS + name
    if cls_fq not in CLASSES:
        return None, f"no class for {name}"
    data = open(path, 'rb').read()
    fields = CLASSES[cls_fq]
    rows, err = try_parse(data, cls_fq, fields, {})
    if err is None:
        return rows, None
    # backtracking: numeric fields may be varint or fixed-width
    amb = [i for i, f in enumerate(fields)
           if not f['repeated'] and f['type'] in ('int', 'long', 'uint', 'ulong')]
    if len(amb) <= 22:
        for combo in itertools.product('vf', repeat=len(amb)):
            if all(c == 'v' for c in combo):
                continue
            assign = {amb[i]: combo[i] for i in range(len(amb))}
            rows, err2 = try_parse(data, cls_fq, fields, assign)
            if err2 is None:
                print(f"  [{name}] solved with {assign}")
                return rows, None
    return None, err

def try_parse(data, cls_fq, fields, assign):
    r = Reader(data)
    rows = []
    try:
        while not r.eof():
            plen = r.varint()
            sub = Reader(r.bytes(plen))
            rows.append(parse_message(sub, cls_fq, assign))
            if not sub.eof():
                return None, f"row {len(rows)} under-read ({sub.n-sub.p} left)"
    except Exception as e:
        return None, f"parse error at row {len(rows)} pos {r.p}/{r.n}: {e}"
    return rows, None

def main():
    only = sys.argv[1:] if len(sys.argv) > 1 else None
    ok, fail = 0, []
    for path in sorted(glob.glob(os.path.join(BASE, 'dumps', 'MasterData', '*.bytes'))):
        name = os.path.splitext(os.path.basename(path))[0]
        if only and name not in only:
            continue
        rows, err = parse_table(path)
        if err:
            fail.append(err)
            continue
        json.dump(rows, open(os.path.join(OUTDIR, name + '.json'), 'w', encoding='utf-8'),
                  ensure_ascii=False, indent=1)
        ok += 1
    print(f"parsed OK: {ok}")
    for e in fail:
        print("FAIL:", e)
    print(f"failed: {len(fail)}")

if __name__ == '__main__':
    main()
