#!/usr/bin/env python3
"""Disassemble an ARM64 function from libil2cpp.so given its file offset (from dump.cs Offset field)."""
import sys, struct
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN

SO = r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled\il2cpp\libil2cpp.so"

def read_elf_bounds():
    with open(SO, 'rb') as f:
        eh = f.read(64)
        assert eh[:4] == b'\x7fELF'
        phoff = struct.unpack_from('<Q', eh, 32)[0]
        phentsize = struct.unpack_from('<H', eh, 54)[0]
        phnum = struct.unpack_from('<H', eh, 56)[0]
        f.seek(phoff)
        segs = []
        for i in range(phnum):
            ph = f.read(phentsize)
            p_type = struct.unpack_from('<I', ph, 0)[0]
            if p_type == 1:  # PT_LOAD
                off, va, _, filesz, _ = struct.unpack_from('<QQQQQ', ph, 8)
                segs.append((off, va, filesz))
        return segs

SEGS = read_elf_bounds()

def rva_to_off(rva):
    for off, va, filesz in SEGS:
        if va <= rva < va + filesz:
            return off + (rva - va)
    return None

def disasm(start, max_bytes=0x800, end_rva=None):
    # start is a FILE OFFSET (dump.cs "Offset" field)
    off = start
    with open(SO, 'rb') as f:
        f.seek(off)
        code = f.read(max_bytes)
    md = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)
    # vaddr = fileoff + 0x4000 in this build (verify via dump.cs RVA-Offset delta)
    va = off + 0x4000
    count = 0
    for ins in md.disasm(code, va):
        print(f"0x{ins.address:x}: {ins.mnemonic:10s} {ins.op_str}")
        count += 1
        if ins.mnemonic == 'ret' and count > 1:
            break
        if end_rva and ins.address >= end_rva:
            break

if __name__ == '__main__':
    start = int(sys.argv[1], 16)
    maxb = int(sys.argv[2], 16) if len(sys.argv) > 2 else 0x800
    disasm(start, maxb)
