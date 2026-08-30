# Decompiled functions — batch 2 (mechanics deep dive)

## BaseStatusCalculatorCore<HuntBaseStatus>.CalculateValue (off 0x7b48fe0)

```c

/* WARNING: Possible PIC construction at 0x07c4d2a4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x07c4d2a8) */

undefined1  [16]
WithNetwork_BaseStatusCalculatorCore_u003CHuntBaseStatus_u003E__CalculateValue
          (undefined8 param_1,long param_2)

{
  ulong *puVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  char cVar4;
  bool bVar5;
  undefined *puVar6;
  undefined *puVar7;
  undefined *puVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  ulong uVar11;
  long *plVar12;
  undefined8 uVar13;
  undefined8 unaff_x20;
  long lVar14;
  undefined8 *unaff_x26;
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [12];
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
  
  uVar13 = 0xa459000;
  if ((bRam000000000a459ec0 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09eed020);
    func_0x0415191c(PTR_DAT_09eed028);
    func_0x0415191c(PTR_DAT_09eed030);
    func_0x0415191c(PTR_DAT_09eed038);
    bRam000000000a459ec0 = 1;
  }
  puVar8 = PTR_DAT_09eed028;
  puVar7 = PTR_DAT_09eed020;
  puVar6 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  uStack_78 = 0;
  uStack_80 = 0;
  uStack_68 = 0;
  uStack_70 = 0;
  uStack_88 = 0;
  uStack_90 = 0;
  if (*(long *)(param_2 + 0x20) != 0) {
    auVar15 = *(undefined1 (*) [16])(param_2 + 8);
    func_0x06b67870(&uStack_c0,*(long *)(param_2 + 0x20),*(undefined8 *)PTR_DAT_09eed038);
    uStack_88 = uStack_b8;
    uStack_90 = uStack_c0;
    uStack_78 = uStack_a8;
    uStack_80 = uStack_b0;
    uStack_68 = uStack_98;
    uStack_70 = uStack_a0;
    while( true ) {
      unaff_x20 = auVar15._8_8_;
      uVar13 = auVar15._0_8_;
      uVar11 = func_0x05d2a35c(&uStack_90,*(undefined8 *)puVar8);
      uVar10 = uStack_70;
      uVar9 = uStack_78;
      if ((uVar11 & 1) == 0) break;
      switch(uStack_80._4_4_) {
      case 1:
        if (*(int *)(*(long *)puVar6 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar15 = func_0x09774360(uVar13,unaff_x20,uVar9,uVar10,0);
        break;
      case 2:
        if (*(int *)(*(long *)puVar6 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar15 = func_0x097744cc(uVar13,unaff_x20,uVar9,uVar10,0);
        break;
      case 3:
        lVar14 = *(long *)puVar6;
        if (*(int *)(lVar14 + 0xe0) == 0) {
          func_0x04151a94();
          lVar14 = *(long *)puVar6;
        }
        auVar15 = func_0x09774dd8(*(undefined8 *)(*(long *)(lVar14 + 0xb8) + 0x10),
                                  *(undefined8 *)(*(long *)(lVar14 + 0xb8) + 0x18),uVar9,uVar10,0);
        auVar15 = func_0x097744cc(uVar13,unaff_x20,auVar15._0_8_,auVar15._8_8_,0);
        break;
      case 4:
        uVar2 = *(undefined8 *)(param_2 + 8);
        uVar3 = *(undefined8 *)(param_2 + 0x10);
        if (*(int *)(*(long *)puVar6 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar15 = func_0x097744cc(uVar2,uVar3,uVar9,uVar10,0);
        auVar15 = func_0x09774360(uVar13,unaff_x20,auVar15._0_8_,auVar15._8_8_,0);
      }
    }
    func_0x05d2a358(&uStack_90,*(undefined8 *)puVar7);
code_r0x07c4d1dc:
    auVar16._8_8_ = unaff_x20;
    auVar16._0_8_ = uVar13;
    return auVar16;
  }
  auVar17 = func_0x04151bb8();
  if (auVar17._8_4_ == 1) {
    plVar12 = (long *)func_0x098f6de0(auVar17._0_8_);
    lVar14 = *plVar12;
    func_0x098f6df0();
    func_0x05d2a358(&uStack_90,*unaff_x26);
    if (lVar14 == 0) goto code_r0x07c4d1dc;
    func_0x04151bb0(lVar14);
  }
  func_0x05d2a358(&uStack_90,*unaff_x26);
  func_0x04247ab0(auVar17._0_8_);
  func_0x04151bb0(0);
  lVar14 = func_0x03bf6574();
  auVar15._0_8_ = (undefined8 *)(lVar14 + 0x40);
  *auVar15._0_8_ = 0;
  if (iRam000000000a680cb0 != 0) {
    puVar1 = (ulong *)(((ulong)auVar15._0_8_ >> 0x12 & 0x7fff) * 8 + 0xa4b4c88);
    do {
      cVar4 = '\x01';
      bVar5 = (bool)ExclusiveMonitorPass(puVar1,0x10);
      if (bVar5) {
        *puVar1 = *puVar1 | 1L << ((ulong)auVar15._0_8_ >> 0xc & 0x3f);
        cVar4 = ExclusiveMonitorsStatus();
      }
    } while (cVar4 != '\0');
  }
  auVar15._8_8_ = 0;
  return auVar15;
}


```

## BaseStatusCalculatorCore<HuntCharacterSkillEffectRateBaseStatus>.CalculateValue (off 0x7b49ef0)

```c

/* WARNING: Possible PIC construction at 0x07c4e1b4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x07c4e1b8) */

undefined1  [16]
WithNetwork_BaseStatusCalculatorCore_u003CHuntCharacterSkillEffectRateBaseStatus_u003E__CalculateValue
          (undefined8 param_1,long param_2)

{
  ulong *puVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  char cVar4;
  bool bVar5;
  undefined *puVar6;
  undefined *puVar7;
  undefined *puVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  ulong uVar11;
  long *plVar12;
  undefined8 uVar13;
  undefined8 unaff_x20;
  long lVar14;
  undefined8 *unaff_x26;
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [12];
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
  
  uVar13 = 0xa459000;
  if ((bRam000000000a459eca & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09eed020);
    func_0x0415191c(PTR_DAT_09eed028);
    func_0x0415191c(PTR_DAT_09eed030);
    func_0x0415191c(PTR_DAT_09eed038);
    bRam000000000a459eca = 1;
  }
  puVar8 = PTR_DAT_09eed028;
  puVar7 = PTR_DAT_09eed020;
  puVar6 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  uStack_78 = 0;
  uStack_80 = 0;
  uStack_68 = 0;
  uStack_70 = 0;
  uStack_88 = 0;
  uStack_90 = 0;
  if (*(long *)(param_2 + 0x18) != 0) {
    auVar15 = *(undefined1 (*) [16])(param_2 + 8);
    func_0x06b67870(&uStack_c0,*(long *)(param_2 + 0x18),*(undefined8 *)PTR_DAT_09eed038);
    uStack_88 = uStack_b8;
    uStack_90 = uStack_c0;
    uStack_78 = uStack_a8;
    uStack_80 = uStack_b0;
    uStack_68 = uStack_98;
    uStack_70 = uStack_a0;
    while( true ) {
      unaff_x20 = auVar15._8_8_;
      uVar13 = auVar15._0_8_;
      uVar11 = func_0x05d2a35c(&uStack_90,*(undefined8 *)puVar8);
      uVar10 = uStack_70;
      uVar9 = uStack_78;
      if ((uVar11 & 1) == 0) break;
      switch(uStack_80._4_4_) {
      case 1:
        if (*(int *)(*(long *)puVar6 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar15 = func_0x09774360(uVar13,unaff_x20,uVar9,uVar10,0);
        break;
      case 2:
        if (*(int *)(*(long *)puVar6 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar15 = func_0x097744cc(uVar13,unaff_x20,uVar9,uVar10,0);
        break;
      case 3:
        lVar14 = *(long *)puVar6;
        if (*(int *)(lVar14 + 0xe0) == 0) {
          func_0x04151a94();
          lVar14 = *(long *)puVar6;
        }
        auVar15 = func_0x09774dd8(*(undefined8 *)(*(long *)(lVar14 + 0xb8) + 0x10),
                                  *(undefined8 *)(*(long *)(lVar14 + 0xb8) + 0x18),uVar9,uVar10,0);
        auVar15 = func_0x097744cc(uVar13,unaff_x20,auVar15._0_8_,auVar15._8_8_,0);
        break;
      case 4:
        uVar2 = *(undefined8 *)(param_2 + 8);
        uVar3 = *(undefined8 *)(param_2 + 0x10);
        if (*(int *)(*(long *)puVar6 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar15 = func_0x097744cc(uVar2,uVar3,uVar9,uVar10,0);
        auVar15 = func_0x09774360(uVar13,unaff_x20,auVar15._0_8_,auVar15._8_8_,0);
      }
    }
    func_0x05d2a358(&uStack_90,*(undefined8 *)puVar7);
code_r0x07c4e0ec:
    auVar16._8_8_ = unaff_x20;
    auVar16._0_8_ = uVar13;
    return auVar16;
  }
  auVar17 = func_0x04151bb8();
  if (auVar17._8_4_ == 1) {
    plVar12 = (long *)func_0x098f6de0(auVar17._0_8_);
    lVar14 = *plVar12;
    func_0x098f6df0();
    func_0x05d2a358(&uStack_90,*unaff_x26);
    if (lVar14 == 0) goto code_r0x07c4e0ec;
    func_0x04151bb0(lVar14);
  }
  func_0x05d2a358(&uStack_90,*unaff_x26);
  func_0x04247ab0(auVar17._0_8_);
  func_0x04151bb0(0);
  lVar14 = func_0x03bf6574();
  auVar15._0_8_ = (undefined8 *)(lVar14 + 0x40);
  *auVar15._0_8_ = 0;
  if (iRam000000000a680cb0 != 0) {
    puVar1 = (ulong *)(((ulong)auVar15._0_8_ >> 0x12 & 0x7fff) * 8 + 0xa4b4c88);
    do {
      cVar4 = '\x01';
      bVar5 = (bool)ExclusiveMonitorPass(puVar1,0x10);
      if (bVar5) {
        *puVar1 = *puVar1 | 1L << ((ulong)auVar15._0_8_ >> 0xc & 0x3f);
        cVar4 = ExclusiveMonitorsStatus();
      }
    } while (cVar4 != '\0');
  }
  auVar15._8_8_ = 0;
  return auVar15;
}


```

## BaseStatusCalculatorCore<HuntCostumeAttackRateBaseStatus>.CalculateValue (off 0x7b4ae00)

```c

/* WARNING: Possible PIC construction at 0x07c4f0c4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x07c4f0c8) */

undefined1  [16]
WithNetwork_BaseStatusCalculatorCore_u003CHuntCostumeAttackRateBaseStatus_u003E__CalculateValue
          (undefined8 param_1,long param_2)

{
  ulong *puVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  char cVar4;
  bool bVar5;
  undefined *puVar6;
  undefined *puVar7;
  undefined *puVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  ulong uVar11;
  long *plVar12;
  undefined8 uVar13;
  undefined8 unaff_x20;
  long lVar14;
  undefined8 *unaff_x26;
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [12];
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
  
  uVar13 = 0xa459000;
  if ((bRam000000000a459ed4 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09eed020);
    func_0x0415191c(PTR_DAT_09eed028);
    func_0x0415191c(PTR_DAT_09eed030);
    func_0x0415191c(PTR_DAT_09eed038);
    bRam000000000a459ed4 = 1;
  }
  puVar8 = PTR_DAT_09eed028;
  puVar7 = PTR_DAT_09eed020;
  puVar6 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  uStack_78 = 0;
  uStack_80 = 0;
  uStack_68 = 0;
  uStack_70 = 0;
  uStack_88 = 0;
  uStack_90 = 0;
  if (*(long *)(param_2 + 0x18) != 0) {
    auVar15 = *(undefined1 (*) [16])(param_2 + 8);
    func_0x06b67870(&uStack_c0,*(long *)(param_2 + 0x18),*(undefined8 *)PTR_DAT_09eed038);
    uStack_88 = uStack_b8;
    uStack_90 = uStack_c0;
    uStack_78 = uStack_a8;
    uStack_80 = uStack_b0;
    uStack_68 = uStack_98;
    uStack_70 = uStack_a0;
    while( true ) {
      unaff_x20 = auVar15._8_8_;
      uVar13 = auVar15._0_8_;
      uVar11 = func_0x05d2a35c(&uStack_90,*(undefined8 *)puVar8);
      uVar10 = uStack_70;
      uVar9 = uStack_78;
      if ((uVar11 & 1) == 0) break;
      switch(uStack_80._4_4_) {
      case 1:
        if (*(int *)(*(long *)puVar6 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar15 = func_0x09774360(uVar13,unaff_x20,uVar9,uVar10,0);
        break;
      case 2:
        if (*(int *)(*(long *)puVar6 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar15 = func_0x097744cc(uVar13,unaff_x20,uVar9,uVar10,0);
        break;
      case 3:
        lVar14 = *(long *)puVar6;
        if (*(int *)(lVar14 + 0xe0) == 0) {
          func_0x04151a94();
          lVar14 = *(long *)puVar6;
        }
        auVar15 = func_0x09774dd8(*(undefined8 *)(*(long *)(lVar14 + 0xb8) + 0x10),
                                  *(undefined8 *)(*(long *)(lVar14 + 0xb8) + 0x18),uVar9,uVar10,0);
        auVar15 = func_0x097744cc(uVar13,unaff_x20,auVar15._0_8_,auVar15._8_8_,0);
        break;
      case 4:
        uVar2 = *(undefined8 *)(param_2 + 8);
        uVar3 = *(undefined8 *)(param_2 + 0x10);
        if (*(int *)(*(long *)puVar6 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar15 = func_0x097744cc(uVar2,uVar3,uVar9,uVar10,0);
        auVar15 = func_0x09774360(uVar13,unaff_x20,auVar15._0_8_,auVar15._8_8_,0);
      }
    }
    func_0x05d2a358(&uStack_90,*(undefined8 *)puVar7);
code_r0x07c4effc:
    auVar16._8_8_ = unaff_x20;
    auVar16._0_8_ = uVar13;
    return auVar16;
  }
  auVar17 = func_0x04151bb8();
  if (auVar17._8_4_ == 1) {
    plVar12 = (long *)func_0x098f6de0(auVar17._0_8_);
    lVar14 = *plVar12;
    func_0x098f6df0();
    func_0x05d2a358(&uStack_90,*unaff_x26);
    if (lVar14 == 0) goto code_r0x07c4effc;
    func_0x04151bb0(lVar14);
  }
  func_0x05d2a358(&uStack_90,*unaff_x26);
  func_0x04247ab0(auVar17._0_8_);
  func_0x04151bb0(0);
  lVar14 = func_0x03bf6574();
  auVar15._0_8_ = (undefined8 *)(lVar14 + 0x40);
  *auVar15._0_8_ = 0;
  if (iRam000000000a680cb0 != 0) {
    puVar1 = (ulong *)(((ulong)auVar15._0_8_ >> 0x12 & 0x7fff) * 8 + 0xa4b4c88);
    do {
      cVar4 = '\x01';
      bVar5 = (bool)ExclusiveMonitorPass(puVar1,0x10);
      if (bVar5) {
        *puVar1 = *puVar1 | 1L << ((ulong)auVar15._0_8_ >> 0xc & 0x3f);
        cVar4 = ExclusiveMonitorsStatus();
      }
    } while (cVar4 != '\0');
  }
  auVar15._8_8_ = 0;
  return auVar15;
}


```

## UnitStatusBase.AddStatusEffect — failed: 
Low-level Error: Flow exceeded maximum allowable instructions

## StatusEffects.AddStatusEffect — failed: 
Low-level Error: Flow exceeded maximum allowable instructions

## Unit.UpdateAttackIntervalFrame (off 0x46df88c)

```c

undefined8 FUN_047e388c(long param_1,undefined4 param_2,ulong param_3,long param_4)

{
  undefined *puVar1;
  undefined *puVar2;
  uint uVar3;
  ulong uVar4;
  long *plVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  long lVar10;
  undefined *unaff_x22;
  undefined1 auVar11 [16];
  undefined1 auVar12 [12];
  undefined8 uStack_1e0;
  undefined8 uStack_1d8;
  undefined *puStack_1d0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  long lStack_188;
  undefined *puStack_180;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_158;
  undefined8 uStack_150;
  long lStack_148;
  undefined *puStack_140;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_118;
  undefined8 uStack_110;
  long lStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  long lStack_f0;
  undefined *puStack_e0;
  undefined *puStack_d0;
  undefined8 *puStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  long lStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  long lStack_80;
  undefined *puStack_70;
  undefined8 uStack_38;
  undefined8 uStack_30;
  long lStack_28;
  
  if ((bRam000000000a451631 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece960);
    func_0x0415191c(PTR_DAT_09ece968);
    func_0x0415191c(PTR_DAT_09ece970);
    func_0x0415191c(PTR_DAT_09ece978);
    bRam000000000a451631 = 1;
  }
  puVar2 = PTR_DAT_09ece968;
  puVar1 = PTR_DAT_09ece960;
  uStack_38 = 0;
  uStack_30 = 0;
  lStack_28 = 0;
  if (*(long *)(param_1 + 0x20) != 0) {
    func_0x06cc507c(&uStack_38,*(long *)(param_1 + 0x20),*(undefined8 *)PTR_DAT_09ece978);
    while( true ) {
      uVar4 = func_0x05d3cfd8(&uStack_38,*(undefined8 *)puVar2);
      if ((uVar4 & 1) == 0) {
        uVar6 = func_0x05d3cfd4(&uStack_38,*(undefined8 *)puVar1);
        return uVar6;
      }
      if (lStack_28 == 0) break;
      if (*(char *)(lStack_28 + 0xb4) == '\0') {
        param_3 = 0;
        func_0x047e9588(lStack_28,param_2);
      }
    }
    func_0x04151bb8();
  }
  auVar12 = func_0x04151bb8();
  if (auVar12._8_4_ == 1) {
    plVar5 = (long *)func_0x098f6de0(auVar12._0_8_);
    lVar10 = *plVar5;
    func_0x098f6df0();
    uVar6 = func_0x05d3cfd4(&uStack_38,*(undefined8 *)PTR_DAT_09ece960);
    if (lVar10 == 0) {
      return uVar6;
    }
    func_0x04151bb0(lVar10);
  }
  func_0x05d3cfd4(&uStack_38,*(undefined8 *)PTR_DAT_09ece960);
  func_0x04247ab0(auVar12._0_8_);
  func_0x04151bb0(0);
  auVar11 = func_0x03bf6574();
  lVar10 = auVar11._8_8_;
  puStack_70 = &Game_Application_InGameHunt_Party__AddStatusEffect;
  if ((bRam000000000a451633 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece960);
    func_0x0415191c(PTR_DAT_09ece968);
    func_0x0415191c(PTR_DAT_09ece970);
    func_0x0415191c(PTR_DAT_09ece978);
    bRam000000000a451633 = 1;
  }
  puVar2 = PTR_DAT_09ece968;
  puVar1 = PTR_DAT_09ece960;
  uStack_90 = 0;
  uStack_88 = 0;
  lStack_80 = 0;
  lVar7 = *(long *)(auVar11._0_8_ + 0x20);
  puVar9 = (undefined8 *)0xa451000;
  if (lVar7 != 0) {
    func_0x06cc507c(&uStack_a8,lVar7,*(undefined8 *)PTR_DAT_09ece978);
    uStack_88 = uStack_a0;
    uStack_90 = uStack_a8;
    lStack_80 = lStack_98;
code_r0x047e3a8c:
    uVar4 = func_0x05d3cfd8(&uStack_90,*(undefined8 *)puVar2);
    lVar7 = lStack_80;
    if ((uVar4 & 1) == 0) {
      uVar6 = func_0x05d3cfd4(&uStack_90,*(undefined8 *)puVar1);
      return uVar6;
    }
    if (lStack_80 != 0) goto code_r0x047e3aa4;
    func_0x04151bb8();
    goto code_r0x047e3b10;
  }
code_r0x047e3b18:
  auVar12 = func_0x04151bb8();
  uVar6 = auVar12._0_8_;
  if (auVar12._8_4_ == 1) {
    plVar5 = (long *)func_0x098f6de0(uVar6);
    lVar10 = *plVar5;
    func_0x098f6df0();
    uVar8 = func_0x05d3cfd4(&uStack_90,*puVar9);
    if (lVar10 == 0) {
      return uVar8;
    }
    func_0x04151bb0(lVar10);
  }
  func_0x05d3cfd4(&uStack_90,*puVar9);
  func_0x04247ab0(uVar6);
  func_0x04151bb0(0);
  auVar11 = func_0x03bf6574();
  lVar10 = auVar11._8_8_;
  puStack_e0 = &Game_Application_InGameHunt_Party__RemoveStatusEffect;
  uStack_c0 = 0;
  puStack_d0 = unaff_x22;
  puStack_c8 = puVar9;
  uStack_b8 = uVar6;
  if ((bRam000000000a451634 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece960);
    func_0x0415191c(PTR_DAT_09ece968);
    func_0x0415191c(PTR_DAT_09ece970);
    func_0x0415191c(PTR_DAT_09ece978);
    bRam000000000a451634 = 1;
  }
  puVar2 = PTR_DAT_09ece968;
  puVar1 = PTR_DAT_09ece960;
  uStack_100 = 0;
  uStack_f8 = 0;
  lStack_f0 = 0;
  lVar7 = *(long *)(auVar11._0_8_ + 0x20);
  puVar9 = (undefined8 *)0xa451000;
  if (lVar7 != 0) {
    func_0x06cc507c(&uStack_118,lVar7,*(undefined8 *)PTR_DAT_09ece978);
    uStack_f8 = uStack_110;
    uStack_100 = uStack_118;
    lStack_f0 = lStack_108;
code_r0x047e3c38:
    uVar4 = func_0x05d3cfd8(&uStack_100,*(undefined8 *)puVar2);
    lVar7 = lStack_f0;
    if ((uVar4 & 1) == 0) {
      uVar6 = func_0x05d3cfd4(&uStack_100,*(undefined8 *)puVar1);
      return uVar6;
    }
    if (lStack_f0 != 0) goto code_r0x047e3c50;
    func_0x04151bb8();
    goto code_r0x047e3cb4;
  }
code_r0x047e3cbc:
  auVar12 = func_0x04151bb8();
  uVar6 = auVar12._0_8_;
  if (auVar12._8_4_ == 1) {
    plVar5 = (long *)func_0x098f6de0(uVar6);
    lVar10 = *plVar5;
    func_0x098f6df0();
    uVar8 = func_0x05d3cfd4(&uStack_100,*puVar9);
    if (lVar10 == 0) {
      return uVar8;
    }
    func_0x04151bb0(lVar10);
  }
  func_0x05d3cfd4(&uStack_100,*puVar9);
  func_0x04247ab0(uVar6);
  func_0x04151bb0(0);
  lVar10 = func_0x03bf6574();
  puStack_140 = &UNK_047e3d38;
  uStack_130 = 0;
  uStack_128 = uVar6;
  if ((bRam000000000a451638 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece960);
    func_0x0415191c(PTR_DAT_09ece968);
    func_0x0415191c(PTR_DAT_09ece970);
    func_0x0415191c(PTR_DAT_09ece978);
    bRam000000000a451638 = 1;
  }
  puVar2 = PTR_DAT_09ece968;
  puVar1 = PTR_DAT_09ece960;
  uStack_158 = 0;
  uStack_150 = 0;
  lStack_148 = 0;
  if (*(long *)(lVar10 + 0x20) != 0) {
    func_0x06cc507c(&uStack_158,*(long *)(lVar10 + 0x20),*(undefined8 *)PTR_DAT_09ece978);
    do {
      uVar4 = func_0x05d3cfd8(&uStack_158,*(undefined8 *)puVar2);
      if ((uVar4 & 1) == 0) goto code_r0x047e3ddc;
    } while (lStack_148 != 0);
    func_0x04151bb8();
code_r0x047e3ddc:
    uVar6 = func_0x05d3cfd4(&uStack_158,*(undefined8 *)puVar1);
    return uVar6;
  }
  auVar12 = func_0x04151bb8();
  uVar6 = auVar12._0_8_;
  if (auVar12._8_4_ == 1) {
    plVar5 = (long *)func_0x098f6de0(uVar6);
    lVar10 = *plVar5;
    func_0x098f6df0();
    uVar8 = func_0x05d3cfd4(&uStack_158,*(undefined8 *)PTR_DAT_09ece960);
    if (lVar10 == 0) {
      return uVar8;
    }
    func_0x04151bb0(lVar10);
  }
  func_0x05d3cfd4(&uStack_158,*(undefined8 *)PTR_DAT_09ece960);
  func_0x04247ab0(uVar6);
  func_0x04151bb0(0);
  lVar10 = func_0x03bf6574();
  puStack_180 = &UNK_047e3e74;
  uStack_168 = 0;
  uStack_170 = uVar6;
  if ((bRam000000000a451639 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece960);
    func_0x0415191c(PTR_DAT_09ece968);
    func_0x0415191c(PTR_DAT_09ece970);
    func_0x0415191c(PTR_DAT_09ece978);
    bRam000000000a451639 = 1;
  }
  puVar2 = PTR_DAT_09ece968;
  puVar1 = PTR_DAT_09ece960;
  uStack_198 = 0;
  uStack_190 = 0;
  lStack_188 = 0;
  if (*(long *)(lVar10 + 0x20) == 0) {
    auVar12 = func_0x04151bb8();
    if (auVar12._8_4_ == 1) {
      plVar5 = (long *)func_0x098f6de0(auVar12._0_8_);
      lVar10 = *plVar5;
      func_0x098f6df0();
      uVar6 = func_0x05d3cfd4(&uStack_198,*(undefined8 *)PTR_DAT_09ece960);
      if (lVar10 == 0) {
        return uVar6;
      }
      func_0x04151bb0(lVar10);
    }
    func_0x05d3cfd4(&uStack_198,*(undefined8 *)PTR_DAT_09ece960);
    func_0x04247ab0(auVar12._0_8_);
    func_0x04151bb0(0);
    auVar11 = func_0x03bf6574();
    puStack_1d0 = &UNK_047e3fb0;
    if ((*(long *)(param_4 + 0x38) == 0) &&
       (func_0x0415191c(PTR_DAT_09ebaf58), *(long *)(param_4 + 0x38) == 0)) {
      func_0x041cb41c(param_4);
    }
    puVar1 = PTR_DAT_09ebaf58;
    uStack_1e0 = 0;
    uStack_1d8 = 0;
    if (*(int *)(*(long *)PTR_DAT_09ebaf58 + 0xe0) == 0) {
      func_0x04151a94();
    }
    func_0x0444fed4(&uStack_1e0,1,0);
    if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
      func_0x04151a94();
    }
    func_0x05685714(&uStack_1e0,auVar11._0_8_,auVar11._8_8_,param_3 & 0xffffffff,
                    *(undefined8 *)(*(long *)(param_4 + 0x38) + 0x10));
    uVar6 = func_0x098f18f4(&uStack_1e0,0);
    lVar10 = 0;
    while( true ) {
      if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
        func_0x04151a94();
      }
      func_0x044500cc(&uStack_1e0,0);
      if (lVar10 == 0) break;
      auVar12 = func_0x04151bb0(lVar10);
      if (auVar12._8_4_ != 1) {
        if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
          func_0x04151a94();
        }
        func_0x044500cc(&uStack_1e0,0);
        func_0x04247ab0(auVar12._0_8_);
        func_0x04151bb0(0);
        puVar9 = (undefined8 *)func_0x03bf6574();
        return *puVar9;
      }
      plVar5 = (long *)func_0x098f6de0(auVar12._0_8_);
      lVar10 = *plVar5;
      func_0x098f6df0();
      uVar6 = 0;
    }
    return uVar6;
  }
  func_0x06cc507c(&uStack_198,*(long *)(lVar10 + 0x20),*(undefined8 *)PTR_DAT_09ece978);
  do {
    uVar4 = func_0x05d3cfd8(&uStack_198,*(undefined8 *)puVar2);
    if ((uVar4 & 1) == 0) goto code_r0x047e3f18;
  } while (lStack_188 != 0);
  func_0x04151bb8();
code_r0x047e3f18:
  uVar6 = func_0x05d3cfd4(&uStack_198,*(undefined8 *)puVar1);
  return uVar6;
code_r0x047e3aa4:
  uVar4 = func_0x047eb468(lStack_80,0);
  if ((uVar4 & 1) == 0) {
    plVar5 = *(long **)(lVar7 + 0x80);
    if (plVar5 == (long *)0x0) {
code_r0x047e3b10:
      func_0x04151bb8();
    }
    else {
      uVar3 = (**(code **)(*plVar5 + 0x1e8))(plVar5,*(undefined8 *)(*plVar5 + 0x1f0));
      if (lVar10 != 0) {
        if ((*(uint *)(lVar10 + 0x20) & (uVar3 ^ 0xffffffff)) != 0) {
          param_3 = 0;
          func_0x047eac00(lVar7,lVar10);
        }
        goto code_r0x047e3a8c;
      }
    }
    func_0x04151bb8();
    puVar9 = (undefined8 *)puVar1;
    unaff_x22 = puVar2;
    goto code_r0x047e3b18;
  }
  goto code_r0x047e3a8c;
code_r0x047e3c50:
  if (*(char *)(lStack_f0 + 0xb4) == '\0') {
    plVar5 = *(long **)(lStack_f0 + 0x80);
    if (plVar5 == (long *)0x0) {
code_r0x047e3cb4:
      func_0x04151bb8();
    }
    else {
      uVar3 = (**(code **)(*plVar5 + 0x1e8))(plVar5,*(undefined8 *)(*plVar5 + 0x1f0));
      if (lVar10 != 0) {
        if ((*(uint *)(lVar10 + 0x20) & (uVar3 ^ 0xffffffff)) != 0) {
          param_3 = 0;
          func_0x047eafdc(lVar7,lVar10);
        }
        goto code_r0x047e3c38;
      }
    }
    func_0x04151bb8();
    puVar9 = (undefined8 *)puVar1;
    goto code_r0x047e3cbc;
  }
  goto code_r0x047e3c38;
}


```

## Unit.UpdateAttackTimer (off 0x46e5950)

```c

void FUN_047e9950(undefined8 param_1,long param_2)

{
  undefined *puVar1;
  float *pfVar2;
  float fVar3;
  
  if ((bRam000000000a45166b & 1) == 0) {
    func_0x0415191c(PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0);
    bRam000000000a45166b = 1;
  }
  if ((*(char *)(param_2 + 0x5c) != '\0') && (*(char *)(param_2 + 0x5d) == '\0')) {
    *(undefined1 *)(param_2 + 0x5d) = 1;
    func_0x047e9608(param_2);
  }
  puVar1 = PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0;
  if (((*(char *)(param_2 + 0x5e) != '\0') && (*(char *)(param_2 + 0x8c) == '\0')) &&
     (*(char *)(param_2 + 0x5c) != '\0')) {
    pfVar2 = (float *)(param_2 + 0x68);
    if (0.0 < *pfVar2) {
      if (*(int *)(*(long *)PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0 + 0xe0)
          == 0) {
        func_0x04151a94();
      }
      *pfVar2 = *pfVar2 - (float)param_1;
      return;
    }
    pfVar2 = (float *)(param_2 + 0x34);
    if (*(int *)(*(long *)PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0 + 0xe0)
        == 0) {
      func_0x04151a94();
    }
    func_0x047ca60c(param_1,pfVar2,0);
    fVar3 = (float)func_0x047e9a84(param_2);
    if ((0.0 < fVar3) && (fVar3 <= *pfVar2)) {
      if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
        func_0x04151a94();
      }
      func_0x047cac84(0,pfVar2,0);
      *(undefined1 *)(param_2 + 0x8c) = 1;
    }
  }
  return;
}


```

## Skill.UpdateSkill (off 0x46e0b7c)

```c

/* WARNING: Removing unreachable block (ram,0x047e53d0) */

void FUN_047e4b7c(ulong param_1,long param_2,long param_3,undefined8 param_4,uint param_5)

{
  ulong *puVar1;
  char cVar2;
  bool bVar3;
  undefined *puVar4;
  undefined *puVar5;
  int iVar6;
  undefined8 *puVar7;
  long extraout_x1;
  undefined8 extraout_x1_00;
  code *UNRECOVERED_JUMPTABLE_00;
  long lVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  int *piVar12;
  long unaff_x19;
  undefined8 unaff_x20;
  long *plVar13;
  long *plVar14;
  undefined8 unaff_x21;
  undefined *unaff_x22;
  undefined8 unaff_x23;
  undefined *unaff_x24;
  undefined *unaff_x30;
  float fVar15;
  undefined4 uVar16;
  float extraout_s0;
  undefined8 uVar17;
  ulong extraout_d0;
  undefined8 uVar18;
  undefined8 extraout_d0_00;
  uint uVar19;
  ulong unaff_d8;
  float fVar20;
  undefined4 uVar21;
  ulong unaff_d9;
  undefined1 auVar22 [16];
  
  lVar8 = param_2;
  if (*(int *)(param_2 + 0x28) != 2) {
    if (*(int *)(param_2 + 0x28) != 3) {
      return;
    }
    register0x00000008 = (BADSPACEBASE *)&stack0xffffffffffffffc0;
    unaff_x20 = 0xa451000;
    if ((bRam000000000a451646 & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      func_0x0415191c(PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0);
      func_0x0415191c(PTR_DAT_09ece810);
      bRam000000000a451646 = 1;
    }
    if (*(char *)(param_2 + 0x38) != '\0') {
      *(undefined1 *)(param_2 + 0x38) = 0;
      *(float *)(param_2 + 0x1c) = *(float *)(param_2 + 0x18) * *(float *)(param_2 + 0x3c);
    }
    puVar5 = PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0;
    puVar4 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    lVar8 = *(long *)(param_2 + 0x60);
    unaff_d8 = param_1;
    if (lVar8 != 0) {
      auVar22 = (**(code **)(lVar8 + 0x18))
                          (*(undefined8 *)(lVar8 + 0x40),*(undefined8 *)(lVar8 + 0x28));
      unaff_x21 = auVar22._8_8_;
      if (*(int *)(*(long *)puVar4 + 0xe0) == 0) {
        func_0x04151a94();
      }
      param_4 = 0;
      fVar15 = (float)func_0x09774c48(auVar22._0_8_,unaff_x21,0);
      if (*(int *)(*(long *)puVar5 + 0xe0) == 0) {
        func_0x04151a94();
      }
      func_0x047ca60c(((float)param_1 * 1000.0) / fVar15,param_2 + 0x1c,0);
      unaff_d8 = (ulong)(uint)*(float *)(param_2 + 0x18);
      unaff_d9 = (ulong)(uint)*(float *)(param_2 + 0x1c);
      unaff_x22 = puVar5;
      if (*(float *)(param_2 + 0x18) <= *(float *)(param_2 + 0x1c)) {
        if (*(int *)(*(long *)puVar5 + 0xe0) == 0) {
          func_0x04151a94();
        }
        func_0x047cac84(0,param_2 + 0x1c,0);
        plVar13 = *(long **)(param_2 + 0x10);
        *(undefined4 *)(param_2 + 0x28) = 1;
        unaff_x20 = 0;
        if (plVar13 != (long *)0x0) {
          lVar8 = *plVar13;
          uVar11 = (ulong)*(ushort *)(lVar8 + 0x12e);
          if (uVar11 != 0) {
            piVar12 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
            do {
              if (*(long *)(piVar12 + -2) == *(long *)PTR_DAT_09ece810) {
                puVar7 = (undefined8 *)(lVar8 + (long)(*piVar12 + 0x11) * 0x10 + 0x138);
                goto code_r0x047e4dbc;
              }
              uVar11 = uVar11 - 1;
              piVar12 = piVar12 + 4;
            } while (uVar11 != 0);
          }
          puVar7 = (undefined8 *)func_0x041cb4c4(plVar13,*(long *)PTR_DAT_09ece810,0x11);
code_r0x047e4dbc:
          UNRECOVERED_JUMPTABLE_00 = (code *)*puVar7;
          uVar18 = puVar7[1];
          uVar17 = 0x3f800000;
          uVar21 = 1;
          goto code_r0x047e4dd4;
        }
      }
      else {
        if (*(int *)(*(long *)puVar5 + 0xe0) == 0) {
          func_0x04151a94();
        }
        uVar17 = Game_Application_InGameHunt_HuntCalculator__CalculateRecastRate
                           (unaff_d9,unaff_d8,0);
        plVar13 = *(long **)(param_2 + 0x10);
        unaff_x20 = 0;
        if (plVar13 != (long *)0x0) {
          lVar8 = *plVar13;
          uVar21 = *(undefined4 *)(param_2 + 0x28);
          uVar11 = (ulong)*(ushort *)(lVar8 + 0x12e);
          if (uVar11 != 0) {
            piVar12 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
            do {
              if (*(long *)(piVar12 + -2) == *(long *)PTR_DAT_09ece810) {
                puVar7 = (undefined8 *)(lVar8 + (long)(*piVar12 + 0x11) * 0x10 + 0x138);
                goto code_r0x047e4d90;
              }
              uVar11 = uVar11 - 1;
              piVar12 = piVar12 + 4;
            } while (uVar11 != 0);
          }
          puVar7 = (undefined8 *)func_0x041cb4c4(plVar13,*(long *)PTR_DAT_09ece810,0x11);
code_r0x047e4d90:
          UNRECOVERED_JUMPTABLE_00 = (code *)*puVar7;
          uVar18 = puVar7[1];
code_r0x047e4dd4:
                    /* WARNING: Could not recover jumptable at 0x047e4de4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*UNRECOVERED_JUMPTABLE_00)(uVar17,0,plVar13,param_2,uVar21,uVar18);
          return;
        }
      }
    }
    unaff_x30 = &UNK_047e4dec;
    lVar8 = func_0x04151bb8();
    param_3 = extraout_x1;
    unaff_x19 = param_2;
    param_1 = extraout_d0;
  }
  puVar4 = PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0;
  *(ulong *)((long)register0x00000008 + -0x40) = unaff_d8;
  *(undefined **)((long)register0x00000008 + -0x38) = unaff_x30;
  *(undefined **)((long)register0x00000008 + -0x30) = unaff_x24;
  *(undefined8 *)((long)register0x00000008 + -0x28) = unaff_x23;
  *(undefined **)((long)register0x00000008 + -0x20) = unaff_x22;
  *(undefined8 *)((long)register0x00000008 + -0x18) = unaff_x21;
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x20;
  *(long *)((long)register0x00000008 + -8) = unaff_x19;
  if ((bRam000000000a45164a & 1) == 0) {
    func_0x0415191c(PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0);
    func_0x0415191c(PTR_DAT_09ece810);
    func_0x0415191c(PTR_DAT_09ec4908);
    bRam000000000a45164a = 1;
  }
  lVar10 = lVar8 + 0x20;
  if (*(int *)(*(long *)puVar4 + 0xe0) == 0) {
    func_0x04151a94();
  }
  func_0x047ca60c((float)param_1 * 1000.0,lVar10,0);
  puVar5 = PTR_DAT_09ec4908;
  plVar13 = *(long **)(lVar8 + 0x50);
  if (plVar13 != (long *)0x0) {
    lVar9 = *plVar13;
    fVar15 = *(float *)(lVar8 + 0x20);
    param_1 = (ulong)(uint)fVar15;
    uVar11 = (ulong)*(ushort *)(lVar9 + 0x12e);
    if (uVar11 != 0) {
      piVar12 = (int *)(*(long *)(lVar9 + 0xb0) + 8);
      do {
        if (*(long *)(piVar12 + -2) == *(long *)PTR_DAT_09ec4908) {
          puVar7 = (undefined8 *)(lVar9 + (long)(*piVar12 + 4) * 0x10 + 0x138);
          goto code_r0x047e4edc;
        }
        uVar11 = uVar11 - 1;
        piVar12 = piVar12 + 4;
      } while (uVar11 != 0);
    }
    param_4 = 4;
    puVar7 = (undefined8 *)func_0x041cb4c4(plVar13,*(long *)PTR_DAT_09ec4908,4);
code_r0x047e4edc:
    iVar6 = (*(code *)*puVar7)(plVar13,puVar7[1]);
    unaff_x24 = puVar5;
    if ((float)iVar6 <= fVar15) {
      if (*(int *)(*(long *)puVar4 + 0xe0) == 0) {
        func_0x04151a94();
      }
      func_0x047cac84(0,lVar10,0);
      plVar14 = *(long **)(lVar8 + 0x10);
      *(undefined4 *)(lVar8 + 0x28) = 3;
      *(undefined4 *)(lVar8 + 0x1c) = 0;
      param_3 = 0;
      if (plVar14 != (long *)0x0) {
        lVar10 = *plVar14;
        uVar11 = (ulong)*(ushort *)(lVar10 + 0x12e);
        if (uVar11 != 0) {
          piVar12 = (int *)(*(long *)(lVar10 + 0xb0) + 8);
          do {
            if (*(long *)(piVar12 + -2) == *(long *)PTR_DAT_09ece810) {
              puVar7 = (undefined8 *)(lVar10 + (long)(*piVar12 + 0x11) * 0x10 + 0x138);
              goto code_r0x047e4ff0;
            }
            uVar11 = uVar11 - 1;
            piVar12 = piVar12 + 4;
          } while (uVar11 != 0);
        }
        puVar7 = (undefined8 *)func_0x041cb4c4(plVar14,*(long *)PTR_DAT_09ece810,0x11);
code_r0x047e4ff0:
        UNRECOVERED_JUMPTABLE_00 = (code *)*puVar7;
        uVar18 = puVar7[1];
        uVar16 = 0;
        fVar15 = 0.0;
        uVar21 = 3;
code_r0x047e50d4:
                    /* WARNING: Could not recover jumptable at 0x047e50e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*UNRECOVERED_JUMPTABLE_00)(uVar16,fVar15,plVar14,lVar8,uVar21,uVar18);
        return;
      }
    }
    else if (param_3 != 0) {
      if (*(char *)(param_3 + 0x28) == '\0') {
        return;
      }
      plVar14 = *(long **)(lVar8 + 0x50);
      param_3 = 0;
      if (plVar14 != (long *)0x0) {
        lVar9 = *plVar14;
        param_1 = (ulong)*(uint *)(lVar8 + 0x20);
        uVar11 = (ulong)*(ushort *)(lVar9 + 0x12e);
        if (uVar11 != 0) {
          piVar12 = (int *)(*(long *)(lVar9 + 0xb0) + 8);
          do {
            if (*(long *)(piVar12 + -2) == *(long *)puVar5) {
              puVar7 = (undefined8 *)(lVar9 + (long)(*piVar12 + 4) * 0x10 + 0x138);
              goto code_r0x047e501c;
            }
            uVar11 = uVar11 - 1;
            piVar12 = piVar12 + 4;
          } while (uVar11 != 0);
        }
        param_4 = 4;
        puVar7 = (undefined8 *)func_0x041cb4c4(plVar14,*(long *)puVar5,4);
code_r0x047e501c:
        iVar6 = (*(code *)*puVar7)(plVar14,puVar7[1]);
        if (*(int *)(*(long *)puVar4 + 0xe0) == 0) {
          func_0x04151a94(*(long *)puVar4);
        }
        fVar15 = (float)Game_Application_InGameHunt_HuntCalculator__CalculateRecastRate
                                  (param_1,(float)iVar6,0);
        plVar14 = *(long **)(lVar8 + 0x10);
        param_3 = 0;
        if (plVar14 != (long *)0x0) {
          lVar10 = *plVar14;
          uVar21 = *(undefined4 *)(lVar8 + 0x28);
          uVar11 = (ulong)*(ushort *)(lVar10 + 0x12e);
          fVar15 = 1.0 - fVar15;
          if (uVar11 != 0) {
            piVar12 = (int *)(*(long *)(lVar10 + 0xb0) + 8);
            do {
              if (*(long *)(piVar12 + -2) == *(long *)PTR_DAT_09ece810) {
                puVar7 = (undefined8 *)(lVar10 + (long)(*piVar12 + 0x11) * 0x10 + 0x138);
                goto code_r0x047e50bc;
              }
              uVar11 = uVar11 - 1;
              piVar12 = piVar12 + 4;
            } while (uVar11 != 0);
          }
          puVar7 = (undefined8 *)func_0x041cb4c4(plVar14,*(long *)PTR_DAT_09ece810,0x11);
code_r0x047e50bc:
          UNRECOVERED_JUMPTABLE_00 = (code *)*puVar7;
          uVar18 = puVar7[1];
          uVar16 = 0x3f800000;
          goto code_r0x047e50d4;
        }
      }
    }
  }
  lVar9 = func_0x04151bb8();
  *(ulong *)((long)register0x00000008 + -0x60) = param_1;
  *(undefined **)((long)register0x00000008 + -0x58) = &UNK_047e50f0;
  *(long *)((long)register0x00000008 + -0x50) = param_3;
  *(long *)((long)register0x00000008 + -0x48) = lVar8;
  if ((bRam000000000a451643 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece810);
    bRam000000000a451643 = 1;
  }
  uVar19 = *(uint *)(lVar9 + 0x18);
  plVar14 = *(long **)(lVar9 + 0x10);
  *(undefined4 *)(lVar9 + 0x28) = 1;
  *(uint *)(lVar9 + 0x1c) = uVar19;
  *(undefined4 *)(lVar9 + 0x20) = 0;
  if (plVar14 == (long *)0x0) {
    lVar8 = func_0x04151bb8();
    *(undefined **)((long)register0x00000008 + -0x80) = &UNK_047e51c0;
    *(undefined8 *)((long)register0x00000008 + -0x70) = 0;
    *(long *)((long)register0x00000008 + -0x68) = lVar9;
    if ((bRam000000000a451644 & 1) == 0) {
      func_0x0415191c(PTR_DAT_09ece810);
      bRam000000000a451644 = 1;
    }
    plVar14 = *(long **)(lVar8 + 0x10);
    *(undefined4 *)(lVar8 + 0x28) = 4;
    if (plVar14 == (long *)0x0) {
      lVar9 = func_0x04151bb8();
      *(undefined **)((long)register0x00000008 + -0xa0) = &UNK_047e527c;
      *(undefined8 *)((long)register0x00000008 + -0x90) = 0;
      *(long *)((long)register0x00000008 + -0x88) = lVar8;
      if ((bRam000000000a451645 & 1) == 0) {
        func_0x0415191c(PTR_DAT_09ece810);
        bRam000000000a451645 = 1;
      }
      if (*(int *)(lVar9 + 0x28) != 4) {
        return;
      }
      plVar14 = *(long **)(lVar9 + 0x10);
      *(undefined4 *)(lVar9 + 0x28) = 2;
      if (plVar14 == (long *)0x0) {
        lVar8 = func_0x04151bb8();
        *(ulong *)((long)register0x00000008 + -0xd0) = unaff_d9;
        *(ulong *)((long)register0x00000008 + -200) = (ulong)uVar19;
        *(undefined **)((long)register0x00000008 + -0xc0) = &UNK_047e5350;
        *(undefined8 *)((long)register0x00000008 + -0xb0) = 0;
        *(long *)((long)register0x00000008 + -0xa8) = lVar9;
        if ((bRam000000000a451647 & 1) == 0) {
          func_0x0415191c(PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0);
          func_0x0415191c(PTR_DAT_09ece810);
          bRam000000000a451647 = 1;
        }
        if (*(int *)(lVar8 + 0x28) != 3) {
          if (*(int *)(lVar8 + 0x28) == 2) {
            *(undefined4 *)(lVar8 + 0x38) = 1;
            *(float *)(lVar8 + 0x3c) = extraout_s0;
          }
          return;
        }
        fVar20 = *(float *)(lVar8 + 0x18);
        fVar15 = extraout_s0;
        if (extraout_s0 < 0.0) {
          fVar15 = 0.0;
        }
        fVar15 = *(float *)(lVar8 + 0x1c) + fVar15 * (fVar20 - *(float *)(lVar8 + 0x1c));
        *(float *)(lVar8 + 0x1c) = fVar15;
        if (*(int *)(*(long *)PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0 +
                    0xe0) == 0) {
          func_0x04151a94();
        }
        uVar18 = Game_Application_InGameHunt_HuntCalculator__CalculateRecastRate
                           ((ulong)(uint)fVar15,fVar20,0);
        plVar14 = *(long **)(lVar8 + 0x10);
        if (plVar14 == (long *)0x0) {
          lVar9 = func_0x04151bb8();
          *(ulong *)((long)register0x00000008 + -0x110) = (ulong)(uint)fVar15;
          *(undefined **)((long)register0x00000008 + -0x108) = &UNK_047e54a4;
          *(undefined **)((long)register0x00000008 + -0x100) = unaff_x24;
          *(undefined **)((long)register0x00000008 + -0xf8) = puVar4;
          *(long **)((long)register0x00000008 + -0xf0) = plVar13;
          *(long *)((long)register0x00000008 + -0xe8) = lVar10;
          *(undefined8 *)((long)register0x00000008 + -0xe0) = 0;
          *(long *)((long)register0x00000008 + -0xd8) = lVar8;
          if ((bRam000000000a451648 & 1) == 0) {
            func_0x0415191c(PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0);
            bRam000000000a451648 = 1;
          }
          puVar4 = PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0;
          if (*(char *)(lVar9 + 0x2c) != '\0') {
            if (*(int *)(*(long *)PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0 +
                        0xe0) == 0) {
              func_0x04151a94();
            }
            func_0x047ca60c(extraout_d0_00,lVar9 + 0x24,0);
            if (*(float *)(lVar9 + 0x5c) <= *(float *)(lVar9 + 0x24)) {
              if (*(int *)(*(long *)puVar4 + 0xe0) == 0) {
                func_0x04151a94();
              }
              func_0x047cac84(0,lVar9 + 0x24,0);
              puVar7 = (undefined8 *)(lVar9 + 0x30);
              func_0x047e55ac(lVar9,*puVar7,extraout_x1_00,param_4,param_5 & 1);
              *(undefined1 *)(lVar9 + 0x2c) = 0;
              *puVar7 = 0;
              if (iRam000000000a680cb0 != 0) {
                puVar1 = (ulong *)(((ulong)puVar7 >> 0x12 & 0x7fff) * 8 + 0xa4b4c88);
                do {
                  cVar2 = '\x01';
                  bVar3 = (bool)ExclusiveMonitorPass(puVar1,0x10);
                  if (bVar3) {
                    *puVar1 = *puVar1 | 1L << ((ulong)puVar7 >> 0xc & 0x3f);
                    cVar2 = ExclusiveMonitorsStatus();
                  }
                } while (cVar2 != '\0');
              }
              return;
            }
          }
          return;
        }
        lVar10 = *plVar14;
        uVar21 = *(undefined4 *)(lVar8 + 0x18);
        uVar11 = (ulong)*(ushort *)(lVar10 + 0x12e);
        if (uVar11 != 0) {
          piVar12 = (int *)(*(long *)(lVar10 + 0xb0) + 8);
          do {
            if (*(long *)(piVar12 + -2) == *(long *)PTR_DAT_09ece810) {
              puVar7 = (undefined8 *)(lVar10 + (long)(*piVar12 + 0x12) * 0x10 + 0x138);
              goto code_r0x047e547c;
            }
            uVar11 = uVar11 - 1;
            piVar12 = piVar12 + 4;
          } while (uVar11 != 0);
        }
        puVar7 = (undefined8 *)func_0x041cb4c4(plVar14,*(long *)PTR_DAT_09ece810,0x12);
code_r0x047e547c:
                    /* WARNING: Could not recover jumptable at 0x047e549c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)*puVar7)(uVar18,uVar21,plVar14,lVar8,puVar7[1]);
        return;
      }
      lVar8 = *plVar14;
      uVar11 = (ulong)*(ushort *)(lVar8 + 0x12e);
      if (uVar11 != 0) {
        piVar12 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
        do {
          if (*(long *)(piVar12 + -2) == *(long *)PTR_DAT_09ece810) {
            puVar7 = (undefined8 *)(lVar8 + (long)(*piVar12 + 0x11) * 0x10 + 0x138);
            goto code_r0x047e5328;
          }
          uVar11 = uVar11 - 1;
          piVar12 = piVar12 + 4;
        } while (uVar11 != 0);
      }
      puVar7 = (undefined8 *)func_0x041cb4c4(plVar14,*(long *)PTR_DAT_09ece810,0x11);
code_r0x047e5328:
                    /* WARNING: Could not recover jumptable at 0x047e5348. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*puVar7)(0x3f800000,0,plVar14,lVar9,2,puVar7[1]);
      return;
    }
    lVar10 = *plVar14;
    uVar11 = (ulong)*(ushort *)(lVar10 + 0x12e);
    if (uVar11 != 0) {
      piVar12 = (int *)(*(long *)(lVar10 + 0xb0) + 8);
      do {
        if (*(long *)(piVar12 + -2) == *(long *)PTR_DAT_09ece810) {
          puVar7 = (undefined8 *)(lVar10 + (long)(*piVar12 + 0x11) * 0x10 + 0x138);
          goto code_r0x047e5254;
        }
        uVar11 = uVar11 - 1;
        piVar12 = piVar12 + 4;
      } while (uVar11 != 0);
    }
    puVar7 = (undefined8 *)func_0x041cb4c4(plVar14,*(long *)PTR_DAT_09ece810,0x11);
code_r0x047e5254:
                    /* WARNING: Could not recover jumptable at 0x047e5274. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*puVar7)(0x3f800000,0,plVar14,lVar8,4,puVar7[1]);
    return;
  }
  lVar8 = *plVar14;
  uVar11 = (ulong)*(ushort *)(lVar8 + 0x12e);
  if (uVar11 != 0) {
    piVar12 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
    do {
      if (*(long *)(piVar12 + -2) == *(long *)PTR_DAT_09ece810) {
        puVar7 = (undefined8 *)(lVar8 + (long)(*piVar12 + 0x11) * 0x10 + 0x138);
        goto code_r0x047e5194;
      }
      uVar11 = uVar11 - 1;
      piVar12 = piVar12 + 4;
    } while (uVar11 != 0);
  }
  puVar7 = (undefined8 *)func_0x041cb4c4(plVar14,*(long *)PTR_DAT_09ece810,0x11);
code_r0x047e5194:
                    /* WARNING: Could not recover jumptable at 0x047e51b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*puVar7)((ulong)uVar19,0,plVar14,lVar9,1,puVar7[1]);
  return;
}


```

## Skill.ShortenRecastTimer (off 0x46e1350)

```c

/* WARNING: Removing unreachable block (ram,0x047e53d0) */

void FUN_047e5350(float param_1,long param_2,undefined8 param_3,undefined8 param_4,uint param_5)

{
  ulong *puVar1;
  char cVar2;
  bool bVar3;
  undefined *puVar4;
  undefined8 *puVar5;
  undefined8 extraout_x1;
  long lVar6;
  ulong uVar7;
  int *piVar8;
  long *plVar9;
  undefined8 uVar10;
  undefined8 extraout_d0;
  float fVar11;
  float fVar12;
  undefined4 uVar13;
  
  if ((bRam000000000a451647 & 1) == 0) {
    func_0x0415191c(PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0);
    func_0x0415191c(PTR_DAT_09ece810);
    bRam000000000a451647 = 1;
  }
  if (*(int *)(param_2 + 0x28) != 3) {
    if (*(int *)(param_2 + 0x28) == 2) {
      *(undefined4 *)(param_2 + 0x38) = 1;
      *(float *)(param_2 + 0x3c) = param_1;
    }
    return;
  }
  fVar12 = *(float *)(param_2 + 0x18);
  if (param_1 < 0.0) {
    param_1 = 0.0;
  }
  fVar11 = *(float *)(param_2 + 0x1c) + param_1 * (fVar12 - *(float *)(param_2 + 0x1c));
  *(float *)(param_2 + 0x1c) = fVar11;
  if (*(int *)(*(long *)PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0 + 0xe0) ==
      0) {
    func_0x04151a94();
  }
  uVar10 = Game_Application_InGameHunt_HuntCalculator__CalculateRecastRate(fVar11,fVar12,0);
  plVar9 = *(long **)(param_2 + 0x10);
  if (plVar9 == (long *)0x0) {
    lVar6 = func_0x04151bb8();
    if ((bRam000000000a451648 & 1) == 0) {
      func_0x0415191c(PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0);
      bRam000000000a451648 = 1;
    }
    puVar4 = PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0;
    if (*(char *)(lVar6 + 0x2c) != '\0') {
      if (*(int *)(*(long *)PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0 + 0xe0)
          == 0) {
        func_0x04151a94();
      }
      func_0x047ca60c(extraout_d0,lVar6 + 0x24,0);
      if (*(float *)(lVar6 + 0x5c) <= *(float *)(lVar6 + 0x24)) {
        if (*(int *)(*(long *)puVar4 + 0xe0) == 0) {
          func_0x04151a94();
        }
        func_0x047cac84(0,lVar6 + 0x24,0);
        puVar5 = (undefined8 *)(lVar6 + 0x30);
        func_0x047e55ac(lVar6,*puVar5,extraout_x1,param_4,param_5 & 1);
        *(undefined1 *)(lVar6 + 0x2c) = 0;
        *puVar5 = 0;
        if (iRam000000000a680cb0 != 0) {
          puVar1 = (ulong *)(((ulong)puVar5 >> 0x12 & 0x7fff) * 8 + 0xa4b4c88);
          do {
            cVar2 = '\x01';
            bVar3 = (bool)ExclusiveMonitorPass(puVar1,0x10);
            if (bVar3) {
              *puVar1 = *puVar1 | 1L << ((ulong)puVar5 >> 0xc & 0x3f);
              cVar2 = ExclusiveMonitorsStatus();
            }
          } while (cVar2 != '\0');
        }
        return;
      }
    }
    return;
  }
  lVar6 = *plVar9;
  uVar13 = *(undefined4 *)(param_2 + 0x18);
  uVar7 = (ulong)*(ushort *)(lVar6 + 0x12e);
  if (uVar7 != 0) {
    piVar8 = (int *)(*(long *)(lVar6 + 0xb0) + 8);
    do {
      if (*(long *)(piVar8 + -2) == *(long *)PTR_DAT_09ece810) {
        puVar5 = (undefined8 *)(lVar6 + (long)(*piVar8 + 0x12) * 0x10 + 0x138);
        goto code_r0x047e547c;
      }
      uVar7 = uVar7 - 1;
      piVar8 = piVar8 + 4;
    } while (uVar7 != 0);
  }
  puVar5 = (undefined8 *)func_0x041cb4c4(plVar9,*(long *)PTR_DAT_09ece810,0x12);
code_r0x047e547c:
                    /* WARNING: Could not recover jumptable at 0x047e549c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*puVar5)(uVar10,uVar13,plVar9,param_2,puVar5[1]);
  return;
}


```

## Skill..ctor (off 0x46e02c8)

```c

/* WARNING: Possible PIC construction at 0x047e4384: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047e45b0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047e462c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047e46e0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047e4848: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047e4870: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047e488c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047e4b2c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x047e4890) */
/* WARNING: Removing unreachable block (ram,0x047e4b68) */
/* WARNING: Removing unreachable block (ram,0x047e48ac) */
/* WARNING: Removing unreachable block (ram,0x047e48c4) */
/* WARNING: Removing unreachable block (ram,0x047e48cc) */
/* WARNING: Removing unreachable block (ram,0x047e48f4) */
/* WARNING: Removing unreachable block (ram,0x047e48d8) */
/* WARNING: Removing unreachable block (ram,0x047e48e4) */
/* WARNING: Removing unreachable block (ram,0x047e4904) */
/* WARNING: Removing unreachable block (ram,0x047e4924) */
/* WARNING: Removing unreachable block (ram,0x047e492c) */
/* WARNING: Removing unreachable block (ram,0x047e4954) */
/* WARNING: Removing unreachable block (ram,0x047e4938) */
/* WARNING: Removing unreachable block (ram,0x047e4944) */
/* WARNING: Removing unreachable block (ram,0x047e4964) */
/* WARNING: Removing unreachable block (ram,0x047e4984) */
/* WARNING: Removing unreachable block (ram,0x047e498c) */
/* WARNING: Removing unreachable block (ram,0x047e49b4) */
/* WARNING: Removing unreachable block (ram,0x047e4998) */
/* WARNING: Removing unreachable block (ram,0x047e49a4) */
/* WARNING: Removing unreachable block (ram,0x047e49c4) */
/* WARNING: Removing unreachable block (ram,0x047e49e8) */
/* WARNING: Removing unreachable block (ram,0x047e49f0) */
/* WARNING: Removing unreachable block (ram,0x047e4a18) */
/* WARNING: Removing unreachable block (ram,0x047e49fc) */
/* WARNING: Removing unreachable block (ram,0x047e4a08) */
/* WARNING: Removing unreachable block (ram,0x047e4a28) */
/* WARNING: Removing unreachable block (ram,0x047e4a50) */
/* WARNING: Removing unreachable block (ram,0x047e4a58) */
/* WARNING: Removing unreachable block (ram,0x047e4a84) */
/* WARNING: Removing unreachable block (ram,0x047e4a64) */
/* WARNING: Removing unreachable block (ram,0x047e4a70) */
/* WARNING: Removing unreachable block (ram,0x047e4a94) */
/* WARNING: Removing unreachable block (ram,0x047e4abc) */
/* WARNING: Removing unreachable block (ram,0x047e4ac4) */
/* WARNING: Removing unreachable block (ram,0x047e4aec) */
/* WARNING: Removing unreachable block (ram,0x047e4ad0) */
/* WARNING: Removing unreachable block (ram,0x047e4adc) */
/* WARNING: Removing unreachable block (ram,0x047e4af8) */
/* WARNING: Removing unreachable block (ram,0x047e4874) */
/* WARNING: Removing unreachable block (ram,0x047e484c) */
/* WARNING: Removing unreachable block (ram,0x047e46e4) */
/* WARNING: Removing unreachable block (ram,0x047e46fc) */
/* WARNING: Removing unreachable block (ram,0x047e4704) */
/* WARNING: Removing unreachable block (ram,0x047e472c) */
/* WARNING: Removing unreachable block (ram,0x047e4710) */
/* WARNING: Removing unreachable block (ram,0x047e471c) */
/* WARNING: Removing unreachable block (ram,0x047e473c) */
/* WARNING: Removing unreachable block (ram,0x047e4630) */
/* WARNING: Removing unreachable block (ram,0x047e4650) */
/* WARNING: Removing unreachable block (ram,0x047e466c) */
/* WARNING: Removing unreachable block (ram,0x047e4674) */
/* WARNING: Removing unreachable block (ram,0x047e469c) */
/* WARNING: Removing unreachable block (ram,0x047e4680) */
/* WARNING: Removing unreachable block (ram,0x047e468c) */
/* WARNING: Removing unreachable block (ram,0x047e46ac) */
/* WARNING: Removing unreachable block (ram,0x047e45b4) */
/* WARNING: Removing unreachable block (ram,0x047e45b8) */
/* WARNING: Removing unreachable block (ram,0x047e45d0) */
/* WARNING: Removing unreachable block (ram,0x047e45fc) */
/* WARNING: Removing unreachable block (ram,0x047e45e0) */
/* WARNING: Removing unreachable block (ram,0x047e4614) */
/* WARNING: Removing unreachable block (ram,0x047e4388) */
/* WARNING: Removing unreachable block (ram,0x047e4394) */
/* WARNING: Removing unreachable block (ram,0x047e43ac) */
/* WARNING: Removing unreachable block (ram,0x047e43b4) */
/* WARNING: Removing unreachable block (ram,0x047e43dc) */
/* WARNING: Removing unreachable block (ram,0x047e43c0) */
/* WARNING: Removing unreachable block (ram,0x047e43cc) */
/* WARNING: Removing unreachable block (ram,0x047e43ec) */
/* WARNING: Removing unreachable block (ram,0x047e4400) */
/* WARNING: Removing unreachable block (ram,0x047e4430) */
/* WARNING: Removing unreachable block (ram,0x047e4438) */
/* WARNING: Removing unreachable block (ram,0x047e4460) */
/* WARNING: Removing unreachable block (ram,0x047e4444) */
/* WARNING: Removing unreachable block (ram,0x047e4450) */
/* WARNING: Removing unreachable block (ram,0x047e446c) */
/* WARNING: Removing unreachable block (ram,0x047e4620) */
/* WARNING: Removing unreachable block (ram,0x047e44a0) */
/* WARNING: Removing unreachable block (ram,0x047e44b4) */
/* WARNING: Removing unreachable block (ram,0x047e44bc) */
/* WARNING: Removing unreachable block (ram,0x047e44d4) */
/* WARNING: Removing unreachable block (ram,0x047e44dc) */
/* WARNING: Removing unreachable block (ram,0x047e4504) */
/* WARNING: Removing unreachable block (ram,0x047e44e8) */
/* WARNING: Removing unreachable block (ram,0x047e44f4) */
/* WARNING: Removing unreachable block (ram,0x047e4514) */
/* WARNING: Removing unreachable block (ram,0x047e477c) */
/* WARNING: Removing unreachable block (ram,0x047e4524) */
/* WARNING: Removing unreachable block (ram,0x047e4540) */
/* WARNING: Removing unreachable block (ram,0x047e4548) */
/* WARNING: Removing unreachable block (ram,0x047e4570) */
/* WARNING: Removing unreachable block (ram,0x047e4554) */
/* WARNING: Removing unreachable block (ram,0x047e4560) */
/* WARNING: Removing unreachable block (ram,0x047e457c) */
/* WARNING: Removing unreachable block (ram,0x047e4780) */
/* WARNING: Removing unreachable block (ram,0x047e47d4) */
/* WARNING: Removing unreachable block (ram,0x047e4824) */
/* WARNING: Removing unreachable block (ram,0x047e4b30) */

void FUN_047e42c8(long param_1,undefined8 param_2)

{
  ulong *puVar1;
  char cVar2;
  bool bVar3;
  undefined8 *puVar4;
  
  if ((bRam000000000a451642 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ececb0);
    func_0x0415191c(PTR_DAT_09ececb8);
    func_0x0415191c(PTR_DAT_09ec4908);
    func_0x0415191c(PTR_DAT_09ececc0);
    func_0x0415191c(PTR_DAT_09ececc8);
    func_0x0415191c(PTR_DAT_09ececd0);
    func_0x0415191c(PTR_DAT_09ececd8);
    bRam000000000a451642 = 1;
  }
  func_0x085fc77c(param_1,0);
  puVar4 = (undefined8 *)(param_1 + 0x50);
  *puVar4 = param_2;
  if (iRam000000000a680cb0 != 0) {
    puVar1 = (ulong *)(((ulong)puVar4 >> 0x12 & 0x7fff) * 8 + 0xa4b4c88);
    do {
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(puVar1,0x10);
      if (bVar3) {
        *puVar1 = *puVar1 | 1L << ((ulong)puVar4 >> 0xc & 0x3f);
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
  }
  return;
}


```

## Skill.Fire (off 0x46e127c)

```c

/* WARNING: Removing unreachable block (ram,0x047e53d0) */

void FUN_047e527c(long param_1,undefined8 param_2,undefined8 param_3,uint param_4)

{
  ulong *puVar1;
  char cVar2;
  bool bVar3;
  undefined *puVar4;
  undefined8 *puVar5;
  undefined8 extraout_x1;
  long lVar6;
  long lVar7;
  ulong uVar8;
  int *piVar9;
  long *plVar10;
  float extraout_s0;
  undefined8 uVar11;
  undefined8 extraout_d0;
  float fVar12;
  float fVar13;
  undefined4 uVar14;
  
  if ((bRam000000000a451645 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece810);
    bRam000000000a451645 = 1;
  }
  if (*(int *)(param_1 + 0x28) != 4) {
    return;
  }
  plVar10 = *(long **)(param_1 + 0x10);
  *(undefined4 *)(param_1 + 0x28) = 2;
  if (plVar10 == (long *)0x0) {
    lVar6 = func_0x04151bb8();
    if ((bRam000000000a451647 & 1) == 0) {
      func_0x0415191c(PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0);
      func_0x0415191c(PTR_DAT_09ece810);
      bRam000000000a451647 = 1;
    }
    if (*(int *)(lVar6 + 0x28) != 3) {
      if (*(int *)(lVar6 + 0x28) == 2) {
        *(undefined4 *)(lVar6 + 0x38) = 1;
        *(float *)(lVar6 + 0x3c) = extraout_s0;
      }
      return;
    }
    fVar13 = *(float *)(lVar6 + 0x18);
    fVar12 = extraout_s0;
    if (extraout_s0 < 0.0) {
      fVar12 = 0.0;
    }
    fVar12 = *(float *)(lVar6 + 0x1c) + fVar12 * (fVar13 - *(float *)(lVar6 + 0x1c));
    *(float *)(lVar6 + 0x1c) = fVar12;
    if (*(int *)(*(long *)PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0 + 0xe0)
        == 0) {
      func_0x04151a94();
    }
    uVar11 = Game_Application_InGameHunt_HuntCalculator__CalculateRecastRate(fVar12,fVar13,0);
    plVar10 = *(long **)(lVar6 + 0x10);
    if (plVar10 == (long *)0x0) {
      lVar6 = func_0x04151bb8();
      if ((bRam000000000a451648 & 1) == 0) {
        func_0x0415191c(PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0);
        bRam000000000a451648 = 1;
      }
      puVar4 = PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0;
      if (*(char *)(lVar6 + 0x2c) != '\0') {
        if (*(int *)(*(long *)PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0 +
                    0xe0) == 0) {
          func_0x04151a94();
        }
        func_0x047ca60c(extraout_d0,lVar6 + 0x24,0);
        if (*(float *)(lVar6 + 0x5c) <= *(float *)(lVar6 + 0x24)) {
          if (*(int *)(*(long *)puVar4 + 0xe0) == 0) {
            func_0x04151a94();
          }
          func_0x047cac84(0,lVar6 + 0x24,0);
          puVar5 = (undefined8 *)(lVar6 + 0x30);
          func_0x047e55ac(lVar6,*puVar5,extraout_x1,param_3,param_4 & 1);
          *(undefined1 *)(lVar6 + 0x2c) = 0;
          *puVar5 = 0;
          if (iRam000000000a680cb0 != 0) {
            puVar1 = (ulong *)(((ulong)puVar5 >> 0x12 & 0x7fff) * 8 + 0xa4b4c88);
            do {
              cVar2 = '\x01';
              bVar3 = (bool)ExclusiveMonitorPass(puVar1,0x10);
              if (bVar3) {
                *puVar1 = *puVar1 | 1L << ((ulong)puVar5 >> 0xc & 0x3f);
                cVar2 = ExclusiveMonitorsStatus();
              }
            } while (cVar2 != '\0');
          }
          return;
        }
      }
      return;
    }
    lVar7 = *plVar10;
    uVar14 = *(undefined4 *)(lVar6 + 0x18);
    uVar8 = (ulong)*(ushort *)(lVar7 + 0x12e);
    if (uVar8 != 0) {
      piVar9 = (int *)(*(long *)(lVar7 + 0xb0) + 8);
      do {
        if (*(long *)(piVar9 + -2) == *(long *)PTR_DAT_09ece810) {
          puVar5 = (undefined8 *)(lVar7 + (long)(*piVar9 + 0x12) * 0x10 + 0x138);
          goto code_r0x047e547c;
        }
        uVar8 = uVar8 - 1;
        piVar9 = piVar9 + 4;
      } while (uVar8 != 0);
    }
    puVar5 = (undefined8 *)func_0x041cb4c4(plVar10,*(long *)PTR_DAT_09ece810,0x12);
code_r0x047e547c:
                    /* WARNING: Could not recover jumptable at 0x047e549c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*puVar5)(uVar11,uVar14,plVar10,lVar6,puVar5[1]);
    return;
  }
  lVar6 = *plVar10;
  uVar8 = (ulong)*(ushort *)(lVar6 + 0x12e);
  if (uVar8 != 0) {
    piVar9 = (int *)(*(long *)(lVar6 + 0xb0) + 8);
    do {
      if (*(long *)(piVar9 + -2) == *(long *)PTR_DAT_09ece810) {
        puVar5 = (undefined8 *)(lVar6 + (long)(*piVar9 + 0x11) * 0x10 + 0x138);
        goto code_r0x047e5328;
      }
      uVar8 = uVar8 - 1;
      piVar9 = piVar9 + 4;
    } while (uVar8 != 0);
  }
  puVar5 = (undefined8 *)func_0x041cb4c4(plVar10,*(long *)PTR_DAT_09ece810,0x11);
code_r0x047e5328:
                    /* WARNING: Could not recover jumptable at 0x047e5348. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*puVar5)(0x3f800000,0,plVar10,param_1,2,puVar5[1]);
  return;
}


```

## FriendStatus..ctor (off 0x46dd6d8)

```c

undefined8
FUN_047e16d8(undefined4 param_1,undefined4 param_2,undefined4 param_3,long param_4,long *param_5)

{
  undefined *puVar1;
  undefined8 *puVar2;
  long *plVar3;
  long *plVar4;
  long *plVar5;
  long *plVar6;
  long *plVar7;
  long *plVar8;
  long *plVar9;
  long *plVar10;
  long *plVar11;
  long *plVar12;
  long *plVar13;
  long *plVar14;
  long *plVar15;
  long *plVar16;
  long *plVar17;
  undefined8 uVar18;
  long lVar19;
  ulong uVar20;
  int *piVar21;
  
  if ((bRam000000000a451617 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09eceba8);
    func_0x0415191c(PTR_WithNetwork_AttackValue_TypeInfo_09eceb98);
    func_0x0415191c(PTR_DAT_09ecebb0);
    func_0x0415191c(PTR_WithNetwork_CriticalDamageValue_TypeInfo_09ecebb8);
    func_0x0415191c(PTR_DAT_09ecebc0);
    func_0x0415191c(PTR_WithNetwork_CriticalRateValue_TypeInfo_09ecebc8);
    func_0x0415191c(PTR_DAT_09ecebd0);
    func_0x0415191c(PTR_DAT_09ecebd8);
    func_0x0415191c(PTR_WithNetwork_HpValue_TypeInfo_09eceba0);
    func_0x0415191c(PTR_DAT_09ecd1a0);
    func_0x0415191c(PTR_DAT_09ecebe0);
    func_0x0415191c(PTR_DAT_09ecebe8);
    func_0x0415191c(PTR_DAT_09ecebf0);
    func_0x0415191c(PTR_DAT_09ecebf8);
    func_0x0415191c(PTR_DAT_09ecec08);
    bRam000000000a451617 = 1;
  }
  puVar1 = PTR_DAT_09ecd1a0;
  if (param_5 == (long *)0x0) {
    func_0x04151bb8();
    return 1;
  }
  lVar19 = *param_5;
  uVar20 = (ulong)*(ushort *)(lVar19 + 0x12e);
  if (uVar20 != 0) {
    piVar21 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
    do {
      if (*(long *)(piVar21 + -2) == *(long *)PTR_DAT_09ecd1a0) {
        puVar2 = (undefined8 *)(lVar19 + (long)*piVar21 * 0x10 + 0x138);
        goto code_r0x047e1830;
      }
      uVar20 = uVar20 - 1;
      piVar21 = piVar21 + 4;
    } while (uVar20 != 0);
  }
  puVar2 = (undefined8 *)func_0x041cb4c4(param_5,*(long *)PTR_DAT_09ecd1a0,0);
code_r0x047e1830:
  plVar3 = (long *)(*(code *)*puVar2)(param_5,1,puVar2[1]);
  lVar19 = *param_5;
  uVar20 = (ulong)*(ushort *)(lVar19 + 0x12e);
  if (uVar20 != 0) {
    piVar21 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
    do {
      if (*(long *)(piVar21 + -2) == *(long *)puVar1) {
        puVar2 = (undefined8 *)(lVar19 + (long)*piVar21 * 0x10 + 0x138);
        goto code_r0x047e1890;
      }
      uVar20 = uVar20 - 1;
      piVar21 = piVar21 + 4;
    } while (uVar20 != 0);
  }
  puVar2 = (undefined8 *)func_0x041cb4c4(param_5,*(long *)puVar1,0);
code_r0x047e1890:
  plVar4 = (long *)(*(code *)*puVar2)(param_5,3,puVar2[1]);
  lVar19 = *param_5;
  uVar20 = (ulong)*(ushort *)(lVar19 + 0x12e);
  if (uVar20 != 0) {
    piVar21 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
    do {
      if (*(long *)(piVar21 + -2) == *(long *)puVar1) {
        puVar2 = (undefined8 *)(lVar19 + (long)*piVar21 * 0x10 + 0x138);
        goto code_r0x047e18f0;
      }
      uVar20 = uVar20 - 1;
      piVar21 = piVar21 + 4;
    } while (uVar20 != 0);
  }
  puVar2 = (undefined8 *)func_0x041cb4c4(param_5,*(long *)puVar1,0);
code_r0x047e18f0:
  plVar5 = (long *)(*(code *)*puVar2)(param_5,4,puVar2[1]);
  lVar19 = *param_5;
  uVar20 = (ulong)*(ushort *)(lVar19 + 0x12e);
  if (uVar20 != 0) {
    piVar21 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
    do {
      if (*(long *)(piVar21 + -2) == *(long *)puVar1) {
        puVar2 = (undefined8 *)(lVar19 + (long)*piVar21 * 0x10 + 0x138);
        goto code_r0x047e1950;
      }
      uVar20 = uVar20 - 1;
      piVar21 = piVar21 + 4;
    } while (uVar20 != 0);
  }
  puVar2 = (undefined8 *)func_0x041cb4c4(param_5,*(long *)puVar1,0);
code_r0x047e1950:
  plVar6 = (long *)(*(code *)*puVar2)(param_5,6,puVar2[1]);
  lVar19 = *param_5;
  uVar20 = (ulong)*(ushort *)(lVar19 + 0x12e);
  if (uVar20 != 0) {
    piVar21 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
    do {
      if (*(long *)(piVar21 + -2) == *(long *)puVar1) {
        puVar2 = (undefined8 *)(lVar19 + (long)*piVar21 * 0x10 + 0x138);
        goto code_r0x047e19b0;
      }
      uVar20 = uVar20 - 1;
      piVar21 = piVar21 + 4;
    } while (uVar20 != 0);
  }
  puVar2 = (undefined8 *)func_0x041cb4c4(param_5,*(long *)puVar1,0);
code_r0x047e19b0:
  plVar7 = (long *)(*(code *)*puVar2)(param_5,5,puVar2[1]);
  lVar19 = *param_5;
  uVar20 = (ulong)*(ushort *)(lVar19 + 0x12e);
  if (uVar20 != 0) {
    piVar21 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
    do {
      if (*(long *)(piVar21 + -2) == *(long *)puVar1) {
        puVar2 = (undefined8 *)(lVar19 + (long)*piVar21 * 0x10 + 0x138);
        goto code_r0x047e1a10;
      }
      uVar20 = uVar20 - 1;
      piVar21 = piVar21 + 4;
    } while (uVar20 != 0);
  }
  puVar2 = (undefined8 *)func_0x041cb4c4(param_5,*(long *)puVar1,0);
code_r0x047e1a10:
  plVar8 = (long *)(*(code *)*puVar2)(param_5,0x15,puVar2[1]);
  lVar19 = *param_5;
  uVar20 = (ulong)*(ushort *)(lVar19 + 0x12e);
  if (uVar20 != 0) {
    piVar21 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
    do {
      if (*(long *)(piVar21 + -2) == *(long *)puVar1) {
        puVar2 = (undefined8 *)(lVar19 + (long)*piVar21 * 0x10 + 0x138);
        goto code_r0x047e1a70;
      }
      uVar20 = uVar20 - 1;
      piVar21 = piVar21 + 4;
    } while (uVar20 != 0);
  }
  puVar2 = (undefined8 *)func_0x041cb4c4(param_5,*(long *)puVar1,0);
code_r0x047e1a70:
  plVar9 = (long *)(*(code *)*puVar2)(param_5,0x16,puVar2[1]);
  lVar19 = *param_5;
  uVar20 = (ulong)*(ushort *)(lVar19 + 0x12e);
  if (uVar20 != 0) {
    piVar21 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
    do {
      if (*(long *)(piVar21 + -2) == *(long *)puVar1) {
        puVar2 = (undefined8 *)(lVar19 + (long)*piVar21 * 0x10 + 0x138);
        goto code_r0x047e1ad0;
      }
      uVar20 = uVar20 - 1;
      piVar21 = piVar21 + 4;
    } while (uVar20 != 0);
  }
  puVar2 = (undefined8 *)func_0x041cb4c4(param_5,*(long *)puVar1,0);
code_r0x047e1ad0:
  plVar10 = (long *)(*(code *)*puVar2)(param_5,10,puVar2[1]);
  lVar19 = *param_5;
  uVar20 = (ulong)*(ushort *)(lVar19 + 0x12e);
  if (uVar20 != 0) {
    piVar21 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
    do {
      if (*(long *)(piVar21 + -2) == *(long *)puVar1) {
        puVar2 = (undefined8 *)(lVar19 + (long)*piVar21 * 0x10 + 0x138);
        goto code_r0x047e1b30;
      }
      uVar20 = uVar20 - 1;
      piVar21 = piVar21 + 4;
    } while (uVar20 != 0);
  }
  puVar2 = (undefined8 *)func_0x041cb4c4(param_5,*(long *)puVar1,0);
code_r0x047e1b30:
  plVar11 = (long *)(*(code *)*puVar2)(param_5,0x14,puVar2[1]);
  lVar19 = *param_5;
  uVar20 = (ulong)*(ushort *)(lVar19 + 0x12e);
  if (uVar20 != 0) {
    piVar21 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
    do {
      if (*(long *)(piVar21 + -2) == *(long *)puVar1) {
        puVar2 = (undefined8 *)(lVar19 + (long)*piVar21 * 0x10 + 0x138);
        goto code_r0x047e1b94;
      }
      uVar20 = uVar20 - 1;
      piVar21 = piVar21 + 4;
    } while (uVar20 != 0);
  }
  puVar2 = (undefined8 *)func_0x041cb4c4(param_5,*(long *)puVar1,0);
code_r0x047e1b94:
  plVar12 = (long *)(*(code *)*puVar2)(param_5,0x18,puVar2[1]);
  lVar19 = *param_5;
  uVar20 = (ulong)*(ushort *)(lVar19 + 0x12e);
  if (uVar20 != 0) {
    piVar21 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
    do {
      if (*(long *)(piVar21 + -2) == *(long *)puVar1) {
        puVar2 = (undefined8 *)(lVar19 + (long)*piVar21 * 0x10 + 0x138);
        goto code_r0x047e1bf4;
      }
      uVar20 = uVar20 - 1;
      piVar21 = piVar21 + 4;
    } while (uVar20 != 0);
  }
  puVar2 = (undefined8 *)func_0x041cb4c4(param_5,*(long *)puVar1,0);
code_r0x047e1bf4:
  plVar13 = (long *)(*(code *)*puVar2)(param_5,0xb,puVar2[1]);
  lVar19 = *param_5;
  uVar20 = (ulong)*(ushort *)(lVar19 + 0x12e);
  if (uVar20 != 0) {
    piVar21 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
    do {
      if (*(long *)(piVar21 + -2) == *(long *)puVar1) {
        puVar2 = (undefined8 *)(lVar19 + (long)*piVar21 * 0x10 + 0x138);
        goto code_r0x047e1c54;
      }
      uVar20 = uVar20 - 1;
      piVar21 = piVar21 + 4;
    } while (uVar20 != 0);
  }
  puVar2 = (undefined8 *)func_0x041cb4c4(param_5,*(long *)puVar1,0);
code_r0x047e1c54:
  plVar14 = (long *)(*(code *)*puVar2)(param_5,0xc,puVar2[1]);
  lVar19 = *param_5;
  uVar20 = (ulong)*(ushort *)(lVar19 + 0x12e);
  if (uVar20 != 0) {
    piVar21 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
    do {
      if (*(long *)(piVar21 + -2) == *(long *)puVar1) {
        puVar2 = (undefined8 *)(lVar19 + (long)*piVar21 * 0x10 + 0x138);
        goto code_r0x047e1cb4;
      }
      uVar20 = uVar20 - 1;
      piVar21 = piVar21 + 4;
    } while (uVar20 != 0);
  }
  puVar2 = (undefined8 *)func_0x041cb4c4(param_5,*(long *)puVar1,0);
code_r0x047e1cb4:
  plVar15 = (long *)(*(code *)*puVar2)(param_5,0xd,puVar2[1]);
  lVar19 = *param_5;
  uVar20 = (ulong)*(ushort *)(lVar19 + 0x12e);
  if (uVar20 != 0) {
    piVar21 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
    do {
      if (*(long *)(piVar21 + -2) == *(long *)puVar1) {
        puVar2 = (undefined8 *)(lVar19 + (long)*piVar21 * 0x10 + 0x138);
        goto code_r0x047e1d14;
      }
      uVar20 = uVar20 - 1;
      piVar21 = piVar21 + 4;
    } while (uVar20 != 0);
  }
  puVar2 = (undefined8 *)func_0x041cb4c4(param_5,*(long *)puVar1,0);
code_r0x047e1d14:
  plVar16 = (long *)(*(code *)*puVar2)(param_5,0xe,puVar2[1]);
  lVar19 = *param_5;
  uVar20 = (ulong)*(ushort *)(lVar19 + 0x12e);
  if (uVar20 != 0) {
    piVar21 = (int *)(*(long *)(lVar19 + 0xb0) + 8);
    do {
      if (*(long *)(piVar21 + -2) == *(long *)puVar1) {
        puVar2 = (undefined8 *)(lVar19 + (long)*piVar21 * 0x10 + 0x138);
        goto code_r0x047e1d74;
      }
      uVar20 = uVar20 - 1;
      piVar21 = piVar21 + 4;
    } while (uVar20 != 0);
  }
  puVar2 = (undefined8 *)func_0x041cb4c4(param_5,*(long *)puVar1,0);
code_r0x047e1d74:
  plVar17 = (long *)(*(code *)*puVar2)(param_5,0xf,puVar2[1]);
  if (plVar3 == (long *)0x0) {
    plVar3 = (long *)0x0;
  }
  else if (*plVar3 != *(long *)PTR_WithNetwork_AttackValue_TypeInfo_09eceb98) {
    plVar3 = (long *)0x0;
  }
  if (plVar4 == (long *)0x0) {
    plVar4 = (long *)0x0;
  }
  else if (*plVar4 != *(long *)PTR_WithNetwork_HpValue_TypeInfo_09eceba0) {
    plVar4 = (long *)0x0;
  }
  if (plVar5 == (long *)0x0) {
    plVar5 = (long *)0x0;
  }
  else if (*plVar5 != *(long *)PTR_DAT_09ecebd8) {
    plVar5 = (long *)0x0;
  }
  if (plVar6 == (long *)0x0) {
    plVar6 = (long *)0x0;
  }
  else if (*plVar6 != *(long *)PTR_WithNetwork_CriticalDamageValue_TypeInfo_09ecebb8) {
    plVar6 = (long *)0x0;
  }
  if (plVar7 == (long *)0x0) {
    plVar7 = (long *)0x0;
  }
  else if (*plVar7 != *(long *)PTR_WithNetwork_CriticalRateValue_TypeInfo_09ecebc8) {
    plVar7 = (long *)0x0;
  }
  if (plVar8 == (long *)0x0) {
    plVar8 = (long *)0x0;
  }
  else if (*plVar8 != *(long *)PTR_DAT_09ecebf0) {
    plVar8 = (long *)0x0;
  }
  if (plVar9 == (long *)0x0) {
    plVar9 = (long *)0x0;
  }
  else if (*plVar9 != *(long *)PTR_DAT_09ecebf0) {
    plVar9 = (long *)0x0;
  }
  if (plVar10 == (long *)0x0) {
    plVar10 = (long *)0x0;
  }
  else if (*plVar10 != *(long *)PTR_DAT_09ecebe8) {
    plVar10 = (long *)0x0;
  }
  if (plVar11 == (long *)0x0) {
    plVar11 = (long *)0x0;
  }
  else if (*plVar11 != *(long *)PTR_DAT_09ecebf8) {
    plVar11 = (long *)0x0;
  }
  if (plVar12 == (long *)0x0) {
    plVar12 = (long *)0x0;
  }
  else if (*plVar12 != *(long *)PTR_DAT_09ecec08) {
    plVar12 = (long *)0x0;
  }
  if (plVar13 == (long *)0x0) {
    plVar13 = (long *)0x0;
  }
  else if (*plVar13 != *(long *)PTR_DAT_09ecebb0) {
    plVar13 = (long *)0x0;
  }
  if (plVar14 == (long *)0x0) {
    plVar14 = (long *)0x0;
  }
  else if (*plVar14 != *(long *)PTR_DAT_09ecebe0) {
    plVar14 = (long *)0x0;
  }
  if (plVar15 == (long *)0x0) {
    plVar15 = (long *)0x0;
  }
  else if (*plVar15 != *(long *)PTR_DAT_09eceba8) {
    plVar15 = (long *)0x0;
  }
  if (plVar16 == (long *)0x0) {
    plVar16 = (long *)0x0;
  }
  else if (*plVar16 != *(long *)PTR_DAT_09ecebd0) {
    plVar16 = (long *)0x0;
  }
  if (plVar17 == (long *)0x0) {
    plVar17 = (long *)0x0;
  }
  else if (*plVar17 != *(long *)PTR_DAT_09ecebc0) {
    plVar17 = (long *)0x0;
  }
  uVar18 = func_0x047eb568(param_4,plVar3,plVar4,plVar5,plVar6,plVar7,plVar8,plVar9,plVar10,plVar11,
                           plVar12,plVar13,plVar14,plVar15,plVar16,plVar17,0,0);
  *(undefined4 *)(param_4 + 0xb8) = param_1;
  *(undefined4 *)(param_4 + 0xbc) = param_2;
  *(undefined4 *)(param_4 + 0xc0) = param_3;
  return uVar18;
}


```

## UnitStatusBase.Damage (off 0x46e63ec)

```c

/* WARNING: Possible PIC construction at 0x047ea470: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x047ea474) */
/* WARNING: Removing unreachable block (ram,0x047ea484) */
/* WARNING: Removing unreachable block (ram,0x047ea49c) */
/* WARNING: Removing unreachable block (ram,0x047ea4a4) */
/* WARNING: Removing unreachable block (ram,0x047ea4cc) */
/* WARNING: Removing unreachable block (ram,0x047ea4b0) */
/* WARNING: Removing unreachable block (ram,0x047ea4bc) */
/* WARNING: Removing unreachable block (ram,0x047ea4dc) */
/* WARNING: Removing unreachable block (ram,0x047ea4ec) */
/* WARNING: Removing unreachable block (ram,0x047ea510) */
/* WARNING: Removing unreachable block (ram,0x047ea518) */
/* WARNING: Removing unreachable block (ram,0x047ea540) */
/* WARNING: Removing unreachable block (ram,0x047ea524) */
/* WARNING: Removing unreachable block (ram,0x047ea530) */
/* WARNING: Removing unreachable block (ram,0x047ea550) */

void Game_Application_InGameHunt_UnitStatusBase__Damage
               (long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  char cVar2;
  undefined *puVar3;
  byte bVar4;
  int iVar5;
  long lVar6;
  long *plVar7;
  undefined8 *puVar8;
  ulong uVar9;
  undefined8 uVar10;
  uint uVar11;
  int *piVar12;
  long *plVar13;
  long *plVar14;
  float extraout_s0;
  float fVar15;
  float fVar16;
  undefined8 uVar17;
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  lVar6 = *(long *)(param_1 + 0x20);
  if (lVar6 != 0) {
    if ((bRam000000000a469ebd & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88,param_2,param_3,0);
      bRam000000000a469ebd = 1;
    }
    uVar17 = *(undefined8 *)(lVar6 + 0x50);
    uVar10 = *(undefined8 *)(lVar6 + 0x58);
    if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
      func_0x04151a94();
    }
    auVar19 = func_0x09774360(uVar17,uVar10,param_2,param_3,0);
    *(undefined1 (*) [16])(lVar6 + 0x50) = auVar19;
    return;
  }
  auVar19 = func_0x04151bb8();
  uVar10 = auVar19._8_8_;
  uVar17 = param_3;
  if ((bRam000000000a45166e & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece810);
    func_0x0415191c(PTR_DAT_09ecdd20);
    bRam000000000a45166e = 1;
  }
  lVar6 = *(long *)(auVar19._0_8_ + 0x80);
  if ((lVar6 == 0) || (lVar6 = *(long *)(lVar6 + 0x20), lVar6 == 0)) {
    auVar19 = func_0x04151bb8();
    uVar10 = auVar19._8_8_;
    lVar6 = *(long *)(auVar19._0_8_ + 0x20);
    param_3 = uVar17;
    if (lVar6 == 0) {
      plVar7 = (long *)func_0x04151bb8();
      uVar11 = (uint)uVar17;
      if ((bRam000000000a45166f & 1) == 0) {
        func_0x0415191c(PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0);
        func_0x0415191c(PTR_DAT_09ece810);
        func_0x0415191c(PTR_DAT_09ecdd20);
        bRam000000000a45166f = 1;
      }
      if (((char)plVar7[0xf] == '\0') ||
         (iVar5 = (**(code **)(*plVar7 + 0x358))(plVar7,*(undefined8 *)(*plVar7 + 0x360)),
         iVar5 != 1)) {
        return;
      }
      if ((plVar7[0x10] != 0) && (lVar6 = *(long *)(plVar7[0x10] + 0x20), lVar6 != 0)) {
        uVar9 = func_0x092699d4(lVar6,0);
        if ((uVar9 & 1) == 0) {
          return;
        }
        if (*(char *)((long)plVar7 + 0x94) != '\0') {
          return;
        }
        fVar15 = *(float *)(plVar7 + 10);
        plVar13 = (long *)plVar7[3];
        *(float *)(plVar7 + 10) = fVar15 + extraout_s0;
        if (plVar13 != (long *)0x0) {
          lVar6 = *plVar13;
          uVar9 = (ulong)*(ushort *)(lVar6 + 0x12e);
          if (uVar9 != 0) {
            piVar12 = (int *)(*(long *)(lVar6 + 0xb0) + 8);
            do {
              if (*(long *)(piVar12 + -2) == *(long *)PTR_DAT_09ecdd20) {
                puVar8 = (undefined8 *)(lVar6 + (long)(*piVar12 + 7) * 0x10 + 0x138);
                goto code_r0x047ea6bc;
              }
              uVar9 = uVar9 - 1;
              piVar12 = piVar12 + 4;
            } while (uVar9 != 0);
          }
          uVar11 = 7;
          puVar8 = (undefined8 *)func_0x041cb4c4(plVar13,*(long *)PTR_DAT_09ecdd20,7);
code_r0x047ea6bc:
          fVar16 = (float)(*(code *)*puVar8)(plVar13,puVar8[1]);
          if (fVar15 + extraout_s0 < fVar16) {
            return;
          }
          if ((plVar7[0x10] != 0) &&
             (plVar13 = *(long **)(plVar7[0x10] + 0x28), plVar13 != (long *)0x0)) {
            auVar19 = (**(code **)(*plVar13 + 0x1a8))(plVar13,*(undefined8 *)(*plVar13 + 0x1b0));
            if (*(int *)(*(long *)PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0 +
                        0xe0) == 0) {
              func_0x04151a94();
            }
            uVar11 = 0;
            auVar19 = Game_Application_InGameHunt_HuntCalculator__CalculateHpRecover
                                (auVar19._0_8_,auVar19._8_8_,0);
            plVar13 = (long *)plVar7[2];
            if (plVar13 != (long *)0x0) {
              lVar6 = *plVar13;
              uVar9 = (ulong)*(ushort *)(lVar6 + 0x12e);
              if (uVar9 != 0) {
                piVar12 = (int *)(*(long *)(lVar6 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar12 + -2) == *(long *)PTR_DAT_09ece810) {
                    puVar8 = (undefined8 *)(lVar6 + (long)(*piVar12 + 8) * 0x10 + 0x138);
                    goto code_r0x047ea784;
                  }
                  uVar9 = uVar9 - 1;
                  piVar12 = piVar12 + 4;
                } while (uVar9 != 0);
              }
              puVar8 = (undefined8 *)func_0x041cb4c4(plVar13,*(long *)PTR_DAT_09ece810,8);
code_r0x047ea784:
              (*(code *)*puVar8)(plVar13,auVar19._0_8_,auVar19._8_8_,plVar7,puVar8[1]);
              *(undefined4 *)(plVar7 + 10) = 0;
              return;
            }
          }
        }
      }
      auVar19 = func_0x04151bb8();
      plVar7 = auVar19._0_8_;
      if ((bRam000000000a451670 & 1) == 0) {
        func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
        func_0x0415191c(PTR_DAT_09ece810);
        func_0x0415191c(PTR_DAT_09ecdd20);
        bRam000000000a451670 = 1;
      }
      puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
      if ((plVar7[0x10] != 0) && (plVar13 = *(long **)(plVar7[0x10] + 0x20), plVar13 != (long *)0x0)
         ) {
        cVar2 = *(char *)((long)plVar7 + 0x94);
        auVar20 = (**(code **)(*plVar13 + 0x1a8))(plVar13,*(undefined8 *)(*plVar13 + 0x1b0));
        if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
          func_0x04151a94();
        }
        auVar18 = func_0x09774ab0(0,0);
        bVar4 = func_0x09775000(auVar20._0_8_,auVar20._8_8_,auVar18._0_8_,auVar18._8_8_,0);
        *(byte *)((long)plVar7 + 0x94) = bVar4 & 1;
        if ((cVar2 != '\0') || ((bVar4 & 1) == 0)) {
          return;
        }
        plVar13 = (long *)plVar7[3];
        if (plVar13 != (long *)0x0) {
          lVar6 = *plVar13;
          plVar14 = (long *)plVar7[2];
          uVar9 = (ulong)*(ushort *)(lVar6 + 0x12e);
          if (uVar9 != 0) {
            piVar12 = (int *)(*(long *)(lVar6 + 0xb0) + 8);
            do {
              if (*(long *)(piVar12 + -2) == *(long *)PTR_DAT_09ecdd20) {
                puVar8 = (undefined8 *)(lVar6 + (long)(*piVar12 + 0xb) * 0x10 + 0x138);
                goto code_r0x047ea900;
              }
              uVar9 = uVar9 - 1;
              piVar12 = piVar12 + 4;
            } while (uVar9 != 0);
          }
          puVar8 = (undefined8 *)func_0x041cb4c4(plVar13,*(long *)PTR_DAT_09ecdd20,0xb);
code_r0x047ea900:
          uVar17 = (*(code *)*puVar8)(plVar13,puVar8[1]);
          if (plVar14 != (long *)0x0) {
            lVar6 = *plVar14;
            uVar9 = (ulong)*(ushort *)(lVar6 + 0x12e);
            if (uVar9 != 0) {
              piVar12 = (int *)(*(long *)(lVar6 + 0xb0) + 8);
              do {
                if (*(long *)(piVar12 + -2) == *(long *)PTR_DAT_09ece810) {
                  puVar8 = (undefined8 *)(lVar6 + (long)(*piVar12 + 0x10) * 0x10 + 0x138);
                  goto code_r0x047ea96c;
                }
                uVar9 = uVar9 - 1;
                piVar12 = piVar12 + 4;
              } while (uVar9 != 0);
            }
            puVar8 = (undefined8 *)func_0x041cb4c4(plVar14,*(long *)PTR_DAT_09ece810,0x10);
code_r0x047ea96c:
            (*(code *)*puVar8)(uVar17,plVar14,plVar7,auVar19._8_8_ & 0xffffffff,uVar11 & 1,puVar8[1]
                              );
                    /* WARNING: Could not recover jumptable at 0x047ea9ac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (**(code **)(*plVar7 + 0x368))(plVar7,*(undefined8 *)(*plVar7 + 0x370));
            return;
          }
        }
      }
      func_0x04151bb8();
      return;
    }
  }
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a469ebe & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469ebe = 1;
  }
  uVar17 = *(undefined8 *)(lVar6 + 0x50);
  uVar1 = *(undefined8 *)(lVar6 + 0x58);
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar19 = func_0x09774dd8(uVar17,uVar1,uVar10,param_3,0);
  *(undefined1 (*) [16])(lVar6 + 0x50) = auVar19;
  auVar20 = func_0x09774ab0(0,0);
  uVar9 = func_0x09774f7c(auVar19._0_8_,auVar19._8_8_,auVar20._0_8_,auVar20._8_8_,0);
  if ((uVar9 & 1) != 0) {
    if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
      func_0x04151a94();
    }
    auVar19 = func_0x09774ab0(0,0);
    *(undefined1 (*) [16])(lVar6 + 0x50) = auVar19;
  }
  return;
}


```

## IdleRewardUtility.CalculateIdleGoldAmountPerMinute (off 0x4760168)

```c

/* WARNING: Possible PIC construction at 0x04864334: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x04864338) */
/* WARNING: Removing unreachable block (ram,0x04864344) */
/* WARNING: Removing unreachable block (ram,0x04864348) */
/* WARNING: Removing unreachable block (ram,0x04864354) */
/* WARNING: Removing unreachable block (ram,0x0486436c) */
/* WARNING: Removing unreachable block (ram,0x04864390) */
/* WARNING: Removing unreachable block (ram,0x04864398) */
/* WARNING: Removing unreachable block (ram,0x048643c0) */
/* WARNING: Removing unreachable block (ram,0x048643a4) */
/* WARNING: Removing unreachable block (ram,0x048643b0) */
/* WARNING: Removing unreachable block (ram,0x048643d0) */
/* WARNING: Removing unreachable block (ram,0x048643f0) */
/* WARNING: Removing unreachable block (ram,0x0486440c) */
/* WARNING: Removing unreachable block (ram,0x04864414) */
/* WARNING: Removing unreachable block (ram,0x0486443c) */
/* WARNING: Removing unreachable block (ram,0x04864420) */
/* WARNING: Removing unreachable block (ram,0x0486442c) */
/* WARNING: Removing unreachable block (ram,0x0486444c) */
/* WARNING: Removing unreachable block (ram,0x0486445c) */
/* WARNING: Removing unreachable block (ram,0x04864484) */
/* WARNING: Removing unreachable block (ram,0x048644b0) */
/* WARNING: Removing unreachable block (ram,0x048644b8) */
/* WARNING: Removing unreachable block (ram,0x048644e0) */
/* WARNING: Removing unreachable block (ram,0x048644c4) */
/* WARNING: Removing unreachable block (ram,0x048644d0) */
/* WARNING: Removing unreachable block (ram,0x048644f0) */
/* WARNING: Removing unreachable block (ram,0x04864538) */
/* WARNING: Removing unreachable block (ram,0x04864540) */
/* WARNING: Removing unreachable block (ram,0x048645a0) */
/* WARNING: Removing unreachable block (ram,0x048645ac) */
/* WARNING: Removing unreachable block (ram,0x048645b4) */
/* WARNING: Removing unreachable block (ram,0x0486462c) */
/* WARNING: Removing unreachable block (ram,0x04864708) */
/* WARNING: Removing unreachable block (ram,0x04864724) */
/* WARNING: Removing unreachable block (ram,0x0486472c) */
/* WARNING: Removing unreachable block (ram,0x04864754) */
/* WARNING: Removing unreachable block (ram,0x04864738) */
/* WARNING: Removing unreachable block (ram,0x04864744) */
/* WARNING: Removing unreachable block (ram,0x04864760) */
/* WARNING: Removing unreachable block (ram,0x04864780) */
/* WARNING: Removing unreachable block (ram,0x04864788) */
/* WARNING: Removing unreachable block (ram,0x048647b0) */
/* WARNING: Removing unreachable block (ram,0x04864794) */
/* WARNING: Removing unreachable block (ram,0x048647a0) */
/* WARNING: Removing unreachable block (ram,0x048647c0) */
/* WARNING: Removing unreachable block (ram,0x048647e0) */
/* WARNING: Removing unreachable block (ram,0x048647ec) */
/* WARNING: Removing unreachable block (ram,0x04864804) */
/* WARNING: Removing unreachable block (ram,0x04864818) */
/* WARNING: Removing unreachable block (ram,0x04864830) */
/* WARNING: Removing unreachable block (ram,0x04864844) */
/* WARNING: Removing unreachable block (ram,0x04864860) */
/* WARNING: Removing unreachable block (ram,0x04864868) */
/* WARNING: Removing unreachable block (ram,0x04864890) */
/* WARNING: Removing unreachable block (ram,0x04864874) */
/* WARNING: Removing unreachable block (ram,0x04864880) */
/* WARNING: Removing unreachable block (ram,0x048648a0) */
/* WARNING: Removing unreachable block (ram,0x048648b0) */
/* WARNING: Removing unreachable block (ram,0x048648cc) */
/* WARNING: Removing unreachable block (ram,0x048648d4) */
/* WARNING: Removing unreachable block (ram,0x048648fc) */
/* WARNING: Removing unreachable block (ram,0x048648e0) */
/* WARNING: Removing unreachable block (ram,0x048648ec) */
/* WARNING: Removing unreachable block (ram,0x04864908) */
/* WARNING: Removing unreachable block (ram,0x048649d8) */
/* WARNING: Removing unreachable block (ram,0x048649dc) */
/* WARNING: Removing unreachable block (ram,0x0486491c) */
/* WARNING: Removing unreachable block (ram,0x04864940) */
/* WARNING: Removing unreachable block (ram,0x04864948) */
/* WARNING: Removing unreachable block (ram,0x04864970) */
/* WARNING: Removing unreachable block (ram,0x04864954) */
/* WARNING: Removing unreachable block (ram,0x04864960) */
/* WARNING: Removing unreachable block (ram,0x04864980) */
/* WARNING: Removing unreachable block (ram,0x048649a0) */
/* WARNING: Removing unreachable block (ram,0x048649a4) */
/* WARNING: Removing unreachable block (ram,0x097744cc) */
/* WARNING: Removing unreachable block (ram,0x09774504) */
/* WARNING: Removing unreachable block (ram,0x09774518) */
/* WARNING: Removing unreachable block (ram,0x09774550) */
/* WARNING: Removing unreachable block (ram,0x09774538) */
/* WARNING: Removing unreachable block (ram,0x09774558) */
/* WARNING: Removing unreachable block (ram,0x09774594) */
/* WARNING: Removing unreachable block (ram,0x0977459c) */
/* WARNING: Removing unreachable block (ram,0x0977453c) */
/* WARNING: Removing unreachable block (ram,0x097745ac) */

void Game_Application_IdleReward_IdleRewardUtility__CalculateIdleGoldAmountPerMinute(void)

{
  undefined *puVar1;
  
  puVar1 = 
  PTR_Game_Application_IdleReward_IdleRewardUtility__u003C_u003Ec__DisplayClass0_0_TypeInfo_09ed0cc0
  ;
  if ((bRam000000000a451a0e & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09ed0cc8);
    func_0x0415191c(PTR_DAT_09ed0cd0);
    func_0x0415191c(PTR_DAT_09ed0cd8);
    func_0x0415191c(
                   PTR_Method_System_Linq_Enumerable_Select_u003CHuntAreaStageRelationRecord__BigDecimal_u003E___09ed0ce0
                   );
    func_0x0415191c(PTR_Method_System_Linq_Enumerable_ToArray_u003CBigDecimal_u003E___09ed0ce8);
    func_0x0415191c(PTR_DAT_09eb6d18);
    func_0x0415191c(PTR_DAT_09eac550);
    func_0x0415191c(PTR_DAT_09ed0cf0);
    func_0x0415191c(
                   PTR_System_Func_u003CHuntAreaStageRelationRecord__BigDecimal_u003E_TypeInfo_09ed0cf8
                   );
    func_0x0415191c(PTR_DAT_09ed0d00);
    func_0x0415191c(PTR_DAT_09ed0d08);
    func_0x0415191c(PTR_DAT_09eb8200);
    func_0x0415191c(PTR_DAT_09eb7d50);
    func_0x0415191c(PTR_DAT_09ecd1a0);
    func_0x0415191c(PTR_WithNetwork_IStatusValue_TypeInfo_09ecd1a8);
    func_0x0415191c(PTR_DAT_09ed0d10);
    func_0x0415191c(PTR_DAT_09ed0d18);
    func_0x0415191c(PTR_DAT_09ed0d20);
    func_0x0415191c(PTR_DAT_09ed0d28);
    func_0x0415191c(PTR_DAT_09eb8260);
    func_0x0415191c(PTR_DAT_09ed0d30);
    func_0x0415191c(PTR_DAT_09ed0d38);
    func_0x0415191c(PTR_DAT_09eb7d68);
    func_0x0415191c(PTR_DAT_09ecb6f0);
    func_0x0415191c(
                   PTR_Method_Game_Application_IdleReward_IdleRewardUtility__u003C_u003Ec__u003CCalculateIdleGoldAmountPerMinute_u003Eb__0_0___09ed0d40
                   );
    func_0x0415191c(
                   PTR_Method_Game_Application_IdleReward_IdleRewardUtility__u003C_u003Ec__DisplayClass0_0__u003CCalculateIdleGoldAmountPerMinute_u003Eb__1___09ed0d48
                   );
    func_0x0415191c(
                   PTR_Method_Game_Application_IdleReward_IdleRewardUtility__u003C_u003Ec__DisplayClass0_0__u003CCalculateIdleGoldAmountPerMinute_u003Eb__2___09ed0d50
                   );
    func_0x0415191c(
                   PTR_Method_Game_Application_IdleReward_IdleRewardUtility__u003C_u003Ec__DisplayClass0_0__u003CCalculateIdleGoldAmountPerMinute_u003Eb__3___09ed0d58
                   );
    func_0x0415191c(
                   PTR_Game_Application_IdleReward_IdleRewardUtility__u003C_u003Ec__DisplayClass0_0_TypeInfo_09ed0cc0
                   );
    func_0x0415191c(
                   PTR_Game_Application_IdleReward_IdleRewardUtility__u003C_u003Ec_TypeInfo_09ed0d60
                   );
    bRam000000000a451a0e = 1;
  }
  func_0x04151ba8(*(undefined8 *)puVar1);
  return;
}


```

## IdleRewardDataStore.CalculateIdleMinutes (off 0x9178364)

```c

void FUN_0927c364(void)

{
  undefined *puVar1;
  long lVar2;
  ulong uVar3;
  long unaff_x19;
  int iVar4;
  long unaff_x20;
  
  func_0x0415191c();
  func_0x0415191c(PTR_DAT_09f4bb00);
  *(undefined1 *)(unaff_x20 + 0xfa1) = 1;
  lVar2 = *(long *)(unaff_x19 + 0x38);
  *(undefined1 *)(unaff_x19 + 0xb5) = 0;
  puVar1 = PTR_DAT_09f4bb00;
  if (lVar2 != 0) {
    iVar4 = 0;
    do {
      if (*(int *)(lVar2 + 0x18) <= iVar4) {
        return;
      }
      lVar2 = func_0x06cc43b0(lVar2,iVar4,*(undefined8 *)puVar1);
      if (lVar2 == 0) break;
      func_0x0927effc();
      uVar3 = func_0x0927af78();
      if ((uVar3 & 1) != 0) goto code_r0x0927c3d8;
      lVar2 = *(long *)(unaff_x19 + 0x38);
      iVar4 = iVar4 + 1;
    } while (lVar2 != 0);
  }
  func_0x04151bb8();
code_r0x0927c3d8:
  *(undefined1 *)(unaff_x19 + 0xb5) = 1;
  return;
}


```

## HuntCalculator.GetMoveDistance (off 0x46c6e64)

```c

float Game_Application_InGameHunt_HuntCalculator__GetMoveDistance(float param_1,int param_2)

{
  if (param_2 != 1) {
    param_1 = -param_1;
  }
  return param_1;
}


```

## HuntCalculator.CalculateRecastRate (off 0x46c6bdc)

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

## HuntCalculator.IsDead (off 0x46c6e74)

```c

/* WARNING: Possible PIC construction at 0x05aae7d4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x05aae8c0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x05aaeb08: Changing call to branch */
/* WARNING: Possible PIC construction at 0x05aae8e8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x05aae8c4) */
/* WARNING: Removing unreachable block (ram,0x05aae8d8) */
/* WARNING: Removing unreachable block (ram,0x05aae7d8) */
/* WARNING: Removing unreachable block (ram,0x05aae8dc) */
/* WARNING: Removing unreachable block (ram,0x05aae7dc) */
/* WARNING: Removing unreachable block (ram,0x05aae810) */
/* WARNING: Removing unreachable block (ram,0x05aae814) */
/* WARNING: Removing unreachable block (ram,0x05aae824) */
/* WARNING: Removing unreachable block (ram,0x05aae858) */
/* WARNING: Removing unreachable block (ram,0x05aae864) */
/* WARNING: Removing unreachable block (ram,0x05aae868) */
/* WARNING: Removing unreachable block (ram,0x05aae878) */
/* WARNING: Removing unreachable block (ram,0x05aae8ec) */
/* WARNING: Removing unreachable block (ram,0x05aae8fc) */
/* WARNING: Removing unreachable block (ram,0x05aae900) */
/* WARNING: Removing unreachable block (ram,0x05aae90c) */
/* WARNING: Removing unreachable block (ram,0x05aae888) */
/* WARNING: Removing unreachable block (ram,0x05aae890) */
/* WARNING: Removing unreachable block (ram,0x05aae93c) */
/* WARNING: Removing unreachable block (ram,0x05aae89c) */
/* WARNING: Removing unreachable block (ram,0x05aaeb0c) */
/* WARNING: Removing unreachable block (ram,0x05aae56c) */
/* WARNING: Removing unreachable block (ram,0x05aae578) */
/* WARNING: Removing unreachable block (ram,0x05aae594) */

long * Game_Application_InGameHunt_HuntCalculator__IsDead(long *param_1)

{
  ulong *puVar1;
  uint uVar2;
  undefined4 uVar3;
  char cVar4;
  bool bVar5;
  undefined *puVar6;
  undefined **ppuVar7;
  uint uVar8;
  int iVar9;
  ulong uVar10;
  long lVar11;
  undefined8 *puVar12;
  ulong uVar13;
  long *plVar14;
  uint *puVar15;
  long *plVar16;
  long lVar17;
  uint *puVar18;
  uint *puVar19;
  long lVar20;
  uint uVar21;
  long lVar22;
  undefined8 uVar23;
  long lVar24;
  ulong uVar25;
  int *piVar26;
  uint uVar27;
  long *unaff_x22;
  long *unaff_x23;
  long *plVar28;
  uint *unaff_x24;
  uint *unaff_x25;
  uint *unaff_x26;
  undefined *unaff_x27;
  uint *unaff_x28;
  ulong unaff_x29;
  undefined *puVar29;
  undefined1 auVar30 [16];
  undefined1 auVar31 [12];
  undefined *puStack_40;
  undefined1 auStack_30 [16];
  
  if ((bRam000000000a451596 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a451596 = 1;
  }
  puVar29 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if (param_1 != (long *)0x0) {
    auVar30 = (**(code **)(*param_1 + 0x1a8))(param_1,*(undefined8 *)(*param_1 + 0x1b0));
    if (*(int *)(*(long *)puVar29 + 0xe0) == 0) {
      func_0x04151a94();
    }
    puStack_40 = (undefined *)func_0x09774ab0(0,0);
    puVar29 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    auStack_30 = auVar30;
    if ((bRam000000000a46d93e & 1) == 0) {
      func_0x0415191c(
                     PTR_Method_Applibot_Math_BigDecimal_CompareWithoutBoxing_u003CBigDecimal_u003E___09f793a0
                     );
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
      bRam000000000a46d93e = 1;
    }
    puVar6 = 
    PTR_Method_Applibot_Math_BigDecimal_CompareWithoutBoxing_u003CBigDecimal_u003E___09f793a0;
    if (*(int *)(*(long *)puVar29 + 0xe0) == 0) {
      func_0x04151a94();
    }
    iVar9 = func_0x05358b10(auStack_30,&puStack_40,*(undefined8 *)puVar6);
    return (long *)(ulong)(iVar9 < 1);
  }
  uVar10 = func_0x04151bb8();
  puVar19 = (uint *)PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0;
  puStack_40 = &Game_Application_InGameHunt_HuntCalculator__IsDebuffSkill;
  auStack_30._0_8_ = 0xa451000;
  uVar10 = uVar10 & 0xffffffff;
  auStack_30._8_8_ = param_1;
  if ((bRam000000000a451597 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece6f0);
    func_0x0415191c(PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0);
    bRam000000000a451597 = 1;
  }
  lVar11 = *(long *)puVar19;
  if (*(int *)(lVar11 + 0xe0) == 0) {
    func_0x04151a94();
    lVar11 = *(long *)puVar19;
  }
  if (**(long **)(lVar11 + 0xb8) != 0) {
    auStack_30._0_8_ = puStack_40;
    uVar8 = func_0x05aadde4(**(long **)(lVar11 + 0xb8),uVar10,
                            *(undefined8 *)
                             (*(long *)(*(long *)(*(long *)PTR_DAT_09ece6f0 + 0x20) + 0xc0) + 0xf0))
    ;
    return (long *)(ulong)(~uVar8 >> 0x1f);
  }
  auVar30 = func_0x04151bb8();
  puVar29 = PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0;
  puVar18 = auVar30._8_8_;
  if ((bRam000000000a451598 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece6f8);
    func_0x0415191c(PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0);
    bRam000000000a451598 = 1;
  }
  lVar11 = *(long *)puVar29;
  if (*(int *)(lVar11 + 0xe0) == 0) {
    func_0x04151a94();
    lVar11 = *(long *)puVar29;
  }
  auVar30._8_8_ = auVar30._0_8_ & 0xffffffff;
  auVar30._0_8_ = **(long **)(lVar11 + 0xb8);
  if (**(long **)(lVar11 + 0xb8) == 0) {
    plVar28 = (long *)func_0x04151bb8();
    return plVar28;
  }
  lVar20 = *(long *)PTR_DAT_09ece6f8;
  lVar11 = 0xa451000;
  puVar29 = &Game_Application_InGameHunt_HuntCalculator__TryGetDebuffEffectType;
  ppuVar7 = &puStack_40;
  do {
    lVar17 = auVar30._0_8_;
    *(undefined **)((long)ppuVar7 + -0x20) = puVar29;
    *(uint **)((long)ppuVar7 + -0x10) = puVar19;
    *(ulong *)((long)ppuVar7 + -8) = uVar10;
    puVar19 = *(uint **)(*(long *)(*(long *)(lVar20 + 0x20) + 0xc0) + 0xf0);
    uVar8 = func_0x05aadde4(lVar17,auVar30._8_8_);
    if ((int)uVar8 < 0) {
      *puVar18 = 0;
code_r0x05aaf148:
      return (long *)(ulong)(~uVar8 >> 0x1f);
    }
    lVar24 = *(long *)(lVar17 + 0x18);
    if (lVar24 == 0) {
      func_0x04151bb8();
    }
    else if (uVar8 < *(uint *)(lVar24 + 0x18)) {
      *puVar18 = *(uint *)(lVar24 + (ulong)uVar8 * 0x10 + 0x2c);
      goto code_r0x05aaf148;
    }
    auVar31 = func_0x04151bc0();
    lVar24 = auVar31._0_8_;
    lVar20 = *(long *)(*(long *)(*(long *)(lVar20 + 0x20) + 0xc0) + 0xf8);
    *(ulong *)((long)ppuVar7 + -0x80) = unaff_x29;
    *(undefined **)((long)ppuVar7 + -0x78) = &UNK_05aaf164;
    *(uint **)((long)ppuVar7 + -0x70) = unaff_x28;
    *(undefined **)((long)ppuVar7 + -0x68) = unaff_x27;
    *(uint **)((long)ppuVar7 + -0x60) = unaff_x26;
    *(uint **)((long)ppuVar7 + -0x58) = unaff_x25;
    *(uint **)((long)ppuVar7 + -0x50) = unaff_x24;
    *(long **)((long)ppuVar7 + -0x48) = unaff_x23;
    *(long **)((long)ppuVar7 + -0x40) = unaff_x22;
    *(long *)((long)ppuVar7 + -0x38) = lVar11;
    *(long *)((long)ppuVar7 + -0x30) = lVar17;
    *(uint **)((long)ppuVar7 + -0x28) = puVar18;
    *(uint *)((long)ppuVar7 + -0x84) = auVar31._8_4_;
    unaff_x25 = (uint *)0x0;
    uVar10 = (ulong)auVar31._8_4_;
    *(int *)(lVar24 + 0x2c) = *(int *)(lVar24 + 0x2c) + 1;
    puVar18 = puVar19;
    if (*(long *)(lVar24 + 0x10) == 0) {
      puVar18 = *(uint **)(*(long *)(*(long *)(lVar20 + 0x20) + 0xc0) + 0x10);
      func_0x05aae0a8(lVar24,0);
    }
    plVar28 = *(long **)(lVar24 + 0x30);
    lVar11 = *(long *)(lVar24 + 0x18);
    if (plVar28 == (long *)0x0) {
      uVar8 = func_0x085b9e58((undefined1 *)((long)ppuVar7 + -0x84),0);
    }
    else {
      lVar17 = *(long *)(*(long *)(*(long *)(lVar20 + 0x20) + 0xc0) + 8);
      if ((*(byte *)(lVar17 + 0x135) & 1) == 0) {
        lVar17 = func_0x041cb3c0(lVar17);
      }
      lVar22 = *plVar28;
      uVar25 = (ulong)*(ushort *)(lVar22 + 0x12e);
      if (uVar25 != 0) {
        piVar26 = (int *)(*(long *)(lVar22 + 0xb0) + 8);
        do {
          if (*(long *)(piVar26 + -2) == lVar17) {
            puVar12 = (undefined8 *)(lVar22 + (long)(*piVar26 + 1) * 0x10 + 0x138);
            goto code_r0x05aae270;
          }
          uVar25 = uVar25 - 1;
          piVar26 = piVar26 + 4;
        } while (uVar25 != 0);
      }
      puVar12 = (undefined8 *)func_0x041cb4c4(plVar28,lVar17,1);
code_r0x05aae270:
      puVar18 = (uint *)puVar12[1];
      uVar8 = (*(code *)*puVar12)(plVar28,uVar10);
    }
    lVar17 = *(long *)(lVar24 + 0x10);
    if (lVar17 == 0) goto code_r0x05aae5c4;
    uVar27 = *(uint *)(lVar17 + 0x18);
    uVar8 = uVar8 & 0x7fffffff;
    unaff_x27 = (undefined *)(ulong)uVar8;
    iVar9 = 0;
    if (uVar27 != 0) {
      iVar9 = (int)uVar8 / (int)uVar27;
    }
    uVar21 = uVar8 - iVar9 * uVar27;
    if (uVar27 <= uVar21) goto code_r0x05aae5c0;
    unaff_x28 = (uint *)(lVar17 + (ulong)uVar21 * 4 + 0x20);
    uVar27 = *unaff_x28 - 1;
    uVar10 = (ulong)uVar27;
    if (plVar28 == (long *)0x0) {
      if (lVar11 != 0) {
        uVar23 = *(undefined8 *)(lVar11 + 0x18);
        uVar21 = (uint)uVar23;
        if (uVar27 < uVar21) {
          unaff_x22 = (long *)0x0;
          do {
            uVar27 = (uint)uVar23;
            uVar21 = (uint)uVar10;
            plVar28 = (long *)(long)(int)uVar21;
            if (*(uint *)(lVar11 + (long)(int)uVar21 * 0x10 + 0x20) == uVar8) {
              plVar14 = (long *)func_0x0450ee18(*(undefined8 *)
                                                 (*(long *)(*(long *)(lVar20 + 0x20) + 0xc0) + 0x18)
                                               );
              if (*(uint *)(lVar11 + 0x18) <= uVar21) goto code_r0x05aae5c0;
              if (plVar14 == (long *)0x0) goto code_r0x05aae5c4;
              puVar18 = (uint *)(ulong)*(uint *)((long)ppuVar7 + -0x84);
              uVar25 = (**(code **)(*plVar14 + 0x1b8))
                                 (plVar14,*(undefined4 *)(lVar11 + (long)plVar28 * 0x10 + 0x28),
                                  puVar18,*(undefined8 *)(*plVar14 + 0x1c0));
              if ((uVar25 & 1) != 0) {
                return (long *)0x0;
              }
              uVar27 = *(uint *)(lVar11 + 0x18);
            }
            if (uVar27 <= uVar21) goto code_r0x05aae5c0;
            uVar2 = *(uint *)(lVar11 + (long)plVar28 * 0x10 + 0x24);
            uVar10 = (ulong)uVar2;
            if ((int)uVar27 <= (int)unaff_x22) {
              func_0x085dd870(0);
            }
            uVar23 = *(undefined8 *)(lVar11 + 0x18);
            unaff_x22 = (long *)(ulong)((int)unaff_x22 + 1);
            uVar21 = (uint)uVar23;
          } while (uVar2 < uVar21);
        }
code_r0x05aae438:
        if (*(int *)(lVar24 + 0x28) < 1) {
          uVar27 = *(uint *)(lVar24 + 0x20);
          unaff_x22 = (long *)(ulong)uVar27;
          if (uVar27 == uVar21) {
            func_0x05aae960(lVar24,*(undefined8 *)
                                    (*(long *)(*(long *)(lVar20 + 0x20) + 0xc0) + 0x198));
            lVar17 = *(long *)(lVar24 + 0x10);
            *(uint *)(lVar24 + 0x20) = uVar27 + 1;
            if (lVar17 == 0) goto code_r0x05aae5c4;
            uVar21 = *(uint *)(lVar17 + 0x18);
            iVar9 = 0;
            if (uVar21 != 0) {
              iVar9 = (int)uVar8 / (int)uVar21;
            }
            uVar2 = uVar8 - iVar9 * uVar21;
            if (uVar21 <= uVar2) goto code_r0x05aae5c0;
            lVar11 = *(long *)(lVar24 + 0x18);
            unaff_x28 = (uint *)(lVar17 + (ulong)uVar2 * 4 + 0x20);
          }
          else {
            lVar11 = *(long *)(lVar24 + 0x18);
            *(uint *)(lVar24 + 0x20) = uVar27 + 1;
          }
          if (lVar11 == 0) goto code_r0x05aae5c4;
          if (uVar27 < *(uint *)(lVar11 + 0x18)) {
            lVar20 = (long)(int)uVar27;
code_r0x05aae4e4:
            lVar11 = lVar11 + lVar20 * 0x10;
            *(uint *)(lVar11 + 0x20) = uVar8;
            *(uint *)(lVar11 + 0x24) = *unaff_x28 - 1;
            *(undefined4 *)(lVar11 + 0x28) = *(undefined4 *)((long)ppuVar7 + -0x84);
            *(int *)(lVar11 + 0x2c) = (int)puVar19;
            *unaff_x28 = uVar27 + 1;
            return (long *)0x1;
          }
        }
        else {
          *(int *)(lVar24 + 0x28) = *(int *)(lVar24 + 0x28) + -1;
          uVar27 = *(uint *)(lVar24 + 0x24);
          unaff_x22 = (long *)(ulong)uVar27;
          if (uVar27 < *(uint *)(lVar11 + 0x18)) {
            lVar20 = (long)(int)uVar27;
            *(undefined4 *)(lVar24 + 0x24) = *(undefined4 *)(lVar11 + lVar20 * 0x10 + 0x24);
            goto code_r0x05aae4e4;
          }
        }
code_r0x05aae5c0:
        func_0x04151bc0();
      }
    }
    else if (lVar11 != 0) {
      uVar23 = *(undefined8 *)(lVar11 + 0x18);
      uVar21 = (uint)uVar23;
      if (uVar27 < uVar21) {
        unaff_x29 = 0;
        *(undefined4 *)((long)ppuVar7 + -0x90) = 0;
        do {
          uVar27 = (uint)uVar23;
          uVar21 = (uint)uVar10;
          unaff_x22 = (long *)(long)(int)uVar21;
          if (*(uint *)(lVar11 + (long)(int)uVar21 * 0x10 + 0x20) == uVar8) {
            unaff_x25 = (uint *)(ulong)*(uint *)((long)ppuVar7 + -0x84);
            lVar17 = *(long *)(*(long *)(*(long *)(lVar20 + 0x20) + 0xc0) + 8);
            uVar10 = (ulong)*(uint *)(lVar11 + (long)unaff_x22 * 0x10 + 0x28);
            if ((*(byte *)(lVar17 + 0x135) & 1) == 0) {
              lVar17 = func_0x041cb3c0(lVar17);
            }
            lVar22 = *plVar28;
            uVar25 = (ulong)*(ushort *)(lVar22 + 0x12e);
            if (uVar25 != 0) {
              piVar26 = (int *)(*(long *)(lVar22 + 0xb0) + 8);
              do {
                if (*(long *)(piVar26 + -2) == lVar17) {
                  puVar12 = (undefined8 *)(lVar22 + (long)*piVar26 * 0x10 + 0x138);
                  goto code_r0x05aae350;
                }
                uVar25 = uVar25 - 1;
                piVar26 = piVar26 + 4;
              } while (uVar25 != 0);
            }
            puVar12 = (undefined8 *)func_0x041cb4c4(plVar28,lVar17,0);
code_r0x05aae350:
            puVar18 = unaff_x25;
            uVar25 = (*(code *)*puVar12)(plVar28,uVar10,unaff_x25,puVar12[1]);
            if ((uVar25 & 1) != 0) {
              if ((*(uint *)((long)ppuVar7 + -0x90) & 0xff) == 2) {
                *(undefined4 *)((long)ppuVar7 + -0x8c) = *(undefined4 *)((long)ppuVar7 + -0x84);
                uVar23 = func_0x04151a9c(*(undefined8 *)
                                          (*(long *)(*(long *)(lVar20 + 0x20) + 0xc0) + 0x70),
                                         (undefined1 *)((long)ppuVar7 + -0x8c));
                func_0x085dd76c(uVar23,0);
                return (long *)0x0;
              }
              if ((*(uint *)((long)ppuVar7 + -0x90) & 0xff) != 1) {
                return (long *)0x0;
              }
              if (uVar21 < *(uint *)(lVar11 + 0x18)) {
                *(int *)(lVar11 + (long)unaff_x22 * 0x10 + 0x2c) = (int)puVar19;
                return (long *)0x1;
              }
              goto code_r0x05aae5c0;
            }
            uVar27 = *(uint *)(lVar11 + 0x18);
          }
          if (uVar27 <= uVar21) goto code_r0x05aae5c0;
          uVar2 = *(uint *)(lVar11 + (long)unaff_x22 * 0x10 + 0x24);
          uVar10 = (ulong)uVar2;
          if ((int)uVar27 <= (int)unaff_x29) {
            func_0x085dd870(0);
          }
          uVar23 = *(undefined8 *)(lVar11 + 0x18);
          unaff_x29 = (ulong)((int)unaff_x29 + 1);
          uVar21 = (uint)uVar23;
        } while (uVar2 < uVar21);
      }
      goto code_r0x05aae438;
    }
code_r0x05aae5c4:
    lVar17 = func_0x04151bb8();
    unaff_x26 = (uint *)PTR_DAT_09eea9a8;
    *(undefined **)((long)ppuVar7 + -0xe0) = &UNK_05aae5c8;
    *(undefined **)((long)ppuVar7 + -0xd8) = unaff_x27;
    *(long *)((long)ppuVar7 + -0xd0) = lVar11;
    *(uint **)((long)ppuVar7 + -200) = unaff_x25;
    *(ulong *)((long)ppuVar7 + -0xc0) = uVar10;
    *(long **)((long)ppuVar7 + -0xb8) = plVar28;
    *(long **)((long)ppuVar7 + -0xb0) = unaff_x22;
    *(long *)((long)ppuVar7 + -0xa8) = lVar20;
    *(long *)((long)ppuVar7 + -0xa0) = lVar24;
    *(ulong *)((long)ppuVar7 + -0x98) = (ulong)puVar19 & 0xffffffff;
    uVar25 = 0xa454000;
    if ((bRam000000000a454d74 & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eea9d8);
      func_0x0415191c(PTR_DAT_09eea9e0);
      func_0x0415191c(PTR_DAT_09eea9a8);
      func_0x0415191c(PTR_DAT_09eaa090);
      func_0x0415191c(PTR_DAT_09eea9b8);
      func_0x0415191c(PTR_DAT_09eea9c0);
      func_0x0415191c(PTR_DAT_09eea9c8);
      func_0x0415191c(PTR_DAT_09eea9d0);
      bRam000000000a454d74 = 1;
    }
    lVar11 = *(long *)unaff_x26;
    *(undefined8 *)((long)ppuVar7 + -0xe8) = 0;
    if (*(int *)(lVar11 + 0xe0) == 0) {
      func_0x04151a94();
    }
    lVar11 = func_0x08582984(0);
    if (lVar11 != 0) {
      func_0x07e38140(lVar11,lVar17,(undefined1 *)((long)ppuVar7 + -0xe8),
                      *(undefined8 *)PTR_DAT_09eea9e0);
      if (*(long *)((long)ppuVar7 + -0xe8) == 0) {
        return (long *)0x0;
      }
      uVar13 = func_0x084c4560(*(long *)((long)ppuVar7 + -0xe8),*(undefined8 *)PTR_DAT_09eea9d0,0);
      puVar29 = PTR_DAT_09eaa090;
      if (*(long *)((long)ppuVar7 + -0xe8) != 0) {
        uVar25 = uVar13 & 0xffffffff;
        uVar10 = func_0x084c4560(*(long *)((long)ppuVar7 + -0xe8),*(undefined8 *)PTR_DAT_09eea9b8,0)
        ;
        lVar11 = *(long *)puVar29;
        lVar20 = *(long *)((long)ppuVar7 + -0xe8);
        unaff_x22 = (long *)(uVar10 & 0xffffffff);
        uVar10 = *(ulong *)(*(long *)(*(long *)(puVar18 + 8) + 0xc0) + 0x150);
        if (*(int *)(lVar11 + 0xe0) == 0) {
          func_0x04151a94(lVar11);
        }
        uVar23 = func_0x085cae78(uVar10,0);
        plVar28 = (long *)0x0;
        unaff_x27 = puVar29;
        if (lVar20 != 0) {
          lVar11 = func_0x084c2664(lVar20,*(undefined8 *)PTR_DAT_09eea9c0,uVar23,0);
          lVar20 = *(long *)(*(long *)(*(long *)(puVar18 + 8) + 0xc0) + 8);
          if ((*(byte *)(lVar20 + 0x135) & 1) == 0) {
            lVar20 = func_0x041cb3c0(lVar20);
          }
          if (lVar11 == 0) {
code_r0x05aae77c:
            lVar24 = 0;
          }
          else {
            lVar24 = func_0x04151a98(lVar11,lVar20);
            if (lVar24 == 0) {
              func_0x04151f54(lVar11,lVar20);
              goto code_r0x05aae77c;
            }
          }
          plVar28 = (long *)(lVar17 + 0x30);
          *plVar28 = lVar24;
          lVar20 = *(long *)(*(long *)(*(long *)(puVar18 + 8) + 0xc0) + 8);
          if ((*(byte *)(lVar20 + 0x135) & 1) == 0) {
            lVar20 = func_0x041cb3c0(lVar20);
          }
          if ((lVar11 != 0) && (lVar17 = func_0x04151a98(lVar11,lVar20), lVar17 == 0)) {
            func_0x04151f54(lVar11,lVar20);
          }
          goto code_r0x0413776c;
        }
      }
    }
    func_0x04151bb8();
    func_0x085dd388(0x10,0);
    func_0x04151bb8();
    auVar30 = func_0x04151f54(uVar10,plVar28);
    puVar29 = PTR_DAT_09eea9a8;
    lVar20 = auVar30._0_8_;
    *(undefined **)((long)ppuVar7 + -0x120) = &UNK_05aae960;
    *(long **)((long)ppuVar7 + -0x110) = unaff_x22;
    *(ulong *)((long)ppuVar7 + -0x108) = uVar25;
    *(uint **)((long)ppuVar7 + -0x100) = puVar18;
    *(long *)((long)ppuVar7 + -0xf8) = lVar17;
    if ((bRam000000000a454d75 & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eea9a8);
      bRam000000000a454d75 = 1;
    }
    uVar3 = *(undefined4 *)(lVar20 + 0x20);
    if (*(int *)(*(long *)puVar29 + 0xe0) == 0) {
      func_0x04151a94();
    }
    uVar8 = func_0x08582900(uVar3,0);
    puVar29 = PTR_DAT_09eac100;
    uVar25 = (ulong)uVar8;
    lVar11 = *(long *)(*(long *)(*(long *)(auVar30._8_8_ + 0x20) + 0xc0) + 0x1a8);
    *(undefined8 *)((long)ppuVar7 + -0x130) = *(undefined8 *)((long)ppuVar7 + -0x120);
    *(ulong *)((long)ppuVar7 + -0x120) = uVar10;
    *(long **)((long)ppuVar7 + -0x118) = plVar28;
    *(undefined8 *)((long)ppuVar7 + -0x110) = *(undefined8 *)((long)ppuVar7 + -0x110);
    *(undefined8 *)((long)ppuVar7 + -0x108) = *(undefined8 *)((long)ppuVar7 + -0x108);
    *(undefined8 *)((long)ppuVar7 + -0x100) = *(undefined8 *)((long)ppuVar7 + -0x100);
    *(undefined8 *)((long)ppuVar7 + -0xf8) = *(undefined8 *)((long)ppuVar7 + -0xf8);
    if ((bRam000000000a454d76 & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eac100,uVar25,0);
      bRam000000000a454d76 = 1;
    }
    plVar14 = (long *)func_0x04151a04(*(undefined8 *)puVar29,uVar25);
    lVar11 = *(long *)(*(long *)(*(long *)(lVar11 + 0x20) + 0xc0) + 400);
    if ((*(byte *)(lVar11 + 0x135) & 1) == 0) {
      lVar11 = func_0x041cb3c0(lVar11);
    }
    puVar15 = (uint *)func_0x04151a04(lVar11,uVar25);
    uVar27 = *(uint *)(lVar20 + 0x20);
    unaff_x24 = (uint *)(ulong)uVar27;
    lVar11 = 0;
    puVar19 = puVar15;
    func_0x085dec90(*(undefined8 *)(lVar20 + 0x18),0,puVar15,0,unaff_x24,0);
    if ((int)uVar27 < 1) {
code_r0x05aaeafc:
      plVar28 = (long *)(lVar20 + 0x10);
      *plVar28 = (long)plVar14;
code_r0x0413776c:
      if (iRam000000000a680cb0 != 0) {
        puVar1 = (ulong *)(((ulong)plVar28 >> 0x12 & 0x7fff) * 8 + 0xa4b4c88);
        do {
          cVar4 = '\x01';
          bVar5 = (bool)ExclusiveMonitorPass(puVar1,0x10);
          if (bVar5) {
            *puVar1 = *puVar1 | 1L << ((ulong)plVar28 >> 0xc & 0x3f);
            cVar4 = ExclusiveMonitorsStatus();
          }
        } while (cVar4 != '\0');
      }
      return plVar28;
    }
    if (puVar15 != (uint *)0x0) {
      uVar27 = puVar15[6];
      puVar18 = (uint *)0x0;
      while (puVar18 < (uint *)(ulong)uVar27) {
        uVar21 = puVar15[(long)puVar18 * 4 + 8];
        if (-1 < (int)uVar21) {
          if (plVar14 == (long *)0x0) goto code_r0x05aaeb30;
          iVar9 = 0;
          if (uVar8 != 0) {
            iVar9 = (int)uVar21 / (int)uVar8;
          }
          uVar21 = uVar21 - iVar9 * uVar8;
          if (*(uint *)(plVar14 + 3) <= uVar21) break;
          puVar15[(long)puVar18 * 4 + 9] = *(int *)((long)plVar14 + (ulong)uVar21 * 4 + 0x20) - 1;
          *(int *)((long)plVar14 + (ulong)uVar21 * 4 + 0x20) = (int)puVar18 + 1;
        }
        puVar18 = (uint *)((long)puVar18 + 1);
        if (puVar18 == unaff_x24) goto code_r0x05aaeafc;
      }
      func_0x04151bc0();
    }
code_r0x05aaeb30:
    auVar31 = func_0x04151bb8();
    lVar17 = auVar31._0_8_;
    *(ulong *)((long)ppuVar7 + -400) = unaff_x29;
    *(undefined **)((long)ppuVar7 + -0x188) = &UNK_05aaeb34;
    *(uint **)((long)ppuVar7 + -0x180) = unaff_x28;
    *(undefined **)((long)ppuVar7 + -0x178) = unaff_x27;
    *(uint **)((long)ppuVar7 + -0x170) = unaff_x26;
    *(uint **)((long)ppuVar7 + -0x168) = unaff_x25;
    *(uint **)((long)ppuVar7 + -0x160) = unaff_x24;
    *(uint **)((long)ppuVar7 + -0x158) = puVar15;
    *(undefined8 **)((long)ppuVar7 + -0x150) = (undefined8 *)(lVar20 + 0x18);
    *(long **)((long)ppuVar7 + -0x148) = plVar14;
    *(ulong *)((long)ppuVar7 + -0x140) = uVar25;
    *(long *)((long)ppuVar7 + -0x138) = lVar20;
    *(uint *)((long)ppuVar7 + -0x194) = auVar31._8_4_;
    if (*(long *)(lVar17 + 0x10) == 0) {
      return (long *)0x0;
    }
    unaff_x22 = *(long **)(lVar17 + 0x30);
    if (unaff_x22 == (long *)0x0) {
      puVar18 = puVar19;
      uVar8 = func_0x085b9e58((undefined1 *)((long)ppuVar7 + -0x194),0);
    }
    else {
      plVar14 = (long *)(ulong)auVar31._8_4_;
      lVar20 = *(long *)(*(long *)(*(long *)(puVar19 + 8) + 0xc0) + 8);
      if ((*(byte *)(lVar20 + 0x135) & 1) == 0) {
        lVar20 = func_0x041cb3c0(lVar20);
      }
      lVar24 = *unaff_x22;
      uVar10 = (ulong)*(ushort *)(lVar24 + 0x12e);
      if (uVar10 != 0) {
        piVar26 = (int *)(*(long *)(lVar24 + 0xb0) + 8);
        do {
          if (*(long *)(piVar26 + -2) == lVar20) {
            puVar12 = (undefined8 *)(lVar24 + (long)(*piVar26 + 1) * 0x10 + 0x138);
            goto code_r0x05aaebec;
          }
          uVar10 = uVar10 - 1;
          piVar26 = piVar26 + 4;
        } while (uVar10 != 0);
      }
      puVar12 = (undefined8 *)func_0x041cb4c4(unaff_x22,lVar20,1);
code_r0x05aaebec:
      puVar18 = (uint *)puVar12[1];
      uVar8 = (*(code *)*puVar12)(unaff_x22,plVar14);
    }
    lVar20 = *(long *)(lVar17 + 0x10);
    if (lVar20 == 0) {
code_r0x05aaee04:
      func_0x04151bb8();
    }
    else {
      uVar27 = *(uint *)(lVar20 + 0x18);
      uVar8 = uVar8 & 0x7fffffff;
      unaff_x27 = (undefined *)(ulong)uVar8;
      iVar9 = 0;
      if (uVar27 != 0) {
        iVar9 = (int)uVar8 / (int)uVar27;
      }
      uVar21 = uVar8 - iVar9 * uVar27;
      if (uVar21 < uVar27) {
        uVar27 = *(int *)(lVar20 + (ulong)uVar21 * 4 + 0x20) - 1;
        if ((int)uVar27 < 0) {
          return (long *)0x0;
        }
        plVar28 = (long *)0x0;
        unaff_x29 = 0xffffffff;
        *(ulong *)((long)ppuVar7 + -0x1a0) = (ulong)uVar21;
        while( true ) {
          unaff_x24 = (uint *)(ulong)uVar27;
          unaff_x26 = *(uint **)(lVar17 + 0x18);
          unaff_x22 = plVar28;
          if (unaff_x26 == (uint *)0x0) break;
          if (unaff_x26[6] <= uVar27) goto code_r0x05aaee08;
          unaff_x25 = unaff_x26 + (ulong)uVar27 * 4 + 8;
          unaff_x28 = unaff_x24;
          if (*unaff_x25 == uVar8) {
            plVar14 = *(long **)(lVar17 + 0x30);
            if (plVar14 == (long *)0x0) {
              plVar16 = (long *)func_0x0450ee18(*(undefined8 *)
                                                 (*(long *)(*(long *)(puVar19 + 8) + 0xc0) + 0x18));
              plVar14 = plVar28;
              if (plVar16 == (long *)0x0) break;
              puVar18 = (uint *)(ulong)*(uint *)((long)ppuVar7 + -0x194);
              lVar11 = *(long *)(*plVar16 + 0x1c0);
              uVar10 = (**(code **)(*plVar16 + 0x1b8))(plVar16,unaff_x26[(long)unaff_x24 * 4 + 10]);
            }
            else {
              if (plVar14 == (long *)0x0) break;
              puVar15 = (uint *)(ulong)*(uint *)((long)ppuVar7 + -0x194);
              lVar11 = *(long *)(*(long *)(*(long *)(puVar19 + 8) + 0xc0) + 8);
              uVar21 = unaff_x26[(long)unaff_x24 * 4 + 10];
              if ((*(byte *)(lVar11 + 0x135) & 1) == 0) {
                lVar11 = func_0x041cb3c0(lVar11);
              }
              lVar20 = *plVar14;
              uVar10 = (ulong)*(ushort *)(lVar20 + 0x12e);
              if (uVar10 != 0) {
                piVar26 = (int *)(*(long *)(lVar20 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar26 + -2) == lVar11) {
                    puVar12 = (undefined8 *)(lVar20 + (long)*piVar26 * 0x10 + 0x138);
                    goto code_r0x05aaed28;
                  }
                  uVar10 = uVar10 - 1;
                  piVar26 = piVar26 + 4;
                } while (uVar10 != 0);
              }
              puVar12 = (undefined8 *)func_0x041cb4c4(plVar14,lVar11,0);
code_r0x05aaed28:
              lVar11 = puVar12[1];
              puVar18 = puVar15;
              uVar10 = (*(code *)*puVar12)(plVar14,(long *)(ulong)uVar21);
              plVar28 = plVar14;
              unaff_x22 = (long *)(ulong)uVar21;
            }
            if ((uVar10 & 1) != 0) {
              plVar14 = plVar28;
              if ((int)(uint)unaff_x29 < 0) {
                lVar20 = *(long *)(lVar17 + 0x10);
                if (lVar20 == 0) break;
                if (*(uint *)(lVar20 + 0x18) <= (uint)*(long *)((long)ppuVar7 + -0x1a0))
                goto code_r0x05aaee08;
                *(uint *)(lVar20 + *(long *)((long)ppuVar7 + -0x1a0) * 4 + 0x20) =
                     unaff_x26[(long)unaff_x24 * 4 + 9] + 1;
              }
              else {
                lVar20 = *(long *)(lVar17 + 0x18);
                if (lVar20 == 0) break;
                if (*(uint *)(lVar20 + 0x18) <= (uint)unaff_x29) goto code_r0x05aaee08;
                *(uint *)(lVar20 + unaff_x29 * 0x10 + 0x24) = unaff_x26[(long)unaff_x24 * 4 + 9];
              }
              *unaff_x25 = 0xffffffff;
              unaff_x26[(long)unaff_x24 * 4 + 9] = *(uint *)(lVar17 + 0x24);
              *(uint *)(lVar17 + 0x24) = uVar27;
              *(ulong *)(lVar17 + 0x28) =
                   CONCAT44((int)((ulong)*(undefined8 *)(lVar17 + 0x28) >> 0x20) + 1,
                            (int)*(undefined8 *)(lVar17 + 0x28) + 1);
              return (long *)0x1;
            }
          }
          unaff_x29 = (ulong)uVar27;
          plVar14 = plVar28;
          uVar27 = unaff_x26[(long)unaff_x24 * 4 + 9];
          if ((int)unaff_x26[(long)unaff_x24 * 4 + 9] < 0) {
            return (long *)0x0;
          }
        }
        goto code_r0x05aaee04;
      }
    }
code_r0x05aaee08:
    auVar31 = func_0x04151bc0();
    uVar10 = auVar31._0_8_;
    *(ulong *)((long)ppuVar7 + -0x200) = unaff_x29;
    *(undefined **)((long)ppuVar7 + -0x1f8) = &UNK_05aaee0c;
    *(uint **)((long)ppuVar7 + -0x1f0) = unaff_x28;
    *(undefined **)((long)ppuVar7 + -0x1e8) = unaff_x27;
    *(uint **)((long)ppuVar7 + -0x1e0) = unaff_x26;
    *(uint **)((long)ppuVar7 + -0x1d8) = unaff_x25;
    *(uint **)((long)ppuVar7 + -0x1d0) = unaff_x24;
    *(uint **)((long)ppuVar7 + -0x1c8) = puVar15;
    *(long **)((long)ppuVar7 + -0x1c0) = unaff_x22;
    *(long **)((long)ppuVar7 + -0x1b8) = plVar14;
    *(uint **)((long)ppuVar7 + -0x1b0) = puVar19;
    *(long *)((long)ppuVar7 + -0x1a8) = lVar17;
    *(uint *)((long)ppuVar7 + -0x204) = auVar31._8_4_;
    lVar20 = *(long *)(uVar10 + 0x10);
    *(uint **)((long)ppuVar7 + -0x210) = puVar18;
    if (lVar20 == 0) {
code_r0x05aaf034:
      **(undefined4 **)((long)ppuVar7 + -0x210) = 0;
      return (long *)0x0;
    }
    unaff_x23 = *(long **)(uVar10 + 0x30);
    lVar20 = lVar11;
    if (unaff_x23 == (long *)0x0) {
      uVar8 = func_0x085b9e58((undefined1 *)((long)ppuVar7 + -0x204),0);
    }
    else {
      unaff_x22 = (long *)(ulong)auVar31._8_4_;
      lVar17 = *(long *)(*(long *)(*(long *)(lVar11 + 0x20) + 0xc0) + 8);
      if ((*(byte *)(lVar17 + 0x135) & 1) == 0) {
        lVar17 = func_0x041cb3c0(lVar17);
      }
      lVar24 = *unaff_x23;
      uVar25 = (ulong)*(ushort *)(lVar24 + 0x12e);
      if (uVar25 != 0) {
        piVar26 = (int *)(*(long *)(lVar24 + 0xb0) + 8);
        do {
          if (*(long *)(piVar26 + -2) == lVar17) {
            puVar12 = (undefined8 *)(lVar24 + (long)(*piVar26 + 1) * 0x10 + 0x138);
            goto code_r0x05aaeec8;
          }
          uVar25 = uVar25 - 1;
          piVar26 = piVar26 + 4;
        } while (uVar25 != 0);
      }
      puVar12 = (undefined8 *)func_0x041cb4c4(unaff_x23,lVar17,1);
code_r0x05aaeec8:
      puVar18 = (uint *)puVar12[1];
      uVar8 = (*(code *)*puVar12)(unaff_x23,unaff_x22);
    }
    lVar17 = *(long *)(uVar10 + 0x10);
    if (lVar17 == 0) {
code_r0x05aaf0f4:
      func_0x04151bb8();
    }
    else {
      uVar27 = *(uint *)(lVar17 + 0x18);
      uVar8 = uVar8 & 0x7fffffff;
      unaff_x28 = (uint *)(ulong)uVar8;
      iVar9 = 0;
      if (uVar27 != 0) {
        iVar9 = (int)uVar8 / (int)uVar27;
      }
      uVar21 = uVar8 - iVar9 * uVar27;
      if (uVar21 < uVar27) {
        iVar9 = *(int *)(lVar17 + (ulong)uVar21 * 4 + 0x20);
        *(ulong *)((long)ppuVar7 + -0x218) = (ulong)uVar21;
        uVar27 = iVar9 - 1;
        if ((int)uVar27 < 0) goto code_r0x05aaf034;
        plVar28 = (long *)0x0;
        unaff_x29 = 0xffffffff;
        while( true ) {
          unaff_x25 = (uint *)(ulong)uVar27;
          unaff_x27 = *(undefined **)(uVar10 + 0x18);
          unaff_x23 = plVar28;
          if (unaff_x27 == (undefined *)0x0) break;
          if (*(uint *)(unaff_x27 + 0x18) <= uVar27) goto code_r0x05aaf0f8;
          puVar19 = (uint *)(unaff_x27 + (ulong)uVar27 * 0x10 + 0x20);
          unaff_x26 = unaff_x25;
          if (*puVar19 == uVar8) {
            unaff_x22 = *(long **)(uVar10 + 0x30);
            if (unaff_x22 == (long *)0x0) {
              plVar14 = (long *)func_0x0450ee18(*(undefined8 *)
                                                 (*(long *)(*(long *)(lVar11 + 0x20) + 0xc0) + 0x18)
                                               );
              unaff_x22 = plVar28;
              if (plVar14 == (long *)0x0) break;
              puVar18 = (uint *)(ulong)*(uint *)((long)ppuVar7 + -0x204);
              lVar20 = *(long *)(*plVar14 + 0x1c0);
              uVar25 = (**(code **)(*plVar14 + 0x1b8))
                                 (plVar14,*(undefined4 *)(unaff_x27 + (long)unaff_x25 * 0x10 + 0x28)
                                 );
            }
            else {
              if (unaff_x22 == (long *)0x0) break;
              unaff_x24 = (uint *)(ulong)*(uint *)((long)ppuVar7 + -0x204);
              lVar20 = *(long *)(*(long *)(*(long *)(lVar11 + 0x20) + 0xc0) + 8);
              uVar21 = *(uint *)(unaff_x27 + (long)unaff_x25 * 0x10 + 0x28);
              if ((*(byte *)(lVar20 + 0x135) & 1) == 0) {
                lVar20 = func_0x041cb3c0(lVar20);
              }
              lVar17 = *unaff_x22;
              uVar25 = (ulong)*(ushort *)(lVar17 + 0x12e);
              if (uVar25 != 0) {
                piVar26 = (int *)(*(long *)(lVar17 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar26 + -2) == lVar20) {
                    puVar12 = (undefined8 *)(lVar17 + (long)*piVar26 * 0x10 + 0x138);
                    goto code_r0x05aaf004;
                  }
                  uVar25 = uVar25 - 1;
                  piVar26 = piVar26 + 4;
                } while (uVar25 != 0);
              }
              puVar12 = (undefined8 *)func_0x041cb4c4(unaff_x22,lVar20,0);
code_r0x05aaf004:
              lVar20 = puVar12[1];
              puVar18 = unaff_x24;
              uVar25 = (*(code *)*puVar12)(unaff_x22,(long *)(ulong)uVar21);
              plVar28 = unaff_x22;
              unaff_x23 = (long *)(ulong)uVar21;
            }
            if ((uVar25 & 1) != 0) {
              unaff_x22 = plVar28;
              if ((int)(uint)unaff_x29 < 0) {
                lVar17 = *(long *)(uVar10 + 0x10);
                if (lVar17 == 0) break;
                if (*(uint *)(lVar17 + 0x18) <= (uint)*(long *)((long)ppuVar7 + -0x218))
                goto code_r0x05aaf0f8;
                *(int *)(lVar17 + *(long *)((long)ppuVar7 + -0x218) * 4 + 0x20) =
                     *(int *)(unaff_x27 + (long)unaff_x25 * 0x10 + 0x24) + 1;
              }
              else {
                lVar17 = *(long *)(uVar10 + 0x18);
                if (lVar17 == 0) break;
                if (*(uint *)(lVar17 + 0x18) <= (uint)unaff_x29) goto code_r0x05aaf0f8;
                *(undefined4 *)(lVar17 + unaff_x29 * 0x10 + 0x24) =
                     *(undefined4 *)(unaff_x27 + (long)unaff_x25 * 0x10 + 0x24);
              }
              **(undefined4 **)((long)ppuVar7 + -0x210) =
                   *(undefined4 *)(unaff_x27 + (long)unaff_x25 * 0x10 + 0x2c);
              *puVar19 = 0xffffffff;
              *(undefined4 *)(unaff_x27 + (long)unaff_x25 * 0x10 + 0x24) =
                   *(undefined4 *)(uVar10 + 0x24);
              *(uint *)(uVar10 + 0x24) = uVar27;
              *(ulong *)(uVar10 + 0x28) =
                   CONCAT44((int)((ulong)*(undefined8 *)(uVar10 + 0x28) >> 0x20) + 1,
                            (int)*(undefined8 *)(uVar10 + 0x28) + 1);
              return (long *)0x1;
            }
          }
          unaff_x29 = (ulong)uVar27;
          unaff_x22 = plVar28;
          uVar27 = *(uint *)(unaff_x27 + (long)unaff_x25 * 0x10 + 0x24);
          if ((int)*(uint *)(unaff_x27 + (long)unaff_x25 * 0x10 + 0x24) < 0) goto code_r0x05aaf034;
        }
        goto code_r0x05aaf0f4;
      }
    }
code_r0x05aaf0f8:
    puVar29 = &UNK_05aaf0fc;
    auVar30 = func_0x04151bc0();
    ppuVar7 = (undefined **)((long)ppuVar7 + -0x220);
  } while( true );
}


```

## CriticalDamageValue.GetCalculateValue (off 0x9164cbc)

```c

undefined1  [16] WithNetwork_CriticalDamageValue__GetCalculateValue(long param_1)

{
  undefined1 (*pauVar1) [16];
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined *puVar8;
  long lVar9;
  long lVar10;
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  long lStack_40;
  undefined8 uStack_38;
  
  puVar8 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a469e9e & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469e9e = 1;
  }
  uVar2 = *(undefined8 *)(param_1 + 0x10);
  uVar4 = *(undefined8 *)(param_1 + 0x18);
  uVar3 = *(undefined8 *)(param_1 + 0x20);
  uVar5 = *(undefined8 *)(param_1 + 0x28);
  if (*(int *)(*(long *)puVar8 + 0xe0) == 0) {
    func_0x04151a94();
  }
  auVar11 = func_0x097744cc(uVar2,uVar4,uVar3,uVar5,0);
  auVar12 = func_0x097744cc(auVar11._0_8_,auVar11._8_8_,*(undefined8 *)(param_1 + 0x30),
                            *(undefined8 *)(param_1 + 0x38),0);
  pauVar1 = (undefined1 (*) [16])(param_1 + 0x40);
  lVar10 = *(long *)*pauVar1;
  lVar9 = *(long *)(param_1 + 0x48);
  auVar6 = *pauVar1;
  auVar11 = *pauVar1;
  if ((bRam000000000a46d941 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46d941 = 1;
  }
  auVar7 = auVar12;
  if (auVar12._8_8_ < lVar9) {
    auVar7 = auVar6;
    auVar11 = auVar12;
    lVar10 = auVar12._0_8_;
  }
  auVar6 = auVar7;
  if (lVar10 != 0) {
    auVar6 = auVar11;
    if ((auVar7._0_8_ != 0) &&
       (lVar10 = auVar7._8_8_ - auVar11._8_8_, auVar6 = auVar7, lVar10 < 0xc)) {
      if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
        func_0x04151a94();
      }
      lVar9 = func_0x097740c8(lVar10);
      lVar10 = 0;
      if (lVar9 != 0) {
        lVar10 = auVar11._0_8_ / lVar9;
      }
      lStack_40 = 0;
      uStack_38 = 0;
      func_0x09773f14(&lStack_40,lVar10 + auVar7._0_8_,auVar7._8_8_);
      auVar6._8_8_ = uStack_38;
      auVar6._0_8_ = lStack_40;
    }
  }
  return auVar6;
}


```

