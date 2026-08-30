# Decompiled functions — batch 3 (skill queue + team power)

## EncountState.SkillEnqueue (off 0x46d15a0)

```c

void Game_Application_InGameHunt_HuntSimulator_EncountState__SkillEnqueue
               (long param_1,undefined8 param_2,long param_3,int param_4)

{
  undefined *puVar1;
  ulong uVar2;
  long lVar3;
  float extraout_s0;
  undefined8 uStack_40;
  long lStack_38;
  
  if (param_3 != 0) {
    uVar2 = func_0x047e4298(param_3,0);
    if ((uVar2 & 1) != 0) {
      return;
    }
    func_0x047e51c0(param_3,0);
    if (param_4 == 2) {
      lVar3 = *(long *)(param_1 + 0x30);
    }
    else {
      if (param_4 != 1) {
        return;
      }
      lVar3 = *(long *)(param_1 + 0x28);
    }
    if (lVar3 != 0) {
      if ((bRam000000000a4516a4 & 1) == 0) {
        func_0x0415191c(PTR_DAT_09ecef28,param_2,param_3,0);
        bRam000000000a4516a4 = 1;
      }
      lVar3 = *(long *)(lVar3 + 0x10);
      lStack_38 = 0;
      uStack_40 = param_2;
      func_0x041518c0(&uStack_40,param_2);
      lStack_38 = param_3;
      func_0x041518c0(&lStack_38,param_3);
      if (lVar3 != 0) {
        func_0x072d0b40(lVar3,uStack_40,lStack_38,*(undefined8 *)PTR_DAT_09ecef28);
        return;
      }
      lVar3 = func_0x04151bb8();
      puVar1 = PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0;
      if ((bRam000000000a4516a5 & 1) == 0) {
        func_0x0415191c(PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0);
        bRam000000000a4516a5 = 1;
      }
      if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
        func_0x04151a94();
      }
      *(float *)(lVar3 + 0x1c) = *(float *)(lVar3 + 0x1c) + extraout_s0 * 1000.0;
      return;
    }
  }
  func_0x04151bb8();
  return;
}


```

## EncountState.UpdateSkillQueue (off 0x46d1cec)

```c

void Game_Application_InGameHunt_HuntSimulator_EncountState__UpdateSkillQueue
               (long *param_1,long param_2,long *param_3,long param_4,undefined8 param_5,
               undefined8 param_6,long *param_7)

{
  undefined *puVar1;
  undefined *puVar2;
  undefined *puVar3;
  int iVar4;
  undefined8 *puVar5;
  long *plVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  long extraout_x1;
  long *plVar9;
  uint uVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  int *piVar14;
  int iVar15;
  long *plVar16;
  long *plVar17;
  float extraout_s0;
  undefined4 uVar18;
  float fVar19;
  undefined1 auVar20 [12];
  undefined1 auVar21 [16];
  
  plVar9 = param_3;
  if ((bRam000000000a4515c0 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece810);
    func_0x0415191c(PTR_DAT_09eaa288);
    func_0x0415191c(PTR_DAT_09ece910);
    func_0x0415191c(PTR_DAT_09ece918);
    func_0x0415191c(PTR_DAT_09eaa8d0);
    func_0x0415191c(PTR_DAT_09ecea08);
    func_0x0415191c(PTR_DAT_09ecea10);
    func_0x0415191c(PTR_DAT_09ecd6d0);
    func_0x0415191c(PTR_DAT_09ecea18);
    func_0x0415191c(PTR_DAT_09ec45e0);
    func_0x0415191c(PTR_DAT_09eb96c8);
    bRam000000000a4515c0 = 1;
  }
  if ((char)param_1[3] != '\0') {
    return;
  }
  if ((param_2 == 0) || (param_1 = *(long **)(param_2 + 0x30), param_1 == (long *)0x0)) {
code_r0x047d63a0:
    func_0x04151bb8();
code_r0x047d63a4:
    func_0x04151bb8();
  }
  else {
    lVar11 = *param_1;
    uVar13 = (ulong)*(ushort *)(lVar11 + 0x12e);
    if (uVar13 != 0) {
      piVar14 = (int *)(*(long *)(lVar11 + 0xb0) + 8);
      do {
        if (*(long *)(piVar14 + -2) == *(long *)PTR_DAT_09ecea08) {
          puVar5 = (undefined8 *)(lVar11 + (long)*piVar14 * 0x10 + 0x138);
          goto code_r0x047d5e10;
        }
        uVar13 = uVar13 - 1;
        piVar14 = piVar14 + 4;
      } while (uVar13 != 0);
    }
    plVar9 = (long *)0x0;
    puVar5 = (undefined8 *)func_0x041cb4c4(param_1);
code_r0x047d5e10:
    iVar4 = (*(code *)*puVar5)(param_1,puVar5[1]);
    puVar2 = PTR_DAT_09ecea18;
    puVar1 = PTR_DAT_09eb96c8;
    if (0 < iVar4) {
      iVar15 = 0;
      do {
        lVar11 = *param_1;
        uVar13 = (ulong)*(ushort *)(lVar11 + 0x12e);
        if (uVar13 != 0) {
          piVar14 = (int *)(*(long *)(lVar11 + 0xb0) + 8);
          do {
            if (*(long *)(piVar14 + -2) == *(long *)puVar2) {
              puVar5 = (undefined8 *)(lVar11 + (long)*piVar14 * 0x10 + 0x138);
              goto code_r0x047d5e8c;
            }
            uVar13 = uVar13 - 1;
            piVar14 = piVar14 + 4;
          } while (uVar13 != 0);
        }
        puVar5 = (undefined8 *)func_0x041cb4c4(param_1,*(long *)puVar2,0);
code_r0x047d5e8c:
        plVar9 = (long *)puVar5[1];
        plVar6 = (long *)(*(code *)*puVar5)(param_1,iVar15);
        if (((plVar6 != (long *)0x0) && (uVar13 = func_0x047e4288(plVar6,0), (uVar13 & 1) != 0)) &&
           (uVar13 = func_0x047e4298(plVar6,0), (uVar13 & 1) == 0)) {
          if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
            func_0x04151a94();
          }
          if (cRam000000000a45163e == '\0') {
            func_0x0415191c(puVar1);
            cRam000000000a45163e = '\x01';
          }
          lVar11 = *(long *)puVar1;
          if (*(int *)(lVar11 + 0xe0) == 0) {
            func_0x04151a94();
            lVar11 = *(long *)puVar1;
          }
          plVar16 = *(long **)(param_2 + 0x20);
          if (plVar16 == (long *)0x0) goto code_r0x047d63a0;
          lVar12 = *plVar16;
          plVar17 = (long *)**(undefined8 **)(lVar11 + 0xb8);
          uVar13 = (ulong)*(ushort *)(lVar12 + 0x12e);
          if (uVar13 != 0) {
            piVar14 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
            do {
              if (*(long *)(piVar14 + -2) == *(long *)PTR_DAT_09ecd6d0) {
                puVar5 = (undefined8 *)(lVar12 + (long)*piVar14 * 0x10 + 0x138);
                goto code_r0x047d5f60;
              }
              uVar13 = uVar13 - 1;
              piVar14 = piVar14 + 4;
            } while (uVar13 != 0);
          }
          puVar5 = (undefined8 *)func_0x041cb4c4(plVar16,*(long *)PTR_DAT_09ecd6d0,0);
code_r0x047d5f60:
          plVar9 = (long *)puVar5[1];
          plVar16 = (long *)(*(code *)*puVar5)(plVar16,iVar15);
          if (plVar17 == (long *)0x0) goto code_r0x047d63a0;
          lVar11 = *plVar17;
          uVar13 = (ulong)*(ushort *)(lVar11 + 0x12e);
          if (uVar13 != 0) {
            piVar14 = (int *)(*(long *)(lVar11 + 0xb0) + 8);
            do {
              if (*(long *)(piVar14 + -2) == *(long *)PTR_DAT_09ecea10) {
                puVar5 = (undefined8 *)(lVar11 + (long)*piVar14 * 0x10 + 0x138);
                goto code_r0x047d5fcc;
              }
              uVar13 = uVar13 - 1;
              piVar14 = piVar14 + 4;
            } while (uVar13 != 0);
          }
          plVar9 = (long *)0x0;
          puVar5 = (undefined8 *)func_0x041cb4c4(plVar17);
code_r0x047d5fcc:
          uVar13 = (*(code *)*puVar5)(plVar17,puVar5[1]);
          if ((uVar13 & 1) != 0) {
            if (plVar16 == (long *)0x0) goto code_r0x047d63a0;
            lVar11 = *plVar16;
            uVar13 = (ulong)*(ushort *)(lVar11 + 0x12e);
            if (uVar13 != 0) {
              piVar14 = (int *)(*(long *)(lVar11 + 0xb0) + 8);
              do {
                if (*(long *)(piVar14 + -2) == *(long *)PTR_DAT_09ec45e0) {
                  puVar5 = (undefined8 *)(lVar11 + (long)(*piVar14 + 10) * 0x10 + 0x138);
                  goto code_r0x047d6038;
                }
                uVar13 = uVar13 - 1;
                piVar14 = piVar14 + 4;
              } while (uVar13 != 0);
            }
            plVar9 = (long *)0xa;
            puVar5 = (undefined8 *)func_0x041cb4c4(plVar16);
code_r0x047d6038:
            uVar13 = (*(code *)*puVar5)(plVar16,puVar5[1]);
            if ((uVar13 & 1) == 0) {
              plVar16 = *(long **)(param_2 + 0x20);
              if (plVar16 == (long *)0x0) goto code_r0x047d63a0;
              lVar11 = *plVar16;
              uVar13 = (ulong)*(ushort *)(lVar11 + 0x12e);
              if (uVar13 != 0) {
                piVar14 = (int *)(*(long *)(lVar11 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar14 + -2) == *(long *)PTR_DAT_09ecd6d0) {
                    puVar5 = (undefined8 *)(lVar11 + (long)*piVar14 * 0x10 + 0x138);
                    goto code_r0x047d60a4;
                  }
                  uVar13 = uVar13 - 1;
                  piVar14 = piVar14 + 4;
                } while (uVar13 != 0);
              }
              puVar5 = (undefined8 *)func_0x041cb4c4(plVar16,*(long *)PTR_DAT_09ecd6d0,0);
code_r0x047d60a4:
              plVar9 = (long *)puVar5[1];
              uVar7 = (*(code *)*puVar5)(plVar16,iVar15);
              if (param_3 == (long *)0x0) goto code_r0x047d63a0;
              lVar11 = *param_3;
              uVar13 = (ulong)*(ushort *)(lVar11 + 0x12e);
              if (uVar13 != 0) {
                piVar14 = (int *)(*(long *)(lVar11 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar14 + -2) == *(long *)PTR_DAT_09ece810) {
                    puVar5 = (undefined8 *)(lVar11 + (long)(*piVar14 + 5) * 0x10 + 0x138);
                    goto code_r0x047d6114;
                  }
                  uVar13 = uVar13 - 1;
                  piVar14 = piVar14 + 4;
                } while (uVar13 != 0);
              }
              puVar5 = (undefined8 *)func_0x041cb4c4(param_3,*(long *)PTR_DAT_09ece810,5);
code_r0x047d6114:
              param_5 = puVar5[1];
              param_4 = 1;
              (*(code *)*puVar5)(param_3,uVar7);
              plVar9 = plVar6;
            }
          }
        }
        iVar15 = iVar15 + 1;
      } while (iVar15 != iVar4);
    }
    plVar6 = *(long **)(param_2 + 0x38);
    param_1 = (long *)0x0;
    if (plVar6 == (long *)0x0) goto code_r0x047d63a0;
    lVar11 = *plVar6;
    uVar13 = (ulong)*(ushort *)(lVar11 + 0x12e);
    if (uVar13 != 0) {
      piVar14 = (int *)(*(long *)(lVar11 + 0xb0) + 8);
      do {
        if (*(long *)(piVar14 + -2) == *(long *)PTR_DAT_09ece910) {
          puVar5 = (undefined8 *)(lVar11 + (long)*piVar14 * 0x10 + 0x138);
          goto code_r0x047d6194;
        }
        uVar13 = uVar13 - 1;
        piVar14 = piVar14 + 4;
      } while (uVar13 != 0);
    }
    plVar9 = (long *)0x0;
    puVar5 = (undefined8 *)func_0x041cb4c4(plVar6);
code_r0x047d6194:
    param_1 = (long *)(*(code *)*puVar5)(plVar6,puVar5[1]);
    puVar3 = PTR_DAT_09ece918;
    puVar2 = PTR_DAT_09ece810;
    puVar1 = PTR_DAT_09eaa8d0;
    if (param_1 != (long *)0x0) {
      do {
        do {
          lVar11 = *param_1;
          uVar13 = (ulong)*(ushort *)(lVar11 + 0x12e);
          if (uVar13 != 0) {
            piVar14 = (int *)(*(long *)(lVar11 + 0xb0) + 8);
            do {
              if (*(long *)(piVar14 + -2) == *(long *)puVar1) {
                puVar5 = (undefined8 *)(lVar11 + (long)*piVar14 * 0x10 + 0x138);
                goto code_r0x047d620c;
              }
              uVar13 = uVar13 - 1;
              piVar14 = piVar14 + 4;
            } while (uVar13 != 0);
          }
          plVar9 = (long *)0x0;
          puVar5 = (undefined8 *)func_0x041cb4c4(param_1);
code_r0x047d620c:
          uVar13 = (*(code *)*puVar5)(param_1,puVar5[1]);
          if ((uVar13 & 1) == 0) {
            param_3 = (long *)0x0;
            goto code_r0x047d631c;
          }
          lVar11 = *param_1;
          uVar13 = (ulong)*(ushort *)(lVar11 + 0x12e);
          if (uVar13 != 0) {
            piVar14 = (int *)(*(long *)(lVar11 + 0xb0) + 8);
            do {
              if (*(long *)(piVar14 + -2) == *(long *)puVar3) {
                puVar5 = (undefined8 *)(lVar11 + (long)*piVar14 * 0x10 + 0x138);
                goto code_r0x047d6268;
              }
              uVar13 = uVar13 - 1;
              piVar14 = piVar14 + 4;
            } while (uVar13 != 0);
          }
          plVar9 = (long *)0x0;
          puVar5 = (undefined8 *)func_0x041cb4c4(param_1);
code_r0x047d6268:
          plVar6 = (long *)(*(code *)*puVar5)(param_1,puVar5[1]);
        } while (((plVar6 == (long *)0x0) || (uVar13 = func_0x047e4288(plVar6,0), (uVar13 & 1) == 0)
                 ) || (uVar13 = func_0x047e4298(plVar6,0), (uVar13 & 1) != 0));
        uVar7 = FUN_047ce0f0(param_2);
        if (param_3 == (long *)0x0) goto code_r0x047d63a4;
        lVar11 = *param_3;
        uVar13 = (ulong)*(ushort *)(lVar11 + 0x12e);
        if (uVar13 != 0) {
          piVar14 = (int *)(*(long *)(lVar11 + 0xb0) + 8);
          do {
            if (*(long *)(piVar14 + -2) == *(long *)puVar2) {
              puVar5 = (undefined8 *)(lVar11 + (long)(*piVar14 + 5) * 0x10 + 0x138);
              goto code_r0x047d62fc;
            }
            uVar13 = uVar13 - 1;
            piVar14 = piVar14 + 4;
          } while (uVar13 != 0);
        }
        puVar5 = (undefined8 *)func_0x041cb4c4(param_3,*(long *)puVar2,5);
code_r0x047d62fc:
        param_5 = puVar5[1];
        param_4 = 2;
        (*(code *)*puVar5)(param_3,uVar7);
        plVar9 = plVar6;
      } while( true );
    }
  }
  func_0x04151bb8();
  while( true ) {
    auVar20 = func_0x04151bb0(param_3);
    uVar10 = (uint)param_6;
    if (auVar20._8_4_ != 1) break;
    puVar5 = (undefined8 *)func_0x098f6de0(auVar20._0_8_);
    param_3 = (long *)*puVar5;
    func_0x098f6df0();
code_r0x047d631c:
    if (param_1 != (long *)0x0) {
      lVar11 = *param_1;
      uVar13 = (ulong)*(ushort *)(lVar11 + 0x12e);
      if (uVar13 != 0) {
        piVar14 = (int *)(*(long *)(lVar11 + 0xb0) + 8);
        do {
          if (*(long *)(piVar14 + -2) == *(long *)PTR_DAT_09eaa288) {
            puVar5 = (undefined8 *)(lVar11 + (long)*piVar14 * 0x10 + 0x138);
            goto code_r0x047d6374;
          }
          uVar13 = uVar13 - 1;
          piVar14 = piVar14 + 4;
        } while (uVar13 != 0);
      }
      plVar9 = (long *)0x0;
      puVar5 = (undefined8 *)func_0x041cb4c4(param_1);
code_r0x047d6374:
      (*(code *)*puVar5)(param_1,puVar5[1]);
    }
    if (param_3 == (long *)0x0) {
      return;
    }
  }
  if (param_1 != (long *)0x0) {
    lVar11 = *param_1;
    uVar13 = (ulong)*(ushort *)(lVar11 + 0x12e);
    if (uVar13 != 0) {
      piVar14 = (int *)(*(long *)(lVar11 + 0xb0) + 8);
      do {
        if (*(long *)(piVar14 + -2) == *(long *)PTR_DAT_09eaa288) {
          puVar5 = (undefined8 *)(lVar11 + (long)*piVar14 * 0x10 + 0x138);
          goto code_r0x047d6454;
        }
        uVar13 = uVar13 - 1;
        piVar14 = piVar14 + 4;
      } while (uVar13 != 0);
    }
    plVar9 = (long *)0x0;
    puVar5 = (undefined8 *)func_0x041cb4c4(param_1);
code_r0x047d6454:
    (*(code *)*puVar5)(param_1,puVar5[1]);
  }
  func_0x04247ab0(auVar20._0_8_);
  func_0x04151bb0(0);
  uVar7 = func_0x03bf6574();
  if ((bRam000000000a4515c1 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ecd6f0);
    func_0x0415191c(PTR_DAT_09ece810);
    func_0x0415191c(PTR_DAT_09ec45e0);
    bRam000000000a4515c1 = 1;
  }
  if (extraout_x1 != 0) {
    func_0x047f1584(uVar7,extraout_x1,0);
    uVar13 = func_0x047f13e4(extraout_x1,0);
    puVar1 = PTR_DAT_09ecd6f0;
    while ((uVar13 & 1) != 0) {
      uVar8 = func_0x047f1698(extraout_x1,0);
      if (param_4 == 0) goto code_r0x047d6790;
      uVar13 = func_0x0541f90c(*(undefined8 *)(param_4 + 0x20),uVar8,*(undefined8 *)puVar1);
      if ((uVar13 & 1) != 0) break;
      func_0x047f15f4(extraout_x1,0);
      uVar13 = func_0x047f13e4(extraout_x1,0);
    }
    uVar13 = func_0x047f13e4(extraout_x1,0);
    if (((uVar13 & 1) != 0) && (uVar13 = func_0x047f1434(extraout_x1,0), (uVar13 & 1) == 0)) {
      plVar6 = (long *)func_0x047f1698(extraout_x1,0);
      if (plVar6 == (long *)0x0) goto code_r0x047d6790;
      lVar11 = *plVar6;
      uVar13 = (ulong)*(ushort *)(lVar11 + 0x12e);
      if (uVar13 != 0) {
        piVar14 = (int *)(*(long *)(lVar11 + 0xb0) + 8);
        do {
          if (*(long *)(piVar14 + -2) == *(long *)PTR_DAT_09ec45e0) {
            puVar5 = (undefined8 *)(lVar11 + (long)(*piVar14 + 6) * 0x10 + 0x138);
            goto code_r0x047d65d8;
          }
          uVar13 = uVar13 - 1;
          piVar14 = piVar14 + 4;
        } while (uVar13 != 0);
      }
      puVar5 = (undefined8 *)func_0x041cb4c4(plVar6,*(long *)PTR_DAT_09ec45e0,6);
code_r0x047d65d8:
      uVar13 = (*(code *)*puVar5)(plVar6,puVar5[1]);
      if ((uVar13 & 1) != 0) {
        auVar21 = func_0x047f15f4(extraout_x1,0);
        lVar11 = auVar21._8_8_;
        if ((lVar11 == 0) || (func_0x047e58b8(lVar11,auVar21._0_8_,0), param_7 == (long *)0x0))
        goto code_r0x047d6790;
        lVar12 = *param_7;
        uVar13 = (ulong)*(ushort *)(lVar12 + 0x12e);
        if (uVar13 != 0) {
          piVar14 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
          do {
            if (*(long *)(piVar14 + -2) == *(long *)PTR_DAT_09ece810) {
              puVar5 = (undefined8 *)(lVar12 + (long)(*piVar14 + 6) * 0x10 + 0x138);
              goto code_r0x047d666c;
            }
            uVar13 = uVar13 - 1;
            piVar14 = piVar14 + 4;
          } while (uVar13 != 0);
        }
        puVar5 = (undefined8 *)func_0x041cb4c4(param_7,*(long *)PTR_DAT_09ece810,6);
code_r0x047d666c:
        (*(code *)*puVar5)(param_7,lVar11,auVar21._0_8_,param_4,param_5,uVar10 & 1,puVar5[1]);
      }
    }
    if (plVar9 != (long *)0x0) {
      func_0x047f1584(uVar7,plVar9,0);
      uVar13 = func_0x047f1434(plVar9,0);
      if (((uVar13 & 1) != 0) || (uVar13 = func_0x047f13e4(plVar9,0), (uVar13 & 1) == 0)) {
        return;
      }
      auVar21 = func_0x047f15f4(plVar9,0);
      lVar11 = auVar21._8_8_;
      if ((lVar11 != 0) && (func_0x047e58b8(lVar11,auVar21._0_8_,0), param_7 != (long *)0x0)) {
        lVar12 = *param_7;
        uVar13 = (ulong)*(ushort *)(lVar12 + 0x12e);
        if (uVar13 != 0) {
          piVar14 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
          do {
            if (*(long *)(piVar14 + -2) == *(long *)PTR_DAT_09ece810) {
              puVar5 = (undefined8 *)(lVar12 + (long)(*piVar14 + 6) * 0x10 + 0x138);
              goto code_r0x047d675c;
            }
            uVar13 = uVar13 - 1;
            piVar14 = piVar14 + 4;
          } while (uVar13 != 0);
        }
        puVar5 = (undefined8 *)func_0x041cb4c4(param_7,*(long *)PTR_DAT_09ece810,6);
code_r0x047d675c:
                    /* WARNING: Could not recover jumptable at 0x047d678c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)*puVar5)(param_7,lVar11,auVar21._0_8_,param_4,param_5,uVar10 & 1,puVar5[1]);
        return;
      }
    }
  }
code_r0x047d6790:
  lVar11 = func_0x04151bb8();
  puVar2 = PTR_DAT_09ece850;
  puVar1 = PTR_DAT_09eac4c8;
  if ((bRam000000000a4515f6 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece850);
    func_0x0415191c(PTR_DAT_09eac4c8);
    bRam000000000a4515f6 = 1;
  }
  fVar19 = *(float *)(lVar11 + 0x10);
  uVar18 = **(undefined4 **)(*(long *)puVar2 + 0xb8);
  if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
    func_0x04151a94();
  }
  uVar18 = func_0x085bd700(uVar18,fVar19 - extraout_s0,0);
  *(undefined4 *)(lVar11 + 0x10) = uVar18;
  if ((*(char *)(lVar11 + 0x19) != '\0') && (iVar4 = func_0x047dd574(lVar11), iVar4 < 1)) {
    *(undefined1 *)(lVar11 + 0x18) = 0;
  }
  return;
}


```

## EncountState.UpdateSkillFire (off 0x46d2478)

```c

void Game_Application_InGameHunt_HuntSimulator_EncountState__UpdateSkillFire
               (undefined8 param_1,undefined8 param_2,long param_3,long param_4,long param_5,
               undefined8 param_6,uint param_7,long *param_8)

{
  undefined *puVar1;
  undefined *puVar2;
  int iVar3;
  ulong uVar4;
  undefined8 uVar5;
  long *plVar6;
  undefined8 *puVar7;
  long lVar8;
  long lVar9;
  int *piVar10;
  float extraout_s0;
  undefined4 uVar11;
  float fVar12;
  undefined1 auVar13 [16];
  
  if ((bRam000000000a4515c1 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ecd6f0);
    func_0x0415191c(PTR_DAT_09ece810);
    func_0x0415191c(PTR_DAT_09ec45e0);
    bRam000000000a4515c1 = 1;
  }
  if (param_3 != 0) {
    func_0x047f1584(param_1,param_3,0);
    uVar4 = func_0x047f13e4(param_3,0);
    puVar1 = PTR_DAT_09ecd6f0;
    while ((uVar4 & 1) != 0) {
      uVar5 = func_0x047f1698(param_3,0);
      if (param_5 == 0) goto code_r0x047d6790;
      uVar4 = func_0x0541f90c(*(undefined8 *)(param_5 + 0x20),uVar5,*(undefined8 *)puVar1);
      if ((uVar4 & 1) != 0) break;
      func_0x047f15f4(param_3,0);
      uVar4 = func_0x047f13e4(param_3,0);
    }
    uVar4 = func_0x047f13e4(param_3,0);
    if (((uVar4 & 1) != 0) && (uVar4 = func_0x047f1434(param_3,0), (uVar4 & 1) == 0)) {
      plVar6 = (long *)func_0x047f1698(param_3,0);
      if (plVar6 == (long *)0x0) goto code_r0x047d6790;
      lVar8 = *plVar6;
      uVar4 = (ulong)*(ushort *)(lVar8 + 0x12e);
      if (uVar4 != 0) {
        piVar10 = (int *)(*(long *)(lVar8 + 0xb0) + 8);
        do {
          if (*(long *)(piVar10 + -2) == *(long *)PTR_DAT_09ec45e0) {
            puVar7 = (undefined8 *)(lVar8 + (long)(*piVar10 + 6) * 0x10 + 0x138);
            goto code_r0x047d65d8;
          }
          uVar4 = uVar4 - 1;
          piVar10 = piVar10 + 4;
        } while (uVar4 != 0);
      }
      puVar7 = (undefined8 *)func_0x041cb4c4(plVar6,*(long *)PTR_DAT_09ec45e0,6);
code_r0x047d65d8:
      uVar4 = (*(code *)*puVar7)(plVar6,puVar7[1]);
      if ((uVar4 & 1) != 0) {
        auVar13 = func_0x047f15f4(param_3,0);
        lVar8 = auVar13._8_8_;
        if ((lVar8 == 0) || (func_0x047e58b8(lVar8,auVar13._0_8_,0), param_8 == (long *)0x0))
        goto code_r0x047d6790;
        lVar9 = *param_8;
        uVar4 = (ulong)*(ushort *)(lVar9 + 0x12e);
        if (uVar4 != 0) {
          piVar10 = (int *)(*(long *)(lVar9 + 0xb0) + 8);
          do {
            if (*(long *)(piVar10 + -2) == *(long *)PTR_DAT_09ece810) {
              puVar7 = (undefined8 *)(lVar9 + (long)(*piVar10 + 6) * 0x10 + 0x138);
              goto code_r0x047d666c;
            }
            uVar4 = uVar4 - 1;
            piVar10 = piVar10 + 4;
          } while (uVar4 != 0);
        }
        puVar7 = (undefined8 *)func_0x041cb4c4(param_8,*(long *)PTR_DAT_09ece810,6);
code_r0x047d666c:
        (*(code *)*puVar7)(param_8,lVar8,auVar13._0_8_,param_5,param_6,param_7 & 1,puVar7[1]);
      }
    }
    if (param_4 != 0) {
      func_0x047f1584(param_1,param_4,0);
      uVar4 = func_0x047f1434(param_4,0);
      if (((uVar4 & 1) != 0) || (uVar4 = func_0x047f13e4(param_4,0), (uVar4 & 1) == 0)) {
        return;
      }
      auVar13 = func_0x047f15f4(param_4,0);
      lVar8 = auVar13._8_8_;
      if ((lVar8 != 0) && (func_0x047e58b8(lVar8,auVar13._0_8_,0), param_8 != (long *)0x0)) {
        lVar9 = *param_8;
        uVar4 = (ulong)*(ushort *)(lVar9 + 0x12e);
        if (uVar4 != 0) {
          piVar10 = (int *)(*(long *)(lVar9 + 0xb0) + 8);
          do {
            if (*(long *)(piVar10 + -2) == *(long *)PTR_DAT_09ece810) {
              puVar7 = (undefined8 *)(lVar9 + (long)(*piVar10 + 6) * 0x10 + 0x138);
              goto code_r0x047d675c;
            }
            uVar4 = uVar4 - 1;
            piVar10 = piVar10 + 4;
          } while (uVar4 != 0);
        }
        puVar7 = (undefined8 *)func_0x041cb4c4(param_8,*(long *)PTR_DAT_09ece810,6);
code_r0x047d675c:
                    /* WARNING: Could not recover jumptable at 0x047d678c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)*puVar7)(param_8,lVar8,auVar13._0_8_,param_5,param_6,param_7 & 1,puVar7[1]);
        return;
      }
    }
  }
code_r0x047d6790:
  lVar8 = func_0x04151bb8();
  puVar2 = PTR_DAT_09ece850;
  puVar1 = PTR_DAT_09eac4c8;
  if ((bRam000000000a4515f6 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece850);
    func_0x0415191c(PTR_DAT_09eac4c8);
    bRam000000000a4515f6 = 1;
  }
  fVar12 = *(float *)(lVar8 + 0x10);
  uVar11 = **(undefined4 **)(*(long *)puVar2 + 0xb8);
  if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
    func_0x04151a94();
  }
  uVar11 = func_0x085bd700(uVar11,fVar12 - extraout_s0,0);
  *(undefined4 *)(lVar8 + 0x10) = uVar11;
  if ((*(char *)(lVar8 + 0x19) != '\0') && (iVar3 = func_0x047dd574(lVar8), iVar3 < 1)) {
    *(undefined1 *)(lVar8 + 0x18) = 0;
  }
  return;
}


```

## EncountState.UpdateSkill (off 0x46d1750)

```c

/* WARNING: Removing unreachable block (ram,0x047d5c48) */
/* WARNING: Removing unreachable block (ram,0x047d5c68) */
/* WARNING: Removing unreachable block (ram,0x047d5c7c) */
/* WARNING: Removing unreachable block (ram,0x047d5c8c) */
/* WARNING: Removing unreachable block (ram,0x047d5c94) */
/* WARNING: Removing unreachable block (ram,0x047d5cbc) */
/* WARNING: Removing unreachable block (ram,0x047d5ca0) */
/* WARNING: Removing unreachable block (ram,0x047d5cac) */
/* WARNING: Removing unreachable block (ram,0x047d5cc8) */
/* WARNING: Removing unreachable block (ram,0x047d5cd4) */
/* WARNING: Removing unreachable block (ram,0x047d5c58) */

void Game_Application_InGameHunt_HuntSimulator_EncountState__UpdateSkill
               (undefined8 param_1,undefined8 param_2,long param_3,long *param_4,ulong param_5,
               undefined8 param_6,undefined8 param_7,long *param_8)

{
  undefined *puVar1;
  undefined *puVar2;
  undefined *puVar3;
  int iVar4;
  undefined8 *puVar5;
  long *plVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  long extraout_x1;
  long *plVar9;
  ulong uVar10;
  uint uVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  ulong uVar15;
  int *piVar16;
  long *plVar17;
  long *plVar18;
  int iVar19;
  long unaff_x23;
  long *unaff_x24;
  long *plVar20;
  long *plVar21;
  float extraout_s0;
  undefined4 uVar22;
  float fVar23;
  undefined1 auVar24 [12];
  undefined1 auVar25 [16];
  
  plVar17 = (long *)0xa451000;
  plVar9 = param_4;
  uVar10 = param_5;
  if ((bRam000000000a4515bf & 1) == 0) {
    func_0x0415191c(PTR_DAT_09eaa288);
    func_0x0415191c(PTR_DAT_09ece910);
    func_0x0415191c(PTR_DAT_09ece918);
    func_0x0415191c(PTR_DAT_09eaa8d0);
    bRam000000000a4515bf = 1;
  }
  puVar2 = PTR_DAT_09ece910;
  if (param_3 == 0) {
code_r0x047d5b84:
    func_0x04151bb8();
code_r0x047d5b88:
    func_0x04151bb8();
    func_0x04151bb0(unaff_x23);
  }
  else {
    plVar18 = *(long **)(param_3 + 0x30);
    plVar17 = (long *)0x0;
    if (plVar18 == (long *)0x0) goto code_r0x047d5b84;
    lVar12 = *plVar18;
    uVar15 = (ulong)*(ushort *)(lVar12 + 0x12e);
    if (uVar15 != 0) {
      piVar16 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
      do {
        if (*(long *)(piVar16 + -2) == *(long *)PTR_DAT_09ece910) {
          puVar5 = (undefined8 *)(lVar12 + (long)*piVar16 * 0x10 + 0x138);
          goto code_r0x047d581c;
        }
        uVar15 = uVar15 - 1;
        piVar16 = piVar16 + 4;
      } while (uVar15 != 0);
    }
    plVar9 = (long *)0x0;
    puVar5 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047d581c:
    unaff_x24 = (long *)PTR_DAT_09eaa288;
    plVar18 = (long *)(*(code *)*puVar5)(plVar18,puVar5[1]);
    puVar3 = PTR_DAT_09ece918;
    puVar1 = PTR_DAT_09eaa8d0;
    plVar17 = (long *)0x0;
    if (plVar18 == (long *)0x0) goto code_r0x047d5b88;
code_r0x047d5848:
    lVar12 = *plVar18;
    uVar15 = (ulong)*(ushort *)(lVar12 + 0x12e);
    if (uVar15 != 0) {
      piVar16 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
      do {
        if (*(long *)(piVar16 + -2) == *(long *)puVar1) {
          puVar5 = (undefined8 *)(lVar12 + (long)*piVar16 * 0x10 + 0x138);
          goto code_r0x047d5894;
        }
        uVar15 = uVar15 - 1;
        piVar16 = piVar16 + 4;
      } while (uVar15 != 0);
    }
    plVar9 = (long *)0x0;
    puVar5 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047d5894:
    uVar15 = (*(code *)*puVar5)(plVar18,puVar5[1]);
    if ((uVar15 & 1) != 0) {
      lVar12 = *plVar18;
      uVar15 = (ulong)*(ushort *)(lVar12 + 0x12e);
      if (uVar15 != 0) {
        piVar16 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
        do {
          if (*(long *)(piVar16 + -2) == *(long *)puVar3) {
            puVar5 = (undefined8 *)(lVar12 + (long)*piVar16 * 0x10 + 0x138);
            goto code_r0x047d58f0;
          }
          uVar15 = uVar15 - 1;
          piVar16 = piVar16 + 4;
        } while (uVar15 != 0);
      }
      plVar9 = (long *)0x0;
      puVar5 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047d58f0:
      lVar12 = (*(code *)*puVar5)(plVar18,puVar5[1]);
      if (lVar12 != 0) {
        FUN_047e4b7c(param_1,lVar12,param_3,0);
        uVar10 = (ulong)((uint)param_5 & 1);
        param_6 = 0;
        plVar9 = param_4;
        func_0x047e54a4(param_1,lVar12,param_3);
      }
      goto code_r0x047d5848;
    }
    unaff_x23 = 0;
    if (plVar18 != (long *)0x0) {
      lVar12 = *plVar18;
      uVar15 = (ulong)*(ushort *)(lVar12 + 0x12e);
      if (uVar15 != 0) {
        piVar16 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
        do {
          if (*(long *)(piVar16 + -2) == *unaff_x24) {
            puVar5 = (undefined8 *)(lVar12 + (long)*piVar16 * 0x10 + 0x138);
            goto code_r0x047d598c;
          }
          uVar15 = uVar15 - 1;
          piVar16 = piVar16 + 4;
        } while (uVar15 != 0);
      }
      plVar9 = (long *)0x0;
      puVar5 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047d598c:
      (*(code *)*puVar5)(plVar18,puVar5[1]);
    }
    plVar18 = *(long **)(param_3 + 0x38);
    plVar17 = (long *)0x0;
    if (plVar18 == (long *)0x0) goto code_r0x047d5b84;
    lVar12 = *plVar18;
    uVar15 = (ulong)*(ushort *)(lVar12 + 0x12e);
    if (uVar15 != 0) {
      piVar16 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
      do {
        if (*(long *)(piVar16 + -2) == *(long *)puVar2) {
          puVar5 = (undefined8 *)(lVar12 + (long)*piVar16 * 0x10 + 0x138);
          goto code_r0x047d59f0;
        }
        uVar15 = uVar15 - 1;
        piVar16 = piVar16 + 4;
      } while (uVar15 != 0);
    }
    plVar9 = (long *)0x0;
    puVar5 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047d59f0:
    plVar17 = (long *)(*(code *)*puVar5)(plVar18,puVar5[1]);
    puVar1 = PTR_DAT_09ece918;
    puVar2 = PTR_DAT_09eaa8d0;
    if (plVar17 != (long *)0x0) {
      do {
        lVar12 = *plVar17;
        uVar15 = (ulong)*(ushort *)(lVar12 + 0x12e);
        if (uVar15 != 0) {
          piVar16 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
          do {
            if (*(long *)(piVar16 + -2) == *(long *)puVar2) {
              puVar5 = (undefined8 *)(lVar12 + (long)*piVar16 * 0x10 + 0x138);
              goto code_r0x047d5a60;
            }
            uVar15 = uVar15 - 1;
            piVar16 = piVar16 + 4;
          } while (uVar15 != 0);
        }
        plVar9 = (long *)0x0;
        puVar5 = (undefined8 *)func_0x041cb4c4(plVar17);
code_r0x047d5a60:
        uVar15 = (*(code *)*puVar5)(plVar17,puVar5[1]);
        if ((uVar15 & 1) == 0) {
          param_4 = (long *)0x0;
          goto code_r0x047d5b08;
        }
        lVar12 = *plVar17;
        uVar15 = (ulong)*(ushort *)(lVar12 + 0x12e);
        if (uVar15 != 0) {
          piVar16 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
          do {
            if (*(long *)(piVar16 + -2) == *(long *)puVar1) {
              puVar5 = (undefined8 *)(lVar12 + (long)*piVar16 * 0x10 + 0x138);
              goto code_r0x047d5abc;
            }
            uVar15 = uVar15 - 1;
            piVar16 = piVar16 + 4;
          } while (uVar15 != 0);
        }
        plVar9 = (long *)0x0;
        puVar5 = (undefined8 *)func_0x041cb4c4(plVar17);
code_r0x047d5abc:
        unaff_x23 = (*(code *)*puVar5)(plVar17,puVar5[1]);
        if (unaff_x23 != 0) {
          FUN_047e4b7c(param_1,unaff_x23,param_3,0);
          uVar10 = (ulong)((uint)param_5 & 1);
          param_6 = 0;
          plVar9 = param_4;
          func_0x047e54a4(param_1,unaff_x23,param_3);
        }
      } while( true );
    }
  }
  func_0x04151bb8();
  while( true ) {
    auVar24 = func_0x04151bb0(param_4);
    if (auVar24._8_4_ != 1) break;
    puVar5 = (undefined8 *)func_0x098f6de0();
    param_4 = (long *)*puVar5;
    func_0x098f6df0();
code_r0x047d5b08:
    if (plVar17 != (long *)0x0) {
      lVar12 = *plVar17;
      uVar15 = (ulong)*(ushort *)(lVar12 + 0x12e);
      if (uVar15 != 0) {
        piVar16 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
        do {
          if (*(long *)(piVar16 + -2) == *unaff_x24) {
            puVar5 = (undefined8 *)(lVar12 + (long)*piVar16 * 0x10 + 0x138);
            goto code_r0x047d5b58;
          }
          uVar15 = uVar15 - 1;
          piVar16 = piVar16 + 4;
        } while (uVar15 != 0);
      }
      plVar9 = (long *)0x0;
      puVar5 = (undefined8 *)func_0x041cb4c4(plVar17);
code_r0x047d5b58:
      (*(code *)*puVar5)(plVar17,puVar5[1]);
    }
    if (param_4 == (long *)0x0) {
      return;
    }
  }
  if (plVar17 != (long *)0x0) {
    lVar12 = *plVar17;
    uVar15 = (ulong)*(ushort *)(lVar12 + 0x12e);
    if (uVar15 != 0) {
      piVar16 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
      do {
        if (*(long *)(piVar16 + -2) == *unaff_x24) {
          puVar5 = (undefined8 *)(lVar12 + (long)*piVar16 * 0x10 + 0x138);
          goto code_r0x047d5c38;
        }
        uVar15 = uVar15 - 1;
        piVar16 = piVar16 + 4;
      } while (uVar15 != 0);
    }
    plVar9 = (long *)0x0;
    puVar5 = (undefined8 *)func_0x041cb4c4(plVar17);
code_r0x047d5c38:
    (*(code *)*puVar5)(plVar17,puVar5[1]);
  }
  func_0x04247ab0(auVar24._0_8_);
  func_0x04151bb0(unaff_x23);
  auVar25 = func_0x03bf6574();
  lVar12 = auVar25._8_8_;
  plVar18 = auVar25._0_8_;
  plVar17 = plVar9;
  if ((bRam000000000a4515c0 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece810);
    func_0x0415191c(PTR_DAT_09eaa288);
    func_0x0415191c(PTR_DAT_09ece910);
    func_0x0415191c(PTR_DAT_09ece918);
    func_0x0415191c(PTR_DAT_09eaa8d0);
    func_0x0415191c(PTR_DAT_09ecea08);
    func_0x0415191c(PTR_DAT_09ecea10);
    func_0x0415191c(PTR_DAT_09ecd6d0);
    func_0x0415191c(PTR_DAT_09ecea18);
    func_0x0415191c(PTR_DAT_09ec45e0);
    func_0x0415191c(PTR_DAT_09eb96c8);
    bRam000000000a4515c0 = 1;
  }
  if ((char)plVar18[3] != '\0') {
    return;
  }
  if ((lVar12 == 0) || (plVar18 = *(long **)(lVar12 + 0x30), plVar18 == (long *)0x0)) {
code_r0x047d63a0:
    func_0x04151bb8();
code_r0x047d63a4:
    func_0x04151bb8();
  }
  else {
    lVar13 = *plVar18;
    uVar15 = (ulong)*(ushort *)(lVar13 + 0x12e);
    if (uVar15 != 0) {
      piVar16 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
      do {
        if (*(long *)(piVar16 + -2) == *(long *)PTR_DAT_09ecea08) {
          puVar5 = (undefined8 *)(lVar13 + (long)*piVar16 * 0x10 + 0x138);
          goto code_r0x047d5e10;
        }
        uVar15 = uVar15 - 1;
        piVar16 = piVar16 + 4;
      } while (uVar15 != 0);
    }
    plVar17 = (long *)0x0;
    puVar5 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047d5e10:
    iVar4 = (*(code *)*puVar5)(plVar18,puVar5[1]);
    puVar1 = PTR_DAT_09ecea18;
    puVar2 = PTR_DAT_09eb96c8;
    if (0 < iVar4) {
      iVar19 = 0;
      do {
        lVar13 = *plVar18;
        uVar15 = (ulong)*(ushort *)(lVar13 + 0x12e);
        if (uVar15 != 0) {
          piVar16 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
          do {
            if (*(long *)(piVar16 + -2) == *(long *)puVar1) {
              puVar5 = (undefined8 *)(lVar13 + (long)*piVar16 * 0x10 + 0x138);
              goto code_r0x047d5e8c;
            }
            uVar15 = uVar15 - 1;
            piVar16 = piVar16 + 4;
          } while (uVar15 != 0);
        }
        puVar5 = (undefined8 *)func_0x041cb4c4(plVar18,*(long *)puVar1,0);
code_r0x047d5e8c:
        plVar17 = (long *)puVar5[1];
        plVar6 = (long *)(*(code *)*puVar5)(plVar18,iVar19);
        if (((plVar6 != (long *)0x0) && (uVar15 = func_0x047e4288(plVar6,0), (uVar15 & 1) != 0)) &&
           (uVar15 = func_0x047e4298(plVar6,0), (uVar15 & 1) == 0)) {
          if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
            func_0x04151a94();
          }
          if (cRam000000000a45163e == '\0') {
            func_0x0415191c(puVar2);
            cRam000000000a45163e = '\x01';
          }
          lVar13 = *(long *)puVar2;
          if (*(int *)(lVar13 + 0xe0) == 0) {
            func_0x04151a94();
            lVar13 = *(long *)puVar2;
          }
          plVar20 = *(long **)(lVar12 + 0x20);
          if (plVar20 == (long *)0x0) goto code_r0x047d63a0;
          lVar14 = *plVar20;
          plVar21 = (long *)**(undefined8 **)(lVar13 + 0xb8);
          uVar15 = (ulong)*(ushort *)(lVar14 + 0x12e);
          if (uVar15 != 0) {
            piVar16 = (int *)(*(long *)(lVar14 + 0xb0) + 8);
            do {
              if (*(long *)(piVar16 + -2) == *(long *)PTR_DAT_09ecd6d0) {
                puVar5 = (undefined8 *)(lVar14 + (long)*piVar16 * 0x10 + 0x138);
                goto code_r0x047d5f60;
              }
              uVar15 = uVar15 - 1;
              piVar16 = piVar16 + 4;
            } while (uVar15 != 0);
          }
          puVar5 = (undefined8 *)func_0x041cb4c4(plVar20,*(long *)PTR_DAT_09ecd6d0,0);
code_r0x047d5f60:
          plVar17 = (long *)puVar5[1];
          plVar20 = (long *)(*(code *)*puVar5)(plVar20,iVar19);
          if (plVar21 == (long *)0x0) goto code_r0x047d63a0;
          lVar13 = *plVar21;
          uVar15 = (ulong)*(ushort *)(lVar13 + 0x12e);
          if (uVar15 != 0) {
            piVar16 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
            do {
              if (*(long *)(piVar16 + -2) == *(long *)PTR_DAT_09ecea10) {
                puVar5 = (undefined8 *)(lVar13 + (long)*piVar16 * 0x10 + 0x138);
                goto code_r0x047d5fcc;
              }
              uVar15 = uVar15 - 1;
              piVar16 = piVar16 + 4;
            } while (uVar15 != 0);
          }
          plVar17 = (long *)0x0;
          puVar5 = (undefined8 *)func_0x041cb4c4(plVar21);
code_r0x047d5fcc:
          uVar15 = (*(code *)*puVar5)(plVar21,puVar5[1]);
          if ((uVar15 & 1) != 0) {
            if (plVar20 == (long *)0x0) goto code_r0x047d63a0;
            lVar13 = *plVar20;
            uVar15 = (ulong)*(ushort *)(lVar13 + 0x12e);
            if (uVar15 != 0) {
              piVar16 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
              do {
                if (*(long *)(piVar16 + -2) == *(long *)PTR_DAT_09ec45e0) {
                  puVar5 = (undefined8 *)(lVar13 + (long)(*piVar16 + 10) * 0x10 + 0x138);
                  goto code_r0x047d6038;
                }
                uVar15 = uVar15 - 1;
                piVar16 = piVar16 + 4;
              } while (uVar15 != 0);
            }
            plVar17 = (long *)0xa;
            puVar5 = (undefined8 *)func_0x041cb4c4(plVar20);
code_r0x047d6038:
            uVar15 = (*(code *)*puVar5)(plVar20,puVar5[1]);
            if ((uVar15 & 1) == 0) {
              plVar20 = *(long **)(lVar12 + 0x20);
              if (plVar20 == (long *)0x0) goto code_r0x047d63a0;
              lVar13 = *plVar20;
              uVar15 = (ulong)*(ushort *)(lVar13 + 0x12e);
              if (uVar15 != 0) {
                piVar16 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar16 + -2) == *(long *)PTR_DAT_09ecd6d0) {
                    puVar5 = (undefined8 *)(lVar13 + (long)*piVar16 * 0x10 + 0x138);
                    goto code_r0x047d60a4;
                  }
                  uVar15 = uVar15 - 1;
                  piVar16 = piVar16 + 4;
                } while (uVar15 != 0);
              }
              puVar5 = (undefined8 *)func_0x041cb4c4(plVar20,*(long *)PTR_DAT_09ecd6d0,0);
code_r0x047d60a4:
              plVar17 = (long *)puVar5[1];
              uVar7 = (*(code *)*puVar5)(plVar20,iVar19);
              if (plVar9 == (long *)0x0) goto code_r0x047d63a0;
              lVar13 = *plVar9;
              uVar10 = (ulong)*(ushort *)(lVar13 + 0x12e);
              if (uVar10 != 0) {
                piVar16 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar16 + -2) == *(long *)PTR_DAT_09ece810) {
                    puVar5 = (undefined8 *)(lVar13 + (long)(*piVar16 + 5) * 0x10 + 0x138);
                    goto code_r0x047d6114;
                  }
                  uVar10 = uVar10 - 1;
                  piVar16 = piVar16 + 4;
                } while (uVar10 != 0);
              }
              puVar5 = (undefined8 *)func_0x041cb4c4(plVar9,*(long *)PTR_DAT_09ece810,5);
code_r0x047d6114:
              param_6 = puVar5[1];
              uVar10 = 1;
              (*(code *)*puVar5)(plVar9,uVar7);
              plVar17 = plVar6;
            }
          }
        }
        iVar19 = iVar19 + 1;
      } while (iVar19 != iVar4);
    }
    plVar6 = *(long **)(lVar12 + 0x38);
    plVar18 = (long *)0x0;
    if (plVar6 == (long *)0x0) goto code_r0x047d63a0;
    lVar13 = *plVar6;
    uVar15 = (ulong)*(ushort *)(lVar13 + 0x12e);
    if (uVar15 != 0) {
      piVar16 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
      do {
        if (*(long *)(piVar16 + -2) == *(long *)PTR_DAT_09ece910) {
          puVar5 = (undefined8 *)(lVar13 + (long)*piVar16 * 0x10 + 0x138);
          goto code_r0x047d6194;
        }
        uVar15 = uVar15 - 1;
        piVar16 = piVar16 + 4;
      } while (uVar15 != 0);
    }
    plVar17 = (long *)0x0;
    puVar5 = (undefined8 *)func_0x041cb4c4(plVar6);
code_r0x047d6194:
    plVar18 = (long *)(*(code *)*puVar5)(plVar6,puVar5[1]);
    puVar3 = PTR_DAT_09ece918;
    puVar1 = PTR_DAT_09ece810;
    puVar2 = PTR_DAT_09eaa8d0;
    if (plVar18 != (long *)0x0) {
      do {
        do {
          lVar13 = *plVar18;
          uVar15 = (ulong)*(ushort *)(lVar13 + 0x12e);
          if (uVar15 != 0) {
            piVar16 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
            do {
              if (*(long *)(piVar16 + -2) == *(long *)puVar2) {
                puVar5 = (undefined8 *)(lVar13 + (long)*piVar16 * 0x10 + 0x138);
                goto code_r0x047d620c;
              }
              uVar15 = uVar15 - 1;
              piVar16 = piVar16 + 4;
            } while (uVar15 != 0);
          }
          plVar17 = (long *)0x0;
          puVar5 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047d620c:
          uVar15 = (*(code *)*puVar5)(plVar18,puVar5[1]);
          if ((uVar15 & 1) == 0) {
            plVar9 = (long *)0x0;
            goto code_r0x047d631c;
          }
          lVar13 = *plVar18;
          uVar15 = (ulong)*(ushort *)(lVar13 + 0x12e);
          if (uVar15 != 0) {
            piVar16 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
            do {
              if (*(long *)(piVar16 + -2) == *(long *)puVar3) {
                puVar5 = (undefined8 *)(lVar13 + (long)*piVar16 * 0x10 + 0x138);
                goto code_r0x047d6268;
              }
              uVar15 = uVar15 - 1;
              piVar16 = piVar16 + 4;
            } while (uVar15 != 0);
          }
          plVar17 = (long *)0x0;
          puVar5 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047d6268:
          plVar6 = (long *)(*(code *)*puVar5)(plVar18,puVar5[1]);
        } while (((plVar6 == (long *)0x0) || (uVar15 = func_0x047e4288(plVar6,0), (uVar15 & 1) == 0)
                 ) || (uVar15 = func_0x047e4298(plVar6,0), (uVar15 & 1) != 0));
        uVar7 = FUN_047ce0f0(lVar12);
        if (plVar9 == (long *)0x0) goto code_r0x047d63a4;
        lVar13 = *plVar9;
        uVar10 = (ulong)*(ushort *)(lVar13 + 0x12e);
        if (uVar10 != 0) {
          piVar16 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
          do {
            if (*(long *)(piVar16 + -2) == *(long *)puVar1) {
              puVar5 = (undefined8 *)(lVar13 + (long)(*piVar16 + 5) * 0x10 + 0x138);
              goto code_r0x047d62fc;
            }
            uVar10 = uVar10 - 1;
            piVar16 = piVar16 + 4;
          } while (uVar10 != 0);
        }
        puVar5 = (undefined8 *)func_0x041cb4c4(plVar9,*(long *)puVar1,5);
code_r0x047d62fc:
        param_6 = puVar5[1];
        uVar10 = 2;
        (*(code *)*puVar5)(plVar9,uVar7);
        plVar17 = plVar6;
      } while( true );
    }
  }
  func_0x04151bb8();
  while( true ) {
    auVar24 = func_0x04151bb0(plVar9);
    uVar11 = (uint)param_7;
    if (auVar24._8_4_ != 1) break;
    puVar5 = (undefined8 *)func_0x098f6de0(auVar24._0_8_);
    plVar9 = (long *)*puVar5;
    func_0x098f6df0();
code_r0x047d631c:
    if (plVar18 != (long *)0x0) {
      lVar12 = *plVar18;
      uVar15 = (ulong)*(ushort *)(lVar12 + 0x12e);
      if (uVar15 != 0) {
        piVar16 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
        do {
          if (*(long *)(piVar16 + -2) == *(long *)PTR_DAT_09eaa288) {
            puVar5 = (undefined8 *)(lVar12 + (long)*piVar16 * 0x10 + 0x138);
            goto code_r0x047d6374;
          }
          uVar15 = uVar15 - 1;
          piVar16 = piVar16 + 4;
        } while (uVar15 != 0);
      }
      plVar17 = (long *)0x0;
      puVar5 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047d6374:
      (*(code *)*puVar5)(plVar18,puVar5[1]);
    }
    if (plVar9 == (long *)0x0) {
      return;
    }
  }
  if (plVar18 != (long *)0x0) {
    lVar12 = *plVar18;
    uVar15 = (ulong)*(ushort *)(lVar12 + 0x12e);
    if (uVar15 != 0) {
      piVar16 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
      do {
        if (*(long *)(piVar16 + -2) == *(long *)PTR_DAT_09eaa288) {
          puVar5 = (undefined8 *)(lVar12 + (long)*piVar16 * 0x10 + 0x138);
          goto code_r0x047d6454;
        }
        uVar15 = uVar15 - 1;
        piVar16 = piVar16 + 4;
      } while (uVar15 != 0);
    }
    plVar17 = (long *)0x0;
    puVar5 = (undefined8 *)func_0x041cb4c4(plVar18);
code_r0x047d6454:
    (*(code *)*puVar5)(plVar18,puVar5[1]);
  }
  func_0x04247ab0(auVar24._0_8_);
  func_0x04151bb0(0);
  uVar7 = func_0x03bf6574();
  if ((bRam000000000a4515c1 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ecd6f0);
    func_0x0415191c(PTR_DAT_09ece810);
    func_0x0415191c(PTR_DAT_09ec45e0);
    bRam000000000a4515c1 = 1;
  }
  if (extraout_x1 != 0) {
    func_0x047f1584(uVar7,extraout_x1,0);
    uVar15 = func_0x047f13e4(extraout_x1,0);
    puVar2 = PTR_DAT_09ecd6f0;
    while ((uVar15 & 1) != 0) {
      uVar8 = func_0x047f1698(extraout_x1,0);
      if (uVar10 == 0) goto code_r0x047d6790;
      uVar15 = func_0x0541f90c(*(undefined8 *)(uVar10 + 0x20),uVar8,*(undefined8 *)puVar2);
      if ((uVar15 & 1) != 0) break;
      func_0x047f15f4(extraout_x1,0);
      uVar15 = func_0x047f13e4(extraout_x1,0);
    }
    uVar15 = func_0x047f13e4(extraout_x1,0);
    if (((uVar15 & 1) != 0) && (uVar15 = func_0x047f1434(extraout_x1,0), (uVar15 & 1) == 0)) {
      plVar9 = (long *)func_0x047f1698(extraout_x1,0);
      if (plVar9 == (long *)0x0) goto code_r0x047d6790;
      lVar12 = *plVar9;
      uVar15 = (ulong)*(ushort *)(lVar12 + 0x12e);
      if (uVar15 != 0) {
        piVar16 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
        do {
          if (*(long *)(piVar16 + -2) == *(long *)PTR_DAT_09ec45e0) {
            puVar5 = (undefined8 *)(lVar12 + (long)(*piVar16 + 6) * 0x10 + 0x138);
            goto code_r0x047d65d8;
          }
          uVar15 = uVar15 - 1;
          piVar16 = piVar16 + 4;
        } while (uVar15 != 0);
      }
      puVar5 = (undefined8 *)func_0x041cb4c4(plVar9,*(long *)PTR_DAT_09ec45e0,6);
code_r0x047d65d8:
      uVar15 = (*(code *)*puVar5)(plVar9,puVar5[1]);
      if ((uVar15 & 1) != 0) {
        auVar25 = func_0x047f15f4(extraout_x1,0);
        lVar12 = auVar25._8_8_;
        if ((lVar12 == 0) || (func_0x047e58b8(lVar12,auVar25._0_8_,0), param_8 == (long *)0x0))
        goto code_r0x047d6790;
        lVar13 = *param_8;
        uVar15 = (ulong)*(ushort *)(lVar13 + 0x12e);
        if (uVar15 != 0) {
          piVar16 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
          do {
            if (*(long *)(piVar16 + -2) == *(long *)PTR_DAT_09ece810) {
              puVar5 = (undefined8 *)(lVar13 + (long)(*piVar16 + 6) * 0x10 + 0x138);
              goto code_r0x047d666c;
            }
            uVar15 = uVar15 - 1;
            piVar16 = piVar16 + 4;
          } while (uVar15 != 0);
        }
        puVar5 = (undefined8 *)func_0x041cb4c4(param_8,*(long *)PTR_DAT_09ece810,6);
code_r0x047d666c:
        (*(code *)*puVar5)(param_8,lVar12,auVar25._0_8_,uVar10,param_6,uVar11 & 1,puVar5[1]);
      }
    }
    if (plVar17 != (long *)0x0) {
      func_0x047f1584(uVar7,plVar17,0);
      uVar15 = func_0x047f1434(plVar17,0);
      if (((uVar15 & 1) != 0) || (uVar15 = func_0x047f13e4(plVar17,0), (uVar15 & 1) == 0)) {
        return;
      }
      auVar25 = func_0x047f15f4(plVar17,0);
      lVar12 = auVar25._8_8_;
      if ((lVar12 != 0) && (func_0x047e58b8(lVar12,auVar25._0_8_,0), param_8 != (long *)0x0)) {
        lVar13 = *param_8;
        uVar15 = (ulong)*(ushort *)(lVar13 + 0x12e);
        if (uVar15 != 0) {
          piVar16 = (int *)(*(long *)(lVar13 + 0xb0) + 8);
          do {
            if (*(long *)(piVar16 + -2) == *(long *)PTR_DAT_09ece810) {
              puVar5 = (undefined8 *)(lVar13 + (long)(*piVar16 + 6) * 0x10 + 0x138);
              goto code_r0x047d675c;
            }
            uVar15 = uVar15 - 1;
            piVar16 = piVar16 + 4;
          } while (uVar15 != 0);
        }
        puVar5 = (undefined8 *)func_0x041cb4c4(param_8,*(long *)PTR_DAT_09ece810,6);
code_r0x047d675c:
                    /* WARNING: Could not recover jumptable at 0x047d678c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)*puVar5)(param_8,lVar12,auVar25._0_8_,uVar10,param_6,uVar11 & 1,puVar5[1]);
        return;
      }
    }
  }
code_r0x047d6790:
  lVar12 = func_0x04151bb8();
  puVar1 = PTR_DAT_09ece850;
  puVar2 = PTR_DAT_09eac4c8;
  if ((bRam000000000a4515f6 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece850);
    func_0x0415191c(PTR_DAT_09eac4c8);
    bRam000000000a4515f6 = 1;
  }
  fVar23 = *(float *)(lVar12 + 0x10);
  uVar22 = **(undefined4 **)(*(long *)puVar1 + 0xb8);
  if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
    func_0x04151a94();
  }
  uVar22 = func_0x085bd700(uVar22,fVar23 - extraout_s0,0);
  *(undefined4 *)(lVar12 + 0x10) = uVar22;
  if ((*(char *)(lVar12 + 0x19) != '\0') && (iVar4 = func_0x047dd574(lVar12), iVar4 < 1)) {
    *(undefined1 *)(lVar12 + 0x18) = 0;
  }
  return;
}


```

## EncountState.AttackPhase (off 0x46d1434)

```c

/* WARNING: Possible PIC construction at 0x047d64f0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x047d669c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x047d64f4) */
/* WARNING: Removing unreachable block (ram,0x047d6504) */
/* WARNING: Removing unreachable block (ram,0x047d650c) */
/* WARNING: Removing unreachable block (ram,0x047d651c) */
/* WARNING: Removing unreachable block (ram,0x047d6530) */
/* WARNING: Removing unreachable block (ram,0x047d654c) */
/* WARNING: Removing unreachable block (ram,0x047d655c) */
/* WARNING: Removing unreachable block (ram,0x047d656c) */
/* WARNING: Removing unreachable block (ram,0x047d657c) */
/* WARNING: Removing unreachable block (ram,0x047d6598) */
/* WARNING: Removing unreachable block (ram,0x047d65a0) */
/* WARNING: Removing unreachable block (ram,0x047d65c8) */
/* WARNING: Removing unreachable block (ram,0x047d65ac) */
/* WARNING: Removing unreachable block (ram,0x047d65b8) */
/* WARNING: Removing unreachable block (ram,0x047d65d8) */
/* WARNING: Removing unreachable block (ram,0x047d65e8) */
/* WARNING: Removing unreachable block (ram,0x047d65f8) */
/* WARNING: Removing unreachable block (ram,0x047d6614) */
/* WARNING: Removing unreachable block (ram,0x047d662c) */
/* WARNING: Removing unreachable block (ram,0x047d6634) */
/* WARNING: Removing unreachable block (ram,0x047d665c) */
/* WARNING: Removing unreachable block (ram,0x047d6640) */
/* WARNING: Removing unreachable block (ram,0x047d664c) */
/* WARNING: Removing unreachable block (ram,0x047d666c) */
/* WARNING: Removing unreachable block (ram,0x047d668c) */
/* WARNING: Removing unreachable block (ram,0x047d6690) */
/* WARNING: Removing unreachable block (ram,0x047d66a0) */
/* WARNING: Removing unreachable block (ram,0x047d66b0) */
/* WARNING: Removing unreachable block (ram,0x047d6734) */
/* WARNING: Removing unreachable block (ram,0x047d66c0) */
/* WARNING: Removing unreachable block (ram,0x047d66d0) */
/* WARNING: Removing unreachable block (ram,0x047d66ec) */
/* WARNING: Removing unreachable block (ram,0x047d6704) */
/* WARNING: Removing unreachable block (ram,0x047d670c) */
/* WARNING: Removing unreachable block (ram,0x047d674c) */
/* WARNING: Removing unreachable block (ram,0x047d6718) */
/* WARNING: Removing unreachable block (ram,0x047d6724) */
/* WARNING: Removing unreachable block (ram,0x047d675c) */

void Game_Application_InGameHunt_HuntSimulator_EncountState__AttackPhase
               (undefined8 param_1,undefined8 param_2,long *param_3,long *param_4,long param_5,
               long param_6,uint param_7,long param_8)

{
  undefined *puVar1;
  long *plVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  ulong uVar6;
  long lVar7;
  long extraout_x1;
  ulong extraout_x1_00;
  undefined8 extraout_x1_01;
  long *plVar8;
  long lVar9;
  undefined *puVar10;
  float extraout_s0;
  float extraout_s0_00;
  float fVar11;
  undefined8 extraout_d0;
  undefined8 extraout_d0_00;
  undefined8 unaff_d8;
  undefined4 uVar12;
  float fVar13;
  undefined1 auVar14 [16];
  long lStack_c0;
  long lStack_b8;
  undefined8 auStack_70 [2];
  undefined *puStack_60;
  
  plVar8 = param_4;
  if (param_3 != (long *)0x0) {
    if ((char)param_3[5] == '\0') {
      return;
    }
    plVar8 = (long *)(ulong)((uint)param_5 & 1);
    param_5 = *(long *)(*param_3 + 0x210);
    (**(code **)(*param_3 + 0x208))(param_3,param_4,plVar8);
    unaff_d8 = param_1;
    if (param_4 != (long *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x047d54a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(*param_4 + 0x208))(param_1,param_4,param_3,0,*(undefined8 *)(*param_4 + 0x210));
      return;
    }
  }
  uVar4 = func_0x04151bb8();
  puStack_60 = &Game_Application_InGameHunt_HuntSimulator_EncountState__SkillPhase;
  auStack_70[0] = unaff_d8;
  uVar5 = func_0x047d562c();
  param_7 = param_7 & 1;
  Game_Application_InGameHunt_HuntSimulator_EncountState__UpdateSkill
            (extraout_d0,uVar5,param_5,param_6);
  lVar9 = param_8;
  Game_Application_InGameHunt_HuntSimulator_EncountState__UpdateSkillQueue(uVar4,param_5);
  if (param_5 == 0) {
    lVar7 = func_0x04151bb8();
    if (((extraout_x1_00 & 1) == 0) || (*(char *)(lVar7 + 0x18) != '\0')) {
      return;
    }
    lVar7 = *(long *)(lVar7 + 0x20);
    fVar11 = extraout_s0;
    if (lVar7 == 0) {
      auVar14 = func_0x04151bb8();
      param_8 = auVar14._8_8_;
      if (lVar9 != 0) {
        uVar6 = func_0x047e4298(lVar9,0);
        if ((uVar6 & 1) != 0) {
          return;
        }
        func_0x047e51c0(lVar9,0);
        if (param_7 == 2) {
          lVar7 = *(long *)(auVar14._0_8_ + 0x30);
        }
        else {
          if (param_7 != 1) {
            return;
          }
          lVar7 = *(long *)(auVar14._0_8_ + 0x28);
        }
        if (lVar7 != 0) {
          plVar2 = &lStack_c0;
          if ((bRam000000000a4516a4 & 1) == 0) {
            func_0x0415191c(PTR_DAT_09ecef28,param_8,lVar9,0);
            bRam000000000a4516a4 = 1;
          }
          lVar7 = *(long *)(lVar7 + 0x10);
          lStack_b8 = 0;
          lStack_c0 = param_8;
          func_0x041518c0(&lStack_c0,param_8);
          lStack_b8 = lVar9;
          func_0x041518c0(&lStack_b8,lVar9);
          if (lVar7 != 0) {
            func_0x072d0b40(lVar7,lStack_c0,lStack_b8,*(undefined8 *)PTR_DAT_09ecef28);
            return;
          }
          puVar10 = &UNK_047f1584;
          lVar7 = func_0x04151bb8();
          param_5 = 0;
          uVar4 = extraout_x1_01;
          uVar5 = extraout_d0_00;
          goto code_r0x047f1584;
        }
      }
      func_0x04151bb8();
      return;
    }
  }
  else {
    if (*(char *)(param_5 + 0x28) == '\0') {
      return;
    }
    plVar2 = auStack_70;
    if ((bRam000000000a4515c1 & 1) == 0) {
      func_0x0415191c(PTR_DAT_09ecd6f0,extraout_x1,plVar8);
      func_0x0415191c(PTR_DAT_09ece810);
      func_0x0415191c(PTR_DAT_09ec45e0);
      bRam000000000a4515c1 = 1;
    }
    if (extraout_x1 != 0) {
      uVar4 = 0;
      puVar10 = &UNK_047d64f4;
      lVar7 = extraout_x1;
      lVar9 = param_6;
      uVar5 = extraout_d0;
code_r0x047f1584:
      puVar1 = PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0;
      *(undefined8 *)((long)plVar2 + -0x30) = extraout_d0;
      *(undefined **)((long)plVar2 + -0x20) = puVar10;
      *(long *)((long)plVar2 + -0x18) = param_8;
      *(long *)((long)plVar2 + -0x10) = param_5;
      *(long *)((long)plVar2 + -8) = lVar9;
      if ((bRam000000000a4516a5 & 1) == 0) {
        func_0x0415191c(PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0,uVar4);
        bRam000000000a4516a5 = 1;
      }
      if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
        func_0x04151a94();
      }
      *(float *)(lVar7 + 0x1c) = *(float *)(lVar7 + 0x1c) + (float)uVar5 * 1000.0;
      return;
    }
    lVar7 = func_0x04151bb8();
    fVar11 = extraout_s0_00;
  }
  puVar1 = PTR_DAT_09ece850;
  puVar10 = PTR_DAT_09eac4c8;
  if ((bRam000000000a4515f6 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ece850);
    func_0x0415191c(PTR_DAT_09eac4c8);
    bRam000000000a4515f6 = 1;
  }
  fVar13 = *(float *)(lVar7 + 0x10);
  uVar12 = **(undefined4 **)(*(long *)puVar1 + 0xb8);
  if (*(int *)(*(long *)puVar10 + 0xe0) == 0) {
    func_0x04151a94();
  }
  uVar12 = func_0x085bd700(uVar12,fVar13 - fVar11,0);
  *(undefined4 *)(lVar7 + 0x10) = uVar12;
  if ((*(char *)(lVar7 + 0x19) != '\0') && (iVar3 = func_0x047dd574(lVar7), iVar3 < 1)) {
    *(undefined1 *)(lVar7 + 0x18) = 0;
  }
  return;
}


```

## HuntDataStore.UpdateTotalPower (off 0x916a21c)

```c

undefined8 FUN_0926e21c(long param_1)

{
  undefined *puVar1;
  undefined *puVar2;
  int iVar3;
  undefined8 *puVar4;
  long *plVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  int *piVar9;
  long *plVar10;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  long *unaff_x25;
  long *plVar11;
  undefined1 auVar12 [12];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  
  auVar13._8_8_ = unaff_x21;
  auVar13._0_8_ = unaff_x22;
  auVar14._8_8_ = unaff_x21;
  auVar14._0_8_ = unaff_x22;
  if ((bRam000000000a469f32 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09eaa288);
    func_0x0415191c(PTR_DAT_09eb6a28);
    func_0x0415191c(PTR_DAT_09eb6a30);
    func_0x0415191c(PTR_DAT_09eaa8d0);
    func_0x0415191c(PTR_DAT_09ecea78);
    bRam000000000a469f32 = 1;
  }
  plVar11 = (long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  plVar10 = *(long **)(param_1 + 0x108);
  plVar5 = (long *)0x0;
  if (plVar10 != (long *)0x0) {
    lVar6 = *plVar10;
    uVar8 = (ulong)*(ushort *)(lVar6 + 0x12e);
    if (uVar8 != 0) {
      piVar9 = (int *)(*(long *)(lVar6 + 0xb0) + 8);
      do {
        if (*(long *)(piVar9 + -2) == *(long *)PTR_DAT_09ecea78) {
          puVar4 = (undefined8 *)(lVar6 + (long)*piVar9 * 0x10 + 0x138);
          goto code_r0x0926e2f8;
        }
        uVar8 = uVar8 - 1;
        piVar9 = piVar9 + 4;
      } while (uVar8 != 0);
    }
    puVar4 = (undefined8 *)func_0x041cb4c4(plVar10,*(long *)PTR_DAT_09ecea78,0);
code_r0x0926e2f8:
    plVar10 = (long *)(*(code *)*puVar4)(plVar10,puVar4[1]);
    lVar6 = *plVar11;
    if (*(int *)(lVar6 + 0xe0) == 0) {
      func_0x04151a94(lVar6);
      lVar6 = *plVar11;
    }
    plVar5 = (long *)0x0;
    unaff_x25 = plVar11;
    auVar14 = auVar13;
    if (plVar10 != (long *)0x0) {
      lVar7 = *plVar10;
      auVar14 = **(undefined1 (**) [16])(lVar6 + 0xb8);
      uVar8 = (ulong)*(ushort *)(lVar7 + 0x12e);
      if (uVar8 != 0) {
        piVar9 = (int *)(*(long *)(lVar7 + 0xb0) + 8);
        do {
          if (*(long *)(piVar9 + -2) == *(long *)PTR_DAT_09eb6a28) {
            puVar4 = (undefined8 *)(lVar7 + (long)*piVar9 * 0x10 + 0x138);
            goto code_r0x0926e380;
          }
          uVar8 = uVar8 - 1;
          piVar9 = piVar9 + 4;
        } while (uVar8 != 0);
      }
      puVar4 = (undefined8 *)func_0x041cb4c4(plVar10,*(long *)PTR_DAT_09eb6a28,0);
code_r0x0926e380:
      puVar2 = PTR_DAT_09eb6a30;
      puVar1 = PTR_DAT_09eaa8d0;
      plVar5 = (long *)(*(code *)*puVar4)(plVar10,puVar4[1]);
      while (plVar5 != (long *)0x0) {
        lVar6 = *plVar5;
        uVar8 = (ulong)*(ushort *)(lVar6 + 0x12e);
        if (uVar8 != 0) {
          piVar9 = (int *)(*(long *)(lVar6 + 0xb0) + 8);
          do {
            if (*(long *)(piVar9 + -2) == *(long *)puVar1) {
              puVar4 = (undefined8 *)(lVar6 + (long)*piVar9 * 0x10 + 0x138);
              goto code_r0x0926e3f8;
            }
            uVar8 = uVar8 - 1;
            piVar9 = piVar9 + 4;
          } while (uVar8 != 0);
        }
        puVar4 = (undefined8 *)func_0x041cb4c4(plVar5,*(long *)puVar1,0);
code_r0x0926e3f8:
        uVar8 = (*(code *)*puVar4)(plVar5,puVar4[1]);
        if ((uVar8 & 1) == 0) {
          unaff_x23 = 0;
          goto code_r0x0926e4b0;
        }
        lVar6 = *plVar5;
        uVar8 = (ulong)*(ushort *)(lVar6 + 0x12e);
        if (uVar8 != 0) {
          piVar9 = (int *)(*(long *)(lVar6 + 0xb0) + 8);
          do {
            if (*(long *)(piVar9 + -2) == *(long *)puVar2) {
              puVar4 = (undefined8 *)(lVar6 + (long)*piVar9 * 0x10 + 0x138);
              goto code_r0x0926e454;
            }
            uVar8 = uVar8 - 1;
            piVar9 = piVar9 + 4;
          } while (uVar8 != 0);
        }
        puVar4 = (undefined8 *)func_0x041cb4c4(plVar5,*(long *)puVar2,0);
code_r0x0926e454:
        iVar3 = (*(code *)*puVar4)(plVar5,puVar4[1]);
        if (iVar3 != 0) {
          auVar13 = FUN_092703fc(param_1);
          unaff_x23 = auVar13._0_8_;
          if (*(int *)(*plVar11 + 0xe0) == 0) {
            func_0x04151a94();
          }
          auVar14 = func_0x09774360(auVar14._0_8_,auVar14._8_8_,unaff_x23,auVar13._8_8_,0);
        }
      }
      func_0x04151bb8();
    }
  }
  func_0x04151bb8();
  plVar11 = unaff_x25;
  while (auVar12 = func_0x04151bb0(unaff_x23), auVar12._8_4_ == 1) {
    plVar10 = (long *)func_0x098f6de0();
    unaff_x23 = *plVar10;
    func_0x098f6df0();
code_r0x0926e4b0:
    if (plVar5 != (long *)0x0) {
      lVar6 = *plVar5;
      uVar8 = (ulong)*(ushort *)(lVar6 + 0x12e);
      if (uVar8 != 0) {
        piVar9 = (int *)(*(long *)(lVar6 + 0xb0) + 8);
        do {
          if (*(long *)(piVar9 + -2) == *(long *)PTR_DAT_09eaa288) {
            puVar4 = (undefined8 *)(lVar6 + (long)*piVar9 * 0x10 + 0x138);
            goto code_r0x0926e508;
          }
          uVar8 = uVar8 - 1;
          piVar9 = piVar9 + 4;
        } while (uVar8 != 0);
      }
      puVar4 = (undefined8 *)func_0x041cb4c4(plVar5,*(long *)PTR_DAT_09eaa288,0);
code_r0x0926e508:
      (*(code *)*puVar4)(plVar5,puVar4[1]);
    }
    if (unaff_x23 == 0) {
      auVar13 = FUN_09270494(param_1);
      if (*(int *)(*plVar11 + 0xe0) == 0) {
        func_0x04151a94();
      }
      auVar14 = func_0x09774360(auVar14._0_8_,auVar14._8_8_,auVar13._0_8_,auVar13._8_8_,0);
      *(undefined1 (*) [16])(param_1 + 0xa0) = auVar14;
      return auVar14._0_8_;
    }
  }
  if (plVar5 != (long *)0x0) {
    lVar6 = *plVar5;
    uVar8 = (ulong)*(ushort *)(lVar6 + 0x12e);
    if (uVar8 != 0) {
      piVar9 = (int *)(*(long *)(lVar6 + 0xb0) + 8);
      do {
        if (*(long *)(piVar9 + -2) == *(long *)PTR_DAT_09eaa288) {
          puVar4 = (undefined8 *)(lVar6 + (long)*piVar9 * 0x10 + 0x138);
          goto code_r0x0926e61c;
        }
        uVar8 = uVar8 - 1;
        piVar9 = piVar9 + 4;
      } while (uVar8 != 0);
    }
    puVar4 = (undefined8 *)func_0x041cb4c4(plVar5,*(long *)PTR_DAT_09eaa288,0);
code_r0x0926e61c:
    (*(code *)*puVar4)(plVar5,puVar4[1]);
  }
  func_0x04247ab0(auVar12._0_8_);
  func_0x04151bb0(0);
  lVar6 = func_0x03bf6574();
  return *(undefined8 *)(lVar6 + 0x70);
}


```

## HuntDataStore.CalculateHpTotalPower (off 0x916c494)

```c

/* WARNING: Possible PIC construction at 0x092707dc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x092707fc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0927081c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09270c04: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09270c4c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09270c68: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09270c88: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09270d2c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c5858: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c5b48: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c5c38: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c5e84: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c649c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c6528: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c5c5c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c58f0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x058c652c) */
/* WARNING: Removing unreachable block (ram,0x058c64a0) */
/* WARNING: Removing unreachable block (ram,0x058c5e88) */
/* WARNING: Removing unreachable block (ram,0x058c5c3c) */
/* WARNING: Removing unreachable block (ram,0x058c5c4c) */
/* WARNING: Removing unreachable block (ram,0x058c5b4c) */
/* WARNING: Removing unreachable block (ram,0x058c5c50) */
/* WARNING: Removing unreachable block (ram,0x058c5b50) */
/* WARNING: Removing unreachable block (ram,0x058c5b84) */
/* WARNING: Removing unreachable block (ram,0x058c5b88) */
/* WARNING: Removing unreachable block (ram,0x058c5b98) */
/* WARNING: Removing unreachable block (ram,0x058c5bcc) */
/* WARNING: Removing unreachable block (ram,0x058c5bd8) */
/* WARNING: Removing unreachable block (ram,0x058c5bdc) */
/* WARNING: Removing unreachable block (ram,0x058c5bec) */
/* WARNING: Removing unreachable block (ram,0x058c5c60) */
/* WARNING: Removing unreachable block (ram,0x058c5c70) */
/* WARNING: Removing unreachable block (ram,0x058c5c74) */
/* WARNING: Removing unreachable block (ram,0x058c5c80) */
/* WARNING: Removing unreachable block (ram,0x058c5bfc) */
/* WARNING: Removing unreachable block (ram,0x058c5c04) */
/* WARNING: Removing unreachable block (ram,0x058c5cb0) */
/* WARNING: Removing unreachable block (ram,0x058c5c10) */
/* WARNING: Removing unreachable block (ram,0x058c585c) */
/* WARNING: Removing unreachable block (ram,0x09270d30) */
/* WARNING: Removing unreachable block (ram,0x09270c8c) */
/* WARNING: Removing unreachable block (ram,0x09270c90) */
/* WARNING: Removing unreachable block (ram,0x09270cbc) */
/* WARNING: Removing unreachable block (ram,0x09270cc4) */
/* WARNING: Removing unreachable block (ram,0x09270cf0) */
/* WARNING: Removing unreachable block (ram,0x09270cd0) */
/* WARNING: Removing unreachable block (ram,0x09270cdc) */
/* WARNING: Removing unreachable block (ram,0x09270d00) */
/* WARNING: Removing unreachable block (ram,0x09270c6c) */
/* WARNING: Removing unreachable block (ram,0x09270c70) */
/* WARNING: Removing unreachable block (ram,0x09270c80) */
/* WARNING: Removing unreachable block (ram,0x09270c50) */
/* WARNING: Removing unreachable block (ram,0x09270c60) */
/* WARNING: Removing unreachable block (ram,0x09270c08) */
/* WARNING: Removing unreachable block (ram,0x09270c0c) */
/* WARNING: Removing unreachable block (ram,0x09270c24) */
/* WARNING: Removing unreachable block (ram,0x09270c28) */
/* WARNING: Removing unreachable block (ram,0x09270c44) */
/* WARNING: Removing unreachable block (ram,0x09270820) */
/* WARNING: Removing unreachable block (ram,0x09270824) */
/* WARNING: Removing unreachable block (ram,0x09270800) */
/* WARNING: Removing unreachable block (ram,0x09270804) */
/* WARNING: Removing unreachable block (ram,0x09270814) */
/* WARNING: Removing unreachable block (ram,0x092707e0) */
/* WARNING: Removing unreachable block (ram,0x092707e4) */
/* WARNING: Removing unreachable block (ram,0x058c58f4) */
/* WARNING: Removing unreachable block (ram,0x058c5864) */

long * FUN_09270494(long param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  ulong *puVar1;
  uint uVar2;
  int iVar3;
  char cVar4;
  bool bVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 *puVar13;
  long **pplVar14;
  uint uVar15;
  ulong uVar17;
  long lVar18;
  long *plVar19;
  long *plVar20;
  long lVar21;
  undefined4 uVar16;
  undefined8 uVar22;
  long *plVar23;
  long *plVar24;
  undefined8 *puVar25;
  long lVar26;
  undefined1 *puVar27;
  uint *puVar28;
  uint *puVar29;
  long *plVar30;
  uint uVar31;
  uint uVar32;
  long lVar33;
  undefined8 uVar34;
  uint *puVar35;
  long lVar36;
  ulong uVar37;
  int *piVar38;
  long *unaff_x19;
  undefined8 unaff_x20;
  undefined8 uVar39;
  undefined8 unaff_x21;
  long *plVar40;
  undefined8 unaff_x22;
  long *plVar41;
  long *unaff_x23;
  ulong uVar42;
  long *unaff_x24;
  uint *unaff_x25;
  long *unaff_x26;
  long *unaff_x27;
  uint *unaff_x28;
  long *unaff_x29;
  undefined *puVar43;
  undefined *unaff_x30;
  float fVar44;
  int iVar45;
  undefined1 auVar46 [12];
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined1 auStack_150 [12];
  undefined4 uStack_144;
  undefined *puStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  long *plStack_128;
  long *plStack_120;
  undefined8 uStack_118;
  
  auVar50._8_8_ = unaff_x22;
  auVar50._0_8_ = unaff_x21;
  auVar47._8_8_ = unaff_x22;
  auVar47._0_8_ = unaff_x21;
  auVar49._8_8_ = unaff_x22;
  auVar49._0_8_ = unaff_x21;
  if ((bRam000000000a469f33 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_WithNetwork_HpValue_TypeInfo_09eceba0);
    func_0x0415191c(
                   PTR_Method_WithNetwork_WithDataStoreBase_GetTableRow_u003CHuntStatusConfigRecord_u003E___09f4b4f8
                   );
    bRam000000000a469f33 = 1;
  }
  puVar43 = 
  PTR_Method_WithNetwork_WithDataStoreBase_GetTableRow_u003CHuntStatusConfigRecord_u003E___09f4b4f8;
  if (*(long *)(param_1 + 0x98) != 0) {
    plVar20 = (long *)func_0x092655b0(*(long *)(param_1 + 0x98),3);
    lVar21 = func_0x05696bb0(param_1,0x67,*(undefined8 *)puVar43);
    if (((lVar21 != 0) &&
        (fVar44 = (float)func_0x085cf0c8(*(undefined8 *)(lVar21 + 0x28),0), plVar20 != (long *)0x0))
       && (*plVar20 == *(long *)PTR_WithNetwork_HpValue_TypeInfo_09eceba0)) {
      plVar30 = (long *)plVar20[2];
      plVar20 = (long *)plVar20[3];
      if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
        func_0x04151a94();
      }
      auVar47 = func_0x09774ab0((double)fVar44,0);
      pplVar14 = (long **)register0x00000008;
      auVar49 = auVar50;
      goto code_r0x097744cc;
    }
  }
  auVar48 = func_0x04151bb8();
  lVar21 = auVar48._0_8_;
  pplVar14 = (long **)&stack0xffffffffffffff60;
  uVar42 = auVar48._8_8_ & 0xffffffff;
  if ((bRam000000000a469f35 & 1) == 0) {
    func_0x0415191c(PTR_WithNetwork_AttackValue_TypeInfo_09eceb98);
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09ecebb0);
    func_0x0415191c(PTR_WithNetwork_CriticalDamageValue_TypeInfo_09ecebb8);
    func_0x0415191c(PTR_WithNetwork_CriticalRateValue_TypeInfo_09ecebc8);
    func_0x0415191c(PTR_DAT_09ecebe0);
    func_0x0415191c(PTR_DAT_09ecebe8);
    func_0x0415191c(
                   PTR_Method_WithNetwork_WithDataStoreBase_GetTableRow_u003CHuntStatusConfigRecord_u003E___09f4b4f8
                   );
    bRam000000000a469f35 = 1;
  }
  if (*(long *)(lVar21 + 0x98) != 0) {
    plVar20 = (long *)func_0x092655b0(*(long *)(lVar21 + 0x98),1);
    auVar49 = auVar47;
    if (*(long *)(lVar21 + 0x98) != 0) {
      unaff_x25 = (uint *)func_0x092655b0(*(long *)(lVar21 + 0x98),5);
      if (unaff_x25 == (uint *)0x0) {
        unaff_x25 = (uint *)0x0;
      }
      else if (*(long *)unaff_x25 != *(long *)PTR_WithNetwork_CriticalRateValue_TypeInfo_09ecebc8) {
        unaff_x25 = (uint *)0x0;
      }
      auVar49 = auVar50;
      if (*(long *)(lVar21 + 0x98) != 0) {
        unaff_x26 = (long *)func_0x092655b0(*(long *)(lVar21 + 0x98),6);
        if (unaff_x26 == (long *)0x0) {
          unaff_x26 = (long *)0x0;
        }
        else if (*unaff_x26 != *(long *)PTR_WithNetwork_CriticalDamageValue_TypeInfo_09ecebb8) {
          unaff_x26 = (long *)0x0;
        }
        auVar49 = func_0x0926e088(lVar21,uVar42);
        func_0x0926e0f4(lVar21,uVar42);
        if (*(long *)(lVar21 + 0x98) != 0) {
          unaff_x27 = (long *)func_0x092655b0(*(long *)(lVar21 + 0x98),10);
          if (unaff_x27 == (long *)0x0) {
            unaff_x27 = (long *)0x0;
          }
          else if (*unaff_x27 != *(long *)PTR_DAT_09ecebe8) {
            unaff_x27 = (long *)0x0;
          }
          if (*(long *)(lVar21 + 0x98) != 0) {
            unaff_x28 = (uint *)func_0x092655b0(*(long *)(lVar21 + 0x98),0xb);
            puVar43 = 
            PTR_Method_WithNetwork_WithDataStoreBase_GetTableRow_u003CHuntStatusConfigRecord_u003E___09f4b4f8
            ;
            if (unaff_x28 == (uint *)0x0) {
              unaff_x28 = (uint *)0x0;
            }
            else if (*(long *)unaff_x28 != *(long *)PTR_DAT_09ecebb0) {
              unaff_x28 = (uint *)0x0;
            }
            if (*(long *)(lVar21 + 0x98) != 0) {
              unaff_x29 = (long *)func_0x092655b0(*(long *)(lVar21 + 0x98),0xc);
              if (unaff_x29 == (long *)0x0) {
                unaff_x29 = (long *)0x0;
              }
              else if (*unaff_x29 != *(long *)PTR_DAT_09ecebe0) {
                unaff_x29 = (long *)0x0;
              }
              lVar21 = func_0x05696bb0(lVar21,0x65,*(undefined8 *)puVar43);
              if (((lVar21 != 0) &&
                  (func_0x085cf0c8(*(undefined8 *)(lVar21 + 0x28),0), plVar20 != (long *)0x0)) &&
                 ((*plVar20 == *(long *)PTR_WithNetwork_AttackValue_TypeInfo_09eceb98 &&
                  (unaff_x25 != (uint *)0x0)))) {
                plVar30 = (long *)plVar20[2];
                plVar20 = (long *)plVar20[3];
                unaff_x20 = *(undefined8 *)*(undefined1 (*) [16])(unaff_x25 + 4);
                unaff_x19 = *(long **)(unaff_x25 + 6);
                auVar47 = *(undefined1 (*) [16])(unaff_x25 + 4);
                if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                unaff_x30 = &UNK_092707e0;
                unaff_x23 = plVar20;
                unaff_x24 = plVar30;
                goto code_r0x097744cc;
              }
            }
          }
        }
      }
    }
  }
  uVar34 = auVar49._0_8_;
  auVar47 = func_0x04151bb8();
  plVar30 = auVar47._0_8_;
  pplVar14 = &plStack_120;
  plVar20 = (long *)(auVar47._8_8_ & 0xffffffff);
  if ((bRam000000000a469f36 & 1) == 0) {
    func_0x0415191c(PTR_WithNetwork_AttackValue_TypeInfo_09eceb98);
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09ecebb0);
    func_0x0415191c(PTR_WithNetwork_CriticalDamageValue_TypeInfo_09ecebb8);
    func_0x0415191c(PTR_WithNetwork_CriticalRateValue_TypeInfo_09ecebc8);
    func_0x0415191c(PTR_DAT_09ecec40);
    func_0x0415191c(PTR_DAT_09ecebe0);
    func_0x0415191c(PTR_DAT_09ecebf0);
    func_0x0415191c(PTR_DAT_09ecebf8);
    func_0x0415191c(PTR_DAT_09ecec08);
    func_0x0415191c(PTR_DAT_09f4b500);
    func_0x0415191c(
                   PTR_Method_WithNetwork_WithDataStoreBase_GetTableRow_u003CHuntStatusConfigRecord_u003E___09f4b4f8
                   );
    bRam000000000a469f36 = 1;
  }
  uVar39 = 0xa469000;
  auVar48 = auVar49;
  if (plVar30[0x13] != 0) {
    unaff_x20 = func_0x092655b0(plVar30[0x13],1);
    if (plVar30[0x13] != 0) {
      unaff_x26 = (long *)func_0x092655b0(plVar30[0x13],5);
      if (unaff_x26 == (long *)0x0) {
        unaff_x26 = (long *)0x0;
      }
      else if (*unaff_x26 != *(long *)PTR_WithNetwork_CriticalRateValue_TypeInfo_09ecebc8) {
        unaff_x26 = (long *)0x0;
      }
      uVar39 = unaff_x20;
      if (plVar30[0x13] != 0) {
        unaff_x27 = (long *)func_0x092655b0(plVar30[0x13],6);
        if (unaff_x27 == (long *)0x0) {
          unaff_x27 = (long *)0x0;
        }
        else if (*unaff_x27 != *(long *)PTR_WithNetwork_CriticalDamageValue_TypeInfo_09ecebb8) {
          unaff_x27 = (long *)0x0;
        }
        auVar49 = func_0x0926e088(plVar30,plVar20);
        plVar40 = auVar49._8_8_;
        uVar22 = auVar49._0_8_;
        auVar7._8_8_ = uVar22;
        auVar7._0_8_ = uVar34;
        auVar6._8_8_ = uVar22;
        auVar6._0_8_ = uVar34;
        auVar48._8_8_ = uVar22;
        auVar48._0_8_ = uVar34;
        if (plVar30[0x13] != 0) {
          unaff_x28 = (uint *)func_0x092655b0(plVar30[0x13],0x14);
          if (unaff_x28 == (uint *)0x0) {
            unaff_x28 = (uint *)0x0;
          }
          else if (*(long *)unaff_x28 != *(long *)PTR_DAT_09ecebf8) {
            unaff_x28 = (uint *)0x0;
          }
          unaff_x24 = plVar40;
          auVar48 = auVar6;
          if (plVar30[0x13] != 0) {
            unaff_x29 = (long *)func_0x092655b0(plVar30[0x13],0x18);
            if (unaff_x29 == (long *)0x0) {
              unaff_x29 = (long *)0x0;
            }
            else if (*unaff_x29 != *(long *)PTR_DAT_09ecec08) {
              unaff_x29 = (long *)0x0;
            }
            auVar48 = auVar7;
            if (plVar30[0x13] != 0) {
              plVar23 = (long *)func_0x092655b0(plVar30[0x13],0xb);
              if (plVar23 == (long *)0x0) {
                plVar23 = (long *)0x0;
              }
              else if (*plVar23 != *(long *)PTR_DAT_09ecebb0) {
                plVar23 = (long *)0x0;
              }
              auVar48._0_8_ = plVar23;
              if (plVar30[0x13] != 0) {
                uStack_118 = uVar22;
                plVar24 = (long *)func_0x092655b0(plVar30[0x13],0xc);
                puVar43 = 
                PTR_Method_WithNetwork_WithDataStoreBase_GetTableRow_u003CHuntStatusConfigRecord_u003E___09f4b4f8
                ;
                if (plVar24 == (long *)0x0) {
                  plVar24 = (long *)0x0;
                }
                else if (*plVar24 != *(long *)PTR_DAT_09ecebe0) {
                  plVar24 = (long *)0x0;
                }
                auVar49._8_8_ = plVar24;
                auVar49._0_8_ = plVar23;
                auVar12._8_8_ = plVar24;
                auVar12._0_8_ = plVar23;
                auVar11._8_8_ = plVar24;
                auVar11._0_8_ = plVar23;
                auVar10._8_8_ = plVar24;
                auVar10._0_8_ = plVar23;
                auVar9._8_8_ = plVar24;
                auVar9._0_8_ = plVar23;
                auVar8._8_8_ = plVar24;
                auVar8._0_8_ = plVar23;
                auVar48._8_8_ = plVar24;
                plStack_120 = plVar40;
                if (plVar30[0x13] != 0) {
                  unaff_x24 = (long *)func_0x092655b0(plVar30[0x13],0x15);
                  lVar21 = func_0x05696bb0(plVar30,0x66,*(undefined8 *)puVar43);
                  auVar48 = auVar8;
                  if (lVar21 != 0) {
                    func_0x085cf0c8(*(undefined8 *)(lVar21 + 0x28),0);
                    unaff_x23 = (long *)(**(code **)(*plVar30 + 0x3c8))
                                                  (plVar30,plVar20,*(undefined8 *)(*plVar30 + 0x3d0)
                                                  );
                    puVar43 = PTR_DAT_09f4b500;
                    auVar48 = auVar9;
                    if (unaff_x23 != (long *)0x0) {
                      lVar21 = *unaff_x23;
                      uVar42 = (ulong)*(ushort *)(lVar21 + 0x12e);
                      if (uVar42 != 0) {
                        piVar38 = (int *)(*(long *)(lVar21 + 0xb0) + 8);
                        do {
                          if (*(long *)(piVar38 + -2) == *(long *)PTR_DAT_09ecec40) {
                            puVar25 = (undefined8 *)
                                      (lVar21 + (long)(*piVar38 + 0x13) * 0x10 + 0x138);
                            goto code_r0x09270b74;
                          }
                          uVar42 = uVar42 - 1;
                          piVar38 = piVar38 + 4;
                        } while (uVar42 != 0);
                      }
                      puVar25 = (undefined8 *)
                                func_0x041cb4c4(unaff_x23,*(long *)PTR_DAT_09ecec40,0x13);
code_r0x09270b74:
                      uVar16 = (*(code *)*puVar25)(unaff_x23,puVar25[1]);
                      lVar21 = func_0x05696bb0(plVar30,uVar16,*(undefined8 *)puVar43);
                      plVar20 = unaff_x23;
                      unaff_x25 = (uint *)puVar43;
                      auVar48 = auVar10;
                      if (((lVar21 != 0) && (auVar48 = auVar11, unaff_x24 != (long *)0x0)) &&
                         (auVar48 = auVar12, *unaff_x24 == *(long *)PTR_DAT_09ecebf0)) {
                        iVar45 = *(int *)(lVar21 + 0x38);
                        plVar30 = (long *)unaff_x24[2];
                        plVar20 = (long *)unaff_x24[3];
                        if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0)
                            == 0) {
                          func_0x04151a94(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
                        }
                        auVar47 = func_0x09774ab0((double)((float)iVar45 / 1000.0),0);
                        unaff_x30 = &UNK_09270c08;
                        unaff_x19 = plVar20;
code_r0x097744cc:
                        puVar43 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
                        *(undefined **)((long)pplVar14 + -0x40) = unaff_x30;
                        *(long **)((long)pplVar14 + -0x30) = unaff_x24;
                        *(long **)((long)pplVar14 + -0x28) = unaff_x23;
                        *(long *)((long)pplVar14 + -0x20) = auVar49._8_8_;
                        *(long *)((long)pplVar14 + -0x18) = auVar49._0_8_;
                        *(undefined8 *)((long)pplVar14 + -0x10) = unaff_x20;
                        *(long **)((long)pplVar14 + -8) = unaff_x19;
                        if ((bRam000000000a46d943 & 1) == 0) {
                          func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
                          bRam000000000a46d943 = 1;
                        }
                        if (*(int *)(*(long *)puVar43 + 0xe0) == 0) {
                          func_0x04151a94();
                        }
                        if (plVar30 == (long *)0x0 || auVar47._0_8_ == 0) {
                          uVar34 = **(undefined8 **)(*(long *)puVar43 + 0xb8);
                          *(undefined8 *)((long)pplVar14 + -0x48) =
                               (*(undefined8 **)(*(long *)puVar43 + 0xb8))[1];
                          *(undefined8 *)((long)pplVar14 + -0x50) = uVar34;
                        }
                        else {
                          auVar49 = func_0x097751b4(plVar30);
                          auVar50 = func_0x097751b4(auVar47._0_8_);
                          lVar36 = *(long *)(*(long *)(*(long *)puVar43 + 0xb8) + 0x40);
                          *(undefined8 *)((long)pplVar14 + -0x50) = 0;
                          *(undefined8 *)((long)pplVar14 + -0x48) = 0;
                          lVar21 = 0;
                          if (lVar36 != 0) {
                            lVar21 = (auVar50._8_8_ * auVar49._8_8_) / lVar36;
                          }
                          lVar18 = 0;
                          if (lVar36 != 0) {
                            lVar18 = (auVar50._8_8_ * auVar49._0_8_ + auVar50._0_8_ * auVar49._8_8_
                                     + lVar21) / lVar36;
                          }
                          func_0x09773f14((undefined1 *)((long)pplVar14 + -0x50),
                                          lVar18 + auVar50._0_8_ * auVar49._0_8_,
                                          (long)plVar20 + auVar47._8_8_ + 0xc);
                        }
                        return *(long **)((long)pplVar14 + -0x50);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  plVar40 = auVar48._8_8_;
  auVar49 = func_0x04151bb8();
  puStack_140 = &UNK_09270d90;
  uVar42 = auVar49._8_8_ & 0xffffffff;
  uStack_138 = auVar48._0_8_;
  uStack_130 = uVar39;
  plStack_128 = plVar30;
  if ((bRam000000000a469f43 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09f4b508);
    bRam000000000a469f43 = 1;
  }
  lVar21 = *(long *)(auVar49._0_8_ + 0xb8);
  if (lVar21 == 0) {
    lVar21 = func_0x04151bb8();
    return *(long **)(lVar21 + 0xe0);
  }
  plVar30 = *(long **)PTR_DAT_09f4b508;
  puVar28 = *(uint **)(*(long *)(plVar30[4] + 0xc0) + 0xf0);
  uVar15 = func_0x058c50f0();
  if ((int)uVar15 < 0) {
    uStack_144 = auVar49._8_4_;
    uVar34 = func_0x04151a9c(*(undefined8 *)(*(long *)(plVar30[4] + 0xc0) + 0x70),&uStack_144);
    func_0x085dd808(uVar34,0);
    return (long *)0x0;
  }
  lVar36 = *(long *)(lVar21 + 0x18);
  if (lVar36 == 0) {
    func_0x04151bb8();
  }
  else if (uVar15 < *(uint *)(lVar36 + 0x18)) {
    return *(long **)(lVar36 + (ulong)uVar15 * 0x18 + 0x30);
  }
  puVar43 = &UNK_058c4a14;
  auVar49 = func_0x04151bc0();
  plVar23 = (long *)0x1;
  lVar36 = *(long *)(*(long *)(*(long *)(param_4 + 0x20) + 0xc0) + 0xf8);
  puVar13 = auStack_150;
  do {
    lVar18 = auVar49._0_8_;
    *(long **)(puVar13 + -0x60) = unaff_x29;
    *(undefined **)(puVar13 + -0x58) = puVar43;
    *(uint **)(puVar13 + -0x50) = unaff_x28;
    *(long **)(puVar13 + -0x48) = unaff_x27;
    *(long **)(puVar13 + -0x40) = unaff_x26;
    *(uint **)(puVar13 + -0x38) = unaff_x25;
    *(long **)(puVar13 + -0x30) = unaff_x24;
    *(long **)(puVar13 + -0x28) = plVar20;
    *(long **)(puVar13 + -0x20) = plVar40;
    *(long *)(puVar13 + -0x18) = lVar21;
    *(ulong *)(puVar13 + -0x10) = uVar42;
    *(long **)(puVar13 + -8) = plVar30;
    *(int *)(puVar13 + -100) = auVar49._8_4_;
    uVar42 = auVar49._8_8_ & 0xffffffff;
    *(int *)(lVar18 + 0x2c) = *(int *)(lVar18 + 0x2c) + 1;
    puVar29 = puVar28;
    if (*(long *)(lVar18 + 0x10) == 0) {
      puVar29 = *(uint **)(*(long *)(*(long *)(lVar36 + 0x20) + 0xc0) + 0x10);
      func_0x058c53cc(lVar18,0);
    }
    plVar20 = *(long **)(lVar18 + 0x30);
    lVar21 = *(long *)(lVar18 + 0x18);
    if (plVar20 == (long *)0x0) {
      uVar15 = func_0x085b9e58(puVar13 + -100,
                               *(undefined8 *)(*(long *)(*(long *)(lVar36 + 0x20) + 0xc0) + 0x170));
    }
    else {
      lVar26 = *(long *)(*(long *)(*(long *)(lVar36 + 0x20) + 0xc0) + 8);
      if ((*(byte *)(lVar26 + 0x135) & 1) == 0) {
        lVar26 = func_0x041cb3c0(lVar26);
      }
      lVar33 = *plVar20;
      uVar37 = (ulong)*(ushort *)(lVar33 + 0x12e);
      if (uVar37 != 0) {
        piVar38 = (int *)(*(long *)(lVar33 + 0xb0) + 8);
        do {
          if (*(long *)(piVar38 + -2) == lVar26) {
            puVar25 = (undefined8 *)(lVar33 + (long)(*piVar38 + 1) * 0x10 + 0x138);
            goto code_r0x058c559c;
          }
          uVar37 = uVar37 - 1;
          piVar38 = piVar38 + 4;
        } while (uVar37 != 0);
      }
      puVar25 = (undefined8 *)func_0x041cb4c4(plVar20,lVar26,1);
code_r0x058c559c:
      puVar29 = (uint *)puVar25[1];
      uVar15 = (*(code *)*puVar25)(plVar20,uVar42);
    }
    lVar26 = *(long *)(lVar18 + 0x10);
    unaff_x25 = puVar28;
    unaff_x29 = plVar23;
    if (lVar26 == 0) goto code_r0x058c5938;
    uVar32 = *(uint *)(lVar26 + 0x18);
    uVar15 = uVar15 & 0x7fffffff;
    unaff_x27 = (long *)(ulong)uVar15;
    iVar45 = 0;
    if (uVar32 != 0) {
      iVar45 = (int)uVar15 / (int)uVar32;
    }
    uVar31 = uVar15 - iVar45 * uVar32;
    if (uVar31 < uVar32) {
      unaff_x28 = (uint *)(lVar26 + (ulong)uVar31 * 4 + 0x20);
      uVar32 = *unaff_x28 - 1;
      uVar42 = (ulong)uVar32;
      iVar45 = (int)plVar23;
      if (plVar20 == (long *)0x0) {
        if (lVar21 != 0) {
          uVar34 = *(undefined8 *)(lVar21 + 0x18);
          uVar31 = (uint)uVar34;
          if (uVar32 < uVar31) {
            plVar30 = (long *)0x0;
            plVar40 = (long *)0x18;
            do {
              uVar32 = (uint)uVar34;
              uVar31 = (uint)uVar42;
              plVar20 = (long *)(long)(int)uVar31;
              if (*(uint *)(lVar21 + (long)(int)uVar31 * 0x18 + 0x20) == uVar15) {
                plVar24 = (long *)func_0x0437fd74(*(undefined8 *)
                                                   (*(long *)(*(long *)(lVar36 + 0x20) + 0xc0) +
                                                   0x18));
                if (*(uint *)(lVar21 + 0x18) <= uVar31) goto code_r0x058c5934;
                if (plVar24 == (long *)0x0) goto code_r0x058c5938;
                puVar29 = (uint *)(ulong)*(uint *)(puVar13 + -100);
                uVar37 = (**(code **)(*plVar24 + 0x1b8))
                                   (plVar24,*(undefined4 *)(lVar21 + (long)plVar20 * 0x18 + 0x28),
                                    puVar29,*(undefined8 *)(*plVar24 + 0x1c0));
                if ((uVar37 & 1) != 0) {
                  if (iVar45 == 2) {
                    puVar27 = puVar13 + -0x68;
                    *(undefined4 *)(puVar13 + -0x68) = *(undefined4 *)(puVar13 + -100);
                    goto code_r0x058c5914;
                  }
                  if (iVar45 != 1) {
                    return (long *)0x0;
                  }
                  if (*(uint *)(lVar21 + 0x18) <= uVar31) goto code_r0x058c5934;
                  plVar30 = (long *)(lVar21 + (long)plVar20 * 0x18 + 0x30);
                  *plVar30 = (long)puVar28;
                  goto code_r0x0413776c;
                }
                uVar32 = *(uint *)(lVar21 + 0x18);
              }
              if (uVar32 <= uVar31) goto code_r0x058c5934;
              uVar2 = *(uint *)(lVar21 + (long)plVar20 * 0x18 + 0x24);
              uVar42 = (ulong)uVar2;
              if ((int)uVar32 <= (int)plVar30) {
                func_0x085dd870(0);
              }
              uVar34 = *(undefined8 *)(lVar21 + 0x18);
              plVar30 = (long *)(ulong)((int)plVar30 + 1);
              uVar31 = (uint)uVar34;
            } while (uVar2 < uVar31);
          }
          goto code_r0x058c5780;
        }
      }
      else if (lVar21 != 0) {
        uVar34 = *(undefined8 *)(lVar21 + 0x18);
        uVar31 = (uint)uVar34;
        if (uVar32 < uVar31) {
          *(int *)(puVar13 + -0x7c) = iVar45;
          plVar23 = (long *)0x0;
          plVar40 = (long *)0x18;
          *(uint **)(puVar13 + -0x78) = puVar28;
          do {
            uVar32 = (uint)uVar34;
            uVar31 = (uint)uVar42;
            plVar30 = (long *)(long)(int)uVar31;
            if (*(uint *)(lVar21 + (long)(int)uVar31 * 0x18 + 0x20) == uVar15) {
              puVar28 = (uint *)(ulong)*(uint *)(puVar13 + -100);
              lVar26 = *(long *)(*(long *)(*(long *)(lVar36 + 0x20) + 0xc0) + 8);
              uVar42 = (ulong)*(uint *)(lVar21 + (long)plVar30 * 0x18 + 0x28);
              if ((*(byte *)(lVar26 + 0x135) & 1) == 0) {
                lVar26 = func_0x041cb3c0(lVar26);
              }
              lVar33 = *plVar20;
              uVar37 = (ulong)*(ushort *)(lVar33 + 0x12e);
              if (uVar37 != 0) {
                piVar38 = (int *)(*(long *)(lVar33 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar38 + -2) == lVar26) {
                    puVar25 = (undefined8 *)(lVar33 + (long)*piVar38 * 0x10 + 0x138);
                    goto code_r0x058c568c;
                  }
                  uVar37 = uVar37 - 1;
                  piVar38 = piVar38 + 4;
                } while (uVar37 != 0);
              }
              puVar25 = (undefined8 *)func_0x041cb4c4(plVar20,lVar26,0);
code_r0x058c568c:
              puVar29 = puVar28;
              uVar37 = (*(code *)*puVar25)(plVar20,uVar42,puVar28,puVar25[1]);
              if ((uVar37 & 1) != 0) {
                if ((*(uint *)(puVar13 + -0x7c) & 0xff) == 2) {
                  puVar27 = puVar13 + -0x6c;
                  *(undefined4 *)(puVar13 + -0x6c) = *(undefined4 *)(puVar13 + -100);
code_r0x058c5914:
                  uVar34 = func_0x04151a9c(*(undefined8 *)
                                            (*(long *)(*(long *)(lVar36 + 0x20) + 0xc0) + 0x70),
                                           puVar27);
                  func_0x085dd76c(uVar34,0);
                  return (long *)0x0;
                }
                if ((*(uint *)(puVar13 + -0x7c) & 0xff) != 1) {
                  return (long *)0x0;
                }
                if (*(uint *)(lVar21 + 0x18) <= uVar31) goto code_r0x058c5934;
                plVar30 = (long *)(lVar21 + (long)plVar30 * 0x18 + 0x30);
                *plVar30 = *(long *)(puVar13 + -0x78);
                goto code_r0x0413776c;
              }
              uVar32 = *(uint *)(lVar21 + 0x18);
            }
            if (uVar32 <= uVar31) goto code_r0x058c5934;
            uVar2 = *(uint *)(lVar21 + (long)plVar30 * 0x18 + 0x24);
            uVar42 = (ulong)uVar2;
            if ((int)uVar32 <= (int)plVar23) {
              func_0x085dd870(0);
            }
            uVar34 = *(undefined8 *)(lVar21 + 0x18);
            plVar23 = (long *)(ulong)((int)plVar23 + 1);
            uVar31 = (uint)uVar34;
          } while (uVar2 < uVar31);
          puVar28 = *(uint **)(puVar13 + -0x78);
        }
code_r0x058c5780:
        if (*(int *)(lVar18 + 0x28) < 1) {
          uVar32 = *(uint *)(lVar18 + 0x20);
          plVar30 = (long *)(ulong)uVar32;
          unaff_x25 = puVar28;
          unaff_x29 = plVar23;
          if (uVar32 == uVar31) {
            func_0x058c5cd4(lVar18,*(undefined8 *)
                                    (*(long *)(*(long *)(lVar36 + 0x20) + 0xc0) + 0x198));
            lVar26 = *(long *)(lVar18 + 0x10);
            *(uint *)(lVar18 + 0x20) = uVar32 + 1;
            if (lVar26 == 0) goto code_r0x058c5938;
            uVar31 = *(uint *)(lVar26 + 0x18);
            iVar45 = 0;
            if (uVar31 != 0) {
              iVar45 = (int)uVar15 / (int)uVar31;
            }
            uVar2 = uVar15 - iVar45 * uVar31;
            if (uVar31 <= uVar2) goto code_r0x058c5934;
            lVar21 = *(long *)(lVar18 + 0x18);
            unaff_x28 = (uint *)(lVar26 + (ulong)uVar2 * 4 + 0x20);
          }
          else {
            lVar21 = *(long *)(lVar18 + 0x18);
            *(uint *)(lVar18 + 0x20) = uVar32 + 1;
          }
          if (lVar21 == 0) goto code_r0x058c5938;
          if (*(uint *)(lVar21 + 0x18) <= uVar32) goto code_r0x058c5934;
          lVar36 = (long)(int)uVar32;
        }
        else {
          *(int *)(lVar18 + 0x28) = *(int *)(lVar18 + 0x28) + -1;
          uVar32 = *(uint *)(lVar18 + 0x24);
          plVar30 = (long *)(ulong)uVar32;
          if (*(uint *)(lVar21 + 0x18) <= uVar32) goto code_r0x058c5934;
          lVar36 = (long)(int)uVar32;
          *(undefined4 *)(lVar18 + 0x24) = *(undefined4 *)(lVar21 + lVar36 * 0x18 + 0x24);
        }
        lVar21 = lVar21 + lVar36 * 0x18;
        *(uint *)(lVar21 + 0x20) = uVar15;
        *(uint *)(lVar21 + 0x24) = *unaff_x28 - 1;
        uVar16 = *(undefined4 *)(puVar13 + -100);
        plVar30 = (long *)(lVar21 + 0x30);
        *plVar30 = (long)puVar28;
        *(undefined4 *)(lVar21 + 0x28) = uVar16;
        goto code_r0x0413776c;
      }
    }
    else {
code_r0x058c5934:
      func_0x04151bc0();
      unaff_x25 = puVar28;
      unaff_x29 = plVar23;
    }
code_r0x058c5938:
    lVar26 = func_0x04151bb8();
    unaff_x26 = (long *)PTR_DAT_09eea9a8;
    *(undefined **)(puVar13 + -0xd0) = &UNK_058c593c;
    *(long **)(puVar13 + -200) = unaff_x27;
    *(long *)(puVar13 + -0xc0) = lVar21;
    *(uint **)(puVar13 + -0xb8) = unaff_x25;
    *(ulong *)(puVar13 + -0xb0) = uVar42;
    *(long **)(puVar13 + -0xa8) = plVar20;
    *(long **)(puVar13 + -0xa0) = plVar40;
    *(long *)(puVar13 + -0x98) = lVar36;
    *(long *)(puVar13 + -0x90) = lVar18;
    *(long **)(puVar13 + -0x88) = plVar30;
    uVar37 = 0xa454000;
    if ((bRam000000000a45489c & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eea9d8);
      func_0x0415191c(PTR_DAT_09eea9e0);
      func_0x0415191c(PTR_DAT_09eea9a8);
      func_0x0415191c(PTR_DAT_09eaa090);
      func_0x0415191c(PTR_DAT_09eea9b8);
      func_0x0415191c(PTR_DAT_09eea9c0);
      func_0x0415191c(PTR_DAT_09eea9c8);
      func_0x0415191c(PTR_DAT_09eea9d0);
      bRam000000000a45489c = 1;
    }
    lVar21 = *unaff_x26;
    *(undefined8 *)(puVar13 + -0xd8) = 0;
    if (*(int *)(lVar21 + 0xe0) == 0) {
      func_0x04151a94();
    }
    lVar21 = func_0x08582984(0);
    if (lVar21 != 0) {
      func_0x07e38140(lVar21,lVar26,puVar13 + -0xd8,*(undefined8 *)PTR_DAT_09eea9e0);
      if (*(long *)(puVar13 + -0xd8) == 0) {
        return (long *)0x0;
      }
      uVar17 = func_0x084c4560(*(long *)(puVar13 + -0xd8),*(undefined8 *)PTR_DAT_09eea9d0,0);
      puVar43 = PTR_DAT_09eaa090;
      if (*(long *)(puVar13 + -0xd8) != 0) {
        uVar37 = uVar17 & 0xffffffff;
        uVar42 = func_0x084c4560(*(long *)(puVar13 + -0xd8),*(undefined8 *)PTR_DAT_09eea9b8,0);
        lVar21 = *(long *)puVar43;
        lVar36 = *(long *)(puVar13 + -0xd8);
        plVar40 = (long *)(uVar42 & 0xffffffff);
        uVar42 = *(ulong *)(*(long *)(*(long *)(puVar29 + 8) + 0xc0) + 0x150);
        if (*(int *)(lVar21 + 0xe0) == 0) {
          func_0x04151a94(lVar21);
        }
        uVar34 = func_0x085cae78(uVar42,0);
        plVar20 = (long *)0x0;
        unaff_x27 = (long *)puVar43;
        if (lVar36 != 0) {
          lVar21 = func_0x084c2664(lVar36,*(undefined8 *)PTR_DAT_09eea9c0,uVar34,0);
          lVar36 = *(long *)(*(long *)(*(long *)(puVar29 + 8) + 0xc0) + 8);
          if ((*(byte *)(lVar36 + 0x135) & 1) == 0) {
            lVar36 = func_0x041cb3c0(lVar36);
          }
          if (lVar21 == 0) {
code_r0x058c5af0:
            lVar18 = 0;
          }
          else {
            lVar18 = func_0x04151a98(lVar21,lVar36);
            if (lVar18 == 0) {
              func_0x04151f54(lVar21,lVar36);
              goto code_r0x058c5af0;
            }
          }
          plVar30 = (long *)(lVar26 + 0x30);
          *plVar30 = lVar18;
          lVar36 = *(long *)(*(long *)(*(long *)(puVar29 + 8) + 0xc0) + 8);
          if ((*(byte *)(lVar36 + 0x135) & 1) == 0) {
            lVar36 = func_0x041cb3c0(lVar36);
          }
          if ((lVar21 != 0) && (lVar18 = func_0x04151a98(lVar21,lVar36), lVar18 == 0)) {
            func_0x04151f54(lVar21,lVar36);
          }
          goto code_r0x0413776c;
        }
      }
    }
    func_0x04151bb8();
    func_0x085dd388(0x10,0);
    func_0x04151bb8();
    auVar49 = func_0x04151f54(uVar42,plVar20);
    puVar43 = PTR_DAT_09eea9a8;
    lVar21 = auVar49._0_8_;
    *(undefined **)(puVar13 + -0x110) = &UNK_058c5cd4;
    *(long **)(puVar13 + -0x100) = plVar40;
    *(ulong *)(puVar13 + -0xf8) = uVar37;
    *(uint **)(puVar13 + -0xf0) = puVar29;
    *(long *)(puVar13 + -0xe8) = lVar26;
    if ((bRam000000000a45489d & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eea9a8);
      bRam000000000a45489d = 1;
    }
    uVar16 = *(undefined4 *)(lVar21 + 0x20);
    if (*(int *)(*(long *)puVar43 + 0xe0) == 0) {
      func_0x04151a94();
    }
    uVar15 = func_0x08582900(uVar16,0);
    puVar43 = PTR_DAT_09eac100;
    puVar28 = (uint *)(ulong)uVar15;
    lVar36 = *(long *)(*(long *)(*(long *)(auVar49._8_8_ + 0x20) + 0xc0) + 0x1a8);
    *(undefined8 *)(puVar13 + -0x120) = *(undefined8 *)(puVar13 + -0x110);
    *(ulong *)(puVar13 + -0x110) = uVar42;
    *(long **)(puVar13 + -0x108) = plVar20;
    *(undefined8 *)(puVar13 + -0x100) = *(undefined8 *)(puVar13 + -0x100);
    *(undefined8 *)(puVar13 + -0xf8) = *(undefined8 *)(puVar13 + -0xf8);
    *(undefined8 *)(puVar13 + -0xf0) = *(undefined8 *)(puVar13 + -0xf0);
    *(undefined8 *)(puVar13 + -0xe8) = *(undefined8 *)(puVar13 + -0xe8);
    if ((bRam000000000a45489e & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eac100,puVar28,0);
      bRam000000000a45489e = 1;
    }
    plVar23 = (long *)func_0x04151a04(*(undefined8 *)puVar43,puVar28);
    lVar36 = *(long *)(*(long *)(*(long *)(lVar36 + 0x20) + 0xc0) + 400);
    if ((*(byte *)(lVar36 + 0x135) & 1) == 0) {
      lVar36 = func_0x041cb3c0(lVar36);
    }
    plVar30 = (long *)func_0x04151a04(lVar36,puVar28);
    uVar32 = *(uint *)(lVar21 + 0x20);
    puVar29 = (uint *)(ulong)uVar32;
    unaff_x24 = (long *)0x0;
    plVar20 = plVar30;
    func_0x085dec90(*(undefined8 *)(lVar21 + 0x18),0,plVar30,0,puVar29,0);
    if ((int)uVar32 < 1) {
code_r0x058c5e78:
      plVar30 = (long *)(lVar21 + 0x10);
      *plVar30 = (long)plVar23;
      goto code_r0x0413776c;
    }
    if (plVar30 != (long *)0x0) {
      uVar32 = *(uint *)(plVar30 + 3);
      puVar35 = (uint *)0x0;
      while (puVar35 < (uint *)(ulong)uVar32) {
        iVar45 = (int)plVar30[(long)puVar35 * 3 + 4];
        if (-1 < iVar45) {
          if (plVar23 == (long *)0x0) goto code_r0x058c5eac;
          iVar3 = 0;
          if (uVar15 != 0) {
            iVar3 = iVar45 / (int)uVar15;
          }
          uVar31 = iVar45 - iVar3 * uVar15;
          if (*(uint *)(plVar23 + 3) <= uVar31) break;
          *(int *)((long)plVar30 + (long)puVar35 * 0x18 + 0x24) =
               *(int *)((long)plVar23 + (ulong)uVar31 * 4 + 0x20) + -1;
          *(int *)((long)plVar23 + (ulong)uVar31 * 4 + 0x20) = (int)puVar35 + 1;
        }
        puVar35 = (uint *)((long)puVar35 + 1);
        if (puVar35 == puVar29) goto code_r0x058c5e78;
      }
      func_0x04151bc0();
    }
code_r0x058c5eac:
    auVar46 = func_0x04151bb8();
    lVar36 = auVar46._0_8_;
    *(long **)(puVar13 + -0x180) = unaff_x29;
    *(undefined **)(puVar13 + -0x178) = &UNK_058c5eb0;
    *(uint **)(puVar13 + -0x170) = unaff_x28;
    *(long **)(puVar13 + -0x168) = unaff_x27;
    *(long **)(puVar13 + -0x160) = unaff_x26;
    *(uint **)(puVar13 + -0x158) = unaff_x25;
    *(uint **)(puVar13 + -0x150) = puVar29;
    *(long **)(puVar13 + -0x148) = plVar30;
    *(undefined8 **)(puVar13 + -0x140) = (undefined8 *)(lVar21 + 0x18);
    *(long **)(puVar13 + -0x138) = plVar23;
    *(uint **)(puVar13 + -0x130) = puVar28;
    *(long *)(puVar13 + -0x128) = lVar21;
    *(uint *)(puVar13 + -0x184) = auVar46._8_4_;
    if (*(long *)(lVar36 + 0x10) == 0) {
      return (long *)0x0;
    }
    plVar40 = *(long **)(lVar36 + 0x30);
    if (plVar40 == (long *)0x0) {
      plVar30 = plVar20;
      uVar15 = func_0x085b9e58(puVar13 + -0x184,
                               *(undefined8 *)(*(long *)(plVar20[4] + 0xc0) + 0x170));
    }
    else {
      plVar23 = (long *)(ulong)auVar46._8_4_;
      lVar21 = *(long *)(*(long *)(plVar20[4] + 0xc0) + 8);
      if ((*(byte *)(lVar21 + 0x135) & 1) == 0) {
        lVar21 = func_0x041cb3c0(lVar21);
      }
      lVar18 = *plVar40;
      uVar42 = (ulong)*(ushort *)(lVar18 + 0x12e);
      if (uVar42 != 0) {
        piVar38 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
        do {
          if (*(long *)(piVar38 + -2) == lVar21) {
            puVar25 = (undefined8 *)(lVar18 + (long)(*piVar38 + 1) * 0x10 + 0x138);
            goto code_r0x058c5f70;
          }
          uVar42 = uVar42 - 1;
          piVar38 = piVar38 + 4;
        } while (uVar42 != 0);
      }
      puVar25 = (undefined8 *)func_0x041cb4c4(plVar40,lVar21,1);
code_r0x058c5f70:
      plVar30 = (long *)puVar25[1];
      uVar15 = (*(code *)*puVar25)(plVar40,plVar23);
    }
    lVar21 = *(long *)(lVar36 + 0x10);
    if (lVar21 == 0) {
code_r0x058c61ac:
      func_0x04151bb8();
    }
    else {
      uVar32 = *(uint *)(lVar21 + 0x18);
      uVar15 = uVar15 & 0x7fffffff;
      unaff_x27 = (long *)(ulong)uVar15;
      iVar45 = 0;
      if (uVar32 != 0) {
        iVar45 = (int)uVar15 / (int)uVar32;
      }
      uVar31 = uVar15 - iVar45 * uVar32;
      if (uVar31 < uVar32) {
        uVar32 = *(int *)(lVar21 + (ulong)uVar31 * 4 + 0x20) - 1;
        if ((int)uVar32 < 0) {
          return (long *)0x0;
        }
        plVar24 = (long *)0x0;
        unaff_x29 = (long *)0xffffffff;
        puVar28 = (uint *)0x18;
        *(ulong *)(puVar13 + -0x198) = (ulong)uVar31;
        *(long **)(puVar13 + -400) = plVar20;
        while( true ) {
          puVar29 = (uint *)(ulong)uVar32;
          unaff_x26 = *(long **)(lVar36 + 0x18);
          plVar40 = plVar24;
          if (unaff_x26 == (long *)0x0) break;
          if (*(uint *)(unaff_x26 + 3) <= uVar32) goto code_r0x058c61b0;
          unaff_x25 = (uint *)(unaff_x26 + (ulong)uVar32 * 3 + 4);
          unaff_x28 = puVar29;
          if (*unaff_x25 == uVar15) {
            plVar23 = *(long **)(lVar36 + 0x30);
            if (plVar23 == (long *)0x0) {
              plVar41 = (long *)func_0x0437fd74(*(undefined8 *)(*(long *)(plVar20[4] + 0xc0) + 0x18)
                                               );
              plVar23 = plVar24;
              if (plVar41 == (long *)0x0) break;
              plVar30 = (long *)(ulong)*(uint *)(puVar13 + -0x184);
              unaff_x24 = *(long **)(*plVar41 + 0x1c0);
              uVar42 = (**(code **)(*plVar41 + 0x1b8))
                                 (plVar41,(int)unaff_x26[(long)puVar29 * 3 + 5]);
            }
            else {
              if (plVar23 == (long *)0x0) break;
              uVar31 = *(uint *)(puVar13 + -0x184);
              lVar21 = *(long *)(*(long *)(plVar20[4] + 0xc0) + 8);
              uVar2 = *(uint *)(unaff_x26 + (long)puVar29 * 3 + 5);
              if ((*(byte *)(lVar21 + 0x135) & 1) == 0) {
                lVar21 = func_0x041cb3c0(lVar21);
              }
              lVar18 = *plVar23;
              uVar42 = (ulong)*(ushort *)(lVar18 + 0x12e);
              if (uVar42 != 0) {
                piVar38 = (int *)(*(long *)(lVar18 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar38 + -2) == lVar21) {
                    puVar25 = (undefined8 *)(lVar18 + (long)*piVar38 * 0x10 + 0x138);
                    goto code_r0x058c60b8;
                  }
                  uVar42 = uVar42 - 1;
                  piVar38 = piVar38 + 4;
                } while (uVar42 != 0);
              }
              puVar25 = (undefined8 *)func_0x041cb4c4(plVar23,lVar21,0);
code_r0x058c60b8:
              unaff_x24 = (long *)puVar25[1];
              plVar30 = (long *)(ulong)uVar31;
              uVar42 = (*(code *)*puVar25)(plVar23,(long *)(ulong)uVar2);
              plVar20 = *(long **)(puVar13 + -400);
              plVar24 = plVar23;
              plVar40 = (long *)(ulong)uVar2;
            }
            if ((uVar42 & 1) != 0) {
              plVar23 = plVar24;
              if ((int)(uint)unaff_x29 < 0) {
                lVar21 = *(long *)(lVar36 + 0x10);
                if (lVar21 == 0) break;
                if (*(uint *)(lVar21 + 0x18) <= (uint)*(long *)(puVar13 + -0x198))
                goto code_r0x058c61b0;
                *(int *)(lVar21 + *(long *)(puVar13 + -0x198) * 4 + 0x20) =
                     *(int *)((long)unaff_x26 + (long)puVar29 * 0x18 + 0x24) + 1;
              }
              else {
                lVar21 = *(long *)(lVar36 + 0x18);
                if (lVar21 == 0) break;
                if (*(uint *)(lVar21 + 0x18) <= (uint)unaff_x29) goto code_r0x058c61b0;
                *(undefined4 *)(lVar21 + (long)unaff_x29 * 0x18 + 0x24) =
                     *(undefined4 *)((long)unaff_x26 + (long)puVar29 * 0x18 + 0x24);
              }
              *unaff_x25 = 0xffffffff;
              uVar16 = *(undefined4 *)(lVar36 + 0x24);
              unaff_x26[(long)puVar29 * 3 + 6] = 0;
              *(undefined4 *)((long)unaff_x26 + (long)puVar29 * 0x18 + 0x24) = uVar16;
              *(uint *)(lVar36 + 0x24) = uVar32;
              *(ulong *)(lVar36 + 0x28) =
                   CONCAT44((int)((ulong)*(undefined8 *)(lVar36 + 0x28) >> 0x20) + 1,
                            (int)*(undefined8 *)(lVar36 + 0x28) + 1);
              return (long *)0x1;
            }
          }
          uVar31 = *(uint *)((long)unaff_x26 + (long)puVar29 * 0x18 + 0x24);
          unaff_x29 = (long *)(ulong)uVar32;
          plVar23 = plVar24;
          uVar32 = uVar31;
          if ((int)uVar31 < 0) {
            return (long *)0x0;
          }
        }
        goto code_r0x058c61ac;
      }
    }
code_r0x058c61b0:
    auVar46 = func_0x04151bc0();
    lVar18 = auVar46._0_8_;
    *(long **)(puVar13 + -0x200) = unaff_x29;
    *(undefined **)(puVar13 + -0x1f8) = &UNK_058c61b4;
    *(uint **)(puVar13 + -0x1f0) = unaff_x28;
    *(long **)(puVar13 + -0x1e8) = unaff_x27;
    *(long **)(puVar13 + -0x1e0) = unaff_x26;
    *(uint **)(puVar13 + -0x1d8) = unaff_x25;
    *(uint **)(puVar13 + -0x1d0) = puVar29;
    *(long **)(puVar13 + -0x1c8) = plVar20;
    *(long **)(puVar13 + -0x1c0) = plVar40;
    *(long **)(puVar13 + -0x1b8) = plVar23;
    *(uint **)(puVar13 + -0x1b0) = puVar28;
    *(long *)(puVar13 + -0x1a8) = lVar36;
    *(uint *)(puVar13 + -0x204) = auVar46._8_4_;
    lVar21 = *(long *)(lVar18 + 0x10);
    *(long **)(puVar13 + -0x218) = plVar30;
    if (lVar21 == 0) {
code_r0x058c63f8:
      **(undefined8 **)(puVar13 + -0x218) = 0;
      return (long *)0x0;
    }
    plVar20 = *(long **)(lVar18 + 0x30);
    plVar24 = unaff_x24;
    if (plVar20 == (long *)0x0) {
      uVar15 = func_0x085b9e58(puVar13 + -0x204,
                               *(undefined8 *)(*(long *)(unaff_x24[4] + 0xc0) + 0x170));
    }
    else {
      plVar40 = (long *)(ulong)auVar46._8_4_;
      lVar21 = *(long *)(*(long *)(unaff_x24[4] + 0xc0) + 8);
      if ((*(byte *)(lVar21 + 0x135) & 1) == 0) {
        lVar21 = func_0x041cb3c0(lVar21);
      }
      lVar36 = *plVar20;
      uVar42 = (ulong)*(ushort *)(lVar36 + 0x12e);
      if (uVar42 != 0) {
        piVar38 = (int *)(*(long *)(lVar36 + 0xb0) + 8);
        do {
          if (*(long *)(piVar38 + -2) == lVar21) {
            puVar25 = (undefined8 *)(lVar36 + (long)(*piVar38 + 1) * 0x10 + 0x138);
            goto code_r0x058c6278;
          }
          uVar42 = uVar42 - 1;
          piVar38 = piVar38 + 4;
        } while (uVar42 != 0);
      }
      puVar25 = (undefined8 *)func_0x041cb4c4(plVar20,lVar21,1);
code_r0x058c6278:
      plVar30 = (long *)puVar25[1];
      uVar15 = (*(code *)*puVar25)(plVar20,plVar40);
    }
    lVar21 = *(long *)(lVar18 + 0x10);
    if (lVar21 == 0) {
code_r0x058c64d0:
      func_0x04151bb8();
    }
    else {
      uVar32 = *(uint *)(lVar21 + 0x18);
      uVar15 = uVar15 & 0x7fffffff;
      unaff_x29 = (long *)(ulong)uVar15;
      iVar45 = 0;
      if (uVar32 != 0) {
        iVar45 = (int)uVar15 / (int)uVar32;
      }
      uVar31 = uVar15 - iVar45 * uVar32;
      if (uVar31 < uVar32) {
        iVar45 = *(int *)(lVar21 + (ulong)uVar31 * 4 + 0x20);
        *(ulong *)(puVar13 + -0x220) = (ulong)uVar31;
        uVar32 = iVar45 - 1;
        if ((int)uVar32 < 0) goto code_r0x058c63f8;
        plVar41 = (long *)0x0;
        unaff_x26 = (long *)0xffffffff;
        plVar23 = (long *)0x18;
        *(long **)(puVar13 + -0x210) = unaff_x24;
        while( true ) {
          unaff_x25 = (uint *)(ulong)uVar32;
          unaff_x27 = *(long **)(lVar18 + 0x18);
          plVar20 = plVar41;
          if (unaff_x27 == (long *)0x0) break;
          if (*(uint *)(unaff_x27 + 3) <= uVar32) goto code_r0x058c64d4;
          unaff_x28 = (uint *)(unaff_x27 + (ulong)uVar32 * 3 + 4);
          puVar28 = unaff_x25;
          if (*unaff_x28 == uVar15) {
            plVar40 = *(long **)(lVar18 + 0x30);
            if (plVar40 == (long *)0x0) {
              plVar19 = (long *)func_0x0437fd74(*(undefined8 *)
                                                 (*(long *)(unaff_x24[4] + 0xc0) + 0x18));
              plVar40 = plVar41;
              if (plVar19 == (long *)0x0) break;
              plVar30 = (long *)(ulong)*(uint *)(puVar13 + -0x204);
              plVar24 = *(long **)(*plVar19 + 0x1c0);
              uVar42 = (**(code **)(*plVar19 + 0x1b8))
                                 (plVar19,(int)unaff_x27[(long)unaff_x25 * 3 + 5]);
            }
            else {
              if (plVar40 == (long *)0x0) break;
              uVar31 = *(uint *)(puVar13 + -0x204);
              lVar21 = *(long *)(*(long *)(unaff_x24[4] + 0xc0) + 8);
              uVar2 = *(uint *)(unaff_x27 + (long)unaff_x25 * 3 + 5);
              if ((*(byte *)(lVar21 + 0x135) & 1) == 0) {
                lVar21 = func_0x041cb3c0(lVar21);
              }
              lVar36 = *plVar40;
              uVar42 = (ulong)*(ushort *)(lVar36 + 0x12e);
              if (uVar42 != 0) {
                piVar38 = (int *)(*(long *)(lVar36 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar38 + -2) == lVar21) {
                    puVar25 = (undefined8 *)(lVar36 + (long)*piVar38 * 0x10 + 0x138);
                    goto code_r0x058c63c4;
                  }
                  uVar42 = uVar42 - 1;
                  piVar38 = piVar38 + 4;
                } while (uVar42 != 0);
              }
              puVar25 = (undefined8 *)func_0x041cb4c4(plVar40,lVar21,0);
code_r0x058c63c4:
              plVar24 = (long *)puVar25[1];
              plVar30 = (long *)(ulong)uVar31;
              uVar42 = (*(code *)*puVar25)(plVar40,(long *)(ulong)uVar2);
              unaff_x24 = *(long **)(puVar13 + -0x210);
              plVar41 = plVar40;
              plVar20 = (long *)(ulong)uVar2;
            }
            if ((uVar42 & 1) != 0) {
              plVar40 = plVar41;
              if ((int)(uint)unaff_x26 < 0) {
                lVar21 = *(long *)(lVar18 + 0x10);
                if (lVar21 == 0) break;
                if (*(uint *)(lVar21 + 0x18) <= (uint)*(long *)(puVar13 + -0x220))
                goto code_r0x058c64d4;
                *(int *)(lVar21 + *(long *)(puVar13 + -0x220) * 4 + 0x20) =
                     *(int *)((long)unaff_x27 + (long)unaff_x25 * 0x18 + 0x24) + 1;
              }
              else {
                lVar21 = *(long *)(lVar18 + 0x18);
                if (lVar21 == 0) break;
                if (*(uint *)(lVar21 + 0x18) <= (uint)unaff_x26) goto code_r0x058c64d4;
                *(undefined4 *)(lVar21 + (long)unaff_x26 * 0x18 + 0x24) =
                     *(undefined4 *)((long)unaff_x27 + (long)unaff_x25 * 0x18 + 0x24);
              }
              plVar30 = *(long **)(puVar13 + -0x218);
              *plVar30 = unaff_x27[(long)unaff_x25 * 3 + 6];
              goto code_r0x0413776c;
            }
          }
          uVar31 = *(uint *)((long)unaff_x27 + (long)unaff_x25 * 0x18 + 0x24);
          unaff_x26 = (long *)(ulong)uVar32;
          plVar40 = plVar41;
          uVar32 = uVar31;
          if ((int)uVar31 < 0) goto code_r0x058c63f8;
        }
        goto code_r0x058c64d0;
      }
    }
code_r0x058c64d4:
    lVar21 = func_0x04151bc0();
    *(undefined **)(puVar13 + -0x240) = &UNK_058c64d8;
    *(long **)(puVar13 + -0x238) = plVar23;
    *(uint **)(puVar13 + -0x230) = puVar28;
    *(long *)(puVar13 + -0x228) = lVar18;
    puVar28 = *(uint **)(*(long *)(plVar24[4] + 0xc0) + 0xf0);
    uVar15 = func_0x058c50f0();
    uVar42 = (ulong)uVar15;
    if ((int)uVar15 < 0) {
      *plVar30 = 0;
      return (long *)(ulong)(~uVar15 >> 0x1f);
    }
    lVar36 = *(long *)(lVar21 + 0x18);
    if (lVar36 == 0) {
      func_0x04151bb8();
    }
    else if (uVar15 < *(uint *)(lVar36 + 0x18)) {
      *plVar30 = *(long *)(lVar36 + uVar42 * 0x18 + 0x30);
code_r0x0413776c:
      if (iRam000000000a680cb0 != 0) {
        puVar1 = (ulong *)(((ulong)plVar30 >> 0x12 & 0x7fff) * 8 + 0xa4b4c88);
        do {
          cVar4 = '\x01';
          bVar5 = (bool)ExclusiveMonitorPass(puVar1,0x10);
          if (bVar5) {
            *puVar1 = *puVar1 | 1L << ((ulong)plVar30 >> 0xc & 0x3f);
            cVar4 = ExclusiveMonitorsStatus();
          }
        } while (cVar4 != '\0');
      }
      return plVar30;
    }
    puVar43 = &UNK_058c6550;
    auVar49 = func_0x04151bc0();
    plVar23 = (long *)0x0;
    lVar36 = *(long *)(*(long *)(plVar24[4] + 0xc0) + 0xf8);
    puVar13 = puVar13 + -0x240;
  } while( true );
}


```

## HuntDataStore.CalculateCostumeTotalPower (off 0x916c3fc)

```c

undefined1  [16] FUN_092703fc(undefined8 param_1,undefined4 param_2)

{
  undefined1 auVar1 [16];
  undefined *puVar2;
  long lVar3;
  long lVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  long lStack_40;
  undefined8 uStack_38;
  
  puVar2 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
  if ((bRam000000000a469f34 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a469f34 = 1;
  }
  auVar5 = FUN_09270588(param_1,param_2);
  auVar6 = FUN_0927087c(param_1,param_2);
  lVar4 = auVar6._0_8_;
  if (*(int *)(*(long *)puVar2 + 0xe0) == 0) {
    func_0x04151a94();
  }
  if ((bRam000000000a46d941 & 1) == 0) {
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    bRam000000000a46d941 = 1;
  }
  auVar1 = auVar5;
  if (auVar5._8_8_ < auVar6._8_8_) {
    auVar1 = auVar6;
    auVar6 = auVar5;
    lVar4 = auVar5._0_8_;
  }
  auVar5 = auVar1;
  if (lVar4 != 0) {
    auVar5 = auVar6;
    if ((auVar1._0_8_ != 0) && (lVar4 = auVar1._8_8_ - auVar6._8_8_, auVar5 = auVar1, lVar4 < 0xc))
    {
      if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
        func_0x04151a94();
      }
      lVar3 = func_0x097740c8(lVar4);
      lVar4 = 0;
      if (lVar3 != 0) {
        lVar4 = auVar6._0_8_ / lVar3;
      }
      lStack_40 = 0;
      uStack_38 = 0;
      func_0x09773f14(&lStack_40,lVar4 + auVar1._0_8_,auVar1._8_8_);
      auVar5._8_8_ = uStack_38;
      auVar5._0_8_ = lStack_40;
    }
  }
  return auVar5;
}


```

## HuntDataStore.CalculateNormalAttackTotalPower (off 0x916c588)

```c

/* WARNING: Possible PIC construction at 0x092707dc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x092707fc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0927081c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09270c04: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09270c4c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09270c68: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09270c88: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09270d2c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c5858: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c5b48: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c5c38: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c5e84: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c649c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c6528: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c5c5c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c58f0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x058c652c) */
/* WARNING: Removing unreachable block (ram,0x058c64a0) */
/* WARNING: Removing unreachable block (ram,0x058c5e88) */
/* WARNING: Removing unreachable block (ram,0x058c5c3c) */
/* WARNING: Removing unreachable block (ram,0x058c5c4c) */
/* WARNING: Removing unreachable block (ram,0x058c5b4c) */
/* WARNING: Removing unreachable block (ram,0x058c5c50) */
/* WARNING: Removing unreachable block (ram,0x058c5b50) */
/* WARNING: Removing unreachable block (ram,0x058c5b84) */
/* WARNING: Removing unreachable block (ram,0x058c5b88) */
/* WARNING: Removing unreachable block (ram,0x058c5b98) */
/* WARNING: Removing unreachable block (ram,0x058c5bcc) */
/* WARNING: Removing unreachable block (ram,0x058c5bd8) */
/* WARNING: Removing unreachable block (ram,0x058c5bdc) */
/* WARNING: Removing unreachable block (ram,0x058c5bec) */
/* WARNING: Removing unreachable block (ram,0x058c5c60) */
/* WARNING: Removing unreachable block (ram,0x058c5c70) */
/* WARNING: Removing unreachable block (ram,0x058c5c74) */
/* WARNING: Removing unreachable block (ram,0x058c5c80) */
/* WARNING: Removing unreachable block (ram,0x058c5bfc) */
/* WARNING: Removing unreachable block (ram,0x058c5c04) */
/* WARNING: Removing unreachable block (ram,0x058c5cb0) */
/* WARNING: Removing unreachable block (ram,0x058c5c10) */
/* WARNING: Removing unreachable block (ram,0x058c585c) */
/* WARNING: Removing unreachable block (ram,0x09270d30) */
/* WARNING: Removing unreachable block (ram,0x09270c8c) */
/* WARNING: Removing unreachable block (ram,0x09270c90) */
/* WARNING: Removing unreachable block (ram,0x09270cbc) */
/* WARNING: Removing unreachable block (ram,0x09270cc4) */
/* WARNING: Removing unreachable block (ram,0x09270cf0) */
/* WARNING: Removing unreachable block (ram,0x09270cd0) */
/* WARNING: Removing unreachable block (ram,0x09270cdc) */
/* WARNING: Removing unreachable block (ram,0x09270d00) */
/* WARNING: Removing unreachable block (ram,0x09270c6c) */
/* WARNING: Removing unreachable block (ram,0x09270c70) */
/* WARNING: Removing unreachable block (ram,0x09270c80) */
/* WARNING: Removing unreachable block (ram,0x09270c50) */
/* WARNING: Removing unreachable block (ram,0x09270c60) */
/* WARNING: Removing unreachable block (ram,0x09270c08) */
/* WARNING: Removing unreachable block (ram,0x09270c0c) */
/* WARNING: Removing unreachable block (ram,0x09270c24) */
/* WARNING: Removing unreachable block (ram,0x09270c28) */
/* WARNING: Removing unreachable block (ram,0x09270c44) */
/* WARNING: Removing unreachable block (ram,0x09270820) */
/* WARNING: Removing unreachable block (ram,0x09270824) */
/* WARNING: Removing unreachable block (ram,0x09270800) */
/* WARNING: Removing unreachable block (ram,0x09270804) */
/* WARNING: Removing unreachable block (ram,0x09270814) */
/* WARNING: Removing unreachable block (ram,0x092707e0) */
/* WARNING: Removing unreachable block (ram,0x092707e4) */
/* WARNING: Removing unreachable block (ram,0x058c58f4) */
/* WARNING: Removing unreachable block (ram,0x058c5864) */

long * FUN_09270588(long param_1,undefined4 param_2,undefined8 param_3,long param_4)

{
  ulong *puVar1;
  uint uVar2;
  int iVar3;
  char cVar4;
  bool bVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined *puVar14;
  undefined1 *puVar15;
  long **pplVar16;
  uint uVar17;
  ulong uVar19;
  long lVar20;
  long *plVar21;
  long *plVar22;
  long lVar23;
  undefined4 uVar18;
  undefined8 uVar24;
  undefined8 uVar25;
  long *plVar26;
  long *plVar27;
  undefined8 *puVar28;
  long lVar29;
  undefined1 *puVar30;
  uint *puVar31;
  uint *puVar32;
  long *plVar33;
  uint uVar34;
  uint uVar35;
  long lVar36;
  uint *puVar37;
  long lVar38;
  ulong uVar39;
  ulong uVar40;
  int *piVar41;
  undefined8 uVar42;
  undefined8 unaff_x21;
  undefined8 uVar43;
  long *plVar44;
  undefined8 unaff_x22;
  long *plVar45;
  long *unaff_x24;
  uint *unaff_x25;
  long *unaff_x26;
  long *unaff_x27;
  uint *unaff_x28;
  long *unaff_x29;
  undefined *puVar46;
  int iVar47;
  undefined1 auVar48 [12];
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined1 auStack_120 [12];
  undefined4 uStack_114;
  undefined *puStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  long *plStack_f8;
  long *plStack_f0;
  undefined8 uStack_e8;
  
  auVar51._8_8_ = unaff_x22;
  auVar51._0_8_ = unaff_x21;
  auVar50._8_8_ = unaff_x22;
  auVar50._0_8_ = unaff_x21;
  auVar49._8_8_ = unaff_x22;
  auVar49._0_8_ = unaff_x21;
  pplVar16 = (long **)&stack0xffffffffffffff90;
  if ((bRam000000000a469f35 & 1) == 0) {
    func_0x0415191c(PTR_WithNetwork_AttackValue_TypeInfo_09eceb98);
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09ecebb0);
    func_0x0415191c(PTR_WithNetwork_CriticalDamageValue_TypeInfo_09ecebb8);
    func_0x0415191c(PTR_WithNetwork_CriticalRateValue_TypeInfo_09ecebc8);
    func_0x0415191c(PTR_DAT_09ecebe0);
    func_0x0415191c(PTR_DAT_09ecebe8);
    func_0x0415191c(
                   PTR_Method_WithNetwork_WithDataStoreBase_GetTableRow_u003CHuntStatusConfigRecord_u003E___09f4b4f8
                   );
    bRam000000000a469f35 = 1;
  }
  if (*(long *)(param_1 + 0x98) != 0) {
    plVar22 = (long *)func_0x092655b0(*(long *)(param_1 + 0x98),1);
    auVar49 = auVar50;
    if (*(long *)(param_1 + 0x98) != 0) {
      unaff_x25 = (uint *)func_0x092655b0(*(long *)(param_1 + 0x98),5);
      if (unaff_x25 == (uint *)0x0) {
        unaff_x25 = (uint *)0x0;
      }
      else if (*(long *)unaff_x25 != *(long *)PTR_WithNetwork_CriticalRateValue_TypeInfo_09ecebc8) {
        unaff_x25 = (uint *)0x0;
      }
      auVar49 = auVar51;
      if (*(long *)(param_1 + 0x98) != 0) {
        unaff_x26 = (long *)func_0x092655b0(*(long *)(param_1 + 0x98),6);
        if (unaff_x26 == (long *)0x0) {
          unaff_x26 = (long *)0x0;
        }
        else if (*unaff_x26 != *(long *)PTR_WithNetwork_CriticalDamageValue_TypeInfo_09ecebb8) {
          unaff_x26 = (long *)0x0;
        }
        auVar49 = func_0x0926e088(param_1,param_2);
        func_0x0926e0f4(param_1,param_2);
        if (*(long *)(param_1 + 0x98) != 0) {
          unaff_x27 = (long *)func_0x092655b0(*(long *)(param_1 + 0x98),10);
          if (unaff_x27 == (long *)0x0) {
            unaff_x27 = (long *)0x0;
          }
          else if (*unaff_x27 != *(long *)PTR_DAT_09ecebe8) {
            unaff_x27 = (long *)0x0;
          }
          if (*(long *)(param_1 + 0x98) != 0) {
            unaff_x28 = (uint *)func_0x092655b0(*(long *)(param_1 + 0x98),0xb);
            puVar46 = 
            PTR_Method_WithNetwork_WithDataStoreBase_GetTableRow_u003CHuntStatusConfigRecord_u003E___09f4b4f8
            ;
            if (unaff_x28 == (uint *)0x0) {
              unaff_x28 = (uint *)0x0;
            }
            else if (*(long *)unaff_x28 != *(long *)PTR_DAT_09ecebb0) {
              unaff_x28 = (uint *)0x0;
            }
            if (*(long *)(param_1 + 0x98) != 0) {
              unaff_x29 = (long *)func_0x092655b0(*(long *)(param_1 + 0x98),0xc);
              if (unaff_x29 == (long *)0x0) {
                unaff_x29 = (long *)0x0;
              }
              else if (*unaff_x29 != *(long *)PTR_DAT_09ecebe0) {
                unaff_x29 = (long *)0x0;
              }
              lVar23 = func_0x05696bb0(param_1,0x65,*(undefined8 *)puVar46);
              if ((((lVar23 != 0) &&
                   (func_0x085cf0c8(*(undefined8 *)(lVar23 + 0x28),0), plVar22 != (long *)0x0)) &&
                  (*plVar22 == *(long *)PTR_WithNetwork_AttackValue_TypeInfo_09eceb98)) &&
                 (unaff_x25 != (uint *)0x0)) {
                plVar33 = (long *)plVar22[2];
                plVar22 = (long *)plVar22[3];
                uVar24 = *(undefined8 *)*(undefined1 (*) [16])(unaff_x25 + 4);
                plVar44 = *(long **)(unaff_x25 + 6);
                auVar50 = *(undefined1 (*) [16])(unaff_x25 + 4);
                if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0) == 0) {
                  func_0x04151a94();
                }
                puVar46 = &UNK_092707e0;
                plVar26 = plVar22;
                unaff_x24 = plVar33;
                goto code_r0x097744cc;
              }
            }
          }
        }
      }
    }
  }
  uVar43 = auVar49._0_8_;
  auVar50 = func_0x04151bb8();
  plVar33 = auVar50._0_8_;
  pplVar16 = &plStack_f0;
  plVar22 = (long *)(auVar50._8_8_ & 0xffffffff);
  if ((bRam000000000a469f36 & 1) == 0) {
    func_0x0415191c(PTR_WithNetwork_AttackValue_TypeInfo_09eceb98);
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09ecebb0);
    func_0x0415191c(PTR_WithNetwork_CriticalDamageValue_TypeInfo_09ecebb8);
    func_0x0415191c(PTR_WithNetwork_CriticalRateValue_TypeInfo_09ecebc8);
    func_0x0415191c(PTR_DAT_09ecec40);
    func_0x0415191c(PTR_DAT_09ecebe0);
    func_0x0415191c(PTR_DAT_09ecebf0);
    func_0x0415191c(PTR_DAT_09ecebf8);
    func_0x0415191c(PTR_DAT_09ecec08);
    func_0x0415191c(PTR_DAT_09f4b500);
    func_0x0415191c(
                   PTR_Method_WithNetwork_WithDataStoreBase_GetTableRow_u003CHuntStatusConfigRecord_u003E___09f4b4f8
                   );
    bRam000000000a469f36 = 1;
  }
  uVar42 = 0xa469000;
  auVar6 = auVar49;
  if (plVar33[0x13] != 0) {
    uVar24 = func_0x092655b0(plVar33[0x13],1);
    if (plVar33[0x13] != 0) {
      unaff_x26 = (long *)func_0x092655b0(plVar33[0x13],5);
      if (unaff_x26 == (long *)0x0) {
        unaff_x26 = (long *)0x0;
      }
      else if (*unaff_x26 != *(long *)PTR_WithNetwork_CriticalRateValue_TypeInfo_09ecebc8) {
        unaff_x26 = (long *)0x0;
      }
      uVar42 = uVar24;
      if (plVar33[0x13] != 0) {
        unaff_x27 = (long *)func_0x092655b0(plVar33[0x13],6);
        if (unaff_x27 == (long *)0x0) {
          unaff_x27 = (long *)0x0;
        }
        else if (*unaff_x27 != *(long *)PTR_WithNetwork_CriticalDamageValue_TypeInfo_09ecebb8) {
          unaff_x27 = (long *)0x0;
        }
        auVar49 = func_0x0926e088(plVar33,plVar22);
        plVar44 = auVar49._8_8_;
        uVar25 = auVar49._0_8_;
        auVar8._8_8_ = uVar25;
        auVar8._0_8_ = uVar43;
        auVar7._8_8_ = uVar25;
        auVar7._0_8_ = uVar43;
        auVar6._8_8_ = uVar25;
        auVar6._0_8_ = uVar43;
        if (plVar33[0x13] != 0) {
          unaff_x28 = (uint *)func_0x092655b0(plVar33[0x13],0x14);
          if (unaff_x28 == (uint *)0x0) {
            unaff_x28 = (uint *)0x0;
          }
          else if (*(long *)unaff_x28 != *(long *)PTR_DAT_09ecebf8) {
            unaff_x28 = (uint *)0x0;
          }
          unaff_x24 = plVar44;
          auVar6 = auVar7;
          if (plVar33[0x13] != 0) {
            unaff_x29 = (long *)func_0x092655b0(plVar33[0x13],0x18);
            if (unaff_x29 == (long *)0x0) {
              unaff_x29 = (long *)0x0;
            }
            else if (*unaff_x29 != *(long *)PTR_DAT_09ecec08) {
              unaff_x29 = (long *)0x0;
            }
            auVar6 = auVar8;
            if (plVar33[0x13] != 0) {
              plVar26 = (long *)func_0x092655b0(plVar33[0x13],0xb);
              if (plVar26 == (long *)0x0) {
                plVar26 = (long *)0x0;
              }
              else if (*plVar26 != *(long *)PTR_DAT_09ecebb0) {
                plVar26 = (long *)0x0;
              }
              auVar6._0_8_ = plVar26;
              if (plVar33[0x13] != 0) {
                uStack_e8 = uVar25;
                plVar27 = (long *)func_0x092655b0(plVar33[0x13],0xc);
                puVar46 = 
                PTR_Method_WithNetwork_WithDataStoreBase_GetTableRow_u003CHuntStatusConfigRecord_u003E___09f4b4f8
                ;
                if (plVar27 == (long *)0x0) {
                  plVar27 = (long *)0x0;
                }
                else if (*plVar27 != *(long *)PTR_DAT_09ecebe0) {
                  plVar27 = (long *)0x0;
                }
                auVar49._8_8_ = plVar27;
                auVar49._0_8_ = plVar26;
                auVar13._8_8_ = plVar27;
                auVar13._0_8_ = plVar26;
                auVar12._8_8_ = plVar27;
                auVar12._0_8_ = plVar26;
                auVar11._8_8_ = plVar27;
                auVar11._0_8_ = plVar26;
                auVar10._8_8_ = plVar27;
                auVar10._0_8_ = plVar26;
                auVar9._8_8_ = plVar27;
                auVar9._0_8_ = plVar26;
                auVar6._8_8_ = plVar27;
                plStack_f0 = plVar44;
                if (plVar33[0x13] != 0) {
                  unaff_x24 = (long *)func_0x092655b0(plVar33[0x13],0x15);
                  lVar23 = func_0x05696bb0(plVar33,0x66,*(undefined8 *)puVar46);
                  auVar6 = auVar9;
                  if (lVar23 != 0) {
                    func_0x085cf0c8(*(undefined8 *)(lVar23 + 0x28),0);
                    plVar26 = (long *)(**(code **)(*plVar33 + 0x3c8))
                                                (plVar33,plVar22,*(undefined8 *)(*plVar33 + 0x3d0));
                    puVar46 = PTR_DAT_09f4b500;
                    auVar6 = auVar10;
                    if (plVar26 != (long *)0x0) {
                      lVar23 = *plVar26;
                      uVar40 = (ulong)*(ushort *)(lVar23 + 0x12e);
                      if (uVar40 != 0) {
                        piVar41 = (int *)(*(long *)(lVar23 + 0xb0) + 8);
                        do {
                          if (*(long *)(piVar41 + -2) == *(long *)PTR_DAT_09ecec40) {
                            puVar28 = (undefined8 *)
                                      (lVar23 + (long)(*piVar41 + 0x13) * 0x10 + 0x138);
                            goto code_r0x09270b74;
                          }
                          uVar40 = uVar40 - 1;
                          piVar41 = piVar41 + 4;
                        } while (uVar40 != 0);
                      }
                      puVar28 = (undefined8 *)
                                func_0x041cb4c4(plVar26,*(long *)PTR_DAT_09ecec40,0x13);
code_r0x09270b74:
                      uVar18 = (*(code *)*puVar28)(plVar26,puVar28[1]);
                      lVar23 = func_0x05696bb0(plVar33,uVar18,*(undefined8 *)puVar46);
                      plVar22 = plVar26;
                      unaff_x25 = (uint *)puVar46;
                      auVar6 = auVar11;
                      if (((lVar23 != 0) && (auVar6 = auVar12, unaff_x24 != (long *)0x0)) &&
                         (auVar6 = auVar13, *unaff_x24 == *(long *)PTR_DAT_09ecebf0)) {
                        iVar47 = *(int *)(lVar23 + 0x38);
                        plVar33 = (long *)unaff_x24[2];
                        plVar22 = (long *)unaff_x24[3];
                        if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0)
                            == 0) {
                          func_0x04151a94(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
                        }
                        auVar50 = func_0x09774ab0((double)((float)iVar47 / 1000.0),0);
                        puVar46 = &UNK_09270c08;
                        plVar44 = plVar22;
code_r0x097744cc:
                        puVar14 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
                        *(undefined **)((long)pplVar16 + -0x40) = puVar46;
                        *(long **)((long)pplVar16 + -0x30) = unaff_x24;
                        *(long **)((long)pplVar16 + -0x28) = plVar26;
                        *(long *)((long)pplVar16 + -0x20) = auVar49._8_8_;
                        *(long *)((long)pplVar16 + -0x18) = auVar49._0_8_;
                        *(undefined8 *)((long)pplVar16 + -0x10) = uVar24;
                        *(long **)((long)pplVar16 + -8) = plVar44;
                        if ((bRam000000000a46d943 & 1) == 0) {
                          func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
                          bRam000000000a46d943 = 1;
                        }
                        if (*(int *)(*(long *)puVar14 + 0xe0) == 0) {
                          func_0x04151a94();
                        }
                        if (plVar33 == (long *)0x0 || auVar50._0_8_ == 0) {
                          uVar24 = **(undefined8 **)(*(long *)puVar14 + 0xb8);
                          *(undefined8 *)((long)pplVar16 + -0x48) =
                               (*(undefined8 **)(*(long *)puVar14 + 0xb8))[1];
                          *(undefined8 *)((long)pplVar16 + -0x50) = uVar24;
                        }
                        else {
                          auVar49 = func_0x097751b4(plVar33);
                          auVar51 = func_0x097751b4(auVar50._0_8_);
                          lVar38 = *(long *)(*(long *)(*(long *)puVar14 + 0xb8) + 0x40);
                          *(undefined8 *)((long)pplVar16 + -0x50) = 0;
                          *(undefined8 *)((long)pplVar16 + -0x48) = 0;
                          lVar23 = 0;
                          if (lVar38 != 0) {
                            lVar23 = (auVar51._8_8_ * auVar49._8_8_) / lVar38;
                          }
                          lVar20 = 0;
                          if (lVar38 != 0) {
                            lVar20 = (auVar51._8_8_ * auVar49._0_8_ + auVar51._0_8_ * auVar49._8_8_
                                     + lVar23) / lVar38;
                          }
                          func_0x09773f14((undefined1 *)((long)pplVar16 + -0x50),
                                          lVar20 + auVar51._0_8_ * auVar49._0_8_,
                                          (long)plVar22 + auVar50._8_8_ + 0xc);
                        }
                        return *(long **)((long)pplVar16 + -0x50);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  plVar44 = auVar6._8_8_;
  auVar49 = func_0x04151bb8();
  puStack_110 = &UNK_09270d90;
  uVar40 = auVar49._8_8_ & 0xffffffff;
  uStack_108 = auVar6._0_8_;
  uStack_100 = uVar42;
  plStack_f8 = plVar33;
  if ((bRam000000000a469f43 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09f4b508);
    bRam000000000a469f43 = 1;
  }
  lVar23 = *(long *)(auVar49._0_8_ + 0xb8);
  if (lVar23 == 0) {
    lVar23 = func_0x04151bb8();
    return *(long **)(lVar23 + 0xe0);
  }
  plVar33 = *(long **)PTR_DAT_09f4b508;
  puVar31 = *(uint **)(*(long *)(plVar33[4] + 0xc0) + 0xf0);
  uVar17 = func_0x058c50f0();
  if ((int)uVar17 < 0) {
    uStack_114 = auVar49._8_4_;
    uVar24 = func_0x04151a9c(*(undefined8 *)(*(long *)(plVar33[4] + 0xc0) + 0x70),&uStack_114);
    func_0x085dd808(uVar24,0);
    return (long *)0x0;
  }
  lVar38 = *(long *)(lVar23 + 0x18);
  if (lVar38 == 0) {
    func_0x04151bb8();
  }
  else if (uVar17 < *(uint *)(lVar38 + 0x18)) {
    return *(long **)(lVar38 + (ulong)uVar17 * 0x18 + 0x30);
  }
  puVar46 = &UNK_058c4a14;
  auVar49 = func_0x04151bc0();
  plVar26 = (long *)0x1;
  lVar38 = *(long *)(*(long *)(*(long *)(param_4 + 0x20) + 0xc0) + 0xf8);
  puVar15 = auStack_120;
  do {
    lVar20 = auVar49._0_8_;
    *(long **)(puVar15 + -0x60) = unaff_x29;
    *(undefined **)(puVar15 + -0x58) = puVar46;
    *(uint **)(puVar15 + -0x50) = unaff_x28;
    *(long **)(puVar15 + -0x48) = unaff_x27;
    *(long **)(puVar15 + -0x40) = unaff_x26;
    *(uint **)(puVar15 + -0x38) = unaff_x25;
    *(long **)(puVar15 + -0x30) = unaff_x24;
    *(long **)(puVar15 + -0x28) = plVar22;
    *(long **)(puVar15 + -0x20) = plVar44;
    *(long *)(puVar15 + -0x18) = lVar23;
    *(ulong *)(puVar15 + -0x10) = uVar40;
    *(long **)(puVar15 + -8) = plVar33;
    *(int *)(puVar15 + -100) = auVar49._8_4_;
    uVar40 = auVar49._8_8_ & 0xffffffff;
    *(int *)(lVar20 + 0x2c) = *(int *)(lVar20 + 0x2c) + 1;
    puVar32 = puVar31;
    if (*(long *)(lVar20 + 0x10) == 0) {
      puVar32 = *(uint **)(*(long *)(*(long *)(lVar38 + 0x20) + 0xc0) + 0x10);
      func_0x058c53cc(lVar20,0);
    }
    plVar22 = *(long **)(lVar20 + 0x30);
    lVar23 = *(long *)(lVar20 + 0x18);
    if (plVar22 == (long *)0x0) {
      uVar17 = func_0x085b9e58(puVar15 + -100,
                               *(undefined8 *)(*(long *)(*(long *)(lVar38 + 0x20) + 0xc0) + 0x170));
    }
    else {
      lVar29 = *(long *)(*(long *)(*(long *)(lVar38 + 0x20) + 0xc0) + 8);
      if ((*(byte *)(lVar29 + 0x135) & 1) == 0) {
        lVar29 = func_0x041cb3c0(lVar29);
      }
      lVar36 = *plVar22;
      uVar39 = (ulong)*(ushort *)(lVar36 + 0x12e);
      if (uVar39 != 0) {
        piVar41 = (int *)(*(long *)(lVar36 + 0xb0) + 8);
        do {
          if (*(long *)(piVar41 + -2) == lVar29) {
            puVar28 = (undefined8 *)(lVar36 + (long)(*piVar41 + 1) * 0x10 + 0x138);
            goto code_r0x058c559c;
          }
          uVar39 = uVar39 - 1;
          piVar41 = piVar41 + 4;
        } while (uVar39 != 0);
      }
      puVar28 = (undefined8 *)func_0x041cb4c4(plVar22,lVar29,1);
code_r0x058c559c:
      puVar32 = (uint *)puVar28[1];
      uVar17 = (*(code *)*puVar28)(plVar22,uVar40);
    }
    lVar29 = *(long *)(lVar20 + 0x10);
    unaff_x25 = puVar31;
    unaff_x29 = plVar26;
    if (lVar29 == 0) goto code_r0x058c5938;
    uVar35 = *(uint *)(lVar29 + 0x18);
    uVar17 = uVar17 & 0x7fffffff;
    unaff_x27 = (long *)(ulong)uVar17;
    iVar47 = 0;
    if (uVar35 != 0) {
      iVar47 = (int)uVar17 / (int)uVar35;
    }
    uVar34 = uVar17 - iVar47 * uVar35;
    if (uVar34 < uVar35) {
      unaff_x28 = (uint *)(lVar29 + (ulong)uVar34 * 4 + 0x20);
      uVar35 = *unaff_x28 - 1;
      uVar40 = (ulong)uVar35;
      iVar47 = (int)plVar26;
      if (plVar22 == (long *)0x0) {
        if (lVar23 != 0) {
          uVar24 = *(undefined8 *)(lVar23 + 0x18);
          uVar34 = (uint)uVar24;
          if (uVar35 < uVar34) {
            plVar33 = (long *)0x0;
            plVar44 = (long *)0x18;
            do {
              uVar35 = (uint)uVar24;
              uVar34 = (uint)uVar40;
              plVar22 = (long *)(long)(int)uVar34;
              if (*(uint *)(lVar23 + (long)(int)uVar34 * 0x18 + 0x20) == uVar17) {
                plVar27 = (long *)func_0x0437fd74(*(undefined8 *)
                                                   (*(long *)(*(long *)(lVar38 + 0x20) + 0xc0) +
                                                   0x18));
                if (*(uint *)(lVar23 + 0x18) <= uVar34) goto code_r0x058c5934;
                if (plVar27 == (long *)0x0) goto code_r0x058c5938;
                puVar32 = (uint *)(ulong)*(uint *)(puVar15 + -100);
                uVar39 = (**(code **)(*plVar27 + 0x1b8))
                                   (plVar27,*(undefined4 *)(lVar23 + (long)plVar22 * 0x18 + 0x28),
                                    puVar32,*(undefined8 *)(*plVar27 + 0x1c0));
                if ((uVar39 & 1) != 0) {
                  if (iVar47 == 2) {
                    puVar30 = puVar15 + -0x68;
                    *(undefined4 *)(puVar15 + -0x68) = *(undefined4 *)(puVar15 + -100);
                    goto code_r0x058c5914;
                  }
                  if (iVar47 != 1) {
                    return (long *)0x0;
                  }
                  if (*(uint *)(lVar23 + 0x18) <= uVar34) goto code_r0x058c5934;
                  plVar33 = (long *)(lVar23 + (long)plVar22 * 0x18 + 0x30);
                  *plVar33 = (long)puVar31;
                  goto code_r0x0413776c;
                }
                uVar35 = *(uint *)(lVar23 + 0x18);
              }
              if (uVar35 <= uVar34) goto code_r0x058c5934;
              uVar2 = *(uint *)(lVar23 + (long)plVar22 * 0x18 + 0x24);
              uVar40 = (ulong)uVar2;
              if ((int)uVar35 <= (int)plVar33) {
                func_0x085dd870(0);
              }
              uVar24 = *(undefined8 *)(lVar23 + 0x18);
              plVar33 = (long *)(ulong)((int)plVar33 + 1);
              uVar34 = (uint)uVar24;
            } while (uVar2 < uVar34);
          }
          goto code_r0x058c5780;
        }
      }
      else if (lVar23 != 0) {
        uVar24 = *(undefined8 *)(lVar23 + 0x18);
        uVar34 = (uint)uVar24;
        if (uVar35 < uVar34) {
          *(int *)(puVar15 + -0x7c) = iVar47;
          plVar26 = (long *)0x0;
          plVar44 = (long *)0x18;
          *(uint **)(puVar15 + -0x78) = puVar31;
          do {
            uVar35 = (uint)uVar24;
            uVar34 = (uint)uVar40;
            plVar33 = (long *)(long)(int)uVar34;
            if (*(uint *)(lVar23 + (long)(int)uVar34 * 0x18 + 0x20) == uVar17) {
              puVar31 = (uint *)(ulong)*(uint *)(puVar15 + -100);
              lVar29 = *(long *)(*(long *)(*(long *)(lVar38 + 0x20) + 0xc0) + 8);
              uVar40 = (ulong)*(uint *)(lVar23 + (long)plVar33 * 0x18 + 0x28);
              if ((*(byte *)(lVar29 + 0x135) & 1) == 0) {
                lVar29 = func_0x041cb3c0(lVar29);
              }
              lVar36 = *plVar22;
              uVar39 = (ulong)*(ushort *)(lVar36 + 0x12e);
              if (uVar39 != 0) {
                piVar41 = (int *)(*(long *)(lVar36 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar41 + -2) == lVar29) {
                    puVar28 = (undefined8 *)(lVar36 + (long)*piVar41 * 0x10 + 0x138);
                    goto code_r0x058c568c;
                  }
                  uVar39 = uVar39 - 1;
                  piVar41 = piVar41 + 4;
                } while (uVar39 != 0);
              }
              puVar28 = (undefined8 *)func_0x041cb4c4(plVar22,lVar29,0);
code_r0x058c568c:
              puVar32 = puVar31;
              uVar39 = (*(code *)*puVar28)(plVar22,uVar40,puVar31,puVar28[1]);
              if ((uVar39 & 1) != 0) {
                if ((*(uint *)(puVar15 + -0x7c) & 0xff) == 2) {
                  puVar30 = puVar15 + -0x6c;
                  *(undefined4 *)(puVar15 + -0x6c) = *(undefined4 *)(puVar15 + -100);
code_r0x058c5914:
                  uVar24 = func_0x04151a9c(*(undefined8 *)
                                            (*(long *)(*(long *)(lVar38 + 0x20) + 0xc0) + 0x70),
                                           puVar30);
                  func_0x085dd76c(uVar24,0);
                  return (long *)0x0;
                }
                if ((*(uint *)(puVar15 + -0x7c) & 0xff) != 1) {
                  return (long *)0x0;
                }
                if (*(uint *)(lVar23 + 0x18) <= uVar34) goto code_r0x058c5934;
                plVar33 = (long *)(lVar23 + (long)plVar33 * 0x18 + 0x30);
                *plVar33 = *(long *)(puVar15 + -0x78);
                goto code_r0x0413776c;
              }
              uVar35 = *(uint *)(lVar23 + 0x18);
            }
            if (uVar35 <= uVar34) goto code_r0x058c5934;
            uVar2 = *(uint *)(lVar23 + (long)plVar33 * 0x18 + 0x24);
            uVar40 = (ulong)uVar2;
            if ((int)uVar35 <= (int)plVar26) {
              func_0x085dd870(0);
            }
            uVar24 = *(undefined8 *)(lVar23 + 0x18);
            plVar26 = (long *)(ulong)((int)plVar26 + 1);
            uVar34 = (uint)uVar24;
          } while (uVar2 < uVar34);
          puVar31 = *(uint **)(puVar15 + -0x78);
        }
code_r0x058c5780:
        if (*(int *)(lVar20 + 0x28) < 1) {
          uVar35 = *(uint *)(lVar20 + 0x20);
          plVar33 = (long *)(ulong)uVar35;
          unaff_x25 = puVar31;
          unaff_x29 = plVar26;
          if (uVar35 == uVar34) {
            func_0x058c5cd4(lVar20,*(undefined8 *)
                                    (*(long *)(*(long *)(lVar38 + 0x20) + 0xc0) + 0x198));
            lVar29 = *(long *)(lVar20 + 0x10);
            *(uint *)(lVar20 + 0x20) = uVar35 + 1;
            if (lVar29 == 0) goto code_r0x058c5938;
            uVar34 = *(uint *)(lVar29 + 0x18);
            iVar47 = 0;
            if (uVar34 != 0) {
              iVar47 = (int)uVar17 / (int)uVar34;
            }
            uVar2 = uVar17 - iVar47 * uVar34;
            if (uVar34 <= uVar2) goto code_r0x058c5934;
            lVar23 = *(long *)(lVar20 + 0x18);
            unaff_x28 = (uint *)(lVar29 + (ulong)uVar2 * 4 + 0x20);
          }
          else {
            lVar23 = *(long *)(lVar20 + 0x18);
            *(uint *)(lVar20 + 0x20) = uVar35 + 1;
          }
          if (lVar23 == 0) goto code_r0x058c5938;
          if (*(uint *)(lVar23 + 0x18) <= uVar35) goto code_r0x058c5934;
          lVar38 = (long)(int)uVar35;
        }
        else {
          *(int *)(lVar20 + 0x28) = *(int *)(lVar20 + 0x28) + -1;
          uVar35 = *(uint *)(lVar20 + 0x24);
          plVar33 = (long *)(ulong)uVar35;
          if (*(uint *)(lVar23 + 0x18) <= uVar35) goto code_r0x058c5934;
          lVar38 = (long)(int)uVar35;
          *(undefined4 *)(lVar20 + 0x24) = *(undefined4 *)(lVar23 + lVar38 * 0x18 + 0x24);
        }
        lVar23 = lVar23 + lVar38 * 0x18;
        *(uint *)(lVar23 + 0x20) = uVar17;
        *(uint *)(lVar23 + 0x24) = *unaff_x28 - 1;
        uVar18 = *(undefined4 *)(puVar15 + -100);
        plVar33 = (long *)(lVar23 + 0x30);
        *plVar33 = (long)puVar31;
        *(undefined4 *)(lVar23 + 0x28) = uVar18;
        goto code_r0x0413776c;
      }
    }
    else {
code_r0x058c5934:
      func_0x04151bc0();
      unaff_x25 = puVar31;
      unaff_x29 = plVar26;
    }
code_r0x058c5938:
    lVar29 = func_0x04151bb8();
    unaff_x26 = (long *)PTR_DAT_09eea9a8;
    *(undefined **)(puVar15 + -0xd0) = &UNK_058c593c;
    *(long **)(puVar15 + -200) = unaff_x27;
    *(long *)(puVar15 + -0xc0) = lVar23;
    *(uint **)(puVar15 + -0xb8) = unaff_x25;
    *(ulong *)(puVar15 + -0xb0) = uVar40;
    *(long **)(puVar15 + -0xa8) = plVar22;
    *(long **)(puVar15 + -0xa0) = plVar44;
    *(long *)(puVar15 + -0x98) = lVar38;
    *(long *)(puVar15 + -0x90) = lVar20;
    *(long **)(puVar15 + -0x88) = plVar33;
    uVar39 = 0xa454000;
    if ((bRam000000000a45489c & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eea9d8);
      func_0x0415191c(PTR_DAT_09eea9e0);
      func_0x0415191c(PTR_DAT_09eea9a8);
      func_0x0415191c(PTR_DAT_09eaa090);
      func_0x0415191c(PTR_DAT_09eea9b8);
      func_0x0415191c(PTR_DAT_09eea9c0);
      func_0x0415191c(PTR_DAT_09eea9c8);
      func_0x0415191c(PTR_DAT_09eea9d0);
      bRam000000000a45489c = 1;
    }
    lVar23 = *unaff_x26;
    *(undefined8 *)(puVar15 + -0xd8) = 0;
    if (*(int *)(lVar23 + 0xe0) == 0) {
      func_0x04151a94();
    }
    lVar23 = func_0x08582984(0);
    if (lVar23 != 0) {
      func_0x07e38140(lVar23,lVar29,puVar15 + -0xd8,*(undefined8 *)PTR_DAT_09eea9e0);
      if (*(long *)(puVar15 + -0xd8) == 0) {
        return (long *)0x0;
      }
      uVar19 = func_0x084c4560(*(long *)(puVar15 + -0xd8),*(undefined8 *)PTR_DAT_09eea9d0,0);
      puVar46 = PTR_DAT_09eaa090;
      if (*(long *)(puVar15 + -0xd8) != 0) {
        uVar39 = uVar19 & 0xffffffff;
        uVar40 = func_0x084c4560(*(long *)(puVar15 + -0xd8),*(undefined8 *)PTR_DAT_09eea9b8,0);
        lVar23 = *(long *)puVar46;
        lVar38 = *(long *)(puVar15 + -0xd8);
        plVar44 = (long *)(uVar40 & 0xffffffff);
        uVar40 = *(ulong *)(*(long *)(*(long *)(puVar32 + 8) + 0xc0) + 0x150);
        if (*(int *)(lVar23 + 0xe0) == 0) {
          func_0x04151a94(lVar23);
        }
        uVar24 = func_0x085cae78(uVar40,0);
        plVar22 = (long *)0x0;
        unaff_x27 = (long *)puVar46;
        if (lVar38 != 0) {
          lVar23 = func_0x084c2664(lVar38,*(undefined8 *)PTR_DAT_09eea9c0,uVar24,0);
          lVar38 = *(long *)(*(long *)(*(long *)(puVar32 + 8) + 0xc0) + 8);
          if ((*(byte *)(lVar38 + 0x135) & 1) == 0) {
            lVar38 = func_0x041cb3c0(lVar38);
          }
          if (lVar23 == 0) {
code_r0x058c5af0:
            lVar20 = 0;
          }
          else {
            lVar20 = func_0x04151a98(lVar23,lVar38);
            if (lVar20 == 0) {
              func_0x04151f54(lVar23,lVar38);
              goto code_r0x058c5af0;
            }
          }
          plVar33 = (long *)(lVar29 + 0x30);
          *plVar33 = lVar20;
          lVar38 = *(long *)(*(long *)(*(long *)(puVar32 + 8) + 0xc0) + 8);
          if ((*(byte *)(lVar38 + 0x135) & 1) == 0) {
            lVar38 = func_0x041cb3c0(lVar38);
          }
          if ((lVar23 != 0) && (lVar20 = func_0x04151a98(lVar23,lVar38), lVar20 == 0)) {
            func_0x04151f54(lVar23,lVar38);
          }
          goto code_r0x0413776c;
        }
      }
    }
    func_0x04151bb8();
    func_0x085dd388(0x10,0);
    func_0x04151bb8();
    auVar49 = func_0x04151f54(uVar40,plVar22);
    puVar46 = PTR_DAT_09eea9a8;
    lVar23 = auVar49._0_8_;
    *(undefined **)(puVar15 + -0x110) = &UNK_058c5cd4;
    *(long **)(puVar15 + -0x100) = plVar44;
    *(ulong *)(puVar15 + -0xf8) = uVar39;
    *(uint **)(puVar15 + -0xf0) = puVar32;
    *(long *)(puVar15 + -0xe8) = lVar29;
    if ((bRam000000000a45489d & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eea9a8);
      bRam000000000a45489d = 1;
    }
    uVar18 = *(undefined4 *)(lVar23 + 0x20);
    if (*(int *)(*(long *)puVar46 + 0xe0) == 0) {
      func_0x04151a94();
    }
    uVar17 = func_0x08582900(uVar18,0);
    puVar46 = PTR_DAT_09eac100;
    puVar31 = (uint *)(ulong)uVar17;
    lVar38 = *(long *)(*(long *)(*(long *)(auVar49._8_8_ + 0x20) + 0xc0) + 0x1a8);
    *(undefined8 *)(puVar15 + -0x120) = *(undefined8 *)(puVar15 + -0x110);
    *(ulong *)(puVar15 + -0x110) = uVar40;
    *(long **)(puVar15 + -0x108) = plVar22;
    *(undefined8 *)(puVar15 + -0x100) = *(undefined8 *)(puVar15 + -0x100);
    *(undefined8 *)(puVar15 + -0xf8) = *(undefined8 *)(puVar15 + -0xf8);
    *(undefined8 *)(puVar15 + -0xf0) = *(undefined8 *)(puVar15 + -0xf0);
    *(undefined8 *)(puVar15 + -0xe8) = *(undefined8 *)(puVar15 + -0xe8);
    if ((bRam000000000a45489e & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eac100,puVar31,0);
      bRam000000000a45489e = 1;
    }
    plVar26 = (long *)func_0x04151a04(*(undefined8 *)puVar46,puVar31);
    lVar38 = *(long *)(*(long *)(*(long *)(lVar38 + 0x20) + 0xc0) + 400);
    if ((*(byte *)(lVar38 + 0x135) & 1) == 0) {
      lVar38 = func_0x041cb3c0(lVar38);
    }
    plVar33 = (long *)func_0x04151a04(lVar38,puVar31);
    uVar35 = *(uint *)(lVar23 + 0x20);
    puVar32 = (uint *)(ulong)uVar35;
    unaff_x24 = (long *)0x0;
    plVar22 = plVar33;
    func_0x085dec90(*(undefined8 *)(lVar23 + 0x18),0,plVar33,0,puVar32,0);
    if ((int)uVar35 < 1) {
code_r0x058c5e78:
      plVar33 = (long *)(lVar23 + 0x10);
      *plVar33 = (long)plVar26;
      goto code_r0x0413776c;
    }
    if (plVar33 != (long *)0x0) {
      uVar35 = *(uint *)(plVar33 + 3);
      puVar37 = (uint *)0x0;
      while (puVar37 < (uint *)(ulong)uVar35) {
        iVar47 = (int)plVar33[(long)puVar37 * 3 + 4];
        if (-1 < iVar47) {
          if (plVar26 == (long *)0x0) goto code_r0x058c5eac;
          iVar3 = 0;
          if (uVar17 != 0) {
            iVar3 = iVar47 / (int)uVar17;
          }
          uVar34 = iVar47 - iVar3 * uVar17;
          if (*(uint *)(plVar26 + 3) <= uVar34) break;
          *(int *)((long)plVar33 + (long)puVar37 * 0x18 + 0x24) =
               *(int *)((long)plVar26 + (ulong)uVar34 * 4 + 0x20) + -1;
          *(int *)((long)plVar26 + (ulong)uVar34 * 4 + 0x20) = (int)puVar37 + 1;
        }
        puVar37 = (uint *)((long)puVar37 + 1);
        if (puVar37 == puVar32) goto code_r0x058c5e78;
      }
      func_0x04151bc0();
    }
code_r0x058c5eac:
    auVar48 = func_0x04151bb8();
    lVar38 = auVar48._0_8_;
    *(long **)(puVar15 + -0x180) = unaff_x29;
    *(undefined **)(puVar15 + -0x178) = &UNK_058c5eb0;
    *(uint **)(puVar15 + -0x170) = unaff_x28;
    *(long **)(puVar15 + -0x168) = unaff_x27;
    *(long **)(puVar15 + -0x160) = unaff_x26;
    *(uint **)(puVar15 + -0x158) = unaff_x25;
    *(uint **)(puVar15 + -0x150) = puVar32;
    *(long **)(puVar15 + -0x148) = plVar33;
    *(undefined8 **)(puVar15 + -0x140) = (undefined8 *)(lVar23 + 0x18);
    *(long **)(puVar15 + -0x138) = plVar26;
    *(uint **)(puVar15 + -0x130) = puVar31;
    *(long *)(puVar15 + -0x128) = lVar23;
    *(uint *)(puVar15 + -0x184) = auVar48._8_4_;
    if (*(long *)(lVar38 + 0x10) == 0) {
      return (long *)0x0;
    }
    plVar44 = *(long **)(lVar38 + 0x30);
    if (plVar44 == (long *)0x0) {
      plVar33 = plVar22;
      uVar17 = func_0x085b9e58(puVar15 + -0x184,
                               *(undefined8 *)(*(long *)(plVar22[4] + 0xc0) + 0x170));
    }
    else {
      plVar26 = (long *)(ulong)auVar48._8_4_;
      lVar23 = *(long *)(*(long *)(plVar22[4] + 0xc0) + 8);
      if ((*(byte *)(lVar23 + 0x135) & 1) == 0) {
        lVar23 = func_0x041cb3c0(lVar23);
      }
      lVar20 = *plVar44;
      uVar40 = (ulong)*(ushort *)(lVar20 + 0x12e);
      if (uVar40 != 0) {
        piVar41 = (int *)(*(long *)(lVar20 + 0xb0) + 8);
        do {
          if (*(long *)(piVar41 + -2) == lVar23) {
            puVar28 = (undefined8 *)(lVar20 + (long)(*piVar41 + 1) * 0x10 + 0x138);
            goto code_r0x058c5f70;
          }
          uVar40 = uVar40 - 1;
          piVar41 = piVar41 + 4;
        } while (uVar40 != 0);
      }
      puVar28 = (undefined8 *)func_0x041cb4c4(plVar44,lVar23,1);
code_r0x058c5f70:
      plVar33 = (long *)puVar28[1];
      uVar17 = (*(code *)*puVar28)(plVar44,plVar26);
    }
    lVar23 = *(long *)(lVar38 + 0x10);
    if (lVar23 == 0) {
code_r0x058c61ac:
      func_0x04151bb8();
    }
    else {
      uVar35 = *(uint *)(lVar23 + 0x18);
      uVar17 = uVar17 & 0x7fffffff;
      unaff_x27 = (long *)(ulong)uVar17;
      iVar47 = 0;
      if (uVar35 != 0) {
        iVar47 = (int)uVar17 / (int)uVar35;
      }
      uVar34 = uVar17 - iVar47 * uVar35;
      if (uVar34 < uVar35) {
        uVar35 = *(int *)(lVar23 + (ulong)uVar34 * 4 + 0x20) - 1;
        if ((int)uVar35 < 0) {
          return (long *)0x0;
        }
        plVar27 = (long *)0x0;
        unaff_x29 = (long *)0xffffffff;
        puVar31 = (uint *)0x18;
        *(ulong *)(puVar15 + -0x198) = (ulong)uVar34;
        *(long **)(puVar15 + -400) = plVar22;
        while( true ) {
          puVar32 = (uint *)(ulong)uVar35;
          unaff_x26 = *(long **)(lVar38 + 0x18);
          plVar44 = plVar27;
          if (unaff_x26 == (long *)0x0) break;
          if (*(uint *)(unaff_x26 + 3) <= uVar35) goto code_r0x058c61b0;
          unaff_x25 = (uint *)(unaff_x26 + (ulong)uVar35 * 3 + 4);
          unaff_x28 = puVar32;
          if (*unaff_x25 == uVar17) {
            plVar26 = *(long **)(lVar38 + 0x30);
            if (plVar26 == (long *)0x0) {
              plVar45 = (long *)func_0x0437fd74(*(undefined8 *)(*(long *)(plVar22[4] + 0xc0) + 0x18)
                                               );
              plVar26 = plVar27;
              if (plVar45 == (long *)0x0) break;
              plVar33 = (long *)(ulong)*(uint *)(puVar15 + -0x184);
              unaff_x24 = *(long **)(*plVar45 + 0x1c0);
              uVar40 = (**(code **)(*plVar45 + 0x1b8))
                                 (plVar45,(int)unaff_x26[(long)puVar32 * 3 + 5]);
            }
            else {
              if (plVar26 == (long *)0x0) break;
              uVar34 = *(uint *)(puVar15 + -0x184);
              lVar23 = *(long *)(*(long *)(plVar22[4] + 0xc0) + 8);
              uVar2 = *(uint *)(unaff_x26 + (long)puVar32 * 3 + 5);
              if ((*(byte *)(lVar23 + 0x135) & 1) == 0) {
                lVar23 = func_0x041cb3c0(lVar23);
              }
              lVar20 = *plVar26;
              uVar40 = (ulong)*(ushort *)(lVar20 + 0x12e);
              if (uVar40 != 0) {
                piVar41 = (int *)(*(long *)(lVar20 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar41 + -2) == lVar23) {
                    puVar28 = (undefined8 *)(lVar20 + (long)*piVar41 * 0x10 + 0x138);
                    goto code_r0x058c60b8;
                  }
                  uVar40 = uVar40 - 1;
                  piVar41 = piVar41 + 4;
                } while (uVar40 != 0);
              }
              puVar28 = (undefined8 *)func_0x041cb4c4(plVar26,lVar23,0);
code_r0x058c60b8:
              unaff_x24 = (long *)puVar28[1];
              plVar33 = (long *)(ulong)uVar34;
              uVar40 = (*(code *)*puVar28)(plVar26,(long *)(ulong)uVar2);
              plVar22 = *(long **)(puVar15 + -400);
              plVar27 = plVar26;
              plVar44 = (long *)(ulong)uVar2;
            }
            if ((uVar40 & 1) != 0) {
              plVar26 = plVar27;
              if ((int)(uint)unaff_x29 < 0) {
                lVar23 = *(long *)(lVar38 + 0x10);
                if (lVar23 == 0) break;
                if (*(uint *)(lVar23 + 0x18) <= (uint)*(long *)(puVar15 + -0x198))
                goto code_r0x058c61b0;
                *(int *)(lVar23 + *(long *)(puVar15 + -0x198) * 4 + 0x20) =
                     *(int *)((long)unaff_x26 + (long)puVar32 * 0x18 + 0x24) + 1;
              }
              else {
                lVar23 = *(long *)(lVar38 + 0x18);
                if (lVar23 == 0) break;
                if (*(uint *)(lVar23 + 0x18) <= (uint)unaff_x29) goto code_r0x058c61b0;
                *(undefined4 *)(lVar23 + (long)unaff_x29 * 0x18 + 0x24) =
                     *(undefined4 *)((long)unaff_x26 + (long)puVar32 * 0x18 + 0x24);
              }
              *unaff_x25 = 0xffffffff;
              uVar18 = *(undefined4 *)(lVar38 + 0x24);
              unaff_x26[(long)puVar32 * 3 + 6] = 0;
              *(undefined4 *)((long)unaff_x26 + (long)puVar32 * 0x18 + 0x24) = uVar18;
              *(uint *)(lVar38 + 0x24) = uVar35;
              *(ulong *)(lVar38 + 0x28) =
                   CONCAT44((int)((ulong)*(undefined8 *)(lVar38 + 0x28) >> 0x20) + 1,
                            (int)*(undefined8 *)(lVar38 + 0x28) + 1);
              return (long *)0x1;
            }
          }
          uVar34 = *(uint *)((long)unaff_x26 + (long)puVar32 * 0x18 + 0x24);
          unaff_x29 = (long *)(ulong)uVar35;
          plVar26 = plVar27;
          uVar35 = uVar34;
          if ((int)uVar34 < 0) {
            return (long *)0x0;
          }
        }
        goto code_r0x058c61ac;
      }
    }
code_r0x058c61b0:
    auVar48 = func_0x04151bc0();
    lVar20 = auVar48._0_8_;
    *(long **)(puVar15 + -0x200) = unaff_x29;
    *(undefined **)(puVar15 + -0x1f8) = &UNK_058c61b4;
    *(uint **)(puVar15 + -0x1f0) = unaff_x28;
    *(long **)(puVar15 + -0x1e8) = unaff_x27;
    *(long **)(puVar15 + -0x1e0) = unaff_x26;
    *(uint **)(puVar15 + -0x1d8) = unaff_x25;
    *(uint **)(puVar15 + -0x1d0) = puVar32;
    *(long **)(puVar15 + -0x1c8) = plVar22;
    *(long **)(puVar15 + -0x1c0) = plVar44;
    *(long **)(puVar15 + -0x1b8) = plVar26;
    *(uint **)(puVar15 + -0x1b0) = puVar31;
    *(long *)(puVar15 + -0x1a8) = lVar38;
    *(uint *)(puVar15 + -0x204) = auVar48._8_4_;
    lVar23 = *(long *)(lVar20 + 0x10);
    *(long **)(puVar15 + -0x218) = plVar33;
    if (lVar23 == 0) {
code_r0x058c63f8:
      **(undefined8 **)(puVar15 + -0x218) = 0;
      return (long *)0x0;
    }
    plVar22 = *(long **)(lVar20 + 0x30);
    plVar27 = unaff_x24;
    if (plVar22 == (long *)0x0) {
      uVar17 = func_0x085b9e58(puVar15 + -0x204,
                               *(undefined8 *)(*(long *)(unaff_x24[4] + 0xc0) + 0x170));
    }
    else {
      plVar44 = (long *)(ulong)auVar48._8_4_;
      lVar23 = *(long *)(*(long *)(unaff_x24[4] + 0xc0) + 8);
      if ((*(byte *)(lVar23 + 0x135) & 1) == 0) {
        lVar23 = func_0x041cb3c0(lVar23);
      }
      lVar38 = *plVar22;
      uVar40 = (ulong)*(ushort *)(lVar38 + 0x12e);
      if (uVar40 != 0) {
        piVar41 = (int *)(*(long *)(lVar38 + 0xb0) + 8);
        do {
          if (*(long *)(piVar41 + -2) == lVar23) {
            puVar28 = (undefined8 *)(lVar38 + (long)(*piVar41 + 1) * 0x10 + 0x138);
            goto code_r0x058c6278;
          }
          uVar40 = uVar40 - 1;
          piVar41 = piVar41 + 4;
        } while (uVar40 != 0);
      }
      puVar28 = (undefined8 *)func_0x041cb4c4(plVar22,lVar23,1);
code_r0x058c6278:
      plVar33 = (long *)puVar28[1];
      uVar17 = (*(code *)*puVar28)(plVar22,plVar44);
    }
    lVar23 = *(long *)(lVar20 + 0x10);
    if (lVar23 == 0) {
code_r0x058c64d0:
      func_0x04151bb8();
    }
    else {
      uVar35 = *(uint *)(lVar23 + 0x18);
      uVar17 = uVar17 & 0x7fffffff;
      unaff_x29 = (long *)(ulong)uVar17;
      iVar47 = 0;
      if (uVar35 != 0) {
        iVar47 = (int)uVar17 / (int)uVar35;
      }
      uVar34 = uVar17 - iVar47 * uVar35;
      if (uVar34 < uVar35) {
        iVar47 = *(int *)(lVar23 + (ulong)uVar34 * 4 + 0x20);
        *(ulong *)(puVar15 + -0x220) = (ulong)uVar34;
        uVar35 = iVar47 - 1;
        if ((int)uVar35 < 0) goto code_r0x058c63f8;
        plVar45 = (long *)0x0;
        unaff_x26 = (long *)0xffffffff;
        plVar26 = (long *)0x18;
        *(long **)(puVar15 + -0x210) = unaff_x24;
        while( true ) {
          unaff_x25 = (uint *)(ulong)uVar35;
          unaff_x27 = *(long **)(lVar20 + 0x18);
          plVar22 = plVar45;
          if (unaff_x27 == (long *)0x0) break;
          if (*(uint *)(unaff_x27 + 3) <= uVar35) goto code_r0x058c64d4;
          unaff_x28 = (uint *)(unaff_x27 + (ulong)uVar35 * 3 + 4);
          puVar31 = unaff_x25;
          if (*unaff_x28 == uVar17) {
            plVar44 = *(long **)(lVar20 + 0x30);
            if (plVar44 == (long *)0x0) {
              plVar21 = (long *)func_0x0437fd74(*(undefined8 *)
                                                 (*(long *)(unaff_x24[4] + 0xc0) + 0x18));
              plVar44 = plVar45;
              if (plVar21 == (long *)0x0) break;
              plVar33 = (long *)(ulong)*(uint *)(puVar15 + -0x204);
              plVar27 = *(long **)(*plVar21 + 0x1c0);
              uVar40 = (**(code **)(*plVar21 + 0x1b8))
                                 (plVar21,(int)unaff_x27[(long)unaff_x25 * 3 + 5]);
            }
            else {
              if (plVar44 == (long *)0x0) break;
              uVar34 = *(uint *)(puVar15 + -0x204);
              lVar23 = *(long *)(*(long *)(unaff_x24[4] + 0xc0) + 8);
              uVar2 = *(uint *)(unaff_x27 + (long)unaff_x25 * 3 + 5);
              if ((*(byte *)(lVar23 + 0x135) & 1) == 0) {
                lVar23 = func_0x041cb3c0(lVar23);
              }
              lVar38 = *plVar44;
              uVar40 = (ulong)*(ushort *)(lVar38 + 0x12e);
              if (uVar40 != 0) {
                piVar41 = (int *)(*(long *)(lVar38 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar41 + -2) == lVar23) {
                    puVar28 = (undefined8 *)(lVar38 + (long)*piVar41 * 0x10 + 0x138);
                    goto code_r0x058c63c4;
                  }
                  uVar40 = uVar40 - 1;
                  piVar41 = piVar41 + 4;
                } while (uVar40 != 0);
              }
              puVar28 = (undefined8 *)func_0x041cb4c4(plVar44,lVar23,0);
code_r0x058c63c4:
              plVar27 = (long *)puVar28[1];
              plVar33 = (long *)(ulong)uVar34;
              uVar40 = (*(code *)*puVar28)(plVar44,(long *)(ulong)uVar2);
              unaff_x24 = *(long **)(puVar15 + -0x210);
              plVar45 = plVar44;
              plVar22 = (long *)(ulong)uVar2;
            }
            if ((uVar40 & 1) != 0) {
              plVar44 = plVar45;
              if ((int)(uint)unaff_x26 < 0) {
                lVar23 = *(long *)(lVar20 + 0x10);
                if (lVar23 == 0) break;
                if (*(uint *)(lVar23 + 0x18) <= (uint)*(long *)(puVar15 + -0x220))
                goto code_r0x058c64d4;
                *(int *)(lVar23 + *(long *)(puVar15 + -0x220) * 4 + 0x20) =
                     *(int *)((long)unaff_x27 + (long)unaff_x25 * 0x18 + 0x24) + 1;
              }
              else {
                lVar23 = *(long *)(lVar20 + 0x18);
                if (lVar23 == 0) break;
                if (*(uint *)(lVar23 + 0x18) <= (uint)unaff_x26) goto code_r0x058c64d4;
                *(undefined4 *)(lVar23 + (long)unaff_x26 * 0x18 + 0x24) =
                     *(undefined4 *)((long)unaff_x27 + (long)unaff_x25 * 0x18 + 0x24);
              }
              plVar33 = *(long **)(puVar15 + -0x218);
              *plVar33 = unaff_x27[(long)unaff_x25 * 3 + 6];
              goto code_r0x0413776c;
            }
          }
          uVar34 = *(uint *)((long)unaff_x27 + (long)unaff_x25 * 0x18 + 0x24);
          unaff_x26 = (long *)(ulong)uVar35;
          plVar44 = plVar45;
          uVar35 = uVar34;
          if ((int)uVar34 < 0) goto code_r0x058c63f8;
        }
        goto code_r0x058c64d0;
      }
    }
code_r0x058c64d4:
    lVar23 = func_0x04151bc0();
    *(undefined **)(puVar15 + -0x240) = &UNK_058c64d8;
    *(long **)(puVar15 + -0x238) = plVar26;
    *(uint **)(puVar15 + -0x230) = puVar31;
    *(long *)(puVar15 + -0x228) = lVar20;
    puVar31 = *(uint **)(*(long *)(plVar27[4] + 0xc0) + 0xf0);
    uVar17 = func_0x058c50f0();
    uVar40 = (ulong)uVar17;
    if ((int)uVar17 < 0) {
      *plVar33 = 0;
      return (long *)(ulong)(~uVar17 >> 0x1f);
    }
    lVar38 = *(long *)(lVar23 + 0x18);
    if (lVar38 == 0) {
      func_0x04151bb8();
    }
    else if (uVar17 < *(uint *)(lVar38 + 0x18)) {
      *plVar33 = *(long *)(lVar38 + uVar40 * 0x18 + 0x30);
code_r0x0413776c:
      if (iRam000000000a680cb0 != 0) {
        puVar1 = (ulong *)(((ulong)plVar33 >> 0x12 & 0x7fff) * 8 + 0xa4b4c88);
        do {
          cVar4 = '\x01';
          bVar5 = (bool)ExclusiveMonitorPass(puVar1,0x10);
          if (bVar5) {
            *puVar1 = *puVar1 | 1L << ((ulong)plVar33 >> 0xc & 0x3f);
            cVar4 = ExclusiveMonitorsStatus();
          }
        } while (cVar4 != '\0');
      }
      return plVar33;
    }
    puVar46 = &UNK_058c6550;
    auVar49 = func_0x04151bc0();
    plVar26 = (long *)0x0;
    lVar38 = *(long *)(*(long *)(plVar27[4] + 0xc0) + 0xf8);
    puVar15 = puVar15 + -0x240;
  } while( true );
}


```

## HuntDataStore.CalculateSkillTotalPower (off 0x916c87c)

```c

/* WARNING: Possible PIC construction at 0x09270c04: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09270c4c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09270c68: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09270c88: Changing call to branch */
/* WARNING: Possible PIC construction at 0x09270d2c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c5858: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c5b48: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c5c38: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c5e84: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c649c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c6528: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c5c5c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x058c58f0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x058c652c) */
/* WARNING: Removing unreachable block (ram,0x058c64a0) */
/* WARNING: Removing unreachable block (ram,0x058c5e88) */
/* WARNING: Removing unreachable block (ram,0x058c5c3c) */
/* WARNING: Removing unreachable block (ram,0x058c5c4c) */
/* WARNING: Removing unreachable block (ram,0x058c5b4c) */
/* WARNING: Removing unreachable block (ram,0x058c5c50) */
/* WARNING: Removing unreachable block (ram,0x058c5b50) */
/* WARNING: Removing unreachable block (ram,0x058c5b84) */
/* WARNING: Removing unreachable block (ram,0x058c5b88) */
/* WARNING: Removing unreachable block (ram,0x058c5b98) */
/* WARNING: Removing unreachable block (ram,0x058c5bcc) */
/* WARNING: Removing unreachable block (ram,0x058c5bd8) */
/* WARNING: Removing unreachable block (ram,0x058c5bdc) */
/* WARNING: Removing unreachable block (ram,0x058c5bec) */
/* WARNING: Removing unreachable block (ram,0x058c5c60) */
/* WARNING: Removing unreachable block (ram,0x058c5c70) */
/* WARNING: Removing unreachable block (ram,0x058c5c74) */
/* WARNING: Removing unreachable block (ram,0x058c5c80) */
/* WARNING: Removing unreachable block (ram,0x058c5bfc) */
/* WARNING: Removing unreachable block (ram,0x058c5c04) */
/* WARNING: Removing unreachable block (ram,0x058c5cb0) */
/* WARNING: Removing unreachable block (ram,0x058c5c10) */
/* WARNING: Removing unreachable block (ram,0x058c585c) */
/* WARNING: Removing unreachable block (ram,0x09270d30) */
/* WARNING: Removing unreachable block (ram,0x09270c8c) */
/* WARNING: Removing unreachable block (ram,0x09270c90) */
/* WARNING: Removing unreachable block (ram,0x09270cbc) */
/* WARNING: Removing unreachable block (ram,0x09270cc4) */
/* WARNING: Removing unreachable block (ram,0x09270cf0) */
/* WARNING: Removing unreachable block (ram,0x09270cd0) */
/* WARNING: Removing unreachable block (ram,0x09270cdc) */
/* WARNING: Removing unreachable block (ram,0x09270d00) */
/* WARNING: Removing unreachable block (ram,0x09270c6c) */
/* WARNING: Removing unreachable block (ram,0x09270c70) */
/* WARNING: Removing unreachable block (ram,0x09270c80) */
/* WARNING: Removing unreachable block (ram,0x09270c50) */
/* WARNING: Removing unreachable block (ram,0x09270c60) */
/* WARNING: Removing unreachable block (ram,0x09270c08) */
/* WARNING: Removing unreachable block (ram,0x09270c0c) */
/* WARNING: Removing unreachable block (ram,0x09270c24) */
/* WARNING: Removing unreachable block (ram,0x09270c28) */
/* WARNING: Removing unreachable block (ram,0x09270c44) */
/* WARNING: Removing unreachable block (ram,0x058c58f4) */
/* WARNING: Removing unreachable block (ram,0x058c5864) */

long * FUN_0927087c(long *param_1,ulong param_2,undefined8 param_3,long param_4)

{
  ulong *puVar1;
  uint uVar2;
  int iVar3;
  char cVar4;
  bool bVar5;
  long **pplVar6;
  uint uVar7;
  undefined4 uVar8;
  ulong uVar9;
  long *plVar10;
  undefined8 uVar11;
  long lVar12;
  long *plVar13;
  undefined8 *puVar14;
  long lVar15;
  undefined1 *puVar16;
  uint *puVar17;
  uint *puVar18;
  long *plVar19;
  uint uVar20;
  uint uVar21;
  long lVar22;
  long lVar23;
  undefined8 uVar24;
  uint *puVar25;
  long lVar26;
  ulong uVar27;
  ulong uVar28;
  int *piVar29;
  long *unaff_x21;
  long *plVar30;
  long *unaff_x22;
  long *plVar31;
  long *plVar32;
  long *unaff_x24;
  uint *unaff_x25;
  long *unaff_x26;
  long *unaff_x27;
  uint *unaff_x28;
  long *unaff_x29;
  undefined *puVar33;
  int iVar34;
  undefined1 auVar35 [12];
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  long *plStack_d0;
  undefined8 uStack_c8;
  undefined *puStack_c0;
  long *plStack_b0;
  undefined8 uStack_a8;
  long *plStack_a0;
  long *plStack_98;
  undefined8 uStack_90;
  long *plStack_88;
  long *plStack_80;
  long *plStack_78;
  
  plVar32 = (long *)(param_2 & 0xffffffff);
  if ((bRam000000000a469f36 & 1) == 0) {
    func_0x0415191c(PTR_WithNetwork_AttackValue_TypeInfo_09eceb98);
    func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
    func_0x0415191c(PTR_DAT_09ecebb0);
    func_0x0415191c(PTR_WithNetwork_CriticalDamageValue_TypeInfo_09ecebb8);
    func_0x0415191c(PTR_WithNetwork_CriticalRateValue_TypeInfo_09ecebc8);
    func_0x0415191c(PTR_DAT_09ecec40);
    func_0x0415191c(PTR_DAT_09ecebe0);
    func_0x0415191c(PTR_DAT_09ecebf0);
    func_0x0415191c(PTR_DAT_09ecebf8);
    func_0x0415191c(PTR_DAT_09ecec08);
    func_0x0415191c(PTR_DAT_09f4b500);
    func_0x0415191c(
                   PTR_Method_WithNetwork_WithDataStoreBase_GetTableRow_u003CHuntStatusConfigRecord_u003E___09f4b4f8
                   );
    bRam000000000a469f36 = 1;
  }
  uVar24 = 0xa469000;
  if (param_1[0x13] != 0) {
    uVar11 = func_0x092655b0(param_1[0x13],1);
    if (param_1[0x13] != 0) {
      unaff_x26 = (long *)func_0x092655b0(param_1[0x13],5);
      if (unaff_x26 == (long *)0x0) {
        unaff_x26 = (long *)0x0;
      }
      else if (*unaff_x26 != *(long *)PTR_WithNetwork_CriticalRateValue_TypeInfo_09ecebc8) {
        unaff_x26 = (long *)0x0;
      }
      uVar24 = uVar11;
      if (param_1[0x13] != 0) {
        unaff_x27 = (long *)func_0x092655b0(param_1[0x13],6);
        if (unaff_x27 == (long *)0x0) {
          unaff_x27 = (long *)0x0;
        }
        else if (*unaff_x27 != *(long *)PTR_WithNetwork_CriticalDamageValue_TypeInfo_09ecebb8) {
          unaff_x27 = (long *)0x0;
        }
        auVar36 = func_0x0926e088(param_1,plVar32);
        plVar13 = auVar36._8_8_;
        unaff_x22 = auVar36._0_8_;
        if (param_1[0x13] != 0) {
          unaff_x28 = (uint *)func_0x092655b0(param_1[0x13],0x14);
          if (unaff_x28 == (uint *)0x0) {
            unaff_x28 = (uint *)0x0;
          }
          else if (*(long *)unaff_x28 != *(long *)PTR_DAT_09ecebf8) {
            unaff_x28 = (uint *)0x0;
          }
          unaff_x24 = plVar13;
          if (param_1[0x13] != 0) {
            unaff_x29 = (long *)func_0x092655b0(param_1[0x13],0x18);
            if (unaff_x29 == (long *)0x0) {
              unaff_x29 = (long *)0x0;
            }
            else if (*unaff_x29 != *(long *)PTR_DAT_09ecec08) {
              unaff_x29 = (long *)0x0;
            }
            if (param_1[0x13] != 0) {
              unaff_x21 = (long *)func_0x092655b0(param_1[0x13],0xb);
              if (unaff_x21 == (long *)0x0) {
                unaff_x21 = (long *)0x0;
              }
              else if (*unaff_x21 != *(long *)PTR_DAT_09ecebb0) {
                unaff_x21 = (long *)0x0;
              }
              if (param_1[0x13] != 0) {
                plStack_78 = unaff_x22;
                unaff_x22 = (long *)func_0x092655b0(param_1[0x13],0xc);
                puVar33 = 
                PTR_Method_WithNetwork_WithDataStoreBase_GetTableRow_u003CHuntStatusConfigRecord_u003E___09f4b4f8
                ;
                if (unaff_x22 == (long *)0x0) {
                  unaff_x22 = (long *)0x0;
                }
                else if (*unaff_x22 != *(long *)PTR_DAT_09ecebe0) {
                  unaff_x22 = (long *)0x0;
                }
                plStack_80 = plVar13;
                if (param_1[0x13] != 0) {
                  unaff_x24 = (long *)func_0x092655b0(param_1[0x13],0x15);
                  lVar12 = func_0x05696bb0(param_1,0x66,*(undefined8 *)puVar33);
                  if (lVar12 != 0) {
                    func_0x085cf0c8(*(undefined8 *)(lVar12 + 0x28),0);
                    plVar13 = (long *)(**(code **)(*param_1 + 0x3c8))
                                                (param_1,plVar32,*(undefined8 *)(*param_1 + 0x3d0));
                    puVar33 = PTR_DAT_09f4b500;
                    if (plVar13 != (long *)0x0) {
                      lVar12 = *plVar13;
                      uVar28 = (ulong)*(ushort *)(lVar12 + 0x12e);
                      if (uVar28 != 0) {
                        piVar29 = (int *)(*(long *)(lVar12 + 0xb0) + 8);
                        do {
                          if (*(long *)(piVar29 + -2) == *(long *)PTR_DAT_09ecec40) {
                            puVar14 = (undefined8 *)
                                      (lVar12 + (long)(*piVar29 + 0x13) * 0x10 + 0x138);
                            goto code_r0x09270b74;
                          }
                          uVar28 = uVar28 - 1;
                          piVar29 = piVar29 + 4;
                        } while (uVar28 != 0);
                      }
                      puVar14 = (undefined8 *)
                                func_0x041cb4c4(plVar13,*(long *)PTR_DAT_09ecec40,0x13);
code_r0x09270b74:
                      uVar8 = (*(code *)*puVar14)(plVar13,puVar14[1]);
                      lVar12 = func_0x05696bb0(param_1,uVar8,*(undefined8 *)puVar33);
                      plVar32 = plVar13;
                      unaff_x25 = (uint *)puVar33;
                      if (((lVar12 != 0) && (unaff_x24 != (long *)0x0)) &&
                         (*unaff_x24 == *(long *)PTR_DAT_09ecebf0)) {
                        iVar34 = *(int *)(lVar12 + 0x38);
                        lVar12 = unaff_x24[2];
                        lVar22 = unaff_x24[3];
                        if (*(int *)(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88 + 0xe0)
                            == 0) {
                          func_0x04151a94(*(long *)PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
                        }
                        auVar36 = func_0x09774ab0((double)((float)iVar34 / 1000.0),0);
                        puVar33 = PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88;
                        puStack_c0 = &UNK_09270c08;
                        plStack_b0 = unaff_x24;
                        uStack_a8 = plVar13;
                        plStack_a0 = unaff_x22;
                        plStack_98 = unaff_x21;
                        uStack_90 = uVar11;
                        plStack_88 = (long *)lVar22;
                        if ((bRam000000000a46d943 & 1) == 0) {
                          func_0x0415191c(PTR_Applibot_Math_BigDecimal_TypeInfo_09eb6d88);
                          bRam000000000a46d943 = 1;
                        }
                        if (*(int *)(*(long *)puVar33 + 0xe0) == 0) {
                          func_0x04151a94();
                        }
                        if (lVar12 == 0 || auVar36._0_8_ == 0) {
                          plStack_d0 = (long *)**(undefined8 **)(*(long *)puVar33 + 0xb8);
                        }
                        else {
                          auVar37 = func_0x097751b4(lVar12);
                          auVar38 = func_0x097751b4(auVar36._0_8_);
                          lVar26 = *(long *)(*(long *)(*(long *)puVar33 + 0xb8) + 0x40);
                          plStack_d0 = (long *)0x0;
                          uStack_c8 = 0;
                          lVar12 = 0;
                          if (lVar26 != 0) {
                            lVar12 = (auVar38._8_8_ * auVar37._8_8_) / lVar26;
                          }
                          lVar15 = 0;
                          if (lVar26 != 0) {
                            lVar15 = (auVar38._8_8_ * auVar37._0_8_ + auVar38._0_8_ * auVar37._8_8_
                                     + lVar12) / lVar26;
                          }
                          func_0x09773f14(&plStack_d0,lVar15 + auVar38._0_8_ * auVar37._0_8_,
                                          lVar22 + auVar36._8_8_ + 0xc);
                        }
                        return plStack_d0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  auVar36 = func_0x04151bb8();
  plStack_a0 = (long *)&UNK_09270d90;
  uVar28 = auVar36._8_8_ & 0xffffffff;
  plStack_98 = unaff_x21;
  uStack_90 = uVar24;
  plStack_88 = param_1;
  if ((bRam000000000a469f43 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09f4b508);
    bRam000000000a469f43 = 1;
  }
  lVar12 = *(long *)(auVar36._0_8_ + 0xb8);
  if (lVar12 == 0) {
    lVar12 = func_0x04151bb8();
    return *(long **)(lVar12 + 0xe0);
  }
  plVar13 = *(long **)PTR_DAT_09f4b508;
  puVar17 = *(uint **)(*(long *)(plVar13[4] + 0xc0) + 0xf0);
  uVar7 = func_0x058c50f0();
  if ((int)uVar7 < 0) {
    uStack_a8 = (long *)CONCAT44(auVar36._8_4_,(undefined4)uStack_a8);
    uVar24 = func_0x04151a9c(*(undefined8 *)(*(long *)(plVar13[4] + 0xc0) + 0x70),
                             (long)&uStack_a8 + 4);
    func_0x085dd808(uVar24,0);
    return (long *)0x0;
  }
  lVar22 = *(long *)(lVar12 + 0x18);
  if (lVar22 == 0) {
    func_0x04151bb8();
  }
  else if (uVar7 < *(uint *)(lVar22 + 0x18)) {
    return *(long **)(lVar22 + (ulong)uVar7 * 0x18 + 0x30);
  }
  puVar33 = &UNK_058c4a14;
  auVar36 = func_0x04151bc0();
  plVar19 = (long *)0x1;
  lVar22 = *(long *)(*(long *)(*(long *)(param_4 + 0x20) + 0xc0) + 0xf8);
  pplVar6 = &plStack_b0;
  do {
    lVar26 = auVar36._0_8_;
    *(long **)((long)pplVar6 + -0x60) = unaff_x29;
    *(undefined **)((long)pplVar6 + -0x58) = puVar33;
    *(uint **)((long)pplVar6 + -0x50) = unaff_x28;
    *(long **)((long)pplVar6 + -0x48) = unaff_x27;
    *(long **)((long)pplVar6 + -0x40) = unaff_x26;
    *(uint **)((long)pplVar6 + -0x38) = unaff_x25;
    *(long **)((long)pplVar6 + -0x30) = unaff_x24;
    *(long **)((long)pplVar6 + -0x28) = plVar32;
    *(long **)((long)pplVar6 + -0x20) = unaff_x22;
    *(long *)((long)pplVar6 + -0x18) = lVar12;
    *(ulong *)((long)pplVar6 + -0x10) = uVar28;
    *(long **)((long)pplVar6 + -8) = plVar13;
    *(int *)((long)pplVar6 + -100) = auVar36._8_4_;
    uVar28 = auVar36._8_8_ & 0xffffffff;
    *(int *)(lVar26 + 0x2c) = *(int *)(lVar26 + 0x2c) + 1;
    puVar18 = puVar17;
    if (*(long *)(lVar26 + 0x10) == 0) {
      puVar18 = *(uint **)(*(long *)(*(long *)(lVar22 + 0x20) + 0xc0) + 0x10);
      func_0x058c53cc(lVar26,0);
    }
    plVar32 = *(long **)(lVar26 + 0x30);
    lVar12 = *(long *)(lVar26 + 0x18);
    if (plVar32 == (long *)0x0) {
      uVar7 = func_0x085b9e58((undefined1 *)((long)pplVar6 + -100),
                              *(undefined8 *)(*(long *)(*(long *)(lVar22 + 0x20) + 0xc0) + 0x170));
    }
    else {
      lVar15 = *(long *)(*(long *)(*(long *)(lVar22 + 0x20) + 0xc0) + 8);
      if ((*(byte *)(lVar15 + 0x135) & 1) == 0) {
        lVar15 = func_0x041cb3c0(lVar15);
      }
      lVar23 = *plVar32;
      uVar27 = (ulong)*(ushort *)(lVar23 + 0x12e);
      if (uVar27 != 0) {
        piVar29 = (int *)(*(long *)(lVar23 + 0xb0) + 8);
        do {
          if (*(long *)(piVar29 + -2) == lVar15) {
            puVar14 = (undefined8 *)(lVar23 + (long)(*piVar29 + 1) * 0x10 + 0x138);
            goto code_r0x058c559c;
          }
          uVar27 = uVar27 - 1;
          piVar29 = piVar29 + 4;
        } while (uVar27 != 0);
      }
      puVar14 = (undefined8 *)func_0x041cb4c4(plVar32,lVar15,1);
code_r0x058c559c:
      puVar18 = (uint *)puVar14[1];
      uVar7 = (*(code *)*puVar14)(plVar32,uVar28);
    }
    lVar15 = *(long *)(lVar26 + 0x10);
    unaff_x25 = puVar17;
    unaff_x29 = plVar19;
    if (lVar15 == 0) goto code_r0x058c5938;
    uVar21 = *(uint *)(lVar15 + 0x18);
    uVar7 = uVar7 & 0x7fffffff;
    unaff_x27 = (long *)(ulong)uVar7;
    iVar34 = 0;
    if (uVar21 != 0) {
      iVar34 = (int)uVar7 / (int)uVar21;
    }
    uVar20 = uVar7 - iVar34 * uVar21;
    if (uVar20 < uVar21) {
      unaff_x28 = (uint *)(lVar15 + (ulong)uVar20 * 4 + 0x20);
      uVar21 = *unaff_x28 - 1;
      uVar28 = (ulong)uVar21;
      iVar34 = (int)plVar19;
      if (plVar32 == (long *)0x0) {
        if (lVar12 != 0) {
          uVar24 = *(undefined8 *)(lVar12 + 0x18);
          uVar20 = (uint)uVar24;
          if (uVar21 < uVar20) {
            plVar13 = (long *)0x0;
            unaff_x22 = (long *)0x18;
            do {
              uVar21 = (uint)uVar24;
              uVar20 = (uint)uVar28;
              plVar32 = (long *)(long)(int)uVar20;
              if (*(uint *)(lVar12 + (long)(int)uVar20 * 0x18 + 0x20) == uVar7) {
                plVar30 = (long *)func_0x0437fd74(*(undefined8 *)
                                                   (*(long *)(*(long *)(lVar22 + 0x20) + 0xc0) +
                                                   0x18));
                if (*(uint *)(lVar12 + 0x18) <= uVar20) goto code_r0x058c5934;
                if (plVar30 == (long *)0x0) goto code_r0x058c5938;
                puVar18 = (uint *)(ulong)*(uint *)((long)pplVar6 + -100);
                uVar27 = (**(code **)(*plVar30 + 0x1b8))
                                   (plVar30,*(undefined4 *)(lVar12 + (long)plVar32 * 0x18 + 0x28),
                                    puVar18,*(undefined8 *)(*plVar30 + 0x1c0));
                if ((uVar27 & 1) != 0) {
                  if (iVar34 == 2) {
                    puVar16 = (undefined1 *)((long)pplVar6 + -0x68);
                    *(undefined4 *)((long)pplVar6 + -0x68) = *(undefined4 *)((long)pplVar6 + -100);
                    goto code_r0x058c5914;
                  }
                  if (iVar34 != 1) {
                    return (long *)0x0;
                  }
                  if (*(uint *)(lVar12 + 0x18) <= uVar20) goto code_r0x058c5934;
                  plVar13 = (long *)(lVar12 + (long)plVar32 * 0x18 + 0x30);
                  *plVar13 = (long)puVar17;
                  goto code_r0x0413776c;
                }
                uVar21 = *(uint *)(lVar12 + 0x18);
              }
              if (uVar21 <= uVar20) goto code_r0x058c5934;
              uVar2 = *(uint *)(lVar12 + (long)plVar32 * 0x18 + 0x24);
              uVar28 = (ulong)uVar2;
              if ((int)uVar21 <= (int)plVar13) {
                func_0x085dd870(0);
              }
              uVar24 = *(undefined8 *)(lVar12 + 0x18);
              plVar13 = (long *)(ulong)((int)plVar13 + 1);
              uVar20 = (uint)uVar24;
            } while (uVar2 < uVar20);
          }
          goto code_r0x058c5780;
        }
      }
      else if (lVar12 != 0) {
        uVar24 = *(undefined8 *)(lVar12 + 0x18);
        uVar20 = (uint)uVar24;
        if (uVar21 < uVar20) {
          *(int *)((long)pplVar6 + -0x7c) = iVar34;
          plVar19 = (long *)0x0;
          unaff_x22 = (long *)0x18;
          *(uint **)((long)pplVar6 + -0x78) = puVar17;
          do {
            uVar21 = (uint)uVar24;
            uVar20 = (uint)uVar28;
            plVar13 = (long *)(long)(int)uVar20;
            if (*(uint *)(lVar12 + (long)(int)uVar20 * 0x18 + 0x20) == uVar7) {
              puVar17 = (uint *)(ulong)*(uint *)((long)pplVar6 + -100);
              lVar15 = *(long *)(*(long *)(*(long *)(lVar22 + 0x20) + 0xc0) + 8);
              uVar28 = (ulong)*(uint *)(lVar12 + (long)plVar13 * 0x18 + 0x28);
              if ((*(byte *)(lVar15 + 0x135) & 1) == 0) {
                lVar15 = func_0x041cb3c0(lVar15);
              }
              lVar23 = *plVar32;
              uVar27 = (ulong)*(ushort *)(lVar23 + 0x12e);
              if (uVar27 != 0) {
                piVar29 = (int *)(*(long *)(lVar23 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar29 + -2) == lVar15) {
                    puVar14 = (undefined8 *)(lVar23 + (long)*piVar29 * 0x10 + 0x138);
                    goto code_r0x058c568c;
                  }
                  uVar27 = uVar27 - 1;
                  piVar29 = piVar29 + 4;
                } while (uVar27 != 0);
              }
              puVar14 = (undefined8 *)func_0x041cb4c4(plVar32,lVar15,0);
code_r0x058c568c:
              puVar18 = puVar17;
              uVar27 = (*(code *)*puVar14)(plVar32,uVar28,puVar17,puVar14[1]);
              if ((uVar27 & 1) != 0) {
                if ((*(uint *)((long)pplVar6 + -0x7c) & 0xff) == 2) {
                  puVar16 = (undefined1 *)((long)pplVar6 + -0x6c);
                  *(undefined4 *)((long)pplVar6 + -0x6c) = *(undefined4 *)((long)pplVar6 + -100);
code_r0x058c5914:
                  uVar24 = func_0x04151a9c(*(undefined8 *)
                                            (*(long *)(*(long *)(lVar22 + 0x20) + 0xc0) + 0x70),
                                           puVar16);
                  func_0x085dd76c(uVar24,0);
                  return (long *)0x0;
                }
                if ((*(uint *)((long)pplVar6 + -0x7c) & 0xff) != 1) {
                  return (long *)0x0;
                }
                if (*(uint *)(lVar12 + 0x18) <= uVar20) goto code_r0x058c5934;
                plVar13 = (long *)(lVar12 + (long)plVar13 * 0x18 + 0x30);
                *plVar13 = *(long *)((long)pplVar6 + -0x78);
                goto code_r0x0413776c;
              }
              uVar21 = *(uint *)(lVar12 + 0x18);
            }
            if (uVar21 <= uVar20) goto code_r0x058c5934;
            uVar2 = *(uint *)(lVar12 + (long)plVar13 * 0x18 + 0x24);
            uVar28 = (ulong)uVar2;
            if ((int)uVar21 <= (int)plVar19) {
              func_0x085dd870(0);
            }
            uVar24 = *(undefined8 *)(lVar12 + 0x18);
            plVar19 = (long *)(ulong)((int)plVar19 + 1);
            uVar20 = (uint)uVar24;
          } while (uVar2 < uVar20);
          puVar17 = *(uint **)((long)pplVar6 + -0x78);
        }
code_r0x058c5780:
        if (*(int *)(lVar26 + 0x28) < 1) {
          uVar21 = *(uint *)(lVar26 + 0x20);
          plVar13 = (long *)(ulong)uVar21;
          unaff_x25 = puVar17;
          unaff_x29 = plVar19;
          if (uVar21 == uVar20) {
            func_0x058c5cd4(lVar26,*(undefined8 *)
                                    (*(long *)(*(long *)(lVar22 + 0x20) + 0xc0) + 0x198));
            lVar15 = *(long *)(lVar26 + 0x10);
            *(uint *)(lVar26 + 0x20) = uVar21 + 1;
            if (lVar15 == 0) goto code_r0x058c5938;
            uVar20 = *(uint *)(lVar15 + 0x18);
            iVar34 = 0;
            if (uVar20 != 0) {
              iVar34 = (int)uVar7 / (int)uVar20;
            }
            uVar2 = uVar7 - iVar34 * uVar20;
            if (uVar20 <= uVar2) goto code_r0x058c5934;
            lVar12 = *(long *)(lVar26 + 0x18);
            unaff_x28 = (uint *)(lVar15 + (ulong)uVar2 * 4 + 0x20);
          }
          else {
            lVar12 = *(long *)(lVar26 + 0x18);
            *(uint *)(lVar26 + 0x20) = uVar21 + 1;
          }
          if (lVar12 == 0) goto code_r0x058c5938;
          if (*(uint *)(lVar12 + 0x18) <= uVar21) goto code_r0x058c5934;
          lVar22 = (long)(int)uVar21;
        }
        else {
          *(int *)(lVar26 + 0x28) = *(int *)(lVar26 + 0x28) + -1;
          uVar21 = *(uint *)(lVar26 + 0x24);
          plVar13 = (long *)(ulong)uVar21;
          if (*(uint *)(lVar12 + 0x18) <= uVar21) goto code_r0x058c5934;
          lVar22 = (long)(int)uVar21;
          *(undefined4 *)(lVar26 + 0x24) = *(undefined4 *)(lVar12 + lVar22 * 0x18 + 0x24);
        }
        lVar12 = lVar12 + lVar22 * 0x18;
        *(uint *)(lVar12 + 0x20) = uVar7;
        *(uint *)(lVar12 + 0x24) = *unaff_x28 - 1;
        uVar8 = *(undefined4 *)((long)pplVar6 + -100);
        plVar13 = (long *)(lVar12 + 0x30);
        *plVar13 = (long)puVar17;
        *(undefined4 *)(lVar12 + 0x28) = uVar8;
        goto code_r0x0413776c;
      }
    }
    else {
code_r0x058c5934:
      func_0x04151bc0();
      unaff_x25 = puVar17;
      unaff_x29 = plVar19;
    }
code_r0x058c5938:
    lVar15 = func_0x04151bb8();
    unaff_x26 = (long *)PTR_DAT_09eea9a8;
    *(undefined **)((long)pplVar6 + -0xd0) = &UNK_058c593c;
    *(long **)((long)pplVar6 + -200) = unaff_x27;
    *(long *)((long)pplVar6 + -0xc0) = lVar12;
    *(uint **)((long)pplVar6 + -0xb8) = unaff_x25;
    *(ulong *)((long)pplVar6 + -0xb0) = uVar28;
    *(long **)((long)pplVar6 + -0xa8) = plVar32;
    *(long **)((long)pplVar6 + -0xa0) = unaff_x22;
    *(long *)((long)pplVar6 + -0x98) = lVar22;
    *(long *)((long)pplVar6 + -0x90) = lVar26;
    *(long **)((long)pplVar6 + -0x88) = plVar13;
    uVar27 = 0xa454000;
    if ((bRam000000000a45489c & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eea9d8);
      func_0x0415191c(PTR_DAT_09eea9e0);
      func_0x0415191c(PTR_DAT_09eea9a8);
      func_0x0415191c(PTR_DAT_09eaa090);
      func_0x0415191c(PTR_DAT_09eea9b8);
      func_0x0415191c(PTR_DAT_09eea9c0);
      func_0x0415191c(PTR_DAT_09eea9c8);
      func_0x0415191c(PTR_DAT_09eea9d0);
      bRam000000000a45489c = 1;
    }
    lVar12 = *unaff_x26;
    *(undefined8 *)((long)pplVar6 + -0xd8) = 0;
    if (*(int *)(lVar12 + 0xe0) == 0) {
      func_0x04151a94();
    }
    lVar12 = func_0x08582984(0);
    if (lVar12 != 0) {
      func_0x07e38140(lVar12,lVar15,(undefined1 *)((long)pplVar6 + -0xd8),
                      *(undefined8 *)PTR_DAT_09eea9e0);
      if (*(long *)((long)pplVar6 + -0xd8) == 0) {
        return (long *)0x0;
      }
      uVar9 = func_0x084c4560(*(long *)((long)pplVar6 + -0xd8),*(undefined8 *)PTR_DAT_09eea9d0,0);
      puVar33 = PTR_DAT_09eaa090;
      if (*(long *)((long)pplVar6 + -0xd8) != 0) {
        uVar27 = uVar9 & 0xffffffff;
        uVar28 = func_0x084c4560(*(long *)((long)pplVar6 + -0xd8),*(undefined8 *)PTR_DAT_09eea9b8,0)
        ;
        lVar12 = *(long *)puVar33;
        lVar22 = *(long *)((long)pplVar6 + -0xd8);
        unaff_x22 = (long *)(uVar28 & 0xffffffff);
        uVar28 = *(ulong *)(*(long *)(*(long *)(puVar18 + 8) + 0xc0) + 0x150);
        if (*(int *)(lVar12 + 0xe0) == 0) {
          func_0x04151a94(lVar12);
        }
        uVar24 = func_0x085cae78(uVar28,0);
        plVar32 = (long *)0x0;
        unaff_x27 = (long *)puVar33;
        if (lVar22 != 0) {
          lVar12 = func_0x084c2664(lVar22,*(undefined8 *)PTR_DAT_09eea9c0,uVar24,0);
          lVar22 = *(long *)(*(long *)(*(long *)(puVar18 + 8) + 0xc0) + 8);
          if ((*(byte *)(lVar22 + 0x135) & 1) == 0) {
            lVar22 = func_0x041cb3c0(lVar22);
          }
          if (lVar12 == 0) {
code_r0x058c5af0:
            lVar26 = 0;
          }
          else {
            lVar26 = func_0x04151a98(lVar12,lVar22);
            if (lVar26 == 0) {
              func_0x04151f54(lVar12,lVar22);
              goto code_r0x058c5af0;
            }
          }
          plVar13 = (long *)(lVar15 + 0x30);
          *plVar13 = lVar26;
          lVar22 = *(long *)(*(long *)(*(long *)(puVar18 + 8) + 0xc0) + 8);
          if ((*(byte *)(lVar22 + 0x135) & 1) == 0) {
            lVar22 = func_0x041cb3c0(lVar22);
          }
          if ((lVar12 != 0) && (lVar26 = func_0x04151a98(lVar12,lVar22), lVar26 == 0)) {
            func_0x04151f54(lVar12,lVar22);
          }
          goto code_r0x0413776c;
        }
      }
    }
    func_0x04151bb8();
    func_0x085dd388(0x10,0);
    func_0x04151bb8();
    auVar36 = func_0x04151f54(uVar28,plVar32);
    puVar33 = PTR_DAT_09eea9a8;
    lVar12 = auVar36._0_8_;
    *(undefined **)((long)pplVar6 + -0x110) = &UNK_058c5cd4;
    *(long **)((long)pplVar6 + -0x100) = unaff_x22;
    *(ulong *)((long)pplVar6 + -0xf8) = uVar27;
    *(uint **)((long)pplVar6 + -0xf0) = puVar18;
    *(long *)((long)pplVar6 + -0xe8) = lVar15;
    if ((bRam000000000a45489d & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eea9a8);
      bRam000000000a45489d = 1;
    }
    uVar8 = *(undefined4 *)(lVar12 + 0x20);
    if (*(int *)(*(long *)puVar33 + 0xe0) == 0) {
      func_0x04151a94();
    }
    uVar7 = func_0x08582900(uVar8,0);
    puVar33 = PTR_DAT_09eac100;
    puVar17 = (uint *)(ulong)uVar7;
    lVar22 = *(long *)(*(long *)(*(long *)(auVar36._8_8_ + 0x20) + 0xc0) + 0x1a8);
    *(undefined8 *)((long)pplVar6 + -0x120) = *(undefined8 *)((long)pplVar6 + -0x110);
    *(ulong *)((long)pplVar6 + -0x110) = uVar28;
    *(long **)((long)pplVar6 + -0x108) = plVar32;
    *(undefined8 *)((long)pplVar6 + -0x100) = *(undefined8 *)((long)pplVar6 + -0x100);
    *(undefined8 *)((long)pplVar6 + -0xf8) = *(undefined8 *)((long)pplVar6 + -0xf8);
    *(undefined8 *)((long)pplVar6 + -0xf0) = *(undefined8 *)((long)pplVar6 + -0xf0);
    *(undefined8 *)((long)pplVar6 + -0xe8) = *(undefined8 *)((long)pplVar6 + -0xe8);
    if ((bRam000000000a45489e & 1) == 0) {
      func_0x0415191c(PTR_DAT_09eac100,puVar17,0);
      bRam000000000a45489e = 1;
    }
    plVar19 = (long *)func_0x04151a04(*(undefined8 *)puVar33,puVar17);
    lVar22 = *(long *)(*(long *)(*(long *)(lVar22 + 0x20) + 0xc0) + 400);
    if ((*(byte *)(lVar22 + 0x135) & 1) == 0) {
      lVar22 = func_0x041cb3c0(lVar22);
    }
    plVar13 = (long *)func_0x04151a04(lVar22,puVar17);
    uVar21 = *(uint *)(lVar12 + 0x20);
    puVar18 = (uint *)(ulong)uVar21;
    unaff_x24 = (long *)0x0;
    plVar32 = plVar13;
    func_0x085dec90(*(undefined8 *)(lVar12 + 0x18),0,plVar13,0,puVar18,0);
    if ((int)uVar21 < 1) {
code_r0x058c5e78:
      plVar13 = (long *)(lVar12 + 0x10);
      *plVar13 = (long)plVar19;
      goto code_r0x0413776c;
    }
    if (plVar13 != (long *)0x0) {
      uVar21 = *(uint *)(plVar13 + 3);
      puVar25 = (uint *)0x0;
      while (puVar25 < (uint *)(ulong)uVar21) {
        iVar34 = (int)plVar13[(long)puVar25 * 3 + 4];
        if (-1 < iVar34) {
          if (plVar19 == (long *)0x0) goto code_r0x058c5eac;
          iVar3 = 0;
          if (uVar7 != 0) {
            iVar3 = iVar34 / (int)uVar7;
          }
          uVar20 = iVar34 - iVar3 * uVar7;
          if (*(uint *)(plVar19 + 3) <= uVar20) break;
          *(int *)((long)plVar13 + (long)puVar25 * 0x18 + 0x24) =
               *(int *)((long)plVar19 + (ulong)uVar20 * 4 + 0x20) + -1;
          *(int *)((long)plVar19 + (ulong)uVar20 * 4 + 0x20) = (int)puVar25 + 1;
        }
        puVar25 = (uint *)((long)puVar25 + 1);
        if (puVar25 == puVar18) goto code_r0x058c5e78;
      }
      func_0x04151bc0();
    }
code_r0x058c5eac:
    auVar35 = func_0x04151bb8();
    lVar22 = auVar35._0_8_;
    *(long **)((long)pplVar6 + -0x180) = unaff_x29;
    *(undefined **)((long)pplVar6 + -0x178) = &UNK_058c5eb0;
    *(uint **)((long)pplVar6 + -0x170) = unaff_x28;
    *(long **)((long)pplVar6 + -0x168) = unaff_x27;
    *(long **)((long)pplVar6 + -0x160) = unaff_x26;
    *(uint **)((long)pplVar6 + -0x158) = unaff_x25;
    *(uint **)((long)pplVar6 + -0x150) = puVar18;
    *(long **)((long)pplVar6 + -0x148) = plVar13;
    *(undefined8 **)((long)pplVar6 + -0x140) = (undefined8 *)(lVar12 + 0x18);
    *(long **)((long)pplVar6 + -0x138) = plVar19;
    *(uint **)((long)pplVar6 + -0x130) = puVar17;
    *(long *)((long)pplVar6 + -0x128) = lVar12;
    *(uint *)((long)pplVar6 + -0x184) = auVar35._8_4_;
    if (*(long *)(lVar22 + 0x10) == 0) {
      return (long *)0x0;
    }
    unaff_x22 = *(long **)(lVar22 + 0x30);
    if (unaff_x22 == (long *)0x0) {
      plVar13 = plVar32;
      uVar7 = func_0x085b9e58((undefined1 *)((long)pplVar6 + -0x184),
                              *(undefined8 *)(*(long *)(plVar32[4] + 0xc0) + 0x170));
    }
    else {
      plVar19 = (long *)(ulong)auVar35._8_4_;
      lVar12 = *(long *)(*(long *)(plVar32[4] + 0xc0) + 8);
      if ((*(byte *)(lVar12 + 0x135) & 1) == 0) {
        lVar12 = func_0x041cb3c0(lVar12);
      }
      lVar26 = *unaff_x22;
      uVar28 = (ulong)*(ushort *)(lVar26 + 0x12e);
      if (uVar28 != 0) {
        piVar29 = (int *)(*(long *)(lVar26 + 0xb0) + 8);
        do {
          if (*(long *)(piVar29 + -2) == lVar12) {
            puVar14 = (undefined8 *)(lVar26 + (long)(*piVar29 + 1) * 0x10 + 0x138);
            goto code_r0x058c5f70;
          }
          uVar28 = uVar28 - 1;
          piVar29 = piVar29 + 4;
        } while (uVar28 != 0);
      }
      puVar14 = (undefined8 *)func_0x041cb4c4(unaff_x22,lVar12,1);
code_r0x058c5f70:
      plVar13 = (long *)puVar14[1];
      uVar7 = (*(code *)*puVar14)(unaff_x22,plVar19);
    }
    lVar12 = *(long *)(lVar22 + 0x10);
    if (lVar12 == 0) {
code_r0x058c61ac:
      func_0x04151bb8();
    }
    else {
      uVar21 = *(uint *)(lVar12 + 0x18);
      uVar7 = uVar7 & 0x7fffffff;
      unaff_x27 = (long *)(ulong)uVar7;
      iVar34 = 0;
      if (uVar21 != 0) {
        iVar34 = (int)uVar7 / (int)uVar21;
      }
      uVar20 = uVar7 - iVar34 * uVar21;
      if (uVar20 < uVar21) {
        uVar21 = *(int *)(lVar12 + (ulong)uVar20 * 4 + 0x20) - 1;
        if ((int)uVar21 < 0) {
          return (long *)0x0;
        }
        plVar30 = (long *)0x0;
        unaff_x29 = (long *)0xffffffff;
        puVar17 = (uint *)0x18;
        *(ulong *)((long)pplVar6 + -0x198) = (ulong)uVar20;
        *(long **)((long)pplVar6 + -400) = plVar32;
        while( true ) {
          puVar18 = (uint *)(ulong)uVar21;
          unaff_x26 = *(long **)(lVar22 + 0x18);
          unaff_x22 = plVar30;
          if (unaff_x26 == (long *)0x0) break;
          if (*(uint *)(unaff_x26 + 3) <= uVar21) goto code_r0x058c61b0;
          unaff_x25 = (uint *)(unaff_x26 + (ulong)uVar21 * 3 + 4);
          unaff_x28 = puVar18;
          if (*unaff_x25 == uVar7) {
            plVar19 = *(long **)(lVar22 + 0x30);
            if (plVar19 == (long *)0x0) {
              plVar31 = (long *)func_0x0437fd74(*(undefined8 *)(*(long *)(plVar32[4] + 0xc0) + 0x18)
                                               );
              plVar19 = plVar30;
              if (plVar31 == (long *)0x0) break;
              plVar13 = (long *)(ulong)*(uint *)((long)pplVar6 + -0x184);
              unaff_x24 = *(long **)(*plVar31 + 0x1c0);
              uVar28 = (**(code **)(*plVar31 + 0x1b8))
                                 (plVar31,(int)unaff_x26[(long)puVar18 * 3 + 5]);
            }
            else {
              if (plVar19 == (long *)0x0) break;
              uVar20 = *(uint *)((long)pplVar6 + -0x184);
              lVar12 = *(long *)(*(long *)(plVar32[4] + 0xc0) + 8);
              uVar2 = *(uint *)(unaff_x26 + (long)puVar18 * 3 + 5);
              if ((*(byte *)(lVar12 + 0x135) & 1) == 0) {
                lVar12 = func_0x041cb3c0(lVar12);
              }
              lVar26 = *plVar19;
              uVar28 = (ulong)*(ushort *)(lVar26 + 0x12e);
              if (uVar28 != 0) {
                piVar29 = (int *)(*(long *)(lVar26 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar29 + -2) == lVar12) {
                    puVar14 = (undefined8 *)(lVar26 + (long)*piVar29 * 0x10 + 0x138);
                    goto code_r0x058c60b8;
                  }
                  uVar28 = uVar28 - 1;
                  piVar29 = piVar29 + 4;
                } while (uVar28 != 0);
              }
              puVar14 = (undefined8 *)func_0x041cb4c4(plVar19,lVar12,0);
code_r0x058c60b8:
              unaff_x24 = (long *)puVar14[1];
              plVar13 = (long *)(ulong)uVar20;
              uVar28 = (*(code *)*puVar14)(plVar19,(long *)(ulong)uVar2);
              plVar32 = *(long **)((long)pplVar6 + -400);
              plVar30 = plVar19;
              unaff_x22 = (long *)(ulong)uVar2;
            }
            if ((uVar28 & 1) != 0) {
              plVar19 = plVar30;
              if ((int)(uint)unaff_x29 < 0) {
                lVar12 = *(long *)(lVar22 + 0x10);
                if (lVar12 == 0) break;
                if (*(uint *)(lVar12 + 0x18) <= (uint)*(long *)((long)pplVar6 + -0x198))
                goto code_r0x058c61b0;
                *(int *)(lVar12 + *(long *)((long)pplVar6 + -0x198) * 4 + 0x20) =
                     *(int *)((long)unaff_x26 + (long)puVar18 * 0x18 + 0x24) + 1;
              }
              else {
                lVar12 = *(long *)(lVar22 + 0x18);
                if (lVar12 == 0) break;
                if (*(uint *)(lVar12 + 0x18) <= (uint)unaff_x29) goto code_r0x058c61b0;
                *(undefined4 *)(lVar12 + (long)unaff_x29 * 0x18 + 0x24) =
                     *(undefined4 *)((long)unaff_x26 + (long)puVar18 * 0x18 + 0x24);
              }
              *unaff_x25 = 0xffffffff;
              uVar8 = *(undefined4 *)(lVar22 + 0x24);
              unaff_x26[(long)puVar18 * 3 + 6] = 0;
              *(undefined4 *)((long)unaff_x26 + (long)puVar18 * 0x18 + 0x24) = uVar8;
              *(uint *)(lVar22 + 0x24) = uVar21;
              *(ulong *)(lVar22 + 0x28) =
                   CONCAT44((int)((ulong)*(undefined8 *)(lVar22 + 0x28) >> 0x20) + 1,
                            (int)*(undefined8 *)(lVar22 + 0x28) + 1);
              return (long *)0x1;
            }
          }
          uVar20 = *(uint *)((long)unaff_x26 + (long)puVar18 * 0x18 + 0x24);
          unaff_x29 = (long *)(ulong)uVar21;
          plVar19 = plVar30;
          uVar21 = uVar20;
          if ((int)uVar20 < 0) {
            return (long *)0x0;
          }
        }
        goto code_r0x058c61ac;
      }
    }
code_r0x058c61b0:
    auVar35 = func_0x04151bc0();
    lVar26 = auVar35._0_8_;
    *(long **)((long)pplVar6 + -0x200) = unaff_x29;
    *(undefined **)((long)pplVar6 + -0x1f8) = &UNK_058c61b4;
    *(uint **)((long)pplVar6 + -0x1f0) = unaff_x28;
    *(long **)((long)pplVar6 + -0x1e8) = unaff_x27;
    *(long **)((long)pplVar6 + -0x1e0) = unaff_x26;
    *(uint **)((long)pplVar6 + -0x1d8) = unaff_x25;
    *(uint **)((long)pplVar6 + -0x1d0) = puVar18;
    *(long **)((long)pplVar6 + -0x1c8) = plVar32;
    *(long **)((long)pplVar6 + -0x1c0) = unaff_x22;
    *(long **)((long)pplVar6 + -0x1b8) = plVar19;
    *(uint **)((long)pplVar6 + -0x1b0) = puVar17;
    *(long *)((long)pplVar6 + -0x1a8) = lVar22;
    *(uint *)((long)pplVar6 + -0x204) = auVar35._8_4_;
    lVar12 = *(long *)(lVar26 + 0x10);
    *(long **)((long)pplVar6 + -0x218) = plVar13;
    if (lVar12 == 0) {
code_r0x058c63f8:
      **(undefined8 **)((long)pplVar6 + -0x218) = 0;
      return (long *)0x0;
    }
    plVar32 = *(long **)(lVar26 + 0x30);
    plVar30 = unaff_x24;
    if (plVar32 == (long *)0x0) {
      uVar7 = func_0x085b9e58((undefined1 *)((long)pplVar6 + -0x204),
                              *(undefined8 *)(*(long *)(unaff_x24[4] + 0xc0) + 0x170));
    }
    else {
      unaff_x22 = (long *)(ulong)auVar35._8_4_;
      lVar12 = *(long *)(*(long *)(unaff_x24[4] + 0xc0) + 8);
      if ((*(byte *)(lVar12 + 0x135) & 1) == 0) {
        lVar12 = func_0x041cb3c0(lVar12);
      }
      lVar22 = *plVar32;
      uVar28 = (ulong)*(ushort *)(lVar22 + 0x12e);
      if (uVar28 != 0) {
        piVar29 = (int *)(*(long *)(lVar22 + 0xb0) + 8);
        do {
          if (*(long *)(piVar29 + -2) == lVar12) {
            puVar14 = (undefined8 *)(lVar22 + (long)(*piVar29 + 1) * 0x10 + 0x138);
            goto code_r0x058c6278;
          }
          uVar28 = uVar28 - 1;
          piVar29 = piVar29 + 4;
        } while (uVar28 != 0);
      }
      puVar14 = (undefined8 *)func_0x041cb4c4(plVar32,lVar12,1);
code_r0x058c6278:
      plVar13 = (long *)puVar14[1];
      uVar7 = (*(code *)*puVar14)(plVar32,unaff_x22);
    }
    lVar12 = *(long *)(lVar26 + 0x10);
    if (lVar12 == 0) {
code_r0x058c64d0:
      func_0x04151bb8();
    }
    else {
      uVar21 = *(uint *)(lVar12 + 0x18);
      uVar7 = uVar7 & 0x7fffffff;
      unaff_x29 = (long *)(ulong)uVar7;
      iVar34 = 0;
      if (uVar21 != 0) {
        iVar34 = (int)uVar7 / (int)uVar21;
      }
      uVar20 = uVar7 - iVar34 * uVar21;
      if (uVar20 < uVar21) {
        iVar34 = *(int *)(lVar12 + (ulong)uVar20 * 4 + 0x20);
        *(ulong *)((long)pplVar6 + -0x220) = (ulong)uVar20;
        uVar21 = iVar34 - 1;
        if ((int)uVar21 < 0) goto code_r0x058c63f8;
        plVar31 = (long *)0x0;
        unaff_x26 = (long *)0xffffffff;
        plVar19 = (long *)0x18;
        *(long **)((long)pplVar6 + -0x210) = unaff_x24;
        while( true ) {
          unaff_x25 = (uint *)(ulong)uVar21;
          unaff_x27 = *(long **)(lVar26 + 0x18);
          plVar32 = plVar31;
          if (unaff_x27 == (long *)0x0) break;
          if (*(uint *)(unaff_x27 + 3) <= uVar21) goto code_r0x058c64d4;
          unaff_x28 = (uint *)(unaff_x27 + (ulong)uVar21 * 3 + 4);
          puVar17 = unaff_x25;
          if (*unaff_x28 == uVar7) {
            unaff_x22 = *(long **)(lVar26 + 0x30);
            if (unaff_x22 == (long *)0x0) {
              plVar10 = (long *)func_0x0437fd74(*(undefined8 *)
                                                 (*(long *)(unaff_x24[4] + 0xc0) + 0x18));
              unaff_x22 = plVar31;
              if (plVar10 == (long *)0x0) break;
              plVar13 = (long *)(ulong)*(uint *)((long)pplVar6 + -0x204);
              plVar30 = *(long **)(*plVar10 + 0x1c0);
              uVar28 = (**(code **)(*plVar10 + 0x1b8))
                                 (plVar10,(int)unaff_x27[(long)unaff_x25 * 3 + 5]);
            }
            else {
              if (unaff_x22 == (long *)0x0) break;
              uVar20 = *(uint *)((long)pplVar6 + -0x204);
              lVar12 = *(long *)(*(long *)(unaff_x24[4] + 0xc0) + 8);
              uVar2 = *(uint *)(unaff_x27 + (long)unaff_x25 * 3 + 5);
              if ((*(byte *)(lVar12 + 0x135) & 1) == 0) {
                lVar12 = func_0x041cb3c0(lVar12);
              }
              lVar22 = *unaff_x22;
              uVar28 = (ulong)*(ushort *)(lVar22 + 0x12e);
              if (uVar28 != 0) {
                piVar29 = (int *)(*(long *)(lVar22 + 0xb0) + 8);
                do {
                  if (*(long *)(piVar29 + -2) == lVar12) {
                    puVar14 = (undefined8 *)(lVar22 + (long)*piVar29 * 0x10 + 0x138);
                    goto code_r0x058c63c4;
                  }
                  uVar28 = uVar28 - 1;
                  piVar29 = piVar29 + 4;
                } while (uVar28 != 0);
              }
              puVar14 = (undefined8 *)func_0x041cb4c4(unaff_x22,lVar12,0);
code_r0x058c63c4:
              plVar30 = (long *)puVar14[1];
              plVar13 = (long *)(ulong)uVar20;
              uVar28 = (*(code *)*puVar14)(unaff_x22,(long *)(ulong)uVar2);
              unaff_x24 = *(long **)((long)pplVar6 + -0x210);
              plVar31 = unaff_x22;
              plVar32 = (long *)(ulong)uVar2;
            }
            if ((uVar28 & 1) != 0) {
              unaff_x22 = plVar31;
              if ((int)(uint)unaff_x26 < 0) {
                lVar12 = *(long *)(lVar26 + 0x10);
                if (lVar12 == 0) break;
                if (*(uint *)(lVar12 + 0x18) <= (uint)*(long *)((long)pplVar6 + -0x220))
                goto code_r0x058c64d4;
                *(int *)(lVar12 + *(long *)((long)pplVar6 + -0x220) * 4 + 0x20) =
                     *(int *)((long)unaff_x27 + (long)unaff_x25 * 0x18 + 0x24) + 1;
              }
              else {
                lVar12 = *(long *)(lVar26 + 0x18);
                if (lVar12 == 0) break;
                if (*(uint *)(lVar12 + 0x18) <= (uint)unaff_x26) goto code_r0x058c64d4;
                *(undefined4 *)(lVar12 + (long)unaff_x26 * 0x18 + 0x24) =
                     *(undefined4 *)((long)unaff_x27 + (long)unaff_x25 * 0x18 + 0x24);
              }
              plVar13 = *(long **)((long)pplVar6 + -0x218);
              *plVar13 = unaff_x27[(long)unaff_x25 * 3 + 6];
              goto code_r0x0413776c;
            }
          }
          uVar20 = *(uint *)((long)unaff_x27 + (long)unaff_x25 * 0x18 + 0x24);
          unaff_x26 = (long *)(ulong)uVar21;
          unaff_x22 = plVar31;
          uVar21 = uVar20;
          if ((int)uVar20 < 0) goto code_r0x058c63f8;
        }
        goto code_r0x058c64d0;
      }
    }
code_r0x058c64d4:
    lVar12 = func_0x04151bc0();
    *(undefined **)((long)pplVar6 + -0x240) = &UNK_058c64d8;
    *(long **)((long)pplVar6 + -0x238) = plVar19;
    *(uint **)((long)pplVar6 + -0x230) = puVar17;
    *(long *)((long)pplVar6 + -0x228) = lVar26;
    puVar17 = *(uint **)(*(long *)(plVar30[4] + 0xc0) + 0xf0);
    uVar7 = func_0x058c50f0();
    uVar28 = (ulong)uVar7;
    if ((int)uVar7 < 0) {
      *plVar13 = 0;
      return (long *)(ulong)(~uVar7 >> 0x1f);
    }
    lVar22 = *(long *)(lVar12 + 0x18);
    if (lVar22 == 0) {
      func_0x04151bb8();
    }
    else if (uVar7 < *(uint *)(lVar22 + 0x18)) {
      *plVar13 = *(long *)(lVar22 + uVar28 * 0x18 + 0x30);
code_r0x0413776c:
      if (iRam000000000a680cb0 != 0) {
        puVar1 = (ulong *)(((ulong)plVar13 >> 0x12 & 0x7fff) * 8 + 0xa4b4c88);
        do {
          cVar4 = '\x01';
          bVar5 = (bool)ExclusiveMonitorPass(puVar1,0x10);
          if (bVar5) {
            *puVar1 = *puVar1 | 1L << ((ulong)plVar13 >> 0xc & 0x3f);
            cVar4 = ExclusiveMonitorsStatus();
          }
        } while (cVar4 != '\0');
      }
      return plVar13;
    }
    puVar33 = &UNK_058c6550;
    auVar36 = func_0x04151bc0();
    plVar19 = (long *)0x0;
    lVar22 = *(long *)(*(long *)(plVar30[4] + 0xc0) + 0xf8);
    pplVar6 = (long **)((long)pplVar6 + -0x240);
  } while( true );
}


```

## SkillQueue.Enqueue (off 0x46ed4e8)

```c

void FUN_047f14e8(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined *puVar1;
  long lVar2;
  float extraout_s0;
  undefined8 uStack_40;
  undefined8 uStack_38;
  
  if ((bRam000000000a4516a4 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ecef28);
    bRam000000000a4516a4 = 1;
  }
  lVar2 = *(long *)(param_1 + 0x10);
  uStack_38 = 0;
  uStack_40 = param_2;
  func_0x041518c0(&uStack_40,param_2);
  uStack_38 = param_3;
  func_0x041518c0(&uStack_38,param_3);
  if (lVar2 != 0) {
    func_0x072d0b40(lVar2,uStack_40,uStack_38,*(undefined8 *)PTR_DAT_09ecef28);
    return;
  }
  lVar2 = func_0x04151bb8();
  puVar1 = PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0;
  if ((bRam000000000a4516a5 & 1) == 0) {
    func_0x0415191c(PTR_Game_Application_InGameHunt_HuntCalculator_TypeInfo_09ec48f0);
    bRam000000000a4516a5 = 1;
  }
  if (*(int *)(*(long *)puVar1 + 0xe0) == 0) {
    func_0x04151a94();
  }
  *(float *)(lVar2 + 0x1c) = *(float *)(lVar2 + 0x1c) + extraout_s0 * 1000.0;
  return;
}


```

## SkillQueue..ctor (off 0x46ed448)

```c

void FUN_047f1448(long param_1,int param_2)

{
  undefined *puVar1;
  undefined *puVar2;
  undefined8 uVar3;
  
  puVar2 = PTR_DAT_09ecef20;
  puVar1 = PTR_DAT_09ecef18;
  if ((bRam000000000a4516a3 & 1) == 0) {
    func_0x0415191c(PTR_DAT_09ecef20);
    func_0x0415191c(PTR_DAT_09ecef18);
    bRam000000000a4516a3 = 1;
  }
  uVar3 = func_0x04151ba8(*(undefined8 *)puVar1);
  func_0x072d05fc(uVar3,0x20,*(undefined8 *)puVar2);
  *(undefined8 *)(param_1 + 0x10) = uVar3;
  func_0x041518c0((undefined8 *)(param_1 + 0x10),uVar3);
  func_0x085fc77c(param_1,0);
  *(int *)(param_1 + 0x18) = param_2;
  *(float *)(param_1 + 0x1c) = (float)param_2;
  return;
}


```

