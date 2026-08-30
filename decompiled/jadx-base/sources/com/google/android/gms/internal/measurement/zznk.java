package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zznk<T> implements com.google.android.gms.internal.measurement.zzns<T> {
    private static final int[] zza = new int[0];
    private static final sun.misc.Unsafe zzb = com.google.android.gms.internal.measurement.zzol.zzg();
    private final int[] zzc;
    private final java.lang.Object[] zzd;
    private final int zze;
    private final int zzf;
    private final com.google.android.gms.internal.measurement.zznh zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final com.google.android.gms.internal.measurement.zzoe zzl;
    private final com.google.android.gms.internal.measurement.zzlq zzm;

    private zznk(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.google.android.gms.internal.measurement.zznh zznhVar, boolean z, int[] iArr2, int i3, int i4, com.google.android.gms.internal.measurement.zznm zznmVar, com.google.android.gms.internal.measurement.zzmu zzmuVar, com.google.android.gms.internal.measurement.zzoe zzoeVar, com.google.android.gms.internal.measurement.zzlq zzlqVar, com.google.android.gms.internal.measurement.zznc zzncVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzlqVar != null && (zznhVar instanceof com.google.android.gms.internal.measurement.zzma)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzoeVar;
        this.zzm = zzlqVar;
        this.zzg = zznhVar;
    }

    private static void zzA(java.lang.Object obj) {
        if (!zzL(obj)) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
        }
    }

    private final void zzB(java.lang.Object obj, java.lang.Object obj2, int i) {
        if (zzI(obj2, i)) {
            int iZzs = zzs(i) & 1048575;
            sun.misc.Unsafe unsafe = zzb;
            long j = iZzs;
            java.lang.Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            com.google.android.gms.internal.measurement.zzns zznsVarZzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    java.lang.Object objZze = zznsVarZzv.zze();
                    zznsVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                java.lang.Object objZze2 = zznsVarZzv.zze();
                zznsVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zznsVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(java.lang.Object obj, java.lang.Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzM(obj2, i2, i)) {
            int iZzs = zzs(i) & 1048575;
            sun.misc.Unsafe unsafe = zzb;
            long j = iZzs;
            java.lang.Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            com.google.android.gms.internal.measurement.zzns zznsVarZzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    java.lang.Object objZze = zznsVarZzv.zze();
                    zznsVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                java.lang.Object objZze2 = zznsVarZzv.zze();
                zznsVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zznsVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(java.lang.Object obj, int i) {
        int iZzp = zzp(i);
        long j = 1048575 & iZzp;
        if (j == 1048575) {
            return;
        }
        com.google.android.gms.internal.measurement.zzol.zzq(obj, j, (1 << (iZzp >>> 20)) | com.google.android.gms.internal.measurement.zzol.zzc(obj, j));
    }

    private final void zzE(java.lang.Object obj, int i, int i2) {
        com.google.android.gms.internal.measurement.zzol.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(java.lang.Object obj, int i, java.lang.Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(java.lang.Object obj, java.lang.Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(java.lang.Object obj, int i) {
        int iZzp = zzp(i);
        long j = iZzp & 1048575;
        if (j != 1048575) {
            return (com.google.android.gms.internal.measurement.zzol.zzc(obj, j) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i);
        long j2 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(com.google.android.gms.internal.measurement.zzol.zza(obj, j2)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(com.google.android.gms.internal.measurement.zzol.zzb(obj, j2)) != 0;
            case 2:
                return com.google.android.gms.internal.measurement.zzol.zzd(obj, j2) != 0;
            case 3:
                return com.google.android.gms.internal.measurement.zzol.zzd(obj, j2) != 0;
            case 4:
                return com.google.android.gms.internal.measurement.zzol.zzc(obj, j2) != 0;
            case 5:
                return com.google.android.gms.internal.measurement.zzol.zzd(obj, j2) != 0;
            case 6:
                return com.google.android.gms.internal.measurement.zzol.zzc(obj, j2) != 0;
            case 7:
                return com.google.android.gms.internal.measurement.zzol.zzw(obj, j2);
            case 8:
                java.lang.Object objZzf = com.google.android.gms.internal.measurement.zzol.zzf(obj, j2);
                if (objZzf instanceof java.lang.String) {
                    return !((java.lang.String) objZzf).isEmpty();
                }
                if (objZzf instanceof com.google.android.gms.internal.measurement.zzld) {
                    return !com.google.android.gms.internal.measurement.zzld.zzb.equals(objZzf);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return com.google.android.gms.internal.measurement.zzol.zzf(obj, j2) != null;
            case 10:
                return !com.google.android.gms.internal.measurement.zzld.zzb.equals(com.google.android.gms.internal.measurement.zzol.zzf(obj, j2));
            case 11:
                return com.google.android.gms.internal.measurement.zzol.zzc(obj, j2) != 0;
            case 12:
                return com.google.android.gms.internal.measurement.zzol.zzc(obj, j2) != 0;
            case 13:
                return com.google.android.gms.internal.measurement.zzol.zzc(obj, j2) != 0;
            case 14:
                return com.google.android.gms.internal.measurement.zzol.zzd(obj, j2) != 0;
            case 15:
                return com.google.android.gms.internal.measurement.zzol.zzc(obj, j2) != 0;
            case 16:
                return com.google.android.gms.internal.measurement.zzol.zzd(obj, j2) != 0;
            case 17:
                return com.google.android.gms.internal.measurement.zzol.zzf(obj, j2) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private final boolean zzJ(java.lang.Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzI(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzK(java.lang.Object obj, int i, com.google.android.gms.internal.measurement.zzns zznsVar) {
        return zznsVar.zzk(com.google.android.gms.internal.measurement.zzol.zzf(obj, i & 1048575));
    }

    private static boolean zzL(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzmd) {
            return ((com.google.android.gms.internal.measurement.zzmd) obj).zzcw();
        }
        return true;
    }

    private final boolean zzM(java.lang.Object obj, int i, int i2) {
        return com.google.android.gms.internal.measurement.zzol.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(java.lang.Object obj, long j) {
        return ((java.lang.Boolean) com.google.android.gms.internal.measurement.zzol.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, java.lang.Object obj, com.google.android.gms.internal.measurement.zzor zzorVar) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            zzorVar.zzG(i, (java.lang.String) obj);
        } else {
            zzorVar.zzd(i, (com.google.android.gms.internal.measurement.zzld) obj);
        }
    }

    static com.google.android.gms.internal.measurement.zzof zzd(java.lang.Object obj) {
        com.google.android.gms.internal.measurement.zzmd zzmdVar = (com.google.android.gms.internal.measurement.zzmd) obj;
        com.google.android.gms.internal.measurement.zzof zzofVar = zzmdVar.zzc;
        if (zzofVar != com.google.android.gms.internal.measurement.zzof.zzc()) {
            return zzofVar;
        }
        com.google.android.gms.internal.measurement.zzof zzofVarZzf = com.google.android.gms.internal.measurement.zzof.zzf();
        zzmdVar.zzc = zzofVarZzf;
        return zzofVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:126:0x0268  */
    /* JADX WARN: Code duplicated, block: B:129:0x027f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0282  */
    /* JADX WARN: Code duplicated, block: B:184:0x0398  */
    static com.google.android.gms.internal.measurement.zznk zzl(java.lang.Class cls, com.google.android.gms.internal.measurement.zzne zzneVar, com.google.android.gms.internal.measurement.zznm zznmVar, com.google.android.gms.internal.measurement.zzmu zzmuVar, com.google.android.gms.internal.measurement.zzoe zzoeVar, com.google.android.gms.internal.measurement.zzlq zzlqVar, com.google.android.gms.internal.measurement.zznc zzncVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        int i21;
        java.lang.reflect.Field fieldZzz;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        java.lang.Object obj;
        java.lang.reflect.Field fieldZzz2;
        int i26;
        java.lang.Object obj2;
        java.lang.reflect.Field fieldZzz3;
        int i27;
        char cCharAt10;
        int i28;
        char cCharAt11;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        if (!(zzneVar instanceof com.google.android.gms.internal.measurement.zznr)) {
            throw null;
        }
        com.google.android.gms.internal.measurement.zznr zznrVar = (com.google.android.gms.internal.measurement.zznr) zzneVar;
        java.lang.String strZzd = zznrVar.zzd();
        int length = strZzd.length();
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (strZzd.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int iCharAt3 = strZzd.charAt(i);
        if (iCharAt3 >= 55296) {
            int i33 = iCharAt3 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                cCharAt13 = strZzd.charAt(i32);
                if (cCharAt13 < 55296) {
                    break;
                }
                i33 |= (cCharAt13 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            iCharAt3 = i33 | (cCharAt13 << i34);
            i32 = i30;
        }
        if (iCharAt3 == 0) {
            i4 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i2 = 0;
            i5 = 0;
            i3 = 0;
            iArr = zza;
            i6 = 0;
        } else {
            int i35 = i32 + 1;
            int iCharAt4 = strZzd.charAt(i32);
            if (iCharAt4 >= 55296) {
                int i36 = iCharAt4 & 8191;
                int i37 = 13;
                while (true) {
                    i14 = i35 + 1;
                    cCharAt8 = strZzd.charAt(i35);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt8 & 8191) << i37;
                    i37 += 13;
                    i35 = i14;
                }
                iCharAt4 = i36 | (cCharAt8 << i37);
                i35 = i14;
            }
            int i38 = i35 + 1;
            int iCharAt5 = strZzd.charAt(i35);
            if (iCharAt5 >= 55296) {
                int i39 = iCharAt5 & 8191;
                int i40 = 13;
                while (true) {
                    i13 = i38 + 1;
                    cCharAt7 = strZzd.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i13;
                }
                iCharAt5 = i39 | (cCharAt7 << i40);
                i38 = i13;
            }
            int i41 = i38 + 1;
            int iCharAt6 = strZzd.charAt(i38);
            if (iCharAt6 >= 55296) {
                int i42 = iCharAt6 & 8191;
                int i43 = 13;
                while (true) {
                    i12 = i41 + 1;
                    cCharAt6 = strZzd.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i12;
                }
                iCharAt6 = i42 | (cCharAt6 << i43);
                i41 = i12;
            }
            int i44 = i41 + 1;
            int iCharAt7 = strZzd.charAt(i41);
            if (iCharAt7 >= 55296) {
                int i45 = iCharAt7 & 8191;
                int i46 = 13;
                while (true) {
                    i11 = i44 + 1;
                    cCharAt5 = strZzd.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i11;
                }
                iCharAt7 = i45 | (cCharAt5 << i46);
                i44 = i11;
            }
            int i47 = i44 + 1;
            iCharAt = strZzd.charAt(i44);
            if (iCharAt >= 55296) {
                int i48 = iCharAt & 8191;
                int i49 = 13;
                while (true) {
                    i10 = i47 + 1;
                    cCharAt4 = strZzd.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i10;
                }
                iCharAt = i48 | (cCharAt4 << i49);
                i47 = i10;
            }
            int i50 = i47 + 1;
            iCharAt2 = strZzd.charAt(i47);
            if (iCharAt2 >= 55296) {
                int i51 = iCharAt2 & 8191;
                int i52 = 13;
                while (true) {
                    i9 = i50 + 1;
                    cCharAt3 = strZzd.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i9;
                }
                iCharAt2 = i51 | (cCharAt3 << i52);
                i50 = i9;
            }
            int i53 = i50 + 1;
            int iCharAt8 = strZzd.charAt(i50);
            if (iCharAt8 >= 55296) {
                int i54 = iCharAt8 & 8191;
                int i55 = 13;
                while (true) {
                    i8 = i53 + 1;
                    cCharAt2 = strZzd.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i8;
                }
                iCharAt8 = i54 | (cCharAt2 << i55);
                i53 = i8;
            }
            int i56 = i53 + 1;
            int iCharAt9 = strZzd.charAt(i53);
            if (iCharAt9 >= 55296) {
                int i57 = iCharAt9 & 8191;
                int i58 = 13;
                while (true) {
                    i7 = i56 + 1;
                    cCharAt = strZzd.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i57 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i56 = i7;
                }
                iCharAt9 = i57 | (cCharAt << i58);
                i56 = i7;
            }
            int i59 = iCharAt4 + iCharAt4 + iCharAt5;
            int[] iArr2 = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i2 = iCharAt6;
            i3 = iCharAt9;
            i4 = i59;
            iArr = iArr2;
            i5 = iCharAt7;
            i6 = iCharAt4;
            i32 = i56;
        }
        sun.misc.Unsafe unsafe = zzb;
        java.lang.Object[] objArrZze = zznrVar.zze();
        java.lang.Class<?> cls2 = zznrVar.zza().getClass();
        int i60 = i3 + iCharAt2;
        int i61 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        java.lang.Object[] objArr = new java.lang.Object[i61];
        int i62 = i3;
        int i63 = i60;
        int i64 = 0;
        int i65 = 0;
        while (i32 < length) {
            int i66 = i32 + 1;
            int iCharAt10 = strZzd.charAt(i32);
            if (iCharAt10 >= c) {
                int i67 = iCharAt10 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i29 = i68 + 1;
                    cCharAt12 = strZzd.charAt(i68);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i67 |= (cCharAt12 & 8191) << i69;
                    i69 += 13;
                    i68 = i29;
                }
                iCharAt10 = i67 | (cCharAt12 << i69);
                i15 = i29;
            } else {
                i15 = i66;
            }
            int i70 = i15 + 1;
            int iCharAt11 = strZzd.charAt(i15);
            if (iCharAt11 >= c) {
                int i71 = iCharAt11 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i28 = i72 + 1;
                    cCharAt11 = strZzd.charAt(i72);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i71 |= (cCharAt11 & 8191) << i73;
                    i73 += 13;
                    i72 = i28;
                }
                iCharAt11 = i71 | (cCharAt11 << i73);
                i16 = i28;
            } else {
                i16 = i70;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i64] = i65;
                i64++;
            }
            int i74 = iCharAt11 & 255;
            int i75 = length;
            int i76 = iCharAt11 & 2048;
            int i77 = i5;
            if (i74 >= 51) {
                int i78 = i16 + 1;
                int iCharAt12 = strZzd.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i27 = i80 + 1;
                        cCharAt10 = strZzd.charAt(i80);
                        i17 = i2;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i79 |= (cCharAt10 & 8191) << i81;
                        i81 += 13;
                        i80 = i27;
                        i2 = i17;
                    }
                    iCharAt12 = i79 | (cCharAt10 << i81);
                    i23 = i27;
                } else {
                    i17 = i2;
                    i23 = i78;
                }
                int i82 = i74 - 51;
                int i83 = i23;
                if (i82 == 9 || i82 == 17) {
                    i24 = i4 + 1;
                    int i84 = i65 / 3;
                    objArr[i84 + i84 + 1] = objArrZze[i4];
                } else {
                    if (i82 == 12) {
                        if (zznrVar.zzc() == 1 || i76 != 0) {
                            i24 = i4 + 1;
                            int i85 = i65 / 3;
                            objArr[i85 + i85 + 1] = objArrZze[i4];
                        } else {
                            i76 = 0;
                        }
                    }
                    i25 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i25];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldZzz2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldZzz2 = zzz(cls2, (java.lang.String) obj);
                        objArrZze[i25] = fieldZzz2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzz2);
                    i26 = i25 + 1;
                    obj2 = objArrZze[i26];
                    int i86 = i76;
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldZzz3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldZzz3 = zzz(cls2, (java.lang.String) obj2);
                        objArrZze[i26] = fieldZzz3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzz3);
                    strZzd = strZzd;
                    i18 = i4;
                    i19 = i83;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i20 = 0;
                    zznrVar = zznrVar;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i21 = i86;
                }
                i4 = i24;
                i25 = iCharAt12 + iCharAt12;
                obj = objArrZze[i25];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldZzz2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldZzz2 = zzz(cls2, (java.lang.String) obj);
                    objArrZze[i25] = fieldZzz2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldZzz2);
                i26 = i25 + 1;
                obj2 = objArrZze[i26];
                int i87 = i76;
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldZzz3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldZzz3 = zzz(cls2, (java.lang.String) obj2);
                    objArrZze[i26] = fieldZzz3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldZzz3);
                strZzd = strZzd;
                i18 = i4;
                i19 = i83;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i20 = 0;
                zznrVar = zznrVar;
                iObjectFieldOffset = iObjectFieldOffset5;
                i21 = i87;
            } else {
                i17 = i2;
                i18 = i4 + 1;
                java.lang.reflect.Field fieldZzz4 = zzz(cls2, (java.lang.String) objArrZze[i4]);
                if (i74 == 9 || i74 == 17) {
                    zznrVar = zznrVar;
                    int i88 = i65 / 3;
                    objArr[i88 + i88 + 1] = fieldZzz4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i22 = i18 + 1;
                        int i89 = i65 / 3;
                        objArr[i89 + i89 + 1] = objArrZze[i18];
                        i18 = i22;
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        zznrVar = zznrVar;
                        if (zznrVar.zzc() == 1 || i76 != 0) {
                            i22 = i18 + 1;
                            int i90 = i65 / 3;
                            objArr[i90 + i90 + 1] = objArrZze[i18];
                            i18 = i22;
                        } else {
                            i76 = 0;
                        }
                    } else if (i74 == 50) {
                        int i91 = i18 + 1;
                        int i92 = i62 + 1;
                        iArr[i62] = i65;
                        int i93 = i65 / 3;
                        int i94 = i93 + i93;
                        objArr[i94] = objArrZze[i18];
                        if (i76 != 0) {
                            i18 = i91 + 1;
                            objArr[i94 + 1] = objArrZze[i91];
                            i62 = i92;
                            zznrVar = zznrVar;
                        } else {
                            i18 = i91;
                            i62 = i92;
                            i76 = 0;
                            zznrVar = zznrVar;
                        }
                    } else {
                        zznrVar = zznrVar;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0 || i74 > 17) {
                        i19 = i16;
                        i20 = 0;
                    } else {
                        int i95 = i16 + 1;
                        int iCharAt13 = strZzd.charAt(i16);
                        if (iCharAt13 >= 55296) {
                            int i96 = iCharAt13 & 8191;
                            int i97 = 13;
                            while (true) {
                                i19 = i95 + 1;
                                cCharAt9 = strZzd.charAt(i95);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i96 |= (cCharAt9 & 8191) << i97;
                                i97 += 13;
                                i95 = i19;
                            }
                            iCharAt13 = i96 | (cCharAt9 << i97);
                        } else {
                            i19 = i95;
                        }
                        int i98 = i6 + i6 + (iCharAt13 / 32);
                        java.lang.Object obj3 = objArrZze[i98];
                        if (obj3 instanceof java.lang.reflect.Field) {
                            fieldZzz = (java.lang.reflect.Field) obj3;
                        } else {
                            fieldZzz = zzz(cls2, (java.lang.String) obj3);
                            objArrZze[i98] = fieldZzz;
                        }
                        i20 = iCharAt13 % 32;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz);
                    }
                    if (i74 >= 18 && i74 <= 49) {
                        iArr[i63] = iObjectFieldOffset;
                        i63++;
                    }
                    i21 = i76;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i19 = i16;
                    i20 = 0;
                } else {
                    i19 = i16;
                    i20 = 0;
                }
                if (i74 >= 18) {
                    iArr[i63] = iObjectFieldOffset;
                    i63++;
                }
                i21 = i76;
            }
            int i99 = i65 + 1;
            iArr3[i65] = iCharAt10;
            int i100 = i99 + 1;
            iArr3[i99] = iObjectFieldOffset | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i21 != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20);
            iArr3[i100] = (i20 << 20) | iObjectFieldOffset2;
            i65 = i100 + 1;
            i4 = i18;
            strZzd = strZzd;
            length = i75;
            i5 = i77;
            zznrVar = zznrVar;
            i32 = i19;
            i2 = i17;
            c = 55296;
        }
        return new com.google.android.gms.internal.measurement.zznk(iArr3, objArr, i2, i5, zznrVar.zza(), false, iArr, i3, i60, zznmVar, zzmuVar, zzoeVar, zzlqVar, zzncVar);
    }

    private static double zzm(java.lang.Object obj, long j) {
        return ((java.lang.Double) com.google.android.gms.internal.measurement.zzol.zzf(obj, j)).doubleValue();
    }

    private static float zzn(java.lang.Object obj, long j) {
        return ((java.lang.Float) com.google.android.gms.internal.measurement.zzol.zzf(obj, j)).floatValue();
    }

    private static int zzo(java.lang.Object obj, long j) {
        return ((java.lang.Integer) com.google.android.gms.internal.measurement.zzol.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(java.lang.Object obj, long j) {
        return ((java.lang.Long) com.google.android.gms.internal.measurement.zzol.zzf(obj, j)).longValue();
    }

    private final com.google.android.gms.internal.measurement.zzmg zzu(int i) {
        int i2 = i / 3;
        return (com.google.android.gms.internal.measurement.zzmg) this.zzd[i2 + i2 + 1];
    }

    private final com.google.android.gms.internal.measurement.zzns zzv(int i) {
        java.lang.Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        com.google.android.gms.internal.measurement.zzns zznsVar = (com.google.android.gms.internal.measurement.zzns) objArr[i3];
        if (zznsVar != null) {
            return zznsVar;
        }
        com.google.android.gms.internal.measurement.zzns zznsVarZzb = com.google.android.gms.internal.measurement.zznp.zza().zzb((java.lang.Class) objArr[i3 + 1]);
        objArr[i3] = zznsVarZzb;
        return zznsVarZzb;
    }

    private final java.lang.Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final java.lang.Object zzx(java.lang.Object obj, int i) {
        com.google.android.gms.internal.measurement.zzns zznsVarZzv = zzv(i);
        int iZzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zznsVarZzv.zze();
        }
        java.lang.Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        java.lang.Object objZze = zznsVarZzv.zze();
        if (object != null) {
            zznsVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final java.lang.Object zzy(java.lang.Object obj, int i, int i2) {
        com.google.android.gms.internal.measurement.zzns zznsVarZzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zznsVarZzv.zze();
        }
        java.lang.Object object = zzb.getObject(obj, zzs(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        java.lang.Object objZze = zznsVarZzv.zze();
        if (object != null) {
            zznsVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static java.lang.reflect.Field zzz(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new java.lang.RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + java.util.Arrays.toString(declaredFields));
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x038b  */
    /* JADX WARN: Code duplicated, block: B:207:0x054c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v256, types: [int] */
    /* JADX WARN: Type inference failed for: r0v264 */
    /* JADX WARN: Type inference failed for: r0v266 */
    /* JADX WARN: Type inference failed for: r0v267 */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v276 */
    /* JADX WARN: Type inference failed for: r0v277 */
    /* JADX WARN: Type inference failed for: r0v278 */
    /* JADX WARN: Type inference failed for: r0v279 */
    /* JADX WARN: Type inference failed for: r0v280 */
    /* JADX WARN: Type inference failed for: r0v281 */
    /* JADX WARN: Type inference failed for: r0v282 */
    /* JADX WARN: Type inference failed for: r0v283 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5, types: [int] */
    /* JADX WARN: Type inference failed for: r12v6, types: [int] */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    /* JADX WARN: Type inference failed for: r12v9, types: [int] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v118, types: [int] */
    /* JADX WARN: Type inference failed for: r1v121, types: [int] */
    /* JADX WARN: Type inference failed for: r1v160 */
    /* JADX WARN: Type inference failed for: r1v163 */
    /* JADX WARN: Type inference failed for: r1v164 */
    /* JADX WARN: Type inference failed for: r1v166 */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v168 */
    /* JADX WARN: Type inference failed for: r1v78, types: [int] */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r2v31, types: [int] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [int] */
    /* JADX WARN: Type inference failed for: r2v41, types: [int] */
    /* JADX WARN: Type inference failed for: r2v45, types: [int] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54, types: [int] */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v40, types: [int] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v47, types: [int] */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30, types: [int] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v37, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zza(java.lang.Object obj) {
        int i;
        ?? r16;
        ?? r5;
        int iZzz;
        int iZzz2;
        int iZzz3;
        int iZzA;
        int iZzz4;
        int iZzz5;
        int iZzd;
        int iZzz6;
        ?? Zzg;
        int size;
        int iZzz7;
        int iZzy;
        int iZzy2;
        ?? r3;
        int iZzx;
        ?? Zzz;
        ?? Zzh;
        int iZze;
        int iZzz8;
        int iZzz9;
        ?? r4;
        ?? r6;
        ?? r1;
        sun.misc.Unsafe unsafe = zzb;
        boolean z = false;
        int i2 = 1048575;
        ?? r2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int iZza = i4 + ((com.google.android.gms.internal.measurement.zzmd) obj).zzc.zza();
                if (!this.zzh) {
                    return iZza;
                }
                com.google.android.gms.internal.measurement.zzoa zzoaVar = ((com.google.android.gms.internal.measurement.zzma) obj).zzb.zza;
                int iZzc = zzoaVar.zzc();
                int iZzb = 0;
                for (int i6 = 0; i6 < iZzc; i6++) {
                    java.util.Map.Entry entryZzg = zzoaVar.zzg(i6);
                    iZzb += com.google.android.gms.internal.measurement.zzlu.zzb((com.google.android.gms.internal.measurement.zzlt) ((com.google.android.gms.internal.measurement.zznw) entryZzg).zza(), entryZzg.getValue());
                }
                for (java.util.Map.Entry entry : zzoaVar.zzd()) {
                    iZzb += com.google.android.gms.internal.measurement.zzlu.zzb((com.google.android.gms.internal.measurement.zzlt) entry.getKey(), entry.getValue());
                }
                return iZza + iZzb;
            }
            int iZzs = zzs(i3);
            int iZzr = zzr(iZzs);
            int i7 = iArr[i3];
            int i8 = iArr[i3 + 2];
            int i9 = i8 & i2;
            if (iZzr <= 17) {
                if (i9 != i5) {
                    r1 = i9 == i2 ? z : unsafe.getInt(obj, i9);
                    i5 = i9;
                }
                i = i5;
                r16 = r1;
                r5 = 1 << (i8 >>> 20);
            } else {
                r1 = r2;
                i = i5;
                r16 = r2 == true ? 1 : 0;
                r5 = z;
            }
            int i10 = iZzs & i2;
            if (iZzr >= com.google.android.gms.internal.measurement.zzlv.DOUBLE_LIST_PACKED.zza()) {
                com.google.android.gms.internal.measurement.zzlv.SINT64_LIST_PACKED.zza();
            }
            long j = i10;
            switch (iZzr) {
                case 0:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        iZzz = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        Zzh = iZzz + 8;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 1:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        iZzz2 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        Zzh = iZzz2 + 4;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 2:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = com.google.android.gms.internal.measurement.zzlk.zzA(j2);
                        Zzh = iZzz3 + iZzA;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 3:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = com.google.android.gms.internal.measurement.zzlk.zzA(j3);
                        Zzh = iZzz3 + iZzA;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 4:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = com.google.android.gms.internal.measurement.zzlk.zzA(j4);
                        Zzh = iZzz3 + iZzA;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 5:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        iZzz = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        Zzh = iZzz + 8;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 6:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        iZzz2 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        Zzh = iZzz2 + 4;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 7:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        iZzz4 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        Zzh = iZzz4 + 1;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 8:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        int i11 = i7 << 3;
                        java.lang.Object object = unsafe.getObject(obj, j);
                        if (object instanceof com.google.android.gms.internal.measurement.zzld) {
                            iZzz5 = com.google.android.gms.internal.measurement.zzlk.zzz(i11);
                            iZzd = ((com.google.android.gms.internal.measurement.zzld) object).zzd();
                            iZzz6 = com.google.android.gms.internal.measurement.zzlk.zzz(iZzd);
                            Zzh = iZzz5 + iZzz6 + iZzd;
                            i4 += Zzh;
                        } else {
                            iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i11);
                            iZzA = com.google.android.gms.internal.measurement.zzlk.zzy((java.lang.String) object);
                            Zzh = iZzz3 + iZzA;
                            i4 += Zzh;
                        }
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 9:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        Zzh = com.google.android.gms.internal.measurement.zznu.zzh(i7, unsafe.getObject(obj, j), zzv(i3));
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 10:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        com.google.android.gms.internal.measurement.zzld zzldVar = (com.google.android.gms.internal.measurement.zzld) unsafe.getObject(obj, j);
                        iZzz5 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzd = zzldVar.zzd();
                        iZzz6 = com.google.android.gms.internal.measurement.zzlk.zzz(iZzd);
                        Zzh = iZzz5 + iZzz6 + iZzd;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 11:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = com.google.android.gms.internal.measurement.zzlk.zzz(i12);
                        Zzh = iZzz3 + iZzA;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 12:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = com.google.android.gms.internal.measurement.zzlk.zzA(j5);
                        Zzh = iZzz3 + iZzA;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 13:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        iZzz2 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        Zzh = iZzz2 + 4;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 14:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        iZzz = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        Zzh = iZzz + 8;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 15:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        int i13 = unsafe.getInt(obj, j);
                        iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = com.google.android.gms.internal.measurement.zzlk.zzz((i13 >> 31) ^ (i13 + i13));
                        Zzh = iZzz3 + iZzA;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 16:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = com.google.android.gms.internal.measurement.zzlk.zzA((j6 >> 63) ^ (j6 + j6));
                        Zzh = iZzz3 + iZzA;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 17:
                    if (zzJ(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        Zzh = com.google.android.gms.internal.measurement.zzlk.zzw(i7, (com.google.android.gms.internal.measurement.zznh) unsafe.getObject(obj, j), zzv(i3));
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 18:
                    Zzh = com.google.android.gms.internal.measurement.zznu.zzd(i7, (java.util.List) unsafe.getObject(obj, j), z);
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 19:
                    Zzh = com.google.android.gms.internal.measurement.zznu.zzb(i7, (java.util.List) unsafe.getObject(obj, j), z);
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 20:
                    java.util.List list = (java.util.List) unsafe.getObject(obj, j);
                    int i14 = com.google.android.gms.internal.measurement.zznu.zza;
                    if (list.size() == 0) {
                        Zzg = z;
                    } else {
                        Zzg = com.google.android.gms.internal.measurement.zznu.zzg(list) + (list.size() * com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3));
                    }
                    i4 += Zzg;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 21:
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, j);
                    int i15 = com.google.android.gms.internal.measurement.zznu.zza;
                    size = list2.size();
                    if (size == 0) {
                        Zzh = z;
                    } else {
                        iZzz3 = com.google.android.gms.internal.measurement.zznu.zzl(list2);
                        iZzz7 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = size * iZzz7;
                        Zzh = iZzz3 + iZzA;
                    }
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 22:
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, j);
                    int i16 = com.google.android.gms.internal.measurement.zznu.zza;
                    size = list3.size();
                    if (size == 0) {
                        Zzh = z;
                    } else {
                        iZzz3 = com.google.android.gms.internal.measurement.zznu.zzf(list3);
                        iZzz7 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = size * iZzz7;
                        Zzh = iZzz3 + iZzA;
                    }
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 23:
                    Zzh = com.google.android.gms.internal.measurement.zznu.zzd(i7, (java.util.List) unsafe.getObject(obj, j), z);
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 24:
                    Zzh = com.google.android.gms.internal.measurement.zznu.zzb(i7, (java.util.List) unsafe.getObject(obj, j), z);
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 25:
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, j);
                    int i17 = com.google.android.gms.internal.measurement.zznu.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        Zzh = z;
                    } else {
                        Zzh = size2 * (com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3) + 1);
                    }
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 26:
                    ?? r0 = (java.util.List) unsafe.getObject(obj, j);
                    int i18 = com.google.android.gms.internal.measurement.zznu.zza;
                    int size3 = r0.size();
                    if (size3 == 0) {
                        Zzg = z;
                    } else {
                        int iZzz10 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3) * size3;
                        if (r0 instanceof com.google.android.gms.internal.measurement.zzmt) {
                            com.google.android.gms.internal.measurement.zzmt zzmtVar = (com.google.android.gms.internal.measurement.zzmt) r0;
                            for (?? r7 = z; r7 < size3; r7++) {
                                java.lang.Object objZzc = zzmtVar.zzc();
                                if (objZzc instanceof com.google.android.gms.internal.measurement.zzld) {
                                    Zzg = iZzz10;
                                    int iZzd2 = ((com.google.android.gms.internal.measurement.zzld) objZzc).zzd();
                                    iZzy2 = Zzg + com.google.android.gms.internal.measurement.zzlk.zzz(iZzd2) + iZzd2;
                                } else {
                                    Zzg = iZzz10;
                                    iZzy2 = Zzg + com.google.android.gms.internal.measurement.zzlk.zzy((java.lang.String) objZzc);
                                }
                                Zzg = iZzy2;
                            }
                            Zzg = iZzz10;
                        } else {
                            for (?? r8 = z; r8 < size3; r8++) {
                                java.lang.Object obj2 = r0.get(r8);
                                if (obj2 instanceof com.google.android.gms.internal.measurement.zzld) {
                                    Zzg = iZzz10;
                                    int iZzd3 = ((com.google.android.gms.internal.measurement.zzld) obj2).zzd();
                                    iZzy = Zzg + com.google.android.gms.internal.measurement.zzlk.zzz(iZzd3) + iZzd3;
                                } else {
                                    Zzg = iZzz10;
                                    iZzy = Zzg + com.google.android.gms.internal.measurement.zzlk.zzy((java.lang.String) obj2);
                                }
                                Zzg = iZzy;
                            }
                            Zzg = iZzz10;
                        }
                    }
                    i4 += Zzg;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 27:
                    ?? r9 = (java.util.List) unsafe.getObject(obj, j);
                    com.google.android.gms.internal.measurement.zzns zznsVarZzv = zzv(i3);
                    int i19 = com.google.android.gms.internal.measurement.zznu.zza;
                    int size4 = r9.size();
                    if (size4 == 0) {
                        r3 = z;
                    } else {
                        int iZzz11 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3) * size4;
                        for (?? r10 = z; r10 < size4; r10++) {
                            java.lang.Object obj3 = r9.get(r10);
                            if (obj3 instanceof com.google.android.gms.internal.measurement.zzms) {
                                r3 = iZzz11;
                                int iZza2 = ((com.google.android.gms.internal.measurement.zzms) obj3).zza();
                                iZzx = (r3 == true ? 1 : 0) + com.google.android.gms.internal.measurement.zzlk.zzz(iZza2) + iZza2;
                            } else {
                                r3 = iZzz11;
                                iZzx = (r3 == true ? 1 : 0) + com.google.android.gms.internal.measurement.zzlk.zzx((com.google.android.gms.internal.measurement.zznh) obj3, zznsVarZzv);
                            }
                            r3 = iZzx;
                        }
                        r3 = iZzz11;
                    }
                    i4 += r3;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 28:
                    ?? r11 = (java.util.List) unsafe.getObject(obj, j);
                    int i20 = com.google.android.gms.internal.measurement.zznu.zza;
                    int size5 = r11.size();
                    if (size5 == 0) {
                        Zzz = z;
                    } else {
                        Zzz = size5 * com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        for (?? r12 = z; r12 < r11.size(); r12++) {
                            int iZzd4 = ((com.google.android.gms.internal.measurement.zzld) r11.get(r12)).zzd();
                            Zzz += com.google.android.gms.internal.measurement.zzlk.zzz(iZzd4) + iZzd4;
                        }
                    }
                    i4 += Zzz;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 29:
                    java.util.List list5 = (java.util.List) unsafe.getObject(obj, j);
                    int i21 = com.google.android.gms.internal.measurement.zznu.zza;
                    size = list5.size();
                    if (size == 0) {
                        Zzh = z;
                    } else {
                        iZzz3 = com.google.android.gms.internal.measurement.zznu.zzk(list5);
                        iZzz7 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = size * iZzz7;
                        Zzh = iZzz3 + iZzA;
                    }
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 30:
                    java.util.List list6 = (java.util.List) unsafe.getObject(obj, j);
                    int i22 = com.google.android.gms.internal.measurement.zznu.zza;
                    size = list6.size();
                    if (size == 0) {
                        Zzh = z;
                    } else {
                        iZzz3 = com.google.android.gms.internal.measurement.zznu.zza(list6);
                        iZzz7 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = size * iZzz7;
                        Zzh = iZzz3 + iZzA;
                    }
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 31:
                    Zzh = com.google.android.gms.internal.measurement.zznu.zzb(i7, (java.util.List) unsafe.getObject(obj, j), z);
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 32:
                    Zzh = com.google.android.gms.internal.measurement.zznu.zzd(i7, (java.util.List) unsafe.getObject(obj, j), z);
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 33:
                    java.util.List list7 = (java.util.List) unsafe.getObject(obj, j);
                    int i23 = com.google.android.gms.internal.measurement.zznu.zza;
                    size = list7.size();
                    if (size == 0) {
                        Zzh = z;
                    } else {
                        iZzz3 = com.google.android.gms.internal.measurement.zznu.zzi(list7);
                        iZzz7 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = size * iZzz7;
                        Zzh = iZzz3 + iZzA;
                    }
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 34:
                    java.util.List list8 = (java.util.List) unsafe.getObject(obj, j);
                    int i24 = com.google.android.gms.internal.measurement.zznu.zza;
                    size = list8.size();
                    if (size == 0) {
                        Zzh = z;
                    } else {
                        iZzz3 = com.google.android.gms.internal.measurement.zznu.zzj(list8);
                        iZzz7 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = size * iZzz7;
                        Zzh = iZzz3 + iZzA;
                    }
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 35:
                    iZze = com.google.android.gms.internal.measurement.zznu.zze((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz8 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzz9 = com.google.android.gms.internal.measurement.zzlk.zzz(iZze);
                        Zzz = iZzz8 + iZzz9 + iZze;
                        i4 += Zzz;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 36:
                    iZze = com.google.android.gms.internal.measurement.zznu.zzc((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz8 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzz9 = com.google.android.gms.internal.measurement.zzlk.zzz(iZze);
                        Zzz = iZzz8 + iZzz9 + iZze;
                        i4 += Zzz;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 37:
                    iZze = com.google.android.gms.internal.measurement.zznu.zzg((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz8 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzz9 = com.google.android.gms.internal.measurement.zzlk.zzz(iZze);
                        Zzz = iZzz8 + iZzz9 + iZze;
                        i4 += Zzz;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 38:
                    iZze = com.google.android.gms.internal.measurement.zznu.zzl((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz8 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzz9 = com.google.android.gms.internal.measurement.zzlk.zzz(iZze);
                        Zzz = iZzz8 + iZzz9 + iZze;
                        i4 += Zzz;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 39:
                    iZze = com.google.android.gms.internal.measurement.zznu.zzf((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz8 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzz9 = com.google.android.gms.internal.measurement.zzlk.zzz(iZze);
                        Zzz = iZzz8 + iZzz9 + iZze;
                        i4 += Zzz;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 40:
                    iZze = com.google.android.gms.internal.measurement.zznu.zze((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz8 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzz9 = com.google.android.gms.internal.measurement.zzlk.zzz(iZze);
                        Zzz = iZzz8 + iZzz9 + iZze;
                        i4 += Zzz;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 41:
                    iZze = com.google.android.gms.internal.measurement.zznu.zzc((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz8 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzz9 = com.google.android.gms.internal.measurement.zzlk.zzz(iZze);
                        Zzz = iZzz8 + iZzz9 + iZze;
                        i4 += Zzz;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 42:
                    java.util.List list9 = (java.util.List) unsafe.getObject(obj, j);
                    int i25 = com.google.android.gms.internal.measurement.zznu.zza;
                    iZze = list9.size();
                    if (iZze > 0) {
                        iZzz8 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzz9 = com.google.android.gms.internal.measurement.zzlk.zzz(iZze);
                        Zzz = iZzz8 + iZzz9 + iZze;
                        i4 += Zzz;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 43:
                    iZze = com.google.android.gms.internal.measurement.zznu.zzk((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz8 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzz9 = com.google.android.gms.internal.measurement.zzlk.zzz(iZze);
                        Zzz = iZzz8 + iZzz9 + iZze;
                        i4 += Zzz;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 44:
                    iZze = com.google.android.gms.internal.measurement.zznu.zza((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz8 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzz9 = com.google.android.gms.internal.measurement.zzlk.zzz(iZze);
                        Zzz = iZzz8 + iZzz9 + iZze;
                        i4 += Zzz;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 45:
                    iZze = com.google.android.gms.internal.measurement.zznu.zzc((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz8 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzz9 = com.google.android.gms.internal.measurement.zzlk.zzz(iZze);
                        Zzz = iZzz8 + iZzz9 + iZze;
                        i4 += Zzz;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 46:
                    iZze = com.google.android.gms.internal.measurement.zznu.zze((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz8 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzz9 = com.google.android.gms.internal.measurement.zzlk.zzz(iZze);
                        Zzz = iZzz8 + iZzz9 + iZze;
                        i4 += Zzz;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 47:
                    iZze = com.google.android.gms.internal.measurement.zznu.zzi((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz8 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzz9 = com.google.android.gms.internal.measurement.zzlk.zzz(iZze);
                        Zzz = iZzz8 + iZzz9 + iZze;
                        i4 += Zzz;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 48:
                    iZze = com.google.android.gms.internal.measurement.zznu.zzj((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzz8 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzz9 = com.google.android.gms.internal.measurement.zzlk.zzz(iZze);
                        Zzz = iZzz8 + iZzz9 + iZze;
                        i4 += Zzz;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 49:
                    ?? r13 = (java.util.List) unsafe.getObject(obj, j);
                    com.google.android.gms.internal.measurement.zzns zznsVarZzv2 = zzv(i3);
                    int i26 = com.google.android.gms.internal.measurement.zznu.zza;
                    int size6 = r13.size();
                    if (size6 == 0) {
                        r4 = z;
                    } else {
                        boolean z2 = z;
                        r4 = z2;
                        while (r6 < size6) {
                            r6 = z2;
                            int iZzw = com.google.android.gms.internal.measurement.zzlk.zzw(i7, (com.google.android.gms.internal.measurement.zznh) r13.get(r6), zznsVarZzv2);
                            r6++;
                            r4 = (r4 == true ? 1 : 0) + iZzw;
                        }
                        r6 = z2;
                    }
                    i4 += r4;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 50:
                    com.google.android.gms.internal.measurement.zznb zznbVar = (com.google.android.gms.internal.measurement.zznb) unsafe.getObject(obj, j);
                    if (zznbVar.isEmpty()) {
                        continue;
                    } else {
                        java.util.Iterator it = zznbVar.entrySet().iterator();
                        if (it.hasNext()) {
                            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                case 51:
                    if (zzM(obj, i7, i3)) {
                        iZzz = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        Zzh = iZzz + 8;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 52:
                    if (zzM(obj, i7, i3)) {
                        iZzz2 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        Zzh = iZzz2 + 4;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 53:
                    if (zzM(obj, i7, i3)) {
                        long jZzt = zzt(obj, j);
                        iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = com.google.android.gms.internal.measurement.zzlk.zzA(jZzt);
                        Zzh = iZzz3 + iZzA;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 54:
                    if (zzM(obj, i7, i3)) {
                        long jZzt2 = zzt(obj, j);
                        iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = com.google.android.gms.internal.measurement.zzlk.zzA(jZzt2);
                        Zzh = iZzz3 + iZzA;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 55:
                    if (zzM(obj, i7, i3)) {
                        long jZzo = zzo(obj, j);
                        iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = com.google.android.gms.internal.measurement.zzlk.zzA(jZzo);
                        Zzh = iZzz3 + iZzA;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 56:
                    if (zzM(obj, i7, i3)) {
                        iZzz = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        Zzh = iZzz + 8;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 57:
                    if (zzM(obj, i7, i3)) {
                        iZzz2 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        Zzh = iZzz2 + 4;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 58:
                    if (zzM(obj, i7, i3)) {
                        iZzz4 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        Zzh = iZzz4 + 1;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 59:
                    if (zzM(obj, i7, i3)) {
                        int i27 = i7 << 3;
                        java.lang.Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof com.google.android.gms.internal.measurement.zzld) {
                            iZzz5 = com.google.android.gms.internal.measurement.zzlk.zzz(i27);
                            iZzd = ((com.google.android.gms.internal.measurement.zzld) object2).zzd();
                            iZzz6 = com.google.android.gms.internal.measurement.zzlk.zzz(iZzd);
                            Zzh = iZzz5 + iZzz6 + iZzd;
                            i4 += Zzh;
                        } else {
                            iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i27);
                            iZzA = com.google.android.gms.internal.measurement.zzlk.zzy((java.lang.String) object2);
                            Zzh = iZzz3 + iZzA;
                            i4 += Zzh;
                        }
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 60:
                    if (zzM(obj, i7, i3)) {
                        Zzh = com.google.android.gms.internal.measurement.zznu.zzh(i7, unsafe.getObject(obj, j), zzv(i3));
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 61:
                    if (zzM(obj, i7, i3)) {
                        com.google.android.gms.internal.measurement.zzld zzldVar2 = (com.google.android.gms.internal.measurement.zzld) unsafe.getObject(obj, j);
                        iZzz5 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzd = zzldVar2.zzd();
                        iZzz6 = com.google.android.gms.internal.measurement.zzlk.zzz(iZzd);
                        Zzh = iZzz5 + iZzz6 + iZzd;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 62:
                    if (zzM(obj, i7, i3)) {
                        int iZzo = zzo(obj, j);
                        iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = com.google.android.gms.internal.measurement.zzlk.zzz(iZzo);
                        Zzh = iZzz3 + iZzA;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 63:
                    if (zzM(obj, i7, i3)) {
                        long jZzo2 = zzo(obj, j);
                        iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = com.google.android.gms.internal.measurement.zzlk.zzA(jZzo2);
                        Zzh = iZzz3 + iZzA;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 64:
                    if (zzM(obj, i7, i3)) {
                        iZzz2 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        Zzh = iZzz2 + 4;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 65:
                    if (zzM(obj, i7, i3)) {
                        iZzz = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        Zzh = iZzz + 8;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 66:
                    if (zzM(obj, i7, i3)) {
                        int iZzo2 = zzo(obj, j);
                        iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = com.google.android.gms.internal.measurement.zzlk.zzz((iZzo2 >> 31) ^ (iZzo2 + iZzo2));
                        Zzh = iZzz3 + iZzA;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 67:
                    if (zzM(obj, i7, i3)) {
                        long jZzt3 = zzt(obj, j);
                        iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(i7 << 3);
                        iZzA = com.google.android.gms.internal.measurement.zzlk.zzA((jZzt3 >> 63) ^ (jZzt3 + jZzt3));
                        Zzh = iZzz3 + iZzA;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 68:
                    if (zzM(obj, i7, i3)) {
                        Zzh = com.google.android.gms.internal.measurement.zzlk.zzw(i7, (com.google.android.gms.internal.measurement.zznh) unsafe.getObject(obj, j), zzv(i3));
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                default:
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zzb(java.lang.Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int iHashCode = (i4 * 53) + ((com.google.android.gms.internal.measurement.zzmd) obj).zzc.hashCode();
                return this.zzh ? (iHashCode * 53) + ((com.google.android.gms.internal.measurement.zzma) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzs = zzs(i3);
            int i5 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i6 = iArr[i3];
            long j = i5;
            int iHashCode2 = 37;
            switch (iZzr) {
                case 0:
                    i = i4 * 53;
                    jDoubleToLongBits = java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzol.zza(obj, j));
                    byte[] bArr = com.google.android.gms.internal.measurement.zzmk.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    iFloatToIntBits = java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzol.zzb(obj, j));
                    i4 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    jDoubleToLongBits = com.google.android.gms.internal.measurement.zzol.zzd(obj, j);
                    byte[] bArr2 = com.google.android.gms.internal.measurement.zzmk.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    jDoubleToLongBits = com.google.android.gms.internal.measurement.zzol.zzd(obj, j);
                    byte[] bArr3 = com.google.android.gms.internal.measurement.zzmk.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.measurement.zzol.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    jDoubleToLongBits = com.google.android.gms.internal.measurement.zzol.zzd(obj, j);
                    byte[] bArr4 = com.google.android.gms.internal.measurement.zzmk.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.measurement.zzol.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.measurement.zzmk.zza(com.google.android.gms.internal.measurement.zzol.zzw(obj, j));
                    i4 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    iFloatToIntBits = ((java.lang.String) com.google.android.gms.internal.measurement.zzol.zzf(obj, j)).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    java.lang.Object objZzf = com.google.android.gms.internal.measurement.zzol.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i4 = i2 + iHashCode2;
                    break;
                case 10:
                    i = i4 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.measurement.zzol.zzf(obj, j).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.measurement.zzol.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.measurement.zzol.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.measurement.zzol.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    jDoubleToLongBits = com.google.android.gms.internal.measurement.zzol.zzd(obj, j);
                    byte[] bArr5 = com.google.android.gms.internal.measurement.zzmk.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.measurement.zzol.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    jDoubleToLongBits = com.google.android.gms.internal.measurement.zzol.zzd(obj, j);
                    byte[] bArr6 = com.google.android.gms.internal.measurement.zzmk.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    java.lang.Object objZzf2 = com.google.android.gms.internal.measurement.zzol.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode2 = objZzf2.hashCode();
                    }
                    i4 = i2 + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i4 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.measurement.zzol.zzf(obj, j).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.measurement.zzol.zzf(obj, j).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = java.lang.Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = com.google.android.gms.internal.measurement.zzmk.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = java.lang.Float.floatToIntBits(zzn(obj, j));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = com.google.android.gms.internal.measurement.zzmk.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = com.google.android.gms.internal.measurement.zzmk.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = com.google.android.gms.internal.measurement.zzmk.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = com.google.android.gms.internal.measurement.zzmk.zza(zzN(obj, j));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = ((java.lang.String) com.google.android.gms.internal.measurement.zzol.zzf(obj, j)).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = com.google.android.gms.internal.measurement.zzol.zzf(obj, j).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = com.google.android.gms.internal.measurement.zzol.zzf(obj, j).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = com.google.android.gms.internal.measurement.zzmk.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = com.google.android.gms.internal.measurement.zzmk.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzM(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = com.google.android.gms.internal.measurement.zzol.zzf(obj, j).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
            }
            i3 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0258  */
    /* JADX WARN: Code duplicated, block: B:103:0x025c  */
    /* JADX WARN: Code duplicated, block: B:106:0x027a  */
    /* JADX WARN: Code duplicated, block: B:108:0x027e  */
    /* JADX WARN: Code duplicated, block: B:117:0x02db  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:133:0x032f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0331  */
    /* JADX WARN: Code duplicated, block: B:165:0x0421  */
    /* JADX WARN: Code duplicated, block: B:167:0x0427  */
    /* JADX WARN: Code duplicated, block: B:168:0x042a  */
    /* JADX WARN: Code duplicated, block: B:176:0x0482  */
    /* JADX WARN: Code duplicated, block: B:177:0x0492  */
    /* JADX WARN: Code duplicated, block: B:180:0x049a  */
    /* JADX WARN: Code duplicated, block: B:182:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:183:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:185:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:187:0x04d4 A[LOOP:3: B:186:0x04d2->B:187:0x04d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:192:0x04f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:195:0x0509  */
    /* JADX WARN: Code duplicated, block: B:197:0x0513 A[LOOP:4: B:194:0x0507->B:197:0x0513, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x0526  */
    /* JADX WARN: Code duplicated, block: B:200:0x052f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0534  */
    /* JADX WARN: Code duplicated, block: B:204:0x0541 A[LOOP:5: B:203:0x053f->B:204:0x0541, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x0558 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:210:0x055a  */
    /* JADX WARN: Code duplicated, block: B:212:0x056d  */
    /* JADX WARN: Code duplicated, block: B:214:0x0575 A[LOOP:6: B:211:0x056b->B:214:0x0575, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:216:0x058c  */
    /* JADX WARN: Code duplicated, block: B:218:0x0591  */
    /* JADX WARN: Code duplicated, block: B:219:0x059d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:220:0x059f  */
    /* JADX WARN: Code duplicated, block: B:223:0x05be  */
    /* JADX WARN: Code duplicated, block: B:225:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:227:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:229:0x05df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:230:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:232:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:235:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:236:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:239:0x060c  */
    /* JADX WARN: Code duplicated, block: B:242:0x0624  */
    /* JADX WARN: Code duplicated, block: B:245:0x0634  */
    /* JADX WARN: Code duplicated, block: B:247:0x063e  */
    /* JADX WARN: Code duplicated, block: B:249:0x064a  */
    /* JADX WARN: Code duplicated, block: B:251:0x0652  */
    /* JADX WARN: Code duplicated, block: B:253:0x0656 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:254:0x0658  */
    /* JADX WARN: Code duplicated, block: B:255:0x065e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0668  */
    /* JADX WARN: Code duplicated, block: B:260:0x0670  */
    /* JADX WARN: Code duplicated, block: B:262:0x0678  */
    /* JADX WARN: Code duplicated, block: B:264:0x067c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:276:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:277:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:279:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:280:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:282:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:284:0x0702  */
    /* JADX WARN: Code duplicated, block: B:286:0x070a  */
    /* JADX WARN: Code duplicated, block: B:288:0x0712 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:289:0x0714  */
    /* JADX WARN: Code duplicated, block: B:290:0x071a  */
    /* JADX WARN: Code duplicated, block: B:293:0x0729  */
    /* JADX WARN: Code duplicated, block: B:295:0x0731  */
    /* JADX WARN: Code duplicated, block: B:297:0x0739 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:305:0x075e  */
    /* JADX WARN: Code duplicated, block: B:307:0x0768 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:308:0x076a  */
    /* JADX WARN: Code duplicated, block: B:309:0x0770  */
    /* JADX WARN: Code duplicated, block: B:311:0x0778  */
    /* JADX WARN: Code duplicated, block: B:313:0x0787  */
    /* JADX WARN: Code duplicated, block: B:315:0x078f  */
    /* JADX WARN: Code duplicated, block: B:317:0x0797 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:321:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:331:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:332:0x07da  */
    /* JADX WARN: Code duplicated, block: B:334:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:336:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:338:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:339:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:345:0x080e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:346:0x0810  */
    /* JADX WARN: Code duplicated, block: B:348:0x081f  */
    /* JADX WARN: Code duplicated, block: B:349:0x0821  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:352:0x0828  */
    /* JADX WARN: Code duplicated, block: B:354:0x0830  */
    /* JADX WARN: Code duplicated, block: B:356:0x083a  */
    /* JADX WARN: Code duplicated, block: B:357:0x083c  */
    /* JADX WARN: Code duplicated, block: B:359:0x0842  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:361:0x084c  */
    /* JADX WARN: Code duplicated, block: B:363:0x085c  */
    /* JADX WARN: Code duplicated, block: B:365:0x0868 A[LOOP:14: B:364:0x0866->B:365:0x0868, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:372:0x0882  */
    /* JADX WARN: Code duplicated, block: B:374:0x0885  */
    /* JADX WARN: Code duplicated, block: B:376:0x0895  */
    /* JADX WARN: Code duplicated, block: B:378:0x089d A[LOOP:15: B:375:0x0893->B:378:0x089d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:379:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:381:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:383:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:385:0x08cd A[LOOP:16: B:384:0x08cb->B:385:0x08cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:392:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:394:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:396:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:398:0x0901 A[LOOP:17: B:395:0x08f7->B:398:0x0901, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:400:0x090e  */
    /* JADX WARN: Code duplicated, block: B:402:0x0918  */
    /* JADX WARN: Code duplicated, block: B:405:0x0922 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:406:0x0924  */
    /* JADX WARN: Code duplicated, block: B:408:0x0939  */
    /* JADX WARN: Code duplicated, block: B:410:0x093f  */
    /* JADX WARN: Code duplicated, block: B:412:0x094c  */
    /* JADX WARN: Code duplicated, block: B:414:0x095a A[LOOP:18: B:413:0x0958->B:414:0x095a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:419:0x096d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:420:0x096f  */
    /* JADX WARN: Code duplicated, block: B:422:0x097f  */
    /* JADX WARN: Code duplicated, block: B:424:0x0987 A[LOOP:19: B:421:0x097d->B:424:0x0987, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:426:0x0993  */
    /* JADX WARN: Code duplicated, block: B:428:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:430:0x09b0  */
    /* JADX WARN: Code duplicated, block: B:432:0x09bc A[LOOP:20: B:431:0x09ba->B:432:0x09bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:439:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:441:0x09dc  */
    /* JADX WARN: Code duplicated, block: B:443:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:445:0x09f8 A[LOOP:21: B:442:0x09ee->B:445:0x09f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:447:0x0a0a  */
    /* JADX WARN: Code duplicated, block: B:449:0x0a17  */
    /* JADX WARN: Code duplicated, block: B:451:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:453:0x0a33 A[LOOP:22: B:452:0x0a31->B:453:0x0a33, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:456:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:461:0x0a5d  */
    /* JADX WARN: Code duplicated, block: B:463:0x0a64  */
    /* JADX WARN: Code duplicated, block: B:465:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:467:0x0a80 A[LOOP:23: B:464:0x0a76->B:467:0x0a80, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:470:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:472:0x0a9b A[LOOP:2: B:469:0x0a91->B:472:0x0a9b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:473:0x0aae A[PHI: r0 r7 r9 r12 r13 r26 r40
  0x0aae: PHI (r0v64 'this' com.google.android.gms.internal.measurement.zznk<T>) = 
  (r0v1 'this' com.google.android.gms.internal.measurement.zznk<T>)
  (r0v62 'this' com.google.android.gms.internal.measurement.zznk<T>)
  (r0v1 'this' com.google.android.gms.internal.measurement.zznk<T>)
  (r0v1 'this' com.google.android.gms.internal.measurement.zznk<T>)
 binds: [B:462:0x0a62, B:246:0x0636, B:199:0x0526, B:181:0x04a3] A[DONT_GENERATE, DONT_INLINE]
  0x0aae: PHI (r7v41 int) = (r7v13 int), (r7v35 int), (r7v38 int), (r7v44 int) binds: [B:462:0x0a62, B:246:0x0636, B:199:0x0526, B:181:0x04a3] A[DONT_GENERATE, DONT_INLINE]
  0x0aae: PHI (r9v99 com.google.android.gms.internal.measurement.zzks) = 
  (r9v56 com.google.android.gms.internal.measurement.zzks)
  (r9v93 com.google.android.gms.internal.measurement.zzks)
  (r9v96 com.google.android.gms.internal.measurement.zzks)
  (r9v102 com.google.android.gms.internal.measurement.zzks)
 binds: [B:462:0x0a62, B:246:0x0636, B:199:0x0526, B:181:0x04a3] A[DONT_GENERATE, DONT_INLINE]
  0x0aae: PHI (r12v61 sun.misc.Unsafe) = (r12v11 sun.misc.Unsafe), (r12v51 sun.misc.Unsafe), (r12v56 sun.misc.Unsafe), (r12v64 sun.misc.Unsafe) binds: [B:462:0x0a62, B:246:0x0636, B:199:0x0526, B:181:0x04a3] A[DONT_GENERATE, DONT_INLINE]
  0x0aae: PHI (r13v81 int) = (r13v56 int), (r13v75 int), (r13v78 int), (r13v85 int) binds: [B:462:0x0a62, B:246:0x0636, B:199:0x0526, B:181:0x04a3] A[DONT_GENERATE, DONT_INLINE]
  0x0aae: PHI (r26v18 int) = (r26v14 int), (r26v6 int), (r26v6 int), (r26v6 int) binds: [B:462:0x0a62, B:246:0x0636, B:199:0x0526, B:181:0x04a3] A[DONT_GENERATE, DONT_INLINE]
  0x0aae: PHI (r40v31 int) = (r40v4 int), (r40v25 int), (r40v28 int), (r40v33 int) binds: [B:462:0x0a62, B:246:0x0636, B:199:0x0526, B:181:0x04a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:484:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:487:0x0b10  */
    /* JADX WARN: Code duplicated, block: B:489:0x0b1e  */
    /* JADX WARN: Code duplicated, block: B:491:0x0b30 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:492:0x0b38  */
    /* JADX WARN: Code duplicated, block: B:494:0x0b3b  */
    /* JADX WARN: Code duplicated, block: B:495:0x0b66  */
    /* JADX WARN: Code duplicated, block: B:497:0x0b6d  */
    /* JADX WARN: Code duplicated, block: B:498:0x0b8c  */
    /* JADX WARN: Code duplicated, block: B:499:0x0b90  */
    /* JADX WARN: Code duplicated, block: B:501:0x0b99  */
    /* JADX WARN: Code duplicated, block: B:502:0x0bae  */
    /* JADX WARN: Code duplicated, block: B:504:0x0bb7  */
    /* JADX WARN: Code duplicated, block: B:510:0x0bd7  */
    /* JADX WARN: Code duplicated, block: B:511:0x0be2  */
    /* JADX WARN: Code duplicated, block: B:513:0x0bec  */
    /* JADX WARN: Code duplicated, block: B:515:0x0bfe  */
    /* JADX WARN: Code duplicated, block: B:517:0x0c08  */
    /* JADX WARN: Code duplicated, block: B:518:0x0c28 A[PHI: r4 r8 r9 r13 r14
  0x0c28: PHI (r4v51 int) = (r4v43 int), (r4v46 int), (r4v47 int), (r4v50 int), (r4v53 int) binds: [B:516:0x0c06, B:512:0x0bea, B:503:0x0bb5, B:500:0x0b97, B:498:0x0b8c] A[DONT_GENERATE, DONT_INLINE]
  0x0c28: PHI (r8v66 java.lang.Object) = 
  (r8v61 java.lang.Object)
  (r8v62 java.lang.Object)
  (r8v63 java.lang.Object)
  (r8v65 java.lang.Object)
  (r8v67 java.lang.Object)
 binds: [B:516:0x0c06, B:512:0x0bea, B:503:0x0bb5, B:500:0x0b97, B:498:0x0b8c] A[DONT_GENERATE, DONT_INLINE]
  0x0c28: PHI (r9v48 int) = (r9v43 int), (r9v44 int), (r9v45 int), (r9v47 int), (r9v49 int) binds: [B:516:0x0c06, B:512:0x0bea, B:503:0x0bb5, B:500:0x0b97, B:498:0x0b8c] A[DONT_GENERATE, DONT_INLINE]
  0x0c28: PHI (r13v49 int) = (r13v44 int), (r13v45 int), (r13v46 int), (r13v48 int), (r13v50 int) binds: [B:516:0x0c06, B:512:0x0bea, B:503:0x0bb5, B:500:0x0b97, B:498:0x0b8c] A[DONT_GENERATE, DONT_INLINE]
  0x0c28: PHI (r14v47 int) = (r14v42 int), (r14v43 int), (r14v44 int), (r14v46 int), (r14v48 int) binds: [B:516:0x0c06, B:512:0x0bea, B:503:0x0bb5, B:500:0x0b97, B:498:0x0b8c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:519:0x0c2d  */
    /* JADX WARN: Code duplicated, block: B:521:0x0c36  */
    /* JADX WARN: Code duplicated, block: B:523:0x0c3e  */
    /* JADX WARN: Code duplicated, block: B:524:0x0c42  */
    /* JADX WARN: Code duplicated, block: B:533:0x0c65  */
    /* JADX WARN: Code duplicated, block: B:535:0x0c6d  */
    /* JADX WARN: Code duplicated, block: B:537:0x0c77  */
    /* JADX WARN: Code duplicated, block: B:538:0x0c79  */
    /* JADX WARN: Code duplicated, block: B:540:0x0c87  */
    /* JADX WARN: Code duplicated, block: B:542:0x0c90  */
    /* JADX WARN: Code duplicated, block: B:543:0x0ca2  */
    /* JADX WARN: Code duplicated, block: B:545:0x0cab  */
    /* JADX WARN: Code duplicated, block: B:546:0x0cbd  */
    /* JADX WARN: Code duplicated, block: B:548:0x0cc5  */
    /* JADX WARN: Code duplicated, block: B:549:0x0cd6  */
    /* JADX WARN: Code duplicated, block: B:551:0x0cde  */
    /* JADX WARN: Code duplicated, block: B:553:0x0cf0  */
    /* JADX WARN: Code duplicated, block: B:555:0x0cf9  */
    /* JADX WARN: Code duplicated, block: B:556:0x0d0e  */
    /* JADX WARN: Code duplicated, block: B:558:0x0d17  */
    /* JADX WARN: Code duplicated, block: B:559:0x0d2c A[PHI: r4 r8 r9 r13 r14 r26
  0x0d2c: PHI (r4v60 sun.misc.Unsafe) = 
  (r4v34 sun.misc.Unsafe)
  (r4v35 sun.misc.Unsafe)
  (r4v36 sun.misc.Unsafe)
  (r4v37 sun.misc.Unsafe)
  (r4v38 sun.misc.Unsafe)
  (r4v39 sun.misc.Unsafe)
  (r4v41 sun.misc.Unsafe)
  (r4v42 sun.misc.Unsafe)
  (r4v52 sun.misc.Unsafe)
  (r4v61 sun.misc.Unsafe)
 binds: [B:557:0x0d15, B:554:0x0cf7, B:550:0x0cdc, B:547:0x0cc3, B:544:0x0ca9, B:541:0x0c8e, B:534:0x0c6b, B:520:0x0c34, B:518:0x0c28, B:491:0x0b30] A[DONT_GENERATE, DONT_INLINE]
  0x0d2c: PHI (r8v72 java.lang.Object) = 
  (r8v52 java.lang.Object)
  (r8v53 java.lang.Object)
  (r8v54 java.lang.Object)
  (r8v55 java.lang.Object)
  (r8v56 java.lang.Object)
  (r8v57 java.lang.Object)
  (r8v59 java.lang.Object)
  (r8v60 java.lang.Object)
  (r8v66 java.lang.Object)
  (r8v73 java.lang.Object)
 binds: [B:557:0x0d15, B:554:0x0cf7, B:550:0x0cdc, B:547:0x0cc3, B:544:0x0ca9, B:541:0x0c8e, B:534:0x0c6b, B:520:0x0c34, B:518:0x0c28, B:491:0x0b30] A[DONT_GENERATE, DONT_INLINE]
  0x0d2c: PHI (r9v53 int) = 
  (r9v34 int)
  (r9v35 int)
  (r9v36 int)
  (r9v37 int)
  (r9v38 int)
  (r9v39 int)
  (r9v41 int)
  (r9v42 int)
  (r9v48 int)
  (r9v54 int)
 binds: [B:557:0x0d15, B:554:0x0cf7, B:550:0x0cdc, B:547:0x0cc3, B:544:0x0ca9, B:541:0x0c8e, B:534:0x0c6b, B:520:0x0c34, B:518:0x0c28, B:491:0x0b30] A[DONT_GENERATE, DONT_INLINE]
  0x0d2c: PHI (r13v54 int) = 
  (r13v35 int)
  (r13v36 int)
  (r13v37 int)
  (r13v38 int)
  (r13v39 int)
  (r13v40 int)
  (r13v42 int)
  (r13v43 int)
  (r13v49 int)
  (r13v55 int)
 binds: [B:557:0x0d15, B:554:0x0cf7, B:550:0x0cdc, B:547:0x0cc3, B:544:0x0ca9, B:541:0x0c8e, B:534:0x0c6b, B:520:0x0c34, B:518:0x0c28, B:491:0x0b30] A[DONT_GENERATE, DONT_INLINE]
  0x0d2c: PHI (r14v54 int) = 
  (r14v33 int)
  (r14v34 int)
  (r14v35 int)
  (r14v36 int)
  (r14v37 int)
  (r14v38 int)
  (r14v40 int)
  (r14v41 int)
  (r14v47 int)
  (r14v55 int)
 binds: [B:557:0x0d15, B:554:0x0cf7, B:550:0x0cdc, B:547:0x0cc3, B:544:0x0ca9, B:541:0x0c8e, B:534:0x0c6b, B:520:0x0c34, B:518:0x0c28, B:491:0x0b30] A[DONT_GENERATE, DONT_INLINE]
  0x0d2c: PHI (r26v13 int) = 
  (r26v7 int)
  (r26v7 int)
  (r26v7 int)
  (r26v7 int)
  (r26v7 int)
  (r26v7 int)
  (r26v7 int)
  (r26v7 int)
  (r26v10 int)
  (r26v7 int)
 binds: [B:557:0x0d15, B:554:0x0cf7, B:550:0x0cdc, B:547:0x0cc3, B:544:0x0ca9, B:541:0x0c8e, B:534:0x0c6b, B:520:0x0c34, B:518:0x0c28, B:491:0x0b30] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:564:0x0d49 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:568:0x0d5f  */
    /* JADX WARN: Code duplicated, block: B:570:0x0d69  */
    /* JADX WARN: Code duplicated, block: B:572:0x0d73  */
    /* JADX WARN: Code duplicated, block: B:575:0x0d89  */
    /* JADX WARN: Code duplicated, block: B:57:0x0177  */
    /* JADX WARN: Code duplicated, block: B:607:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x0415 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x04ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x06a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x06a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x0692 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x068c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x0758 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x074a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x07cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x07c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x07b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x07b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x0808 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x087c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x0876 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x08e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x08da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x0967 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x09d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x09cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x0a57 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x0a51 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x0ab3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x0aec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x0d2f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x0d85 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x03f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x037c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x03af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x0d42 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x02d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x0301 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x0471 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x0ae9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0ad2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x0ac5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x0459 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:0x0ab1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:0x0523 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:0x0583 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:0x0583 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:0x061c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:0x0606 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:722:0x0698 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:0x0684 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:0x067e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:0x0750 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x073f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:0x073b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:0x07bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:0x079d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:740:0x0799 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:0x091c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:0x091c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:0x091c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x01df  */
    /* JADX WARN: Code duplicated, block: B:760:0x0991 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:0x0935 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:0x0a8e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:0x020c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:770:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:0x020c A[EDGE_INSN: B:774:0x020c->B:772:0x020c BREAK  A[LOOP:26: B:87:0x021e->B:91:0x022a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:0x020c A[EDGE_INSN: B:775:0x020c->B:772:0x020c BREAK  A[LOOP:26: B:87:0x021e->B:91:0x022a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x0202 A[LOOP:24: B:79:0x01f8->B:82:0x0202, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x020e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0222  */
    /* JADX WARN: Code duplicated, block: B:91:0x022a A[LOOP:26: B:87:0x021e->B:91:0x022a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0236 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0238  */
    /* JADX WARN: Code duplicated, block: B:99:0x0250  */
    final int zzc(java.lang.Object obj, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.measurement.zzks zzksVar) throws java.io.IOException {
        java.lang.Object obj2;
        com.google.android.gms.internal.measurement.zznk<T> zznkVar;
        int i4;
        int i5;
        int i6;
        int iZzi;
        int i7;
        int i8;
        int iZzq;
        int i9;
        int i10;
        int i11;
        int i12;
        com.google.android.gms.internal.measurement.zzks zzksVar2;
        int i13;
        com.google.android.gms.internal.measurement.zzlp zzlpVar;
        com.google.android.gms.internal.measurement.zznh zznhVar;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int iZzr;
        long j;
        java.lang.String str;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z;
        int i24;
        int i25;
        int i26;
        int i27;
        int length;
        int i28;
        char[] cArr;
        int i29;
        int i30;
        int i31;
        byte b;
        int i32;
        byte b2;
        int i33;
        java.lang.String str2;
        byte b3;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        sun.misc.Unsafe unsafe;
        int i40;
        com.google.android.gms.internal.measurement.zzks zzksVar3;
        int i41;
        int i42;
        int i43;
        sun.misc.Unsafe unsafe2;
        int i44;
        java.lang.Object object;
        java.lang.Object obj3;
        int i45;
        int i46;
        long j2;
        int i47;
        int iZzk;
        boolean z2;
        int i48;
        int i49;
        int i50;
        int iZza;
        int i51;
        com.google.android.gms.internal.measurement.zzmg zzmgVarZzu;
        long j3;
        com.google.android.gms.internal.measurement.zzmj zzmjVarZzd;
        com.google.android.gms.internal.measurement.zzmj zzmjVar;
        com.google.android.gms.internal.measurement.zzks zzksVar4;
        int i52;
        int i53;
        int i54;
        int i55;
        com.google.android.gms.internal.measurement.zzlm zzlmVar;
        int iZzh;
        com.google.android.gms.internal.measurement.zzlm zzlmVar2;
        int iZzh2;
        int i56;
        int i57;
        int i58;
        int i59;
        com.google.android.gms.internal.measurement.zzlw zzlwVar;
        int iZzh3;
        com.google.android.gms.internal.measurement.zzlw zzlwVar2;
        int iZzh4;
        int i60;
        int i61;
        com.google.android.gms.internal.measurement.zzmw zzmwVar;
        int iZzh5;
        com.google.android.gms.internal.measurement.zzmw zzmwVar2;
        int i62;
        int i63;
        com.google.android.gms.internal.measurement.zzmw zzmwVar3;
        int iZzh6;
        com.google.android.gms.internal.measurement.zzmw zzmwVar4;
        int i64;
        int i65;
        com.google.android.gms.internal.measurement.zzme zzmeVar;
        int iZzh7;
        com.google.android.gms.internal.measurement.zzme zzmeVar2;
        int i66;
        int i67;
        com.google.android.gms.internal.measurement.zzku zzkuVar;
        boolean z3;
        int iZzh8;
        boolean z4;
        com.google.android.gms.internal.measurement.zzku zzkuVar2;
        int i68;
        boolean z5;
        int iZzh9;
        int i69;
        int i70;
        int iZzh10;
        int i71;
        int i72;
        int iZzh11;
        int i73;
        java.lang.Object obj4;
        int iZzh12;
        int i74;
        int i75;
        int iZzh13;
        int i76;
        int iZzh14;
        int i77;
        sun.misc.Unsafe unsafe3;
        int iZzj;
        com.google.android.gms.internal.measurement.zzmg zzmgVarZzu2;
        com.google.android.gms.internal.measurement.zzoe zzoeVar;
        int i78;
        java.util.Iterator it;
        java.lang.Object objZzn;
        int iIntValue;
        int size;
        java.lang.Object objZzn2;
        int i79;
        int i80;
        int iIntValue2;
        com.google.android.gms.internal.measurement.zzme zzmeVar3;
        int iZzh15;
        int iZzh16;
        com.google.android.gms.internal.measurement.zzme zzmeVar4;
        int i81;
        com.google.android.gms.internal.measurement.zzmw zzmwVar5;
        int iZzh17;
        com.google.android.gms.internal.measurement.zzmw zzmwVar6;
        int iZzh18;
        int i82;
        int i83;
        com.google.android.gms.internal.measurement.zzns zznsVarZzv;
        int iZzh19;
        com.google.android.gms.internal.measurement.zzmj zzmjVarZzd2;
        int size2;
        int i84;
        this = this;
        java.lang.Object obj5 = obj;
        i2 = i2;
        int i85 = i3;
        com.google.android.gms.internal.measurement.zzks zzksVar5 = zzksVar;
        zzA(obj);
        sun.misc.Unsafe unsafe4 = zzb;
        int i86 = 0;
        int iZzg = i;
        int i87 = 0;
        int i88 = 0;
        int i89 = 0;
        int i90 = -1;
        int i91 = 1048575;
        while (true) {
            if (iZzg < i2) {
                int i92 = iZzg + 1;
                int i93 = bArr[iZzg];
                if (i93 < 0) {
                    iZzi = com.google.android.gms.internal.measurement.zzkt.zzi(i93, bArr, i92, zzksVar5);
                    i6 = zzksVar5.zza;
                } else {
                    i6 = i93;
                    iZzi = i92;
                }
                int i94 = i6 >>> 3;
                if (i94 > i90) {
                    iZzq = (i94 < this.zze || i94 > this.zzf) ? -1 : this.zzq(i94, i87 / 3);
                } else {
                    if (i94 < this.zze || i94 > this.zzf) {
                        i7 = -1;
                        i8 = -1;
                    } else {
                        iZzq = this.zzq(i94, i86);
                    }
                    if (i8 == i7) {
                        i9 = iZzi;
                        i10 = i6;
                        i11 = i89;
                        i91 = i91;
                        i12 = i86;
                        unsafe4 = unsafe4;
                        zzksVar2 = zzksVar5;
                        i4 = i85;
                        i13 = i94;
                    } else {
                        i14 = i6 & 7;
                        iArr = this.zzc;
                        i15 = iArr[i8 + 1];
                        i16 = i6;
                        iZzr = zzr(i15);
                        j = i15 & 1048575;
                        i90 = i94;
                        str = "Protocol message had invalid UTF-8.";
                        if (iZzr <= 17) {
                            int i95 = iArr[i8 + 2];
                            i17 = 1 << (i95 >>> 20);
                            i18 = i95 & 1048575;
                            if (i18 != i91) {
                                if (i91 != 1048575) {
                                    unsafe4.putInt(obj5, i91, i89);
                                }
                                if (i18 == 1048575) {
                                    i89 = 0;
                                } else {
                                    i89 = unsafe4.getInt(obj5, i18);
                                }
                                i91 = i18;
                            } else {
                                i91 = i91;
                            }
                            switch (iZzr) {
                                case 0:
                                    i19 = iZzi;
                                    i20 = i8;
                                    i21 = i16;
                                    i86 = 0;
                                    if (i14 == 1) {
                                        iZzg = i19 + 8;
                                        i89 |= i17;
                                        com.google.android.gms.internal.measurement.zzol.zzo(obj5, j, java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, i19)));
                                        i88 = i21;
                                        i87 = i20;
                                        i85 = i3;
                                    } else {
                                        i89 = i89;
                                        iZzi = i19;
                                        i12 = i86;
                                        unsafe4 = unsafe4;
                                        zzksVar5 = zzksVar5;
                                        i22 = i21;
                                        i23 = i20;
                                        i90 = i90;
                                        i4 = i3;
                                        i13 = i90;
                                        unsafe4 = unsafe4;
                                        i86 = i23;
                                        i11 = i89;
                                        i9 = iZzi;
                                        i10 = i22;
                                        zzksVar2 = zzksVar5;
                                    }
                                    break;
                                case 1:
                                    i19 = iZzi;
                                    i20 = i8;
                                    i21 = i16;
                                    i86 = 0;
                                    if (i14 == 5) {
                                        iZzg = i19 + 4;
                                        i89 |= i17;
                                        com.google.android.gms.internal.measurement.zzol.zzp(obj5, j, java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, i19)));
                                        i88 = i21;
                                        i87 = i20;
                                        i85 = i3;
                                    } else {
                                        i89 = i89;
                                        iZzi = i19;
                                        i12 = i86;
                                        unsafe4 = unsafe4;
                                        zzksVar5 = zzksVar5;
                                        i22 = i21;
                                        i23 = i20;
                                        i90 = i90;
                                        i4 = i3;
                                        i13 = i90;
                                        unsafe4 = unsafe4;
                                        i86 = i23;
                                        i11 = i89;
                                        i9 = iZzi;
                                        i10 = i22;
                                        zzksVar2 = zzksVar5;
                                    }
                                    break;
                                case 2:
                                case 3:
                                    i19 = iZzi;
                                    i20 = i8;
                                    i21 = i16;
                                    i86 = 0;
                                    if (i14 == 0) {
                                        int i96 = i89 | i17;
                                        int iZzk2 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i19, zzksVar5);
                                        unsafe4.putLong(obj, j, zzksVar5.zzb);
                                        i89 = i96;
                                        iZzg = iZzk2;
                                        i88 = i21;
                                        i87 = i20;
                                        i85 = i3;
                                    } else {
                                        i89 = i89;
                                        iZzi = i19;
                                        i12 = i86;
                                        unsafe4 = unsafe4;
                                        zzksVar5 = zzksVar5;
                                        i22 = i21;
                                        i23 = i20;
                                        i90 = i90;
                                        i4 = i3;
                                        i13 = i90;
                                        unsafe4 = unsafe4;
                                        i86 = i23;
                                        i11 = i89;
                                        i9 = iZzi;
                                        i10 = i22;
                                        zzksVar2 = zzksVar5;
                                    }
                                    break;
                                case 4:
                                case 11:
                                    i19 = iZzi;
                                    i20 = i8;
                                    i21 = i16;
                                    i86 = 0;
                                    if (i14 == 0) {
                                        i89 |= i17;
                                        iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i19, zzksVar5);
                                        unsafe4.putInt(obj5, j, zzksVar5.zza);
                                        i88 = i21;
                                        i87 = i20;
                                        i85 = i3;
                                    } else {
                                        i89 = i89;
                                        iZzi = i19;
                                        i12 = i86;
                                        unsafe4 = unsafe4;
                                        zzksVar5 = zzksVar5;
                                        i22 = i21;
                                        i23 = i20;
                                        i90 = i90;
                                        i4 = i3;
                                        i13 = i90;
                                        unsafe4 = unsafe4;
                                        i86 = i23;
                                        i11 = i89;
                                        i9 = iZzi;
                                        i10 = i22;
                                        zzksVar2 = zzksVar5;
                                    }
                                    break;
                                case 5:
                                case 14:
                                    i19 = iZzi;
                                    i20 = i8;
                                    i21 = i16;
                                    i86 = 0;
                                    if (i14 == 1) {
                                        unsafe4.putLong(obj, j, com.google.android.gms.internal.measurement.zzkt.zzn(bArr, i19));
                                        iZzg = i19 + 8;
                                        i89 = i17 | i89;
                                        i88 = i21;
                                        i87 = i20;
                                        i85 = i3;
                                    } else {
                                        i89 = i89;
                                        iZzi = i19;
                                        i12 = i86;
                                        unsafe4 = unsafe4;
                                        zzksVar5 = zzksVar5;
                                        i22 = i21;
                                        i23 = i20;
                                        i90 = i90;
                                        i4 = i3;
                                        i13 = i90;
                                        unsafe4 = unsafe4;
                                        i86 = i23;
                                        i11 = i89;
                                        i9 = iZzi;
                                        i10 = i22;
                                        zzksVar2 = zzksVar5;
                                    }
                                    break;
                                case 6:
                                case 13:
                                    i19 = iZzi;
                                    i20 = i8;
                                    i21 = i16;
                                    i86 = 0;
                                    if (i14 == 5) {
                                        iZzg = i19 + 4;
                                        i89 |= i17;
                                        unsafe4.putInt(obj5, j, com.google.android.gms.internal.measurement.zzkt.zzb(bArr, i19));
                                        i88 = i21;
                                        i87 = i20;
                                        i85 = i3;
                                    } else {
                                        i89 = i89;
                                        iZzi = i19;
                                        i12 = i86;
                                        unsafe4 = unsafe4;
                                        zzksVar5 = zzksVar5;
                                        i22 = i21;
                                        i23 = i20;
                                        i90 = i90;
                                        i4 = i3;
                                        i13 = i90;
                                        unsafe4 = unsafe4;
                                        i86 = i23;
                                        i11 = i89;
                                        i9 = iZzi;
                                        i10 = i22;
                                        zzksVar2 = zzksVar5;
                                    }
                                    break;
                                case 7:
                                    i19 = iZzi;
                                    i20 = i8;
                                    i21 = i16;
                                    i86 = 0;
                                    if (i14 == 0) {
                                        i89 |= i17;
                                        iZzg = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i19, zzksVar5);
                                        if (zzksVar5.zzb != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        com.google.android.gms.internal.measurement.zzol.zzm(obj5, j, z);
                                        i88 = i21;
                                        i87 = i20;
                                        i85 = i3;
                                    } else {
                                        i89 = i89;
                                        iZzi = i19;
                                        i12 = i86;
                                        unsafe4 = unsafe4;
                                        zzksVar5 = zzksVar5;
                                        i22 = i21;
                                        i23 = i20;
                                        i90 = i90;
                                        i4 = i3;
                                        i13 = i90;
                                        unsafe4 = unsafe4;
                                        i86 = i23;
                                        i11 = i89;
                                        i9 = iZzi;
                                        i10 = i22;
                                        zzksVar2 = zzksVar5;
                                    }
                                    break;
                                case 8:
                                    i24 = iZzi;
                                    i20 = i8;
                                    i21 = i16;
                                    if (i14 == 2) {
                                        if ((i15 & 536870912) != 0) {
                                            iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i24, zzksVar5);
                                            i26 = zzksVar5.zza;
                                            if (i26 >= 0) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            i27 = i89 | i17;
                                            if (i26 == 0) {
                                                zzksVar5.zzc = "";
                                                i30 = i27;
                                                i86 = 0;
                                            } else {
                                                int i97 = com.google.android.gms.internal.measurement.zzoo.zza;
                                                length = bArr.length;
                                                if ((((length - iZzg) - i26) | iZzg | i26) >= 0) {
                                                    throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(iZzg), java.lang.Integer.valueOf(i26)));
                                                }
                                                i28 = iZzg + i26;
                                                cArr = new char[i26];
                                                i29 = 0;
                                                while (iZzg < i28) {
                                                    b3 = bArr[iZzg];
                                                    if (com.google.android.gms.internal.measurement.zzom.zzd(b3)) {
                                                        iZzg++;
                                                        cArr[i29] = (char) b3;
                                                        i29++;
                                                    } else {
                                                        while (iZzg < i28) {
                                                            i31 = iZzg + 1;
                                                            b = bArr[iZzg];
                                                            if (com.google.android.gms.internal.measurement.zzom.zzd(b)) {
                                                                i32 = i29 + 1;
                                                                cArr[i29] = (char) b;
                                                                iZzg = i31;
                                                                while (true) {
                                                                    i29 = i32;
                                                                    if (iZzg < i28) {
                                                                    }
                                                                    b2 = bArr[iZzg];
                                                                    if (com.google.android.gms.internal.measurement.zzom.zzd(b2)) {
                                                                    }
                                                                    iZzg++;
                                                                    i32 = i29 + 1;
                                                                    cArr[i29] = (char) b2;
                                                                    break;
                                                                    break;
                                                                }
                                                            } else if (b < -32) {
                                                                i33 = i27;
                                                                str2 = str;
                                                                if (b < -16) {
                                                                    if (i31 < i28 - 1) {
                                                                        throw new com.google.android.gms.internal.measurement.zzmm(str2);
                                                                    }
                                                                    int i98 = i31 + 1;
                                                                    com.google.android.gms.internal.measurement.zzom.zzb(b, bArr[i31], bArr[i98], cArr, i29);
                                                                    i29++;
                                                                    str = str2;
                                                                    i27 = i33;
                                                                    iZzg = i98 + 1;
                                                                } else {
                                                                    if (i31 < i28 - 2) {
                                                                        throw new com.google.android.gms.internal.measurement.zzmm(str2);
                                                                    }
                                                                    int i99 = i31 + 1;
                                                                    byte b4 = bArr[i31];
                                                                    int i100 = i99 + 1;
                                                                    com.google.android.gms.internal.measurement.zzom.zza(b, b4, bArr[i99], bArr[i100], cArr, i29);
                                                                    i29 += 2;
                                                                    iZzg = i100 + 1;
                                                                    str = str2;
                                                                    i27 = i33;
                                                                }
                                                            } else {
                                                                if (i31 < i28) {
                                                                    throw new com.google.android.gms.internal.measurement.zzmm(str);
                                                                }
                                                                com.google.android.gms.internal.measurement.zzom.zzc(b, bArr[i31], cArr, i29);
                                                                i29++;
                                                                iZzg = i31 + 1;
                                                            }
                                                        }
                                                        i30 = i27;
                                                        i86 = 0;
                                                        zzksVar5.zzc = new java.lang.String(cArr, 0, i29);
                                                        iZzg = i28;
                                                    }
                                                }
                                                while (iZzg < i28) {
                                                    i31 = iZzg + 1;
                                                    b = bArr[iZzg];
                                                    if (com.google.android.gms.internal.measurement.zzom.zzd(b)) {
                                                        i32 = i29 + 1;
                                                        cArr[i29] = (char) b;
                                                        iZzg = i31;
                                                        while (true) {
                                                            i29 = i32;
                                                            if (iZzg < i28) {
                                                            }
                                                            b2 = bArr[iZzg];
                                                            if (com.google.android.gms.internal.measurement.zzom.zzd(b2)) {
                                                            }
                                                            iZzg++;
                                                            i32 = i29 + 1;
                                                            cArr[i29] = (char) b2;
                                                            break;
                                                            break;
                                                        }
                                                    } else if (b < -32) {
                                                        i33 = i27;
                                                        str2 = str;
                                                        if (b < -16) {
                                                            if (i31 < i28 - 1) {
                                                                throw new com.google.android.gms.internal.measurement.zzmm(str2);
                                                            }
                                                            int i910 = i31 + 1;
                                                            com.google.android.gms.internal.measurement.zzom.zzb(b, bArr[i31], bArr[i910], cArr, i29);
                                                            i29++;
                                                            str = str2;
                                                            i27 = i33;
                                                            iZzg = i910 + 1;
                                                        } else {
                                                            if (i31 < i28 - 2) {
                                                                throw new com.google.android.gms.internal.measurement.zzmm(str2);
                                                            }
                                                            int i911 = i31 + 1;
                                                            byte b5 = bArr[i31];
                                                            int i101 = i911 + 1;
                                                            com.google.android.gms.internal.measurement.zzom.zza(b, b5, bArr[i911], bArr[i101], cArr, i29);
                                                            i29 += 2;
                                                            iZzg = i101 + 1;
                                                            str = str2;
                                                            i27 = i33;
                                                        }
                                                    } else {
                                                        if (i31 < i28) {
                                                            throw new com.google.android.gms.internal.measurement.zzmm(str);
                                                        }
                                                        com.google.android.gms.internal.measurement.zzom.zzc(b, bArr[i31], cArr, i29);
                                                        i29++;
                                                        iZzg = i31 + 1;
                                                    }
                                                }
                                                i30 = i27;
                                                i86 = 0;
                                                zzksVar5.zzc = new java.lang.String(cArr, 0, i29);
                                                iZzg = i28;
                                            }
                                            i89 = i30;
                                        } else {
                                            i86 = 0;
                                            iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i24, zzksVar5);
                                            i25 = zzksVar5.zza;
                                            if (i25 >= 0) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            int i102 = i89 | i17;
                                            if (i25 == 0) {
                                                zzksVar5.zzc = "";
                                            } else {
                                                zzksVar5.zzc = new java.lang.String(bArr, iZzg, i25, com.google.android.gms.internal.measurement.zzmk.zza);
                                                iZzg += i25;
                                            }
                                            i89 = i102;
                                        }
                                        unsafe4.putObject(obj5, j, zzksVar5.zzc);
                                        i88 = i21;
                                        i87 = i20;
                                        i85 = i3;
                                    } else {
                                        i89 = i89;
                                        iZzi = i24;
                                        unsafe4 = unsafe4;
                                        zzksVar5 = zzksVar5;
                                        i22 = i21;
                                        i23 = i20;
                                        i12 = 0;
                                        i4 = i3;
                                        i13 = i90;
                                        unsafe4 = unsafe4;
                                        i86 = i23;
                                        i11 = i89;
                                        i9 = iZzi;
                                        i10 = i22;
                                        zzksVar2 = zzksVar5;
                                    }
                                    break;
                                case 9:
                                    i34 = i8;
                                    i35 = i16;
                                    if (i14 == 2) {
                                        int i103 = i89 | i17;
                                        java.lang.Object objZzx = this.zzx(obj5, i34);
                                        iZzg = com.google.android.gms.internal.measurement.zzkt.zzm(objZzx, this.zzv(i34), bArr, iZzi, i2, zzksVar);
                                        this.zzF(obj5, i34, objZzx);
                                        i89 = i103;
                                        i88 = i35;
                                        i87 = i34;
                                        i86 = 0;
                                        i85 = i3;
                                    } else {
                                        i22 = i35;
                                        i23 = i34;
                                        i12 = 0;
                                        i4 = i3;
                                        i13 = i90;
                                        unsafe4 = unsafe4;
                                        i86 = i23;
                                        i11 = i89;
                                        i9 = iZzi;
                                        i10 = i22;
                                        zzksVar2 = zzksVar5;
                                    }
                                    break;
                                case 10:
                                    i34 = i8;
                                    i35 = i16;
                                    if (i14 == 2) {
                                        i89 |= i17;
                                        iZzg = com.google.android.gms.internal.measurement.zzkt.zza(bArr, iZzi, zzksVar5);
                                        unsafe4.putObject(obj5, j, zzksVar5.zzc);
                                        i88 = i35;
                                        i87 = i34;
                                        i86 = 0;
                                        i85 = i3;
                                    } else {
                                        i22 = i35;
                                        i23 = i34;
                                        i12 = 0;
                                        i4 = i3;
                                        i13 = i90;
                                        unsafe4 = unsafe4;
                                        i86 = i23;
                                        i11 = i89;
                                        i9 = iZzi;
                                        i10 = i22;
                                        zzksVar2 = zzksVar5;
                                    }
                                    break;
                                case 12:
                                    i34 = i8;
                                    i35 = i16;
                                    if (i14 == 0) {
                                        iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzi, zzksVar5);
                                        i36 = zzksVar5.zza;
                                        com.google.android.gms.internal.measurement.zzmg zzmgVarZzu3 = this.zzu(i34);
                                        if ((i15 & Integer.MIN_VALUE) != 0 || zzmgVarZzu3 == null || zzmgVarZzu3.zza(i36)) {
                                            i89 |= i17;
                                            unsafe4.putInt(obj5, j, i36);
                                        } else {
                                            zzd(obj).zzj(i35, java.lang.Long.valueOf(i36));
                                        }
                                        i88 = i35;
                                        i87 = i34;
                                        i86 = 0;
                                        i85 = i3;
                                    } else {
                                        i22 = i35;
                                        i23 = i34;
                                        i12 = 0;
                                        i4 = i3;
                                        i13 = i90;
                                        unsafe4 = unsafe4;
                                        i86 = i23;
                                        i11 = i89;
                                        i9 = iZzi;
                                        i10 = i22;
                                        zzksVar2 = zzksVar5;
                                    }
                                    break;
                                case 15:
                                    i34 = i8;
                                    i35 = i16;
                                    if (i14 == 0) {
                                        i89 |= i17;
                                        iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzi, zzksVar5);
                                        unsafe4.putInt(obj5, j, com.google.android.gms.internal.measurement.zzlg.zzb(zzksVar5.zza));
                                        i88 = i35;
                                        i87 = i34;
                                        i86 = 0;
                                        i85 = i3;
                                    } else {
                                        i22 = i35;
                                        i23 = i34;
                                        i12 = 0;
                                        i4 = i3;
                                        i13 = i90;
                                        unsafe4 = unsafe4;
                                        i86 = i23;
                                        i11 = i89;
                                        i9 = iZzi;
                                        i10 = i22;
                                        zzksVar2 = zzksVar5;
                                    }
                                    break;
                                case 16:
                                    if (i14 == 0) {
                                        int i104 = i89 | i17;
                                        int iZzk3 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, iZzi, zzksVar5);
                                        i34 = i8;
                                        i35 = i16;
                                        unsafe4.putLong(obj, j, com.google.android.gms.internal.measurement.zzlg.zzc(zzksVar5.zzb));
                                        i89 = i104;
                                        iZzg = iZzk3;
                                        i88 = i35;
                                        i87 = i34;
                                        i86 = 0;
                                        i85 = i3;
                                    } else {
                                        i23 = i8;
                                        i22 = i16;
                                        i12 = 0;
                                        i4 = i3;
                                        i13 = i90;
                                        unsafe4 = unsafe4;
                                        i86 = i23;
                                        i11 = i89;
                                        i9 = iZzi;
                                        i10 = i22;
                                        zzksVar2 = zzksVar5;
                                    }
                                    break;
                                default:
                                    i19 = iZzi;
                                    i20 = i8;
                                    i21 = i16;
                                    i86 = 0;
                                    if (i14 == 3) {
                                        java.lang.Object objZzx2 = this.zzx(obj5, i20);
                                        int iZzl = com.google.android.gms.internal.measurement.zzkt.zzl(objZzx2, this.zzv(i20), bArr, i19, i2, (i90 << 3) | 4, zzksVar);
                                        this.zzF(obj5, i20, objZzx2);
                                        i85 = i3;
                                        zzksVar5 = zzksVar;
                                        i2 = i2;
                                        i90 = i90;
                                        unsafe4 = unsafe4;
                                        i87 = i20;
                                        iZzg = iZzl;
                                        i91 = i91;
                                        i86 = 0;
                                        i88 = i21;
                                        i89 |= i17;
                                    } else {
                                        i89 = i89;
                                        iZzi = i19;
                                        i12 = i86;
                                        unsafe4 = unsafe4;
                                        zzksVar5 = zzksVar5;
                                        i22 = i21;
                                        i23 = i20;
                                        i90 = i90;
                                        i4 = i3;
                                        i13 = i90;
                                        unsafe4 = unsafe4;
                                        i86 = i23;
                                        i11 = i89;
                                        i9 = iZzi;
                                        i10 = i22;
                                        zzksVar2 = zzksVar5;
                                    }
                                    break;
                            }
                        } else {
                            i91 = i91;
                            i37 = i16;
                            i38 = i90;
                            i12 = 0;
                            i39 = i8;
                            i11 = i89;
                            unsafe = unsafe4;
                            i40 = iZzi;
                            zzksVar3 = zzksVar5;
                            if (iZzr == 27) {
                                i2 = i2;
                                i41 = i39;
                                if (iZzr <= 49) {
                                    j3 = i15;
                                    zzmjVarZzd = (com.google.android.gms.internal.measurement.zzmj) unsafe.getObject(obj5, j);
                                    if (!zzmjVarZzd.zzc()) {
                                        int size3 = zzmjVarZzd.size();
                                        zzmjVarZzd = zzmjVarZzd.zzd(size3 + size3);
                                        unsafe.putObject(obj5, j, zzmjVarZzd);
                                    }
                                    zzmjVar = zzmjVarZzd;
                                    switch (iZzr) {
                                        case 18:
                                        case 35:
                                            zzksVar4 = zzksVar3;
                                            i40 = i40;
                                            i52 = i37;
                                            i53 = i38;
                                            i54 = i41;
                                            unsafe = unsafe;
                                            if (i14 == 2) {
                                                i55 = i53;
                                                i41 = i54;
                                                if (i14 == 1) {
                                                    iZzg = i40 + 8;
                                                    int i105 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                    zzlmVar = (com.google.android.gms.internal.measurement.zzlm) zzmjVar;
                                                    zzlmVar.zzf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, i40)));
                                                    while (iZzg < i2) {
                                                        iZzh = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzg, zzksVar4);
                                                        if (i52 == zzksVar4.zza) {
                                                            zzlmVar.zzf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, iZzh)));
                                                            iZzg = iZzh + 8;
                                                        }
                                                    }
                                                }
                                                i59 = i41;
                                                iZzg = i40;
                                                if (iZzg != i40) {
                                                    i2 = i2;
                                                    obj5 = obj;
                                                    i90 = i55;
                                                    i87 = i59;
                                                    unsafe4 = unsafe;
                                                    i88 = i52;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i85 = i3;
                                                    zzksVar5 = zzksVar4;
                                                } else {
                                                    i2 = i2;
                                                    obj2 = obj;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    zzksVar2 = zzksVar4;
                                                    i86 = i59;
                                                    unsafe4 = unsafe;
                                                    i10 = i52;
                                                    i13 = i55;
                                                }
                                            } else {
                                                int i106 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzlmVar2 = (com.google.android.gms.internal.measurement.zzlm) zzmjVar;
                                                iZzh2 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar4);
                                                i56 = zzksVar4.zza;
                                                i57 = iZzh2 + i56;
                                                if (i57 <= bArr.length) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzlmVar2.zzg(zzlmVar2.size() + (i56 / 8));
                                                while (iZzh2 < i57) {
                                                    zzlmVar2.zzf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, iZzh2)));
                                                    iZzh2 += 8;
                                                    i53 = i53;
                                                    i54 = i54;
                                                }
                                                i55 = i53;
                                                i41 = i54;
                                                if (iZzh2 == i57) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                iZzg = iZzh2;
                                            }
                                            i59 = i41;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                            break;
                                        case 19:
                                        case 36:
                                            zzksVar4 = zzksVar3;
                                            i40 = i40;
                                            i52 = i37;
                                            i58 = i38;
                                            i59 = i41;
                                            unsafe = unsafe;
                                            if (i14 == 2) {
                                                if (i14 == 5) {
                                                    iZzg = i40 + 4;
                                                    int i107 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                    zzlwVar = (com.google.android.gms.internal.measurement.zzlw) zzmjVar;
                                                    zzlwVar.zzf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, i40)));
                                                    while (iZzg < i2) {
                                                        iZzh3 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzg, zzksVar4);
                                                        if (i52 == zzksVar4.zza) {
                                                            zzlwVar.zzf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, iZzh3)));
                                                            iZzg = iZzh3 + 4;
                                                        }
                                                    }
                                                }
                                                i55 = i58;
                                                iZzg = i40;
                                                if (iZzg != i40) {
                                                    i2 = i2;
                                                    obj5 = obj;
                                                    i90 = i55;
                                                    i87 = i59;
                                                    unsafe4 = unsafe;
                                                    i88 = i52;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i85 = i3;
                                                    zzksVar5 = zzksVar4;
                                                } else {
                                                    i2 = i2;
                                                    obj2 = obj;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    zzksVar2 = zzksVar4;
                                                    i86 = i59;
                                                    unsafe4 = unsafe;
                                                    i10 = i52;
                                                    i13 = i55;
                                                }
                                            } else {
                                                int i108 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzlwVar2 = (com.google.android.gms.internal.measurement.zzlw) zzmjVar;
                                                iZzh4 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar4);
                                                i60 = zzksVar4.zza;
                                                i61 = iZzh4 + i60;
                                                if (i61 <= bArr.length) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzlwVar2.zzg(zzlwVar2.size() + (i60 / 4));
                                                while (iZzh4 < i61) {
                                                    zzlwVar2.zzf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, iZzh4)));
                                                    iZzh4 += 4;
                                                }
                                                if (iZzh4 != i61) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                iZzg = iZzh4;
                                            }
                                            i55 = i58;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            zzksVar4 = zzksVar3;
                                            i40 = i40;
                                            i52 = i37;
                                            i58 = i38;
                                            i59 = i41;
                                            unsafe = unsafe;
                                            if (i14 == 2) {
                                                if (i14 == 0) {
                                                    int i109 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                    zzmwVar = (com.google.android.gms.internal.measurement.zzmw) zzmjVar;
                                                    iZzh4 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i40, zzksVar4);
                                                    zzmwVar.zzg(zzksVar4.zzb);
                                                    while (iZzh4 < i2) {
                                                        iZzh5 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh4, zzksVar4);
                                                        if (i52 == zzksVar4.zza) {
                                                            iZzh4 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, iZzh5, zzksVar4);
                                                            zzmwVar.zzg(zzksVar4.zzb);
                                                        }
                                                    }
                                                }
                                                i55 = i58;
                                                iZzg = i40;
                                                if (iZzg != i40) {
                                                    i2 = i2;
                                                    obj5 = obj;
                                                    i90 = i55;
                                                    i87 = i59;
                                                    unsafe4 = unsafe;
                                                    i88 = i52;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i85 = i3;
                                                    zzksVar5 = zzksVar4;
                                                } else {
                                                    i2 = i2;
                                                    obj2 = obj;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    zzksVar2 = zzksVar4;
                                                    i86 = i59;
                                                    unsafe4 = unsafe;
                                                    i10 = i52;
                                                    i13 = i55;
                                                }
                                            } else {
                                                int i110 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzmwVar2 = (com.google.android.gms.internal.measurement.zzmw) zzmjVar;
                                                iZzh4 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar4);
                                                i62 = zzksVar4.zza + iZzh4;
                                                while (iZzh4 < i62) {
                                                    iZzh4 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, iZzh4, zzksVar4);
                                                    zzmwVar2.zzg(zzksVar4.zzb);
                                                }
                                                if (iZzh4 != i62) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            }
                                            iZzg = iZzh4;
                                            i55 = i58;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            zzksVar4 = zzksVar3;
                                            i40 = i40;
                                            i52 = i37;
                                            i63 = i41;
                                            if (i14 == 2) {
                                                iZzg = com.google.android.gms.internal.measurement.zzkt.zzf(bArr, i40, zzmjVar, zzksVar4);
                                                i59 = i63;
                                                i55 = i38;
                                                if (iZzg != i40) {
                                                    i2 = i2;
                                                    obj5 = obj;
                                                    i90 = i55;
                                                    i87 = i59;
                                                    unsafe4 = unsafe;
                                                    i88 = i52;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i85 = i3;
                                                    zzksVar5 = zzksVar4;
                                                } else {
                                                    i2 = i2;
                                                    obj2 = obj;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    zzksVar2 = zzksVar4;
                                                    i86 = i59;
                                                    unsafe4 = unsafe;
                                                    i10 = i52;
                                                    i13 = i55;
                                                }
                                            } else if (i14 == 0) {
                                                i58 = i38;
                                                i59 = i63;
                                                unsafe = unsafe;
                                                iZzg = com.google.android.gms.internal.measurement.zzkt.zzj(i52, bArr, i40, i2, zzmjVar, zzksVar);
                                                i55 = i58;
                                                if (iZzg != i40) {
                                                    i2 = i2;
                                                    obj5 = obj;
                                                    i90 = i55;
                                                    i87 = i59;
                                                    unsafe4 = unsafe;
                                                    i88 = i52;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i85 = i3;
                                                    zzksVar5 = zzksVar4;
                                                } else {
                                                    i2 = i2;
                                                    obj2 = obj;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    zzksVar2 = zzksVar4;
                                                    i86 = i59;
                                                    unsafe4 = unsafe;
                                                    i10 = i52;
                                                    i13 = i55;
                                                }
                                            } else {
                                                i59 = i63;
                                                i55 = i38;
                                                iZzg = i40;
                                                if (iZzg != i40) {
                                                    i2 = i2;
                                                    obj5 = obj;
                                                    i90 = i55;
                                                    i87 = i59;
                                                    unsafe4 = unsafe;
                                                    i88 = i52;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i85 = i3;
                                                    zzksVar5 = zzksVar4;
                                                } else {
                                                    i2 = i2;
                                                    obj2 = obj;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    zzksVar2 = zzksVar4;
                                                    i86 = i59;
                                                    unsafe4 = unsafe;
                                                    i10 = i52;
                                                    i13 = i55;
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            zzksVar4 = zzksVar3;
                                            i40 = i40;
                                            i52 = i37;
                                            i63 = i41;
                                            if (i14 == 2) {
                                                if (i14 == 1) {
                                                    iZzg = i40 + 8;
                                                    int i111 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                    zzmwVar3 = (com.google.android.gms.internal.measurement.zzmw) zzmjVar;
                                                    zzmwVar3.zzg(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, i40));
                                                    while (iZzg < i2) {
                                                        iZzh6 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzg, zzksVar4);
                                                        if (i52 == zzksVar4.zza) {
                                                            zzmwVar3.zzg(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, iZzh6));
                                                            iZzg = iZzh6 + 8;
                                                        }
                                                    }
                                                }
                                                i59 = i63;
                                                i55 = i38;
                                                iZzg = i40;
                                                if (iZzg != i40) {
                                                    i2 = i2;
                                                    obj5 = obj;
                                                    i90 = i55;
                                                    i87 = i59;
                                                    unsafe4 = unsafe;
                                                    i88 = i52;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i85 = i3;
                                                    zzksVar5 = zzksVar4;
                                                } else {
                                                    i2 = i2;
                                                    obj2 = obj;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    zzksVar2 = zzksVar4;
                                                    i86 = i59;
                                                    unsafe4 = unsafe;
                                                    i10 = i52;
                                                    i13 = i55;
                                                }
                                            } else {
                                                int i112 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzmwVar4 = (com.google.android.gms.internal.measurement.zzmw) zzmjVar;
                                                iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar4);
                                                i64 = zzksVar4.zza;
                                                i65 = iZzg + i64;
                                                if (i65 <= bArr.length) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzmwVar4.zzh(zzmwVar4.size() + (i64 / 8));
                                                while (iZzg < i65) {
                                                    zzmwVar4.zzg(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, iZzg));
                                                    iZzg += 8;
                                                }
                                                if (iZzg != i65) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            }
                                            i59 = i63;
                                            i55 = i38;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            zzksVar4 = zzksVar3;
                                            i40 = i40;
                                            i52 = i37;
                                            i63 = i41;
                                            if (i14 == 2) {
                                                if (i14 == 5) {
                                                    iZzg = i40 + 4;
                                                    int i113 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                    zzmeVar = (com.google.android.gms.internal.measurement.zzme) zzmjVar;
                                                    zzmeVar.zzh(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, i40));
                                                    while (iZzg < i2) {
                                                        iZzh7 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzg, zzksVar4);
                                                        if (i52 == zzksVar4.zza) {
                                                            zzmeVar.zzh(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, iZzh7));
                                                            iZzg = iZzh7 + 4;
                                                        }
                                                    }
                                                }
                                                i59 = i63;
                                                i55 = i38;
                                                iZzg = i40;
                                                if (iZzg != i40) {
                                                    i2 = i2;
                                                    obj5 = obj;
                                                    i90 = i55;
                                                    i87 = i59;
                                                    unsafe4 = unsafe;
                                                    i88 = i52;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i85 = i3;
                                                    zzksVar5 = zzksVar4;
                                                } else {
                                                    i2 = i2;
                                                    obj2 = obj;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    zzksVar2 = zzksVar4;
                                                    i86 = i59;
                                                    unsafe4 = unsafe;
                                                    i10 = i52;
                                                    i13 = i55;
                                                }
                                            } else {
                                                int i114 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzmeVar2 = (com.google.android.gms.internal.measurement.zzme) zzmjVar;
                                                iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar4);
                                                i66 = zzksVar4.zza;
                                                i67 = iZzg + i66;
                                                if (i67 <= bArr.length) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzmeVar2.zzi(zzmeVar2.size() + (i66 / 4));
                                                while (iZzg < i67) {
                                                    zzmeVar2.zzh(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, iZzg));
                                                    iZzg += 4;
                                                }
                                                if (iZzg != i67) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            }
                                            i59 = i63;
                                            i55 = i38;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            zzksVar4 = zzksVar3;
                                            i40 = i40;
                                            i52 = i37;
                                            i63 = i41;
                                            if (i14 == 2) {
                                                if (i14 == 0) {
                                                    int i115 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                    zzkuVar = (com.google.android.gms.internal.measurement.zzku) zzmjVar;
                                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i40, zzksVar4);
                                                    if (zzksVar4.zzb != 0) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    zzkuVar.zze(z3);
                                                    while (iZzg < i2) {
                                                        iZzh8 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzg, zzksVar4);
                                                        if (i52 == zzksVar4.zza) {
                                                            iZzg = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, iZzh8, zzksVar4);
                                                            if (zzksVar4.zzb != 0) {
                                                                z4 = true;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                            zzkuVar.zze(z4);
                                                        }
                                                    }
                                                }
                                                i59 = i63;
                                                i55 = i38;
                                                iZzg = i40;
                                                if (iZzg != i40) {
                                                    i2 = i2;
                                                    obj5 = obj;
                                                    i90 = i55;
                                                    i87 = i59;
                                                    unsafe4 = unsafe;
                                                    i88 = i52;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i85 = i3;
                                                    zzksVar5 = zzksVar4;
                                                } else {
                                                    i2 = i2;
                                                    obj2 = obj;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    zzksVar2 = zzksVar4;
                                                    i86 = i59;
                                                    unsafe4 = unsafe;
                                                    i10 = i52;
                                                    i13 = i55;
                                                }
                                            } else {
                                                int i116 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzkuVar2 = (com.google.android.gms.internal.measurement.zzku) zzmjVar;
                                                iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar4);
                                                i68 = zzksVar4.zza + iZzg;
                                                while (iZzg < i68) {
                                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, iZzg, zzksVar4);
                                                    if (zzksVar4.zzb != 0) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    zzkuVar2.zze(z5);
                                                }
                                                if (iZzg != i68) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            }
                                            i59 = i63;
                                            i55 = i38;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                            break;
                                        case 26:
                                            i40 = i40;
                                            i52 = i37;
                                            i38 = i38;
                                            if (i14 == 2) {
                                                i55 = i38;
                                                i59 = i41;
                                                unsafe = unsafe;
                                                zzksVar4 = zzksVar3;
                                                iZzg = i40;
                                            } else if ((j3 & 536870912) == 0) {
                                                iZzh11 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar3);
                                                i73 = zzksVar3.zza;
                                                if (i73 >= 0) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i73 == 0) {
                                                    obj4 = "";
                                                    zzmjVar.add(obj4);
                                                } else {
                                                    obj4 = r8;
                                                    zzmjVar.add(new java.lang.String(bArr, iZzh11, i73, com.google.android.gms.internal.measurement.zzmk.zza));
                                                    iZzh11 += i73;
                                                }
                                                while (iZzh11 < i2) {
                                                    iZzh12 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh11, zzksVar3);
                                                    if (i52 == zzksVar3.zza) {
                                                        iZzh11 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh12, zzksVar3);
                                                        i74 = zzksVar3.zza;
                                                        if (i74 >= 0) {
                                                            throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i74 == 0) {
                                                            zzmjVar.add(obj4);
                                                        } else {
                                                            zzmjVar.add(new java.lang.String(bArr, iZzh11, i74, com.google.android.gms.internal.measurement.zzmk.zza));
                                                            iZzh11 += i74;
                                                        }
                                                    } else {
                                                        i55 = i38;
                                                        iZzg = iZzh11;
                                                        i59 = i41;
                                                        unsafe = unsafe;
                                                        zzksVar4 = zzksVar3;
                                                    }
                                                }
                                                i55 = i38;
                                                iZzg = iZzh11;
                                                i59 = i41;
                                                unsafe = unsafe;
                                                zzksVar4 = zzksVar3;
                                            } else {
                                                iZzh9 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar3);
                                                i69 = zzksVar3.zza;
                                                if (i69 >= 0) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i69 == 0) {
                                                    zzmjVar.add(r8);
                                                } else {
                                                    i70 = iZzh9 + i69;
                                                    if (com.google.android.gms.internal.measurement.zzoo.zzd(bArr, iZzh9, i70)) {
                                                        throw new com.google.android.gms.internal.measurement.zzmm(str);
                                                    }
                                                    zzmjVar.add(new java.lang.String(bArr, iZzh9, i69, com.google.android.gms.internal.measurement.zzmk.zza));
                                                    iZzh9 = i70;
                                                }
                                                while (iZzh9 < i2) {
                                                    iZzh10 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh9, zzksVar3);
                                                    if (i52 == zzksVar3.zza) {
                                                        iZzh9 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh10, zzksVar3);
                                                        i71 = zzksVar3.zza;
                                                        if (i71 >= 0) {
                                                            throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i71 == 0) {
                                                            zzmjVar.add(r8);
                                                        } else {
                                                            i72 = iZzh9 + i71;
                                                            if (com.google.android.gms.internal.measurement.zzoo.zzd(bArr, iZzh9, i72)) {
                                                                throw new com.google.android.gms.internal.measurement.zzmm(str);
                                                            }
                                                            zzmjVar.add(new java.lang.String(bArr, iZzh9, i71, com.google.android.gms.internal.measurement.zzmk.zza));
                                                            iZzh9 = i72;
                                                        }
                                                    } else {
                                                        iZzg = iZzh9;
                                                        i59 = i41;
                                                        zzksVar4 = zzksVar3;
                                                        i55 = i38;
                                                    }
                                                }
                                                iZzg = iZzh9;
                                                i59 = i41;
                                                zzksVar4 = zzksVar3;
                                                i55 = i38;
                                            }
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                            break;
                                        case 27:
                                            i75 = i37;
                                            i41 = i41;
                                            if (i14 == 2) {
                                                this = this;
                                                i40 = i40;
                                                int iZze = com.google.android.gms.internal.measurement.zzkt.zze(this.zzv(i41), i75, bArr, i40, i2, zzmjVar, zzksVar);
                                                i55 = i38;
                                                i52 = i75;
                                                i59 = i41;
                                                unsafe = unsafe;
                                                zzksVar4 = zzksVar3;
                                                iZzg = iZze;
                                            } else {
                                                unsafe = unsafe;
                                                i55 = i38;
                                                zzksVar4 = zzksVar3;
                                                i52 = i75;
                                                i59 = i41;
                                                iZzg = i40;
                                            }
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                            break;
                                        case 28:
                                            i75 = i37;
                                            i41 = i41;
                                            if (i14 == 2) {
                                                iZzh13 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar3);
                                                i76 = zzksVar3.zza;
                                                if (i76 >= 0) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i76 <= bArr.length - iZzh13) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i76 == 0) {
                                                    zzmjVar.add(com.google.android.gms.internal.measurement.zzld.zzb);
                                                } else {
                                                    zzmjVar.add(com.google.android.gms.internal.measurement.zzld.zzj(bArr, iZzh13, i76));
                                                    iZzh13 += i76;
                                                }
                                                while (iZzh13 < i2) {
                                                    iZzh14 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh13, zzksVar3);
                                                    if (i75 == zzksVar3.zza) {
                                                        unsafe = unsafe;
                                                        iZzg = iZzh13;
                                                        i55 = i38;
                                                        zzksVar4 = zzksVar3;
                                                        i52 = i75;
                                                        i59 = i41;
                                                        if (iZzg != i40) {
                                                            i2 = i2;
                                                            obj5 = obj;
                                                            i90 = i55;
                                                            i87 = i59;
                                                            unsafe4 = unsafe;
                                                            i88 = i52;
                                                            i91 = i91;
                                                            i86 = 0;
                                                            i89 = i11;
                                                            i85 = i3;
                                                            zzksVar5 = zzksVar4;
                                                        } else {
                                                            i2 = i2;
                                                            obj2 = obj;
                                                            i4 = i3;
                                                            i9 = iZzg;
                                                            zzksVar2 = zzksVar4;
                                                            i86 = i59;
                                                            unsafe4 = unsafe;
                                                            i10 = i52;
                                                            i13 = i55;
                                                        }
                                                        break;
                                                    } else {
                                                        iZzh13 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh14, zzksVar3);
                                                        i77 = zzksVar3.zza;
                                                        if (i77 >= 0) {
                                                            throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i77 <= bArr.length - iZzh13) {
                                                            throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i77 == 0) {
                                                            zzmjVar.add(com.google.android.gms.internal.measurement.zzld.zzb);
                                                        } else {
                                                            zzmjVar.add(com.google.android.gms.internal.measurement.zzld.zzj(bArr, iZzh13, i77));
                                                            iZzh13 += i77;
                                                        }
                                                    }
                                                }
                                                unsafe = unsafe;
                                                iZzg = iZzh13;
                                                i55 = i38;
                                                zzksVar4 = zzksVar3;
                                                i52 = i75;
                                                i59 = i41;
                                                if (iZzg != i40) {
                                                    i2 = i2;
                                                    obj5 = obj;
                                                    i90 = i55;
                                                    i87 = i59;
                                                    unsafe4 = unsafe;
                                                    i88 = i52;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i85 = i3;
                                                    zzksVar5 = zzksVar4;
                                                } else {
                                                    i2 = i2;
                                                    obj2 = obj;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    zzksVar2 = zzksVar4;
                                                    i86 = i59;
                                                    unsafe4 = unsafe;
                                                    i10 = i52;
                                                    i13 = i55;
                                                }
                                            } else {
                                                unsafe = unsafe;
                                                i55 = i38;
                                                zzksVar4 = zzksVar3;
                                                i52 = i75;
                                                i59 = i41;
                                                iZzg = i40;
                                                if (iZzg != i40) {
                                                    i2 = i2;
                                                    obj5 = obj;
                                                    i90 = i55;
                                                    i87 = i59;
                                                    unsafe4 = unsafe;
                                                    i88 = i52;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i85 = i3;
                                                    zzksVar5 = zzksVar4;
                                                } else {
                                                    i2 = i2;
                                                    obj2 = obj;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    zzksVar2 = zzksVar4;
                                                    i86 = i59;
                                                    unsafe4 = unsafe;
                                                    i10 = i52;
                                                    i13 = i55;
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            i75 = i37;
                                            if (i14 == 2) {
                                                iZzj = com.google.android.gms.internal.measurement.zzkt.zzf(bArr, i40, zzmjVar, zzksVar3);
                                                unsafe3 = unsafe;
                                            } else if (i14 == 0) {
                                                this = this;
                                                zzksVar4 = zzksVar3;
                                                unsafe = unsafe;
                                                i40 = i40;
                                                i55 = i38;
                                                i52 = i75;
                                                i59 = i41;
                                                iZzg = i40;
                                                if (iZzg != i40) {
                                                    i2 = i2;
                                                    obj5 = obj;
                                                    i90 = i55;
                                                    i87 = i59;
                                                    unsafe4 = unsafe;
                                                    i88 = i52;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i85 = i3;
                                                    zzksVar5 = zzksVar4;
                                                } else {
                                                    i2 = i2;
                                                    obj2 = obj;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    zzksVar2 = zzksVar4;
                                                    i86 = i59;
                                                    unsafe4 = unsafe;
                                                    i10 = i52;
                                                    i13 = i55;
                                                }
                                            } else {
                                                unsafe3 = unsafe;
                                                iZzj = com.google.android.gms.internal.measurement.zzkt.zzj(i75, bArr, i40, i2, zzmjVar, zzksVar);
                                            }
                                            zzmgVarZzu2 = this.zzu(i41);
                                            zzoeVar = this.zzl;
                                            int i117 = com.google.android.gms.internal.measurement.zznu.zza;
                                            if (zzmgVarZzu2 != null) {
                                                i78 = iZzj;
                                            } else if (zzmjVar instanceof java.util.RandomAccess) {
                                                size = zzmjVar.size();
                                                i78 = iZzj;
                                                objZzn2 = null;
                                                i80 = 0;
                                                for (i79 = 0; i79 < size; i79++) {
                                                    iIntValue2 = ((java.lang.Integer) zzmjVar.get(i79)).intValue();
                                                    if (zzmgVarZzu2.zza(iIntValue2)) {
                                                        if (i79 != i80) {
                                                            zzmjVar.set(i80, java.lang.Integer.valueOf(iIntValue2));
                                                        }
                                                        i80++;
                                                    } else {
                                                        objZzn2 = com.google.android.gms.internal.measurement.zznu.zzn(obj5, i38, iIntValue2, objZzn2, zzoeVar);
                                                    }
                                                }
                                                if (i80 != size) {
                                                    zzmjVar.subList(i80, size).clear();
                                                }
                                            } else {
                                                i78 = iZzj;
                                                it = zzmjVar.iterator();
                                                objZzn = null;
                                                while (it.hasNext()) {
                                                    iIntValue = ((java.lang.Integer) it.next()).intValue();
                                                    if (!zzmgVarZzu2.zza(iIntValue)) {
                                                        objZzn = com.google.android.gms.internal.measurement.zznu.zzn(obj5, i38, iIntValue, objZzn, zzoeVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            unsafe = unsafe3;
                                            i55 = i38;
                                            zzksVar4 = zzksVar3;
                                            iZzg = i78;
                                            i52 = i75;
                                            i59 = i41;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i75 = i37;
                                            if (i14 == 2) {
                                                if (i14 == 0) {
                                                    int i118 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                    zzmeVar3 = (com.google.android.gms.internal.measurement.zzme) zzmjVar;
                                                    iZzh15 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar3);
                                                    zzmeVar3.zzh(com.google.android.gms.internal.measurement.zzlg.zzb(zzksVar3.zza));
                                                    while (iZzh15 < i2) {
                                                        iZzh16 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh15, zzksVar3);
                                                        if (i75 == zzksVar3.zza) {
                                                            iZzh15 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh16, zzksVar3);
                                                            zzmeVar3.zzh(com.google.android.gms.internal.measurement.zzlg.zzb(zzksVar3.zza));
                                                        }
                                                    }
                                                }
                                                zzksVar4 = zzksVar3;
                                                unsafe = unsafe;
                                                i40 = i40;
                                                i55 = i38;
                                                i52 = i75;
                                                i59 = i41;
                                                iZzg = i40;
                                                if (iZzg != i40) {
                                                    i2 = i2;
                                                    obj5 = obj;
                                                    i90 = i55;
                                                    i87 = i59;
                                                    unsafe4 = unsafe;
                                                    i88 = i52;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i85 = i3;
                                                    zzksVar5 = zzksVar4;
                                                } else {
                                                    i2 = i2;
                                                    obj2 = obj;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    zzksVar2 = zzksVar4;
                                                    i86 = i59;
                                                    unsafe4 = unsafe;
                                                    i10 = i52;
                                                    i13 = i55;
                                                }
                                            } else {
                                                int i119 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzmeVar4 = (com.google.android.gms.internal.measurement.zzme) zzmjVar;
                                                iZzh15 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar3);
                                                i81 = zzksVar3.zza + iZzh15;
                                                while (iZzh15 < i81) {
                                                    iZzh15 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh15, zzksVar3);
                                                    zzmeVar4.zzh(com.google.android.gms.internal.measurement.zzlg.zzb(zzksVar3.zza));
                                                }
                                                if (iZzh15 != i81) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            }
                                            zzksVar4 = zzksVar3;
                                            iZzg = iZzh15;
                                            unsafe = unsafe;
                                            i40 = i40;
                                            i55 = i38;
                                            i52 = i75;
                                            i59 = i41;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            if (i14 == 2) {
                                                int i120 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzmwVar6 = (com.google.android.gms.internal.measurement.zzmw) zzmjVar;
                                                iZzh18 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar3);
                                                i82 = zzksVar3.zza + iZzh18;
                                                while (iZzh18 < i82) {
                                                    iZzh18 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, iZzh18, zzksVar3);
                                                    zzmwVar6.zzg(com.google.android.gms.internal.measurement.zzlg.zzc(zzksVar3.zzb));
                                                }
                                                if (iZzh18 == i82) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzksVar4 = zzksVar3;
                                                iZzg = iZzh18;
                                                unsafe = unsafe;
                                                i40 = i40;
                                                i52 = i37;
                                                i55 = i38;
                                            } else if (i14 == 0) {
                                                zzksVar4 = zzksVar3;
                                                unsafe = unsafe;
                                                i40 = i40;
                                                i52 = i37;
                                                i55 = i38;
                                                i59 = i41;
                                                iZzg = i40;
                                                if (iZzg != i40) {
                                                    i2 = i2;
                                                    obj5 = obj;
                                                    i90 = i55;
                                                    i87 = i59;
                                                    unsafe4 = unsafe;
                                                    i88 = i52;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i85 = i3;
                                                    zzksVar5 = zzksVar4;
                                                } else {
                                                    i2 = i2;
                                                    obj2 = obj;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    zzksVar2 = zzksVar4;
                                                    i86 = i59;
                                                    unsafe4 = unsafe;
                                                    i10 = i52;
                                                    i13 = i55;
                                                }
                                            } else {
                                                int i121 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzmwVar5 = (com.google.android.gms.internal.measurement.zzmw) zzmjVar;
                                                iZzh15 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i40, zzksVar3);
                                                zzmwVar5.zzg(com.google.android.gms.internal.measurement.zzlg.zzc(zzksVar3.zzb));
                                                while (true) {
                                                    if (iZzh15 < i2) {
                                                        iZzh17 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh15, zzksVar3);
                                                        i75 = i37;
                                                        if (i75 == zzksVar3.zza) {
                                                            iZzh15 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, iZzh17, zzksVar3);
                                                            zzmwVar5.zzg(com.google.android.gms.internal.measurement.zzlg.zzc(zzksVar3.zzb));
                                                            i37 = i75;
                                                        }
                                                    } else {
                                                        i75 = i37;
                                                    }
                                                }
                                                zzksVar4 = zzksVar3;
                                                iZzg = iZzh15;
                                                unsafe = unsafe;
                                                i40 = i40;
                                                i55 = i38;
                                                i52 = i75;
                                            }
                                            i59 = i41;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                            break;
                                        default:
                                            zzksVar4 = zzksVar3;
                                            i40 = i40;
                                            i52 = i37;
                                            i55 = i38;
                                            unsafe = unsafe;
                                            if (i14 == 3) {
                                                i83 = (i52 & (-8)) | 4;
                                                i59 = i41;
                                                zznsVarZzv = this.zzv(i59);
                                                iZzg = com.google.android.gms.internal.measurement.zzkt.zzc(zznsVarZzv, bArr, i40, i2, i83, zzksVar);
                                                zzmjVar.add(zzksVar4.zzc);
                                                while (iZzg < i2) {
                                                    iZzh19 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzg, zzksVar4);
                                                    if (i52 == zzksVar4.zza) {
                                                        iZzg = com.google.android.gms.internal.measurement.zzkt.zzc(zznsVarZzv, bArr, iZzh19, i2, i83, zzksVar);
                                                        zzmjVar.add(zzksVar4.zzc);
                                                    }
                                                }
                                            } else {
                                                i59 = i41;
                                                iZzg = i40;
                                            }
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                            break;
                                    }
                                } else {
                                    i42 = i41;
                                    i43 = i38;
                                    zzksVar2 = zzksVar3;
                                    unsafe2 = unsafe;
                                    i44 = i37;
                                    if (iZzr == 50) {
                                        i46 = i42;
                                        j2 = iArr[i42 + 2] & 1048575;
                                        switch (iZzr) {
                                            case 51:
                                                unsafe4 = unsafe2;
                                                i10 = i44;
                                                i13 = i43;
                                                obj2 = obj;
                                                i47 = i40;
                                                if (i14 == 1) {
                                                    iZzg = i47 + 8;
                                                    unsafe4.putObject(obj2, j, java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, i47))));
                                                    unsafe4.putInt(obj2, j2, i13);
                                                } else {
                                                    iZzg = i47;
                                                }
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                                break;
                                            case 52:
                                                unsafe4 = unsafe2;
                                                i10 = i44;
                                                i13 = i43;
                                                obj2 = obj;
                                                i47 = i40;
                                                if (i14 == 5) {
                                                    iZzg = i47 + 4;
                                                    unsafe4.putObject(obj2, j, java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, i47))));
                                                    unsafe4.putInt(obj2, j2, i13);
                                                } else {
                                                    iZzg = i47;
                                                }
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                unsafe4 = unsafe2;
                                                i10 = i44;
                                                i13 = i43;
                                                obj2 = obj;
                                                i47 = i40;
                                                if (i14 == 0) {
                                                    iZzk = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i47, zzksVar2);
                                                    unsafe4.putObject(obj2, j, java.lang.Long.valueOf(zzksVar2.zzb));
                                                    unsafe4.putInt(obj2, j2, i13);
                                                    iZzg = iZzk;
                                                } else {
                                                    iZzg = i47;
                                                }
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                unsafe4 = unsafe2;
                                                i10 = i44;
                                                i13 = i43;
                                                obj2 = obj;
                                                i47 = i40;
                                                if (i14 == 0) {
                                                    iZzk = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i47, zzksVar2);
                                                    unsafe4.putObject(obj2, j, java.lang.Integer.valueOf(zzksVar2.zza));
                                                    unsafe4.putInt(obj2, j2, i13);
                                                    iZzg = iZzk;
                                                } else {
                                                    iZzg = i47;
                                                }
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                unsafe4 = unsafe2;
                                                i10 = i44;
                                                i13 = i43;
                                                obj2 = obj;
                                                i47 = i40;
                                                if (i14 == 1) {
                                                    iZzg = i47 + 8;
                                                    unsafe4.putObject(obj2, j, java.lang.Long.valueOf(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, i47)));
                                                    unsafe4.putInt(obj2, j2, i13);
                                                } else {
                                                    iZzg = i47;
                                                }
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                unsafe4 = unsafe2;
                                                i10 = i44;
                                                i13 = i43;
                                                obj2 = obj;
                                                i47 = i40;
                                                if (i14 == 5) {
                                                    iZzg = i47 + 4;
                                                    unsafe4.putObject(obj2, j, java.lang.Integer.valueOf(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, i47)));
                                                    unsafe4.putInt(obj2, j2, i13);
                                                } else {
                                                    iZzg = i47;
                                                }
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                                break;
                                            case 58:
                                                unsafe4 = unsafe2;
                                                i10 = i44;
                                                i13 = i43;
                                                obj2 = obj;
                                                i47 = i40;
                                                if (i14 == 0) {
                                                    iZzk = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i47, zzksVar2);
                                                    if (zzksVar2.zzb != 0) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    unsafe4.putObject(obj2, j, java.lang.Boolean.valueOf(z2));
                                                    unsafe4.putInt(obj2, j2, i13);
                                                    iZzg = iZzk;
                                                } else {
                                                    iZzg = i47;
                                                }
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                                break;
                                            case 59:
                                                unsafe4 = unsafe2;
                                                i10 = i44;
                                                i13 = i43;
                                                obj2 = obj;
                                                i47 = i40;
                                                if (i14 == 2) {
                                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i47, zzksVar2);
                                                    i48 = zzksVar2.zza;
                                                    if (i48 == 0) {
                                                        unsafe4.putObject(obj2, j, "");
                                                    } else {
                                                        i49 = iZzg + i48;
                                                        if ((i15 & 536870912) == 0 && !com.google.android.gms.internal.measurement.zzoo.zzd(bArr, iZzg, i49)) {
                                                            throw new com.google.android.gms.internal.measurement.zzmm(str);
                                                        }
                                                        unsafe4.putObject(obj2, j, new java.lang.String(bArr, iZzg, i48, com.google.android.gms.internal.measurement.zzmk.zza));
                                                        iZzg = i49;
                                                    }
                                                    unsafe4.putInt(obj2, j2, i13);
                                                } else {
                                                    iZzg = i47;
                                                }
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                                break;
                                            case 60:
                                                i10 = i44;
                                                i50 = i46;
                                                i13 = i43;
                                                obj2 = obj;
                                                i47 = i40;
                                                if (i14 == 2) {
                                                    java.lang.Object objZzy = this.zzy(obj2, i13, i50);
                                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzm(objZzy, this.zzv(i50), bArr, i47, i2, zzksVar);
                                                    this.zzG(obj2, i13, i50, objZzy);
                                                    unsafe4 = unsafe2;
                                                    i46 = i50;
                                                } else {
                                                    i46 = i50;
                                                    unsafe4 = unsafe2;
                                                    iZzg = i47;
                                                }
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                                break;
                                            case 61:
                                                i10 = i44;
                                                i50 = i46;
                                                i13 = i43;
                                                obj2 = obj;
                                                i47 = i40;
                                                if (i14 == 2) {
                                                    iZza = com.google.android.gms.internal.measurement.zzkt.zza(bArr, i47, zzksVar2);
                                                    unsafe2.putObject(obj2, j, zzksVar2.zzc);
                                                    unsafe2.putInt(obj2, j2, i13);
                                                    i46 = i50;
                                                    unsafe4 = unsafe2;
                                                    iZzg = iZza;
                                                    if (iZzg != i47) {
                                                        zzksVar2 = zzksVar2;
                                                        this = this;
                                                        unsafe4 = unsafe4;
                                                        zzksVar5 = zzksVar2;
                                                        obj5 = obj2;
                                                        i88 = i10;
                                                        i90 = i13;
                                                        i91 = i91;
                                                        i86 = 0;
                                                        i89 = i11;
                                                        i87 = i46;
                                                        i85 = i3;
                                                    } else {
                                                        zzksVar2 = zzksVar2;
                                                        i4 = i3;
                                                        i9 = iZzg;
                                                        i86 = i46;
                                                    }
                                                }
                                                i46 = i50;
                                                unsafe4 = unsafe2;
                                                iZzg = i47;
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                                break;
                                            case 63:
                                                i10 = i44;
                                                i50 = i46;
                                                i13 = i43;
                                                obj2 = obj;
                                                i47 = i40;
                                                if (i14 == 0) {
                                                    iZza = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i47, zzksVar2);
                                                    i51 = zzksVar2.zza;
                                                    zzmgVarZzu = this.zzu(i50);
                                                    if (zzmgVarZzu != null || zzmgVarZzu.zza(i51)) {
                                                        unsafe2.putObject(obj2, j, java.lang.Integer.valueOf(i51));
                                                        unsafe2.putInt(obj2, j2, i13);
                                                    } else {
                                                        zzd(obj).zzj(i10, java.lang.Long.valueOf(i51));
                                                    }
                                                    i46 = i50;
                                                    unsafe4 = unsafe2;
                                                    iZzg = iZza;
                                                    if (iZzg != i47) {
                                                        zzksVar2 = zzksVar2;
                                                        this = this;
                                                        unsafe4 = unsafe4;
                                                        zzksVar5 = zzksVar2;
                                                        obj5 = obj2;
                                                        i88 = i10;
                                                        i90 = i13;
                                                        i91 = i91;
                                                        i86 = 0;
                                                        i89 = i11;
                                                        i87 = i46;
                                                        i85 = i3;
                                                    } else {
                                                        zzksVar2 = zzksVar2;
                                                        i4 = i3;
                                                        i9 = iZzg;
                                                        i86 = i46;
                                                    }
                                                }
                                                i46 = i50;
                                                unsafe4 = unsafe2;
                                                iZzg = i47;
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                                break;
                                            case 66:
                                                i10 = i44;
                                                i50 = i46;
                                                i13 = i43;
                                                obj2 = obj;
                                                i47 = i40;
                                                if (i14 == 0) {
                                                    iZza = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i47, zzksVar2);
                                                    unsafe2.putObject(obj2, j, java.lang.Integer.valueOf(com.google.android.gms.internal.measurement.zzlg.zzb(zzksVar2.zza)));
                                                    unsafe2.putInt(obj2, j2, i13);
                                                    i46 = i50;
                                                    unsafe4 = unsafe2;
                                                    iZzg = iZza;
                                                    if (iZzg != i47) {
                                                        zzksVar2 = zzksVar2;
                                                        this = this;
                                                        unsafe4 = unsafe4;
                                                        zzksVar5 = zzksVar2;
                                                        obj5 = obj2;
                                                        i88 = i10;
                                                        i90 = i13;
                                                        i91 = i91;
                                                        i86 = 0;
                                                        i89 = i11;
                                                        i87 = i46;
                                                        i85 = i3;
                                                    } else {
                                                        zzksVar2 = zzksVar2;
                                                        i4 = i3;
                                                        i9 = iZzg;
                                                        i86 = i46;
                                                    }
                                                }
                                                i46 = i50;
                                                unsafe4 = unsafe2;
                                                iZzg = i47;
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                                break;
                                            case 67:
                                                i10 = i44;
                                                i50 = i46;
                                                i13 = i43;
                                                obj2 = obj;
                                                if (i14 == 0) {
                                                    i47 = i40;
                                                    int iZzk4 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i47, zzksVar2);
                                                    unsafe2.putObject(obj2, j, java.lang.Long.valueOf(com.google.android.gms.internal.measurement.zzlg.zzc(zzksVar2.zzb)));
                                                    unsafe2.putInt(obj2, j2, i13);
                                                    i46 = i50;
                                                    unsafe4 = unsafe2;
                                                    iZzg = iZzk4;
                                                } else {
                                                    i47 = i40;
                                                    i46 = i50;
                                                    unsafe4 = unsafe2;
                                                    iZzg = i47;
                                                }
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                                break;
                                            case 68:
                                                if (i14 == 3) {
                                                    java.lang.Object objZzy2 = this.zzy(obj, i43, i46);
                                                    int iZzl2 = com.google.android.gms.internal.measurement.zzkt.zzl(objZzy2, this.zzv(i46), bArr, i40, i2, (i44 & (-8)) | 4, zzksVar);
                                                    this.zzG(obj, i43, i46, objZzy2);
                                                    i13 = i43;
                                                    i10 = i44;
                                                    i47 = i40;
                                                    unsafe4 = unsafe2;
                                                    iZzg = iZzl2;
                                                    obj2 = obj;
                                                }
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                    break;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                    break;
                                                }
                                            default:
                                                unsafe4 = unsafe2;
                                                i10 = i44;
                                                i13 = i43;
                                                obj2 = obj;
                                                i47 = i40;
                                                iZzg = i47;
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i14 == 2) {
                                            java.lang.Object objZzw = this.zzw(i42);
                                            object = unsafe2.getObject(obj, j);
                                            if (!((com.google.android.gms.internal.measurement.zznb) object).zze()) {
                                                com.google.android.gms.internal.measurement.zznb zznbVarZzb = com.google.android.gms.internal.measurement.zznb.zza().zzb();
                                                com.google.android.gms.internal.measurement.zznc.zza(zznbVarZzb, object);
                                                unsafe2.putObject(obj, j, zznbVarZzb);
                                            }
                                            throw null;
                                        }
                                        obj3 = obj;
                                        i45 = i40;
                                        i4 = i3;
                                        unsafe4 = unsafe2;
                                        i9 = i45;
                                        i86 = i42;
                                        i10 = i44;
                                        i13 = i43;
                                        obj2 = obj3;
                                    }
                                }
                                if (i10 == i4) {
                                }
                                if (this.zzh) {
                                    zzlpVar = zzksVar2.zzd;
                                    int i122 = com.google.android.gms.internal.measurement.zzlp.zzb;
                                    int i123 = com.google.android.gms.internal.measurement.zznp.zza;
                                    if (zzlpVar != com.google.android.gms.internal.measurement.zzlp.zza) {
                                        zznhVar = this.zzg;
                                        int i124 = com.google.android.gms.internal.measurement.zzkt.zza;
                                        if (zzlpVar.zzb(zznhVar, i13) == null) {
                                            throw null;
                                        }
                                        iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                                    } else {
                                        iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                                    }
                                } else {
                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                                }
                                i2 = i2;
                                zzksVar5 = zzksVar;
                                i88 = i10;
                                i87 = i86;
                                i90 = i13;
                                i91 = i91;
                                i86 = i12;
                                i89 = i11;
                                i85 = i4;
                                this = this;
                                obj5 = obj2;
                            } else if (i14 == 2) {
                                zzmjVarZzd2 = (com.google.android.gms.internal.measurement.zzmj) unsafe.getObject(obj5, j);
                                if (!zzmjVarZzd2.zzc()) {
                                    size2 = zzmjVarZzd2.size();
                                    if (size2 == 0) {
                                        i84 = 10;
                                    } else {
                                        i84 = size2 + size2;
                                    }
                                    zzmjVarZzd2 = zzmjVarZzd2.zzd(i84);
                                    unsafe.putObject(obj5, j, zzmjVarZzd2);
                                }
                                int iZze2 = com.google.android.gms.internal.measurement.zzkt.zze(this.zzv(i39), i37, bArr, i40, i2, zzmjVarZzd2, zzksVar);
                                i85 = i3;
                                zzksVar5 = zzksVar3;
                                i2 = i2;
                                iZzg = iZze2;
                                unsafe4 = unsafe;
                                i87 = i39;
                                i91 = i91;
                                i86 = 0;
                                i88 = i37;
                                i89 = i11;
                                i90 = i38;
                            } else {
                                obj3 = obj5;
                                i45 = i40;
                                i44 = i37;
                                i43 = i38;
                                i42 = i39;
                                zzksVar2 = zzksVar3;
                                unsafe2 = unsafe;
                                i4 = i3;
                                unsafe4 = unsafe2;
                                i9 = i45;
                                i86 = i42;
                                i10 = i44;
                                i13 = i43;
                                obj2 = obj3;
                                if (i10 == i4 || i4 == 0) {
                                    if (this.zzh) {
                                        zzlpVar = zzksVar2.zzd;
                                        int i125 = com.google.android.gms.internal.measurement.zzlp.zzb;
                                        int i126 = com.google.android.gms.internal.measurement.zznp.zza;
                                        if (zzlpVar != com.google.android.gms.internal.measurement.zzlp.zza) {
                                            zznhVar = this.zzg;
                                            int i127 = com.google.android.gms.internal.measurement.zzkt.zza;
                                            if (zzlpVar.zzb(zznhVar, i13) == null) {
                                                throw null;
                                            }
                                            iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                                        } else {
                                            iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                                        }
                                    } else {
                                        iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                                    }
                                    i2 = i2;
                                    zzksVar5 = zzksVar;
                                    i88 = i10;
                                    i87 = i86;
                                    i90 = i13;
                                    i91 = i91;
                                    i86 = i12;
                                    i89 = i11;
                                    i85 = i4;
                                    this = this;
                                    obj5 = obj2;
                                } else {
                                    i5 = 1048575;
                                    zznkVar = this;
                                    iZzg = i9;
                                    unsafe4 = unsafe4;
                                    i88 = i10;
                                    i91 = i91;
                                    i89 = i11;
                                }
                            }
                        }
                    }
                    obj2 = obj5;
                    if (i10 == i4) {
                    }
                    if (this.zzh) {
                        zzlpVar = zzksVar2.zzd;
                        int i128 = com.google.android.gms.internal.measurement.zzlp.zzb;
                        int i129 = com.google.android.gms.internal.measurement.zznp.zza;
                        if (zzlpVar != com.google.android.gms.internal.measurement.zzlp.zza) {
                            zznhVar = this.zzg;
                            int i1210 = com.google.android.gms.internal.measurement.zzkt.zza;
                            if (zzlpVar.zzb(zznhVar, i13) == null) {
                                throw null;
                            }
                            iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                        } else {
                            iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                        }
                    } else {
                        iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                    }
                    i2 = i2;
                    zzksVar5 = zzksVar;
                    i88 = i10;
                    i87 = i86;
                    i90 = i13;
                    i91 = i91;
                    i86 = i12;
                    i89 = i11;
                    i85 = i4;
                    this = this;
                    obj5 = obj2;
                }
                i8 = iZzq;
                i7 = -1;
                if (i8 == i7) {
                    i9 = iZzi;
                    i10 = i6;
                    i11 = i89;
                    i91 = i91;
                    i12 = i86;
                    unsafe4 = unsafe4;
                    zzksVar2 = zzksVar5;
                    i4 = i85;
                    i13 = i94;
                } else {
                    i14 = i6 & 7;
                    iArr = this.zzc;
                    i15 = iArr[i8 + 1];
                    i16 = i6;
                    iZzr = zzr(i15);
                    j = i15 & 1048575;
                    i90 = i94;
                    str = "Protocol message had invalid UTF-8.";
                    if (iZzr <= 17) {
                        int i912 = iArr[i8 + 2];
                        i17 = 1 << (i912 >>> 20);
                        i18 = i912 & 1048575;
                        if (i18 != i91) {
                            if (i91 != 1048575) {
                                unsafe4.putInt(obj5, i91, i89);
                            }
                            if (i18 == 1048575) {
                                i89 = 0;
                            } else {
                                i89 = unsafe4.getInt(obj5, i18);
                            }
                            i91 = i18;
                        } else {
                            i91 = i91;
                        }
                        switch (iZzr) {
                            case 0:
                                i19 = iZzi;
                                i20 = i8;
                                i21 = i16;
                                i86 = 0;
                                if (i14 == 1) {
                                    iZzg = i19 + 8;
                                    i89 |= i17;
                                    com.google.android.gms.internal.measurement.zzol.zzo(obj5, j, java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, i19)));
                                    i88 = i21;
                                    i87 = i20;
                                    i85 = i3;
                                } else {
                                    i89 = i89;
                                    iZzi = i19;
                                    i12 = i86;
                                    unsafe4 = unsafe4;
                                    zzksVar5 = zzksVar5;
                                    i22 = i21;
                                    i23 = i20;
                                    i90 = i90;
                                    i4 = i3;
                                    i13 = i90;
                                    unsafe4 = unsafe4;
                                    i86 = i23;
                                    i11 = i89;
                                    i9 = iZzi;
                                    i10 = i22;
                                    zzksVar2 = zzksVar5;
                                }
                                break;
                            case 1:
                                i19 = iZzi;
                                i20 = i8;
                                i21 = i16;
                                i86 = 0;
                                if (i14 == 5) {
                                    iZzg = i19 + 4;
                                    i89 |= i17;
                                    com.google.android.gms.internal.measurement.zzol.zzp(obj5, j, java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, i19)));
                                    i88 = i21;
                                    i87 = i20;
                                    i85 = i3;
                                } else {
                                    i89 = i89;
                                    iZzi = i19;
                                    i12 = i86;
                                    unsafe4 = unsafe4;
                                    zzksVar5 = zzksVar5;
                                    i22 = i21;
                                    i23 = i20;
                                    i90 = i90;
                                    i4 = i3;
                                    i13 = i90;
                                    unsafe4 = unsafe4;
                                    i86 = i23;
                                    i11 = i89;
                                    i9 = iZzi;
                                    i10 = i22;
                                    zzksVar2 = zzksVar5;
                                }
                                break;
                            case 2:
                            case 3:
                                i19 = iZzi;
                                i20 = i8;
                                i21 = i16;
                                i86 = 0;
                                if (i14 == 0) {
                                    int i913 = i89 | i17;
                                    int iZzk5 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i19, zzksVar5);
                                    unsafe4.putLong(obj, j, zzksVar5.zzb);
                                    i89 = i913;
                                    iZzg = iZzk5;
                                    i88 = i21;
                                    i87 = i20;
                                    i85 = i3;
                                } else {
                                    i89 = i89;
                                    iZzi = i19;
                                    i12 = i86;
                                    unsafe4 = unsafe4;
                                    zzksVar5 = zzksVar5;
                                    i22 = i21;
                                    i23 = i20;
                                    i90 = i90;
                                    i4 = i3;
                                    i13 = i90;
                                    unsafe4 = unsafe4;
                                    i86 = i23;
                                    i11 = i89;
                                    i9 = iZzi;
                                    i10 = i22;
                                    zzksVar2 = zzksVar5;
                                }
                                break;
                            case 4:
                            case 11:
                                i19 = iZzi;
                                i20 = i8;
                                i21 = i16;
                                i86 = 0;
                                if (i14 == 0) {
                                    i89 |= i17;
                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i19, zzksVar5);
                                    unsafe4.putInt(obj5, j, zzksVar5.zza);
                                    i88 = i21;
                                    i87 = i20;
                                    i85 = i3;
                                } else {
                                    i89 = i89;
                                    iZzi = i19;
                                    i12 = i86;
                                    unsafe4 = unsafe4;
                                    zzksVar5 = zzksVar5;
                                    i22 = i21;
                                    i23 = i20;
                                    i90 = i90;
                                    i4 = i3;
                                    i13 = i90;
                                    unsafe4 = unsafe4;
                                    i86 = i23;
                                    i11 = i89;
                                    i9 = iZzi;
                                    i10 = i22;
                                    zzksVar2 = zzksVar5;
                                }
                                break;
                            case 5:
                            case 14:
                                i19 = iZzi;
                                i20 = i8;
                                i21 = i16;
                                i86 = 0;
                                if (i14 == 1) {
                                    unsafe4.putLong(obj, j, com.google.android.gms.internal.measurement.zzkt.zzn(bArr, i19));
                                    iZzg = i19 + 8;
                                    i89 = i17 | i89;
                                    i88 = i21;
                                    i87 = i20;
                                    i85 = i3;
                                } else {
                                    i89 = i89;
                                    iZzi = i19;
                                    i12 = i86;
                                    unsafe4 = unsafe4;
                                    zzksVar5 = zzksVar5;
                                    i22 = i21;
                                    i23 = i20;
                                    i90 = i90;
                                    i4 = i3;
                                    i13 = i90;
                                    unsafe4 = unsafe4;
                                    i86 = i23;
                                    i11 = i89;
                                    i9 = iZzi;
                                    i10 = i22;
                                    zzksVar2 = zzksVar5;
                                }
                                break;
                            case 6:
                            case 13:
                                i19 = iZzi;
                                i20 = i8;
                                i21 = i16;
                                i86 = 0;
                                if (i14 == 5) {
                                    iZzg = i19 + 4;
                                    i89 |= i17;
                                    unsafe4.putInt(obj5, j, com.google.android.gms.internal.measurement.zzkt.zzb(bArr, i19));
                                    i88 = i21;
                                    i87 = i20;
                                    i85 = i3;
                                } else {
                                    i89 = i89;
                                    iZzi = i19;
                                    i12 = i86;
                                    unsafe4 = unsafe4;
                                    zzksVar5 = zzksVar5;
                                    i22 = i21;
                                    i23 = i20;
                                    i90 = i90;
                                    i4 = i3;
                                    i13 = i90;
                                    unsafe4 = unsafe4;
                                    i86 = i23;
                                    i11 = i89;
                                    i9 = iZzi;
                                    i10 = i22;
                                    zzksVar2 = zzksVar5;
                                }
                                break;
                            case 7:
                                i19 = iZzi;
                                i20 = i8;
                                i21 = i16;
                                i86 = 0;
                                if (i14 == 0) {
                                    i89 |= i17;
                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i19, zzksVar5);
                                    if (zzksVar5.zzb != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    com.google.android.gms.internal.measurement.zzol.zzm(obj5, j, z);
                                    i88 = i21;
                                    i87 = i20;
                                    i85 = i3;
                                } else {
                                    i89 = i89;
                                    iZzi = i19;
                                    i12 = i86;
                                    unsafe4 = unsafe4;
                                    zzksVar5 = zzksVar5;
                                    i22 = i21;
                                    i23 = i20;
                                    i90 = i90;
                                    i4 = i3;
                                    i13 = i90;
                                    unsafe4 = unsafe4;
                                    i86 = i23;
                                    i11 = i89;
                                    i9 = iZzi;
                                    i10 = i22;
                                    zzksVar2 = zzksVar5;
                                }
                                break;
                            case 8:
                                i24 = iZzi;
                                i20 = i8;
                                i21 = i16;
                                if (i14 == 2) {
                                    if ((i15 & 536870912) != 0) {
                                        iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i24, zzksVar5);
                                        i26 = zzksVar5.zza;
                                        if (i26 >= 0) {
                                            throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        i27 = i89 | i17;
                                        if (i26 == 0) {
                                            zzksVar5.zzc = "";
                                            i30 = i27;
                                            i86 = 0;
                                        } else {
                                            int i914 = com.google.android.gms.internal.measurement.zzoo.zza;
                                            length = bArr.length;
                                            if ((((length - iZzg) - i26) | iZzg | i26) >= 0) {
                                                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(iZzg), java.lang.Integer.valueOf(i26)));
                                            }
                                            i28 = iZzg + i26;
                                            cArr = new char[i26];
                                            i29 = 0;
                                            while (iZzg < i28) {
                                                b3 = bArr[iZzg];
                                                if (com.google.android.gms.internal.measurement.zzom.zzd(b3)) {
                                                    iZzg++;
                                                    cArr[i29] = (char) b3;
                                                    i29++;
                                                } else {
                                                    while (iZzg < i28) {
                                                        i31 = iZzg + 1;
                                                        b = bArr[iZzg];
                                                        if (com.google.android.gms.internal.measurement.zzom.zzd(b)) {
                                                            i32 = i29 + 1;
                                                            cArr[i29] = (char) b;
                                                            iZzg = i31;
                                                            while (true) {
                                                                i29 = i32;
                                                                if (iZzg < i28) {
                                                                }
                                                                b2 = bArr[iZzg];
                                                                if (com.google.android.gms.internal.measurement.zzom.zzd(b2)) {
                                                                }
                                                                iZzg++;
                                                                i32 = i29 + 1;
                                                                cArr[i29] = (char) b2;
                                                                break;
                                                                break;
                                                            }
                                                        } else if (b < -32) {
                                                            i33 = i27;
                                                            str2 = str;
                                                            if (b < -16) {
                                                                if (i31 < i28 - 1) {
                                                                    throw new com.google.android.gms.internal.measurement.zzmm(str2);
                                                                }
                                                                int i915 = i31 + 1;
                                                                com.google.android.gms.internal.measurement.zzom.zzb(b, bArr[i31], bArr[i915], cArr, i29);
                                                                i29++;
                                                                str = str2;
                                                                i27 = i33;
                                                                iZzg = i915 + 1;
                                                            } else {
                                                                if (i31 < i28 - 2) {
                                                                    throw new com.google.android.gms.internal.measurement.zzmm(str2);
                                                                }
                                                                int i916 = i31 + 1;
                                                                byte b6 = bArr[i31];
                                                                int i1010 = i916 + 1;
                                                                com.google.android.gms.internal.measurement.zzom.zza(b, b6, bArr[i916], bArr[i1010], cArr, i29);
                                                                i29 += 2;
                                                                iZzg = i1010 + 1;
                                                                str = str2;
                                                                i27 = i33;
                                                            }
                                                        } else {
                                                            if (i31 < i28) {
                                                                throw new com.google.android.gms.internal.measurement.zzmm(str);
                                                            }
                                                            com.google.android.gms.internal.measurement.zzom.zzc(b, bArr[i31], cArr, i29);
                                                            i29++;
                                                            iZzg = i31 + 1;
                                                        }
                                                    }
                                                    i30 = i27;
                                                    i86 = 0;
                                                    zzksVar5.zzc = new java.lang.String(cArr, 0, i29);
                                                    iZzg = i28;
                                                }
                                            }
                                            while (iZzg < i28) {
                                                i31 = iZzg + 1;
                                                b = bArr[iZzg];
                                                if (com.google.android.gms.internal.measurement.zzom.zzd(b)) {
                                                    i32 = i29 + 1;
                                                    cArr[i29] = (char) b;
                                                    iZzg = i31;
                                                    while (true) {
                                                        i29 = i32;
                                                        if (iZzg < i28) {
                                                        }
                                                        b2 = bArr[iZzg];
                                                        if (com.google.android.gms.internal.measurement.zzom.zzd(b2)) {
                                                        }
                                                        iZzg++;
                                                        i32 = i29 + 1;
                                                        cArr[i29] = (char) b2;
                                                        break;
                                                        break;
                                                    }
                                                } else if (b < -32) {
                                                    i33 = i27;
                                                    str2 = str;
                                                    if (b < -16) {
                                                        if (i31 < i28 - 1) {
                                                            throw new com.google.android.gms.internal.measurement.zzmm(str2);
                                                        }
                                                        int i917 = i31 + 1;
                                                        com.google.android.gms.internal.measurement.zzom.zzb(b, bArr[i31], bArr[i917], cArr, i29);
                                                        i29++;
                                                        str = str2;
                                                        i27 = i33;
                                                        iZzg = i917 + 1;
                                                    } else {
                                                        if (i31 < i28 - 2) {
                                                            throw new com.google.android.gms.internal.measurement.zzmm(str2);
                                                        }
                                                        int i918 = i31 + 1;
                                                        byte b7 = bArr[i31];
                                                        int i1011 = i918 + 1;
                                                        com.google.android.gms.internal.measurement.zzom.zza(b, b7, bArr[i918], bArr[i1011], cArr, i29);
                                                        i29 += 2;
                                                        iZzg = i1011 + 1;
                                                        str = str2;
                                                        i27 = i33;
                                                    }
                                                } else {
                                                    if (i31 < i28) {
                                                        throw new com.google.android.gms.internal.measurement.zzmm(str);
                                                    }
                                                    com.google.android.gms.internal.measurement.zzom.zzc(b, bArr[i31], cArr, i29);
                                                    i29++;
                                                    iZzg = i31 + 1;
                                                }
                                            }
                                            i30 = i27;
                                            i86 = 0;
                                            zzksVar5.zzc = new java.lang.String(cArr, 0, i29);
                                            iZzg = i28;
                                        }
                                        i89 = i30;
                                    } else {
                                        i86 = 0;
                                        iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i24, zzksVar5);
                                        i25 = zzksVar5.zza;
                                        if (i25 >= 0) {
                                            throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        int i1012 = i89 | i17;
                                        if (i25 == 0) {
                                            zzksVar5.zzc = "";
                                        } else {
                                            zzksVar5.zzc = new java.lang.String(bArr, iZzg, i25, com.google.android.gms.internal.measurement.zzmk.zza);
                                            iZzg += i25;
                                        }
                                        i89 = i1012;
                                    }
                                    unsafe4.putObject(obj5, j, zzksVar5.zzc);
                                    i88 = i21;
                                    i87 = i20;
                                    i85 = i3;
                                } else {
                                    i89 = i89;
                                    iZzi = i24;
                                    unsafe4 = unsafe4;
                                    zzksVar5 = zzksVar5;
                                    i22 = i21;
                                    i23 = i20;
                                    i12 = 0;
                                    i4 = i3;
                                    i13 = i90;
                                    unsafe4 = unsafe4;
                                    i86 = i23;
                                    i11 = i89;
                                    i9 = iZzi;
                                    i10 = i22;
                                    zzksVar2 = zzksVar5;
                                }
                                break;
                            case 9:
                                i34 = i8;
                                i35 = i16;
                                if (i14 == 2) {
                                    int i1013 = i89 | i17;
                                    java.lang.Object objZzx3 = this.zzx(obj5, i34);
                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzm(objZzx3, this.zzv(i34), bArr, iZzi, i2, zzksVar);
                                    this.zzF(obj5, i34, objZzx3);
                                    i89 = i1013;
                                    i88 = i35;
                                    i87 = i34;
                                    i86 = 0;
                                    i85 = i3;
                                } else {
                                    i22 = i35;
                                    i23 = i34;
                                    i12 = 0;
                                    i4 = i3;
                                    i13 = i90;
                                    unsafe4 = unsafe4;
                                    i86 = i23;
                                    i11 = i89;
                                    i9 = iZzi;
                                    i10 = i22;
                                    zzksVar2 = zzksVar5;
                                }
                                break;
                            case 10:
                                i34 = i8;
                                i35 = i16;
                                if (i14 == 2) {
                                    i89 |= i17;
                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zza(bArr, iZzi, zzksVar5);
                                    unsafe4.putObject(obj5, j, zzksVar5.zzc);
                                    i88 = i35;
                                    i87 = i34;
                                    i86 = 0;
                                    i85 = i3;
                                } else {
                                    i22 = i35;
                                    i23 = i34;
                                    i12 = 0;
                                    i4 = i3;
                                    i13 = i90;
                                    unsafe4 = unsafe4;
                                    i86 = i23;
                                    i11 = i89;
                                    i9 = iZzi;
                                    i10 = i22;
                                    zzksVar2 = zzksVar5;
                                }
                                break;
                            case 12:
                                i34 = i8;
                                i35 = i16;
                                if (i14 == 0) {
                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzi, zzksVar5);
                                    i36 = zzksVar5.zza;
                                    com.google.android.gms.internal.measurement.zzmg zzmgVarZzu4 = this.zzu(i34);
                                    if ((i15 & Integer.MIN_VALUE) != 0) {
                                        i89 |= i17;
                                        unsafe4.putInt(obj5, j, i36);
                                    } else {
                                        i89 |= i17;
                                        unsafe4.putInt(obj5, j, i36);
                                    }
                                    i88 = i35;
                                    i87 = i34;
                                    i86 = 0;
                                    i85 = i3;
                                } else {
                                    i22 = i35;
                                    i23 = i34;
                                    i12 = 0;
                                    i4 = i3;
                                    i13 = i90;
                                    unsafe4 = unsafe4;
                                    i86 = i23;
                                    i11 = i89;
                                    i9 = iZzi;
                                    i10 = i22;
                                    zzksVar2 = zzksVar5;
                                }
                                break;
                            case 15:
                                i34 = i8;
                                i35 = i16;
                                if (i14 == 0) {
                                    i89 |= i17;
                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzi, zzksVar5);
                                    unsafe4.putInt(obj5, j, com.google.android.gms.internal.measurement.zzlg.zzb(zzksVar5.zza));
                                    i88 = i35;
                                    i87 = i34;
                                    i86 = 0;
                                    i85 = i3;
                                } else {
                                    i22 = i35;
                                    i23 = i34;
                                    i12 = 0;
                                    i4 = i3;
                                    i13 = i90;
                                    unsafe4 = unsafe4;
                                    i86 = i23;
                                    i11 = i89;
                                    i9 = iZzi;
                                    i10 = i22;
                                    zzksVar2 = zzksVar5;
                                }
                                break;
                            case 16:
                                if (i14 == 0) {
                                    int i1014 = i89 | i17;
                                    int iZzk6 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, iZzi, zzksVar5);
                                    i34 = i8;
                                    i35 = i16;
                                    unsafe4.putLong(obj, j, com.google.android.gms.internal.measurement.zzlg.zzc(zzksVar5.zzb));
                                    i89 = i1014;
                                    iZzg = iZzk6;
                                    i88 = i35;
                                    i87 = i34;
                                    i86 = 0;
                                    i85 = i3;
                                } else {
                                    i23 = i8;
                                    i22 = i16;
                                    i12 = 0;
                                    i4 = i3;
                                    i13 = i90;
                                    unsafe4 = unsafe4;
                                    i86 = i23;
                                    i11 = i89;
                                    i9 = iZzi;
                                    i10 = i22;
                                    zzksVar2 = zzksVar5;
                                }
                                break;
                            default:
                                i19 = iZzi;
                                i20 = i8;
                                i21 = i16;
                                i86 = 0;
                                if (i14 == 3) {
                                    java.lang.Object objZzx4 = this.zzx(obj5, i20);
                                    int iZzl3 = com.google.android.gms.internal.measurement.zzkt.zzl(objZzx4, this.zzv(i20), bArr, i19, i2, (i90 << 3) | 4, zzksVar);
                                    this.zzF(obj5, i20, objZzx4);
                                    i85 = i3;
                                    zzksVar5 = zzksVar;
                                    i2 = i2;
                                    i90 = i90;
                                    unsafe4 = unsafe4;
                                    i87 = i20;
                                    iZzg = iZzl3;
                                    i91 = i91;
                                    i86 = 0;
                                    i88 = i21;
                                    i89 |= i17;
                                } else {
                                    i89 = i89;
                                    iZzi = i19;
                                    i12 = i86;
                                    unsafe4 = unsafe4;
                                    zzksVar5 = zzksVar5;
                                    i22 = i21;
                                    i23 = i20;
                                    i90 = i90;
                                    i4 = i3;
                                    i13 = i90;
                                    unsafe4 = unsafe4;
                                    i86 = i23;
                                    i11 = i89;
                                    i9 = iZzi;
                                    i10 = i22;
                                    zzksVar2 = zzksVar5;
                                }
                                break;
                        }
                    } else {
                        i91 = i91;
                        i37 = i16;
                        i38 = i90;
                        i12 = 0;
                        i39 = i8;
                        i11 = i89;
                        unsafe = unsafe4;
                        i40 = iZzi;
                        zzksVar3 = zzksVar5;
                        if (iZzr == 27) {
                            i2 = i2;
                            i41 = i39;
                            if (iZzr <= 49) {
                                j3 = i15;
                                zzmjVarZzd = (com.google.android.gms.internal.measurement.zzmj) unsafe.getObject(obj5, j);
                                if (!zzmjVarZzd.zzc()) {
                                    int size4 = zzmjVarZzd.size();
                                    zzmjVarZzd = zzmjVarZzd.zzd(size4 + size4);
                                    unsafe.putObject(obj5, j, zzmjVarZzd);
                                }
                                zzmjVar = zzmjVarZzd;
                                switch (iZzr) {
                                    case 18:
                                    case 35:
                                        zzksVar4 = zzksVar3;
                                        i40 = i40;
                                        i52 = i37;
                                        i53 = i38;
                                        i54 = i41;
                                        unsafe = unsafe;
                                        if (i14 == 2) {
                                            i55 = i53;
                                            i41 = i54;
                                            if (i14 == 1) {
                                                iZzg = i40 + 8;
                                                int i1015 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzlmVar = (com.google.android.gms.internal.measurement.zzlm) zzmjVar;
                                                zzlmVar.zzf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, i40)));
                                                while (iZzg < i2) {
                                                    iZzh = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzg, zzksVar4);
                                                    if (i52 == zzksVar4.zza) {
                                                        zzlmVar.zzf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, iZzh)));
                                                        iZzg = iZzh + 8;
                                                    }
                                                }
                                            }
                                            i59 = i41;
                                            iZzg = i40;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                        } else {
                                            int i1016 = com.google.android.gms.internal.measurement.zzkt.zza;
                                            zzlmVar2 = (com.google.android.gms.internal.measurement.zzlm) zzmjVar;
                                            iZzh2 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar4);
                                            i56 = zzksVar4.zza;
                                            i57 = iZzh2 + i56;
                                            if (i57 <= bArr.length) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzlmVar2.zzg(zzlmVar2.size() + (i56 / 8));
                                            while (iZzh2 < i57) {
                                                zzlmVar2.zzf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, iZzh2)));
                                                iZzh2 += 8;
                                                i53 = i53;
                                                i54 = i54;
                                            }
                                            i55 = i53;
                                            i41 = i54;
                                            if (iZzh2 == i57) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iZzg = iZzh2;
                                        }
                                        i59 = i41;
                                        if (iZzg != i40) {
                                            i2 = i2;
                                            obj5 = obj;
                                            i90 = i55;
                                            i87 = i59;
                                            unsafe4 = unsafe;
                                            i88 = i52;
                                            i91 = i91;
                                            i86 = 0;
                                            i89 = i11;
                                            i85 = i3;
                                            zzksVar5 = zzksVar4;
                                        } else {
                                            i2 = i2;
                                            obj2 = obj;
                                            i4 = i3;
                                            i9 = iZzg;
                                            zzksVar2 = zzksVar4;
                                            i86 = i59;
                                            unsafe4 = unsafe;
                                            i10 = i52;
                                            i13 = i55;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        zzksVar4 = zzksVar3;
                                        i40 = i40;
                                        i52 = i37;
                                        i58 = i38;
                                        i59 = i41;
                                        unsafe = unsafe;
                                        if (i14 == 2) {
                                            if (i14 == 5) {
                                                iZzg = i40 + 4;
                                                int i1017 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzlwVar = (com.google.android.gms.internal.measurement.zzlw) zzmjVar;
                                                zzlwVar.zzf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, i40)));
                                                while (iZzg < i2) {
                                                    iZzh3 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzg, zzksVar4);
                                                    if (i52 == zzksVar4.zza) {
                                                        zzlwVar.zzf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, iZzh3)));
                                                        iZzg = iZzh3 + 4;
                                                    }
                                                }
                                            }
                                            i55 = i58;
                                            iZzg = i40;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                        } else {
                                            int i1018 = com.google.android.gms.internal.measurement.zzkt.zza;
                                            zzlwVar2 = (com.google.android.gms.internal.measurement.zzlw) zzmjVar;
                                            iZzh4 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar4);
                                            i60 = zzksVar4.zza;
                                            i61 = iZzh4 + i60;
                                            if (i61 <= bArr.length) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzlwVar2.zzg(zzlwVar2.size() + (i60 / 4));
                                            while (iZzh4 < i61) {
                                                zzlwVar2.zzf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, iZzh4)));
                                                iZzh4 += 4;
                                            }
                                            if (iZzh4 != i61) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iZzg = iZzh4;
                                        }
                                        i55 = i58;
                                        if (iZzg != i40) {
                                            i2 = i2;
                                            obj5 = obj;
                                            i90 = i55;
                                            i87 = i59;
                                            unsafe4 = unsafe;
                                            i88 = i52;
                                            i91 = i91;
                                            i86 = 0;
                                            i89 = i11;
                                            i85 = i3;
                                            zzksVar5 = zzksVar4;
                                        } else {
                                            i2 = i2;
                                            obj2 = obj;
                                            i4 = i3;
                                            i9 = iZzg;
                                            zzksVar2 = zzksVar4;
                                            i86 = i59;
                                            unsafe4 = unsafe;
                                            i10 = i52;
                                            i13 = i55;
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        zzksVar4 = zzksVar3;
                                        i40 = i40;
                                        i52 = i37;
                                        i58 = i38;
                                        i59 = i41;
                                        unsafe = unsafe;
                                        if (i14 == 2) {
                                            if (i14 == 0) {
                                                int i1019 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzmwVar = (com.google.android.gms.internal.measurement.zzmw) zzmjVar;
                                                iZzh4 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i40, zzksVar4);
                                                zzmwVar.zzg(zzksVar4.zzb);
                                                while (iZzh4 < i2) {
                                                    iZzh5 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh4, zzksVar4);
                                                    if (i52 == zzksVar4.zza) {
                                                        iZzh4 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, iZzh5, zzksVar4);
                                                        zzmwVar.zzg(zzksVar4.zzb);
                                                    }
                                                }
                                            }
                                            i55 = i58;
                                            iZzg = i40;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                        } else {
                                            int i1110 = com.google.android.gms.internal.measurement.zzkt.zza;
                                            zzmwVar2 = (com.google.android.gms.internal.measurement.zzmw) zzmjVar;
                                            iZzh4 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar4);
                                            i62 = zzksVar4.zza + iZzh4;
                                            while (iZzh4 < i62) {
                                                iZzh4 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, iZzh4, zzksVar4);
                                                zzmwVar2.zzg(zzksVar4.zzb);
                                            }
                                            if (iZzh4 != i62) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        iZzg = iZzh4;
                                        i55 = i58;
                                        if (iZzg != i40) {
                                            i2 = i2;
                                            obj5 = obj;
                                            i90 = i55;
                                            i87 = i59;
                                            unsafe4 = unsafe;
                                            i88 = i52;
                                            i91 = i91;
                                            i86 = 0;
                                            i89 = i11;
                                            i85 = i3;
                                            zzksVar5 = zzksVar4;
                                        } else {
                                            i2 = i2;
                                            obj2 = obj;
                                            i4 = i3;
                                            i9 = iZzg;
                                            zzksVar2 = zzksVar4;
                                            i86 = i59;
                                            unsafe4 = unsafe;
                                            i10 = i52;
                                            i13 = i55;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        zzksVar4 = zzksVar3;
                                        i40 = i40;
                                        i52 = i37;
                                        i63 = i41;
                                        if (i14 == 2) {
                                            iZzg = com.google.android.gms.internal.measurement.zzkt.zzf(bArr, i40, zzmjVar, zzksVar4);
                                            i59 = i63;
                                            i55 = i38;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                        } else if (i14 == 0) {
                                            i58 = i38;
                                            i59 = i63;
                                            unsafe = unsafe;
                                            iZzg = com.google.android.gms.internal.measurement.zzkt.zzj(i52, bArr, i40, i2, zzmjVar, zzksVar);
                                            i55 = i58;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                        } else {
                                            i59 = i63;
                                            i55 = i38;
                                            iZzg = i40;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        zzksVar4 = zzksVar3;
                                        i40 = i40;
                                        i52 = i37;
                                        i63 = i41;
                                        if (i14 == 2) {
                                            if (i14 == 1) {
                                                iZzg = i40 + 8;
                                                int i1111 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzmwVar3 = (com.google.android.gms.internal.measurement.zzmw) zzmjVar;
                                                zzmwVar3.zzg(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, i40));
                                                while (iZzg < i2) {
                                                    iZzh6 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzg, zzksVar4);
                                                    if (i52 == zzksVar4.zza) {
                                                        zzmwVar3.zzg(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, iZzh6));
                                                        iZzg = iZzh6 + 8;
                                                    }
                                                }
                                            }
                                            i59 = i63;
                                            i55 = i38;
                                            iZzg = i40;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                        } else {
                                            int i1112 = com.google.android.gms.internal.measurement.zzkt.zza;
                                            zzmwVar4 = (com.google.android.gms.internal.measurement.zzmw) zzmjVar;
                                            iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar4);
                                            i64 = zzksVar4.zza;
                                            i65 = iZzg + i64;
                                            if (i65 <= bArr.length) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzmwVar4.zzh(zzmwVar4.size() + (i64 / 8));
                                            while (iZzg < i65) {
                                                zzmwVar4.zzg(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, iZzg));
                                                iZzg += 8;
                                            }
                                            if (iZzg != i65) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i59 = i63;
                                        i55 = i38;
                                        if (iZzg != i40) {
                                            i2 = i2;
                                            obj5 = obj;
                                            i90 = i55;
                                            i87 = i59;
                                            unsafe4 = unsafe;
                                            i88 = i52;
                                            i91 = i91;
                                            i86 = 0;
                                            i89 = i11;
                                            i85 = i3;
                                            zzksVar5 = zzksVar4;
                                        } else {
                                            i2 = i2;
                                            obj2 = obj;
                                            i4 = i3;
                                            i9 = iZzg;
                                            zzksVar2 = zzksVar4;
                                            i86 = i59;
                                            unsafe4 = unsafe;
                                            i10 = i52;
                                            i13 = i55;
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        zzksVar4 = zzksVar3;
                                        i40 = i40;
                                        i52 = i37;
                                        i63 = i41;
                                        if (i14 == 2) {
                                            if (i14 == 5) {
                                                iZzg = i40 + 4;
                                                int i1113 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzmeVar = (com.google.android.gms.internal.measurement.zzme) zzmjVar;
                                                zzmeVar.zzh(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, i40));
                                                while (iZzg < i2) {
                                                    iZzh7 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzg, zzksVar4);
                                                    if (i52 == zzksVar4.zza) {
                                                        zzmeVar.zzh(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, iZzh7));
                                                        iZzg = iZzh7 + 4;
                                                    }
                                                }
                                            }
                                            i59 = i63;
                                            i55 = i38;
                                            iZzg = i40;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                        } else {
                                            int i1114 = com.google.android.gms.internal.measurement.zzkt.zza;
                                            zzmeVar2 = (com.google.android.gms.internal.measurement.zzme) zzmjVar;
                                            iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar4);
                                            i66 = zzksVar4.zza;
                                            i67 = iZzg + i66;
                                            if (i67 <= bArr.length) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzmeVar2.zzi(zzmeVar2.size() + (i66 / 4));
                                            while (iZzg < i67) {
                                                zzmeVar2.zzh(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, iZzg));
                                                iZzg += 4;
                                            }
                                            if (iZzg != i67) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i59 = i63;
                                        i55 = i38;
                                        if (iZzg != i40) {
                                            i2 = i2;
                                            obj5 = obj;
                                            i90 = i55;
                                            i87 = i59;
                                            unsafe4 = unsafe;
                                            i88 = i52;
                                            i91 = i91;
                                            i86 = 0;
                                            i89 = i11;
                                            i85 = i3;
                                            zzksVar5 = zzksVar4;
                                        } else {
                                            i2 = i2;
                                            obj2 = obj;
                                            i4 = i3;
                                            i9 = iZzg;
                                            zzksVar2 = zzksVar4;
                                            i86 = i59;
                                            unsafe4 = unsafe;
                                            i10 = i52;
                                            i13 = i55;
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        zzksVar4 = zzksVar3;
                                        i40 = i40;
                                        i52 = i37;
                                        i63 = i41;
                                        if (i14 == 2) {
                                            if (i14 == 0) {
                                                int i1115 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzkuVar = (com.google.android.gms.internal.measurement.zzku) zzmjVar;
                                                iZzg = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i40, zzksVar4);
                                                if (zzksVar4.zzb != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                zzkuVar.zze(z3);
                                                while (iZzg < i2) {
                                                    iZzh8 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzg, zzksVar4);
                                                    if (i52 == zzksVar4.zza) {
                                                        iZzg = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, iZzh8, zzksVar4);
                                                        if (zzksVar4.zzb != 0) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        zzkuVar.zze(z4);
                                                    }
                                                }
                                            }
                                            i59 = i63;
                                            i55 = i38;
                                            iZzg = i40;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                        } else {
                                            int i1116 = com.google.android.gms.internal.measurement.zzkt.zza;
                                            zzkuVar2 = (com.google.android.gms.internal.measurement.zzku) zzmjVar;
                                            iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar4);
                                            i68 = zzksVar4.zza + iZzg;
                                            while (iZzg < i68) {
                                                iZzg = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, iZzg, zzksVar4);
                                                if (zzksVar4.zzb != 0) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                zzkuVar2.zze(z5);
                                            }
                                            if (iZzg != i68) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i59 = i63;
                                        i55 = i38;
                                        if (iZzg != i40) {
                                            i2 = i2;
                                            obj5 = obj;
                                            i90 = i55;
                                            i87 = i59;
                                            unsafe4 = unsafe;
                                            i88 = i52;
                                            i91 = i91;
                                            i86 = 0;
                                            i89 = i11;
                                            i85 = i3;
                                            zzksVar5 = zzksVar4;
                                        } else {
                                            i2 = i2;
                                            obj2 = obj;
                                            i4 = i3;
                                            i9 = iZzg;
                                            zzksVar2 = zzksVar4;
                                            i86 = i59;
                                            unsafe4 = unsafe;
                                            i10 = i52;
                                            i13 = i55;
                                        }
                                        break;
                                    case 26:
                                        i40 = i40;
                                        i52 = i37;
                                        i38 = i38;
                                        if (i14 == 2) {
                                            i55 = i38;
                                            i59 = i41;
                                            unsafe = unsafe;
                                            zzksVar4 = zzksVar3;
                                            iZzg = i40;
                                        } else if ((j3 & 536870912) == 0) {
                                            iZzh11 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar3);
                                            i73 = zzksVar3.zza;
                                            if (i73 >= 0) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i73 == 0) {
                                                obj4 = "";
                                                zzmjVar.add(obj4);
                                            } else {
                                                obj4 = r8;
                                                zzmjVar.add(new java.lang.String(bArr, iZzh11, i73, com.google.android.gms.internal.measurement.zzmk.zza));
                                                iZzh11 += i73;
                                            }
                                            while (iZzh11 < i2) {
                                                iZzh12 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh11, zzksVar3);
                                                if (i52 == zzksVar3.zza) {
                                                    iZzh11 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh12, zzksVar3);
                                                    i74 = zzksVar3.zza;
                                                    if (i74 >= 0) {
                                                        throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i74 == 0) {
                                                        zzmjVar.add(obj4);
                                                    } else {
                                                        zzmjVar.add(new java.lang.String(bArr, iZzh11, i74, com.google.android.gms.internal.measurement.zzmk.zza));
                                                        iZzh11 += i74;
                                                    }
                                                } else {
                                                    i55 = i38;
                                                    iZzg = iZzh11;
                                                    i59 = i41;
                                                    unsafe = unsafe;
                                                    zzksVar4 = zzksVar3;
                                                }
                                            }
                                            i55 = i38;
                                            iZzg = iZzh11;
                                            i59 = i41;
                                            unsafe = unsafe;
                                            zzksVar4 = zzksVar3;
                                        } else {
                                            iZzh9 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar3);
                                            i69 = zzksVar3.zza;
                                            if (i69 >= 0) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i69 == 0) {
                                                zzmjVar.add(r8);
                                            } else {
                                                i70 = iZzh9 + i69;
                                                if (com.google.android.gms.internal.measurement.zzoo.zzd(bArr, iZzh9, i70)) {
                                                    throw new com.google.android.gms.internal.measurement.zzmm(str);
                                                }
                                                zzmjVar.add(new java.lang.String(bArr, iZzh9, i69, com.google.android.gms.internal.measurement.zzmk.zza));
                                                iZzh9 = i70;
                                            }
                                            while (iZzh9 < i2) {
                                                iZzh10 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh9, zzksVar3);
                                                if (i52 == zzksVar3.zza) {
                                                    iZzh9 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh10, zzksVar3);
                                                    i71 = zzksVar3.zza;
                                                    if (i71 >= 0) {
                                                        throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i71 == 0) {
                                                        zzmjVar.add(r8);
                                                    } else {
                                                        i72 = iZzh9 + i71;
                                                        if (com.google.android.gms.internal.measurement.zzoo.zzd(bArr, iZzh9, i72)) {
                                                            throw new com.google.android.gms.internal.measurement.zzmm(str);
                                                        }
                                                        zzmjVar.add(new java.lang.String(bArr, iZzh9, i71, com.google.android.gms.internal.measurement.zzmk.zza));
                                                        iZzh9 = i72;
                                                    }
                                                } else {
                                                    iZzg = iZzh9;
                                                    i59 = i41;
                                                    zzksVar4 = zzksVar3;
                                                    i55 = i38;
                                                }
                                            }
                                            iZzg = iZzh9;
                                            i59 = i41;
                                            zzksVar4 = zzksVar3;
                                            i55 = i38;
                                        }
                                        if (iZzg != i40) {
                                            i2 = i2;
                                            obj5 = obj;
                                            i90 = i55;
                                            i87 = i59;
                                            unsafe4 = unsafe;
                                            i88 = i52;
                                            i91 = i91;
                                            i86 = 0;
                                            i89 = i11;
                                            i85 = i3;
                                            zzksVar5 = zzksVar4;
                                        } else {
                                            i2 = i2;
                                            obj2 = obj;
                                            i4 = i3;
                                            i9 = iZzg;
                                            zzksVar2 = zzksVar4;
                                            i86 = i59;
                                            unsafe4 = unsafe;
                                            i10 = i52;
                                            i13 = i55;
                                        }
                                        break;
                                    case 27:
                                        i75 = i37;
                                        i41 = i41;
                                        if (i14 == 2) {
                                            this = this;
                                            i40 = i40;
                                            int iZze3 = com.google.android.gms.internal.measurement.zzkt.zze(this.zzv(i41), i75, bArr, i40, i2, zzmjVar, zzksVar);
                                            i55 = i38;
                                            i52 = i75;
                                            i59 = i41;
                                            unsafe = unsafe;
                                            zzksVar4 = zzksVar3;
                                            iZzg = iZze3;
                                        } else {
                                            unsafe = unsafe;
                                            i55 = i38;
                                            zzksVar4 = zzksVar3;
                                            i52 = i75;
                                            i59 = i41;
                                            iZzg = i40;
                                        }
                                        if (iZzg != i40) {
                                            i2 = i2;
                                            obj5 = obj;
                                            i90 = i55;
                                            i87 = i59;
                                            unsafe4 = unsafe;
                                            i88 = i52;
                                            i91 = i91;
                                            i86 = 0;
                                            i89 = i11;
                                            i85 = i3;
                                            zzksVar5 = zzksVar4;
                                        } else {
                                            i2 = i2;
                                            obj2 = obj;
                                            i4 = i3;
                                            i9 = iZzg;
                                            zzksVar2 = zzksVar4;
                                            i86 = i59;
                                            unsafe4 = unsafe;
                                            i10 = i52;
                                            i13 = i55;
                                        }
                                        break;
                                    case 28:
                                        i75 = i37;
                                        i41 = i41;
                                        if (i14 == 2) {
                                            iZzh13 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar3);
                                            i76 = zzksVar3.zza;
                                            if (i76 >= 0) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i76 <= bArr.length - iZzh13) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i76 == 0) {
                                                zzmjVar.add(com.google.android.gms.internal.measurement.zzld.zzb);
                                            } else {
                                                zzmjVar.add(com.google.android.gms.internal.measurement.zzld.zzj(bArr, iZzh13, i76));
                                                iZzh13 += i76;
                                            }
                                            while (iZzh13 < i2) {
                                                iZzh14 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh13, zzksVar3);
                                                if (i75 == zzksVar3.zza) {
                                                    unsafe = unsafe;
                                                    iZzg = iZzh13;
                                                    i55 = i38;
                                                    zzksVar4 = zzksVar3;
                                                    i52 = i75;
                                                    i59 = i41;
                                                    if (iZzg != i40) {
                                                        i2 = i2;
                                                        obj5 = obj;
                                                        i90 = i55;
                                                        i87 = i59;
                                                        unsafe4 = unsafe;
                                                        i88 = i52;
                                                        i91 = i91;
                                                        i86 = 0;
                                                        i89 = i11;
                                                        i85 = i3;
                                                        zzksVar5 = zzksVar4;
                                                    } else {
                                                        i2 = i2;
                                                        obj2 = obj;
                                                        i4 = i3;
                                                        i9 = iZzg;
                                                        zzksVar2 = zzksVar4;
                                                        i86 = i59;
                                                        unsafe4 = unsafe;
                                                        i10 = i52;
                                                        i13 = i55;
                                                    }
                                                    break;
                                                } else {
                                                    iZzh13 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh14, zzksVar3);
                                                    i77 = zzksVar3.zza;
                                                    if (i77 >= 0) {
                                                        throw new com.google.android.gms.internal.measurement.zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i77 <= bArr.length - iZzh13) {
                                                        throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i77 == 0) {
                                                        zzmjVar.add(com.google.android.gms.internal.measurement.zzld.zzb);
                                                    } else {
                                                        zzmjVar.add(com.google.android.gms.internal.measurement.zzld.zzj(bArr, iZzh13, i77));
                                                        iZzh13 += i77;
                                                    }
                                                }
                                            }
                                            unsafe = unsafe;
                                            iZzg = iZzh13;
                                            i55 = i38;
                                            zzksVar4 = zzksVar3;
                                            i52 = i75;
                                            i59 = i41;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                        } else {
                                            unsafe = unsafe;
                                            i55 = i38;
                                            zzksVar4 = zzksVar3;
                                            i52 = i75;
                                            i59 = i41;
                                            iZzg = i40;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i75 = i37;
                                        if (i14 == 2) {
                                            iZzj = com.google.android.gms.internal.measurement.zzkt.zzf(bArr, i40, zzmjVar, zzksVar3);
                                            unsafe3 = unsafe;
                                        } else if (i14 == 0) {
                                            this = this;
                                            zzksVar4 = zzksVar3;
                                            unsafe = unsafe;
                                            i40 = i40;
                                            i55 = i38;
                                            i52 = i75;
                                            i59 = i41;
                                            iZzg = i40;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                        } else {
                                            unsafe3 = unsafe;
                                            iZzj = com.google.android.gms.internal.measurement.zzkt.zzj(i75, bArr, i40, i2, zzmjVar, zzksVar);
                                        }
                                        zzmgVarZzu2 = this.zzu(i41);
                                        zzoeVar = this.zzl;
                                        int i1117 = com.google.android.gms.internal.measurement.zznu.zza;
                                        if (zzmgVarZzu2 != null) {
                                            i78 = iZzj;
                                        } else if (zzmjVar instanceof java.util.RandomAccess) {
                                            size = zzmjVar.size();
                                            i78 = iZzj;
                                            objZzn2 = null;
                                            i80 = 0;
                                            while (i79 < size) {
                                                iIntValue2 = ((java.lang.Integer) zzmjVar.get(i79)).intValue();
                                                if (zzmgVarZzu2.zza(iIntValue2)) {
                                                    if (i79 != i80) {
                                                        zzmjVar.set(i80, java.lang.Integer.valueOf(iIntValue2));
                                                    }
                                                    i80++;
                                                } else {
                                                    objZzn2 = com.google.android.gms.internal.measurement.zznu.zzn(obj5, i38, iIntValue2, objZzn2, zzoeVar);
                                                }
                                            }
                                            if (i80 != size) {
                                                zzmjVar.subList(i80, size).clear();
                                            }
                                        } else {
                                            i78 = iZzj;
                                            it = zzmjVar.iterator();
                                            objZzn = null;
                                            while (it.hasNext()) {
                                                iIntValue = ((java.lang.Integer) it.next()).intValue();
                                                if (!zzmgVarZzu2.zza(iIntValue)) {
                                                    objZzn = com.google.android.gms.internal.measurement.zznu.zzn(obj5, i38, iIntValue, objZzn, zzoeVar);
                                                    it.remove();
                                                }
                                            }
                                        }
                                        unsafe = unsafe3;
                                        i55 = i38;
                                        zzksVar4 = zzksVar3;
                                        iZzg = i78;
                                        i52 = i75;
                                        i59 = i41;
                                        if (iZzg != i40) {
                                            i2 = i2;
                                            obj5 = obj;
                                            i90 = i55;
                                            i87 = i59;
                                            unsafe4 = unsafe;
                                            i88 = i52;
                                            i91 = i91;
                                            i86 = 0;
                                            i89 = i11;
                                            i85 = i3;
                                            zzksVar5 = zzksVar4;
                                        } else {
                                            i2 = i2;
                                            obj2 = obj;
                                            i4 = i3;
                                            i9 = iZzg;
                                            zzksVar2 = zzksVar4;
                                            i86 = i59;
                                            unsafe4 = unsafe;
                                            i10 = i52;
                                            i13 = i55;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i75 = i37;
                                        if (i14 == 2) {
                                            if (i14 == 0) {
                                                int i1118 = com.google.android.gms.internal.measurement.zzkt.zza;
                                                zzmeVar3 = (com.google.android.gms.internal.measurement.zzme) zzmjVar;
                                                iZzh15 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar3);
                                                zzmeVar3.zzh(com.google.android.gms.internal.measurement.zzlg.zzb(zzksVar3.zza));
                                                while (iZzh15 < i2) {
                                                    iZzh16 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh15, zzksVar3);
                                                    if (i75 == zzksVar3.zza) {
                                                        iZzh15 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh16, zzksVar3);
                                                        zzmeVar3.zzh(com.google.android.gms.internal.measurement.zzlg.zzb(zzksVar3.zza));
                                                    }
                                                }
                                            }
                                            zzksVar4 = zzksVar3;
                                            unsafe = unsafe;
                                            i40 = i40;
                                            i55 = i38;
                                            i52 = i75;
                                            i59 = i41;
                                            iZzg = i40;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                        } else {
                                            int i1119 = com.google.android.gms.internal.measurement.zzkt.zza;
                                            zzmeVar4 = (com.google.android.gms.internal.measurement.zzme) zzmjVar;
                                            iZzh15 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar3);
                                            i81 = zzksVar3.zza + iZzh15;
                                            while (iZzh15 < i81) {
                                                iZzh15 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh15, zzksVar3);
                                                zzmeVar4.zzh(com.google.android.gms.internal.measurement.zzlg.zzb(zzksVar3.zza));
                                            }
                                            if (iZzh15 != i81) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        zzksVar4 = zzksVar3;
                                        iZzg = iZzh15;
                                        unsafe = unsafe;
                                        i40 = i40;
                                        i55 = i38;
                                        i52 = i75;
                                        i59 = i41;
                                        if (iZzg != i40) {
                                            i2 = i2;
                                            obj5 = obj;
                                            i90 = i55;
                                            i87 = i59;
                                            unsafe4 = unsafe;
                                            i88 = i52;
                                            i91 = i91;
                                            i86 = 0;
                                            i89 = i11;
                                            i85 = i3;
                                            zzksVar5 = zzksVar4;
                                        } else {
                                            i2 = i2;
                                            obj2 = obj;
                                            i4 = i3;
                                            i9 = iZzg;
                                            zzksVar2 = zzksVar4;
                                            i86 = i59;
                                            unsafe4 = unsafe;
                                            i10 = i52;
                                            i13 = i55;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i14 == 2) {
                                            int i1211 = com.google.android.gms.internal.measurement.zzkt.zza;
                                            zzmwVar6 = (com.google.android.gms.internal.measurement.zzmw) zzmjVar;
                                            iZzh18 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i40, zzksVar3);
                                            i82 = zzksVar3.zza + iZzh18;
                                            while (iZzh18 < i82) {
                                                iZzh18 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, iZzh18, zzksVar3);
                                                zzmwVar6.zzg(com.google.android.gms.internal.measurement.zzlg.zzc(zzksVar3.zzb));
                                            }
                                            if (iZzh18 == i82) {
                                                throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzksVar4 = zzksVar3;
                                            iZzg = iZzh18;
                                            unsafe = unsafe;
                                            i40 = i40;
                                            i52 = i37;
                                            i55 = i38;
                                        } else if (i14 == 0) {
                                            zzksVar4 = zzksVar3;
                                            unsafe = unsafe;
                                            i40 = i40;
                                            i52 = i37;
                                            i55 = i38;
                                            i59 = i41;
                                            iZzg = i40;
                                            if (iZzg != i40) {
                                                i2 = i2;
                                                obj5 = obj;
                                                i90 = i55;
                                                i87 = i59;
                                                unsafe4 = unsafe;
                                                i88 = i52;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i85 = i3;
                                                zzksVar5 = zzksVar4;
                                            } else {
                                                i2 = i2;
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = iZzg;
                                                zzksVar2 = zzksVar4;
                                                i86 = i59;
                                                unsafe4 = unsafe;
                                                i10 = i52;
                                                i13 = i55;
                                            }
                                        } else {
                                            int i1212 = com.google.android.gms.internal.measurement.zzkt.zza;
                                            zzmwVar5 = (com.google.android.gms.internal.measurement.zzmw) zzmjVar;
                                            iZzh15 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i40, zzksVar3);
                                            zzmwVar5.zzg(com.google.android.gms.internal.measurement.zzlg.zzc(zzksVar3.zzb));
                                            while (true) {
                                                if (iZzh15 < i2) {
                                                    iZzh17 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzh15, zzksVar3);
                                                    i75 = i37;
                                                    if (i75 == zzksVar3.zza) {
                                                        iZzh15 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, iZzh17, zzksVar3);
                                                        zzmwVar5.zzg(com.google.android.gms.internal.measurement.zzlg.zzc(zzksVar3.zzb));
                                                        i37 = i75;
                                                    }
                                                } else {
                                                    i75 = i37;
                                                }
                                            }
                                            zzksVar4 = zzksVar3;
                                            iZzg = iZzh15;
                                            unsafe = unsafe;
                                            i40 = i40;
                                            i55 = i38;
                                            i52 = i75;
                                        }
                                        i59 = i41;
                                        if (iZzg != i40) {
                                            i2 = i2;
                                            obj5 = obj;
                                            i90 = i55;
                                            i87 = i59;
                                            unsafe4 = unsafe;
                                            i88 = i52;
                                            i91 = i91;
                                            i86 = 0;
                                            i89 = i11;
                                            i85 = i3;
                                            zzksVar5 = zzksVar4;
                                        } else {
                                            i2 = i2;
                                            obj2 = obj;
                                            i4 = i3;
                                            i9 = iZzg;
                                            zzksVar2 = zzksVar4;
                                            i86 = i59;
                                            unsafe4 = unsafe;
                                            i10 = i52;
                                            i13 = i55;
                                        }
                                        break;
                                    default:
                                        zzksVar4 = zzksVar3;
                                        i40 = i40;
                                        i52 = i37;
                                        i55 = i38;
                                        unsafe = unsafe;
                                        if (i14 == 3) {
                                            i83 = (i52 & (-8)) | 4;
                                            i59 = i41;
                                            zznsVarZzv = this.zzv(i59);
                                            iZzg = com.google.android.gms.internal.measurement.zzkt.zzc(zznsVarZzv, bArr, i40, i2, i83, zzksVar);
                                            zzmjVar.add(zzksVar4.zzc);
                                            while (iZzg < i2) {
                                                iZzh19 = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, iZzg, zzksVar4);
                                                if (i52 == zzksVar4.zza) {
                                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzc(zznsVarZzv, bArr, iZzh19, i2, i83, zzksVar);
                                                    zzmjVar.add(zzksVar4.zzc);
                                                }
                                            }
                                        } else {
                                            i59 = i41;
                                            iZzg = i40;
                                        }
                                        if (iZzg != i40) {
                                            i2 = i2;
                                            obj5 = obj;
                                            i90 = i55;
                                            i87 = i59;
                                            unsafe4 = unsafe;
                                            i88 = i52;
                                            i91 = i91;
                                            i86 = 0;
                                            i89 = i11;
                                            i85 = i3;
                                            zzksVar5 = zzksVar4;
                                        } else {
                                            i2 = i2;
                                            obj2 = obj;
                                            i4 = i3;
                                            i9 = iZzg;
                                            zzksVar2 = zzksVar4;
                                            i86 = i59;
                                            unsafe4 = unsafe;
                                            i10 = i52;
                                            i13 = i55;
                                        }
                                        break;
                                }
                            } else {
                                i42 = i41;
                                i43 = i38;
                                zzksVar2 = zzksVar3;
                                unsafe2 = unsafe;
                                i44 = i37;
                                if (iZzr == 50) {
                                    i46 = i42;
                                    j2 = iArr[i42 + 2] & 1048575;
                                    switch (iZzr) {
                                        case 51:
                                            unsafe4 = unsafe2;
                                            i10 = i44;
                                            i13 = i43;
                                            obj2 = obj;
                                            i47 = i40;
                                            if (i14 == 1) {
                                                iZzg = i47 + 8;
                                                unsafe4.putObject(obj2, j, java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, i47))));
                                                unsafe4.putInt(obj2, j2, i13);
                                            } else {
                                                iZzg = i47;
                                            }
                                            if (iZzg != i47) {
                                                zzksVar2 = zzksVar2;
                                                this = this;
                                                unsafe4 = unsafe4;
                                                zzksVar5 = zzksVar2;
                                                obj5 = obj2;
                                                i88 = i10;
                                                i90 = i13;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i87 = i46;
                                                i85 = i3;
                                            } else {
                                                zzksVar2 = zzksVar2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i86 = i46;
                                            }
                                            break;
                                        case 52:
                                            unsafe4 = unsafe2;
                                            i10 = i44;
                                            i13 = i43;
                                            obj2 = obj;
                                            i47 = i40;
                                            if (i14 == 5) {
                                                iZzg = i47 + 4;
                                                unsafe4.putObject(obj2, j, java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, i47))));
                                                unsafe4.putInt(obj2, j2, i13);
                                            } else {
                                                iZzg = i47;
                                            }
                                            if (iZzg != i47) {
                                                zzksVar2 = zzksVar2;
                                                this = this;
                                                unsafe4 = unsafe4;
                                                zzksVar5 = zzksVar2;
                                                obj5 = obj2;
                                                i88 = i10;
                                                i90 = i13;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i87 = i46;
                                                i85 = i3;
                                            } else {
                                                zzksVar2 = zzksVar2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i86 = i46;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            unsafe4 = unsafe2;
                                            i10 = i44;
                                            i13 = i43;
                                            obj2 = obj;
                                            i47 = i40;
                                            if (i14 == 0) {
                                                iZzk = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i47, zzksVar2);
                                                unsafe4.putObject(obj2, j, java.lang.Long.valueOf(zzksVar2.zzb));
                                                unsafe4.putInt(obj2, j2, i13);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i47;
                                            }
                                            if (iZzg != i47) {
                                                zzksVar2 = zzksVar2;
                                                this = this;
                                                unsafe4 = unsafe4;
                                                zzksVar5 = zzksVar2;
                                                obj5 = obj2;
                                                i88 = i10;
                                                i90 = i13;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i87 = i46;
                                                i85 = i3;
                                            } else {
                                                zzksVar2 = zzksVar2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i86 = i46;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            unsafe4 = unsafe2;
                                            i10 = i44;
                                            i13 = i43;
                                            obj2 = obj;
                                            i47 = i40;
                                            if (i14 == 0) {
                                                iZzk = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i47, zzksVar2);
                                                unsafe4.putObject(obj2, j, java.lang.Integer.valueOf(zzksVar2.zza));
                                                unsafe4.putInt(obj2, j2, i13);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i47;
                                            }
                                            if (iZzg != i47) {
                                                zzksVar2 = zzksVar2;
                                                this = this;
                                                unsafe4 = unsafe4;
                                                zzksVar5 = zzksVar2;
                                                obj5 = obj2;
                                                i88 = i10;
                                                i90 = i13;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i87 = i46;
                                                i85 = i3;
                                            } else {
                                                zzksVar2 = zzksVar2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i86 = i46;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            unsafe4 = unsafe2;
                                            i10 = i44;
                                            i13 = i43;
                                            obj2 = obj;
                                            i47 = i40;
                                            if (i14 == 1) {
                                                iZzg = i47 + 8;
                                                unsafe4.putObject(obj2, j, java.lang.Long.valueOf(com.google.android.gms.internal.measurement.zzkt.zzn(bArr, i47)));
                                                unsafe4.putInt(obj2, j2, i13);
                                            } else {
                                                iZzg = i47;
                                            }
                                            if (iZzg != i47) {
                                                zzksVar2 = zzksVar2;
                                                this = this;
                                                unsafe4 = unsafe4;
                                                zzksVar5 = zzksVar2;
                                                obj5 = obj2;
                                                i88 = i10;
                                                i90 = i13;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i87 = i46;
                                                i85 = i3;
                                            } else {
                                                zzksVar2 = zzksVar2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i86 = i46;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            unsafe4 = unsafe2;
                                            i10 = i44;
                                            i13 = i43;
                                            obj2 = obj;
                                            i47 = i40;
                                            if (i14 == 5) {
                                                iZzg = i47 + 4;
                                                unsafe4.putObject(obj2, j, java.lang.Integer.valueOf(com.google.android.gms.internal.measurement.zzkt.zzb(bArr, i47)));
                                                unsafe4.putInt(obj2, j2, i13);
                                            } else {
                                                iZzg = i47;
                                            }
                                            if (iZzg != i47) {
                                                zzksVar2 = zzksVar2;
                                                this = this;
                                                unsafe4 = unsafe4;
                                                zzksVar5 = zzksVar2;
                                                obj5 = obj2;
                                                i88 = i10;
                                                i90 = i13;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i87 = i46;
                                                i85 = i3;
                                            } else {
                                                zzksVar2 = zzksVar2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i86 = i46;
                                            }
                                            break;
                                        case 58:
                                            unsafe4 = unsafe2;
                                            i10 = i44;
                                            i13 = i43;
                                            obj2 = obj;
                                            i47 = i40;
                                            if (i14 == 0) {
                                                iZzk = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i47, zzksVar2);
                                                if (zzksVar2.zzb != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                unsafe4.putObject(obj2, j, java.lang.Boolean.valueOf(z2));
                                                unsafe4.putInt(obj2, j2, i13);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i47;
                                            }
                                            if (iZzg != i47) {
                                                zzksVar2 = zzksVar2;
                                                this = this;
                                                unsafe4 = unsafe4;
                                                zzksVar5 = zzksVar2;
                                                obj5 = obj2;
                                                i88 = i10;
                                                i90 = i13;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i87 = i46;
                                                i85 = i3;
                                            } else {
                                                zzksVar2 = zzksVar2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i86 = i46;
                                            }
                                            break;
                                        case 59:
                                            unsafe4 = unsafe2;
                                            i10 = i44;
                                            i13 = i43;
                                            obj2 = obj;
                                            i47 = i40;
                                            if (i14 == 2) {
                                                iZzg = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i47, zzksVar2);
                                                i48 = zzksVar2.zza;
                                                if (i48 == 0) {
                                                    unsafe4.putObject(obj2, j, "");
                                                } else {
                                                    i49 = iZzg + i48;
                                                    if ((i15 & 536870912) == 0) {
                                                    }
                                                    unsafe4.putObject(obj2, j, new java.lang.String(bArr, iZzg, i48, com.google.android.gms.internal.measurement.zzmk.zza));
                                                    iZzg = i49;
                                                }
                                                unsafe4.putInt(obj2, j2, i13);
                                            } else {
                                                iZzg = i47;
                                            }
                                            if (iZzg != i47) {
                                                zzksVar2 = zzksVar2;
                                                this = this;
                                                unsafe4 = unsafe4;
                                                zzksVar5 = zzksVar2;
                                                obj5 = obj2;
                                                i88 = i10;
                                                i90 = i13;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i87 = i46;
                                                i85 = i3;
                                            } else {
                                                zzksVar2 = zzksVar2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i86 = i46;
                                            }
                                            break;
                                        case 60:
                                            i10 = i44;
                                            i50 = i46;
                                            i13 = i43;
                                            obj2 = obj;
                                            i47 = i40;
                                            if (i14 == 2) {
                                                java.lang.Object objZzy3 = this.zzy(obj2, i13, i50);
                                                iZzg = com.google.android.gms.internal.measurement.zzkt.zzm(objZzy3, this.zzv(i50), bArr, i47, i2, zzksVar);
                                                this.zzG(obj2, i13, i50, objZzy3);
                                                unsafe4 = unsafe2;
                                                i46 = i50;
                                            } else {
                                                i46 = i50;
                                                unsafe4 = unsafe2;
                                                iZzg = i47;
                                            }
                                            if (iZzg != i47) {
                                                zzksVar2 = zzksVar2;
                                                this = this;
                                                unsafe4 = unsafe4;
                                                zzksVar5 = zzksVar2;
                                                obj5 = obj2;
                                                i88 = i10;
                                                i90 = i13;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i87 = i46;
                                                i85 = i3;
                                            } else {
                                                zzksVar2 = zzksVar2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i86 = i46;
                                            }
                                            break;
                                        case 61:
                                            i10 = i44;
                                            i50 = i46;
                                            i13 = i43;
                                            obj2 = obj;
                                            i47 = i40;
                                            if (i14 == 2) {
                                                iZza = com.google.android.gms.internal.measurement.zzkt.zza(bArr, i47, zzksVar2);
                                                unsafe2.putObject(obj2, j, zzksVar2.zzc);
                                                unsafe2.putInt(obj2, j2, i13);
                                                i46 = i50;
                                                unsafe4 = unsafe2;
                                                iZzg = iZza;
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                            }
                                            i46 = i50;
                                            unsafe4 = unsafe2;
                                            iZzg = i47;
                                            if (iZzg != i47) {
                                                zzksVar2 = zzksVar2;
                                                this = this;
                                                unsafe4 = unsafe4;
                                                zzksVar5 = zzksVar2;
                                                obj5 = obj2;
                                                i88 = i10;
                                                i90 = i13;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i87 = i46;
                                                i85 = i3;
                                            } else {
                                                zzksVar2 = zzksVar2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i86 = i46;
                                            }
                                            break;
                                        case 63:
                                            i10 = i44;
                                            i50 = i46;
                                            i13 = i43;
                                            obj2 = obj;
                                            i47 = i40;
                                            if (i14 == 0) {
                                                iZza = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i47, zzksVar2);
                                                i51 = zzksVar2.zza;
                                                zzmgVarZzu = this.zzu(i50);
                                                if (zzmgVarZzu != null) {
                                                    unsafe2.putObject(obj2, j, java.lang.Integer.valueOf(i51));
                                                    unsafe2.putInt(obj2, j2, i13);
                                                } else {
                                                    unsafe2.putObject(obj2, j, java.lang.Integer.valueOf(i51));
                                                    unsafe2.putInt(obj2, j2, i13);
                                                }
                                                i46 = i50;
                                                unsafe4 = unsafe2;
                                                iZzg = iZza;
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                            }
                                            i46 = i50;
                                            unsafe4 = unsafe2;
                                            iZzg = i47;
                                            if (iZzg != i47) {
                                                zzksVar2 = zzksVar2;
                                                this = this;
                                                unsafe4 = unsafe4;
                                                zzksVar5 = zzksVar2;
                                                obj5 = obj2;
                                                i88 = i10;
                                                i90 = i13;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i87 = i46;
                                                i85 = i3;
                                            } else {
                                                zzksVar2 = zzksVar2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i86 = i46;
                                            }
                                            break;
                                        case 66:
                                            i10 = i44;
                                            i50 = i46;
                                            i13 = i43;
                                            obj2 = obj;
                                            i47 = i40;
                                            if (i14 == 0) {
                                                iZza = com.google.android.gms.internal.measurement.zzkt.zzh(bArr, i47, zzksVar2);
                                                unsafe2.putObject(obj2, j, java.lang.Integer.valueOf(com.google.android.gms.internal.measurement.zzlg.zzb(zzksVar2.zza)));
                                                unsafe2.putInt(obj2, j2, i13);
                                                i46 = i50;
                                                unsafe4 = unsafe2;
                                                iZzg = iZza;
                                                if (iZzg != i47) {
                                                    zzksVar2 = zzksVar2;
                                                    this = this;
                                                    unsafe4 = unsafe4;
                                                    zzksVar5 = zzksVar2;
                                                    obj5 = obj2;
                                                    i88 = i10;
                                                    i90 = i13;
                                                    i91 = i91;
                                                    i86 = 0;
                                                    i89 = i11;
                                                    i87 = i46;
                                                    i85 = i3;
                                                } else {
                                                    zzksVar2 = zzksVar2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i86 = i46;
                                                }
                                            }
                                            i46 = i50;
                                            unsafe4 = unsafe2;
                                            iZzg = i47;
                                            if (iZzg != i47) {
                                                zzksVar2 = zzksVar2;
                                                this = this;
                                                unsafe4 = unsafe4;
                                                zzksVar5 = zzksVar2;
                                                obj5 = obj2;
                                                i88 = i10;
                                                i90 = i13;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i87 = i46;
                                                i85 = i3;
                                            } else {
                                                zzksVar2 = zzksVar2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i86 = i46;
                                            }
                                            break;
                                        case 67:
                                            i10 = i44;
                                            i50 = i46;
                                            i13 = i43;
                                            obj2 = obj;
                                            if (i14 == 0) {
                                                i47 = i40;
                                                int iZzk7 = com.google.android.gms.internal.measurement.zzkt.zzk(bArr, i47, zzksVar2);
                                                unsafe2.putObject(obj2, j, java.lang.Long.valueOf(com.google.android.gms.internal.measurement.zzlg.zzc(zzksVar2.zzb)));
                                                unsafe2.putInt(obj2, j2, i13);
                                                i46 = i50;
                                                unsafe4 = unsafe2;
                                                iZzg = iZzk7;
                                            } else {
                                                i47 = i40;
                                                i46 = i50;
                                                unsafe4 = unsafe2;
                                                iZzg = i47;
                                            }
                                            if (iZzg != i47) {
                                                zzksVar2 = zzksVar2;
                                                this = this;
                                                unsafe4 = unsafe4;
                                                zzksVar5 = zzksVar2;
                                                obj5 = obj2;
                                                i88 = i10;
                                                i90 = i13;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i87 = i46;
                                                i85 = i3;
                                            } else {
                                                zzksVar2 = zzksVar2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i86 = i46;
                                            }
                                            break;
                                        case 68:
                                            if (i14 == 3) {
                                                java.lang.Object objZzy4 = this.zzy(obj, i43, i46);
                                                int iZzl4 = com.google.android.gms.internal.measurement.zzkt.zzl(objZzy4, this.zzv(i46), bArr, i40, i2, (i44 & (-8)) | 4, zzksVar);
                                                this.zzG(obj, i43, i46, objZzy4);
                                                i13 = i43;
                                                i10 = i44;
                                                i47 = i40;
                                                unsafe4 = unsafe2;
                                                iZzg = iZzl4;
                                                obj2 = obj;
                                            }
                                            if (iZzg != i47) {
                                                zzksVar2 = zzksVar2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i86 = i46;
                                                break;
                                            } else {
                                                zzksVar2 = zzksVar2;
                                                this = this;
                                                unsafe4 = unsafe4;
                                                zzksVar5 = zzksVar2;
                                                obj5 = obj2;
                                                i88 = i10;
                                                i90 = i13;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i87 = i46;
                                                i85 = i3;
                                                break;
                                            }
                                        default:
                                            unsafe4 = unsafe2;
                                            i10 = i44;
                                            i13 = i43;
                                            obj2 = obj;
                                            i47 = i40;
                                            iZzg = i47;
                                            if (iZzg != i47) {
                                                zzksVar2 = zzksVar2;
                                                this = this;
                                                unsafe4 = unsafe4;
                                                zzksVar5 = zzksVar2;
                                                obj5 = obj2;
                                                i88 = i10;
                                                i90 = i13;
                                                i91 = i91;
                                                i86 = 0;
                                                i89 = i11;
                                                i87 = i46;
                                                i85 = i3;
                                            } else {
                                                zzksVar2 = zzksVar2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i86 = i46;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i14 == 2) {
                                        java.lang.Object objZzw2 = this.zzw(i42);
                                        object = unsafe2.getObject(obj, j);
                                        if (!((com.google.android.gms.internal.measurement.zznb) object).zze()) {
                                            com.google.android.gms.internal.measurement.zznb zznbVarZzb2 = com.google.android.gms.internal.measurement.zznb.zza().zzb();
                                            com.google.android.gms.internal.measurement.zznc.zza(zznbVarZzb2, object);
                                            unsafe2.putObject(obj, j, zznbVarZzb2);
                                        }
                                        throw null;
                                    }
                                    obj3 = obj;
                                    i45 = i40;
                                    i4 = i3;
                                    unsafe4 = unsafe2;
                                    i9 = i45;
                                    i86 = i42;
                                    i10 = i44;
                                    i13 = i43;
                                    obj2 = obj3;
                                }
                            }
                            if (i10 == i4) {
                            }
                            if (this.zzh) {
                                zzlpVar = zzksVar2.zzd;
                                int i1213 = com.google.android.gms.internal.measurement.zzlp.zzb;
                                int i1214 = com.google.android.gms.internal.measurement.zznp.zza;
                                if (zzlpVar != com.google.android.gms.internal.measurement.zzlp.zza) {
                                    zznhVar = this.zzg;
                                    int i1215 = com.google.android.gms.internal.measurement.zzkt.zza;
                                    if (zzlpVar.zzb(zznhVar, i13) == null) {
                                        throw null;
                                    }
                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                                } else {
                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                                }
                            } else {
                                iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                            }
                            i2 = i2;
                            zzksVar5 = zzksVar;
                            i88 = i10;
                            i87 = i86;
                            i90 = i13;
                            i91 = i91;
                            i86 = i12;
                            i89 = i11;
                            i85 = i4;
                            this = this;
                            obj5 = obj2;
                        } else if (i14 == 2) {
                            zzmjVarZzd2 = (com.google.android.gms.internal.measurement.zzmj) unsafe.getObject(obj5, j);
                            if (!zzmjVarZzd2.zzc()) {
                                size2 = zzmjVarZzd2.size();
                                if (size2 == 0) {
                                    i84 = 10;
                                } else {
                                    i84 = size2 + size2;
                                }
                                zzmjVarZzd2 = zzmjVarZzd2.zzd(i84);
                                unsafe.putObject(obj5, j, zzmjVarZzd2);
                            }
                            int iZze4 = com.google.android.gms.internal.measurement.zzkt.zze(this.zzv(i39), i37, bArr, i40, i2, zzmjVarZzd2, zzksVar);
                            i85 = i3;
                            zzksVar5 = zzksVar3;
                            i2 = i2;
                            iZzg = iZze4;
                            unsafe4 = unsafe;
                            i87 = i39;
                            i91 = i91;
                            i86 = 0;
                            i88 = i37;
                            i89 = i11;
                            i90 = i38;
                        } else {
                            obj3 = obj5;
                            i45 = i40;
                            i44 = i37;
                            i43 = i38;
                            i42 = i39;
                            zzksVar2 = zzksVar3;
                            unsafe2 = unsafe;
                            i4 = i3;
                            unsafe4 = unsafe2;
                            i9 = i45;
                            i86 = i42;
                            i10 = i44;
                            i13 = i43;
                            obj2 = obj3;
                            if (i10 == i4) {
                            }
                            if (this.zzh) {
                                zzlpVar = zzksVar2.zzd;
                                int i1216 = com.google.android.gms.internal.measurement.zzlp.zzb;
                                int i1217 = com.google.android.gms.internal.measurement.zznp.zza;
                                if (zzlpVar != com.google.android.gms.internal.measurement.zzlp.zza) {
                                    zznhVar = this.zzg;
                                    int i1218 = com.google.android.gms.internal.measurement.zzkt.zza;
                                    if (zzlpVar.zzb(zznhVar, i13) == null) {
                                        throw null;
                                    }
                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                                } else {
                                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                                }
                            } else {
                                iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                            }
                            i2 = i2;
                            zzksVar5 = zzksVar;
                            i88 = i10;
                            i87 = i86;
                            i90 = i13;
                            i91 = i91;
                            i86 = i12;
                            i89 = i11;
                            i85 = i4;
                            this = this;
                            obj5 = obj2;
                        }
                    }
                }
                obj2 = obj5;
                if (i10 == i4) {
                }
                if (this.zzh) {
                    zzlpVar = zzksVar2.zzd;
                    int i1219 = com.google.android.gms.internal.measurement.zzlp.zzb;
                    int i12110 = com.google.android.gms.internal.measurement.zznp.zza;
                    if (zzlpVar != com.google.android.gms.internal.measurement.zzlp.zza) {
                        zznhVar = this.zzg;
                        int i12111 = com.google.android.gms.internal.measurement.zzkt.zza;
                        if (zzlpVar.zzb(zznhVar, i13) == null) {
                            throw null;
                        }
                        iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                    } else {
                        iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                    }
                } else {
                    iZzg = com.google.android.gms.internal.measurement.zzkt.zzg(i10, bArr, i9, i2, zzd(obj), zzksVar);
                }
                i2 = i2;
                zzksVar5 = zzksVar;
                i88 = i10;
                i87 = i86;
                i90 = i13;
                i91 = i91;
                i86 = i12;
                i89 = i11;
                i85 = i4;
                this = this;
                obj5 = obj2;
            } else {
                obj2 = obj5;
                zznkVar = this;
                i4 = i85;
                i5 = 1048575;
            }
        }
        if (i91 != i5) {
            unsafe4.putInt(obj2, i91, i89);
        }
        for (int i130 = zznkVar.zzj; i130 < zznkVar.zzk; i130++) {
            int[] iArr2 = zznkVar.zzi;
            int[] iArr3 = zznkVar.zzc;
            int i131 = iArr2[i130];
            int i132 = iArr3[i131];
            java.lang.Object objZzf = com.google.android.gms.internal.measurement.zzol.zzf(obj2, zznkVar.zzs(i131) & i5);
            if (objZzf != null && zznkVar.zzu(i131) != null) {
                throw null;
            }
        }
        if (i4 == 0) {
            if (iZzg != i2) {
                throw new com.google.android.gms.internal.measurement.zzmm("Failed to parse the message.");
            }
        } else if (iZzg > i2 || i88 != i4) {
            throw new com.google.android.gms.internal.measurement.zzmm("Failed to parse the message.");
        }
        return iZzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final java.lang.Object zze() {
        return ((com.google.android.gms.internal.measurement.zzmd) this.zzg).zzcj();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzf(java.lang.Object obj) {
        if (zzL(obj)) {
            if (obj instanceof com.google.android.gms.internal.measurement.zzmd) {
                com.google.android.gms.internal.measurement.zzmd zzmdVar = (com.google.android.gms.internal.measurement.zzmd) obj;
                zzmdVar.zzcu(Integer.MAX_VALUE);
                zzmdVar.zza = 0;
                zzmdVar.zzcs();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzs = zzs(i);
                int i2 = 1048575 & iZzs;
                int iZzr = zzr(iZzs);
                long j = i2;
                if (iZzr != 9) {
                    if (iZzr != 60 && iZzr != 68) {
                        switch (iZzr) {
                            case 17:
                                if (zzI(obj, i)) {
                                    zzv(i).zzf(zzb.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((com.google.android.gms.internal.measurement.zzmj) com.google.android.gms.internal.measurement.zzol.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = zzb;
                                java.lang.Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((com.google.android.gms.internal.measurement.zznb) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, iArr[i], i)) {
                        zzv(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzg(java.lang.Object obj, java.lang.Object obj2) {
        zzA(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                com.google.android.gms.internal.measurement.zznu.zzp(this.zzl, obj, obj2);
                if (this.zzh) {
                    com.google.android.gms.internal.measurement.zznu.zzo(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int iZzs = zzs(i);
            int i2 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzo(obj, j, com.google.android.gms.internal.measurement.zzol.zza(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 1:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzp(obj, j, com.google.android.gms.internal.measurement.zzol.zzb(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 2:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzr(obj, j, com.google.android.gms.internal.measurement.zzol.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 3:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzr(obj, j, com.google.android.gms.internal.measurement.zzol.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 4:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzq(obj, j, com.google.android.gms.internal.measurement.zzol.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 5:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzr(obj, j, com.google.android.gms.internal.measurement.zzol.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 6:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzq(obj, j, com.google.android.gms.internal.measurement.zzol.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 7:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzm(obj, j, com.google.android.gms.internal.measurement.zzol.zzw(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 8:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzs(obj, j, com.google.android.gms.internal.measurement.zzol.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzs(obj, j, com.google.android.gms.internal.measurement.zzol.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 11:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzq(obj, j, com.google.android.gms.internal.measurement.zzol.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 12:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzq(obj, j, com.google.android.gms.internal.measurement.zzol.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 13:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzq(obj, j, com.google.android.gms.internal.measurement.zzol.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 14:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzr(obj, j, com.google.android.gms.internal.measurement.zzol.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 15:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzq(obj, j, com.google.android.gms.internal.measurement.zzol.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 16:
                    if (zzI(obj2, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzr(obj, j, com.google.android.gms.internal.measurement.zzol.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    com.google.android.gms.internal.measurement.zzmj zzmjVarZzd = (com.google.android.gms.internal.measurement.zzmj) com.google.android.gms.internal.measurement.zzol.zzf(obj, j);
                    com.google.android.gms.internal.measurement.zzmj zzmjVar = (com.google.android.gms.internal.measurement.zzmj) com.google.android.gms.internal.measurement.zzol.zzf(obj2, j);
                    int size = zzmjVarZzd.size();
                    int size2 = zzmjVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmjVarZzd.zzc()) {
                            zzmjVarZzd = zzmjVarZzd.zzd(size2 + size);
                        }
                        zzmjVarZzd.addAll(zzmjVar);
                    }
                    if (size > 0) {
                        zzmjVar = zzmjVarZzd;
                    }
                    com.google.android.gms.internal.measurement.zzol.zzs(obj, j, zzmjVar);
                    break;
                case 50:
                    int i4 = com.google.android.gms.internal.measurement.zznu.zza;
                    com.google.android.gms.internal.measurement.zzol.zzs(obj, j, com.google.android.gms.internal.measurement.zznc.zza(com.google.android.gms.internal.measurement.zzol.zzf(obj, j), com.google.android.gms.internal.measurement.zzol.zzf(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(obj2, i3, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzs(obj, j, com.google.android.gms.internal.measurement.zzol.zzf(obj2, j));
                        zzE(obj, i3, i);
                    }
                    break;
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i3, i)) {
                        com.google.android.gms.internal.measurement.zzol.zzs(obj, j, com.google.android.gms.internal.measurement.zzol.zzf(obj2, j));
                        zzE(obj, i3, i);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzh(java.lang.Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzks zzksVar) throws java.io.IOException {
        zzc(obj, bArr, i, i2, 0, zzksVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzi(java.lang.Object obj, com.google.android.gms.internal.measurement.zzor zzorVar) throws java.io.IOException {
        java.util.Map.Entry entry;
        int i;
        int i2;
        int i3;
        int[] iArr;
        if (this.zzh) {
            com.google.android.gms.internal.measurement.zzlu zzluVar = ((com.google.android.gms.internal.measurement.zzma) obj).zzb;
            if (zzluVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (java.util.Map.Entry) zzluVar.zze().next();
            }
        } else {
            entry = null;
        }
        int[] iArr2 = this.zzc;
        sun.misc.Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < iArr2.length) {
            int iZzs = zzs(i7);
            int iZzr = zzr(iZzs);
            int i8 = iArr2[i7];
            if (iZzr <= 17) {
                int i9 = iArr2[i7 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j = iZzs & i4;
            switch (iZzr) {
                case 0:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzf(i8, com.google.android.gms.internal.measurement.zzol.zza(obj, j));
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 1:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzo(i8, com.google.android.gms.internal.measurement.zzol.zzb(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 2:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzt(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 3:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzK(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 4:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzr(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 5:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzm(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 6:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzk(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 7:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzb(i8, com.google.android.gms.internal.measurement.zzol.zzw(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 8:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzO(i8, unsafe.getObject(obj, j), zzorVar);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 9:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzv(i8, unsafe.getObject(obj, j), zzv(i7));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 10:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzd(i8, (com.google.android.gms.internal.measurement.zzld) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 11:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzI(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 12:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzi(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 13:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzx(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 14:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzz(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 15:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzB(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 16:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzD(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 17:
                    iArr = iArr2;
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzorVar.zzq(i8, unsafe.getObject(obj, j), zzv(i7));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    iArr2 = iArr;
                    i4 = 1048575;
                    break;
                case 18:
                    com.google.android.gms.internal.measurement.zznu.zzr(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, false);
                    break;
                case 19:
                    com.google.android.gms.internal.measurement.zznu.zzv(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, false);
                    break;
                case 20:
                    com.google.android.gms.internal.measurement.zznu.zzx(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, false);
                    break;
                case 21:
                    com.google.android.gms.internal.measurement.zznu.zzD(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, false);
                    break;
                case 22:
                    com.google.android.gms.internal.measurement.zznu.zzw(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, false);
                    break;
                case 23:
                    com.google.android.gms.internal.measurement.zznu.zzu(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, false);
                    break;
                case 24:
                    com.google.android.gms.internal.measurement.zznu.zzt(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, false);
                    break;
                case 25:
                    com.google.android.gms.internal.measurement.zznu.zzq(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, false);
                    break;
                case 26:
                    int i11 = iArr2[i7];
                    java.util.List list = (java.util.List) unsafe.getObject(obj, j);
                    int i12 = com.google.android.gms.internal.measurement.zznu.zza;
                    if (list != null && !list.isEmpty()) {
                        zzorVar.zzH(i11, list);
                    }
                    break;
                case 27:
                    int i13 = iArr2[i7];
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, j);
                    com.google.android.gms.internal.measurement.zzns zznsVarZzv = zzv(i7);
                    int i14 = com.google.android.gms.internal.measurement.zznu.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            ((com.google.android.gms.internal.measurement.zzll) zzorVar).zzv(i13, list2.get(i15), zznsVarZzv);
                        }
                    }
                    break;
                case 28:
                    int i16 = iArr2[i7];
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, j);
                    int i17 = com.google.android.gms.internal.measurement.zznu.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzorVar.zze(i16, list3);
                    }
                    break;
                case 29:
                    com.google.android.gms.internal.measurement.zznu.zzC(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, false);
                    break;
                case 30:
                    com.google.android.gms.internal.measurement.zznu.zzs(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, false);
                    break;
                case 31:
                    com.google.android.gms.internal.measurement.zznu.zzy(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, false);
                    break;
                case 32:
                    com.google.android.gms.internal.measurement.zznu.zzz(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, false);
                    break;
                case 33:
                    com.google.android.gms.internal.measurement.zznu.zzA(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, false);
                    break;
                case 34:
                    com.google.android.gms.internal.measurement.zznu.zzB(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, false);
                    break;
                case 35:
                    com.google.android.gms.internal.measurement.zznu.zzr(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 36:
                    com.google.android.gms.internal.measurement.zznu.zzv(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 37:
                    com.google.android.gms.internal.measurement.zznu.zzx(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 38:
                    com.google.android.gms.internal.measurement.zznu.zzD(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 39:
                    com.google.android.gms.internal.measurement.zznu.zzw(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 40:
                    com.google.android.gms.internal.measurement.zznu.zzu(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 41:
                    com.google.android.gms.internal.measurement.zznu.zzt(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 42:
                    com.google.android.gms.internal.measurement.zznu.zzq(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 43:
                    com.google.android.gms.internal.measurement.zznu.zzC(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 44:
                    com.google.android.gms.internal.measurement.zznu.zzs(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 45:
                    com.google.android.gms.internal.measurement.zznu.zzy(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 46:
                    com.google.android.gms.internal.measurement.zznu.zzz(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 47:
                    com.google.android.gms.internal.measurement.zznu.zzA(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 48:
                    com.google.android.gms.internal.measurement.zznu.zzB(iArr2[i7], (java.util.List) unsafe.getObject(obj, j), zzorVar, true);
                    break;
                case 49:
                    int i18 = iArr2[i7];
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, j);
                    com.google.android.gms.internal.measurement.zzns zznsVarZzv2 = zzv(i7);
                    int i19 = com.google.android.gms.internal.measurement.zznu.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            ((com.google.android.gms.internal.measurement.zzll) zzorVar).zzq(i18, list4.get(i20), zznsVarZzv2);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzf(i8, zzm(obj, j));
                    }
                    break;
                case 52:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzo(i8, zzn(obj, j));
                    }
                    break;
                case 53:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzt(i8, zzt(obj, j));
                    }
                    break;
                case 54:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzK(i8, zzt(obj, j));
                    }
                    break;
                case 55:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzr(i8, zzo(obj, j));
                    }
                    break;
                case 56:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzm(i8, zzt(obj, j));
                    }
                    break;
                case 57:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzk(i8, zzo(obj, j));
                    }
                    break;
                case 58:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzb(i8, zzN(obj, j));
                    }
                    break;
                case 59:
                    if (zzM(obj, i8, i7)) {
                        zzO(i8, unsafe.getObject(obj, j), zzorVar);
                    }
                    break;
                case 60:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzv(i8, unsafe.getObject(obj, j), zzv(i7));
                    }
                    break;
                case 61:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzd(i8, (com.google.android.gms.internal.measurement.zzld) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzI(i8, zzo(obj, j));
                    }
                    break;
                case 63:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzi(i8, zzo(obj, j));
                    }
                    break;
                case 64:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzx(i8, zzo(obj, j));
                    }
                    break;
                case 65:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzz(i8, zzt(obj, j));
                    }
                    break;
                case 66:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzB(i8, zzo(obj, j));
                    }
                    break;
                case 67:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzD(i8, zzt(obj, j));
                    }
                    break;
                case 68:
                    if (zzM(obj, i8, i7)) {
                        zzorVar.zzq(i8, unsafe.getObject(obj, j), zzv(i7));
                    }
                    break;
            }
            iArr = iArr2;
            i7 += 3;
            i5 = i;
            i6 = i2;
            iArr2 = iArr;
            i4 = 1048575;
        }
        if (entry != null) {
            throw null;
        }
        ((com.google.android.gms.internal.measurement.zzmd) obj).zzc.zzl(zzorVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzj(java.lang.Object obj, java.lang.Object obj2) {
        boolean zZzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            long j = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i) || java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzol.zza(obj, j)) != java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzol.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i) || java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzol.zzb(obj, j)) != java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzol.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i) || com.google.android.gms.internal.measurement.zzol.zzd(obj, j) != com.google.android.gms.internal.measurement.zzol.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i) || com.google.android.gms.internal.measurement.zzol.zzd(obj, j) != com.google.android.gms.internal.measurement.zzol.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i) || com.google.android.gms.internal.measurement.zzol.zzc(obj, j) != com.google.android.gms.internal.measurement.zzol.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i) || com.google.android.gms.internal.measurement.zzol.zzd(obj, j) != com.google.android.gms.internal.measurement.zzol.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i) || com.google.android.gms.internal.measurement.zzol.zzc(obj, j) != com.google.android.gms.internal.measurement.zzol.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i) || com.google.android.gms.internal.measurement.zzol.zzw(obj, j) != com.google.android.gms.internal.measurement.zzol.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i) || !com.google.android.gms.internal.measurement.zznu.zzE(com.google.android.gms.internal.measurement.zzol.zzf(obj, j), com.google.android.gms.internal.measurement.zzol.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i) || !com.google.android.gms.internal.measurement.zznu.zzE(com.google.android.gms.internal.measurement.zzol.zzf(obj, j), com.google.android.gms.internal.measurement.zzol.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i) || !com.google.android.gms.internal.measurement.zznu.zzE(com.google.android.gms.internal.measurement.zzol.zzf(obj, j), com.google.android.gms.internal.measurement.zzol.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i) || com.google.android.gms.internal.measurement.zzol.zzc(obj, j) != com.google.android.gms.internal.measurement.zzol.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i) || com.google.android.gms.internal.measurement.zzol.zzc(obj, j) != com.google.android.gms.internal.measurement.zzol.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i) || com.google.android.gms.internal.measurement.zzol.zzc(obj, j) != com.google.android.gms.internal.measurement.zzol.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i) || com.google.android.gms.internal.measurement.zzol.zzd(obj, j) != com.google.android.gms.internal.measurement.zzol.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i) || com.google.android.gms.internal.measurement.zzol.zzc(obj, j) != com.google.android.gms.internal.measurement.zzol.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i) || com.google.android.gms.internal.measurement.zzol.zzd(obj, j) != com.google.android.gms.internal.measurement.zzol.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i) || !com.google.android.gms.internal.measurement.zznu.zzE(com.google.android.gms.internal.measurement.zzol.zzf(obj, j), com.google.android.gms.internal.measurement.zzol.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzE = com.google.android.gms.internal.measurement.zznu.zzE(com.google.android.gms.internal.measurement.zzol.zzf(obj, j), com.google.android.gms.internal.measurement.zzol.zzf(obj2, j));
                    break;
                case 50:
                    zZzE = com.google.android.gms.internal.measurement.zznu.zzE(com.google.android.gms.internal.measurement.zzol.zzf(obj, j), com.google.android.gms.internal.measurement.zzol.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzp = zzp(i) & 1048575;
                    if (com.google.android.gms.internal.measurement.zzol.zzc(obj, jZzp) != com.google.android.gms.internal.measurement.zzol.zzc(obj2, jZzp) || !com.google.android.gms.internal.measurement.zznu.zzE(com.google.android.gms.internal.measurement.zzol.zzf(obj, j), com.google.android.gms.internal.measurement.zzol.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((com.google.android.gms.internal.measurement.zzmd) obj).zzc.equals(((com.google.android.gms.internal.measurement.zzmd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((com.google.android.gms.internal.measurement.zzma) obj).zzb.equals(((com.google.android.gms.internal.measurement.zzma) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00be A[LOOP:1: B:45:0x00ad->B:50:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00db A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzk(java.lang.Object obj) {
        int i;
        int i2;
        java.util.List list;
        com.google.android.gms.internal.measurement.zzns zznsVarZzv;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int iZzs = zzs(i7);
            int i9 = iArr2[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = zzb.getInt(obj, i10);
                }
                i2 = i4;
                i = i10;
            } else {
                i = i6;
                i2 = i4;
            }
            if ((268435456 & iZzs) != 0 && !zzJ(obj, i7, i, i2, i11)) {
                return false;
            }
            int iZzr = zzr(iZzs);
            if (iZzr == 9 || iZzr == 17) {
                if (zzJ(obj, i7, i, i2, i11) && !zzK(obj, iZzs, zzv(i7))) {
                    return false;
                }
            } else if (iZzr == 27) {
                list = (java.util.List) com.google.android.gms.internal.measurement.zzol.zzf(obj, iZzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zznsVarZzv = zzv(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zznsVarZzv.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzr == 60 || iZzr == 68) {
                if (zzM(obj, i8, i7) && !zzK(obj, iZzs, zzv(i7))) {
                    return false;
                }
            } else if (iZzr == 49) {
                list = (java.util.List) com.google.android.gms.internal.measurement.zzol.zzf(obj, iZzs & 1048575);
                if (list.isEmpty()) {
                    zznsVarZzv = zzv(i7);
                    while (i3 < list.size()) {
                        if (!zznsVarZzv.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzr == 50 && !((com.google.android.gms.internal.measurement.zznb) com.google.android.gms.internal.measurement.zzol.zzf(obj, iZzs & 1048575)).isEmpty()) {
                throw null;
            }
            i5++;
            i6 = i;
            i4 = i2;
        }
        return !this.zzh || ((com.google.android.gms.internal.measurement.zzma) obj).zzb.zzh();
    }
}
