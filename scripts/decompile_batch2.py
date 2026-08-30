#!/usr/bin/env python3
"""Batch 2: decompile specific functions by explicit file offsets."""
import os, json

os.environ.setdefault("GHIDRA_INSTALL_DIR", r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled\tools\ghidra_12.1.3_PUBLIC")
os.environ.setdefault("JAVA_HOME", r"C:\Program Files\Java\jdk-25.0.2")
os.add_dll_directory(r"C:\Program Files\Java\jdk-25.0.2\bin")

BASE = r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled"
SO = BASE + r"\il2cpp\libil2cpp.so"
NAMES = BASE + r"\tools\names_relevant.json"
OUT = BASE + r"\analysis\formulas_decompiled_batch2.md"

FUNCS = [
    (0x7B48FE0, "BaseStatusCalculatorCore<HuntBaseStatus>.CalculateValue"),
    (0x7B49EF0, "BaseStatusCalculatorCore<HuntCharacterSkillEffectRateBaseStatus>.CalculateValue"),
    (0x7B4AE00, "BaseStatusCalculatorCore<HuntCostumeAttackRateBaseStatus>.CalculateValue"),
    (0x46E6CC0, "UnitStatusBase.AddStatusEffect"),
    (0x46E4CE4, "StatusEffects.AddStatusEffect"),
    (0x46DF88C, "Unit.UpdateAttackIntervalFrame"),
    (0x46E5950, "Unit.UpdateAttackTimer"),
    (0x46E0B7C, "Skill.UpdateSkill"),
    (0x46E1350, "Skill.ShortenRecastTimer"),
    (0x46E02C8, "Skill..ctor"),
    (0x46E127C, "Skill.Fire"),
    (0x46DD6D8, "FriendStatus..ctor"),
    (0x46E63EC, "UnitStatusBase.Damage"),
    (0x4760168, "IdleRewardUtility.CalculateIdleGoldAmountPerMinute"),
    (0x9178364, "IdleRewardDataStore.CalculateIdleMinutes"),
    (0x46C6E64, "HuntCalculator.GetMoveDistance"),
    (0x46C6BDC, "HuntCalculator.CalculateRecastRate"),
    (0x46C6E74, "HuntCalculator.IsDead"),
    (0x9164CBC, "CriticalDamageValue.GetCalculateValue"),
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
        out.write("# Decompiled functions — batch 2 (mechanics deep dive)\n\n")
        for off, name in FUNCS:
            addr = base.add(off + 0x4000)  # file offset -> VA
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
