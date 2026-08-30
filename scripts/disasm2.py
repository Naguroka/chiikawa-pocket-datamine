#!/usr/bin/env python3
"""Build VA->method-name map from script.json, then disassemble functions with call annotation.
Usage: disasm2.py <file_offset_hex> [max_bytes_hex]"""
import sys, re, struct, os, pickle
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN

BASE = r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled"
SO = os.path.join(BASE, 'il2cpp', 'libil2cpp.so')
MAP = os.path.join(BASE, 'dumps', 'namemap.pkl')

def build_map():
    m = {}
    addr, name = None, None
    are = re.compile(r'"Address": (\d+)')
    nre = re.compile(r'"Name": "([^"]+)"')
    with open(os.path.join(BASE, 'dumps', 'il2cppdumper', 'script.json'), encoding='utf8') as f:
        for line in f:
            if addr is None:
                g = are.search(line)
                if g: addr = int(g.group(1))
            if name is None:
                g = nre.search(line)
                if g: name = g.group(1)
            if addr is not None and name is not None:
                m[addr] = name
                addr, name = None, None
    pickle.dump(m, open(MAP, 'wb'))
    return m

if os.path.exists(MAP):
    NAMES = pickle.load(open(MAP, 'rb'))
else:
    print("building name map (one-off)...", file=sys.stderr)
    NAMES = build_map()
    print(f"{len(NAMES)} methods", file=sys.stderr)

def disasm(off, max_bytes=0x400):
    with open(SO, 'rb') as f:
        f.seek(off)
        code = f.read(max_bytes)
    md = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)
    md.detail = False
    va = off + 0x4000
    count = 0
    for ins in md.disasm(code, va):
        extra = ''
        if ins.mnemonic in ('bl', 'b', 'blraa', 'blr'):
            g = re.match(r'#0x([0-9a-f]+)', ins.op_str)
            if g:
                tgt = int(g.group(1), 16)
                nm = NAMES.get(tgt)
                if nm: extra = f'   ; {nm}'
        print(f"0x{ins.address:x}: {ins.mnemonic:8s} {ins.op_str}{extra}")
        count += 1
        if ins.mnemonic == 'ret' and count > 1:
            break

if __name__ == '__main__':
    off = int(sys.argv[1], 16)
    maxb = int(sys.argv[2], 16) if len(sys.argv) > 2 else 0x400
    disasm(off, maxb)
