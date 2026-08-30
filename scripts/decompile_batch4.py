#!/usr/bin/env python3
"""Batch 3: team/formation mechanics decompile."""
import os, json

os.environ.setdefault("GHIDRA_INSTALL_DIR", r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled\tools\ghidra_12.1.3_PUBLIC")
os.environ.setdefault("JAVA_HOME", r"C:\Program Files\Java\jdk-25.0.2")
os.add_dll_directory(r"C:\Program Files\Java\jdk-25.0.2\bin")

BASE = r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled"
SO = BASE + r"\il2cpp\libil2cpp.so"
NAMES = BASE + r"\tools\names_relevant.json"
OUT = BASE + r"\analysis\formulas_decompiled_batch4.md"

FUNCS = [
    (0x46D15A0, "EncountState.SkillEnqueue"),
    (0x46D1CEC, "EncountState.UpdateSkillQueue"),
    (0x46D2478, "EncountState.UpdateSkillFire"),
    (0x46D1750, "EncountState.UpdateSkill"),
    (0x46D1434, "EncountState.AttackPhase"),
    (0x916A21C, "HuntDataStore.UpdateTotalPower"),
    (0x916C494, "HuntDataStore.CalculateHpTotalPower"),
    (0x916C3FC, "HuntDataStore.CalculateCostumeTotalPower"),
    (0x916C588, "HuntDataStore.CalculateNormalAttackTotalPower"),
    (0x916C87C, "HuntDataStore.CalculateSkillTotalPower"),
    (0x46ED4E8, "SkillQueue.Enqueue"),
    (0x46ED448, "SkillQueue..ctor"),
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
        out.write("# Decompiled functions — batch 3 (skill queue + team power)\n\n")
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
