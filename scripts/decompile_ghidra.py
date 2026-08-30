#!/usr/bin/env python3
"""Decompile Chiikawa Pocket calculator functions via PyGhidra (no full analysis)."""
import os, sys, json

os.environ.setdefault("GHIDRA_INSTALL_DIR", r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled\tools\ghidra_12.1.3_PUBLIC")
os.environ.setdefault("JAVA_HOME", r"C:\Program Files\Java\jdk-25.0.2")
os.add_dll_directory(r"C:\Program Files\Java\jdk-25.0.2\bin")

BASE = r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled"
SO = BASE + r"\il2cpp\libil2cpp.so"
NAMES = BASE + r"\tools\names_relevant.json"
TARGETS = BASE + r"\analysis\decompile_targets.json"
OUT = BASE + r"\analysis\formulas_decompiled.md"

import pyghidra
pyghidra.start(verbose=False)

from ghidra.app.decompiler import DecompInterface
from ghidra.program.model.symbol import SourceType
from ghidra.util.task import TaskMonitor

names = json.load(open(NAMES))
targets = json.load(open(TARGETS))

PRIO_CLASS = {
    "HuntCalculator", "LevelRangeValue", "LevelRangeValueGroup", "DamageValue", "HpValue",
    "HuntStatus", "CookingResourceCalculator", "CookingStageCalculator",
    "CookingMenuStatusCalculator", "CookingFormationCalculator", "CookingMenuLicenseCalculator",
    "StudyTimeCalculator", "CostumeStatusCalculator", "WeaponStatusCalculator",
    "ArmorStatusCalculator", "AssistSkillStatusCalculator", "TreasureStatusCalculator",
    "KeyholderStatusCalculator", "MasteryStatusCalculator", "HomeItemStatusCalculator",
    "BlessingStatusCalculator", "BuffItemStatusCalculator", "ArtBookStatusCalculator",
    "CollectionBookStatusCalculator", "StudyStatusCalculator",
}
PRIO_METHOD = {
    "CalculateNormalAttackDamage", "CalculateSkillDamage", "GetBuffStatus", "GetAttackBuffStatus",
    "DropGoldPerUnit", "GetGameSpeed", "GetMoveDistance", "CalculateRecastRate", "CalculateHpRecover",
    "GetValue", "TryGetValue", "GetRawValue", "LinearBigDecimal", "ToTypeValue", "GetCalculateValue",
    "get_Cost", "CalculateCost", "CalculateCostInternal", "CalculateStatus", "CalculatePercentStatus",
    "CalculateConstantStatus", "CalculatePromotionStatus", "CalculateGenerateValueCafe",
    "CalculateGenerateValueKitchen", "CalculateGenerateValueFormationSlot", "ApplyCafeEffectCoefficient",
    "ApplyKitchenLevelCoefficient", "ApplyFormationSlotCoefficient", "ApplyCharacterCoefficient",
    "CalculateCafeLevelCoefficient", "CalculateBoostCoefficient", "CalculateResourceAcquireBuffCoefficient",
    "FloatToBigDecimal", "CalculateCafeExp", "CalcRequiredSeconds", "CalcRemainingMinutes",
    "AddStatusUpRate", "AddStatusUpValue", "UpdateBaseStatus", "UpdateCorrectStatus",
}

prio = [t for t in targets if t["class"] in PRIO_CLASS and t["method"] in PRIO_METHOD and t["rva"] > 0]
print(f"priority targets: {len(prio)}", flush=True)

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
        out.write("# Decompiled calculation functions (Ghidra decompiler, IL2CPP names applied)\n\n")
        for i, t in enumerate(prio):
            addr = base.add(int(t["rva"]))
            func = fm.getFunctionAt(addr)
            if func is None:
                tx = program.startTransaction("mkfunc")
                try:
                    func = api.createFunction(addr, None)
                finally:
                    program.endTransaction(tx, True)
            if func is None:
                out.write("## %s.%s @ 0x%x — no function\n\n" % (t["class"], t["method"], t["rva"]))
                continue
            try:
                res = decomp.decompileFunction(func, 60, mon)
                if res.decompileCompleted():
                    out.write("## %s.%s(%s)\n\n```c\n%s\n```\n\n" % (
                        t["class"], t["method"], t["args"],
                        res.getDecompiledFunction().getC()))
                else:
                    out.write("## %s.%s — failed: %s\n\n" % (t["class"], t["method"], res.getErrorMessage()))
            except Exception as e:
                out.write("## %s.%s — exception %s\n\n" % (t["class"], t["method"], str(e)))
            if (i + 1) % 20 == 0:
                print(f"  {i+1}/{len(prio)}", flush=True)
    decomp.dispose()
print("done ->", OUT, flush=True)
