# Decompiled functions — batch 3 (team/formation mechanics)

## HuntDataStore.GetTotalPower (off 0x916a194)

```c

undefined1  [16] FUN_0926e194(long param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined *puVar3;
  long lVar4;
  ulong uVar5;
  
  puVar3 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a469f27 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469f27 = 1;
  }
  lVar4 = *(long *)puVar3;
  uVar1 = *(undefined8 *)(param_1 + 0xa0);
  uVar2 = *(undefined8 *)(param_1 + 0xa8);
  if (*(int *)(lVar4 + 0xe0) == 0) {
    func_0x04151a94();
    lVar4 = *(long *)puVar3;
  }
  uVar5 = func_0x09775000(uVar1,uVar2,**(undefined8 **)(lVar4 + 0xb8),
                          (*(undefined8 **)(lVar4 + 0xb8))[1],0);
  if ((uVar5 & 1) != 0) {
    func_0x0926e21c(param_1);
  }
  return *(undefined1 (*) [16])(param_1 + 0xa0);
}


```

## Party.AttackTargetUnit (off 0x46df7a4)

```c

ulong FUN_047e37a4(undefined *param_1,undefined8 param_2,ulong param_3,ulong param_4)

{
  undefined *puVar1;
  undefined *puVar2;
  uint uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  long lVar7;
  ulong *puVar8;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  int *piVar12;
  undefined *puVar13;
  long *plVar14;
  undefined1 auVar15 [16];
  undefined1 auVar16 [12];
  undefined8 uStack_220;
  undefined8 uStack_218;
  undefined *puStack_210;
  undefined8 uStack_208;
  undefined *puStack_200;
  undefined8 *puStack_1f8;
  undefined8 uStack_1f0;
  undefined8 uStack_1e8;
  undefined8 uStack_1d8;
  undefined8 uStack_1d0;
  long lStack_1c8;
  undefined *puStack_1c0;
  undefined8 uStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_198;
  undefined8 uStack_190;
  long lStack_188;
  undefined *puStack_180;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_158;
  undefined8 uStack_150;
  long lStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  long lStack_130;
  undefined *puStack_120;
  undefined *puStack_110;
  undefined8 *puStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  long lStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  long lStack_c0;
  undefined *puStack_b0;
  undefined *puStack_a0;
  undefined *puStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_78;
  undefined8 uStack_70;
  long lStack_68;
  code *pcStack_60;
  ulong uStack_58;
  undefined8 uStack_50;
  ulong uStack_48;
  undefined8 uStack_38;
  
  uVar11 = param_3;
  uVar9 = param_4;
  if ((bRam000000000a45163c & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece810);
    bRam000000000a45163c = 1;
  }
  uStack_38 = 0;
  if (param_3 != 0) {
    uVar4 = func_0x047df584(param_3,&uStack_38);
    if ((uVar4 & 1) == 0) {
      return uVar4;
    }
    plVar14 = *(long **)(param_1 + 0x10);
    param_1 = (undefined *)0x0;
    if (plVar14 != (long *)0x0) {
      lVar10 = *plVar14;
      uVar11 = (ulong)*(ushort *)(lVar10 + 0x12e);
      if (uVar11 != 0) {
        piVar12 = (int *)(*(long *)(lVar10 + 0xb0) + 8);
        do {
          if (*(long *)(piVar12 + -2) == *(long *)PTR_DAT_09ece810) {
            puVar5 = (undefined8 *)(lVar10 + (long)(*piVar12 + 3) * 0x10 + 0x138);
            goto code_r0x047e385c;
          }
          uVar11 = uVar11 - 1;
          piVar12 = piVar12 + 4;
        } while (uVar11 != 0);
      }
      puVar5 = (undefined8 *)func_0x041cb4c4(plVar14,*(long *)PTR_DAT_09ece810,3);
code_r0x047e385c:
      uVar11 = (*(code *)*puVar5)(plVar14,param_2,param_3,(uint)param_4 & 1,puVar5[1]);
      return uVar11;
    }
  }
  auVar15 = func_0x04151bb8();
  pcStack_60 = FUN_047e388c;
  uStack_58 = param_4 & 0xffffffff;
  uStack_50 = param_2;
  uStack_48 = param_3;
  if ((bRam000000000a451631 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece960);
    func_0x0415191c(PTR_DAT_09ece968);
    func_0x0415191c(PTR_DAT_09ece970);
    func_0x0415191c(PTR_DAT_09ece978);
    bRam000000000a451631 = 1;
  }
  puVar2 = PTR_DAT_09ece968;
  puVar1 = PTR_DAT_09ece960;
  uStack_78 = 0;
  uStack_70 = 0;
  lStack_68 = 0;
  lVar10 = *(long *)(auVar15._0_8_ + 0x20);
  puVar13 = (undefined *)0xa451000;
  if (lVar10 != 0) {
    func_0x06cc507c(&uStack_78,lVar10,*(undefined8 *)PTR_DAT_09ece978);
    while( true ) {
      uVar4 = func_0x05d3cfd8(&uStack_78,*(undefined8 *)puVar2);
      if ((uVar4 & 1) == 0) {
        uVar11 = func_0x05d3cfd4(&uStack_78,*(undefined8 *)puVar1);
        return uVar11;
      }
      if (lStack_68 == 0) break;
      if (*(char *)(lStack_68 + 0xb4) == '\0') {
        uVar11 = 0;
        func_0x047e9588(lStack_68,auVar15._8_8_ & 0xffffffff);
      }
    }
    func_0x04151bb8();
    puVar13 = puVar2;
  }
  auVar16 = func_0x04151bb8();
  uVar6 = auVar16._0_8_;
  if (auVar16._8_4_ == 1) {
    plVar14 = (long *)func_0x098f6de0(uVar6);
    lVar10 = *plVar14;
    func_0x098f6df0();
    uVar4 = func_0x05d3cfd4(&uStack_78,*(undefined8 *)PTR_DAT_09ece960);
    if (lVar10 == 0) {
      return uVar4;
    }
    func_0x04151bb0(lVar10);
  }
  func_0x05d3cfd4(&uStack_78,*(undefined8 *)PTR_DAT_09ece960);
  func_0x04247ab0(uVar6);
  func_0x04151bb0(0);
  auVar15 = func_0x03bf6574();
  lVar10 = auVar15._8_8_;
  puStack_b0 = &Game_Application_InGameHunt_Party__AddStatusEffect;
  uStack_90 = 0;
  puStack_a0 = param_1;
  puStack_98 = puVar13;
  uStack_88 = uVar6;
  if ((bRam000000000a451633 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece960);
    func_0x0415191c(PTR_DAT_09ece968);
    func_0x0415191c(PTR_DAT_09ece970);
    func_0x0415191c(PTR_DAT_09ece978);
    bRam000000000a451633 = 1;
  }
  puVar2 = PTR_DAT_09ece968;
  puVar1 = PTR_DAT_09ece960;
  uStack_d0 = 0;
  uStack_c8 = 0;
  lStack_c0 = 0;
  lVar7 = *(long *)(auVar15._0_8_ + 0x20);
  puVar5 = (undefined8 *)0xa451000;
  if (lVar7 != 0) {
    func_0x06cc507c(&uStack_e8,lVar7,*(undefined8 *)PTR_DAT_09ece978);
    uStack_c8 = uStack_e0;
    uStack_d0 = uStack_e8;
    lStack_c0 = lStack_d8;
code_r0x047e3a8c:
    uVar4 = func_0x05d3cfd8(&uStack_d0,*(undefined8 *)puVar2);
    lVar7 = lStack_c0;
    if ((uVar4 & 1) == 0) {
      uVar11 = func_0x05d3cfd4(&uStack_d0,*(undefined8 *)puVar1);
      return uVar11;
    }
    if (lStack_c0 != 0) goto code_r0x047e3aa4;
    func_0x04151bb8();
    goto code_r0x047e3b10;
  }
code_r0x047e3b18:
  auVar16 = func_0x04151bb8();
  uVar6 = auVar16._0_8_;
  if (auVar16._8_4_ == 1) {
    plVar14 = (long *)func_0x098f6de0(uVar6);
    lVar10 = *plVar14;
    func_0x098f6df0();
    uVar4 = func_0x05d3cfd4(&uStack_d0,*puVar5);
    if (lVar10 == 0) {
      return uVar4;
    }
    func_0x04151bb0(lVar10);
  }
  func_0x05d3cfd4(&uStack_d0,*puVar5);
  func_0x04247ab0(uVar6);
  func_0x04151bb0(0);
  auVar15 = func_0x03bf6574();
  lVar10 = auVar15._8_8_;
  puStack_120 = &Game_Application_InGameHunt_Party__RemoveStatusEffect;
  uStack_100 = 0;
  puStack_110 = param_1;
  puStack_108 = puVar5;
  uStack_f8 = uVar6;
  if ((bRam000000000a451634 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece960);
    func_0x0415191c(PTR_DAT_09ece968);
    func_0x0415191c(PTR_DAT_09ece970);
    func_0x0415191c(PTR_DAT_09ece978);
    bRam000000000a451634 = 1;
  }
  puVar2 = PTR_DAT_09ece968;
  puVar1 = PTR_DAT_09ece960;
  uStack_140 = 0;
  uStack_138 = 0;
  lStack_130 = 0;
  lVar7 = *(long *)(auVar15._0_8_ + 0x20);
  puVar5 = (undefined8 *)0xa451000;
  if (lVar7 != 0) {
    func_0x06cc507c(&uStack_158,lVar7,*(undefined8 *)PTR_DAT_09ece978);
    uStack_138 = uStack_150;
    uStack_140 = uStack_158;
    lStack_130 = lStack_148;
code_r0x047e3c38:
    uVar4 = func_0x05d3cfd8(&uStack_140,*(undefined8 *)puVar2);
    lVar7 = lStack_130;
    if ((uVar4 & 1) == 0) {
      uVar11 = func_0x05d3cfd4(&uStack_140,*(undefined8 *)puVar1);
      return uVar11;
    }
    if (lStack_130 != 0) goto code_r0x047e3c50;
    func_0x04151bb8();
    goto code_r0x047e3cb4;
  }
code_r0x047e3cbc:
  auVar16 = func_0x04151bb8();
  uVar6 = auVar16._0_8_;
  if (auVar16._8_4_ == 1) {
    plVar14 = (long *)func_0x098f6de0(uVar6);
    lVar10 = *plVar14;
    func_0x098f6df0();
    uVar4 = func_0x05d3cfd4(&uStack_140,*puVar5);
    if (lVar10 == 0) {
      return uVar4;
    }
    func_0x04151bb0(lVar10);
  }
  func_0x05d3cfd4(&uStack_140,*puVar5);
  func_0x04247ab0(uVar6);
  func_0x04151bb0(0);
  lVar10 = func_0x03bf6574();
  puStack_180 = &UNK_047e3d38;
  uStack_170 = 0;
  uStack_168 = uVar6;
  if ((bRam000000000a451638 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece960);
    func_0x0415191c(PTR_DAT_09ece968);
    func_0x0415191c(PTR_DAT_09ece970);
    func_0x0415191c(PTR_DAT_09ece978);
    bRam000000000a451638 = 1;
  }
  puVar2 = PTR_DAT_09ece968;
  puVar1 = PTR_DAT_09ece960;
  uStack_198 = 0;
  uStack_190 = 0;
  lStack_188 = 0;
  if (*(long *)(lVar10 + 0x20) != 0) {
    func_0x06cc507c(&uStack_198,*(long *)(lVar10 + 0x20),*(undefined8 *)PTR_DAT_09ece978);
    do {
      uVar11 = func_0x05d3cfd8(&uStack_198,*(undefined8 *)puVar2);
      if ((uVar11 & 1) == 0) goto code_r0x047e3ddc;
    } while (lStack_188 != 0);
    func_0x04151bb8();
code_r0x047e3ddc:
    uVar11 = func_0x05d3cfd4(&uStack_198,*(undefined8 *)puVar1);
    return uVar11;
  }
  auVar16 = func_0x04151bb8();
  uVar6 = auVar16._0_8_;
  if (auVar16._8_4_ == 1) {
    plVar14 = (long *)func_0x098f6de0(uVar6);
    lVar10 = *plVar14;
    func_0x098f6df0();
    uVar4 = func_0x05d3cfd4(&uStack_198,*(undefined8 *)PTR_DAT_09ece960);
    if (lVar10 == 0) {
      return uVar4;
    }
    func_0x04151bb0(lVar10);
  }
  func_0x05d3cfd4(&uStack_198,*(undefined8 *)PTR_DAT_09ece960);
  func_0x04247ab0(uVar6);
  func_0x04151bb0(0);
  lVar10 = func_0x03bf6574();
  puStack_1c0 = &UNK_047e3e74;
  uStack_1a8 = 0;
  uStack_1b0 = uVar6;
  if ((bRam000000000a451639 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece960);
    func_0x0415191c(PTR_DAT_09ece968);
    func_0x0415191c(PTR_DAT_09ece970);
    func_0x0415191c(PTR_DAT_09ece978);
    bRam000000000a451639 = 1;
  }
  puVar2 = PTR_DAT_09ece968;
  puVar1 = PTR_DAT_09ece960;
  uStack_1d8 = 0;
  uStack_1d0 = 0;
  lStack_1c8 = 0;
  if (*(long *)(lVar10 + 0x20) == 0) {
    auVar16 = func_0x04151bb8();
    uVar6 = auVar16._0_8_;
    if (auVar16._8_4_ == 1) {
      plVar14 = (long *)func_0x098f6de0(uVar6);
      lVar10 = *plVar14;
      func_0x098f6df0();
      uVar4 = func_0x05d3cfd4(&uStack_1d8,*(undefined8 *)PTR_DAT_09ece960);
      if (lVar10 == 0) {
        return uVar4;
      }
      func_0x04151bb0(lVar10);
    }
    func_0x05d3cfd4(&uStack_1d8,*(undefined8 *)PTR_DAT_09ece960);
    func_0x04247ab0(uVar6);
    func_0x04151bb0(0);
    auVar15 = func_0x03bf6574();
    puStack_210 = &UNK_047e3fb0;
    uStack_208 = 0xa451000;
    uStack_1e8 = 0;
    puStack_200 = param_1;
    puStack_1f8 = puVar5;
    uStack_1f0 = uVar6;
    if ((*(long *)(uVar9 + 0x38) == 0) &&
       (func_0x0415191c(PTR_DAT_09ebaf58), *(long *)(uVar9 + 0x38) == 0)) {
      func_0x041cb41c(uVar9);
    }
    puVar1 = PTR_DAT_09ebaf58;
    uStack_220 = 0;
    uStack_218 = 0;
    if (*(int *)(*(long *)PTR_DAT_09ebaf58 + 0xe0) == 0) {
      func_0x04151a94();
    }
    func_0x0444fed4(&uStack_220,1,0);
    if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
      func_0x04151a94();
    }
    func_0x05685714(&uStack_220,auVar15._0_8_,auVar15._8_8_,uVar11 & 0xffffffff,
                    *(undefined8 *)(*(long *)(uVar9 + 0x38) + 0x10));
    uVar11 = func_0x098f18f4(&uStack_220,0);
    lVar10 = 0;
    while( true ) {
      if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
        func_0x04151a94();
      }
      func_0x044500cc(&uStack_220,0);
      if (lVar10 == 0) break;
      auVar16 = func_0x04151bb0(lVar10);
      if (auVar16._8_4_ != 1) {
        if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
          func_0x04151a94();
        }
        func_0x044500cc(&uStack_220,0);
        func_0x04247ab0(auVar16._0_8_);
        func_0x04151bb0(0);
        puVar8 = (ulong *)func_0x03bf6574();
        return *puVar8;
      }
      plVar14 = (long *)func_0x098f6de0(auVar16._0_8_);
      lVar10 = *plVar14;
      func_0x098f6df0();
      uVar11 = 0;
    }
    return uVar11;
  }
  func_0x06cc507c(&uStack_1d8,*(long *)(lVar10 + 0x20),*(undefined8 *)PTR_DAT_09ece978);
  do {
    uVar11 = func_0x05d3cfd8(&uStack_1d8,*(undefined8 *)puVar2);
    if ((uVar11 & 1) == 0) goto code_r0x047e3f18;
  } while (lStack_1c8 != 0);
  func_0x04151bb8();
code_r0x047e3f18:
  uVar11 = func_0x05d3cfd4(&uStack_1d8,*(undefined8 *)puVar1);
  return uVar11;
code_r0x047e3aa4:
  uVar4 = func_0x047eb468(lStack_c0,0);
  if ((uVar4 & 1) == 0) {
    plVar14 = *(long **)(lVar7 + 0x80);
    if (plVar14 == (long *)0x0) {
code_r0x047e3b10:
      func_0x04151bb8();
    }
    else {
      uVar3 = (**(code **)(*plVar14 + 0x1e8))(plVar14,*(undefined8 *)(*plVar14 + 0x1f0));
      if (lVar10 != 0) {
        if ((*(uint *)(lVar10 + 0x20) & (uVar3 ^ 0xffffffff)) != 0) {
          uVar11 = 0;
          func_0x047eac00(lVar7,lVar10);
        }
        goto code_r0x047e3a8c;
      }
    }
    func_0x04151bb8();
    puVar5 = (undefined8 *)puVar1;
    param_1 = puVar2;
    goto code_r0x047e3b18;
  }
  goto code_r0x047e3a8c;
code_r0x047e3c50:
  if (*(char *)(lStack_130 + 0xb4) == '\0') {
    plVar14 = *(long **)(lStack_130 + 0x80);
    if (plVar14 == (long *)0x0) {
code_r0x047e3cb4:
      func_0x04151bb8();
    }
    else {
      uVar3 = (**(code **)(*plVar14 + 0x1e8))(plVar14,*(undefined8 *)(*plVar14 + 0x1f0));
      if (lVar10 != 0) {
        if ((*(uint *)(lVar10 + 0x20) & (uVar3 ^ 0xffffffff)) != 0) {
          uVar11 = 0;
          func_0x047eafdc(lVar7,lVar10);
        }
        goto code_r0x047e3c38;
      }
    }
    func_0x04151bb8();
    puVar5 = (undefined8 *)puVar1;
    param_1 = puVar2;
    goto code_r0x047e3cbc;
  }
  goto code_r0x047e3c38;
}


```

## Party.GetLeadUnit (off 0x46ca0f0)

```c

void FUN_047ce0f0(long param_1)

{
  undefined8 *puVar1;
  long lVar2;
  ulong uVar3;
  int *piVar4;
  long *plVar5;
  
  if ((bRam000000000a451627 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ecd6d0);
    bRam000000000a451627 = 1;
  }
  plVar5 = *(long **)(param_1 + 0x20);
  if (plVar5 == (long *)0x0) {
    lVar2 = func_0x04151bb8();
    *(undefined4 *)(lVar2 + 0x60) = 0;
    return;
  }
  lVar2 = *plVar5;
  uVar3 = (ulong)*(ushort *)(lVar2 + 0x12e);
  if (uVar3 != 0) {
    piVar4 = (int *)(*(long *)(lVar2 + 0xb0) + 8);
    do {
      if (*(long *)(piVar4 + -2) == *(long *)PTR_DAT_09ecd6d0) {
        puVar1 = (undefined8 *)(lVar2 + (long)*piVar4 * 0x10 + 0x138);
        goto code_r0x047ce178;
      }
      uVar3 = uVar3 - 1;
      piVar4 = piVar4 + 4;
    } while (uVar3 != 0);
  }
  puVar1 = (undefined8 *)func_0x041cb4c4(plVar5,*(long *)PTR_DAT_09ecd6d0,0);
code_r0x047ce178:
                    /* WARNING: Could not recover jumptable at 0x047ce18c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*puVar1)(plVar5,0,puVar1[1]);
  return;
}


```

## Party.TryGetAliveLeadUnit (off 0x46db584)

```c

undefined8 FUN_047df584(long param_1,long *param_2)

{
  undefined *puVar1;
  undefined *puVar2;
  ulong uVar3;
  long *plVar4;
  undefined8 uVar5;
  long lVar6;
  float fVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [12];
  undefined8 uStack_38;
  undefined8 uStack_30;
  long lStack_28;
  
  if ((bRam000000000a451628 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece960);
    func_0x0415191c(PTR_DAT_09ece968);
    func_0x0415191c(PTR_DAT_09ece970);
    func_0x0415191c(PTR_DAT_09ece978);
    bRam000000000a451628 = 1;
  }
  puVar2 = PTR_DAT_09ece968;
  puVar1 = PTR_DAT_09ece960;
  uStack_38 = 0;
  uStack_30 = 0;
  lStack_28 = 0;
  if (*(long *)(param_1 + 0x20) != 0) {
    func_0x06cc507c(&uStack_38,*(long *)(param_1 + 0x20),*(undefined8 *)PTR_DAT_09ece978);
    while( true ) {
      uVar3 = func_0x05d3cfd8(&uStack_38,*(undefined8 *)puVar2);
      if ((uVar3 & 1) == 0) {
        func_0x05d3cfd4(&uStack_38,*(undefined8 *)puVar1);
        goto code_r0x047df668;
      }
      if (lStack_28 == 0) break;
      if ((*(char *)(lStack_28 + 0xb4) == '\0') && (*(char *)(lStack_28 + 0x94) == '\0')) {
        *param_2 = lStack_28;
        func_0x041518c0(param_2,lStack_28);
        func_0x05d3cfd4(&uStack_38,*(undefined8 *)puVar1);
        return 1;
      }
    }
    func_0x04151bb8();
  }
  auVar10 = func_0x04151bb8();
  if (auVar10._8_4_ == 1) {
    plVar4 = (long *)func_0x098f6de0(auVar10._0_8_);
    lVar6 = *plVar4;
    func_0x098f6df0();
    func_0x05d3cfd4(&uStack_38,*(undefined8 *)PTR_DAT_09ece960);
    if (lVar6 == 0) {
code_r0x047df668:
      *param_2 = 0;
      func_0x041518c0(param_2,0);
      return 0;
    }
    func_0x04151bb0(lVar6);
  }
  func_0x05d3cfd4(&uStack_38,*(undefined8 *)PTR_DAT_09ece960);
  func_0x04247ab0(auVar10._0_8_);
  func_0x04151bb0(0);
  lVar6 = func_0x03bf6574();
  if ((bRam000000000a451608 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a451608 = 1;
  }
  puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  plVar4 = *(long **)(lVar6 + 0x90);
  if (plVar4 != (long *)0x0) {
    auVar8 = (**(code **)(*plVar4 + 0x1a8))(plVar4,*(undefined8 *)(*plVar4 + 0x1b0));
    fVar7 = *(float *)(lVar6 + 0xb8);
    if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
      func_0x04151a94();
    }
    auVar9 = func_0x09774ab0((double)fVar7,0);
    auVar8 = func_0x097744cc(auVar8._0_8_,auVar8._8_8_,auVar9._0_8_,auVar9._8_8_,0);
    puVar1 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
    if ((bRam000000000a46d938 & 1) == 0) {
      func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88,auVar8._8_8_,0);
      bRam000000000a46d938 = 1;
    }
    if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
      func_0x04151a94();
    }
    uVar5 = func_0x09774cb4(auVar8._0_8_,auVar8._8_8_);
    return uVar5;
  }
  uVar5 = func_0x04151bb8();
  return uVar5;
}


```

## Party.get_SortedReadOnlyUnits (off 0x46df2d8)

```c

undefined8 FUN_047e32d8(long param_1)

{
  return *(undefined8 *)(param_1 + 0x20);
}


```

## FriendParty.UpdateArrangement (off 0x46dd1a4)

```c

/* WARNING: Possible PIC construction at 0x047e14cc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x047e14d0) */
/* WARNING: Removing unreachable block (ram,0x047e153c) */
/* WARNING: Removing unreachable block (ram,0x047e14d4) */
/* WARNING: Removing unreachable block (ram,0x0544f39c) */
/* WARNING: Removing unreachable block (ram,0x0544f3b4) */
/* WARNING: Removing unreachable block (ram,0x0544f3bc) */
/* WARNING: Removing unreachable block (ram,0x0544f3fc) */
/* WARNING: Removing unreachable block (ram,0x0544f430) */
/* WARNING: Removing unreachable block (ram,0x0544f438) */
/* WARNING: Removing unreachable block (ram,0x0544f478) */
/* WARNING: Removing unreachable block (ram,0x0544f4ac) */
/* WARNING: Removing unreachable block (ram,0x0544f4b4) */
/* WARNING: Removing unreachable block (ram,0x0544f4f4) */
/* WARNING: Removing unreachable block (ram,0x0544f528) */
/* WARNING: Removing unreachable block (ram,0x0544f530) */
/* WARNING: Removing unreachable block (ram,0x0544f570) */
/* WARNING: Removing unreachable block (ram,0x0544f5a4) */
/* WARNING: Removing unreachable block (ram,0x0544f5ac) */
/* WARNING: Removing unreachable block (ram,0x0544f5ec) */
/* WARNING: Removing unreachable block (ram,0x0544f620) */
/* WARNING: Removing unreachable block (ram,0x0544f628) */
/* WARNING: Removing unreachable block (ram,0x0544f668) */
/* WARNING: Removing unreachable block (ram,0x0544f69c) */
/* WARNING: Removing unreachable block (ram,0x0544f6a4) */
/* WARNING: Removing unreachable block (ram,0x0544f6e4) */
/* WARNING: Removing unreachable block (ram,0x0544f718) */
/* WARNING: Removing unreachable block (ram,0x0544f720) */
/* WARNING: Removing unreachable block (ram,0x0544f760) */
/* WARNING: Removing unreachable block (ram,0x0544f794) */
/* WARNING: Removing unreachable block (ram,0x0544f79c) */
/* WARNING: Removing unreachable block (ram,0x0544f7e0) */
/* WARNING: Removing unreachable block (ram,0x0544f818) */
/* WARNING: Removing unreachable block (ram,0x0544f824) */
/* WARNING: Removing unreachable block (ram,0x04cf0b70) */
/* WARNING: Removing unreachable block (ram,0x04cf0ba0) */
/* WARNING: Removing unreachable block (ram,0x04cf0bc0) */
/* WARNING: Removing unreachable block (ram,0x04cf0bc8) */
/* WARNING: Removing unreachable block (ram,0x04cf0bcc) */
/* WARNING: Removing unreachable block (ram,0x04cf0eb8) */
/* WARNING: Removing unreachable block (ram,0x04cf0bd0) */
/* WARNING: Removing unreachable block (ram,0x04cf0ec4) */
/* WARNING: Removing unreachable block (ram,0x04cf0bd4) */
/* WARNING: Removing unreachable block (ram,0x04cf0be0) */
/* WARNING: Removing unreachable block (ram,0x04cf0be4) */
/* WARNING: Removing unreachable block (ram,0x04cf0bf4) */
/* WARNING: Removing unreachable block (ram,0x04cf0bf8) */
/* WARNING: Removing unreachable block (ram,0x04cf0c0c) */
/* WARNING: Removing unreachable block (ram,0x04cf0c18) */
/* WARNING: Removing unreachable block (ram,0x04cf0c3c) */
/* WARNING: Removing unreachable block (ram,0x04cf0c48) */
/* WARNING: Removing unreachable block (ram,0x04cf0c54) */
/* WARNING: Removing unreachable block (ram,0x04cf0c5c) */
/* WARNING: Removing unreachable block (ram,0x04cf0c84) */
/* WARNING: Removing unreachable block (ram,0x04cf0c68) */
/* WARNING: Removing unreachable block (ram,0x04cf0c74) */
/* WARNING: Removing unreachable block (ram,0x04cf0c90) */
/* WARNING: Removing unreachable block (ram,0x04cf0ca4) */
/* WARNING: Removing unreachable block (ram,0x04cf0cac) */
/* WARNING: Removing unreachable block (ram,0x04cf0cbc) */
/* WARNING: Removing unreachable block (ram,0x04cf0cc4) */
/* WARNING: Removing unreachable block (ram,0x04cf0cec) */
/* WARNING: Removing unreachable block (ram,0x04cf0cd0) */
/* WARNING: Removing unreachable block (ram,0x04cf0cdc) */
/* WARNING: Removing unreachable block (ram,0x04cf0cf8) */
/* WARNING: Removing unreachable block (ram,0x04cf0e1c) */
/* WARNING: Removing unreachable block (ram,0x04cf0d08) */
/* WARNING: Removing unreachable block (ram,0x04cf0d18) */
/* WARNING: Removing unreachable block (ram,0x04cf0d24) */
/* WARNING: Removing unreachable block (ram,0x04cf0d30) */
/* WARNING: Removing unreachable block (ram,0x04cf0d38) */
/* WARNING: Removing unreachable block (ram,0x04cf0d60) */
/* WARNING: Removing unreachable block (ram,0x04cf0d44) */
/* WARNING: Removing unreachable block (ram,0x04cf0d50) */
/* WARNING: Removing unreachable block (ram,0x04cf0d6c) */
/* WARNING: Removing unreachable block (ram,0x04cf0ea4) */
/* WARNING: Removing unreachable block (ram,0x04cf0d9c) */
/* WARNING: Removing unreachable block (ram,0x04cf0dac) */
/* WARNING: Removing unreachable block (ram,0x04cf0db0) */
/* WARNING: Removing unreachable block (ram,0x04cf0ea8) */
/* WARNING: Removing unreachable block (ram,0x04cf0eac) */
/* WARNING: Removing unreachable block (ram,0x04cf0ecc) */
/* WARNING: Removing unreachable block (ram,0x04cf0ee0) */
/* WARNING: Removing unreachable block (ram,0x04cf0ee4) */
/* WARNING: Removing unreachable block (ram,0x04cf0f0c) */
/* WARNING: Removing unreachable block (ram,0x04cf0f2c) */
/* WARNING: Removing unreachable block (ram,0x04cf0f38) */
/* WARNING: Removing unreachable block (ram,0x04cf0f3c) */
/* WARNING: Removing unreachable block (ram,0x04cf0f54) */
/* WARNING: Removing unreachable block (ram,0x04cf0f5c) */
/* WARNING: Removing unreachable block (ram,0x04cf0f84) */
/* WARNING: Removing unreachable block (ram,0x04cf0f68) */
/* WARNING: Removing unreachable block (ram,0x04cf0f74) */
/* WARNING: Removing unreachable block (ram,0x04cf0f90) */
/* WARNING: Removing unreachable block (ram,0x04cf0f9c) */
/* WARNING: Removing unreachable block (ram,0x04cf0fa0) */
/* WARNING: Removing unreachable block (ram,0x04cf0fa8) */
/* WARNING: Removing unreachable block (ram,0x04cf0fe4) */
/* WARNING: Removing unreachable block (ram,0x04cf1004) */
/* WARNING: Removing unreachable block (ram,0x04cf100c) */
/* WARNING: Removing unreachable block (ram,0x04cf1018) */
/* WARNING: Removing unreachable block (ram,0x04cf131c) */
/* WARNING: Removing unreachable block (ram,0x04cf101c) */
/* WARNING: Removing unreachable block (ram,0x04cf1328) */
/* WARNING: Removing unreachable block (ram,0x04cf1020) */
/* WARNING: Removing unreachable block (ram,0x04cf102c) */
/* WARNING: Removing unreachable block (ram,0x04cf1030) */
/* WARNING: Removing unreachable block (ram,0x04cf1040) */
/* WARNING: Removing unreachable block (ram,0x04cf1044) */
/* WARNING: Removing unreachable block (ram,0x04cf1058) */
/* WARNING: Removing unreachable block (ram,0x04cf1064) */
/* WARNING: Removing unreachable block (ram,0x04cf1088) */
/* WARNING: Removing unreachable block (ram,0x04cf1094) */
/* WARNING: Removing unreachable block (ram,0x04cf10a0) */
/* WARNING: Removing unreachable block (ram,0x04cf10a8) */
/* WARNING: Removing unreachable block (ram,0x04cf10d0) */
/* WARNING: Removing unreachable block (ram,0x04cf10b4) */
/* WARNING: Removing unreachable block (ram,0x04cf10c0) */
/* WARNING: Removing unreachable block (ram,0x04cf10dc) */
/* WARNING: Removing unreachable block (ram,0x04cf10f0) */
/* WARNING: Removing unreachable block (ram,0x04cf10f8) */
/* WARNING: Removing unreachable block (ram,0x04cf1108) */
/* WARNING: Removing unreachable block (ram,0x04cf1110) */
/* WARNING: Removing unreachable block (ram,0x04cf1138) */
/* WARNING: Removing unreachable block (ram,0x04cf111c) */
/* WARNING: Removing unreachable block (ram,0x04cf1128) */
/* WARNING: Removing unreachable block (ram,0x04cf1144) */
/* WARNING: Removing unreachable block (ram,0x04cf1280) */
/* WARNING: Removing unreachable block (ram,0x04cf1154) */
/* WARNING: Removing unreachable block (ram,0x04cf1164) */
/* WARNING: Removing unreachable block (ram,0x04cf1170) */
/* WARNING: Removing unreachable block (ram,0x04cf117c) */
/* WARNING: Removing unreachable block (ram,0x04cf1184) */
/* WARNING: Removing unreachable block (ram,0x04cf11ac) */
/* WARNING: Removing unreachable block (ram,0x04cf1190) */
/* WARNING: Removing unreachable block (ram,0x04cf119c) */
/* WARNING: Removing unreachable block (ram,0x04cf11b8) */
/* WARNING: Removing unreachable block (ram,0x04cf1308) */
/* WARNING: Removing unreachable block (ram,0x04cf11ec) */
/* WARNING: Removing unreachable block (ram,0x04cf11fc) */
/* WARNING: Removing unreachable block (ram,0x04cf1200) */
/* WARNING: Removing unreachable block (ram,0x04cf130c) */
/* WARNING: Removing unreachable block (ram,0x04cf1310) */
/* WARNING: Removing unreachable block (ram,0x04cf1330) */
/* WARNING: Removing unreachable block (ram,0x04cf1344) */
/* WARNING: Removing unreachable block (ram,0x04cf1348) */
/* WARNING: Removing unreachable block (ram,0x04cf1370) */
/* WARNING: Removing unreachable block (ram,0x04cf1390) */
/* WARNING: Removing unreachable block (ram,0x04cf139c) */
/* WARNING: Removing unreachable block (ram,0x04cf13a0) */
/* WARNING: Removing unreachable block (ram,0x04cf13b8) */
/* WARNING: Removing unreachable block (ram,0x04cf13c0) */
/* WARNING: Removing unreachable block (ram,0x04cf13e8) */
/* WARNING: Removing unreachable block (ram,0x04cf13cc) */
/* WARNING: Removing unreachable block (ram,0x04cf13d8) */
/* WARNING: Removing unreachable block (ram,0x04cf13f4) */
/* WARNING: Removing unreachable block (ram,0x04cf1400) */
/* WARNING: Removing unreachable block (ram,0x04cf1404) */
/* WARNING: Removing unreachable block (ram,0x04cf140c) */
/* WARNING: Removing unreachable block (ram,0x04cf1448) */
/* WARNING: Removing unreachable block (ram,0x04cf1468) */
/* WARNING: Removing unreachable block (ram,0x04cf1470) */
/* WARNING: Removing unreachable block (ram,0x04cf1474) */
/* WARNING: Removing unreachable block (ram,0x04cf174c) */
/* WARNING: Removing unreachable block (ram,0x04cf1478) */
/* WARNING: Removing unreachable block (ram,0x04cf1758) */
/* WARNING: Removing unreachable block (ram,0x04cf147c) */
/* WARNING: Removing unreachable block (ram,0x04cf1488) */
/* WARNING: Removing unreachable block (ram,0x04cf148c) */
/* WARNING: Removing unreachable block (ram,0x04cf149c) */
/* WARNING: Removing unreachable block (ram,0x04cf14a0) */
/* WARNING: Removing unreachable block (ram,0x04cf14b4) */
/* WARNING: Removing unreachable block (ram,0x04cf14c0) */
/* WARNING: Removing unreachable block (ram,0x04cf14e4) */
/* WARNING: Removing unreachable block (ram,0x04cf14f0) */
/* WARNING: Removing unreachable block (ram,0x04cf14fc) */
/* WARNING: Removing unreachable block (ram,0x04cf1504) */
/* WARNING: Removing unreachable block (ram,0x04cf152c) */
/* WARNING: Removing unreachable block (ram,0x04cf1510) */
/* WARNING: Removing unreachable block (ram,0x04cf151c) */
/* WARNING: Removing unreachable block (ram,0x04cf1538) */
/* WARNING: Removing unreachable block (ram,0x04cf154c) */
/* WARNING: Removing unreachable block (ram,0x04cf1554) */
/* WARNING: Removing unreachable block (ram,0x04cf1564) */
/* WARNING: Removing unreachable block (ram,0x04cf156c) */
/* WARNING: Removing unreachable block (ram,0x04cf1594) */
/* WARNING: Removing unreachable block (ram,0x04cf1578) */
/* WARNING: Removing unreachable block (ram,0x04cf1584) */
/* WARNING: Removing unreachable block (ram,0x04cf15a0) */
/* WARNING: Removing unreachable block (ram,0x04cf16b0) */
/* WARNING: Removing unreachable block (ram,0x04cf15b0) */
/* WARNING: Removing unreachable block (ram,0x04cf15c0) */
/* WARNING: Removing unreachable block (ram,0x04cf15cc) */
/* WARNING: Removing unreachable block (ram,0x04cf15d8) */
/* WARNING: Removing unreachable block (ram,0x04cf15e0) */
/* WARNING: Removing unreachable block (ram,0x04cf1608) */
/* WARNING: Removing unreachable block (ram,0x04cf15ec) */
/* WARNING: Removing unreachable block (ram,0x04cf15f8) */
/* WARNING: Removing unreachable block (ram,0x04cf1614) */
/* WARNING: Removing unreachable block (ram,0x04cf1738) */
/* WARNING: Removing unreachable block (ram,0x04cf163c) */
/* WARNING: Removing unreachable block (ram,0x04cf164c) */
/* WARNING: Removing unreachable block (ram,0x04cf1650) */
/* WARNING: Removing unreachable block (ram,0x04cf173c) */
/* WARNING: Removing unreachable block (ram,0x04cf1740) */
/* WARNING: Removing unreachable block (ram,0x04cf1760) */
/* WARNING: Removing unreachable block (ram,0x04cf1774) */
/* WARNING: Removing unreachable block (ram,0x04cf1778) */
/* WARNING: Removing unreachable block (ram,0x04cf179c) */
/* WARNING: Removing unreachable block (ram,0x04cf17bc) */
/* WARNING: Removing unreachable block (ram,0x04cf17c8) */
/* WARNING: Removing unreachable block (ram,0x04cf17cc) */
/* WARNING: Removing unreachable block (ram,0x04cf17e4) */
/* WARNING: Removing unreachable block (ram,0x04cf17ec) */
/* WARNING: Removing unreachable block (ram,0x04cf1814) */
/* WARNING: Removing unreachable block (ram,0x04cf17f8) */
/* WARNING: Removing unreachable block (ram,0x04cf1804) */
/* WARNING: Removing unreachable block (ram,0x04cf1820) */
/* WARNING: Removing unreachable block (ram,0x04cf182c) */
/* WARNING: Removing unreachable block (ram,0x04cf1830) */
/* WARNING: Removing unreachable block (ram,0x04cf1838) */
/* WARNING: Removing unreachable block (ram,0x04cf188c) */
/* WARNING: Removing unreachable block (ram,0x04cf18ac) */
/* WARNING: Removing unreachable block (ram,0x04cf18b8) */
/* WARNING: Removing unreachable block (ram,0x04cf1918) */
/* WARNING: Removing unreachable block (ram,0x04cf1900) */
/* WARNING: Removing unreachable block (ram,0x04cf191c) */
/* WARNING: Removing unreachable block (ram,0x04cf1940) */
/* WARNING: Removing unreachable block (ram,0x04cf194c) */
/* WARNING: Removing unreachable block (ram,0x04cf1994) */
/* WARNING: Removing unreachable block (ram,0x04cf1e4c) */
/* WARNING: Removing unreachable block (ram,0x04cf199c) */
/* WARNING: Removing unreachable block (ram,0x04cf1e58) */
/* WARNING: Removing unreachable block (ram,0x04cf19a4) */
/* WARNING: Removing unreachable block (ram,0x04cf19b0) */
/* WARNING: Removing unreachable block (ram,0x04cf19b4) */
/* WARNING: Removing unreachable block (ram,0x04cf19c4) */
/* WARNING: Removing unreachable block (ram,0x04cf19c8) */
/* WARNING: Removing unreachable block (ram,0x04cf19fc) */
/* WARNING: Removing unreachable block (ram,0x04cf19e4) */
/* WARNING: Removing unreachable block (ram,0x04cf1a00) */
/* WARNING: Removing unreachable block (ram,0x04cf1a10) */
/* WARNING: Removing unreachable block (ram,0x04cf1a1c) */
/* WARNING: Removing unreachable block (ram,0x04cf1a40) */
/* WARNING: Removing unreachable block (ram,0x04cf1a4c) */
/* WARNING: Removing unreachable block (ram,0x04cf1a58) */
/* WARNING: Removing unreachable block (ram,0x04cf1a60) */
/* WARNING: Removing unreachable block (ram,0x04cf1a88) */
/* WARNING: Removing unreachable block (ram,0x04cf1a6c) */
/* WARNING: Removing unreachable block (ram,0x04cf1a78) */
/* WARNING: Removing unreachable block (ram,0x04cf1a94) */
/* WARNING: Removing unreachable block (ram,0x04cf1aa8) */
/* WARNING: Removing unreachable block (ram,0x04cf1ac0) */
/* WARNING: Removing unreachable block (ram,0x04cf1ac8) */
/* WARNING: Removing unreachable block (ram,0x04cf1af0) */
/* WARNING: Removing unreachable block (ram,0x04cf1ad4) */
/* WARNING: Removing unreachable block (ram,0x04cf1ae0) */
/* WARNING: Removing unreachable block (ram,0x04cf1afc) */
/* WARNING: Removing unreachable block (ram,0x04cf1d94) */
/* WARNING: Removing unreachable block (ram,0x04cf1b0c) */
/* WARNING: Removing unreachable block (ram,0x04cf1b1c) */
/* WARNING: Removing unreachable block (ram,0x04cf1b28) */
/* WARNING: Removing unreachable block (ram,0x04cf1b34) */
/* WARNING: Removing unreachable block (ram,0x04cf1b3c) */
/* WARNING: Removing unreachable block (ram,0x04cf1b64) */
/* WARNING: Removing unreachable block (ram,0x04cf1b48) */
/* WARNING: Removing unreachable block (ram,0x04cf1b54) */
/* WARNING: Removing unreachable block (ram,0x04cf1b70) */
/* WARNING: Removing unreachable block (ram,0x04cf1bc4) */
/* WARNING: Removing unreachable block (ram,0x04cf1bc8) */
/* WARNING: Removing unreachable block (ram,0x04cf1e38) */
/* WARNING: Removing unreachable block (ram,0x04cf1bf0) */
/* WARNING: Removing unreachable block (ram,0x04cf1c18) */
/* WARNING: Removing unreachable block (ram,0x04cf1c00) */
/* WARNING: Removing unreachable block (ram,0x04cf1c1c) */
/* WARNING: Removing unreachable block (ram,0x04cf1c44) */
/* WARNING: Removing unreachable block (ram,0x04cf1c2c) */
/* WARNING: Removing unreachable block (ram,0x04cf1c48) */
/* WARNING: Removing unreachable block (ram,0x04cf1c54) */
/* WARNING: Removing unreachable block (ram,0x04cf1c58) */
/* WARNING: Removing unreachable block (ram,0x04cf1c6c) */
/* WARNING: Removing unreachable block (ram,0x04cf1c70) */
/* WARNING: Removing unreachable block (ram,0x04cf1ccc) */
/* WARNING: Removing unreachable block (ram,0x04cf1cd0) */
/* WARNING: Removing unreachable block (ram,0x04cf1e3c) */
/* WARNING: Removing unreachable block (ram,0x04cf1e40) */
/* WARNING: Removing unreachable block (ram,0x04cf1e60) */
/* WARNING: Removing unreachable block (ram,0x04cf1e74) */
/* WARNING: Removing unreachable block (ram,0x04cf1e78) */
/* WARNING: Removing unreachable block (ram,0x04cf1e80) */
/* WARNING: Removing unreachable block (ram,0x04cf1ea0) */
/* WARNING: Removing unreachable block (ram,0x04cf1ec0) */
/* WARNING: Removing unreachable block (ram,0x04cf1ecc) */
/* WARNING: Removing unreachable block (ram,0x04cf1ed0) */
/* WARNING: Removing unreachable block (ram,0x04cf1ee8) */
/* WARNING: Removing unreachable block (ram,0x04cf1ef0) */
/* WARNING: Removing unreachable block (ram,0x04cf1f18) */
/* WARNING: Removing unreachable block (ram,0x04cf1efc) */
/* WARNING: Removing unreachable block (ram,0x04cf1f08) */
/* WARNING: Removing unreachable block (ram,0x04cf1f24) */
/* WARNING: Removing unreachable block (ram,0x04cf1f30) */
/* WARNING: Removing unreachable block (ram,0x04cf1f34) */
/* WARNING: Removing unreachable block (ram,0x04cf1f3c) */
/* WARNING: Removing unreachable block (ram,0x04cf1f60) */
/* WARNING: Removing unreachable block (ram,0x04cf1f68) */
/* WARNING: Removing unreachable block (ram,0x04cf1f70) */
/* WARNING: Removing unreachable block (ram,0x04cf1f84) */
/* WARNING: Removing unreachable block (ram,0x04cf1f90) */
/* WARNING: Removing unreachable block (ram,0x04cf1f9c) */
/* WARNING: Removing unreachable block (ram,0x04cf1fa4) */
/* WARNING: Removing unreachable block (ram,0x04cf1fcc) */
/* WARNING: Removing unreachable block (ram,0x04cf1fb0) */
/* WARNING: Removing unreachable block (ram,0x04cf1fbc) */
/* WARNING: Removing unreachable block (ram,0x04cf1fdc) */
/* WARNING: Removing unreachable block (ram,0x04cf1fec) */
/* WARNING: Removing unreachable block (ram,0x04cf1ffc) */
/* WARNING: Removing unreachable block (ram,0x04cf2008) */
/* WARNING: Removing unreachable block (ram,0x04cf1eac) */
/* WARNING: Removing unreachable block (ram,0x04cf1d98) */
/* WARNING: Removing unreachable block (ram,0x04cf1d9c) */
/* WARNING: Removing unreachable block (ram,0x04cf1db4) */
/* WARNING: Removing unreachable block (ram,0x04cf1dbc) */
/* WARNING: Removing unreachable block (ram,0x04cf1de4) */
/* WARNING: Removing unreachable block (ram,0x04cf1dc8) */
/* WARNING: Removing unreachable block (ram,0x04cf1dd4) */
/* WARNING: Removing unreachable block (ram,0x04cf1df0) */
/* WARNING: Removing unreachable block (ram,0x04cf1dfc) */
/* WARNING: Removing unreachable block (ram,0x04cf1e00) */
/* WARNING: Removing unreachable block (ram,0x04cf1e14) */
/* WARNING: Removing unreachable block (ram,0x04cf1cf4) */
/* WARNING: Removing unreachable block (ram,0x04cf1d1c) */
/* WARNING: Removing unreachable block (ram,0x04cf1d04) */
/* WARNING: Removing unreachable block (ram,0x04cf1d20) */
/* WARNING: Removing unreachable block (ram,0x04cf1d48) */
/* WARNING: Removing unreachable block (ram,0x04cf1d30) */
/* WARNING: Removing unreachable block (ram,0x04cf1d4c) */
/* WARNING: Removing unreachable block (ram,0x04cf1d58) */
/* WARNING: Removing unreachable block (ram,0x04cf1d5c) */
/* WARNING: Removing unreachable block (ram,0x04cf1d70) */
/* WARNING: Removing unreachable block (ram,0x04cf1d74) */
/* WARNING: Removing unreachable block (ram,0x04cf17a8) */
/* WARNING: Removing unreachable block (ram,0x04cf16b4) */
/* WARNING: Removing unreachable block (ram,0x04cf16b8) */
/* WARNING: Removing unreachable block (ram,0x04cf16d0) */
/* WARNING: Removing unreachable block (ram,0x04cf16d8) */
/* WARNING: Removing unreachable block (ram,0x04cf1700) */
/* WARNING: Removing unreachable block (ram,0x04cf16e4) */
/* WARNING: Removing unreachable block (ram,0x04cf16f0) */
/* WARNING: Removing unreachable block (ram,0x04cf170c) */
/* WARNING: Removing unreachable block (ram,0x04cf1718) */
/* WARNING: Removing unreachable block (ram,0x04cf171c) */
/* WARNING: Removing unreachable block (ram,0x04cf1684) */
/* WARNING: Removing unreachable block (ram,0x04cf1694) */
/* WARNING: Removing unreachable block (ram,0x04cf1698) */
/* WARNING: Removing unreachable block (ram,0x04cf137c) */
/* WARNING: Removing unreachable block (ram,0x04cf1284) */
/* WARNING: Removing unreachable block (ram,0x04cf1288) */
/* WARNING: Removing unreachable block (ram,0x04cf12a0) */
/* WARNING: Removing unreachable block (ram,0x04cf12a8) */
/* WARNING: Removing unreachable block (ram,0x04cf12d0) */
/* WARNING: Removing unreachable block (ram,0x04cf12b4) */
/* WARNING: Removing unreachable block (ram,0x04cf12c0) */
/* WARNING: Removing unreachable block (ram,0x04cf12dc) */
/* WARNING: Removing unreachable block (ram,0x04cf12e8) */
/* WARNING: Removing unreachable block (ram,0x04cf12ec) */
/* WARNING: Removing unreachable block (ram,0x04cf1248) */
/* WARNING: Removing unreachable block (ram,0x04cf125c) */
/* WARNING: Removing unreachable block (ram,0x04cf1260) */
/* WARNING: Removing unreachable block (ram,0x04cf0f18) */
/* WARNING: Removing unreachable block (ram,0x04cf0e20) */
/* WARNING: Removing unreachable block (ram,0x04cf0e24) */
/* WARNING: Removing unreachable block (ram,0x04cf0e3c) */
/* WARNING: Removing unreachable block (ram,0x04cf0e44) */
/* WARNING: Removing unreachable block (ram,0x04cf0e6c) */
/* WARNING: Removing unreachable block (ram,0x04cf0e50) */
/* WARNING: Removing unreachable block (ram,0x04cf0e5c) */
/* WARNING: Removing unreachable block (ram,0x04cf0e78) */
/* WARNING: Removing unreachable block (ram,0x04cf0e84) */
/* WARNING: Removing unreachable block (ram,0x04cf0e88) */
/* WARNING: Removing unreachable block (ram,0x04cf0de8) */
/* WARNING: Removing unreachable block (ram,0x04cf0dfc) */
/* WARNING: Removing unreachable block (ram,0x04cf0e00) */
/* WARNING: Removing unreachable block (ram,0x0544f7a0) */
/* WARNING: Removing unreachable block (ram,0x0544f7b0) */
/* WARNING: Removing unreachable block (ram,0x0544f7b4) */
/* WARNING: Removing unreachable block (ram,0x0544f724) */
/* WARNING: Removing unreachable block (ram,0x0544f734) */
/* WARNING: Removing unreachable block (ram,0x0544f738) */
/* WARNING: Removing unreachable block (ram,0x0544f6a8) */
/* WARNING: Removing unreachable block (ram,0x0544f6b8) */
/* WARNING: Removing unreachable block (ram,0x0544f6bc) */
/* WARNING: Removing unreachable block (ram,0x0544f62c) */
/* WARNING: Removing unreachable block (ram,0x0544f63c) */
/* WARNING: Removing unreachable block (ram,0x0544f640) */
/* WARNING: Removing unreachable block (ram,0x0544f5b0) */
/* WARNING: Removing unreachable block (ram,0x0544f5c0) */
/* WARNING: Removing unreachable block (ram,0x0544f5c4) */
/* WARNING: Removing unreachable block (ram,0x0544f534) */
/* WARNING: Removing unreachable block (ram,0x0544f544) */
/* WARNING: Removing unreachable block (ram,0x0544f548) */
/* WARNING: Removing unreachable block (ram,0x0544f4b8) */
/* WARNING: Removing unreachable block (ram,0x0544f4c8) */
/* WARNING: Removing unreachable block (ram,0x0544f4cc) */
/* WARNING: Removing unreachable block (ram,0x0544f43c) */
/* WARNING: Removing unreachable block (ram,0x0544f44c) */
/* WARNING: Removing unreachable block (ram,0x0544f450) */
/* WARNING: Removing unreachable block (ram,0x0544f3c0) */
/* WARNING: Removing unreachable block (ram,0x0544f3d0) */
/* WARNING: Removing unreachable block (ram,0x0544f3d4) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_047e11a4(undefined1 param_1 [16],undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 long param_5)

{
  undefined *puVar1;
  byte bVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  long *plVar5;
  undefined8 *puVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  int *piVar10;
  long lVar11;
  float fVar12;
  float fVar13;
  undefined8 uVar14;
  
  if ((bRam000000000a451612 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09eb5968);
    func_0x0415191c(PTR_DAT_09ec1748);
    func_0x0415191c(PTR_DAT_09eceb88);
    func_0x0415191c(PTR_DAT_09ecead8);
    bRam000000000a451612 = 1;
  }
  plVar5 = (long *)func_0x04557a08(0);
  puVar1 = PTR_DAT_09eb5968;
  if (plVar5 != (long *)0x0) {
    lVar7 = *plVar5;
    uVar9 = (ulong)*(ushort *)(lVar7 + 0x12e);
    if (uVar9 != 0) {
      piVar10 = (int *)(*(long *)(lVar7 + 0xb0) + 8);
      do {
        if (*(long *)(piVar10 + -2) == *(long *)PTR_DAT_09ec1748) {
          puVar6 = (undefined8 *)(lVar7 + (long)*piVar10 * 0x10 + 0x138);
          goto code_r0x047e126c;
        }
        uVar9 = uVar9 - 1;
        piVar10 = piVar10 + 4;
      } while (uVar9 != 0);
    }
    puVar6 = (undefined8 *)func_0x041cb4c4(plVar5,*(long *)PTR_DAT_09ec1748,0);
code_r0x047e126c:
    uVar14 = (*(code *)*puVar6)(plVar5,puVar6[1]);
    uVar3 = func_0x08f1ade8(0);
    uVar4 = func_0x08f1adc0(0);
    if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
      func_0x04151a94(*(long *)puVar1);
    }
    fVar12 = (float)func_0x04bb6b48(uVar14,param_2,param_3,param_4,_UNK_01af9584,uVar3,uVar4,0);
    puVar1 = PTR_DAT_09ecead8;
    lVar7 = *(long *)(param_5 + 0x20);
    if (lVar7 != 0) {
      lVar11 = 0;
      uVar9 = 0;
      do {
        if ((long)*(int *)(lVar7 + 0x18) <= (long)uVar9) {
          return;
        }
        lVar7 = func_0x06cc43b0(lVar7,uVar9 & 0xffffffff,*(undefined8 *)puVar1);
        if (lVar7 == 0) break;
        if (*(char *)(lVar7 + 0xb4) == '\0') {
          lVar8 = *(long *)(param_5 + 0x40);
          if (lVar8 == 0) break;
          if (*(uint *)(lVar8 + 0x18) <= uVar9) {
            lVar7 = func_0x04151bc0();
            if ((bRam000000000a451613 & 1) == 0) {
              func_0x0415191c(PTR_DAT_09ec45e0);
              bRam000000000a451613 = 1;
            }
            plVar5 = (long *)FUN_047ce0f0(lVar7);
            if (plVar5 == (long *)0x0) {
              func_0x04151bb8();
              puVar1 = PTR_DAT_09ecec58;
              if ((bRam000000000a451614 & 1) == 0) {
                func_0x0415191c(PTR_DAT_09ecec60);
                func_0x0415191c(PTR_DAT_09ecec68);
                func_0x0415191c(PTR_DAT_09ecec70);
                func_0x0415191c(PTR_DAT_09ecec78);
                func_0x0415191c(PTR_DAT_09ecec58);
                bRam000000000a451614 = 1;
              }
              func_0x04151ba8(*(undefined8 *)puVar1);
              return;
            }
            lVar11 = *plVar5;
            uVar9 = (ulong)*(ushort *)(lVar11 + 0x12e);
            if (uVar9 == 0) goto code_r0x047e140c;
            piVar10 = (int *)(*(long *)(lVar11 + 0xb0) + 8);
            goto code_r0x047e13f4;
          }
          uVar3 = *(undefined4 *)(lVar8 + lVar11 + 0x20);
          fVar13 = *(float *)(lVar8 + lVar11 + 0x24);
          func_0x047e9568(uVar3,lVar7,0);
          func_0x047e98c0(0,lVar7,0);
          *(undefined4 *)(lVar7 + 0x44) = uVar3;
          *(float *)(lVar7 + 0x48) = fVar12 * 0.5 + fVar13;
        }
        lVar7 = *(long *)(param_5 + 0x20);
        uVar9 = uVar9 + 1;
        lVar11 = lVar11 + 8;
      } while (lVar7 != 0);
    }
  }
  func_0x04151bb8();
  return;
  while( true ) {
    uVar9 = uVar9 - 1;
    piVar10 = piVar10 + 4;
    if (uVar9 == 0) break;
code_r0x047e13f4:
    if (*(long *)(piVar10 + -2) == *(long *)PTR_DAT_09ec45e0) {
      puVar6 = (undefined8 *)(lVar11 + (long)(*piVar10 + 8) * 0x10 + 0x138);
      goto code_r0x047e142c;
    }
  }
code_r0x047e140c:
  puVar6 = (undefined8 *)func_0x041cb4c4(plVar5,*(long *)PTR_DAT_09ec45e0,8);
code_r0x047e142c:
  bVar2 = (*(code *)*puVar6)(plVar5,puVar6[1]);
  *(byte *)(lVar7 + 0x29) = bVar2 & 1;
  return;
}


```

## FriendParty..ctor (off 0x46d5a5c)

```c

/* WARNING: Possible PIC construction at 0x047d9c18: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047d9e5c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047d9ed8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047d9fe8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047da0a0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047da0d0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047da158: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047da37c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x042b1318: Changing call to branch */
/* WARNING: Possible PIC construction at 0x042b13c0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x042b13e8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x042b1454: Changing call to branch */
/* WARNING: Possible PIC construction at 0x042b14fc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x042b1524: Changing call to branch */
/* WARNING: Possible PIC construction at 0x042b1590: Changing call to branch */
/* WARNING: Possible PIC construction at 0x042b1638: Changing call to branch */
/* WARNING: Possible PIC construction at 0x042b1658: Changing call to branch */
/* WARNING: Possible PIC construction at 0x042b16c0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x061ec82c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x061ec9b4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047da8d8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047da98c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047da9bc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x047da990) */
/* WARNING: Removing unreachable block (ram,0x047da998) */
/* WARNING: Removing unreachable block (ram,0x047da9a4) */
/* WARNING: Removing unreachable block (ram,0x047da8dc) */
/* WARNING: Removing unreachable block (ram,0x047da8e4) */
/* WARNING: Removing unreachable block (ram,0x047da8f0) */
/* WARNING: Removing unreachable block (ram,0x047da908) */
/* WARNING: Removing unreachable block (ram,0x047da914) */
/* WARNING: Removing unreachable block (ram,0x047da92c) */
/* WARNING: Removing unreachable block (ram,0x047da93c) */
/* WARNING: Removing unreachable block (ram,0x047da974) */
/* WARNING: Removing unreachable block (ram,0x047da97c) */
/* WARNING: Removing unreachable block (ram,0x047da984) */
/* WARNING: Removing unreachable block (ram,0x047da944) */
/* WARNING: Removing unreachable block (ram,0x061ec9b8) */
/* WARNING: Removing unreachable block (ram,0x061ec830) */
/* WARNING: Removing unreachable block (ram,0x061ec848) */
/* WARNING: Removing unreachable block (ram,0x042b16c4) */
/* WARNING: Removing unreachable block (ram,0x04283598) */
/* WARNING: Removing unreachable block (ram,0x08f53328) */
/* WARNING: Removing unreachable block (ram,0x08f4d1b0) */
/* WARNING: Removing unreachable block (ram,0x08f4d1d0) */
/* WARNING: Removing unreachable block (ram,0x08f4d1e4) */
/* WARNING: Removing unreachable block (ram,0x08f4d1f0) */
/* WARNING: Removing unreachable block (ram,0x08f4d1f4) */
/* WARNING: Removing unreachable block (ram,0x042b165c) */
/* WARNING: Removing unreachable block (ram,0x042b163c) */
/* WARNING: Removing unreachable block (ram,0x042b1594) */
/* WARNING: Removing unreachable block (ram,0x042b15b4) */
/* WARNING: Removing unreachable block (ram,0x042b1598) */
/* WARNING: Removing unreachable block (ram,0x042b1528) */
/* WARNING: Removing unreachable block (ram,0x042b1500) */
/* WARNING: Removing unreachable block (ram,0x042b1458) */
/* WARNING: Removing unreachable block (ram,0x042b1478) */
/* WARNING: Removing unreachable block (ram,0x042b145c) */
/* WARNING: Removing unreachable block (ram,0x042b13ec) */
/* WARNING: Removing unreachable block (ram,0x042b13c4) */
/* WARNING: Removing unreachable block (ram,0x042b131c) */
/* WARNING: Removing unreachable block (ram,0x042b133c) */
/* WARNING: Removing unreachable block (ram,0x042b1320) */
/* WARNING: Removing unreachable block (ram,0x047da380) */
/* WARNING: Removing unreachable block (ram,0x047da15c) */
/* WARNING: Removing unreachable block (ram,0x047da16c) */
/* WARNING: Removing unreachable block (ram,0x047da174) */
/* WARNING: Removing unreachable block (ram,0x047da1e8) */
/* WARNING: Removing unreachable block (ram,0x047da180) */
/* WARNING: Removing unreachable block (ram,0x047da18c) */
/* WARNING: Removing unreachable block (ram,0x047da1f8) */
/* WARNING: Removing unreachable block (ram,0x047da218) */
/* WARNING: Removing unreachable block (ram,0x047da220) */
/* WARNING: Removing unreachable block (ram,0x047da248) */
/* WARNING: Removing unreachable block (ram,0x047da22c) */
/* WARNING: Removing unreachable block (ram,0x047da238) */
/* WARNING: Removing unreachable block (ram,0x047da254) */
/* WARNING: Removing unreachable block (ram,0x047da264) */
/* WARNING: Removing unreachable block (ram,0x047da280) */
/* WARNING: Removing unreachable block (ram,0x047da288) */
/* WARNING: Removing unreachable block (ram,0x047da2b0) */
/* WARNING: Removing unreachable block (ram,0x047da294) */
/* WARNING: Removing unreachable block (ram,0x047da2a0) */
/* WARNING: Removing unreachable block (ram,0x047da2c0) */
/* WARNING: Removing unreachable block (ram,0x047da33c) */
/* WARNING: Removing unreachable block (ram,0x047da354) */
/* WARNING: Removing unreachable block (ram,0x047da384) */
/* WARNING: Removing unreachable block (ram,0x047da364) */
/* WARNING: Removing unreachable block (ram,0x047da0d4) */
/* WARNING: Removing unreachable block (ram,0x047da0ec) */
/* WARNING: Removing unreachable block (ram,0x047da0f4) */
/* WARNING: Removing unreachable block (ram,0x047da11c) */
/* WARNING: Removing unreachable block (ram,0x047da100) */
/* WARNING: Removing unreachable block (ram,0x047da10c) */
/* WARNING: Removing unreachable block (ram,0x047da128) */
/* WARNING: Removing unreachable block (ram,0x047da19c) */
/* WARNING: Removing unreachable block (ram,0x047da1a4) */
/* WARNING: Removing unreachable block (ram,0x047da1bc) */
/* WARNING: Removing unreachable block (ram,0x047da390) */
/* WARNING: Removing unreachable block (ram,0x047da398) */
/* WARNING: Removing unreachable block (ram,0x047da3a4) */
/* WARNING: Removing unreachable block (ram,0x047da1cc) */
/* WARNING: Removing unreachable block (ram,0x047da37c) */
/* WARNING: Removing unreachable block (ram,0x047da13c) */
/* WARNING: Removing unreachable block (ram,0x047da14c) */
/* WARNING: Removing unreachable block (ram,0x047da0a4) */
/* WARNING: Removing unreachable block (ram,0x047da0ac) */
/* WARNING: Removing unreachable block (ram,0x047da0b8) */
/* WARNING: Removing unreachable block (ram,0x085fc77c) */
/* WARNING: Removing unreachable block (ram,0x047d9fec) */
/* WARNING: Removing unreachable block (ram,0x047d9edc) */
/* WARNING: Removing unreachable block (ram,0x047d9ee4) */
/* WARNING: Removing unreachable block (ram,0x047d9ef0) */
/* WARNING: Removing unreachable block (ram,0x047d9ef8) */
/* WARNING: Removing unreachable block (ram,0x047d9f08) */
/* WARNING: Removing unreachable block (ram,0x047d9f60) */
/* WARNING: Removing unreachable block (ram,0x047d9f70) */
/* WARNING: Removing unreachable block (ram,0x047d9f78) */
/* WARNING: Removing unreachable block (ram,0x047d9fa8) */
/* WARNING: Removing unreachable block (ram,0x047d9f80) */
/* WARNING: Removing unreachable block (ram,0x047d9f94) */
/* WARNING: Removing unreachable block (ram,0x047d9fac) */
/* WARNING: Removing unreachable block (ram,0x047d9fc4) */
/* WARNING: Removing unreachable block (ram,0x047d9ff0) */
/* WARNING: Removing unreachable block (ram,0x047d9fd4) */
/* WARNING: Removing unreachable block (ram,0x047d9f14) */
/* WARNING: Removing unreachable block (ram,0x047d9f1c) */
/* WARNING: Removing unreachable block (ram,0x047d9f34) */
/* WARNING: Removing unreachable block (ram,0x047d9f9c) */
/* WARNING: Removing unreachable block (ram,0x047d9ff4) */
/* WARNING: Removing unreachable block (ram,0x047da000) */
/* WARNING: Removing unreachable block (ram,0x047da00c) */
/* WARNING: Removing unreachable block (ram,0x047da3b0) */
/* WARNING: Removing unreachable block (ram,0x047da010) */
/* WARNING: Removing unreachable block (ram,0x047da028) */
/* WARNING: Removing unreachable block (ram,0x047da030) */
/* WARNING: Removing unreachable block (ram,0x047da058) */
/* WARNING: Removing unreachable block (ram,0x047da03c) */
/* WARNING: Removing unreachable block (ram,0x047da048) */
/* WARNING: Removing unreachable block (ram,0x047da064) */
/* WARNING: Removing unreachable block (ram,0x047d9f44) */
/* WARNING: Removing unreachable block (ram,0x047d9fe8) */
/* WARNING: Removing unreachable block (ram,0x047d9e60) */
/* WARNING: Removing unreachable block (ram,0x047d9c1c) */
/* WARNING: Removing unreachable block (ram,0x047d9c34) */
/* WARNING: Removing unreachable block (ram,0x047d9c4c) */
/* WARNING: Removing unreachable block (ram,0x047d9c54) */
/* WARNING: Removing unreachable block (ram,0x047d9c7c) */
/* WARNING: Removing unreachable block (ram,0x047d9c60) */
/* WARNING: Removing unreachable block (ram,0x047d9c6c) */
/* WARNING: Removing unreachable block (ram,0x047d9c88) */
/* WARNING: Removing unreachable block (ram,0x047d9ca8) */
/* WARNING: Removing unreachable block (ram,0x047d9cbc) */
/* WARNING: Removing unreachable block (ram,0x047d9ccc) */
/* WARNING: Removing unreachable block (ram,0x047d9cd4) */
/* WARNING: Removing unreachable block (ram,0x047d9cfc) */
/* WARNING: Removing unreachable block (ram,0x047d9ce0) */
/* WARNING: Removing unreachable block (ram,0x047d9cec) */
/* WARNING: Removing unreachable block (ram,0x047d9d08) */
/* WARNING: Removing unreachable block (ram,0x047d9d74) */
/* WARNING: Removing unreachable block (ram,0x047d9d90) */
/* WARNING: Removing unreachable block (ram,0x047d9da8) */
/* WARNING: Removing unreachable block (ram,0x047d9e74) */
/* WARNING: Removing unreachable block (ram,0x047d9db8) */
/* WARNING: Removing unreachable block (ram,0x047d9d20) */
/* WARNING: Removing unreachable block (ram,0x047d9d28) */
/* WARNING: Removing unreachable block (ram,0x047d9d44) */
/* WARNING: Removing unreachable block (ram,0x047d9d4c) */
/* WARNING: Removing unreachable block (ram,0x047d9dd0) */
/* WARNING: Removing unreachable block (ram,0x047d9d58) */
/* WARNING: Removing unreachable block (ram,0x047d9d64) */
/* WARNING: Removing unreachable block (ram,0x047d9de0) */
/* WARNING: Removing unreachable block (ram,0x047d9e20) */
/* WARNING: Removing unreachable block (ram,0x047d9e38) */
/* WARNING: Removing unreachable block (ram,0x047d9e64) */
/* WARNING: Removing unreachable block (ram,0x047d9e80) */
/* WARNING: Removing unreachable block (ram,0x047d9e8c) */
/* WARNING: Removing unreachable block (ram,0x047d9e98) */
/* WARNING: Removing unreachable block (ram,0x047d9e48) */
/* WARNING: Removing unreachable block (ram,0x047d9e5c) */
/* WARNING: Removing unreachable block (ram,0x047da9c0) */
/* WARNING: Removing unreachable block (ram,0x047da9c8) */
/* WARNING: Removing unreachable block (ram,0x047da9d0) */
/* WARNING: Removing unreachable block (ram,0x047da9ec) */
/* WARNING: Removing unreachable block (ram,0x047da9dc) */
/* WARNING: Removing unreachable block (ram,0x047da9f0) */
/* WARNING: Removing unreachable block (ram,0x047da9f8) */
/* WARNING: Removing unreachable block (ram,0x047daa0c) */
/* WARNING: Removing unreachable block (ram,0x047db128) */
/* WARNING: Removing unreachable block (ram,0x047db148) */
/* WARNING: Removing unreachable block (ram,0x047db15c) */
/* WARNING: Removing unreachable block (ram,0x047db16c) */
/* WARNING: Removing unreachable block (ram,0x047db174) */
/* WARNING: Removing unreachable block (ram,0x047db19c) */
/* WARNING: Removing unreachable block (ram,0x047db180) */
/* WARNING: Removing unreachable block (ram,0x047db18c) */
/* WARNING: Removing unreachable block (ram,0x047db1a8) */
/* WARNING: Removing unreachable block (ram,0x047db1b4) */
/* WARNING: Removing unreachable block (ram,0x047db138) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong * FUN_047d9a5c(long param_1)

{
  char cVar1;
  undefined *puVar2;
  undefined *puVar3;
  undefined *puVar4;
  undefined *puVar5;
  bool bVar6;
  undefined4 uVar7;
  uint uVar8;
  long lVar9;
  undefined8 uVar10;
  ulong uVar11;
  ulong *puVar12;
  long lVar13;
  undefined8 uVar14;
  undefined8 *puVar15;
  ulong *puVar16;
  long *plVar17;
  long *plVar18;
  undefined8 uVar19;
  long extraout_x1;
  long extraout_x1_00;
  undefined8 uVar20;
  long in_x4;
  long lVar21;
  long *plVar22;
  ulong uVar23;
  int *piVar24;
  long *plVar25;
  long *plVar26;
  float fVar27;
  float extraout_s0;
  float extraout_s0_00;
  undefined8 extraout_d0;
  float fVar28;
  float fVar29;
  undefined1 auVar30 [16];
  undefined1 auVar31 [12];
  undefined8 uStack_170;
  undefined8 uStack_168;
  
  puVar3 = PTR_DAT_09eaddb0;
  if ((bRam000000000a45160e & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ecea98);
    func_0x0415191c(PTR_System_Func_u003CBigDecimal_u003E_TypeInfo_09eceaa0);
    func_0x0415191c(PTR_DAT_09eceaa8);
    func_0x0415191c(PTR_DAT_09eb75d0);
    func_0x0415191c(PTR_DAT_09eceab0);
    func_0x0415191c(PTR_DAT_09ec4a40);
    func_0x0415191c(PTR_DAT_09ecdd20);
    func_0x0415191c(PTR_DAT_09eb75d8);
    func_0x0415191c(PTR_DAT_09eceab8);
    func_0x0415191c(PTR_DAT_09eceac0);
    func_0x0415191c(PTR_DAT_09eceac8);
    func_0x0415191c(PTR_DAT_09ecead0);
    func_0x0415191c(PTR_DAT_09ecead8);
    func_0x0415191c(PTR_DAT_09eceae0);
    func_0x0415191c(PTR_DAT_09eceae8);
    func_0x0415191c(PTR_DAT_09eceaf0);
    func_0x0415191c(PTR_DAT_09eceaf8);
    func_0x0415191c(PTR_DAT_09eaddb0);
    bRam000000000a45160e = 1;
  }
  uVar11 = func_0x04151a04(*(undefined8 *)puVar3,6);
  if (uVar11 == 0) {
    func_0x04151bb8();
  }
  else {
    uVar8 = *(uint *)(uVar11 + 0x18);
    if (((((uVar8 != 0) && (*(undefined8 *)(uVar11 + 0x20) = _UNK_01af9390, uVar8 != 1)) &&
         (*(undefined8 *)(uVar11 + 0x28) = _UNK_01af8408, 2 < uVar8)) &&
        ((*(undefined8 *)(uVar11 + 0x30) = _UNK_01af8bc0, uVar8 != 3 &&
         (*(undefined8 *)(uVar11 + 0x38) = _UNK_01af8918, 4 < uVar8)))) &&
       (*(undefined8 *)(uVar11 + 0x40) = _UNK_01af8410, uVar8 != 5)) {
      *(undefined8 *)(uVar11 + 0x48) = _UNK_01af92e8;
      puVar12 = (ulong *)(param_1 + 0x40);
      *puVar12 = uVar11;
      goto code_r0x0413776c;
    }
  }
  auVar30 = func_0x04151bc0();
  puVar3 = PTR_DAT_09eac550;
  plVar25 = auVar30._8_8_;
  uVar10 = auVar30._0_8_;
  if ((bRam000000000a4515dd & 1) == 0) {
    func_0x0415191c(PTR_DAT_09eb5640);
    func_0x0415191c(PTR_DAT_09eac550);
    func_0x0415191c(PTR_DAT_09eccd60);
    func_0x0415191c(
                   PTR_Applibot_Framework_IFiniteStateMachine_u003CHuntSimulator_HuntState_u003E_TypeInfo_09ece8e8
                   );
    func_0x0415191c(PTR_DAT_09eb5848);
    func_0x0415191c(PTR_DAT_09ece920);
    func_0x0415191c(PTR_DAT_09eb5420);
    func_0x0415191c(PTR_DAT_09ecce28);
    func_0x0415191c(
                   PTR_Method_Game_Application_InGameHunt_HuntSimulator_WalkState_OnMoveUnit___09eceb00
                   );
    bRam000000000a4515dd = 1;
  }
  func_0x047d17c0(uVar10,plVar25);
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  if (cRam000000000a44de1c == '\0') {
    func_0x0415191c(PTR_DAT_09eac550);
    cRam000000000a44de1c = '\x01';
  }
  puVar2 = PTR_DAT_09ecce28;
  lVar13 = *(long *)puVar3;
  if (*(int *)(lVar13 + 0xe0) == 0) {
    func_0x04151a94();
    lVar13 = *(long *)puVar3;
  }
  puVar5 = PTR_Method_Game_Application_InGameHunt_HuntSimulator_WalkState_OnMoveUnit___09eceb00;
  puVar4 = PTR_DAT_09eb5640;
  lVar21 = *(long *)puVar2;
  lVar13 = *(long *)(*(long *)(lVar13 + 0xb8) + 0x48);
  if (*(int *)(lVar21 + 0xe0) == 0) {
    func_0x04151a94(lVar21);
    lVar21 = *(long *)puVar2;
  }
  uVar7 = **(undefined4 **)(lVar21 + 0xb8);
  uVar14 = func_0x04151ba8(*(undefined8 *)puVar4);
  func_0x061bc800(uVar14,uVar10,*(undefined8 *)puVar5,0);
  puVar4 = PTR_DAT_09ece920;
  puVar2 = PTR_DAT_09eb5420;
  if (lVar13 != 0) {
    func_0x042ba350(lVar13,uVar7,uVar14,0);
    if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
      func_0x04151a94();
    }
    lVar13 = func_0x054bfb50(*(undefined8 *)puVar4);
    if (((lVar13 != 0) && (plVar22 = *(long **)(lVar13 + 0x18), plVar22 != (long *)0x0)) &&
       ((*plVar22 == *(long *)PTR_DAT_09eb5848 && (plVar25 != (long *)0x0)))) {
      lVar13 = *plVar25;
      cVar1 = *(char *)((long)plVar22 + 0xdb);
      uVar11 = (ulong)*(ushort *)(lVar13 + 0x12e);
      if (uVar11 != 0) {
        piVar24 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
        do {
          if (*(long *)(piVar24 + -2) ==
              *(long *)
               PTR_Applibot_Framework_IFiniteStateMachine_u003CHuntSimulator_HuntState_u003E_TypeInfo_09ece8e8
             ) {
            puVar15 = (undefined8 *)(lVar13 + (long)(*piVar24 + 2) * 0x10 + 0x138);
            goto code_r0x047da5f0;
          }
          uVar11 = uVar11 - 1;
          piVar24 = piVar24 + 4;
        } while (uVar11 != 0);
      }
      puVar15 = (undefined8 *)func_0x041cb4c4(plVar25);
code_r0x047da5f0:
      lVar13 = (*(code *)*puVar15)(plVar25,puVar15[1]);
      if ((lVar13 != 0) && (*(long *)(lVar13 + 0x60) != 0)) {
        puVar12 = (ulong *)func_0x047cbcf0();
        if ((cVar1 != '\0') && (((ulong)puVar12 & 1) != 0)) {
          return puVar12;
        }
        if (*(int *)(*(long *)PTR_DAT_09eccd60 + 0xe0) == 0) {
          func_0x04151a94();
        }
        lVar13 = func_0x047c39bc(0);
        if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
          func_0x04151a94(*(long *)puVar3);
        }
        if (cRam000000000a44de1c == '\0') {
          func_0x0415191c(PTR_DAT_09eac550);
          cRam000000000a44de1c = '\x01';
        }
        lVar21 = *(long *)puVar3;
        if (*(int *)(lVar21 + 0xe0) == 0) {
          func_0x04151a94();
          lVar21 = *(long *)puVar3;
        }
        lVar21 = *(long *)(*(long *)(lVar21 + 0xb8) + 0x48);
        if (lVar21 != 0) {
          lVar9 = lVar13;
          if ((bRam000000000a44df27 & 1) == 0) {
            func_0x0415191c(PTR_DAT_09eadf18,uVar10,lVar13,0);
            bRam000000000a44df27 = 1;
          }
          plVar25 = *(long **)(lVar21 + 0x20);
          if (plVar25 != (long *)0x0) {
            lVar21 = *plVar25;
            uVar11 = (ulong)*(ushort *)(lVar21 + 0x12e);
            if (uVar11 != 0) {
              piVar24 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
              do {
                if (*(long *)(piVar24 + -2) == *(long *)PTR_DAT_09eadf18) {
                  puVar15 = (undefined8 *)(lVar21 + (long)(*piVar24 + 7) * 0x10 + 0x138);
                  goto code_r0x042b12a0;
                }
                uVar11 = uVar11 - 1;
                piVar24 = piVar24 + 4;
              } while (uVar11 != 0);
            }
            puVar15 = (undefined8 *)func_0x041cb4c4(plVar25,*(long *)PTR_DAT_09eadf18,7);
code_r0x042b12a0:
                    /* WARNING: Could not recover jumptable at 0x042b12bc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            puVar12 = (ulong *)(*(code *)*puVar15)(plVar25,uVar10,lVar13,puVar15[1]);
            return puVar12;
          }
          func_0x04151bb8();
          puVar3 = PTR_DAT_09eadf20;
          lVar13 = lVar9;
          if ((bRam000000000a44de9b & 1) == 0) {
            func_0x0415191c(PTR_DAT_09eadf20);
            bRam000000000a44de9b = 1;
          }
          if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
            func_0x04151a94();
          }
          puVar3 = PTR_DAT_09eab348;
          if ((bRam000000000a44dea9 & 1) == 0) {
            func_0x0415191c(PTR_DAT_09eadf28);
            func_0x0415191c(PTR_DAT_09eab348);
            bRam000000000a44dea9 = 1;
          }
          puVar2 = PTR_DAT_09eadf28;
          if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
            func_0x04151a94();
          }
          lVar21 = func_0x0557fbbc(*(undefined8 *)puVar2);
          if ((lVar9 == 0) || (lVar21 == 0)) {
            func_0x04151bb8();
            puVar3 = PTR_DAT_09eadf30;
            lVar21 = lVar13;
            if ((bRam000000000a44de9c & 1) == 0) {
              func_0x0415191c(PTR_DAT_09eadf30);
              bRam000000000a44de9c = 1;
            }
            if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
              func_0x04151a94();
            }
            puVar3 = PTR_DAT_09eab348;
            if ((bRam000000000a44dea6 & 1) == 0) {
              func_0x0415191c(PTR_DAT_09eadf38);
              func_0x0415191c(PTR_DAT_09eab348);
              bRam000000000a44dea6 = 1;
            }
            puVar2 = PTR_DAT_09eadf38;
            if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
              func_0x04151a94();
            }
            lVar9 = func_0x0557fbbc(*(undefined8 *)puVar2);
            if ((lVar13 == 0) || (lVar9 == 0)) {
              func_0x04151bb8();
              puVar3 = PTR_DAT_09eadf40;
              uStack_170 = 0xa44d000;
              uStack_168 = 0xa44d000;
              if ((bRam000000000a44de9d & 1) == 0) {
                func_0x0415191c(PTR_DAT_09eadf40);
                bRam000000000a44de9d = 1;
              }
              if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
                func_0x04151a94();
              }
              puVar3 = PTR_DAT_09eab348;
              if ((bRam000000000a44dea0 & 1) == 0) {
                func_0x0415191c(PTR_DAT_09eadf48);
                func_0x0415191c(PTR_DAT_09eab348);
                bRam000000000a44dea0 = 1;
              }
              puVar2 = PTR_DAT_09eadf48;
              if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
                func_0x04151a94();
              }
              lVar13 = func_0x0557fbbc(*(undefined8 *)puVar2);
              if ((lVar21 == 0) || (lVar13 == 0)) {
                lVar13 = func_0x04151bb8();
                puVar3 = PTR_DAT_09eadf50;
                if ((bRam000000000a44de9e & 1) == 0) {
                  func_0x0415191c(PTR_DAT_09eadf50);
                  bRam000000000a44de9e = 1;
                }
                puVar12 = (ulong *)(lVar13 + 0x38);
                *puVar12 = *(ulong *)puVar3;
              }
              else {
                *(undefined4 *)(lVar13 + 0x10) = *(undefined4 *)(lVar21 + 0x10);
                puVar12 = (ulong *)(lVar13 + 0x18);
                *puVar12 = *(ulong *)(lVar21 + 0x18);
              }
            }
            else {
              *(undefined4 *)(lVar9 + 0x10) = *(undefined4 *)(lVar13 + 0x10);
              puVar12 = (ulong *)(lVar9 + 0x18);
              *puVar12 = *(ulong *)(lVar13 + 0x18);
            }
          }
          else {
            *(undefined4 *)(lVar21 + 0x10) = *(undefined4 *)(lVar9 + 0x10);
            puVar12 = (ulong *)(lVar21 + 0x18);
            *puVar12 = *(ulong *)(lVar9 + 0x18);
          }
          goto code_r0x0413776c;
        }
      }
    }
  }
  puVar12 = (ulong *)func_0x04151bb8();
  puVar3 = PTR_DAT_09eac550;
  if ((bRam000000000a4515de & 1) == 0) {
    func_0x0415191c(PTR_DAT_09eb5640);
    func_0x0415191c(PTR_DAT_09eac550);
    func_0x0415191c(PTR_DAT_09ecce28);
    func_0x0415191c(
                   PTR_Method_Game_Application_InGameHunt_HuntSimulator_WalkState_OnMoveUnit___09eceb00
                   );
    bRam000000000a4515de = 1;
  }
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94();
  }
  if (cRam000000000a44de1c == '\0') {
    func_0x0415191c(PTR_DAT_09eac550);
    cRam000000000a44de1c = '\x01';
  }
  puVar2 = PTR_DAT_09ecce28;
  lVar13 = *(long *)puVar3;
  if (*(int *)(lVar13 + 0xe0) == 0) {
    func_0x04151a94();
    lVar13 = *(long *)puVar3;
  }
  puVar4 = PTR_Method_Game_Application_InGameHunt_HuntSimulator_WalkState_OnMoveUnit___09eceb00;
  puVar3 = PTR_DAT_09eb5640;
  lVar21 = *(long *)puVar2;
  lVar13 = *(long *)(*(long *)(lVar13 + 0xb8) + 0x48);
  if (*(int *)(lVar21 + 0xe0) == 0) {
    func_0x04151a94(lVar21);
    lVar21 = *(long *)puVar2;
  }
  uVar11 = (ulong)**(uint **)(lVar21 + 0xb8);
  plVar25 = (long *)func_0x04151ba8(*(undefined8 *)puVar3);
  plVar22 = *(long **)puVar4;
  uVar8 = 0;
  func_0x061bc800(plVar25,puVar12,plVar22,0);
  if (lVar13 != 0) {
    func_0x042ba40c(lVar13,uVar11,plVar25,0);
    puVar3 = PTR_DAT_09eac550;
    if ((bRam000000000a4515e3 & 1) == 0) {
      func_0x0415191c(PTR_DAT_09ecd8a0);
      func_0x0415191c(PTR_DAT_09eb5640);
      func_0x0415191c(
                     PTR_Method_Applibot_Framework_FiniteStateMachineState_u003CHuntSimulator_HuntState_u003E_OnLeave___09ece980
                     );
      func_0x0415191c(PTR_DAT_09eac550);
      func_0x0415191c(PTR_DAT_09eb5810);
      func_0x0415191c(PTR_DAT_09ece400);
      func_0x0415191c(
                     PTR_Method_Game_Application_InGameHunt_HuntSimulatorStateBase_OnHuntFormationUpdate___09ece930
                     );
      func_0x0415191c(
                     PTR_Method_Game_Application_InGameHunt_HuntSimulatorStateBase_OnRequestBossStock___09ece938
                     );
      func_0x0415191c(
                     PTR_Method_Game_Application_InGameHunt_HuntSimulatorStateBase_OnRequestRetire___09ece940
                     );
      func_0x0415191c(
                     PTR_Method_Game_Application_InGameHunt_HuntSimulatorStateBase_OnRestartHuntProcessRequest___09ece948
                     );
      func_0x0415191c(
                     PTR_Method_Game_Application_InGameHunt_HuntSimulatorStateBase_OnResult___09ece950
                     );
      func_0x0415191c(PTR_DAT_09eb6cf8);
      func_0x0415191c(PTR_DAT_09ecb358);
      bRam000000000a4515e3 = 1;
    }
    if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
      func_0x04151a94();
    }
    if (cRam000000000a44de1c == '\0') {
      func_0x0415191c(PTR_DAT_09eac550);
      cRam000000000a44de1c = '\x01';
    }
    puVar2 = PTR_DAT_09eb6cf8;
    lVar13 = *(long *)puVar3;
    if (*(int *)(lVar13 + 0xe0) == 0) {
      func_0x04151a94();
      lVar13 = *(long *)puVar3;
    }
    puVar5 = 
    PTR_Method_Game_Application_InGameHunt_HuntSimulatorStateBase_OnRestartHuntProcessRequest___09ece948
    ;
    puVar4 = PTR_DAT_09eb5640;
    lVar21 = *(long *)puVar2;
    lVar13 = *(long *)(*(long *)(lVar13 + 0xb8) + 0x48);
    if (*(int *)(lVar21 + 0xe0) == 0) {
      func_0x04151a94(lVar21);
      lVar21 = *(long *)puVar2;
    }
    uVar7 = **(undefined4 **)(lVar21 + 0xb8);
    uVar10 = func_0x04151ba8(*(undefined8 *)puVar4);
    uVar14 = 0;
    func_0x061bc800(uVar10,puVar12,*(undefined8 *)puVar5,0);
    if (lVar13 != 0) {
      func_0x042ba40c(lVar13,uVar7,uVar10,0);
      if (cRam000000000a44de1c == '\0') {
        func_0x0415191c(PTR_DAT_09eac550);
        cRam000000000a44de1c = '\x01';
      }
      puVar2 = PTR_DAT_09ecd8a0;
      lVar13 = *(long *)puVar3;
      if (*(int *)(lVar13 + 0xe0) == 0) {
        func_0x04151a94();
        lVar13 = *(long *)puVar3;
      }
      puVar5 = 
      PTR_Method_Game_Application_InGameHunt_HuntSimulatorStateBase_OnRequestBossStock___09ece938;
      lVar21 = *(long *)puVar2;
      lVar13 = *(long *)(*(long *)(lVar13 + 0xb8) + 0x48);
      if (*(int *)(lVar21 + 0xe0) == 0) {
        func_0x04151a94(lVar21);
        lVar21 = *(long *)puVar2;
      }
      uVar7 = **(undefined4 **)(lVar21 + 0xb8);
      uVar10 = func_0x04151ba8(*(undefined8 *)puVar4);
      uVar14 = 0;
      func_0x061bc800(uVar10,puVar12,*(undefined8 *)puVar5,0);
      if (lVar13 != 0) {
        func_0x042ba40c(lVar13,uVar7,uVar10,0);
        if (cRam000000000a44de1c == '\0') {
          func_0x0415191c(PTR_DAT_09eac550);
          cRam000000000a44de1c = '\x01';
        }
        puVar2 = PTR_DAT_09eb5810;
        lVar13 = *(long *)puVar3;
        if (*(int *)(lVar13 + 0xe0) == 0) {
          func_0x04151a94();
          lVar13 = *(long *)puVar3;
        }
        puVar5 = 
        PTR_Method_Game_Application_InGameHunt_HuntSimulatorStateBase_OnHuntFormationUpdate___09ece930
        ;
        lVar21 = *(long *)puVar2;
        lVar13 = *(long *)(*(long *)(lVar13 + 0xb8) + 0x48);
        if (*(int *)(lVar21 + 0xe0) == 0) {
          func_0x04151a94(lVar21);
          lVar21 = *(long *)puVar2;
        }
        uVar7 = **(undefined4 **)(lVar21 + 0xb8);
        uVar10 = func_0x04151ba8(*(undefined8 *)puVar4);
        uVar14 = 0;
        func_0x061bc800(uVar10,puVar12,*(undefined8 *)puVar5,0);
        if (lVar13 != 0) {
          func_0x042ba40c(lVar13,uVar7,uVar10,0);
          if (cRam000000000a44de1c == '\0') {
            func_0x0415191c(PTR_DAT_09eac550);
            cRam000000000a44de1c = '\x01';
          }
          puVar2 = PTR_DAT_09ecb358;
          lVar13 = *(long *)puVar3;
          if (*(int *)(lVar13 + 0xe0) == 0) {
            func_0x04151a94();
            lVar13 = *(long *)puVar3;
          }
          puVar5 = PTR_Method_Game_Application_InGameHunt_HuntSimulatorStateBase_OnResult___09ece950
          ;
          lVar21 = *(long *)puVar2;
          lVar13 = *(long *)(*(long *)(lVar13 + 0xb8) + 0x48);
          if (*(int *)(lVar21 + 0xe0) == 0) {
            func_0x04151a94(lVar21);
            lVar21 = *(long *)puVar2;
          }
          uVar7 = **(undefined4 **)(lVar21 + 0xb8);
          uVar10 = func_0x04151ba8(*(undefined8 *)puVar4);
          uVar14 = 0;
          func_0x061bc800(uVar10,puVar12,*(undefined8 *)puVar5,0);
          if (lVar13 != 0) {
            func_0x042ba40c(lVar13,uVar7,uVar10,0);
            if (cRam000000000a44de1c == '\0') {
              func_0x0415191c(PTR_DAT_09eac550);
              cRam000000000a44de1c = '\x01';
            }
            puVar2 = PTR_DAT_09ece400;
            lVar13 = *(long *)puVar3;
            if (*(int *)(lVar13 + 0xe0) == 0) {
              func_0x04151a94();
              lVar13 = *(long *)puVar3;
            }
            puVar3 = 
            PTR_Method_Game_Application_InGameHunt_HuntSimulatorStateBase_OnRequestRetire___09ece940
            ;
            lVar21 = *(long *)puVar2;
            lVar13 = *(long *)(*(long *)(lVar13 + 0xb8) + 0x48);
            if (*(int *)(lVar21 + 0xe0) == 0) {
              func_0x04151a94(lVar21);
              lVar21 = *(long *)puVar2;
            }
            uVar7 = **(undefined4 **)(lVar21 + 0xb8);
            uVar10 = func_0x04151ba8(*(undefined8 *)puVar4);
            uVar14 = 0;
            func_0x061bc800(uVar10,puVar12,*(undefined8 *)puVar3,0);
            puVar3 = 
            PTR_Method_Applibot_Framework_FiniteStateMachineState_u003CHuntSimulator_HuntState_u003E_OnLeave___09ece980
            ;
            if (lVar13 != 0) {
              func_0x042ba40c(lVar13,uVar7,uVar10,0);
              uVar10 = *(undefined8 *)puVar3;
              return puVar12;
            }
          }
        }
      }
    }
    auVar30 = func_0x04151bb8();
    plVar25 = auVar30._8_8_;
    puVar16 = auVar30._0_8_;
    puVar12 = puVar16;
    if ((bRam000000000a4515b7 & 1) == 0) {
      func_0x0415191c(
                     PTR_Method_Applibot_Framework_FiniteStateMachineState_u003CHuntSimulator_HuntState_u003E_ChangeState_u003CHuntSimulator_EncountStartState_u003E___09ece988
                     );
      puVar12 = (ulong *)func_0x0415191c(
                                        PTR_Method_Applibot_Framework_FiniteStateMachineState_u003CHuntSimulator_HuntState_u003E_ChangeState_u003CHuntSimulator_WalkState_u003E___09ece990
                                        );
      bRam000000000a4515b7 = 1;
    }
    plVar22 = (long *)
              PTR_Method_Applibot_Framework_FiniteStateMachineState_u003CHuntSimulator_HuntState_u003E_ChangeState_u003CHuntSimulator_EncountStartState_u003E___09ece988
    ;
    if (((*(char *)((long)puVar16 + 0x72) == '\0') &&
        (plVar22 = (long *)
                   PTR_Method_Applibot_Framework_FiniteStateMachineState_u003CHuntSimulator_HuntState_u003E_ChangeState_u003CHuntSimulator_WalkState_u003E___09ece990
        , (char)puVar16[0xe] != '\0')) && (*(char *)((long)puVar16 + 0x71) == '\0')) {
      return puVar12;
    }
    lVar13 = *plVar22;
    if (*(long *)(lVar13 + 0x38) == 0) {
      func_0x041cb41c(lVar13);
    }
    lVar21 = *(long *)(*(long *)(*(long *)(lVar13 + 0x20) + 0xc0) + 0x10);
    if ((*(byte *)(lVar21 + 0x135) & 1) == 0) {
      lVar21 = func_0x041cb3c0(lVar21);
    }
    if (plVar25 == (long *)0x0) {
      func_0x04151930(PTR_DAT_09eab1f8);
      plVar25 = (long *)func_0x04151ba8();
      uVar10 = func_0x04151930(PTR_DAT_09ee5f30);
      func_0x04263300(plVar25,uVar10,0);
      func_0x04151a84(plVar25,lVar13);
    }
    else if (*plVar25 == lVar21) {
      lVar13 = **(long **)(lVar13 + 0x38);
      puVar15 = *(undefined8 **)(lVar13 + 0x38);
      if (puVar15 == (undefined8 *)0x0) {
        func_0x0415191c(PTR_DAT_09eaa090);
        puVar15 = *(undefined8 **)(lVar13 + 0x38);
        if (puVar15 == (undefined8 *)0x0) {
          func_0x041cb41c(lVar13);
          puVar15 = *(undefined8 **)(lVar13 + 0x38);
        }
      }
      uVar10 = *puVar15;
      if (*(int *)(*(long *)PTR_DAT_09eaa090 + 0xe0) == 0) {
        func_0x04151a94();
      }
      plVar22 = (long *)func_0x085cae78(uVar10,0);
      lVar13 = *(long *)(*(long *)(*(long *)(lVar13 + 0x20) + 0xc0) + 0x170);
      if ((bRam000000000a4557ce & 1) == 0) {
        func_0x0415191c(PTR_DAT_09eeb168);
        func_0x0415191c(PTR_DAT_09ee6f68);
        bRam000000000a4557ce = 1;
      }
      plVar18 = plVar25 + 6;
      if (*plVar18 == 0) {
code_r0x061ec870:
        func_0x04151930(PTR_DAT_09eab1f8);
        uVar19 = func_0x04151ba8();
        uVar10 = func_0x04151930(PTR_DAT_09eeb170);
        uVar20 = 0;
        func_0x04263300(uVar19,uVar10,0);
      }
      else {
        lVar21 = func_0x061ebc80(plVar25,plVar22,
                                 *(undefined8 *)(*(long *)(*(long *)(lVar13 + 0x20) + 0xc0) + 0x118)
                                );
        if (lVar21 != 0) {
          lVar21 = lVar13;
          if (*(char *)((long)plVar25 + 0x45) == '\0') {
code_r0x061ec800:
            plVar18 = (long *)*plVar18;
            lVar13 = lVar21;
            if (plVar18 != (long *)0x0) {
              (**(code **)(*plVar18 + 0x1a8))(plVar18,plVar25,0,*(undefined8 *)(*plVar18 + 0x1b0));
              puVar12 = (ulong *)(plVar25 + 7);
              *puVar12 = plVar25[6];
              *(undefined4 *)(plVar25 + 8) = 0;
              goto code_r0x0413776c;
            }
          }
          else if (((*plVar18 != 0) &&
                   (plVar17 = (long *)func_0x085fcf24(*plVar18,0), plVar17 != (long *)0x0)) &&
                  (lVar21 = (**(code **)(*plVar17 + 0x2f8))
                                      (plVar17,*(undefined8 *)(*plVar17 + 0x300)),
                  puVar2 = PTR_DAT_09eeb168, puVar3 = PTR_DAT_09ee6f68, plVar22 != (long *)0x0)) {
            uVar14 = (**(code **)(*plVar22 + 0x2f8))(plVar22,*(undefined8 *)(*plVar22 + 0x300));
            in_x4 = 0;
            uVar10 = func_0x0846e250(*(undefined8 *)puVar2,lVar21,*(undefined8 *)puVar3,uVar14);
            func_0x0426d470(uVar10,0);
            goto code_r0x061ec800;
          }
          func_0x04151bb8();
          goto code_r0x061ec870;
        }
        uVar10 = *(undefined8 *)(*(long *)(*(long *)(lVar13 + 0x20) + 0xc0) + 0x28);
        func_0x04151930(PTR_DAT_09eaa090);
        func_0x03bf6968();
        uVar10 = func_0x085cae78(uVar10,0);
        func_0x03bf6978(plVar25);
        uStack_170 = 0;
        uStack_168 = 0;
        func_0x0426dc04(&uStack_170,uVar10,plVar25[2],0);
        func_0x03bf6978(plVar22);
        uVar14 = (**(code **)(*plVar22 + 0x2f8))(plVar22,*(undefined8 *)(*plVar22 + 0x300));
        uVar20 = func_0x04151930(PTR_DAT_09ee5f48);
        uVar19 = uStack_168;
        uVar10 = uStack_170;
        in_x4 = func_0x04151930(PTR_DAT_09ee5f50);
        uVar10 = func_0x03c0d608(uVar20,uVar10,uVar19,uVar14);
        func_0x04151930(PTR_DAT_09eab1f8);
        uVar19 = func_0x04151ba8();
        uVar20 = 0;
        func_0x04263300(uVar19,uVar10,0);
      }
      auVar30 = func_0x04151a84(uVar19,lVar13);
      func_0x071bf23c(auVar30._0_8_,uVar20,uVar14,
                      *(undefined8 *)(*(long *)(*(long *)(in_x4 + 0x20) + 0xc0) + 8));
      puVar12 = (ulong *)(auVar30._0_8_ + 0x20);
      *puVar12 = auVar30._8_8_;
      goto code_r0x0413776c;
    }
    auVar30 = func_0x04151f54(plVar25);
    lVar13 = auVar30._8_8_;
    if (*(long *)(lVar13 + 0x38) == 0) {
      func_0x0415191c(PTR_DAT_09eab868);
      func_0x0415191c(PTR_DAT_09eaa090);
      func_0x0415191c(PTR_DAT_09ee5f38);
      if (*(long *)(lVar13 + 0x38) == 0) {
        func_0x041cb41c(lVar13);
      }
    }
    puVar12 = (ulong *)(auVar30._0_8_ + 0x10);
    uVar11 = *puVar12;
    if (*(int *)(*(long *)PTR_DAT_09eaa090 + 0xe0) == 0) {
      func_0x04151a94();
    }
    uVar8 = func_0x085d3e24(uVar11,0,0);
    if (*(int *)(*(long *)PTR_DAT_09eab868 + 0xe0) == 0) {
      func_0x04151a94(*(long *)PTR_DAT_09eab868);
    }
    func_0x0426c138(uVar8 & 1,*(undefined8 *)PTR_DAT_09ee5f38,0);
    uVar11 = func_0x085cae78(**(undefined8 **)(lVar13 + 0x38),0);
    *puVar12 = uVar11;
code_r0x0413776c:
    if (iRam000000000a680cb0 != 0) {
      puVar16 = (ulong *)(((ulong)puVar12 >> 0x12 & 0x7fff) * 8 + 0xa4b4c88);
      do {
        cVar1 = '\x01';
        bVar6 = (bool)ExclusiveMonitorPass(puVar16,0x10);
        if (bVar6) {
          *puVar16 = *puVar16 | 1L << ((ulong)puVar12 >> 0xc & 0x3f);
          cVar1 = ExclusiveMonitorsStatus();
        }
      } while (cVar1 != '\0');
    }
    return puVar12;
  }
  auVar30 = func_0x04151bb8();
  plVar18 = auVar30._8_8_;
  if ((bRam000000000a4515df & 1) == 0) {
    func_0x0415191c(
                   PTR_Method_Applibot_Framework_FiniteStateMachineState_u003CHuntSimulator_HuntState_u003E_ChangeState_u003CHuntSimulator_EncountStartState_u003E___09ece988
                   );
    func_0x0415191c(
                   PTR_Applibot_Framework_IFiniteStateMachine_u003CHuntSimulator_HuntState_u003E_TypeInfo_09ece8e8
                   );
    bRam000000000a4515df = 1;
  }
  if (plVar18 != (long *)0x0) {
    lVar13 = *plVar18;
    uVar23 = (ulong)*(ushort *)(lVar13 + 0x12e);
    if (uVar23 != 0) {
      piVar24 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
      do {
        if (*(long *)(piVar24 + -2) ==
            *(long *)
             PTR_Applibot_Framework_IFiniteStateMachine_u003CHuntSimulator_HuntState_u003E_TypeInfo_09ece8e8
           ) {
          puVar15 = (undefined8 *)(lVar13 + (long)(*piVar24 + 2) * 0x10 + 0x138);
          goto code_r0x047da8b8;
        }
        uVar23 = uVar23 - 1;
        piVar24 = piVar24 + 4;
      } while (uVar23 != 0);
    }
    plVar22 = (long *)0x2;
    puVar15 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047da8b8:
    lVar13 = (*(code *)*puVar15)(plVar18,puVar15[1]);
    if (lVar13 != 0) {
      puVar12 = (ulong *)(auVar30._0_8_ + 0x70);
      *puVar12 = *(ulong *)(lVar13 + 0x60);
      goto code_r0x0413776c;
    }
  }
  lVar13 = func_0x04151bb8();
  if ((bRam000000000a451602 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ecdd20);
    func_0x0415191c(PTR_DAT_09ec45e0);
    bRam000000000a451602 = 1;
  }
  puVar3 = PTR_DAT_09ecdd20;
  plVar18 = *(long **)(lVar13 + 0x18);
  if (plVar18 != (long *)0x0) {
    lVar21 = *plVar18;
    uVar23 = (ulong)*(ushort *)(lVar21 + 0x12e);
    if (uVar23 != 0) {
      piVar24 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
      do {
        if (*(long *)(piVar24 + -2) == *(long *)PTR_DAT_09ecdd20) {
          puVar15 = (undefined8 *)(lVar21 + (long)(*piVar24 + 4) * 0x10 + 0x138);
          goto code_r0x047dab08;
        }
        uVar23 = uVar23 - 1;
        piVar24 = piVar24 + 4;
      } while (uVar23 != 0);
    }
    plVar22 = (long *)0x4;
    puVar15 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047dab08:
    uVar10 = (*(code *)*puVar15)(plVar18,puVar15[1]);
    if (extraout_x1 != 0) {
      func_0x047dde54(extraout_d0,uVar10,extraout_x1,0);
      plVar18 = (long *)FUN_047ce0f0(extraout_x1);
      if (plVar18 != (long *)0x0) {
        lVar21 = *plVar18;
        uVar23 = (ulong)*(ushort *)(lVar21 + 0x12e);
        if (uVar23 != 0) {
          piVar24 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
          do {
            if (*(long *)(piVar24 + -2) == *(long *)PTR_DAT_09ec45e0) {
              puVar15 = (undefined8 *)(lVar21 + (long)(*piVar24 + 7) * 0x10 + 0x138);
              goto code_r0x047dab94;
            }
            uVar23 = uVar23 - 1;
            piVar24 = piVar24 + 4;
          } while (uVar23 != 0);
        }
        plVar22 = (long *)0x7;
        puVar15 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047dab94:
        fVar27 = (float)(*(code *)*puVar15)(plVar18,puVar15[1]);
        plVar18 = *(long **)(lVar13 + 0x18);
        if (plVar18 != (long *)0x0) {
          lVar21 = *plVar18;
          uVar11 = (ulong)*(ushort *)(lVar21 + 0x12e);
          if (uVar11 != 0) {
            piVar24 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
            do {
              if (*(long *)(piVar24 + -2) == *(long *)puVar3) {
                puVar15 = (undefined8 *)(lVar21 + (long)(*piVar24 + 4) * 0x10 + 0x138);
                goto code_r0x047dabfc;
              }
              uVar11 = uVar11 - 1;
              piVar24 = piVar24 + 4;
            } while (uVar11 != 0);
          }
          puVar15 = (undefined8 *)func_0x041cb4c4(plVar18,*(long *)puVar3,4);
code_r0x047dabfc:
          puVar12 = (ulong *)(*(code *)*puVar15)(plVar18,puVar15[1]);
          if (extraout_s0 <= fVar27) {
            *(undefined1 *)(lVar13 + 0x30) = 1;
          }
          return puVar12;
        }
      }
    }
  }
  uVar10 = func_0x04151bb8();
  plVar18 = (long *)0xa451000;
  plVar17 = plVar22;
  if ((bRam000000000a4515e0 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09eaa288);
    func_0x0415191c(PTR_DAT_09ece910);
    func_0x0415191c(PTR_DAT_09ece918);
    func_0x0415191c(PTR_DAT_09eaa8d0);
    bRam000000000a4515e0 = 1;
  }
  puVar3 = PTR_DAT_09ece910;
  if (extraout_x1_00 == 0) {
code_r0x047db064:
    func_0x04151bb8();
code_r0x047db068:
    func_0x04151bb8();
    func_0x04151bb0(uVar11);
  }
  else {
    plVar26 = *(long **)(extraout_x1_00 + 0x30);
    plVar18 = (long *)0x0;
    if (plVar26 == (long *)0x0) goto code_r0x047db064;
    lVar13 = *plVar26;
    uVar23 = (ulong)*(ushort *)(lVar13 + 0x12e);
    if (uVar23 != 0) {
      piVar24 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
      do {
        if (*(long *)(piVar24 + -2) == *(long *)PTR_DAT_09ece910) {
          puVar15 = (undefined8 *)(lVar13 + (long)*piVar24 * 0x10 + 0x138);
          goto code_r0x047dacfc;
        }
        uVar23 = uVar23 - 1;
        piVar24 = piVar24 + 4;
      } while (uVar23 != 0);
    }
    plVar17 = (long *)0x0;
    puVar15 = (undefined8 *)func_0x041cb4c4(plVar26);
code_r0x047dacfc:
    plVar25 = (long *)PTR_DAT_09eaa288;
    plVar26 = (long *)(*(code *)*puVar15)(plVar26,puVar15[1]);
    puVar4 = PTR_DAT_09ece918;
    puVar2 = PTR_DAT_09eaa8d0;
    plVar18 = (long *)0x0;
    if (plVar26 == (long *)0x0) goto code_r0x047db068;
code_r0x047dad28:
    lVar13 = *plVar26;
    uVar11 = (ulong)*(ushort *)(lVar13 + 0x12e);
    if (uVar11 != 0) {
      piVar24 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
      do {
        if (*(long *)(piVar24 + -2) == *(long *)puVar2) {
          puVar15 = (undefined8 *)(lVar13 + (long)*piVar24 * 0x10 + 0x138);
          goto code_r0x047dad74;
        }
        uVar11 = uVar11 - 1;
        piVar24 = piVar24 + 4;
      } while (uVar11 != 0);
    }
    plVar17 = (long *)0x0;
    puVar15 = (undefined8 *)func_0x041cb4c4(plVar26);
code_r0x047dad74:
    uVar11 = (*(code *)*puVar15)(plVar26,puVar15[1]);
    if ((uVar11 & 1) != 0) {
      lVar13 = *plVar26;
      uVar11 = (ulong)*(ushort *)(lVar13 + 0x12e);
      if (uVar11 != 0) {
        piVar24 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
        do {
          if (*(long *)(piVar24 + -2) == *(long *)puVar4) {
            puVar15 = (undefined8 *)(lVar13 + (long)*piVar24 * 0x10 + 0x138);
            goto code_r0x047dadd0;
          }
          uVar11 = uVar11 - 1;
          piVar24 = piVar24 + 4;
        } while (uVar11 != 0);
      }
      plVar17 = (long *)0x0;
      puVar15 = (undefined8 *)func_0x041cb4c4(plVar26);
code_r0x047dadd0:
      lVar13 = (*(code *)*puVar15)(plVar26,puVar15[1]);
      if (lVar13 != 0) {
        FUN_047e4b7c(uVar10,lVar13,extraout_x1_00,0);
        plVar17 = plVar22;
        func_0x047e54a4(uVar10,lVar13,extraout_x1_00,plVar22,uVar8 & 1,0);
      }
      goto code_r0x047dad28;
    }
    uVar11 = 0;
    if (plVar26 != (long *)0x0) {
      lVar13 = *plVar26;
      uVar23 = (ulong)*(ushort *)(lVar13 + 0x12e);
      if (uVar23 != 0) {
        piVar24 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
        do {
          if (*(long *)(piVar24 + -2) == *plVar25) {
            puVar15 = (undefined8 *)(lVar13 + (long)*piVar24 * 0x10 + 0x138);
            goto code_r0x047dae6c;
          }
          uVar23 = uVar23 - 1;
          piVar24 = piVar24 + 4;
        } while (uVar23 != 0);
      }
      plVar17 = (long *)0x0;
      puVar15 = (undefined8 *)func_0x041cb4c4(plVar26);
code_r0x047dae6c:
      (*(code *)*puVar15)(plVar26,puVar15[1]);
    }
    plVar26 = *(long **)(extraout_x1_00 + 0x38);
    plVar18 = (long *)0x0;
    if (plVar26 == (long *)0x0) goto code_r0x047db064;
    lVar13 = *plVar26;
    uVar23 = (ulong)*(ushort *)(lVar13 + 0x12e);
    if (uVar23 != 0) {
      piVar24 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
      do {
        if (*(long *)(piVar24 + -2) == *(long *)puVar3) {
          puVar15 = (undefined8 *)(lVar13 + (long)*piVar24 * 0x10 + 0x138);
          goto code_r0x047daed0;
        }
        uVar23 = uVar23 - 1;
        piVar24 = piVar24 + 4;
      } while (uVar23 != 0);
    }
    plVar17 = (long *)0x0;
    puVar15 = (undefined8 *)func_0x041cb4c4(plVar26);
code_r0x047daed0:
    plVar18 = (long *)(*(code *)*puVar15)(plVar26,puVar15[1]);
    puVar2 = PTR_DAT_09ece918;
    puVar3 = PTR_DAT_09eaa8d0;
    if (plVar18 != (long *)0x0) {
      do {
        lVar13 = *plVar18;
        uVar23 = (ulong)*(ushort *)(lVar13 + 0x12e);
        if (uVar23 != 0) {
          piVar24 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
          do {
            if (*(long *)(piVar24 + -2) == *(long *)puVar3) {
              puVar15 = (undefined8 *)(lVar13 + (long)*piVar24 * 0x10 + 0x138);
              goto code_r0x047daf40;
            }
            uVar23 = uVar23 - 1;
            piVar24 = piVar24 + 4;
          } while (uVar23 != 0);
        }
        plVar17 = (long *)0x0;
        puVar15 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047daf40:
        puVar12 = (ulong *)(*(code *)*puVar15)(plVar18,puVar15[1]);
        if (((ulong)puVar12 & 1) == 0) {
          plVar22 = (long *)0x0;
          goto code_r0x047dafe8;
        }
        lVar13 = *plVar18;
        uVar11 = (ulong)*(ushort *)(lVar13 + 0x12e);
        if (uVar11 != 0) {
          piVar24 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
          do {
            if (*(long *)(piVar24 + -2) == *(long *)puVar2) {
              puVar15 = (undefined8 *)(lVar13 + (long)*piVar24 * 0x10 + 0x138);
              goto code_r0x047daf9c;
            }
            uVar11 = uVar11 - 1;
            piVar24 = piVar24 + 4;
          } while (uVar11 != 0);
        }
        plVar17 = (long *)0x0;
        puVar15 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047daf9c:
        uVar11 = (*(code *)*puVar15)(plVar18,puVar15[1]);
        if (uVar11 != 0) {
          FUN_047e4b7c(uVar10,uVar11,extraout_x1_00,0);
          plVar17 = plVar22;
          func_0x047e54a4(uVar10,uVar11,extraout_x1_00,plVar22,uVar8 & 1,0);
        }
      } while( true );
    }
  }
  func_0x04151bb8();
  while( true ) {
    auVar31 = func_0x04151bb0(plVar22);
    if (auVar31._8_4_ != 1) break;
    puVar15 = (undefined8 *)func_0x098f6de0();
    plVar22 = (long *)*puVar15;
    puVar12 = (ulong *)func_0x098f6df0();
code_r0x047dafe8:
    if (plVar18 != (long *)0x0) {
      lVar13 = *plVar18;
      uVar23 = (ulong)*(ushort *)(lVar13 + 0x12e);
      if (uVar23 != 0) {
        piVar24 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
        do {
          if (*(long *)(piVar24 + -2) == *plVar25) {
            puVar15 = (undefined8 *)(lVar13 + (long)*piVar24 * 0x10 + 0x138);
            goto code_r0x047db038;
          }
          uVar23 = uVar23 - 1;
          piVar24 = piVar24 + 4;
        } while (uVar23 != 0);
      }
      plVar17 = (long *)0x0;
      puVar15 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047db038:
      puVar12 = (ulong *)(*(code *)*puVar15)(plVar18,puVar15[1]);
    }
    if (plVar22 == (long *)0x0) {
      return puVar12;
    }
  }
  if (plVar18 != (long *)0x0) {
    lVar13 = *plVar18;
    uVar23 = (ulong)*(ushort *)(lVar13 + 0x12e);
    if (uVar23 != 0) {
      piVar24 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
      do {
        if (*(long *)(piVar24 + -2) == *plVar25) {
          puVar15 = (undefined8 *)(lVar13 + (long)*piVar24 * 0x10 + 0x138);
          goto code_r0x047db118;
        }
        uVar23 = uVar23 - 1;
        piVar24 = piVar24 + 4;
      } while (uVar23 != 0);
    }
    plVar17 = (long *)0x0;
    puVar15 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047db118:
    (*(code *)*puVar15)(plVar18,puVar15[1]);
  }
  func_0x04247ab0(auVar31._0_8_);
  func_0x04151bb0(uVar11);
  func_0x03bf6574();
  if ((bRam000000000a4515e1 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ecce28);
    bRam000000000a4515e1 = 1;
  }
  if (((plVar17 == (long *)0x0) || (*plVar17 != *(long *)PTR_DAT_09ecce28)) ||
     (puVar12 = (ulong *)plVar17[3], puVar12 == (ulong *)0x0)) {
    lVar13 = func_0x04151bb8();
    return (ulong *)(ulong)*(byte *)(lVar13 + 0x3b);
  }
  fVar27 = *(float *)(plVar17 + 4);
  fVar28 = *(float *)((long)plVar17 + 0x24);
  uVar11 = (ulong)bRam000000000a451672;
  puVar16 = puVar12;
  if ((bRam000000000a451672 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09eceb40,0);
    puVar16 = (ulong *)func_0x0415191c(
                                      PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0
                                      );
    uVar11 = 1;
    bRam000000000a451672 = 1;
  }
  puVar3 = PTR_DAT_09eceb40;
  if (puVar12 == (ulong *)0x0) goto code_r0x047eab30;
  uVar11 = *puVar12;
  uVar23 = *(ulong *)PTR_DAT_09eceb40;
  if (uVar11 == uVar23) {
    uVar11 = uVar23;
    if (*(char *)((long)puVar12 + 0x5f) == '\0') {
      *(undefined1 *)((long)puVar12 + 0x5f) = 1;
      puVar16 = (ulong *)func_0x047e9764(puVar12);
      uVar23 = *(ulong *)puVar3;
      uVar11 = *puVar12;
      goto code_r0x047eab08;
    }
  }
  else {
code_r0x047eab08:
    if (uVar11 != uVar23) goto code_r0x047eab30;
  }
  if ((char)puVar12[0xc] == '\0') {
    return puVar16;
  }
code_r0x047eab30:
  fVar29 = *(float *)((long)puVar12 + 0x44);
  *(float *)(puVar12 + 0x12) = *(float *)(puVar12 + 0x12) + fVar27;
  puVar3 = PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0;
  uVar7 = (**(code **)(uVar11 + 0x358))(puVar12,*(undefined8 *)(uVar11 + 0x360));
  if (*(int *)(*(long *)puVar3 + 0xe0) == 0) {
    func_0x04151a94(*(long *)puVar3);
  }
  puVar16 = (ulong *)Game_Application_InGameHunt_HuntCalculator__GetMoveDistance(fVar27,uVar7,0);
  *(float *)((long)puVar12 + 0x44) = fVar29 + extraout_s0_00;
  bVar6 = fVar28 <= *(float *)(puVar12 + 0x12) - *(float *)(puVar12 + 0xe);
  *(bool *)((long)puVar12 + 0x5c) = bVar6;
  if (!bVar6) {
    return puVar16;
  }
                    /* WARNING: Could not recover jumptable at 0x047eabc4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  puVar12 = (ulong *)(**(code **)(*puVar12 + 0x378))(puVar12,*(undefined8 *)(*puVar12 + 0x380));
  return puVar12;
}


```

## FriendParty.SortedUnitsBySkillEffectType (off 0x46dd450)

```c

/* WARNING: Possible PIC construction at 0x047e14cc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x047e14d0) */
/* WARNING: Removing unreachable block (ram,0x047e153c) */
/* WARNING: Removing unreachable block (ram,0x047e14d4) */
/* WARNING: Removing unreachable block (ram,0x0544f39c) */
/* WARNING: Removing unreachable block (ram,0x0544f3b4) */
/* WARNING: Removing unreachable block (ram,0x0544f3bc) */
/* WARNING: Removing unreachable block (ram,0x0544f3fc) */
/* WARNING: Removing unreachable block (ram,0x0544f430) */
/* WARNING: Removing unreachable block (ram,0x0544f438) */
/* WARNING: Removing unreachable block (ram,0x0544f478) */
/* WARNING: Removing unreachable block (ram,0x0544f4ac) */
/* WARNING: Removing unreachable block (ram,0x0544f4b4) */
/* WARNING: Removing unreachable block (ram,0x0544f4f4) */
/* WARNING: Removing unreachable block (ram,0x0544f528) */
/* WARNING: Removing unreachable block (ram,0x0544f530) */
/* WARNING: Removing unreachable block (ram,0x0544f570) */
/* WARNING: Removing unreachable block (ram,0x0544f5a4) */
/* WARNING: Removing unreachable block (ram,0x0544f5ac) */
/* WARNING: Removing unreachable block (ram,0x0544f5ec) */
/* WARNING: Removing unreachable block (ram,0x0544f620) */
/* WARNING: Removing unreachable block (ram,0x0544f628) */
/* WARNING: Removing unreachable block (ram,0x0544f668) */
/* WARNING: Removing unreachable block (ram,0x0544f69c) */
/* WARNING: Removing unreachable block (ram,0x0544f6a4) */
/* WARNING: Removing unreachable block (ram,0x0544f6e4) */
/* WARNING: Removing unreachable block (ram,0x0544f718) */
/* WARNING: Removing unreachable block (ram,0x0544f720) */
/* WARNING: Removing unreachable block (ram,0x0544f760) */
/* WARNING: Removing unreachable block (ram,0x0544f794) */
/* WARNING: Removing unreachable block (ram,0x0544f79c) */
/* WARNING: Removing unreachable block (ram,0x0544f7e0) */
/* WARNING: Removing unreachable block (ram,0x0544f818) */
/* WARNING: Removing unreachable block (ram,0x0544f824) */
/* WARNING: Removing unreachable block (ram,0x04cf0b70) */
/* WARNING: Removing unreachable block (ram,0x04cf0ba0) */
/* WARNING: Removing unreachable block (ram,0x04cf0bc0) */
/* WARNING: Removing unreachable block (ram,0x04cf0bc8) */
/* WARNING: Removing unreachable block (ram,0x04cf0bcc) */
/* WARNING: Removing unreachable block (ram,0x04cf0eb8) */
/* WARNING: Removing unreachable block (ram,0x04cf0bd0) */
/* WARNING: Removing unreachable block (ram,0x04cf0ec4) */
/* WARNING: Removing unreachable block (ram,0x04cf0bd4) */
/* WARNING: Removing unreachable block (ram,0x04cf0be0) */
/* WARNING: Removing unreachable block (ram,0x04cf0be4) */
/* WARNING: Removing unreachable block (ram,0x04cf0bf4) */
/* WARNING: Removing unreachable block (ram,0x04cf0bf8) */
/* WARNING: Removing unreachable block (ram,0x04cf0c0c) */
/* WARNING: Removing unreachable block (ram,0x04cf0c18) */
/* WARNING: Removing unreachable block (ram,0x04cf0c3c) */
/* WARNING: Removing unreachable block (ram,0x04cf0c48) */
/* WARNING: Removing unreachable block (ram,0x04cf0c54) */
/* WARNING: Removing unreachable block (ram,0x04cf0c5c) */
/* WARNING: Removing unreachable block (ram,0x04cf0c84) */
/* WARNING: Removing unreachable block (ram,0x04cf0c68) */
/* WARNING: Removing unreachable block (ram,0x04cf0c74) */
/* WARNING: Removing unreachable block (ram,0x04cf0c90) */
/* WARNING: Removing unreachable block (ram,0x04cf0ca4) */
/* WARNING: Removing unreachable block (ram,0x04cf0cac) */
/* WARNING: Removing unreachable block (ram,0x04cf0cbc) */
/* WARNING: Removing unreachable block (ram,0x04cf0cc4) */
/* WARNING: Removing unreachable block (ram,0x04cf0cec) */
/* WARNING: Removing unreachable block (ram,0x04cf0cd0) */
/* WARNING: Removing unreachable block (ram,0x04cf0cdc) */
/* WARNING: Removing unreachable block (ram,0x04cf0cf8) */
/* WARNING: Removing unreachable block (ram,0x04cf0e1c) */
/* WARNING: Removing unreachable block (ram,0x04cf0d08) */
/* WARNING: Removing unreachable block (ram,0x04cf0d18) */
/* WARNING: Removing unreachable block (ram,0x04cf0d24) */
/* WARNING: Removing unreachable block (ram,0x04cf0d30) */
/* WARNING: Removing unreachable block (ram,0x04cf0d38) */
/* WARNING: Removing unreachable block (ram,0x04cf0d60) */
/* WARNING: Removing unreachable block (ram,0x04cf0d44) */
/* WARNING: Removing unreachable block (ram,0x04cf0d50) */
/* WARNING: Removing unreachable block (ram,0x04cf0d6c) */
/* WARNING: Removing unreachable block (ram,0x04cf0ea4) */
/* WARNING: Removing unreachable block (ram,0x04cf0d9c) */
/* WARNING: Removing unreachable block (ram,0x04cf0dac) */
/* WARNING: Removing unreachable block (ram,0x04cf0db0) */
/* WARNING: Removing unreachable block (ram,0x04cf0ea8) */
/* WARNING: Removing unreachable block (ram,0x04cf0eac) */
/* WARNING: Removing unreachable block (ram,0x04cf0ecc) */
/* WARNING: Removing unreachable block (ram,0x04cf0ee0) */
/* WARNING: Removing unreachable block (ram,0x04cf0ee4) */
/* WARNING: Removing unreachable block (ram,0x04cf0f0c) */
/* WARNING: Removing unreachable block (ram,0x04cf0f2c) */
/* WARNING: Removing unreachable block (ram,0x04cf0f38) */
/* WARNING: Removing unreachable block (ram,0x04cf0f3c) */
/* WARNING: Removing unreachable block (ram,0x04cf0f54) */
/* WARNING: Removing unreachable block (ram,0x04cf0f5c) */
/* WARNING: Removing unreachable block (ram,0x04cf0f84) */
/* WARNING: Removing unreachable block (ram,0x04cf0f68) */
/* WARNING: Removing unreachable block (ram,0x04cf0f74) */
/* WARNING: Removing unreachable block (ram,0x04cf0f90) */
/* WARNING: Removing unreachable block (ram,0x04cf0f9c) */
/* WARNING: Removing unreachable block (ram,0x04cf0fa0) */
/* WARNING: Removing unreachable block (ram,0x04cf0fa8) */
/* WARNING: Removing unreachable block (ram,0x04cf0fe4) */
/* WARNING: Removing unreachable block (ram,0x04cf1004) */
/* WARNING: Removing unreachable block (ram,0x04cf100c) */
/* WARNING: Removing unreachable block (ram,0x04cf1018) */
/* WARNING: Removing unreachable block (ram,0x04cf131c) */
/* WARNING: Removing unreachable block (ram,0x04cf101c) */
/* WARNING: Removing unreachable block (ram,0x04cf1328) */
/* WARNING: Removing unreachable block (ram,0x04cf1020) */
/* WARNING: Removing unreachable block (ram,0x04cf102c) */
/* WARNING: Removing unreachable block (ram,0x04cf1030) */
/* WARNING: Removing unreachable block (ram,0x04cf1040) */
/* WARNING: Removing unreachable block (ram,0x04cf1044) */
/* WARNING: Removing unreachable block (ram,0x04cf1058) */
/* WARNING: Removing unreachable block (ram,0x04cf1064) */
/* WARNING: Removing unreachable block (ram,0x04cf1088) */
/* WARNING: Removing unreachable block (ram,0x04cf1094) */
/* WARNING: Removing unreachable block (ram,0x04cf10a0) */
/* WARNING: Removing unreachable block (ram,0x04cf10a8) */
/* WARNING: Removing unreachable block (ram,0x04cf10d0) */
/* WARNING: Removing unreachable block (ram,0x04cf10b4) */
/* WARNING: Removing unreachable block (ram,0x04cf10c0) */
/* WARNING: Removing unreachable block (ram,0x04cf10dc) */
/* WARNING: Removing unreachable block (ram,0x04cf10f0) */
/* WARNING: Removing unreachable block (ram,0x04cf10f8) */
/* WARNING: Removing unreachable block (ram,0x04cf1108) */
/* WARNING: Removing unreachable block (ram,0x04cf1110) */
/* WARNING: Removing unreachable block (ram,0x04cf1138) */
/* WARNING: Removing unreachable block (ram,0x04cf111c) */
/* WARNING: Removing unreachable block (ram,0x04cf1128) */
/* WARNING: Removing unreachable block (ram,0x04cf1144) */
/* WARNING: Removing unreachable block (ram,0x04cf1280) */
/* WARNING: Removing unreachable block (ram,0x04cf1154) */
/* WARNING: Removing unreachable block (ram,0x04cf1164) */
/* WARNING: Removing unreachable block (ram,0x04cf1170) */
/* WARNING: Removing unreachable block (ram,0x04cf117c) */
/* WARNING: Removing unreachable block (ram,0x04cf1184) */
/* WARNING: Removing unreachable block (ram,0x04cf11ac) */
/* WARNING: Removing unreachable block (ram,0x04cf1190) */
/* WARNING: Removing unreachable block (ram,0x04cf119c) */
/* WARNING: Removing unreachable block (ram,0x04cf11b8) */
/* WARNING: Removing unreachable block (ram,0x04cf1308) */
/* WARNING: Removing unreachable block (ram,0x04cf11ec) */
/* WARNING: Removing unreachable block (ram,0x04cf11fc) */
/* WARNING: Removing unreachable block (ram,0x04cf1200) */
/* WARNING: Removing unreachable block (ram,0x04cf130c) */
/* WARNING: Removing unreachable block (ram,0x04cf1310) */
/* WARNING: Removing unreachable block (ram,0x04cf1330) */
/* WARNING: Removing unreachable block (ram,0x04cf1344) */
/* WARNING: Removing unreachable block (ram,0x04cf1348) */
/* WARNING: Removing unreachable block (ram,0x04cf1370) */
/* WARNING: Removing unreachable block (ram,0x04cf1390) */
/* WARNING: Removing unreachable block (ram,0x04cf139c) */
/* WARNING: Removing unreachable block (ram,0x04cf13a0) */
/* WARNING: Removing unreachable block (ram,0x04cf13b8) */
/* WARNING: Removing unreachable block (ram,0x04cf13c0) */
/* WARNING: Removing unreachable block (ram,0x04cf13e8) */
/* WARNING: Removing unreachable block (ram,0x04cf13cc) */
/* WARNING: Removing unreachable block (ram,0x04cf13d8) */
/* WARNING: Removing unreachable block (ram,0x04cf13f4) */
/* WARNING: Removing unreachable block (ram,0x04cf1400) */
/* WARNING: Removing unreachable block (ram,0x04cf1404) */
/* WARNING: Removing unreachable block (ram,0x04cf140c) */
/* WARNING: Removing unreachable block (ram,0x04cf1448) */
/* WARNING: Removing unreachable block (ram,0x04cf1468) */
/* WARNING: Removing unreachable block (ram,0x04cf1470) */
/* WARNING: Removing unreachable block (ram,0x04cf1474) */
/* WARNING: Removing unreachable block (ram,0x04cf174c) */
/* WARNING: Removing unreachable block (ram,0x04cf1478) */
/* WARNING: Removing unreachable block (ram,0x04cf1758) */
/* WARNING: Removing unreachable block (ram,0x04cf147c) */
/* WARNING: Removing unreachable block (ram,0x04cf1488) */
/* WARNING: Removing unreachable block (ram,0x04cf148c) */
/* WARNING: Removing unreachable block (ram,0x04cf149c) */
/* WARNING: Removing unreachable block (ram,0x04cf14a0) */
/* WARNING: Removing unreachable block (ram,0x04cf14b4) */
/* WARNING: Removing unreachable block (ram,0x04cf14c0) */
/* WARNING: Removing unreachable block (ram,0x04cf14e4) */
/* WARNING: Removing unreachable block (ram,0x04cf14f0) */
/* WARNING: Removing unreachable block (ram,0x04cf14fc) */
/* WARNING: Removing unreachable block (ram,0x04cf1504) */
/* WARNING: Removing unreachable block (ram,0x04cf152c) */
/* WARNING: Removing unreachable block (ram,0x04cf1510) */
/* WARNING: Removing unreachable block (ram,0x04cf151c) */
/* WARNING: Removing unreachable block (ram,0x04cf1538) */
/* WARNING: Removing unreachable block (ram,0x04cf154c) */
/* WARNING: Removing unreachable block (ram,0x04cf1554) */
/* WARNING: Removing unreachable block (ram,0x04cf1564) */
/* WARNING: Removing unreachable block (ram,0x04cf156c) */
/* WARNING: Removing unreachable block (ram,0x04cf1594) */
/* WARNING: Removing unreachable block (ram,0x04cf1578) */
/* WARNING: Removing unreachable block (ram,0x04cf1584) */
/* WARNING: Removing unreachable block (ram,0x04cf15a0) */
/* WARNING: Removing unreachable block (ram,0x04cf16b0) */
/* WARNING: Removing unreachable block (ram,0x04cf15b0) */
/* WARNING: Removing unreachable block (ram,0x04cf15c0) */
/* WARNING: Removing unreachable block (ram,0x04cf15cc) */
/* WARNING: Removing unreachable block (ram,0x04cf15d8) */
/* WARNING: Removing unreachable block (ram,0x04cf15e0) */
/* WARNING: Removing unreachable block (ram,0x04cf1608) */
/* WARNING: Removing unreachable block (ram,0x04cf15ec) */
/* WARNING: Removing unreachable block (ram,0x04cf15f8) */
/* WARNING: Removing unreachable block (ram,0x04cf1614) */
/* WARNING: Removing unreachable block (ram,0x04cf1738) */
/* WARNING: Removing unreachable block (ram,0x04cf163c) */
/* WARNING: Removing unreachable block (ram,0x04cf164c) */
/* WARNING: Removing unreachable block (ram,0x04cf1650) */
/* WARNING: Removing unreachable block (ram,0x04cf173c) */
/* WARNING: Removing unreachable block (ram,0x04cf1740) */
/* WARNING: Removing unreachable block (ram,0x04cf1760) */
/* WARNING: Removing unreachable block (ram,0x04cf1774) */
/* WARNING: Removing unreachable block (ram,0x04cf1778) */
/* WARNING: Removing unreachable block (ram,0x04cf179c) */
/* WARNING: Removing unreachable block (ram,0x04cf17bc) */
/* WARNING: Removing unreachable block (ram,0x04cf17c8) */
/* WARNING: Removing unreachable block (ram,0x04cf17cc) */
/* WARNING: Removing unreachable block (ram,0x04cf17e4) */
/* WARNING: Removing unreachable block (ram,0x04cf17ec) */
/* WARNING: Removing unreachable block (ram,0x04cf1814) */
/* WARNING: Removing unreachable block (ram,0x04cf17f8) */
/* WARNING: Removing unreachable block (ram,0x04cf1804) */
/* WARNING: Removing unreachable block (ram,0x04cf1820) */
/* WARNING: Removing unreachable block (ram,0x04cf182c) */
/* WARNING: Removing unreachable block (ram,0x04cf1830) */
/* WARNING: Removing unreachable block (ram,0x04cf1838) */
/* WARNING: Removing unreachable block (ram,0x04cf188c) */
/* WARNING: Removing unreachable block (ram,0x04cf18ac) */
/* WARNING: Removing unreachable block (ram,0x04cf18b8) */
/* WARNING: Removing unreachable block (ram,0x04cf1918) */
/* WARNING: Removing unreachable block (ram,0x04cf1900) */
/* WARNING: Removing unreachable block (ram,0x04cf191c) */
/* WARNING: Removing unreachable block (ram,0x04cf1940) */
/* WARNING: Removing unreachable block (ram,0x04cf194c) */
/* WARNING: Removing unreachable block (ram,0x04cf1994) */
/* WARNING: Removing unreachable block (ram,0x04cf1e4c) */
/* WARNING: Removing unreachable block (ram,0x04cf199c) */
/* WARNING: Removing unreachable block (ram,0x04cf1e58) */
/* WARNING: Removing unreachable block (ram,0x04cf19a4) */
/* WARNING: Removing unreachable block (ram,0x04cf19b0) */
/* WARNING: Removing unreachable block (ram,0x04cf19b4) */
/* WARNING: Removing unreachable block (ram,0x04cf19c4) */
/* WARNING: Removing unreachable block (ram,0x04cf19c8) */
/* WARNING: Removing unreachable block (ram,0x04cf19fc) */
/* WARNING: Removing unreachable block (ram,0x04cf19e4) */
/* WARNING: Removing unreachable block (ram,0x04cf1a00) */
/* WARNING: Removing unreachable block (ram,0x04cf1a10) */
/* WARNING: Removing unreachable block (ram,0x04cf1a1c) */
/* WARNING: Removing unreachable block (ram,0x04cf1a40) */
/* WARNING: Removing unreachable block (ram,0x04cf1a4c) */
/* WARNING: Removing unreachable block (ram,0x04cf1a58) */
/* WARNING: Removing unreachable block (ram,0x04cf1a60) */
/* WARNING: Removing unreachable block (ram,0x04cf1a88) */
/* WARNING: Removing unreachable block (ram,0x04cf1a6c) */
/* WARNING: Removing unreachable block (ram,0x04cf1a78) */
/* WARNING: Removing unreachable block (ram,0x04cf1a94) */
/* WARNING: Removing unreachable block (ram,0x04cf1aa8) */
/* WARNING: Removing unreachable block (ram,0x04cf1ac0) */
/* WARNING: Removing unreachable block (ram,0x04cf1ac8) */
/* WARNING: Removing unreachable block (ram,0x04cf1af0) */
/* WARNING: Removing unreachable block (ram,0x04cf1ad4) */
/* WARNING: Removing unreachable block (ram,0x04cf1ae0) */
/* WARNING: Removing unreachable block (ram,0x04cf1afc) */
/* WARNING: Removing unreachable block (ram,0x04cf1d94) */
/* WARNING: Removing unreachable block (ram,0x04cf1b0c) */
/* WARNING: Removing unreachable block (ram,0x04cf1b1c) */
/* WARNING: Removing unreachable block (ram,0x04cf1b28) */
/* WARNING: Removing unreachable block (ram,0x04cf1b34) */
/* WARNING: Removing unreachable block (ram,0x04cf1b3c) */
/* WARNING: Removing unreachable block (ram,0x04cf1b64) */
/* WARNING: Removing unreachable block (ram,0x04cf1b48) */
/* WARNING: Removing unreachable block (ram,0x04cf1b54) */
/* WARNING: Removing unreachable block (ram,0x04cf1b70) */
/* WARNING: Removing unreachable block (ram,0x04cf1bc4) */
/* WARNING: Removing unreachable block (ram,0x04cf1bc8) */
/* WARNING: Removing unreachable block (ram,0x04cf1e38) */
/* WARNING: Removing unreachable block (ram,0x04cf1bf0) */
/* WARNING: Removing unreachable block (ram,0x04cf1c18) */
/* WARNING: Removing unreachable block (ram,0x04cf1c00) */
/* WARNING: Removing unreachable block (ram,0x04cf1c1c) */
/* WARNING: Removing unreachable block (ram,0x04cf1c44) */
/* WARNING: Removing unreachable block (ram,0x04cf1c2c) */
/* WARNING: Removing unreachable block (ram,0x04cf1c48) */
/* WARNING: Removing unreachable block (ram,0x04cf1c54) */
/* WARNING: Removing unreachable block (ram,0x04cf1c58) */
/* WARNING: Removing unreachable block (ram,0x04cf1c6c) */
/* WARNING: Removing unreachable block (ram,0x04cf1c70) */
/* WARNING: Removing unreachable block (ram,0x04cf1ccc) */
/* WARNING: Removing unreachable block (ram,0x04cf1cd0) */
/* WARNING: Removing unreachable block (ram,0x04cf1e3c) */
/* WARNING: Removing unreachable block (ram,0x04cf1e40) */
/* WARNING: Removing unreachable block (ram,0x04cf1e60) */
/* WARNING: Removing unreachable block (ram,0x04cf1e74) */
/* WARNING: Removing unreachable block (ram,0x04cf1e78) */
/* WARNING: Removing unreachable block (ram,0x04cf1e80) */
/* WARNING: Removing unreachable block (ram,0x04cf1ea0) */
/* WARNING: Removing unreachable block (ram,0x04cf1ec0) */
/* WARNING: Removing unreachable block (ram,0x04cf1ecc) */
/* WARNING: Removing unreachable block (ram,0x04cf1ed0) */
/* WARNING: Removing unreachable block (ram,0x04cf1ee8) */
/* WARNING: Removing unreachable block (ram,0x04cf1ef0) */
/* WARNING: Removing unreachable block (ram,0x04cf1f18) */
/* WARNING: Removing unreachable block (ram,0x04cf1efc) */
/* WARNING: Removing unreachable block (ram,0x04cf1f08) */
/* WARNING: Removing unreachable block (ram,0x04cf1f24) */
/* WARNING: Removing unreachable block (ram,0x04cf1f30) */
/* WARNING: Removing unreachable block (ram,0x04cf1f34) */
/* WARNING: Removing unreachable block (ram,0x04cf1f3c) */
/* WARNING: Removing unreachable block (ram,0x04cf1f60) */
/* WARNING: Removing unreachable block (ram,0x04cf1f68) */
/* WARNING: Removing unreachable block (ram,0x04cf1f70) */
/* WARNING: Removing unreachable block (ram,0x04cf1f84) */
/* WARNING: Removing unreachable block (ram,0x04cf1f90) */
/* WARNING: Removing unreachable block (ram,0x04cf1f9c) */
/* WARNING: Removing unreachable block (ram,0x04cf1fa4) */
/* WARNING: Removing unreachable block (ram,0x04cf1fcc) */
/* WARNING: Removing unreachable block (ram,0x04cf1fb0) */
/* WARNING: Removing unreachable block (ram,0x04cf1fbc) */
/* WARNING: Removing unreachable block (ram,0x04cf1fdc) */
/* WARNING: Removing unreachable block (ram,0x04cf1fec) */
/* WARNING: Removing unreachable block (ram,0x04cf1ffc) */
/* WARNING: Removing unreachable block (ram,0x04cf2008) */
/* WARNING: Removing unreachable block (ram,0x04cf1eac) */
/* WARNING: Removing unreachable block (ram,0x04cf1d98) */
/* WARNING: Removing unreachable block (ram,0x04cf1d9c) */
/* WARNING: Removing unreachable block (ram,0x04cf1db4) */
/* WARNING: Removing unreachable block (ram,0x04cf1dbc) */
/* WARNING: Removing unreachable block (ram,0x04cf1de4) */
/* WARNING: Removing unreachable block (ram,0x04cf1dc8) */
/* WARNING: Removing unreachable block (ram,0x04cf1dd4) */
/* WARNING: Removing unreachable block (ram,0x04cf1df0) */
/* WARNING: Removing unreachable block (ram,0x04cf1dfc) */
/* WARNING: Removing unreachable block (ram,0x04cf1e00) */
/* WARNING: Removing unreachable block (ram,0x04cf1e14) */
/* WARNING: Removing unreachable block (ram,0x04cf1cf4) */
/* WARNING: Removing unreachable block (ram,0x04cf1d1c) */
/* WARNING: Removing unreachable block (ram,0x04cf1d04) */
/* WARNING: Removing unreachable block (ram,0x04cf1d20) */
/* WARNING: Removing unreachable block (ram,0x04cf1d48) */
/* WARNING: Removing unreachable block (ram,0x04cf1d30) */
/* WARNING: Removing unreachable block (ram,0x04cf1d4c) */
/* WARNING: Removing unreachable block (ram,0x04cf1d58) */
/* WARNING: Removing unreachable block (ram,0x04cf1d5c) */
/* WARNING: Removing unreachable block (ram,0x04cf1d70) */
/* WARNING: Removing unreachable block (ram,0x04cf1d74) */
/* WARNING: Removing unreachable block (ram,0x04cf17a8) */
/* WARNING: Removing unreachable block (ram,0x04cf16b4) */
/* WARNING: Removing unreachable block (ram,0x04cf16b8) */
/* WARNING: Removing unreachable block (ram,0x04cf16d0) */
/* WARNING: Removing unreachable block (ram,0x04cf16d8) */
/* WARNING: Removing unreachable block (ram,0x04cf1700) */
/* WARNING: Removing unreachable block (ram,0x04cf16e4) */
/* WARNING: Removing unreachable block (ram,0x04cf16f0) */
/* WARNING: Removing unreachable block (ram,0x04cf170c) */
/* WARNING: Removing unreachable block (ram,0x04cf1718) */
/* WARNING: Removing unreachable block (ram,0x04cf171c) */
/* WARNING: Removing unreachable block (ram,0x04cf1684) */
/* WARNING: Removing unreachable block (ram,0x04cf1694) */
/* WARNING: Removing unreachable block (ram,0x04cf1698) */
/* WARNING: Removing unreachable block (ram,0x04cf137c) */
/* WARNING: Removing unreachable block (ram,0x04cf1284) */
/* WARNING: Removing unreachable block (ram,0x04cf1288) */
/* WARNING: Removing unreachable block (ram,0x04cf12a0) */
/* WARNING: Removing unreachable block (ram,0x04cf12a8) */
/* WARNING: Removing unreachable block (ram,0x04cf12d0) */
/* WARNING: Removing unreachable block (ram,0x04cf12b4) */
/* WARNING: Removing unreachable block (ram,0x04cf12c0) */
/* WARNING: Removing unreachable block (ram,0x04cf12dc) */
/* WARNING: Removing unreachable block (ram,0x04cf12e8) */
/* WARNING: Removing unreachable block (ram,0x04cf12ec) */
/* WARNING: Removing unreachable block (ram,0x04cf1248) */
/* WARNING: Removing unreachable block (ram,0x04cf125c) */
/* WARNING: Removing unreachable block (ram,0x04cf1260) */
/* WARNING: Removing unreachable block (ram,0x04cf0f18) */
/* WARNING: Removing unreachable block (ram,0x04cf0e20) */
/* WARNING: Removing unreachable block (ram,0x04cf0e24) */
/* WARNING: Removing unreachable block (ram,0x04cf0e3c) */
/* WARNING: Removing unreachable block (ram,0x04cf0e44) */
/* WARNING: Removing unreachable block (ram,0x04cf0e6c) */
/* WARNING: Removing unreachable block (ram,0x04cf0e50) */
/* WARNING: Removing unreachable block (ram,0x04cf0e5c) */
/* WARNING: Removing unreachable block (ram,0x04cf0e78) */
/* WARNING: Removing unreachable block (ram,0x04cf0e84) */
/* WARNING: Removing unreachable block (ram,0x04cf0e88) */
/* WARNING: Removing unreachable block (ram,0x04cf0de8) */
/* WARNING: Removing unreachable block (ram,0x04cf0dfc) */
/* WARNING: Removing unreachable block (ram,0x04cf0e00) */
/* WARNING: Removing unreachable block (ram,0x0544f7a0) */
/* WARNING: Removing unreachable block (ram,0x0544f7b0) */
/* WARNING: Removing unreachable block (ram,0x0544f7b4) */
/* WARNING: Removing unreachable block (ram,0x0544f724) */
/* WARNING: Removing unreachable block (ram,0x0544f734) */
/* WARNING: Removing unreachable block (ram,0x0544f738) */
/* WARNING: Removing unreachable block (ram,0x0544f6a8) */
/* WARNING: Removing unreachable block (ram,0x0544f6b8) */
/* WARNING: Removing unreachable block (ram,0x0544f6bc) */
/* WARNING: Removing unreachable block (ram,0x0544f62c) */
/* WARNING: Removing unreachable block (ram,0x0544f63c) */
/* WARNING: Removing unreachable block (ram,0x0544f640) */
/* WARNING: Removing unreachable block (ram,0x0544f5b0) */
/* WARNING: Removing unreachable block (ram,0x0544f5c0) */
/* WARNING: Removing unreachable block (ram,0x0544f5c4) */
/* WARNING: Removing unreachable block (ram,0x0544f534) */
/* WARNING: Removing unreachable block (ram,0x0544f544) */
/* WARNING: Removing unreachable block (ram,0x0544f548) */
/* WARNING: Removing unreachable block (ram,0x0544f4b8) */
/* WARNING: Removing unreachable block (ram,0x0544f4c8) */
/* WARNING: Removing unreachable block (ram,0x0544f4cc) */
/* WARNING: Removing unreachable block (ram,0x0544f43c) */
/* WARNING: Removing unreachable block (ram,0x0544f44c) */
/* WARNING: Removing unreachable block (ram,0x0544f450) */
/* WARNING: Removing unreachable block (ram,0x0544f3c0) */
/* WARNING: Removing unreachable block (ram,0x0544f3d0) */
/* WARNING: Removing unreachable block (ram,0x0544f3d4) */

void FUN_047e1450(void)

{
  undefined *puVar1;
  
  puVar1 = PTR_DAT_09ecec58;
  if ((bRam000000000a451614 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ecec60);
    func_0x0415191c(PTR_DAT_09ecec68);
    func_0x0415191c(PTR_DAT_09ecec70);
    func_0x0415191c(PTR_DAT_09ecec78);
    func_0x0415191c(PTR_DAT_09ecec58);
    bRam000000000a451614 = 1;
  }
  func_0x04151ba8(*(undefined8 *)puVar1);
  return;
}


```

## AssistSkillController.OnSkillFire (off 0x466e930)

```c

/* WARNING: Possible PIC construction at 0x04772cbc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047731f0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x04772cc0) */
/* WARNING: Removing unreachable block (ram,0x04772ccc) */
/* WARNING: Removing unreachable block (ram,0x04772cd0) */
/* WARNING: Removing unreachable block (ram,0x04772cdc) */
/* WARNING: Removing unreachable block (ram,0x04772cf0) */
/* WARNING: Removing unreachable block (ram,0x04772d04) */
/* WARNING: Removing unreachable block (ram,0x04772d0c) */
/* WARNING: Removing unreachable block (ram,0x04772d30) */
/* WARNING: Removing unreachable block (ram,0x04772d3c) */
/* WARNING: Removing unreachable block (ram,0x04772d90) */
/* WARNING: Removing unreachable block (ram,0x04772dac) */
/* WARNING: Removing unreachable block (ram,0x04772df0) */
/* WARNING: Removing unreachable block (ram,0x04772df4) */
/* WARNING: Removing unreachable block (ram,0x04772e0c) */
/* WARNING: Removing unreachable block (ram,0x04772e14) */
/* WARNING: Removing unreachable block (ram,0x04772e78) */
/* WARNING: Removing unreachable block (ram,0x04772e20) */
/* WARNING: Removing unreachable block (ram,0x04772e28) */
/* WARNING: Removing unreachable block (ram,0x04772e30) */
/* WARNING: Removing unreachable block (ram,0x04772e48) */
/* WARNING: Removing unreachable block (ram,0x04772e50) */
/* WARNING: Removing unreachable block (ram,0x04772e84) */
/* WARNING: Removing unreachable block (ram,0x04772e5c) */
/* WARNING: Removing unreachable block (ram,0x04772e68) */
/* WARNING: Removing unreachable block (ram,0x04772e90) */
/* WARNING: Removing unreachable block (ram,0x04772ea4) */
/* WARNING: Removing unreachable block (ram,0x04772eb8) */
/* WARNING: Removing unreachable block (ram,0x04772ec4) */
/* WARNING: Removing unreachable block (ram,0x04772ed0) */
/* WARNING: Removing unreachable block (ram,0x04772ed4) */
/* WARNING: Removing unreachable block (ram,0x04772edc) */
/* WARNING: Removing unreachable block (ram,0x04772ee0) */
/* WARNING: Removing unreachable block (ram,0x04772ef0) */
/* WARNING: Removing unreachable block (ram,0x04772ef4) */
/* WARNING: Removing unreachable block (ram,0x04772efc) */
/* WARNING: Removing unreachable block (ram,0x04772f08) */
/* WARNING: Removing unreachable block (ram,0x04772f1c) */
/* WARNING: Removing unreachable block (ram,0x04772f34) */
/* WARNING: Removing unreachable block (ram,0x04772fb8) */
/* WARNING: Removing unreachable block (ram,0x04772fd8) */
/* WARNING: Removing unreachable block (ram,0x04773010) */
/* WARNING: Removing unreachable block (ram,0x047730e8) */
/* WARNING: Removing unreachable block (ram,0x04773018) */
/* WARNING: Removing unreachable block (ram,0x04773030) */
/* WARNING: Removing unreachable block (ram,0x04773034) */
/* WARNING: Removing unreachable block (ram,0x04773040) */
/* WARNING: Removing unreachable block (ram,0x04773054) */
/* WARNING: Removing unreachable block (ram,0x04773068) */
/* WARNING: Removing unreachable block (ram,0x04773070) */
/* WARNING: Removing unreachable block (ram,0x04773094) */
/* WARNING: Removing unreachable block (ram,0x047730a0) */
/* WARNING: Removing unreachable block (ram,0x047730f8) */
/* WARNING: Removing unreachable block (ram,0x0477312c) */
/* WARNING: Removing unreachable block (ram,0x04773188) */
/* WARNING: Removing unreachable block (ram,0x047731a0) */
/* WARNING: Removing unreachable block (ram,0x047730c8) */
/* WARNING: Removing unreachable block (ram,0x04772f48) */
/* WARNING: Removing unreachable block (ram,0x04772f64) */
/* WARNING: Removing unreachable block (ram,0x04772f6c) */
/* WARNING: Removing unreachable block (ram,0x04772f94) */
/* WARNING: Removing unreachable block (ram,0x04772f78) */
/* WARNING: Removing unreachable block (ram,0x04772f84) */
/* WARNING: Removing unreachable block (ram,0x04772fa0) */
/* WARNING: Removing unreachable block (ram,0x04772d64) */
/* WARNING: Removing unreachable block (ram,0x047731f4) */
/* WARNING: Removing unreachable block (ram,0x04773200) */
/* WARNING: Removing unreachable block (ram,0x04773204) */
/* WARNING: Removing unreachable block (ram,0x04773210) */
/* WARNING: Removing unreachable block (ram,0x04773224) */
/* WARNING: Removing unreachable block (ram,0x04773238) */
/* WARNING: Removing unreachable block (ram,0x04773240) */
/* WARNING: Removing unreachable block (ram,0x04773264) */
/* WARNING: Removing unreachable block (ram,0x04773270) */
/* WARNING: Removing unreachable block (ram,0x047732c8) */
/* WARNING: Removing unreachable block (ram,0x047732e8) */
/* WARNING: Removing unreachable block (ram,0x04773308) */
/* WARNING: Removing unreachable block (ram,0x04773324) */
/* WARNING: Removing unreachable block (ram,0x04773310) */
/* WARNING: Removing unreachable block (ram,0x04773318) */
/* WARNING: Removing unreachable block (ram,0x0477332c) */
/* WARNING: Removing unreachable block (ram,0x04773330) */
/* WARNING: Removing unreachable block (ram,0x04773298) */

undefined1  [16] FUN_04772930(undefined8 param_1,undefined8 param_2,long *param_3)

{
  undefined4 uVar1;
  undefined *puVar2;
  undefined *puVar3;
  undefined *puVar4;
  int iVar5;
  long lVar6;
  long *plVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  undefined8 uVar10;
  long lVar11;
  ulong uVar12;
  int *piVar13;
  long lVar14;
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  
  auVar15._8_8_ = param_2;
  auVar15._0_8_ = param_1;
  if ((bRam000000000a45129f & 1) == 0) {
    func_0x0415191c(PTR_DAT_09eccc60);
    func_0x0415191c(PTR_DAT_09eccc58);
    auVar15 = func_0x0415191c(PTR_DAT_09eccc68);
    bRam000000000a45129f = 1;
  }
  if (((param_3 != (long *)0x0) && (*param_3 == *(long *)PTR_DAT_09eccc58)) &&
     (lVar14 = param_3[3], lVar14 != 0)) {
    if (*(int *)(lVar14 + 0x40) != 2) {
      return auVar15;
    }
    if (cRam000000000a44ea89 == '\0') {
      func_0x0415191c(PTR_DAT_09eb4ed0);
      cRam000000000a44ea89 = '\x01';
    }
    lVar6 = *(long *)(*(long *)(*(long *)PTR_DAT_09eb4ed0 + 0xb8) + 0x70);
    if (lVar6 != 0) {
      plVar7 = (long *)func_0x0567a858(lVar6,*(undefined8 *)PTR_DAT_09eccc68);
      lVar6 = param_3[6];
      iVar5 = func_0x047e4168(lVar14,0);
      if (iVar5 == 1) {
        uVar8 = func_0x047e2a1c(param_3[4],lVar6,lVar14,0);
        if (plVar7 == (long *)0x0) goto code_r0x04772b14;
        lVar6 = *plVar7;
        uVar12 = (ulong)*(ushort *)(lVar6 + 0x12e);
        lVar14 = *(long *)PTR_DAT_09eccc60;
        if (uVar12 != 0) {
          piVar13 = (int *)(*(long *)(lVar6 + 0xb0) + 8);
          do {
            if (*(long *)(piVar13 + -2) == lVar14) goto code_r0x04772aec;
            uVar12 = uVar12 - 1;
            piVar13 = piVar13 + 4;
          } while (uVar12 != 0);
        }
      }
      else {
        auVar15 = func_0x047e4168(lVar14,0);
        if (auVar15._0_4_ != 2) {
          return auVar15;
        }
        uVar8 = func_0x047e2a1c(param_3[4],lVar6,lVar14,0);
        if (plVar7 == (long *)0x0) goto code_r0x04772b14;
        lVar6 = *plVar7;
        uVar12 = (ulong)*(ushort *)(lVar6 + 0x12e);
        lVar14 = *(long *)PTR_DAT_09eccc60;
        if (uVar12 != 0) {
          piVar13 = (int *)(*(long *)(lVar6 + 0xb0) + 8);
          do {
            if (*(long *)(piVar13 + -2) == lVar14) goto code_r0x04772aec;
            uVar12 = uVar12 - 1;
            piVar13 = piVar13 + 4;
          } while (uVar12 != 0);
        }
      }
      puVar9 = (undefined8 *)func_0x041cb4c4(plVar7,lVar14,0);
      goto code_r0x04772af8;
    }
  }
code_r0x04772b14:
  auVar15 = func_0x04151bb8();
  lVar14 = auVar15._0_8_;
  if ((bRam000000000a4512a0 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09eccc70);
    func_0x0415191c(PTR_DAT_09eb5640);
    func_0x0415191c(PTR_DAT_09eac550);
    auVar15 = func_0x0415191c(
                             PTR_Game_Application_InGameHunt_StatusEffectAddEventLogArgs_TypeInfo_09eccc78
                             );
    bRam000000000a4512a0 = 1;
  }
  puVar2 = PTR_DAT_09eac550;
  if (*(char *)(lVar14 + 0x10) == '\0') {
    return auVar15;
  }
  *(undefined1 *)(lVar14 + 0x10) = 0;
  if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
    func_0x04151a94();
  }
  if (cRam000000000a44de1c == '\0') {
    func_0x0415191c(PTR_DAT_09eac550);
    cRam000000000a44de1c = '\x01';
  }
  puVar4 = PTR_Game_Application_InGameHunt_StatusEffectAddEventLogArgs_TypeInfo_09eccc78;
  lVar6 = *(long *)puVar2;
  if (*(int *)(lVar6 + 0xe0) == 0) {
    func_0x04151a94();
    lVar6 = *(long *)puVar2;
  }
  puVar3 = PTR_DAT_09eccc70;
  puVar2 = PTR_DAT_09eb5640;
  lVar11 = *(long *)puVar4;
  lVar6 = *(long *)(*(long *)(lVar6 + 0xb8) + 0x48);
  if (*(int *)(lVar11 + 0xe0) == 0) {
    func_0x04151a94(lVar11);
    lVar11 = *(long *)puVar4;
  }
  uVar1 = **(undefined4 **)(lVar11 + 0xb8);
  uVar8 = func_0x04151ba8(*(undefined8 *)puVar2);
  func_0x061bc800(uVar8,lVar14,*(undefined8 *)puVar3,0);
  if (lVar6 == 0) {
    uVar12 = func_0x04151bb8();
    if ((bRam000000000a4512a1 & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eccc70);
      func_0x0415191c(PTR_DAT_09eb5640);
      func_0x0415191c(PTR_DAT_09eac550);
      func_0x0415191c(PTR_Game_Application_InGameHunt_StatusEffectAddEventLogArgs_TypeInfo_09eccc78)
      ;
      bRam000000000a4512a1 = 1;
    }
  }
  else {
    uVar10 = uVar8;
    if ((bRam000000000a44df25 & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eadf18,uVar1,uVar8,0);
      bRam000000000a44df25 = 1;
    }
    plVar7 = *(long **)(lVar6 + 0x20);
    if (plVar7 != (long *)0x0) {
      lVar14 = *plVar7;
      uVar12 = (ulong)*(ushort *)(lVar14 + 0x12e);
      if (uVar12 != 0) {
        piVar13 = (int *)(*(long *)(lVar14 + 0xb0) + 8);
        do {
          if (*(long *)(piVar13 + -2) == *(long *)PTR_DAT_09eadf18) {
            puVar9 = (undefined8 *)(lVar14 + (long)(*piVar13 + 5) * 0x10 + 0x138);
            goto code_r0x042ba4a4;
          }
          uVar12 = uVar12 - 1;
          piVar13 = piVar13 + 4;
        } while (uVar12 != 0);
      }
      puVar9 = (undefined8 *)func_0x041cb4c4(plVar7,*(long *)PTR_DAT_09eadf18,5);
code_r0x042ba4a4:
                    /* WARNING: Could not recover jumptable at 0x042ba4c0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      auVar15 = (*(code *)*puVar9)(plVar7,uVar1,uVar8,puVar9[1]);
      return auVar15;
    }
    auVar15 = func_0x04151bb8();
    if ((bRam000000000a44df26 & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eadf18);
      bRam000000000a44df26 = 1;
    }
    plVar7 = *(long **)(auVar15._0_8_ + 0x20);
    if (plVar7 != (long *)0x0) {
      lVar14 = *plVar7;
      uVar12 = (ulong)*(ushort *)(lVar14 + 0x12e);
      if (uVar12 != 0) {
        piVar13 = (int *)(*(long *)(lVar14 + 0xb0) + 8);
        do {
          if (*(long *)(piVar13 + -2) == *(long *)PTR_DAT_09eadf18) {
            puVar9 = (undefined8 *)(lVar14 + (long)(*piVar13 + 6) * 0x10 + 0x138);
            goto code_r0x042ba558;
          }
          uVar12 = uVar12 - 1;
          piVar13 = piVar13 + 4;
        } while (uVar12 != 0);
      }
      puVar9 = (undefined8 *)func_0x041cb4c4(plVar7,*(long *)PTR_DAT_09eadf18,6);
code_r0x042ba558:
                    /* WARNING: Could not recover jumptable at 0x042ba56c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      auVar15 = (*(code *)*puVar9)(plVar7,auVar15._8_8_,puVar9[1]);
      return auVar15;
    }
    auVar15 = func_0x04151bb8();
    if ((bRam000000000a44df28 & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eadf18);
      bRam000000000a44df28 = 1;
    }
    plVar7 = *(long **)(auVar15._0_8_ + 0x20);
    if (plVar7 != (long *)0x0) {
      lVar14 = *plVar7;
      uVar12 = (ulong)*(ushort *)(lVar14 + 0x12e);
      if (uVar12 != 0) {
        piVar13 = (int *)(*(long *)(lVar14 + 0xb0) + 8);
        do {
          if (*(long *)(piVar13 + -2) == *(long *)PTR_DAT_09eadf18) {
            puVar9 = (undefined8 *)(lVar14 + (long)(*piVar13 + 8) * 0x10 + 0x138);
            goto code_r0x042ba60c;
          }
          uVar12 = uVar12 - 1;
          piVar13 = piVar13 + 4;
        } while (uVar12 != 0);
      }
      puVar9 = (undefined8 *)func_0x041cb4c4(plVar7,*(long *)PTR_DAT_09eadf18,8);
code_r0x042ba60c:
                    /* WARNING: Could not recover jumptable at 0x042ba628. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      auVar15 = (*(code *)*puVar9)(plVar7,auVar15._8_8_,uVar10,puVar9[1]);
      return auVar15;
    }
    uVar12 = func_0x04151bb8();
    puVar2 = PTR_DAT_09eaa200;
    if ((bRam000000000a4651b8 & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eaa200,0);
      bRam000000000a4651b8 = 1;
    }
    if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
      func_0x04151a94();
    }
  }
  auVar16._8_8_ = 0;
  auVar16._0_8_ = uVar12;
  return auVar16;
code_r0x04772aec:
  puVar9 = (undefined8 *)(lVar6 + (long)*piVar13 * 0x10 + 0x138);
code_r0x04772af8:
                    /* WARNING: Could not recover jumptable at 0x04772b10. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  auVar15 = (*(code *)*puVar9)(plVar7,uVar8,puVar9[1]);
  return auVar15;
}


```

## BuffEffectController.OnSkillFire (off 0x4675054)

```c

ulong FUN_04779054(undefined8 param_1,undefined8 param_2,long *param_3)

{
  undefined4 uVar1;
  long lVar2;
  ulong uVar3;
  undefined8 *puVar4;
  long *plVar5;
  long *plVar6;
  long *plVar7;
  long lVar8;
  int *piVar9;
  long lVar10;
  long lVar11;
  long *plStack_c8;
  undefined *puStack_c0;
  long *plStack_b8;
  undefined *puStack_b0;
  long *plStack_a8;
  undefined8 uStack_a0;
  long *plStack_98;
  undefined4 auStack_88 [2];
  undefined *puStack_80;
  long *plStack_78;
  long lStack_70;
  long *plStack_68;
  long *plStack_58;
  undefined *puStack_50;
  long *plStack_18;
  
  plVar5 = param_3;
  if ((bRam000000000a4512d4 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09eccdd0);
    func_0x0415191c(PTR_DAT_09eccec0);
    func_0x0415191c(PTR_DAT_09eccec8);
    bRam000000000a4512d4 = 1;
  }
  plStack_18 = (long *)0x0;
  if (cRam000000000a44ea89 == '\0') {
    func_0x0415191c(PTR_DAT_09eb4ed0);
    cRam000000000a44ea89 = '\x01';
  }
  lVar2 = *(long *)(*(long *)(*(long *)PTR_DAT_09eb4ed0 + 0xb8) + 0x70);
  if (lVar2 != 0) {
    plVar5 = *(long **)PTR_DAT_09eccec8;
    uVar3 = func_0x0567aa58(lVar2,&plStack_18);
    plVar6 = plStack_18;
    if ((uVar3 & 1) == 0) {
      return uVar3;
    }
    if (((param_3 != (long *)0x0) && (*param_3 == *(long *)PTR_DAT_09eccdd0)) &&
       (plStack_18 != (long *)0x0)) {
      lVar2 = *plStack_18;
      lVar10 = param_3[3];
      uVar3 = (ulong)*(ushort *)(lVar2 + 0x12e);
      if (uVar3 != 0) {
        piVar9 = (int *)(*(long *)(lVar2 + 0xb0) + 8);
        do {
          if (*(long *)(piVar9 + -2) == *(long *)PTR_DAT_09eccec0) {
            puVar4 = (undefined8 *)(lVar2 + (long)(*piVar9 + 5) * 0x10 + 0x138);
            goto code_r0x0477916c;
          }
          uVar3 = uVar3 - 1;
          piVar9 = piVar9 + 4;
        } while (uVar3 != 0);
      }
      puVar4 = (undefined8 *)func_0x041cb4c4(plStack_18,*(long *)PTR_DAT_09eccec0,5);
code_r0x0477916c:
      uVar3 = (*(code *)*puVar4)(plVar6,lVar10,puVar4[1]);
      return uVar3;
    }
  }
  func_0x04151bb8();
  puStack_50 = &UNK_0477918c;
  plVar6 = plVar5;
  if ((bRam000000000a4512d5 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09eccec0);
    func_0x0415191c(PTR_DAT_09eccc58);
    func_0x0415191c(PTR_DAT_09eccec8);
    bRam000000000a4512d5 = 1;
  }
  lVar2 = 0xa44e000;
  plStack_58 = (long *)0x0;
  if (cRam000000000a44ea89 == '\0') {
    func_0x0415191c(PTR_DAT_09eb4ed0);
    cRam000000000a44ea89 = '\x01';
  }
  lVar10 = *(long *)(*(long *)(*(long *)PTR_DAT_09eb4ed0 + 0xb8) + 0x70);
  if (lVar10 != 0) {
    plVar6 = *(long **)PTR_DAT_09eccec8;
    uVar3 = func_0x0567aa58(lVar10,&plStack_58);
    if ((uVar3 & 1) == 0) {
      return uVar3;
    }
    if (((plVar5 != (long *)0x0) && (*plVar5 == *(long *)PTR_DAT_09eccc58)) &&
       (lVar2 = plVar5[3], lVar2 != 0)) {
      if (*(int *)(lVar2 + 0x40) == 2) {
        return uVar3;
      }
      lVar10 = plVar5[4];
      uVar1 = func_0x047e4168(lVar2,0);
      plVar7 = plStack_58;
      if (plStack_58 != (long *)0x0) {
        lVar8 = *plStack_58;
        lVar11 = plVar5[6];
        uVar3 = (ulong)*(ushort *)(lVar8 + 0x12e);
        if (uVar3 != 0) {
          piVar9 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
          do {
            if (*(long *)(piVar9 + -2) == *(long *)PTR_DAT_09eccec0) {
              puVar4 = (undefined8 *)(lVar8 + (long)(*piVar9 + 6) * 0x10 + 0x138);
              goto code_r0x047792d4;
            }
            uVar3 = uVar3 - 1;
            piVar9 = piVar9 + 4;
          } while (uVar3 != 0);
        }
        puVar4 = (undefined8 *)func_0x041cb4c4(plStack_58,*(long *)PTR_DAT_09eccec0,6);
code_r0x047792d4:
        uVar3 = (*(code *)*puVar4)(plVar7,lVar10,uVar1,lVar11,lVar2,lVar11,puVar4[1]);
        return uVar3;
      }
    }
  }
  func_0x04151bb8();
  puStack_80 = &UNK_0477930c;
  plVar7 = plVar6;
  lStack_70 = lVar2;
  plStack_68 = plVar5;
  if ((bRam000000000a4512d6 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09eccec0);
    func_0x0415191c(PTR_DAT_09ecb358);
    func_0x0415191c(PTR_DAT_09eccec8);
    bRam000000000a4512d6 = 1;
  }
  plStack_78 = (long *)0x0;
  auStack_88[0] = 0;
  if (cRam000000000a44ea89 == '\0') {
    func_0x0415191c(PTR_DAT_09eb4ed0);
    cRam000000000a44ea89 = '\x01';
  }
  lVar2 = *(long *)(*(long *)(*(long *)PTR_DAT_09eb4ed0 + 0xb8) + 0x70);
  if (lVar2 != 0) {
    plVar7 = *(long **)PTR_DAT_09eccec8;
    uVar3 = func_0x0567aa58(lVar2,&plStack_78);
    if ((uVar3 & 1) == 0) {
      return uVar3;
    }
    if (((plVar6 != (long *)0x0) && (*plVar6 == *(long *)PTR_DAT_09ecb358)) && (plVar6[3] != 0)) {
      auStack_88[0] = *(undefined4 *)(plVar6[3] + 0x10);
      uVar3 = func_0x047c6840(auStack_88,0);
      if (((uVar3 & 1) != 0) &&
         (uVar3 = func_0x047c6834(auStack_88,0), plVar5 = plStack_78, (uVar3 & 1) != 0)) {
        plVar6 = (long *)0x0;
        if (plStack_78 == (long *)0x0) goto code_r0x047794f0;
        lVar2 = *plStack_78;
        uVar3 = (ulong)*(ushort *)(lVar2 + 0x12e);
        if (uVar3 != 0) {
          piVar9 = (int *)(*(long *)(lVar2 + 0xb0) + 8);
          do {
            if (*(long *)(piVar9 + -2) == *(long *)PTR_DAT_09eccec0) {
              puVar4 = (undefined8 *)(lVar2 + (long)(*piVar9 + 7) * 0x10 + 0x138);
              goto code_r0x04779458;
            }
            uVar3 = uVar3 - 1;
            piVar9 = piVar9 + 4;
          } while (uVar3 != 0);
        }
        plVar7 = (long *)0x7;
        puVar4 = (undefined8 *)func_0x041cb4c4(plStack_78);
code_r0x04779458:
        (*(code *)*puVar4)(plVar5,puVar4[1]);
      }
      uVar3 = func_0x047c6834(auStack_88,0);
      plVar5 = plStack_78;
      if ((uVar3 & 1) != 0) {
        return uVar3;
      }
      plVar6 = (long *)0x0;
      if (plStack_78 != (long *)0x0) {
        lVar2 = *plStack_78;
        uVar3 = (ulong)*(ushort *)(lVar2 + 0x12e);
        if (uVar3 != 0) {
          piVar9 = (int *)(*(long *)(lVar2 + 0xb0) + 8);
          do {
            if (*(long *)(piVar9 + -2) == *(long *)PTR_DAT_09eccec0) {
              puVar4 = (undefined8 *)(lVar2 + (long)(*piVar9 + 8) * 0x10 + 0x138);
              goto code_r0x047794d4;
            }
            uVar3 = uVar3 - 1;
            piVar9 = piVar9 + 4;
          } while (uVar3 != 0);
        }
        puVar4 = (undefined8 *)func_0x041cb4c4(plStack_78,*(long *)PTR_DAT_09eccec0,8);
code_r0x047794d4:
        uVar3 = (*(code *)*puVar4)(plVar5,puVar4[1]);
        return uVar3;
      }
    }
  }
code_r0x047794f0:
  func_0x04151bb8();
  puStack_b0 = &UNK_047794f4;
  uStack_a0 = 0xa44e000;
  plStack_98 = plVar6;
  if ((bRam000000000a4512d7 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ec4938);
    func_0x0415191c(PTR_DAT_09eccec0);
    func_0x0415191c(PTR_DAT_09eccec8);
    bRam000000000a4512d7 = 1;
  }
  plStack_a8 = (long *)0x0;
  if (cRam000000000a44ea89 == '\0') {
    func_0x0415191c(PTR_DAT_09eb4ed0);
    cRam000000000a44ea89 = '\x01';
  }
  lVar2 = *(long *)(*(long *)(*(long *)PTR_DAT_09eb4ed0 + 0xb8) + 0x70);
  if (lVar2 != 0) {
    uVar3 = func_0x0567aa58(lVar2,&plStack_a8,*(undefined8 *)PTR_DAT_09eccec8);
    plVar5 = plStack_a8;
    if ((uVar3 & 1) == 0) {
      return uVar3;
    }
    if (((plVar7 != (long *)0x0) && (*plVar7 == *(long *)PTR_DAT_09ec4938)) &&
       (plStack_a8 != (long *)0x0)) {
      lVar2 = *plStack_a8;
      lVar10 = plVar7[2];
      uVar3 = (ulong)*(ushort *)(lVar2 + 0x12e);
      if (uVar3 != 0) {
        piVar9 = (int *)(*(long *)(lVar2 + 0xb0) + 8);
        do {
          if (*(long *)(piVar9 + -2) == *(long *)PTR_DAT_09eccec0) {
            puVar4 = (undefined8 *)(lVar2 + (long)(*piVar9 + 10) * 0x10 + 0x138);
            goto code_r0x0477960c;
          }
          uVar3 = uVar3 - 1;
          piVar9 = piVar9 + 4;
        } while (uVar3 != 0);
      }
      puVar4 = (undefined8 *)func_0x041cb4c4(plStack_a8,*(long *)PTR_DAT_09eccec0,10);
code_r0x0477960c:
      uVar3 = (*(code *)*puVar4)(plVar5,lVar10,puVar4[1]);
      return uVar3;
    }
  }
  func_0x04151bb8();
  puStack_c0 = &UNK_0477962c;
  plStack_b8 = plVar7;
  if ((bRam000000000a4512d8 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09eccec0);
    func_0x0415191c(PTR_DAT_09eccec8);
    bRam000000000a4512d8 = 1;
  }
  plStack_c8 = (long *)0x0;
  if (cRam000000000a44ea89 == '\0') {
    func_0x0415191c(PTR_DAT_09eb4ed0);
    cRam000000000a44ea89 = '\x01';
  }
  lVar2 = *(long *)(*(long *)(*(long *)PTR_DAT_09eb4ed0 + 0xb8) + 0x70);
  if (lVar2 == 0) {
code_r0x0477972c:
    lVar2 = func_0x04151bb8();
    return *(ulong *)(lVar2 + 0xb8);
  }
  uVar3 = func_0x0567aa58(lVar2,&plStack_c8,*(undefined8 *)PTR_DAT_09eccec8);
  plVar5 = plStack_c8;
  if ((uVar3 & 1) != 0) {
    if (plStack_c8 == (long *)0x0) goto code_r0x0477972c;
    lVar2 = *plStack_c8;
    uVar3 = (ulong)*(ushort *)(lVar2 + 0x12e);
    if (uVar3 != 0) {
      piVar9 = (int *)(*(long *)(lVar2 + 0xb0) + 8);
      do {
        if (*(long *)(piVar9 + -2) == *(long *)PTR_DAT_09eccec0) {
          puVar4 = (undefined8 *)(lVar2 + (long)(*piVar9 + 9) * 0x10 + 0x138);
          goto code_r0x04779714;
        }
        uVar3 = uVar3 - 1;
        piVar9 = piVar9 + 4;
      } while (uVar3 != 0);
    }
    puVar4 = (undefined8 *)func_0x041cb4c4(plStack_c8,*(long *)PTR_DAT_09eccec0,9);
code_r0x04779714:
    uVar3 = (*(code *)*puVar4)(plVar5,puVar4[1]);
  }
  return uVar3;
}


```

## Party.Move (off 0x46d9e54)

```c

undefined8 FUN_047dde54(float param_1,float param_2,long param_3,ulong param_4)

{
  undefined *puVar1;
  undefined *puVar2;
  undefined *puVar3;
  bool bVar4;
  ulong uVar5;
  long *plVar6;
  undefined8 *puVar7;
  long lVar8;
  int *piVar9;
  long lVar10;
  long *plVar11;
  undefined8 *unaff_x23;
  float fVar12;
  undefined8 uVar13;
  undefined1 auVar14 [12];
  undefined8 uStack_98;
  undefined8 uStack_90;
  long lStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  long lStack_70;
  
  if ((bRam000000000a45162c & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece960);
    func_0x0415191c(PTR_DAT_09ece968);
    func_0x0415191c(PTR_DAT_09ece970);
    func_0x0415191c(PTR_DAT_09ece810);
    func_0x0415191c(PTR_DAT_09ece978);
    bRam000000000a45162c = 1;
  }
  puVar3 = PTR_DAT_09ece968;
  puVar2 = PTR_DAT_09ece960;
  puVar1 = PTR_DAT_09ece810;
  uStack_80 = 0;
  uStack_78 = 0;
  lStack_70 = 0;
  if (*(long *)(param_3 + 0x20) == 0) {
code_r0x047de064:
    auVar14 = func_0x04151bb8();
    if (auVar14._8_4_ == 1) {
      plVar6 = (long *)func_0x098f6de0(auVar14._0_8_);
      lVar10 = *plVar6;
      func_0x098f6df0();
      uVar13 = func_0x05d3cfd4(&uStack_80,*unaff_x23);
      if (lVar10 == 0) {
        return uVar13;
      }
      func_0x04151bb0(lVar10);
    }
    func_0x05d3cfd4(&uStack_80,*unaff_x23);
    func_0x04247ab0(auVar14._0_8_);
    func_0x04151bb0(0);
    func_0x03bf6574();
    return 2;
  }
  func_0x06cc507c(&uStack_98,*(long *)(param_3 + 0x20),*(undefined8 *)PTR_DAT_09ece978);
  uStack_78 = uStack_90;
  uStack_80 = uStack_98;
  lStack_70 = lStack_88;
code_r0x047ddf1c:
  uVar5 = func_0x05d3cfd8(&uStack_80,*(undefined8 *)puVar3);
  lVar10 = lStack_70;
  if ((uVar5 & 1) == 0) {
    uVar13 = func_0x05d3cfd4(&uStack_80,*(undefined8 *)puVar2);
    return uVar13;
  }
  if (lStack_70 != 0) goto code_r0x047ddf34;
  func_0x04151bb8();
  goto code_r0x047de054;
code_r0x047ddf34:
  if (*(char *)(lStack_70 + 0xb4) != '\0') goto code_r0x047ddf1c;
  fVar12 = param_2;
  if ((param_4 & 1) == 0) {
code_r0x047ddf5c:
    bVar4 = fVar12 <= *(float *)(lVar10 + 0x90) - *(float *)(lVar10 + 0x70);
    *(bool *)(param_3 + 0x28) = bVar4;
    if ((bVar4) || (*(char *)(lVar10 + 0x94) != '\0')) goto code_r0x047ddf1c;
    plVar6 = *(long **)(lVar10 + 0x80);
    if (plVar6 != (long *)0x0) {
      plVar11 = *(long **)(param_3 + 0x10);
      fVar12 = (float)(**(code **)(*plVar6 + 0x178))(plVar6,*(undefined8 *)(*plVar6 + 0x180));
      plVar6 = *(long **)(lVar10 + 0x80);
      if (plVar6 != (long *)0x0) {
        uVar13 = (**(code **)(*plVar6 + 0x188))(plVar6,*(undefined8 *)(*plVar6 + 400));
        if (plVar11 != (long *)0x0) {
          lVar8 = *plVar11;
          uVar5 = (ulong)*(ushort *)(lVar8 + 0x12e);
          if (uVar5 != 0) {
            piVar9 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
            do {
              if (*(long *)(piVar9 + -2) == *(long *)puVar1) {
                puVar7 = (undefined8 *)(lVar8 + (long)(*piVar9 + 0xc) * 0x10 + 0x138);
                goto code_r0x047de008;
              }
              uVar5 = uVar5 - 1;
              piVar9 = piVar9 + 4;
            } while (uVar5 != 0);
          }
          puVar7 = (undefined8 *)func_0x041cb4c4(plVar11,*(long *)puVar1,0xc);
code_r0x047de008:
          (*(code *)*puVar7)(fVar12 * param_1,uVar13,plVar11,lVar10,puVar7[1]);
          goto code_r0x047ddf1c;
        }
        goto code_r0x047de060;
      }
      goto code_r0x047de058;
    }
  }
  else {
    plVar6 = *(long **)(lStack_70 + 0x80);
    if (plVar6 != (long *)0x0) {
      fVar12 = (float)(**(code **)(*plVar6 + 0x198))(plVar6,*(undefined8 *)(*plVar6 + 0x1a0));
      fVar12 = param_2 - fVar12;
      goto code_r0x047ddf5c;
    }
code_r0x047de054:
    func_0x04151bb8();
code_r0x047de058:
    func_0x04151bb8();
  }
  func_0x04151bb8();
code_r0x047de060:
  func_0x04151bb8();
  unaff_x23 = (undefined8 *)puVar2;
  goto code_r0x047de064;
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

