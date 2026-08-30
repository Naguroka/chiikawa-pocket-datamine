# Decompiled calculation functions (Ghidra decompiler, IL2CPP names applied)

## StudyTimeCalculator.CalcRequiredSeconds(int requiredSeconds, BigDecimal calculateValue)

```c

void Game_Application_Study_StudyTimeCalculator__CalcRequiredSeconds
               (int param_1,undefined8 param_2,undefined8 param_3)

{
  undefined *puVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a4512ee & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a4512ee = 1;
  }
  if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar2 = func_0x09774ab0((double)param_1,0);
  auVar2 = func_0x09774648(auVar2._0_8_,auVar2._8_8_,param_2,param_3,0);
  auVar3 = func_0x09774ab0(0x404e000000000000,0);
  auVar3 = func_0x09774d28(auVar2._0_8_,auVar2._8_8_,auVar3._0_8_,auVar3._8_8_,0);
  auVar2 = func_0x09774dd8(auVar2._0_8_,auVar2._8_8_,auVar3._0_8_,auVar3._8_8_,0);
  func_0x09774b94(auVar2._0_8_,auVar2._8_8_,0);
  return;
}


```

## StudyTimeCalculator.CalcRemainingMinutes(long startAt, long endAt)

```c

int Game_Application_Study_StudyTimeCalculator__CalcRemainingMinutes(void)

{
  int iVar1;
  float fVar2;
  
  fVar2 = (float)func_0x0477c61c();
  if (cRam000000000a44e3e1 == '\0') {
    func_0x0415191c(PTR_DAT_09eac4c8);
    cRam000000000a44e3e1 = '\x01';
  }
  if (*(int *)(*(long *)PTR_DAT_09eac4c8 + 0xe0) == 0) {
    func_0x04151a94();
  }
  iVar1 = -0x80000000;
  if ((float)(int)fVar2 != INFINITY) {
    iVar1 = (int)fVar2;
  }
  return iVar1;
}


```

## HuntCalculator.CalculateNormalAttackDamage(bool isTargetBoss, bool isDisplayMaxDamage, BigDecimal normalAttackDamageRate, BigDecimal attack, float criticalRate, Bi)

```c

void Game_Application_InGameHunt_HuntCalculator__CalculateNormalAttackDamage
               (undefined1 (*param_1) [16],float param_2,uint param_3,byte param_4,
               undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
               undefined8 param_9,undefined8 param_10,undefined8 param_11,undefined8 param_12,
               undefined8 param_13,undefined8 param_14,undefined8 param_15,undefined8 param_16,
               undefined8 param_17,undefined8 param_18,undefined8 param_19,undefined8 param_20,
               undefined8 param_21,undefined8 param_22,undefined8 param_23,undefined8 param_24)

{
  undefined1 auVar1 [16];
  undefined *puVar2;
  undefined *puVar3;
  byte bVar4;
  float fVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  
  puVar2 = PTR_Applibot_Framework_RandomUtility_TypeInfo_09eaf1c8;
  auVar1._8_8_ = param_16;
  auVar1._0_8_ = param_15;
  if ((bRam000000000a451590 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_Applibot_Framework_RandomUtility_TypeInfo_09eaf1c8);
    bRam000000000a451590 = 1;
  }
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
    func_0x04151a94();
  }
  fVar5 = (float)func_0x0436d6fc(0,0x3f800000,0);
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar6 = func_0x097744cc(param_7,param_8,param_5,param_6,0);
  auVar6 = func_0x097744cc(auVar6._0_8_,auVar6._8_8_,param_17,param_18,0);
  if (fVar5 < param_2) {
    if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
      func_0x04151a94();
    }
    auVar6 = func_0x097744cc(auVar6._0_8_,auVar6._8_8_,param_9,param_10,0);
  }
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  if ((param_3 & 1) == 0) {
    param_12 = param_14;
    param_11 = param_13;
  }
  auVar6 = func_0x097744cc(auVar6._0_8_,auVar6._8_8_,param_11,param_12,0);
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar6 = func_0x097744cc(auVar6._0_8_,auVar6._8_8_,param_21,param_22,0);
  auVar7 = func_0x09774ab0(0x3ff0000000000000,0);
  auVar7 = func_0x09774648(auVar7._0_8_,auVar7._8_8_,param_19,param_20,0);
  auVar6 = func_0x097744cc(auVar6._0_8_,auVar6._8_8_,auVar7._0_8_,auVar7._8_8_,0);
  if (fVar5 < param_2) {
    if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
      func_0x04151a94();
    }
    auVar6 = func_0x097744cc(auVar6._0_8_,auVar6._8_8_,param_23,param_24,0);
  }
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar7 = func_0x09774ab0(0,0);
  bVar4 = func_0x09774e6c(param_15,param_16,auVar7._0_8_,auVar7._8_8_,0);
  if ((bVar4 & 1) == 0) {
    auVar1 = auVar6;
  }
  *param_1 = auVar1;
  *(undefined8 *)param_1[1] = 0;
  param_1[1][0] = fVar5 < param_2 & (bVar4 ^ 1);
  param_1[1][1] = param_4 & 1;
  return;
}


```

## HuntCalculator.CalculateSkillDamage(bool isTargetBoss, bool isDisplayMaxDamage, SkillType skillType, BigDecimal skillDamageRate, BigDecimal uniqueSkillDamag)

```c

void Game_Application_InGameHunt_HuntCalculator__CalculateSkillDamage
               (undefined8 *param_1,float param_2,uint param_3,byte param_4,int param_5,
               undefined8 param_6,undefined8 param_7,undefined8 param_8,undefined8 param_9,
               undefined8 param_10,undefined8 param_11,undefined8 param_12,undefined8 param_13,
               undefined8 param_14,undefined8 param_15,undefined8 param_16,undefined8 param_17,
               undefined8 param_18,undefined8 param_19,undefined8 param_20,undefined8 param_21,
               undefined8 param_22,undefined8 param_23,undefined8 param_24,undefined8 param_25,
               undefined8 param_26,undefined8 param_27,undefined8 param_28)

{
  undefined *puVar1;
  undefined *puVar2;
  bool bVar3;
  byte bVar4;
  float fVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  
  puVar1 = PTR_Applibot_Framework_RandomUtility_TypeInfo_09eaf1c8;
  if ((bRam000000000a451591 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_Applibot_Framework_RandomUtility_TypeInfo_09eaf1c8);
    bRam000000000a451591 = 1;
  }
  puVar2 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
    func_0x04151a94();
  }
  fVar5 = (float)func_0x0436d6fc(0,0x3f800000,0);
  if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar6 = func_0x097744cc(param_13,param_14,param_11,param_12,0);
  auVar6 = func_0x097744cc(auVar6._0_8_,auVar6._8_8_,param_6,param_7,0);
  if (fVar5 < param_2) {
    if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
      func_0x04151a94();
    }
    auVar6 = func_0x097744cc(auVar6._0_8_,auVar6._8_8_,param_15,param_16,0);
  }
  if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
    func_0x04151a94();
  }
  if ((param_3 & 1) == 0) {
    param_18 = param_20;
    param_17 = param_19;
  }
  auVar6 = func_0x097744cc(auVar6._0_8_,auVar6._8_8_,param_17,param_18,0);
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if (param_5 == 1) {
    if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
      func_0x04151a94();
    }
    auVar6 = func_0x097744cc(auVar6._0_8_,auVar6._8_8_,param_8,param_9,0);
  }
  if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar6 = func_0x097744cc(auVar6._0_8_,auVar6._8_8_,param_25,param_26,0);
  auVar7 = func_0x09774ab0(0x3ff0000000000000,0);
  auVar7 = func_0x09774648(auVar7._0_8_,auVar7._8_8_,param_23,param_24,0);
  auVar6 = func_0x097744cc(auVar6._0_8_,auVar6._8_8_,auVar7._0_8_,auVar7._8_8_,0);
  if (fVar5 < param_2) {
    if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
      func_0x04151a94();
    }
    auVar6 = func_0x097744cc(auVar6._0_8_,auVar6._8_8_,param_27,param_28,0);
  }
  if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar7 = func_0x09774ab0(0,0);
  bVar4 = func_0x09774e6c(param_21,param_22,auVar7._0_8_,auVar7._8_8_,0);
  bVar3 = (bVar4 & 1) == 0;
  if (bVar3) {
    param_22 = auVar6._8_8_;
  }
  if (bVar3) {
    param_21 = auVar6._0_8_;
  }
  *param_1 = param_21;
  param_1[1] = param_22;
  param_1[2] = 0;
  *(byte *)(param_1 + 2) = fVar5 < param_2 & (bVar4 ^ 1);
  *(byte *)((long)param_1 + 0x11) = param_4 & 1;
  return;
}


```

## HuntCalculator.CalculateRecastRate(float recastTime, float maxRecastTime)

```c

float Game_Application_InGameHunt_HuntCalculator__CalculateRecastRate(float param_1,float param_2)

{
  undefined *puVar1;
  float fVar2;
  
  puVar1 = PTR_DAT_09eac4c8;
  if ((bRam000000000a451592 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09eac4c8);
    bRam000000000a451592 = 1;
  }
  if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
    func_0x04151a94();
  }
  param_1 = param_1 / param_2;
  if (cRam000000000a45163d == '\0') {
    func_0x0415191c(PTR_DAT_09ece6e8);
    func_0x0415191c(PTR_DAT_09eac4c8);
    cRam000000000a45163d = '\x01';
  }
  fVar2 = 0.0;
  if ((0.0 <= param_1) && (fVar2 = 1.0, param_1 <= 1.0)) {
    fVar2 = param_1;
  }
  return fVar2;
}


```

## HuntCalculator.DropGoldPerUnit(BigDecimal totalDropGold, int unitCount)

```c

undefined1  [16]
Game_Application_InGameHunt_HuntCalculator__DropGoldPerUnit(long param_1,long param_2,int param_3)

{
  long lVar1;
  undefined1 auVar2 [16];
  undefined *puVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  long *plVar7;
  long lVar8;
  undefined8 *puVar9;
  long lVar10;
  long lVar11;
  undefined1 auVar12 [16];
  long lStack_70;
  long lStack_68;
  undefined *puStack_60;
  long lStack_58;
  long lStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a451593 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a451593 = 1;
  }
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar12 = func_0x09774ab0((double)param_3,0);
  lVar8 = auVar12._8_8_;
  lVar11 = auVar12._0_8_;
  if ((bRam000000000a46d944 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46d944 = 1;
  }
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if (lVar11 == 0) {
    func_0x04151930(PTR_DAT_09ec32d8);
    uVar5 = func_0x04151ba8();
    func_0x085a42d4(uVar5,0);
    uVar6 = func_0x04151930(PTR_Method_Applibot_Math_BigDecimal_op_Division___09f79378);
    plVar7 = (long *)func_0x04151a84(uVar5,uVar6);
    puStack_60 = &Applibot_Math_BigDecimal__Floor;
    lStack_58 = param_2;
    lStack_50 = lVar8;
    uStack_48 = uVar5;
    if ((bRam000000000a46d931 & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      bRam000000000a46d931 = 1;
    }
    puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar11 = plVar7[1];
    if (lVar11 < 1) {
      lVar8 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
      if ((lVar11 < -0xc) || (*plVar7 == 0)) {
        if (*(int *)(lVar8 + 0xe0) == 0) {
          func_0x04151a94();
          lVar8 = *(long *)puVar3;
        }
        lStack_68 = (*(long **)(lVar8 + 0xb8))[1];
        lStack_70 = **(long **)(lVar8 + 0xb8);
      }
      else {
        if (*(int *)(lVar8 + 0xe0) == 0) {
          func_0x04151a94();
        }
        lVar8 = func_0x097740c8(-lVar11);
        lStack_70 = 0;
        lStack_68 = 0;
        lVar11 = 0;
        if (lVar8 != 0) {
          lVar11 = *plVar7 / lVar8;
        }
        func_0x09773f14(&lStack_70,lVar11 * lVar8,plVar7[1]);
      }
    }
    else {
      lStack_68 = plVar7[1];
      lStack_70 = *plVar7;
    }
    auVar2._8_8_ = lStack_68;
    auVar2._0_8_ = lStack_70;
    return auVar2;
  }
  lVar4 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if (*(int *)(lVar4 + 0xe0) == 0) {
    func_0x04151a94();
    lVar4 = *(long *)puVar3;
  }
  puVar9 = *(undefined8 **)(lVar4 + 0xb8);
  if (param_1 == 0) {
    uStack_38 = puVar9[1];
    uStack_40 = *puVar9;
  }
  else {
    lVar10 = puVar9[8];
    lVar4 = 0;
    if (lVar11 != 0) {
      lVar4 = (lVar10 * param_1) / lVar11;
    }
    lVar1 = 0;
    if (lVar11 != 0) {
      lVar1 = ((lVar10 * param_1 - lVar4 * lVar11) * lVar10) / lVar11;
    }
    uStack_40 = 0;
    uStack_38 = 0;
    func_0x09773f14(&uStack_40,lVar1 + lVar4 * lVar10,(param_2 - lVar8) + -0xc);
  }
  auVar12._8_8_ = uStack_38;
  auVar12._0_8_ = uStack_40;
  return auVar12;
}


```

## HuntCalculator.GetAttackBuffStatus(BigDecimal baseStatus, float buffRate)

```c

undefined1  [16]
Game_Application_InGameHunt_HuntCalculator__GetAttackBuffStatus
          (float param_1,long param_2,long param_3)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  undefined *puVar3;
  long lVar4;
  long lVar5;
  undefined1 auVar6 [16];
  long lStack_40;
  undefined8 uStack_38;
  
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  auVar1._8_8_ = param_3;
  auVar1._0_8_ = param_2;
  if ((bRam000000000a451594 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a451594 = 1;
  }
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar6 = func_0x09774ab0((double)param_1,0);
  auVar6 = func_0x097744cc(param_2,param_3,auVar6._0_8_,auVar6._8_8_,0);
  lVar5 = auVar6._0_8_;
  if ((bRam000000000a46d941 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46d941 = 1;
  }
  auVar2 = auVar6;
  if (param_3 < auVar6._8_8_) {
    auVar2 = auVar1;
    auVar1 = auVar6;
    lVar5 = param_2;
  }
  auVar6 = auVar1;
  if (lVar5 != 0) {
    auVar6 = auVar2;
    if ((auVar1._0_8_ != 0) && (lVar5 = auVar1._8_8_ - auVar2._8_8_, auVar6 = auVar1, lVar5 < 0xc))
    {
      if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
        func_0x04151a94();
      }
      lVar4 = func_0x097740c8(lVar5);
      lVar5 = 0;
      if (lVar4 != 0) {
        lVar5 = auVar2._0_8_ / lVar4;
      }
      lStack_40 = 0;
      uStack_38 = 0;
      func_0x09773f14(&lStack_40,lVar5 + auVar1._0_8_,auVar1._8_8_);
      auVar6._8_8_ = uStack_38;
      auVar6._0_8_ = lStack_40;
    }
  }
  return auVar6;
}


```

## HuntCalculator.GetBuffStatus(BigDecimal baseStatus, float buffRate)

```c

undefined1  [16]
Game_Application_InGameHunt_HuntCalculator__GetBuffStatus(float param_1,long param_2,long param_3)

{
  long lVar1;
  long lVar2;
  undefined *puVar3;
  long lVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a451595 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a451595 = 1;
  }
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar5 = func_0x09774ab0((double)param_1,0);
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a46d943 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46d943 = 1;
  }
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  if (param_2 == 0 || auVar5._0_8_ == 0) {
    uStack_48 = (*(undefined8 **)(*(long *)puVar3 + 0xb8))[1];
    uStack_50 = **(undefined8 **)(*(long *)puVar3 + 0xb8);
  }
  else {
    auVar6 = func_0x097751b4(param_2);
    auVar7 = func_0x097751b4(auVar5._0_8_);
    lVar4 = *(long *)(*(long *)(*(long *)puVar3 + 0xb8) + 0x40);
    uStack_50 = 0;
    uStack_48 = 0;
    lVar1 = 0;
    if (lVar4 != 0) {
      lVar1 = (auVar7._8_8_ * auVar6._8_8_) / lVar4;
    }
    lVar2 = 0;
    if (lVar4 != 0) {
      lVar2 = (auVar7._8_8_ * auVar6._0_8_ + auVar7._0_8_ * auVar6._8_8_ + lVar1) / lVar4;
    }
    func_0x09773f14(&uStack_50,lVar2 + auVar7._0_8_ * auVar6._0_8_,param_3 + auVar5._8_8_ + 0xc);
  }
  auVar5._8_8_ = uStack_48;
  auVar5._0_8_ = uStack_50;
  return auVar5;
}


```

## HuntCalculator.GetBuffStatus(int baseStatus, float buffRate)

```c

int Game_Application_InGameHunt_HuntCalculator__GetBuffStatus(float param_1,int param_2)

{
  int iVar1;
  
  iVar1 = -0x80000000;
  if ((float)param_2 * param_1 != INFINITY) {
    iVar1 = (int)((float)param_2 * param_1);
  }
  return iVar1;
}


```

## HuntCalculator.GetBuffStatus(float baseStatus, float buffRate)

```c

float Game_Application_InGameHunt_HuntCalculator__GetBuffStatus(float param_1,float param_2)

{
  return param_1 * param_2;
}


```

## HuntCalculator.GetMoveDistance(PartyType partyType, float moveDistance)

```c

float Game_Application_InGameHunt_HuntCalculator__GetMoveDistance(float param_1,int param_2)

{
  if (param_2 != 1) {
    param_1 = -param_1;
  }
  return param_1;
}


```

## HuntCalculator.CalculateHpRecover(BigDecimal healthRecoverValue)

```c

void Game_Application_InGameHunt_HuntCalculator__CalculateHpRecover(void)

{
  return;
}


```

## HuntCalculator.GetGameSpeed(bool isSpeedUp)

```c

undefined4 Game_Application_InGameHunt_HuntCalculator__GetGameSpeed(uint param_1)

{
  undefined4 uVar1;
  
  uVar1 = 0x40000000;
  if ((param_1 & 1) == 0) {
    uVar1 = 0x3f800000;
  }
  return uVar1;
}


```

## CookingResourceCalculator.FloatToBigDecimal(float value)

```c

void WithNetwork_CookingResourceCalculator__FloatToBigDecimal(undefined4 param_1)

{
  undefined *puVar1;
  undefined *puVar2;
  undefined8 uVar3;
  undefined4 uStack_14;
  
  puVar1 = PTR_DAT_09ead420;
  uStack_14 = param_1;
  if ((bRam000000000a469ae1 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09ead420);
    bRam000000000a469ae1 = 1;
  }
  puVar2 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
    func_0x04151a94();
  }
  uVar3 = func_0x08579924(0);
  uVar3 = func_0x085cee64(&uStack_14,uVar3,0);
  if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
    func_0x04151a94(*(long *)puVar2);
  }
  func_0x097741b4(uVar3,0);
  return;
}


```

## CookingResourceCalculator.CalculateGenerateValueCafe(CookingResourceGenerateCoefficientData coefficientData, int targetGenerateResourceId, int cafeLevel, ICookingKitchenData)

```c

/* WARNING: Possible PIC construction at 0x09216898: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09216e94: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09216f08: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0921689c) */
/* WARNING: Removing unreachable block (ram,0x092168b0) */
/* WARNING: Removing unreachable block (ram,0x092168b4) */
/* WARNING: Removing unreachable block (ram,0x09216e98) */
/* WARNING: Removing unreachable block (ram,0x09216eb4) */
/* WARNING: Removing unreachable block (ram,0x09216eb8) */

undefined1  [16]
WithNetwork_CookingResourceCalculator__CalculateGenerateValueCafe
          (long *param_1,int param_2,undefined1 (*param_3) [16],long *param_4,ulong param_5,
          uint param_6,uint param_7)

{
  undefined1 auVar1 [16];
  undefined *puVar2;
  long *plVar3;
  int iVar4;
  uint uVar5;
  long lVar8;
  undefined8 *puVar9;
  int iVar6;
  undefined1 (*pauVar10) [16];
  long *plVar11;
  long *plVar12;
  undefined1 (*pauVar13) [16];
  undefined4 uVar7;
  long *plVar14;
  undefined1 (*pauVar15) [16];
  long *plVar16;
  long *plVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  int *piVar23;
  uint uVar24;
  undefined *puVar25;
  ulong uVar26;
  ulong unaff_x21;
  long *plVar27;
  long *plVar28;
  undefined *unaff_x26;
  ulong unaff_x27;
  undefined1 (*unaff_x28) [16];
  long *unaff_x29;
  undefined *puVar29;
  undefined *puVar30;
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [12];
  long lStack_3c0;
  long lStack_3b8;
  long lStack_3b0;
  long lStack_3a8;
  long lStack_3a0;
  long lStack_398;
  undefined8 uStack_390;
  long lStack_388;
  long lStack_380;
  long lStack_378;
  long lStack_370;
  long lStack_368;
  long lStack_360;
  long lStack_358;
  long lStack_350;
  long lStack_348;
  long lStack_340;
  long lStack_338;
  long lStack_330;
  long lStack_328;
  long lStack_320;
  long lStack_318;
  long lStack_310;
  long lStack_308;
  long lStack_300;
  long lStack_2f8;
  long lStack_2f0;
  long lStack_2e8;
  long lStack_2e0;
  long lStack_2d8;
  undefined1 auStack_2d0 [16];
  long *plStack_2c0;
  undefined *puStack_2b0;
  long *plStack_2a8;
  ulong uStack_2a0;
  long *plStack_298;
  long *plStack_290;
  undefined1 (*pauStack_288) [16];
  undefined1 (*pauStack_280) [16];
  undefined *puStack_278;
  undefined1 auStack_270 [12];
  undefined4 uStack_264;
  ulong uStack_260;
  ulong uStack_258;
  ulong uStack_250;
  ulong uStack_248;
  ulong uStack_240;
  ulong uStack_238;
  ulong uStack_230;
  ulong uStack_228;
  ulong uStack_220;
  ulong uStack_218;
  ulong uStack_210;
  ulong uStack_208;
  ulong uStack_200;
  ulong uStack_1f8;
  ulong uStack_1f0;
  ulong uStack_1e8;
  ulong uStack_1e0;
  ulong uStack_1d8;
  ulong uStack_1d0;
  long *plStack_1c8;
  long *plStack_1c0;
  undefined *puStack_1b8;
  undefined1 (*pauStack_1b0) [16];
  ulong uStack_1a8;
  undefined *puStack_1a0;
  undefined *puStack_198;
  undefined *puStack_190;
  long *plStack_188;
  ulong uStack_180;
  ulong uStack_178;
  ulong uStack_170;
  ulong uStack_168;
  uint uStack_154;
  uint uStack_150;
  uint uStack_14c;
  long *plStack_148;
  ulong uStack_140;
  int iStack_134;
  long lStack_130;
  long lStack_128;
  long lStack_120;
  long lStack_118;
  long lStack_110;
  long lStack_108;
  long lStack_100;
  long lStack_f8;
  long lStack_f0;
  long lStack_e8;
  long lStack_e0;
  long lStack_d8;
  ulong uStack_d0;
  ulong uStack_c8;
  long lStack_c0;
  long lStack_b8;
  long lStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  long lStack_68;
  
  puVar25 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  uStack_14c = (uint)param_3;
  uVar26 = (ulong)param_7;
  plVar16 = param_4;
  uVar18 = param_5;
  plStack_148 = param_1;
  iStack_134 = param_2;
  if ((bRam000000000a469ae2 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09ed0120);
    func_0x0415191c(PTR_DAT_09eb5b78);
    bRam000000000a469ae2 = 1;
  }
  lVar8 = *(long *)puVar25;
  if (*(int *)(lVar8 + 0xe0) == 0) {
    func_0x04151a94();
    lVar8 = *(long *)puVar25;
  }
  puVar30 = PTR_DAT_09ed0120;
  puVar29 = PTR_DAT_09eb5b78;
  uVar22 = (*(ulong **)(lVar8 + 0xb8))[1];
  uVar21 = **(ulong **)(lVar8 + 0xb8);
  uStack_168 = 0xa469000;
  uStack_178 = unaff_x21;
  puStack_190 = (undefined *)(ulong)param_6;
  puStack_1a0 = unaff_x26;
  uStack_d0 = uVar21;
  uStack_c8 = uVar22;
  if (param_4 != (long *)0x0) {
    uVar5 = *(uint *)(param_4 + 3);
    uStack_154 = param_6;
    uStack_150 = param_7;
    if (0 < (int)uVar5) {
      uVar26 = 0;
      do {
        uVar24 = (uint)uVar26;
        uStack_178 = uVar22;
        puStack_190 = puVar29;
        puStack_1a0 = puVar30;
        if (uVar5 <= uVar24) goto code_r0x09216968;
        unaff_x28 = (undefined1 (*) [16])param_4[(long)(int)uVar24 + 4];
        uStack_168 = uVar21;
        if (unaff_x28 == (undefined1 (*) [16])0x0) goto code_r0x0921696c;
        uVar19 = *(ulong *)*unaff_x28;
        uVar20 = (ulong)*(ushort *)(uVar19 + 0x12e);
        if (uVar20 != 0) {
          piVar23 = (int *)(*(long *)(uVar19 + 0xb0) + 8);
          do {
            if (*(long *)(piVar23 + -2) == *(long *)puVar29) {
              puVar9 = (undefined8 *)(uVar19 + (long)(*piVar23 + 9) * 0x10 + 0x138);
              goto code_r0x09216750;
            }
            uVar20 = uVar20 - 1;
            piVar23 = piVar23 + 4;
          } while (uVar20 != 0);
        }
        param_3 = (undefined1 (*) [16])0x9;
        puVar9 = (undefined8 *)func_0x041cb4c4(unaff_x28);
code_r0x09216750:
        iVar4 = (*(code *)*puVar9)(unaff_x28,puVar9[1]);
        if (iVar4 == iStack_134) {
          if (param_5 == 0) goto code_r0x0921696c;
          uVar5 = *(uint *)(param_5 + 0x18);
          uStack_140 = uVar21;
          if ((int)uVar5 < 1) goto code_r0x0921686c;
          unaff_x27 = 0;
          goto code_r0x09216780;
        }
        uVar5 = *(uint *)(param_4 + 3);
        uVar26 = (ulong)(uVar24 + 1);
      } while ((int)(uVar24 + 1) < (int)uVar5);
    }
    lStack_118 = plStack_148[3];
    lStack_120 = plStack_148[2];
    lStack_108 = plStack_148[5];
    lStack_110 = plStack_148[4];
    lStack_128 = plStack_148[1];
    lStack_130 = *plStack_148;
    lStack_78 = plStack_148[3];
    lStack_80 = plStack_148[2];
    lStack_68 = plStack_148[5];
    lStack_70 = plStack_148[4];
    lStack_88 = plStack_148[1];
    lStack_90 = *plStack_148;
    uStack_d0 = uVar21;
    uStack_c8 = uVar22;
    func_0x09217460(&lStack_90,uStack_154 & 1,&uStack_d0);
    lStack_b8 = lStack_128;
    lStack_c0 = lStack_130;
    lStack_a8 = lStack_118;
    lStack_b0 = lStack_120;
    lStack_98 = lStack_108;
    lStack_a0 = lStack_110;
    func_0x0921751c(&lStack_c0,uStack_150 & 1,&uStack_d0);
    auVar33._8_8_ = uStack_c8;
    auVar33._0_8_ = uStack_d0;
    return auVar33;
  }
code_r0x0921696c:
  puVar29 = &WithNetwork_CookingResourceCalculator__CalculateGenerateValueKitchen;
  auVar31 = func_0x04151bb8();
code_r0x09216970:
  plVar28 = (long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  pauVar10 = auVar31._0_8_;
  plVar3 = (long *)auStack_270;
  puStack_198 = puVar25;
  uVar22 = uVar18 & 0xffffffff;
  plVar27 = (long *)(auVar31._8_8_ & 0xffffffff);
  pauVar15 = param_3;
  plVar17 = plVar16;
  uVar21 = uVar18;
  plStack_1c0 = unaff_x29;
  puStack_1b8 = puVar29;
  pauStack_1b0 = unaff_x28;
  uStack_1a8 = unaff_x27;
  plStack_188 = param_4;
  uStack_180 = param_5;
  uStack_170 = uVar26;
  if ((bRam000000000a469ae3 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09ed0110);
    func_0x0415191c(PTR_DAT_09ed0120);
    func_0x0415191c(PTR_DAT_09ed0128);
    func_0x0415191c(PTR_DAT_09ed0118);
    func_0x0415191c(PTR_DAT_09eb5b78);
    bRam000000000a469ae3 = 1;
  }
  lVar8 = *plVar28;
  if (*(int *)(lVar8 + 0xe0) == 0) {
    func_0x04151a94();
    lVar8 = *plVar28;
  }
  plStack_1c8 = (long *)(*(ulong **)(lVar8 + 0xb8))[1];
  uStack_1d0 = **(ulong **)(lVar8 + 0xb8);
  puVar25 = (undefined *)0xa469000;
  if (param_3 != (undefined1 (*) [16])0x0) {
    uVar20 = *(ulong *)*param_3;
    uVar26 = (ulong)*(ushort *)(uVar20 + 0x12e);
    if (uVar26 != 0) {
      piVar23 = (int *)(*(long *)(uVar20 + 0xb0) + 8);
      do {
        if (*(long *)(piVar23 + -2) == *(long *)PTR_DAT_09eb5b78) {
          puVar9 = (undefined8 *)(uVar20 + (long)(*piVar23 + 9) * 0x10 + 0x138);
          goto code_r0x09216a80;
        }
        uVar26 = uVar26 - 1;
        piVar23 = piVar23 + 4;
      } while (uVar26 != 0);
    }
    pauVar15 = (undefined1 (*) [16])0x9;
    puVar9 = (undefined8 *)func_0x041cb4c4(param_3);
code_r0x09216a80:
    iVar4 = (*(code *)*puVar9)(param_3,puVar9[1]);
    puVar29 = PTR_DAT_09ed0120;
    if (iVar4 != auVar31._8_4_) {
code_r0x09216f0c:
      auVar1._8_8_ = plStack_1c8;
      auVar1._0_8_ = uStack_1d0;
      return auVar1;
    }
    if (plVar16 != (long *)0x0) {
      lVar8 = *plVar16;
      uVar26 = (ulong)*(ushort *)(lVar8 + 0x12e);
      if (uVar26 != 0) {
        piVar23 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
        do {
          if (*(long *)(piVar23 + -2) == *(long *)PTR_DAT_09ed0120) {
            puVar9 = (undefined8 *)(lVar8 + (long)(*piVar23 + 2) * 0x10 + 0x138);
            goto code_r0x09216af0;
          }
          uVar26 = uVar26 - 1;
          piVar23 = piVar23 + 4;
        } while (uVar26 != 0);
      }
      pauVar15 = (undefined1 (*) [16])0x2;
      puVar9 = (undefined8 *)func_0x041cb4c4(plVar16);
code_r0x09216af0:
      plVar11 = (long *)(*(code *)*puVar9)(plVar16,puVar9[1]);
      puVar30 = PTR_DAT_09ed0128;
      puVar25 = puVar29;
      if (plVar11 != (long *)0x0) {
        lVar8 = *plVar11;
        uVar26 = (ulong)*(ushort *)(lVar8 + 0x12e);
        if (uVar26 != 0) {
          piVar23 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
          do {
            if (*(long *)(piVar23 + -2) == *(long *)PTR_DAT_09ed0128) {
              puVar9 = (undefined8 *)(lVar8 + (long)(*piVar23 + 4) * 0x10 + 0x138);
              goto code_r0x09216b5c;
            }
            uVar26 = uVar26 - 1;
            piVar23 = piVar23 + 4;
          } while (uVar26 != 0);
        }
        pauVar15 = (undefined1 (*) [16])0x4;
        puVar9 = (undefined8 *)func_0x041cb4c4(plVar11);
code_r0x09216b5c:
        uVar26 = (*(code *)*puVar9)(plVar11,puVar9[1]);
        if ((uVar26 & 1) == 0) goto code_r0x09216f0c;
        lVar8 = *plVar16;
        uVar26 = (ulong)*(ushort *)(lVar8 + 0x12e);
        if (uVar26 != 0) {
          piVar23 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
          do {
            if (*(long *)(piVar23 + -2) == *(long *)puVar29) {
              puVar9 = (undefined8 *)(lVar8 + (long)(*piVar23 + 3) * 0x10 + 0x138);
              goto code_r0x09216bbc;
            }
            uVar26 = uVar26 - 1;
            piVar23 = piVar23 + 4;
          } while (uVar26 != 0);
        }
        pauVar15 = (undefined1 (*) [16])0x3;
        puVar9 = (undefined8 *)func_0x041cb4c4(plVar16);
code_r0x09216bbc:
        uStack_264 = (undefined4)uVar18;
        plVar12 = (long *)(*(code *)*puVar9)(plVar16,puVar9[1]);
        plVar14 = plStack_1c8;
        uVar18 = uStack_1d0;
        auVar32._8_8_ = plStack_1c8;
        auVar32._0_8_ = param_3;
        plVar27 = plVar11;
        unaff_x29 = (long *)puVar30;
        if (plVar12 != (long *)0x0) {
          uVar5 = *(uint *)(plVar12 + 3);
          if (0 < (int)uVar5) {
            puVar29 = (undefined *)0x0;
            do {
              uVar24 = (uint)puVar29;
              pauVar13 = pauVar15;
              plVar16 = plVar12;
              plVar27 = plVar14;
              uVar22 = uVar18;
              if (uVar5 <= uVar24) goto code_r0x09216f34;
              plVar28 = (long *)plVar12[(long)(int)uVar24 + 4];
              puVar25 = puVar29;
              if (plVar28 == (long *)0x0) goto code_r0x09216f30;
              lVar8 = *plVar28;
              uVar26 = (ulong)*(ushort *)(lVar8 + 0x12e);
              if (uVar26 != 0) {
                piVar23 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar23 + -2) == *(long *)puVar30) {
                    puVar9 = (undefined8 *)(lVar8 + (long)(*piVar23 + 5) * 0x10 + 0x138);
                    goto code_r0x09216c4c;
                  }
                  uVar26 = uVar26 - 1;
                  piVar23 = piVar23 + 4;
                } while (uVar26 != 0);
              }
              pauVar15 = (undefined1 (*) [16])0x5;
              puVar9 = (undefined8 *)func_0x041cb4c4(plVar28);
code_r0x09216c4c:
              pauVar13 = (undefined1 (*) [16])(*(code *)*puVar9)(plVar28,puVar9[1]);
              if (pauVar13 != (undefined1 (*) [16])0x0) {
                uVar26 = *(ulong *)*pauVar13;
                uVar18 = (ulong)*(ushort *)(uVar26 + 0x12e);
                if (uVar18 == 0) goto code_r0x09216c98;
                piVar23 = (int *)(*(long *)(uVar26 + 0xb0) + 8);
                goto code_r0x09216c80;
              }
              uVar5 = *(uint *)(plVar12 + 3);
              puVar29 = (undefined *)(ulong)(uVar24 + 1);
            } while ((int)(uVar24 + 1) < (int)uVar5);
          }
          uStack_1d0 = uVar18;
          plStack_1c8 = plVar14;
          auVar34._8_4_ = uStack_264;
          auVar34._0_8_ = &uStack_260;
          pauVar15 = (undefined1 (*) [16])&uStack_1d0;
          uStack_248 = *(ulong *)((long)pauVar10[1] + 8);
          uStack_250 = *(ulong *)pauVar10[1];
          uStack_238 = *(ulong *)((long)pauVar10[2] + 8);
          uStack_240 = *(ulong *)pauVar10[2];
          uStack_258 = *(ulong *)((long)*pauVar10 + 8);
          uStack_260 = *(ulong *)*pauVar10;
          puVar30 = &UNK_09216f0c;
          puVar25 = puVar29;
          pauVar13 = pauVar10;
          goto code_r0x09217148;
        }
      }
    }
  }
code_r0x09216f30:
  puVar29 = puVar25;
  func_0x04151bb8();
  pauVar13 = pauVar15;
code_r0x09216f34:
  puVar30 = &WithNetwork_CookingResourceCalculator__CalculateGenerateValueFormationSlot;
  auVar32 = func_0x04151bc0();
code_r0x09216f38:
  puVar2 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  plVar14 = auVar32._8_8_;
  plVar11 = auVar32._0_8_;
  plVar3 = &lStack_3c0;
  puVar25 = (undefined *)(uVar21 & 0xffffffff);
  plVar12 = (long *)((ulong)plVar17 & 0xffffffff);
  pauVar15 = pauVar13;
  plStack_2c0 = unaff_x29;
  puStack_2b0 = puVar30;
  plStack_2a8 = plVar28;
  uStack_2a0 = uVar22;
  plStack_298 = plVar27;
  plStack_290 = plVar16;
  pauStack_288 = param_3;
  pauStack_280 = pauVar10;
  puStack_278 = puVar29;
  if ((bRam000000000a469ae4 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09ed0110);
    func_0x0415191c(PTR_DAT_09eb5b78);
    bRam000000000a469ae4 = 1;
  }
  lVar8 = plVar11[5];
  if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auStack_2d0 = func_0x09774ab0((double)(int)lVar8,0);
  lStack_2e8 = plVar11[3];
  lStack_2f0 = plVar11[2];
  lStack_2d8 = plVar11[5];
  lStack_2e0 = plVar11[4];
  lStack_2f8 = plVar11[1];
  lStack_300 = *plVar11;
  if (plVar14 != (long *)0x0) {
    lVar8 = *plVar14;
    uVar18 = (ulong)*(ushort *)(lVar8 + 0x12e);
    if (uVar18 != 0) {
      piVar23 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
      do {
        if (*(long *)(piVar23 + -2) == *(long *)PTR_DAT_09eb5b78) {
          puVar9 = (undefined8 *)(lVar8 + (long)(*piVar23 + 1) * 0x10 + 0x138);
          goto code_r0x09217034;
        }
        uVar18 = uVar18 - 1;
        piVar23 = piVar23 + 4;
      } while (uVar18 != 0);
    }
    puVar9 = (undefined8 *)func_0x041cb4c4(plVar14,*(long *)PTR_DAT_09eb5b78,1);
code_r0x09217034:
    (*(code *)*puVar9)(&uStack_390,plVar14,puVar9[1]);
    lStack_328 = lStack_2f8;
    lStack_330 = lStack_300;
    lStack_318 = lStack_2e8;
    lStack_320 = lStack_2f0;
    lStack_308 = lStack_2d8;
    lStack_310 = lStack_2e0;
    func_0x092171e8(&lStack_330,uStack_390._4_4_,auStack_2d0);
    lStack_348 = plVar11[3];
    lStack_350 = plVar11[2];
    lStack_338 = plVar11[5];
    lStack_340 = plVar11[4];
    lStack_358 = plVar11[1];
    lStack_360 = *plVar11;
    pauVar15 = &auStack_2d0;
    func_0x09217288(&lStack_360,(int)plVar17 == 0);
    lStack_378 = plVar11[3];
    lStack_380 = plVar11[2];
    lStack_368 = plVar11[5];
    lStack_370 = plVar11[4];
    lStack_388 = plVar11[1];
    uStack_390 = *plVar11;
    if (pauVar13 != (undefined1 (*) [16])0x0) {
      uVar26 = *(ulong *)*pauVar13;
      uVar18 = (ulong)*(ushort *)(uVar26 + 0x12e);
      if (uVar18 != 0) {
        piVar23 = (int *)(*(long *)(uVar26 + 0xb0) + 8);
        do {
          if (*(long *)(piVar23 + -2) == *(long *)PTR_DAT_09ed0110) {
            puVar9 = (undefined8 *)(uVar26 + (long)(*piVar23 + 6) * 0x10 + 0x138);
            goto code_r0x092170f4;
          }
          uVar18 = uVar18 - 1;
          piVar23 = piVar23 + 4;
        } while (uVar18 != 0);
      }
      puVar9 = (undefined8 *)func_0x041cb4c4(pauVar13,*(long *)PTR_DAT_09ed0110,6);
code_r0x092170f4:
      uVar7 = (*(code *)*puVar9)(pauVar13,puVar9[1]);
      lStack_3b8 = lStack_388;
      lStack_3c0 = uStack_390;
      lStack_3a8 = lStack_378;
      lStack_3b0 = lStack_380;
      lStack_398 = lStack_368;
      lStack_3a0 = lStack_370;
      func_0x09217330(&lStack_3c0,(uint)uVar21 & 1,uVar7,auStack_2d0);
      return auStack_2d0;
    }
  }
  puVar30 = &WithNetwork_CookingResourceCalculator__CalculateCafeLevelCoefficient;
  auVar34 = func_0x04151bb8();
code_r0x09217148:
  puVar29 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  *(undefined **)((long)plVar3 + -0x30) = puVar30;
  *(long *)((long)plVar3 + -0x28) = auVar32._8_8_;
  *(long **)((long)plVar3 + -0x20) = plVar12;
  *(long *)((long)plVar3 + -0x18) = auVar32._0_8_;
  *(undefined1 (**) [16])((long)plVar3 + -0x10) = pauVar13;
  *(undefined **)((long)plVar3 + -8) = puVar25;
  if ((bRam000000000a469ae8 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469ae8 = 1;
  }
  uVar18 = *(ulong *)*pauVar15;
  uVar26 = *(ulong *)((long)*pauVar15 + 8);
  auVar33 = WithNetwork_CookingResourceCalculator__FloatToBigDecimal
                      (*auVar34._0_8_ * (float)auVar34._8_4_ + 1.0);
  if (*(int *)(*(long *)puVar29 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar33 = func_0x097744cc(uVar18,uVar26,auVar33._0_8_,auVar33._8_8_,0);
  *pauVar15 = auVar33;
  return auVar33;
code_r0x09216780:
  do {
    uVar24 = (uint)unaff_x27;
    if (uVar5 <= uVar24) goto code_r0x09216968;
    unaff_x29 = *(long **)(param_5 + (long)(int)uVar24 * 8 + 0x20);
    uStack_168 = uVar21;
    if (unaff_x29 == (long *)0x0) goto code_r0x0921696c;
    lVar8 = *unaff_x29;
    uVar21 = (ulong)*(ushort *)(lVar8 + 0x12e);
    if (uVar21 != 0) {
      piVar23 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
      do {
        if (*(long *)(piVar23 + -2) == *(long *)puVar30) {
          puVar9 = (undefined8 *)(lVar8 + (long)*piVar23 * 0x10 + 0x138);
          goto code_r0x092167e0;
        }
        uVar21 = uVar21 - 1;
        piVar23 = piVar23 + 4;
      } while (uVar21 != 0);
    }
    param_3 = (undefined1 (*) [16])0x0;
    puVar9 = (undefined8 *)func_0x041cb4c4(unaff_x29);
code_r0x092167e0:
    uVar5 = (*(code *)*puVar9)(unaff_x29,puVar9[1]);
    uVar20 = *(ulong *)*unaff_x28;
    uVar21 = (ulong)uVar5;
    uVar22 = (ulong)*(ushort *)(uVar20 + 0x12e);
    if (uVar22 != 0) {
      piVar23 = (int *)(*(long *)(uVar20 + 0xb0) + 8);
      do {
        if (*(long *)(piVar23 + -2) == *(long *)puVar29) {
          puVar9 = (undefined8 *)(uVar20 + (long)(*piVar23 + 1) * 0x10 + 0x138);
          goto code_r0x09216840;
        }
        uVar22 = uVar22 - 1;
        piVar23 = piVar23 + 4;
      } while (uVar22 != 0);
    }
    param_3 = (undefined1 (*) [16])0x1;
    puVar9 = (undefined8 *)func_0x041cb4c4(unaff_x28);
code_r0x09216840:
    (*(code *)*puVar9)(&lStack_90,unaff_x28,puVar9[1]);
    if (uVar5 == (uint)lStack_90) goto code_r0x09216870;
    uVar5 = *(uint *)(param_5 + 0x18);
    unaff_x27 = (ulong)(uVar24 + 1);
  } while ((int)(uVar24 + 1) < (int)uVar5);
code_r0x0921686c:
  unaff_x29 = (long *)0x0;
code_r0x09216870:
  plVar16 = unaff_x29;
  uVar18 = (ulong)uStack_14c;
  auVar31._8_4_ = iStack_134;
  auVar31._0_8_ = &lStack_100;
  auVar31._12_4_ = 0;
  lStack_e8 = plStack_148[3];
  lStack_f0 = plStack_148[2];
  lStack_d8 = plStack_148[5];
  lStack_e0 = plStack_148[4];
  lStack_f8 = plStack_148[1];
  lStack_100 = *plStack_148;
  puVar29 = &UNK_0921689c;
  param_3 = unaff_x28;
  uStack_168 = uVar21;
  unaff_x29 = plVar16;
  goto code_r0x09216970;
code_r0x09216968:
  func_0x04151bc0();
  uStack_168 = uVar21;
  goto code_r0x0921696c;
  while( true ) {
    uVar18 = uVar18 - 1;
    piVar23 = piVar23 + 4;
    if (uVar18 == 0) break;
code_r0x09216c80:
    if (*(long *)(piVar23 + -2) == *(long *)PTR_DAT_09ed0110) {
      puVar9 = (undefined8 *)(uVar26 + (long)(*piVar23 + 5) * 0x10 + 0x138);
      goto code_r0x09216cb8;
    }
  }
code_r0x09216c98:
  pauVar15 = (undefined1 (*) [16])0x5;
  puVar9 = (undefined8 *)func_0x041cb4c4(pauVar13);
code_r0x09216cb8:
  plVar11 = (long *)(*(code *)*puVar9)(pauVar13,puVar9[1]);
  if (plVar11 == (long *)0x0) goto code_r0x09216f30;
  lVar8 = *plVar11;
  uVar18 = (ulong)*(ushort *)(lVar8 + 0x12e);
  if (uVar18 != 0) {
    piVar23 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
    do {
      if (*(long *)(piVar23 + -2) == *(long *)PTR_DAT_09ed0118) {
        puVar9 = (undefined8 *)(lVar8 + (long)*piVar23 * 0x10 + 0x138);
        goto code_r0x09216d20;
      }
      uVar18 = uVar18 - 1;
      piVar23 = piVar23 + 4;
    } while (uVar18 != 0);
  }
  pauVar15 = (undefined1 (*) [16])0x0;
  puVar9 = (undefined8 *)func_0x041cb4c4(plVar11);
code_r0x09216d20:
  iVar4 = (*(code *)*puVar9)(plVar11,puVar9[1]);
  uVar26 = *(ulong *)*param_3;
  uVar18 = (ulong)*(ushort *)(uVar26 + 0x12e);
  if (uVar18 != 0) {
    piVar23 = (int *)(*(long *)(uVar26 + 0xb0) + 8);
    do {
      if (*(long *)(piVar23 + -2) == *(long *)PTR_DAT_09eb5b78) {
        puVar9 = (undefined8 *)(uVar26 + (long)(*piVar23 + 2) * 0x10 + 0x138);
        goto code_r0x09216d88;
      }
      uVar18 = uVar18 - 1;
      piVar23 = piVar23 + 4;
    } while (uVar18 != 0);
  }
  pauVar15 = (undefined1 (*) [16])0x2;
  puVar9 = (undefined8 *)func_0x041cb4c4(param_3);
code_r0x09216d88:
  plVar11 = (long *)(*(code *)*puVar9)(param_3,puVar9[1]);
  if (plVar11 == (long *)0x0) goto code_r0x09216f30;
  lVar8 = *plVar11;
  uVar18 = (ulong)*(ushort *)(lVar8 + 0x12e);
  if (uVar18 != 0) {
    piVar23 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
    do {
      if (*(long *)(piVar23 + -2) == *(long *)PTR_DAT_09ed0118) {
        puVar9 = (undefined8 *)(lVar8 + (long)*piVar23 * 0x10 + 0x138);
        goto code_r0x09216df0;
      }
      uVar18 = uVar18 - 1;
      piVar23 = piVar23 + 4;
    } while (uVar18 != 0);
  }
  puVar9 = (undefined8 *)func_0x041cb4c4(plVar11,*(long *)PTR_DAT_09ed0118,0);
code_r0x09216df0:
  iVar6 = (*(code *)*puVar9)(plVar11,puVar9[1]);
  uStack_1e8 = *(ulong *)((long)pauVar10[1] + 8);
  uStack_1f0 = *(ulong *)pauVar10[1];
  uStack_1d8 = *(ulong *)((long)pauVar10[2] + 8);
  uStack_1e0 = *(ulong *)pauVar10[2];
  uStack_1f8 = *(ulong *)((long)*pauVar10 + 8);
  uStack_200 = *(ulong *)*pauVar10;
  lVar8 = *plVar28;
  uVar18 = (ulong)*(ushort *)(lVar8 + 0x12e);
  if (uVar18 != 0) {
    piVar23 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
    do {
      if (*(long *)(piVar23 + -2) == *(long *)puVar30) {
        puVar9 = (undefined8 *)(lVar8 + (long)*piVar23 * 0x10 + 0x138);
        goto code_r0x09216e5c;
      }
      uVar18 = uVar18 - 1;
      piVar23 = piVar23 + 4;
    } while (uVar18 != 0);
  }
  puVar9 = (undefined8 *)func_0x041cb4c4(plVar28,*(long *)puVar30,0);
code_r0x09216e5c:
  uVar21 = (ulong)(iVar4 == iVar6);
  uVar18 = (*(code *)*puVar9)(plVar28,puVar9[1]);
  plVar17 = (long *)(uVar18 & 0xffffffff);
  auVar32._8_8_ = param_3;
  auVar32._0_8_ = &uStack_230;
  uStack_228 = uStack_1f8;
  uStack_230 = uStack_200;
  uStack_218 = uStack_1e8;
  uStack_220 = uStack_1f0;
  uStack_208 = uStack_1d8;
  uStack_210 = uStack_1e0;
  puVar30 = &UNK_09216e98;
  goto code_r0x09216f38;
}


```

## CookingResourceCalculator.CalculateGenerateValueKitchen(CookingResourceGenerateCoefficientData coefficientData, int targetGenerateResourceId, ICookingKitchenData kitchenData, I)

```c

/* WARNING: Possible PIC construction at 0x09216e94: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09216f08: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x09216e98) */
/* WARNING: Removing unreachable block (ram,0x09216eb4) */
/* WARNING: Removing unreachable block (ram,0x09216eb8) */

undefined1  [16]
WithNetwork_CookingResourceCalculator__CalculateGenerateValueKitchen
          (undefined1 (*param_1) [16],uint param_2,undefined1 (*param_3) [16],long *param_4,
          ulong param_5)

{
  undefined *puVar1;
  ulong *puVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  long lVar7;
  undefined8 *puVar8;
  undefined1 (*pauVar9) [16];
  long *plVar10;
  undefined4 uVar6;
  undefined1 (*pauVar11) [16];
  undefined1 (*pauVar12) [16];
  undefined1 (*pauVar13) [16];
  long *plVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  int *piVar18;
  uint uVar19;
  undefined *puVar20;
  undefined *puVar21;
  undefined1 (*pauVar22) [16];
  ulong uVar23;
  long *plVar24;
  undefined *unaff_x29;
  undefined *puVar25;
  undefined1 auVar26 [16];
  undefined1 auVar27 [12];
  ulong uStack_260;
  ulong uStack_258;
  ulong uStack_250;
  ulong uStack_248;
  ulong uStack_240;
  ulong uStack_238;
  undefined8 uStack_230;
  ulong uStack_228;
  ulong uStack_220;
  ulong uStack_218;
  ulong uStack_210;
  ulong uStack_208;
  ulong uStack_200;
  ulong uStack_1f8;
  ulong uStack_1f0;
  ulong uStack_1e8;
  ulong uStack_1e0;
  ulong uStack_1d8;
  ulong uStack_1d0;
  ulong uStack_1c8;
  ulong uStack_1c0;
  ulong uStack_1b8;
  ulong uStack_1b0;
  ulong uStack_1a8;
  ulong uStack_1a0;
  ulong uStack_198;
  ulong uStack_190;
  ulong uStack_188;
  ulong uStack_180;
  ulong uStack_178;
  undefined1 auStack_170 [16];
  undefined *puStack_160;
  undefined *puStack_150;
  long *plStack_148;
  ulong uStack_140;
  undefined1 (*pauStack_138) [16];
  long *plStack_130;
  undefined1 (*pauStack_128) [16];
  undefined1 (*pauStack_120) [16];
  undefined *puStack_118;
  undefined1 auStack_110 [12];
  undefined4 uStack_104;
  ulong uStack_100;
  ulong uStack_f8;
  ulong uStack_f0;
  ulong uStack_e8;
  ulong uStack_e0;
  ulong uStack_d8;
  ulong uStack_d0;
  ulong uStack_c8;
  ulong uStack_c0;
  ulong uStack_b8;
  ulong uStack_b0;
  ulong uStack_a8;
  ulong uStack_a0;
  ulong uStack_98;
  ulong uStack_90;
  ulong uStack_88;
  ulong uStack_80;
  ulong uStack_78;
  ulong uStack_70;
  undefined1 (*pauStack_68) [16];
  
  plVar24 = (long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  puVar2 = (ulong *)auStack_110;
  uVar23 = param_5 & 0xffffffff;
  pauVar22 = (undefined1 (*) [16])(ulong)param_2;
  pauVar12 = param_3;
  plVar14 = param_4;
  uVar17 = param_5;
  if ((bRam000000000a469ae3 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09ed0110);
    func_0x0415191c(PTR_DAT_09ed0120);
    func_0x0415191c(PTR_DAT_09ed0128);
    func_0x0415191c(PTR_DAT_09ed0118);
    func_0x0415191c(PTR_DAT_09eb5b78);
    bRam000000000a469ae3 = 1;
  }
  lVar7 = *plVar24;
  if (*(int *)(lVar7 + 0xe0) == 0) {
    func_0x04151a94();
    lVar7 = *plVar24;
  }
  pauStack_68 = (undefined1 (*) [16])(*(ulong **)(lVar7 + 0xb8))[1];
  uStack_70 = **(ulong **)(lVar7 + 0xb8);
  puVar21 = (undefined *)0xa469000;
  if (param_3 != (undefined1 (*) [16])0x0) {
    uVar15 = *(ulong *)*param_3;
    uVar16 = (ulong)*(ushort *)(uVar15 + 0x12e);
    if (uVar16 != 0) {
      piVar18 = (int *)(*(long *)(uVar15 + 0xb0) + 8);
      do {
        if (*(long *)(piVar18 + -2) == *(long *)PTR_DAT_09eb5b78) {
          puVar8 = (undefined8 *)(uVar15 + (long)(*piVar18 + 9) * 0x10 + 0x138);
          goto code_r0x09216a80;
        }
        uVar16 = uVar16 - 1;
        piVar18 = piVar18 + 4;
      } while (uVar16 != 0);
    }
    pauVar12 = (undefined1 (*) [16])0x9;
    puVar8 = (undefined8 *)func_0x041cb4c4(param_3);
code_r0x09216a80:
    uVar3 = (*(code *)*puVar8)(param_3,puVar8[1]);
    puVar20 = PTR_DAT_09ed0120;
    if (uVar3 != param_2) {
code_r0x09216f0c:
      auVar26._8_8_ = pauStack_68;
      auVar26._0_8_ = uStack_70;
      return auVar26;
    }
    if (param_4 != (long *)0x0) {
      lVar7 = *param_4;
      uVar16 = (ulong)*(ushort *)(lVar7 + 0x12e);
      if (uVar16 != 0) {
        piVar18 = (int *)(*(long *)(lVar7 + 0xb0) + 8);
        do {
          if (*(long *)(piVar18 + -2) == *(long *)PTR_DAT_09ed0120) {
            puVar8 = (undefined8 *)(lVar7 + (long)(*piVar18 + 2) * 0x10 + 0x138);
            goto code_r0x09216af0;
          }
          uVar16 = uVar16 - 1;
          piVar18 = piVar18 + 4;
        } while (uVar16 != 0);
      }
      pauVar12 = (undefined1 (*) [16])0x2;
      puVar8 = (undefined8 *)func_0x041cb4c4(param_4);
code_r0x09216af0:
      pauVar9 = (undefined1 (*) [16])(*(code *)*puVar8)(param_4,puVar8[1]);
      puVar25 = PTR_DAT_09ed0128;
      puVar21 = puVar20;
      if (pauVar9 != (undefined1 (*) [16])0x0) {
        uVar15 = *(ulong *)*pauVar9;
        uVar16 = (ulong)*(ushort *)(uVar15 + 0x12e);
        if (uVar16 != 0) {
          piVar18 = (int *)(*(long *)(uVar15 + 0xb0) + 8);
          do {
            if (*(long *)(piVar18 + -2) == *(long *)PTR_DAT_09ed0128) {
              puVar8 = (undefined8 *)(uVar15 + (long)(*piVar18 + 4) * 0x10 + 0x138);
              goto code_r0x09216b5c;
            }
            uVar16 = uVar16 - 1;
            piVar18 = piVar18 + 4;
          } while (uVar16 != 0);
        }
        pauVar12 = (undefined1 (*) [16])0x4;
        puVar8 = (undefined8 *)func_0x041cb4c4(pauVar9);
code_r0x09216b5c:
        uVar16 = (*(code *)*puVar8)(pauVar9,puVar8[1]);
        if ((uVar16 & 1) == 0) goto code_r0x09216f0c;
        lVar7 = *param_4;
        uVar16 = (ulong)*(ushort *)(lVar7 + 0x12e);
        if (uVar16 != 0) {
          piVar18 = (int *)(*(long *)(lVar7 + 0xb0) + 8);
          do {
            if (*(long *)(piVar18 + -2) == *(long *)puVar20) {
              puVar8 = (undefined8 *)(lVar7 + (long)(*piVar18 + 3) * 0x10 + 0x138);
              goto code_r0x09216bbc;
            }
            uVar16 = uVar16 - 1;
            piVar18 = piVar18 + 4;
          } while (uVar16 != 0);
        }
        pauVar12 = (undefined1 (*) [16])0x3;
        puVar8 = (undefined8 *)func_0x041cb4c4(param_4);
code_r0x09216bbc:
        uStack_104 = (undefined4)param_5;
        plVar10 = (long *)(*(code *)*puVar8)(param_4,puVar8[1]);
        pauVar11 = pauStack_68;
        uVar16 = uStack_70;
        pauVar22 = pauVar9;
        unaff_x29 = puVar25;
        if (plVar10 != (long *)0x0) {
          uVar3 = *(uint *)(plVar10 + 3);
          if (0 < (int)uVar3) {
            puVar20 = (undefined *)0x0;
            do {
              uVar19 = (uint)puVar20;
              pauVar9 = pauVar12;
              param_4 = plVar10;
              pauVar22 = pauVar11;
              uVar23 = uVar16;
              if (uVar3 <= uVar19) goto code_r0x09216f34;
              plVar24 = (long *)plVar10[(long)(int)uVar19 + 4];
              puVar21 = puVar20;
              if (plVar24 == (long *)0x0) goto code_r0x09216f30;
              lVar7 = *plVar24;
              uVar15 = (ulong)*(ushort *)(lVar7 + 0x12e);
              if (uVar15 != 0) {
                piVar18 = (int *)(*(long *)(lVar7 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar18 + -2) == *(long *)puVar25) {
                    puVar8 = (undefined8 *)(lVar7 + (long)(*piVar18 + 5) * 0x10 + 0x138);
                    goto code_r0x09216c4c;
                  }
                  uVar15 = uVar15 - 1;
                  piVar18 = piVar18 + 4;
                } while (uVar15 != 0);
              }
              pauVar12 = (undefined1 (*) [16])0x5;
              puVar8 = (undefined8 *)func_0x041cb4c4(plVar24);
code_r0x09216c4c:
              pauVar9 = (undefined1 (*) [16])(*(code *)*puVar8)(plVar24,puVar8[1]);
              if (pauVar9 != (undefined1 (*) [16])0x0) {
                uVar15 = *(ulong *)*pauVar9;
                uVar16 = (ulong)*(ushort *)(uVar15 + 0x12e);
                if (uVar16 == 0) goto code_r0x09216c98;
                piVar18 = (int *)(*(long *)(uVar15 + 0xb0) + 8);
                goto code_r0x09216c80;
              }
              uVar3 = *(uint *)(plVar10 + 3);
              puVar20 = (undefined *)(ulong)(uVar19 + 1);
            } while ((int)(uVar19 + 1) < (int)uVar3);
          }
          uStack_70 = uVar16;
          pauStack_68 = pauVar11;
          auVar27._8_4_ = uStack_104;
          auVar27._0_8_ = &uStack_100;
          pauVar13 = (undefined1 (*) [16])&uStack_70;
          uStack_e8 = *(ulong *)((long)param_1[1] + 8);
          uStack_f0 = *(ulong *)param_1[1];
          uStack_d8 = *(ulong *)((long)param_1[2] + 8);
          uStack_e0 = *(ulong *)param_1[2];
          uStack_f8 = *(ulong *)((long)*param_1 + 8);
          uStack_100 = *(ulong *)*param_1;
          puVar25 = &UNK_09216f0c;
          puVar21 = puVar20;
          pauVar9 = param_1;
          pauVar12 = param_3;
          goto code_r0x09217148;
        }
      }
    }
  }
code_r0x09216f30:
  puVar20 = puVar21;
  func_0x04151bb8();
  pauVar9 = pauVar12;
code_r0x09216f34:
  puVar25 = &WithNetwork_CookingResourceCalculator__CalculateGenerateValueFormationSlot;
  auVar26 = func_0x04151bc0();
  pauVar11 = auVar26._8_8_;
  pauVar12 = auVar26._0_8_;
  goto code_r0x09216f38;
  while( true ) {
    uVar16 = uVar16 - 1;
    piVar18 = piVar18 + 4;
    if (uVar16 == 0) break;
code_r0x09216c80:
    if (*(long *)(piVar18 + -2) == *(long *)PTR_DAT_09ed0110) {
      puVar8 = (undefined8 *)(uVar15 + (long)(*piVar18 + 5) * 0x10 + 0x138);
      goto code_r0x09216cb8;
    }
  }
code_r0x09216c98:
  pauVar12 = (undefined1 (*) [16])0x5;
  puVar8 = (undefined8 *)func_0x041cb4c4(pauVar9);
code_r0x09216cb8:
  plVar10 = (long *)(*(code *)*puVar8)(pauVar9,puVar8[1]);
  if (plVar10 == (long *)0x0) goto code_r0x09216f30;
  lVar7 = *plVar10;
  uVar16 = (ulong)*(ushort *)(lVar7 + 0x12e);
  if (uVar16 != 0) {
    piVar18 = (int *)(*(long *)(lVar7 + 0xb0) + 8);
    do {
      if (*(long *)(piVar18 + -2) == *(long *)PTR_DAT_09ed0118) {
        puVar8 = (undefined8 *)(lVar7 + (long)*piVar18 * 0x10 + 0x138);
        goto code_r0x09216d20;
      }
      uVar16 = uVar16 - 1;
      piVar18 = piVar18 + 4;
    } while (uVar16 != 0);
  }
  pauVar12 = (undefined1 (*) [16])0x0;
  puVar8 = (undefined8 *)func_0x041cb4c4(plVar10);
code_r0x09216d20:
  iVar4 = (*(code *)*puVar8)(plVar10,puVar8[1]);
  uVar15 = *(ulong *)*param_3;
  uVar16 = (ulong)*(ushort *)(uVar15 + 0x12e);
  if (uVar16 != 0) {
    piVar18 = (int *)(*(long *)(uVar15 + 0xb0) + 8);
    do {
      if (*(long *)(piVar18 + -2) == *(long *)PTR_DAT_09eb5b78) {
        puVar8 = (undefined8 *)(uVar15 + (long)(*piVar18 + 2) * 0x10 + 0x138);
        goto code_r0x09216d88;
      }
      uVar16 = uVar16 - 1;
      piVar18 = piVar18 + 4;
    } while (uVar16 != 0);
  }
  pauVar12 = (undefined1 (*) [16])0x2;
  puVar8 = (undefined8 *)func_0x041cb4c4(param_3);
code_r0x09216d88:
  plVar10 = (long *)(*(code *)*puVar8)(param_3,puVar8[1]);
  if (plVar10 == (long *)0x0) goto code_r0x09216f30;
  lVar7 = *plVar10;
  uVar17 = (ulong)*(ushort *)(lVar7 + 0x12e);
  if (uVar17 != 0) {
    piVar18 = (int *)(*(long *)(lVar7 + 0xb0) + 8);
    do {
      if (*(long *)(piVar18 + -2) == *(long *)PTR_DAT_09ed0118) {
        puVar8 = (undefined8 *)(lVar7 + (long)*piVar18 * 0x10 + 0x138);
        goto code_r0x09216df0;
      }
      uVar17 = uVar17 - 1;
      piVar18 = piVar18 + 4;
    } while (uVar17 != 0);
  }
  puVar8 = (undefined8 *)func_0x041cb4c4(plVar10,*(long *)PTR_DAT_09ed0118,0);
code_r0x09216df0:
  iVar5 = (*(code *)*puVar8)(plVar10,puVar8[1]);
  uStack_88 = *(ulong *)((long)param_1[1] + 8);
  uStack_90 = *(ulong *)param_1[1];
  uStack_78 = *(ulong *)((long)param_1[2] + 8);
  uStack_80 = *(ulong *)param_1[2];
  uStack_98 = *(ulong *)((long)*param_1 + 8);
  uStack_a0 = *(ulong *)*param_1;
  lVar7 = *plVar24;
  uVar17 = (ulong)*(ushort *)(lVar7 + 0x12e);
  if (uVar17 != 0) {
    piVar18 = (int *)(*(long *)(lVar7 + 0xb0) + 8);
    do {
      if (*(long *)(piVar18 + -2) == *(long *)puVar25) {
        puVar8 = (undefined8 *)(lVar7 + (long)*piVar18 * 0x10 + 0x138);
        goto code_r0x09216e5c;
      }
      uVar17 = uVar17 - 1;
      piVar18 = piVar18 + 4;
    } while (uVar17 != 0);
  }
  puVar8 = (undefined8 *)func_0x041cb4c4(plVar24,*(long *)puVar25,0);
code_r0x09216e5c:
  uVar17 = (ulong)(iVar4 == iVar5);
  uVar16 = (*(code *)*puVar8)(plVar24,puVar8[1]);
  plVar14 = (long *)(uVar16 & 0xffffffff);
  pauVar12 = (undefined1 (*) [16])&uStack_d0;
  uStack_c8 = uStack_98;
  uStack_d0 = uStack_a0;
  uStack_b8 = uStack_88;
  uStack_c0 = uStack_90;
  uStack_a8 = uStack_78;
  uStack_b0 = uStack_80;
  puVar25 = &UNK_09216e98;
  pauVar11 = param_3;
code_r0x09216f38:
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  puVar2 = &uStack_260;
  puVar21 = (undefined *)(uVar17 & 0xffffffff);
  plVar10 = (long *)((ulong)plVar14 & 0xffffffff);
  pauVar13 = pauVar9;
  puStack_160 = unaff_x29;
  puStack_150 = puVar25;
  plStack_148 = plVar24;
  uStack_140 = uVar23;
  pauStack_138 = pauVar22;
  plStack_130 = param_4;
  pauStack_128 = param_3;
  pauStack_120 = param_1;
  puStack_118 = puVar20;
  if ((bRam000000000a469ae4 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09ed0110);
    func_0x0415191c(PTR_DAT_09eb5b78);
    bRam000000000a469ae4 = 1;
  }
  uVar23 = *(ulong *)((long)pauVar12[2] + 8);
  if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auStack_170 = func_0x09774ab0((double)(int)uVar23,0);
  uStack_188 = *(ulong *)((long)pauVar12[1] + 8);
  uStack_190 = *(ulong *)pauVar12[1];
  uStack_178 = *(ulong *)((long)pauVar12[2] + 8);
  uStack_180 = *(ulong *)pauVar12[2];
  uStack_198 = *(ulong *)((long)*pauVar12 + 8);
  uStack_1a0 = *(ulong *)*pauVar12;
  if (pauVar11 != (undefined1 (*) [16])0x0) {
    uVar16 = *(ulong *)*pauVar11;
    uVar23 = (ulong)*(ushort *)(uVar16 + 0x12e);
    if (uVar23 != 0) {
      piVar18 = (int *)(*(long *)(uVar16 + 0xb0) + 8);
      do {
        if (*(long *)(piVar18 + -2) == *(long *)PTR_DAT_09eb5b78) {
          puVar8 = (undefined8 *)(uVar16 + (long)(*piVar18 + 1) * 0x10 + 0x138);
          goto code_r0x09217034;
        }
        uVar23 = uVar23 - 1;
        piVar18 = piVar18 + 4;
      } while (uVar23 != 0);
    }
    puVar8 = (undefined8 *)func_0x041cb4c4(pauVar11,*(long *)PTR_DAT_09eb5b78,1);
code_r0x09217034:
    (*(code *)*puVar8)(&uStack_230,pauVar11,puVar8[1]);
    uStack_1c8 = uStack_198;
    uStack_1d0 = uStack_1a0;
    uStack_1b8 = uStack_188;
    uStack_1c0 = uStack_190;
    uStack_1a8 = uStack_178;
    uStack_1b0 = uStack_180;
    func_0x092171e8(&uStack_1d0,uStack_230._4_4_,auStack_170);
    uStack_1e8 = *(ulong *)((long)pauVar12[1] + 8);
    uStack_1f0 = *(ulong *)pauVar12[1];
    uStack_1d8 = *(ulong *)((long)pauVar12[2] + 8);
    uStack_1e0 = *(ulong *)pauVar12[2];
    uStack_1f8 = *(ulong *)((long)*pauVar12 + 8);
    uStack_200 = *(ulong *)*pauVar12;
    pauVar13 = &auStack_170;
    func_0x09217288(&uStack_200,(int)plVar14 == 0);
    uStack_218 = *(ulong *)((long)pauVar12[1] + 8);
    uStack_220 = *(ulong *)pauVar12[1];
    uStack_208 = *(ulong *)((long)pauVar12[2] + 8);
    uStack_210 = *(ulong *)pauVar12[2];
    uStack_228 = *(ulong *)((long)*pauVar12 + 8);
    uStack_230 = *(ulong *)*pauVar12;
    if (pauVar9 != (undefined1 (*) [16])0x0) {
      uVar16 = *(ulong *)*pauVar9;
      uVar23 = (ulong)*(ushort *)(uVar16 + 0x12e);
      if (uVar23 != 0) {
        piVar18 = (int *)(*(long *)(uVar16 + 0xb0) + 8);
        do {
          if (*(long *)(piVar18 + -2) == *(long *)PTR_DAT_09ed0110) {
            puVar8 = (undefined8 *)(uVar16 + (long)(*piVar18 + 6) * 0x10 + 0x138);
            goto code_r0x092170f4;
          }
          uVar23 = uVar23 - 1;
          piVar18 = piVar18 + 4;
        } while (uVar23 != 0);
      }
      puVar8 = (undefined8 *)func_0x041cb4c4(pauVar9,*(long *)PTR_DAT_09ed0110,6);
code_r0x092170f4:
      uVar6 = (*(code *)*puVar8)(pauVar9,puVar8[1]);
      uStack_258 = uStack_228;
      uStack_260 = uStack_230;
      uStack_248 = uStack_218;
      uStack_250 = uStack_220;
      uStack_238 = uStack_208;
      uStack_240 = uStack_210;
      func_0x09217330(&uStack_260,(uint)uVar17 & 1,uVar6,auStack_170);
      return auStack_170;
    }
  }
  puVar25 = &WithNetwork_CookingResourceCalculator__CalculateCafeLevelCoefficient;
  auVar27 = func_0x04151bb8();
code_r0x09217148:
  puVar20 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  *(undefined **)((long)puVar2 + -0x30) = puVar25;
  *(undefined1 (**) [16])((long)puVar2 + -0x28) = pauVar11;
  *(long **)((long)puVar2 + -0x20) = plVar10;
  *(undefined1 (**) [16])((long)puVar2 + -0x18) = pauVar12;
  *(undefined1 (**) [16])((long)puVar2 + -0x10) = pauVar9;
  *(undefined **)((long)puVar2 + -8) = puVar21;
  if ((bRam000000000a469ae8 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469ae8 = 1;
  }
  uVar17 = *(ulong *)*pauVar13;
  uVar23 = *(ulong *)((long)*pauVar13 + 8);
  auVar26 = WithNetwork_CookingResourceCalculator__FloatToBigDecimal
                      (*auVar27._0_8_ * (float)auVar27._8_4_ + 1.0);
  if (*(int *)(*(long *)puVar20 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar26 = func_0x097744cc(uVar17,uVar23,auVar26._0_8_,auVar26._8_8_,0);
  *pauVar13 = auVar26;
  return auVar26;
}


```

## CookingResourceCalculator.CalculateGenerateValueFormationSlot(CookingResourceGenerateCoefficientData coefficientData, ICookingKitchenData kitchenData, ICookingFormationCostumeData co)

```c

undefined1  [16]
WithNetwork_CookingResourceCalculator__CalculateGenerateValueFormationSlot
          (undefined8 *param_1,long *param_2,undefined1 (*param_3) [16],int param_4,uint param_5)

{
  undefined8 uVar1;
  undefined8 uVar2;
  int iVar3;
  undefined *puVar4;
  undefined4 uVar5;
  undefined8 *puVar6;
  undefined1 (*pauVar7) [16];
  long lVar8;
  ulong uVar9;
  int *piVar10;
  undefined1 auVar11 [16];
  undefined1 auVar12 [12];
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined1 auStack_60 [16];
  
  puVar4 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  pauVar7 = param_3;
  if ((bRam000000000a469ae4 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09ed0110);
    func_0x0415191c(PTR_DAT_09eb5b78);
    bRam000000000a469ae4 = 1;
  }
  iVar3 = *(int *)(param_1 + 5);
  if (*(int *)(*(long *)puVar4 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auStack_60 = func_0x09774ab0((double)iVar3,0);
  uStack_78 = param_1[3];
  uStack_80 = param_1[2];
  uStack_68 = param_1[5];
  uStack_70 = param_1[4];
  uStack_88 = param_1[1];
  uStack_90 = *param_1;
  if (param_2 != (long *)0x0) {
    lVar8 = *param_2;
    uVar9 = (ulong)*(ushort *)(lVar8 + 0x12e);
    if (uVar9 != 0) {
      piVar10 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
      do {
        if (*(long *)(piVar10 + -2) == *(long *)PTR_DAT_09eb5b78) {
          puVar6 = (undefined8 *)(lVar8 + (long)(*piVar10 + 1) * 0x10 + 0x138);
          goto code_r0x09217034;
        }
        uVar9 = uVar9 - 1;
        piVar10 = piVar10 + 4;
      } while (uVar9 != 0);
    }
    puVar6 = (undefined8 *)func_0x041cb4c4(param_2,*(long *)PTR_DAT_09eb5b78,1);
code_r0x09217034:
    (*(code *)*puVar6)(&uStack_120,param_2,puVar6[1]);
    uStack_b8 = uStack_88;
    uStack_c0 = uStack_90;
    uStack_a8 = uStack_78;
    uStack_b0 = uStack_80;
    uStack_98 = uStack_68;
    uStack_a0 = uStack_70;
    func_0x092171e8(&uStack_c0,uStack_120._4_4_,auStack_60);
    uStack_d8 = param_1[3];
    uStack_e0 = param_1[2];
    uStack_c8 = param_1[5];
    uStack_d0 = param_1[4];
    uStack_e8 = param_1[1];
    uStack_f0 = *param_1;
    pauVar7 = &auStack_60;
    func_0x09217288(&uStack_f0,param_4 == 0);
    uStack_108 = param_1[3];
    uStack_110 = param_1[2];
    uStack_f8 = param_1[5];
    uStack_100 = param_1[4];
    uStack_118 = param_1[1];
    uStack_120 = *param_1;
    if (param_3 != (undefined1 (*) [16])0x0) {
      lVar8 = *(long *)*param_3;
      uVar9 = (ulong)*(ushort *)(lVar8 + 0x12e);
      if (uVar9 != 0) {
        piVar10 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
        do {
          if (*(long *)(piVar10 + -2) == *(long *)PTR_DAT_09ed0110) {
            puVar6 = (undefined8 *)(lVar8 + (long)(*piVar10 + 6) * 0x10 + 0x138);
            goto code_r0x092170f4;
          }
          uVar9 = uVar9 - 1;
          piVar10 = piVar10 + 4;
        } while (uVar9 != 0);
      }
      puVar6 = (undefined8 *)func_0x041cb4c4(param_3,*(long *)PTR_DAT_09ed0110,6);
code_r0x092170f4:
      uVar5 = (*(code *)*puVar6)(param_3,puVar6[1]);
      uStack_148 = uStack_118;
      uStack_150 = uStack_120;
      uStack_138 = uStack_108;
      uStack_140 = uStack_110;
      uStack_128 = uStack_f8;
      uStack_130 = uStack_100;
      func_0x09217330(&uStack_150,param_5 & 1,uVar5,auStack_60);
      return auStack_60;
    }
  }
  auVar12 = func_0x04151bb8();
  puVar4 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a469ae8 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469ae8 = 1;
  }
  uVar1 = *(undefined8 *)*pauVar7;
  uVar2 = *(undefined8 *)(*pauVar7 + 8);
  auVar11 = WithNetwork_CookingResourceCalculator__FloatToBigDecimal
                      (*auVar12._0_8_ * (float)auVar12._8_4_ + 1.0);
  if (*(int *)(*(long *)puVar4 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar11 = func_0x097744cc(uVar1,uVar2,auVar11._0_8_,auVar11._8_8_,0);
  *pauVar7 = auVar11;
  return auVar11;
}


```

## CookingResourceCalculator.ApplyCafeEffectCoefficient(CookingResourceGenerateCoefficientData coefficientData, bool isActiveBoost, bool isActiveResourceAcquireBuff, ref BigDec)

```c

void WithNetwork_CookingResourceCalculator__ApplyCafeEffectCoefficient
               (undefined8 *param_1,uint param_2,uint param_3,undefined8 param_4)

{
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  uStack_38 = param_1[3];
  uStack_40 = param_1[2];
  uStack_28 = param_1[5];
  uStack_30 = param_1[4];
  uStack_48 = param_1[1];
  uStack_50 = *param_1;
  func_0x09217460(&uStack_50,param_2 & 1,param_4);
  uStack_68 = param_1[3];
  uStack_70 = param_1[2];
  uStack_58 = param_1[5];
  uStack_60 = param_1[4];
  uStack_78 = param_1[1];
  uStack_80 = *param_1;
  func_0x0921751c(&uStack_80,param_3 & 1,param_4);
  return;
}


```

## CookingResourceCalculator.ApplyKitchenLevelCoefficient(CookingResourceGenerateCoefficientData coefficientData, int kitchenLevel, ref BigDecimal targetValue)

```c

void WithNetwork_CookingResourceCalculator__ApplyKitchenLevelCoefficient
               (long param_1,int param_2,undefined1 (*param_3) [16])

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined1 auVar4 [16];
  
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a469ae5 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469ae5 = 1;
  }
  uVar1 = *(undefined8 *)*param_3;
  uVar2 = *(undefined8 *)(*param_3 + 8);
  auVar4 = WithNetwork_CookingResourceCalculator__FloatToBigDecimal
                     (*(float *)(param_1 + 4) * (float)param_2 + 1.0);
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar4 = func_0x097744cc(uVar1,uVar2,auVar4._0_8_,auVar4._8_8_,0);
  *param_3 = auVar4;
  return;
}


```

## CookingResourceCalculator.ApplyFormationSlotCoefficient(CookingResourceGenerateCoefficientData coefficientData, bool isMainSlot, ref BigDecimal targetValue)

```c

void WithNetwork_CookingResourceCalculator__ApplyFormationSlotCoefficient
               (long param_1,ulong param_2,undefined1 (*param_3) [16])

{
  long lVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined *puVar4;
  undefined1 auVar5 [16];
  
  puVar4 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a469ae6 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469ae6 = 1;
  }
  lVar1 = 0x18;
  if ((param_2 & 1) == 0) {
    lVar1 = 0x1c;
  }
  uVar2 = *(undefined8 *)*param_3;
  uVar3 = *(undefined8 *)(*param_3 + 8);
  auVar5 = WithNetwork_CookingResourceCalculator__FloatToBigDecimal
                     (*(undefined4 *)(param_1 + lVar1));
  if (*(int *)(*(long *)puVar4 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar5 = func_0x097744cc(uVar2,uVar3,auVar5._0_8_,auVar5._8_8_,0);
  *param_3 = auVar5;
  return;
}


```

## CookingResourceCalculator.ApplyCharacterCoefficient(CookingResourceGenerateCoefficientData coefficientData, bool isGenreMatch, Rarity targetRarity, ref BigDecimal targetVal)

```c

void WithNetwork_CookingResourceCalculator__ApplyCharacterCoefficient
               (long param_1,ulong param_2,undefined1 (*param_3) [16],undefined1 (*param_4) [16])

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined8 *puVar4;
  long lVar5;
  ulong uVar6;
  int *piVar7;
  ulong uVar8;
  long *plVar9;
  float fVar10;
  float fVar11;
  undefined1 auVar12 [16];
  
  uVar8 = (ulong)param_3 & 0xffffffff;
  if ((bRam000000000a469ae7 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f48230);
    bRam000000000a469ae7 = 1;
  }
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  fVar11 = 0.0;
  if ((param_2 & 1) != 0) {
    fVar11 = *(float *)(param_1 + 8) + 0.0;
  }
  plVar9 = *(long **)(param_1 + 0x10);
  if (plVar9 == (long *)0x0) {
    auVar12 = func_0x04151bb8();
    if ((bRam000000000a469ae9 & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      bRam000000000a469ae9 = 1;
    }
    puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    uVar1 = *(undefined8 *)*param_3;
    uVar2 = *(undefined8 *)(*param_3 + 8);
    if ((auVar12._8_8_ & 1) == 0) {
      if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
        func_0x04151a94();
      }
      auVar12 = func_0x09774ab0(0x3ff0000000000000,0);
    }
    else {
      auVar12 = WithNetwork_CookingResourceCalculator__FloatToBigDecimal
                          (*(undefined4 *)(auVar12._0_8_ + 0x20));
    }
    if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
      func_0x04151a94();
    }
    auVar12 = func_0x097744cc(uVar1,uVar2,auVar12._0_8_,auVar12._8_8_,0);
    *param_3 = auVar12;
    return;
  }
  lVar5 = *plVar9;
  uVar6 = (ulong)*(ushort *)(lVar5 + 0x12e);
  if (uVar6 != 0) {
    piVar7 = (int *)(*(long *)(lVar5 + 0xb0) + 8);
    do {
      if (*(long *)(piVar7 + -2) == *(long *)PTR_DAT_09f48230) {
        puVar4 = (undefined8 *)(lVar5 + (long)(*piVar7 + 2) * 0x10 + 0x138);
        goto code_r0x092173f8;
      }
      uVar6 = uVar6 - 1;
      piVar7 = piVar7 + 4;
    } while (uVar6 != 0);
  }
  puVar4 = (undefined8 *)func_0x041cb4c4(plVar9,*(long *)PTR_DAT_09f48230,2);
code_r0x092173f8:
  fVar10 = (float)(*(code *)*puVar4)(plVar9,uVar8,puVar4[1]);
  uVar1 = *(undefined8 *)*param_4;
  uVar2 = *(undefined8 *)(*param_4 + 8);
  auVar12 = WithNetwork_CookingResourceCalculator__FloatToBigDecimal(fVar11 + fVar10);
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar12 = func_0x097744cc(uVar1,uVar2,auVar12._0_8_,auVar12._8_8_,0);
  *param_4 = auVar12;
  return;
}


```

## CookingResourceCalculator.CalculateCafeLevelCoefficient(CookingResourceGenerateCoefficientData coefficientData, int cafeLevel, ref BigDecimal targetValue)

```c

void WithNetwork_CookingResourceCalculator__CalculateCafeLevelCoefficient
               (float *param_1,int param_2,undefined1 (*param_3) [16])

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined1 auVar4 [16];
  
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a469ae8 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469ae8 = 1;
  }
  uVar1 = *(undefined8 *)*param_3;
  uVar2 = *(undefined8 *)(*param_3 + 8);
  auVar4 = WithNetwork_CookingResourceCalculator__FloatToBigDecimal(*param_1 * (float)param_2 + 1.0)
  ;
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar4 = func_0x097744cc(uVar1,uVar2,auVar4._0_8_,auVar4._8_8_,0);
  *param_3 = auVar4;
  return;
}


```

## CookingResourceCalculator.CalculateBoostCoefficient(CookingResourceGenerateCoefficientData coefficientData, bool isActiveBoost, ref BigDecimal targetValue)

```c

void WithNetwork_CookingResourceCalculator__CalculateBoostCoefficient
               (long param_1,ulong param_2,undefined1 (*param_3) [16])

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined1 auVar4 [16];
  
  if ((bRam000000000a469ae9 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469ae9 = 1;
  }
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  uVar1 = *(undefined8 *)*param_3;
  uVar2 = *(undefined8 *)(*param_3 + 8);
  if ((param_2 & 1) == 0) {
    if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
      func_0x04151a94();
    }
    auVar4 = func_0x09774ab0(0x3ff0000000000000,0);
  }
  else {
    auVar4 = WithNetwork_CookingResourceCalculator__FloatToBigDecimal
                       (*(undefined4 *)(param_1 + 0x20));
  }
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar4 = func_0x097744cc(uVar1,uVar2,auVar4._0_8_,auVar4._8_8_,0);
  *param_3 = auVar4;
  return;
}


```

## CookingResourceCalculator.CalculateResourceAcquireBuffCoefficient(CookingResourceGenerateCoefficientData coefficientData, bool isPaymentPack, ref BigDecimal targetValue)

```c

void WithNetwork_CookingResourceCalculator__CalculateResourceAcquireBuffCoefficient
               (long param_1,ulong param_2,undefined1 (*param_3) [16])

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined1 auVar4 [16];
  
  if ((bRam000000000a469aea & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469aea = 1;
  }
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  uVar1 = *(undefined8 *)*param_3;
  uVar2 = *(undefined8 *)(*param_3 + 8);
  if ((param_2 & 1) == 0) {
    if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
      func_0x04151a94();
    }
    auVar4 = func_0x09774ab0(0x3ff0000000000000,0);
  }
  else {
    auVar4 = WithNetwork_CookingResourceCalculator__FloatToBigDecimal
                       (*(float *)(param_1 + 0x24) + 1.0);
  }
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar4 = func_0x097744cc(uVar1,uVar2,auVar4._0_8_,auVar4._8_8_,0);
  *param_3 = auVar4;
  return;
}


```

## HpValue.GetCalculateValue()

```c

/* WARNING: Possible PIC construction at 0x09269d04: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x09269d08) */
/* WARNING: Removing unreachable block (ram,0x09269d4c) */
/* WARNING: Removing unreachable block (ram,0x09269d24) */
/* WARNING: Removing unreachable block (ram,0x09269d30) */
/* WARNING: Removing unreachable block (ram,0x09269d34) */

undefined1  [16] WithNetwork_HpValue__GetCalculateValue(long param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined1 auVar4 [16];
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined *puStack_40;
  
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a469ec0 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469ec0 = 1;
  }
  auVar4 = func_0x09269bf4(param_1);
  uVar1 = *(undefined8 *)(param_1 + 0x50);
  uVar2 = *(undefined8 *)(param_1 + 0x58);
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  func_0x09774dd8(auVar4._0_8_,auVar4._8_8_,uVar1,uVar2,0);
  uStack_48 = 0;
  puStack_40 = &UNK_09269d08;
  uStack_50 = 0;
  func_0x09773dcc(0,&uStack_50,0);
  auVar4._8_8_ = uStack_48;
  auVar4._0_8_ = uStack_50;
  return auVar4;
}


```

## HpValue.AddStatusUpRate(BigDecimal rate)

```c

void WithNetwork_HpValue__AddStatusUpRate(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined1 auVar4 [16];
  
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a469ec1 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469ec1 = 1;
  }
  uVar1 = *(undefined8 *)(param_1 + 0x30);
  uVar2 = *(undefined8 *)(param_1 + 0x38);
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar4 = func_0x09774360(uVar1,uVar2,param_2,param_3,0);
  *(undefined1 (*) [16])(param_1 + 0x30) = auVar4;
  return;
}


```

## HpValue.AddStatusUpValue(BigDecimal value)

```c

void WithNetwork_HpValue__AddStatusUpValue(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined1 auVar4 [16];
  
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a469ec2 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469ec2 = 1;
  }
  uVar1 = *(undefined8 *)(param_1 + 0x40);
  uVar2 = *(undefined8 *)(param_1 + 0x48);
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar4 = func_0x09774360(uVar1,uVar2,param_2,param_3,0);
  *(undefined1 (*) [16])(param_1 + 0x40) = auVar4;
  return;
}


```

## ArmorStatusCalculator.CalculateStatus(DataTableContainer dataTableContainer, StatusType statusType, HuntBaseStatusCalculateType calculateType, int id)

```c

/* WARNING: Possible PIC construction at 0x0984c2d4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0984c41c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0984c4c0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0984c420) */
/* WARNING: Removing unreachable block (ram,0x0984c43c) */
/* WARNING: Removing unreachable block (ram,0x0984c460) */
/* WARNING: Removing unreachable block (ram,0x0984c468) */
/* WARNING: Removing unreachable block (ram,0x0984c490) */
/* WARNING: Removing unreachable block (ram,0x0984c474) */
/* WARNING: Removing unreachable block (ram,0x0984c480) */
/* WARNING: Removing unreachable block (ram,0x0984c4a0) */
/* WARNING: Removing unreachable block (ram,0x0984c2d8) */
/* WARNING: Removing unreachable block (ram,0x0984c4c4) */
/* WARNING: Removing unreachable block (ram,0x0984c4d8) */
/* WARNING: Removing unreachable block (ram,0x0984c4dc) */

undefined1  [16]
WithNetwork_ArmorStatusCalculator__CalculateStatus
          (undefined8 param_1,undefined8 param_2,int param_3,ulong param_4)

{
  uint uVar1;
  undefined4 uVar2;
  undefined1 auVar3 [16];
  undefined *puVar4;
  undefined **ppuVar5;
  undefined4 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  long lVar9;
  long lVar10;
  undefined8 *puVar11;
  long *plVar12;
  long lVar13;
  long *plVar14;
  undefined4 extraout_w1;
  long *plVar15;
  ulong uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined *extraout_x8;
  int *piVar19;
  undefined8 *extraout_x8_00;
  undefined1 (*pauVar20) [16];
  ulong uVar21;
  int *piVar22;
  long *plVar23;
  long lVar24;
  undefined *puVar25;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  ulong unaff_x27;
  undefined *unaff_x28;
  long *unaff_x29;
  undefined *puVar26;
  undefined *puVar27;
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined1 auVar37 [12];
  undefined1 auVar38 [16];
  undefined1 auStack_280 [8];
  long lStack_278;
  undefined8 uStack_270;
  undefined8 uStack_268;
  long lStack_260;
  long lStack_258;
  undefined8 uStack_250;
  undefined8 uStack_248;
  undefined8 uStack_240;
  undefined8 uStack_238;
  undefined8 uStack_230;
  undefined8 uStack_228;
  long lStack_220;
  undefined8 uStack_218;
  undefined8 uStack_210;
  undefined8 uStack_208;
  undefined8 uStack_200;
  undefined8 uStack_1f8;
  long lStack_1f0;
  undefined8 uStack_1e8;
  undefined8 uStack_1e0;
  undefined8 uStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  long *plStack_1b0;
  undefined *puStack_1a8;
  undefined *puStack_1a0;
  ulong uStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  long *plStack_178;
  undefined1 auStack_170 [16];
  long *plStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined *puStack_90;
  int aiStack_40 [8];
  
  auVar30._8_8_ = unaff_x25;
  auVar30._0_8_ = unaff_x24;
  auVar29._8_8_ = param_2;
  auVar29._0_8_ = param_1;
  piVar19 = aiStack_40;
  if (param_3 == 2) {
    uVar16 = param_4 & 0xffffffff;
    puVar26 = &UNK_0984c2d8;
  }
  else {
    aiStack_40[0] = param_3;
    uVar7 = func_0x04151930(PTR_DAT_09edb230);
    uVar7 = func_0x04151a9c(uVar7,aiStack_40);
    uVar8 = func_0x04151930(PTR_DAT_09f7f9a0);
    uVar7 = func_0x084656c4(uVar8,uVar7,0);
    func_0x04151930(PTR_DAT_09eadfb8);
    uVar8 = func_0x04151ba8();
    uVar16 = 0;
    func_0x085befc4(uVar8,uVar7);
    uVar7 = func_0x04151930(PTR_Method_WithNetwork_ArmorStatusCalculator_CalculateStatus___09f7f9a8)
    ;
    puVar26 = &WithNetwork_ArmorStatusCalculator__CalculatePercentStatus;
    auVar29 = func_0x04151a84(uVar8,uVar7);
    piVar19 = (int *)extraout_x8;
  }
  lVar10 = auVar29._0_8_;
  ppuVar5 = &puStack_90;
  plVar23 = (long *)(uVar16 & 0xffffffff);
  uVar16 = auVar29._8_8_ & 0xffffffff;
  puStack_90 = puVar26;
  if ((bRam000000000a46e1e0 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f4b440);
    func_0x0415191c(PTR_DAT_09f7f9b0);
    func_0x0415191c(PTR_DAT_09f4b430);
    func_0x0415191c(PTR_DAT_09f48a60);
    bRam000000000a46e1e0 = 1;
  }
  puVar25 = PTR_DAT_09f7f9b0;
  puVar26 = PTR_DAT_09f4b430;
  if (lVar10 == 0) {
    auVar29 = func_0x04151bb8();
    puVar26 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    plVar14 = auVar29._8_8_;
    plVar23 = auVar29._0_8_;
    uVar7 = 3;
    auVar31._8_8_ = 0xa46e000;
    auVar31._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if ((bRam000000000a46e1de & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(PTR_DAT_09f470e0);
      func_0x0415191c(PTR_DAT_09f46a98);
      func_0x0415191c(PTR_DAT_09ec4a50);
      bRam000000000a46e1de = 1;
    }
    lVar10 = *(long *)puVar26;
    uStack_108 = 0;
    uStack_110 = 0;
    uStack_f8 = 0;
    uStack_100 = 0;
    uStack_118 = 0;
    uStack_120 = 0;
    if (*(int *)(lVar10 + 0xe0) == 0) {
      func_0x04151a94();
      lVar10 = *(long *)puVar26;
    }
    auVar38._8_8_ = param_4;
    auVar38._0_8_ = uVar7;
    uVar8 = 0;
    puVar26 = unaff_x28;
    plVar15 = unaff_x29;
    if (plVar23 != (long *)0x0) {
      pauVar20 = *(undefined1 (**) [16])(lVar10 + 0xb8);
      lVar10 = *plVar23;
      auVar31 = *pauVar20;
      auVar32 = *pauVar20;
      auVar29 = *pauVar20;
      uVar16 = (ulong)*(ushort *)(lVar10 + 0x12e);
      if (uVar16 != 0) {
        piVar19 = (int *)(*(long *)(lVar10 + 0xb0) + 8);
        do {
          if (*(long *)(piVar19 + -2) == *(long *)PTR_DAT_09f46a98) {
            puVar11 = (undefined8 *)(lVar10 + (long)(*piVar19 + 7) * 0x10 + 0x138);
            goto code_r0x0984c648;
          }
          uVar16 = uVar16 - 1;
          piVar19 = piVar19 + 4;
        } while (uVar16 != 0);
      }
      uVar7 = 7;
      puVar11 = (undefined8 *)func_0x041cb4c4(plVar23);
code_r0x0984c648:
      plVar12 = (long *)(*(code *)*puVar11)(plVar23,puVar11[1]);
      puVar27 = PTR_DAT_09f470e0;
      puVar25 = PTR_DAT_09ec4a50;
      auVar38._8_8_ = param_4;
      auVar38._0_8_ = uVar7;
      if (plVar12 != (long *)0x0) {
        if (0 < (int)plVar12[3]) {
          unaff_x27 = 0;
          uVar16 = plVar12[3] & 0xffffffff;
          uVar8 = 0x38;
          auVar29 = auVar32;
          do {
            uVar7 = auVar38._8_8_;
            plVar23 = plVar12;
            puVar26 = puVar27;
            plVar15 = (long *)puVar25;
            if (uVar16 <= unaff_x27) goto code_r0x0984c7d8;
            if (*(char *)((long)plVar12 + unaff_x27 * 0x38 + 0x4c) != '\0') {
              auVar31 = auVar29;
              if ((plVar12[unaff_x27 * 7 + 4] == 0) || (plVar14 == (long *)0x0))
              goto code_r0x0984c7d4;
              lVar10 = *plVar14;
              uVar1 = *(uint *)(plVar12 + unaff_x27 * 7 + 6);
              uVar6 = *(undefined4 *)(plVar12[unaff_x27 * 7 + 4] + 0x38);
              auVar30._8_4_ = uVar6;
              auVar30._0_8_ = CONCAT44(0,uVar1);
              auVar30._12_4_ = 0;
              uVar16 = (ulong)*(ushort *)(lVar10 + 0x12e);
              if (uVar16 != 0) {
                piVar19 = (int *)(*(long *)(lVar10 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar19 + -2) == *(long *)puVar27) {
                    puVar11 = (undefined8 *)(lVar10 + (long)(*piVar19 + 6) * 0x10 + 0x138);
                    goto code_r0x0984c6fc;
                  }
                  uVar16 = uVar16 - 1;
                  piVar19 = piVar19 + 4;
                } while (uVar16 != 0);
              }
              puVar11 = (undefined8 *)func_0x041cb4c4(plVar14,*(long *)puVar27,6);
code_r0x0984c6fc:
              uVar18 = puVar11[1];
              (*(code *)*puVar11)(&uStack_150,plVar14,uVar6);
              uStack_118 = uStack_148;
              uStack_120 = uStack_150;
              uStack_108 = uStack_138;
              uStack_110 = uStack_140;
              uStack_f8 = uStack_128;
              uStack_100 = uStack_130;
              if (*(int *)(*(long *)puVar25 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar38._8_8_ = uVar7;
              auVar38._0_8_ = uVar18;
              if ((int)uStack_108 == 3) {
                if (*(int *)(*(long *)puVar25 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar30 = func_0x091dc794(&uStack_120,CONCAT44(0,uVar1),0);
                if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar38 = auVar30;
                auVar29 = func_0x09774360(auVar29._0_8_,auVar29._8_8_,auVar30._0_8_,auVar30._8_8_,0)
                ;
              }
            }
            uVar16 = (ulong)*(uint *)(plVar12 + 3);
            unaff_x27 = unaff_x27 + 1;
          } while ((long)unaff_x27 < (long)(int)*(uint *)(plVar12 + 3));
        }
        return auVar29;
      }
    }
code_r0x0984c7d4:
    auVar29 = auVar31;
    func_0x04151bb8();
code_r0x0984c7d8:
    auVar31 = func_0x04151bc0();
    puVar25 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    auVar32._8_8_ = unaff_x27;
    auVar32._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar24 = auVar38._8_8_;
    lVar10 = auVar38._0_8_;
    lVar9 = auVar31._8_8_;
    plVar12 = auVar31._0_8_;
    ppuVar5 = (undefined **)auStack_280;
    puStack_1a8 = &
                  WithNetwork_ArmorStatusCalculator__CalculatePredictedTotalArmorHpPossessionEffectValue
    ;
    uStack_158 = 3;
    unaff_x29 = &lStack_1f0;
    plStack_1b0 = plVar15;
    puStack_1a0 = puVar26;
    uStack_198 = unaff_x27;
    uStack_190 = uVar8;
    plStack_178 = plVar23;
    plStack_160 = plVar14;
    auStack_170 = auVar29;
    if ((bRam000000000a46e1df & 1) == 0) {
      uStack_188 = auVar30._8_8_;
      uStack_180 = auVar30._0_8_;
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(PTR_DAT_09eaa288);
      func_0x0415191c(PTR_DAT_09f7f9b8);
      func_0x0415191c(PTR_DAT_09f7f9c0);
      func_0x0415191c(PTR_DAT_09eaa8d0);
      func_0x0415191c(PTR_DAT_09ec4a50);
      auVar30._8_8_ = uStack_188;
      auVar30._0_8_ = uStack_180;
      bRam000000000a46e1df = 1;
    }
    uStack_188 = auVar30._8_8_;
    uStack_180 = auVar30._0_8_;
    lVar13 = *(long *)puVar25;
    uStack_1c0 = 0;
    uStack_1c8 = 0;
    uStack_1d0 = 0;
    uStack_1e8 = 0;
    lStack_1f0 = 0;
    uStack_1d8 = 0;
    uStack_1e0 = 0;
    uStack_208 = 0;
    uStack_210 = 0;
    uStack_1f8 = 0;
    uStack_200 = 0;
    uStack_218 = 0;
    lStack_220 = 0;
    if (*(int *)(lVar13 + 0xe0) == 0) {
      func_0x04151a94();
      auVar30._8_8_ = uStack_188;
      auVar30._0_8_ = uStack_180;
      lVar13 = *(long *)puVar25;
    }
    uStack_188 = auVar30._8_8_;
    uStack_180 = auVar30._0_8_;
    uVar7 = auVar38._8_8_;
    plVar23 = (long *)0x0;
    piVar19 = (int *)(undefined *)0xa46e000;
    unaff_x28 = puVar26;
    if (plVar12 == (long *)0x0) {
code_r0x0984cbd0:
      uStack_188 = auVar30._8_8_;
      uStack_180 = auVar30._0_8_;
      func_0x04151bb8();
      puVar25 = (undefined *)piVar19;
      puVar26 = unaff_x28;
    }
    else {
      pauVar20 = *(undefined1 (**) [16])(lVar13 + 0xb8);
      lVar13 = *plVar12;
      uVar8 = *(undefined8 *)*pauVar20;
      auVar32._0_8_ = uVar8;
      uVar18 = *(undefined8 *)(*pauVar20 + 8);
      auVar33 = *pauVar20;
      uVar16 = (ulong)*(ushort *)(lVar13 + 0x12e);
      if (uVar16 != 0) {
        piVar19 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
        do {
          if (*(long *)(piVar19 + -2) == *(long *)PTR_DAT_09f7f9b8) {
            puVar11 = (undefined8 *)(lVar13 + (long)*piVar19 * 0x10 + 0x138);
            goto code_r0x0984c908;
          }
          uVar16 = uVar16 - 1;
          piVar19 = piVar19 + 4;
        } while (uVar16 != 0);
      }
      uVar17 = 0;
      puVar11 = (undefined8 *)func_0x041cb4c4(plVar12);
      auVar30._8_8_ = uStack_188;
      auVar30._0_8_ = uStack_180;
      auVar38._8_8_ = uVar7;
      auVar38._0_8_ = uVar17;
code_r0x0984c908:
      uStack_188 = auVar30._8_8_;
      uStack_180 = auVar30._0_8_;
      lStack_260 = lVar10;
      plVar23 = (long *)(*(code *)*puVar11)(plVar12,puVar11[1]);
      piVar19 = (int *)PTR_DAT_09f7f9c0;
      unaff_x28 = PTR_DAT_09eaa8d0;
      puVar25 = (undefined *)0xa46e000;
      if (plVar23 != (long *)0x0) {
code_r0x0984c938:
        uStack_268 = uVar8;
        uStack_270 = uVar18;
        uVar7 = auVar38._8_8_;
        lVar10 = *plVar23;
        uVar16 = (ulong)*(ushort *)(lVar10 + 0x12e);
        if (uVar16 != 0) {
          piVar22 = (int *)(*(long *)(lVar10 + 0xb0) + 8);
          do {
            if (*(long *)(piVar22 + -2) == *(long *)unaff_x28) {
              puVar11 = (undefined8 *)(lVar10 + (long)*piVar22 * 0x10 + 0x138);
              goto code_r0x0984c984;
            }
            uVar16 = uVar16 - 1;
            piVar22 = piVar22 + 4;
          } while (uVar16 != 0);
        }
        uVar8 = 0;
        puVar11 = (undefined8 *)func_0x041cb4c4(plVar23);
        auVar38._8_8_ = uVar7;
        auVar38._0_8_ = uVar8;
code_r0x0984c984:
        uVar16 = (*(code *)*puVar11)(plVar23,puVar11[1]);
        uVar7 = auVar38._8_8_;
        if ((uVar16 & 1) == 0) {
          lVar24 = 0;
          goto code_r0x0984cb34;
        }
        lVar10 = *plVar23;
        uVar16 = (ulong)*(ushort *)(lVar10 + 0x12e);
        if (uVar16 != 0) {
          piVar22 = (int *)(*(long *)(lVar10 + 0xb0) + 8);
          do {
            if (*(long *)(piVar22 + -2) == *(long *)piVar19) {
              puVar11 = (undefined8 *)(lVar10 + (long)*piVar22 * 0x10 + 0x138);
              goto code_r0x0984c9e0;
            }
            uVar16 = uVar16 - 1;
            piVar22 = piVar22 + 4;
          } while (uVar16 != 0);
        }
        uVar8 = 0;
        puVar11 = (undefined8 *)func_0x041cb4c4(plVar23);
        auVar38._8_8_ = uVar7;
        auVar38._0_8_ = uVar8;
code_r0x0984c9e0:
        (*(code *)*puVar11)(&lStack_258,plVar23,puVar11[1]);
        uStack_1e8 = uStack_250;
        lStack_1f0 = lStack_258;
        uStack_1d8 = uStack_240;
        uStack_1e0 = uStack_248;
        uStack_1c8 = uStack_230;
        uStack_1d0 = uStack_238;
        uStack_1c0 = uStack_228;
        uVar16 = func_0x091baf10(&lStack_1f0,0);
        uVar7 = auVar38._8_8_;
        if (lVar24 != 0) {
          uVar8 = *(undefined8 *)(lVar24 + 0x28);
          uVar16 = (**(code **)(lVar24 + 0x18))(*(undefined8 *)(lVar24 + 0x40));
          auVar38._8_8_ = uVar7;
          auVar38._0_8_ = uVar8;
          uVar18 = uStack_270;
          uVar8 = uStack_268;
          if ((uVar16 & 1) != 0) {
            if (lStack_1f0 == 0) goto code_r0x0984cbc8;
            if (lVar9 == 0) goto code_r0x0984cbcc;
            uVar17 = *(undefined8 *)(lVar9 + 0x28);
            (**(code **)(lVar9 + 0x18))
                      (&lStack_258,*(undefined8 *)(lVar9 + 0x40),*(undefined4 *)(lStack_1f0 + 0x38))
            ;
            uStack_218 = uStack_250;
            lStack_220 = lStack_258;
            uStack_208 = uStack_240;
            uStack_210 = uStack_248;
            uStack_1f8 = uStack_230;
            uStack_200 = uStack_238;
            if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar38._8_8_ = uVar7;
            auVar38._0_8_ = uVar17;
            uVar18 = uStack_270;
            uVar8 = uStack_268;
            if ((int)uStack_208 == 3) {
              uVar16 = func_0x091baf10(&lStack_1f0,0);
              auVar38._8_8_ = uVar7;
              auVar38._0_8_ = uVar17;
              auVar34._8_8_ = uVar16 & 0xffffffff;
              auVar34._0_8_ = uVar16;
              if (lStack_260 == 0) goto code_r0x0984cbe4;
              lStack_278 = auVar33._8_8_;
              uVar6 = (**(code **)(lStack_260 + 0x18))
                                (*(undefined8 *)(lStack_260 + 0x40),uVar16 & 0xffffffff,
                                 *(undefined8 *)(lStack_260 + 0x28));
              if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar32 = func_0x091dc794(&lStack_220,uVar6,0);
              if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar38 = auVar32;
              auVar33 = func_0x09774360(auVar33._0_8_,lStack_278,auVar32._0_8_,auVar32._8_8_,0);
              uVar18 = uStack_270;
              uVar8 = uStack_268;
            }
          }
          goto code_r0x0984c938;
        }
        func_0x04151bb8(uVar16,uVar16 & 0xffffffff);
code_r0x0984cbc8:
        func_0x04151bb8();
code_r0x0984cbcc:
        func_0x04151bb8();
        auVar30._8_8_ = uStack_188;
        auVar30._0_8_ = uStack_180;
        goto code_r0x0984cbd0;
      }
    }
    unaff_x28 = puVar26;
    piVar19 = (int *)puVar25;
    uVar7 = auVar32._0_8_;
    func_0x04151bb8();
    while( true ) {
      auVar34 = func_0x04151bb0(lVar24);
      auVar33._8_8_ = lStack_278;
      auVar33._0_8_ = uVar7;
code_r0x0984cbe4:
      lStack_278 = auVar33._8_8_;
      uVar16 = auVar33._0_8_;
      unaff_x27 = auVar32._8_8_;
      uVar7 = auVar32._0_8_;
      auVar37 = func_0x04151bb8(auVar34._0_8_,auVar34._8_8_);
      lVar10 = lStack_278;
      uVar8 = auVar38._8_8_;
      auVar33._8_8_ = lStack_278;
      auVar33._0_8_ = uVar16;
      puVar26 = auVar37._0_8_;
      if (auVar37._8_4_ != 1) break;
      plVar14 = (long *)func_0x098f6de0(puVar26);
      lVar24 = *plVar14;
      func_0x098f6df0();
code_r0x0984cb34:
      uVar8 = auVar38._8_8_;
      uVar7 = auVar33._0_8_;
      if (plVar23 != (long *)0x0) {
        lVar10 = *plVar23;
        uVar16 = (ulong)*(ushort *)(lVar10 + 0x12e);
        if (uVar16 != 0) {
          piVar22 = (int *)(*(long *)(lVar10 + 0xb0) + 8);
          do {
            if (*(long *)(piVar22 + -2) == *(long *)PTR_DAT_09eaa288) {
              puVar11 = (undefined8 *)(lVar10 + (long)*piVar22 * 0x10 + 0x138);
              goto code_r0x0984cb8c;
            }
            uVar16 = uVar16 - 1;
            piVar22 = piVar22 + 4;
          } while (uVar16 != 0);
        }
        uVar18 = 0;
        puVar11 = (undefined8 *)func_0x041cb4c4(plVar23);
        auVar38._8_8_ = uVar8;
        auVar38._0_8_ = uVar18;
code_r0x0984cb8c:
        (*(code *)*puVar11)(plVar23,puVar11[1]);
      }
      if (lVar24 == 0) {
        return auVar33;
      }
    }
    puVar25 = (undefined *)0x0;
    if (plVar23 != (long *)0x0) {
      lVar24 = *plVar23;
      uVar21 = (ulong)*(ushort *)(lVar24 + 0x12e);
      if (uVar21 != 0) {
        piVar22 = (int *)(*(long *)(lVar24 + 0xb0) + 8);
        do {
          if (*(long *)(piVar22 + -2) == *(long *)PTR_DAT_09eaa288) {
            puVar11 = (undefined8 *)(lVar24 + (long)*piVar22 * 0x10 + 0x138);
            goto code_r0x0984ccb4;
          }
          uVar21 = uVar21 - 1;
          piVar22 = piVar22 + 4;
        } while (uVar21 != 0);
      }
      uVar18 = 0;
      puVar11 = (undefined8 *)func_0x041cb4c4(plVar23);
      auVar38._8_8_ = uVar8;
      auVar38._0_8_ = uVar18;
code_r0x0984ccb4:
      (*(code *)*puVar11)(plVar23,puVar11[1]);
    }
    func_0x04247ab0(puVar26);
    func_0x04151bb0(0);
    puVar27 = &WithNetwork_ArmorStatusCalculator__CalculateTotalArmorPossessionEffectStatusValue;
    auVar35 = func_0x03bf6574();
  }
  else {
    uVar7 = func_0x053bdfc8(lVar10,*(undefined8 *)PTR_DAT_09f4b440);
    lVar9 = func_0x053c2424(lVar10,*(undefined8 *)puVar26);
    auVar38._8_8_ = param_4;
    auVar38._0_8_ = uVar16;
    auVar35._8_8_ = lVar9;
    auVar35._0_8_ = uVar7;
    puVar27 = &UNK_0984c420;
  }
  puVar4 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  plVar15 = auVar35._8_8_;
  plVar14 = auVar35._0_8_;
  *(long **)((long)ppuVar5 + -0x60) = unaff_x29;
  *(undefined **)((long)ppuVar5 + -0x58) = puVar27;
  *(undefined **)((long)ppuVar5 + -0x50) = unaff_x28;
  *(ulong *)((long)ppuVar5 + -0x48) = unaff_x27;
  *(long *)((long)ppuVar5 + -0x40) = lVar10;
  *(long *)((long)ppuVar5 + -0x38) = lVar9;
  *(undefined8 *)((long)ppuVar5 + -0x30) = uVar7;
  *(undefined **)((long)ppuVar5 + -0x28) = puVar25;
  *(undefined **)((long)ppuVar5 + -0x20) = puVar26;
  *(ulong *)((long)ppuVar5 + -0x18) = uVar16;
  *(int **)((long)ppuVar5 + -0x10) = piVar19;
  *(long **)((long)ppuVar5 + -8) = plVar23;
  auVar3._8_8_ = 0xa46e000;
  auVar3._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  auVar36 = auVar38;
  if ((bRam000000000a46e1e1 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09f46a98);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e1e1 = 1;
  }
  lVar10 = *(long *)puVar4;
  *(undefined8 *)((long)ppuVar5 + -0x78) = 0;
  *(undefined8 *)((long)ppuVar5 + -0x80) = 0;
  *(undefined8 *)((long)ppuVar5 + -0x68) = 0;
  *(undefined8 *)((long)ppuVar5 + -0x70) = 0;
  *(undefined8 *)((long)ppuVar5 + -0x88) = 0;
  *(undefined8 *)((long)ppuVar5 + -0x90) = 0;
  if (*(int *)(lVar10 + 0xe0) == 0) {
    func_0x04151a94();
    lVar10 = *(long *)puVar4;
  }
  uVar7 = auVar36._8_8_;
  if (plVar14 != (long *)0x0) {
    pauVar20 = *(undefined1 (**) [16])(lVar10 + 0xb8);
    lVar10 = *plVar14;
    auVar3 = *pauVar20;
    auVar30 = *pauVar20;
    auVar29 = *pauVar20;
    uVar16 = (ulong)*(ushort *)(lVar10 + 0x12e);
    if (uVar16 != 0) {
      piVar19 = (int *)(*(long *)(lVar10 + 0xb0) + 8);
      do {
        if (*(long *)(piVar19 + -2) == *(long *)PTR_DAT_09f46a98) {
          puVar11 = (undefined8 *)(lVar10 + (long)(*piVar19 + 7) * 0x10 + 0x138);
          goto code_r0x0984cdd0;
        }
        uVar16 = uVar16 - 1;
        piVar19 = piVar19 + 4;
      } while (uVar16 != 0);
    }
    uVar8 = 0;
    puVar11 = (undefined8 *)func_0x041cb4c4(plVar14);
    auVar36._8_8_ = uVar7;
    auVar36._0_8_ = uVar8;
code_r0x0984cdd0:
    plVar23 = (long *)(*(code *)*puVar11)(plVar14,puVar11[1]);
    puVar25 = PTR_DAT_09f470e0;
    puVar26 = PTR_DAT_09ec4a50;
    if (plVar23 != (long *)0x0) {
      if (0 < (int)plVar23[3]) {
        uVar16 = 0;
        uVar21 = plVar23[3] & 0xffffffff;
        auVar29 = auVar30;
        do {
          uVar7 = auVar36._8_8_;
          plVar14 = plVar23;
          if (uVar21 <= uVar16) goto code_r0x0984cf60;
          if (*(char *)((long)plVar23 + uVar16 * 0x38 + 0x4c) != '\0') {
            auVar3 = auVar29;
            if ((plVar23[uVar16 * 7 + 4] == 0) || (plVar15 == (long *)0x0)) goto code_r0x0984cf5c;
            lVar9 = *plVar15;
            lVar10 = plVar23[uVar16 * 7 + 6];
            uVar6 = *(undefined4 *)(plVar23[uVar16 * 7 + 4] + 0x38);
            uVar21 = (ulong)*(ushort *)(lVar9 + 0x12e);
            if (uVar21 != 0) {
              piVar19 = (int *)(*(long *)(lVar9 + 0xb0) + 8);
              do {
                if (*(long *)(piVar19 + -2) == *(long *)puVar25) {
                  puVar11 = (undefined8 *)(lVar9 + (long)(*piVar19 + 6) * 0x10 + 0x138);
                  goto code_r0x0984ce84;
                }
                uVar21 = uVar21 - 1;
                piVar19 = piVar19 + 4;
              } while (uVar21 != 0);
            }
            puVar11 = (undefined8 *)func_0x041cb4c4(plVar15,*(long *)puVar25,6);
code_r0x0984ce84:
            uVar8 = puVar11[1];
            (*(code *)*puVar11)((undefined1 *)((long)ppuVar5 + -0xc0),plVar15,uVar6);
            lVar9 = *(long *)puVar26;
            *(undefined8 *)((long)ppuVar5 + -0x88) = *(undefined8 *)((long)ppuVar5 + -0xb8);
            *(undefined8 *)((long)ppuVar5 + -0x90) = *(undefined8 *)((long)ppuVar5 + -0xc0);
            *(undefined8 *)((long)ppuVar5 + -0x78) = *(undefined8 *)((long)ppuVar5 + -0xa8);
            *(undefined8 *)((long)ppuVar5 + -0x80) = *(undefined8 *)((long)ppuVar5 + -0xb0);
            *(undefined8 *)((long)ppuVar5 + -0x68) = *(undefined8 *)((long)ppuVar5 + -0x98);
            *(undefined8 *)((long)ppuVar5 + -0x70) = *(undefined8 *)((long)ppuVar5 + -0xa0);
            if (*(int *)(lVar9 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar36._8_8_ = uVar7;
            auVar36._0_8_ = uVar8;
            if (*(int *)((long)ppuVar5 + -0x78) == auVar38._0_4_) {
              if (*(int *)(*(long *)puVar26 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar36 = func_0x091dc794((undefined1 *)((long)ppuVar5 + -0x90),(int)lVar10,0);
              if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar29 = func_0x09774360(auVar29._0_8_,auVar29._8_8_,auVar36._0_8_,auVar36._8_8_,0);
            }
          }
          uVar21 = (ulong)*(uint *)(plVar23 + 3);
          uVar16 = uVar16 + 1;
        } while ((long)uVar16 < (long)(int)*(uint *)(plVar23 + 3));
      }
      return auVar29;
    }
  }
code_r0x0984cf5c:
  auVar29 = auVar3;
  func_0x04151bb8();
code_r0x0984cf60:
  auVar30 = func_0x04151bc0();
  plVar12 = auVar30._8_8_;
  plVar23 = auVar30._0_8_;
  *(undefined **)((long)ppuVar5 + -0xf0) =
       &WithNetwork_ArmorStatusCalculator__CalculateTotalArmorEquipmentEffectStatusValue;
  *(long **)((long)ppuVar5 + -0xe8) = plVar14;
  *(undefined1 (*) [16])((long)ppuVar5 + -0xe0) = auVar29;
  *(long **)((long)ppuVar5 + -0xd0) = plVar15;
  *(ulong *)((long)ppuVar5 + -200) = auVar38._0_8_ & 0xffffffff;
  if ((bRam000000000a46e1e2 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09f46a98);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e1e2 = 1;
  }
  *(undefined8 *)((long)ppuVar5 + -0x108) = 0;
  *(undefined8 *)((long)ppuVar5 + -0x110) = 0;
  *(undefined8 *)((long)ppuVar5 + -0xf8) = 0;
  *(undefined8 *)((long)ppuVar5 + -0x100) = 0;
  *(undefined8 *)((long)ppuVar5 + -0x118) = 0;
  *(undefined8 *)((long)ppuVar5 + -0x120) = 0;
  if (auVar36._4_4_ == 0) {
code_r0x0984d124:
    puVar26 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar10 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if (*(int *)(lVar10 + 0xe0) == 0) {
      func_0x04151a94();
      lVar10 = *(long *)puVar26;
    }
    return **(undefined1 (**) [16])(lVar10 + 0xb8);
  }
  if (plVar12 != (long *)0x0) {
    lVar10 = *plVar12;
    uVar16 = (ulong)*(ushort *)(lVar10 + 0x12e);
    if (uVar16 != 0) {
      piVar19 = (int *)(*(long *)(lVar10 + 0xb0) + 8);
      do {
        if (*(long *)(piVar19 + -2) == *(long *)PTR_DAT_09f46a98) {
          puVar11 = (undefined8 *)(lVar10 + (long)(*piVar19 + 6) * 0x10 + 0x138);
          goto code_r0x0984d034;
        }
        uVar16 = uVar16 - 1;
        piVar19 = piVar19 + 4;
      } while (uVar16 != 0);
    }
    puVar11 = (undefined8 *)func_0x041cb4c4(plVar12,*(long *)PTR_DAT_09f46a98,6);
code_r0x0984d034:
    (*(code *)*puVar11)((undefined1 *)((long)ppuVar5 + -0x158),plVar12,auVar36._4_4_,puVar11[1]);
    puVar26 = PTR_DAT_09ec4a50;
    if ((*(long *)((long)ppuVar5 + -0x158) != 0) && (plVar23 != (long *)0x0)) {
      lVar10 = *plVar23;
      uVar6 = *(undefined4 *)((long)ppuVar5 + -0x148);
      uVar2 = *(undefined4 *)(*(long *)((long)ppuVar5 + -0x158) + 0x3c);
      uVar16 = (ulong)*(ushort *)(lVar10 + 0x12e);
      if (uVar16 != 0) {
        piVar19 = (int *)(*(long *)(lVar10 + 0xb0) + 8);
        do {
          if (*(long *)(piVar19 + -2) == *(long *)PTR_DAT_09f470e0) {
            puVar11 = (undefined8 *)(lVar10 + (long)(*piVar19 + 6) * 0x10 + 0x138);
            goto code_r0x0984d0bc;
          }
          uVar16 = uVar16 - 1;
          piVar19 = piVar19 + 4;
        } while (uVar16 != 0);
      }
      puVar11 = (undefined8 *)func_0x041cb4c4(plVar23,*(long *)PTR_DAT_09f470e0,6);
code_r0x0984d0bc:
      (*(code *)*puVar11)((undefined1 *)((long)ppuVar5 + -0x158),plVar23,uVar2,puVar11[1]);
      lVar10 = *(long *)puVar26;
      *(undefined8 *)((long)ppuVar5 + -0x118) = *(undefined8 *)((long)ppuVar5 + -0x150);
      *(undefined8 *)((long)ppuVar5 + -0x120) = *(undefined8 *)((long)ppuVar5 + -0x158);
      *(undefined8 *)((long)ppuVar5 + -0x108) = *(undefined8 *)((long)ppuVar5 + -0x140);
      *(undefined8 *)((long)ppuVar5 + -0x110) = *(undefined8 *)((long)ppuVar5 + -0x148);
      *(undefined8 *)((long)ppuVar5 + -0xf8) = *(undefined8 *)((long)ppuVar5 + -0x130);
      *(undefined8 *)((long)ppuVar5 + -0x100) = *(undefined8 *)((long)ppuVar5 + -0x138);
      if (*(int *)(lVar10 + 0xe0) == 0) {
        func_0x04151a94();
      }
      if (*(int *)((long)ppuVar5 + -0x108) == auVar36._8_4_) {
        if (*(int *)(*(long *)puVar26 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar29 = func_0x091dc794((undefined1 *)((long)ppuVar5 + -0x120),uVar6,0);
        return auVar29;
      }
      goto code_r0x0984d124;
    }
  }
  uVar6 = func_0x04151bb8();
  puVar26 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  *(undefined **)((long)ppuVar5 + -400) =
       &WithNetwork_ArtBookStatusCalculator__CalculateIncompleteStatus;
  *(undefined8 *)((long)ppuVar5 + -0x188) = 0xa46e000;
  *(ulong *)((long)ppuVar5 + -0x180) = auVar36._0_8_ >> 0x20;
  *(long **)((long)ppuVar5 + -0x178) = plVar12;
  *(long **)((long)ppuVar5 + -0x170) = plVar23;
  *(ulong *)((long)ppuVar5 + -0x168) = auVar36._8_8_ & 0xffffffff;
  if ((bRam000000000a46e1e3 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46e1e3 = 1;
  }
  lVar10 = *(long *)puVar26;
  if (*(int *)(lVar10 + 0xe0) == 0) {
    func_0x04151a94();
    lVar10 = *(long *)puVar26;
  }
  uVar7 = *(undefined8 *)(*(long *)(lVar10 + 0xb8) + 0x10);
  uVar8 = *(undefined8 *)(*(long *)(lVar10 + 0xb8) + 0x18);
  extraout_x8_00[1] = 0;
  *extraout_x8_00 = 0;
  extraout_x8_00[3] = 0;
  extraout_x8_00[2] = 0;
  *(undefined4 *)extraout_x8_00 = uVar6;
  *(undefined4 *)((long)extraout_x8_00 + 4) = extraout_w1;
  extraout_x8_00[1] = uVar7;
  extraout_x8_00[2] = uVar8;
  *(undefined1 *)(extraout_x8_00 + 3) = 0;
  auVar28._8_4_ = uVar6;
  auVar28._0_8_ = extraout_x8_00;
  auVar28._12_4_ = 0;
  return auVar28;
}


```

## ArmorStatusCalculator.CalculatePercentStatus(DataTableContainer dataTableContainer, StatusType statusType, int id)

```c

/* WARNING: Possible PIC construction at 0x0984c41c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0984c4c0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0984c420) */
/* WARNING: Removing unreachable block (ram,0x0984c43c) */
/* WARNING: Removing unreachable block (ram,0x0984c460) */
/* WARNING: Removing unreachable block (ram,0x0984c468) */
/* WARNING: Removing unreachable block (ram,0x0984c490) */
/* WARNING: Removing unreachable block (ram,0x0984c474) */
/* WARNING: Removing unreachable block (ram,0x0984c480) */
/* WARNING: Removing unreachable block (ram,0x0984c4a0) */
/* WARNING: Removing unreachable block (ram,0x0984c4c4) */
/* WARNING: Removing unreachable block (ram,0x0984c4d8) */
/* WARNING: Removing unreachable block (ram,0x0984c4dc) */

undefined1  [16]
WithNetwork_ArmorStatusCalculator__CalculatePercentStatus
          (undefined *param_1,long param_2,ulong param_3,ulong param_4,undefined8 param_5)

{
  uint uVar1;
  undefined4 uVar2;
  undefined1 auVar3 [16];
  undefined *puVar4;
  undefined1 *puVar5;
  undefined4 uVar6;
  undefined8 uVar7;
  long lVar8;
  undefined8 *puVar9;
  long *plVar10;
  long lVar11;
  long *plVar12;
  undefined4 extraout_w1;
  long *plVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  long lVar16;
  ulong uVar17;
  undefined8 *extraout_x8;
  undefined1 (*pauVar18) [16];
  ulong uVar19;
  int *piVar20;
  long *plVar21;
  undefined *puVar22;
  long lVar23;
  undefined *puVar24;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  undefined8 uVar25;
  ulong unaff_x27;
  undefined *unaff_x28;
  long *unaff_x29;
  undefined *puVar26;
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auVar35 [12];
  undefined1 auVar36 [16];
  undefined1 auStack_240 [8];
  long lStack_238;
  undefined8 uStack_230;
  undefined8 uStack_228;
  long lStack_220;
  long lStack_218;
  undefined8 uStack_210;
  undefined8 uStack_208;
  undefined8 uStack_200;
  undefined8 uStack_1f8;
  undefined8 uStack_1f0;
  undefined8 uStack_1e8;
  long lStack_1e0;
  undefined8 uStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  undefined8 uStack_1b8;
  long lStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  long *plStack_170;
  undefined *puStack_168;
  undefined *puStack_160;
  ulong uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  long *plStack_138;
  undefined1 auStack_130 [16];
  long *plStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  
  auVar29._8_8_ = unaff_x25;
  auVar29._0_8_ = unaff_x24;
  puVar5 = &stack0xffffffffffffffb0;
  plVar21 = (long *)(param_4 & 0xffffffff);
  param_3 = param_3 & 0xffffffff;
  if ((bRam000000000a46e1e0 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f4b440);
    func_0x0415191c(PTR_DAT_09f7f9b0);
    func_0x0415191c(PTR_DAT_09f4b430);
    func_0x0415191c(PTR_DAT_09f48a60);
    bRam000000000a46e1e0 = 1;
  }
  puVar24 = PTR_DAT_09f7f9b0;
  puVar22 = PTR_DAT_09f4b430;
  if (param_2 == 0) {
    auVar28 = func_0x04151bb8();
    puVar22 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    plVar12 = auVar28._8_8_;
    plVar21 = auVar28._0_8_;
    uVar7 = 3;
    auVar28._8_8_ = 0xa46e000;
    auVar28._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if ((bRam000000000a46e1de & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(PTR_DAT_09f470e0);
      func_0x0415191c(PTR_DAT_09f46a98);
      func_0x0415191c(PTR_DAT_09ec4a50);
      bRam000000000a46e1de = 1;
    }
    lVar8 = *(long *)puVar22;
    uStack_c8 = 0;
    uStack_d0 = 0;
    uStack_b8 = 0;
    uStack_c0 = 0;
    uStack_d8 = 0;
    uStack_e0 = 0;
    if (*(int *)(lVar8 + 0xe0) == 0) {
      func_0x04151a94();
      lVar8 = *(long *)puVar22;
    }
    auVar36._8_8_ = param_5;
    auVar36._0_8_ = uVar7;
    uVar25 = 0;
    puVar22 = unaff_x28;
    plVar13 = unaff_x29;
    if (plVar21 != (long *)0x0) {
      pauVar18 = *(undefined1 (**) [16])(lVar8 + 0xb8);
      lVar8 = *plVar21;
      auVar28 = *pauVar18;
      auVar31 = *pauVar18;
      auVar30 = *pauVar18;
      uVar19 = (ulong)*(ushort *)(lVar8 + 0x12e);
      if (uVar19 != 0) {
        piVar20 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
        do {
          if (*(long *)(piVar20 + -2) == *(long *)PTR_DAT_09f46a98) {
            puVar9 = (undefined8 *)(lVar8 + (long)(*piVar20 + 7) * 0x10 + 0x138);
            goto code_r0x0984c648;
          }
          uVar19 = uVar19 - 1;
          piVar20 = piVar20 + 4;
        } while (uVar19 != 0);
      }
      uVar7 = 7;
      puVar9 = (undefined8 *)func_0x041cb4c4(plVar21);
code_r0x0984c648:
      plVar10 = (long *)(*(code *)*puVar9)(plVar21,puVar9[1]);
      puVar26 = PTR_DAT_09f470e0;
      puVar24 = PTR_DAT_09ec4a50;
      auVar36._8_8_ = param_5;
      auVar36._0_8_ = uVar7;
      if (plVar10 != (long *)0x0) {
        if (0 < (int)plVar10[3]) {
          unaff_x27 = 0;
          uVar19 = plVar10[3] & 0xffffffff;
          uVar25 = 0x38;
          auVar30 = auVar31;
          do {
            uVar7 = auVar36._8_8_;
            plVar21 = plVar10;
            puVar22 = puVar26;
            plVar13 = (long *)puVar24;
            if (uVar19 <= unaff_x27) goto code_r0x0984c7d8;
            if (*(char *)((long)plVar10 + unaff_x27 * 0x38 + 0x4c) != '\0') {
              auVar28 = auVar30;
              if ((plVar10[unaff_x27 * 7 + 4] == 0) || (plVar12 == (long *)0x0))
              goto code_r0x0984c7d4;
              lVar8 = *plVar12;
              uVar1 = *(uint *)(plVar10 + unaff_x27 * 7 + 6);
              uVar6 = *(undefined4 *)(plVar10[unaff_x27 * 7 + 4] + 0x38);
              auVar29._8_4_ = uVar6;
              auVar29._0_8_ = CONCAT44(0,uVar1);
              auVar29._12_4_ = 0;
              uVar19 = (ulong)*(ushort *)(lVar8 + 0x12e);
              if (uVar19 != 0) {
                piVar20 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar20 + -2) == *(long *)puVar26) {
                    puVar9 = (undefined8 *)(lVar8 + (long)(*piVar20 + 6) * 0x10 + 0x138);
                    goto code_r0x0984c6fc;
                  }
                  uVar19 = uVar19 - 1;
                  piVar20 = piVar20 + 4;
                } while (uVar19 != 0);
              }
              puVar9 = (undefined8 *)func_0x041cb4c4(plVar12,*(long *)puVar26,6);
code_r0x0984c6fc:
              uVar15 = puVar9[1];
              (*(code *)*puVar9)(&uStack_110,plVar12,uVar6);
              uStack_d8 = uStack_108;
              uStack_e0 = uStack_110;
              uStack_c8 = uStack_f8;
              uStack_d0 = uStack_100;
              uStack_b8 = uStack_e8;
              uStack_c0 = uStack_f0;
              if (*(int *)(*(long *)puVar24 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar36._8_8_ = uVar7;
              auVar36._0_8_ = uVar15;
              if ((int)uStack_c8 == 3) {
                if (*(int *)(*(long *)puVar24 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar29 = func_0x091dc794(&uStack_e0,CONCAT44(0,uVar1),0);
                if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar36 = auVar29;
                auVar30 = func_0x09774360(auVar30._0_8_,auVar30._8_8_,auVar29._0_8_,auVar29._8_8_,0)
                ;
              }
            }
            uVar19 = (ulong)*(uint *)(plVar10 + 3);
            unaff_x27 = unaff_x27 + 1;
          } while ((long)unaff_x27 < (long)(int)*(uint *)(plVar10 + 3));
        }
        return auVar30;
      }
    }
code_r0x0984c7d4:
    auVar30 = auVar28;
    func_0x04151bb8();
code_r0x0984c7d8:
    auVar28 = func_0x04151bc0();
    puVar24 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    auVar31._8_8_ = unaff_x27;
    auVar31._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar23 = auVar36._8_8_;
    lVar16 = auVar36._0_8_;
    lVar8 = auVar28._8_8_;
    plVar10 = auVar28._0_8_;
    puVar5 = auStack_240;
    puStack_168 = &
                  WithNetwork_ArmorStatusCalculator__CalculatePredictedTotalArmorHpPossessionEffectValue
    ;
    uStack_118 = 3;
    unaff_x29 = &lStack_1b0;
    plStack_170 = plVar13;
    puStack_160 = puVar22;
    uStack_158 = unaff_x27;
    uStack_150 = uVar25;
    plStack_138 = plVar21;
    plStack_120 = plVar12;
    auStack_130 = auVar30;
    if ((bRam000000000a46e1df & 1) == 0) {
      uStack_148 = auVar29._8_8_;
      uStack_140 = auVar29._0_8_;
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(PTR_DAT_09eaa288);
      func_0x0415191c(PTR_DAT_09f7f9b8);
      func_0x0415191c(PTR_DAT_09f7f9c0);
      func_0x0415191c(PTR_DAT_09eaa8d0);
      func_0x0415191c(PTR_DAT_09ec4a50);
      auVar29._8_8_ = uStack_148;
      auVar29._0_8_ = uStack_140;
      bRam000000000a46e1df = 1;
    }
    uStack_148 = auVar29._8_8_;
    uStack_140 = auVar29._0_8_;
    lVar11 = *(long *)puVar24;
    uStack_180 = 0;
    uStack_188 = 0;
    uStack_190 = 0;
    uStack_1a8 = 0;
    lStack_1b0 = 0;
    uStack_198 = 0;
    uStack_1a0 = 0;
    uStack_1c8 = 0;
    uStack_1d0 = 0;
    uStack_1b8 = 0;
    uStack_1c0 = 0;
    uStack_1d8 = 0;
    lStack_1e0 = 0;
    if (*(int *)(lVar11 + 0xe0) == 0) {
      func_0x04151a94();
      auVar29._8_8_ = uStack_148;
      auVar29._0_8_ = uStack_140;
      lVar11 = *(long *)puVar24;
    }
    uStack_148 = auVar29._8_8_;
    uStack_140 = auVar29._0_8_;
    uVar7 = auVar36._8_8_;
    plVar21 = (long *)0x0;
    param_1 = (undefined *)0xa46e000;
    unaff_x28 = puVar22;
    if (plVar10 == (long *)0x0) {
code_r0x0984cbd0:
      uStack_148 = auVar29._8_8_;
      uStack_140 = auVar29._0_8_;
      func_0x04151bb8();
      puVar24 = param_1;
      puVar22 = unaff_x28;
    }
    else {
      pauVar18 = *(undefined1 (**) [16])(lVar11 + 0xb8);
      lVar11 = *plVar10;
      uVar25 = *(undefined8 *)*pauVar18;
      auVar31._0_8_ = uVar25;
      uVar15 = *(undefined8 *)(*pauVar18 + 8);
      auVar30 = *pauVar18;
      uVar19 = (ulong)*(ushort *)(lVar11 + 0x12e);
      if (uVar19 != 0) {
        piVar20 = (int *)(*(long *)(lVar11 + 0xb0) + 8);
        do {
          if (*(long *)(piVar20 + -2) == *(long *)PTR_DAT_09f7f9b8) {
            puVar9 = (undefined8 *)(lVar11 + (long)*piVar20 * 0x10 + 0x138);
            goto code_r0x0984c908;
          }
          uVar19 = uVar19 - 1;
          piVar20 = piVar20 + 4;
        } while (uVar19 != 0);
      }
      uVar14 = 0;
      puVar9 = (undefined8 *)func_0x041cb4c4(plVar10);
      auVar29._8_8_ = uStack_148;
      auVar29._0_8_ = uStack_140;
      auVar36._8_8_ = uVar7;
      auVar36._0_8_ = uVar14;
code_r0x0984c908:
      uStack_148 = auVar29._8_8_;
      uStack_140 = auVar29._0_8_;
      lStack_220 = lVar16;
      plVar21 = (long *)(*(code *)*puVar9)(plVar10,puVar9[1]);
      param_1 = PTR_DAT_09f7f9c0;
      unaff_x28 = PTR_DAT_09eaa8d0;
      puVar24 = (undefined *)0xa46e000;
      if (plVar21 != (long *)0x0) {
code_r0x0984c938:
        uStack_228 = uVar25;
        uStack_230 = uVar15;
        uVar7 = auVar36._8_8_;
        lVar16 = *plVar21;
        uVar19 = (ulong)*(ushort *)(lVar16 + 0x12e);
        if (uVar19 != 0) {
          piVar20 = (int *)(*(long *)(lVar16 + 0xb0) + 8);
          do {
            if (*(long *)(piVar20 + -2) == *(long *)unaff_x28) {
              puVar9 = (undefined8 *)(lVar16 + (long)*piVar20 * 0x10 + 0x138);
              goto code_r0x0984c984;
            }
            uVar19 = uVar19 - 1;
            piVar20 = piVar20 + 4;
          } while (uVar19 != 0);
        }
        uVar25 = 0;
        puVar9 = (undefined8 *)func_0x041cb4c4(plVar21);
        auVar36._8_8_ = uVar7;
        auVar36._0_8_ = uVar25;
code_r0x0984c984:
        uVar19 = (*(code *)*puVar9)(plVar21,puVar9[1]);
        uVar7 = auVar36._8_8_;
        if ((uVar19 & 1) == 0) {
          lVar23 = 0;
          goto code_r0x0984cb34;
        }
        lVar16 = *plVar21;
        uVar19 = (ulong)*(ushort *)(lVar16 + 0x12e);
        if (uVar19 != 0) {
          piVar20 = (int *)(*(long *)(lVar16 + 0xb0) + 8);
          do {
            if (*(long *)(piVar20 + -2) == *(long *)param_1) {
              puVar9 = (undefined8 *)(lVar16 + (long)*piVar20 * 0x10 + 0x138);
              goto code_r0x0984c9e0;
            }
            uVar19 = uVar19 - 1;
            piVar20 = piVar20 + 4;
          } while (uVar19 != 0);
        }
        uVar25 = 0;
        puVar9 = (undefined8 *)func_0x041cb4c4(plVar21);
        auVar36._8_8_ = uVar7;
        auVar36._0_8_ = uVar25;
code_r0x0984c9e0:
        (*(code *)*puVar9)(&lStack_218,plVar21,puVar9[1]);
        uStack_1a8 = uStack_210;
        lStack_1b0 = lStack_218;
        uStack_198 = uStack_200;
        uStack_1a0 = uStack_208;
        uStack_188 = uStack_1f0;
        uStack_190 = uStack_1f8;
        uStack_180 = uStack_1e8;
        uVar19 = func_0x091baf10(&lStack_1b0,0);
        uVar7 = auVar36._8_8_;
        if (lVar23 != 0) {
          uVar25 = *(undefined8 *)(lVar23 + 0x28);
          uVar19 = (**(code **)(lVar23 + 0x18))(*(undefined8 *)(lVar23 + 0x40));
          auVar36._8_8_ = uVar7;
          auVar36._0_8_ = uVar25;
          uVar15 = uStack_230;
          uVar25 = uStack_228;
          if ((uVar19 & 1) != 0) {
            if (lStack_1b0 == 0) goto code_r0x0984cbc8;
            if (lVar8 == 0) goto code_r0x0984cbcc;
            uVar14 = *(undefined8 *)(lVar8 + 0x28);
            (**(code **)(lVar8 + 0x18))
                      (&lStack_218,*(undefined8 *)(lVar8 + 0x40),*(undefined4 *)(lStack_1b0 + 0x38))
            ;
            uStack_1d8 = uStack_210;
            lStack_1e0 = lStack_218;
            uStack_1c8 = uStack_200;
            uStack_1d0 = uStack_208;
            uStack_1b8 = uStack_1f0;
            uStack_1c0 = uStack_1f8;
            if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar36._8_8_ = uVar7;
            auVar36._0_8_ = uVar14;
            uVar15 = uStack_230;
            uVar25 = uStack_228;
            if ((int)uStack_1c8 == 3) {
              uVar19 = func_0x091baf10(&lStack_1b0,0);
              auVar36._8_8_ = uVar7;
              auVar36._0_8_ = uVar14;
              auVar32._8_8_ = uVar19 & 0xffffffff;
              auVar32._0_8_ = uVar19;
              if (lStack_220 == 0) goto code_r0x0984cbe4;
              lStack_238 = auVar30._8_8_;
              uVar6 = (**(code **)(lStack_220 + 0x18))
                                (*(undefined8 *)(lStack_220 + 0x40),uVar19 & 0xffffffff,
                                 *(undefined8 *)(lStack_220 + 0x28));
              if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar31 = func_0x091dc794(&lStack_1e0,uVar6,0);
              if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar36 = auVar31;
              auVar30 = func_0x09774360(auVar30._0_8_,lStack_238,auVar31._0_8_,auVar31._8_8_,0);
              uVar15 = uStack_230;
              uVar25 = uStack_228;
            }
          }
          goto code_r0x0984c938;
        }
        func_0x04151bb8(uVar19,uVar19 & 0xffffffff);
code_r0x0984cbc8:
        func_0x04151bb8();
code_r0x0984cbcc:
        func_0x04151bb8();
        auVar29._8_8_ = uStack_148;
        auVar29._0_8_ = uStack_140;
        goto code_r0x0984cbd0;
      }
    }
    unaff_x28 = puVar22;
    param_1 = puVar24;
    uVar7 = auVar31._0_8_;
    func_0x04151bb8();
    while( true ) {
      auVar32 = func_0x04151bb0(lVar23);
      auVar30._8_8_ = lStack_238;
      auVar30._0_8_ = uVar7;
code_r0x0984cbe4:
      lStack_238 = auVar30._8_8_;
      param_3 = auVar30._0_8_;
      unaff_x27 = auVar31._8_8_;
      uVar7 = auVar31._0_8_;
      auVar35 = func_0x04151bb8(auVar32._0_8_,auVar32._8_8_);
      param_2 = lStack_238;
      uVar25 = auVar36._8_8_;
      auVar30._8_8_ = lStack_238;
      auVar30._0_8_ = param_3;
      puVar22 = auVar35._0_8_;
      if (auVar35._8_4_ != 1) break;
      plVar12 = (long *)func_0x098f6de0(puVar22);
      lVar23 = *plVar12;
      func_0x098f6df0();
code_r0x0984cb34:
      uVar25 = auVar36._8_8_;
      uVar7 = auVar30._0_8_;
      if (plVar21 != (long *)0x0) {
        lVar16 = *plVar21;
        uVar19 = (ulong)*(ushort *)(lVar16 + 0x12e);
        if (uVar19 != 0) {
          piVar20 = (int *)(*(long *)(lVar16 + 0xb0) + 8);
          do {
            if (*(long *)(piVar20 + -2) == *(long *)PTR_DAT_09eaa288) {
              puVar9 = (undefined8 *)(lVar16 + (long)*piVar20 * 0x10 + 0x138);
              goto code_r0x0984cb8c;
            }
            uVar19 = uVar19 - 1;
            piVar20 = piVar20 + 4;
          } while (uVar19 != 0);
        }
        uVar15 = 0;
        puVar9 = (undefined8 *)func_0x041cb4c4(plVar21);
        auVar36._8_8_ = uVar25;
        auVar36._0_8_ = uVar15;
code_r0x0984cb8c:
        (*(code *)*puVar9)(plVar21,puVar9[1]);
      }
      if (lVar23 == 0) {
        return auVar30;
      }
    }
    puVar24 = (undefined *)0x0;
    if (plVar21 != (long *)0x0) {
      lVar16 = *plVar21;
      uVar19 = (ulong)*(ushort *)(lVar16 + 0x12e);
      if (uVar19 != 0) {
        piVar20 = (int *)(*(long *)(lVar16 + 0xb0) + 8);
        do {
          if (*(long *)(piVar20 + -2) == *(long *)PTR_DAT_09eaa288) {
            puVar9 = (undefined8 *)(lVar16 + (long)*piVar20 * 0x10 + 0x138);
            goto code_r0x0984ccb4;
          }
          uVar19 = uVar19 - 1;
          piVar20 = piVar20 + 4;
        } while (uVar19 != 0);
      }
      uVar15 = 0;
      puVar9 = (undefined8 *)func_0x041cb4c4(plVar21);
      auVar36._8_8_ = uVar25;
      auVar36._0_8_ = uVar15;
code_r0x0984ccb4:
      (*(code *)*puVar9)(plVar21,puVar9[1]);
    }
    func_0x04247ab0(puVar22);
    func_0x04151bb0(0);
    puVar26 = &WithNetwork_ArmorStatusCalculator__CalculateTotalArmorPossessionEffectStatusValue;
    auVar33 = func_0x03bf6574();
  }
  else {
    uVar7 = func_0x053bdfc8(param_2,*(undefined8 *)PTR_DAT_09f4b440);
    lVar8 = func_0x053c2424(param_2,*(undefined8 *)puVar22);
    auVar36._8_8_ = param_5;
    auVar36._0_8_ = param_3;
    auVar33._8_8_ = lVar8;
    auVar33._0_8_ = uVar7;
    puVar26 = &UNK_0984c420;
  }
  puVar4 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  plVar13 = auVar33._8_8_;
  plVar12 = auVar33._0_8_;
  *(long **)(puVar5 + -0x60) = unaff_x29;
  *(undefined **)(puVar5 + -0x58) = puVar26;
  *(undefined **)(puVar5 + -0x50) = unaff_x28;
  *(ulong *)(puVar5 + -0x48) = unaff_x27;
  *(long *)(puVar5 + -0x40) = param_2;
  *(long *)(puVar5 + -0x38) = lVar8;
  *(undefined8 *)(puVar5 + -0x30) = uVar7;
  *(undefined **)(puVar5 + -0x28) = puVar24;
  *(undefined **)(puVar5 + -0x20) = puVar22;
  *(ulong *)(puVar5 + -0x18) = param_3;
  *(undefined **)(puVar5 + -0x10) = param_1;
  *(long **)(puVar5 + -8) = plVar21;
  auVar3._8_8_ = 0xa46e000;
  auVar3._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  auVar34 = auVar36;
  if ((bRam000000000a46e1e1 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09f46a98);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e1e1 = 1;
  }
  lVar8 = *(long *)puVar4;
  *(undefined8 *)(puVar5 + -0x78) = 0;
  *(undefined8 *)(puVar5 + -0x80) = 0;
  *(undefined8 *)(puVar5 + -0x68) = 0;
  *(undefined8 *)(puVar5 + -0x70) = 0;
  *(undefined8 *)(puVar5 + -0x88) = 0;
  *(undefined8 *)(puVar5 + -0x90) = 0;
  if (*(int *)(lVar8 + 0xe0) == 0) {
    func_0x04151a94();
    lVar8 = *(long *)puVar4;
  }
  uVar7 = auVar34._8_8_;
  if (plVar12 != (long *)0x0) {
    pauVar18 = *(undefined1 (**) [16])(lVar8 + 0xb8);
    lVar8 = *plVar12;
    auVar3 = *pauVar18;
    auVar28 = *pauVar18;
    auVar29 = *pauVar18;
    uVar19 = (ulong)*(ushort *)(lVar8 + 0x12e);
    if (uVar19 != 0) {
      piVar20 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
      do {
        if (*(long *)(piVar20 + -2) == *(long *)PTR_DAT_09f46a98) {
          puVar9 = (undefined8 *)(lVar8 + (long)(*piVar20 + 7) * 0x10 + 0x138);
          goto code_r0x0984cdd0;
        }
        uVar19 = uVar19 - 1;
        piVar20 = piVar20 + 4;
      } while (uVar19 != 0);
    }
    uVar25 = 0;
    puVar9 = (undefined8 *)func_0x041cb4c4(plVar12);
    auVar34._8_8_ = uVar7;
    auVar34._0_8_ = uVar25;
code_r0x0984cdd0:
    plVar21 = (long *)(*(code *)*puVar9)(plVar12,puVar9[1]);
    puVar24 = PTR_DAT_09f470e0;
    puVar22 = PTR_DAT_09ec4a50;
    if (plVar21 != (long *)0x0) {
      if (0 < (int)plVar21[3]) {
        uVar19 = 0;
        uVar17 = plVar21[3] & 0xffffffff;
        auVar29 = auVar28;
        do {
          uVar7 = auVar34._8_8_;
          plVar12 = plVar21;
          if (uVar17 <= uVar19) goto code_r0x0984cf60;
          if (*(char *)((long)plVar21 + uVar19 * 0x38 + 0x4c) != '\0') {
            auVar3 = auVar29;
            if ((plVar21[uVar19 * 7 + 4] == 0) || (plVar13 == (long *)0x0)) goto code_r0x0984cf5c;
            lVar16 = *plVar13;
            lVar8 = plVar21[uVar19 * 7 + 6];
            uVar6 = *(undefined4 *)(plVar21[uVar19 * 7 + 4] + 0x38);
            uVar17 = (ulong)*(ushort *)(lVar16 + 0x12e);
            if (uVar17 != 0) {
              piVar20 = (int *)(*(long *)(lVar16 + 0xb0) + 8);
              do {
                if (*(long *)(piVar20 + -2) == *(long *)puVar24) {
                  puVar9 = (undefined8 *)(lVar16 + (long)(*piVar20 + 6) * 0x10 + 0x138);
                  goto code_r0x0984ce84;
                }
                uVar17 = uVar17 - 1;
                piVar20 = piVar20 + 4;
              } while (uVar17 != 0);
            }
            puVar9 = (undefined8 *)func_0x041cb4c4(plVar13,*(long *)puVar24,6);
code_r0x0984ce84:
            uVar25 = puVar9[1];
            (*(code *)*puVar9)(puVar5 + -0xc0,plVar13,uVar6);
            lVar16 = *(long *)puVar22;
            *(undefined8 *)(puVar5 + -0x88) = *(undefined8 *)(puVar5 + -0xb8);
            *(undefined8 *)(puVar5 + -0x90) = *(undefined8 *)(puVar5 + -0xc0);
            *(undefined8 *)(puVar5 + -0x78) = *(undefined8 *)(puVar5 + -0xa8);
            *(undefined8 *)(puVar5 + -0x80) = *(undefined8 *)(puVar5 + -0xb0);
            *(undefined8 *)(puVar5 + -0x68) = *(undefined8 *)(puVar5 + -0x98);
            *(undefined8 *)(puVar5 + -0x70) = *(undefined8 *)(puVar5 + -0xa0);
            if (*(int *)(lVar16 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar34._8_8_ = uVar7;
            auVar34._0_8_ = uVar25;
            if (*(int *)(puVar5 + -0x78) == auVar36._0_4_) {
              if (*(int *)(*(long *)puVar22 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar34 = func_0x091dc794(puVar5 + -0x90,(int)lVar8,0);
              if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar29 = func_0x09774360(auVar29._0_8_,auVar29._8_8_,auVar34._0_8_,auVar34._8_8_,0);
            }
          }
          uVar17 = (ulong)*(uint *)(plVar21 + 3);
          uVar19 = uVar19 + 1;
        } while ((long)uVar19 < (long)(int)*(uint *)(plVar21 + 3));
      }
      return auVar29;
    }
  }
code_r0x0984cf5c:
  auVar29 = auVar3;
  func_0x04151bb8();
code_r0x0984cf60:
  auVar28 = func_0x04151bc0();
  plVar10 = auVar28._8_8_;
  plVar21 = auVar28._0_8_;
  *(undefined **)(puVar5 + -0xf0) =
       &WithNetwork_ArmorStatusCalculator__CalculateTotalArmorEquipmentEffectStatusValue;
  *(long **)(puVar5 + -0xe8) = plVar12;
  *(undefined1 (*) [16])(puVar5 + -0xe0) = auVar29;
  *(long **)(puVar5 + -0xd0) = plVar13;
  *(ulong *)(puVar5 + -200) = auVar36._0_8_ & 0xffffffff;
  if ((bRam000000000a46e1e2 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09f46a98);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e1e2 = 1;
  }
  *(undefined8 *)(puVar5 + -0x108) = 0;
  *(undefined8 *)(puVar5 + -0x110) = 0;
  *(undefined8 *)(puVar5 + -0xf8) = 0;
  *(undefined8 *)(puVar5 + -0x100) = 0;
  *(undefined8 *)(puVar5 + -0x118) = 0;
  *(undefined8 *)(puVar5 + -0x120) = 0;
  if (auVar34._4_4_ == 0) {
code_r0x0984d124:
    puVar22 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar8 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if (*(int *)(lVar8 + 0xe0) == 0) {
      func_0x04151a94();
      lVar8 = *(long *)puVar22;
    }
    return **(undefined1 (**) [16])(lVar8 + 0xb8);
  }
  if (plVar10 != (long *)0x0) {
    lVar8 = *plVar10;
    uVar19 = (ulong)*(ushort *)(lVar8 + 0x12e);
    if (uVar19 != 0) {
      piVar20 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
      do {
        if (*(long *)(piVar20 + -2) == *(long *)PTR_DAT_09f46a98) {
          puVar9 = (undefined8 *)(lVar8 + (long)(*piVar20 + 6) * 0x10 + 0x138);
          goto code_r0x0984d034;
        }
        uVar19 = uVar19 - 1;
        piVar20 = piVar20 + 4;
      } while (uVar19 != 0);
    }
    puVar9 = (undefined8 *)func_0x041cb4c4(plVar10,*(long *)PTR_DAT_09f46a98,6);
code_r0x0984d034:
    (*(code *)*puVar9)(puVar5 + -0x158,plVar10,auVar34._4_4_,puVar9[1]);
    puVar22 = PTR_DAT_09ec4a50;
    if ((*(long *)(puVar5 + -0x158) != 0) && (plVar21 != (long *)0x0)) {
      lVar8 = *plVar21;
      uVar6 = *(undefined4 *)(puVar5 + -0x148);
      uVar2 = *(undefined4 *)(*(long *)(puVar5 + -0x158) + 0x3c);
      uVar19 = (ulong)*(ushort *)(lVar8 + 0x12e);
      if (uVar19 != 0) {
        piVar20 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
        do {
          if (*(long *)(piVar20 + -2) == *(long *)PTR_DAT_09f470e0) {
            puVar9 = (undefined8 *)(lVar8 + (long)(*piVar20 + 6) * 0x10 + 0x138);
            goto code_r0x0984d0bc;
          }
          uVar19 = uVar19 - 1;
          piVar20 = piVar20 + 4;
        } while (uVar19 != 0);
      }
      puVar9 = (undefined8 *)func_0x041cb4c4(plVar21,*(long *)PTR_DAT_09f470e0,6);
code_r0x0984d0bc:
      (*(code *)*puVar9)(puVar5 + -0x158,plVar21,uVar2,puVar9[1]);
      lVar8 = *(long *)puVar22;
      *(undefined8 *)(puVar5 + -0x118) = *(undefined8 *)(puVar5 + -0x150);
      *(undefined8 *)(puVar5 + -0x120) = *(undefined8 *)(puVar5 + -0x158);
      *(undefined8 *)(puVar5 + -0x108) = *(undefined8 *)(puVar5 + -0x140);
      *(undefined8 *)(puVar5 + -0x110) = *(undefined8 *)(puVar5 + -0x148);
      *(undefined8 *)(puVar5 + -0xf8) = *(undefined8 *)(puVar5 + -0x130);
      *(undefined8 *)(puVar5 + -0x100) = *(undefined8 *)(puVar5 + -0x138);
      if (*(int *)(lVar8 + 0xe0) == 0) {
        func_0x04151a94();
      }
      if (*(int *)(puVar5 + -0x108) == auVar34._8_4_) {
        if (*(int *)(*(long *)puVar22 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar29 = func_0x091dc794(puVar5 + -0x120,uVar6,0);
        return auVar29;
      }
      goto code_r0x0984d124;
    }
  }
  uVar6 = func_0x04151bb8();
  puVar22 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  *(undefined **)(puVar5 + -400) = &WithNetwork_ArtBookStatusCalculator__CalculateIncompleteStatus;
  *(undefined8 *)(puVar5 + -0x188) = 0xa46e000;
  *(ulong *)(puVar5 + -0x180) = auVar34._0_8_ >> 0x20;
  *(long **)(puVar5 + -0x178) = plVar10;
  *(long **)(puVar5 + -0x170) = plVar21;
  *(ulong *)(puVar5 + -0x168) = auVar34._8_8_ & 0xffffffff;
  if ((bRam000000000a46e1e3 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46e1e3 = 1;
  }
  lVar8 = *(long *)puVar22;
  if (*(int *)(lVar8 + 0xe0) == 0) {
    func_0x04151a94();
    lVar8 = *(long *)puVar22;
  }
  uVar7 = *(undefined8 *)(*(long *)(lVar8 + 0xb8) + 0x10);
  uVar25 = *(undefined8 *)(*(long *)(lVar8 + 0xb8) + 0x18);
  extraout_x8[1] = 0;
  *extraout_x8 = 0;
  extraout_x8[3] = 0;
  extraout_x8[2] = 0;
  *(undefined4 *)extraout_x8 = uVar6;
  *(undefined4 *)((long)extraout_x8 + 4) = extraout_w1;
  extraout_x8[1] = uVar7;
  extraout_x8[2] = uVar25;
  *(undefined1 *)(extraout_x8 + 3) = 0;
  auVar27._8_4_ = uVar6;
  auVar27._0_8_ = extraout_x8;
  auVar27._12_4_ = 0;
  return auVar27;
}


```

## ArtBookStatusCalculator.CalculateStatus(DataTableContainer dataTableContainer, BaseStatusEvaluateConditionEvaluateDelegate evaluateDelegate, StatusType statusTy)

```c

void WithNetwork_ArtBookStatusCalculator__CalculateStatus(undefined8 *param_1)

{
  undefined8 uStack_30;
  undefined8 uStack_28;
  undefined8 uStack_20;
  undefined8 uStack_18;
  
  func_0x0984d218(&uStack_30);
  param_1[1] = uStack_28;
  *param_1 = uStack_30;
  param_1[3] = uStack_18;
  param_1[2] = uStack_20;
  return;
}


```

## ArtBookStatusCalculator.CalculateStatus(DataTableContainer dataTableContainer, BaseStatusEvaluateConditionEvaluateDelegate evaluateDelegate, StatusType statusTy)

```c

void WithNetwork_ArtBookStatusCalculator__CalculateStatus(undefined8 *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  int in_w3;
  undefined4 in_w4;
  undefined8 *extraout_x8;
  undefined1 auVar4 [16];
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined *puStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  if (in_w3 == 1) {
    auVar4 = func_0x0984d46c();
    uStack_38 = 0;
    uStack_40 = 0;
    uStack_28 = 0;
    uStack_30 = 0;
    func_0x091d1720(&uStack_40,in_w4,1,auVar4._0_8_,auVar4._8_8_,1,0);
  }
  else {
    if (in_w3 != 2) {
      uStack_40 = CONCAT44(uStack_40._4_4_,in_w3);
      uVar1 = func_0x04151930(PTR_DAT_09edb230);
      uVar1 = func_0x04151a9c(uVar1,&uStack_40);
      uVar2 = func_0x04151930(PTR_DAT_09f7f9a0);
      uVar1 = func_0x084656c4(uVar2,uVar1,0);
      func_0x04151930(PTR_DAT_09eadfb8);
      uVar2 = func_0x04151ba8();
      func_0x085befc4(uVar2,uVar1,0);
      uVar3 = func_0x04151930(
                             PTR_Method_WithNetwork_ArtBookStatusCalculator_CalculateStatus___09f7f9c8
                             );
      func_0x04151a84(uVar2,uVar3);
      puStack_50 = &WithNetwork_ArtBookStatusCalculator__CalculateStatusTargetCharacter;
      uStack_48 = uVar1;
      WithNetwork_ArtBookStatusCalculator__CalculateStatus(&uStack_70);
      extraout_x8[1] = uStack_68;
      *extraout_x8 = uStack_70;
      extraout_x8[3] = uStack_58;
      extraout_x8[2] = uStack_60;
      return;
    }
    func_0x0984d340(&uStack_40);
  }
  param_1[1] = uStack_38;
  *param_1 = uStack_40;
  param_1[3] = uStack_28;
  param_1[2] = uStack_30;
  return;
}


```

## ArtBookStatusCalculator.CalculatePercentStatus(DataTableContainer dataTableContainer, BaseStatusEvaluateConditionEvaluateDelegate evaluateDelegate, StatusType statusTy)

```c

void WithNetwork_ArtBookStatusCalculator__CalculatePercentStatus
               (undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
               undefined4 param_5,undefined4 param_6,undefined4 param_7)

{
  undefined *puVar1;
  long lVar2;
  undefined1 auVar3 [16];
  
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a46e1e4 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46e1e4 = 1;
  }
  auVar3 = func_0x0984d46c(param_2,param_3,param_4,2,param_6,param_7);
  lVar2 = *(long *)puVar1;
  if (*(int *)(lVar2 + 0xe0) == 0) {
    func_0x04151a94();
    lVar2 = *(long *)puVar1;
  }
  auVar3 = func_0x09774360(auVar3._0_8_,auVar3._8_8_,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x10)
                           ,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x18),0);
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_5;
  *(undefined4 *)((long)param_1 + 4) = 2;
  *(undefined1 (*) [16])(param_1 + 1) = auVar3;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## ArtBookStatusCalculator.CalculateConstantStatus(DataTableContainer dataTableContainer, BaseStatusEvaluateConditionEvaluateDelegate evaluateDelegate, StatusType statusTy)

```c

void WithNetwork_ArtBookStatusCalculator__CalculateConstantStatus(undefined8 *param_1)

{
  undefined4 in_w3;
  undefined1 auVar1 [16];
  
  auVar1 = func_0x0984d46c();
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = in_w3;
  *(undefined4 *)((long)param_1 + 4) = 1;
  *(undefined1 (*) [16])(param_1 + 1) = auVar1;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## AssistSkillStatusCalculator.CalculateStatus(DataTableContainer tableContainer, StatusType statusType, HuntBaseStatusCalculateType calculateType, int id)

```c

/* WARNING: Possible PIC construction at 0x0984dc78: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0984dc7c) */

void WithNetwork_AssistSkillStatusCalculator__CalculateStatus
               (undefined8 param_1,undefined8 param_2,int param_3,undefined4 param_4)

{
  undefined *puVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 *extraout_x8;
  int *piVar5;
  undefined1 auVar6 [16];
  int aiStack_40 [8];
  
  auVar6._8_8_ = param_2;
  auVar6._0_8_ = param_1;
  piVar5 = aiStack_40;
  if (param_3 != 2) {
    aiStack_40[0] = param_3;
    uVar2 = func_0x04151930(PTR_DAT_09edb230);
    uVar2 = func_0x04151a9c(uVar2,aiStack_40);
    uVar3 = func_0x04151930(PTR_DAT_09f7f9a0);
    uVar2 = func_0x084656c4(uVar3,uVar2,0);
    func_0x04151930(PTR_DAT_09eadfb8);
    uVar3 = func_0x04151ba8();
    param_4 = 0;
    func_0x085befc4(uVar3,uVar2);
    uVar2 = func_0x04151930(
                           PTR_Method_WithNetwork_AssistSkillStatusCalculator_CalculateStatus___09f7f9f0
                           );
    auVar6 = func_0x04151a84(uVar3,uVar2);
    piVar5 = (int *)extraout_x8;
  }
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a46e1e9 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46e1e9 = 1;
  }
  auVar6 = func_0x0984e568(auVar6._0_8_,auVar6._8_8_ & 0xffffffff);
  lVar4 = *(long *)puVar1;
  if (*(int *)(lVar4 + 0xe0) == 0) {
    func_0x04151a94();
    lVar4 = *(long *)puVar1;
  }
  auVar6 = func_0x09774360(auVar6._0_8_,auVar6._8_8_,*(undefined8 *)(*(long *)(lVar4 + 0xb8) + 0x10)
                           ,*(undefined8 *)(*(long *)(lVar4 + 0xb8) + 0x18),0);
  *(undefined8 *)((long)piVar5 + 8) = 0;
  *(undefined8 *)piVar5 = 0;
  *(undefined8 *)((long)piVar5 + 0x18) = 0;
  *(undefined8 *)((long)piVar5 + 0x10) = 0;
  *piVar5 = param_4;
  *(undefined4 *)((long)piVar5 + 4) = 2;
  *(undefined1 (*) [16])((long)piVar5 + 8) = auVar6;
  *(undefined1 *)((long)piVar5 + 0x18) = 1;
  return;
}


```

## AssistSkillStatusCalculator.CalculatePercentStatus(DataTableContainer tableContainer, StatusType statusType, int id)

```c

void WithNetwork_AssistSkillStatusCalculator__CalculatePercentStatus
               (undefined8 *param_1,undefined8 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined *puVar1;
  long lVar2;
  undefined1 auVar3 [16];
  
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a46e1e9 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46e1e9 = 1;
  }
  auVar3 = func_0x0984e568(param_2,param_3);
  lVar2 = *(long *)puVar1;
  if (*(int *)(lVar2 + 0xe0) == 0) {
    func_0x04151a94();
    lVar2 = *(long *)puVar1;
  }
  auVar3 = func_0x09774360(auVar3._0_8_,auVar3._8_8_,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x10)
                           ,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x18),0);
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_4;
  *(undefined4 *)((long)param_1 + 4) = 2;
  *(undefined1 (*) [16])(param_1 + 1) = auVar3;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## BlessingStatusCalculator.CalculateStatus(DataTableContainer tableContainer, StatusType statusType, HuntBaseStatusCalculateType calculateType, int id)

```c

/* WARNING: Possible PIC construction at 0x0984e8b0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0984e900: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0984e8b4) */
/* WARNING: Removing unreachable block (ram,0x0984e904) */

void WithNetwork_BlessingStatusCalculator__CalculateStatus
               (undefined8 param_1,undefined8 param_2,int param_3,undefined4 param_4)

{
  undefined *puVar1;
  int *piVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  undefined4 uVar6;
  undefined8 *extraout_x8;
  int *piVar7;
  undefined1 auVar8 [16];
  int aiStack_40 [8];
  
  auVar8._8_8_ = param_2;
  auVar8._0_8_ = param_1;
  piVar7 = aiStack_40;
  piVar2 = aiStack_40;
  if (param_3 == 1) {
    auVar8 = func_0x0984ead4();
    uVar6 = 1;
  }
  else if (param_3 == 3) {
    auVar8 = func_0x0984ead4();
    uVar6 = 3;
    piVar2 = aiStack_40;
  }
  else {
    if (param_3 != 2) {
      aiStack_40[0] = param_3;
      uVar3 = func_0x04151930(PTR_DAT_09edb230);
      uVar3 = func_0x04151a9c(uVar3,aiStack_40);
      uVar4 = func_0x04151930(PTR_DAT_09f7f9a0);
      uVar3 = func_0x084656c4(uVar4,uVar3,0);
      func_0x04151930(PTR_DAT_09eadfb8);
      uVar4 = func_0x04151ba8();
      param_4 = 0;
      func_0x085befc4(uVar4,uVar3);
      uVar3 = func_0x04151930(
                             PTR_Method_WithNetwork_BlessingStatusCalculator_CalculateStatus___09f7f9f8
                             );
      auVar8 = func_0x04151a84(uVar4,uVar3);
      piVar7 = (int *)extraout_x8;
    }
    puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if ((bRam000000000a46e1eb & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      bRam000000000a46e1eb = 1;
    }
    auVar8 = func_0x0984ead4(auVar8._0_8_,auVar8._8_8_ & 0xffffffff);
    lVar5 = *(long *)puVar1;
    if (*(int *)(lVar5 + 0xe0) == 0) {
      func_0x04151a94();
      lVar5 = *(long *)puVar1;
    }
    auVar8 = func_0x09774360(auVar8._0_8_,auVar8._8_8_,
                             *(undefined8 *)(*(long *)(lVar5 + 0xb8) + 0x10),
                             *(undefined8 *)(*(long *)(lVar5 + 0xb8) + 0x18),0);
    *(undefined8 *)((long)piVar7 + 8) = 0;
    *(undefined8 *)piVar7 = 0;
    *(undefined8 *)((long)piVar7 + 0x18) = 0;
    *(undefined8 *)((long)piVar7 + 0x10) = 0;
    uVar6 = 2;
    piVar2 = piVar7;
  }
  *piVar2 = param_4;
  *(undefined4 *)((long)piVar2 + 4) = uVar6;
  *(undefined1 (*) [16])((long)piVar2 + 8) = auVar8;
  *(undefined1 *)((long)piVar2 + 0x18) = 1;
  return;
}


```

## BlessingStatusCalculator.CalculatePercentStatus(DataTableContainer tableContainer, StatusType statusType, int id)

```c

void WithNetwork_BlessingStatusCalculator__CalculatePercentStatus
               (undefined8 *param_1,undefined8 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined *puVar1;
  long lVar2;
  undefined1 auVar3 [16];
  
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a46e1eb & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46e1eb = 1;
  }
  auVar3 = func_0x0984ead4(param_2,param_3);
  lVar2 = *(long *)puVar1;
  if (*(int *)(lVar2 + 0xe0) == 0) {
    func_0x04151a94();
    lVar2 = *(long *)puVar1;
  }
  auVar3 = func_0x09774360(auVar3._0_8_,auVar3._8_8_,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x10)
                           ,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x18),0);
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_4;
  *(undefined4 *)((long)param_1 + 4) = 2;
  *(undefined1 (*) [16])(param_1 + 1) = auVar3;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## BlessingStatusCalculator.CalculateConstantStatus(DataTableContainer tableContainer, StatusType statusType, int id)

```c

void WithNetwork_BlessingStatusCalculator__CalculateConstantStatus
               (undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4)

{
  undefined1 auVar1 [16];
  
  auVar1 = func_0x0984ead4();
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_4;
  *(undefined4 *)((long)param_1 + 4) = 1;
  *(undefined1 (*) [16])(param_1 + 1) = auVar1;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## BuffItemStatusCalculator.CalculateStatus(DataTableContainer tableContainer, StatusType statusType, HuntBaseStatusCalculateType calculateType, int id)

```c

/* WARNING: Possible PIC construction at 0x0984ef3c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0984ef40) */

void WithNetwork_BuffItemStatusCalculator__CalculateStatus
               (undefined8 *param_1,undefined8 param_2,undefined8 param_3,int param_4,
               undefined4 param_5)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *extraout_x8;
  undefined1 auVar4 [16];
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  puVar1 = &uStack_40;
  if (param_4 != 2) {
    if (param_4 == 1) {
      auVar4 = func_0x0984f0dc();
    }
    else {
      uStack_40 = CONCAT44(uStack_40._4_4_,param_4);
      uVar2 = func_0x04151930(PTR_DAT_09edb230);
      uVar2 = func_0x04151a9c(uVar2,&uStack_40);
      uVar3 = func_0x04151930(PTR_DAT_09f7f9a0);
      uVar2 = func_0x084656c4(uVar3,uVar2,0);
      func_0x04151930(PTR_DAT_09eadfb8);
      uVar3 = func_0x04151ba8();
      param_5 = 0;
      func_0x085befc4(uVar3,uVar2);
      uVar2 = func_0x04151930(
                             PTR_Method_WithNetwork_BuffItemStatusCalculator_CalculateStatus___09f7fa08
                             );
      func_0x04151a84(uVar3,uVar2);
      auVar4 = func_0x0984f0dc();
      extraout_x8[1] = 0;
      *extraout_x8 = 0;
      extraout_x8[3] = 0;
      extraout_x8[2] = 0;
      puVar1 = extraout_x8;
    }
    *(undefined4 *)puVar1 = param_5;
    *(undefined4 *)((long)puVar1 + 4) = 1;
    *(undefined1 (*) [16])(puVar1 + 1) = auVar4;
    *(undefined1 *)(puVar1 + 3) = 1;
    return;
  }
  func_0x0984f01c(&uStack_40,param_2,param_3,param_5);
  param_1[1] = uStack_38;
  *param_1 = uStack_40;
  param_1[3] = uStack_28;
  param_1[2] = uStack_30;
  return;
}


```

## BuffItemStatusCalculator.CalculateConstantStatus(DataTableContainer tableContainer, StatusType statusType, int id)

```c

void WithNetwork_BuffItemStatusCalculator__CalculateConstantStatus
               (undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4)

{
  undefined1 auVar1 [16];
  
  auVar1 = func_0x0984f0dc();
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_4;
  *(undefined4 *)((long)param_1 + 4) = 1;
  *(undefined1 (*) [16])(param_1 + 1) = auVar1;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## BuffItemStatusCalculator.CalculatePercentStatus(DataTableContainer tableContainer, StatusType statusType, int id)

```c

void WithNetwork_BuffItemStatusCalculator__CalculatePercentStatus
               (undefined8 *param_1,undefined8 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined *puVar1;
  long lVar2;
  undefined1 auVar3 [16];
  
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a46e1ed & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46e1ed = 1;
  }
  auVar3 = func_0x0984f0dc(param_2,param_3);
  lVar2 = *(long *)puVar1;
  if (*(int *)(lVar2 + 0xe0) == 0) {
    func_0x04151a94();
    lVar2 = *(long *)puVar1;
  }
  auVar3 = func_0x09774360(auVar3._0_8_,auVar3._8_8_,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x10)
                           ,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x18),0);
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_4;
  *(undefined4 *)((long)param_1 + 4) = 2;
  *(undefined1 (*) [16])(param_1 + 1) = auVar3;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## CollectionBookStatusCalculator.CalculateStatus(DataTableContainer tableContainer, StatusType statusType, HuntBaseStatusCalculateType calculateType, int id)

```c

/* WARNING: Possible PIC construction at 0x0984f430: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0984f434) */

void WithNetwork_CollectionBookStatusCalculator__CalculateStatus
               (undefined8 *param_1,undefined8 param_2,undefined8 param_3,int param_4,
               undefined4 param_5)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *extraout_x8;
  undefined1 auVar4 [16];
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  puVar1 = &uStack_40;
  if (param_4 != 2) {
    if (param_4 == 1) {
      auVar4 = func_0x0984f5d8();
    }
    else {
      uStack_40 = CONCAT44(uStack_40._4_4_,param_4);
      uVar2 = func_0x04151930(PTR_DAT_09edb230);
      uVar2 = func_0x04151a9c(uVar2,&uStack_40);
      uVar3 = func_0x04151930(PTR_DAT_09f7f9a0);
      uVar2 = func_0x084656c4(uVar3,uVar2,0);
      func_0x04151930(PTR_DAT_09eadfb8);
      uVar3 = func_0x04151ba8();
      param_5 = 0;
      func_0x085befc4(uVar3,uVar2);
      uVar2 = func_0x04151930(
                             PTR_Method_WithNetwork_CollectionBookStatusCalculator_CalculateStatus___09f7fa10
                             );
      auVar4 = func_0x04151a84(uVar3,uVar2);
      auVar4 = func_0x0984f5d8(auVar4._0_8_,auVar4._8_8_,1);
      extraout_x8[1] = 0;
      *extraout_x8 = 0;
      extraout_x8[3] = 0;
      extraout_x8[2] = 0;
      puVar1 = extraout_x8;
    }
    *(undefined4 *)puVar1 = param_5;
    *(undefined4 *)((long)puVar1 + 4) = 1;
    *(undefined1 (*) [16])(puVar1 + 1) = auVar4;
    *(undefined1 *)(puVar1 + 3) = 1;
    return;
  }
  func_0x0984f514(&uStack_40,param_2,param_3,param_5);
  param_1[1] = uStack_38;
  *param_1 = uStack_40;
  param_1[3] = uStack_28;
  param_1[2] = uStack_30;
  return;
}


```

## CollectionBookStatusCalculator.CalculatePercentStatus(DataTableContainer tableContainer, StatusType statusType, int id)

```c

void WithNetwork_CollectionBookStatusCalculator__CalculatePercentStatus
               (undefined8 *param_1,undefined8 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined *puVar1;
  long lVar2;
  undefined1 auVar3 [16];
  
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a46e1ef & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46e1ef = 1;
  }
  auVar3 = func_0x0984f5d8(param_2,param_3,2);
  lVar2 = *(long *)puVar1;
  if (*(int *)(lVar2 + 0xe0) == 0) {
    func_0x04151a94();
    lVar2 = *(long *)puVar1;
  }
  auVar3 = func_0x09774360(auVar3._0_8_,auVar3._8_8_,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x10)
                           ,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x18),0);
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_4;
  *(undefined4 *)((long)param_1 + 4) = 2;
  *(undefined1 (*) [16])(param_1 + 1) = auVar3;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## CollectionBookStatusCalculator.CalculateConstantStatus(DataTableContainer tableContainer, StatusType statusType, int id)

```c

void WithNetwork_CollectionBookStatusCalculator__CalculateConstantStatus
               (undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4)

{
  undefined1 auVar1 [16];
  
  auVar1 = func_0x0984f5d8(param_2,param_3,1);
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_4;
  *(undefined4 *)((long)param_1 + 4) = 1;
  *(undefined1 (*) [16])(param_1 + 1) = auVar1;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## CookingMenuStatusCalculator.CalculateStatus(DataTableContainer tableContainer, StatusType statusType, HuntBaseStatusCalculateType calculateType, int id)

```c

/* WARNING: Possible PIC construction at 0x0984f9d0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0984f9d4) */

void WithNetwork_CookingMenuStatusCalculator__CalculateStatus
               (undefined8 *param_1,undefined8 param_2,undefined8 param_3,int param_4,
               undefined4 param_5)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *extraout_x8;
  undefined1 auVar4 [16];
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  puVar1 = &uStack_40;
  if (param_4 != 2) {
    if (param_4 == 1) {
      auVar4 = func_0x0984fb70();
    }
    else {
      uStack_40 = CONCAT44(uStack_40._4_4_,param_4);
      uVar2 = func_0x04151930(PTR_DAT_09edb230);
      uVar2 = func_0x04151a9c(uVar2,&uStack_40);
      uVar3 = func_0x04151930(PTR_DAT_09f7f9a0);
      uVar2 = func_0x084656c4(uVar3,uVar2,0);
      func_0x04151930(PTR_DAT_09eadfb8);
      uVar3 = func_0x04151ba8();
      param_5 = 0;
      func_0x085befc4(uVar3,uVar2);
      uVar2 = func_0x04151930(
                             PTR_Method_WithNetwork_CookingMenuStatusCalculator_CalculateStatus___09f7fa18
                             );
      func_0x04151a84(uVar3,uVar2);
      auVar4 = func_0x0984fb70();
      extraout_x8[1] = 0;
      *extraout_x8 = 0;
      extraout_x8[3] = 0;
      extraout_x8[2] = 0;
      puVar1 = extraout_x8;
    }
    *(undefined4 *)puVar1 = param_5;
    *(undefined4 *)((long)puVar1 + 4) = 1;
    *(undefined1 (*) [16])(puVar1 + 1) = auVar4;
    *(undefined1 *)(puVar1 + 3) = 1;
    return;
  }
  func_0x0984fab0(&uStack_40,param_2,param_3,param_5);
  param_1[1] = uStack_38;
  *param_1 = uStack_40;
  param_1[3] = uStack_28;
  param_1[2] = uStack_30;
  return;
}


```

## CookingMenuStatusCalculator.CalculatePercentStatus(DataTableContainer tableContainer, StatusType statusType, int id)

```c

void WithNetwork_CookingMenuStatusCalculator__CalculatePercentStatus
               (undefined8 *param_1,undefined8 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined *puVar1;
  long lVar2;
  undefined1 auVar3 [16];
  
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a46e1f1 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46e1f1 = 1;
  }
  auVar3 = func_0x0984fb70(param_2,param_3);
  lVar2 = *(long *)puVar1;
  if (*(int *)(lVar2 + 0xe0) == 0) {
    func_0x04151a94();
    lVar2 = *(long *)puVar1;
  }
  auVar3 = func_0x09774360(auVar3._0_8_,auVar3._8_8_,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x10)
                           ,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x18),0);
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_4;
  *(undefined4 *)((long)param_1 + 4) = 2;
  *(undefined1 (*) [16])(param_1 + 1) = auVar3;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## CookingMenuStatusCalculator.CalculateConstantStatus(DataTableContainer tableContainer, StatusType statusType, int id)

```c

void WithNetwork_CookingMenuStatusCalculator__CalculateConstantStatus
               (undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4)

{
  undefined1 auVar1 [16];
  
  auVar1 = func_0x0984fb70();
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_4;
  *(undefined4 *)((long)param_1 + 4) = 1;
  *(undefined1 (*) [16])(param_1 + 1) = auVar1;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## CostumeStatusCalculator.CalculateStatus(DataTableContainer dataTableContainer, IMasterTable<CostumePossessionEffectRecord> costumePossessionEffectTable, BaseSta)

```c

/* WARNING: Possible PIC construction at 0x09850050: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09850080: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x09850054) */
/* WARNING: Removing unreachable block (ram,0x09850084) */

void WithNetwork_CostumeStatusCalculator__CalculateStatus
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,ulong param_4,int param_5,
               int param_6)

{
  undefined *puVar1;
  int *piVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  int iVar6;
  int *extraout_x8;
  undefined1 auVar7 [16];
  int aiStack_40 [8];
  
  auVar7._8_8_ = param_2;
  auVar7._0_8_ = param_1;
  piVar2 = aiStack_40;
  if (param_5 == 1) {
    auVar7 = func_0x0985033c();
    iVar6 = 1;
  }
  else {
    piVar2 = aiStack_40;
    if (param_5 != 2) {
      aiStack_40[0] = param_5;
      param_6 = param_5;
      uVar3 = func_0x04151930(PTR_DAT_09edb230);
      uVar3 = func_0x04151a9c(uVar3,aiStack_40);
      uVar4 = func_0x04151930(PTR_DAT_09f7f9a0);
      uVar3 = func_0x084656c4(uVar4,uVar3,0);
      func_0x04151930(PTR_DAT_09eadfb8);
      uVar4 = func_0x04151ba8();
      param_3 = 0;
      func_0x085befc4(uVar4,uVar3,0);
      uVar3 = func_0x04151930(
                             PTR_Method_WithNetwork_CostumeStatusCalculator_CalculateStatus___09f7fa20
                             );
      auVar7 = func_0x04151a84(uVar4,uVar3);
      piVar2 = extraout_x8;
    }
    puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if ((bRam000000000a46e1f4 & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      bRam000000000a46e1f4 = 1;
    }
    auVar7 = func_0x0985033c(auVar7._0_8_,auVar7._8_8_,param_3,param_4 & 0xffffffff);
    lVar5 = *(long *)puVar1;
    if (*(int *)(lVar5 + 0xe0) == 0) {
      func_0x04151a94();
      lVar5 = *(long *)puVar1;
    }
    auVar7 = func_0x09774360(auVar7._0_8_,auVar7._8_8_,
                             *(undefined8 *)(*(long *)(lVar5 + 0xb8) + 0x10),
                             *(undefined8 *)(*(long *)(lVar5 + 0xb8) + 0x18),0);
    piVar2[2] = 0;
    piVar2[3] = 0;
    piVar2[0] = 0;
    piVar2[1] = 0;
    piVar2[6] = 0;
    piVar2[7] = 0;
    piVar2[4] = 0;
    piVar2[5] = 0;
    iVar6 = 2;
  }
  *piVar2 = param_6;
  piVar2[1] = iVar6;
  *(undefined1 (*) [16])(piVar2 + 2) = auVar7;
  *(undefined1 *)(piVar2 + 6) = 1;
  return;
}


```

## CostumeStatusCalculator.CalculatePromotionStatus(DataTableContainer dataTableContainer, IMasterTable<CostumePossessionEffectRecord> costumePossessionEffectTable, BaseSta)

```c

/* WARNING: Possible PIC construction at 0x0985026c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x09850270) */

void WithNetwork_CostumeStatusCalculator__CalculatePromotionStatus(void)

{
  int *piVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  int in_w4;
  int in_w5;
  int *extraout_x8;
  undefined1 auVar4 [16];
  int aiStack_40 [8];
  
  piVar1 = aiStack_40;
  if (in_w4 == 2) {
    auVar4 = func_0x09850718();
  }
  else {
    aiStack_40[0] = in_w4;
    in_w5 = in_w4;
    uVar2 = func_0x04151930(PTR_DAT_09edb230);
    uVar2 = func_0x04151a9c(uVar2,aiStack_40);
    uVar3 = func_0x04151930(PTR_DAT_09f7f9a0);
    uVar2 = func_0x084656c4(uVar3,uVar2,0);
    func_0x04151930(PTR_DAT_09eadfb8);
    uVar3 = func_0x04151ba8();
    func_0x085befc4(uVar3,uVar2,0);
    uVar2 = func_0x04151930(
                           PTR_Method_WithNetwork_CostumeStatusCalculator_CalculatePromotionStatus___09f7fa28
                           );
    func_0x04151a84(uVar3,uVar2);
    auVar4 = func_0x09850718();
    extraout_x8[2] = 0;
    extraout_x8[3] = 0;
    extraout_x8[0] = 0;
    extraout_x8[1] = 0;
    extraout_x8[6] = 0;
    extraout_x8[7] = 0;
    extraout_x8[4] = 0;
    extraout_x8[5] = 0;
    piVar1 = extraout_x8;
  }
  *piVar1 = in_w5;
  piVar1[1] = 2;
  *(undefined1 (*) [16])(piVar1 + 2) = auVar4;
  *(undefined1 *)(piVar1 + 6) = 1;
  return;
}


```

## CostumeStatusCalculator.CalculatePercentStatus(DataTableContainer dataTableContainer, IMasterTable<CostumePossessionEffectRecord> costumePossessionEffectTable, BaseSta)

```c

void WithNetwork_CostumeStatusCalculator__CalculatePercentStatus
               (undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined4 param_5,undefined4 param_6)

{
  undefined *puVar1;
  long lVar2;
  undefined1 auVar3 [16];
  
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a46e1f4 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46e1f4 = 1;
  }
  auVar3 = func_0x0985033c(param_2,param_3,param_4,param_5);
  lVar2 = *(long *)puVar1;
  if (*(int *)(lVar2 + 0xe0) == 0) {
    func_0x04151a94();
    lVar2 = *(long *)puVar1;
  }
  auVar3 = func_0x09774360(auVar3._0_8_,auVar3._8_8_,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x10)
                           ,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x18),0);
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_6;
  *(undefined4 *)((long)param_1 + 4) = 2;
  *(undefined1 (*) [16])(param_1 + 1) = auVar3;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## CostumeStatusCalculator.CalculateConstantStatus(DataTableContainer dataTableContainer, IMasterTable<CostumePossessionEffectRecord> costumePossessionEffectTable, BaseSta)

```c

void WithNetwork_CostumeStatusCalculator__CalculateConstantStatus(undefined8 *param_1)

{
  undefined4 in_w4;
  undefined1 auVar1 [16];
  
  auVar1 = func_0x0985033c();
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = in_w4;
  *(undefined4 *)((long)param_1 + 4) = 1;
  *(undefined1 (*) [16])(param_1 + 1) = auVar1;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## HomeItemStatusCalculator.CalculateStatus(DataTableContainer tableContainer, StatusType statusType, HuntBaseStatusCalculateType calculateType, int id)

```c

/* WARNING: Possible PIC construction at 0x09850b0c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x09850b10) */

void WithNetwork_HomeItemStatusCalculator__CalculateStatus
               (undefined8 param_1,undefined8 param_2,int param_3,undefined4 param_4)

{
  int *piVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *extraout_x8;
  undefined1 auVar4 [16];
  int aiStack_40 [8];
  
  piVar1 = aiStack_40;
  if (param_3 == 2) {
    auVar4 = func_0x09850bdc();
  }
  else {
    aiStack_40[0] = param_3;
    uVar2 = func_0x04151930(PTR_DAT_09edb230);
    uVar2 = func_0x04151a9c(uVar2,aiStack_40);
    uVar3 = func_0x04151930(PTR_DAT_09f7f9a0);
    uVar2 = func_0x084656c4(uVar3,uVar2,0);
    func_0x04151930(PTR_DAT_09eadfb8);
    uVar3 = func_0x04151ba8();
    param_4 = 0;
    func_0x085befc4(uVar3,uVar2);
    uVar2 = func_0x04151930(
                           PTR_Method_WithNetwork_HomeItemStatusCalculator_CalculateStatus___09f7fa30
                           );
    func_0x04151a84(uVar3,uVar2);
    auVar4 = func_0x09850bdc();
    extraout_x8[1] = 0;
    *extraout_x8 = 0;
    extraout_x8[3] = 0;
    extraout_x8[2] = 0;
    piVar1 = (int *)extraout_x8;
  }
  *piVar1 = param_4;
  *(undefined4 *)((long)piVar1 + 4) = 2;
  *(undefined1 (*) [16])((long)piVar1 + 8) = auVar4;
  *(undefined1 *)((long)piVar1 + 0x18) = 1;
  return;
}


```

## HomeItemStatusCalculator.CalculatePercentStatus(DataTableContainer tableContainer, StatusType statusType, int id)

```c

void WithNetwork_HomeItemStatusCalculator__CalculatePercentStatus
               (undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4)

{
  undefined1 auVar1 [16];
  
  auVar1 = func_0x09850bdc();
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_4;
  *(undefined4 *)((long)param_1 + 4) = 2;
  *(undefined1 (*) [16])(param_1 + 1) = auVar1;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## KeyholderStatusCalculator.CalculateStatus(DataTableContainer tableContainer, StatusType statusType, HuntBaseStatusCalculateType calculateType, int id)

```c

/* WARNING: Possible PIC construction at 0x09850ef8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09851120: Changing call to branch */
/* WARNING: Possible PIC construction at 0x098524fc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0985251c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09852548: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x09852520) */
/* WARNING: Removing unreachable block (ram,0x09852524) */
/* WARNING: Removing unreachable block (ram,0x09852500) */
/* WARNING: Removing unreachable block (ram,0x09852504) */
/* WARNING: Removing unreachable block (ram,0x09851124) */
/* WARNING: Removing unreachable block (ram,0x09851138) */
/* WARNING: Removing unreachable block (ram,0x09851140) */
/* WARNING: Removing unreachable block (ram,0x091d1720) */
/* WARNING: Removing unreachable block (ram,0x09850efc) */
/* WARNING: Removing unreachable block (ram,0x0985254c) */
/* WARNING: Removing unreachable block (ram,0x09852568) */
/* WARNING: Removing unreachable block (ram,0x0985256c) */

undefined8
WithNetwork_KeyholderStatusCalculator__CalculateStatus
          (undefined8 param_1,undefined8 param_2,int param_3,long *param_4,long *param_5,
          long *param_6,ulong param_7,undefined8 param_8)

{
  uint uVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined *puVar7;
  undefined *puVar8;
  undefined *puVar9;
  undefined *puVar10;
  undefined *puVar11;
  undefined4 *puVar12;
  undefined4 *puVar13;
  int iVar14;
  undefined8 uVar17;
  undefined8 uVar18;
  int iVar15;
  undefined4 uVar16;
  long *plVar19;
  long *plVar20;
  undefined8 *puVar21;
  undefined *puVar22;
  undefined8 *puVar23;
  long *extraout_x1;
  long *plVar26;
  long *plVar27;
  long *plVar28;
  undefined1 *extraout_x8;
  long lVar29;
  long lVar30;
  long lVar31;
  ulong uVar32;
  ulong uVar33;
  undefined1 (*pauVar34) [16];
  int *piVar35;
  undefined *puVar36;
  int *piVar37;
  long *plVar38;
  long *plVar39;
  ulong uVar40;
  undefined8 *unaff_x24;
  undefined *unaff_x25;
  long lVar41;
  undefined *unaff_x26;
  long *unaff_x27;
  ulong unaff_x28;
  long *unaff_x29;
  long *plVar42;
  undefined *puVar43;
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [12];
  undefined1 auVar48 [16];
  undefined4 auStack_b0 [4];
  int aiStack_40 [8];
  long *plVar24;
  long *plVar25;
  
  auVar44._8_8_ = param_2;
  auVar44._0_8_ = param_1;
  piVar37 = aiStack_40;
  if (param_3 == 2) {
    plVar26 = (long *)((ulong)param_4 & 0xffffffff);
  }
  else {
    aiStack_40[0] = param_3;
    uVar17 = func_0x04151930(PTR_DAT_09edb230);
    uVar17 = func_0x04151a9c(uVar17,aiStack_40);
    uVar18 = func_0x04151930(PTR_DAT_09f7f9a0);
    uVar17 = func_0x084656c4(uVar18,uVar17,0);
    func_0x04151930(PTR_DAT_09eadfb8);
    uVar18 = func_0x04151ba8();
    plVar26 = (long *)0x0;
    func_0x085befc4(uVar18,uVar17);
    uVar17 = func_0x04151930(
                            PTR_Method_WithNetwork_KeyholderStatusCalculator_CalculateStatus___09f7fa40
                            );
    auVar44 = func_0x04151a84(uVar18,uVar17);
    piVar37 = (int *)extraout_x8;
  }
  lVar29 = auVar44._0_8_;
  puVar12 = auStack_b0;
  puVar13 = auStack_b0;
  uVar17 = 0xa46e000;
  plVar39 = (long *)((ulong)plVar26 & 0xffffffff);
  plVar38 = (long *)(auVar44._8_8_ & 0xffffffff);
  if ((bRam000000000a46e1fb & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f4b448);
    func_0x0415191c(PTR_DAT_09f7e918);
    func_0x0415191c(PTR_DAT_09f7f928);
    func_0x0415191c(PTR_DAT_09f7f930);
    func_0x0415191c(PTR_DAT_09f7f938);
    func_0x0415191c(PTR_DAT_09f7f940);
    func_0x0415191c(PTR_DAT_09f7f948);
    func_0x0415191c(PTR_DAT_09f4b430);
    bRam000000000a46e1fb = 1;
  }
  puVar10 = PTR_DAT_09f7f948;
  puVar9 = PTR_DAT_09f7f940;
  puVar7 = PTR_DAT_09f7f938;
  puVar22 = PTR_DAT_09f7f930;
  puVar8 = PTR_DAT_09f7f928;
  puVar36 = PTR_DAT_09f7e918;
  puVar43 = PTR_DAT_09f4b448;
  if (lVar29 == 0) {
    puVar43 = &WithNetwork_KeyholderStatusCalculator__IsCharacterCostumeDeployed;
    iVar14 = func_0x04151bb8();
    uVar18 = 0;
    plVar19 = extraout_x1;
    plVar28 = plVar39;
    goto code_r0x098511a0;
  }
  uVar17 = func_0x053c2424(lVar29,*(undefined8 *)PTR_DAT_09f4b430);
  uVar18 = func_0x053bf1c0(lVar29,*(undefined8 *)puVar8);
  auVar46._8_8_ = uVar18;
  auVar46._0_8_ = uVar17;
  uVar17 = func_0x053c0fd4(lVar29,*(undefined8 *)puVar10);
  auVar5._8_8_ = uVar17;
  auVar5._0_8_ = uVar18;
  plVar26 = (long *)func_0x053c0e44(lVar29,*(undefined8 *)puVar9);
  auVar48._8_8_ = plVar26;
  auVar48._0_8_ = uVar17;
  plVar19 = (long *)func_0x053c09f8(lVar29,*(undefined8 *)puVar7);
  param_7 = func_0x053bf0f8(lVar29,*(undefined8 *)puVar36);
  plVar20 = (long *)func_0x053c0994(lVar29,*(undefined8 *)puVar22);
  param_8 = func_0x053be0f4(lVar29,*(undefined8 *)puVar43);
  auVar45._8_8_ = lVar29;
  auVar45._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  auStack_b0[0] = auVar44._8_4_;
  puVar43 = &UNK_09851124;
  unaff_x27 = plVar19;
  uVar32 = param_7;
  plVar42 = plVar20;
code_r0x09852168:
  puVar36 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  plVar28 = auVar48._8_8_;
  plVar27 = auVar48._0_8_;
  *(long **)(puVar13 + -0x18) = plVar42;
  *(undefined **)(puVar13 + -0x16) = puVar43;
  *(ulong *)(puVar13 + -0x14) = uVar32;
  *(long **)(puVar13 + -0x12) = unaff_x27;
  *(long **)(puVar13 + -0x10) = plVar26;
  *(long *)(puVar13 + -0xe) = auVar5._8_8_;
  *(long *)(puVar13 + -0xc) = auVar5._0_8_;
  *(undefined1 (*) [16])(puVar13 + -10) = auVar45;
  *(long **)(puVar13 + -6) = plVar38;
  *(int **)(puVar13 + -4) = piVar37;
  *(long **)(puVar13 + -2) = plVar39;
  puVar12 = puVar13 + -0x90;
  *(undefined8 *)(puVar13 + -0x84) = param_8;
  *(ulong *)(puVar13 + -0x82) = param_7;
  *(undefined1 (*) [16])(puVar13 + -0x8a) = auVar46;
  param_4 = plVar28;
  param_5 = plVar20;
  param_6 = plVar19;
  if ((bRam000000000a46e1fc & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f4bae8);
    func_0x0415191c(PTR_DAT_09f4ba28);
    func_0x0415191c(PTR_DAT_09f48a90);
    func_0x0415191c(PTR_DAT_09ee7dd8);
    func_0x0415191c(PTR_DAT_09f7faa8);
    func_0x0415191c(PTR_DAT_09f7fab0);
    func_0x0415191c(PTR_DAT_09f7f970);
    func_0x0415191c(PTR_DAT_09f7fa78);
    func_0x0415191c(PTR_DAT_09f7faa0);
    func_0x0415191c(PTR_DAT_09f7f978);
    func_0x0415191c(PTR_DAT_09eab348);
    bRam000000000a46e1fc = 1;
  }
  puVar43 = PTR_DAT_09f7fa78;
  lVar29 = *(long *)puVar36;
  *(undefined8 *)(puVar13 + -0x20) = 0;
  *(undefined8 *)(puVar13 + -0x1e) = 0;
  *(undefined8 *)(puVar13 + -0x1c) = 0;
  *(undefined8 *)(puVar13 + -0x26) = 0;
  *(undefined8 *)(puVar13 + -0x28) = 0;
  *(undefined8 *)(puVar13 + -0x22) = 0;
  *(undefined8 *)(puVar13 + -0x24) = 0;
  *(undefined8 *)(puVar13 + -0x2e) = 0;
  *(undefined8 *)(puVar13 + -0x30) = 0;
  *(undefined8 *)(puVar13 + -0x2a) = 0;
  *(undefined8 *)(puVar13 + -0x2c) = 0;
  *(undefined8 *)(puVar13 + -0x36) = 0;
  *(undefined8 *)(puVar13 + -0x38) = 0;
  *(undefined8 *)(puVar13 + -0x32) = 0;
  *(undefined8 *)(puVar13 + -0x34) = 0;
  if (*(int *)(lVar29 + 0xe0) == 0) {
    func_0x04151a94();
    lVar29 = *(long *)puVar36;
  }
  uVar18 = **(undefined8 **)(lVar29 + 0xb8);
  piVar37 = (int *)(*(undefined8 **)(lVar29 + 0xb8))[1];
  lVar29 = func_0x07649a18(0,*(undefined8 *)puVar43);
  puVar43 = PTR_DAT_09f7f970;
  if ((lVar29 != 0) && (plVar20 != (long *)0x0)) {
    lVar30 = *plVar20;
    uVar17 = *(undefined8 *)(lVar29 + 0x18);
    uVar32 = (ulong)*(ushort *)(lVar30 + 0x12e);
    if (uVar32 != 0) {
      piVar35 = (int *)(*(long *)(lVar30 + 0xb0) + 8);
      do {
        if (*(long *)(piVar35 + -2) == *(long *)PTR_DAT_09f48a90) {
          puVar21 = (undefined8 *)(lVar30 + (long)(*piVar35 + 8) * 0x10 + 0x138);
          goto code_r0x09852300;
        }
        uVar32 = uVar32 - 1;
        piVar35 = piVar35 + 4;
      } while (uVar32 != 0);
    }
    puVar21 = (undefined8 *)func_0x041cb4c4(plVar20,*(long *)PTR_DAT_09f48a90,8);
code_r0x09852300:
    (*(code *)*puVar21)(plVar20,uVar17,puVar21[1]);
    unaff_x29 = (long *)func_0x0764b4fc(0,*(undefined8 *)puVar43);
    if ((unaff_x29 != (long *)0x0) && (plVar27 != (long *)0x0)) {
      lVar31 = *plVar27;
      lVar41 = unaff_x29[3];
      uVar32 = (ulong)*(ushort *)(lVar31 + 0x12e);
      lVar30 = *(long *)PTR_DAT_09f4bae8;
      *(long **)(puVar13 + -0x86) = plVar20;
      *(long *)(puVar13 + -0x8e) = lVar29;
      if (uVar32 != 0) {
        piVar35 = (int *)(*(long *)(lVar31 + 0xb0) + 8);
        do {
          if (*(long *)(piVar35 + -2) == lVar30) {
            puVar21 = (undefined8 *)(lVar31 + (long)(*piVar35 + 8) * 0x10 + 0x138);
            goto code_r0x0985238c;
          }
          uVar32 = uVar32 - 1;
          piVar35 = piVar35 + 4;
        } while (uVar32 != 0);
      }
      puVar21 = (undefined8 *)func_0x041cb4c4(plVar27,lVar30,8);
code_r0x0985238c:
      (*(code *)*puVar21)(plVar27,lVar41,puVar21[1]);
      unaff_x25 = PTR_DAT_09f7fab0;
      unaff_x27 = (long *)PTR_DAT_09f4ba28;
      unaff_x26 = PTR_DAT_09ee7dd8;
      lVar29 = unaff_x29[3];
      plVar42 = unaff_x29;
      if (lVar29 != 0) {
        puVar13[-0x8b] = *puVar13;
        unaff_x24 = (undefined8 *)0x0;
        do {
          if (*(int *)(lVar29 + 0x18) <= (int)unaff_x24) goto code_r0x0985259c;
          func_0x06c0c2bc(puVar13 + -0x50,lVar29,unaff_x24,*(undefined8 *)unaff_x25);
          *(undefined8 *)(puVar13 + -0x1e) = *(undefined8 *)(puVar13 + -0x4e);
          *(undefined8 *)(puVar13 + -0x20) = *(undefined8 *)(puVar13 + -0x50);
          *(undefined8 *)(puVar13 + -0x1c) = *(undefined8 *)(puVar13 + -0x4c);
          uVar32 = func_0x091c6524(puVar13 + -0x20,0);
          if ((uVar32 & 1) == 0) {
            plVar26 = *(long **)(puVar13 + -0x1e);
            if (plVar26 == (long *)0x0) break;
            uVar16 = (**(code **)(*plVar26 + 0x1a8))(plVar26,*(undefined8 *)(*plVar26 + 0x1b0));
            uVar17 = *(undefined8 *)(puVar13 + -0x1c);
            if (*(int *)(*(long *)unaff_x26 + 0xe0) == 0) {
              func_0x04151a94(*(long *)unaff_x26);
            }
            uVar32 = func_0x091d295c(uVar16,uVar17,0);
            if (plVar28 == (long *)0x0) break;
            lVar29 = *plVar28;
            unaff_x28 = uVar32 & 0xffffffff;
            uVar32 = (ulong)*(ushort *)(lVar29 + 0x12e);
            if (uVar32 != 0) {
              piVar35 = (int *)(*(long *)(lVar29 + 0xb0) + 8);
              do {
                if (*(long *)(piVar35 + -2) == *unaff_x27) {
                  puVar21 = (undefined8 *)(lVar29 + (long)(*piVar35 + 6) * 0x10 + 0x138);
                  goto code_r0x0985249c;
                }
                uVar32 = uVar32 - 1;
                piVar35 = piVar35 + 4;
              } while (uVar32 != 0);
            }
            puVar21 = (undefined8 *)func_0x041cb4c4(plVar28,*unaff_x27,6);
code_r0x0985249c:
            (*(code *)*puVar21)(puVar13 + -0x50,plVar28,unaff_x28,puVar21[1]);
            func_0x098f6ee0(puVar13 + -0x38,puVar13 + -0x50,0x60);
            uVar32 = func_0x091d2af8(puVar13 + -0x38,0);
            if ((uVar32 & 1) != 0) goto code_r0x098524d0;
          }
          lVar29 = unaff_x29[3];
          unaff_x24 = (undefined8 *)(ulong)((int)unaff_x24 + 1);
          if (lVar29 == 0) break;
        } while( true );
      }
    }
  }
  goto code_r0x09852598;
code_r0x098524d0:
  if (*(int *)(*(long *)unaff_x26 + 0xe0) == 0) {
    func_0x04151a94();
  }
  plVar26 = *(long **)(puVar13 + -0x22);
  if (plVar26 == (long *)0x0) {
code_r0x09852598:
    func_0x04151bb8();
code_r0x0985259c:
    if (*(int *)(*(long *)PTR_DAT_09eab348 + 0xe0) == 0) {
      func_0x04151a94();
    }
    func_0x04324484(*(undefined8 *)(puVar13 + -0x8e),0);
    func_0x04324484(plVar42,0);
    return uVar18;
  }
  iVar14 = (**(code **)(*plVar26 + 0x1a8))(plVar26,*(undefined8 *)(*plVar26 + 0x1b0));
  plVar26 = *(long **)(puVar13 + -0x82);
  puVar43 = &UNK_09852500;
  plVar38 = plVar19;
code_r0x098511a0:
  puVar36 = PTR_DAT_09f7fa48;
  *(undefined **)((long)puVar12 + -0x50) = puVar43;
  *(undefined **)((long)puVar12 + -0x40) = unaff_x26;
  *(undefined **)((long)puVar12 + -0x38) = unaff_x25;
  *(undefined8 **)((long)puVar12 + -0x30) = unaff_x24;
  *(long **)((long)puVar12 + -0x28) = plVar28;
  *(undefined8 *)((long)puVar12 + -0x20) = uVar18;
  *(long **)((long)puVar12 + -0x18) = plVar38;
  *(int **)((long)puVar12 + -0x10) = piVar37;
  *(undefined8 *)((long)puVar12 + -8) = uVar17;
  plVar38 = plVar26;
  if ((bRam000000000a46e1ff & 1) == 0) {
    func_0x0415191c(PTR_DAT_09f7fa50);
    func_0x0415191c(PTR_DAT_09f7fa58);
    func_0x0415191c(PTR_DAT_09f7fa60);
    func_0x0415191c(PTR_DAT_09f48ac8);
    func_0x0415191c(PTR_DAT_09f478e0);
    func_0x0415191c(PTR_DAT_09f7fa68);
    func_0x0415191c(PTR_DAT_09f7fa48);
    func_0x0415191c(PTR_DAT_09f7fa70);
    func_0x0415191c(PTR_DAT_09eab348);
    bRam000000000a46e1ff = 1;
  }
  uVar17 = *(undefined8 *)puVar36;
  *(undefined8 *)((long)puVar12 + -0x68) = 0;
  *(undefined8 *)((long)puVar12 + -0x70) = 0;
  *(undefined8 *)((long)puVar12 + -0x58) = 0;
  *(undefined8 *)((long)puVar12 + -0x60) = 0;
  *(undefined4 *)((long)puVar12 + -0x78) = 0;
  *(undefined8 *)((long)puVar12 + -0x80) = 0;
  puVar43 = (undefined *)func_0x07649de8(0,uVar17);
  plVar39 = (long *)0xa46e000;
  if ((puVar43 != (undefined *)0x0) && (plVar19 != (long *)0x0)) {
    lVar29 = *plVar19;
    plVar39 = *(long **)(puVar43 + 0x18);
    uVar32 = (ulong)*(ushort *)(lVar29 + 0x12e);
    if (uVar32 != 0) {
      piVar37 = (int *)(*(long *)(lVar29 + 0xb0) + 8);
      do {
        if (*(long *)(piVar37 + -2) == *(long *)PTR_DAT_09f48ac8) {
          puVar21 = (undefined8 *)(lVar29 + (long)(*piVar37 + 8) * 0x10 + 0x138);
          goto code_r0x098512d0;
        }
        uVar32 = uVar32 - 1;
        piVar37 = piVar37 + 4;
      } while (uVar32 != 0);
    }
    puVar21 = (undefined8 *)func_0x041cb4c4(plVar19,*(long *)PTR_DAT_09f48ac8,8);
code_r0x098512d0:
    plVar38 = (long *)puVar21[1];
    (*(code *)*puVar21)(plVar19,plVar39);
    puVar7 = PTR_DAT_09f7fa58;
    puVar22 = PTR_DAT_09f7fa50;
    puVar8 = PTR_DAT_09f478e0;
    plVar28 = (long *)PTR_DAT_09eab348;
    puVar36 = puVar43;
    if (*(long *)(puVar43 + 0x18) != 0) {
      func_0x06b7a424((undefined1 *)((long)puVar12 + -0xd8),*(long *)(puVar43 + 0x18),
                      *(undefined8 *)PTR_DAT_09f7fa68);
      *(undefined8 *)((long)puVar12 + -0x68) = *(undefined8 *)((long)puVar12 + -0xd0);
      *(undefined8 *)((long)puVar12 + -0x70) = *(undefined8 *)((long)puVar12 + -0xd8);
      *(undefined8 *)((long)puVar12 + -0x58) = *(undefined8 *)((long)puVar12 + -0xc0);
      *(undefined8 *)((long)puVar12 + -0x60) = *(undefined8 *)((long)puVar12 + -200);
      while( true ) {
        do {
          uVar32 = func_0x05d2b160((undefined1 *)((long)puVar12 + -0x70),*(undefined8 *)puVar7);
          if ((uVar32 & 1) == 0) {
            func_0x05d2b15c((undefined1 *)((long)puVar12 + -0x70),*(undefined8 *)puVar22);
            goto code_r0x09851414;
          }
          *(undefined8 *)((long)puVar12 + -0x80) = *(undefined8 *)((long)puVar12 + -0x60);
          *(undefined4 *)((long)puVar12 + -0x78) = *(undefined4 *)((long)puVar12 + -0x58);
          uVar32 = func_0x091c48bc((undefined1 *)((long)puVar12 + -0x80),0);
        } while ((uVar32 & 1) != 0);
        if (plVar26 == (long *)0x0) break;
        lVar30 = *plVar26;
        plVar19 = (long *)(ulong)*(uint *)((long)puVar12 + -0x78);
        lVar29 = *(long *)puVar8;
        uVar32 = (ulong)*(ushort *)(lVar30 + 0x12e);
        if (uVar32 != 0) {
          piVar37 = (int *)(*(long *)(lVar30 + 0xb0) + 8);
          do {
            if (*(long *)(piVar37 + -2) == lVar29) {
              puVar21 = (undefined8 *)(lVar30 + (long)(*piVar37 + 6) * 0x10 + 0x138);
              goto code_r0x098513b0;
            }
            uVar32 = uVar32 - 1;
            piVar37 = piVar37 + 4;
          } while (uVar32 != 0);
        }
        puVar21 = (undefined8 *)func_0x041cb4c4(plVar26,lVar29,6);
code_r0x098513b0:
        plVar38 = (long *)puVar21[1];
        (*(code *)*puVar21)((undefined1 *)((long)puVar12 + -0xd8),plVar26,plVar19);
        if (*(long *)((long)puVar12 + -0xd8) == 0) goto code_r0x09851454;
        if (*(int *)(*(long *)((long)puVar12 + -0xd8) + 0x20) == iVar14) {
          if (*(int *)(*plVar28 + 0xe0) == 0) {
            func_0x04151a94();
          }
          func_0x04324484(puVar43,0);
          func_0x05d2b15c((undefined1 *)((long)puVar12 + -0x70),*(undefined8 *)puVar22);
          return 1;
        }
      }
      func_0x04151bb8();
code_r0x09851454:
      func_0x04151bb8();
      plVar39 = plVar28;
      unaff_x24 = (undefined8 *)puVar22;
      unaff_x25 = puVar7;
      unaff_x26 = puVar8;
    }
  }
  auVar47 = func_0x04151bb8();
  uVar17 = auVar47._0_8_;
  if (auVar47._8_4_ == 1) {
    plVar26 = (long *)func_0x098f6de0(uVar17);
    lVar29 = *plVar26;
    func_0x098f6df0();
    func_0x05d2b15c((undefined1 *)((long)puVar12 + -0x70),*unaff_x24);
    puVar43 = puVar36;
    plVar28 = plVar39;
    if (lVar29 == 0) {
code_r0x09851414:
      if (*(int *)(*plVar28 + 0xe0) == 0) {
        func_0x04151a94();
      }
      func_0x04324484(puVar43,0);
      return 0;
    }
    func_0x04151bb0(lVar29);
  }
  func_0x05d2b15c((undefined1 *)((long)puVar12 + -0x70),*unaff_x24);
  func_0x04247ab0(uVar17);
  func_0x04151bb0(0);
  auVar44 = func_0x03bf6574();
  puVar43 = PTR_DAT_09ee7dd8;
  plVar20 = auVar44._8_8_;
  plVar26 = auVar44._0_8_;
  *(undefined **)((long)puVar12 + -0x130) =
       &WithNetwork_KeyholderStatusCalculator__GetEquipPossessionEffectValueTargetCharacter;
  *(undefined **)((long)puVar12 + -0x120) = unaff_x26;
  *(undefined **)((long)puVar12 + -0x118) = unaff_x25;
  *(undefined8 **)((long)puVar12 + -0x110) = unaff_x24;
  *(long **)((long)puVar12 + -0x108) = plVar39;
  *(long **)((long)puVar12 + -0x100) = plVar19;
  *(undefined8 *)((long)puVar12 + -0xf8) = 0;
  *(undefined8 *)((long)puVar12 + -0xf0) = uVar17;
  *(undefined **)((long)puVar12 + -0xe8) = puVar36;
  uVar40 = 0xa46e000;
  uVar32 = (ulong)param_5 & 0xffffffff;
  plVar39 = plVar38;
  plVar28 = param_4;
  if ((bRam000000000a46e1fe & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09eca930);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09f462e0);
    func_0x0415191c(PTR_DAT_09ee7dd8);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e1fe = 1;
  }
  lVar29 = *(long *)puVar43;
  *(undefined8 *)((long)puVar12 + -0x148) = 0;
  *(undefined8 *)((long)puVar12 + -0x150) = 0;
  *(undefined8 *)((long)puVar12 + -0x138) = 0;
  *(undefined8 *)((long)puVar12 + -0x140) = 0;
  *(undefined8 *)((long)puVar12 + -0x168) = 0;
  *(undefined8 *)((long)puVar12 + -0x170) = 0;
  *(undefined8 *)((long)puVar12 + -0x158) = 0;
  *(undefined8 *)((long)puVar12 + -0x160) = 0;
  *(undefined8 *)((long)puVar12 + -0x188) = 0;
  *(undefined8 *)((long)puVar12 + -400) = 0;
  *(undefined8 *)((long)puVar12 + -0x178) = 0;
  *(undefined8 *)((long)puVar12 + -0x180) = 0;
  if (*(int *)(lVar29 + 0xe0) == 0) {
    func_0x04151a94();
  }
  puVar36 = PTR_DAT_09f462e0;
  if (plVar38[10] != 0) {
    uVar1 = *(uint *)(plVar38[10] + 0x2c);
    uVar40 = (ulong)uVar1;
    if (uVar1 == 0) goto code_r0x0985188c;
    if (plVar20 != (long *)0x0) {
      lVar29 = *plVar20;
      uVar33 = (ulong)*(ushort *)(lVar29 + 0x12e);
      if (uVar33 != 0) {
        piVar37 = (int *)(*(long *)(lVar29 + 0xb0) + 8);
        do {
          if (*(long *)(piVar37 + -2) == *(long *)PTR_DAT_09f462e0) {
            puVar21 = (undefined8 *)(lVar29 + (long)(*piVar37 + 5) * 0x10 + 0x138);
            goto code_r0x098515f0;
          }
          uVar33 = uVar33 - 1;
          piVar37 = piVar37 + 4;
        } while (uVar33 != 0);
      }
      puVar21 = (undefined8 *)func_0x041cb4c4(plVar20,*(long *)PTR_DAT_09f462e0,5);
code_r0x098515f0:
      plVar39 = (long *)puVar21[1];
      uVar33 = (*(code *)*puVar21)(plVar20,uVar1);
      puVar8 = PTR_DAT_09f470e0;
      if ((uVar33 & 1) != 0) {
        lVar30 = *plVar20;
        lVar29 = *(long *)puVar36;
        uVar33 = (ulong)*(ushort *)(lVar30 + 0x12e);
        if (uVar33 == 0) goto code_r0x09851634;
        piVar37 = (int *)(*(long *)(lVar30 + 0xb0) + 8);
        goto code_r0x0985161c;
      }
      unaff_x26 = puVar36;
      if (plVar26 != (long *)0x0) {
        lVar29 = *plVar26;
        uVar32 = (ulong)*(ushort *)(lVar29 + 0x12e);
        if (uVar32 == 0) goto code_r0x09851680;
        piVar37 = (int *)(*(long *)(lVar29 + 0xb0) + 8);
        goto code_r0x09851668;
      }
    }
  }
  auVar44 = func_0x04151bb8();
  puVar36 = PTR_DAT_09f7fa78;
  plVar19 = auVar44._8_8_;
  *(undefined **)((long)puVar12 + -0x210) =
       &WithNetwork_KeyholderStatusCalculator__IsKeyholderAssistDeployed;
  *(long **)((long)puVar12 + -0x208) = unaff_x27;
  *(undefined **)((long)puVar12 + -0x200) = unaff_x26;
  *(undefined **)((long)puVar12 + -0x1f8) = puVar43;
  *(long **)((long)puVar12 + -0x1f0) = plVar20;
  *(ulong *)((long)puVar12 + -0x1e8) = uVar40;
  *(long **)((long)puVar12 + -0x1e0) = plVar26;
  *(ulong *)((long)puVar12 + -0x1d8) = uVar32;
  *(ulong *)((long)puVar12 + -0x1d0) = (ulong)param_4 & 0xffffffff;
  *(long **)((long)puVar12 + -0x1c8) = plVar38;
  plVar26 = plVar39;
  if ((bRam000000000a46e200 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09f7fa80);
    func_0x0415191c(PTR_DAT_09f7fa88);
    func_0x0415191c(PTR_DAT_09f7fa90);
    func_0x0415191c(PTR_DAT_09f48a90);
    func_0x0415191c(PTR_DAT_09f46a90);
    func_0x0415191c(PTR_DAT_09ee7dd8);
    func_0x0415191c(PTR_DAT_09f7fa98);
    func_0x0415191c(PTR_DAT_09eaa2b0);
    func_0x0415191c(PTR_DAT_09eb8aa8);
    func_0x0415191c(PTR_DAT_09f7fa78);
    func_0x0415191c(PTR_DAT_09f7faa0);
    func_0x0415191c(PTR_DAT_09eab348);
    bRam000000000a46e200 = 1;
  }
  uVar17 = *(undefined8 *)puVar36;
  *(undefined8 *)((long)puVar12 + -0x228) = 0;
  *(undefined8 *)((long)puVar12 + -0x230) = 0;
  *(undefined8 *)((long)puVar12 + -0x218) = 0;
  *(undefined8 *)((long)puVar12 + -0x220) = 0;
  *(undefined8 *)((long)puVar12 + -0x248) = 0;
  puVar22 = (undefined *)func_0x07649a18(0,uVar17);
  puVar8 = PTR_DAT_09ee7dd8;
  puVar21 = (undefined8 *)0xa46e000;
  if ((puVar22 != (undefined *)0x0) && (plVar19 != (long *)0x0)) {
    lVar29 = *plVar19;
    puVar21 = *(undefined8 **)(puVar22 + 0x18);
    uVar32 = (ulong)*(ushort *)(lVar29 + 0x12e);
    if (uVar32 != 0) {
      piVar37 = (int *)(*(long *)(lVar29 + 0xb0) + 8);
      do {
        if (*(long *)(piVar37 + -2) == *(long *)PTR_DAT_09f48a90) {
          puVar23 = (undefined8 *)(lVar29 + (long)(*piVar37 + 8) * 0x10 + 0x138);
          goto code_r0x09851a30;
        }
        uVar32 = uVar32 - 1;
        piVar37 = piVar37 + 4;
      } while (uVar32 != 0);
    }
    puVar23 = (undefined8 *)func_0x041cb4c4(plVar19,*(long *)PTR_DAT_09f48a90,8);
code_r0x09851a30:
    plVar26 = (long *)puVar23[1];
    (*(code *)*puVar23)(plVar19,puVar21);
    if (*(int *)(*(long *)puVar8 + 0xe0) == 0) {
      func_0x04151a94();
    }
    puVar11 = PTR_DAT_09f7fa88;
    puVar10 = PTR_DAT_09f7fa80;
    puVar9 = PTR_DAT_09f46a90;
    puVar7 = PTR_DAT_09eb8aa8;
    plVar38 = (long *)PTR_DAT_09eab348;
    lVar29 = *(long *)(auVar44._0_8_ + 0x50);
    puVar36 = puVar22;
    plVar20 = (long *)puVar8;
    if (lVar29 != 0) {
      uVar1 = *(uint *)(lVar29 + 0x24);
      plVar20 = (long *)(ulong)uVar1;
      if (uVar1 == 0) goto code_r0x09851bbc;
      plVar19 = plVar38;
      if (*(long *)(puVar22 + 0x18) != 0) {
        func_0x06b77b74((undefined1 *)((long)puVar12 + -0x280),*(long *)(puVar22 + 0x18),
                        *(undefined8 *)PTR_DAT_09f7fa98);
        *(undefined8 *)((long)puVar12 + -0x228) = *(undefined8 *)((long)puVar12 + -0x278);
        *(undefined8 *)((long)puVar12 + -0x230) = *(undefined8 *)((long)puVar12 + -0x280);
        *(undefined8 *)((long)puVar12 + -0x218) = *(undefined8 *)((long)puVar12 + -0x268);
        *(undefined8 *)((long)puVar12 + -0x220) = *(undefined8 *)((long)puVar12 + -0x270);
        while( true ) {
          do {
            do {
              uVar32 = func_0x05d2af60((undefined1 *)((long)puVar12 + -0x230),*(undefined8 *)puVar11
                                      );
              if ((uVar32 & 1) == 0) {
                func_0x05d2af5c((undefined1 *)((long)puVar12 + -0x230),*(undefined8 *)puVar10);
                goto code_r0x09851bbc;
              }
              *(undefined8 *)((long)puVar12 + -0x240) = *(undefined8 *)((long)puVar12 + -0x220);
              *(undefined4 *)((long)puVar12 + -0x238) = *(undefined4 *)((long)puVar12 + -0x218);
              uVar32 = *(ulong *)((long)puVar12 + -0x23c);
              *(ulong *)((long)puVar12 + -0x248) = uVar32;
            } while ((uVar32 & 0xff) == 0);
            uVar17 = *(undefined8 *)puVar7;
            *(ulong *)((long)puVar12 + -0x248) = uVar32;
            iVar14 = func_0x0701b33c((undefined1 *)((long)puVar12 + -0x248),uVar17);
          } while (iVar14 == 0);
          uVar17 = *(undefined8 *)puVar7;
          *(ulong *)((long)puVar12 + -0x248) = uVar32;
          uVar16 = func_0x0701b33c((undefined1 *)((long)puVar12 + -0x248),uVar17);
          if (plVar39 == (long *)0x0) break;
          lVar30 = *plVar39;
          lVar29 = *(long *)puVar9;
          uVar32 = (ulong)*(ushort *)(lVar30 + 0x12e);
          if (uVar32 != 0) {
            piVar37 = (int *)(*(long *)(lVar30 + 0xb0) + 8);
            do {
              if (*(long *)(piVar37 + -2) == lVar29) {
                puVar21 = (undefined8 *)(lVar30 + (long)(*piVar37 + 6) * 0x10 + 0x138);
                goto code_r0x09851b58;
              }
              uVar32 = uVar32 - 1;
              piVar37 = piVar37 + 4;
            } while (uVar32 != 0);
          }
          puVar21 = (undefined8 *)func_0x041cb4c4(plVar39,lVar29,6);
code_r0x09851b58:
          plVar26 = (long *)puVar21[1];
          (*(code *)*puVar21)((undefined1 *)((long)puVar12 + -0x280),plVar39,uVar16);
          if ((*(long *)((long)puVar12 + -0x280) != 0) &&
             (*(uint *)(*(long *)((long)puVar12 + -0x280) + 0x2c) == uVar1)) {
            if (*(int *)(*plVar38 + 0xe0) == 0) {
              func_0x04151a94();
            }
            func_0x04324484(puVar22,0);
            func_0x05d2af5c((undefined1 *)((long)puVar12 + -0x230),*(undefined8 *)puVar10);
            return 1;
          }
        }
        func_0x04151bb8();
        puVar21 = (undefined8 *)puVar10;
        puVar43 = puVar11;
        unaff_x26 = puVar7;
        unaff_x27 = (long *)puVar9;
      }
    }
  }
  plVar38 = plVar19;
  auVar47 = func_0x04151bb8();
  uVar17 = auVar47._0_8_;
  if (auVar47._8_4_ == 1) {
    plVar39 = (long *)func_0x098f6de0(uVar17);
    lVar29 = *plVar39;
    func_0x098f6df0();
    func_0x05d2af5c((undefined1 *)((long)puVar12 + -0x230),*puVar21);
    puVar22 = puVar36;
    if (lVar29 == 0) {
code_r0x09851bbc:
      if (*(int *)(*plVar38 + 0xe0) == 0) {
        func_0x04151a94();
      }
      func_0x04324484(puVar22,0);
      return 0;
    }
    func_0x04151bb0(lVar29);
  }
  func_0x05d2af5c((undefined1 *)((long)puVar12 + -0x230),*puVar21);
  func_0x04247ab0(uVar17);
  func_0x04151bb0(0);
  auVar45 = func_0x03bf6574();
  plVar42 = (long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  plVar25 = auVar45._8_8_;
  plVar24 = auVar45._0_8_;
  puVar13 = (undefined4 *)((long)puVar12 + -0x390);
  *(long **)((long)puVar12 + -0x2e0) = unaff_x29;
  *(undefined **)((long)puVar12 + -0x2d8) =
       &WithNetwork_KeyholderStatusCalculator__GetRarityUpBonusEffectValueWithTarget;
  *(ulong *)((long)puVar12 + -0x2d0) = unaff_x28;
  *(long **)((long)puVar12 + -0x2c8) = unaff_x27;
  *(undefined **)((long)puVar12 + -0x2c0) = unaff_x26;
  *(undefined **)((long)puVar12 + -0x2b8) = puVar43;
  *(long **)((long)puVar12 + -0x2b0) = plVar20;
  *(undefined8 **)((long)puVar12 + -0x2a8) = puVar21;
  *(long **)((long)puVar12 + -0x2a0) = plVar38;
  *(undefined8 *)((long)puVar12 + -0x298) = 0;
  *(undefined8 *)((long)puVar12 + -0x290) = uVar17;
  *(undefined **)((long)puVar12 + -0x288) = puVar36;
  *(int *)((long)puVar12 + -0x374) = (int)plVar28;
  plVar39 = (long *)0xa46e000;
  uVar32 = (ulong)param_6 & 0xffffffff;
  piVar37 = (int *)((ulong)param_5 & 0xffffffff);
  plVar27 = plVar26;
  plVar20 = param_5;
  plVar19 = param_6;
  if ((bRam000000000a46e1fd & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09eca930);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09f462e0);
    func_0x0415191c(PTR_DAT_09ee7dd8);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e1fd = 1;
  }
  plVar38 = (long *)PTR_DAT_09ee7dd8;
  lVar29 = *plVar42;
  *(undefined8 *)((long)puVar12 + -0x2f8) = 0;
  *(undefined8 *)((long)puVar12 + -0x300) = 0;
  *(undefined8 *)((long)puVar12 + -0x2e8) = 0;
  *(undefined8 *)((long)puVar12 + -0x2f0) = 0;
  *(undefined8 *)((long)puVar12 + -0x318) = 0;
  *(undefined8 *)((long)puVar12 + -800) = 0;
  *(undefined8 *)((long)puVar12 + -0x308) = 0;
  *(undefined8 *)((long)puVar12 + -0x310) = 0;
  *(undefined8 *)((long)puVar12 + -0x338) = 0;
  *(undefined8 *)((long)puVar12 + -0x340) = 0;
  *(undefined8 *)((long)puVar12 + -0x328) = 0;
  *(undefined8 *)((long)puVar12 + -0x330) = 0;
  if (*(int *)(lVar29 + 0xe0) == 0) {
    func_0x04151a94();
    lVar29 = *plVar42;
  }
  pauVar34 = *(undefined1 (**) [16])(lVar29 + 0xb8);
  uVar17 = *(undefined8 *)*pauVar34;
  auVar6 = *pauVar34;
  auVar46 = *pauVar34;
  auVar5 = *pauVar34;
  auVar44 = *pauVar34;
  if (*(int *)(*plVar38 + 0xe0) == 0) {
    func_0x04151a94(*plVar38);
  }
  auVar4._8_8_ = plVar28;
  auVar4._0_8_ = plVar27;
  auVar3._8_8_ = plVar28;
  auVar3._0_8_ = plVar27;
  auVar48._8_8_ = plVar28;
  auVar48._0_8_ = plVar27;
  lVar29 = plVar26[9];
  if ((lVar29 != 0) && (lVar30 = plVar26[10], auVar48 = auVar3, auVar5 = auVar46, lVar30 != 0)) {
    plVar39 = *(long **)(lVar30 + 0x30);
    if ((plVar39 == (long *)0x0) || (uVar40 = plVar39[3], uVar40 == 0)) goto code_r0x0985211c;
    *(int *)((long)puVar12 + -0x378) = (int)param_5;
    piVar37 = *(int **)(lVar30 + 0x38);
    auVar48 = auVar4;
    auVar5 = auVar6;
    if (piVar37 != (int *)0x0) {
      if ((int)uVar40 != *(int *)((long)piVar37 + 0x18)) {
code_r0x0985211c:
        lVar29 = *plVar42;
        if (*(int *)(lVar29 + 0xe0) == 0) {
          func_0x04151a94();
          lVar29 = *plVar42;
        }
        return **(undefined8 **)(lVar29 + 0xb8);
      }
      uVar40 = uVar40 & 0xffffffff;
      uVar1 = *(uint *)(lVar29 + 0x20);
      unaff_x27 = (long *)(ulong)uVar1;
      if (*(int *)(*plVar38 + 0xe0) == 0) {
        func_0x04151a94();
        uVar40 = (ulong)*(uint *)(plVar39 + 3);
      }
      auVar48._8_8_ = plVar28;
      auVar48._0_8_ = plVar27;
      if ((int)uVar40 < 1) {
        return uVar17;
      }
      plVar28 = plVar26 + 2;
      plVar38 = (long *)0x0;
      uVar1 = uVar1 + 1;
      plVar26 = (long *)(ulong)uVar1;
      *(int *)((long)puVar12 + -0x380) = (int)*plVar28;
      *(int *)((long)puVar12 + -0x37c) = (int)param_6;
      while( true ) {
        uVar17 = auVar48._8_8_;
        auVar5 = auVar44;
        if ((long *)(ulong)*(uint *)((long)piVar37 + 0x18) <= plVar38) break;
        if (*(int *)((long)piVar37 + (long)plVar38 * 4 + 0x20) <= (int)uVar1) {
          if ((long *)(uVar40 & 0xffffffff) <= plVar38) break;
          uVar2 = *(uint *)((long)plVar39 + (long)plVar38 * 4 + 0x20);
          unaff_x27 = (long *)(ulong)uVar2;
          if (uVar2 != 0) {
            if (plVar25 == (long *)0x0) goto code_r0x09852164;
            lVar29 = *plVar25;
            uVar40 = (ulong)*(ushort *)(lVar29 + 0x12e);
            if (uVar40 != 0) {
              piVar35 = (int *)(*(long *)(lVar29 + 0xb0) + 8);
              do {
                if (*(long *)(piVar35 + -2) == *(long *)PTR_DAT_09f462e0) {
                  puVar21 = (undefined8 *)(lVar29 + (long)(*piVar35 + 5) * 0x10 + 0x138);
                  goto code_r0x09851e50;
                }
                uVar40 = uVar40 - 1;
                piVar35 = piVar35 + 4;
              } while (uVar40 != 0);
            }
            puVar21 = (undefined8 *)func_0x041cb4c4(plVar25,*(long *)PTR_DAT_09f462e0,5);
code_r0x09851e50:
            uVar18 = puVar21[1];
            uVar40 = (*(code *)*puVar21)(plVar25,uVar2);
            auVar48._8_8_ = uVar17;
            auVar48._0_8_ = uVar18;
            if ((uVar40 & 1) == 0) {
              if (plVar24 == (long *)0x0) goto code_r0x09852164;
              lVar29 = *plVar24;
              uVar40 = (ulong)*(ushort *)(lVar29 + 0x12e);
              if (uVar40 != 0) {
                piVar35 = (int *)(*(long *)(lVar29 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar35 + -2) == *(long *)PTR_DAT_09f470e0) {
                    puVar21 = (undefined8 *)(lVar29 + (long)(*piVar35 + 5) * 0x10 + 0x138);
                    goto code_r0x09851fec;
                  }
                  uVar40 = uVar40 - 1;
                  piVar35 = piVar35 + 4;
                } while (uVar40 != 0);
              }
              puVar21 = (undefined8 *)func_0x041cb4c4(plVar24,*(long *)PTR_DAT_09f470e0,5);
code_r0x09851fec:
              uVar18 = puVar21[1];
              uVar40 = (*(code *)*puVar21)(plVar24,unaff_x27);
              auVar48._8_8_ = uVar17;
              auVar48._0_8_ = uVar18;
              if ((uVar40 & 1) != 0) {
                lVar29 = *plVar24;
                uVar40 = (ulong)*(ushort *)(lVar29 + 0x12e);
                if (uVar40 != 0) {
                  piVar35 = (int *)(*(long *)(lVar29 + 0xb0) + 8);
                  do {
                    if (*(long *)(piVar35 + -2) == *(long *)PTR_DAT_09f470e0) {
                      puVar21 = (undefined8 *)(lVar29 + (long)(*piVar35 + 6) * 0x10 + 0x138);
                      goto code_r0x09852058;
                    }
                    uVar40 = uVar40 - 1;
                    piVar35 = piVar35 + 4;
                  } while (uVar40 != 0);
                }
                puVar21 = (undefined8 *)func_0x041cb4c4(plVar24,*(long *)PTR_DAT_09f470e0,6);
code_r0x09852058:
                uVar18 = puVar21[1];
                (*(code *)*puVar21)((undefined1 *)((long)puVar12 + -0x370),plVar24,uVar2);
                *(undefined8 *)((long)puVar12 + -0x338) = *(undefined8 *)((long)puVar12 + -0x368);
                *(undefined8 *)((long)puVar12 + -0x340) = *(undefined8 *)((long)puVar12 + -0x370);
                *(undefined8 *)((long)puVar12 + -0x328) = *(undefined8 *)((long)puVar12 + -0x358);
                *(undefined8 *)((long)puVar12 + -0x330) = *(undefined8 *)((long)puVar12 + -0x360);
                *(undefined8 *)((long)puVar12 + -0x318) = *(undefined8 *)((long)puVar12 + -0x348);
                *(undefined8 *)((long)puVar12 + -800) = *(undefined8 *)((long)puVar12 + -0x350);
                if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar48._8_8_ = uVar17;
                auVar48._0_8_ = uVar18;
                if (*(int *)((long)puVar12 + -0x328) == *(int *)((long)puVar12 + -0x374)) {
                  if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
                    func_0x04151a94();
                  }
                  auVar46 = func_0x091dc794((undefined1 *)((long)puVar12 + -0x340),
                                            *(undefined4 *)((long)puVar12 + -0x380),0);
                  lVar29 = *plVar42;
                  goto code_r0x098520d8;
                }
              }
            }
            else {
              lVar29 = *plVar25;
              uVar40 = (ulong)*(ushort *)(lVar29 + 0x12e);
              if (uVar40 != 0) {
                piVar35 = (int *)(*(long *)(lVar29 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar35 + -2) == *(long *)PTR_DAT_09f462e0) {
                    puVar21 = (undefined8 *)(lVar29 + (long)(*piVar35 + 6) * 0x10 + 0x138);
                    goto code_r0x09851f08;
                  }
                  uVar40 = uVar40 - 1;
                  piVar35 = piVar35 + 4;
                } while (uVar40 != 0);
              }
              puVar21 = (undefined8 *)func_0x041cb4c4(plVar25,*(long *)PTR_DAT_09f462e0,6);
code_r0x09851f08:
              uVar18 = puVar21[1];
              (*(code *)*puVar21)((undefined1 *)((long)puVar12 + -0x370),plVar25,unaff_x27);
              *(undefined8 *)((long)puVar12 + -0x308) = *(undefined8 *)((long)puVar12 + -0x368);
              *(undefined8 *)((long)puVar12 + -0x310) = *(undefined8 *)((long)puVar12 + -0x370);
              *(undefined8 *)((long)puVar12 + -0x2f8) = *(undefined8 *)((long)puVar12 + -0x358);
              *(undefined8 *)((long)puVar12 + -0x300) = *(undefined8 *)((long)puVar12 + -0x360);
              *(undefined8 *)((long)puVar12 + -0x2e8) = *(undefined8 *)((long)puVar12 + -0x348);
              *(undefined8 *)((long)puVar12 + -0x2f0) = *(undefined8 *)((long)puVar12 + -0x350);
              if (*(int *)(*(long *)PTR_DAT_09eca930 + 0xe0) == 0) {
                func_0x04151a94();
              }
              iVar15 = func_0x091b994c((undefined1 *)((long)puVar12 + -0x310),0);
              auVar48._8_8_ = uVar17;
              auVar48._0_8_ = uVar18;
              iVar14 = 0x1d;
              if (3 < iVar15 - 0x19U) {
                iVar14 = iVar15;
              }
              if (iVar14 == *(int *)((long)puVar12 + -0x374)) {
                if (*(int *)(*(long *)PTR_DAT_09eca930 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar46 = func_0x091b9c5c((undefined1 *)((long)puVar12 + -0x310),
                                          *(undefined4 *)((long)puVar12 + -0x380),
                                          *(undefined4 *)((long)puVar12 + -0x378),uVar32,0);
                unaff_x27 = auVar46._0_8_;
                lVar29 = *plVar42;
                if (*(int *)(lVar29 + 0xe0) == 0) {
                  func_0x04151a94();
                  lVar29 = *plVar42;
                }
                plVar20 = (long *)0x0;
                uVar17 = **(undefined8 **)(lVar29 + 0xb8);
                uVar18 = (*(undefined8 **)(lVar29 + 0xb8))[1];
                uVar32 = func_0x09775108(unaff_x27,auVar46._8_8_);
                auVar48._8_8_ = uVar18;
                auVar48._0_8_ = uVar17;
                if ((uVar32 & 1) != 0) {
                  lVar29 = *plVar42;
code_r0x098520d8:
                  unaff_x27 = auVar46._0_8_;
                  if (*(int *)(lVar29 + 0xe0) == 0) {
                    func_0x04151a94();
                  }
                  plVar20 = (long *)0x0;
                  auVar44 = func_0x09774360(auVar44._0_8_,auVar44._8_8_);
                  auVar48 = auVar46;
                }
                uVar32 = (ulong)*(uint *)((long)puVar12 + -0x37c);
              }
            }
          }
        }
        uVar40 = plVar39[3];
        plVar38 = (long *)((long)plVar38 + 1);
        if ((long)(int)uVar40 <= (long)plVar38) {
          return auVar44._0_8_;
        }
      }
      func_0x04151bc0();
    }
  }
code_r0x09852164:
  puVar43 = &
            WithNetwork_KeyholderStatusCalculator__CalculateTotalKeyholderRarityBonusEffectStatusValue
  ;
  auVar46 = func_0x04151bb8();
  goto code_r0x09852168;
  while( true ) {
    uVar33 = uVar33 - 1;
    piVar37 = piVar37 + 4;
    if (uVar33 == 0) break;
code_r0x0985161c:
    if (*(long *)(piVar37 + -2) == lVar29) {
      puVar21 = (undefined8 *)(lVar30 + (long)(*piVar37 + 6) * 0x10 + 0x138);
      goto code_r0x098516a0;
    }
  }
code_r0x09851634:
  puVar21 = (undefined8 *)func_0x041cb4c4(plVar20,lVar29,6);
code_r0x098516a0:
  (*(code *)*puVar21)((undefined1 *)((long)puVar12 + -0x1c0),plVar20,uVar40,puVar21[1]);
  puVar36 = PTR_DAT_09eca930;
  *(undefined8 *)((long)puVar12 + -0x188) = *(undefined8 *)((long)puVar12 + -0x1b8);
  *(undefined8 *)((long)puVar12 + -400) = *(undefined8 *)((long)puVar12 + -0x1c0);
  *(undefined8 *)((long)puVar12 + -0x178) = *(undefined8 *)((long)puVar12 + -0x1a8);
  *(undefined8 *)((long)puVar12 + -0x180) = *(undefined8 *)((long)puVar12 + -0x1b0);
  *(undefined8 *)((long)puVar12 + -0x168) = *(undefined8 *)((long)puVar12 + -0x198);
  *(undefined8 *)((long)puVar12 + -0x170) = *(undefined8 *)((long)puVar12 + -0x1a0);
  if (*(int *)(*(long *)PTR_DAT_09eca930 + 0xe0) == 0) {
    func_0x04151a94();
  }
  iVar15 = func_0x091b994c((undefined1 *)((long)puVar12 + -400),0);
  iVar14 = 0x1d;
  if (3 < iVar15 - 0x19U) {
    iVar14 = iVar15;
  }
  if (iVar14 == (int)param_4) {
    if (*(int *)(*(long *)puVar43 + 0xe0) == 0) {
      func_0x04151a94();
    }
    lVar29 = plVar38[2];
    if (*(int *)(*(long *)puVar36 + 0xe0) == 0) {
      func_0x04151a94();
    }
    auVar44 = func_0x091b9c5c((undefined1 *)((long)puVar12 + -400),(int)lVar29,2,uVar32,0);
    puVar43 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar29 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if (*(int *)(lVar29 + 0xe0) == 0) {
      func_0x04151a94();
      lVar29 = *(long *)puVar43;
    }
    uVar32 = func_0x09775108(auVar44._0_8_,auVar44._8_8_,**(undefined8 **)(lVar29 + 0xb8),
                             (*(undefined8 **)(lVar29 + 0xb8))[1],0);
    if ((uVar32 & 1) != 0) {
      return auVar44._0_8_;
    }
  }
  goto code_r0x0985188c;
  while( true ) {
    uVar32 = uVar32 - 1;
    piVar37 = piVar37 + 4;
    if (uVar32 == 0) break;
code_r0x09851668:
    if (*(long *)(piVar37 + -2) == *(long *)PTR_DAT_09f470e0) {
      puVar21 = (undefined8 *)(lVar29 + (long)(*piVar37 + 5) * 0x10 + 0x138);
      goto code_r0x09851790;
    }
  }
code_r0x09851680:
  puVar21 = (undefined8 *)func_0x041cb4c4(plVar26,*(long *)PTR_DAT_09f470e0,5);
code_r0x09851790:
  uVar32 = (*(code *)*puVar21)(plVar26,uVar40,puVar21[1]);
  if ((uVar32 & 1) != 0) {
    lVar29 = *plVar26;
    uVar32 = (ulong)*(ushort *)(lVar29 + 0x12e);
    if (uVar32 != 0) {
      piVar37 = (int *)(*(long *)(lVar29 + 0xb0) + 8);
      do {
        if (*(long *)(piVar37 + -2) == *(long *)puVar8) {
          puVar21 = (undefined8 *)(lVar29 + (long)(*piVar37 + 6) * 0x10 + 0x138);
          goto code_r0x098517f4;
        }
        uVar32 = uVar32 - 1;
        piVar37 = piVar37 + 4;
      } while (uVar32 != 0);
    }
    puVar21 = (undefined8 *)func_0x041cb4c4(plVar26,*(long *)puVar8,6);
code_r0x098517f4:
    (*(code *)*puVar21)((undefined1 *)((long)puVar12 + -0x1c0),plVar26,uVar1,puVar21[1]);
    puVar36 = PTR_DAT_09ec4a50;
    *(undefined8 *)((long)puVar12 + -0x158) = *(undefined8 *)((long)puVar12 + -0x1b8);
    *(undefined8 *)((long)puVar12 + -0x160) = *(undefined8 *)((long)puVar12 + -0x1c0);
    *(undefined8 *)((long)puVar12 + -0x148) = *(undefined8 *)((long)puVar12 + -0x1a8);
    *(undefined8 *)((long)puVar12 + -0x150) = *(undefined8 *)((long)puVar12 + -0x1b0);
    *(undefined8 *)((long)puVar12 + -0x138) = *(undefined8 *)((long)puVar12 + -0x198);
    *(undefined8 *)((long)puVar12 + -0x140) = *(undefined8 *)((long)puVar12 + -0x1a0);
    if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
      func_0x04151a94();
    }
    iVar14 = 0x1d;
    if (3 < *(int *)((long)puVar12 + -0x148) - 0x19U) {
      iVar14 = *(int *)((long)puVar12 + -0x148);
    }
    if (iVar14 == (int)param_4) {
      if (*(int *)(*(long *)puVar43 + 0xe0) == 0) {
        func_0x04151a94();
      }
      lVar29 = plVar38[2];
      if (*(int *)(*(long *)puVar36 + 0xe0) == 0) {
        func_0x04151a94();
      }
      uVar17 = func_0x091dc794((undefined1 *)((long)puVar12 + -0x160),(int)lVar29,0);
      return uVar17;
    }
  }
code_r0x0985188c:
  puVar43 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  lVar29 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if (*(int *)(lVar29 + 0xe0) == 0) {
    func_0x04151a94();
    lVar29 = *(long *)puVar43;
  }
  return **(undefined8 **)(lVar29 + 0xb8);
}


```

## KeyholderStatusCalculator.CalculatePercentStatus(DataTableContainer tableContainer, StatusType statusType, int id)

```c

/* WARNING: Possible PIC construction at 0x09851120: Changing call to branch */
/* WARNING: Possible PIC construction at 0x098524fc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0985251c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09852548: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x09852520) */
/* WARNING: Removing unreachable block (ram,0x09852524) */
/* WARNING: Removing unreachable block (ram,0x09852500) */
/* WARNING: Removing unreachable block (ram,0x09852504) */
/* WARNING: Removing unreachable block (ram,0x09851124) */
/* WARNING: Removing unreachable block (ram,0x09851138) */
/* WARNING: Removing unreachable block (ram,0x09851140) */
/* WARNING: Removing unreachable block (ram,0x091d1720) */
/* WARNING: Removing unreachable block (ram,0x0985254c) */
/* WARNING: Removing unreachable block (ram,0x09852568) */
/* WARNING: Removing unreachable block (ram,0x0985256c) */

undefined8
WithNetwork_KeyholderStatusCalculator__CalculatePercentStatus
          (ulong param_1,long *param_2,uint param_3,long *param_4,long *param_5,long *param_6,
          long *param_7,ulong param_8,undefined8 param_9)

{
  uint uVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined *puVar7;
  undefined *puVar8;
  undefined *puVar9;
  undefined *puVar10;
  undefined *puVar11;
  uint *puVar12;
  uint *puVar13;
  int iVar14;
  undefined8 uVar17;
  long *plVar18;
  long *plVar19;
  long *plVar20;
  undefined8 *puVar21;
  long *plVar22;
  int iVar15;
  undefined4 uVar16;
  undefined *puVar23;
  undefined8 *puVar24;
  long *extraout_x1;
  long *plVar25;
  long lVar26;
  long lVar27;
  long lVar28;
  ulong uVar29;
  ulong uVar30;
  undefined1 (*pauVar31) [16];
  int *piVar32;
  undefined8 uVar33;
  undefined *puVar34;
  long *plVar35;
  long *plVar36;
  ulong uVar37;
  long *plVar38;
  undefined8 *unaff_x24;
  undefined *unaff_x25;
  long lVar39;
  undefined *unaff_x26;
  long *unaff_x27;
  ulong unaff_x28;
  long *unaff_x29;
  long *plVar40;
  undefined *puVar41;
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [12];
  uint auStack_70 [4];
  
  puVar12 = auStack_70;
  puVar13 = auStack_70;
  uVar33 = 0xa46e000;
  plVar36 = (long *)((ulong)param_4 & 0xffffffff);
  plVar35 = (long *)(ulong)param_3;
  if ((bRam000000000a46e1fb & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f4b448);
    func_0x0415191c(PTR_DAT_09f7e918);
    func_0x0415191c(PTR_DAT_09f7f928);
    func_0x0415191c(PTR_DAT_09f7f930);
    func_0x0415191c(PTR_DAT_09f7f938);
    func_0x0415191c(PTR_DAT_09f7f940);
    func_0x0415191c(PTR_DAT_09f7f948);
    func_0x0415191c(PTR_DAT_09f4b430);
    bRam000000000a46e1fb = 1;
  }
  puVar10 = PTR_DAT_09f7f948;
  puVar9 = PTR_DAT_09f7f940;
  puVar7 = PTR_DAT_09f7f938;
  puVar23 = PTR_DAT_09f7f930;
  puVar8 = PTR_DAT_09f7f928;
  puVar34 = PTR_DAT_09f7e918;
  puVar41 = PTR_DAT_09f4b448;
  if (param_2 == (long *)0x0) {
    puVar41 = &WithNetwork_KeyholderStatusCalculator__IsCharacterCostumeDeployed;
    iVar14 = func_0x04151bb8();
    uVar17 = 0;
    plVar19 = extraout_x1;
    plVar22 = plVar36;
    goto code_r0x098511a0;
  }
  uVar33 = func_0x053c2424(param_2,*(undefined8 *)PTR_DAT_09f4b430);
  uVar17 = func_0x053bf1c0(param_2,*(undefined8 *)puVar8);
  auVar44._8_8_ = uVar17;
  auVar44._0_8_ = uVar33;
  uVar33 = func_0x053c0fd4(param_2,*(undefined8 *)puVar10);
  auVar43._8_8_ = uVar33;
  auVar43._0_8_ = uVar17;
  plVar18 = (long *)func_0x053c0e44(param_2,*(undefined8 *)puVar9);
  auVar42._8_8_ = plVar18;
  auVar42._0_8_ = uVar33;
  plVar19 = (long *)func_0x053c09f8(param_2,*(undefined8 *)puVar7);
  param_8 = func_0x053bf0f8(param_2,*(undefined8 *)puVar34);
  plVar20 = (long *)func_0x053c0994(param_2,*(undefined8 *)puVar23);
  param_9 = func_0x053be0f4(param_2,*(undefined8 *)puVar41);
  puVar41 = &UNK_09851124;
  plVar38 = (long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  unaff_x27 = plVar19;
  uVar29 = param_8;
  plVar40 = plVar20;
  auStack_70[0] = param_3;
code_r0x09852168:
  puVar34 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  plVar22 = auVar42._8_8_;
  plVar25 = auVar42._0_8_;
  *(long **)(puVar13 + -0x18) = plVar40;
  *(undefined **)(puVar13 + -0x16) = puVar41;
  *(ulong *)(puVar13 + -0x14) = uVar29;
  *(long **)(puVar13 + -0x12) = unaff_x27;
  *(long **)(puVar13 + -0x10) = plVar18;
  *(long *)(puVar13 + -0xe) = auVar43._8_8_;
  *(long *)(puVar13 + -0xc) = auVar43._0_8_;
  *(long **)(puVar13 + -10) = plVar38;
  *(long **)(puVar13 + -8) = param_2;
  *(long **)(puVar13 + -6) = plVar35;
  *(ulong *)(puVar13 + -4) = param_1;
  *(long **)(puVar13 + -2) = plVar36;
  puVar12 = puVar13 + -0x90;
  *(undefined8 *)(puVar13 + -0x84) = param_9;
  *(ulong *)(puVar13 + -0x82) = param_8;
  *(undefined1 (*) [16])(puVar13 + -0x8a) = auVar44;
  param_5 = plVar22;
  param_6 = plVar20;
  param_7 = plVar19;
  if ((bRam000000000a46e1fc & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f4bae8);
    func_0x0415191c(PTR_DAT_09f4ba28);
    func_0x0415191c(PTR_DAT_09f48a90);
    func_0x0415191c(PTR_DAT_09ee7dd8);
    func_0x0415191c(PTR_DAT_09f7faa8);
    func_0x0415191c(PTR_DAT_09f7fab0);
    func_0x0415191c(PTR_DAT_09f7f970);
    func_0x0415191c(PTR_DAT_09f7fa78);
    func_0x0415191c(PTR_DAT_09f7faa0);
    func_0x0415191c(PTR_DAT_09f7f978);
    func_0x0415191c(PTR_DAT_09eab348);
    bRam000000000a46e1fc = 1;
  }
  puVar41 = PTR_DAT_09f7fa78;
  lVar26 = *(long *)puVar34;
  *(undefined8 *)(puVar13 + -0x20) = 0;
  *(undefined8 *)(puVar13 + -0x1e) = 0;
  *(undefined8 *)(puVar13 + -0x1c) = 0;
  *(undefined8 *)(puVar13 + -0x26) = 0;
  *(undefined8 *)(puVar13 + -0x28) = 0;
  *(undefined8 *)(puVar13 + -0x22) = 0;
  *(undefined8 *)(puVar13 + -0x24) = 0;
  *(undefined8 *)(puVar13 + -0x2e) = 0;
  *(undefined8 *)(puVar13 + -0x30) = 0;
  *(undefined8 *)(puVar13 + -0x2a) = 0;
  *(undefined8 *)(puVar13 + -0x2c) = 0;
  *(undefined8 *)(puVar13 + -0x36) = 0;
  *(undefined8 *)(puVar13 + -0x38) = 0;
  *(undefined8 *)(puVar13 + -0x32) = 0;
  *(undefined8 *)(puVar13 + -0x34) = 0;
  if (*(int *)(lVar26 + 0xe0) == 0) {
    func_0x04151a94();
    lVar26 = *(long *)puVar34;
  }
  uVar17 = **(undefined8 **)(lVar26 + 0xb8);
  param_1 = (*(undefined8 **)(lVar26 + 0xb8))[1];
  lVar26 = func_0x07649a18(0,*(undefined8 *)puVar41);
  puVar41 = PTR_DAT_09f7f970;
  if ((lVar26 != 0) && (plVar20 != (long *)0x0)) {
    lVar27 = *plVar20;
    uVar33 = *(undefined8 *)(lVar26 + 0x18);
    uVar29 = (ulong)*(ushort *)(lVar27 + 0x12e);
    if (uVar29 != 0) {
      piVar32 = (int *)(*(long *)(lVar27 + 0xb0) + 8);
      do {
        if (*(long *)(piVar32 + -2) == *(long *)PTR_DAT_09f48a90) {
          puVar21 = (undefined8 *)(lVar27 + (long)(*piVar32 + 8) * 0x10 + 0x138);
          goto code_r0x09852300;
        }
        uVar29 = uVar29 - 1;
        piVar32 = piVar32 + 4;
      } while (uVar29 != 0);
    }
    puVar21 = (undefined8 *)func_0x041cb4c4(plVar20,*(long *)PTR_DAT_09f48a90,8);
code_r0x09852300:
    (*(code *)*puVar21)(plVar20,uVar33,puVar21[1]);
    unaff_x29 = (long *)func_0x0764b4fc(0,*(undefined8 *)puVar41);
    if ((unaff_x29 != (long *)0x0) && (plVar25 != (long *)0x0)) {
      lVar28 = *plVar25;
      lVar39 = unaff_x29[3];
      uVar29 = (ulong)*(ushort *)(lVar28 + 0x12e);
      lVar27 = *(long *)PTR_DAT_09f4bae8;
      *(long **)(puVar13 + -0x86) = plVar20;
      *(long *)(puVar13 + -0x8e) = lVar26;
      if (uVar29 != 0) {
        piVar32 = (int *)(*(long *)(lVar28 + 0xb0) + 8);
        do {
          if (*(long *)(piVar32 + -2) == lVar27) {
            puVar21 = (undefined8 *)(lVar28 + (long)(*piVar32 + 8) * 0x10 + 0x138);
            goto code_r0x0985238c;
          }
          uVar29 = uVar29 - 1;
          piVar32 = piVar32 + 4;
        } while (uVar29 != 0);
      }
      puVar21 = (undefined8 *)func_0x041cb4c4(plVar25,lVar27,8);
code_r0x0985238c:
      (*(code *)*puVar21)(plVar25,lVar39,puVar21[1]);
      unaff_x25 = PTR_DAT_09f7fab0;
      unaff_x27 = (long *)PTR_DAT_09f4ba28;
      unaff_x26 = PTR_DAT_09ee7dd8;
      lVar26 = unaff_x29[3];
      plVar40 = unaff_x29;
      if (lVar26 != 0) {
        puVar13[-0x8b] = *puVar13;
        unaff_x24 = (undefined8 *)0x0;
        do {
          if (*(int *)(lVar26 + 0x18) <= (int)unaff_x24) goto code_r0x0985259c;
          func_0x06c0c2bc(puVar13 + -0x50,lVar26,unaff_x24,*(undefined8 *)unaff_x25);
          *(undefined8 *)(puVar13 + -0x1e) = *(undefined8 *)(puVar13 + -0x4e);
          *(undefined8 *)(puVar13 + -0x20) = *(undefined8 *)(puVar13 + -0x50);
          *(undefined8 *)(puVar13 + -0x1c) = *(undefined8 *)(puVar13 + -0x4c);
          uVar29 = func_0x091c6524(puVar13 + -0x20,0);
          if ((uVar29 & 1) == 0) {
            plVar35 = *(long **)(puVar13 + -0x1e);
            if (plVar35 == (long *)0x0) break;
            uVar16 = (**(code **)(*plVar35 + 0x1a8))(plVar35,*(undefined8 *)(*plVar35 + 0x1b0));
            uVar33 = *(undefined8 *)(puVar13 + -0x1c);
            if (*(int *)(*(long *)unaff_x26 + 0xe0) == 0) {
              func_0x04151a94(*(long *)unaff_x26);
            }
            uVar29 = func_0x091d295c(uVar16,uVar33,0);
            if (plVar22 == (long *)0x0) break;
            lVar26 = *plVar22;
            unaff_x28 = uVar29 & 0xffffffff;
            uVar29 = (ulong)*(ushort *)(lVar26 + 0x12e);
            if (uVar29 != 0) {
              piVar32 = (int *)(*(long *)(lVar26 + 0xb0) + 8);
              do {
                if (*(long *)(piVar32 + -2) == *unaff_x27) {
                  puVar21 = (undefined8 *)(lVar26 + (long)(*piVar32 + 6) * 0x10 + 0x138);
                  goto code_r0x0985249c;
                }
                uVar29 = uVar29 - 1;
                piVar32 = piVar32 + 4;
              } while (uVar29 != 0);
            }
            puVar21 = (undefined8 *)func_0x041cb4c4(plVar22,*unaff_x27,6);
code_r0x0985249c:
            (*(code *)*puVar21)(puVar13 + -0x50,plVar22,unaff_x28,puVar21[1]);
            func_0x098f6ee0(puVar13 + -0x38,puVar13 + -0x50,0x60);
            uVar29 = func_0x091d2af8(puVar13 + -0x38,0);
            if ((uVar29 & 1) != 0) goto code_r0x098524d0;
          }
          lVar26 = unaff_x29[3];
          unaff_x24 = (undefined8 *)(ulong)((int)unaff_x24 + 1);
          if (lVar26 == 0) break;
        } while( true );
      }
    }
  }
  goto code_r0x09852598;
code_r0x098524d0:
  if (*(int *)(*(long *)unaff_x26 + 0xe0) == 0) {
    func_0x04151a94();
  }
  plVar35 = *(long **)(puVar13 + -0x22);
  if (plVar35 == (long *)0x0) {
code_r0x09852598:
    func_0x04151bb8();
code_r0x0985259c:
    if (*(int *)(*(long *)PTR_DAT_09eab348 + 0xe0) == 0) {
      func_0x04151a94();
    }
    func_0x04324484(*(undefined8 *)(puVar13 + -0x8e),0);
    func_0x04324484(plVar40,0);
    return uVar17;
  }
  iVar14 = (**(code **)(*plVar35 + 0x1a8))(plVar35,*(undefined8 *)(*plVar35 + 0x1b0));
  param_4 = *(long **)(puVar13 + -0x82);
  puVar41 = &UNK_09852500;
  plVar35 = plVar19;
code_r0x098511a0:
  puVar34 = PTR_DAT_09f7fa48;
  *(undefined **)((long)puVar12 + -0x50) = puVar41;
  *(undefined **)((long)puVar12 + -0x40) = unaff_x26;
  *(undefined **)((long)puVar12 + -0x38) = unaff_x25;
  *(undefined8 **)((long)puVar12 + -0x30) = unaff_x24;
  *(long **)((long)puVar12 + -0x28) = plVar22;
  *(undefined8 *)((long)puVar12 + -0x20) = uVar17;
  *(long **)((long)puVar12 + -0x18) = plVar35;
  *(ulong *)((long)puVar12 + -0x10) = param_1;
  *(undefined8 *)((long)puVar12 + -8) = uVar33;
  plVar35 = param_4;
  if ((bRam000000000a46e1ff & 1) == 0) {
    func_0x0415191c(PTR_DAT_09f7fa50);
    func_0x0415191c(PTR_DAT_09f7fa58);
    func_0x0415191c(PTR_DAT_09f7fa60);
    func_0x0415191c(PTR_DAT_09f48ac8);
    func_0x0415191c(PTR_DAT_09f478e0);
    func_0x0415191c(PTR_DAT_09f7fa68);
    func_0x0415191c(PTR_DAT_09f7fa48);
    func_0x0415191c(PTR_DAT_09f7fa70);
    func_0x0415191c(PTR_DAT_09eab348);
    bRam000000000a46e1ff = 1;
  }
  uVar33 = *(undefined8 *)puVar34;
  *(undefined8 *)((long)puVar12 + -0x68) = 0;
  *(undefined8 *)((long)puVar12 + -0x70) = 0;
  *(undefined8 *)((long)puVar12 + -0x58) = 0;
  *(undefined8 *)((long)puVar12 + -0x60) = 0;
  *(undefined4 *)((long)puVar12 + -0x78) = 0;
  *(undefined8 *)((long)puVar12 + -0x80) = 0;
  puVar41 = (undefined *)func_0x07649de8(0,uVar33);
  plVar36 = (long *)0xa46e000;
  if ((puVar41 != (undefined *)0x0) && (plVar19 != (long *)0x0)) {
    lVar26 = *plVar19;
    plVar36 = *(long **)(puVar41 + 0x18);
    uVar29 = (ulong)*(ushort *)(lVar26 + 0x12e);
    if (uVar29 != 0) {
      piVar32 = (int *)(*(long *)(lVar26 + 0xb0) + 8);
      do {
        if (*(long *)(piVar32 + -2) == *(long *)PTR_DAT_09f48ac8) {
          puVar21 = (undefined8 *)(lVar26 + (long)(*piVar32 + 8) * 0x10 + 0x138);
          goto code_r0x098512d0;
        }
        uVar29 = uVar29 - 1;
        piVar32 = piVar32 + 4;
      } while (uVar29 != 0);
    }
    puVar21 = (undefined8 *)func_0x041cb4c4(plVar19,*(long *)PTR_DAT_09f48ac8,8);
code_r0x098512d0:
    plVar35 = (long *)puVar21[1];
    (*(code *)*puVar21)(plVar19,plVar36);
    puVar7 = PTR_DAT_09f7fa58;
    puVar23 = PTR_DAT_09f7fa50;
    puVar8 = PTR_DAT_09f478e0;
    plVar22 = (long *)PTR_DAT_09eab348;
    puVar34 = puVar41;
    if (*(long *)(puVar41 + 0x18) != 0) {
      func_0x06b7a424((undefined1 *)((long)puVar12 + -0xd8),*(long *)(puVar41 + 0x18),
                      *(undefined8 *)PTR_DAT_09f7fa68);
      *(undefined8 *)((long)puVar12 + -0x68) = *(undefined8 *)((long)puVar12 + -0xd0);
      *(undefined8 *)((long)puVar12 + -0x70) = *(undefined8 *)((long)puVar12 + -0xd8);
      *(undefined8 *)((long)puVar12 + -0x58) = *(undefined8 *)((long)puVar12 + -0xc0);
      *(undefined8 *)((long)puVar12 + -0x60) = *(undefined8 *)((long)puVar12 + -200);
      while( true ) {
        do {
          uVar29 = func_0x05d2b160((undefined1 *)((long)puVar12 + -0x70),*(undefined8 *)puVar7);
          if ((uVar29 & 1) == 0) {
            func_0x05d2b15c((undefined1 *)((long)puVar12 + -0x70),*(undefined8 *)puVar23);
            goto code_r0x09851414;
          }
          *(undefined8 *)((long)puVar12 + -0x80) = *(undefined8 *)((long)puVar12 + -0x60);
          *(undefined4 *)((long)puVar12 + -0x78) = *(undefined4 *)((long)puVar12 + -0x58);
          uVar29 = func_0x091c48bc((undefined1 *)((long)puVar12 + -0x80),0);
        } while ((uVar29 & 1) != 0);
        if (param_4 == (long *)0x0) break;
        lVar27 = *param_4;
        plVar19 = (long *)(ulong)*(uint *)((long)puVar12 + -0x78);
        lVar26 = *(long *)puVar8;
        uVar29 = (ulong)*(ushort *)(lVar27 + 0x12e);
        if (uVar29 != 0) {
          piVar32 = (int *)(*(long *)(lVar27 + 0xb0) + 8);
          do {
            if (*(long *)(piVar32 + -2) == lVar26) {
              puVar21 = (undefined8 *)(lVar27 + (long)(*piVar32 + 6) * 0x10 + 0x138);
              goto code_r0x098513b0;
            }
            uVar29 = uVar29 - 1;
            piVar32 = piVar32 + 4;
          } while (uVar29 != 0);
        }
        puVar21 = (undefined8 *)func_0x041cb4c4(param_4,lVar26,6);
code_r0x098513b0:
        plVar35 = (long *)puVar21[1];
        (*(code *)*puVar21)((undefined1 *)((long)puVar12 + -0xd8),param_4,plVar19);
        if (*(long *)((long)puVar12 + -0xd8) == 0) goto code_r0x09851454;
        if (*(int *)(*(long *)((long)puVar12 + -0xd8) + 0x20) == iVar14) {
          if (*(int *)(*plVar22 + 0xe0) == 0) {
            func_0x04151a94();
          }
          func_0x04324484(puVar41,0);
          func_0x05d2b15c((undefined1 *)((long)puVar12 + -0x70),*(undefined8 *)puVar23);
          return 1;
        }
      }
      func_0x04151bb8();
code_r0x09851454:
      func_0x04151bb8();
      plVar36 = plVar22;
      unaff_x24 = (undefined8 *)puVar23;
      unaff_x25 = puVar7;
      unaff_x26 = puVar8;
    }
  }
  auVar45 = func_0x04151bb8();
  uVar33 = auVar45._0_8_;
  if (auVar45._8_4_ == 1) {
    plVar22 = (long *)func_0x098f6de0(uVar33);
    lVar26 = *plVar22;
    func_0x098f6df0();
    func_0x05d2b15c((undefined1 *)((long)puVar12 + -0x70),*unaff_x24);
    puVar41 = puVar34;
    plVar22 = plVar36;
    if (lVar26 == 0) {
code_r0x09851414:
      if (*(int *)(*plVar22 + 0xe0) == 0) {
        func_0x04151a94();
      }
      func_0x04324484(puVar41,0);
      return 0;
    }
    func_0x04151bb0(lVar26);
  }
  func_0x05d2b15c((undefined1 *)((long)puVar12 + -0x70),*unaff_x24);
  func_0x04247ab0(uVar33);
  func_0x04151bb0(0);
  auVar42 = func_0x03bf6574();
  puVar41 = PTR_DAT_09ee7dd8;
  plVar20 = auVar42._8_8_;
  plVar18 = auVar42._0_8_;
  *(undefined **)((long)puVar12 + -0x130) =
       &WithNetwork_KeyholderStatusCalculator__GetEquipPossessionEffectValueTargetCharacter;
  *(undefined **)((long)puVar12 + -0x120) = unaff_x26;
  *(undefined **)((long)puVar12 + -0x118) = unaff_x25;
  *(undefined8 **)((long)puVar12 + -0x110) = unaff_x24;
  *(long **)((long)puVar12 + -0x108) = plVar36;
  *(long **)((long)puVar12 + -0x100) = plVar19;
  *(undefined8 *)((long)puVar12 + -0xf8) = 0;
  *(undefined8 *)((long)puVar12 + -0xf0) = uVar33;
  *(undefined **)((long)puVar12 + -0xe8) = puVar34;
  uVar37 = 0xa46e000;
  uVar29 = (ulong)param_6 & 0xffffffff;
  plVar36 = plVar35;
  plVar22 = param_5;
  if ((bRam000000000a46e1fe & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09eca930);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09f462e0);
    func_0x0415191c(PTR_DAT_09ee7dd8);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e1fe = 1;
  }
  lVar26 = *(long *)puVar41;
  *(undefined8 *)((long)puVar12 + -0x148) = 0;
  *(undefined8 *)((long)puVar12 + -0x150) = 0;
  *(undefined8 *)((long)puVar12 + -0x138) = 0;
  *(undefined8 *)((long)puVar12 + -0x140) = 0;
  *(undefined8 *)((long)puVar12 + -0x168) = 0;
  *(undefined8 *)((long)puVar12 + -0x170) = 0;
  *(undefined8 *)((long)puVar12 + -0x158) = 0;
  *(undefined8 *)((long)puVar12 + -0x160) = 0;
  *(undefined8 *)((long)puVar12 + -0x188) = 0;
  *(undefined8 *)((long)puVar12 + -400) = 0;
  *(undefined8 *)((long)puVar12 + -0x178) = 0;
  *(undefined8 *)((long)puVar12 + -0x180) = 0;
  if (*(int *)(lVar26 + 0xe0) == 0) {
    func_0x04151a94();
  }
  puVar34 = PTR_DAT_09f462e0;
  if (plVar35[10] != 0) {
    uVar1 = *(uint *)(plVar35[10] + 0x2c);
    uVar37 = (ulong)uVar1;
    if (uVar1 == 0) goto code_r0x0985188c;
    if (plVar20 != (long *)0x0) {
      lVar26 = *plVar20;
      uVar30 = (ulong)*(ushort *)(lVar26 + 0x12e);
      if (uVar30 != 0) {
        piVar32 = (int *)(*(long *)(lVar26 + 0xb0) + 8);
        do {
          if (*(long *)(piVar32 + -2) == *(long *)PTR_DAT_09f462e0) {
            puVar21 = (undefined8 *)(lVar26 + (long)(*piVar32 + 5) * 0x10 + 0x138);
            goto code_r0x098515f0;
          }
          uVar30 = uVar30 - 1;
          piVar32 = piVar32 + 4;
        } while (uVar30 != 0);
      }
      puVar21 = (undefined8 *)func_0x041cb4c4(plVar20,*(long *)PTR_DAT_09f462e0,5);
code_r0x098515f0:
      plVar36 = (long *)puVar21[1];
      uVar30 = (*(code *)*puVar21)(plVar20,uVar1);
      puVar8 = PTR_DAT_09f470e0;
      if ((uVar30 & 1) != 0) {
        lVar27 = *plVar20;
        lVar26 = *(long *)puVar34;
        uVar30 = (ulong)*(ushort *)(lVar27 + 0x12e);
        if (uVar30 == 0) goto code_r0x09851634;
        piVar32 = (int *)(*(long *)(lVar27 + 0xb0) + 8);
        goto code_r0x0985161c;
      }
      unaff_x26 = puVar34;
      if (plVar18 != (long *)0x0) {
        lVar26 = *plVar18;
        uVar29 = (ulong)*(ushort *)(lVar26 + 0x12e);
        if (uVar29 == 0) goto code_r0x09851680;
        piVar32 = (int *)(*(long *)(lVar26 + 0xb0) + 8);
        goto code_r0x09851668;
      }
    }
  }
  auVar42 = func_0x04151bb8();
  puVar34 = PTR_DAT_09f7fa78;
  plVar19 = auVar42._8_8_;
  *(undefined **)((long)puVar12 + -0x210) =
       &WithNetwork_KeyholderStatusCalculator__IsKeyholderAssistDeployed;
  *(long **)((long)puVar12 + -0x208) = unaff_x27;
  *(undefined **)((long)puVar12 + -0x200) = unaff_x26;
  *(undefined **)((long)puVar12 + -0x1f8) = puVar41;
  *(long **)((long)puVar12 + -0x1f0) = plVar20;
  *(ulong *)((long)puVar12 + -0x1e8) = uVar37;
  *(long **)((long)puVar12 + -0x1e0) = plVar18;
  *(ulong *)((long)puVar12 + -0x1d8) = uVar29;
  *(ulong *)((long)puVar12 + -0x1d0) = (ulong)param_5 & 0xffffffff;
  *(long **)((long)puVar12 + -0x1c8) = plVar35;
  plVar18 = plVar36;
  if ((bRam000000000a46e200 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09f7fa80);
    func_0x0415191c(PTR_DAT_09f7fa88);
    func_0x0415191c(PTR_DAT_09f7fa90);
    func_0x0415191c(PTR_DAT_09f48a90);
    func_0x0415191c(PTR_DAT_09f46a90);
    func_0x0415191c(PTR_DAT_09ee7dd8);
    func_0x0415191c(PTR_DAT_09f7fa98);
    func_0x0415191c(PTR_DAT_09eaa2b0);
    func_0x0415191c(PTR_DAT_09eb8aa8);
    func_0x0415191c(PTR_DAT_09f7fa78);
    func_0x0415191c(PTR_DAT_09f7faa0);
    func_0x0415191c(PTR_DAT_09eab348);
    bRam000000000a46e200 = 1;
  }
  uVar33 = *(undefined8 *)puVar34;
  *(undefined8 *)((long)puVar12 + -0x228) = 0;
  *(undefined8 *)((long)puVar12 + -0x230) = 0;
  *(undefined8 *)((long)puVar12 + -0x218) = 0;
  *(undefined8 *)((long)puVar12 + -0x220) = 0;
  *(undefined8 *)((long)puVar12 + -0x248) = 0;
  puVar23 = (undefined *)func_0x07649a18(0,uVar33);
  puVar8 = PTR_DAT_09ee7dd8;
  puVar21 = (undefined8 *)0xa46e000;
  if ((puVar23 != (undefined *)0x0) && (plVar19 != (long *)0x0)) {
    lVar26 = *plVar19;
    puVar21 = *(undefined8 **)(puVar23 + 0x18);
    uVar29 = (ulong)*(ushort *)(lVar26 + 0x12e);
    if (uVar29 != 0) {
      piVar32 = (int *)(*(long *)(lVar26 + 0xb0) + 8);
      do {
        if (*(long *)(piVar32 + -2) == *(long *)PTR_DAT_09f48a90) {
          puVar24 = (undefined8 *)(lVar26 + (long)(*piVar32 + 8) * 0x10 + 0x138);
          goto code_r0x09851a30;
        }
        uVar29 = uVar29 - 1;
        piVar32 = piVar32 + 4;
      } while (uVar29 != 0);
    }
    puVar24 = (undefined8 *)func_0x041cb4c4(plVar19,*(long *)PTR_DAT_09f48a90,8);
code_r0x09851a30:
    plVar18 = (long *)puVar24[1];
    (*(code *)*puVar24)(plVar19,puVar21);
    if (*(int *)(*(long *)puVar8 + 0xe0) == 0) {
      func_0x04151a94();
    }
    puVar11 = PTR_DAT_09f7fa88;
    puVar10 = PTR_DAT_09f7fa80;
    puVar9 = PTR_DAT_09f46a90;
    puVar7 = PTR_DAT_09eb8aa8;
    plVar35 = (long *)PTR_DAT_09eab348;
    lVar26 = *(long *)(auVar42._0_8_ + 0x50);
    puVar34 = puVar23;
    plVar20 = (long *)puVar8;
    if (lVar26 != 0) {
      uVar1 = *(uint *)(lVar26 + 0x24);
      plVar20 = (long *)(ulong)uVar1;
      if (uVar1 == 0) goto code_r0x09851bbc;
      plVar19 = plVar35;
      if (*(long *)(puVar23 + 0x18) != 0) {
        func_0x06b77b74((undefined1 *)((long)puVar12 + -0x280),*(long *)(puVar23 + 0x18),
                        *(undefined8 *)PTR_DAT_09f7fa98);
        *(undefined8 *)((long)puVar12 + -0x228) = *(undefined8 *)((long)puVar12 + -0x278);
        *(undefined8 *)((long)puVar12 + -0x230) = *(undefined8 *)((long)puVar12 + -0x280);
        *(undefined8 *)((long)puVar12 + -0x218) = *(undefined8 *)((long)puVar12 + -0x268);
        *(undefined8 *)((long)puVar12 + -0x220) = *(undefined8 *)((long)puVar12 + -0x270);
        while( true ) {
          do {
            do {
              uVar29 = func_0x05d2af60((undefined1 *)((long)puVar12 + -0x230),*(undefined8 *)puVar11
                                      );
              if ((uVar29 & 1) == 0) {
                func_0x05d2af5c((undefined1 *)((long)puVar12 + -0x230),*(undefined8 *)puVar10);
                goto code_r0x09851bbc;
              }
              *(undefined8 *)((long)puVar12 + -0x240) = *(undefined8 *)((long)puVar12 + -0x220);
              *(undefined4 *)((long)puVar12 + -0x238) = *(undefined4 *)((long)puVar12 + -0x218);
              uVar29 = *(ulong *)((long)puVar12 + -0x23c);
              *(ulong *)((long)puVar12 + -0x248) = uVar29;
            } while ((uVar29 & 0xff) == 0);
            uVar33 = *(undefined8 *)puVar7;
            *(ulong *)((long)puVar12 + -0x248) = uVar29;
            iVar14 = func_0x0701b33c((undefined1 *)((long)puVar12 + -0x248),uVar33);
          } while (iVar14 == 0);
          uVar33 = *(undefined8 *)puVar7;
          *(ulong *)((long)puVar12 + -0x248) = uVar29;
          uVar16 = func_0x0701b33c((undefined1 *)((long)puVar12 + -0x248),uVar33);
          if (plVar36 == (long *)0x0) break;
          lVar27 = *plVar36;
          lVar26 = *(long *)puVar9;
          uVar29 = (ulong)*(ushort *)(lVar27 + 0x12e);
          if (uVar29 != 0) {
            piVar32 = (int *)(*(long *)(lVar27 + 0xb0) + 8);
            do {
              if (*(long *)(piVar32 + -2) == lVar26) {
                puVar21 = (undefined8 *)(lVar27 + (long)(*piVar32 + 6) * 0x10 + 0x138);
                goto code_r0x09851b58;
              }
              uVar29 = uVar29 - 1;
              piVar32 = piVar32 + 4;
            } while (uVar29 != 0);
          }
          puVar21 = (undefined8 *)func_0x041cb4c4(plVar36,lVar26,6);
code_r0x09851b58:
          plVar18 = (long *)puVar21[1];
          (*(code *)*puVar21)((undefined1 *)((long)puVar12 + -0x280),plVar36,uVar16);
          if ((*(long *)((long)puVar12 + -0x280) != 0) &&
             (*(uint *)(*(long *)((long)puVar12 + -0x280) + 0x2c) == uVar1)) {
            if (*(int *)(*plVar35 + 0xe0) == 0) {
              func_0x04151a94();
            }
            func_0x04324484(puVar23,0);
            func_0x05d2af5c((undefined1 *)((long)puVar12 + -0x230),*(undefined8 *)puVar10);
            return 1;
          }
        }
        func_0x04151bb8();
        puVar21 = (undefined8 *)puVar10;
        puVar41 = puVar11;
        unaff_x26 = puVar7;
        unaff_x27 = (long *)puVar9;
      }
    }
  }
  plVar35 = plVar19;
  auVar45 = func_0x04151bb8();
  uVar33 = auVar45._0_8_;
  if (auVar45._8_4_ == 1) {
    plVar36 = (long *)func_0x098f6de0(uVar33);
    lVar26 = *plVar36;
    func_0x098f6df0();
    func_0x05d2af5c((undefined1 *)((long)puVar12 + -0x230),*puVar21);
    puVar23 = puVar34;
    if (lVar26 == 0) {
code_r0x09851bbc:
      if (*(int *)(*plVar35 + 0xe0) == 0) {
        func_0x04151a94();
      }
      func_0x04324484(puVar23,0);
      return 0;
    }
    func_0x04151bb0(lVar26);
  }
  func_0x05d2af5c((undefined1 *)((long)puVar12 + -0x230),*puVar21);
  func_0x04247ab0(uVar33);
  func_0x04151bb0(0);
  auVar42 = func_0x03bf6574();
  plVar40 = (long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  param_2 = auVar42._8_8_;
  plVar38 = auVar42._0_8_;
  puVar13 = (uint *)((long)puVar12 + -0x390);
  *(long **)((long)puVar12 + -0x2e0) = unaff_x29;
  *(undefined **)((long)puVar12 + -0x2d8) =
       &WithNetwork_KeyholderStatusCalculator__GetRarityUpBonusEffectValueWithTarget;
  *(ulong *)((long)puVar12 + -0x2d0) = unaff_x28;
  *(long **)((long)puVar12 + -0x2c8) = unaff_x27;
  *(undefined **)((long)puVar12 + -0x2c0) = unaff_x26;
  *(undefined **)((long)puVar12 + -0x2b8) = puVar41;
  *(long **)((long)puVar12 + -0x2b0) = plVar20;
  *(undefined8 **)((long)puVar12 + -0x2a8) = puVar21;
  *(long **)((long)puVar12 + -0x2a0) = plVar35;
  *(undefined8 *)((long)puVar12 + -0x298) = 0;
  *(undefined8 *)((long)puVar12 + -0x290) = uVar33;
  *(undefined **)((long)puVar12 + -0x288) = puVar34;
  *(int *)((long)puVar12 + -0x374) = (int)plVar22;
  plVar36 = (long *)0xa46e000;
  uVar29 = (ulong)param_7 & 0xffffffff;
  param_1 = (ulong)param_6 & 0xffffffff;
  plVar25 = plVar18;
  plVar20 = param_6;
  plVar19 = param_7;
  if ((bRam000000000a46e1fd & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09eca930);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09f462e0);
    func_0x0415191c(PTR_DAT_09ee7dd8);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e1fd = 1;
  }
  plVar35 = (long *)PTR_DAT_09ee7dd8;
  lVar26 = *plVar40;
  *(undefined8 *)((long)puVar12 + -0x2f8) = 0;
  *(undefined8 *)((long)puVar12 + -0x300) = 0;
  *(undefined8 *)((long)puVar12 + -0x2e8) = 0;
  *(undefined8 *)((long)puVar12 + -0x2f0) = 0;
  *(undefined8 *)((long)puVar12 + -0x318) = 0;
  *(undefined8 *)((long)puVar12 + -800) = 0;
  *(undefined8 *)((long)puVar12 + -0x308) = 0;
  *(undefined8 *)((long)puVar12 + -0x310) = 0;
  *(undefined8 *)((long)puVar12 + -0x338) = 0;
  *(undefined8 *)((long)puVar12 + -0x340) = 0;
  *(undefined8 *)((long)puVar12 + -0x328) = 0;
  *(undefined8 *)((long)puVar12 + -0x330) = 0;
  if (*(int *)(lVar26 + 0xe0) == 0) {
    func_0x04151a94();
    lVar26 = *plVar40;
  }
  pauVar31 = *(undefined1 (**) [16])(lVar26 + 0xb8);
  uVar33 = *(undefined8 *)*pauVar31;
  auVar6 = *pauVar31;
  auVar5 = *pauVar31;
  auVar43 = *pauVar31;
  auVar44 = *pauVar31;
  if (*(int *)(*plVar35 + 0xe0) == 0) {
    func_0x04151a94(*plVar35);
  }
  auVar4._8_8_ = plVar22;
  auVar4._0_8_ = plVar25;
  auVar3._8_8_ = plVar22;
  auVar3._0_8_ = plVar25;
  auVar42._8_8_ = plVar22;
  auVar42._0_8_ = plVar25;
  lVar26 = plVar18[9];
  if ((lVar26 != 0) && (lVar27 = plVar18[10], auVar42 = auVar3, auVar43 = auVar5, lVar27 != 0)) {
    plVar36 = *(long **)(lVar27 + 0x30);
    if ((plVar36 == (long *)0x0) || (uVar37 = plVar36[3], uVar37 == 0)) goto code_r0x0985211c;
    *(int *)((long)puVar12 + -0x378) = (int)param_6;
    param_1 = *(ulong *)(lVar27 + 0x38);
    auVar42 = auVar4;
    auVar43 = auVar6;
    if (param_1 != 0) {
      if ((int)uVar37 != *(int *)(param_1 + 0x18)) {
code_r0x0985211c:
        lVar26 = *plVar40;
        if (*(int *)(lVar26 + 0xe0) == 0) {
          func_0x04151a94();
          lVar26 = *plVar40;
        }
        return **(undefined8 **)(lVar26 + 0xb8);
      }
      uVar37 = uVar37 & 0xffffffff;
      uVar1 = *(uint *)(lVar26 + 0x20);
      unaff_x27 = (long *)(ulong)uVar1;
      if (*(int *)(*plVar35 + 0xe0) == 0) {
        func_0x04151a94();
        uVar37 = (ulong)*(uint *)(plVar36 + 3);
      }
      auVar42._8_8_ = plVar22;
      auVar42._0_8_ = plVar25;
      if ((int)uVar37 < 1) {
        return uVar33;
      }
      plVar22 = plVar18 + 2;
      plVar35 = (long *)0x0;
      uVar1 = uVar1 + 1;
      plVar18 = (long *)(ulong)uVar1;
      *(int *)((long)puVar12 + -0x380) = (int)*plVar22;
      *(int *)((long)puVar12 + -0x37c) = (int)param_7;
      while( true ) {
        uVar33 = auVar42._8_8_;
        auVar43 = auVar44;
        if ((long *)(ulong)*(uint *)(param_1 + 0x18) <= plVar35) break;
        if (*(int *)(param_1 + (long)plVar35 * 4 + 0x20) <= (int)uVar1) {
          if ((long *)(uVar37 & 0xffffffff) <= plVar35) break;
          uVar2 = *(uint *)((long)plVar36 + (long)plVar35 * 4 + 0x20);
          unaff_x27 = (long *)(ulong)uVar2;
          if (uVar2 != 0) {
            if (param_2 == (long *)0x0) goto code_r0x09852164;
            lVar26 = *param_2;
            uVar37 = (ulong)*(ushort *)(lVar26 + 0x12e);
            if (uVar37 != 0) {
              piVar32 = (int *)(*(long *)(lVar26 + 0xb0) + 8);
              do {
                if (*(long *)(piVar32 + -2) == *(long *)PTR_DAT_09f462e0) {
                  puVar21 = (undefined8 *)(lVar26 + (long)(*piVar32 + 5) * 0x10 + 0x138);
                  goto code_r0x09851e50;
                }
                uVar37 = uVar37 - 1;
                piVar32 = piVar32 + 4;
              } while (uVar37 != 0);
            }
            puVar21 = (undefined8 *)func_0x041cb4c4(param_2,*(long *)PTR_DAT_09f462e0,5);
code_r0x09851e50:
            uVar17 = puVar21[1];
            uVar37 = (*(code *)*puVar21)(param_2,uVar2);
            auVar42._8_8_ = uVar33;
            auVar42._0_8_ = uVar17;
            if ((uVar37 & 1) == 0) {
              if (plVar38 == (long *)0x0) goto code_r0x09852164;
              lVar26 = *plVar38;
              uVar37 = (ulong)*(ushort *)(lVar26 + 0x12e);
              if (uVar37 != 0) {
                piVar32 = (int *)(*(long *)(lVar26 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar32 + -2) == *(long *)PTR_DAT_09f470e0) {
                    puVar21 = (undefined8 *)(lVar26 + (long)(*piVar32 + 5) * 0x10 + 0x138);
                    goto code_r0x09851fec;
                  }
                  uVar37 = uVar37 - 1;
                  piVar32 = piVar32 + 4;
                } while (uVar37 != 0);
              }
              puVar21 = (undefined8 *)func_0x041cb4c4(plVar38,*(long *)PTR_DAT_09f470e0,5);
code_r0x09851fec:
              uVar17 = puVar21[1];
              uVar37 = (*(code *)*puVar21)(plVar38,unaff_x27);
              auVar42._8_8_ = uVar33;
              auVar42._0_8_ = uVar17;
              if ((uVar37 & 1) != 0) {
                lVar26 = *plVar38;
                uVar37 = (ulong)*(ushort *)(lVar26 + 0x12e);
                if (uVar37 != 0) {
                  piVar32 = (int *)(*(long *)(lVar26 + 0xb0) + 8);
                  do {
                    if (*(long *)(piVar32 + -2) == *(long *)PTR_DAT_09f470e0) {
                      puVar21 = (undefined8 *)(lVar26 + (long)(*piVar32 + 6) * 0x10 + 0x138);
                      goto code_r0x09852058;
                    }
                    uVar37 = uVar37 - 1;
                    piVar32 = piVar32 + 4;
                  } while (uVar37 != 0);
                }
                puVar21 = (undefined8 *)func_0x041cb4c4(plVar38,*(long *)PTR_DAT_09f470e0,6);
code_r0x09852058:
                uVar17 = puVar21[1];
                (*(code *)*puVar21)((undefined1 *)((long)puVar12 + -0x370),plVar38,uVar2);
                *(undefined8 *)((long)puVar12 + -0x338) = *(undefined8 *)((long)puVar12 + -0x368);
                *(undefined8 *)((long)puVar12 + -0x340) = *(undefined8 *)((long)puVar12 + -0x370);
                *(undefined8 *)((long)puVar12 + -0x328) = *(undefined8 *)((long)puVar12 + -0x358);
                *(undefined8 *)((long)puVar12 + -0x330) = *(undefined8 *)((long)puVar12 + -0x360);
                *(undefined8 *)((long)puVar12 + -0x318) = *(undefined8 *)((long)puVar12 + -0x348);
                *(undefined8 *)((long)puVar12 + -800) = *(undefined8 *)((long)puVar12 + -0x350);
                if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar42._8_8_ = uVar33;
                auVar42._0_8_ = uVar17;
                if (*(int *)((long)puVar12 + -0x328) == *(int *)((long)puVar12 + -0x374)) {
                  if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
                    func_0x04151a94();
                  }
                  auVar43 = func_0x091dc794((undefined1 *)((long)puVar12 + -0x340),
                                            *(undefined4 *)((long)puVar12 + -0x380),0);
                  lVar26 = *plVar40;
                  goto code_r0x098520d8;
                }
              }
            }
            else {
              lVar26 = *param_2;
              uVar37 = (ulong)*(ushort *)(lVar26 + 0x12e);
              if (uVar37 != 0) {
                piVar32 = (int *)(*(long *)(lVar26 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar32 + -2) == *(long *)PTR_DAT_09f462e0) {
                    puVar21 = (undefined8 *)(lVar26 + (long)(*piVar32 + 6) * 0x10 + 0x138);
                    goto code_r0x09851f08;
                  }
                  uVar37 = uVar37 - 1;
                  piVar32 = piVar32 + 4;
                } while (uVar37 != 0);
              }
              puVar21 = (undefined8 *)func_0x041cb4c4(param_2,*(long *)PTR_DAT_09f462e0,6);
code_r0x09851f08:
              uVar17 = puVar21[1];
              (*(code *)*puVar21)((undefined1 *)((long)puVar12 + -0x370),param_2,unaff_x27);
              *(undefined8 *)((long)puVar12 + -0x308) = *(undefined8 *)((long)puVar12 + -0x368);
              *(undefined8 *)((long)puVar12 + -0x310) = *(undefined8 *)((long)puVar12 + -0x370);
              *(undefined8 *)((long)puVar12 + -0x2f8) = *(undefined8 *)((long)puVar12 + -0x358);
              *(undefined8 *)((long)puVar12 + -0x300) = *(undefined8 *)((long)puVar12 + -0x360);
              *(undefined8 *)((long)puVar12 + -0x2e8) = *(undefined8 *)((long)puVar12 + -0x348);
              *(undefined8 *)((long)puVar12 + -0x2f0) = *(undefined8 *)((long)puVar12 + -0x350);
              if (*(int *)(*(long *)PTR_DAT_09eca930 + 0xe0) == 0) {
                func_0x04151a94();
              }
              iVar15 = func_0x091b994c((undefined1 *)((long)puVar12 + -0x310),0);
              auVar42._8_8_ = uVar33;
              auVar42._0_8_ = uVar17;
              iVar14 = 0x1d;
              if (3 < iVar15 - 0x19U) {
                iVar14 = iVar15;
              }
              if (iVar14 == *(int *)((long)puVar12 + -0x374)) {
                if (*(int *)(*(long *)PTR_DAT_09eca930 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar43 = func_0x091b9c5c((undefined1 *)((long)puVar12 + -0x310),
                                          *(undefined4 *)((long)puVar12 + -0x380),
                                          *(undefined4 *)((long)puVar12 + -0x378),uVar29,0);
                unaff_x27 = auVar43._0_8_;
                lVar26 = *plVar40;
                if (*(int *)(lVar26 + 0xe0) == 0) {
                  func_0x04151a94();
                  lVar26 = *plVar40;
                }
                plVar20 = (long *)0x0;
                uVar33 = **(undefined8 **)(lVar26 + 0xb8);
                uVar17 = (*(undefined8 **)(lVar26 + 0xb8))[1];
                uVar29 = func_0x09775108(unaff_x27,auVar43._8_8_);
                auVar42._8_8_ = uVar17;
                auVar42._0_8_ = uVar33;
                if ((uVar29 & 1) != 0) {
                  lVar26 = *plVar40;
code_r0x098520d8:
                  unaff_x27 = auVar43._0_8_;
                  if (*(int *)(lVar26 + 0xe0) == 0) {
                    func_0x04151a94();
                  }
                  plVar20 = (long *)0x0;
                  auVar44 = func_0x09774360(auVar44._0_8_,auVar44._8_8_);
                  auVar42 = auVar43;
                }
                uVar29 = (ulong)*(uint *)((long)puVar12 + -0x37c);
              }
            }
          }
        }
        uVar37 = plVar36[3];
        plVar35 = (long *)((long)plVar35 + 1);
        if ((long)(int)uVar37 <= (long)plVar35) {
          return auVar44._0_8_;
        }
      }
      func_0x04151bc0();
    }
  }
code_r0x09852164:
  puVar41 = &
            WithNetwork_KeyholderStatusCalculator__CalculateTotalKeyholderRarityBonusEffectStatusValue
  ;
  auVar44 = func_0x04151bb8();
  goto code_r0x09852168;
  while( true ) {
    uVar30 = uVar30 - 1;
    piVar32 = piVar32 + 4;
    if (uVar30 == 0) break;
code_r0x0985161c:
    if (*(long *)(piVar32 + -2) == lVar26) {
      puVar21 = (undefined8 *)(lVar27 + (long)(*piVar32 + 6) * 0x10 + 0x138);
      goto code_r0x098516a0;
    }
  }
code_r0x09851634:
  puVar21 = (undefined8 *)func_0x041cb4c4(plVar20,lVar26,6);
code_r0x098516a0:
  (*(code *)*puVar21)((undefined1 *)((long)puVar12 + -0x1c0),plVar20,uVar37,puVar21[1]);
  puVar34 = PTR_DAT_09eca930;
  *(undefined8 *)((long)puVar12 + -0x188) = *(undefined8 *)((long)puVar12 + -0x1b8);
  *(undefined8 *)((long)puVar12 + -400) = *(undefined8 *)((long)puVar12 + -0x1c0);
  *(undefined8 *)((long)puVar12 + -0x178) = *(undefined8 *)((long)puVar12 + -0x1a8);
  *(undefined8 *)((long)puVar12 + -0x180) = *(undefined8 *)((long)puVar12 + -0x1b0);
  *(undefined8 *)((long)puVar12 + -0x168) = *(undefined8 *)((long)puVar12 + -0x198);
  *(undefined8 *)((long)puVar12 + -0x170) = *(undefined8 *)((long)puVar12 + -0x1a0);
  if (*(int *)(*(long *)PTR_DAT_09eca930 + 0xe0) == 0) {
    func_0x04151a94();
  }
  iVar15 = func_0x091b994c((undefined1 *)((long)puVar12 + -400),0);
  iVar14 = 0x1d;
  if (3 < iVar15 - 0x19U) {
    iVar14 = iVar15;
  }
  if (iVar14 == (int)param_5) {
    if (*(int *)(*(long *)puVar41 + 0xe0) == 0) {
      func_0x04151a94();
    }
    lVar26 = plVar35[2];
    if (*(int *)(*(long *)puVar34 + 0xe0) == 0) {
      func_0x04151a94();
    }
    auVar42 = func_0x091b9c5c((undefined1 *)((long)puVar12 + -400),(int)lVar26,2,uVar29,0);
    puVar41 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar26 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if (*(int *)(lVar26 + 0xe0) == 0) {
      func_0x04151a94();
      lVar26 = *(long *)puVar41;
    }
    uVar29 = func_0x09775108(auVar42._0_8_,auVar42._8_8_,**(undefined8 **)(lVar26 + 0xb8),
                             (*(undefined8 **)(lVar26 + 0xb8))[1],0);
    if ((uVar29 & 1) != 0) {
      return auVar42._0_8_;
    }
  }
  goto code_r0x0985188c;
  while( true ) {
    uVar29 = uVar29 - 1;
    piVar32 = piVar32 + 4;
    if (uVar29 == 0) break;
code_r0x09851668:
    if (*(long *)(piVar32 + -2) == *(long *)PTR_DAT_09f470e0) {
      puVar21 = (undefined8 *)(lVar26 + (long)(*piVar32 + 5) * 0x10 + 0x138);
      goto code_r0x09851790;
    }
  }
code_r0x09851680:
  puVar21 = (undefined8 *)func_0x041cb4c4(plVar18,*(long *)PTR_DAT_09f470e0,5);
code_r0x09851790:
  uVar29 = (*(code *)*puVar21)(plVar18,uVar37,puVar21[1]);
  if ((uVar29 & 1) != 0) {
    lVar26 = *plVar18;
    uVar29 = (ulong)*(ushort *)(lVar26 + 0x12e);
    if (uVar29 != 0) {
      piVar32 = (int *)(*(long *)(lVar26 + 0xb0) + 8);
      do {
        if (*(long *)(piVar32 + -2) == *(long *)puVar8) {
          puVar21 = (undefined8 *)(lVar26 + (long)(*piVar32 + 6) * 0x10 + 0x138);
          goto code_r0x098517f4;
        }
        uVar29 = uVar29 - 1;
        piVar32 = piVar32 + 4;
      } while (uVar29 != 0);
    }
    puVar21 = (undefined8 *)func_0x041cb4c4(plVar18,*(long *)puVar8,6);
code_r0x098517f4:
    (*(code *)*puVar21)((undefined1 *)((long)puVar12 + -0x1c0),plVar18,uVar1,puVar21[1]);
    puVar34 = PTR_DAT_09ec4a50;
    *(undefined8 *)((long)puVar12 + -0x158) = *(undefined8 *)((long)puVar12 + -0x1b8);
    *(undefined8 *)((long)puVar12 + -0x160) = *(undefined8 *)((long)puVar12 + -0x1c0);
    *(undefined8 *)((long)puVar12 + -0x148) = *(undefined8 *)((long)puVar12 + -0x1a8);
    *(undefined8 *)((long)puVar12 + -0x150) = *(undefined8 *)((long)puVar12 + -0x1b0);
    *(undefined8 *)((long)puVar12 + -0x138) = *(undefined8 *)((long)puVar12 + -0x198);
    *(undefined8 *)((long)puVar12 + -0x140) = *(undefined8 *)((long)puVar12 + -0x1a0);
    if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
      func_0x04151a94();
    }
    iVar14 = 0x1d;
    if (3 < *(int *)((long)puVar12 + -0x148) - 0x19U) {
      iVar14 = *(int *)((long)puVar12 + -0x148);
    }
    if (iVar14 == (int)param_5) {
      if (*(int *)(*(long *)puVar41 + 0xe0) == 0) {
        func_0x04151a94();
      }
      lVar26 = plVar35[2];
      if (*(int *)(*(long *)puVar34 + 0xe0) == 0) {
        func_0x04151a94();
      }
      uVar33 = func_0x091dc794((undefined1 *)((long)puVar12 + -0x160),(int)lVar26,0);
      return uVar33;
    }
  }
code_r0x0985188c:
  puVar41 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  lVar26 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if (*(int *)(lVar26 + 0xe0) == 0) {
    func_0x04151a94();
    lVar26 = *(long *)puVar41;
  }
  return **(undefined8 **)(lVar26 + 0xb8);
}


```

## MasteryStatusCalculator.CalculateStatus(DataTableContainer tableContainer, StatusType statusType, HuntBaseStatusCalculateType calculateType, MasteryGroupType ma)

```c

/* WARNING: Possible PIC construction at 0x09852648: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09852680: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0985264c) */
/* WARNING: Removing unreachable block (ram,0x09852684) */

void WithNetwork_MasteryStatusCalculator__CalculateStatus
               (undefined8 param_1,ulong param_2,int param_3,ulong param_4,undefined4 param_5)

{
  undefined *puVar1;
  int *piVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  undefined4 uVar6;
  undefined8 *extraout_x8;
  undefined1 auVar7 [16];
  int aiStack_40 [8];
  
  piVar2 = aiStack_40;
  param_2 = param_2 & 0xffffffff;
  if (param_3 == 1) {
    auVar7 = func_0x09852824(param_1,param_4 & 0xffffffff,param_2);
    uVar6 = 1;
  }
  else {
    if (param_3 == 2) {
      param_4 = param_4 & 0xffffffff;
      piVar2 = aiStack_40;
    }
    else {
      aiStack_40[0] = param_3;
      param_5 = (int)param_4;
      uVar3 = func_0x04151930(PTR_DAT_09edb230);
      uVar3 = func_0x04151a9c(uVar3,aiStack_40);
      uVar4 = func_0x04151930(PTR_DAT_09f7f9a0);
      uVar3 = func_0x084656c4(uVar4,uVar3,0);
      func_0x04151930(PTR_DAT_09eadfb8);
      uVar4 = func_0x04151ba8();
      param_4 = 0;
      func_0x085befc4(uVar4,uVar3,0);
      uVar3 = func_0x04151930(
                             PTR_Method_WithNetwork_MasteryStatusCalculator_CalculateStatus___09f7fab8
                             );
      auVar7 = func_0x04151a84(uVar4,uVar3);
      param_2 = auVar7._8_8_;
      param_1 = auVar7._0_8_;
      piVar2 = (int *)extraout_x8;
    }
    puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if ((bRam000000000a46e201 & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88,param_2);
      bRam000000000a46e201 = 1;
    }
    auVar7 = func_0x09852824(param_1,param_4 & 0xffffffff,param_2 & 0xffffffff);
    lVar5 = *(long *)puVar1;
    if (*(int *)(lVar5 + 0xe0) == 0) {
      func_0x04151a94();
      lVar5 = *(long *)puVar1;
    }
    auVar7 = func_0x09774360(auVar7._0_8_,auVar7._8_8_,
                             *(undefined8 *)(*(long *)(lVar5 + 0xb8) + 0x10),
                             *(undefined8 *)(*(long *)(lVar5 + 0xb8) + 0x18),0);
    *(undefined8 *)((long)piVar2 + 8) = 0;
    *(undefined8 *)piVar2 = 0;
    *(undefined8 *)((long)piVar2 + 0x18) = 0;
    *(undefined8 *)((long)piVar2 + 0x10) = 0;
    uVar6 = 2;
  }
  *piVar2 = param_5;
  *(undefined4 *)((long)piVar2 + 4) = uVar6;
  *(undefined1 (*) [16])((long)piVar2 + 8) = auVar7;
  *(undefined1 *)((long)piVar2 + 0x18) = 1;
  return;
}


```

## MasteryStatusCalculator.CalculatePercentStatus(DataTableContainer tableContainer, StatusType statusType, MasteryGroupType masteryGroupType, int id)

```c

void WithNetwork_MasteryStatusCalculator__CalculatePercentStatus
               (undefined8 *param_1,undefined8 param_2,undefined4 param_3,undefined4 param_4,
               undefined4 param_5)

{
  undefined *puVar1;
  long lVar2;
  undefined1 auVar3 [16];
  
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a46e201 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46e201 = 1;
  }
  auVar3 = func_0x09852824(param_2,param_4,param_3);
  lVar2 = *(long *)puVar1;
  if (*(int *)(lVar2 + 0xe0) == 0) {
    func_0x04151a94();
    lVar2 = *(long *)puVar1;
  }
  auVar3 = func_0x09774360(auVar3._0_8_,auVar3._8_8_,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x10)
                           ,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x18),0);
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_5;
  *(undefined4 *)((long)param_1 + 4) = 2;
  *(undefined1 (*) [16])(param_1 + 1) = auVar3;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## MasteryStatusCalculator.CalculateConstantStatus(DataTableContainer tableContainer, StatusType statusType, MasteryGroupType masteryGroupType, int id)

```c

void WithNetwork_MasteryStatusCalculator__CalculateConstantStatus
               (undefined8 *param_1,undefined8 param_2,undefined4 param_3,undefined4 param_4,
               undefined4 param_5)

{
  undefined1 auVar1 [16];
  
  auVar1 = func_0x09852824(param_2,param_4,param_3);
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_5;
  *(undefined4 *)((long)param_1 + 4) = 1;
  *(undefined1 (*) [16])(param_1 + 1) = auVar1;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## StudyStatusCalculator.CalculateStatus(DataTableContainer tableContainer, StatusType statusType, HuntBaseStatusCalculateType calculateType, int id)

```c

/* WARNING: Possible PIC construction at 0x09852b38: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09852b68: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x09852b3c) */
/* WARNING: Removing unreachable block (ram,0x09852b6c) */

void WithNetwork_StudyStatusCalculator__CalculateStatus
               (undefined8 param_1,undefined8 param_2,int param_3,undefined4 param_4)

{
  undefined *puVar1;
  int *piVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  undefined4 uVar6;
  undefined8 *extraout_x8;
  undefined1 auVar7 [16];
  int aiStack_40 [8];
  
  auVar7._8_8_ = param_2;
  auVar7._0_8_ = param_1;
  piVar2 = aiStack_40;
  if (param_3 == 1) {
    auVar7 = func_0x09852cf8();
    uVar6 = 1;
  }
  else {
    piVar2 = aiStack_40;
    if (param_3 != 2) {
      aiStack_40[0] = param_3;
      uVar3 = func_0x04151930(PTR_DAT_09edb230);
      uVar3 = func_0x04151a9c(uVar3,aiStack_40);
      uVar4 = func_0x04151930(PTR_DAT_09f7f9a0);
      uVar3 = func_0x084656c4(uVar4,uVar3,0);
      func_0x04151930(PTR_DAT_09eadfb8);
      uVar4 = func_0x04151ba8();
      param_4 = 0;
      func_0x085befc4(uVar4,uVar3);
      uVar3 = func_0x04151930(
                             PTR_Method_WithNetwork_StudyStatusCalculator_CalculateStatus___09f7fac8
                             );
      auVar7 = func_0x04151a84(uVar4,uVar3);
      piVar2 = (int *)extraout_x8;
    }
    puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if ((bRam000000000a46e203 & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      bRam000000000a46e203 = 1;
    }
    auVar7 = func_0x09852cf8(auVar7._0_8_,auVar7._8_8_ & 0xffffffff);
    lVar5 = *(long *)puVar1;
    if (*(int *)(lVar5 + 0xe0) == 0) {
      func_0x04151a94();
      lVar5 = *(long *)puVar1;
    }
    auVar7 = func_0x09774360(auVar7._0_8_,auVar7._8_8_,
                             *(undefined8 *)(*(long *)(lVar5 + 0xb8) + 0x10),
                             *(undefined8 *)(*(long *)(lVar5 + 0xb8) + 0x18),0);
    *(undefined8 *)((long)piVar2 + 8) = 0;
    *(undefined8 *)piVar2 = 0;
    *(undefined8 *)((long)piVar2 + 0x18) = 0;
    *(undefined8 *)((long)piVar2 + 0x10) = 0;
    uVar6 = 2;
  }
  *piVar2 = param_4;
  *(undefined4 *)((long)piVar2 + 4) = uVar6;
  *(undefined1 (*) [16])((long)piVar2 + 8) = auVar7;
  *(undefined1 *)((long)piVar2 + 0x18) = 1;
  return;
}


```

## StudyStatusCalculator.CalculatePercentStatus(DataTableContainer tableContainer, StatusType statusType, int id)

```c

void WithNetwork_StudyStatusCalculator__CalculatePercentStatus
               (undefined8 *param_1,undefined8 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined *puVar1;
  long lVar2;
  undefined1 auVar3 [16];
  
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a46e203 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46e203 = 1;
  }
  auVar3 = func_0x09852cf8(param_2,param_3);
  lVar2 = *(long *)puVar1;
  if (*(int *)(lVar2 + 0xe0) == 0) {
    func_0x04151a94();
    lVar2 = *(long *)puVar1;
  }
  auVar3 = func_0x09774360(auVar3._0_8_,auVar3._8_8_,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x10)
                           ,*(undefined8 *)(*(long *)(lVar2 + 0xb8) + 0x18),0);
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_4;
  *(undefined4 *)((long)param_1 + 4) = 2;
  *(undefined1 (*) [16])(param_1 + 1) = auVar3;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## StudyStatusCalculator.CalculateConstantStatus(DataTableContainer tableContainer, StatusType statusType, int id)

```c

void WithNetwork_StudyStatusCalculator__CalculateConstantStatus
               (undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4)

{
  undefined1 auVar1 [16];
  
  auVar1 = func_0x09852cf8();
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)param_1 = param_4;
  *(undefined4 *)((long)param_1 + 4) = 1;
  *(undefined1 (*) [16])(param_1 + 1) = auVar1;
  *(undefined1 *)(param_1 + 3) = 1;
  return;
}


```

## TreasureStatusCalculator.CalculateStatus(DataTableContainer dataTableContainer, BaseStatusEvaluateConditionEvaluateDelegate evaluateDelegate, StatusType statusTy)

```c

void WithNetwork_TreasureStatusCalculator__CalculateStatus(undefined8 *param_1)

{
  undefined8 uStack_30;
  undefined8 uStack_28;
  undefined8 uStack_20;
  undefined8 uStack_18;
  
  func_0x09852ff4(&uStack_30);
  param_1[1] = uStack_28;
  *param_1 = uStack_30;
  param_1[3] = uStack_18;
  param_1[2] = uStack_20;
  return;
}


```

## TreasureStatusCalculator.CalculateStatus(DataTableContainer dataTableContainer, BaseStatusEvaluateConditionEvaluateDelegate evaluateDelegate, StatusType statusTy)

```c

/* WARNING: Possible PIC construction at 0x09853024: Changing call to branch */
/* WARNING: Possible PIC construction at 0x098531a8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09853208: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0985335c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0985453c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09854708: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09854798: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0985303c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0985470c) */
/* WARNING: Removing unreachable block (ram,0x09854710) */
/* WARNING: Removing unreachable block (ram,0x09854738) */
/* WARNING: Removing unreachable block (ram,0x09854740) */
/* WARNING: Removing unreachable block (ram,0x09854768) */
/* WARNING: Removing unreachable block (ram,0x0985474c) */
/* WARNING: Removing unreachable block (ram,0x09854758) */
/* WARNING: Removing unreachable block (ram,0x09854778) */
/* WARNING: Removing unreachable block (ram,0x09854540) */
/* WARNING: Removing unreachable block (ram,0x09853360) */
/* WARNING: Removing unreachable block (ram,0x098533a8) */
/* WARNING: Removing unreachable block (ram,0x098533ac) */
/* WARNING: Removing unreachable block (ram,0x0985320c) */
/* WARNING: Removing unreachable block (ram,0x098531ac) */
/* WARNING: Removing unreachable block (ram,0x098531c0) */
/* WARNING: Removing unreachable block (ram,0x098531c8) */
/* WARNING: Removing unreachable block (ram,0x09853028) */
/* WARNING: Removing unreachable block (ram,0x09853040) */
/* WARNING: Removing unreachable block (ram,0x0985479c) */
/* WARNING: Removing unreachable block (ram,0x098547b0) */
/* WARNING: Removing unreachable block (ram,0x098547b4) */
/* WARNING: Removing unreachable block (ram,0x091d1720) */
/* WARNING: Removing unreachable block (ram,0x09853984) */
/* WARNING: Removing unreachable block (ram,0x0985398c) */

undefined1  [16]
WithNetwork_TreasureStatusCalculator__CalculateStatus
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,ulong param_4,long *param_5,
          ulong param_6,long *param_7,ulong param_8,undefined4 param_9)

{
  undefined8 uVar1;
  code *pcVar2;
  undefined8 uVar3;
  uint uVar4;
  undefined4 uVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  int *piVar13;
  undefined1 *puVar14;
  undefined1 *puVar15;
  undefined4 uVar16;
  undefined8 uVar19;
  undefined8 uVar20;
  long lVar21;
  undefined8 *puVar22;
  long *plVar23;
  long *plVar24;
  long *plVar25;
  long *plVar26;
  int iVar17;
  int iVar18;
  undefined *puVar27;
  long *plVar28;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  ulong uVar29;
  undefined8 uVar30;
  ulong uVar31;
  undefined1 *extraout_x8;
  int *piVar32;
  undefined1 *extraout_x8_00;
  int *piVar33;
  long lVar34;
  undefined8 extraout_x8_01;
  undefined *extraout_x8_02;
  undefined *puVar35;
  long *plVar36;
  long lVar37;
  ulong uVar38;
  undefined1 (*pauVar39) [16];
  long *plVar40;
  ulong uVar41;
  long *plVar42;
  undefined1 *unaff_x20;
  undefined8 unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  long *plVar43;
  long *unaff_x26;
  long *unaff_x27;
  long *unaff_x28;
  undefined8 unaff_x29;
  undefined *puVar44;
  undefined *puVar45;
  undefined *puVar46;
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined1 auVar52 [16];
  undefined1 auVar53 [16];
  undefined1 auVar54 [16];
  undefined1 auVar55 [16];
  undefined1 auVar56 [16];
  undefined1 auVar57 [16];
  undefined1 auVar58 [16];
  undefined1 auVar59 [16];
  undefined1 auVar60 [16];
  undefined1 auVar61 [16];
  undefined1 auVar62 [16];
  undefined1 auVar63 [16];
  undefined1 auVar64 [12];
  undefined1 auVar65 [16];
  char acStack_190 [224];
  undefined1 auStack_b0 [8];
  undefined4 uStack_a8;
  undefined4 uStack_a4;
  int aiStack_40 [8];
  
  auVar47._8_8_ = param_3;
  auVar47._0_8_ = param_2;
  piVar13 = aiStack_40;
  piVar32 = aiStack_40;
  piVar33 = aiStack_40;
  iVar18 = (int)param_5;
  if (iVar18 == 1) {
    param_5 = (long *)(param_6 & 0xffffffff);
    param_6 = (ulong)param_7 & 0xffffffff;
    param_7 = (long *)(param_8 & 0xffffffff);
    puVar45 = &UNK_09853040;
code_r0x09853280:
    lVar21 = auVar47._0_8_;
    puVar14 = (undefined1 *)((long)piVar13 + -0x70);
    *(undefined8 *)((long)piVar13 + -0x60) = unaff_x29;
    *(undefined **)((long)piVar13 + -0x58) = puVar45;
    *(long **)((long)piVar13 + -0x50) = unaff_x28;
    *(long **)((long)piVar13 + -0x48) = unaff_x27;
    *(long **)((long)piVar13 + -0x40) = unaff_x26;
    *(undefined8 *)((long)piVar13 + -0x38) = unaff_x25;
    *(undefined8 *)((long)piVar13 + -0x30) = unaff_x24;
    *(ulong *)((long)piVar13 + -0x28) = unaff_x23;
    *(ulong *)((long)piVar13 + -0x20) = unaff_x22;
    *(undefined8 *)((long)piVar13 + -0x18) = unaff_x21;
    *(undefined1 **)((long)piVar13 + -0x10) = unaff_x20;
    *(undefined8 *)((long)piVar13 + -8) = param_1;
    plVar40 = (long *)0xa46e000;
    puVar45 = (undefined *)((ulong)param_7 & 0xffffffff);
    unaff_x22 = param_6 & 0xffffffff;
    unaff_x23 = param_4 & 0xffffffff;
    *(int *)((long)piVar13 + -100) = (int)param_5;
    if ((bRam000000000a46e207 & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(
                     PTR_Method_WithNetwork_DataTableContainer_GetOrCreateTable_u003CLevelRangeValueGroup_u003E___09f7f990
                     );
      func_0x0415191c(PTR_DAT_09f4b430);
      func_0x0415191c(PTR_DAT_09f7fae0);
      bRam000000000a46e207 = 1;
    }
    puVar27 = 
    PTR_Method_WithNetwork_DataTableContainer_GetOrCreateTable_u003CLevelRangeValueGroup_u003E___09f7f990
    ;
    puVar44 = PTR_DAT_09f4b430;
    if (lVar21 == 0) {
      puVar44 = &
                WithNetwork_TreasureStatusCalculator__CalculateTotalTreasurePossessionEffectStatusValue
      ;
      auVar48 = func_0x04151bb8();
    }
    else {
      unaff_x28 = (long *)func_0x053c3cc0(lVar21,*(undefined8 *)PTR_DAT_09f7fae0);
      unaff_x29 = func_0x053c2424(lVar21,*(undefined8 *)puVar44);
      auVar48._8_8_ = unaff_x29;
      auVar48._0_8_ = unaff_x28;
      param_5 = (long *)func_0x053c1484(lVar21,*(undefined8 *)puVar27);
      puVar44 = &UNK_09853360;
      puVar14 = (undefined1 *)((long)piVar13 + -0x70);
      param_4 = unaff_x23;
      param_6 = unaff_x22;
      plVar40 = param_5;
      unaff_x26 = (long *)puVar27;
    }
  }
  else {
    if (iVar18 == 2) {
      param_5 = (long *)(param_6 & 0xffffffff);
      param_6 = (ulong)param_7 & 0xffffffff;
      param_7 = (long *)(param_8 & 0xffffffff);
    }
    else {
      aiStack_40[0] = iVar18;
      uVar19 = func_0x04151930(PTR_DAT_09edb230);
      uVar19 = func_0x04151a9c(uVar19,aiStack_40);
      uVar20 = func_0x04151930(PTR_DAT_09f7f9a0);
      uVar19 = func_0x084656c4(uVar20,uVar19,0);
      func_0x04151930(PTR_DAT_09eadfb8);
      uVar20 = func_0x04151ba8();
      param_4 = 0;
      func_0x085befc4(uVar20,uVar19);
      uVar19 = func_0x04151930(
                              PTR_Method_WithNetwork_TreasureStatusCalculator_CalculateStatus___09f7fad8
                              );
      auVar47 = func_0x04151a84(uVar20,uVar19);
      piVar32 = (int *)extraout_x8;
    }
    unaff_x25 = auVar47._8_8_;
    lVar21 = auVar47._0_8_;
    piVar13 = (int *)auStack_b0;
    param_1 = 0xa46e000;
    unaff_x22 = param_6 & 0xffffffff;
    unaff_x23 = param_4 & 0xffffffff;
    uStack_a8 = SUB84(param_7,0);
    uStack_a4 = SUB84(param_5,0);
    if ((bRam000000000a46e206 & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(
                     PTR_Method_WithNetwork_DataTableContainer_GetOrCreateTable_u003CLevelRangeValueGroup_u003E___09f7f990
                     );
      func_0x0415191c(PTR_DAT_09f4b430);
      func_0x0415191c(PTR_DAT_09f7fae0);
      bRam000000000a46e206 = 1;
    }
    puVar44 = 
    PTR_Method_WithNetwork_DataTableContainer_GetOrCreateTable_u003CLevelRangeValueGroup_u003E___09f7f990
    ;
    plVar40 = (long *)PTR_DAT_09f4b430;
    puVar45 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if (lVar21 == 0) {
      puVar45 = &WithNetwork_TreasureStatusCalculator__CalculateConstantStatus;
      auVar47 = func_0x04151bb8();
      unaff_x24 = 0;
      piVar33 = (int *)extraout_x8_00;
      unaff_x20 = (undefined1 *)piVar32;
      goto code_r0x09853280;
    }
    unaff_x26 = (long *)func_0x053c3cc0(lVar21,*(undefined8 *)PTR_DAT_09f7fae0);
    unaff_x27 = (long *)func_0x053c2424(lVar21,*plVar40);
    auVar48._8_8_ = unaff_x27;
    auVar48._0_8_ = unaff_x26;
    param_5 = (long *)func_0x053c1484(lVar21,*(undefined8 *)puVar44);
    puVar44 = &UNK_098531ac;
    puVar14 = auStack_b0;
    param_4 = unaff_x23;
    param_6 = unaff_x22;
    piVar33 = piVar32;
    unaff_x28 = param_5;
  }
  plVar43 = (long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  plVar36 = auVar48._8_8_;
  plVar26 = auVar48._0_8_;
  *(undefined8 *)(puVar14 + -0x60) = unaff_x29;
  *(undefined **)(puVar14 + -0x58) = puVar44;
  *(long **)(puVar14 + -0x50) = unaff_x28;
  *(long **)(puVar14 + -0x48) = unaff_x27;
  *(long **)(puVar14 + -0x40) = unaff_x26;
  *(long *)(puVar14 + -0x38) = auVar47._8_8_;
  *(long *)(puVar14 + -0x30) = auVar47._0_8_;
  *(ulong *)(puVar14 + -0x28) = unaff_x23;
  *(ulong *)(puVar14 + -0x20) = unaff_x22;
  *(undefined **)(puVar14 + -0x18) = puVar45;
  *(int **)(puVar14 + -0x10) = piVar33;
  *(long **)(puVar14 + -8) = plVar40;
  uVar41 = param_6 & 0xffffffff;
  uVar29 = param_4;
  plVar40 = param_5;
  uVar31 = param_6;
  if ((bRam000000000a46e208 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_WithNetwork_IDataTable_u003CLevelRangeValueGroup_u003E_TypeInfo_09f4b580);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09f49098);
    func_0x0415191c(PTR_DAT_09eaa288);
    func_0x0415191c(PTR_DAT_09f54820);
    func_0x0415191c(PTR_DAT_09f54828);
    func_0x0415191c(PTR_DAT_09eaa8d0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e208 = 1;
  }
  lVar21 = *plVar43;
  *(undefined8 *)(puVar14 + -0x78) = 0;
  *(undefined8 *)(puVar14 + -0x80) = 0;
  *(undefined8 *)(puVar14 + -0x68) = 0;
  *(undefined8 *)(puVar14 + -0x70) = 0;
  *(undefined8 *)(puVar14 + -0x98) = 0;
  *(undefined8 *)(puVar14 + -0xa0) = 0;
  *(undefined8 *)(puVar14 + -0x88) = 0;
  *(undefined8 *)(puVar14 + -0x90) = 0;
  *(undefined8 *)(puVar14 + -0xb8) = 0;
  *(undefined8 *)(puVar14 + -0xc0) = 0;
  *(undefined8 *)(puVar14 + -0xa8) = 0;
  *(undefined8 *)(puVar14 + -0xb0) = 0;
  *(undefined8 *)(puVar14 + -0xd8) = 0;
  *(undefined8 *)(puVar14 + -0xe0) = 0;
  *(undefined8 *)(puVar14 + -200) = 0;
  *(undefined8 *)(puVar14 + -0xd0) = 0;
  *(undefined8 *)(puVar14 + -0xe8) = 0;
  *(undefined8 *)(puVar14 + -0xf0) = 0;
  *(undefined8 *)(puVar14 + -0x100) = 0;
  *(undefined8 *)(puVar14 + -0xf8) = 0;
  if (*(int *)(lVar21 + 0xe0) == 0) {
    func_0x04151a94();
    lVar21 = *plVar43;
  }
  auVar52._8_8_ = plVar40;
  auVar52._0_8_ = uVar29;
  uVar16 = (undefined4)param_8;
  uVar19 = **(undefined8 **)(lVar21 + 0xb8);
  *(undefined8 *)(puVar14 + -0x150) = (*(undefined8 **)(lVar21 + 0xb8))[1];
  *(undefined8 *)(puVar14 + -0x148) = uVar19;
  if ((int)param_6 != 0) {
code_r0x09853518:
    auVar49._8_8_ = *(undefined8 *)(puVar14 + -0x150);
    auVar49._0_8_ = *(undefined8 *)(puVar14 + -0x148);
    return auVar49;
  }
  puVar45 = (undefined *)0xa46e000;
  if (plVar26 != (long *)0x0) {
    lVar21 = *plVar26;
    uVar38 = (ulong)*(ushort *)(lVar21 + 0x12e);
    if (uVar38 != 0) {
      piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
      do {
        if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09f49098) {
          puVar22 = (undefined8 *)(lVar21 + (long)(*piVar33 + 7) * 0x10 + 0x138);
          goto code_r0x09853598;
        }
        uVar38 = uVar38 - 1;
        piVar33 = piVar33 + 4;
      } while (uVar38 != 0);
    }
    uVar29 = 7;
    puVar22 = (undefined8 *)func_0x041cb4c4(plVar26);
code_r0x09853598:
    plVar23 = (long *)(*(code *)*puVar22)(plVar26,puVar22[1]);
    puVar44 = PTR_DAT_09f54828;
    plVar24 = (long *)PTR_DAT_09f470e0;
    plVar25 = (long *)PTR_DAT_09ec4a50;
    plVar28 = (long *)PTR_DAT_09eaa8d0;
    auVar52._8_8_ = plVar40;
    auVar52._0_8_ = uVar29;
    uVar16 = (undefined4)param_8;
    if (plVar23 != (long *)0x0) {
      uVar29 = plVar23[3];
      if (0 < (int)uVar29) {
        *(long **)(puVar14 + -0x158) = param_5;
        plVar43 = (long *)0x0;
        plVar40 = (long *)(uVar29 & 0xffffffff);
        *(long **)(puVar14 + -0x170) = plVar23;
        do {
          uVar19 = auVar52._8_8_;
          auVar51._8_8_ = unaff_x28;
          auVar51._0_8_ = unaff_x29;
          uVar16 = (undefined4)param_8;
          puVar45 = puVar44;
          param_5 = plVar24;
          plVar26 = plVar23;
          unaff_x26 = plVar25;
          unaff_x27 = plVar28;
          if (plVar40 <= plVar43) {
            func_0x04151bc0();
            goto code_r0x09853a44;
          }
          uVar20 = 0x60;
          func_0x098f6f40(puVar14 + -0xc0,plVar23 + (long)plVar43 * 0xc + 4);
          auVar52._8_8_ = uVar19;
          auVar52._0_8_ = uVar20;
          uVar16 = (undefined4)param_8;
          if (puVar14[-0x70] == '\0') {
            uVar19 = *(undefined8 *)(puVar14 + -0x150);
            uVar20 = *(undefined8 *)(puVar14 + -0x148);
          }
          else {
            plVar40 = *(long **)(puVar14 + -0x98);
            auVar50._8_8_ = plVar23;
            auVar50._0_8_ = plVar40;
            uVar41 = 0;
            if (plVar40 == (long *)0x0) goto code_r0x09853a44;
            lVar21 = *plVar40;
            *(undefined4 *)(puVar14 + -0x164) = *(undefined4 *)(puVar14 + -0x88);
            uVar41 = (ulong)*(ushort *)(lVar21 + 0x12e);
            *(long **)(puVar14 + -0x160) = plVar43;
            if (uVar41 != 0) {
              piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
              do {
                if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09f54820) {
                  puVar22 = (undefined8 *)(lVar21 + (long)*piVar33 * 0x10 + 0x138);
                  goto code_r0x09853680;
                }
                uVar41 = uVar41 - 1;
                piVar33 = piVar33 + 4;
              } while (uVar41 != 0);
            }
            uVar20 = 0;
            puVar22 = (undefined8 *)func_0x041cb4c4(plVar40);
code_r0x09853680:
            plVar43 = (long *)(*(code *)*puVar22)(plVar40,puVar22[1]);
            auVar52._8_8_ = uVar19;
            auVar52._0_8_ = uVar20;
            *(undefined8 *)(puVar14 + -0x140) = *(undefined8 *)(puVar14 + -0x148);
            *(undefined8 *)(puVar14 + -0x138) = *(undefined8 *)(puVar14 + -0x150);
code_r0x0985369c:
            uVar19 = auVar52._8_8_;
            unaff_x28 = auVar51._8_8_;
            plVar40 = auVar51._0_8_;
            plVar26 = auVar50._8_8_;
            uVar41 = auVar50._0_8_;
            uVar16 = (undefined4)param_8;
            if (plVar43 == (long *)0x0) {
              unaff_x28 = (long *)func_0x04151bb8();
              goto code_r0x09853a5c;
            }
            lVar21 = *plVar43;
            uVar29 = (ulong)*(ushort *)(lVar21 + 0x12e);
            if (uVar29 != 0) {
              piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
              do {
                if (*(long *)(piVar33 + -2) == *plVar28) {
                  puVar22 = (undefined8 *)(lVar21 + (long)*piVar33 * 0x10 + 0x138);
                  goto code_r0x098536ec;
                }
                uVar29 = uVar29 - 1;
                piVar33 = piVar33 + 4;
              } while (uVar29 != 0);
            }
            uVar20 = 0;
            puVar22 = (undefined8 *)func_0x041cb4c4(plVar43);
            auVar52._8_8_ = uVar19;
            auVar52._0_8_ = uVar20;
code_r0x098536ec:
            uVar29 = (*(code *)*puVar22)(plVar43,puVar22[1]);
            uVar19 = auVar52._8_8_;
            if ((uVar29 & 1) != 0) {
              lVar21 = *plVar43;
              uVar29 = (ulong)*(ushort *)(lVar21 + 0x12e);
              if (uVar29 != 0) {
                piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar33 + -2) == *(long *)puVar44) {
                    puVar22 = (undefined8 *)(lVar21 + (long)*piVar33 * 0x10 + 0x138);
                    goto code_r0x09853748;
                  }
                  uVar29 = uVar29 - 1;
                  piVar33 = piVar33 + 4;
                } while (uVar29 != 0);
              }
              uVar20 = 0;
              puVar22 = (undefined8 *)func_0x041cb4c4(plVar43);
              auVar52._8_8_ = uVar19;
              auVar52._0_8_ = uVar20;
code_r0x09853748:
              plVar40 = (long *)(*(code *)*puVar22)(plVar43,puVar22[1]);
              uVar19 = auVar52._8_8_;
              auVar51._8_8_ = unaff_x28;
              auVar51._0_8_ = plVar40;
              uVar16 = (undefined4)param_8;
              if (plVar40 == (long *)0x0) {
                unaff_x28 = (long *)func_0x04151bb8();
                goto code_r0x09853a5c;
              }
              if (plVar36 == (long *)0x0) {
                unaff_x28 = (long *)func_0x04151bb8();
                goto code_r0x09853a5c;
              }
              lVar21 = *plVar36;
              uVar41 = CONCAT44(0,*(uint *)(plVar40 + 4));
              auVar50._8_8_ = plVar26;
              auVar50._0_8_ = uVar41;
              uVar29 = (ulong)*(ushort *)(lVar21 + 0x12e);
              if (uVar29 != 0) {
                piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar33 + -2) == *plVar24) {
                    puVar22 = (undefined8 *)(lVar21 + (long)(*piVar33 + 6) * 0x10 + 0x138);
                    goto code_r0x098537b4;
                  }
                  uVar29 = uVar29 - 1;
                  piVar33 = piVar33 + 4;
                } while (uVar29 != 0);
              }
              puVar22 = (undefined8 *)func_0x041cb4c4(plVar36,*plVar24,6);
code_r0x098537b4:
              uVar20 = puVar22[1];
              (*(code *)*puVar22)(puVar14 + -0x130,plVar36,uVar41);
              lVar21 = *plVar25;
              *(undefined8 *)(puVar14 + -0xe8) = *(undefined8 *)(puVar14 + -0x128);
              *(undefined8 *)(puVar14 + -0xf0) = *(undefined8 *)(puVar14 + -0x130);
              *(undefined8 *)(puVar14 + -0xd8) = *(undefined8 *)(puVar14 + -0x118);
              *(undefined8 *)(puVar14 + -0xe0) = *(undefined8 *)(puVar14 + -0x120);
              *(undefined8 *)(puVar14 + -200) = *(undefined8 *)(puVar14 + -0x108);
              *(undefined8 *)(puVar14 + -0xd0) = *(undefined8 *)(puVar14 + -0x110);
              if (*(int *)(lVar21 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar52._8_8_ = uVar19;
              auVar52._0_8_ = uVar20;
              if (*(int *)(puVar14 + -0xd8) == (int)param_4) {
                if (*(int *)(*plVar25 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                uVar20 = 0;
                auVar50 = func_0x091dc794(puVar14 + -0xf0,*(undefined4 *)(puVar14 + -0x164));
                uVar16 = (undefined4)param_8;
                if (*(long **)(puVar14 + -0x158) == (long *)0x0) {
                  unaff_x28 = (long *)func_0x04151bb8();
                  auVar52._8_8_ = uVar19;
                  auVar52._0_8_ = uVar20;
                  goto code_r0x09853a5c;
                }
                lVar21 = **(long **)(puVar14 + -0x158);
                uVar16 = *(undefined4 *)((long)plVar40 + 0x24);
                uVar41 = (ulong)*(ushort *)(lVar21 + 0x12e);
                if (uVar41 != 0) {
                  piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
                  do {
                    if (*(long *)(piVar33 + -2) ==
                        *(long *)
                         PTR_WithNetwork_IDataTable_u003CLevelRangeValueGroup_u003E_TypeInfo_09f4b580
                       ) {
                      puVar22 = (undefined8 *)(lVar21 + (long)(*piVar33 + 6) * 0x10 + 0x138);
                      goto code_r0x09853880;
                    }
                    uVar41 = uVar41 - 1;
                    piVar33 = piVar33 + 4;
                  } while (uVar41 != 0);
                }
                puVar22 = (undefined8 *)
                          func_0x041cb4c4(*(undefined8 *)(puVar14 + -0x158),
                                          *(long *)
                                           PTR_WithNetwork_IDataTable_u003CLevelRangeValueGroup_u003E_TypeInfo_09f4b580
                                          ,6);
code_r0x09853880:
                auVar47 = (*(code *)*puVar22)(*(undefined8 *)(puVar14 + -0x158),uVar16,puVar22[1]);
                *(undefined1 (*) [16])(puVar14 + -0x100) = auVar47;
                uVar16 = func_0x091ce808(puVar14 + -0xc0,0);
                auVar51 = func_0x091d4b70(puVar14 + -0x100,uVar16,0);
                if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar52 = func_0x097744cc(auVar50._0_8_,auVar50._8_8_,auVar51._0_8_,auVar51._8_8_,0)
                ;
                uVar31 = 0;
                auVar47 = func_0x09774360(*(undefined8 *)(puVar14 + -0x140),
                                          *(undefined8 *)(puVar14 + -0x138));
                *(undefined1 (*) [16])(puVar14 + -0x140) = auVar47;
              }
              goto code_r0x0985369c;
            }
            unaff_x29 = 0;
            uVar41 = 5;
            if (plVar43 != (long *)0x0) {
              lVar21 = *plVar43;
              uVar29 = (ulong)*(ushort *)(lVar21 + 0x12e);
              if (uVar29 != 0) {
                piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09eaa288) {
                    puVar22 = (undefined8 *)(lVar21 + (long)*piVar33 * 0x10 + 0x138);
                    goto code_r0x09853964;
                  }
                  uVar29 = uVar29 - 1;
                  piVar33 = piVar33 + 4;
                } while (uVar29 != 0);
              }
              uVar20 = 0;
              puVar22 = (undefined8 *)func_0x041cb4c4(plVar43);
              auVar52._8_8_ = uVar19;
              auVar52._0_8_ = uVar20;
code_r0x09853964:
              (*(code *)*puVar22)(plVar43,puVar22[1]);
            }
            plVar23 = *(long **)(puVar14 + -0x170);
            plVar43 = *(long **)(puVar14 + -0x160);
            uVar20 = *(undefined8 *)(puVar14 + -0x140);
            uVar19 = *(undefined8 *)(puVar14 + -0x138);
          }
          uVar4 = *(uint *)(plVar23 + 3);
          plVar40 = (long *)(ulong)uVar4;
          plVar43 = (long *)((long)plVar43 + 1);
          *(undefined8 *)(puVar14 + -0x150) = uVar19;
          *(undefined8 *)(puVar14 + -0x148) = uVar20;
        } while ((long)plVar43 < (long)(int)uVar4);
      }
      goto code_r0x09853518;
    }
  }
code_r0x09853a44:
  func_0x04151bb8();
  func_0x04151bb0(unaff_x29);
  plVar40 = (long *)0x0;
  puVar44 = puVar45;
  plVar24 = param_5;
  plVar25 = unaff_x26;
  plVar28 = unaff_x27;
code_r0x09853a5c:
  uVar19 = auVar52._8_8_;
  if (plVar43 != (long *)0x0) {
    lVar21 = *plVar43;
    uVar29 = (ulong)*(ushort *)(lVar21 + 0x12e);
    if (uVar29 != 0) {
      piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
      do {
        if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09eaa288) {
          puVar22 = (undefined8 *)(lVar21 + (long)*piVar33 * 0x10 + 0x138);
          goto code_r0x09853ab4;
        }
        uVar29 = uVar29 - 1;
        piVar33 = piVar33 + 4;
      } while (uVar29 != 0);
    }
    uVar20 = 0;
    puVar22 = (undefined8 *)func_0x041cb4c4(plVar43);
    auVar52._8_8_ = uVar19;
    auVar52._0_8_ = uVar20;
code_r0x09853ab4:
    (*(code *)*puVar22)(plVar43,puVar22[1]);
  }
  if (plVar40 == (long *)0x0) {
    func_0x04247ab0(unaff_x28);
  }
  func_0x04151bb0(plVar40);
  auVar53 = func_0x03bf6574();
  puVar45 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  *(long **)(puVar14 + -0x1e0) = plVar40;
  *(undefined **)(puVar14 + -0x1d8) =
       &WithNetwork_TreasureStatusCalculator__CalculateTotalTreasureEquipmentEffectStatusValue;
  *(long **)(puVar14 + -0x1d0) = unaff_x28;
  *(long **)(puVar14 + -0x1c8) = plVar28;
  *(long **)(puVar14 + -0x1c0) = plVar25;
  *(long **)(puVar14 + -0x1b8) = plVar43;
  *(long **)(puVar14 + -0x1b0) = plVar26;
  *(long **)(puVar14 + -0x1a8) = plVar24;
  *(undefined **)(puVar14 + -0x1a0) = puVar44;
  *(long **)(puVar14 + -0x198) = plVar36;
  *(ulong *)(puVar14 + -400) = param_4 & 0xffffffff;
  *(ulong *)(puVar14 + -0x188) = uVar41;
  *(undefined4 *)(puVar14 + -0x3cc) = param_9;
  *(undefined4 *)(puVar14 + -0x388) = uVar16;
  *(int *)(puVar14 + -900) = auVar52._8_4_;
  *(long *)(puVar14 + -0x3d8) = auVar52._0_8_;
  if ((bRam000000000a46e209 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09eca930);
    func_0x0415191c(PTR_DAT_09f7e928);
    func_0x0415191c(PTR_DAT_09f7f928);
    func_0x0415191c(PTR_DAT_09f7fae8);
    func_0x0415191c(PTR_WithNetwork_IDataTable_u003CLevelRangeValueGroup_u003E_TypeInfo_09f4b580);
    func_0x0415191c(PTR_DAT_09f7faf0);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09f49098);
    func_0x0415191c(PTR_DAT_09f473c8);
    func_0x0415191c(PTR_DAT_09f462e0);
    func_0x0415191c(PTR_DAT_09eaa288);
    func_0x0415191c(PTR_DAT_09f54788);
    func_0x0415191c(PTR_DAT_09f54790);
    func_0x0415191c(PTR_DAT_09eaa8d0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e209 = 1;
  }
  lVar21 = *(long *)puVar45;
  *(undefined8 *)(puVar14 + -0x250) = 0;
  *(undefined8 *)(puVar14 + -0x248) = 0;
  *(undefined8 *)(puVar14 + -0x1f8) = 0;
  *(undefined8 *)(puVar14 + -0x200) = 0;
  *(undefined8 *)(puVar14 + -0x1e8) = 0;
  *(undefined8 *)(puVar14 + -0x1f0) = 0;
  *(undefined8 *)(puVar14 + -0x218) = 0;
  *(undefined8 *)(puVar14 + -0x220) = 0;
  *(undefined8 *)(puVar14 + -0x208) = 0;
  *(undefined8 *)(puVar14 + -0x210) = 0;
  *(undefined8 *)(puVar14 + -0x238) = 0;
  *(undefined8 *)(puVar14 + -0x240) = 0;
  *(undefined8 *)(puVar14 + -0x228) = 0;
  *(undefined8 *)(puVar14 + -0x230) = 0;
  *(undefined8 *)(puVar14 + -0x268) = 0;
  *(undefined8 *)(puVar14 + -0x270) = 0;
  *(undefined8 *)(puVar14 + -600) = 0;
  *(undefined8 *)(puVar14 + -0x260) = 0;
  *(undefined8 *)(puVar14 + -0x288) = 0;
  *(undefined8 *)(puVar14 + -0x290) = 0;
  *(undefined8 *)(puVar14 + -0x278) = 0;
  *(undefined8 *)(puVar14 + -0x280) = 0;
  *(undefined8 *)(puVar14 + -0x2a8) = 0;
  *(undefined8 *)(puVar14 + -0x2b0) = 0;
  *(undefined8 *)(puVar14 + -0x298) = 0;
  *(undefined8 *)(puVar14 + -0x2a0) = 0;
  *(undefined8 *)(puVar14 + -0x2d0) = 0;
  *(undefined8 *)(puVar14 + -0x2c8) = 0;
  *(undefined8 *)(puVar14 + -0x2c0) = 0;
  if (*(int *)(lVar21 + 0xe0) == 0) {
    func_0x04151a94();
    lVar21 = *(long *)puVar45;
  }
  puVar27 = PTR_DAT_09f7f928;
  puVar44 = PTR_DAT_09f7e928;
  uVar41 = auVar52._8_8_;
  iVar18 = auVar52._0_4_;
  puVar35 = (undefined *)0xa46e000;
  if (uVar31 != 0) {
    plVar40 = (long *)**(undefined8 **)(lVar21 + 0xb8);
    uVar19 = *(undefined8 *)PTR_DAT_09f7fae8;
    *(undefined8 *)(puVar14 + -0x398) = (*(undefined8 **)(lVar21 + 0xb8))[1];
    plVar24 = (long *)func_0x053bf800(uVar31,uVar19);
    plVar25 = (long *)func_0x053bf1c0(uVar31,*(undefined8 *)puVar27);
    plVar26 = (long *)func_0x053beb1c(uVar31,*(undefined8 *)puVar44);
    uVar41 = auVar52._8_8_;
    iVar18 = auVar52._0_4_;
    puVar35 = puVar27;
    puVar45 = puVar44;
    if (plVar24 != (long *)0x0) {
      lVar21 = *plVar24;
      uVar29 = (ulong)*(ushort *)(lVar21 + 0x12e);
      if (uVar29 != 0) {
        piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
        do {
          if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09f7faf0) {
            puVar22 = (undefined8 *)(lVar21 + (long)(*piVar33 + 7) * 0x10 + 0x138);
            goto code_r0x09853cdc;
          }
          uVar29 = uVar29 - 1;
          piVar33 = piVar33 + 4;
        } while (uVar29 != 0);
      }
      uVar19 = 7;
      puVar22 = (undefined8 *)func_0x041cb4c4(plVar24);
      auVar52._8_8_ = uVar41;
      auVar52._0_8_ = uVar19;
code_r0x09853cdc:
      lVar21 = (*(code *)*puVar22)(plVar24,puVar22[1]);
      plVar36 = (long *)PTR_DAT_09f54790;
      puVar27 = PTR_WithNetwork_IDataTable_u003CLevelRangeValueGroup_u003E_TypeInfo_09f4b580;
      puVar44 = PTR_DAT_09eaa8d0;
      uVar41 = auVar52._8_8_;
      iVar18 = auVar52._0_4_;
      plVar28 = plVar26;
      if (lVar21 != 0) {
        uVar41 = *(ulong *)(lVar21 + 0x18);
        if ((int)uVar41 < 1) {
          uVar19 = *(undefined8 *)(puVar14 + -0x398);
        }
        else {
          *(long *)(puVar14 + -0x390) = auVar53._0_8_;
          plVar24 = (long *)0x0;
          plVar43 = (long *)(uVar41 & 0xffffffff);
          *(long *)(puVar14 + -0x3c8) = lVar21;
          *(long *)(puVar14 + -0x3c0) = auVar53._8_8_;
          do {
            uVar41 = auVar52._8_8_;
            plVar23 = auVar53._8_8_;
            uVar29 = auVar53._0_8_;
            iVar18 = auVar52._0_4_;
            if (plVar43 <= plVar24) goto code_r0x09854488;
            uVar4 = *(uint *)(lVar21 + (long)plVar24 * 0x10 + 0x28);
            uVar31 = (ulong)uVar4;
            if (uVar4 == 0) {
              uVar19 = *(undefined8 *)(puVar14 + -0x398);
            }
            else {
              puVar35 = puVar27;
              puVar45 = puVar44;
              plVar43 = plVar36;
              if (plVar23 == (long *)0x0) goto code_r0x09854484;
              lVar21 = *plVar23;
              uVar31 = (ulong)*(ushort *)(lVar21 + 0x12e);
              if (uVar31 != 0) {
                piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09f49098) {
                    puVar22 = (undefined8 *)(lVar21 + (long)(*piVar33 + 6) * 0x10 + 0x138);
                    goto code_r0x09853d9c;
                  }
                  uVar31 = uVar31 - 1;
                  piVar33 = piVar33 + 4;
                } while (uVar31 != 0);
              }
              puVar22 = (undefined8 *)func_0x041cb4c4(plVar23,*(long *)PTR_DAT_09f49098,6);
code_r0x09853d9c:
              (*(code *)*puVar22)(puVar14 + -0x330,plVar23,uVar4,puVar22[1]);
              uVar19 = 0x60;
              func_0x098f6ee0(puVar14 + -0x240,puVar14 + -0x330);
              iVar18 = (int)uVar19;
              plVar42 = *(long **)(puVar14 + -0x210);
              auVar54._8_8_ = plVar23;
              auVar54._0_8_ = plVar42;
              uVar31 = 0;
              if (plVar42 == (long *)0x0) goto code_r0x09854484;
              lVar21 = *plVar42;
              uVar31 = (ulong)*(ushort *)(lVar21 + 0x12e);
              *(long **)(puVar14 + -0x3b8) = plVar24;
              *(long **)(puVar14 + -0x3b0) = plVar40;
              if (uVar31 != 0) {
                piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09f54788) {
                    puVar22 = (undefined8 *)(lVar21 + (long)*piVar33 * 0x10 + 0x138);
                    goto code_r0x09853e20;
                  }
                  uVar31 = uVar31 - 1;
                  piVar33 = piVar33 + 4;
                } while (uVar31 != 0);
              }
              uVar19 = 0;
              puVar22 = (undefined8 *)func_0x041cb4c4(plVar42);
code_r0x09853e20:
              plVar40 = (long *)(*(code *)*puVar22)(plVar42,puVar22[1]);
              auVar52._8_8_ = uVar41;
              auVar52._0_8_ = uVar19;
              iVar18 = (int)uVar19;
              *(undefined8 *)(puVar14 + -0x3a8) = *(undefined8 *)(puVar14 + -0x398);
              *(undefined8 *)(puVar14 + -0x3a0) = *(undefined8 *)(puVar14 + -0x3b0);
              if (plVar40 == (long *)0x0) {
                uVar31 = func_0x04151bb8();
                goto code_r0x098544a0;
              }
code_r0x09853e40:
              uVar19 = auVar52._8_8_;
              auVar53._8_8_ = auVar54._8_8_;
              auVar53._0_8_ = uVar29;
              auVar10._8_8_ = auVar54._8_8_;
              auVar10._0_8_ = uVar29;
              uVar31 = auVar54._0_8_;
              lVar21 = *plVar40;
              uVar41 = (ulong)*(ushort *)(lVar21 + 0x12e);
              if (uVar41 != 0) {
                piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar33 + -2) == *(long *)puVar44) {
                    puVar22 = (undefined8 *)(lVar21 + (long)*piVar33 * 0x10 + 0x138);
                    goto code_r0x09853e8c;
                  }
                  uVar41 = uVar41 - 1;
                  piVar33 = piVar33 + 4;
                } while (uVar41 != 0);
              }
              uVar20 = 0;
              puVar22 = (undefined8 *)func_0x041cb4c4(plVar40);
              auVar52._8_8_ = uVar19;
              auVar52._0_8_ = uVar20;
code_r0x09853e8c:
              uVar29 = (*(code *)*puVar22)(plVar40,puVar22[1]);
              uVar41 = auVar52._8_8_;
              iVar18 = auVar52._0_4_;
              if ((uVar29 & 1) != 0) {
                lVar21 = *plVar40;
                uVar31 = (ulong)*(ushort *)(lVar21 + 0x12e);
                if (uVar31 != 0) {
                  piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
                  do {
                    if (*(long *)(piVar33 + -2) == *plVar36) {
                      puVar22 = (undefined8 *)(lVar21 + (long)*piVar33 * 0x10 + 0x138);
                      goto code_r0x09853ee8;
                    }
                    uVar31 = uVar31 - 1;
                    piVar33 = piVar33 + 4;
                  } while (uVar31 != 0);
                }
                iVar18 = 0;
                puVar22 = (undefined8 *)func_0x041cb4c4(plVar40);
code_r0x09853ee8:
                plVar24 = (long *)(*(code *)*puVar22)(plVar40,puVar22[1]);
                if (plVar24 == (long *)0x0) {
                  uVar31 = func_0x04151bb8();
                  goto code_r0x098544a0;
                }
                if (param_7 == (long *)0x0) {
                  uVar31 = func_0x04151bb8();
                  auVar53 = auVar10;
                  goto code_r0x098544a0;
                }
                lVar34 = *param_7;
                uVar29 = CONCAT44(0,*(uint *)(puVar14 + -0x208));
                lVar21 = plVar24[5];
                uVar31 = (ulong)*(ushort *)(lVar34 + 0x12e);
                if (uVar31 != 0) {
                  piVar33 = (int *)(*(long *)(lVar34 + 0xb0) + 8);
                  do {
                    if (*(long *)(piVar33 + -2) == *(long *)puVar27) {
                      puVar22 = (undefined8 *)(lVar34 + (long)(*piVar33 + 6) * 0x10 + 0x138);
                      goto code_r0x09853f58;
                    }
                    uVar31 = uVar31 - 1;
                    piVar33 = piVar33 + 4;
                  } while (uVar31 != 0);
                }
                puVar22 = (undefined8 *)func_0x041cb4c4(param_7,*(long *)puVar27,6);
code_r0x09853f58:
                auVar47 = (*(code *)*puVar22)(param_7,(int)lVar21,puVar22[1]);
                *(undefined1 (*) [16])(puVar14 + -0x250) = auVar47;
                uVar16 = func_0x091ce808(puVar14 + -0x240,0);
                uVar20 = 0;
                auVar54 = func_0x091d4b70(puVar14 + -0x250,uVar16);
                auVar52._8_8_ = uVar41;
                auVar52._0_8_ = uVar20;
                auVar6._8_8_ = uVar41;
                auVar6._0_8_ = uVar20;
                uVar19 = auVar54._8_8_;
                auVar53._8_8_ = uVar19;
                auVar53._0_8_ = uVar29;
                auVar9._8_8_ = uVar19;
                auVar9._0_8_ = uVar29;
                auVar8._8_8_ = uVar19;
                auVar8._0_8_ = uVar29;
                iVar18 = (int)uVar20;
                if ((int)plVar24[4] == 0) goto code_r0x09853ff0;
                auVar52 = auVar6;
                if ((int)plVar24[4] == 1) {
                  if (plVar25 == (long *)0x0) {
                    uVar31 = func_0x04151bb8();
                    auVar53 = auVar9;
                    goto code_r0x098544a0;
                  }
                  lVar21 = *plVar25;
                  plVar24 = (long *)(ulong)*(uint *)((long)plVar24 + 0x24);
                  uVar31 = (ulong)*(ushort *)(lVar21 + 0x12e);
                  if (uVar31 != 0) {
                    piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
                    do {
                      if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09f462e0) {
                        puVar22 = (undefined8 *)(lVar21 + (long)(*piVar33 + 6) * 0x10 + 0x138);
                        goto code_r0x0985405c;
                      }
                      uVar31 = uVar31 - 1;
                      piVar33 = piVar33 + 4;
                    } while (uVar31 != 0);
                  }
                  puVar22 = (undefined8 *)func_0x041cb4c4(plVar25,*(long *)PTR_DAT_09f462e0,6);
code_r0x0985405c:
                  uVar20 = puVar22[1];
                  (*(code *)*puVar22)(puVar14 + -0x330,plVar25,plVar24);
                  *(undefined8 *)(puVar14 + -0x2c0) = 0;
                  *(undefined8 *)(puVar14 + -0x2d0) = 0;
                  *(undefined8 *)(puVar14 + -0x2c8) = 0;
                  *(undefined8 *)(puVar14 + -0x2a8) = *(undefined8 *)(puVar14 + -0x328);
                  *(undefined8 *)(puVar14 + -0x2b0) = *(undefined8 *)(puVar14 + -0x330);
                  *(undefined8 *)(puVar14 + -0x298) = *(undefined8 *)(puVar14 + -0x318);
                  *(undefined8 *)(puVar14 + -0x2a0) = *(undefined8 *)(puVar14 + -800);
                  *(undefined8 *)(puVar14 + -0x288) = *(undefined8 *)(puVar14 + -0x308);
                  *(undefined8 *)(puVar14 + -0x290) = *(undefined8 *)(puVar14 + -0x310);
                  if (*(int *)(*(long *)PTR_DAT_09eca930 + 0xe0) == 0) {
                    func_0x04151a94();
                  }
                  iVar17 = func_0x091b9acc(puVar14 + -0x2b0,0);
                  iVar18 = (int)uVar20;
                  if (iVar17 != 0) {
                    if (*(int *)(*(long *)PTR_DAT_09eca930 + 0xe0) == 0) {
                      func_0x04151a94();
                    }
                    uVar16 = func_0x091b9acc(puVar14 + -0x2b0,0);
                    if (plVar26 == (long *)0x0) {
                      uVar31 = func_0x04151bb8();
                      auVar53 = auVar8;
                      goto code_r0x098544a0;
                    }
                    lVar21 = *plVar26;
                    uVar31 = (ulong)*(ushort *)(lVar21 + 0x12e);
                    if (uVar31 != 0) {
                      piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
                      do {
                        if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09f473c8) {
                          puVar22 = (undefined8 *)(lVar21 + (long)(*piVar33 + 6) * 0x10 + 0x138);
                          goto code_r0x09854134;
                        }
                        uVar31 = uVar31 - 1;
                        piVar33 = piVar33 + 4;
                      } while (uVar31 != 0);
                    }
                    puVar22 = (undefined8 *)func_0x041cb4c4(plVar26,*(long *)PTR_DAT_09f473c8,6);
code_r0x09854134:
                    uVar20 = puVar22[1];
                    (*(code *)*puVar22)(puVar14 + -0x330,plVar26,uVar16);
                    *(undefined8 *)(puVar14 + -0x2c8) = *(undefined8 *)(puVar14 + -0x328);
                    *(undefined8 *)(puVar14 + -0x2d0) = *(undefined8 *)(puVar14 + -0x330);
                    *(undefined8 *)(puVar14 + -0x2c0) = *(undefined8 *)(puVar14 + -800);
                  }
                  if (*(int *)(*(long *)PTR_DAT_09eca930 + 0xe0) == 0) {
                    func_0x04151a94();
                  }
                  iVar18 = func_0x091b994c(puVar14 + -0x2b0,0);
                  auVar52._8_8_ = uVar41;
                  auVar52._0_8_ = uVar20;
                  if (iVar18 == *(int *)(puVar14 + -900)) {
                    *(undefined8 *)(puVar14 + -0x358) = *(undefined8 *)(puVar14 + -0x2a8);
                    *(undefined8 *)(puVar14 + -0x360) = *(undefined8 *)(puVar14 + -0x2b0);
                    *(undefined8 *)(puVar14 + -0x348) = *(undefined8 *)(puVar14 + -0x298);
                    *(undefined8 *)(puVar14 + -0x350) = *(undefined8 *)(puVar14 + -0x2a0);
                    *(undefined8 *)(puVar14 + -0x338) = *(undefined8 *)(puVar14 + -0x288);
                    *(undefined8 *)(puVar14 + -0x340) = *(undefined8 *)(puVar14 + -0x290);
                    *(undefined8 *)(puVar14 + -0x378) = *(undefined8 *)(puVar14 + -0x2c8);
                    *(undefined8 *)(puVar14 + -0x380) = *(undefined8 *)(puVar14 + -0x2d0);
                    *(undefined8 *)(puVar14 + -0x370) = *(undefined8 *)(puVar14 + -0x2c0);
                    auVar47 = func_0x098801d4(uVar29,puVar14 + -0x360,puVar14 + -0x380,
                                              *(undefined8 *)(puVar14 + -0x3d8),
                                              *(undefined4 *)(puVar14 + -0x388),
                                              *(undefined4 *)(puVar14 + -0x3cc),0);
                    uVar29 = auVar47._8_8_;
                    if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) ==
                        0) {
                      func_0x04151a94();
                    }
                    auVar52 = func_0x097744cc(auVar47._0_8_,uVar29,auVar54._0_8_,uVar19,0);
                    auVar47 = func_0x09774360(*(undefined8 *)(puVar14 + -0x3a0),
                                              *(undefined8 *)(puVar14 + -0x3a8),auVar52._0_8_,
                                              auVar52._8_8_,0);
                    goto code_r0x098542e8;
                  }
                }
                goto code_r0x09853e40;
              }
              if (plVar40 != (long *)0x0) {
                lVar21 = *plVar40;
                uVar29 = (ulong)*(ushort *)(lVar21 + 0x12e);
                if (uVar29 != 0) {
                  piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
                  do {
                    if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09eaa288) {
                      puVar22 = (undefined8 *)(lVar21 + (long)*piVar33 * 0x10 + 0x138);
                      goto code_r0x0985434c;
                    }
                    uVar29 = uVar29 - 1;
                    piVar33 = piVar33 + 4;
                  } while (uVar29 != 0);
                }
                uVar19 = 0;
                puVar22 = (undefined8 *)func_0x041cb4c4(plVar40);
                auVar52._8_8_ = uVar41;
                auVar52._0_8_ = uVar19;
code_r0x0985434c:
                (*(code *)*puVar22)(plVar40,puVar22[1]);
              }
              lVar21 = *(long *)(puVar14 + -0x3c8);
              auVar7._8_8_ = 0;
              auVar7._0_8_ = *(ulong *)(puVar14 + -0x3c0);
              auVar53 = auVar7 << 0x40;
              plVar24 = *(long **)(puVar14 + -0x3b8);
              uVar19 = *(undefined8 *)(puVar14 + -0x3a8);
              plVar40 = *(long **)(puVar14 + -0x3a0);
            }
            uVar4 = *(uint *)(lVar21 + 0x18);
            plVar43 = (long *)(ulong)uVar4;
            plVar24 = (long *)((long)plVar24 + 1);
            *(undefined8 *)(puVar14 + -0x398) = uVar19;
          } while ((long)plVar24 < (long)(int)uVar4);
        }
        auVar55._8_8_ = uVar19;
        auVar55._0_8_ = plVar40;
        return auVar55;
      }
    }
  }
code_r0x09854484:
  plVar36 = plVar43;
  puVar44 = puVar45;
  puVar27 = puVar35;
  func_0x04151bb8();
code_r0x09854488:
  func_0x04151bc0();
  func_0x04151bb0(auVar53._0_8_);
  auVar11._8_8_ = 0;
  auVar11._0_8_ = auVar53._8_8_;
  plVar26 = plVar28;
  auVar53 = auVar11 << 0x40;
code_r0x098544a0:
  puVar45 = auVar53._8_8_;
  lVar21 = auVar53._0_8_;
  if (plVar40 != (long *)0x0) {
    lVar34 = *plVar40;
    uVar29 = (ulong)*(ushort *)(lVar34 + 0x12e);
    if (uVar29 != 0) {
      piVar33 = (int *)(*(long *)(lVar34 + 0xb0) + 8);
      do {
        if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09eaa288) {
          puVar22 = (undefined8 *)(lVar34 + (long)*piVar33 * 0x10 + 0x138);
          goto code_r0x098544f8;
        }
        uVar29 = uVar29 - 1;
        piVar33 = piVar33 + 4;
      } while (uVar29 != 0);
    }
    iVar18 = 0;
    puVar22 = (undefined8 *)func_0x041cb4c4(plVar40);
code_r0x098544f8:
    (*(code *)*puVar22)(plVar40,puVar22[1]);
  }
  if (lVar21 == 0) {
    func_0x04247ab0(uVar31);
  }
  func_0x04151bb0(lVar21);
  auVar47 = func_0x03bf6574();
  puVar35 = puVar14 + -0x420;
  *(undefined **)(puVar14 + -0x400) = &WithNetwork_WeaponStatusCalculator__CalculateStatus;
  *(undefined **)(puVar14 + -0x3f0) = puVar27;
  *(ulong *)(puVar14 + -1000) = uVar31;
  if (iVar18 == 2) {
    uVar31 = uVar41 & 0xffffffff;
    puVar46 = &UNK_09854540;
    uVar19 = extraout_x8_01;
  }
  else {
    *(int *)(puVar14 + -0x420) = iVar18;
    uVar19 = func_0x04151930(PTR_DAT_09edb230);
    uVar19 = func_0x04151a9c(uVar19,puVar14 + -0x420);
    uVar20 = func_0x04151930(PTR_DAT_09f7f9a0);
    uVar19 = func_0x084656c4(uVar20,uVar19,0);
    func_0x04151930(PTR_DAT_09eadfb8);
    puVar27 = (undefined *)func_0x04151ba8();
    uVar31 = 0;
    func_0x085befc4(puVar27,uVar19);
    uVar20 = func_0x04151930(
                            PTR_Method_WithNetwork_WeaponStatusCalculator_CalculateStatus___09f7faf8
                            );
    puVar46 = &WithNetwork_WeaponStatusCalculator__CalculatePercentStatus;
    auVar47 = func_0x04151a84(puVar27,uVar20);
    puVar35 = extraout_x8_02;
  }
  lVar34 = auVar47._0_8_;
  auVar56._8_8_ = plVar36;
  auVar56._0_8_ = lVar34;
  puVar15 = puVar14 + -0x470;
  *(undefined **)(puVar14 + -0x470) = puVar46;
  *(long **)(puVar14 + -0x468) = plVar26;
  *(long **)(puVar14 + -0x460) = plVar25;
  *(long **)(puVar14 + -0x458) = plVar36;
  *(long *)(puVar14 + -0x450) = lVar21;
  *(long **)(puVar14 + -0x448) = plVar24;
  *(undefined **)(puVar14 + -0x440) = puVar44;
  *(long **)(puVar14 + -0x438) = param_7;
  *(undefined **)(puVar14 + -0x430) = puVar27;
  *(undefined8 *)(puVar14 + -0x428) = uVar19;
  uVar19 = 0xa46e000;
  plVar43 = (long *)(uVar31 & 0xffffffff);
  uVar31 = auVar47._8_8_ & 0xffffffff;
  if ((bRam000000000a46e20c & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f7f9b0);
    func_0x0415191c(PTR_DAT_09f4b430);
    func_0x0415191c(PTR_DAT_09f4b438);
    func_0x0415191c(PTR_DAT_09f48a60);
    func_0x0415191c(PTR_DAT_09f46a88);
    bRam000000000a46e20c = 1;
  }
  puVar27 = PTR_DAT_09f7f9b0;
  puVar44 = PTR_DAT_09f4b430;
  if (lVar34 == 0) {
code_r0x0985481c:
    auVar47 = func_0x04151bb8();
    puVar44 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    plVar23 = auVar47._8_8_;
    plVar28 = auVar47._0_8_;
    uVar20 = 1;
    *(long **)(puVar14 + -0x4d0) = plVar40;
    *(undefined **)(puVar14 + -0x4c8) =
         &WithNetwork_WeaponStatusCalculator__CalculateTotalWeaponAttackPossessionEffectValue;
    *(undefined **)(puVar14 + -0x4c0) = puVar45;
    *(long **)(puVar14 + -0x4b8) = plVar26;
    *(long **)(puVar14 + -0x4b0) = plVar25;
    *(long **)(puVar14 + -0x4a8) = plVar36;
    *(long *)(puVar14 + -0x4a0) = lVar34;
    *(long **)(puVar14 + -0x498) = plVar24;
    *(undefined8 *)(puVar14 + -0x490) = uVar19;
    *(ulong *)(puVar14 + -0x488) = uVar31;
    *(undefined **)(puVar14 + -0x480) = puVar35;
    *(long **)(puVar14 + -0x478) = plVar43;
    auVar12._8_8_ = 0xa46e000;
    auVar12._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if ((bRam000000000a46e20a & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(PTR_DAT_09f46a88);
      func_0x0415191c(PTR_DAT_09f470e0);
      func_0x0415191c(PTR_DAT_09ec4a50);
      bRam000000000a46e20a = 1;
    }
    lVar21 = *(long *)puVar44;
    *(undefined8 *)(puVar14 + -0x4e8) = 0;
    *(undefined8 *)(puVar14 + -0x4f0) = 0;
    *(undefined8 *)(puVar14 + -0x4d8) = 0;
    *(undefined8 *)(puVar14 + -0x4e0) = 0;
    *(undefined8 *)(puVar14 + -0x4f8) = 0;
    *(undefined8 *)(puVar14 + -0x500) = 0;
    if (*(int *)(lVar21 + 0xe0) == 0) {
      func_0x04151a94();
      lVar21 = *(long *)puVar44;
    }
    auVar65._8_8_ = uVar41;
    auVar65._0_8_ = uVar20;
    puVar44 = puVar45;
    if (plVar28 != (long *)0x0) {
      pauVar39 = *(undefined1 (**) [16])(lVar21 + 0xb8);
      lVar21 = *plVar28;
      auVar12 = *pauVar39;
      auVar48 = *pauVar39;
      auVar47 = *pauVar39;
      uVar31 = (ulong)*(ushort *)(lVar21 + 0x12e);
      if (uVar31 != 0) {
        piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
        do {
          if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09f46a88) {
            puVar22 = (undefined8 *)(lVar21 + (long)(*piVar33 + 7) * 0x10 + 0x138);
            goto code_r0x09854920;
          }
          uVar31 = uVar31 - 1;
          piVar33 = piVar33 + 4;
        } while (uVar31 != 0);
      }
      uVar20 = 7;
      puVar22 = (undefined8 *)func_0x041cb4c4(plVar28);
code_r0x09854920:
      plVar43 = (long *)(*(code *)*puVar22)(plVar28,puVar22[1]);
      puVar27 = PTR_DAT_09f470e0;
      puVar45 = PTR_DAT_09ec4a50;
      auVar65._8_8_ = uVar41;
      auVar65._0_8_ = uVar20;
      if (plVar43 != (long *)0x0) {
        if (0 < (int)plVar43[3]) {
          plVar26 = (long *)0x0;
          plVar36 = (long *)(plVar43[3] & 0xffffffff);
          plVar25 = (long *)0x38;
          auVar47 = auVar48;
          do {
            uVar19 = auVar65._8_8_;
            plVar28 = plVar43;
            puVar44 = puVar27;
            plVar40 = (long *)puVar45;
            if (plVar36 <= plVar26) goto code_r0x09854ab0;
            if (*(char *)((long)plVar43 + (long)plVar26 * 0x38 + 0x4c) != '\0') {
              auVar12 = auVar47;
              if ((plVar43[(long)plVar26 * 7 + 4] == 0) || (plVar23 == (long *)0x0))
              goto code_r0x09854aac;
              lVar21 = *plVar23;
              uVar4 = *(uint *)(plVar43 + (long)plVar26 * 7 + 6);
              uVar16 = *(undefined4 *)(plVar43[(long)plVar26 * 7 + 4] + 0x38);
              auVar56._8_4_ = uVar16;
              auVar56._0_8_ = CONCAT44(0,uVar4);
              auVar56._12_4_ = 0;
              uVar41 = (ulong)*(ushort *)(lVar21 + 0x12e);
              if (uVar41 != 0) {
                piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar33 + -2) == *(long *)puVar27) {
                    puVar22 = (undefined8 *)(lVar21 + (long)(*piVar33 + 6) * 0x10 + 0x138);
                    goto code_r0x098549d4;
                  }
                  uVar41 = uVar41 - 1;
                  piVar33 = piVar33 + 4;
                } while (uVar41 != 0);
              }
              puVar22 = (undefined8 *)func_0x041cb4c4(plVar23,*(long *)puVar27,6);
code_r0x098549d4:
              uVar20 = puVar22[1];
              (*(code *)*puVar22)(puVar14 + -0x530,plVar23,uVar16);
              lVar21 = *(long *)puVar45;
              *(undefined8 *)(puVar14 + -0x4f8) = *(undefined8 *)(puVar14 + -0x528);
              *(undefined8 *)(puVar14 + -0x500) = *(undefined8 *)(puVar14 + -0x530);
              *(undefined8 *)(puVar14 + -0x4e8) = *(undefined8 *)(puVar14 + -0x518);
              *(undefined8 *)(puVar14 + -0x4f0) = *(undefined8 *)(puVar14 + -0x520);
              *(undefined8 *)(puVar14 + -0x4d8) = *(undefined8 *)(puVar14 + -0x508);
              *(undefined8 *)(puVar14 + -0x4e0) = *(undefined8 *)(puVar14 + -0x510);
              if (*(int *)(lVar21 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar65._8_8_ = uVar19;
              auVar65._0_8_ = uVar20;
              if (*(int *)(puVar14 + -0x4e8) == 1) {
                if (*(int *)(*(long *)puVar45 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar56 = func_0x091dc794(puVar14 + -0x500,CONCAT44(0,uVar4),0);
                if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar65 = auVar56;
                auVar47 = func_0x09774360(auVar47._0_8_,auVar47._8_8_,auVar56._0_8_,auVar56._8_8_,0)
                ;
              }
            }
            plVar36 = (long *)(ulong)*(uint *)(plVar43 + 3);
            plVar26 = (long *)((long)plVar26 + 1);
          } while ((long)plVar26 < (long)(int)*(uint *)(plVar43 + 3));
        }
        return auVar47;
      }
    }
code_r0x09854aac:
    auVar47 = auVar12;
    func_0x04151bb8();
code_r0x09854ab0:
    auVar48 = func_0x04151bc0();
    puVar45 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    auVar57._8_8_ = plVar26;
    auVar57._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar21 = auVar65._8_8_;
    uVar19 = auVar65._0_8_;
    plVar36 = auVar48._8_8_;
    plVar24 = auVar48._0_8_;
    puVar15 = puVar14 + -0x660;
    *(long **)(puVar14 + -0x590) = plVar40;
    *(undefined **)(puVar14 + -0x588) =
         &
         WithNetwork_WeaponStatusCalculator__CalculatePredictedTotalWeaponAttackPossessionEffectValue
    ;
    *(undefined **)(puVar14 + -0x580) = puVar44;
    *(long **)(puVar14 + -0x578) = plVar26;
    *(long **)(puVar14 + -0x570) = plVar25;
    *(long *)(puVar14 + -0x568) = auVar56._8_8_;
    *(long *)(puVar14 + -0x560) = auVar56._0_8_;
    *(long **)(puVar14 + -0x558) = plVar28;
    *(undefined1 (*) [16])(puVar14 + -0x550) = auVar47;
    *(long **)(puVar14 + -0x540) = plVar23;
    *(undefined8 *)(puVar14 + -0x538) = 1;
    plVar40 = (long *)(puVar14 + -0x5d0);
    if ((bRam000000000a46e20b & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(PTR_DAT_09eaa288);
      func_0x0415191c(PTR_DAT_09f7fb00);
      func_0x0415191c(PTR_DAT_09f7fb08);
      func_0x0415191c(PTR_DAT_09eaa8d0);
      func_0x0415191c(PTR_DAT_09ec4a50);
      bRam000000000a46e20b = 1;
    }
    lVar34 = *(long *)puVar45;
    *(undefined8 *)(puVar14 + -0x5a0) = 0;
    *(undefined8 *)(puVar14 + -0x5a8) = 0;
    *(undefined8 *)(puVar14 + -0x5b0) = 0;
    *(undefined8 *)(puVar14 + -0x5c8) = 0;
    *(undefined8 *)(puVar14 + -0x5d0) = 0;
    *(undefined8 *)(puVar14 + -0x5b8) = 0;
    *(undefined8 *)(puVar14 + -0x5c0) = 0;
    *(undefined8 *)(puVar14 + -0x5e8) = 0;
    *(undefined8 *)(puVar14 + -0x5f0) = 0;
    *(undefined8 *)(puVar14 + -0x5d8) = 0;
    *(undefined8 *)(puVar14 + -0x5e0) = 0;
    *(undefined8 *)(puVar14 + -0x5f8) = 0;
    *(undefined8 *)(puVar14 + -0x600) = 0;
    if (*(int *)(lVar34 + 0xe0) == 0) {
      func_0x04151a94();
      lVar34 = *(long *)puVar45;
    }
    uVar20 = auVar65._8_8_;
    plVar43 = (long *)0x0;
    puVar35 = (undefined *)0xa46e000;
    puVar45 = puVar44;
    if (plVar24 == (long *)0x0) {
code_r0x09854ea8:
      func_0x04151bb8();
      puVar27 = puVar35;
      puVar44 = puVar45;
    }
    else {
      pauVar39 = *(undefined1 (**) [16])(lVar34 + 0xb8);
      lVar34 = *plVar24;
      uVar1 = *(undefined8 *)*pauVar39;
      auVar57._0_8_ = uVar1;
      uVar3 = *(undefined8 *)(*pauVar39 + 8);
      auVar58 = *pauVar39;
      uVar41 = (ulong)*(ushort *)(lVar34 + 0x12e);
      if (uVar41 != 0) {
        piVar33 = (int *)(*(long *)(lVar34 + 0xb0) + 8);
        do {
          if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09f7fb00) {
            puVar22 = (undefined8 *)(lVar34 + (long)*piVar33 * 0x10 + 0x138);
            goto code_r0x09854be0;
          }
          uVar41 = uVar41 - 1;
          piVar33 = piVar33 + 4;
        } while (uVar41 != 0);
      }
      uVar30 = 0;
      puVar22 = (undefined8 *)func_0x041cb4c4(plVar24);
      auVar65._8_8_ = uVar20;
      auVar65._0_8_ = uVar30;
code_r0x09854be0:
      pcVar2 = (code *)*puVar22;
      uVar20 = puVar22[1];
      *(undefined8 *)(puVar14 + -0x640) = uVar19;
      plVar43 = (long *)(*pcVar2)(plVar24,uVar20);
      puVar35 = PTR_DAT_09f7fb08;
      puVar45 = PTR_DAT_09eaa8d0;
      puVar27 = (undefined *)0xa46e000;
      if (plVar43 != (long *)0x0) {
        *(undefined8 *)(puVar14 + -0x650) = uVar3;
        *(undefined8 *)(puVar14 + -0x648) = uVar1;
code_r0x09854c10:
        uVar19 = auVar65._8_8_;
        uVar31 = auVar58._0_8_;
        lVar34 = *plVar43;
        uVar41 = (ulong)*(ushort *)(lVar34 + 0x12e);
        if (uVar41 != 0) {
          piVar33 = (int *)(*(long *)(lVar34 + 0xb0) + 8);
          do {
            if (*(long *)(piVar33 + -2) == *(long *)puVar45) {
              puVar22 = (undefined8 *)(lVar34 + (long)*piVar33 * 0x10 + 0x138);
              goto code_r0x09854c5c;
            }
            uVar41 = uVar41 - 1;
            piVar33 = piVar33 + 4;
          } while (uVar41 != 0);
        }
        uVar20 = 0;
        puVar22 = (undefined8 *)func_0x041cb4c4(plVar43);
        auVar65._8_8_ = uVar19;
        auVar65._0_8_ = uVar20;
code_r0x09854c5c:
        uVar41 = (*(code *)*puVar22)(plVar43,puVar22[1]);
        uVar19 = auVar65._8_8_;
        if ((uVar41 & 1) == 0) {
          lVar21 = 0;
          goto code_r0x09854e0c;
        }
        lVar34 = *plVar43;
        uVar41 = (ulong)*(ushort *)(lVar34 + 0x12e);
        if (uVar41 != 0) {
          piVar33 = (int *)(*(long *)(lVar34 + 0xb0) + 8);
          do {
            if (*(long *)(piVar33 + -2) == *(long *)puVar35) {
              puVar22 = (undefined8 *)(lVar34 + (long)*piVar33 * 0x10 + 0x138);
              goto code_r0x09854cb8;
            }
            uVar41 = uVar41 - 1;
            piVar33 = piVar33 + 4;
          } while (uVar41 != 0);
        }
        uVar20 = 0;
        puVar22 = (undefined8 *)func_0x041cb4c4(plVar43);
        auVar65._8_8_ = uVar19;
        auVar65._0_8_ = uVar20;
code_r0x09854cb8:
        (*(code *)*puVar22)(puVar14 + -0x638,plVar43,puVar22[1]);
        *(undefined8 *)(puVar14 + -0x5c8) = *(undefined8 *)(puVar14 + -0x630);
        *(undefined8 *)(puVar14 + -0x5d0) = *(undefined8 *)(puVar14 + -0x638);
        *(undefined8 *)(puVar14 + -0x5b8) = *(undefined8 *)(puVar14 + -0x620);
        *(undefined8 *)(puVar14 + -0x5c0) = *(undefined8 *)(puVar14 + -0x628);
        *(undefined8 *)(puVar14 + -0x5a8) = *(undefined8 *)(puVar14 + -0x610);
        *(undefined8 *)(puVar14 + -0x5b0) = *(undefined8 *)(puVar14 + -0x618);
        *(undefined8 *)(puVar14 + -0x5a0) = *(undefined8 *)(puVar14 + -0x608);
        uVar41 = func_0x091bbeac(puVar14 + -0x5d0,0);
        uVar19 = auVar65._8_8_;
        if (lVar21 != 0) {
          uVar20 = *(undefined8 *)(lVar21 + 0x28);
          uVar41 = (**(code **)(lVar21 + 0x18))(*(undefined8 *)(lVar21 + 0x40));
          auVar65._8_8_ = uVar19;
          auVar65._0_8_ = uVar20;
          if ((uVar41 & 1) != 0) {
            if (*(long *)(puVar14 + -0x5d0) == 0) goto code_r0x09854ea0;
            if (plVar36 == (long *)0x0) goto code_r0x09854ea4;
            lVar34 = plVar36[5];
            (*(code *)plVar36[3])
                      (puVar14 + -0x638,plVar36[8],
                       *(undefined4 *)(*(long *)(puVar14 + -0x5d0) + 0x38));
            *(undefined8 *)(puVar14 + -0x5f8) = *(undefined8 *)(puVar14 + -0x630);
            *(undefined8 *)(puVar14 + -0x600) = *(undefined8 *)(puVar14 + -0x638);
            *(undefined8 *)(puVar14 + -0x5e8) = *(undefined8 *)(puVar14 + -0x620);
            *(undefined8 *)(puVar14 + -0x5f0) = *(undefined8 *)(puVar14 + -0x628);
            *(undefined8 *)(puVar14 + -0x5d8) = *(undefined8 *)(puVar14 + -0x610);
            *(undefined8 *)(puVar14 + -0x5e0) = *(undefined8 *)(puVar14 + -0x618);
            if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar65._8_8_ = uVar19;
            auVar65._0_8_ = lVar34;
            if (*(int *)(puVar14 + -0x5e8) == 1) {
              uVar41 = func_0x091bbeac(puVar14 + -0x5d0,0);
              auVar65._8_8_ = uVar19;
              auVar65._0_8_ = lVar34;
              auVar59._8_8_ = uVar41 & 0xffffffff;
              auVar59._0_8_ = uVar41;
              lVar34 = *(long *)(puVar14 + -0x640);
              *(long *)(puVar14 + -0x658) = auVar58._8_8_;
              if (lVar34 == 0) goto code_r0x09854ebc;
              uVar16 = (**(code **)(lVar34 + 0x18))
                                 (*(undefined8 *)(lVar34 + 0x40),uVar41 & 0xffffffff,
                                  *(undefined8 *)(lVar34 + 0x28));
              if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar57 = func_0x091dc794(puVar14 + -0x600,uVar16,0);
              if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar65 = auVar57;
              auVar58 = func_0x09774360(uVar31,*(undefined8 *)(puVar14 + -0x658),auVar57._0_8_,
                                        auVar57._8_8_,0);
            }
          }
          goto code_r0x09854c10;
        }
        func_0x04151bb8(uVar41,uVar41 & 0xffffffff);
code_r0x09854ea0:
        func_0x04151bb8();
code_r0x09854ea4:
        func_0x04151bb8();
        goto code_r0x09854ea8;
      }
    }
    puVar45 = puVar44;
    puVar35 = puVar27;
    uVar31 = auVar57._0_8_;
    func_0x04151bb8();
    while( true ) {
      auVar59 = func_0x04151bb0(lVar21);
code_r0x09854ebc:
      auVar64 = func_0x04151bb8(auVar59._0_8_,auVar59._8_8_);
      uVar19 = auVar65._8_8_;
      plVar28 = auVar64._0_8_;
      plVar25 = *(long **)(puVar14 + -0x658);
      auVar58._8_8_ = plVar25;
      auVar58._0_8_ = uVar31;
      if (auVar64._8_4_ != 1) break;
      plVar26 = (long *)func_0x098f6de0(plVar28);
      lVar21 = *plVar26;
      func_0x098f6df0();
code_r0x09854e0c:
      uVar19 = auVar65._8_8_;
      uVar31 = auVar58._0_8_;
      if (plVar43 != (long *)0x0) {
        lVar34 = *plVar43;
        uVar41 = (ulong)*(ushort *)(lVar34 + 0x12e);
        if (uVar41 != 0) {
          piVar33 = (int *)(*(long *)(lVar34 + 0xb0) + 8);
          do {
            if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09eaa288) {
              puVar22 = (undefined8 *)(lVar34 + (long)*piVar33 * 0x10 + 0x138);
              goto code_r0x09854e64;
            }
            uVar41 = uVar41 - 1;
            piVar33 = piVar33 + 4;
          } while (uVar41 != 0);
        }
        uVar20 = 0;
        puVar22 = (undefined8 *)func_0x041cb4c4(plVar43);
        auVar65._8_8_ = uVar19;
        auVar65._0_8_ = uVar20;
code_r0x09854e64:
        (*(code *)*puVar22)(plVar43,puVar22[1]);
      }
      if (lVar21 == 0) {
        return auVar58;
      }
    }
    plVar24 = (long *)0x0;
    if (plVar43 != (long *)0x0) {
      lVar21 = *plVar43;
      uVar41 = (ulong)*(ushort *)(lVar21 + 0x12e);
      if (uVar41 != 0) {
        piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
        do {
          if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09eaa288) {
            puVar22 = (undefined8 *)(lVar21 + (long)*piVar33 * 0x10 + 0x138);
            goto code_r0x09854f8c;
          }
          uVar41 = uVar41 - 1;
          piVar33 = piVar33 + 4;
        } while (uVar41 != 0);
      }
      uVar20 = 0;
      puVar22 = (undefined8 *)func_0x041cb4c4(plVar43);
      auVar65._8_8_ = uVar19;
      auVar65._0_8_ = uVar20;
code_r0x09854f8c:
      (*(code *)*puVar22)(plVar43,puVar22[1]);
    }
    func_0x04247ab0(plVar28);
    func_0x04151bb0(0);
    puVar44 = &WithNetwork_WeaponStatusCalculator__CalculateTotalWeaponPossessionEffectStatusValue;
    auVar60 = func_0x03bf6574();
  }
  else {
    plVar28 = (long *)func_0x053c429c(lVar34,*(undefined8 *)PTR_DAT_09f4b438);
    plVar24 = (long *)func_0x053c2424(lVar34,*(undefined8 *)puVar44);
    uVar19 = func_0x053c0a5c(lVar34,*(undefined8 *)puVar27);
    auVar57._8_8_ = plVar26;
    auVar57._0_8_ = uVar19;
    uVar19 = 0;
    if (plVar28 == (long *)0x0) goto code_r0x0985481c;
    lVar21 = *plVar28;
    uVar29 = (ulong)*(ushort *)(lVar21 + 0x12e);
    if (uVar29 != 0) {
      piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
      do {
        if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09f46a88) {
          puVar22 = (undefined8 *)(lVar21 + (long)(*piVar33 + 7) * 0x10 + 0x138);
          goto code_r0x098546f0;
        }
        uVar29 = uVar29 - 1;
        piVar33 = piVar33 + 4;
      } while (uVar29 != 0);
    }
    puVar22 = (undefined8 *)func_0x041cb4c4(plVar28,*(long *)PTR_DAT_09f46a88,7);
code_r0x098546f0:
    uVar19 = (*(code *)*puVar22)(plVar28,puVar22[1]);
    auVar65._8_8_ = uVar41;
    auVar65._0_8_ = uVar31;
    auVar60._8_8_ = uVar19;
    auVar60._0_8_ = plVar24;
    puVar44 = &UNK_0985470c;
  }
  puVar27 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  lVar21 = auVar60._8_8_;
  plVar26 = auVar60._0_8_;
  *(long **)(puVar15 + -0x60) = plVar40;
  *(undefined **)(puVar15 + -0x58) = puVar44;
  *(undefined **)(puVar15 + -0x50) = puVar45;
  *(long *)(puVar15 + -0x48) = auVar57._8_8_;
  *(long **)(puVar15 + -0x40) = plVar25;
  *(long **)(puVar15 + -0x38) = plVar36;
  *(long *)(puVar15 + -0x30) = auVar57._0_8_;
  *(long **)(puVar15 + -0x28) = plVar24;
  *(long **)(puVar15 + -0x20) = plVar28;
  *(ulong *)(puVar15 + -0x18) = uVar31;
  *(undefined **)(puVar15 + -0x10) = puVar35;
  *(long **)(puVar15 + -8) = plVar43;
  auVar62._8_8_ = 0xa46e000;
  auVar62._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  auVar61 = auVar65;
  if ((bRam000000000a46e20d & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e20d = 1;
  }
  lVar34 = *(long *)puVar27;
  *(undefined8 *)(puVar15 + -0x78) = 0;
  *(undefined8 *)(puVar15 + -0x80) = 0;
  *(undefined8 *)(puVar15 + -0x68) = 0;
  *(undefined8 *)(puVar15 + -0x70) = 0;
  *(undefined8 *)(puVar15 + -0x88) = 0;
  *(undefined8 *)(puVar15 + -0x90) = 0;
  if (*(int *)(lVar34 + 0xe0) == 0) {
    func_0x04151a94();
    lVar34 = *(long *)puVar27;
  }
  puVar44 = PTR_DAT_09f470e0;
  puVar45 = PTR_DAT_09ec4a50;
  uVar41 = auVar61._8_8_;
  iVar18 = auVar61._4_4_;
  if (lVar21 != 0) {
    auVar62 = **(undefined1 (**) [16])(lVar34 + 0xb8);
    if (0 < (int)*(ulong *)(lVar21 + 0x18)) {
      uVar31 = 0;
      uVar29 = *(ulong *)(lVar21 + 0x18) & 0xffffffff;
      auVar62 = **(undefined1 (**) [16])(lVar34 + 0xb8);
      do {
        uVar41 = auVar61._8_8_;
        iVar18 = auVar61._4_4_;
        if (uVar29 <= uVar31) goto code_r0x098551c0;
        lVar34 = lVar21 + uVar31 * 0x38;
        if (*(char *)(lVar34 + 0x4c) != '\0') {
          if ((*(long *)(lVar34 + 0x20) == 0) || (plVar26 == (long *)0x0)) goto code_r0x098551bc;
          lVar37 = *plVar26;
          uVar16 = *(undefined4 *)(lVar34 + 0x30);
          uVar5 = *(undefined4 *)(*(long *)(lVar34 + 0x20) + 0x38);
          uVar29 = (ulong)*(ushort *)(lVar37 + 0x12e);
          if (uVar29 != 0) {
            piVar33 = (int *)(*(long *)(lVar37 + 0xb0) + 8);
            do {
              if (*(long *)(piVar33 + -2) == *(long *)puVar44) {
                puVar22 = (undefined8 *)(lVar37 + (long)(*piVar33 + 6) * 0x10 + 0x138);
                goto code_r0x098550e4;
              }
              uVar29 = uVar29 - 1;
              piVar33 = piVar33 + 4;
            } while (uVar29 != 0);
          }
          puVar22 = (undefined8 *)func_0x041cb4c4(plVar26,*(long *)puVar44,6);
code_r0x098550e4:
          uVar19 = puVar22[1];
          (*(code *)*puVar22)(puVar15 + -0xc0,plVar26,uVar5);
          lVar34 = *(long *)puVar45;
          *(undefined8 *)(puVar15 + -0x88) = *(undefined8 *)(puVar15 + -0xb8);
          *(undefined8 *)(puVar15 + -0x90) = *(undefined8 *)(puVar15 + -0xc0);
          *(undefined8 *)(puVar15 + -0x78) = *(undefined8 *)(puVar15 + -0xa8);
          *(undefined8 *)(puVar15 + -0x80) = *(undefined8 *)(puVar15 + -0xb0);
          *(undefined8 *)(puVar15 + -0x68) = *(undefined8 *)(puVar15 + -0x98);
          *(undefined8 *)(puVar15 + -0x70) = *(undefined8 *)(puVar15 + -0xa0);
          if (*(int *)(lVar34 + 0xe0) == 0) {
            func_0x04151a94();
          }
          auVar61._8_8_ = uVar41;
          auVar61._0_8_ = uVar19;
          if (*(int *)(puVar15 + -0x78) == auVar65._0_4_) {
            if (*(int *)(*(long *)puVar45 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar61 = func_0x091dc794(puVar15 + -0x90,uVar16,0);
            if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar62 = func_0x09774360(auVar62._0_8_,auVar62._8_8_,auVar61._0_8_,auVar61._8_8_,0);
          }
        }
        uVar29 = (ulong)*(uint *)(lVar21 + 0x18);
        uVar31 = uVar31 + 1;
      } while ((long)uVar31 < (long)(int)*(uint *)(lVar21 + 0x18));
    }
    return auVar62;
  }
code_r0x098551bc:
  func_0x04151bb8();
code_r0x098551c0:
  auVar47 = func_0x04151bc0();
  plVar43 = auVar47._8_8_;
  plVar40 = auVar47._0_8_;
  *(undefined **)(puVar15 + -0xf0) =
       &WithNetwork_WeaponStatusCalculator__CalculateTotalWeaponEquipmentEffectStatusValue;
  *(undefined1 (*) [16])(puVar15 + -0xe8) = auVar62;
  *(undefined1 (*) [16])(puVar15 + -0xd8) = auVar60;
  *(ulong *)(puVar15 + -200) = auVar65._0_8_ & 0xffffffff;
  if ((bRam000000000a46e20e & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f46a88);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e20e = 1;
  }
  *(undefined8 *)(puVar15 + -0x108) = 0;
  *(undefined8 *)(puVar15 + -0x110) = 0;
  *(undefined8 *)(puVar15 + -0xf8) = 0;
  *(undefined8 *)(puVar15 + -0x100) = 0;
  *(undefined8 *)(puVar15 + -0x118) = 0;
  *(undefined8 *)(puVar15 + -0x120) = 0;
  if (iVar18 == 0) {
code_r0x09855384:
    puVar45 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar21 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if (*(int *)(lVar21 + 0xe0) == 0) {
      func_0x04151a94();
      lVar21 = *(long *)puVar45;
    }
    return **(undefined1 (**) [16])(lVar21 + 0xb8);
  }
  if (plVar43 != (long *)0x0) {
    lVar21 = *plVar43;
    uVar31 = (ulong)*(ushort *)(lVar21 + 0x12e);
    if (uVar31 != 0) {
      piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
      do {
        if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09f46a88) {
          puVar22 = (undefined8 *)(lVar21 + (long)(*piVar33 + 6) * 0x10 + 0x138);
          goto code_r0x09855294;
        }
        uVar31 = uVar31 - 1;
        piVar33 = piVar33 + 4;
      } while (uVar31 != 0);
    }
    puVar22 = (undefined8 *)func_0x041cb4c4(plVar43,*(long *)PTR_DAT_09f46a88,6);
code_r0x09855294:
    (*(code *)*puVar22)(puVar15 + -0x158,plVar43,iVar18,puVar22[1]);
    puVar45 = PTR_DAT_09ec4a50;
    if ((*(long *)(puVar15 + -0x158) != 0) && (plVar40 != (long *)0x0)) {
      lVar21 = *plVar40;
      uVar16 = *(undefined4 *)(puVar15 + -0x148);
      uVar5 = *(undefined4 *)(*(long *)(puVar15 + -0x158) + 0x3c);
      uVar31 = (ulong)*(ushort *)(lVar21 + 0x12e);
      if (uVar31 != 0) {
        piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
        do {
          if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09f470e0) {
            puVar22 = (undefined8 *)(lVar21 + (long)(*piVar33 + 6) * 0x10 + 0x138);
            goto code_r0x0985531c;
          }
          uVar31 = uVar31 - 1;
          piVar33 = piVar33 + 4;
        } while (uVar31 != 0);
      }
      puVar22 = (undefined8 *)func_0x041cb4c4(plVar40,*(long *)PTR_DAT_09f470e0,6);
code_r0x0985531c:
      (*(code *)*puVar22)(puVar15 + -0x158,plVar40,uVar5,puVar22[1]);
      lVar21 = *(long *)puVar45;
      *(undefined8 *)(puVar15 + -0x118) = *(undefined8 *)(puVar15 + -0x150);
      *(undefined8 *)(puVar15 + -0x120) = *(undefined8 *)(puVar15 + -0x158);
      *(undefined8 *)(puVar15 + -0x108) = *(undefined8 *)(puVar15 + -0x140);
      *(undefined8 *)(puVar15 + -0x110) = *(undefined8 *)(puVar15 + -0x148);
      *(undefined8 *)(puVar15 + -0xf8) = *(undefined8 *)(puVar15 + -0x130);
      *(undefined8 *)(puVar15 + -0x100) = *(undefined8 *)(puVar15 + -0x138);
      if (*(int *)(lVar21 + 0xe0) == 0) {
        func_0x04151a94();
      }
      if (*(int *)(puVar15 + -0x108) == (int)uVar41) {
        if (*(int *)(*(long *)puVar45 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar47 = func_0x091dc794(puVar15 + -0x120,uVar16,0);
        return auVar47;
      }
      goto code_r0x09855384;
    }
  }
  func_0x04151bb8();
  puVar45 = PTR_DAT_09f7fb10;
  *(undefined **)(puVar15 + -0x180) = &UNK_098553c0;
  *(long **)(puVar15 + -0x170) = plVar40;
  *(ulong *)(puVar15 + -0x168) = uVar41 & 0xffffffff;
  uVar19 = extraout_x1;
  if ((bRam000000000a46e20f & 1) == 0) {
    func_0x0415191c(PTR_DAT_09f7fb10);
    bRam000000000a46e20f = 1;
    uVar19 = extraout_x1_00;
  }
  lVar21 = *(long *)puVar45;
  if (*(int *)(lVar21 + 0xe0) == 0) {
    func_0x04151a94();
    lVar21 = *(long *)puVar45;
    uVar19 = extraout_x1_01;
  }
  auVar63._4_4_ = 0;
  auVar63._0_4_ = **(uint **)(lVar21 + 0xb8);
  auVar63._8_8_ = uVar19;
  return auVar63;
code_r0x09853ff0:
  if (*(int *)(puVar14 + -0x388) == 0) {
    if (*(long **)(puVar14 + -0x390) == (long *)0x0) {
      uVar31 = func_0x04151bb8();
      goto code_r0x098544a0;
    }
    lVar21 = **(long **)(puVar14 + -0x390);
    uVar16 = *(undefined4 *)((long)plVar24 + 0x24);
    uVar31 = (ulong)*(ushort *)(lVar21 + 0x12e);
    if (uVar31 != 0) {
      piVar33 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
      do {
        if (*(long *)(piVar33 + -2) == *(long *)PTR_DAT_09f470e0) {
          puVar22 = (undefined8 *)(lVar21 + (long)(*piVar33 + 6) * 0x10 + 0x138);
          goto code_r0x09854228;
        }
        uVar31 = uVar31 - 1;
        piVar33 = piVar33 + 4;
      } while (uVar31 != 0);
    }
    puVar22 = (undefined8 *)
              func_0x041cb4c4(*(undefined8 *)(puVar14 + -0x390),*(long *)PTR_DAT_09f470e0,6);
code_r0x09854228:
    uVar20 = puVar22[1];
    (*(code *)*puVar22)(puVar14 + -0x330,*(undefined8 *)(puVar14 + -0x390),uVar16);
    *(undefined8 *)(puVar14 + -0x278) = *(undefined8 *)(puVar14 + -0x328);
    *(undefined8 *)(puVar14 + -0x280) = *(undefined8 *)(puVar14 + -0x330);
    *(undefined8 *)(puVar14 + -0x268) = *(undefined8 *)(puVar14 + -0x318);
    *(undefined8 *)(puVar14 + -0x270) = *(undefined8 *)(puVar14 + -800);
    *(undefined8 *)(puVar14 + -600) = *(undefined8 *)(puVar14 + -0x308);
    *(undefined8 *)(puVar14 + -0x260) = *(undefined8 *)(puVar14 + -0x310);
    if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
      func_0x04151a94();
    }
    auVar52._8_8_ = uVar41;
    auVar52._0_8_ = uVar20;
    if (*(int *)(puVar14 + -0x268) == *(int *)(puVar14 + -900)) {
      if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
        func_0x04151a94();
      }
      auVar47 = func_0x091dc794(puVar14 + -0x280,uVar29,0);
      uVar29 = auVar47._8_8_;
      if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
        func_0x04151a94();
      }
      auVar52 = func_0x097744cc(auVar47._0_8_,uVar29,auVar54._0_8_,uVar19,0);
      auVar47 = func_0x09774360(*(undefined8 *)(puVar14 + -0x3a0),*(undefined8 *)(puVar14 + -0x3a8),
                                auVar52._0_8_,auVar52._8_8_,0);
code_r0x098542e8:
      *(long *)(puVar14 + -0x3a8) = auVar47._8_8_;
      *(long *)(puVar14 + -0x3a0) = auVar47._0_8_;
    }
  }
  goto code_r0x09853e40;
}


```

## TreasureStatusCalculator.CalculatePercentStatus(DataTableContainer dataTableContainer, BaseStatusEvaluateConditionEvaluateDelegate evaluateDelegate, StatusType statusTy)

```c

/* WARNING: Possible PIC construction at 0x098531a8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09853208: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0985335c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0985453c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09854708: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09854798: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0985470c) */
/* WARNING: Removing unreachable block (ram,0x09854710) */
/* WARNING: Removing unreachable block (ram,0x09854738) */
/* WARNING: Removing unreachable block (ram,0x09854740) */
/* WARNING: Removing unreachable block (ram,0x09854768) */
/* WARNING: Removing unreachable block (ram,0x0985474c) */
/* WARNING: Removing unreachable block (ram,0x09854758) */
/* WARNING: Removing unreachable block (ram,0x09854778) */
/* WARNING: Removing unreachable block (ram,0x09854540) */
/* WARNING: Removing unreachable block (ram,0x09853360) */
/* WARNING: Removing unreachable block (ram,0x098533a8) */
/* WARNING: Removing unreachable block (ram,0x098533ac) */
/* WARNING: Removing unreachable block (ram,0x0985320c) */
/* WARNING: Removing unreachable block (ram,0x098531ac) */
/* WARNING: Removing unreachable block (ram,0x098531c0) */
/* WARNING: Removing unreachable block (ram,0x098531c8) */
/* WARNING: Removing unreachable block (ram,0x0985479c) */
/* WARNING: Removing unreachable block (ram,0x098547b0) */
/* WARNING: Removing unreachable block (ram,0x098547b4) */
/* WARNING: Removing unreachable block (ram,0x091d1720) */
/* WARNING: Removing unreachable block (ram,0x09853984) */
/* WARNING: Removing unreachable block (ram,0x0985398c) */

undefined1  [16]
WithNetwork_TreasureStatusCalculator__CalculatePercentStatus
          (undefined8 param_1,long param_2,undefined8 param_3,ulong param_4,long *param_5,
          ulong param_6,long *param_7,undefined8 param_8,undefined4 param_9)

{
  undefined8 uVar1;
  code *pcVar2;
  undefined8 uVar3;
  uint uVar4;
  undefined4 uVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  char *pcVar13;
  undefined1 *puVar14;
  undefined4 uVar15;
  long lVar18;
  undefined8 *puVar19;
  long *plVar20;
  long *plVar21;
  long *plVar22;
  long *plVar23;
  int iVar16;
  int iVar17;
  undefined *puVar24;
  long *plVar25;
  undefined8 uVar26;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  ulong uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 extraout_x8;
  long lVar30;
  undefined8 extraout_x8_00;
  undefined *extraout_x8_01;
  undefined *puVar31;
  long *plVar32;
  long lVar33;
  ulong uVar34;
  undefined1 (*pauVar35) [16];
  int *piVar36;
  long *plVar37;
  long *plVar38;
  undefined *puVar39;
  ulong uVar40;
  ulong uVar41;
  long *plVar42;
  long *unaff_x26;
  long *unaff_x27;
  long *unaff_x28;
  undefined8 unaff_x29;
  undefined *puVar43;
  undefined *puVar44;
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined1 auVar52 [16];
  undefined1 auVar53 [16];
  undefined1 auVar54 [16];
  undefined1 auVar55 [16];
  undefined1 auVar56 [16];
  undefined1 auVar57 [16];
  undefined1 auVar58 [16];
  undefined1 auVar59 [16];
  undefined1 auVar60 [16];
  undefined1 auVar61 [16];
  undefined1 auVar62 [12];
  undefined1 auVar63 [16];
  char acStack_150 [124];
  undefined4 uStack_d4;
  undefined1 auStack_70 [8];
  undefined4 uStack_68;
  undefined4 uStack_64;
  
  auVar45._8_8_ = param_3;
  auVar45._0_8_ = param_2;
  uVar40 = param_6 & 0xffffffff;
  uVar41 = param_4 & 0xffffffff;
  uStack_68 = SUB84(param_7,0);
  uStack_64 = SUB84(param_5,0);
  if ((bRam000000000a46e206 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(
                   PTR_Method_WithNetwork_DataTableContainer_GetOrCreateTable_u003CLevelRangeValueGroup_u003E___09f7f990
                   );
    func_0x0415191c(PTR_DAT_09f4b430);
    func_0x0415191c(PTR_DAT_09f7fae0);
    bRam000000000a46e206 = 1;
  }
  puVar43 = 
  PTR_Method_WithNetwork_DataTableContainer_GetOrCreateTable_u003CLevelRangeValueGroup_u003E___09f7f990
  ;
  plVar37 = (long *)PTR_DAT_09f4b430;
  puVar39 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if (param_2 == 0) {
    auVar45 = func_0x04151bb8();
    lVar18 = auVar45._0_8_;
    pcVar13 = acStack_150 + 0x70;
    plVar37 = (long *)0xa46e000;
    puVar39 = (undefined *)((ulong)param_7 & 0xffffffff);
    uVar40 = param_6 & 0xffffffff;
    uVar41 = param_4 & 0xffffffff;
    uStack_d4 = SUB84(param_5,0);
    if ((bRam000000000a46e207 & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(
                     PTR_Method_WithNetwork_DataTableContainer_GetOrCreateTable_u003CLevelRangeValueGroup_u003E___09f7f990
                     );
      func_0x0415191c(PTR_DAT_09f4b430);
      func_0x0415191c(PTR_DAT_09f7fae0);
      bRam000000000a46e207 = 1;
    }
    puVar24 = 
    PTR_Method_WithNetwork_DataTableContainer_GetOrCreateTable_u003CLevelRangeValueGroup_u003E___09f7f990
    ;
    puVar43 = PTR_DAT_09f4b430;
    param_1 = extraout_x8;
    if (lVar18 == 0) {
      puVar43 = &
                WithNetwork_TreasureStatusCalculator__CalculateTotalTreasurePossessionEffectStatusValue
      ;
      auVar46 = func_0x04151bb8();
    }
    else {
      unaff_x28 = (long *)func_0x053c3cc0(lVar18,*(undefined8 *)PTR_DAT_09f7fae0);
      unaff_x29 = func_0x053c2424(lVar18,*(undefined8 *)puVar43);
      auVar46._8_8_ = unaff_x29;
      auVar46._0_8_ = unaff_x28;
      param_5 = (long *)func_0x053c1484(lVar18,*(undefined8 *)puVar24);
      puVar43 = &UNK_09853360;
      pcVar13 = acStack_150 + 0x70;
      param_4 = uVar41;
      param_6 = uVar40;
      plVar37 = param_5;
      unaff_x26 = (long *)puVar24;
    }
  }
  else {
    unaff_x26 = (long *)func_0x053c3cc0(param_2,*(undefined8 *)PTR_DAT_09f7fae0);
    unaff_x27 = (long *)func_0x053c2424(param_2,*plVar37);
    auVar46._8_8_ = unaff_x27;
    auVar46._0_8_ = unaff_x26;
    param_5 = (long *)func_0x053c1484(param_2,*(undefined8 *)puVar43);
    puVar43 = &UNK_098531ac;
    pcVar13 = auStack_70;
    param_4 = uVar41;
    param_6 = uVar40;
    unaff_x28 = param_5;
  }
  plVar42 = (long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  plVar32 = auVar46._8_8_;
  plVar23 = auVar46._0_8_;
  *(undefined8 *)(pcVar13 + -0x60) = unaff_x29;
  *(undefined **)(pcVar13 + -0x58) = puVar43;
  *(long **)(pcVar13 + -0x50) = unaff_x28;
  *(long **)(pcVar13 + -0x48) = unaff_x27;
  *(long **)(pcVar13 + -0x40) = unaff_x26;
  *(long *)(pcVar13 + -0x38) = auVar45._8_8_;
  *(long *)(pcVar13 + -0x30) = auVar45._0_8_;
  *(ulong *)(pcVar13 + -0x28) = uVar41;
  *(ulong *)(pcVar13 + -0x20) = uVar40;
  *(undefined **)(pcVar13 + -0x18) = puVar39;
  *(undefined8 *)(pcVar13 + -0x10) = param_1;
  *(long **)(pcVar13 + -8) = plVar37;
  uVar40 = param_6 & 0xffffffff;
  uVar27 = param_4;
  plVar37 = param_5;
  uVar41 = param_6;
  if ((bRam000000000a46e208 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_WithNetwork_IDataTable_u003CLevelRangeValueGroup_u003E_TypeInfo_09f4b580);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09f49098);
    func_0x0415191c(PTR_DAT_09eaa288);
    func_0x0415191c(PTR_DAT_09f54820);
    func_0x0415191c(PTR_DAT_09f54828);
    func_0x0415191c(PTR_DAT_09eaa8d0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e208 = 1;
  }
  lVar18 = *plVar42;
  *(undefined8 *)(pcVar13 + -0x78) = 0;
  *(undefined8 *)(pcVar13 + -0x80) = 0;
  *(undefined8 *)(pcVar13 + -0x68) = 0;
  *(undefined8 *)(pcVar13 + -0x70) = 0;
  *(undefined8 *)(pcVar13 + -0x98) = 0;
  *(undefined8 *)(pcVar13 + -0xa0) = 0;
  *(undefined8 *)(pcVar13 + -0x88) = 0;
  *(undefined8 *)(pcVar13 + -0x90) = 0;
  *(undefined8 *)(pcVar13 + -0xb8) = 0;
  *(undefined8 *)(pcVar13 + -0xc0) = 0;
  *(undefined8 *)(pcVar13 + -0xa8) = 0;
  *(undefined8 *)(pcVar13 + -0xb0) = 0;
  *(undefined8 *)(pcVar13 + -0xd8) = 0;
  *(undefined8 *)(pcVar13 + -0xe0) = 0;
  *(undefined8 *)(pcVar13 + -200) = 0;
  *(undefined8 *)(pcVar13 + -0xd0) = 0;
  *(undefined8 *)(pcVar13 + -0xe8) = 0;
  *(undefined8 *)(pcVar13 + -0xf0) = 0;
  *(undefined8 *)(pcVar13 + -0x100) = 0;
  *(undefined8 *)(pcVar13 + -0xf8) = 0;
  if (*(int *)(lVar18 + 0xe0) == 0) {
    func_0x04151a94();
    lVar18 = *plVar42;
  }
  auVar50._8_8_ = plVar37;
  auVar50._0_8_ = uVar27;
  uVar15 = (undefined4)param_8;
  uVar26 = **(undefined8 **)(lVar18 + 0xb8);
  *(undefined8 *)(pcVar13 + -0x150) = (*(undefined8 **)(lVar18 + 0xb8))[1];
  *(undefined8 *)(pcVar13 + -0x148) = uVar26;
  if ((int)param_6 != 0) {
code_r0x09853518:
    auVar47._8_8_ = *(undefined8 *)(pcVar13 + -0x150);
    auVar47._0_8_ = *(undefined8 *)(pcVar13 + -0x148);
    return auVar47;
  }
  puVar39 = (undefined *)0xa46e000;
  if (plVar23 != (long *)0x0) {
    lVar18 = *plVar23;
    uVar34 = (ulong)*(ushort *)(lVar18 + 0x12e);
    if (uVar34 != 0) {
      piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
      do {
        if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f49098) {
          puVar19 = (undefined8 *)(lVar18 + (long)(*piVar36 + 7) * 0x10 + 0x138);
          goto code_r0x09853598;
        }
        uVar34 = uVar34 - 1;
        piVar36 = piVar36 + 4;
      } while (uVar34 != 0);
    }
    uVar27 = 7;
    puVar19 = (undefined8 *)func_0x041cb4c4(plVar23);
code_r0x09853598:
    plVar20 = (long *)(*(code *)*puVar19)(plVar23,puVar19[1]);
    puVar43 = PTR_DAT_09f54828;
    plVar21 = (long *)PTR_DAT_09f470e0;
    plVar22 = (long *)PTR_DAT_09ec4a50;
    plVar25 = (long *)PTR_DAT_09eaa8d0;
    auVar50._8_8_ = plVar37;
    auVar50._0_8_ = uVar27;
    uVar15 = (undefined4)param_8;
    if (plVar20 != (long *)0x0) {
      uVar27 = plVar20[3];
      if (0 < (int)uVar27) {
        *(long **)(pcVar13 + -0x158) = param_5;
        plVar42 = (long *)0x0;
        plVar37 = (long *)(uVar27 & 0xffffffff);
        *(long **)(pcVar13 + -0x170) = plVar20;
        do {
          uVar26 = auVar50._8_8_;
          auVar49._8_8_ = unaff_x28;
          auVar49._0_8_ = unaff_x29;
          uVar15 = (undefined4)param_8;
          puVar39 = puVar43;
          param_5 = plVar21;
          plVar23 = plVar20;
          unaff_x26 = plVar22;
          unaff_x27 = plVar25;
          if (plVar37 <= plVar42) {
            func_0x04151bc0();
            goto code_r0x09853a44;
          }
          uVar28 = 0x60;
          func_0x098f6f40(pcVar13 + -0xc0,plVar20 + (long)plVar42 * 0xc + 4);
          auVar50._8_8_ = uVar26;
          auVar50._0_8_ = uVar28;
          uVar15 = (undefined4)param_8;
          if (pcVar13[-0x70] == '\0') {
            uVar26 = *(undefined8 *)(pcVar13 + -0x150);
            uVar28 = *(undefined8 *)(pcVar13 + -0x148);
          }
          else {
            plVar37 = *(long **)(pcVar13 + -0x98);
            auVar48._8_8_ = plVar20;
            auVar48._0_8_ = plVar37;
            uVar40 = 0;
            if (plVar37 == (long *)0x0) goto code_r0x09853a44;
            lVar18 = *plVar37;
            *(undefined4 *)(pcVar13 + -0x164) = *(undefined4 *)(pcVar13 + -0x88);
            uVar40 = (ulong)*(ushort *)(lVar18 + 0x12e);
            *(long **)(pcVar13 + -0x160) = plVar42;
            if (uVar40 != 0) {
              piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
              do {
                if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f54820) {
                  puVar19 = (undefined8 *)(lVar18 + (long)*piVar36 * 0x10 + 0x138);
                  goto code_r0x09853680;
                }
                uVar40 = uVar40 - 1;
                piVar36 = piVar36 + 4;
              } while (uVar40 != 0);
            }
            uVar28 = 0;
            puVar19 = (undefined8 *)func_0x041cb4c4(plVar37);
code_r0x09853680:
            plVar42 = (long *)(*(code *)*puVar19)(plVar37,puVar19[1]);
            auVar50._8_8_ = uVar26;
            auVar50._0_8_ = uVar28;
            *(undefined8 *)(pcVar13 + -0x140) = *(undefined8 *)(pcVar13 + -0x148);
            *(undefined8 *)(pcVar13 + -0x138) = *(undefined8 *)(pcVar13 + -0x150);
code_r0x0985369c:
            uVar26 = auVar50._8_8_;
            unaff_x28 = auVar49._8_8_;
            plVar37 = auVar49._0_8_;
            plVar23 = auVar48._8_8_;
            uVar40 = auVar48._0_8_;
            uVar15 = (undefined4)param_8;
            if (plVar42 == (long *)0x0) {
              unaff_x28 = (long *)func_0x04151bb8();
              goto code_r0x09853a5c;
            }
            lVar18 = *plVar42;
            uVar27 = (ulong)*(ushort *)(lVar18 + 0x12e);
            if (uVar27 != 0) {
              piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
              do {
                if (*(long *)(piVar36 + -2) == *plVar25) {
                  puVar19 = (undefined8 *)(lVar18 + (long)*piVar36 * 0x10 + 0x138);
                  goto code_r0x098536ec;
                }
                uVar27 = uVar27 - 1;
                piVar36 = piVar36 + 4;
              } while (uVar27 != 0);
            }
            uVar28 = 0;
            puVar19 = (undefined8 *)func_0x041cb4c4(plVar42);
            auVar50._8_8_ = uVar26;
            auVar50._0_8_ = uVar28;
code_r0x098536ec:
            uVar27 = (*(code *)*puVar19)(plVar42,puVar19[1]);
            uVar26 = auVar50._8_8_;
            if ((uVar27 & 1) != 0) {
              lVar18 = *plVar42;
              uVar27 = (ulong)*(ushort *)(lVar18 + 0x12e);
              if (uVar27 != 0) {
                piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar36 + -2) == *(long *)puVar43) {
                    puVar19 = (undefined8 *)(lVar18 + (long)*piVar36 * 0x10 + 0x138);
                    goto code_r0x09853748;
                  }
                  uVar27 = uVar27 - 1;
                  piVar36 = piVar36 + 4;
                } while (uVar27 != 0);
              }
              uVar28 = 0;
              puVar19 = (undefined8 *)func_0x041cb4c4(plVar42);
              auVar50._8_8_ = uVar26;
              auVar50._0_8_ = uVar28;
code_r0x09853748:
              plVar37 = (long *)(*(code *)*puVar19)(plVar42,puVar19[1]);
              uVar26 = auVar50._8_8_;
              auVar49._8_8_ = unaff_x28;
              auVar49._0_8_ = plVar37;
              uVar15 = (undefined4)param_8;
              if (plVar37 == (long *)0x0) {
                unaff_x28 = (long *)func_0x04151bb8();
                goto code_r0x09853a5c;
              }
              if (plVar32 == (long *)0x0) {
                unaff_x28 = (long *)func_0x04151bb8();
                goto code_r0x09853a5c;
              }
              lVar18 = *plVar32;
              uVar40 = CONCAT44(0,*(uint *)(plVar37 + 4));
              auVar48._8_8_ = plVar23;
              auVar48._0_8_ = uVar40;
              uVar27 = (ulong)*(ushort *)(lVar18 + 0x12e);
              if (uVar27 != 0) {
                piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar36 + -2) == *plVar21) {
                    puVar19 = (undefined8 *)(lVar18 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                    goto code_r0x098537b4;
                  }
                  uVar27 = uVar27 - 1;
                  piVar36 = piVar36 + 4;
                } while (uVar27 != 0);
              }
              puVar19 = (undefined8 *)func_0x041cb4c4(plVar32,*plVar21,6);
code_r0x098537b4:
              uVar28 = puVar19[1];
              (*(code *)*puVar19)(pcVar13 + -0x130,plVar32,uVar40);
              lVar18 = *plVar22;
              *(undefined8 *)(pcVar13 + -0xe8) = *(undefined8 *)(pcVar13 + -0x128);
              *(undefined8 *)(pcVar13 + -0xf0) = *(undefined8 *)(pcVar13 + -0x130);
              *(undefined8 *)(pcVar13 + -0xd8) = *(undefined8 *)(pcVar13 + -0x118);
              *(undefined8 *)(pcVar13 + -0xe0) = *(undefined8 *)(pcVar13 + -0x120);
              *(undefined8 *)(pcVar13 + -200) = *(undefined8 *)(pcVar13 + -0x108);
              *(undefined8 *)(pcVar13 + -0xd0) = *(undefined8 *)(pcVar13 + -0x110);
              if (*(int *)(lVar18 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar50._8_8_ = uVar26;
              auVar50._0_8_ = uVar28;
              if (*(int *)(pcVar13 + -0xd8) == (int)param_4) {
                if (*(int *)(*plVar22 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                uVar28 = 0;
                auVar48 = func_0x091dc794(pcVar13 + -0xf0,*(undefined4 *)(pcVar13 + -0x164));
                uVar15 = (undefined4)param_8;
                if (*(long **)(pcVar13 + -0x158) == (long *)0x0) {
                  unaff_x28 = (long *)func_0x04151bb8();
                  auVar50._8_8_ = uVar26;
                  auVar50._0_8_ = uVar28;
                  goto code_r0x09853a5c;
                }
                lVar18 = **(long **)(pcVar13 + -0x158);
                uVar15 = *(undefined4 *)((long)plVar37 + 0x24);
                uVar40 = (ulong)*(ushort *)(lVar18 + 0x12e);
                if (uVar40 != 0) {
                  piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
                  do {
                    if (*(long *)(piVar36 + -2) ==
                        *(long *)
                         PTR_WithNetwork_IDataTable_u003CLevelRangeValueGroup_u003E_TypeInfo_09f4b580
                       ) {
                      puVar19 = (undefined8 *)(lVar18 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                      goto code_r0x09853880;
                    }
                    uVar40 = uVar40 - 1;
                    piVar36 = piVar36 + 4;
                  } while (uVar40 != 0);
                }
                puVar19 = (undefined8 *)
                          func_0x041cb4c4(*(undefined8 *)(pcVar13 + -0x158),
                                          *(long *)
                                           PTR_WithNetwork_IDataTable_u003CLevelRangeValueGroup_u003E_TypeInfo_09f4b580
                                          ,6);
code_r0x09853880:
                auVar45 = (*(code *)*puVar19)(*(undefined8 *)(pcVar13 + -0x158),uVar15,puVar19[1]);
                *(undefined1 (*) [16])(pcVar13 + -0x100) = auVar45;
                uVar15 = func_0x091ce808(pcVar13 + -0xc0,0);
                auVar49 = func_0x091d4b70(pcVar13 + -0x100,uVar15,0);
                if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar50 = func_0x097744cc(auVar48._0_8_,auVar48._8_8_,auVar49._0_8_,auVar49._8_8_,0)
                ;
                uVar41 = 0;
                auVar45 = func_0x09774360(*(undefined8 *)(pcVar13 + -0x140),
                                          *(undefined8 *)(pcVar13 + -0x138));
                *(undefined1 (*) [16])(pcVar13 + -0x140) = auVar45;
              }
              goto code_r0x0985369c;
            }
            unaff_x29 = 0;
            uVar40 = 5;
            if (plVar42 != (long *)0x0) {
              lVar18 = *plVar42;
              uVar27 = (ulong)*(ushort *)(lVar18 + 0x12e);
              if (uVar27 != 0) {
                piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09eaa288) {
                    puVar19 = (undefined8 *)(lVar18 + (long)*piVar36 * 0x10 + 0x138);
                    goto code_r0x09853964;
                  }
                  uVar27 = uVar27 - 1;
                  piVar36 = piVar36 + 4;
                } while (uVar27 != 0);
              }
              uVar28 = 0;
              puVar19 = (undefined8 *)func_0x041cb4c4(plVar42);
              auVar50._8_8_ = uVar26;
              auVar50._0_8_ = uVar28;
code_r0x09853964:
              (*(code *)*puVar19)(plVar42,puVar19[1]);
            }
            plVar20 = *(long **)(pcVar13 + -0x170);
            plVar42 = *(long **)(pcVar13 + -0x160);
            uVar28 = *(undefined8 *)(pcVar13 + -0x140);
            uVar26 = *(undefined8 *)(pcVar13 + -0x138);
          }
          uVar4 = *(uint *)(plVar20 + 3);
          plVar37 = (long *)(ulong)uVar4;
          plVar42 = (long *)((long)plVar42 + 1);
          *(undefined8 *)(pcVar13 + -0x150) = uVar26;
          *(undefined8 *)(pcVar13 + -0x148) = uVar28;
        } while ((long)plVar42 < (long)(int)uVar4);
      }
      goto code_r0x09853518;
    }
  }
code_r0x09853a44:
  func_0x04151bb8();
  func_0x04151bb0(unaff_x29);
  plVar37 = (long *)0x0;
  puVar43 = puVar39;
  plVar21 = param_5;
  plVar22 = unaff_x26;
  plVar25 = unaff_x27;
code_r0x09853a5c:
  uVar26 = auVar50._8_8_;
  if (plVar42 != (long *)0x0) {
    lVar18 = *plVar42;
    uVar27 = (ulong)*(ushort *)(lVar18 + 0x12e);
    if (uVar27 != 0) {
      piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
      do {
        if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09eaa288) {
          puVar19 = (undefined8 *)(lVar18 + (long)*piVar36 * 0x10 + 0x138);
          goto code_r0x09853ab4;
        }
        uVar27 = uVar27 - 1;
        piVar36 = piVar36 + 4;
      } while (uVar27 != 0);
    }
    uVar28 = 0;
    puVar19 = (undefined8 *)func_0x041cb4c4(plVar42);
    auVar50._8_8_ = uVar26;
    auVar50._0_8_ = uVar28;
code_r0x09853ab4:
    (*(code *)*puVar19)(plVar42,puVar19[1]);
  }
  if (plVar37 == (long *)0x0) {
    func_0x04247ab0(unaff_x28);
  }
  func_0x04151bb0(plVar37);
  auVar51 = func_0x03bf6574();
  puVar39 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  *(long **)(pcVar13 + -0x1e0) = plVar37;
  *(undefined **)(pcVar13 + -0x1d8) =
       &WithNetwork_TreasureStatusCalculator__CalculateTotalTreasureEquipmentEffectStatusValue;
  *(long **)(pcVar13 + -0x1d0) = unaff_x28;
  *(long **)(pcVar13 + -0x1c8) = plVar25;
  *(long **)(pcVar13 + -0x1c0) = plVar22;
  *(long **)(pcVar13 + -0x1b8) = plVar42;
  *(long **)(pcVar13 + -0x1b0) = plVar23;
  *(long **)(pcVar13 + -0x1a8) = plVar21;
  *(undefined **)(pcVar13 + -0x1a0) = puVar43;
  *(long **)(pcVar13 + -0x198) = plVar32;
  *(ulong *)(pcVar13 + -400) = param_4 & 0xffffffff;
  *(ulong *)(pcVar13 + -0x188) = uVar40;
  *(undefined4 *)(pcVar13 + -0x3cc) = param_9;
  *(undefined4 *)(pcVar13 + -0x388) = uVar15;
  *(int *)(pcVar13 + -900) = auVar50._8_4_;
  *(long *)(pcVar13 + -0x3d8) = auVar50._0_8_;
  if ((bRam000000000a46e209 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09eca930);
    func_0x0415191c(PTR_DAT_09f7e928);
    func_0x0415191c(PTR_DAT_09f7f928);
    func_0x0415191c(PTR_DAT_09f7fae8);
    func_0x0415191c(PTR_WithNetwork_IDataTable_u003CLevelRangeValueGroup_u003E_TypeInfo_09f4b580);
    func_0x0415191c(PTR_DAT_09f7faf0);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09f49098);
    func_0x0415191c(PTR_DAT_09f473c8);
    func_0x0415191c(PTR_DAT_09f462e0);
    func_0x0415191c(PTR_DAT_09eaa288);
    func_0x0415191c(PTR_DAT_09f54788);
    func_0x0415191c(PTR_DAT_09f54790);
    func_0x0415191c(PTR_DAT_09eaa8d0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e209 = 1;
  }
  lVar18 = *(long *)puVar39;
  *(undefined8 *)(pcVar13 + -0x250) = 0;
  *(undefined8 *)(pcVar13 + -0x248) = 0;
  *(undefined8 *)(pcVar13 + -0x1f8) = 0;
  *(undefined8 *)(pcVar13 + -0x200) = 0;
  *(undefined8 *)(pcVar13 + -0x1e8) = 0;
  *(undefined8 *)(pcVar13 + -0x1f0) = 0;
  *(undefined8 *)(pcVar13 + -0x218) = 0;
  *(undefined8 *)(pcVar13 + -0x220) = 0;
  *(undefined8 *)(pcVar13 + -0x208) = 0;
  *(undefined8 *)(pcVar13 + -0x210) = 0;
  *(undefined8 *)(pcVar13 + -0x238) = 0;
  *(undefined8 *)(pcVar13 + -0x240) = 0;
  *(undefined8 *)(pcVar13 + -0x228) = 0;
  *(undefined8 *)(pcVar13 + -0x230) = 0;
  *(undefined8 *)(pcVar13 + -0x268) = 0;
  *(undefined8 *)(pcVar13 + -0x270) = 0;
  *(undefined8 *)(pcVar13 + -600) = 0;
  *(undefined8 *)(pcVar13 + -0x260) = 0;
  *(undefined8 *)(pcVar13 + -0x288) = 0;
  *(undefined8 *)(pcVar13 + -0x290) = 0;
  *(undefined8 *)(pcVar13 + -0x278) = 0;
  *(undefined8 *)(pcVar13 + -0x280) = 0;
  *(undefined8 *)(pcVar13 + -0x2a8) = 0;
  *(undefined8 *)(pcVar13 + -0x2b0) = 0;
  *(undefined8 *)(pcVar13 + -0x298) = 0;
  *(undefined8 *)(pcVar13 + -0x2a0) = 0;
  *(undefined8 *)(pcVar13 + -0x2d0) = 0;
  *(undefined8 *)(pcVar13 + -0x2c8) = 0;
  *(undefined8 *)(pcVar13 + -0x2c0) = 0;
  if (*(int *)(lVar18 + 0xe0) == 0) {
    func_0x04151a94();
    lVar18 = *(long *)puVar39;
  }
  puVar24 = PTR_DAT_09f7f928;
  puVar43 = PTR_DAT_09f7e928;
  uVar40 = auVar50._8_8_;
  iVar17 = auVar50._0_4_;
  puVar31 = (undefined *)0xa46e000;
  if (uVar41 != 0) {
    plVar37 = (long *)**(undefined8 **)(lVar18 + 0xb8);
    uVar26 = *(undefined8 *)PTR_DAT_09f7fae8;
    *(undefined8 *)(pcVar13 + -0x398) = (*(undefined8 **)(lVar18 + 0xb8))[1];
    plVar21 = (long *)func_0x053bf800(uVar41,uVar26);
    plVar22 = (long *)func_0x053bf1c0(uVar41,*(undefined8 *)puVar24);
    plVar23 = (long *)func_0x053beb1c(uVar41,*(undefined8 *)puVar43);
    uVar40 = auVar50._8_8_;
    iVar17 = auVar50._0_4_;
    puVar31 = puVar24;
    puVar39 = puVar43;
    if (plVar21 != (long *)0x0) {
      lVar18 = *plVar21;
      uVar27 = (ulong)*(ushort *)(lVar18 + 0x12e);
      if (uVar27 != 0) {
        piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
        do {
          if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f7faf0) {
            puVar19 = (undefined8 *)(lVar18 + (long)(*piVar36 + 7) * 0x10 + 0x138);
            goto code_r0x09853cdc;
          }
          uVar27 = uVar27 - 1;
          piVar36 = piVar36 + 4;
        } while (uVar27 != 0);
      }
      uVar26 = 7;
      puVar19 = (undefined8 *)func_0x041cb4c4(plVar21);
      auVar50._8_8_ = uVar40;
      auVar50._0_8_ = uVar26;
code_r0x09853cdc:
      lVar18 = (*(code *)*puVar19)(plVar21,puVar19[1]);
      plVar32 = (long *)PTR_DAT_09f54790;
      puVar24 = PTR_WithNetwork_IDataTable_u003CLevelRangeValueGroup_u003E_TypeInfo_09f4b580;
      puVar43 = PTR_DAT_09eaa8d0;
      uVar40 = auVar50._8_8_;
      iVar17 = auVar50._0_4_;
      plVar25 = plVar23;
      if (lVar18 != 0) {
        uVar40 = *(ulong *)(lVar18 + 0x18);
        if ((int)uVar40 < 1) {
          uVar26 = *(undefined8 *)(pcVar13 + -0x398);
        }
        else {
          *(long *)(pcVar13 + -0x390) = auVar51._0_8_;
          plVar21 = (long *)0x0;
          plVar42 = (long *)(uVar40 & 0xffffffff);
          *(long *)(pcVar13 + -0x3c8) = lVar18;
          *(long *)(pcVar13 + -0x3c0) = auVar51._8_8_;
          do {
            uVar40 = auVar50._8_8_;
            plVar20 = auVar51._8_8_;
            uVar27 = auVar51._0_8_;
            iVar17 = auVar50._0_4_;
            if (plVar42 <= plVar21) goto code_r0x09854488;
            uVar4 = *(uint *)(lVar18 + (long)plVar21 * 0x10 + 0x28);
            uVar41 = (ulong)uVar4;
            if (uVar4 == 0) {
              uVar26 = *(undefined8 *)(pcVar13 + -0x398);
            }
            else {
              puVar31 = puVar24;
              puVar39 = puVar43;
              plVar42 = plVar32;
              if (plVar20 == (long *)0x0) goto code_r0x09854484;
              lVar18 = *plVar20;
              uVar41 = (ulong)*(ushort *)(lVar18 + 0x12e);
              if (uVar41 != 0) {
                piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f49098) {
                    puVar19 = (undefined8 *)(lVar18 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                    goto code_r0x09853d9c;
                  }
                  uVar41 = uVar41 - 1;
                  piVar36 = piVar36 + 4;
                } while (uVar41 != 0);
              }
              puVar19 = (undefined8 *)func_0x041cb4c4(plVar20,*(long *)PTR_DAT_09f49098,6);
code_r0x09853d9c:
              (*(code *)*puVar19)(pcVar13 + -0x330,plVar20,uVar4,puVar19[1]);
              uVar26 = 0x60;
              func_0x098f6ee0(pcVar13 + -0x240,pcVar13 + -0x330);
              iVar17 = (int)uVar26;
              plVar38 = *(long **)(pcVar13 + -0x210);
              auVar52._8_8_ = plVar20;
              auVar52._0_8_ = plVar38;
              uVar41 = 0;
              if (plVar38 == (long *)0x0) goto code_r0x09854484;
              lVar18 = *plVar38;
              uVar41 = (ulong)*(ushort *)(lVar18 + 0x12e);
              *(long **)(pcVar13 + -0x3b8) = plVar21;
              *(long **)(pcVar13 + -0x3b0) = plVar37;
              if (uVar41 != 0) {
                piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f54788) {
                    puVar19 = (undefined8 *)(lVar18 + (long)*piVar36 * 0x10 + 0x138);
                    goto code_r0x09853e20;
                  }
                  uVar41 = uVar41 - 1;
                  piVar36 = piVar36 + 4;
                } while (uVar41 != 0);
              }
              uVar26 = 0;
              puVar19 = (undefined8 *)func_0x041cb4c4(plVar38);
code_r0x09853e20:
              plVar37 = (long *)(*(code *)*puVar19)(plVar38,puVar19[1]);
              auVar50._8_8_ = uVar40;
              auVar50._0_8_ = uVar26;
              iVar17 = (int)uVar26;
              *(undefined8 *)(pcVar13 + -0x3a8) = *(undefined8 *)(pcVar13 + -0x398);
              *(undefined8 *)(pcVar13 + -0x3a0) = *(undefined8 *)(pcVar13 + -0x3b0);
              if (plVar37 == (long *)0x0) {
                uVar41 = func_0x04151bb8();
                goto code_r0x098544a0;
              }
code_r0x09853e40:
              uVar26 = auVar50._8_8_;
              auVar51._8_8_ = auVar52._8_8_;
              auVar51._0_8_ = uVar27;
              auVar10._8_8_ = auVar52._8_8_;
              auVar10._0_8_ = uVar27;
              uVar41 = auVar52._0_8_;
              lVar18 = *plVar37;
              uVar40 = (ulong)*(ushort *)(lVar18 + 0x12e);
              if (uVar40 != 0) {
                piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar36 + -2) == *(long *)puVar43) {
                    puVar19 = (undefined8 *)(lVar18 + (long)*piVar36 * 0x10 + 0x138);
                    goto code_r0x09853e8c;
                  }
                  uVar40 = uVar40 - 1;
                  piVar36 = piVar36 + 4;
                } while (uVar40 != 0);
              }
              uVar28 = 0;
              puVar19 = (undefined8 *)func_0x041cb4c4(plVar37);
              auVar50._8_8_ = uVar26;
              auVar50._0_8_ = uVar28;
code_r0x09853e8c:
              uVar27 = (*(code *)*puVar19)(plVar37,puVar19[1]);
              uVar40 = auVar50._8_8_;
              iVar17 = auVar50._0_4_;
              if ((uVar27 & 1) != 0) {
                lVar18 = *plVar37;
                uVar41 = (ulong)*(ushort *)(lVar18 + 0x12e);
                if (uVar41 != 0) {
                  piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
                  do {
                    if (*(long *)(piVar36 + -2) == *plVar32) {
                      puVar19 = (undefined8 *)(lVar18 + (long)*piVar36 * 0x10 + 0x138);
                      goto code_r0x09853ee8;
                    }
                    uVar41 = uVar41 - 1;
                    piVar36 = piVar36 + 4;
                  } while (uVar41 != 0);
                }
                iVar17 = 0;
                puVar19 = (undefined8 *)func_0x041cb4c4(plVar37);
code_r0x09853ee8:
                plVar21 = (long *)(*(code *)*puVar19)(plVar37,puVar19[1]);
                if (plVar21 == (long *)0x0) {
                  uVar41 = func_0x04151bb8();
                  goto code_r0x098544a0;
                }
                if (param_7 == (long *)0x0) {
                  uVar41 = func_0x04151bb8();
                  auVar51 = auVar10;
                  goto code_r0x098544a0;
                }
                lVar30 = *param_7;
                uVar27 = CONCAT44(0,*(uint *)(pcVar13 + -0x208));
                lVar18 = plVar21[5];
                uVar41 = (ulong)*(ushort *)(lVar30 + 0x12e);
                if (uVar41 != 0) {
                  piVar36 = (int *)(*(long *)(lVar30 + 0xb0) + 8);
                  do {
                    if (*(long *)(piVar36 + -2) == *(long *)puVar24) {
                      puVar19 = (undefined8 *)(lVar30 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                      goto code_r0x09853f58;
                    }
                    uVar41 = uVar41 - 1;
                    piVar36 = piVar36 + 4;
                  } while (uVar41 != 0);
                }
                puVar19 = (undefined8 *)func_0x041cb4c4(param_7,*(long *)puVar24,6);
code_r0x09853f58:
                auVar45 = (*(code *)*puVar19)(param_7,(int)lVar18,puVar19[1]);
                *(undefined1 (*) [16])(pcVar13 + -0x250) = auVar45;
                uVar15 = func_0x091ce808(pcVar13 + -0x240,0);
                uVar28 = 0;
                auVar52 = func_0x091d4b70(pcVar13 + -0x250,uVar15);
                auVar50._8_8_ = uVar40;
                auVar50._0_8_ = uVar28;
                auVar6._8_8_ = uVar40;
                auVar6._0_8_ = uVar28;
                uVar26 = auVar52._8_8_;
                auVar51._8_8_ = uVar26;
                auVar51._0_8_ = uVar27;
                auVar9._8_8_ = uVar26;
                auVar9._0_8_ = uVar27;
                auVar8._8_8_ = uVar26;
                auVar8._0_8_ = uVar27;
                iVar17 = (int)uVar28;
                if ((int)plVar21[4] == 0) goto code_r0x09853ff0;
                auVar50 = auVar6;
                if ((int)plVar21[4] == 1) {
                  if (plVar22 == (long *)0x0) {
                    uVar41 = func_0x04151bb8();
                    auVar51 = auVar9;
                    goto code_r0x098544a0;
                  }
                  lVar18 = *plVar22;
                  plVar21 = (long *)(ulong)*(uint *)((long)plVar21 + 0x24);
                  uVar41 = (ulong)*(ushort *)(lVar18 + 0x12e);
                  if (uVar41 != 0) {
                    piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
                    do {
                      if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f462e0) {
                        puVar19 = (undefined8 *)(lVar18 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                        goto code_r0x0985405c;
                      }
                      uVar41 = uVar41 - 1;
                      piVar36 = piVar36 + 4;
                    } while (uVar41 != 0);
                  }
                  puVar19 = (undefined8 *)func_0x041cb4c4(plVar22,*(long *)PTR_DAT_09f462e0,6);
code_r0x0985405c:
                  uVar28 = puVar19[1];
                  (*(code *)*puVar19)(pcVar13 + -0x330,plVar22,plVar21);
                  *(undefined8 *)(pcVar13 + -0x2c0) = 0;
                  *(undefined8 *)(pcVar13 + -0x2d0) = 0;
                  *(undefined8 *)(pcVar13 + -0x2c8) = 0;
                  *(undefined8 *)(pcVar13 + -0x2a8) = *(undefined8 *)(pcVar13 + -0x328);
                  *(undefined8 *)(pcVar13 + -0x2b0) = *(undefined8 *)(pcVar13 + -0x330);
                  *(undefined8 *)(pcVar13 + -0x298) = *(undefined8 *)(pcVar13 + -0x318);
                  *(undefined8 *)(pcVar13 + -0x2a0) = *(undefined8 *)(pcVar13 + -800);
                  *(undefined8 *)(pcVar13 + -0x288) = *(undefined8 *)(pcVar13 + -0x308);
                  *(undefined8 *)(pcVar13 + -0x290) = *(undefined8 *)(pcVar13 + -0x310);
                  if (*(int *)(*(long *)PTR_DAT_09eca930 + 0xe0) == 0) {
                    func_0x04151a94();
                  }
                  iVar16 = func_0x091b9acc(pcVar13 + -0x2b0,0);
                  iVar17 = (int)uVar28;
                  if (iVar16 != 0) {
                    if (*(int *)(*(long *)PTR_DAT_09eca930 + 0xe0) == 0) {
                      func_0x04151a94();
                    }
                    uVar15 = func_0x091b9acc(pcVar13 + -0x2b0,0);
                    if (plVar23 == (long *)0x0) {
                      uVar41 = func_0x04151bb8();
                      auVar51 = auVar8;
                      goto code_r0x098544a0;
                    }
                    lVar18 = *plVar23;
                    uVar41 = (ulong)*(ushort *)(lVar18 + 0x12e);
                    if (uVar41 != 0) {
                      piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
                      do {
                        if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f473c8) {
                          puVar19 = (undefined8 *)(lVar18 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                          goto code_r0x09854134;
                        }
                        uVar41 = uVar41 - 1;
                        piVar36 = piVar36 + 4;
                      } while (uVar41 != 0);
                    }
                    puVar19 = (undefined8 *)func_0x041cb4c4(plVar23,*(long *)PTR_DAT_09f473c8,6);
code_r0x09854134:
                    uVar28 = puVar19[1];
                    (*(code *)*puVar19)(pcVar13 + -0x330,plVar23,uVar15);
                    *(undefined8 *)(pcVar13 + -0x2c8) = *(undefined8 *)(pcVar13 + -0x328);
                    *(undefined8 *)(pcVar13 + -0x2d0) = *(undefined8 *)(pcVar13 + -0x330);
                    *(undefined8 *)(pcVar13 + -0x2c0) = *(undefined8 *)(pcVar13 + -800);
                  }
                  if (*(int *)(*(long *)PTR_DAT_09eca930 + 0xe0) == 0) {
                    func_0x04151a94();
                  }
                  iVar17 = func_0x091b994c(pcVar13 + -0x2b0,0);
                  auVar50._8_8_ = uVar40;
                  auVar50._0_8_ = uVar28;
                  if (iVar17 == *(int *)(pcVar13 + -900)) {
                    *(undefined8 *)(pcVar13 + -0x358) = *(undefined8 *)(pcVar13 + -0x2a8);
                    *(undefined8 *)(pcVar13 + -0x360) = *(undefined8 *)(pcVar13 + -0x2b0);
                    *(undefined8 *)(pcVar13 + -0x348) = *(undefined8 *)(pcVar13 + -0x298);
                    *(undefined8 *)(pcVar13 + -0x350) = *(undefined8 *)(pcVar13 + -0x2a0);
                    *(undefined8 *)(pcVar13 + -0x338) = *(undefined8 *)(pcVar13 + -0x288);
                    *(undefined8 *)(pcVar13 + -0x340) = *(undefined8 *)(pcVar13 + -0x290);
                    *(undefined8 *)(pcVar13 + -0x378) = *(undefined8 *)(pcVar13 + -0x2c8);
                    *(undefined8 *)(pcVar13 + -0x380) = *(undefined8 *)(pcVar13 + -0x2d0);
                    *(undefined8 *)(pcVar13 + -0x370) = *(undefined8 *)(pcVar13 + -0x2c0);
                    auVar45 = func_0x098801d4(uVar27,pcVar13 + -0x360,pcVar13 + -0x380,
                                              *(undefined8 *)(pcVar13 + -0x3d8),
                                              *(undefined4 *)(pcVar13 + -0x388),
                                              *(undefined4 *)(pcVar13 + -0x3cc),0);
                    uVar27 = auVar45._8_8_;
                    if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) ==
                        0) {
                      func_0x04151a94();
                    }
                    auVar50 = func_0x097744cc(auVar45._0_8_,uVar27,auVar52._0_8_,uVar26,0);
                    auVar45 = func_0x09774360(*(undefined8 *)(pcVar13 + -0x3a0),
                                              *(undefined8 *)(pcVar13 + -0x3a8),auVar50._0_8_,
                                              auVar50._8_8_,0);
                    goto code_r0x098542e8;
                  }
                }
                goto code_r0x09853e40;
              }
              if (plVar37 != (long *)0x0) {
                lVar18 = *plVar37;
                uVar27 = (ulong)*(ushort *)(lVar18 + 0x12e);
                if (uVar27 != 0) {
                  piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
                  do {
                    if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09eaa288) {
                      puVar19 = (undefined8 *)(lVar18 + (long)*piVar36 * 0x10 + 0x138);
                      goto code_r0x0985434c;
                    }
                    uVar27 = uVar27 - 1;
                    piVar36 = piVar36 + 4;
                  } while (uVar27 != 0);
                }
                uVar26 = 0;
                puVar19 = (undefined8 *)func_0x041cb4c4(plVar37);
                auVar50._8_8_ = uVar40;
                auVar50._0_8_ = uVar26;
code_r0x0985434c:
                (*(code *)*puVar19)(plVar37,puVar19[1]);
              }
              lVar18 = *(long *)(pcVar13 + -0x3c8);
              auVar7._8_8_ = 0;
              auVar7._0_8_ = *(ulong *)(pcVar13 + -0x3c0);
              auVar51 = auVar7 << 0x40;
              plVar21 = *(long **)(pcVar13 + -0x3b8);
              uVar26 = *(undefined8 *)(pcVar13 + -0x3a8);
              plVar37 = *(long **)(pcVar13 + -0x3a0);
            }
            uVar4 = *(uint *)(lVar18 + 0x18);
            plVar42 = (long *)(ulong)uVar4;
            plVar21 = (long *)((long)plVar21 + 1);
            *(undefined8 *)(pcVar13 + -0x398) = uVar26;
          } while ((long)plVar21 < (long)(int)uVar4);
        }
        auVar53._8_8_ = uVar26;
        auVar53._0_8_ = plVar37;
        return auVar53;
      }
    }
  }
code_r0x09854484:
  plVar32 = plVar42;
  puVar43 = puVar39;
  puVar24 = puVar31;
  func_0x04151bb8();
code_r0x09854488:
  func_0x04151bc0();
  func_0x04151bb0(auVar51._0_8_);
  auVar11._8_8_ = 0;
  auVar11._0_8_ = auVar51._8_8_;
  plVar23 = plVar25;
  auVar51 = auVar11 << 0x40;
code_r0x098544a0:
  puVar39 = auVar51._8_8_;
  lVar18 = auVar51._0_8_;
  if (plVar37 != (long *)0x0) {
    lVar30 = *plVar37;
    uVar27 = (ulong)*(ushort *)(lVar30 + 0x12e);
    if (uVar27 != 0) {
      piVar36 = (int *)(*(long *)(lVar30 + 0xb0) + 8);
      do {
        if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09eaa288) {
          puVar19 = (undefined8 *)(lVar30 + (long)*piVar36 * 0x10 + 0x138);
          goto code_r0x098544f8;
        }
        uVar27 = uVar27 - 1;
        piVar36 = piVar36 + 4;
      } while (uVar27 != 0);
    }
    iVar17 = 0;
    puVar19 = (undefined8 *)func_0x041cb4c4(plVar37);
code_r0x098544f8:
    (*(code *)*puVar19)(plVar37,puVar19[1]);
  }
  if (lVar18 == 0) {
    func_0x04247ab0(uVar41);
  }
  func_0x04151bb0(lVar18);
  auVar45 = func_0x03bf6574();
  puVar31 = pcVar13 + -0x420;
  *(undefined **)(pcVar13 + -0x400) = &WithNetwork_WeaponStatusCalculator__CalculateStatus;
  *(undefined **)(pcVar13 + -0x3f0) = puVar24;
  *(ulong *)(pcVar13 + -1000) = uVar41;
  if (iVar17 == 2) {
    uVar41 = uVar40 & 0xffffffff;
    puVar44 = &UNK_09854540;
    uVar26 = extraout_x8_00;
  }
  else {
    *(int *)(pcVar13 + -0x420) = iVar17;
    uVar26 = func_0x04151930(PTR_DAT_09edb230);
    uVar26 = func_0x04151a9c(uVar26,pcVar13 + -0x420);
    uVar28 = func_0x04151930(PTR_DAT_09f7f9a0);
    uVar26 = func_0x084656c4(uVar28,uVar26,0);
    func_0x04151930(PTR_DAT_09eadfb8);
    puVar24 = (undefined *)func_0x04151ba8();
    uVar41 = 0;
    func_0x085befc4(puVar24,uVar26);
    uVar28 = func_0x04151930(
                            PTR_Method_WithNetwork_WeaponStatusCalculator_CalculateStatus___09f7faf8
                            );
    puVar44 = &WithNetwork_WeaponStatusCalculator__CalculatePercentStatus;
    auVar45 = func_0x04151a84(puVar24,uVar28);
    puVar31 = extraout_x8_01;
  }
  lVar30 = auVar45._0_8_;
  auVar54._8_8_ = plVar32;
  auVar54._0_8_ = lVar30;
  puVar14 = pcVar13 + -0x470;
  *(undefined **)(pcVar13 + -0x470) = puVar44;
  *(long **)(pcVar13 + -0x468) = plVar23;
  *(long **)(pcVar13 + -0x460) = plVar22;
  *(long **)(pcVar13 + -0x458) = plVar32;
  *(long *)(pcVar13 + -0x450) = lVar18;
  *(long **)(pcVar13 + -0x448) = plVar21;
  *(undefined **)(pcVar13 + -0x440) = puVar43;
  *(long **)(pcVar13 + -0x438) = param_7;
  *(undefined **)(pcVar13 + -0x430) = puVar24;
  *(undefined8 *)(pcVar13 + -0x428) = uVar26;
  uVar26 = 0xa46e000;
  plVar42 = (long *)(uVar41 & 0xffffffff);
  uVar41 = auVar45._8_8_ & 0xffffffff;
  if ((bRam000000000a46e20c & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f7f9b0);
    func_0x0415191c(PTR_DAT_09f4b430);
    func_0x0415191c(PTR_DAT_09f4b438);
    func_0x0415191c(PTR_DAT_09f48a60);
    func_0x0415191c(PTR_DAT_09f46a88);
    bRam000000000a46e20c = 1;
  }
  puVar24 = PTR_DAT_09f7f9b0;
  puVar43 = PTR_DAT_09f4b430;
  if (lVar30 == 0) {
code_r0x0985481c:
    auVar45 = func_0x04151bb8();
    puVar43 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    plVar20 = auVar45._8_8_;
    plVar25 = auVar45._0_8_;
    uVar28 = 1;
    *(long **)(pcVar13 + -0x4d0) = plVar37;
    *(undefined **)(pcVar13 + -0x4c8) =
         &WithNetwork_WeaponStatusCalculator__CalculateTotalWeaponAttackPossessionEffectValue;
    *(undefined **)(pcVar13 + -0x4c0) = puVar39;
    *(long **)(pcVar13 + -0x4b8) = plVar23;
    *(long **)(pcVar13 + -0x4b0) = plVar22;
    *(long **)(pcVar13 + -0x4a8) = plVar32;
    *(long *)(pcVar13 + -0x4a0) = lVar30;
    *(long **)(pcVar13 + -0x498) = plVar21;
    *(undefined8 *)(pcVar13 + -0x490) = uVar26;
    *(ulong *)(pcVar13 + -0x488) = uVar41;
    *(undefined **)(pcVar13 + -0x480) = puVar31;
    *(long **)(pcVar13 + -0x478) = plVar42;
    auVar12._8_8_ = 0xa46e000;
    auVar12._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if ((bRam000000000a46e20a & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(PTR_DAT_09f46a88);
      func_0x0415191c(PTR_DAT_09f470e0);
      func_0x0415191c(PTR_DAT_09ec4a50);
      bRam000000000a46e20a = 1;
    }
    lVar18 = *(long *)puVar43;
    *(undefined8 *)(pcVar13 + -0x4e8) = 0;
    *(undefined8 *)(pcVar13 + -0x4f0) = 0;
    *(undefined8 *)(pcVar13 + -0x4d8) = 0;
    *(undefined8 *)(pcVar13 + -0x4e0) = 0;
    *(undefined8 *)(pcVar13 + -0x4f8) = 0;
    *(undefined8 *)(pcVar13 + -0x500) = 0;
    if (*(int *)(lVar18 + 0xe0) == 0) {
      func_0x04151a94();
      lVar18 = *(long *)puVar43;
    }
    auVar63._8_8_ = uVar40;
    auVar63._0_8_ = uVar28;
    puVar43 = puVar39;
    if (plVar25 != (long *)0x0) {
      pauVar35 = *(undefined1 (**) [16])(lVar18 + 0xb8);
      lVar18 = *plVar25;
      auVar12 = *pauVar35;
      auVar46 = *pauVar35;
      auVar45 = *pauVar35;
      uVar41 = (ulong)*(ushort *)(lVar18 + 0x12e);
      if (uVar41 != 0) {
        piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
        do {
          if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f46a88) {
            puVar19 = (undefined8 *)(lVar18 + (long)(*piVar36 + 7) * 0x10 + 0x138);
            goto code_r0x09854920;
          }
          uVar41 = uVar41 - 1;
          piVar36 = piVar36 + 4;
        } while (uVar41 != 0);
      }
      uVar28 = 7;
      puVar19 = (undefined8 *)func_0x041cb4c4(plVar25);
code_r0x09854920:
      plVar42 = (long *)(*(code *)*puVar19)(plVar25,puVar19[1]);
      puVar24 = PTR_DAT_09f470e0;
      puVar39 = PTR_DAT_09ec4a50;
      auVar63._8_8_ = uVar40;
      auVar63._0_8_ = uVar28;
      if (plVar42 != (long *)0x0) {
        if (0 < (int)plVar42[3]) {
          plVar23 = (long *)0x0;
          plVar32 = (long *)(plVar42[3] & 0xffffffff);
          plVar22 = (long *)0x38;
          auVar45 = auVar46;
          do {
            uVar26 = auVar63._8_8_;
            plVar25 = plVar42;
            puVar43 = puVar24;
            plVar37 = (long *)puVar39;
            if (plVar32 <= plVar23) goto code_r0x09854ab0;
            if (*(char *)((long)plVar42 + (long)plVar23 * 0x38 + 0x4c) != '\0') {
              auVar12 = auVar45;
              if ((plVar42[(long)plVar23 * 7 + 4] == 0) || (plVar20 == (long *)0x0))
              goto code_r0x09854aac;
              lVar18 = *plVar20;
              uVar4 = *(uint *)(plVar42 + (long)plVar23 * 7 + 6);
              uVar15 = *(undefined4 *)(plVar42[(long)plVar23 * 7 + 4] + 0x38);
              auVar54._8_4_ = uVar15;
              auVar54._0_8_ = CONCAT44(0,uVar4);
              auVar54._12_4_ = 0;
              uVar40 = (ulong)*(ushort *)(lVar18 + 0x12e);
              if (uVar40 != 0) {
                piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar36 + -2) == *(long *)puVar24) {
                    puVar19 = (undefined8 *)(lVar18 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                    goto code_r0x098549d4;
                  }
                  uVar40 = uVar40 - 1;
                  piVar36 = piVar36 + 4;
                } while (uVar40 != 0);
              }
              puVar19 = (undefined8 *)func_0x041cb4c4(plVar20,*(long *)puVar24,6);
code_r0x098549d4:
              uVar28 = puVar19[1];
              (*(code *)*puVar19)(pcVar13 + -0x530,plVar20,uVar15);
              lVar18 = *(long *)puVar39;
              *(undefined8 *)(pcVar13 + -0x4f8) = *(undefined8 *)(pcVar13 + -0x528);
              *(undefined8 *)(pcVar13 + -0x500) = *(undefined8 *)(pcVar13 + -0x530);
              *(undefined8 *)(pcVar13 + -0x4e8) = *(undefined8 *)(pcVar13 + -0x518);
              *(undefined8 *)(pcVar13 + -0x4f0) = *(undefined8 *)(pcVar13 + -0x520);
              *(undefined8 *)(pcVar13 + -0x4d8) = *(undefined8 *)(pcVar13 + -0x508);
              *(undefined8 *)(pcVar13 + -0x4e0) = *(undefined8 *)(pcVar13 + -0x510);
              if (*(int *)(lVar18 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar63._8_8_ = uVar26;
              auVar63._0_8_ = uVar28;
              if (*(int *)(pcVar13 + -0x4e8) == 1) {
                if (*(int *)(*(long *)puVar39 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar54 = func_0x091dc794(pcVar13 + -0x500,CONCAT44(0,uVar4),0);
                if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar63 = auVar54;
                auVar45 = func_0x09774360(auVar45._0_8_,auVar45._8_8_,auVar54._0_8_,auVar54._8_8_,0)
                ;
              }
            }
            plVar32 = (long *)(ulong)*(uint *)(plVar42 + 3);
            plVar23 = (long *)((long)plVar23 + 1);
          } while ((long)plVar23 < (long)(int)*(uint *)(plVar42 + 3));
        }
        return auVar45;
      }
    }
code_r0x09854aac:
    auVar45 = auVar12;
    func_0x04151bb8();
code_r0x09854ab0:
    auVar46 = func_0x04151bc0();
    puVar39 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    auVar55._8_8_ = plVar23;
    auVar55._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar18 = auVar63._8_8_;
    uVar26 = auVar63._0_8_;
    plVar32 = auVar46._8_8_;
    plVar21 = auVar46._0_8_;
    puVar14 = pcVar13 + -0x660;
    *(long **)(pcVar13 + -0x590) = plVar37;
    *(undefined **)(pcVar13 + -0x588) =
         &
         WithNetwork_WeaponStatusCalculator__CalculatePredictedTotalWeaponAttackPossessionEffectValue
    ;
    *(undefined **)(pcVar13 + -0x580) = puVar43;
    *(long **)(pcVar13 + -0x578) = plVar23;
    *(long **)(pcVar13 + -0x570) = plVar22;
    *(long *)(pcVar13 + -0x568) = auVar54._8_8_;
    *(long *)(pcVar13 + -0x560) = auVar54._0_8_;
    *(long **)(pcVar13 + -0x558) = plVar25;
    *(undefined1 (*) [16])(pcVar13 + -0x550) = auVar45;
    *(long **)(pcVar13 + -0x540) = plVar20;
    *(undefined8 *)(pcVar13 + -0x538) = 1;
    plVar37 = (long *)(pcVar13 + -0x5d0);
    if ((bRam000000000a46e20b & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(PTR_DAT_09eaa288);
      func_0x0415191c(PTR_DAT_09f7fb00);
      func_0x0415191c(PTR_DAT_09f7fb08);
      func_0x0415191c(PTR_DAT_09eaa8d0);
      func_0x0415191c(PTR_DAT_09ec4a50);
      bRam000000000a46e20b = 1;
    }
    lVar30 = *(long *)puVar39;
    *(undefined8 *)(pcVar13 + -0x5a0) = 0;
    *(undefined8 *)(pcVar13 + -0x5a8) = 0;
    *(undefined8 *)(pcVar13 + -0x5b0) = 0;
    *(undefined8 *)(pcVar13 + -0x5c8) = 0;
    *(undefined8 *)(pcVar13 + -0x5d0) = 0;
    *(undefined8 *)(pcVar13 + -0x5b8) = 0;
    *(undefined8 *)(pcVar13 + -0x5c0) = 0;
    *(undefined8 *)(pcVar13 + -0x5e8) = 0;
    *(undefined8 *)(pcVar13 + -0x5f0) = 0;
    *(undefined8 *)(pcVar13 + -0x5d8) = 0;
    *(undefined8 *)(pcVar13 + -0x5e0) = 0;
    *(undefined8 *)(pcVar13 + -0x5f8) = 0;
    *(undefined8 *)(pcVar13 + -0x600) = 0;
    if (*(int *)(lVar30 + 0xe0) == 0) {
      func_0x04151a94();
      lVar30 = *(long *)puVar39;
    }
    uVar28 = auVar63._8_8_;
    plVar42 = (long *)0x0;
    puVar31 = (undefined *)0xa46e000;
    puVar39 = puVar43;
    if (plVar21 == (long *)0x0) {
code_r0x09854ea8:
      func_0x04151bb8();
      puVar24 = puVar31;
      puVar43 = puVar39;
    }
    else {
      pauVar35 = *(undefined1 (**) [16])(lVar30 + 0xb8);
      lVar30 = *plVar21;
      uVar1 = *(undefined8 *)*pauVar35;
      auVar55._0_8_ = uVar1;
      uVar3 = *(undefined8 *)(*pauVar35 + 8);
      auVar56 = *pauVar35;
      uVar40 = (ulong)*(ushort *)(lVar30 + 0x12e);
      if (uVar40 != 0) {
        piVar36 = (int *)(*(long *)(lVar30 + 0xb0) + 8);
        do {
          if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f7fb00) {
            puVar19 = (undefined8 *)(lVar30 + (long)*piVar36 * 0x10 + 0x138);
            goto code_r0x09854be0;
          }
          uVar40 = uVar40 - 1;
          piVar36 = piVar36 + 4;
        } while (uVar40 != 0);
      }
      uVar29 = 0;
      puVar19 = (undefined8 *)func_0x041cb4c4(plVar21);
      auVar63._8_8_ = uVar28;
      auVar63._0_8_ = uVar29;
code_r0x09854be0:
      pcVar2 = (code *)*puVar19;
      uVar28 = puVar19[1];
      *(undefined8 *)(pcVar13 + -0x640) = uVar26;
      plVar42 = (long *)(*pcVar2)(plVar21,uVar28);
      puVar31 = PTR_DAT_09f7fb08;
      puVar39 = PTR_DAT_09eaa8d0;
      puVar24 = (undefined *)0xa46e000;
      if (plVar42 != (long *)0x0) {
        *(undefined8 *)(pcVar13 + -0x650) = uVar3;
        *(undefined8 *)(pcVar13 + -0x648) = uVar1;
code_r0x09854c10:
        uVar26 = auVar63._8_8_;
        uVar41 = auVar56._0_8_;
        lVar30 = *plVar42;
        uVar40 = (ulong)*(ushort *)(lVar30 + 0x12e);
        if (uVar40 != 0) {
          piVar36 = (int *)(*(long *)(lVar30 + 0xb0) + 8);
          do {
            if (*(long *)(piVar36 + -2) == *(long *)puVar39) {
              puVar19 = (undefined8 *)(lVar30 + (long)*piVar36 * 0x10 + 0x138);
              goto code_r0x09854c5c;
            }
            uVar40 = uVar40 - 1;
            piVar36 = piVar36 + 4;
          } while (uVar40 != 0);
        }
        uVar28 = 0;
        puVar19 = (undefined8 *)func_0x041cb4c4(plVar42);
        auVar63._8_8_ = uVar26;
        auVar63._0_8_ = uVar28;
code_r0x09854c5c:
        uVar40 = (*(code *)*puVar19)(plVar42,puVar19[1]);
        uVar26 = auVar63._8_8_;
        if ((uVar40 & 1) == 0) {
          lVar18 = 0;
          goto code_r0x09854e0c;
        }
        lVar30 = *plVar42;
        uVar40 = (ulong)*(ushort *)(lVar30 + 0x12e);
        if (uVar40 != 0) {
          piVar36 = (int *)(*(long *)(lVar30 + 0xb0) + 8);
          do {
            if (*(long *)(piVar36 + -2) == *(long *)puVar31) {
              puVar19 = (undefined8 *)(lVar30 + (long)*piVar36 * 0x10 + 0x138);
              goto code_r0x09854cb8;
            }
            uVar40 = uVar40 - 1;
            piVar36 = piVar36 + 4;
          } while (uVar40 != 0);
        }
        uVar28 = 0;
        puVar19 = (undefined8 *)func_0x041cb4c4(plVar42);
        auVar63._8_8_ = uVar26;
        auVar63._0_8_ = uVar28;
code_r0x09854cb8:
        (*(code *)*puVar19)(pcVar13 + -0x638,plVar42,puVar19[1]);
        *(undefined8 *)(pcVar13 + -0x5c8) = *(undefined8 *)(pcVar13 + -0x630);
        *(undefined8 *)(pcVar13 + -0x5d0) = *(undefined8 *)(pcVar13 + -0x638);
        *(undefined8 *)(pcVar13 + -0x5b8) = *(undefined8 *)(pcVar13 + -0x620);
        *(undefined8 *)(pcVar13 + -0x5c0) = *(undefined8 *)(pcVar13 + -0x628);
        *(undefined8 *)(pcVar13 + -0x5a8) = *(undefined8 *)(pcVar13 + -0x610);
        *(undefined8 *)(pcVar13 + -0x5b0) = *(undefined8 *)(pcVar13 + -0x618);
        *(undefined8 *)(pcVar13 + -0x5a0) = *(undefined8 *)(pcVar13 + -0x608);
        uVar40 = func_0x091bbeac(pcVar13 + -0x5d0,0);
        uVar26 = auVar63._8_8_;
        if (lVar18 != 0) {
          uVar28 = *(undefined8 *)(lVar18 + 0x28);
          uVar40 = (**(code **)(lVar18 + 0x18))(*(undefined8 *)(lVar18 + 0x40));
          auVar63._8_8_ = uVar26;
          auVar63._0_8_ = uVar28;
          if ((uVar40 & 1) != 0) {
            if (*(long *)(pcVar13 + -0x5d0) == 0) goto code_r0x09854ea0;
            if (plVar32 == (long *)0x0) goto code_r0x09854ea4;
            lVar30 = plVar32[5];
            (*(code *)plVar32[3])
                      (pcVar13 + -0x638,plVar32[8],
                       *(undefined4 *)(*(long *)(pcVar13 + -0x5d0) + 0x38));
            *(undefined8 *)(pcVar13 + -0x5f8) = *(undefined8 *)(pcVar13 + -0x630);
            *(undefined8 *)(pcVar13 + -0x600) = *(undefined8 *)(pcVar13 + -0x638);
            *(undefined8 *)(pcVar13 + -0x5e8) = *(undefined8 *)(pcVar13 + -0x620);
            *(undefined8 *)(pcVar13 + -0x5f0) = *(undefined8 *)(pcVar13 + -0x628);
            *(undefined8 *)(pcVar13 + -0x5d8) = *(undefined8 *)(pcVar13 + -0x610);
            *(undefined8 *)(pcVar13 + -0x5e0) = *(undefined8 *)(pcVar13 + -0x618);
            if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar63._8_8_ = uVar26;
            auVar63._0_8_ = lVar30;
            if (*(int *)(pcVar13 + -0x5e8) == 1) {
              uVar40 = func_0x091bbeac(pcVar13 + -0x5d0,0);
              auVar63._8_8_ = uVar26;
              auVar63._0_8_ = lVar30;
              auVar57._8_8_ = uVar40 & 0xffffffff;
              auVar57._0_8_ = uVar40;
              lVar30 = *(long *)(pcVar13 + -0x640);
              *(long *)(pcVar13 + -0x658) = auVar56._8_8_;
              if (lVar30 == 0) goto code_r0x09854ebc;
              uVar15 = (**(code **)(lVar30 + 0x18))
                                 (*(undefined8 *)(lVar30 + 0x40),uVar40 & 0xffffffff,
                                  *(undefined8 *)(lVar30 + 0x28));
              if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar55 = func_0x091dc794(pcVar13 + -0x600,uVar15,0);
              if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar63 = auVar55;
              auVar56 = func_0x09774360(uVar41,*(undefined8 *)(pcVar13 + -0x658),auVar55._0_8_,
                                        auVar55._8_8_,0);
            }
          }
          goto code_r0x09854c10;
        }
        func_0x04151bb8(uVar40,uVar40 & 0xffffffff);
code_r0x09854ea0:
        func_0x04151bb8();
code_r0x09854ea4:
        func_0x04151bb8();
        goto code_r0x09854ea8;
      }
    }
    puVar39 = puVar43;
    puVar31 = puVar24;
    uVar41 = auVar55._0_8_;
    func_0x04151bb8();
    while( true ) {
      auVar57 = func_0x04151bb0(lVar18);
code_r0x09854ebc:
      auVar62 = func_0x04151bb8(auVar57._0_8_,auVar57._8_8_);
      uVar26 = auVar63._8_8_;
      plVar25 = auVar62._0_8_;
      plVar22 = *(long **)(pcVar13 + -0x658);
      auVar56._8_8_ = plVar22;
      auVar56._0_8_ = uVar41;
      if (auVar62._8_4_ != 1) break;
      plVar23 = (long *)func_0x098f6de0(plVar25);
      lVar18 = *plVar23;
      func_0x098f6df0();
code_r0x09854e0c:
      uVar26 = auVar63._8_8_;
      uVar41 = auVar56._0_8_;
      if (plVar42 != (long *)0x0) {
        lVar30 = *plVar42;
        uVar40 = (ulong)*(ushort *)(lVar30 + 0x12e);
        if (uVar40 != 0) {
          piVar36 = (int *)(*(long *)(lVar30 + 0xb0) + 8);
          do {
            if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09eaa288) {
              puVar19 = (undefined8 *)(lVar30 + (long)*piVar36 * 0x10 + 0x138);
              goto code_r0x09854e64;
            }
            uVar40 = uVar40 - 1;
            piVar36 = piVar36 + 4;
          } while (uVar40 != 0);
        }
        uVar28 = 0;
        puVar19 = (undefined8 *)func_0x041cb4c4(plVar42);
        auVar63._8_8_ = uVar26;
        auVar63._0_8_ = uVar28;
code_r0x09854e64:
        (*(code *)*puVar19)(plVar42,puVar19[1]);
      }
      if (lVar18 == 0) {
        return auVar56;
      }
    }
    plVar21 = (long *)0x0;
    if (plVar42 != (long *)0x0) {
      lVar18 = *plVar42;
      uVar40 = (ulong)*(ushort *)(lVar18 + 0x12e);
      if (uVar40 != 0) {
        piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
        do {
          if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09eaa288) {
            puVar19 = (undefined8 *)(lVar18 + (long)*piVar36 * 0x10 + 0x138);
            goto code_r0x09854f8c;
          }
          uVar40 = uVar40 - 1;
          piVar36 = piVar36 + 4;
        } while (uVar40 != 0);
      }
      uVar28 = 0;
      puVar19 = (undefined8 *)func_0x041cb4c4(plVar42);
      auVar63._8_8_ = uVar26;
      auVar63._0_8_ = uVar28;
code_r0x09854f8c:
      (*(code *)*puVar19)(plVar42,puVar19[1]);
    }
    func_0x04247ab0(plVar25);
    func_0x04151bb0(0);
    puVar43 = &WithNetwork_WeaponStatusCalculator__CalculateTotalWeaponPossessionEffectStatusValue;
    auVar58 = func_0x03bf6574();
  }
  else {
    plVar25 = (long *)func_0x053c429c(lVar30,*(undefined8 *)PTR_DAT_09f4b438);
    plVar21 = (long *)func_0x053c2424(lVar30,*(undefined8 *)puVar43);
    uVar26 = func_0x053c0a5c(lVar30,*(undefined8 *)puVar24);
    auVar55._8_8_ = plVar23;
    auVar55._0_8_ = uVar26;
    uVar26 = 0;
    if (plVar25 == (long *)0x0) goto code_r0x0985481c;
    lVar18 = *plVar25;
    uVar27 = (ulong)*(ushort *)(lVar18 + 0x12e);
    if (uVar27 != 0) {
      piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
      do {
        if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f46a88) {
          puVar19 = (undefined8 *)(lVar18 + (long)(*piVar36 + 7) * 0x10 + 0x138);
          goto code_r0x098546f0;
        }
        uVar27 = uVar27 - 1;
        piVar36 = piVar36 + 4;
      } while (uVar27 != 0);
    }
    puVar19 = (undefined8 *)func_0x041cb4c4(plVar25,*(long *)PTR_DAT_09f46a88,7);
code_r0x098546f0:
    uVar26 = (*(code *)*puVar19)(plVar25,puVar19[1]);
    auVar63._8_8_ = uVar40;
    auVar63._0_8_ = uVar41;
    auVar58._8_8_ = uVar26;
    auVar58._0_8_ = plVar21;
    puVar43 = &UNK_0985470c;
  }
  puVar24 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  lVar18 = auVar58._8_8_;
  plVar23 = auVar58._0_8_;
  *(long **)(puVar14 + -0x60) = plVar37;
  *(undefined **)(puVar14 + -0x58) = puVar43;
  *(undefined **)(puVar14 + -0x50) = puVar39;
  *(long *)(puVar14 + -0x48) = auVar55._8_8_;
  *(long **)(puVar14 + -0x40) = plVar22;
  *(long **)(puVar14 + -0x38) = plVar32;
  *(long *)(puVar14 + -0x30) = auVar55._0_8_;
  *(long **)(puVar14 + -0x28) = plVar21;
  *(long **)(puVar14 + -0x20) = plVar25;
  *(ulong *)(puVar14 + -0x18) = uVar41;
  *(undefined **)(puVar14 + -0x10) = puVar31;
  *(long **)(puVar14 + -8) = plVar42;
  auVar60._8_8_ = 0xa46e000;
  auVar60._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  auVar59 = auVar63;
  if ((bRam000000000a46e20d & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e20d = 1;
  }
  lVar30 = *(long *)puVar24;
  *(undefined8 *)(puVar14 + -0x78) = 0;
  *(undefined8 *)(puVar14 + -0x80) = 0;
  *(undefined8 *)(puVar14 + -0x68) = 0;
  *(undefined8 *)(puVar14 + -0x70) = 0;
  *(undefined8 *)(puVar14 + -0x88) = 0;
  *(undefined8 *)(puVar14 + -0x90) = 0;
  if (*(int *)(lVar30 + 0xe0) == 0) {
    func_0x04151a94();
    lVar30 = *(long *)puVar24;
  }
  puVar43 = PTR_DAT_09f470e0;
  puVar39 = PTR_DAT_09ec4a50;
  uVar40 = auVar59._8_8_;
  iVar17 = auVar59._4_4_;
  if (lVar18 != 0) {
    auVar60 = **(undefined1 (**) [16])(lVar30 + 0xb8);
    if (0 < (int)*(ulong *)(lVar18 + 0x18)) {
      uVar41 = 0;
      uVar27 = *(ulong *)(lVar18 + 0x18) & 0xffffffff;
      auVar60 = **(undefined1 (**) [16])(lVar30 + 0xb8);
      do {
        uVar40 = auVar59._8_8_;
        iVar17 = auVar59._4_4_;
        if (uVar27 <= uVar41) goto code_r0x098551c0;
        lVar30 = lVar18 + uVar41 * 0x38;
        if (*(char *)(lVar30 + 0x4c) != '\0') {
          if ((*(long *)(lVar30 + 0x20) == 0) || (plVar23 == (long *)0x0)) goto code_r0x098551bc;
          lVar33 = *plVar23;
          uVar15 = *(undefined4 *)(lVar30 + 0x30);
          uVar5 = *(undefined4 *)(*(long *)(lVar30 + 0x20) + 0x38);
          uVar27 = (ulong)*(ushort *)(lVar33 + 0x12e);
          if (uVar27 != 0) {
            piVar36 = (int *)(*(long *)(lVar33 + 0xb0) + 8);
            do {
              if (*(long *)(piVar36 + -2) == *(long *)puVar43) {
                puVar19 = (undefined8 *)(lVar33 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                goto code_r0x098550e4;
              }
              uVar27 = uVar27 - 1;
              piVar36 = piVar36 + 4;
            } while (uVar27 != 0);
          }
          puVar19 = (undefined8 *)func_0x041cb4c4(plVar23,*(long *)puVar43,6);
code_r0x098550e4:
          uVar26 = puVar19[1];
          (*(code *)*puVar19)(puVar14 + -0xc0,plVar23,uVar5);
          lVar30 = *(long *)puVar39;
          *(undefined8 *)(puVar14 + -0x88) = *(undefined8 *)(puVar14 + -0xb8);
          *(undefined8 *)(puVar14 + -0x90) = *(undefined8 *)(puVar14 + -0xc0);
          *(undefined8 *)(puVar14 + -0x78) = *(undefined8 *)(puVar14 + -0xa8);
          *(undefined8 *)(puVar14 + -0x80) = *(undefined8 *)(puVar14 + -0xb0);
          *(undefined8 *)(puVar14 + -0x68) = *(undefined8 *)(puVar14 + -0x98);
          *(undefined8 *)(puVar14 + -0x70) = *(undefined8 *)(puVar14 + -0xa0);
          if (*(int *)(lVar30 + 0xe0) == 0) {
            func_0x04151a94();
          }
          auVar59._8_8_ = uVar40;
          auVar59._0_8_ = uVar26;
          if (*(int *)(puVar14 + -0x78) == auVar63._0_4_) {
            if (*(int *)(*(long *)puVar39 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar59 = func_0x091dc794(puVar14 + -0x90,uVar15,0);
            if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar60 = func_0x09774360(auVar60._0_8_,auVar60._8_8_,auVar59._0_8_,auVar59._8_8_,0);
          }
        }
        uVar27 = (ulong)*(uint *)(lVar18 + 0x18);
        uVar41 = uVar41 + 1;
      } while ((long)uVar41 < (long)(int)*(uint *)(lVar18 + 0x18));
    }
    return auVar60;
  }
code_r0x098551bc:
  func_0x04151bb8();
code_r0x098551c0:
  auVar45 = func_0x04151bc0();
  plVar42 = auVar45._8_8_;
  plVar37 = auVar45._0_8_;
  *(undefined **)(puVar14 + -0xf0) =
       &WithNetwork_WeaponStatusCalculator__CalculateTotalWeaponEquipmentEffectStatusValue;
  *(undefined1 (*) [16])(puVar14 + -0xe8) = auVar60;
  *(undefined1 (*) [16])(puVar14 + -0xd8) = auVar58;
  *(ulong *)(puVar14 + -200) = auVar63._0_8_ & 0xffffffff;
  if ((bRam000000000a46e20e & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f46a88);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e20e = 1;
  }
  *(undefined8 *)(puVar14 + -0x108) = 0;
  *(undefined8 *)(puVar14 + -0x110) = 0;
  *(undefined8 *)(puVar14 + -0xf8) = 0;
  *(undefined8 *)(puVar14 + -0x100) = 0;
  *(undefined8 *)(puVar14 + -0x118) = 0;
  *(undefined8 *)(puVar14 + -0x120) = 0;
  if (iVar17 == 0) {
code_r0x09855384:
    puVar39 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar18 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if (*(int *)(lVar18 + 0xe0) == 0) {
      func_0x04151a94();
      lVar18 = *(long *)puVar39;
    }
    return **(undefined1 (**) [16])(lVar18 + 0xb8);
  }
  if (plVar42 != (long *)0x0) {
    lVar18 = *plVar42;
    uVar41 = (ulong)*(ushort *)(lVar18 + 0x12e);
    if (uVar41 != 0) {
      piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
      do {
        if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f46a88) {
          puVar19 = (undefined8 *)(lVar18 + (long)(*piVar36 + 6) * 0x10 + 0x138);
          goto code_r0x09855294;
        }
        uVar41 = uVar41 - 1;
        piVar36 = piVar36 + 4;
      } while (uVar41 != 0);
    }
    puVar19 = (undefined8 *)func_0x041cb4c4(plVar42,*(long *)PTR_DAT_09f46a88,6);
code_r0x09855294:
    (*(code *)*puVar19)(puVar14 + -0x158,plVar42,iVar17,puVar19[1]);
    puVar39 = PTR_DAT_09ec4a50;
    if ((*(long *)(puVar14 + -0x158) != 0) && (plVar37 != (long *)0x0)) {
      lVar18 = *plVar37;
      uVar15 = *(undefined4 *)(puVar14 + -0x148);
      uVar5 = *(undefined4 *)(*(long *)(puVar14 + -0x158) + 0x3c);
      uVar41 = (ulong)*(ushort *)(lVar18 + 0x12e);
      if (uVar41 != 0) {
        piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
        do {
          if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f470e0) {
            puVar19 = (undefined8 *)(lVar18 + (long)(*piVar36 + 6) * 0x10 + 0x138);
            goto code_r0x0985531c;
          }
          uVar41 = uVar41 - 1;
          piVar36 = piVar36 + 4;
        } while (uVar41 != 0);
      }
      puVar19 = (undefined8 *)func_0x041cb4c4(plVar37,*(long *)PTR_DAT_09f470e0,6);
code_r0x0985531c:
      (*(code *)*puVar19)(puVar14 + -0x158,plVar37,uVar5,puVar19[1]);
      lVar18 = *(long *)puVar39;
      *(undefined8 *)(puVar14 + -0x118) = *(undefined8 *)(puVar14 + -0x150);
      *(undefined8 *)(puVar14 + -0x120) = *(undefined8 *)(puVar14 + -0x158);
      *(undefined8 *)(puVar14 + -0x108) = *(undefined8 *)(puVar14 + -0x140);
      *(undefined8 *)(puVar14 + -0x110) = *(undefined8 *)(puVar14 + -0x148);
      *(undefined8 *)(puVar14 + -0xf8) = *(undefined8 *)(puVar14 + -0x130);
      *(undefined8 *)(puVar14 + -0x100) = *(undefined8 *)(puVar14 + -0x138);
      if (*(int *)(lVar18 + 0xe0) == 0) {
        func_0x04151a94();
      }
      if (*(int *)(puVar14 + -0x108) == (int)uVar40) {
        if (*(int *)(*(long *)puVar39 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar45 = func_0x091dc794(puVar14 + -0x120,uVar15,0);
        return auVar45;
      }
      goto code_r0x09855384;
    }
  }
  func_0x04151bb8();
  puVar39 = PTR_DAT_09f7fb10;
  *(undefined **)(puVar14 + -0x180) = &UNK_098553c0;
  *(long **)(puVar14 + -0x170) = plVar37;
  *(ulong *)(puVar14 + -0x168) = uVar40 & 0xffffffff;
  uVar26 = extraout_x1;
  if ((bRam000000000a46e20f & 1) == 0) {
    func_0x0415191c(PTR_DAT_09f7fb10);
    bRam000000000a46e20f = 1;
    uVar26 = extraout_x1_00;
  }
  lVar18 = *(long *)puVar39;
  if (*(int *)(lVar18 + 0xe0) == 0) {
    func_0x04151a94();
    lVar18 = *(long *)puVar39;
    uVar26 = extraout_x1_01;
  }
  auVar61._4_4_ = 0;
  auVar61._0_4_ = **(uint **)(lVar18 + 0xb8);
  auVar61._8_8_ = uVar26;
  return auVar61;
code_r0x09853ff0:
  if (*(int *)(pcVar13 + -0x388) == 0) {
    if (*(long **)(pcVar13 + -0x390) == (long *)0x0) {
      uVar41 = func_0x04151bb8();
      goto code_r0x098544a0;
    }
    lVar18 = **(long **)(pcVar13 + -0x390);
    uVar15 = *(undefined4 *)((long)plVar21 + 0x24);
    uVar41 = (ulong)*(ushort *)(lVar18 + 0x12e);
    if (uVar41 != 0) {
      piVar36 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
      do {
        if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f470e0) {
          puVar19 = (undefined8 *)(lVar18 + (long)(*piVar36 + 6) * 0x10 + 0x138);
          goto code_r0x09854228;
        }
        uVar41 = uVar41 - 1;
        piVar36 = piVar36 + 4;
      } while (uVar41 != 0);
    }
    puVar19 = (undefined8 *)
              func_0x041cb4c4(*(undefined8 *)(pcVar13 + -0x390),*(long *)PTR_DAT_09f470e0,6);
code_r0x09854228:
    uVar28 = puVar19[1];
    (*(code *)*puVar19)(pcVar13 + -0x330,*(undefined8 *)(pcVar13 + -0x390),uVar15);
    *(undefined8 *)(pcVar13 + -0x278) = *(undefined8 *)(pcVar13 + -0x328);
    *(undefined8 *)(pcVar13 + -0x280) = *(undefined8 *)(pcVar13 + -0x330);
    *(undefined8 *)(pcVar13 + -0x268) = *(undefined8 *)(pcVar13 + -0x318);
    *(undefined8 *)(pcVar13 + -0x270) = *(undefined8 *)(pcVar13 + -800);
    *(undefined8 *)(pcVar13 + -600) = *(undefined8 *)(pcVar13 + -0x308);
    *(undefined8 *)(pcVar13 + -0x260) = *(undefined8 *)(pcVar13 + -0x310);
    if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
      func_0x04151a94();
    }
    auVar50._8_8_ = uVar40;
    auVar50._0_8_ = uVar28;
    if (*(int *)(pcVar13 + -0x268) == *(int *)(pcVar13 + -900)) {
      if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
        func_0x04151a94();
      }
      auVar45 = func_0x091dc794(pcVar13 + -0x280,uVar27,0);
      uVar27 = auVar45._8_8_;
      if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
        func_0x04151a94();
      }
      auVar50 = func_0x097744cc(auVar45._0_8_,uVar27,auVar52._0_8_,uVar26,0);
      auVar45 = func_0x09774360(*(undefined8 *)(pcVar13 + -0x3a0),*(undefined8 *)(pcVar13 + -0x3a8),
                                auVar50._0_8_,auVar50._8_8_,0);
code_r0x098542e8:
      *(long *)(pcVar13 + -0x3a8) = auVar45._8_8_;
      *(long *)(pcVar13 + -0x3a0) = auVar45._0_8_;
    }
  }
  goto code_r0x09853e40;
}


```

## TreasureStatusCalculator.CalculateConstantStatus(DataTableContainer dataTableContainer, BaseStatusEvaluateConditionEvaluateDelegate evaluateDelegate, StatusType statusTy)

```c

/* WARNING: Possible PIC construction at 0x0985335c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0985453c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09854708: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09854798: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0985470c) */
/* WARNING: Removing unreachable block (ram,0x09854710) */
/* WARNING: Removing unreachable block (ram,0x09854738) */
/* WARNING: Removing unreachable block (ram,0x09854740) */
/* WARNING: Removing unreachable block (ram,0x09854768) */
/* WARNING: Removing unreachable block (ram,0x0985474c) */
/* WARNING: Removing unreachable block (ram,0x09854758) */
/* WARNING: Removing unreachable block (ram,0x09854778) */
/* WARNING: Removing unreachable block (ram,0x09854540) */
/* WARNING: Removing unreachable block (ram,0x09853360) */
/* WARNING: Removing unreachable block (ram,0x098533a8) */
/* WARNING: Removing unreachable block (ram,0x098533ac) */
/* WARNING: Removing unreachable block (ram,0x0985479c) */
/* WARNING: Removing unreachable block (ram,0x098547b0) */
/* WARNING: Removing unreachable block (ram,0x098547b4) */
/* WARNING: Removing unreachable block (ram,0x091d1720) */
/* WARNING: Removing unreachable block (ram,0x09853984) */
/* WARNING: Removing unreachable block (ram,0x0985398c) */

undefined1  [16]
WithNetwork_TreasureStatusCalculator__CalculateConstantStatus
          (long param_1,undefined8 param_2,ulong param_3,long *param_4,ulong param_5,long *param_6,
          undefined8 param_7,undefined4 param_8)

{
  uint uVar1;
  undefined4 uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  long *plVar14;
  undefined **ppuVar15;
  undefined4 uVar16;
  long lVar19;
  undefined8 *puVar20;
  long *plVar21;
  long *plVar22;
  long *plVar23;
  long *plVar24;
  int iVar17;
  int iVar18;
  undefined *puVar25;
  long *plVar26;
  long lVar27;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  ulong uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined1 (*pauVar33) [16];
  long *plVar34;
  long lVar35;
  undefined8 extraout_x8;
  undefined *extraout_x8_00;
  int *piVar36;
  ulong uVar37;
  int *piVar38;
  ulong uVar39;
  ulong uVar40;
  long *plVar41;
  long *plVar42;
  long *unaff_x26;
  long *unaff_x27;
  long *plVar43;
  undefined8 unaff_x28;
  undefined8 unaff_x29;
  undefined *puVar44;
  undefined *puVar45;
  undefined *puVar46;
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined1 auVar52 [16];
  undefined1 auVar53 [16];
  undefined1 auVar54 [16];
  undefined1 auVar55 [16];
  undefined1 auVar56 [16];
  undefined1 auVar57 [16];
  undefined1 auVar58 [16];
  undefined1 auVar59 [16];
  undefined1 auVar60 [16];
  undefined1 auVar61 [16];
  undefined1 auVar62 [16];
  undefined1 auVar63 [16];
  undefined1 auVar64 [12];
  undefined1 auVar65 [16];
  undefined1 auStack_6d0 [8];
  long *plStack_6c8;
  undefined8 uStack_6c0;
  undefined8 uStack_6b8;
  long lStack_6b0;
  long lStack_6a8;
  undefined8 uStack_6a0;
  undefined8 uStack_698;
  undefined8 uStack_690;
  undefined8 uStack_688;
  undefined8 uStack_680;
  undefined8 uStack_678;
  long lStack_670;
  undefined8 uStack_668;
  undefined8 uStack_660;
  undefined8 uStack_658;
  undefined8 uStack_650;
  undefined8 uStack_648;
  long lStack_640;
  undefined8 uStack_638;
  undefined8 uStack_630;
  undefined8 uStack_628;
  undefined8 uStack_620;
  undefined8 uStack_618;
  undefined8 uStack_610;
  long *plStack_600;
  undefined *puStack_5f8;
  undefined *puStack_5f0;
  long *plStack_5e8;
  long *plStack_5e0;
  undefined8 uStack_5d8;
  undefined8 uStack_5d0;
  long *plStack_5c8;
  undefined1 auStack_5c0 [16];
  long *plStack_5b0;
  undefined8 uStack_5a8;
  undefined8 uStack_5a0;
  undefined8 uStack_598;
  undefined8 uStack_590;
  undefined8 uStack_588;
  undefined8 uStack_580;
  undefined8 uStack_578;
  undefined8 uStack_570;
  undefined8 uStack_568;
  undefined8 uStack_560;
  undefined8 uStack_558;
  undefined8 uStack_550;
  undefined8 uStack_548;
  long *plStack_540;
  undefined *puStack_538;
  undefined *puStack_530;
  long *plStack_528;
  long *plStack_520;
  long *plStack_518;
  long lStack_510;
  long *plStack_508;
  undefined8 uStack_500;
  ulong uStack_4f8;
  undefined *puStack_4f0;
  long *plStack_4e8;
  undefined *puStack_4e0;
  long *plStack_4d8;
  long *plStack_4d0;
  long *plStack_4c8;
  long lStack_4c0;
  long *plStack_4b8;
  undefined *puStack_4b0;
  long *plStack_4a8;
  undefined *puStack_4a0;
  undefined8 uStack_498;
  int aiStack_490 [8];
  undefined *puStack_470;
  undefined *puStack_460;
  ulong uStack_458;
  undefined8 uStack_448;
  undefined4 uStack_43c;
  long lStack_438;
  ulong uStack_430;
  long *plStack_428;
  long *plStack_420;
  undefined8 uStack_418;
  long *plStack_410;
  undefined8 uStack_408;
  long *plStack_400;
  int iStack_3f8;
  int iStack_3f4;
  undefined8 uStack_3f0;
  undefined8 uStack_3e8;
  undefined8 uStack_3e0;
  undefined8 uStack_3d0;
  undefined8 uStack_3c8;
  undefined8 uStack_3c0;
  undefined8 uStack_3b8;
  undefined8 uStack_3b0;
  undefined8 uStack_3a8;
  undefined8 uStack_3a0;
  undefined8 uStack_398;
  undefined8 uStack_390;
  undefined8 uStack_388;
  undefined8 uStack_380;
  undefined8 uStack_378;
  undefined8 uStack_340;
  undefined8 uStack_338;
  undefined8 uStack_330;
  undefined8 uStack_320;
  undefined8 uStack_318;
  undefined8 uStack_310;
  undefined8 uStack_308;
  undefined8 uStack_300;
  undefined8 uStack_2f8;
  undefined8 uStack_2f0;
  undefined8 uStack_2e8;
  undefined8 uStack_2e0;
  undefined8 uStack_2d8;
  undefined8 uStack_2d0;
  undefined8 uStack_2c8;
  undefined1 auStack_2c0 [16];
  undefined8 uStack_2b0;
  undefined8 uStack_2a8;
  undefined8 uStack_2a0;
  undefined8 uStack_298;
  undefined8 uStack_290;
  undefined8 uStack_288;
  long *plStack_280;
  ulong uStack_278;
  undefined8 uStack_270;
  undefined8 uStack_268;
  undefined8 uStack_260;
  undefined8 uStack_258;
  long *plStack_250;
  undefined *puStack_248;
  undefined8 uStack_240;
  long *plStack_238;
  long *plStack_230;
  long *plStack_228;
  long *plStack_220;
  long *plStack_218;
  undefined *puStack_210;
  long *plStack_208;
  ulong uStack_200;
  ulong uStack_1f8;
  long *plStack_1e0;
  undefined4 uStack_1d4;
  long *plStack_1d0;
  long *plStack_1c8;
  undefined8 uStack_1c0;
  undefined8 uStack_1b8;
  undefined1 auStack_1b0 [16];
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined1 auStack_170 [16];
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  long *plStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined *puStack_c8;
  undefined8 uStack_c0;
  
  uVar39 = param_5 & 0xffffffff;
  uVar40 = param_3 & 0xffffffff;
  if ((bRam000000000a46e207 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(
                   PTR_Method_WithNetwork_DataTableContainer_GetOrCreateTable_u003CLevelRangeValueGroup_u003E___09f7f990
                   );
    func_0x0415191c(PTR_DAT_09f4b430);
    func_0x0415191c(PTR_DAT_09f7fae0);
    bRam000000000a46e207 = 1;
  }
  puVar46 = 
  PTR_Method_WithNetwork_DataTableContainer_GetOrCreateTable_u003CLevelRangeValueGroup_u003E___09f7f990
  ;
  puVar44 = PTR_DAT_09f4b430;
  if (param_1 == 0) {
    puVar44 = &
              WithNetwork_TreasureStatusCalculator__CalculateTotalTreasurePossessionEffectStatusValue
    ;
    auVar47 = func_0x04151bb8();
  }
  else {
    unaff_x28 = func_0x053c3cc0(param_1,*(undefined8 *)PTR_DAT_09f7fae0);
    unaff_x29 = func_0x053c2424(param_1,*(undefined8 *)puVar44);
    auVar47._8_8_ = unaff_x29;
    auVar47._0_8_ = unaff_x28;
    param_4 = (long *)func_0x053c1484(param_1,*(undefined8 *)puVar46);
    puVar44 = &UNK_09853360;
    param_3 = uVar40;
    param_5 = uVar39;
    unaff_x26 = (long *)puVar46;
  }
  plVar41 = (long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  plVar26 = auVar47._8_8_;
  plVar24 = auVar47._0_8_;
  uVar39 = param_5 & 0xffffffff;
  uVar28 = param_3;
  plVar34 = param_4;
  uVar40 = param_5;
  uStack_d0 = unaff_x29;
  puStack_c8 = puVar44;
  uStack_c0 = unaff_x28;
  if ((bRam000000000a46e208 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_WithNetwork_IDataTable_u003CLevelRangeValueGroup_u003E_TypeInfo_09f4b580);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09f49098);
    func_0x0415191c(PTR_DAT_09eaa288);
    func_0x0415191c(PTR_DAT_09f54820);
    func_0x0415191c(PTR_DAT_09f54828);
    func_0x0415191c(PTR_DAT_09eaa8d0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e208 = 1;
  }
  lVar19 = *plVar41;
  uStack_e8 = 0;
  uStack_f0 = 0;
  uStack_d8 = 0;
  uStack_e0 = 0;
  plStack_108 = (long *)0x0;
  uStack_110 = 0;
  uStack_f8 = 0;
  uStack_100 = 0;
  uStack_128 = 0;
  uStack_130 = 0;
  uStack_118 = 0;
  uStack_120 = 0;
  uStack_148 = 0;
  uStack_150 = 0;
  uStack_138 = 0;
  uStack_140 = 0;
  uStack_158 = 0;
  uStack_160 = 0;
  auStack_170._0_8_ = 0;
  auStack_170._8_8_ = 0;
  if (*(int *)(lVar19 + 0xe0) == 0) {
    func_0x04151a94();
    lVar19 = *plVar41;
  }
  auVar50._8_8_ = plVar34;
  auVar50._0_8_ = uVar28;
  iVar18 = (int)param_7;
  pauVar33 = *(undefined1 (**) [16])(lVar19 + 0xb8);
  uStack_1b8 = *(undefined8 *)*pauVar33;
  uStack_1c0 = *(undefined8 *)(*pauVar33 + 8);
  if ((int)param_5 != 0) {
    return *pauVar33;
  }
  puVar44 = (undefined *)0xa46e000;
  if (plVar24 != (long *)0x0) {
    lVar19 = *plVar24;
    uVar37 = (ulong)*(ushort *)(lVar19 + 0x12e);
    if (uVar37 != 0) {
      piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
      do {
        if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f49098) {
          puVar20 = (undefined8 *)(lVar19 + (long)(*piVar36 + 7) * 0x10 + 0x138);
          goto code_r0x09853598;
        }
        uVar37 = uVar37 - 1;
        piVar36 = piVar36 + 4;
      } while (uVar37 != 0);
    }
    uVar28 = 7;
    puVar20 = (undefined8 *)func_0x041cb4c4(plVar24);
code_r0x09853598:
    plVar21 = (long *)(*(code *)*puVar20)(plVar24,puVar20[1]);
    puVar46 = PTR_DAT_09f54828;
    plVar22 = (long *)PTR_DAT_09f470e0;
    plVar23 = (long *)PTR_DAT_09ec4a50;
    plVar43 = (long *)PTR_DAT_09eaa8d0;
    auVar13._8_8_ = uStack_1c0;
    auVar13._0_8_ = uStack_1b8;
    auVar50._8_8_ = plVar34;
    auVar50._0_8_ = uVar28;
    iVar18 = (int)param_7;
    if (plVar21 != (long *)0x0) {
      if ((int)plVar21[3] < 1) {
        return auVar13;
      }
      plVar41 = (long *)0x0;
      plVar34 = (long *)(plVar21[3] & 0xffffffff);
      plStack_1e0 = plVar21;
      plStack_1c8 = param_4;
      while( true ) {
        uStack_1c0 = auVar13._8_8_;
        uStack_1b8 = auVar13._0_8_;
        uVar30 = auVar50._8_8_;
        auVar49._8_8_ = unaff_x28;
        auVar49._0_8_ = unaff_x29;
        iVar18 = (int)param_7;
        puVar44 = puVar46;
        param_4 = plVar22;
        plVar24 = plVar21;
        unaff_x26 = plVar23;
        unaff_x27 = plVar43;
        if (plVar34 <= plVar41) break;
        uVar29 = 0x60;
        func_0x098f6f40(&uStack_130,plVar21 + (long)plVar41 * 0xc + 4);
        plVar34 = plStack_108;
        auVar13._8_8_ = uStack_1c0;
        auVar13._0_8_ = uStack_1b8;
        auVar50._8_8_ = uVar30;
        auVar50._0_8_ = uVar29;
        auVar48._8_8_ = plVar21;
        auVar48._0_8_ = plStack_108;
        iVar18 = (int)param_7;
        plVar42 = plVar41;
        if ((char)uStack_e0 != '\0') {
          uVar39 = 0;
          if (plStack_108 == (long *)0x0) goto code_r0x09853a44;
          lVar19 = *plStack_108;
          uStack_1d4 = (undefined4)uStack_f8;
          uVar39 = (ulong)*(ushort *)(lVar19 + 0x12e);
          plStack_1d0 = plVar41;
          if (uVar39 != 0) {
            piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
            do {
              if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f54820) {
                puVar20 = (undefined8 *)(lVar19 + (long)*piVar36 * 0x10 + 0x138);
                goto code_r0x09853680;
              }
              uVar39 = uVar39 - 1;
              piVar36 = piVar36 + 4;
            } while (uVar39 != 0);
          }
          uVar29 = 0;
          puVar20 = (undefined8 *)func_0x041cb4c4(plStack_108);
code_r0x09853680:
          plVar41 = (long *)(*(code *)*puVar20)(plVar34,puVar20[1]);
          auVar50._8_8_ = uVar30;
          auVar50._0_8_ = uVar29;
          auVar51._8_8_ = uStack_1c0;
          auVar51._0_8_ = uStack_1b8;
code_r0x0985369c:
          uVar30 = auVar50._8_8_;
          unaff_x28 = auVar49._8_8_;
          plVar34 = auVar49._0_8_;
          plVar24 = auVar48._8_8_;
          uVar39 = auVar48._0_8_;
          iVar18 = (int)param_7;
          auStack_1b0 = auVar51;
          if (plVar41 == (long *)0x0) {
            unaff_x28 = func_0x04151bb8();
            goto code_r0x09853a5c;
          }
          lVar19 = *plVar41;
          uVar28 = (ulong)*(ushort *)(lVar19 + 0x12e);
          if (uVar28 != 0) {
            piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
            do {
              if (*(long *)(piVar36 + -2) == *plVar43) {
                puVar20 = (undefined8 *)(lVar19 + (long)*piVar36 * 0x10 + 0x138);
                goto code_r0x098536ec;
              }
              uVar28 = uVar28 - 1;
              piVar36 = piVar36 + 4;
            } while (uVar28 != 0);
          }
          uVar29 = 0;
          puVar20 = (undefined8 *)func_0x041cb4c4(plVar41);
          auVar50._8_8_ = uVar30;
          auVar50._0_8_ = uVar29;
          auVar51 = auStack_1b0;
code_r0x098536ec:
          auStack_1b0 = auVar51;
          uVar28 = (*(code *)*puVar20)(plVar41,puVar20[1]);
          uVar30 = auVar50._8_8_;
          if ((uVar28 & 1) != 0) {
            lVar19 = *plVar41;
            uVar28 = (ulong)*(ushort *)(lVar19 + 0x12e);
            if (uVar28 != 0) {
              piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
              do {
                if (*(long *)(piVar36 + -2) == *(long *)puVar46) {
                  puVar20 = (undefined8 *)(lVar19 + (long)*piVar36 * 0x10 + 0x138);
                  goto code_r0x09853748;
                }
                uVar28 = uVar28 - 1;
                piVar36 = piVar36 + 4;
              } while (uVar28 != 0);
            }
            uVar29 = 0;
            puVar20 = (undefined8 *)func_0x041cb4c4(plVar41);
            auVar50._8_8_ = uVar30;
            auVar50._0_8_ = uVar29;
code_r0x09853748:
            plVar34 = (long *)(*(code *)*puVar20)(plVar41,puVar20[1]);
            uVar30 = auVar50._8_8_;
            auVar49._8_8_ = unaff_x28;
            auVar49._0_8_ = plVar34;
            iVar18 = (int)param_7;
            if (plVar34 == (long *)0x0) {
              unaff_x28 = func_0x04151bb8();
              goto code_r0x09853a5c;
            }
            if (plVar26 == (long *)0x0) {
              unaff_x28 = func_0x04151bb8();
              goto code_r0x09853a5c;
            }
            lVar19 = *plVar26;
            uVar39 = CONCAT44(0,*(uint *)(plVar34 + 4));
            auVar48._8_8_ = plVar24;
            auVar48._0_8_ = uVar39;
            uVar28 = (ulong)*(ushort *)(lVar19 + 0x12e);
            if (uVar28 != 0) {
              piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
              do {
                if (*(long *)(piVar36 + -2) == *plVar22) {
                  puVar20 = (undefined8 *)(lVar19 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                  goto code_r0x098537b4;
                }
                uVar28 = uVar28 - 1;
                piVar36 = piVar36 + 4;
              } while (uVar28 != 0);
            }
            puVar20 = (undefined8 *)func_0x041cb4c4(plVar26,*plVar22,6);
code_r0x098537b4:
            uVar29 = puVar20[1];
            (*(code *)*puVar20)(&uStack_1a0,plVar26,uVar39);
            uStack_158 = uStack_198;
            uStack_160 = uStack_1a0;
            uStack_148 = uStack_188;
            uStack_150 = uStack_190;
            uStack_138 = uStack_178;
            uStack_140 = uStack_180;
            auVar51 = auStack_1b0;
            if (*(int *)(*plVar23 + 0xe0) == 0) {
              func_0x04151a94();
              auVar51 = auStack_1b0;
            }
            auVar50._8_8_ = uVar30;
            auVar50._0_8_ = uVar29;
            if ((int)uStack_148 == (int)param_3) {
              auStack_1b0 = auVar51;
              if (*(int *)(*plVar23 + 0xe0) == 0) {
                func_0x04151a94();
              }
              uVar29 = 0;
              auVar48 = func_0x091dc794(&uStack_160,uStack_1d4);
              iVar18 = (int)param_7;
              if (plStack_1c8 == (long *)0x0) {
                unaff_x28 = func_0x04151bb8();
                auVar50._8_8_ = uVar30;
                auVar50._0_8_ = uVar29;
                goto code_r0x09853a5c;
              }
              lVar19 = *plStack_1c8;
              uVar16 = *(undefined4 *)((long)plVar34 + 0x24);
              uVar39 = (ulong)*(ushort *)(lVar19 + 0x12e);
              if (uVar39 != 0) {
                piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar36 + -2) ==
                      *(long *)
                       PTR_WithNetwork_IDataTable_u003CLevelRangeValueGroup_u003E_TypeInfo_09f4b580)
                  {
                    puVar20 = (undefined8 *)(lVar19 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                    goto code_r0x09853880;
                  }
                  uVar39 = uVar39 - 1;
                  piVar36 = piVar36 + 4;
                } while (uVar39 != 0);
              }
              puVar20 = (undefined8 *)
                        func_0x041cb4c4(plStack_1c8,
                                        *(long *)
                                         PTR_WithNetwork_IDataTable_u003CLevelRangeValueGroup_u003E_TypeInfo_09f4b580
                                        ,6);
code_r0x09853880:
              auVar47 = (*(code *)*puVar20)(plStack_1c8,uVar16,puVar20[1]);
              auStack_170 = auVar47;
              uVar16 = func_0x091ce808(&uStack_130,0);
              auVar49 = func_0x091d4b70(auStack_170,uVar16,0);
              if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar50 = func_0x097744cc(auVar48._0_8_,auVar48._8_8_,auVar49._0_8_,auVar49._8_8_,0);
              uVar40 = 0;
              auVar51 = func_0x09774360(auStack_1b0._0_8_,auStack_1b0._8_8_);
            }
            goto code_r0x0985369c;
          }
          unaff_x29 = 0;
          uVar39 = 5;
          plVar21 = plStack_1e0;
          plVar42 = plStack_1d0;
          auVar13 = auStack_1b0;
          if (plVar41 != (long *)0x0) {
            lVar19 = *plVar41;
            uVar28 = (ulong)*(ushort *)(lVar19 + 0x12e);
            if (uVar28 != 0) {
              piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
              do {
                if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09eaa288) {
                  puVar20 = (undefined8 *)(lVar19 + (long)*piVar36 * 0x10 + 0x138);
                  goto code_r0x09853964;
                }
                uVar28 = uVar28 - 1;
                piVar36 = piVar36 + 4;
              } while (uVar28 != 0);
            }
            uVar29 = 0;
            puVar20 = (undefined8 *)func_0x041cb4c4(plVar41);
            auVar50._8_8_ = uVar30;
            auVar50._0_8_ = uVar29;
code_r0x09853964:
            (*(code *)*puVar20)(plVar41,puVar20[1]);
            plVar21 = plStack_1e0;
            plVar42 = plStack_1d0;
            auVar13 = auStack_1b0;
          }
        }
        plVar34 = (long *)(ulong)*(uint *)(plVar21 + 3);
        plVar41 = (long *)((long)plVar42 + 1);
        if ((long)(int)*(uint *)(plVar21 + 3) <= (long)plVar41) {
          return auVar13;
        }
      }
      func_0x04151bc0();
    }
  }
code_r0x09853a44:
  func_0x04151bb8();
  func_0x04151bb0(unaff_x29);
  plVar34 = (long *)0x0;
  puVar46 = puVar44;
  plVar22 = param_4;
  plVar23 = unaff_x26;
  plVar43 = unaff_x27;
code_r0x09853a5c:
  uVar30 = auVar50._8_8_;
  if (plVar41 != (long *)0x0) {
    lVar19 = *plVar41;
    uVar28 = (ulong)*(ushort *)(lVar19 + 0x12e);
    if (uVar28 != 0) {
      piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
      do {
        if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09eaa288) {
          puVar20 = (undefined8 *)(lVar19 + (long)*piVar36 * 0x10 + 0x138);
          goto code_r0x09853ab4;
        }
        uVar28 = uVar28 - 1;
        piVar36 = piVar36 + 4;
      } while (uVar28 != 0);
    }
    uVar29 = 0;
    puVar20 = (undefined8 *)func_0x041cb4c4(plVar41);
    auVar50._8_8_ = uVar30;
    auVar50._0_8_ = uVar29;
code_r0x09853ab4:
    (*(code *)*puVar20)(plVar41,puVar20[1]);
  }
  if (plVar34 == (long *)0x0) {
    func_0x04247ab0(unaff_x28);
  }
  func_0x04151bb0(plVar34);
  auVar52 = func_0x03bf6574();
  puVar44 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  uStack_448 = auVar50._0_8_;
  puStack_248 = &
                WithNetwork_TreasureStatusCalculator__CalculateTotalTreasureEquipmentEffectStatusValue
  ;
  iStack_3f4 = auVar50._8_4_;
  uStack_43c = param_8;
  iStack_3f8 = iVar18;
  plStack_250 = plVar34;
  uStack_240 = unaff_x28;
  plStack_238 = plVar43;
  plStack_230 = plVar23;
  plStack_228 = plVar41;
  plStack_220 = plVar24;
  plStack_218 = plVar22;
  puStack_210 = puVar46;
  plStack_208 = plVar26;
  uStack_200 = param_3 & 0xffffffff;
  uStack_1f8 = uVar39;
  if ((bRam000000000a46e209 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09eca930);
    func_0x0415191c(PTR_DAT_09f7e928);
    func_0x0415191c(PTR_DAT_09f7f928);
    func_0x0415191c(PTR_DAT_09f7fae8);
    func_0x0415191c(PTR_WithNetwork_IDataTable_u003CLevelRangeValueGroup_u003E_TypeInfo_09f4b580);
    func_0x0415191c(PTR_DAT_09f7faf0);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09f49098);
    func_0x0415191c(PTR_DAT_09f473c8);
    func_0x0415191c(PTR_DAT_09f462e0);
    func_0x0415191c(PTR_DAT_09eaa288);
    func_0x0415191c(PTR_DAT_09f54788);
    func_0x0415191c(PTR_DAT_09f54790);
    func_0x0415191c(PTR_DAT_09eaa8d0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e209 = 1;
  }
  lVar19 = *(long *)puVar44;
  auStack_2c0._0_8_ = 0;
  auStack_2c0._8_8_ = 0;
  uStack_268 = 0;
  uStack_270 = 0;
  uStack_258 = 0;
  uStack_260 = 0;
  uStack_288 = 0;
  uStack_290 = 0;
  uStack_278 = 0;
  plStack_280 = (long *)0x0;
  uStack_2a8 = 0;
  uStack_2b0 = 0;
  uStack_298 = 0;
  uStack_2a0 = 0;
  uStack_2d8 = 0;
  uStack_2e0 = 0;
  uStack_2c8 = 0;
  uStack_2d0 = 0;
  uStack_2f8 = 0;
  uStack_300 = 0;
  uStack_2e8 = 0;
  uStack_2f0 = 0;
  uStack_318 = 0;
  uStack_320 = 0;
  uStack_308 = 0;
  uStack_310 = 0;
  uStack_340 = 0;
  uStack_338 = 0;
  uStack_330 = 0;
  if (*(int *)(lVar19 + 0xe0) == 0) {
    func_0x04151a94();
    lVar19 = *(long *)puVar44;
  }
  puVar25 = PTR_DAT_09f7f928;
  puVar46 = PTR_DAT_09f7e928;
  auVar7._8_8_ = uStack_430;
  auVar7._0_8_ = plStack_400;
  uVar39 = auVar50._8_8_;
  iVar18 = auVar50._0_4_;
  puVar45 = (undefined *)0xa46e000;
  if (uVar40 != 0) {
    plVar26 = (long *)**(undefined8 **)(lVar19 + 0xb8);
    uStack_408 = (*(undefined8 **)(lVar19 + 0xb8))[1];
    plVar22 = (long *)func_0x053bf800(uVar40,*(undefined8 *)PTR_DAT_09f7fae8);
    plVar23 = (long *)func_0x053bf1c0(uVar40,*(undefined8 *)puVar25);
    plVar24 = (long *)func_0x053beb1c(uVar40,*(undefined8 *)puVar46);
    auVar7._8_8_ = uStack_430;
    auVar7._0_8_ = plStack_400;
    uVar39 = auVar50._8_8_;
    iVar18 = auVar50._0_4_;
    puVar45 = puVar25;
    puVar44 = puVar46;
    plVar34 = plVar26;
    if (plVar22 != (long *)0x0) {
      lVar19 = *plVar22;
      uVar28 = (ulong)*(ushort *)(lVar19 + 0x12e);
      if (uVar28 != 0) {
        piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
        do {
          if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f7faf0) {
            puVar20 = (undefined8 *)(lVar19 + (long)(*piVar36 + 7) * 0x10 + 0x138);
            goto code_r0x09853cdc;
          }
          uVar28 = uVar28 - 1;
          piVar36 = piVar36 + 4;
        } while (uVar28 != 0);
      }
      uVar30 = 7;
      puVar20 = (undefined8 *)func_0x041cb4c4(plVar22);
      auVar50._8_8_ = uVar39;
      auVar50._0_8_ = uVar30;
code_r0x09853cdc:
      lVar19 = (*(code *)*puVar20)(plVar22,puVar20[1]);
      plVar21 = (long *)PTR_DAT_09f54790;
      puVar25 = PTR_WithNetwork_IDataTable_u003CLevelRangeValueGroup_u003E_TypeInfo_09f4b580;
      puVar46 = PTR_DAT_09eaa8d0;
      auVar7._8_8_ = uStack_430;
      auVar7._0_8_ = plStack_400;
      uVar39 = auVar50._8_8_;
      iVar18 = auVar50._0_4_;
      plVar43 = plVar24;
      if (lVar19 != 0) {
        uVar30 = uStack_408;
        if (0 < (int)*(ulong *)(lVar19 + 0x18)) {
          plVar22 = (long *)0x0;
          plVar41 = (long *)(*(ulong *)(lVar19 + 0x18) & 0xffffffff);
          lStack_438 = lVar19;
          auVar7 = auVar52;
          do {
            uStack_430 = auVar7._8_8_;
            plStack_400 = auVar7._0_8_;
            uVar39 = auVar50._8_8_;
            plVar42 = auVar52._8_8_;
            uVar28 = auVar52._0_8_;
            iVar18 = auVar50._0_4_;
            plVar34 = plVar26;
            if (plVar41 <= plVar22) goto code_r0x09854488;
            uVar1 = *(uint *)(lVar19 + (long)plVar22 * 0x10 + 0x28);
            uVar40 = (ulong)uVar1;
            uVar30 = uStack_408;
            if (uVar1 != 0) {
              puVar45 = puVar25;
              puVar44 = puVar46;
              plVar41 = plVar21;
              if (plVar42 == (long *)0x0) goto code_r0x09854484;
              lVar19 = *plVar42;
              uVar40 = (ulong)*(ushort *)(lVar19 + 0x12e);
              if (uVar40 != 0) {
                piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f49098) {
                    puVar20 = (undefined8 *)(lVar19 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                    goto code_r0x09853d9c;
                  }
                  uVar40 = uVar40 - 1;
                  piVar36 = piVar36 + 4;
                } while (uVar40 != 0);
              }
              puVar20 = (undefined8 *)func_0x041cb4c4(plVar42,*(long *)PTR_DAT_09f49098,6);
              auVar7._8_8_ = uStack_430;
              auVar7._0_8_ = plStack_400;
code_r0x09853d9c:
              uStack_430 = auVar7._8_8_;
              plStack_400 = auVar7._0_8_;
              (*(code *)*puVar20)(&uStack_3a0,plVar42,uVar1,puVar20[1]);
              uVar30 = 0x60;
              func_0x098f6ee0(&uStack_2b0,&uStack_3a0);
              plVar14 = plStack_280;
              auVar7._8_8_ = uStack_430;
              auVar7._0_8_ = plStack_400;
              auVar53._8_8_ = plVar42;
              auVar53._0_8_ = plStack_280;
              iVar18 = (int)uVar30;
              uVar40 = 0;
              if (plStack_280 == (long *)0x0) goto code_r0x09854484;
              lVar19 = *plStack_280;
              uVar40 = (ulong)*(ushort *)(lVar19 + 0x12e);
              plStack_428 = plVar22;
              plStack_420 = plVar26;
              if (uVar40 != 0) {
                piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f54788) {
                    puVar20 = (undefined8 *)(lVar19 + (long)*piVar36 * 0x10 + 0x138);
                    goto code_r0x09853e20;
                  }
                  uVar40 = uVar40 - 1;
                  piVar36 = piVar36 + 4;
                } while (uVar40 != 0);
              }
              uVar30 = 0;
              puVar20 = (undefined8 *)func_0x041cb4c4(plStack_280);
code_r0x09853e20:
              plVar34 = (long *)(*(code *)*puVar20)(plVar14,puVar20[1]);
              auVar50._8_8_ = uVar39;
              auVar50._0_8_ = uVar30;
              iVar18 = (int)uVar30;
              uStack_418 = uStack_408;
              plStack_410 = plStack_420;
              auVar54._8_8_ = uStack_408;
              auVar54._0_8_ = plStack_420;
              if (plVar34 == (long *)0x0) {
                uVar40 = func_0x04151bb8();
                goto code_r0x098544a0;
              }
code_r0x09853e40:
              uStack_418 = auVar54._8_8_;
              plStack_410 = auVar54._0_8_;
              uVar30 = auVar50._8_8_;
              auVar52._8_8_ = auVar53._8_8_;
              auVar52._0_8_ = uVar28;
              auVar10._8_8_ = auVar53._8_8_;
              auVar10._0_8_ = uVar28;
              uVar40 = auVar53._0_8_;
              lVar19 = *plVar34;
              uVar39 = (ulong)*(ushort *)(lVar19 + 0x12e);
              if (uVar39 != 0) {
                piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar36 + -2) == *(long *)puVar46) {
                    puVar20 = (undefined8 *)(lVar19 + (long)*piVar36 * 0x10 + 0x138);
                    goto code_r0x09853e8c;
                  }
                  uVar39 = uVar39 - 1;
                  piVar36 = piVar36 + 4;
                } while (uVar39 != 0);
              }
              uVar29 = 0;
              puVar20 = (undefined8 *)func_0x041cb4c4(plVar34);
              auVar54._8_8_ = uStack_418;
              auVar54._0_8_ = plStack_410;
              auVar50._8_8_ = uVar30;
              auVar50._0_8_ = uVar29;
code_r0x09853e8c:
              uStack_418 = auVar54._8_8_;
              plStack_410 = auVar54._0_8_;
              uVar28 = (*(code *)*puVar20)(plVar34,puVar20[1]);
              auVar7._8_8_ = uStack_430;
              auVar7._0_8_ = plStack_400;
              uVar39 = auVar50._8_8_;
              iVar18 = auVar50._0_4_;
              if ((uVar28 & 1) != 0) {
                lVar19 = *plVar34;
                uVar40 = (ulong)*(ushort *)(lVar19 + 0x12e);
                if (uVar40 != 0) {
                  piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
                  do {
                    if (*(long *)(piVar36 + -2) == *plVar21) {
                      puVar20 = (undefined8 *)(lVar19 + (long)*piVar36 * 0x10 + 0x138);
                      goto code_r0x09853ee8;
                    }
                    uVar40 = uVar40 - 1;
                    piVar36 = piVar36 + 4;
                  } while (uVar40 != 0);
                }
                iVar18 = 0;
                puVar20 = (undefined8 *)func_0x041cb4c4(plVar34);
code_r0x09853ee8:
                plVar22 = (long *)(*(code *)*puVar20)(plVar34,puVar20[1]);
                if (plVar22 == (long *)0x0) {
                  uVar40 = func_0x04151bb8();
                  goto code_r0x098544a0;
                }
                if (param_6 == (long *)0x0) {
                  uVar40 = func_0x04151bb8();
                  auVar52 = auVar10;
                  goto code_r0x098544a0;
                }
                lVar35 = *param_6;
                uVar28 = uStack_278 & 0xffffffff;
                lVar19 = plVar22[5];
                uVar40 = (ulong)*(ushort *)(lVar35 + 0x12e);
                if (uVar40 != 0) {
                  piVar36 = (int *)(*(long *)(lVar35 + 0xb0) + 8);
                  do {
                    if (*(long *)(piVar36 + -2) == *(long *)puVar25) {
                      puVar20 = (undefined8 *)(lVar35 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                      goto code_r0x09853f58;
                    }
                    uVar40 = uVar40 - 1;
                    piVar36 = piVar36 + 4;
                  } while (uVar40 != 0);
                }
                puVar20 = (undefined8 *)func_0x041cb4c4(param_6,*(long *)puVar25,6);
code_r0x09853f58:
                auVar47 = (*(code *)*puVar20)(param_6,(int)lVar19,puVar20[1]);
                auStack_2c0 = auVar47;
                uVar16 = func_0x091ce808(&uStack_2b0,0);
                uVar29 = 0;
                auVar53 = func_0x091d4b70(auStack_2c0,uVar16);
                auVar54._8_8_ = uStack_418;
                auVar54._0_8_ = plStack_410;
                auVar4._8_8_ = uStack_418;
                auVar4._0_8_ = plStack_410;
                auVar50._8_8_ = uVar39;
                auVar50._0_8_ = uVar29;
                auVar3._8_8_ = uVar39;
                auVar3._0_8_ = uVar29;
                uVar30 = auVar53._8_8_;
                auVar52._8_8_ = uVar30;
                auVar52._0_8_ = uVar28;
                auVar9._8_8_ = uVar30;
                auVar9._0_8_ = uVar28;
                auVar8._8_8_ = uVar30;
                auVar8._0_8_ = uVar28;
                iVar18 = (int)uVar29;
                if ((int)plVar22[4] == 0) {
                  if (iStack_3f8 == 0) {
                    if (plStack_400 == (long *)0x0) {
                      uVar40 = func_0x04151bb8();
                      goto code_r0x098544a0;
                    }
                    lVar19 = *plStack_400;
                    uVar16 = *(undefined4 *)((long)plVar22 + 0x24);
                    uVar40 = (ulong)*(ushort *)(lVar19 + 0x12e);
                    if (uVar40 != 0) {
                      piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
                      do {
                        if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f470e0) {
                          puVar20 = (undefined8 *)(lVar19 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                          goto code_r0x09854228;
                        }
                        uVar40 = uVar40 - 1;
                        piVar36 = piVar36 + 4;
                      } while (uVar40 != 0);
                    }
                    puVar20 = (undefined8 *)func_0x041cb4c4(plStack_400,*(long *)PTR_DAT_09f470e0,6)
                    ;
code_r0x09854228:
                    uVar29 = puVar20[1];
                    (*(code *)*puVar20)(&uStack_3a0,plStack_400,uVar16);
                    uStack_2e8 = uStack_398;
                    uStack_2f0 = uStack_3a0;
                    uStack_2d8 = uStack_388;
                    uStack_2e0 = uStack_390;
                    uStack_2c8 = uStack_378;
                    uStack_2d0 = uStack_380;
                    if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
                      func_0x04151a94();
                    }
                    auVar54._8_8_ = uStack_418;
                    auVar54._0_8_ = plStack_410;
                    auVar50._8_8_ = uVar39;
                    auVar50._0_8_ = uVar29;
                    if ((int)uStack_2d8 == iStack_3f4) {
                      if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
                        func_0x04151a94();
                      }
                      auVar47 = func_0x091dc794(&uStack_2f0,uVar28,0);
                      uVar28 = auVar47._8_8_;
                      if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0)
                          == 0) {
                        func_0x04151a94();
                      }
                      auVar50 = func_0x097744cc(auVar47._0_8_,uVar28,auVar53._0_8_,uVar30,0);
                      auVar54 = func_0x09774360(plStack_410,uStack_418,auVar50._0_8_,auVar50._8_8_,0
                                               );
                    }
                  }
                }
                else {
                  auVar50 = auVar3;
                  auVar54 = auVar4;
                  if ((int)plVar22[4] == 1) {
                    if (plVar23 == (long *)0x0) {
                      uVar40 = func_0x04151bb8();
                      auVar52 = auVar9;
                      goto code_r0x098544a0;
                    }
                    lVar19 = *plVar23;
                    plVar22 = (long *)(ulong)*(uint *)((long)plVar22 + 0x24);
                    uVar40 = (ulong)*(ushort *)(lVar19 + 0x12e);
                    if (uVar40 != 0) {
                      piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
                      do {
                        if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f462e0) {
                          puVar20 = (undefined8 *)(lVar19 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                          goto code_r0x0985405c;
                        }
                        uVar40 = uVar40 - 1;
                        piVar36 = piVar36 + 4;
                      } while (uVar40 != 0);
                    }
                    puVar20 = (undefined8 *)func_0x041cb4c4(plVar23,*(long *)PTR_DAT_09f462e0,6);
code_r0x0985405c:
                    uVar29 = puVar20[1];
                    (*(code *)*puVar20)(&uStack_3a0,plVar23,plVar22);
                    uStack_330 = 0;
                    uStack_340 = 0;
                    uStack_338 = 0;
                    uStack_318 = uStack_398;
                    uStack_320 = uStack_3a0;
                    uStack_308 = uStack_388;
                    uStack_310 = uStack_390;
                    uStack_2f8 = uStack_378;
                    uStack_300 = uStack_380;
                    if (*(int *)(*(long *)PTR_DAT_09eca930 + 0xe0) == 0) {
                      func_0x04151a94();
                    }
                    iVar17 = func_0x091b9acc(&uStack_320,0);
                    iVar18 = (int)uVar29;
                    if (iVar17 != 0) {
                      if (*(int *)(*(long *)PTR_DAT_09eca930 + 0xe0) == 0) {
                        func_0x04151a94();
                      }
                      uVar16 = func_0x091b9acc(&uStack_320,0);
                      if (plVar24 == (long *)0x0) {
                        uVar40 = func_0x04151bb8();
                        auVar52 = auVar8;
                        goto code_r0x098544a0;
                      }
                      lVar19 = *plVar24;
                      uVar40 = (ulong)*(ushort *)(lVar19 + 0x12e);
                      if (uVar40 != 0) {
                        piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
                        do {
                          if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f473c8) {
                            puVar20 = (undefined8 *)(lVar19 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                            goto code_r0x09854134;
                          }
                          uVar40 = uVar40 - 1;
                          piVar36 = piVar36 + 4;
                        } while (uVar40 != 0);
                      }
                      puVar20 = (undefined8 *)func_0x041cb4c4(plVar24,*(long *)PTR_DAT_09f473c8,6);
code_r0x09854134:
                      uVar29 = puVar20[1];
                      (*(code *)*puVar20)(&uStack_3a0,plVar24,uVar16);
                      uStack_338 = uStack_398;
                      uStack_340 = uStack_3a0;
                      uStack_330 = uStack_390;
                    }
                    if (*(int *)(*(long *)PTR_DAT_09eca930 + 0xe0) == 0) {
                      func_0x04151a94();
                    }
                    iVar18 = func_0x091b994c(&uStack_320,0);
                    auVar54._8_8_ = uStack_418;
                    auVar54._0_8_ = plStack_410;
                    auVar50._8_8_ = uVar39;
                    auVar50._0_8_ = uVar29;
                    if (iVar18 == iStack_3f4) {
                      uStack_3c8 = uStack_318;
                      uStack_3d0 = uStack_320;
                      uStack_3b8 = uStack_308;
                      uStack_3c0 = uStack_310;
                      uStack_3a8 = uStack_2f8;
                      uStack_3b0 = uStack_300;
                      uStack_3e8 = uStack_338;
                      uStack_3f0 = uStack_340;
                      uStack_3e0 = uStack_330;
                      auVar47 = func_0x098801d4(uVar28,&uStack_3d0,&uStack_3f0,uStack_448,iStack_3f8
                                                ,uStack_43c,0);
                      uVar28 = auVar47._8_8_;
                      if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0)
                          == 0) {
                        func_0x04151a94();
                      }
                      auVar50 = func_0x097744cc(auVar47._0_8_,uVar28,auVar53._0_8_,uVar30,0);
                      auVar54 = func_0x09774360(plStack_410,uStack_418,auVar50._0_8_,auVar50._8_8_,0
                                               );
                    }
                  }
                }
                goto code_r0x09853e40;
              }
              auVar5._8_8_ = 0;
              auVar5._0_8_ = uStack_430;
              auVar52 = auVar5 << 0x40;
              lVar19 = lStack_438;
              uVar30 = uStack_418;
              plVar26 = plStack_410;
              plVar22 = plStack_428;
              if (plVar34 != (long *)0x0) {
                lVar19 = *plVar34;
                uVar28 = (ulong)*(ushort *)(lVar19 + 0x12e);
                if (uVar28 != 0) {
                  piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
                  do {
                    if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09eaa288) {
                      puVar20 = (undefined8 *)(lVar19 + (long)*piVar36 * 0x10 + 0x138);
                      goto code_r0x0985434c;
                    }
                    uVar28 = uVar28 - 1;
                    piVar36 = piVar36 + 4;
                  } while (uVar28 != 0);
                }
                uVar30 = 0;
                puVar20 = (undefined8 *)func_0x041cb4c4(plVar34);
                auVar50._8_8_ = uVar39;
                auVar50._0_8_ = uVar30;
code_r0x0985434c:
                (*(code *)*puVar20)(plVar34,puVar20[1]);
                auVar7._8_8_ = uStack_430;
                auVar7._0_8_ = plStack_400;
                auVar6._8_8_ = 0;
                auVar6._0_8_ = uStack_430;
                auVar52 = auVar6 << 0x40;
                lVar19 = lStack_438;
                uVar30 = uStack_418;
                plVar26 = plStack_410;
                plVar22 = plStack_428;
              }
            }
            plVar41 = (long *)(ulong)*(uint *)(lVar19 + 0x18);
            plVar22 = (long *)((long)plVar22 + 1);
            uStack_408 = uVar30;
          } while ((long)plVar22 < (long)(int)*(uint *)(lVar19 + 0x18));
        }
        auVar55._8_8_ = uVar30;
        auVar55._0_8_ = plVar26;
        return auVar55;
      }
    }
  }
code_r0x09854484:
  plVar21 = plVar41;
  puVar46 = puVar44;
  puVar25 = puVar45;
  uStack_430 = auVar7._8_8_;
  plStack_400 = auVar7._0_8_;
  func_0x04151bb8();
  auVar7._8_8_ = uStack_430;
  auVar7._0_8_ = plStack_400;
code_r0x09854488:
  uStack_430 = auVar7._8_8_;
  plStack_400 = auVar7._0_8_;
  func_0x04151bc0();
  func_0x04151bb0(auVar52._0_8_);
  auVar11._8_8_ = 0;
  auVar11._0_8_ = auVar52._8_8_;
  plVar24 = plVar43;
  auVar52 = auVar11 << 0x40;
code_r0x098544a0:
  puVar44 = auVar52._8_8_;
  lVar19 = auVar52._0_8_;
  if (plVar34 != (long *)0x0) {
    lVar35 = *plVar34;
    uVar28 = (ulong)*(ushort *)(lVar35 + 0x12e);
    if (uVar28 != 0) {
      piVar36 = (int *)(*(long *)(lVar35 + 0xb0) + 8);
      do {
        if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09eaa288) {
          puVar20 = (undefined8 *)(lVar35 + (long)*piVar36 * 0x10 + 0x138);
          goto code_r0x098544f8;
        }
        uVar28 = uVar28 - 1;
        piVar36 = piVar36 + 4;
      } while (uVar28 != 0);
    }
    iVar18 = 0;
    puVar20 = (undefined8 *)func_0x041cb4c4(plVar34);
code_r0x098544f8:
    (*(code *)*puVar20)(plVar34,puVar20[1]);
  }
  if (lVar19 == 0) {
    func_0x04247ab0(uVar40);
  }
  func_0x04151bb0(lVar19);
  auVar47 = func_0x03bf6574();
  piVar36 = aiStack_490;
  puStack_470 = &WithNetwork_WeaponStatusCalculator__CalculateStatus;
  puStack_460 = puVar25;
  uStack_458 = uVar40;
  if (iVar18 == 2) {
    uVar40 = uVar39 & 0xffffffff;
    puVar45 = &UNK_09854540;
    uVar30 = extraout_x8;
  }
  else {
    aiStack_490[0] = iVar18;
    uVar30 = func_0x04151930(PTR_DAT_09edb230);
    uVar30 = func_0x04151a9c(uVar30,aiStack_490);
    uVar29 = func_0x04151930(PTR_DAT_09f7f9a0);
    uVar30 = func_0x084656c4(uVar29,uVar30,0);
    func_0x04151930(PTR_DAT_09eadfb8);
    puVar25 = (undefined *)func_0x04151ba8();
    uVar40 = 0;
    func_0x085befc4(puVar25,uVar30);
    uVar29 = func_0x04151930(
                            PTR_Method_WithNetwork_WeaponStatusCalculator_CalculateStatus___09f7faf8
                            );
    puVar45 = &WithNetwork_WeaponStatusCalculator__CalculatePercentStatus;
    auVar47 = func_0x04151a84(puVar25,uVar29);
    piVar36 = (int *)extraout_x8_00;
  }
  lVar35 = auVar47._0_8_;
  auVar56._8_8_ = plVar21;
  auVar56._0_8_ = lVar35;
  ppuVar15 = &puStack_4e0;
  uVar29 = 0xa46e000;
  plVar41 = (long *)(uVar40 & 0xffffffff);
  uVar40 = auVar47._8_8_ & 0xffffffff;
  puStack_4e0 = puVar45;
  plStack_4d8 = plVar24;
  plStack_4d0 = plVar23;
  plStack_4c8 = plVar21;
  lStack_4c0 = lVar19;
  plStack_4b8 = plVar22;
  puStack_4b0 = puVar46;
  plStack_4a8 = param_6;
  puStack_4a0 = puVar25;
  uStack_498 = uVar30;
  if ((bRam000000000a46e20c & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f7f9b0);
    func_0x0415191c(PTR_DAT_09f4b430);
    func_0x0415191c(PTR_DAT_09f4b438);
    func_0x0415191c(PTR_DAT_09f48a60);
    func_0x0415191c(PTR_DAT_09f46a88);
    bRam000000000a46e20c = 1;
  }
  puVar25 = PTR_DAT_09f7f9b0;
  puVar46 = PTR_DAT_09f4b430;
  if (lVar35 == 0) {
code_r0x0985481c:
    auVar47 = func_0x04151bb8();
    puVar46 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    plVar43 = auVar47._8_8_;
    plVar26 = auVar47._0_8_;
    uVar30 = 1;
    puStack_538 = &
                  WithNetwork_WeaponStatusCalculator__CalculateTotalWeaponAttackPossessionEffectValue
    ;
    auVar12._8_8_ = 0xa46e000;
    auVar12._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    plStack_540 = plVar34;
    puStack_530 = puVar44;
    plStack_528 = plVar24;
    plStack_520 = plVar23;
    plStack_518 = plVar21;
    lStack_510 = lVar35;
    plStack_508 = plVar22;
    uStack_500 = uVar29;
    uStack_4f8 = uVar40;
    puStack_4f0 = (undefined *)piVar36;
    plStack_4e8 = plVar41;
    if ((bRam000000000a46e20a & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(PTR_DAT_09f46a88);
      func_0x0415191c(PTR_DAT_09f470e0);
      func_0x0415191c(PTR_DAT_09ec4a50);
      bRam000000000a46e20a = 1;
    }
    lVar19 = *(long *)puVar46;
    uStack_558 = 0;
    uStack_560 = 0;
    uStack_548 = 0;
    uStack_550 = 0;
    uStack_568 = 0;
    uStack_570 = 0;
    if (*(int *)(lVar19 + 0xe0) == 0) {
      func_0x04151a94();
      lVar19 = *(long *)puVar46;
    }
    auVar65._8_8_ = uVar39;
    auVar65._0_8_ = uVar30;
    puVar46 = puVar44;
    plVar41 = plVar34;
    if (plVar26 != (long *)0x0) {
      pauVar33 = *(undefined1 (**) [16])(lVar19 + 0xb8);
      lVar19 = *plVar26;
      auVar12 = *pauVar33;
      auVar50 = *pauVar33;
      auVar47 = *pauVar33;
      uVar40 = (ulong)*(ushort *)(lVar19 + 0x12e);
      if (uVar40 != 0) {
        piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
        do {
          if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f46a88) {
            puVar20 = (undefined8 *)(lVar19 + (long)(*piVar36 + 7) * 0x10 + 0x138);
            goto code_r0x09854920;
          }
          uVar40 = uVar40 - 1;
          piVar36 = piVar36 + 4;
        } while (uVar40 != 0);
      }
      uVar30 = 7;
      puVar20 = (undefined8 *)func_0x041cb4c4(plVar26);
code_r0x09854920:
      plVar34 = (long *)(*(code *)*puVar20)(plVar26,puVar20[1]);
      puVar25 = PTR_DAT_09f470e0;
      puVar44 = PTR_DAT_09ec4a50;
      auVar65._8_8_ = uVar39;
      auVar65._0_8_ = uVar30;
      if (plVar34 != (long *)0x0) {
        if (0 < (int)plVar34[3]) {
          plVar24 = (long *)0x0;
          plVar22 = (long *)(plVar34[3] & 0xffffffff);
          plVar23 = (long *)0x38;
          auVar47 = auVar50;
          do {
            uVar30 = auVar65._8_8_;
            plVar26 = plVar34;
            puVar46 = puVar25;
            plVar41 = (long *)puVar44;
            if (plVar22 <= plVar24) goto code_r0x09854ab0;
            if (*(char *)((long)plVar34 + (long)plVar24 * 0x38 + 0x4c) != '\0') {
              auVar12 = auVar47;
              if ((plVar34[(long)plVar24 * 7 + 4] == 0) || (plVar43 == (long *)0x0))
              goto code_r0x09854aac;
              lVar19 = *plVar43;
              uVar1 = *(uint *)(plVar34 + (long)plVar24 * 7 + 6);
              uVar16 = *(undefined4 *)(plVar34[(long)plVar24 * 7 + 4] + 0x38);
              auVar56._8_4_ = uVar16;
              auVar56._0_8_ = CONCAT44(0,uVar1);
              auVar56._12_4_ = 0;
              uVar39 = (ulong)*(ushort *)(lVar19 + 0x12e);
              if (uVar39 != 0) {
                piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar36 + -2) == *(long *)puVar25) {
                    puVar20 = (undefined8 *)(lVar19 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                    goto code_r0x098549d4;
                  }
                  uVar39 = uVar39 - 1;
                  piVar36 = piVar36 + 4;
                } while (uVar39 != 0);
              }
              puVar20 = (undefined8 *)func_0x041cb4c4(plVar43,*(long *)puVar25,6);
code_r0x098549d4:
              uVar29 = puVar20[1];
              (*(code *)*puVar20)(&uStack_5a0,plVar43,uVar16);
              uStack_568 = uStack_598;
              uStack_570 = uStack_5a0;
              uStack_558 = uStack_588;
              uStack_560 = uStack_590;
              uStack_548 = uStack_578;
              uStack_550 = uStack_580;
              if (*(int *)(*(long *)puVar44 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar65._8_8_ = uVar30;
              auVar65._0_8_ = uVar29;
              if ((int)uStack_558 == 1) {
                if (*(int *)(*(long *)puVar44 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar56 = func_0x091dc794(&uStack_570,CONCAT44(0,uVar1),0);
                if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar65 = auVar56;
                auVar47 = func_0x09774360(auVar47._0_8_,auVar47._8_8_,auVar56._0_8_,auVar56._8_8_,0)
                ;
              }
            }
            plVar22 = (long *)(ulong)*(uint *)(plVar34 + 3);
            plVar24 = (long *)((long)plVar24 + 1);
          } while ((long)plVar24 < (long)(int)*(uint *)(plVar34 + 3));
        }
        return auVar47;
      }
    }
code_r0x09854aac:
    auVar47 = auVar12;
    func_0x04151bb8();
code_r0x09854ab0:
    auVar50 = func_0x04151bc0();
    puVar44 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    auVar57._8_8_ = plVar24;
    auVar57._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar35 = auVar65._8_8_;
    lVar19 = auVar65._0_8_;
    plVar21 = auVar50._8_8_;
    plVar22 = auVar50._0_8_;
    ppuVar15 = (undefined **)auStack_6d0;
    puStack_5f8 = &
                  WithNetwork_WeaponStatusCalculator__CalculatePredictedTotalWeaponAttackPossessionEffectValue
    ;
    uStack_5a8 = 1;
    plVar34 = &lStack_640;
    plStack_600 = plVar41;
    puStack_5f0 = puVar46;
    plStack_5e8 = plVar24;
    plStack_5e0 = plVar23;
    plStack_5c8 = plVar26;
    plStack_5b0 = plVar43;
    auStack_5c0 = auVar47;
    if ((bRam000000000a46e20b & 1) == 0) {
      uStack_5d8 = auVar56._8_8_;
      uStack_5d0 = auVar56._0_8_;
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(PTR_DAT_09eaa288);
      func_0x0415191c(PTR_DAT_09f7fb00);
      func_0x0415191c(PTR_DAT_09f7fb08);
      func_0x0415191c(PTR_DAT_09eaa8d0);
      func_0x0415191c(PTR_DAT_09ec4a50);
      auVar56._8_8_ = uStack_5d8;
      auVar56._0_8_ = uStack_5d0;
      bRam000000000a46e20b = 1;
    }
    uStack_5d8 = auVar56._8_8_;
    uStack_5d0 = auVar56._0_8_;
    lVar27 = *(long *)puVar44;
    uStack_610 = 0;
    uStack_618 = 0;
    uStack_620 = 0;
    uStack_638 = 0;
    lStack_640 = 0;
    uStack_628 = 0;
    uStack_630 = 0;
    uStack_658 = 0;
    uStack_660 = 0;
    uStack_648 = 0;
    uStack_650 = 0;
    uStack_668 = 0;
    lStack_670 = 0;
    if (*(int *)(lVar27 + 0xe0) == 0) {
      func_0x04151a94();
      auVar56._8_8_ = uStack_5d8;
      auVar56._0_8_ = uStack_5d0;
      lVar27 = *(long *)puVar44;
    }
    uStack_5d8 = auVar56._8_8_;
    uStack_5d0 = auVar56._0_8_;
    uVar30 = auVar65._8_8_;
    plVar41 = (long *)0x0;
    piVar36 = (int *)(undefined *)0xa46e000;
    puVar44 = puVar46;
    if (plVar22 == (long *)0x0) {
code_r0x09854ea8:
      uStack_5d8 = auVar56._8_8_;
      uStack_5d0 = auVar56._0_8_;
      func_0x04151bb8();
      puVar25 = (undefined *)piVar36;
      puVar46 = puVar44;
    }
    else {
      pauVar33 = *(undefined1 (**) [16])(lVar27 + 0xb8);
      lVar27 = *plVar22;
      uVar29 = *(undefined8 *)*pauVar33;
      auVar57._0_8_ = uVar29;
      uVar32 = *(undefined8 *)(*pauVar33 + 8);
      auVar58 = *pauVar33;
      uVar39 = (ulong)*(ushort *)(lVar27 + 0x12e);
      if (uVar39 != 0) {
        piVar36 = (int *)(*(long *)(lVar27 + 0xb0) + 8);
        do {
          if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f7fb00) {
            puVar20 = (undefined8 *)(lVar27 + (long)*piVar36 * 0x10 + 0x138);
            goto code_r0x09854be0;
          }
          uVar39 = uVar39 - 1;
          piVar36 = piVar36 + 4;
        } while (uVar39 != 0);
      }
      uVar31 = 0;
      puVar20 = (undefined8 *)func_0x041cb4c4(plVar22);
      auVar56._8_8_ = uStack_5d8;
      auVar56._0_8_ = uStack_5d0;
      auVar65._8_8_ = uVar30;
      auVar65._0_8_ = uVar31;
code_r0x09854be0:
      uStack_5d8 = auVar56._8_8_;
      uStack_5d0 = auVar56._0_8_;
      lStack_6b0 = lVar19;
      plVar41 = (long *)(*(code *)*puVar20)(plVar22,puVar20[1]);
      piVar36 = (int *)PTR_DAT_09f7fb08;
      puVar44 = PTR_DAT_09eaa8d0;
      puVar25 = (undefined *)0xa46e000;
      if (plVar41 != (long *)0x0) {
code_r0x09854c10:
        uStack_6b8 = uVar29;
        uStack_6c0 = uVar32;
        uVar30 = auVar65._8_8_;
        lVar19 = *plVar41;
        uVar39 = (ulong)*(ushort *)(lVar19 + 0x12e);
        if (uVar39 != 0) {
          piVar38 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
          do {
            if (*(long *)(piVar38 + -2) == *(long *)puVar44) {
              puVar20 = (undefined8 *)(lVar19 + (long)*piVar38 * 0x10 + 0x138);
              goto code_r0x09854c5c;
            }
            uVar39 = uVar39 - 1;
            piVar38 = piVar38 + 4;
          } while (uVar39 != 0);
        }
        uVar29 = 0;
        puVar20 = (undefined8 *)func_0x041cb4c4(plVar41);
        auVar65._8_8_ = uVar30;
        auVar65._0_8_ = uVar29;
code_r0x09854c5c:
        uVar39 = (*(code *)*puVar20)(plVar41,puVar20[1]);
        uVar30 = auVar65._8_8_;
        if ((uVar39 & 1) == 0) {
          lVar35 = 0;
          goto code_r0x09854e0c;
        }
        lVar19 = *plVar41;
        uVar39 = (ulong)*(ushort *)(lVar19 + 0x12e);
        if (uVar39 != 0) {
          piVar38 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
          do {
            if (*(long *)(piVar38 + -2) == *(long *)piVar36) {
              puVar20 = (undefined8 *)(lVar19 + (long)*piVar38 * 0x10 + 0x138);
              goto code_r0x09854cb8;
            }
            uVar39 = uVar39 - 1;
            piVar38 = piVar38 + 4;
          } while (uVar39 != 0);
        }
        uVar29 = 0;
        puVar20 = (undefined8 *)func_0x041cb4c4(plVar41);
        auVar65._8_8_ = uVar30;
        auVar65._0_8_ = uVar29;
code_r0x09854cb8:
        (*(code *)*puVar20)(&lStack_6a8,plVar41,puVar20[1]);
        uStack_638 = uStack_6a0;
        lStack_640 = lStack_6a8;
        uStack_628 = uStack_690;
        uStack_630 = uStack_698;
        uStack_618 = uStack_680;
        uStack_620 = uStack_688;
        uStack_610 = uStack_678;
        uVar39 = func_0x091bbeac(&lStack_640,0);
        uVar30 = auVar65._8_8_;
        if (lVar35 != 0) {
          uVar29 = *(undefined8 *)(lVar35 + 0x28);
          uVar39 = (**(code **)(lVar35 + 0x18))(*(undefined8 *)(lVar35 + 0x40));
          auVar65._8_8_ = uVar30;
          auVar65._0_8_ = uVar29;
          uVar32 = uStack_6c0;
          uVar29 = uStack_6b8;
          if ((uVar39 & 1) != 0) {
            if (lStack_640 == 0) goto code_r0x09854ea0;
            if (plVar21 == (long *)0x0) goto code_r0x09854ea4;
            lVar19 = plVar21[5];
            (*(code *)plVar21[3])(&lStack_6a8,plVar21[8],*(undefined4 *)(lStack_640 + 0x38));
            uStack_668 = uStack_6a0;
            lStack_670 = lStack_6a8;
            uStack_658 = uStack_690;
            uStack_660 = uStack_698;
            uStack_648 = uStack_680;
            uStack_650 = uStack_688;
            if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar65._8_8_ = uVar30;
            auVar65._0_8_ = lVar19;
            uVar32 = uStack_6c0;
            uVar29 = uStack_6b8;
            if ((int)uStack_658 == 1) {
              uVar39 = func_0x091bbeac(&lStack_640,0);
              auVar65._8_8_ = uVar30;
              auVar65._0_8_ = lVar19;
              auVar59._8_8_ = uVar39 & 0xffffffff;
              auVar59._0_8_ = uVar39;
              if (lStack_6b0 == 0) goto code_r0x09854ebc;
              plStack_6c8 = auVar58._8_8_;
              uVar16 = (**(code **)(lStack_6b0 + 0x18))
                                 (*(undefined8 *)(lStack_6b0 + 0x40),uVar39 & 0xffffffff,
                                  *(undefined8 *)(lStack_6b0 + 0x28));
              if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar57 = func_0x091dc794(&lStack_670,uVar16,0);
              if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar65 = auVar57;
              auVar58 = func_0x09774360(auVar58._0_8_,plStack_6c8,auVar57._0_8_,auVar57._8_8_,0);
              uVar32 = uStack_6c0;
              uVar29 = uStack_6b8;
            }
          }
          goto code_r0x09854c10;
        }
        func_0x04151bb8(uVar39,uVar39 & 0xffffffff);
code_r0x09854ea0:
        func_0x04151bb8();
code_r0x09854ea4:
        func_0x04151bb8();
        auVar56._8_8_ = uStack_5d8;
        auVar56._0_8_ = uStack_5d0;
        goto code_r0x09854ea8;
      }
    }
    puVar44 = puVar46;
    piVar36 = (int *)puVar25;
    uVar30 = auVar57._0_8_;
    func_0x04151bb8();
    while( true ) {
      auVar59 = func_0x04151bb0(lVar35);
      auVar58._8_8_ = plStack_6c8;
      auVar58._0_8_ = uVar30;
code_r0x09854ebc:
      plStack_6c8 = auVar58._8_8_;
      uVar40 = auVar58._0_8_;
      auVar64 = func_0x04151bb8(auVar59._0_8_,auVar59._8_8_);
      plVar23 = plStack_6c8;
      uVar30 = auVar65._8_8_;
      auVar58._8_8_ = plStack_6c8;
      auVar58._0_8_ = uVar40;
      plVar26 = auVar64._0_8_;
      if (auVar64._8_4_ != 1) break;
      plVar24 = (long *)func_0x098f6de0(plVar26);
      lVar35 = *plVar24;
      func_0x098f6df0();
code_r0x09854e0c:
      uVar29 = auVar65._8_8_;
      uVar30 = auVar58._0_8_;
      if (plVar41 != (long *)0x0) {
        lVar19 = *plVar41;
        uVar39 = (ulong)*(ushort *)(lVar19 + 0x12e);
        if (uVar39 != 0) {
          piVar38 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
          do {
            if (*(long *)(piVar38 + -2) == *(long *)PTR_DAT_09eaa288) {
              puVar20 = (undefined8 *)(lVar19 + (long)*piVar38 * 0x10 + 0x138);
              goto code_r0x09854e64;
            }
            uVar39 = uVar39 - 1;
            piVar38 = piVar38 + 4;
          } while (uVar39 != 0);
        }
        uVar32 = 0;
        puVar20 = (undefined8 *)func_0x041cb4c4(plVar41);
        auVar65._8_8_ = uVar29;
        auVar65._0_8_ = uVar32;
code_r0x09854e64:
        (*(code *)*puVar20)(plVar41,puVar20[1]);
      }
      if (lVar35 == 0) {
        return auVar58;
      }
    }
    plVar22 = (long *)0x0;
    if (plVar41 != (long *)0x0) {
      lVar19 = *plVar41;
      uVar39 = (ulong)*(ushort *)(lVar19 + 0x12e);
      if (uVar39 != 0) {
        piVar38 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
        do {
          if (*(long *)(piVar38 + -2) == *(long *)PTR_DAT_09eaa288) {
            puVar20 = (undefined8 *)(lVar19 + (long)*piVar38 * 0x10 + 0x138);
            goto code_r0x09854f8c;
          }
          uVar39 = uVar39 - 1;
          piVar38 = piVar38 + 4;
        } while (uVar39 != 0);
      }
      uVar29 = 0;
      puVar20 = (undefined8 *)func_0x041cb4c4(plVar41);
      auVar65._8_8_ = uVar30;
      auVar65._0_8_ = uVar29;
code_r0x09854f8c:
      (*(code *)*puVar20)(plVar41,puVar20[1]);
    }
    func_0x04247ab0(plVar26);
    func_0x04151bb0(0);
    puVar46 = &WithNetwork_WeaponStatusCalculator__CalculateTotalWeaponPossessionEffectStatusValue;
    auVar60 = func_0x03bf6574();
  }
  else {
    plVar26 = (long *)func_0x053c429c(lVar35,*(undefined8 *)PTR_DAT_09f4b438);
    plVar22 = (long *)func_0x053c2424(lVar35,*(undefined8 *)puVar46);
    uVar30 = func_0x053c0a5c(lVar35,*(undefined8 *)puVar25);
    auVar57._8_8_ = plVar24;
    auVar57._0_8_ = uVar30;
    uVar29 = 0;
    if (plVar26 == (long *)0x0) goto code_r0x0985481c;
    lVar19 = *plVar26;
    uVar28 = (ulong)*(ushort *)(lVar19 + 0x12e);
    if (uVar28 != 0) {
      piVar38 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
      do {
        if (*(long *)(piVar38 + -2) == *(long *)PTR_DAT_09f46a88) {
          puVar20 = (undefined8 *)(lVar19 + (long)(*piVar38 + 7) * 0x10 + 0x138);
          goto code_r0x098546f0;
        }
        uVar28 = uVar28 - 1;
        piVar38 = piVar38 + 4;
      } while (uVar28 != 0);
    }
    puVar20 = (undefined8 *)func_0x041cb4c4(plVar26,*(long *)PTR_DAT_09f46a88,7);
code_r0x098546f0:
    uVar30 = (*(code *)*puVar20)(plVar26,puVar20[1]);
    auVar65._8_8_ = uVar39;
    auVar65._0_8_ = uVar40;
    auVar60._8_8_ = uVar30;
    auVar60._0_8_ = plVar22;
    puVar46 = &UNK_0985470c;
  }
  puVar25 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  lVar19 = auVar60._8_8_;
  plVar24 = auVar60._0_8_;
  *(long **)((long)ppuVar15 + -0x60) = plVar34;
  *(undefined **)((long)ppuVar15 + -0x58) = puVar46;
  *(undefined **)((long)ppuVar15 + -0x50) = puVar44;
  *(long *)((long)ppuVar15 + -0x48) = auVar57._8_8_;
  *(long **)((long)ppuVar15 + -0x40) = plVar23;
  *(long **)((long)ppuVar15 + -0x38) = plVar21;
  *(long *)((long)ppuVar15 + -0x30) = auVar57._0_8_;
  *(long **)((long)ppuVar15 + -0x28) = plVar22;
  *(long **)((long)ppuVar15 + -0x20) = plVar26;
  *(ulong *)((long)ppuVar15 + -0x18) = uVar40;
  *(int **)((long)ppuVar15 + -0x10) = piVar36;
  *(long **)((long)ppuVar15 + -8) = plVar41;
  auVar62._8_8_ = 0xa46e000;
  auVar62._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  auVar61 = auVar65;
  if ((bRam000000000a46e20d & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e20d = 1;
  }
  lVar35 = *(long *)puVar25;
  *(undefined8 *)((long)ppuVar15 + -0x78) = 0;
  *(undefined8 *)((long)ppuVar15 + -0x80) = 0;
  *(undefined8 *)((long)ppuVar15 + -0x68) = 0;
  *(undefined8 *)((long)ppuVar15 + -0x70) = 0;
  *(undefined8 *)((long)ppuVar15 + -0x88) = 0;
  *(undefined8 *)((long)ppuVar15 + -0x90) = 0;
  if (*(int *)(lVar35 + 0xe0) == 0) {
    func_0x04151a94();
    lVar35 = *(long *)puVar25;
  }
  puVar46 = PTR_DAT_09f470e0;
  puVar44 = PTR_DAT_09ec4a50;
  uVar39 = auVar61._8_8_;
  iVar18 = auVar61._4_4_;
  if (lVar19 != 0) {
    auVar62 = **(undefined1 (**) [16])(lVar35 + 0xb8);
    if (0 < (int)*(ulong *)(lVar19 + 0x18)) {
      uVar40 = 0;
      uVar28 = *(ulong *)(lVar19 + 0x18) & 0xffffffff;
      auVar62 = **(undefined1 (**) [16])(lVar35 + 0xb8);
      do {
        uVar39 = auVar61._8_8_;
        iVar18 = auVar61._4_4_;
        if (uVar28 <= uVar40) goto code_r0x098551c0;
        lVar35 = lVar19 + uVar40 * 0x38;
        if (*(char *)(lVar35 + 0x4c) != '\0') {
          if ((*(long *)(lVar35 + 0x20) == 0) || (plVar24 == (long *)0x0)) goto code_r0x098551bc;
          lVar27 = *plVar24;
          uVar16 = *(undefined4 *)(lVar35 + 0x30);
          uVar2 = *(undefined4 *)(*(long *)(lVar35 + 0x20) + 0x38);
          uVar28 = (ulong)*(ushort *)(lVar27 + 0x12e);
          if (uVar28 != 0) {
            piVar36 = (int *)(*(long *)(lVar27 + 0xb0) + 8);
            do {
              if (*(long *)(piVar36 + -2) == *(long *)puVar46) {
                puVar20 = (undefined8 *)(lVar27 + (long)(*piVar36 + 6) * 0x10 + 0x138);
                goto code_r0x098550e4;
              }
              uVar28 = uVar28 - 1;
              piVar36 = piVar36 + 4;
            } while (uVar28 != 0);
          }
          puVar20 = (undefined8 *)func_0x041cb4c4(plVar24,*(long *)puVar46,6);
code_r0x098550e4:
          uVar30 = puVar20[1];
          (*(code *)*puVar20)((undefined1 *)((long)ppuVar15 + -0xc0),plVar24,uVar2);
          lVar35 = *(long *)puVar44;
          *(undefined8 *)((long)ppuVar15 + -0x88) = *(undefined8 *)((long)ppuVar15 + -0xb8);
          *(undefined8 *)((long)ppuVar15 + -0x90) = *(undefined8 *)((long)ppuVar15 + -0xc0);
          *(undefined8 *)((long)ppuVar15 + -0x78) = *(undefined8 *)((long)ppuVar15 + -0xa8);
          *(undefined8 *)((long)ppuVar15 + -0x80) = *(undefined8 *)((long)ppuVar15 + -0xb0);
          *(undefined8 *)((long)ppuVar15 + -0x68) = *(undefined8 *)((long)ppuVar15 + -0x98);
          *(undefined8 *)((long)ppuVar15 + -0x70) = *(undefined8 *)((long)ppuVar15 + -0xa0);
          if (*(int *)(lVar35 + 0xe0) == 0) {
            func_0x04151a94();
          }
          auVar61._8_8_ = uVar39;
          auVar61._0_8_ = uVar30;
          if (*(int *)((long)ppuVar15 + -0x78) == auVar65._0_4_) {
            if (*(int *)(*(long *)puVar44 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar61 = func_0x091dc794((undefined1 *)((long)ppuVar15 + -0x90),uVar16,0);
            if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar62 = func_0x09774360(auVar62._0_8_,auVar62._8_8_,auVar61._0_8_,auVar61._8_8_,0);
          }
        }
        uVar28 = (ulong)*(uint *)(lVar19 + 0x18);
        uVar40 = uVar40 + 1;
      } while ((long)uVar40 < (long)(int)*(uint *)(lVar19 + 0x18));
    }
    return auVar62;
  }
code_r0x098551bc:
  func_0x04151bb8();
code_r0x098551c0:
  auVar47 = func_0x04151bc0();
  plVar34 = auVar47._8_8_;
  plVar41 = auVar47._0_8_;
  *(undefined **)((long)ppuVar15 + -0xf0) =
       &WithNetwork_WeaponStatusCalculator__CalculateTotalWeaponEquipmentEffectStatusValue;
  *(undefined1 (*) [16])((long)ppuVar15 + -0xe8) = auVar62;
  *(undefined1 (*) [16])((long)ppuVar15 + -0xd8) = auVar60;
  *(ulong *)((long)ppuVar15 + -200) = auVar65._0_8_ & 0xffffffff;
  if ((bRam000000000a46e20e & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f46a88);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e20e = 1;
  }
  *(undefined8 *)((long)ppuVar15 + -0x108) = 0;
  *(undefined8 *)((long)ppuVar15 + -0x110) = 0;
  *(undefined8 *)((long)ppuVar15 + -0xf8) = 0;
  *(undefined8 *)((long)ppuVar15 + -0x100) = 0;
  *(undefined8 *)((long)ppuVar15 + -0x118) = 0;
  *(undefined8 *)((long)ppuVar15 + -0x120) = 0;
  if (iVar18 == 0) {
code_r0x09855384:
    puVar44 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar19 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if (*(int *)(lVar19 + 0xe0) == 0) {
      func_0x04151a94();
      lVar19 = *(long *)puVar44;
    }
    return **(undefined1 (**) [16])(lVar19 + 0xb8);
  }
  if (plVar34 != (long *)0x0) {
    lVar19 = *plVar34;
    uVar40 = (ulong)*(ushort *)(lVar19 + 0x12e);
    if (uVar40 != 0) {
      piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
      do {
        if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f46a88) {
          puVar20 = (undefined8 *)(lVar19 + (long)(*piVar36 + 6) * 0x10 + 0x138);
          goto code_r0x09855294;
        }
        uVar40 = uVar40 - 1;
        piVar36 = piVar36 + 4;
      } while (uVar40 != 0);
    }
    puVar20 = (undefined8 *)func_0x041cb4c4(plVar34,*(long *)PTR_DAT_09f46a88,6);
code_r0x09855294:
    (*(code *)*puVar20)((undefined1 *)((long)ppuVar15 + -0x158),plVar34,iVar18,puVar20[1]);
    puVar44 = PTR_DAT_09ec4a50;
    if ((*(long *)((long)ppuVar15 + -0x158) != 0) && (plVar41 != (long *)0x0)) {
      lVar19 = *plVar41;
      uVar16 = *(undefined4 *)((long)ppuVar15 + -0x148);
      uVar2 = *(undefined4 *)(*(long *)((long)ppuVar15 + -0x158) + 0x3c);
      uVar40 = (ulong)*(ushort *)(lVar19 + 0x12e);
      if (uVar40 != 0) {
        piVar36 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
        do {
          if (*(long *)(piVar36 + -2) == *(long *)PTR_DAT_09f470e0) {
            puVar20 = (undefined8 *)(lVar19 + (long)(*piVar36 + 6) * 0x10 + 0x138);
            goto code_r0x0985531c;
          }
          uVar40 = uVar40 - 1;
          piVar36 = piVar36 + 4;
        } while (uVar40 != 0);
      }
      puVar20 = (undefined8 *)func_0x041cb4c4(plVar41,*(long *)PTR_DAT_09f470e0,6);
code_r0x0985531c:
      (*(code *)*puVar20)((undefined1 *)((long)ppuVar15 + -0x158),plVar41,uVar2,puVar20[1]);
      lVar19 = *(long *)puVar44;
      *(undefined8 *)((long)ppuVar15 + -0x118) = *(undefined8 *)((long)ppuVar15 + -0x150);
      *(undefined8 *)((long)ppuVar15 + -0x120) = *(undefined8 *)((long)ppuVar15 + -0x158);
      *(undefined8 *)((long)ppuVar15 + -0x108) = *(undefined8 *)((long)ppuVar15 + -0x140);
      *(undefined8 *)((long)ppuVar15 + -0x110) = *(undefined8 *)((long)ppuVar15 + -0x148);
      *(undefined8 *)((long)ppuVar15 + -0xf8) = *(undefined8 *)((long)ppuVar15 + -0x130);
      *(undefined8 *)((long)ppuVar15 + -0x100) = *(undefined8 *)((long)ppuVar15 + -0x138);
      if (*(int *)(lVar19 + 0xe0) == 0) {
        func_0x04151a94();
      }
      if (*(int *)((long)ppuVar15 + -0x108) == (int)uVar39) {
        if (*(int *)(*(long *)puVar44 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar47 = func_0x091dc794((undefined1 *)((long)ppuVar15 + -0x120),uVar16,0);
        return auVar47;
      }
      goto code_r0x09855384;
    }
  }
  func_0x04151bb8();
  puVar44 = PTR_DAT_09f7fb10;
  *(undefined **)((long)ppuVar15 + -0x180) = &UNK_098553c0;
  *(long **)((long)ppuVar15 + -0x170) = plVar41;
  *(ulong *)((long)ppuVar15 + -0x168) = uVar39 & 0xffffffff;
  uVar30 = extraout_x1;
  if ((bRam000000000a46e20f & 1) == 0) {
    func_0x0415191c(PTR_DAT_09f7fb10);
    bRam000000000a46e20f = 1;
    uVar30 = extraout_x1_00;
  }
  lVar19 = *(long *)puVar44;
  if (*(int *)(lVar19 + 0xe0) == 0) {
    func_0x04151a94();
    lVar19 = *(long *)puVar44;
    uVar30 = extraout_x1_01;
  }
  auVar63._4_4_ = 0;
  auVar63._0_4_ = **(uint **)(lVar19 + 0xb8);
  auVar63._8_8_ = uVar30;
  return auVar63;
}


```

## WeaponStatusCalculator.CalculateStatus(DataTableContainer tableContainer, StatusType statusType, HuntBaseStatusCalculateType calculateType, int id)

```c

/* WARNING: Possible PIC construction at 0x0985453c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09854708: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09854798: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0985470c) */
/* WARNING: Removing unreachable block (ram,0x09854710) */
/* WARNING: Removing unreachable block (ram,0x09854738) */
/* WARNING: Removing unreachable block (ram,0x09854740) */
/* WARNING: Removing unreachable block (ram,0x09854768) */
/* WARNING: Removing unreachable block (ram,0x0985474c) */
/* WARNING: Removing unreachable block (ram,0x09854758) */
/* WARNING: Removing unreachable block (ram,0x09854778) */
/* WARNING: Removing unreachable block (ram,0x09854540) */
/* WARNING: Removing unreachable block (ram,0x0985479c) */
/* WARNING: Removing unreachable block (ram,0x098547b0) */
/* WARNING: Removing unreachable block (ram,0x098547b4) */
/* WARNING: Removing unreachable block (ram,0x091d1720) */

undefined1  [16]
WithNetwork_WeaponStatusCalculator__CalculateStatus
          (undefined8 param_1,undefined8 param_2,int param_3,ulong param_4)

{
  uint uVar1;
  undefined4 uVar2;
  undefined1 auVar3 [16];
  undefined *puVar4;
  undefined *puVar5;
  undefined **ppuVar6;
  undefined4 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  long *plVar10;
  undefined8 *puVar11;
  undefined8 uVar12;
  long lVar13;
  long *plVar14;
  long *plVar15;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  ulong uVar16;
  undefined8 uVar17;
  int iVar18;
  undefined *extraout_x8;
  int *piVar19;
  long lVar20;
  ulong uVar21;
  long lVar22;
  ulong uVar23;
  undefined1 (*pauVar24) [16];
  int *piVar25;
  long *plVar26;
  long lVar27;
  long unaff_x25;
  undefined8 unaff_x26;
  ulong unaff_x27;
  undefined *unaff_x28;
  long *unaff_x29;
  undefined *puVar28;
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  undefined1 auVar38 [12];
  undefined1 auVar39 [16];
  undefined1 auStack_280 [8];
  undefined8 uStack_278;
  undefined8 uStack_270;
  undefined8 uStack_268;
  long lStack_260;
  long lStack_258;
  undefined8 uStack_250;
  undefined8 uStack_248;
  undefined8 uStack_240;
  undefined8 uStack_238;
  undefined8 uStack_230;
  undefined8 uStack_228;
  long lStack_220;
  undefined8 uStack_218;
  undefined8 uStack_210;
  undefined8 uStack_208;
  undefined8 uStack_200;
  undefined8 uStack_1f8;
  long lStack_1f0;
  undefined8 uStack_1e8;
  undefined8 uStack_1e0;
  undefined8 uStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  long *plStack_1b0;
  undefined *puStack_1a8;
  undefined *puStack_1a0;
  ulong uStack_198;
  undefined8 uStack_190;
  long lStack_188;
  long lStack_180;
  long *plStack_178;
  undefined1 auStack_170 [16];
  long *plStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined *puStack_90;
  int aiStack_40 [8];
  
  auVar29._8_8_ = param_2;
  auVar29._0_8_ = param_1;
  piVar19 = aiStack_40;
  if (param_3 == 2) {
    uVar16 = param_4 & 0xffffffff;
    puVar28 = &UNK_09854540;
  }
  else {
    aiStack_40[0] = param_3;
    uVar8 = func_0x04151930(PTR_DAT_09edb230);
    uVar8 = func_0x04151a9c(uVar8,aiStack_40);
    uVar9 = func_0x04151930(PTR_DAT_09f7f9a0);
    uVar8 = func_0x084656c4(uVar9,uVar8,0);
    func_0x04151930(PTR_DAT_09eadfb8);
    uVar9 = func_0x04151ba8();
    uVar16 = 0;
    func_0x085befc4(uVar9,uVar8);
    uVar8 = func_0x04151930(PTR_Method_WithNetwork_WeaponStatusCalculator_CalculateStatus___09f7faf8
                           );
    puVar28 = &WithNetwork_WeaponStatusCalculator__CalculatePercentStatus;
    auVar29 = func_0x04151a84(uVar9,uVar8);
    piVar19 = (int *)extraout_x8;
  }
  lVar20 = auVar29._0_8_;
  ppuVar6 = &puStack_90;
  plVar26 = (long *)(uVar16 & 0xffffffff);
  uVar16 = auVar29._8_8_ & 0xffffffff;
  puStack_90 = puVar28;
  if ((bRam000000000a46e20c & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f7f9b0);
    func_0x0415191c(PTR_DAT_09f4b430);
    func_0x0415191c(PTR_DAT_09f4b438);
    func_0x0415191c(PTR_DAT_09f48a60);
    func_0x0415191c(PTR_DAT_09f46a88);
    bRam000000000a46e20c = 1;
  }
  puVar5 = PTR_DAT_09f7f9b0;
  puVar28 = PTR_DAT_09f4b430;
  if (lVar20 == 0) {
code_r0x0985481c:
    auVar29 = func_0x04151bb8();
    puVar28 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    plVar10 = auVar29._8_8_;
    plVar26 = auVar29._0_8_;
    uVar8 = 1;
    auVar3._8_8_ = 0xa46e000;
    auVar3._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if ((bRam000000000a46e20a & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(PTR_DAT_09f46a88);
      func_0x0415191c(PTR_DAT_09f470e0);
      func_0x0415191c(PTR_DAT_09ec4a50);
      bRam000000000a46e20a = 1;
    }
    lVar13 = *(long *)puVar28;
    uStack_108 = 0;
    uStack_110 = 0;
    uStack_f8 = 0;
    uStack_100 = 0;
    uStack_118 = 0;
    uStack_120 = 0;
    if (*(int *)(lVar13 + 0xe0) == 0) {
      func_0x04151a94();
      lVar13 = *(long *)puVar28;
    }
    auVar39._8_8_ = param_4;
    auVar39._0_8_ = uVar8;
    puVar28 = unaff_x28;
    plVar15 = unaff_x29;
    if (plVar26 != (long *)0x0) {
      pauVar24 = *(undefined1 (**) [16])(lVar13 + 0xb8);
      lVar13 = *plVar26;
      auVar3 = *pauVar24;
      auVar31 = *pauVar24;
      auVar29 = *pauVar24;
      uVar16 = (ulong)*(ushort *)(lVar13 + 0x12e);
      if (uVar16 != 0) {
        piVar19 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
        do {
          if (*(long *)(piVar19 + -2) == *(long *)PTR_DAT_09f46a88) {
            puVar11 = (undefined8 *)(lVar13 + (long)(*piVar19 + 7) * 0x10 + 0x138);
            goto code_r0x09854920;
          }
          uVar16 = uVar16 - 1;
          piVar19 = piVar19 + 4;
        } while (uVar16 != 0);
      }
      uVar8 = 7;
      puVar11 = (undefined8 *)func_0x041cb4c4(plVar26);
code_r0x09854920:
      plVar14 = (long *)(*(code *)*puVar11)(plVar26,puVar11[1]);
      puVar4 = PTR_DAT_09f470e0;
      puVar5 = PTR_DAT_09ec4a50;
      auVar39._8_8_ = param_4;
      auVar39._0_8_ = uVar8;
      if (plVar14 != (long *)0x0) {
        if (0 < (int)plVar14[3]) {
          unaff_x27 = 0;
          uVar16 = plVar14[3] & 0xffffffff;
          unaff_x26 = 0x38;
          auVar29 = auVar31;
          do {
            auVar30._8_8_ = unaff_x25;
            auVar30._0_8_ = lVar20;
            uVar8 = auVar39._8_8_;
            plVar26 = plVar14;
            puVar28 = puVar4;
            plVar15 = (long *)puVar5;
            if (uVar16 <= unaff_x27) goto code_r0x09854ab0;
            if (*(char *)((long)plVar14 + unaff_x27 * 0x38 + 0x4c) != '\0') {
              auVar3 = auVar29;
              if ((plVar14[unaff_x27 * 7 + 4] == 0) || (plVar10 == (long *)0x0))
              goto code_r0x09854aac;
              lVar20 = *plVar10;
              uVar1 = *(uint *)(plVar14 + unaff_x27 * 7 + 6);
              uVar7 = *(undefined4 *)(plVar14[unaff_x27 * 7 + 4] + 0x38);
              auVar30._8_4_ = uVar7;
              auVar30._0_8_ = CONCAT44(0,uVar1);
              auVar30._12_4_ = 0;
              uVar16 = (ulong)*(ushort *)(lVar20 + 0x12e);
              if (uVar16 != 0) {
                piVar19 = (int *)(*(long *)(lVar20 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar19 + -2) == *(long *)puVar4) {
                    puVar11 = (undefined8 *)(lVar20 + (long)(*piVar19 + 6) * 0x10 + 0x138);
                    goto code_r0x098549d4;
                  }
                  uVar16 = uVar16 - 1;
                  piVar19 = piVar19 + 4;
                } while (uVar16 != 0);
              }
              puVar11 = (undefined8 *)func_0x041cb4c4(plVar10,*(long *)puVar4,6);
code_r0x098549d4:
              uVar9 = puVar11[1];
              (*(code *)*puVar11)(&uStack_150,plVar10,uVar7);
              uStack_118 = uStack_148;
              uStack_120 = uStack_150;
              uStack_108 = uStack_138;
              uStack_110 = uStack_140;
              uStack_f8 = uStack_128;
              uStack_100 = uStack_130;
              if (*(int *)(*(long *)puVar5 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar39._8_8_ = uVar8;
              auVar39._0_8_ = uVar9;
              if ((int)uStack_108 == 1) {
                if (*(int *)(*(long *)puVar5 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar30 = func_0x091dc794(&uStack_120,CONCAT44(0,uVar1),0);
                if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar39 = auVar30;
                auVar29 = func_0x09774360(auVar29._0_8_,auVar29._8_8_,auVar30._0_8_,auVar30._8_8_,0)
                ;
              }
            }
            unaff_x25 = auVar30._8_8_;
            lVar20 = auVar30._0_8_;
            uVar16 = (ulong)*(uint *)(plVar14 + 3);
            unaff_x27 = unaff_x27 + 1;
          } while ((long)unaff_x27 < (long)(int)*(uint *)(plVar14 + 3));
        }
        return auVar29;
      }
    }
code_r0x09854aac:
    auVar29 = auVar3;
    func_0x04151bb8();
code_r0x09854ab0:
    auVar31 = func_0x04151bc0();
    puVar5 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    auVar32._8_8_ = unaff_x27;
    auVar32._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar27 = auVar39._8_8_;
    lVar22 = auVar39._0_8_;
    lVar13 = auVar31._8_8_;
    plVar14 = auVar31._0_8_;
    ppuVar6 = (undefined **)auStack_280;
    puStack_1a8 = &
                  WithNetwork_WeaponStatusCalculator__CalculatePredictedTotalWeaponAttackPossessionEffectValue
    ;
    uStack_158 = 1;
    unaff_x29 = &lStack_1f0;
    plStack_1b0 = plVar15;
    puStack_1a0 = puVar28;
    uStack_198 = unaff_x27;
    uStack_190 = unaff_x26;
    lStack_188 = unaff_x25;
    lStack_180 = lVar20;
    plStack_178 = plVar26;
    plStack_160 = plVar10;
    auStack_170 = auVar29;
    if ((bRam000000000a46e20b & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(PTR_DAT_09eaa288);
      func_0x0415191c(PTR_DAT_09f7fb00);
      func_0x0415191c(PTR_DAT_09f7fb08);
      func_0x0415191c(PTR_DAT_09eaa8d0);
      func_0x0415191c(PTR_DAT_09ec4a50);
      bRam000000000a46e20b = 1;
    }
    lVar20 = *(long *)puVar5;
    uStack_1c0 = 0;
    uStack_1c8 = 0;
    uStack_1d0 = 0;
    uStack_1e8 = 0;
    lStack_1f0 = 0;
    uStack_1d8 = 0;
    uStack_1e0 = 0;
    uStack_208 = 0;
    uStack_210 = 0;
    uStack_1f8 = 0;
    uStack_200 = 0;
    uStack_218 = 0;
    lStack_220 = 0;
    if (*(int *)(lVar20 + 0xe0) == 0) {
      func_0x04151a94();
      lVar20 = *(long *)puVar5;
    }
    uVar8 = auVar39._8_8_;
    plVar26 = (long *)0x0;
    piVar19 = (int *)(undefined *)0xa46e000;
    unaff_x28 = puVar28;
    if (plVar14 == (long *)0x0) {
code_r0x09854ea8:
      func_0x04151bb8();
      puVar5 = (undefined *)piVar19;
      puVar28 = unaff_x28;
    }
    else {
      pauVar24 = *(undefined1 (**) [16])(lVar20 + 0xb8);
      lVar20 = *plVar14;
      uVar9 = *(undefined8 *)*pauVar24;
      auVar32._0_8_ = uVar9;
      uVar12 = *(undefined8 *)(*pauVar24 + 8);
      auVar33 = *pauVar24;
      uVar16 = (ulong)*(ushort *)(lVar20 + 0x12e);
      if (uVar16 != 0) {
        piVar19 = (int *)(*(long *)(lVar20 + 0xb0) + 8);
        do {
          if (*(long *)(piVar19 + -2) == *(long *)PTR_DAT_09f7fb00) {
            puVar11 = (undefined8 *)(lVar20 + (long)*piVar19 * 0x10 + 0x138);
            goto code_r0x09854be0;
          }
          uVar16 = uVar16 - 1;
          piVar19 = piVar19 + 4;
        } while (uVar16 != 0);
      }
      uVar17 = 0;
      puVar11 = (undefined8 *)func_0x041cb4c4(plVar14);
      auVar39._8_8_ = uVar8;
      auVar39._0_8_ = uVar17;
code_r0x09854be0:
      lStack_260 = lVar22;
      plVar26 = (long *)(*(code *)*puVar11)(plVar14,puVar11[1]);
      piVar19 = (int *)PTR_DAT_09f7fb08;
      unaff_x28 = PTR_DAT_09eaa8d0;
      puVar5 = (undefined *)0xa46e000;
      if (plVar26 != (long *)0x0) {
code_r0x09854c10:
        uStack_268 = uVar9;
        uStack_270 = uVar12;
        uVar8 = auVar39._8_8_;
        lVar20 = *plVar26;
        uVar16 = (ulong)*(ushort *)(lVar20 + 0x12e);
        if (uVar16 != 0) {
          piVar25 = (int *)(*(long *)(lVar20 + 0xb0) + 8);
          do {
            if (*(long *)(piVar25 + -2) == *(long *)unaff_x28) {
              puVar11 = (undefined8 *)(lVar20 + (long)*piVar25 * 0x10 + 0x138);
              goto code_r0x09854c5c;
            }
            uVar16 = uVar16 - 1;
            piVar25 = piVar25 + 4;
          } while (uVar16 != 0);
        }
        uVar9 = 0;
        puVar11 = (undefined8 *)func_0x041cb4c4(plVar26);
        auVar39._8_8_ = uVar8;
        auVar39._0_8_ = uVar9;
code_r0x09854c5c:
        uVar16 = (*(code *)*puVar11)(plVar26,puVar11[1]);
        uVar8 = auVar39._8_8_;
        if ((uVar16 & 1) == 0) {
          lVar27 = 0;
          goto code_r0x09854e0c;
        }
        lVar20 = *plVar26;
        uVar16 = (ulong)*(ushort *)(lVar20 + 0x12e);
        if (uVar16 != 0) {
          piVar25 = (int *)(*(long *)(lVar20 + 0xb0) + 8);
          do {
            if (*(long *)(piVar25 + -2) == *(long *)piVar19) {
              puVar11 = (undefined8 *)(lVar20 + (long)*piVar25 * 0x10 + 0x138);
              goto code_r0x09854cb8;
            }
            uVar16 = uVar16 - 1;
            piVar25 = piVar25 + 4;
          } while (uVar16 != 0);
        }
        uVar9 = 0;
        puVar11 = (undefined8 *)func_0x041cb4c4(plVar26);
        auVar39._8_8_ = uVar8;
        auVar39._0_8_ = uVar9;
code_r0x09854cb8:
        (*(code *)*puVar11)(&lStack_258,plVar26,puVar11[1]);
        uStack_1e8 = uStack_250;
        lStack_1f0 = lStack_258;
        uStack_1d8 = uStack_240;
        uStack_1e0 = uStack_248;
        uStack_1c8 = uStack_230;
        uStack_1d0 = uStack_238;
        uStack_1c0 = uStack_228;
        uVar16 = func_0x091bbeac(&lStack_1f0,0);
        uVar8 = auVar39._8_8_;
        if (lVar27 != 0) {
          uVar9 = *(undefined8 *)(lVar27 + 0x28);
          uVar16 = (**(code **)(lVar27 + 0x18))(*(undefined8 *)(lVar27 + 0x40));
          auVar39._8_8_ = uVar8;
          auVar39._0_8_ = uVar9;
          uVar12 = uStack_270;
          uVar9 = uStack_268;
          if ((uVar16 & 1) != 0) {
            if (lStack_1f0 == 0) goto code_r0x09854ea0;
            if (lVar13 == 0) goto code_r0x09854ea4;
            uVar17 = *(undefined8 *)(lVar13 + 0x28);
            (**(code **)(lVar13 + 0x18))
                      (&lStack_258,*(undefined8 *)(lVar13 + 0x40),*(undefined4 *)(lStack_1f0 + 0x38)
                      );
            uStack_218 = uStack_250;
            lStack_220 = lStack_258;
            uStack_208 = uStack_240;
            uStack_210 = uStack_248;
            uStack_1f8 = uStack_230;
            uStack_200 = uStack_238;
            if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar39._8_8_ = uVar8;
            auVar39._0_8_ = uVar17;
            uVar12 = uStack_270;
            uVar9 = uStack_268;
            if ((int)uStack_208 == 1) {
              uVar16 = func_0x091bbeac(&lStack_1f0,0);
              auVar39._8_8_ = uVar8;
              auVar39._0_8_ = uVar17;
              auVar34._8_8_ = uVar16 & 0xffffffff;
              auVar34._0_8_ = uVar16;
              if (lStack_260 == 0) goto code_r0x09854ebc;
              uStack_278 = auVar33._8_8_;
              uVar7 = (**(code **)(lStack_260 + 0x18))
                                (*(undefined8 *)(lStack_260 + 0x40),uVar16 & 0xffffffff,
                                 *(undefined8 *)(lStack_260 + 0x28));
              if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar32 = func_0x091dc794(&lStack_220,uVar7,0);
              if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar39 = auVar32;
              auVar33 = func_0x09774360(auVar33._0_8_,uStack_278,auVar32._0_8_,auVar32._8_8_,0);
              uVar12 = uStack_270;
              uVar9 = uStack_268;
            }
          }
          goto code_r0x09854c10;
        }
        func_0x04151bb8(uVar16,uVar16 & 0xffffffff);
code_r0x09854ea0:
        func_0x04151bb8();
code_r0x09854ea4:
        func_0x04151bb8();
        goto code_r0x09854ea8;
      }
    }
    unaff_x28 = puVar28;
    piVar19 = (int *)puVar5;
    uVar8 = auVar32._0_8_;
    func_0x04151bb8();
    while( true ) {
      auVar34 = func_0x04151bb0(lVar27);
      auVar33._8_8_ = uStack_278;
      auVar33._0_8_ = uVar8;
code_r0x09854ebc:
      uStack_278 = auVar33._8_8_;
      uVar16 = auVar33._0_8_;
      unaff_x27 = auVar32._8_8_;
      uVar9 = auVar32._0_8_;
      auVar38 = func_0x04151bb8(auVar34._0_8_,auVar34._8_8_);
      unaff_x26 = uStack_278;
      uVar12 = auVar39._8_8_;
      auVar33._8_8_ = uStack_278;
      auVar33._0_8_ = uVar16;
      plVar10 = auVar38._0_8_;
      if (auVar38._8_4_ != 1) break;
      plVar10 = (long *)func_0x098f6de0(plVar10);
      lVar27 = *plVar10;
      func_0x098f6df0();
code_r0x09854e0c:
      uVar9 = auVar39._8_8_;
      uVar8 = auVar33._0_8_;
      if (plVar26 != (long *)0x0) {
        lVar20 = *plVar26;
        uVar16 = (ulong)*(ushort *)(lVar20 + 0x12e);
        if (uVar16 != 0) {
          piVar25 = (int *)(*(long *)(lVar20 + 0xb0) + 8);
          do {
            if (*(long *)(piVar25 + -2) == *(long *)PTR_DAT_09eaa288) {
              puVar11 = (undefined8 *)(lVar20 + (long)*piVar25 * 0x10 + 0x138);
              goto code_r0x09854e64;
            }
            uVar16 = uVar16 - 1;
            piVar25 = piVar25 + 4;
          } while (uVar16 != 0);
        }
        uVar12 = 0;
        puVar11 = (undefined8 *)func_0x041cb4c4(plVar26);
        auVar39._8_8_ = uVar9;
        auVar39._0_8_ = uVar12;
code_r0x09854e64:
        (*(code *)*puVar11)(plVar26,puVar11[1]);
      }
      if (lVar27 == 0) {
        return auVar33;
      }
    }
    uVar8 = 0;
    if (plVar26 != (long *)0x0) {
      lVar20 = *plVar26;
      uVar23 = (ulong)*(ushort *)(lVar20 + 0x12e);
      if (uVar23 != 0) {
        piVar25 = (int *)(*(long *)(lVar20 + 0xb0) + 8);
        do {
          if (*(long *)(piVar25 + -2) == *(long *)PTR_DAT_09eaa288) {
            puVar11 = (undefined8 *)(lVar20 + (long)*piVar25 * 0x10 + 0x138);
            goto code_r0x09854f8c;
          }
          uVar23 = uVar23 - 1;
          piVar25 = piVar25 + 4;
        } while (uVar23 != 0);
      }
      uVar17 = 0;
      puVar11 = (undefined8 *)func_0x041cb4c4(plVar26);
      auVar39._8_8_ = uVar12;
      auVar39._0_8_ = uVar17;
code_r0x09854f8c:
      (*(code *)*puVar11)(plVar26,puVar11[1]);
    }
    func_0x04247ab0(plVar10);
    func_0x04151bb0(0);
    puVar28 = &WithNetwork_WeaponStatusCalculator__CalculateTotalWeaponPossessionEffectStatusValue;
    auVar31 = func_0x03bf6574();
  }
  else {
    plVar10 = (long *)func_0x053c429c(lVar20,*(undefined8 *)PTR_DAT_09f4b438);
    uVar8 = func_0x053c2424(lVar20,*(undefined8 *)puVar28);
    uVar9 = func_0x053c0a5c(lVar20,*(undefined8 *)puVar5);
    if (plVar10 == (long *)0x0) goto code_r0x0985481c;
    lVar20 = *plVar10;
    uVar23 = (ulong)*(ushort *)(lVar20 + 0x12e);
    if (uVar23 != 0) {
      piVar25 = (int *)(*(long *)(lVar20 + 0xb0) + 8);
      do {
        if (*(long *)(piVar25 + -2) == *(long *)PTR_DAT_09f46a88) {
          puVar11 = (undefined8 *)(lVar20 + (long)(*piVar25 + 7) * 0x10 + 0x138);
          goto code_r0x098546f0;
        }
        uVar23 = uVar23 - 1;
        piVar25 = piVar25 + 4;
      } while (uVar23 != 0);
    }
    puVar11 = (undefined8 *)func_0x041cb4c4(plVar10,*(long *)PTR_DAT_09f46a88,7);
code_r0x098546f0:
    uVar12 = (*(code *)*puVar11)(plVar10,puVar11[1]);
    auVar39._8_8_ = param_4;
    auVar39._0_8_ = uVar16;
    auVar31._8_8_ = uVar12;
    auVar31._0_8_ = uVar8;
    puVar28 = &UNK_0985470c;
    lVar13 = unaff_x25;
  }
  puVar5 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  lVar20 = auVar31._8_8_;
  plVar15 = auVar31._0_8_;
  *(long **)((long)ppuVar6 + -0x60) = unaff_x29;
  *(undefined **)((long)ppuVar6 + -0x58) = puVar28;
  *(undefined **)((long)ppuVar6 + -0x50) = unaff_x28;
  *(ulong *)((long)ppuVar6 + -0x48) = unaff_x27;
  *(undefined8 *)((long)ppuVar6 + -0x40) = unaff_x26;
  *(long *)((long)ppuVar6 + -0x38) = lVar13;
  *(undefined8 *)((long)ppuVar6 + -0x30) = uVar9;
  *(undefined8 *)((long)ppuVar6 + -0x28) = uVar8;
  *(long **)((long)ppuVar6 + -0x20) = plVar10;
  *(ulong *)((long)ppuVar6 + -0x18) = uVar16;
  *(int **)((long)ppuVar6 + -0x10) = piVar19;
  *(long **)((long)ppuVar6 + -8) = plVar26;
  auVar36._8_8_ = 0xa46e000;
  auVar36._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  auVar35 = auVar39;
  if ((bRam000000000a46e20d & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e20d = 1;
  }
  lVar13 = *(long *)puVar5;
  *(undefined8 *)((long)ppuVar6 + -0x78) = 0;
  *(undefined8 *)((long)ppuVar6 + -0x80) = 0;
  *(undefined8 *)((long)ppuVar6 + -0x68) = 0;
  *(undefined8 *)((long)ppuVar6 + -0x70) = 0;
  *(undefined8 *)((long)ppuVar6 + -0x88) = 0;
  *(undefined8 *)((long)ppuVar6 + -0x90) = 0;
  if (*(int *)(lVar13 + 0xe0) == 0) {
    func_0x04151a94();
    lVar13 = *(long *)puVar5;
  }
  puVar5 = PTR_DAT_09f470e0;
  puVar28 = PTR_DAT_09ec4a50;
  uVar16 = auVar35._8_8_;
  iVar18 = auVar35._4_4_;
  if (lVar20 != 0) {
    auVar36 = **(undefined1 (**) [16])(lVar13 + 0xb8);
    if (0 < (int)*(ulong *)(lVar20 + 0x18)) {
      uVar23 = 0;
      uVar21 = *(ulong *)(lVar20 + 0x18) & 0xffffffff;
      auVar36 = **(undefined1 (**) [16])(lVar13 + 0xb8);
      do {
        uVar16 = auVar35._8_8_;
        iVar18 = auVar35._4_4_;
        if (uVar21 <= uVar23) goto code_r0x098551c0;
        lVar13 = lVar20 + uVar23 * 0x38;
        if (*(char *)(lVar13 + 0x4c) != '\0') {
          if ((*(long *)(lVar13 + 0x20) == 0) || (plVar15 == (long *)0x0)) goto code_r0x098551bc;
          lVar22 = *plVar15;
          uVar7 = *(undefined4 *)(lVar13 + 0x30);
          uVar2 = *(undefined4 *)(*(long *)(lVar13 + 0x20) + 0x38);
          uVar21 = (ulong)*(ushort *)(lVar22 + 0x12e);
          if (uVar21 != 0) {
            piVar19 = (int *)(*(long *)(lVar22 + 0xb0) + 8);
            do {
              if (*(long *)(piVar19 + -2) == *(long *)puVar5) {
                puVar11 = (undefined8 *)(lVar22 + (long)(*piVar19 + 6) * 0x10 + 0x138);
                goto code_r0x098550e4;
              }
              uVar21 = uVar21 - 1;
              piVar19 = piVar19 + 4;
            } while (uVar21 != 0);
          }
          puVar11 = (undefined8 *)func_0x041cb4c4(plVar15,*(long *)puVar5,6);
code_r0x098550e4:
          uVar8 = puVar11[1];
          (*(code *)*puVar11)((undefined1 *)((long)ppuVar6 + -0xc0),plVar15,uVar2);
          lVar13 = *(long *)puVar28;
          *(undefined8 *)((long)ppuVar6 + -0x88) = *(undefined8 *)((long)ppuVar6 + -0xb8);
          *(undefined8 *)((long)ppuVar6 + -0x90) = *(undefined8 *)((long)ppuVar6 + -0xc0);
          *(undefined8 *)((long)ppuVar6 + -0x78) = *(undefined8 *)((long)ppuVar6 + -0xa8);
          *(undefined8 *)((long)ppuVar6 + -0x80) = *(undefined8 *)((long)ppuVar6 + -0xb0);
          *(undefined8 *)((long)ppuVar6 + -0x68) = *(undefined8 *)((long)ppuVar6 + -0x98);
          *(undefined8 *)((long)ppuVar6 + -0x70) = *(undefined8 *)((long)ppuVar6 + -0xa0);
          if (*(int *)(lVar13 + 0xe0) == 0) {
            func_0x04151a94();
          }
          auVar35._8_8_ = uVar16;
          auVar35._0_8_ = uVar8;
          if (*(int *)((long)ppuVar6 + -0x78) == auVar39._0_4_) {
            if (*(int *)(*(long *)puVar28 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar35 = func_0x091dc794((undefined1 *)((long)ppuVar6 + -0x90),uVar7,0);
            if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar36 = func_0x09774360(auVar36._0_8_,auVar36._8_8_,auVar35._0_8_,auVar35._8_8_,0);
          }
        }
        uVar21 = (ulong)*(uint *)(lVar20 + 0x18);
        uVar23 = uVar23 + 1;
      } while ((long)uVar23 < (long)(int)*(uint *)(lVar20 + 0x18));
    }
    return auVar36;
  }
code_r0x098551bc:
  func_0x04151bb8();
code_r0x098551c0:
  auVar29 = func_0x04151bc0();
  plVar10 = auVar29._8_8_;
  plVar26 = auVar29._0_8_;
  *(undefined **)((long)ppuVar6 + -0xf0) =
       &WithNetwork_WeaponStatusCalculator__CalculateTotalWeaponEquipmentEffectStatusValue;
  *(undefined1 (*) [16])((long)ppuVar6 + -0xe8) = auVar36;
  *(undefined1 (*) [16])((long)ppuVar6 + -0xd8) = auVar31;
  *(ulong *)((long)ppuVar6 + -200) = auVar39._0_8_ & 0xffffffff;
  if ((bRam000000000a46e20e & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f46a88);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e20e = 1;
  }
  *(undefined8 *)((long)ppuVar6 + -0x108) = 0;
  *(undefined8 *)((long)ppuVar6 + -0x110) = 0;
  *(undefined8 *)((long)ppuVar6 + -0xf8) = 0;
  *(undefined8 *)((long)ppuVar6 + -0x100) = 0;
  *(undefined8 *)((long)ppuVar6 + -0x118) = 0;
  *(undefined8 *)((long)ppuVar6 + -0x120) = 0;
  if (iVar18 == 0) {
code_r0x09855384:
    puVar28 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar20 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if (*(int *)(lVar20 + 0xe0) == 0) {
      func_0x04151a94();
      lVar20 = *(long *)puVar28;
    }
    return **(undefined1 (**) [16])(lVar20 + 0xb8);
  }
  if (plVar10 != (long *)0x0) {
    lVar20 = *plVar10;
    uVar23 = (ulong)*(ushort *)(lVar20 + 0x12e);
    if (uVar23 != 0) {
      piVar19 = (int *)(*(long *)(lVar20 + 0xb0) + 8);
      do {
        if (*(long *)(piVar19 + -2) == *(long *)PTR_DAT_09f46a88) {
          puVar11 = (undefined8 *)(lVar20 + (long)(*piVar19 + 6) * 0x10 + 0x138);
          goto code_r0x09855294;
        }
        uVar23 = uVar23 - 1;
        piVar19 = piVar19 + 4;
      } while (uVar23 != 0);
    }
    puVar11 = (undefined8 *)func_0x041cb4c4(plVar10,*(long *)PTR_DAT_09f46a88,6);
code_r0x09855294:
    (*(code *)*puVar11)((undefined1 *)((long)ppuVar6 + -0x158),plVar10,iVar18,puVar11[1]);
    puVar28 = PTR_DAT_09ec4a50;
    if ((*(long *)((long)ppuVar6 + -0x158) != 0) && (plVar26 != (long *)0x0)) {
      lVar20 = *plVar26;
      uVar7 = *(undefined4 *)((long)ppuVar6 + -0x148);
      uVar2 = *(undefined4 *)(*(long *)((long)ppuVar6 + -0x158) + 0x3c);
      uVar23 = (ulong)*(ushort *)(lVar20 + 0x12e);
      if (uVar23 != 0) {
        piVar19 = (int *)(*(long *)(lVar20 + 0xb0) + 8);
        do {
          if (*(long *)(piVar19 + -2) == *(long *)PTR_DAT_09f470e0) {
            puVar11 = (undefined8 *)(lVar20 + (long)(*piVar19 + 6) * 0x10 + 0x138);
            goto code_r0x0985531c;
          }
          uVar23 = uVar23 - 1;
          piVar19 = piVar19 + 4;
        } while (uVar23 != 0);
      }
      puVar11 = (undefined8 *)func_0x041cb4c4(plVar26,*(long *)PTR_DAT_09f470e0,6);
code_r0x0985531c:
      (*(code *)*puVar11)((undefined1 *)((long)ppuVar6 + -0x158),plVar26,uVar2,puVar11[1]);
      lVar20 = *(long *)puVar28;
      *(undefined8 *)((long)ppuVar6 + -0x118) = *(undefined8 *)((long)ppuVar6 + -0x150);
      *(undefined8 *)((long)ppuVar6 + -0x120) = *(undefined8 *)((long)ppuVar6 + -0x158);
      *(undefined8 *)((long)ppuVar6 + -0x108) = *(undefined8 *)((long)ppuVar6 + -0x140);
      *(undefined8 *)((long)ppuVar6 + -0x110) = *(undefined8 *)((long)ppuVar6 + -0x148);
      *(undefined8 *)((long)ppuVar6 + -0xf8) = *(undefined8 *)((long)ppuVar6 + -0x130);
      *(undefined8 *)((long)ppuVar6 + -0x100) = *(undefined8 *)((long)ppuVar6 + -0x138);
      if (*(int *)(lVar20 + 0xe0) == 0) {
        func_0x04151a94();
      }
      if (*(int *)((long)ppuVar6 + -0x108) == (int)uVar16) {
        if (*(int *)(*(long *)puVar28 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar29 = func_0x091dc794((undefined1 *)((long)ppuVar6 + -0x120),uVar7,0);
        return auVar29;
      }
      goto code_r0x09855384;
    }
  }
  func_0x04151bb8();
  puVar28 = PTR_DAT_09f7fb10;
  *(undefined **)((long)ppuVar6 + -0x180) = &UNK_098553c0;
  *(long **)((long)ppuVar6 + -0x170) = plVar26;
  *(ulong *)((long)ppuVar6 + -0x168) = uVar16 & 0xffffffff;
  uVar8 = extraout_x1;
  if ((bRam000000000a46e20f & 1) == 0) {
    func_0x0415191c(PTR_DAT_09f7fb10);
    bRam000000000a46e20f = 1;
    uVar8 = extraout_x1_00;
  }
  lVar20 = *(long *)puVar28;
  if (*(int *)(lVar20 + 0xe0) == 0) {
    func_0x04151a94();
    lVar20 = *(long *)puVar28;
    uVar8 = extraout_x1_01;
  }
  auVar37._4_4_ = 0;
  auVar37._0_4_ = **(uint **)(lVar20 + 0xb8);
  auVar37._8_8_ = uVar8;
  return auVar37;
}


```

## WeaponStatusCalculator.CalculatePercentStatus(DataTableContainer tableContainer, StatusType statusType, int id)

```c

/* WARNING: Possible PIC construction at 0x09854708: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09854798: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0985470c) */
/* WARNING: Removing unreachable block (ram,0x09854710) */
/* WARNING: Removing unreachable block (ram,0x09854738) */
/* WARNING: Removing unreachable block (ram,0x09854740) */
/* WARNING: Removing unreachable block (ram,0x09854768) */
/* WARNING: Removing unreachable block (ram,0x0985474c) */
/* WARNING: Removing unreachable block (ram,0x09854758) */
/* WARNING: Removing unreachable block (ram,0x09854778) */
/* WARNING: Removing unreachable block (ram,0x0985479c) */
/* WARNING: Removing unreachable block (ram,0x098547b0) */
/* WARNING: Removing unreachable block (ram,0x098547b4) */
/* WARNING: Removing unreachable block (ram,0x091d1720) */

undefined1  [16]
WithNetwork_WeaponStatusCalculator__CalculatePercentStatus
          (undefined *param_1,long param_2,ulong param_3,ulong param_4,undefined8 param_5)

{
  uint uVar1;
  undefined4 uVar2;
  undefined *puVar3;
  undefined *puVar4;
  undefined1 *puVar5;
  undefined4 uVar6;
  long *plVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 *puVar10;
  undefined8 uVar11;
  long *plVar12;
  long lVar13;
  long *plVar14;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  undefined8 uVar15;
  int iVar16;
  long lVar17;
  ulong uVar18;
  ulong uVar19;
  undefined1 (*pauVar20) [16];
  int *piVar21;
  long *plVar22;
  long lVar23;
  long unaff_x25;
  undefined8 unaff_x26;
  ulong unaff_x27;
  ulong uVar24;
  undefined *unaff_x28;
  long *unaff_x29;
  undefined *puVar25;
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined1 auVar36 [12];
  undefined1 auStack_240 [8];
  undefined8 uStack_238;
  undefined8 uStack_230;
  undefined8 uStack_228;
  long lStack_220;
  long lStack_218;
  undefined8 uStack_210;
  undefined8 uStack_208;
  undefined8 uStack_200;
  undefined8 uStack_1f8;
  undefined8 uStack_1f0;
  undefined8 uStack_1e8;
  long lStack_1e0;
  undefined8 uStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  undefined8 uStack_1b8;
  long lStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  long *plStack_170;
  undefined *puStack_168;
  undefined *puStack_160;
  ulong uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  long *plStack_138;
  undefined1 auStack_130 [16];
  long *plStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  
  auVar27._8_8_ = unaff_x25;
  auVar27._0_8_ = param_2;
  puVar5 = &stack0xffffffffffffffb0;
  plVar22 = (long *)(param_4 & 0xffffffff);
  param_3 = param_3 & 0xffffffff;
  if ((bRam000000000a46e20c & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f7f9b0);
    func_0x0415191c(PTR_DAT_09f4b430);
    func_0x0415191c(PTR_DAT_09f4b438);
    func_0x0415191c(PTR_DAT_09f48a60);
    func_0x0415191c(PTR_DAT_09f46a88);
    bRam000000000a46e20c = 1;
  }
  puVar4 = PTR_DAT_09f7f9b0;
  puVar25 = PTR_DAT_09f4b430;
  if (param_2 == 0) {
code_r0x0985481c:
    auVar26 = func_0x04151bb8();
    puVar25 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    plVar7 = auVar26._8_8_;
    plVar22 = auVar26._0_8_;
    uVar8 = 1;
    auVar29._8_8_ = 0xa46e000;
    auVar29._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if ((bRam000000000a46e20a & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(PTR_DAT_09f46a88);
      func_0x0415191c(PTR_DAT_09f470e0);
      func_0x0415191c(PTR_DAT_09ec4a50);
      bRam000000000a46e20a = 1;
    }
    lVar17 = *(long *)puVar25;
    uStack_c8 = 0;
    uStack_d0 = 0;
    uStack_b8 = 0;
    uStack_c0 = 0;
    uStack_d8 = 0;
    uStack_e0 = 0;
    if (*(int *)(lVar17 + 0xe0) == 0) {
      func_0x04151a94();
      lVar17 = *(long *)puVar25;
    }
    auVar26._8_8_ = param_5;
    auVar26._0_8_ = uVar8;
    puVar25 = unaff_x28;
    plVar14 = unaff_x29;
    if (plVar22 != (long *)0x0) {
      pauVar20 = *(undefined1 (**) [16])(lVar17 + 0xb8);
      lVar17 = *plVar22;
      auVar29 = *pauVar20;
      auVar30 = *pauVar20;
      auVar28 = *pauVar20;
      uVar19 = (ulong)*(ushort *)(lVar17 + 0x12e);
      if (uVar19 != 0) {
        piVar21 = (int *)(*(long *)(lVar17 + 0xb0) + 8);
        do {
          if (*(long *)(piVar21 + -2) == *(long *)PTR_DAT_09f46a88) {
            puVar10 = (undefined8 *)(lVar17 + (long)(*piVar21 + 7) * 0x10 + 0x138);
            goto code_r0x09854920;
          }
          uVar19 = uVar19 - 1;
          piVar21 = piVar21 + 4;
        } while (uVar19 != 0);
      }
      uVar8 = 7;
      puVar10 = (undefined8 *)func_0x041cb4c4(plVar22);
code_r0x09854920:
      plVar12 = (long *)(*(code *)*puVar10)(plVar22,puVar10[1]);
      puVar3 = PTR_DAT_09f470e0;
      puVar4 = PTR_DAT_09ec4a50;
      auVar26._8_8_ = param_5;
      auVar26._0_8_ = uVar8;
      if (plVar12 != (long *)0x0) {
        if (0 < (int)plVar12[3]) {
          unaff_x27 = 0;
          uVar19 = plVar12[3] & 0xffffffff;
          unaff_x26 = 0x38;
          auVar28 = auVar30;
          do {
            uVar8 = auVar26._8_8_;
            plVar22 = plVar12;
            puVar25 = puVar3;
            plVar14 = (long *)puVar4;
            if (uVar19 <= unaff_x27) goto code_r0x09854ab0;
            if (*(char *)((long)plVar12 + unaff_x27 * 0x38 + 0x4c) != '\0') {
              auVar29 = auVar28;
              if ((plVar12[unaff_x27 * 7 + 4] == 0) || (plVar7 == (long *)0x0))
              goto code_r0x09854aac;
              lVar17 = *plVar7;
              uVar1 = *(uint *)(plVar12 + unaff_x27 * 7 + 6);
              uVar6 = *(undefined4 *)(plVar12[unaff_x27 * 7 + 4] + 0x38);
              auVar27._8_4_ = uVar6;
              auVar27._0_8_ = CONCAT44(0,uVar1);
              auVar27._12_4_ = 0;
              uVar19 = (ulong)*(ushort *)(lVar17 + 0x12e);
              if (uVar19 != 0) {
                piVar21 = (int *)(*(long *)(lVar17 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar21 + -2) == *(long *)puVar3) {
                    puVar10 = (undefined8 *)(lVar17 + (long)(*piVar21 + 6) * 0x10 + 0x138);
                    goto code_r0x098549d4;
                  }
                  uVar19 = uVar19 - 1;
                  piVar21 = piVar21 + 4;
                } while (uVar19 != 0);
              }
              puVar10 = (undefined8 *)func_0x041cb4c4(plVar7,*(long *)puVar3,6);
code_r0x098549d4:
              uVar9 = puVar10[1];
              (*(code *)*puVar10)(&uStack_110,plVar7,uVar6);
              uStack_d8 = uStack_108;
              uStack_e0 = uStack_110;
              uStack_c8 = uStack_f8;
              uStack_d0 = uStack_100;
              uStack_b8 = uStack_e8;
              uStack_c0 = uStack_f0;
              if (*(int *)(*(long *)puVar4 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar26._8_8_ = uVar8;
              auVar26._0_8_ = uVar9;
              if ((int)uStack_c8 == 1) {
                if (*(int *)(*(long *)puVar4 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar27 = func_0x091dc794(&uStack_e0,CONCAT44(0,uVar1),0);
                if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                auVar26 = auVar27;
                auVar28 = func_0x09774360(auVar28._0_8_,auVar28._8_8_,auVar27._0_8_,auVar27._8_8_,0)
                ;
              }
            }
            uVar19 = (ulong)*(uint *)(plVar12 + 3);
            unaff_x27 = unaff_x27 + 1;
          } while ((long)unaff_x27 < (long)(int)*(uint *)(plVar12 + 3));
        }
        return auVar28;
      }
    }
code_r0x09854aac:
    auVar28 = auVar29;
    func_0x04151bb8();
code_r0x09854ab0:
    auVar29 = func_0x04151bc0();
    puVar4 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    auVar30._8_8_ = unaff_x27;
    auVar30._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar23 = auVar26._8_8_;
    lVar17 = auVar26._0_8_;
    unaff_x25 = auVar29._8_8_;
    plVar12 = auVar29._0_8_;
    puVar5 = auStack_240;
    puStack_168 = &
                  WithNetwork_WeaponStatusCalculator__CalculatePredictedTotalWeaponAttackPossessionEffectValue
    ;
    uStack_118 = 1;
    unaff_x29 = &lStack_1b0;
    plStack_170 = plVar14;
    puStack_160 = puVar25;
    uStack_158 = unaff_x27;
    uStack_150 = unaff_x26;
    plStack_138 = plVar22;
    plStack_120 = plVar7;
    auStack_130 = auVar28;
    if ((bRam000000000a46e20b & 1) == 0) {
      uStack_148 = auVar27._8_8_;
      uStack_140 = auVar27._0_8_;
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(PTR_DAT_09eaa288);
      func_0x0415191c(PTR_DAT_09f7fb00);
      func_0x0415191c(PTR_DAT_09f7fb08);
      func_0x0415191c(PTR_DAT_09eaa8d0);
      func_0x0415191c(PTR_DAT_09ec4a50);
      auVar27._8_8_ = uStack_148;
      auVar27._0_8_ = uStack_140;
      bRam000000000a46e20b = 1;
    }
    uStack_148 = auVar27._8_8_;
    uStack_140 = auVar27._0_8_;
    lVar13 = *(long *)puVar4;
    uStack_180 = 0;
    uStack_188 = 0;
    uStack_190 = 0;
    uStack_1a8 = 0;
    lStack_1b0 = 0;
    uStack_198 = 0;
    uStack_1a0 = 0;
    uStack_1c8 = 0;
    uStack_1d0 = 0;
    uStack_1b8 = 0;
    uStack_1c0 = 0;
    uStack_1d8 = 0;
    lStack_1e0 = 0;
    if (*(int *)(lVar13 + 0xe0) == 0) {
      func_0x04151a94();
      auVar27._8_8_ = uStack_148;
      auVar27._0_8_ = uStack_140;
      lVar13 = *(long *)puVar4;
    }
    uStack_148 = auVar27._8_8_;
    uStack_140 = auVar27._0_8_;
    uVar8 = auVar26._8_8_;
    plVar22 = (long *)0x0;
    param_1 = (undefined *)0xa46e000;
    unaff_x28 = puVar25;
    if (plVar12 == (long *)0x0) {
code_r0x09854ea8:
      uStack_148 = auVar27._8_8_;
      uStack_140 = auVar27._0_8_;
      func_0x04151bb8();
      puVar4 = param_1;
      puVar25 = unaff_x28;
    }
    else {
      pauVar20 = *(undefined1 (**) [16])(lVar13 + 0xb8);
      lVar13 = *plVar12;
      uVar9 = *(undefined8 *)*pauVar20;
      auVar30._0_8_ = uVar9;
      uVar11 = *(undefined8 *)(*pauVar20 + 8);
      auVar31 = *pauVar20;
      uVar19 = (ulong)*(ushort *)(lVar13 + 0x12e);
      if (uVar19 != 0) {
        piVar21 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
        do {
          if (*(long *)(piVar21 + -2) == *(long *)PTR_DAT_09f7fb00) {
            puVar10 = (undefined8 *)(lVar13 + (long)*piVar21 * 0x10 + 0x138);
            goto code_r0x09854be0;
          }
          uVar19 = uVar19 - 1;
          piVar21 = piVar21 + 4;
        } while (uVar19 != 0);
      }
      uVar15 = 0;
      puVar10 = (undefined8 *)func_0x041cb4c4(plVar12);
      auVar27._8_8_ = uStack_148;
      auVar27._0_8_ = uStack_140;
      auVar26._8_8_ = uVar8;
      auVar26._0_8_ = uVar15;
code_r0x09854be0:
      uStack_148 = auVar27._8_8_;
      uStack_140 = auVar27._0_8_;
      lStack_220 = lVar17;
      plVar22 = (long *)(*(code *)*puVar10)(plVar12,puVar10[1]);
      param_1 = PTR_DAT_09f7fb08;
      unaff_x28 = PTR_DAT_09eaa8d0;
      puVar4 = (undefined *)0xa46e000;
      if (plVar22 != (long *)0x0) {
code_r0x09854c10:
        uStack_228 = uVar9;
        uStack_230 = uVar11;
        uVar8 = auVar26._8_8_;
        lVar17 = *plVar22;
        uVar19 = (ulong)*(ushort *)(lVar17 + 0x12e);
        if (uVar19 != 0) {
          piVar21 = (int *)(*(long *)(lVar17 + 0xb0) + 8);
          do {
            if (*(long *)(piVar21 + -2) == *(long *)unaff_x28) {
              puVar10 = (undefined8 *)(lVar17 + (long)*piVar21 * 0x10 + 0x138);
              goto code_r0x09854c5c;
            }
            uVar19 = uVar19 - 1;
            piVar21 = piVar21 + 4;
          } while (uVar19 != 0);
        }
        uVar9 = 0;
        puVar10 = (undefined8 *)func_0x041cb4c4(plVar22);
        auVar26._8_8_ = uVar8;
        auVar26._0_8_ = uVar9;
code_r0x09854c5c:
        uVar19 = (*(code *)*puVar10)(plVar22,puVar10[1]);
        uVar8 = auVar26._8_8_;
        if ((uVar19 & 1) == 0) {
          lVar23 = 0;
          goto code_r0x09854e0c;
        }
        lVar17 = *plVar22;
        uVar19 = (ulong)*(ushort *)(lVar17 + 0x12e);
        if (uVar19 != 0) {
          piVar21 = (int *)(*(long *)(lVar17 + 0xb0) + 8);
          do {
            if (*(long *)(piVar21 + -2) == *(long *)param_1) {
              puVar10 = (undefined8 *)(lVar17 + (long)*piVar21 * 0x10 + 0x138);
              goto code_r0x09854cb8;
            }
            uVar19 = uVar19 - 1;
            piVar21 = piVar21 + 4;
          } while (uVar19 != 0);
        }
        uVar9 = 0;
        puVar10 = (undefined8 *)func_0x041cb4c4(plVar22);
        auVar26._8_8_ = uVar8;
        auVar26._0_8_ = uVar9;
code_r0x09854cb8:
        (*(code *)*puVar10)(&lStack_218,plVar22,puVar10[1]);
        uStack_1a8 = uStack_210;
        lStack_1b0 = lStack_218;
        uStack_198 = uStack_200;
        uStack_1a0 = uStack_208;
        uStack_188 = uStack_1f0;
        uStack_190 = uStack_1f8;
        uStack_180 = uStack_1e8;
        uVar19 = func_0x091bbeac(&lStack_1b0,0);
        uVar8 = auVar26._8_8_;
        if (lVar23 != 0) {
          uVar9 = *(undefined8 *)(lVar23 + 0x28);
          uVar19 = (**(code **)(lVar23 + 0x18))(*(undefined8 *)(lVar23 + 0x40));
          auVar26._8_8_ = uVar8;
          auVar26._0_8_ = uVar9;
          uVar11 = uStack_230;
          uVar9 = uStack_228;
          if ((uVar19 & 1) != 0) {
            if (lStack_1b0 == 0) goto code_r0x09854ea0;
            if (unaff_x25 == 0) goto code_r0x09854ea4;
            uVar15 = *(undefined8 *)(unaff_x25 + 0x28);
            (**(code **)(unaff_x25 + 0x18))
                      (&lStack_218,*(undefined8 *)(unaff_x25 + 0x40),
                       *(undefined4 *)(lStack_1b0 + 0x38));
            uStack_1d8 = uStack_210;
            lStack_1e0 = lStack_218;
            uStack_1c8 = uStack_200;
            uStack_1d0 = uStack_208;
            uStack_1b8 = uStack_1f0;
            uStack_1c0 = uStack_1f8;
            if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar26._8_8_ = uVar8;
            auVar26._0_8_ = uVar15;
            uVar11 = uStack_230;
            uVar9 = uStack_228;
            if ((int)uStack_1c8 == 1) {
              uVar19 = func_0x091bbeac(&lStack_1b0,0);
              auVar26._8_8_ = uVar8;
              auVar26._0_8_ = uVar15;
              auVar32._8_8_ = uVar19 & 0xffffffff;
              auVar32._0_8_ = uVar19;
              if (lStack_220 == 0) goto code_r0x09854ebc;
              uStack_238 = auVar31._8_8_;
              uVar6 = (**(code **)(lStack_220 + 0x18))
                                (*(undefined8 *)(lStack_220 + 0x40),uVar19 & 0xffffffff,
                                 *(undefined8 *)(lStack_220 + 0x28));
              if (*(int *)(*(long *)PTR_DAT_09ec4a50 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar30 = func_0x091dc794(&lStack_1e0,uVar6,0);
              if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                func_0x04151a94();
              }
              auVar26 = auVar30;
              auVar31 = func_0x09774360(auVar31._0_8_,uStack_238,auVar30._0_8_,auVar30._8_8_,0);
              uVar11 = uStack_230;
              uVar9 = uStack_228;
            }
          }
          goto code_r0x09854c10;
        }
        func_0x04151bb8(uVar19,uVar19 & 0xffffffff);
code_r0x09854ea0:
        func_0x04151bb8();
code_r0x09854ea4:
        func_0x04151bb8();
        auVar27._8_8_ = uStack_148;
        auVar27._0_8_ = uStack_140;
        goto code_r0x09854ea8;
      }
    }
    unaff_x28 = puVar25;
    param_1 = puVar4;
    uVar8 = auVar30._0_8_;
    func_0x04151bb8();
    while( true ) {
      auVar32 = func_0x04151bb0(lVar23);
      auVar31._8_8_ = uStack_238;
      auVar31._0_8_ = uVar8;
code_r0x09854ebc:
      uStack_238 = auVar31._8_8_;
      param_3 = auVar31._0_8_;
      unaff_x27 = auVar30._8_8_;
      uVar9 = auVar30._0_8_;
      auVar36 = func_0x04151bb8(auVar32._0_8_,auVar32._8_8_);
      unaff_x26 = uStack_238;
      uVar11 = auVar26._8_8_;
      auVar31._8_8_ = uStack_238;
      auVar31._0_8_ = param_3;
      plVar7 = auVar36._0_8_;
      if (auVar36._8_4_ != 1) break;
      plVar7 = (long *)func_0x098f6de0(plVar7);
      lVar23 = *plVar7;
      func_0x098f6df0();
code_r0x09854e0c:
      uVar9 = auVar26._8_8_;
      uVar8 = auVar31._0_8_;
      if (plVar22 != (long *)0x0) {
        lVar17 = *plVar22;
        uVar19 = (ulong)*(ushort *)(lVar17 + 0x12e);
        if (uVar19 != 0) {
          piVar21 = (int *)(*(long *)(lVar17 + 0xb0) + 8);
          do {
            if (*(long *)(piVar21 + -2) == *(long *)PTR_DAT_09eaa288) {
              puVar10 = (undefined8 *)(lVar17 + (long)*piVar21 * 0x10 + 0x138);
              goto code_r0x09854e64;
            }
            uVar19 = uVar19 - 1;
            piVar21 = piVar21 + 4;
          } while (uVar19 != 0);
        }
        uVar11 = 0;
        puVar10 = (undefined8 *)func_0x041cb4c4(plVar22);
        auVar26._8_8_ = uVar9;
        auVar26._0_8_ = uVar11;
code_r0x09854e64:
        (*(code *)*puVar10)(plVar22,puVar10[1]);
      }
      if (lVar23 == 0) {
        return auVar31;
      }
    }
    uVar8 = 0;
    if (plVar22 != (long *)0x0) {
      lVar17 = *plVar22;
      uVar19 = (ulong)*(ushort *)(lVar17 + 0x12e);
      if (uVar19 != 0) {
        piVar21 = (int *)(*(long *)(lVar17 + 0xb0) + 8);
        do {
          if (*(long *)(piVar21 + -2) == *(long *)PTR_DAT_09eaa288) {
            puVar10 = (undefined8 *)(lVar17 + (long)*piVar21 * 0x10 + 0x138);
            goto code_r0x09854f8c;
          }
          uVar19 = uVar19 - 1;
          piVar21 = piVar21 + 4;
        } while (uVar19 != 0);
      }
      uVar15 = 0;
      puVar10 = (undefined8 *)func_0x041cb4c4(plVar22);
      auVar26._8_8_ = uVar11;
      auVar26._0_8_ = uVar15;
code_r0x09854f8c:
      (*(code *)*puVar10)(plVar22,puVar10[1]);
    }
    func_0x04247ab0(plVar7);
    func_0x04151bb0(0);
    puVar25 = &WithNetwork_WeaponStatusCalculator__CalculateTotalWeaponPossessionEffectStatusValue;
    auVar28 = func_0x03bf6574();
  }
  else {
    plVar7 = (long *)func_0x053c429c(param_2,*(undefined8 *)PTR_DAT_09f4b438);
    uVar8 = func_0x053c2424(param_2,*(undefined8 *)puVar25);
    uVar9 = func_0x053c0a5c(param_2,*(undefined8 *)puVar4);
    if (plVar7 == (long *)0x0) goto code_r0x0985481c;
    lVar17 = *plVar7;
    uVar19 = (ulong)*(ushort *)(lVar17 + 0x12e);
    if (uVar19 != 0) {
      piVar21 = (int *)(*(long *)(lVar17 + 0xb0) + 8);
      do {
        if (*(long *)(piVar21 + -2) == *(long *)PTR_DAT_09f46a88) {
          puVar10 = (undefined8 *)(lVar17 + (long)(*piVar21 + 7) * 0x10 + 0x138);
          goto code_r0x098546f0;
        }
        uVar19 = uVar19 - 1;
        piVar21 = piVar21 + 4;
      } while (uVar19 != 0);
    }
    puVar10 = (undefined8 *)func_0x041cb4c4(plVar7,*(long *)PTR_DAT_09f46a88,7);
code_r0x098546f0:
    uVar11 = (*(code *)*puVar10)(plVar7,puVar10[1]);
    auVar26._8_8_ = param_5;
    auVar26._0_8_ = param_3;
    auVar28._8_8_ = uVar11;
    auVar28._0_8_ = uVar8;
    puVar25 = &UNK_0985470c;
  }
  puVar4 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  lVar17 = auVar28._8_8_;
  plVar14 = auVar28._0_8_;
  *(long **)(puVar5 + -0x60) = unaff_x29;
  *(undefined **)(puVar5 + -0x58) = puVar25;
  *(undefined **)(puVar5 + -0x50) = unaff_x28;
  *(ulong *)(puVar5 + -0x48) = unaff_x27;
  *(undefined8 *)(puVar5 + -0x40) = unaff_x26;
  *(long *)(puVar5 + -0x38) = unaff_x25;
  *(undefined8 *)(puVar5 + -0x30) = uVar9;
  *(undefined8 *)(puVar5 + -0x28) = uVar8;
  *(long **)(puVar5 + -0x20) = plVar7;
  *(ulong *)(puVar5 + -0x18) = param_3;
  *(undefined **)(puVar5 + -0x10) = param_1;
  *(long **)(puVar5 + -8) = plVar22;
  auVar34._8_8_ = 0xa46e000;
  auVar34._0_8_ = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  auVar33 = auVar26;
  if ((bRam000000000a46e20d & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e20d = 1;
  }
  lVar23 = *(long *)puVar4;
  *(undefined8 *)(puVar5 + -0x78) = 0;
  *(undefined8 *)(puVar5 + -0x80) = 0;
  *(undefined8 *)(puVar5 + -0x68) = 0;
  *(undefined8 *)(puVar5 + -0x70) = 0;
  *(undefined8 *)(puVar5 + -0x88) = 0;
  *(undefined8 *)(puVar5 + -0x90) = 0;
  if (*(int *)(lVar23 + 0xe0) == 0) {
    func_0x04151a94();
    lVar23 = *(long *)puVar4;
  }
  puVar4 = PTR_DAT_09f470e0;
  puVar25 = PTR_DAT_09ec4a50;
  uVar19 = auVar33._8_8_;
  iVar16 = auVar33._4_4_;
  if (lVar17 != 0) {
    auVar34 = **(undefined1 (**) [16])(lVar23 + 0xb8);
    if (0 < (int)*(ulong *)(lVar17 + 0x18)) {
      uVar24 = 0;
      uVar18 = *(ulong *)(lVar17 + 0x18) & 0xffffffff;
      auVar34 = **(undefined1 (**) [16])(lVar23 + 0xb8);
      do {
        uVar19 = auVar33._8_8_;
        iVar16 = auVar33._4_4_;
        if (uVar18 <= uVar24) goto code_r0x098551c0;
        lVar23 = lVar17 + uVar24 * 0x38;
        if (*(char *)(lVar23 + 0x4c) != '\0') {
          if ((*(long *)(lVar23 + 0x20) == 0) || (plVar14 == (long *)0x0)) goto code_r0x098551bc;
          lVar13 = *plVar14;
          uVar6 = *(undefined4 *)(lVar23 + 0x30);
          uVar2 = *(undefined4 *)(*(long *)(lVar23 + 0x20) + 0x38);
          uVar18 = (ulong)*(ushort *)(lVar13 + 0x12e);
          if (uVar18 != 0) {
            piVar21 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
            do {
              if (*(long *)(piVar21 + -2) == *(long *)puVar4) {
                puVar10 = (undefined8 *)(lVar13 + (long)(*piVar21 + 6) * 0x10 + 0x138);
                goto code_r0x098550e4;
              }
              uVar18 = uVar18 - 1;
              piVar21 = piVar21 + 4;
            } while (uVar18 != 0);
          }
          puVar10 = (undefined8 *)func_0x041cb4c4(plVar14,*(long *)puVar4,6);
code_r0x098550e4:
          uVar8 = puVar10[1];
          (*(code *)*puVar10)(puVar5 + -0xc0,plVar14,uVar2);
          lVar23 = *(long *)puVar25;
          *(undefined8 *)(puVar5 + -0x88) = *(undefined8 *)(puVar5 + -0xb8);
          *(undefined8 *)(puVar5 + -0x90) = *(undefined8 *)(puVar5 + -0xc0);
          *(undefined8 *)(puVar5 + -0x78) = *(undefined8 *)(puVar5 + -0xa8);
          *(undefined8 *)(puVar5 + -0x80) = *(undefined8 *)(puVar5 + -0xb0);
          *(undefined8 *)(puVar5 + -0x68) = *(undefined8 *)(puVar5 + -0x98);
          *(undefined8 *)(puVar5 + -0x70) = *(undefined8 *)(puVar5 + -0xa0);
          if (*(int *)(lVar23 + 0xe0) == 0) {
            func_0x04151a94();
          }
          auVar33._8_8_ = uVar19;
          auVar33._0_8_ = uVar8;
          if (*(int *)(puVar5 + -0x78) == auVar26._0_4_) {
            if (*(int *)(*(long *)puVar25 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar33 = func_0x091dc794(puVar5 + -0x90,uVar6,0);
            if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
              func_0x04151a94();
            }
            auVar34 = func_0x09774360(auVar34._0_8_,auVar34._8_8_,auVar33._0_8_,auVar33._8_8_,0);
          }
        }
        uVar18 = (ulong)*(uint *)(lVar17 + 0x18);
        uVar24 = uVar24 + 1;
      } while ((long)uVar24 < (long)(int)*(uint *)(lVar17 + 0x18));
    }
    return auVar34;
  }
code_r0x098551bc:
  func_0x04151bb8();
code_r0x098551c0:
  auVar27 = func_0x04151bc0();
  plVar7 = auVar27._8_8_;
  plVar22 = auVar27._0_8_;
  *(undefined **)(puVar5 + -0xf0) =
       &WithNetwork_WeaponStatusCalculator__CalculateTotalWeaponEquipmentEffectStatusValue;
  *(undefined1 (*) [16])(puVar5 + -0xe8) = auVar34;
  *(undefined1 (*) [16])(puVar5 + -0xd8) = auVar28;
  *(ulong *)(puVar5 + -200) = auVar26._0_8_ & 0xffffffff;
  if ((bRam000000000a46e20e & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09f46a88);
    func_0x0415191c(PTR_DAT_09f470e0);
    func_0x0415191c(PTR_DAT_09ec4a50);
    bRam000000000a46e20e = 1;
  }
  *(undefined8 *)(puVar5 + -0x108) = 0;
  *(undefined8 *)(puVar5 + -0x110) = 0;
  *(undefined8 *)(puVar5 + -0xf8) = 0;
  *(undefined8 *)(puVar5 + -0x100) = 0;
  *(undefined8 *)(puVar5 + -0x118) = 0;
  *(undefined8 *)(puVar5 + -0x120) = 0;
  if (iVar16 == 0) {
code_r0x09855384:
    puVar25 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar17 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if (*(int *)(lVar17 + 0xe0) == 0) {
      func_0x04151a94();
      lVar17 = *(long *)puVar25;
    }
    return **(undefined1 (**) [16])(lVar17 + 0xb8);
  }
  if (plVar7 != (long *)0x0) {
    lVar17 = *plVar7;
    uVar24 = (ulong)*(ushort *)(lVar17 + 0x12e);
    if (uVar24 != 0) {
      piVar21 = (int *)(*(long *)(lVar17 + 0xb0) + 8);
      do {
        if (*(long *)(piVar21 + -2) == *(long *)PTR_DAT_09f46a88) {
          puVar10 = (undefined8 *)(lVar17 + (long)(*piVar21 + 6) * 0x10 + 0x138);
          goto code_r0x09855294;
        }
        uVar24 = uVar24 - 1;
        piVar21 = piVar21 + 4;
      } while (uVar24 != 0);
    }
    puVar10 = (undefined8 *)func_0x041cb4c4(plVar7,*(long *)PTR_DAT_09f46a88,6);
code_r0x09855294:
    (*(code *)*puVar10)(puVar5 + -0x158,plVar7,iVar16,puVar10[1]);
    puVar25 = PTR_DAT_09ec4a50;
    if ((*(long *)(puVar5 + -0x158) != 0) && (plVar22 != (long *)0x0)) {
      lVar17 = *plVar22;
      uVar6 = *(undefined4 *)(puVar5 + -0x148);
      uVar2 = *(undefined4 *)(*(long *)(puVar5 + -0x158) + 0x3c);
      uVar24 = (ulong)*(ushort *)(lVar17 + 0x12e);
      if (uVar24 != 0) {
        piVar21 = (int *)(*(long *)(lVar17 + 0xb0) + 8);
        do {
          if (*(long *)(piVar21 + -2) == *(long *)PTR_DAT_09f470e0) {
            puVar10 = (undefined8 *)(lVar17 + (long)(*piVar21 + 6) * 0x10 + 0x138);
            goto code_r0x0985531c;
          }
          uVar24 = uVar24 - 1;
          piVar21 = piVar21 + 4;
        } while (uVar24 != 0);
      }
      puVar10 = (undefined8 *)func_0x041cb4c4(plVar22,*(long *)PTR_DAT_09f470e0,6);
code_r0x0985531c:
      (*(code *)*puVar10)(puVar5 + -0x158,plVar22,uVar2,puVar10[1]);
      lVar17 = *(long *)puVar25;
      *(undefined8 *)(puVar5 + -0x118) = *(undefined8 *)(puVar5 + -0x150);
      *(undefined8 *)(puVar5 + -0x120) = *(undefined8 *)(puVar5 + -0x158);
      *(undefined8 *)(puVar5 + -0x108) = *(undefined8 *)(puVar5 + -0x140);
      *(undefined8 *)(puVar5 + -0x110) = *(undefined8 *)(puVar5 + -0x148);
      *(undefined8 *)(puVar5 + -0xf8) = *(undefined8 *)(puVar5 + -0x130);
      *(undefined8 *)(puVar5 + -0x100) = *(undefined8 *)(puVar5 + -0x138);
      if (*(int *)(lVar17 + 0xe0) == 0) {
        func_0x04151a94();
      }
      if (*(int *)(puVar5 + -0x108) == (int)uVar19) {
        if (*(int *)(*(long *)puVar25 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar27 = func_0x091dc794(puVar5 + -0x120,uVar6,0);
        return auVar27;
      }
      goto code_r0x09855384;
    }
  }
  func_0x04151bb8();
  puVar25 = PTR_DAT_09f7fb10;
  *(undefined **)(puVar5 + -0x180) = &UNK_098553c0;
  *(long **)(puVar5 + -0x170) = plVar22;
  *(ulong *)(puVar5 + -0x168) = uVar19 & 0xffffffff;
  uVar8 = extraout_x1;
  if ((bRam000000000a46e20f & 1) == 0) {
    func_0x0415191c(PTR_DAT_09f7fb10);
    bRam000000000a46e20f = 1;
    uVar8 = extraout_x1_00;
  }
  lVar17 = *(long *)puVar25;
  if (*(int *)(lVar17 + 0xe0) == 0) {
    func_0x04151a94();
    lVar17 = *(long *)puVar25;
    uVar8 = extraout_x1_01;
  }
  auVar35._4_4_ = 0;
  auVar35._0_4_ = **(uint **)(lVar17 + 0xb8);
  auVar35._8_8_ = uVar8;
  return auVar35;
}


```

## LevelRangeValue.GetValue(int level)

```c

undefined1  [16] WithNetwork_LevelRangeValue__GetValue(long param_1,undefined4 param_2)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined *puVar6;
  long lVar7;
  undefined8 uVar8;
  ulong uVar9;
  long lVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  long *plVar13;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 *puVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  undefined1 auVar18 [16];
  long lStack_70;
  long lStack_68;
  undefined *puStack_60;
  long lStack_58;
  undefined *puStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  
  puVar6 = PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948;
  if ((bRam000000000a46988b & 1) == 0) {
    func_0x0415191c(PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948);
    bRam000000000a46988b = 1;
  }
  if (*(int *)(*(long *)puVar6 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar18 = func_0x091d3f74(param_1,param_2);
  lVar17 = auVar18._8_8_;
  iVar2 = *(int *)(param_1 + 0x24);
  if ((bRam000000000a469891 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948);
    bRam000000000a469891 = 1;
  }
  puVar6 = PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948;
  if (iVar2 == 1) {
    return auVar18;
  }
  if (iVar2 != 2) {
    if (iVar2 == 0) {
      uVar11 = func_0x04151930(PTR_WithNetwork_Enums_LevelRangeValueType_TypeInfo_09f44f20);
      uVar11 = func_0x04151a9c(uVar11,&stack0xffffffffffffffdc);
      uVar12 = func_0x04151930(PTR_DAT_09f44f28);
      uVar11 = func_0x084656c4(uVar12,uVar11,0);
      func_0x04151930(PTR_DAT_09ec4608);
      uVar12 = func_0x04151ba8();
      func_0x08afad84(uVar12,uVar11,0);
    }
    else {
      uVar11 = func_0x04151930(PTR_WithNetwork_Enums_LevelRangeValueType_TypeInfo_09f44f20);
      uVar11 = func_0x04151a9c(uVar11,&stack0xffffffffffffffd8);
      func_0x04151930(PTR_DAT_09eaac30);
      uVar12 = func_0x04151ba8();
      uVar8 = func_0x04151930(PTR_DAT_09f06c70);
      func_0x0854b9b0(uVar12,uVar8,uVar11,0,0);
    }
    uVar8 = func_0x04151930(PTR_Method_WithNetwork_LevelRangeValue_ToTypeValue___09f45a70);
    auVar18 = func_0x04151a84(uVar12,uVar8);
    uVar8 = auVar18._8_8_;
    puStack_50 = &WithNetwork_LevelRangeValue__IsEndLevelInfinite;
    uStack_40 = uVar12;
    uStack_38 = uVar11;
    if ((bRam000000000a46988c & 1) == 0) {
      func_0x0415191c(PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948);
      bRam000000000a46988c = 1;
      uVar8 = extraout_x1;
    }
    if (*(int *)(auVar18._0_8_ + 0x20) == 2) {
      if (*(int *)(*(long *)PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948 + 0xe0) == 0) {
        func_0x04151a94();
        uVar8 = extraout_x1_00;
      }
      uVar9 = (ulong)(*(int *)(auVar18._0_8_ + 0x30) == 0);
    }
    else {
      uVar9 = 0;
    }
    auVar18._8_8_ = uVar8;
    auVar18._0_8_ = uVar9;
    return auVar18;
  }
  lVar7 = *(long *)PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948;
  if (*(int *)(lVar7 + 0xe0) == 0) {
    func_0x04151a94();
    lVar7 = *(long *)puVar6;
  }
  lVar1 = **(long **)(lVar7 + 0xb8);
  lVar7 = (*(long **)(lVar7 + 0xb8))[1];
  if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
    func_0x04151a94(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
  }
  if ((bRam000000000a46d944 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46d944 = 1;
  }
  puVar6 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if (lVar1 == 0) {
    func_0x04151930(PTR_DAT_09ec32d8);
    uVar11 = func_0x04151ba8();
    func_0x085a42d4(uVar11,0);
    uVar12 = func_0x04151930(PTR_Method_Applibot_Math_BigDecimal_op_Division___09f79378);
    plVar13 = (long *)func_0x04151a84(uVar11,uVar12);
    puStack_60 = &Applibot_Math_BigDecimal__Floor;
    lStack_58 = lVar17;
    puStack_50 = (undefined *)lVar7;
    uStack_48 = uVar11;
    if ((bRam000000000a46d931 & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      bRam000000000a46d931 = 1;
    }
    puVar6 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar17 = plVar13[1];
    if (lVar17 < 1) {
      lVar7 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
      if ((lVar17 < -0xc) || (*plVar13 == 0)) {
        if (*(int *)(lVar7 + 0xe0) == 0) {
          func_0x04151a94();
          lVar7 = *(long *)puVar6;
        }
        lStack_68 = (*(long **)(lVar7 + 0xb8))[1];
        lStack_70 = **(long **)(lVar7 + 0xb8);
      }
      else {
        if (*(int *)(lVar7 + 0xe0) == 0) {
          func_0x04151a94();
        }
        lVar7 = func_0x097740c8(-lVar17);
        lStack_70 = 0;
        lStack_68 = 0;
        lVar17 = 0;
        if (lVar7 != 0) {
          lVar17 = *plVar13 / lVar7;
        }
        func_0x09773f14(&lStack_70,lVar17 * lVar7,plVar13[1]);
      }
    }
    else {
      lStack_68 = plVar13[1];
      lStack_70 = *plVar13;
    }
    auVar4._8_8_ = lStack_68;
    auVar4._0_8_ = lStack_70;
    return auVar4;
  }
  lVar10 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if (*(int *)(lVar10 + 0xe0) == 0) {
    func_0x04151a94();
    lVar10 = *(long *)puVar6;
  }
  puVar14 = *(undefined8 **)(lVar10 + 0xb8);
  if (auVar18._0_8_ == 0) {
    uStack_38 = puVar14[1];
    uStack_40 = *puVar14;
  }
  else {
    lVar15 = puVar14[8];
    lVar16 = lVar15 * auVar18._0_8_;
    lVar10 = 0;
    if (lVar1 != 0) {
      lVar10 = lVar16 / lVar1;
    }
    lVar3 = 0;
    if (lVar1 != 0) {
      lVar3 = ((lVar16 - lVar10 * lVar1) * lVar15) / lVar1;
    }
    uStack_40 = 0;
    uStack_38 = 0;
    func_0x09773f14(&uStack_40,lVar3 + lVar10 * lVar15,(lVar17 - lVar7) + -0xc);
  }
  auVar5._8_8_ = uStack_38;
  auVar5._0_8_ = uStack_40;
  return auVar5;
}


```

## LevelRangeValue.GetRawValue(int level)

```c

undefined8 WithNetwork_LevelRangeValue__GetRawValue(undefined8 *param_1,int param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  int iVar4;
  undefined *puVar5;
  undefined8 uVar6;
  long lVar7;
  int iVar8;
  undefined1 auVar9 [16];
  
  if ((bRam000000000a46988f & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948);
    bRam000000000a46988f = 1;
  }
  puVar5 = PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948;
  iVar8 = *(int *)(param_1 + 4);
  if (iVar8 == 1) {
    if (*(int *)(*(long *)PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948 + 0xe0) == 0) {
      func_0x04151a94();
    }
    iVar8 = *(int *)((long)param_1 + 0x2c);
    iVar4 = *(int *)(param_1 + 6) - iVar8;
    if (iVar4 == 0) {
      uVar6 = param_1[2];
    }
    else {
      if (*(int *)(*(long *)puVar5 + 0xe0) == 0) {
        func_0x04151a94();
        iVar8 = *(int *)((long)param_1 + 0x2c);
      }
      uVar6 = func_0x091d454c((float)(param_2 - iVar8),iVar4,*param_1,param_1[1],param_1[2],
                              param_1[3]);
    }
  }
  else {
    if (iVar8 == 3) {
      if (*(int *)(*(long *)PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948 + 0xe0) == 0) {
        func_0x04151a94();
      }
      if (*(int *)((long)param_1 + 0x2c) <= param_2) {
        return *param_1;
      }
    }
    else if (iVar8 == 2) {
      if (*(int *)(*(long *)PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948 + 0xe0) == 0) {
        func_0x04151a94();
      }
      if (0 < param_2) {
        iVar8 = *(int *)((long)param_1 + 0x2c);
        uVar6 = *param_1;
        uVar2 = param_1[1];
        uVar1 = param_1[2];
        uVar3 = param_1[3];
        if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar9 = func_0x09774ab0((double)(param_2 - iVar8),0);
        auVar9 = func_0x097744cc(uVar1,uVar3,auVar9._0_8_,auVar9._8_8_,0);
        uVar6 = func_0x09774360(uVar6,uVar2,auVar9._0_8_,auVar9._8_8_,0);
        return uVar6;
      }
      if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
        func_0x04151a94();
      }
      uVar6 = func_0x09774ab0(0,0);
      return uVar6;
    }
    puVar5 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar7 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if (*(int *)(lVar7 + 0xe0) == 0) {
      func_0x04151a94();
      lVar7 = *(long *)puVar5;
    }
    uVar6 = **(undefined8 **)(lVar7 + 0xb8);
  }
  return uVar6;
}


```

## LevelRangeValue.LinearBigDecimal(float t, int total, BigDecimal min, BigDecimal max)

```c

undefined1  [16]
WithNetwork_LevelRangeValue__LinearBigDecimal
          (float param_1,int param_2,long param_3,long param_4,undefined8 param_5,undefined8 param_6
          )

{
  undefined1 auVar1 [16];
  undefined *puVar2;
  long lVar3;
  long lVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  
  puVar2 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  auVar1._8_8_ = param_4;
  auVar1._0_8_ = param_3;
  if ((bRam000000000a469890 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469890 = 1;
  }
  if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar5 = func_0x09774dd8(param_5,param_6,param_3,param_4,0);
  auVar6 = func_0x09774ab0((double)param_1,0);
  auVar5 = func_0x097744cc(auVar5._0_8_,auVar5._8_8_,auVar6._0_8_,auVar6._8_8_,0);
  auVar6 = func_0x09774ab0((double)param_2,0);
  auVar5 = func_0x09774648(auVar5._0_8_,auVar5._8_8_,auVar6._0_8_,auVar6._8_8_,0);
  if ((bRam000000000a46d941 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46d941 = 1;
  }
  auVar6 = auVar5;
  if (auVar5._8_8_ < param_4) {
    auVar6 = auVar1;
    auVar1 = auVar5;
    param_3 = auVar5._0_8_;
  }
  auVar5 = auVar6;
  if (param_3 != 0) {
    auVar5 = auVar1;
    if ((auVar6._0_8_ != 0) && (lVar4 = auVar6._8_8_ - auVar1._8_8_, auVar5 = auVar6, lVar4 < 0xc))
    {
      if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
        func_0x04151a94();
      }
      lVar3 = func_0x097740c8(lVar4);
      lVar4 = 0;
      if (lVar3 != 0) {
        lVar4 = auVar1._0_8_ / lVar3;
      }
      func_0x09773f14(&stack0xffffffffffffffc0,lVar4 + auVar6._0_8_,auVar6._8_8_);
      auVar5 = ZEXT816(0);
    }
  }
  return auVar5;
}


```

## LevelRangeValue.ToTypeValue(BigDecimal value, LevelRangeValueType valueType)

```c

undefined1  [16] WithNetwork_LevelRangeValue__ToTypeValue(long param_1,long param_2,int param_3)

{
  long lVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined *puVar4;
  long lVar5;
  undefined8 uVar6;
  ulong uVar7;
  long lVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  long *plVar11;
  long lVar12;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 *puVar13;
  long lVar14;
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  long lStack_70;
  long lStack_68;
  undefined *puStack_60;
  long lStack_58;
  undefined *puStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  
  if ((bRam000000000a469891 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948);
    bRam000000000a469891 = 1;
  }
  puVar4 = PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948;
  if (param_3 == 1) {
    auVar15._8_8_ = param_2;
    auVar15._0_8_ = param_1;
    return auVar15;
  }
  if (param_3 != 2) {
    if (param_3 == 0) {
      uVar9 = func_0x04151930(PTR_WithNetwork_Enums_LevelRangeValueType_TypeInfo_09f44f20);
      uVar9 = func_0x04151a9c(uVar9,&stack0xffffffffffffffdc);
      uVar10 = func_0x04151930(PTR_DAT_09f44f28);
      uVar9 = func_0x084656c4(uVar10,uVar9,0);
      func_0x04151930(PTR_DAT_09ec4608);
      uVar10 = func_0x04151ba8();
      func_0x08afad84(uVar10,uVar9,0);
    }
    else {
      uVar9 = func_0x04151930(PTR_WithNetwork_Enums_LevelRangeValueType_TypeInfo_09f44f20);
      uVar9 = func_0x04151a9c(uVar9,&stack0xffffffffffffffd8);
      func_0x04151930(PTR_DAT_09eaac30);
      uVar10 = func_0x04151ba8();
      uVar6 = func_0x04151930(PTR_DAT_09f06c70);
      func_0x0854b9b0(uVar10,uVar6,uVar9,0,0);
    }
    uVar6 = func_0x04151930(PTR_Method_WithNetwork_LevelRangeValue_ToTypeValue___09f45a70);
    auVar15 = func_0x04151a84(uVar10,uVar6);
    uVar6 = auVar15._8_8_;
    puStack_50 = &WithNetwork_LevelRangeValue__IsEndLevelInfinite;
    uStack_40 = uVar10;
    uStack_38 = uVar9;
    if ((bRam000000000a46988c & 1) == 0) {
      func_0x0415191c(PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948);
      bRam000000000a46988c = 1;
      uVar6 = extraout_x1;
    }
    if (*(int *)(auVar15._0_8_ + 0x20) == 2) {
      if (*(int *)(*(long *)PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948 + 0xe0) == 0) {
        func_0x04151a94();
        uVar6 = extraout_x1_00;
      }
      uVar7 = (ulong)(*(int *)(auVar15._0_8_ + 0x30) == 0);
    }
    else {
      uVar7 = 0;
    }
    auVar16._8_8_ = uVar6;
    auVar16._0_8_ = uVar7;
    return auVar16;
  }
  lVar5 = *(long *)PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948;
  if (*(int *)(lVar5 + 0xe0) == 0) {
    func_0x04151a94();
    lVar5 = *(long *)puVar4;
  }
  lVar12 = **(long **)(lVar5 + 0xb8);
  lVar5 = (*(long **)(lVar5 + 0xb8))[1];
  if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
    func_0x04151a94(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
  }
  if ((bRam000000000a46d944 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46d944 = 1;
  }
  puVar4 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if (lVar12 == 0) {
    func_0x04151930(PTR_DAT_09ec32d8);
    uVar9 = func_0x04151ba8();
    func_0x085a42d4(uVar9,0);
    uVar10 = func_0x04151930(PTR_Method_Applibot_Math_BigDecimal_op_Division___09f79378);
    plVar11 = (long *)func_0x04151a84(uVar9,uVar10);
    puStack_60 = &Applibot_Math_BigDecimal__Floor;
    lStack_58 = param_2;
    puStack_50 = (undefined *)lVar5;
    uStack_48 = uVar9;
    if ((bRam000000000a46d931 & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      bRam000000000a46d931 = 1;
    }
    puVar4 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar5 = plVar11[1];
    if (lVar5 < 1) {
      lVar12 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
      if ((lVar5 < -0xc) || (*plVar11 == 0)) {
        if (*(int *)(lVar12 + 0xe0) == 0) {
          func_0x04151a94();
          lVar12 = *(long *)puVar4;
        }
        lStack_68 = (*(long **)(lVar12 + 0xb8))[1];
        lStack_70 = **(long **)(lVar12 + 0xb8);
      }
      else {
        if (*(int *)(lVar12 + 0xe0) == 0) {
          func_0x04151a94();
        }
        lVar12 = func_0x097740c8(-lVar5);
        lStack_70 = 0;
        lStack_68 = 0;
        lVar5 = 0;
        if (lVar12 != 0) {
          lVar5 = *plVar11 / lVar12;
        }
        func_0x09773f14(&lStack_70,lVar5 * lVar12,plVar11[1]);
      }
    }
    else {
      lStack_68 = plVar11[1];
      lStack_70 = *plVar11;
    }
    auVar2._8_8_ = lStack_68;
    auVar2._0_8_ = lStack_70;
    return auVar2;
  }
  lVar8 = *(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if (*(int *)(lVar8 + 0xe0) == 0) {
    func_0x04151a94();
    lVar8 = *(long *)puVar4;
  }
  puVar13 = *(undefined8 **)(lVar8 + 0xb8);
  if (param_1 == 0) {
    uStack_38 = puVar13[1];
    uStack_40 = *puVar13;
  }
  else {
    lVar14 = puVar13[8];
    lVar8 = 0;
    if (lVar12 != 0) {
      lVar8 = (lVar14 * param_1) / lVar12;
    }
    lVar1 = 0;
    if (lVar12 != 0) {
      lVar1 = ((lVar14 * param_1 - lVar8 * lVar12) * lVar14) / lVar12;
    }
    uStack_40 = 0;
    uStack_38 = 0;
    func_0x09773f14(&uStack_40,lVar1 + lVar8 * lVar14,(param_2 - lVar5) + -0xc);
  }
  auVar3._8_8_ = uStack_38;
  auVar3._0_8_ = uStack_40;
  return auVar3;
}


```

## LevelRangeValueGroup.TryGetValue(int level, out BigDecimal value)

```c

/* WARNING: Possible PIC construction at 0x091d497c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x091d4b34: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x091d4980) */
/* WARNING: Removing unreachable block (ram,0x091d4984) */
/* WARNING: Removing unreachable block (ram,0x091d4998) */
/* WARNING: Removing unreachable block (ram,0x091d499c) */
/* WARNING: Removing unreachable block (ram,0x091d4b38) */
/* WARNING: Removing unreachable block (ram,0x091d4b44) */
/* WARNING: Removing unreachable block (ram,0x091d4b50) */
/* WARNING: Removing unreachable block (ram,0x091d4b54) */
/* WARNING: Removing unreachable block (ram,0x091d4b3c) */

bool WithNetwork_LevelRangeValueGroup__TryGetValue
               (undefined8 *param_1,ulong param_2,undefined8 *param_3)

{
  int iVar1;
  undefined *puVar2;
  undefined **ppuVar3;
  bool bVar4;
  ulong uVar5;
  long *plVar6;
  undefined8 *extraout_x1;
  undefined8 *puVar7;
  undefined8 *puVar8;
  long lVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  undefined *puVar12;
  long *plVar13;
  undefined *puVar14;
  undefined8 uVar15;
  undefined1 auVar16 [12];
  undefined *apuStack_180 [2];
  long *plStack_170;
  undefined *puStack_168;
  undefined8 *puStack_160;
  undefined8 *puStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined1 auStack_118 [72];
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  
  puVar7 = &uStack_150;
  ppuVar3 = (undefined **)&uStack_150;
  plVar13 = (long *)0xa469000;
  puVar11 = (undefined8 *)(param_2 & 0xffffffff);
  puVar8 = param_3;
  if ((bRam000000000a469897 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(
                   PTR_Method_System_Collections_Generic_List_Enumerator_u003CLevelRangeValue_u003E_Dispose___09f45a88
                   );
    func_0x0415191c(
                   PTR_Method_System_Collections_Generic_List_Enumerator_u003CLevelRangeValue_u003E_MoveNext___09f45a90
                   );
    func_0x0415191c(
                   PTR_Method_System_Collections_Generic_List_Enumerator_u003CLevelRangeValue_u003E_get_Current___09f45a98
                   );
    func_0x0415191c(PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948);
    func_0x0415191c(
                   PTR_Method_System_Collections_Generic_List_u003CLevelRangeValue_u003E_GetEnumerator___09f45aa0
                   );
    bRam000000000a469897 = 1;
  }
  puVar2 = 
  PTR_Method_System_Collections_Generic_List_Enumerator_u003CLevelRangeValue_u003E_MoveNext___09f45a90
  ;
  puVar12 = 
  PTR_Method_System_Collections_Generic_List_Enumerator_u003CLevelRangeValue_u003E_Dispose___09f45a88
  ;
  puVar14 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  uStack_50 = 0;
  uStack_68 = 0;
  uStack_70 = 0;
  uStack_58 = 0;
  uStack_60 = 0;
  uStack_88 = 0;
  uStack_90 = 0;
  uStack_78 = 0;
  uStack_80 = 0;
  if (param_1[1] == 0) {
    auVar16 = func_0x04151bb8();
    puVar10 = auVar16._0_8_;
    puVar11 = puVar8;
    if (auVar16._8_4_ == 1) {
      plVar6 = (long *)func_0x098f6de0(puVar10);
      lVar9 = *plVar6;
      func_0x098f6df0();
      func_0x05d33c78(&uStack_90,*param_1);
      if (lVar9 == 0) goto code_r0x091d49cc;
      func_0x04151bb0(lVar9);
      puVar11 = puVar8;
    }
    puVar12 = (undefined *)0x0;
    func_0x05d33c78(&uStack_90,*param_1);
    func_0x04247ab0(puVar10);
    func_0x04151bb0(0);
    puVar14 = &WithNetwork_LevelRangeValueGroup__IsLevelRange;
    func_0x03bf6574();
    puVar7 = extraout_x1;
  }
  else {
    func_0x06c31f44(auStack_118,param_1[1],
                    *(undefined8 *)
                     PTR_Method_System_Collections_Generic_List_u003CLevelRangeValue_u003E_GetEnumerator___09f45aa0
                   );
    func_0x098f6ee0(&uStack_90,auStack_118,0x48);
    uVar5 = func_0x05d33c7c(&uStack_90,*(undefined8 *)puVar2);
    plVar13 = (long *)puVar14;
    if ((uVar5 & 1) == 0) {
      func_0x05d33c78(&uStack_90,*(undefined8 *)puVar12);
code_r0x091d49cc:
      lVar9 = *plVar13;
      if (*(int *)(lVar9 + 0xe0) == 0) {
        func_0x04151a94(lVar9);
        lVar9 = *plVar13;
      }
      uVar15 = **(undefined8 **)(lVar9 + 0xb8);
      param_3[1] = (*(undefined8 **)(lVar9 + 0xb8))[1];
      *param_3 = uVar15;
      return false;
    }
    uStack_b8 = uStack_68;
    uStack_c0 = uStack_70;
    uStack_a8 = uStack_58;
    uStack_b0 = uStack_60;
    uStack_c8 = uStack_78;
    uStack_d0 = uStack_80;
    uStack_a0 = uStack_50;
    uStack_120 = uStack_50;
    uStack_138 = uStack_68;
    uStack_140 = uStack_70;
    uStack_128 = uStack_58;
    uStack_130 = uStack_60;
    uStack_148 = uStack_78;
    uStack_150 = uStack_80;
    puVar14 = &UNK_091d4980;
    puVar10 = puVar11;
  }
  puVar2 = PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948;
  apuStack_180[0] = puVar14;
  plStack_170 = plVar13;
  puStack_168 = puVar12;
  puStack_160 = puVar10;
  puStack_158 = param_3;
  if ((bRam000000000a46989b & 1) == 0) {
    func_0x0415191c(PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948);
    bRam000000000a46989b = 1;
  }
  if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
    func_0x04151a94();
    iVar1 = *(int *)(puVar7 + 4);
    puVar14 = apuStack_180[0];
    puVar8 = puStack_160;
    puVar10 = puStack_158;
    if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
      func_0x04151a94();
      puVar14 = apuStack_180[0];
      puVar8 = puStack_160;
      puVar10 = puStack_158;
    }
  }
  else {
    iVar1 = *(int *)(puVar7 + 4);
    puVar14 = apuStack_180[0];
    puVar8 = puStack_160;
    puVar10 = puStack_158;
  }
  apuStack_180[0] = puVar14;
  puStack_160 = puVar8;
  puStack_158 = puVar10;
  if (iVar1 != 2) {
    if ((int)puVar11 < *(int *)((long)puVar7 + 0x2c)) {
      return false;
    }
    if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
      func_0x04151a94();
    }
    puVar14 = &UNK_091d4b38;
    ppuVar3 = apuStack_180;
    puVar10 = (undefined8 *)((ulong)puVar11 & 0xffffffff);
    puVar8 = puVar7;
  }
  *(undefined **)((long)ppuVar3 + -0x20) = puVar14;
  *(undefined8 **)((long)ppuVar3 + -0x10) = puVar8;
  *(undefined8 **)((long)ppuVar3 + -8) = puVar10;
  if ((bRam000000000a46988c & 1) == 0) {
    func_0x0415191c(PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948);
    bRam000000000a46988c = 1;
  }
  if (*(int *)(puVar7 + 4) == 2) {
    if (*(int *)(*(long *)PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948 + 0xe0) == 0) {
      func_0x04151a94();
    }
    bVar4 = *(int *)(puVar7 + 6) == 0;
  }
  else {
    bVar4 = false;
  }
  return bVar4;
}


```

## LevelRangeValueGroup.GetValue(int level)

```c

undefined1  [16] WithNetwork_LevelRangeValueGroup__GetValue(undefined4 *param_1,undefined4 param_2)

{
  undefined *puVar1;
  undefined *puVar2;
  undefined *puVar3;
  ulong uVar4;
  long *plVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  int iVar9;
  long lVar10;
  undefined8 *unaff_x23;
  undefined1 auVar11 [16];
  undefined1 auVar12 [12];
  undefined1 auStack_278 [72];
  undefined8 uStack_230;
  undefined8 uStack_228;
  undefined8 uStack_220;
  undefined8 uStack_218;
  undefined8 uStack_210;
  undefined8 uStack_208;
  undefined8 uStack_200;
  undefined8 uStack_1f0;
  undefined8 uStack_1e8;
  undefined8 uStack_1e0;
  undefined8 uStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  undefined8 uStack_1b8;
  undefined8 uStack_1b0;
  undefined4 uStack_164;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined4 auStack_128 [18];
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  
  if ((bRam000000000a469898 & 1) == 0) {
    func_0x0415191c(
                   PTR_Method_System_Collections_Generic_List_Enumerator_u003CLevelRangeValue_u003E_Dispose___09f45a88
                   );
    func_0x0415191c(
                   PTR_Method_System_Collections_Generic_List_Enumerator_u003CLevelRangeValue_u003E_MoveNext___09f45a90
                   );
    func_0x0415191c(
                   PTR_Method_System_Collections_Generic_List_Enumerator_u003CLevelRangeValue_u003E_get_Current___09f45a98
                   );
    func_0x0415191c(PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948);
    func_0x0415191c(
                   PTR_Method_System_Collections_Generic_List_u003CLevelRangeValue_u003E_GetEnumerator___09f45aa0
                   );
    bRam000000000a469898 = 1;
  }
  puVar3 = 
  PTR_Method_System_Collections_Generic_List_Enumerator_u003CLevelRangeValue_u003E_MoveNext___09f45a90
  ;
  puVar2 = 
  PTR_Method_System_Collections_Generic_List_Enumerator_u003CLevelRangeValue_u003E_Dispose___09f45a88
  ;
  puVar1 = PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948;
  uStack_60 = 0;
  uStack_78 = 0;
  uStack_80 = 0;
  uStack_68 = 0;
  uStack_70 = 0;
  uStack_98 = 0;
  uStack_a0 = 0;
  uStack_88 = 0;
  uStack_90 = 0;
  if (*(long *)(param_1 + 2) == 0) {
    auVar12 = func_0x04151bb8();
    uVar6 = auVar12._0_8_;
    if (auVar12._8_4_ != 1) goto code_r0x091d4dc4;
    plVar5 = (long *)func_0x098f6de0(uVar6);
    lVar10 = *plVar5;
    func_0x098f6df0();
    func_0x05d33c78(&uStack_a0,*unaff_x23);
    if (lVar10 == 0) goto code_r0x091d4d30;
    uVar6 = func_0x04151bb0(lVar10);
  }
  else {
    func_0x06c31f44(auStack_128,*(long *)(param_1 + 2),
                    *(undefined8 *)
                     PTR_Method_System_Collections_Generic_List_u003CLevelRangeValue_u003E_GetEnumerator___09f45aa0
                   );
    func_0x098f6ee0(&uStack_a0,auStack_128,0x48);
    while (uVar4 = func_0x05d33c7c(&uStack_a0,*(undefined8 *)puVar3), (uVar4 & 1) != 0) {
      uStack_c8 = uStack_78;
      uStack_d0 = uStack_80;
      uStack_b8 = uStack_68;
      uStack_c0 = uStack_70;
      uStack_d8 = uStack_88;
      uStack_e0 = uStack_90;
      uStack_b0 = uStack_60;
      uStack_130 = uStack_60;
      uStack_148 = uStack_78;
      uStack_150 = uStack_80;
      uStack_138 = uStack_68;
      uStack_140 = uStack_70;
      uStack_158 = uStack_88;
      uStack_160 = uStack_90;
      uVar4 = func_0x091d4a84(uVar4,&uStack_160,param_2);
      if ((uVar4 & 1) != 0) {
        if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar11 = WithNetwork_LevelRangeValue__GetValue(&uStack_e0,param_2);
        func_0x05d33c78(&uStack_a0,*(undefined8 *)puVar2);
        return auVar11;
      }
    }
    func_0x05d33c78(&uStack_a0,*(undefined8 *)puVar2);
    unaff_x23 = (undefined8 *)puVar2;
code_r0x091d4d30:
    puVar1 = PTR_DAT_09eaf2a0;
    auStack_128[0] = *param_1;
    uVar6 = func_0x04151930(PTR_DAT_09eaf2a0);
    uVar6 = func_0x04151a9c(uVar6,auStack_128);
    uStack_164 = param_2;
    uVar7 = func_0x04151930(puVar1);
    uVar7 = func_0x04151a9c(uVar7,&uStack_164);
    uVar8 = func_0x04151930(PTR_DAT_09f45aa8);
    uVar7 = func_0x0846e660(uVar8,uVar6,uVar7,0);
    func_0x04151930(PTR_DAT_09eaac30);
    uVar8 = func_0x04151ba8();
    func_0x0854ef94(uVar8,uVar7,0);
    uVar7 = func_0x04151930(PTR_Method_WithNetwork_LevelRangeValueGroup_GetValue___09f45ab0);
    func_0x04151a84(uVar8,uVar7);
code_r0x091d4dc4:
    lVar10 = 0;
  }
  func_0x05d33c78(&uStack_a0,*unaff_x23);
  if (lVar10 == 0) {
    func_0x04247ab0(uVar6);
  }
  func_0x04151bb0(lVar10);
  auVar11 = func_0x03bf6574();
  uVar6 = auVar11._8_8_;
  if ((bRam000000000a469899 & 1) == 0) {
    func_0x0415191c(
                   PTR_Method_System_Collections_Generic_List_Enumerator_u003CLevelRangeValue_u003E_Dispose___09f45a88
                   );
    func_0x0415191c(
                   PTR_Method_System_Collections_Generic_List_Enumerator_u003CLevelRangeValue_u003E_MoveNext___09f45a90
                   );
    func_0x0415191c(
                   PTR_Method_System_Collections_Generic_List_Enumerator_u003CLevelRangeValue_u003E_get_Current___09f45a98
                   );
    func_0x0415191c(PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948);
    func_0x0415191c(
                   PTR_Method_System_Collections_Generic_List_u003CLevelRangeValue_u003E_GetEnumerator___09f45aa0
                   );
    func_0x0415191c(
                   PTR_Method_System_Collections_Generic_List_u003CLevelRangeValue_u003E_get_Count___09f45a78
                   );
    bRam000000000a469899 = 1;
    uVar6 = extraout_x1;
  }
  uStack_1b0 = 0;
  uStack_1c8 = 0;
  uStack_1d0 = 0;
  uStack_1b8 = 0;
  uStack_1c0 = 0;
  uStack_1e8 = 0;
  uStack_1f0 = 0;
  uStack_1d8 = 0;
  uStack_1e0 = 0;
  if (-1 < *auVar11._0_8_) {
    lVar10 = *(long *)(auVar11._0_8_ + 2);
    uVar4 = 0;
    if (lVar10 == 0) goto code_r0x091d4f48;
    if (*(int *)(lVar10 + 0x18) != 0) {
      func_0x06c31f44(auStack_278,lVar10,
                      *(undefined8 *)
                       PTR_Method_System_Collections_Generic_List_u003CLevelRangeValue_u003E_GetEnumerator___09f45aa0
                     );
      func_0x098f6ee0(&uStack_1f0,auStack_278,0x48);
      puVar2 = 
      PTR_Method_System_Collections_Generic_List_Enumerator_u003CLevelRangeValue_u003E_MoveNext___09f45a90
      ;
      puVar1 = PTR_WithNetwork_LevelRangeValue_TypeInfo_09eeb948;
      do {
        uVar4 = func_0x05d33c7c(&uStack_1f0,*(undefined8 *)puVar2);
        if ((uVar4 & 1) == 0) {
          iVar9 = 8;
          goto code_r0x091d4f2c;
        }
        uStack_218 = uStack_1c8;
        uStack_220 = uStack_1d0;
        uStack_208 = uStack_1b8;
        uStack_210 = uStack_1c0;
        uStack_200 = uStack_1b0;
        uStack_228 = uStack_1d8;
        uStack_230 = uStack_1e0;
        if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
          func_0x04151a94();
        }
        uVar4 = func_0x091d4340(&uStack_230);
      } while ((uVar4 & 1) != 0);
      iVar9 = 7;
code_r0x091d4f2c:
      func_0x05d33c78(&uStack_1f0,
                      *(undefined8 *)
                       PTR_Method_System_Collections_Generic_List_Enumerator_u003CLevelRangeValue_u003E_Dispose___09f45a88
                     );
      uVar4 = (ulong)(iVar9 != 7);
      uVar6 = extraout_x1_00;
      goto code_r0x091d4f48;
    }
  }
  uVar4 = 0;
code_r0x091d4f48:
  auVar11._8_8_ = uVar6;
  auVar11._0_8_ = uVar4;
  return auVar11;
}


```

## CookingResourceCalculator.CalculateCafeExp(BigDecimal resourceAmount, float resourceToExpCoefficient)

```c

/* WARNING: Possible PIC construction at 0x09774b60: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x09774b64) */
/* WARNING: Removing unreachable block (ram,0x09774b80) */
/* WARNING: Removing unreachable block (ram,0x09774b70) */

long Game_DataStore_CookingResourceCalculator__CalculateCafeExp
               (float param_1,undefined8 param_2,undefined8 param_3)

{
  undefined *puVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined1 auVar6 [16];
  
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a453800 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a453800 = 1;
  }
  if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar6 = func_0x09774ab0((double)param_1,0);
  auVar6 = func_0x097744cc(param_2,param_3,auVar6._0_8_,auVar6._8_8_,0);
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  lVar2 = auVar6._8_8_;
  if ((bRam000000000a46d936 & 1) == 0) {
    func_0x0415191c(PTR_Method_Applibot_Math_BigDecimal_op_Implicit___09f79390,lVar2,0);
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46d936 = 1;
  }
  if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
    func_0x04151a94();
  }
  if ((bRam000000000a46d937 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46d937 = 1;
  }
  if (6 < lVar2) {
    func_0x04151930(PTR_DAT_09ec32f8);
    uVar4 = func_0x04151ba8();
    func_0x085cb32c(uVar4,0);
    uVar5 = func_0x04151930(PTR_Method_Applibot_Math_BigDecimal_op_Implicit___09f79398);
    auVar6 = func_0x04151a84(uVar4,uVar5);
    puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if ((bRam000000000a46d938 & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      bRam000000000a46d938 = 1;
    }
    if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
      func_0x04151a94();
    }
    lVar2 = func_0x09774cb4(auVar6._0_8_,auVar6._8_8_);
    return lVar2;
  }
  if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
    func_0x04151a94();
  }
  if (lVar2 < 0) {
    lVar3 = func_0x097740c8(-lVar2);
    lVar2 = 0;
    if (lVar3 != 0) {
      lVar2 = auVar6._0_8_ / lVar3;
    }
  }
  else {
    lVar2 = func_0x097740c8(lVar2);
    lVar2 = lVar2 * auVar6._0_8_;
  }
  return lVar2;
}


```

