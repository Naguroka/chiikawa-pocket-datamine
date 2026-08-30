#!/usr/bin/env python3
"""Batch 3: team/formation mechanics decompile."""
import os, json

os.environ.setdefault("GHIDRA_INSTALL_DIR", r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled\tools\ghidra_12.1.3_PUBLIC")
os.environ.setdefault("JAVA_HOME", r"C:\Program Files\Java\jdk-25.0.2")
os.add_dll_directory(r"C:\Program Files\Java\jdk-25.0.2\bin")

BASE = r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled"
SO = BASE + r"\il2cpp\libil2cpp.so"
NAMES = BASE + r"\tools\names_relevant.json"
OUT = BASE + r"\analysis\formulas_decompiled_batch3.md"

FUNCS = [
    (0x916A194, "HuntDataStore.GetTotalPower"),
    (0x46DF7A4, "Party.AttackTargetUnit"),
    (0x46CA0F0, "Party.GetLeadUnit"),
    (0x46DB584, "Party.TryGetAliveLeadUnit"),
    (0x46DF2D8, "Party.get_SortedReadOnlyUnits"),
    (0x46DD1A4, "FriendParty.UpdateArrangement"),
    (0x46D5A5C, "FriendParty..ctor"),
    (0x46DD450, "FriendParty.SortedUnitsBySkillEffectType"),
    (0x466E930, "AssistSkillController.OnSkillFire"),
    (0x4675054, "BuffEffectController.OnSkillFire"),
    (0x46D9E54, "Party.Move"),
    (0x46C6E64, "HuntCalculator.GetMoveDistance"),
]

import pyghidra
pyghidra.start(verbose=False)
from ghidra.app.decompiler import DecompInterface
from ghidra.program.model.symbol import SourceType
from ghidra.util.task import TaskMonitor

names = json.load(open(NAMES))

with pyghidra.open_program(SO, analyze=False) as api:
    program = api.getCurrentProgram()
    fm = program.getFunctionManager()
    base = program.getImageBase()
    tx = program.startTransaction("labels")
    n = 0
    try:
        for va_s, name in names.items():
            try:
                api.createLabel(base.add(int(va_s)), name.replace(" ", "-"), True, SourceType.USER_DEFINED)
                n += 1
            except Exception:
                pass
    finally:
        program.endTransaction(tx, True)
    print(f"labels: {n}", flush=True)

    decomp = DecompInterface()
    decomp.openProgram(program)
    mon = TaskMonitor.DUMMY
    with open(OUT, "w", encoding="utf-8") as out:
        out.write("# Decompiled functions — batch 3 (team/formation mechanics)\n\n")
        for off, name in FUNCS:
            addr = base.add(off + 0x4000)
            func = fm.getFunctionAt(addr)
            if func is None:
                tx = program.startTransaction("mk")
                try:
                    func = api.createFunction(addr, None)
                finally:
                    program.endTransaction(tx, True)
            if func is None:
                out.write("## %s — no function at 0x%x\n\n" % (name, off))
                continue
            try:
                res = decomp.decompileFunction(func, 60, mon)
                if res.decompileCompleted():
                    out.write("## %s (off 0x%x)\n\n```c\n%s\n```\n\n" % (name, off, res.getDecompiledFunction().getC()))
                else:
                    out.write("## %s — failed: %s\n\n" % (name, res.getErrorMessage()))
            except Exception as e:
                out.write("## %s — exception %s\n\n" % (name, str(e)))
    decomp.dispose()
print("done ->", OUT, flush=True)
