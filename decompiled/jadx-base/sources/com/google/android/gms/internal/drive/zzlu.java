package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzlu<T> implements com.google.android.gms.internal.drive.zzmf<T> {
    private static final int[] zzub = new int[0];
    private static final sun.misc.Unsafe zzuc = com.google.android.gms.internal.drive.zznd.zzff();
    private final int[] zzud;
    private final java.lang.Object[] zzue;
    private final int zzuf;
    private final int zzug;
    private final com.google.android.gms.internal.drive.zzlq zzuh;
    private final boolean zzui;
    private final boolean zzuj;
    private final boolean zzuk;
    private final boolean zzul;
    private final int[] zzum;
    private final int zzun;
    private final int zzuo;
    private final com.google.android.gms.internal.drive.zzly zzup;
    private final com.google.android.gms.internal.drive.zzla zzuq;
    private final com.google.android.gms.internal.drive.zzmx<?, ?> zzur;
    private final com.google.android.gms.internal.drive.zzjy<?> zzus;
    private final com.google.android.gms.internal.drive.zzll zzut;

    private zzlu(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.google.android.gms.internal.drive.zzlq zzlqVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, com.google.android.gms.internal.drive.zzly zzlyVar, com.google.android.gms.internal.drive.zzla zzlaVar, com.google.android.gms.internal.drive.zzmx<?, ?> zzmxVar, com.google.android.gms.internal.drive.zzjy<?> zzjyVar, com.google.android.gms.internal.drive.zzll zzllVar) {
        this.zzud = iArr;
        this.zzue = objArr;
        this.zzuf = i;
        this.zzug = i2;
        this.zzuj = zzlqVar instanceof com.google.android.gms.internal.drive.zzkk;
        this.zzuk = z;
        this.zzui = zzjyVar != null && zzjyVar.zze(zzlqVar);
        this.zzul = false;
        this.zzum = iArr2;
        this.zzun = i3;
        this.zzuo = i4;
        this.zzup = zzlyVar;
        this.zzuq = zzlaVar;
        this.zzur = zzmxVar;
        this.zzus = zzjyVar;
        this.zzuh = zzlqVar;
        this.zzut = zzllVar;
    }

    static <T> com.google.android.gms.internal.drive.zzlu<T> zza(java.lang.Class<T> cls, com.google.android.gms.internal.drive.zzlo zzloVar, com.google.android.gms.internal.drive.zzly zzlyVar, com.google.android.gms.internal.drive.zzla zzlaVar, com.google.android.gms.internal.drive.zzmx<?, ?> zzmxVar, com.google.android.gms.internal.drive.zzjy<?> zzjyVar, com.google.android.gms.internal.drive.zzll zzllVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
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
        boolean z;
        int i17;
        com.google.android.gms.internal.drive.zzme zzmeVar;
        java.lang.String str;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        java.lang.reflect.Field fieldZza;
        int i21;
        char cCharAt9;
        int i22;
        java.lang.reflect.Field fieldZza2;
        java.lang.reflect.Field fieldZza3;
        int i23;
        char cCharAt10;
        int i24;
        char cCharAt11;
        int i25;
        char cCharAt12;
        int i26;
        char cCharAt13;
        char cCharAt14;
        if (zzloVar instanceof com.google.android.gms.internal.drive.zzme) {
            com.google.android.gms.internal.drive.zzme zzmeVar2 = (com.google.android.gms.internal.drive.zzme) zzloVar;
            int i27 = 0;
            boolean z2 = zzmeVar2.zzec() == com.google.android.gms.internal.drive.zzkk.zze.zzsg;
            java.lang.String strZzek = zzmeVar2.zzek();
            int length = strZzek.length();
            int iCharAt3 = strZzek.charAt(0);
            if (iCharAt3 >= 55296) {
                int i28 = iCharAt3 & 8191;
                int i29 = 1;
                int i30 = 13;
                while (true) {
                    i = i29 + 1;
                    cCharAt14 = strZzek.charAt(i29);
                    if (cCharAt14 < 55296) {
                        break;
                    }
                    i28 |= (cCharAt14 & 8191) << i30;
                    i30 += 13;
                    i29 = i;
                }
                iCharAt3 = i28 | (cCharAt14 << i30);
            } else {
                i = 1;
            }
            int i31 = i + 1;
            int iCharAt4 = strZzek.charAt(i);
            if (iCharAt4 >= 55296) {
                int i32 = iCharAt4 & 8191;
                int i33 = 13;
                while (true) {
                    i26 = i31 + 1;
                    cCharAt13 = strZzek.charAt(i31);
                    if (cCharAt13 < 55296) {
                        break;
                    }
                    i32 |= (cCharAt13 & 8191) << i33;
                    i33 += 13;
                    i31 = i26;
                }
                iCharAt4 = i32 | (cCharAt13 << i33);
                i31 = i26;
            }
            if (iCharAt4 == 0) {
                i6 = 0;
                iCharAt = 0;
                i4 = 0;
                iCharAt2 = 0;
                i5 = 0;
                iArr = zzub;
                i3 = 0;
            } else {
                int i34 = i31 + 1;
                int iCharAt5 = strZzek.charAt(i31);
                if (iCharAt5 >= 55296) {
                    int i35 = iCharAt5 & 8191;
                    int i36 = 13;
                    while (true) {
                        i14 = i34 + 1;
                        cCharAt8 = strZzek.charAt(i34);
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i35 |= (cCharAt8 & 8191) << i36;
                        i36 += 13;
                        i34 = i14;
                    }
                    iCharAt5 = i35 | (cCharAt8 << i36);
                    i34 = i14;
                }
                int i37 = i34 + 1;
                int iCharAt6 = strZzek.charAt(i34);
                if (iCharAt6 >= 55296) {
                    int i38 = iCharAt6 & 8191;
                    int i39 = 13;
                    while (true) {
                        i13 = i37 + 1;
                        cCharAt7 = strZzek.charAt(i37);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i38 |= (cCharAt7 & 8191) << i39;
                        i39 += 13;
                        i37 = i13;
                    }
                    iCharAt6 = i38 | (cCharAt7 << i39);
                    i37 = i13;
                }
                int i40 = i37 + 1;
                iCharAt = strZzek.charAt(i37);
                if (iCharAt >= 55296) {
                    int i41 = iCharAt & 8191;
                    int i42 = 13;
                    while (true) {
                        i12 = i40 + 1;
                        cCharAt6 = strZzek.charAt(i40);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i41 |= (cCharAt6 & 8191) << i42;
                        i42 += 13;
                        i40 = i12;
                    }
                    iCharAt = i41 | (cCharAt6 << i42);
                    i40 = i12;
                }
                int i43 = i40 + 1;
                int iCharAt7 = strZzek.charAt(i40);
                if (iCharAt7 >= 55296) {
                    int i44 = iCharAt7 & 8191;
                    int i45 = 13;
                    while (true) {
                        i11 = i43 + 1;
                        cCharAt5 = strZzek.charAt(i43);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i44 |= (cCharAt5 & 8191) << i45;
                        i45 += 13;
                        i43 = i11;
                    }
                    iCharAt7 = i44 | (cCharAt5 << i45);
                    i43 = i11;
                }
                int i46 = i43 + 1;
                iCharAt2 = strZzek.charAt(i43);
                if (iCharAt2 >= 55296) {
                    int i47 = iCharAt2 & 8191;
                    int i48 = 13;
                    while (true) {
                        i10 = i46 + 1;
                        cCharAt4 = strZzek.charAt(i46);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i47 |= (cCharAt4 & 8191) << i48;
                        i48 += 13;
                        i46 = i10;
                    }
                    iCharAt2 = i47 | (cCharAt4 << i48);
                    i46 = i10;
                }
                int i49 = i46 + 1;
                int iCharAt8 = strZzek.charAt(i46);
                if (iCharAt8 >= 55296) {
                    int i50 = iCharAt8 & 8191;
                    int i51 = 13;
                    while (true) {
                        i9 = i49 + 1;
                        cCharAt3 = strZzek.charAt(i49);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i50 |= (cCharAt3 & 8191) << i51;
                        i51 += 13;
                        i49 = i9;
                    }
                    iCharAt8 = i50 | (cCharAt3 << i51);
                    i49 = i9;
                }
                int i52 = i49 + 1;
                int iCharAt9 = strZzek.charAt(i49);
                if (iCharAt9 >= 55296) {
                    int i53 = iCharAt9 & 8191;
                    int i54 = i52;
                    int i55 = 13;
                    while (true) {
                        i8 = i54 + 1;
                        cCharAt2 = strZzek.charAt(i54);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i53 |= (cCharAt2 & 8191) << i55;
                        i55 += 13;
                        i54 = i8;
                    }
                    iCharAt9 = i53 | (cCharAt2 << i55);
                    i2 = i8;
                } else {
                    i2 = i52;
                }
                int i56 = i2 + 1;
                int iCharAt10 = strZzek.charAt(i2);
                if (iCharAt10 >= 55296) {
                    int i57 = iCharAt10 & 8191;
                    int i58 = i56;
                    int i59 = 13;
                    while (true) {
                        i7 = i58 + 1;
                        cCharAt = strZzek.charAt(i58);
                        if (cCharAt < 55296) {
                            break;
                        }
                        i57 |= (cCharAt & 8191) << i59;
                        i59 += 13;
                        i58 = i7;
                    }
                    iCharAt10 = i57 | (cCharAt << i59);
                    i56 = i7;
                }
                int[] iArr2 = new int[iCharAt10 + iCharAt8 + iCharAt9];
                int i60 = (iCharAt5 << 1) + iCharAt6;
                i3 = iCharAt7;
                i4 = i60;
                i5 = iCharAt10;
                i27 = iCharAt5;
                i31 = i56;
                int i61 = iCharAt8;
                iArr = iArr2;
                i6 = i61;
            }
            sun.misc.Unsafe unsafe = zzuc;
            java.lang.Object[] objArrZzel = zzmeVar2.zzel();
            java.lang.Class<?> cls2 = zzmeVar2.zzee().getClass();
            int i62 = i31;
            int[] iArr3 = new int[iCharAt2 * 3];
            java.lang.Object[] objArr = new java.lang.Object[iCharAt2 << 1];
            int i63 = i5 + i6;
            int i64 = i5;
            int i65 = i62;
            int i66 = i63;
            int i67 = 0;
            int i68 = 0;
            while (i65 < length) {
                int i69 = i65 + 1;
                int iCharAt11 = strZzek.charAt(i65);
                int i70 = length;
                if (iCharAt11 >= 55296) {
                    int i71 = iCharAt11 & 8191;
                    int i72 = i69;
                    int i73 = 13;
                    while (true) {
                        i25 = i72 + 1;
                        cCharAt12 = strZzek.charAt(i72);
                        i15 = i5;
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i71 |= (cCharAt12 & 8191) << i73;
                        i73 += 13;
                        i72 = i25;
                        i5 = i15;
                    }
                    iCharAt11 = i71 | (cCharAt12 << i73);
                    i16 = i25;
                } else {
                    i15 = i5;
                    i16 = i69;
                }
                int i74 = i16 + 1;
                int iCharAt12 = strZzek.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i75 = iCharAt12 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i24 = i76 + 1;
                        cCharAt11 = strZzek.charAt(i76);
                        z = z2;
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        i75 |= (cCharAt11 & 8191) << i77;
                        i77 += 13;
                        i76 = i24;
                        z2 = z;
                    }
                    iCharAt12 = i75 | (cCharAt11 << i77);
                    i17 = i24;
                } else {
                    z = z2;
                    i17 = i74;
                }
                int i78 = iCharAt12 & 255;
                int i79 = i3;
                if ((iCharAt12 & 1024) != 0) {
                    iArr[i67] = i68;
                    i67++;
                }
                int i80 = iCharAt;
                if (i78 >= 51) {
                    int i81 = i17 + 1;
                    int iCharAt13 = strZzek.charAt(i17);
                    char c = 55296;
                    if (iCharAt13 >= 55296) {
                        int i82 = iCharAt13 & 8191;
                        int i83 = 13;
                        while (true) {
                            i23 = i81 + 1;
                            cCharAt10 = strZzek.charAt(i81);
                            if (cCharAt10 < c) {
                                break;
                            }
                            i82 |= (cCharAt10 & 8191) << i83;
                            i83 += 13;
                            i81 = i23;
                            c = 55296;
                        }
                        iCharAt13 = i82 | (cCharAt10 << i83);
                        i81 = i23;
                    }
                    int i84 = i78 - 51;
                    int i85 = i81;
                    if (i84 == 9 || i84 == 17) {
                        objArr[((i68 / 3) << 1) + 1] = objArrZzel[i4];
                        i4++;
                    } else if (i84 == 12 && (iCharAt3 & 1) == 1) {
                        objArr[((i68 / 3) << 1) + 1] = objArrZzel[i4];
                        i4++;
                    }
                    int i86 = iCharAt13 << 1;
                    java.lang.Object obj = objArrZzel[i86];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldZza2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldZza2 = zza(cls2, (java.lang.String) obj);
                        objArrZzel[i86] = fieldZza2;
                    }
                    zzmeVar = zzmeVar2;
                    java.lang.String str2 = strZzek;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZza2);
                    int i87 = i86 + 1;
                    java.lang.Object obj2 = objArrZzel[i87];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldZza3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldZza3 = zza(cls2, (java.lang.String) obj2);
                        objArrZzel[i87] = fieldZza3;
                    }
                    cls2 = cls2;
                    i18 = i4;
                    i17 = i85;
                    str = str2;
                    i20 = 0;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i27 = i27;
                } else {
                    zzmeVar = zzmeVar2;
                    str = strZzek;
                    i18 = i4 + 1;
                    java.lang.reflect.Field fieldZza4 = zza(cls2, (java.lang.String) objArrZzel[i4]);
                    if (i78 == 9 || i78 == 17) {
                        i19 = 1;
                        objArr[((i68 / 3) << 1) + 1] = fieldZza4.getType();
                    } else {
                        if (i78 == 27 || i78 == 49) {
                            i19 = 1;
                            i22 = i18 + 1;
                            objArr[((i68 / 3) << 1) + 1] = objArrZzel[i18];
                        } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                            i19 = 1;
                            if ((iCharAt3 & 1) == 1) {
                                i22 = i18 + 1;
                                objArr[((i68 / 3) << 1) + 1] = objArrZzel[i18];
                            }
                        } else if (i78 == 50) {
                            int i88 = i64 + 1;
                            iArr[i64] = i68;
                            int i89 = (i68 / 3) << 1;
                            int i90 = i18 + 1;
                            objArr[i89] = objArrZzel[i18];
                            if ((iCharAt12 & 2048) != 0) {
                                i18 = i90 + 1;
                                objArr[i89 + 1] = objArrZzel[i90];
                                i64 = i88;
                                i19 = 1;
                            } else {
                                i18 = i90;
                                i19 = 1;
                                i64 = i88;
                            }
                        } else {
                            i19 = 1;
                        }
                        i18 = i22;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                    if ((iCharAt3 & 1) != i19 || i78 > 17) {
                        iObjectFieldOffset2 = 0;
                        i20 = 0;
                    } else {
                        int i91 = i17 + 1;
                        str = str;
                        int iCharAt14 = str.charAt(i17);
                        if (iCharAt14 >= 55296) {
                            int i92 = iCharAt14 & 8191;
                            int i93 = 13;
                            while (true) {
                                i21 = i91 + 1;
                                cCharAt9 = str.charAt(i91);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i92 |= (cCharAt9 & 8191) << i93;
                                i93 += 13;
                                i91 = i21;
                            }
                            iCharAt14 = i92 | (cCharAt9 << i93);
                            i91 = i21;
                        }
                        int i94 = (i27 << 1) + (iCharAt14 / 32);
                        java.lang.Object obj3 = objArrZzel[i94];
                        i18 = i18;
                        if (obj3 instanceof java.lang.reflect.Field) {
                            fieldZza = (java.lang.reflect.Field) obj3;
                        } else {
                            fieldZza = zza(cls2, (java.lang.String) obj3);
                            objArrZzel[i94] = fieldZza;
                        }
                        i27 = i27;
                        cls2 = cls2;
                        i20 = iCharAt14 % 32;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza);
                        i17 = i91;
                    }
                    if (i78 >= 18 && i78 <= 49) {
                        iArr[i66] = iObjectFieldOffset;
                        i66++;
                    }
                }
                int i95 = i68 + 1;
                iArr3[i68] = iCharAt11;
                int i96 = i95 + 1;
                iArr3[i95] = iObjectFieldOffset | ((iCharAt12 & 256) != 0 ? 268435456 : 0) | ((iCharAt12 & 512) != 0 ? 536870912 : 0) | (i78 << 20);
                i68 = i96 + 1;
                iArr3[i96] = (i20 << 20) | iObjectFieldOffset2;
                i27 = i27;
                strZzek = str;
                i65 = i17;
                cls2 = cls2;
                i3 = i79;
                length = i70;
                i5 = i15;
                z2 = z;
                iCharAt = i80;
                i4 = i18;
                zzmeVar2 = zzmeVar;
            }
            return new com.google.android.gms.internal.drive.zzlu<>(iArr3, objArr, iCharAt, i3, zzmeVar2.zzee(), z2, false, iArr, i5, i63, zzlyVar, zzlaVar, zzmxVar, zzjyVar, zzllVar);
        }
        ((com.google.android.gms.internal.drive.zzms) zzloVar).zzec();
        int i97 = com.google.android.gms.internal.drive.zzkk.zze.zzsg;
        throw new java.lang.NoSuchMethodError();
    }

    private static java.lang.reflect.Field zza(java.lang.Class<?> cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            java.lang.String name = cls.getName();
            java.lang.String string = java.util.Arrays.toString(declaredFields);
            throw new java.lang.RuntimeException(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 40 + java.lang.String.valueOf(name).length() + java.lang.String.valueOf(string).length()).append("Field ").append(str).append(" for ").append(name).append(" not found. Known fields are ").append(string).toString());
        }
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final T newInstance() {
        return (T) this.zzup.newInstance(this.zzuh);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c1  */
    @Override // com.google.android.gms.internal.drive.zzmf
    public final boolean equals(T t, T t2) {
        int length = this.zzud.length;
        int i = 0;
        while (true) {
            boolean zZzd = true;
            if (i < length) {
                int iZzas = zzas(i);
                long j = iZzas & 1048575;
                switch ((iZzas & 267386880) >>> 20) {
                    case 0:
                        if (!zzc(t, t2, i) || java.lang.Double.doubleToLongBits(com.google.android.gms.internal.drive.zznd.zzn(t, j)) != java.lang.Double.doubleToLongBits(com.google.android.gms.internal.drive.zznd.zzn(t2, j))) {
                            zZzd = false;
                        }
                        break;
                    case 1:
                        if (!zzc(t, t2, i) || java.lang.Float.floatToIntBits(com.google.android.gms.internal.drive.zznd.zzm(t, j)) != java.lang.Float.floatToIntBits(com.google.android.gms.internal.drive.zznd.zzm(t2, j))) {
                            zZzd = false;
                        }
                        break;
                    case 2:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.drive.zznd.zzk(t, j) != com.google.android.gms.internal.drive.zznd.zzk(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 3:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.drive.zznd.zzk(t, j) != com.google.android.gms.internal.drive.zznd.zzk(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 4:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.drive.zznd.zzj(t, j) != com.google.android.gms.internal.drive.zznd.zzj(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 5:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.drive.zznd.zzk(t, j) != com.google.android.gms.internal.drive.zznd.zzk(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 6:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.drive.zznd.zzj(t, j) != com.google.android.gms.internal.drive.zznd.zzj(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 7:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.drive.zznd.zzl(t, j) != com.google.android.gms.internal.drive.zznd.zzl(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 8:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(t, j), com.google.android.gms.internal.drive.zznd.zzo(t2, j))) {
                            zZzd = false;
                        }
                        break;
                    case 9:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(t, j), com.google.android.gms.internal.drive.zznd.zzo(t2, j))) {
                            zZzd = false;
                        }
                        break;
                    case 10:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(t, j), com.google.android.gms.internal.drive.zznd.zzo(t2, j))) {
                            zZzd = false;
                        }
                        break;
                    case 11:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.drive.zznd.zzj(t, j) != com.google.android.gms.internal.drive.zznd.zzj(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 12:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.drive.zznd.zzj(t, j) != com.google.android.gms.internal.drive.zznd.zzj(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 13:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.drive.zznd.zzj(t, j) != com.google.android.gms.internal.drive.zznd.zzj(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 14:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.drive.zznd.zzk(t, j) != com.google.android.gms.internal.drive.zznd.zzk(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 15:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.drive.zznd.zzj(t, j) != com.google.android.gms.internal.drive.zznd.zzj(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 16:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.drive.zznd.zzk(t, j) != com.google.android.gms.internal.drive.zznd.zzk(t2, j)) {
                            zZzd = false;
                        }
                        break;
                    case 17:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(t, j), com.google.android.gms.internal.drive.zznd.zzo(t2, j))) {
                            zZzd = false;
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
                        zZzd = com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(t, j), com.google.android.gms.internal.drive.zznd.zzo(t2, j));
                        break;
                    case 50:
                        zZzd = com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(t, j), com.google.android.gms.internal.drive.zznd.zzo(t2, j));
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
                        long jZzat = zzat(i) & 1048575;
                        if (com.google.android.gms.internal.drive.zznd.zzj(t, jZzat) != com.google.android.gms.internal.drive.zznd.zzj(t2, jZzat) || !com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(t, j), com.google.android.gms.internal.drive.zznd.zzo(t2, j))) {
                            zZzd = false;
                        }
                        break;
                }
                if (!zZzd) {
                    return false;
                }
                i += 3;
            } else {
                if (!this.zzur.zzr(t).equals(this.zzur.zzr(t2))) {
                    return false;
                }
                if (this.zzui) {
                    return this.zzus.zzb(t).equals(this.zzus.zzb(t2));
                }
                return true;
            }
        }
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final int hashCode(T t) {
        int i;
        int iZzu;
        int length = this.zzud.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzas = zzas(i3);
            int i4 = this.zzud[i3];
            long j = 1048575 & iZzas;
            int iHashCode = 37;
            switch ((iZzas & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zzkm.zzu(java.lang.Double.doubleToLongBits(com.google.android.gms.internal.drive.zznd.zzn(t, j)));
                    i2 = i + iZzu;
                    break;
                case 1:
                    i = i2 * 53;
                    iZzu = java.lang.Float.floatToIntBits(com.google.android.gms.internal.drive.zznd.zzm(t, j));
                    i2 = i + iZzu;
                    break;
                case 2:
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zzkm.zzu(com.google.android.gms.internal.drive.zznd.zzk(t, j));
                    i2 = i + iZzu;
                    break;
                case 3:
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zzkm.zzu(com.google.android.gms.internal.drive.zznd.zzk(t, j));
                    i2 = i + iZzu;
                    break;
                case 4:
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 5:
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zzkm.zzu(com.google.android.gms.internal.drive.zznd.zzk(t, j));
                    i2 = i + iZzu;
                    break;
                case 6:
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 7:
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zzkm.zze(com.google.android.gms.internal.drive.zznd.zzl(t, j));
                    i2 = i + iZzu;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzu = ((java.lang.String) com.google.android.gms.internal.drive.zznd.zzo(t, j)).hashCode();
                    i2 = i + iZzu;
                    break;
                case 9:
                    java.lang.Object objZzo = com.google.android.gms.internal.drive.zznd.zzo(t, j);
                    if (objZzo != null) {
                        iHashCode = objZzo.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zznd.zzo(t, j).hashCode();
                    i2 = i + iZzu;
                    break;
                case 11:
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 12:
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 13:
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 14:
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zzkm.zzu(com.google.android.gms.internal.drive.zznd.zzk(t, j));
                    i2 = i + iZzu;
                    break;
                case 15:
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 16:
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zzkm.zzu(com.google.android.gms.internal.drive.zznd.zzk(t, j));
                    i2 = i + iZzu;
                    break;
                case 17:
                    java.lang.Object objZzo2 = com.google.android.gms.internal.drive.zznd.zzo(t, j);
                    if (objZzo2 != null) {
                        iHashCode = objZzo2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
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
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zznd.zzo(t, j).hashCode();
                    i2 = i + iZzu;
                    break;
                case 50:
                    i = i2 * 53;
                    iZzu = com.google.android.gms.internal.drive.zznd.zzo(t, j).hashCode();
                    i2 = i + iZzu;
                    break;
                case 51:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = com.google.android.gms.internal.drive.zzkm.zzu(java.lang.Double.doubleToLongBits(zze(t, j)));
                        i2 = i + iZzu;
                    }
                    break;
                case 52:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = java.lang.Float.floatToIntBits(zzf(t, j));
                        i2 = i + iZzu;
                    }
                    break;
                case 53:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = com.google.android.gms.internal.drive.zzkm.zzu(zzh(t, j));
                        i2 = i + iZzu;
                    }
                    break;
                case 54:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = com.google.android.gms.internal.drive.zzkm.zzu(zzh(t, j));
                        i2 = i + iZzu;
                    }
                    break;
                case 55:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                    }
                    break;
                case 56:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = com.google.android.gms.internal.drive.zzkm.zzu(zzh(t, j));
                        i2 = i + iZzu;
                    }
                    break;
                case 57:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                    }
                    break;
                case 58:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = com.google.android.gms.internal.drive.zzkm.zze(zzi(t, j));
                        i2 = i + iZzu;
                    }
                    break;
                case 59:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = ((java.lang.String) com.google.android.gms.internal.drive.zznd.zzo(t, j)).hashCode();
                        i2 = i + iZzu;
                    }
                    break;
                case 60:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = com.google.android.gms.internal.drive.zznd.zzo(t, j).hashCode();
                        i2 = i + iZzu;
                    }
                    break;
                case 61:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = com.google.android.gms.internal.drive.zznd.zzo(t, j).hashCode();
                        i2 = i + iZzu;
                    }
                    break;
                case 62:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                    }
                    break;
                case 63:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                    }
                    break;
                case 64:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                    }
                    break;
                case 65:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = com.google.android.gms.internal.drive.zzkm.zzu(zzh(t, j));
                        i2 = i + iZzu;
                    }
                    break;
                case 66:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                    }
                    break;
                case 67:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = com.google.android.gms.internal.drive.zzkm.zzu(zzh(t, j));
                        i2 = i + iZzu;
                    }
                    break;
                case 68:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = com.google.android.gms.internal.drive.zznd.zzo(t, j).hashCode();
                        i2 = i + iZzu;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzur.zzr(t).hashCode();
        return this.zzui ? (iHashCode2 * 53) + this.zzus.zzb(t).hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzc(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.zzud.length; i += 3) {
            int iZzas = zzas(i);
            long j = 1048575 & iZzas;
            int i2 = this.zzud[i];
            switch ((iZzas & 267386880) >>> 20) {
                case 0:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza(t, j, com.google.android.gms.internal.drive.zznd.zzn(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 1:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzm(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 2:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 3:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 4:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 5:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 6:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 7:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza(t, j, com.google.android.gms.internal.drive.zznd.zzl(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 8:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza(t, j, com.google.android.gms.internal.drive.zznd.zzo(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza(t, j, com.google.android.gms.internal.drive.zznd.zzo(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 11:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 12:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 13:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 14:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 15:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 16:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 17:
                    zza(t, t2, i);
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
                    this.zzuq.zza(t, t2, j);
                    break;
                case 50:
                    com.google.android.gms.internal.drive.zzmh.zza(this.zzut, t, t2, j);
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
                    if (zza(t2, i2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza(t, j, com.google.android.gms.internal.drive.zznd.zzo(t2, j));
                        zzb(t, i2, i);
                    }
                    break;
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza(t2, i2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza(t, j, com.google.android.gms.internal.drive.zznd.zzo(t2, j));
                        zzb(t, i2, i);
                    }
                    break;
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        if (this.zzuk) {
            return;
        }
        com.google.android.gms.internal.drive.zzmh.zza(this.zzur, t, t2);
        if (this.zzui) {
            com.google.android.gms.internal.drive.zzmh.zza(this.zzus, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long jZzas = zzas(i) & 1048575;
        if (zza(t2, i)) {
            java.lang.Object objZzo = com.google.android.gms.internal.drive.zznd.zzo(t, jZzas);
            java.lang.Object objZzo2 = com.google.android.gms.internal.drive.zznd.zzo(t2, jZzas);
            if (objZzo != null && objZzo2 != null) {
                com.google.android.gms.internal.drive.zznd.zza(t, jZzas, com.google.android.gms.internal.drive.zzkm.zza(objZzo, objZzo2));
                zzb(t, i);
            } else if (objZzo2 != null) {
                com.google.android.gms.internal.drive.zznd.zza(t, jZzas, objZzo2);
                zzb(t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int iZzas = zzas(i);
        int i2 = this.zzud[i];
        long j = iZzas & 1048575;
        if (zza(t2, i2, i)) {
            java.lang.Object objZzo = com.google.android.gms.internal.drive.zznd.zzo(t, j);
            java.lang.Object objZzo2 = com.google.android.gms.internal.drive.zznd.zzo(t2, j);
            if (objZzo != null && objZzo2 != null) {
                com.google.android.gms.internal.drive.zznd.zza(t, j, com.google.android.gms.internal.drive.zzkm.zza(objZzo, objZzo2));
                zzb(t, i2, i);
            } else if (objZzo2 != null) {
                com.google.android.gms.internal.drive.zznd.zza(t, j, objZzo2);
                zzb(t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:421:0x090b A[PHI: r6
  0x090b: PHI (r6v4 int) = 
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v16 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v17 int)
  (r6v1 int)
 binds: [B:256:0x0545, B:459:0x09b0, B:453:0x0994, B:450:0x0982, B:447:0x0973, B:444:0x0966, B:441:0x0959, B:437:0x094e, B:434:0x0943, B:431:0x0936, B:428:0x0929, B:425:0x0916, B:396:0x081f, B:390:0x0802, B:384:0x07e5, B:378:0x07c8, B:372:0x07aa, B:366:0x078c, B:360:0x076e, B:354:0x0750, B:348:0x0732, B:342:0x0714, B:336:0x06f6, B:330:0x06d8, B:324:0x06ba, B:318:0x069c, B:313:0x0668, B:310:0x065b, B:307:0x064b, B:304:0x063b, B:301:0x062b, B:298:0x061d, B:295:0x0610, B:292:0x0603, B:286:0x05e5, B:283:0x05d1, B:280:0x05bf, B:277:0x05af, B:274:0x059f, B:439:0x0955, B:271:0x0592, B:268:0x0584, B:265:0x0574, B:262:0x0564, B:420:0x090a, B:259:0x054e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.drive.zzmf
    public final int zzn(T t) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        long j;
        int iZzd;
        int iZzb;
        int iZzk;
        int iZzv;
        int iZzi;
        int iZzab;
        int iZzad;
        int iZzb2;
        int iZzi2;
        int iZzab2;
        int iZzad2;
        int i5 = 267386880;
        int i6 = 1;
        int i7 = 0;
        if (this.zzuk) {
            sun.misc.Unsafe unsafe = zzuc;
            int i8 = 0;
            int i9 = 0;
            while (i8 < this.zzud.length) {
                int iZzas = zzas(i8);
                int i10 = (iZzas & i5) >>> 20;
                int i11 = this.zzud[i8];
                long j2 = iZzas & 1048575;
                int i12 = (i10 < com.google.android.gms.internal.drive.zzke.DOUBLE_LIST_PACKED.id() || i10 > com.google.android.gms.internal.drive.zzke.SINT64_LIST_PACKED.id()) ? 0 : this.zzud[i8 + 2] & 1048575;
                switch (i10) {
                    case 0:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzb(i11, 0.0d);
                            i9 += iZzb2;
                        }
                        break;
                    case 1:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzb(i11, 0.0f);
                            i9 += iZzb2;
                        }
                        break;
                    case 2:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzd(i11, com.google.android.gms.internal.drive.zznd.zzk(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 3:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zze(i11, com.google.android.gms.internal.drive.zznd.zzk(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 4:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzg(i11, com.google.android.gms.internal.drive.zznd.zzj(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 5:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzg(i11, 0L);
                            i9 += iZzb2;
                        }
                        break;
                    case 6:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzj(i11, 0);
                            i9 += iZzb2;
                        }
                        break;
                    case 7:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i11, true);
                            i9 += iZzb2;
                        }
                        break;
                    case 8:
                        if (zza(t, i8)) {
                            java.lang.Object objZzo = com.google.android.gms.internal.drive.zznd.zzo(t, j2);
                            if (objZzo instanceof com.google.android.gms.internal.drive.zzjc) {
                                iZzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i11, (com.google.android.gms.internal.drive.zzjc) objZzo);
                            } else {
                                iZzb2 = com.google.android.gms.internal.drive.zzjr.zzb(i11, (java.lang.String) objZzo);
                            }
                            i9 += iZzb2;
                        }
                        break;
                    case 9:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzmh.zzc(i11, com.google.android.gms.internal.drive.zznd.zzo(t, j2), zzap(i8));
                            i9 += iZzb2;
                        }
                        break;
                    case 10:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i11, (com.google.android.gms.internal.drive.zzjc) com.google.android.gms.internal.drive.zznd.zzo(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 11:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzh(i11, com.google.android.gms.internal.drive.zznd.zzj(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 12:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzl(i11, com.google.android.gms.internal.drive.zznd.zzj(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 13:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzk(i11, 0);
                            i9 += iZzb2;
                        }
                        break;
                    case 14:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzh(i11, 0L);
                            i9 += iZzb2;
                        }
                        break;
                    case 15:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzi(i11, com.google.android.gms.internal.drive.zznd.zzj(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 16:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzf(i11, com.google.android.gms.internal.drive.zznd.zzk(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 17:
                        if (zza(t, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i11, (com.google.android.gms.internal.drive.zzlq) com.google.android.gms.internal.drive.zznd.zzo(t, j2), zzap(i8));
                            i9 += iZzb2;
                        }
                        break;
                    case 18:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzw(i11, zzd(t, j2), false);
                        i9 += iZzb2;
                        break;
                    case 19:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzv(i11, zzd(t, j2), false);
                        i9 += iZzb2;
                        break;
                    case 20:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzo(i11, zzd(t, j2), false);
                        i9 += iZzb2;
                        break;
                    case 21:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzp(i11, zzd(t, j2), false);
                        i9 += iZzb2;
                        break;
                    case 22:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzs(i11, zzd(t, j2), false);
                        i9 += iZzb2;
                        break;
                    case 23:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzw(i11, zzd(t, j2), false);
                        i9 += iZzb2;
                        break;
                    case 24:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzv(i11, zzd(t, j2), false);
                        i9 += iZzb2;
                        break;
                    case 25:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzx(i11, zzd(t, j2), false);
                        i9 += iZzb2;
                        break;
                    case 26:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzc(i11, zzd(t, j2));
                        i9 += iZzb2;
                        break;
                    case 27:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzc(i11, (java.util.List<?>) zzd(t, j2), zzap(i8));
                        i9 += iZzb2;
                        break;
                    case 28:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzd(i11, (java.util.List<com.google.android.gms.internal.drive.zzjc>) zzd(t, j2));
                        i9 += iZzb2;
                        break;
                    case 29:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzt(i11, zzd(t, j2), false);
                        i9 += iZzb2;
                        break;
                    case 30:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzr(i11, zzd(t, j2), false);
                        i9 += iZzb2;
                        break;
                    case 31:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzv(i11, zzd(t, j2), false);
                        i9 += iZzb2;
                        break;
                    case 32:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzw(i11, zzd(t, j2), false);
                        i9 += iZzb2;
                        break;
                    case 33:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzu(i11, zzd(t, j2), false);
                        i9 += iZzb2;
                        break;
                    case 34:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzq(i11, zzd(t, j2), false);
                        i9 += iZzb2;
                        break;
                    case 35:
                        iZzi2 = com.google.android.gms.internal.drive.zzmh.zzi((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i12, iZzi2);
                            }
                            iZzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i11);
                            iZzad2 = com.google.android.gms.internal.drive.zzjr.zzad(iZzi2);
                            iZzb2 = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb2;
                        }
                        break;
                    case 36:
                        iZzi2 = com.google.android.gms.internal.drive.zzmh.zzh((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i12, iZzi2);
                            }
                            iZzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i11);
                            iZzad2 = com.google.android.gms.internal.drive.zzjr.zzad(iZzi2);
                            iZzb2 = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb2;
                        }
                        break;
                    case 37:
                        iZzi2 = com.google.android.gms.internal.drive.zzmh.zza((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i12, iZzi2);
                            }
                            iZzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i11);
                            iZzad2 = com.google.android.gms.internal.drive.zzjr.zzad(iZzi2);
                            iZzb2 = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb2;
                        }
                        break;
                    case 38:
                        iZzi2 = com.google.android.gms.internal.drive.zzmh.zzb((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i12, iZzi2);
                            }
                            iZzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i11);
                            iZzad2 = com.google.android.gms.internal.drive.zzjr.zzad(iZzi2);
                            iZzb2 = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb2;
                        }
                        break;
                    case 39:
                        iZzi2 = com.google.android.gms.internal.drive.zzmh.zze((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i12, iZzi2);
                            }
                            iZzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i11);
                            iZzad2 = com.google.android.gms.internal.drive.zzjr.zzad(iZzi2);
                            iZzb2 = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb2;
                        }
                        break;
                    case 40:
                        iZzi2 = com.google.android.gms.internal.drive.zzmh.zzi((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i12, iZzi2);
                            }
                            iZzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i11);
                            iZzad2 = com.google.android.gms.internal.drive.zzjr.zzad(iZzi2);
                            iZzb2 = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb2;
                        }
                        break;
                    case 41:
                        iZzi2 = com.google.android.gms.internal.drive.zzmh.zzh((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i12, iZzi2);
                            }
                            iZzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i11);
                            iZzad2 = com.google.android.gms.internal.drive.zzjr.zzad(iZzi2);
                            iZzb2 = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb2;
                        }
                        break;
                    case 42:
                        iZzi2 = com.google.android.gms.internal.drive.zzmh.zzj((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i12, iZzi2);
                            }
                            iZzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i11);
                            iZzad2 = com.google.android.gms.internal.drive.zzjr.zzad(iZzi2);
                            iZzb2 = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb2;
                        }
                        break;
                    case 43:
                        iZzi2 = com.google.android.gms.internal.drive.zzmh.zzf((java.util.List<java.lang.Integer>) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i12, iZzi2);
                            }
                            iZzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i11);
                            iZzad2 = com.google.android.gms.internal.drive.zzjr.zzad(iZzi2);
                            iZzb2 = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb2;
                        }
                        break;
                    case 44:
                        iZzi2 = com.google.android.gms.internal.drive.zzmh.zzd((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i12, iZzi2);
                            }
                            iZzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i11);
                            iZzad2 = com.google.android.gms.internal.drive.zzjr.zzad(iZzi2);
                            iZzb2 = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb2;
                        }
                        break;
                    case 45:
                        iZzi2 = com.google.android.gms.internal.drive.zzmh.zzh((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i12, iZzi2);
                            }
                            iZzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i11);
                            iZzad2 = com.google.android.gms.internal.drive.zzjr.zzad(iZzi2);
                            iZzb2 = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb2;
                        }
                        break;
                    case 46:
                        iZzi2 = com.google.android.gms.internal.drive.zzmh.zzi((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i12, iZzi2);
                            }
                            iZzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i11);
                            iZzad2 = com.google.android.gms.internal.drive.zzjr.zzad(iZzi2);
                            iZzb2 = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb2;
                        }
                        break;
                    case 47:
                        iZzi2 = com.google.android.gms.internal.drive.zzmh.zzg((java.util.List<java.lang.Integer>) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i12, iZzi2);
                            }
                            iZzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i11);
                            iZzad2 = com.google.android.gms.internal.drive.zzjr.zzad(iZzi2);
                            iZzb2 = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb2;
                        }
                        break;
                    case 48:
                        iZzi2 = com.google.android.gms.internal.drive.zzmh.zzc((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzul) {
                                unsafe.putInt(t, i12, iZzi2);
                            }
                            iZzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i11);
                            iZzad2 = com.google.android.gms.internal.drive.zzjr.zzad(iZzi2);
                            iZzb2 = iZzab2 + iZzad2 + iZzi2;
                            i9 += iZzb2;
                        }
                        break;
                    case 49:
                        iZzb2 = com.google.android.gms.internal.drive.zzmh.zzd(i11, zzd(t, j2), zzap(i8));
                        i9 += iZzb2;
                        break;
                    case 50:
                        iZzb2 = this.zzut.zzb(i11, com.google.android.gms.internal.drive.zznd.zzo(t, j2), zzaq(i8));
                        i9 += iZzb2;
                        break;
                    case 51:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzb(i11, 0.0d);
                            i9 += iZzb2;
                        }
                        break;
                    case 52:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzb(i11, 0.0f);
                            i9 += iZzb2;
                        }
                        break;
                    case 53:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzd(i11, zzh(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 54:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zze(i11, zzh(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 55:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzg(i11, zzg(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 56:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzg(i11, 0L);
                            i9 += iZzb2;
                        }
                        break;
                    case 57:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzj(i11, 0);
                            i9 += iZzb2;
                        }
                        break;
                    case 58:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i11, true);
                            i9 += iZzb2;
                        }
                        break;
                    case 59:
                        if (zza(t, i11, i8)) {
                            java.lang.Object objZzo2 = com.google.android.gms.internal.drive.zznd.zzo(t, j2);
                            if (objZzo2 instanceof com.google.android.gms.internal.drive.zzjc) {
                                iZzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i11, (com.google.android.gms.internal.drive.zzjc) objZzo2);
                            } else {
                                iZzb2 = com.google.android.gms.internal.drive.zzjr.zzb(i11, (java.lang.String) objZzo2);
                            }
                            i9 += iZzb2;
                        }
                        break;
                    case 60:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzmh.zzc(i11, com.google.android.gms.internal.drive.zznd.zzo(t, j2), zzap(i8));
                            i9 += iZzb2;
                        }
                        break;
                    case 61:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i11, (com.google.android.gms.internal.drive.zzjc) com.google.android.gms.internal.drive.zznd.zzo(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 62:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzh(i11, zzg(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 63:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzl(i11, zzg(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 64:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzk(i11, 0);
                            i9 += iZzb2;
                        }
                        break;
                    case 65:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzh(i11, 0L);
                            i9 += iZzb2;
                        }
                        break;
                    case 66:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzi(i11, zzg(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 67:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzf(i11, zzh(t, j2));
                            i9 += iZzb2;
                        }
                        break;
                    case 68:
                        if (zza(t, i11, i8)) {
                            iZzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i11, (com.google.android.gms.internal.drive.zzlq) com.google.android.gms.internal.drive.zznd.zzo(t, j2), zzap(i8));
                            i9 += iZzb2;
                        }
                        break;
                }
                i8 += 3;
                i5 = 267386880;
            }
            return i9 + zza(this.zzur, t);
        }
        sun.misc.Unsafe unsafe2 = zzuc;
        int i13 = -1;
        int i14 = 0;
        int iZzb3 = 0;
        int i15 = 0;
        while (i14 < this.zzud.length) {
            int iZzas2 = zzas(i14);
            int[] iArr = this.zzud;
            int i16 = iArr[i14];
            int i17 = (iZzas2 & 267386880) >>> 20;
            if (i17 <= 17) {
                int i18 = iArr[i14 + 2];
                int i19 = i18 & 1048575;
                i2 = i6 << (i18 >>> 20);
                if (i19 != i13) {
                    i15 = unsafe2.getInt(t, i19);
                    i13 = i19;
                }
                i = i18;
            } else {
                i = (!this.zzul || i17 < com.google.android.gms.internal.drive.zzke.DOUBLE_LIST_PACKED.id() || i17 > com.google.android.gms.internal.drive.zzke.SINT64_LIST_PACKED.id()) ? 0 : this.zzud[i14 + 2] & 1048575;
                i2 = 0;
            }
            long j3 = iZzas2 & 1048575;
            switch (i17) {
                case 0:
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        iZzb3 += com.google.android.gms.internal.drive.zzjr.zzb(i16, 0.0d);
                    }
                    break;
                case 1:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        z = false;
                        iZzb3 += com.google.android.gms.internal.drive.zzjr.zzb(i16, 0.0f);
                    } else {
                        z = false;
                    }
                    break;
                case 2:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.drive.zzjr.zzd(i16, unsafe2.getLong(t, j3));
                        iZzb3 += iZzd;
                    }
                    z = false;
                    break;
                case 3:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.drive.zzjr.zze(i16, unsafe2.getLong(t, j3));
                        iZzb3 += iZzd;
                    }
                    z = false;
                    break;
                case 4:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.drive.zzjr.zzg(i16, unsafe2.getInt(t, j3));
                        iZzb3 += iZzd;
                    }
                    z = false;
                    break;
                case 5:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i15 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.drive.zzjr.zzg(i16, 0L);
                        iZzb3 += iZzd;
                    }
                    z = false;
                    break;
                case 6:
                    i3 = 1;
                    if ((i15 & i2) != 0) {
                        i4 = 0;
                        iZzb3 += com.google.android.gms.internal.drive.zzjr.zzj(i16, 0);
                    } else {
                        i4 = 0;
                    }
                    z = false;
                    j = 0;
                    break;
                case 7:
                    if ((i15 & i2) != 0) {
                        i3 = 1;
                        iZzb3 += com.google.android.gms.internal.drive.zzjr.zzc(i16, true);
                    } else {
                        i3 = 1;
                    }
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 8:
                    if ((i15 & i2) != 0) {
                        java.lang.Object object = unsafe2.getObject(t, j3);
                        if (object instanceof com.google.android.gms.internal.drive.zzjc) {
                            iZzb = com.google.android.gms.internal.drive.zzjr.zzc(i16, (com.google.android.gms.internal.drive.zzjc) object);
                        } else {
                            iZzb = com.google.android.gms.internal.drive.zzjr.zzb(i16, (java.lang.String) object);
                        }
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 9:
                    if ((i15 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.drive.zzmh.zzc(i16, unsafe2.getObject(t, j3), zzap(i14));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 10:
                    if ((i15 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzc(i16, (com.google.android.gms.internal.drive.zzjc) unsafe2.getObject(t, j3));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 11:
                    if ((i15 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzh(i16, unsafe2.getInt(t, j3));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 12:
                    if ((i15 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzl(i16, unsafe2.getInt(t, j3));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 13:
                    if ((i15 & i2) != 0) {
                        iZzk = com.google.android.gms.internal.drive.zzjr.zzk(i16, 0);
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 14:
                    if ((i15 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzh(i16, 0L);
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 15:
                    if ((i15 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzi(i16, unsafe2.getInt(t, j3));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 16:
                    if ((i15 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzf(i16, unsafe2.getLong(t, j3));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 17:
                    if ((i15 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzc(i16, (com.google.android.gms.internal.drive.zzlq) unsafe2.getObject(t, j3), zzap(i14));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 18:
                    iZzb = com.google.android.gms.internal.drive.zzmh.zzw(i16, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzb;
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 19:
                    i4 = 0;
                    iZzv = com.google.android.gms.internal.drive.zzmh.zzv(i16, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 20:
                    i4 = 0;
                    iZzv = com.google.android.gms.internal.drive.zzmh.zzo(i16, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 21:
                    i4 = 0;
                    iZzv = com.google.android.gms.internal.drive.zzmh.zzp(i16, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 22:
                    i4 = 0;
                    iZzv = com.google.android.gms.internal.drive.zzmh.zzs(i16, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 23:
                    i4 = 0;
                    iZzv = com.google.android.gms.internal.drive.zzmh.zzw(i16, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 24:
                    i4 = 0;
                    iZzv = com.google.android.gms.internal.drive.zzmh.zzv(i16, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 25:
                    i4 = 0;
                    iZzv = com.google.android.gms.internal.drive.zzmh.zzx(i16, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 26:
                    iZzb = com.google.android.gms.internal.drive.zzmh.zzc(i16, (java.util.List) unsafe2.getObject(t, j3));
                    iZzb3 += iZzb;
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 27:
                    iZzb = com.google.android.gms.internal.drive.zzmh.zzc(i16, (java.util.List<?>) unsafe2.getObject(t, j3), zzap(i14));
                    iZzb3 += iZzb;
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 28:
                    iZzb = com.google.android.gms.internal.drive.zzmh.zzd(i16, (java.util.List<com.google.android.gms.internal.drive.zzjc>) unsafe2.getObject(t, j3));
                    iZzb3 += iZzb;
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 29:
                    iZzb = com.google.android.gms.internal.drive.zzmh.zzt(i16, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzb;
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 30:
                    i4 = 0;
                    iZzv = com.google.android.gms.internal.drive.zzmh.zzr(i16, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 31:
                    i4 = 0;
                    iZzv = com.google.android.gms.internal.drive.zzmh.zzv(i16, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 32:
                    i4 = 0;
                    iZzv = com.google.android.gms.internal.drive.zzmh.zzw(i16, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 33:
                    i4 = 0;
                    iZzv = com.google.android.gms.internal.drive.zzmh.zzu(i16, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 34:
                    i4 = 0;
                    iZzv = com.google.android.gms.internal.drive.zzmh.zzq(i16, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 35:
                    iZzi = com.google.android.gms.internal.drive.zzmh.zzi((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = com.google.android.gms.internal.drive.zzjr.zzab(i16);
                        iZzad = com.google.android.gms.internal.drive.zzjr.zzad(iZzi);
                        iZzk = iZzab + iZzad + iZzi;
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 36:
                    iZzi = com.google.android.gms.internal.drive.zzmh.zzh((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = com.google.android.gms.internal.drive.zzjr.zzab(i16);
                        iZzad = com.google.android.gms.internal.drive.zzjr.zzad(iZzi);
                        iZzk = iZzab + iZzad + iZzi;
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 37:
                    iZzi = com.google.android.gms.internal.drive.zzmh.zza((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = com.google.android.gms.internal.drive.zzjr.zzab(i16);
                        iZzad = com.google.android.gms.internal.drive.zzjr.zzad(iZzi);
                        iZzk = iZzab + iZzad + iZzi;
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 38:
                    iZzi = com.google.android.gms.internal.drive.zzmh.zzb((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = com.google.android.gms.internal.drive.zzjr.zzab(i16);
                        iZzad = com.google.android.gms.internal.drive.zzjr.zzad(iZzi);
                        iZzk = iZzab + iZzad + iZzi;
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 39:
                    iZzi = com.google.android.gms.internal.drive.zzmh.zze((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = com.google.android.gms.internal.drive.zzjr.zzab(i16);
                        iZzad = com.google.android.gms.internal.drive.zzjr.zzad(iZzi);
                        iZzk = iZzab + iZzad + iZzi;
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 40:
                    iZzi = com.google.android.gms.internal.drive.zzmh.zzi((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = com.google.android.gms.internal.drive.zzjr.zzab(i16);
                        iZzad = com.google.android.gms.internal.drive.zzjr.zzad(iZzi);
                        iZzk = iZzab + iZzad + iZzi;
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 41:
                    iZzi = com.google.android.gms.internal.drive.zzmh.zzh((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = com.google.android.gms.internal.drive.zzjr.zzab(i16);
                        iZzad = com.google.android.gms.internal.drive.zzjr.zzad(iZzi);
                        iZzk = iZzab + iZzad + iZzi;
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 42:
                    iZzi = com.google.android.gms.internal.drive.zzmh.zzj((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = com.google.android.gms.internal.drive.zzjr.zzab(i16);
                        iZzad = com.google.android.gms.internal.drive.zzjr.zzad(iZzi);
                        iZzk = iZzab + iZzad + iZzi;
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 43:
                    iZzi = com.google.android.gms.internal.drive.zzmh.zzf((java.util.List<java.lang.Integer>) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = com.google.android.gms.internal.drive.zzjr.zzab(i16);
                        iZzad = com.google.android.gms.internal.drive.zzjr.zzad(iZzi);
                        iZzk = iZzab + iZzad + iZzi;
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 44:
                    iZzi = com.google.android.gms.internal.drive.zzmh.zzd((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = com.google.android.gms.internal.drive.zzjr.zzab(i16);
                        iZzad = com.google.android.gms.internal.drive.zzjr.zzad(iZzi);
                        iZzk = iZzab + iZzad + iZzi;
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 45:
                    iZzi = com.google.android.gms.internal.drive.zzmh.zzh((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = com.google.android.gms.internal.drive.zzjr.zzab(i16);
                        iZzad = com.google.android.gms.internal.drive.zzjr.zzad(iZzi);
                        iZzk = iZzab + iZzad + iZzi;
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 46:
                    iZzi = com.google.android.gms.internal.drive.zzmh.zzi((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = com.google.android.gms.internal.drive.zzjr.zzab(i16);
                        iZzad = com.google.android.gms.internal.drive.zzjr.zzad(iZzi);
                        iZzk = iZzab + iZzad + iZzi;
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 47:
                    iZzi = com.google.android.gms.internal.drive.zzmh.zzg((java.util.List<java.lang.Integer>) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = com.google.android.gms.internal.drive.zzjr.zzab(i16);
                        iZzad = com.google.android.gms.internal.drive.zzjr.zzad(iZzi);
                        iZzk = iZzab + iZzad + iZzi;
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 48:
                    iZzi = com.google.android.gms.internal.drive.zzmh.zzc((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZzab = com.google.android.gms.internal.drive.zzjr.zzab(i16);
                        iZzad = com.google.android.gms.internal.drive.zzjr.zzad(iZzi);
                        iZzk = iZzab + iZzad + iZzi;
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 49:
                    iZzb = com.google.android.gms.internal.drive.zzmh.zzd(i16, (java.util.List) unsafe2.getObject(t, j3), zzap(i14));
                    iZzb3 += iZzb;
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 50:
                    iZzb = this.zzut.zzb(i16, unsafe2.getObject(t, j3), zzaq(i14));
                    iZzb3 += iZzb;
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 51:
                    if (zza(t, i16, i14)) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzb(i16, 0.0d);
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 52:
                    if (zza(t, i16, i14)) {
                        iZzk = com.google.android.gms.internal.drive.zzjr.zzb(i16, 0.0f);
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 53:
                    if (zza(t, i16, i14)) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzd(i16, zzh(t, j3));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 54:
                    if (zza(t, i16, i14)) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zze(i16, zzh(t, j3));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 55:
                    if (zza(t, i16, i14)) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzg(i16, zzg(t, j3));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 56:
                    if (zza(t, i16, i14)) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzg(i16, 0L);
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 57:
                    if (zza(t, i16, i14)) {
                        iZzk = com.google.android.gms.internal.drive.zzjr.zzj(i16, 0);
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 58:
                    if (zza(t, i16, i14)) {
                        iZzk = com.google.android.gms.internal.drive.zzjr.zzc(i16, true);
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 59:
                    if (zza(t, i16, i14)) {
                        java.lang.Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof com.google.android.gms.internal.drive.zzjc) {
                            iZzb = com.google.android.gms.internal.drive.zzjr.zzc(i16, (com.google.android.gms.internal.drive.zzjc) object2);
                        } else {
                            iZzb = com.google.android.gms.internal.drive.zzjr.zzb(i16, (java.lang.String) object2);
                        }
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 60:
                    if (zza(t, i16, i14)) {
                        iZzb = com.google.android.gms.internal.drive.zzmh.zzc(i16, unsafe2.getObject(t, j3), zzap(i14));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 61:
                    if (zza(t, i16, i14)) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzc(i16, (com.google.android.gms.internal.drive.zzjc) unsafe2.getObject(t, j3));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 62:
                    if (zza(t, i16, i14)) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzh(i16, zzg(t, j3));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 63:
                    if (zza(t, i16, i14)) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzl(i16, zzg(t, j3));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 64:
                    if (zza(t, i16, i14)) {
                        iZzk = com.google.android.gms.internal.drive.zzjr.zzk(i16, 0);
                        iZzb3 += iZzk;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 65:
                    if (zza(t, i16, i14)) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzh(i16, 0L);
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 66:
                    if (zza(t, i16, i14)) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzi(i16, zzg(t, j3));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 67:
                    if (zza(t, i16, i14)) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzf(i16, zzh(t, j3));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 68:
                    if (zza(t, i16, i14)) {
                        iZzb = com.google.android.gms.internal.drive.zzjr.zzc(i16, (com.google.android.gms.internal.drive.zzlq) unsafe2.getObject(t, j3), zzap(i14));
                        iZzb3 += iZzb;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                default:
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
            }
            i14 += 3;
            i7 = i4;
            i6 = i3;
        }
        int iZzb4 = i7;
        int iZza = iZzb3 + zza(this.zzur, t);
        if (!this.zzui) {
            return iZza;
        }
        com.google.android.gms.internal.drive.zzkb<T> zzkbVarZzb = this.zzus.zzb(t);
        for (int i20 = iZzb4; i20 < zzkbVarZzb.zzos.zzer(); i20++) {
            java.util.Map.Entry entryZzaw = zzkbVarZzb.zzos.zzaw(i20);
            iZzb4 += com.google.android.gms.internal.drive.zzkb.zzb((com.google.android.gms.internal.drive.zzkd<?>) entryZzaw.getKey(), entryZzaw.getValue());
        }
        for (java.util.Map.Entry entry : zzkbVarZzb.zzos.zzes()) {
            iZzb4 += com.google.android.gms.internal.drive.zzkb.zzb((com.google.android.gms.internal.drive.zzkd<?>) entry.getKey(), entry.getValue());
        }
        return iZza + iZzb4;
    }

    private static <UT, UB> int zza(com.google.android.gms.internal.drive.zzmx<UT, UB> zzmxVar, T t) {
        return zzmxVar.zzn(zzmxVar.zzr(t));
    }

    private static <E> java.util.List<E> zzd(java.lang.Object obj, long j) {
        return (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(obj, j);
    }

    /* JADX WARN: Code duplicated, block: B:178:0x054a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zza(T t, com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        java.util.Iterator it;
        java.util.Map.Entry<?, ?> entry;
        java.util.Iterator itDescendingIterator;
        java.util.Map.Entry<?, ?> entry2;
        if (zznsVar.zzcd() == com.google.android.gms.internal.drive.zzkk.zze.zzsj) {
            zza(this.zzur, t, zznsVar);
            if (this.zzui) {
                com.google.android.gms.internal.drive.zzkb<T> zzkbVarZzb = this.zzus.zzb(t);
                if (zzkbVarZzb.zzos.isEmpty()) {
                    itDescendingIterator = null;
                    entry2 = null;
                } else {
                    itDescendingIterator = zzkbVarZzb.descendingIterator();
                    entry2 = (java.util.Map.Entry) itDescendingIterator.next();
                }
            } else {
                itDescendingIterator = null;
                entry2 = null;
            }
            for (int length = this.zzud.length - 3; length >= 0; length -= 3) {
                int iZzas = zzas(length);
                int i = this.zzud[length];
                while (entry2 != null && this.zzus.zza(entry2) > i) {
                    this.zzus.zza(zznsVar, entry2);
                    entry2 = itDescendingIterator.hasNext() ? (java.util.Map.Entry) itDescendingIterator.next() : null;
                }
                switch ((iZzas & 267386880) >>> 20) {
                    case 0:
                        if (zza(t, length)) {
                            zznsVar.zza(i, com.google.android.gms.internal.drive.zznd.zzn(t, iZzas & 1048575));
                        }
                        break;
                    case 1:
                        if (zza(t, length)) {
                            zznsVar.zza(i, com.google.android.gms.internal.drive.zznd.zzm(t, iZzas & 1048575));
                        }
                        break;
                    case 2:
                        if (zza(t, length)) {
                            zznsVar.zzi(i, com.google.android.gms.internal.drive.zznd.zzk(t, iZzas & 1048575));
                        }
                        break;
                    case 3:
                        if (zza(t, length)) {
                            zznsVar.zza(i, com.google.android.gms.internal.drive.zznd.zzk(t, iZzas & 1048575));
                        }
                        break;
                    case 4:
                        if (zza(t, length)) {
                            zznsVar.zzc(i, com.google.android.gms.internal.drive.zznd.zzj(t, iZzas & 1048575));
                        }
                        break;
                    case 5:
                        if (zza(t, length)) {
                            zznsVar.zzc(i, com.google.android.gms.internal.drive.zznd.zzk(t, iZzas & 1048575));
                        }
                        break;
                    case 6:
                        if (zza(t, length)) {
                            zznsVar.zzf(i, com.google.android.gms.internal.drive.zznd.zzj(t, iZzas & 1048575));
                        }
                        break;
                    case 7:
                        if (zza(t, length)) {
                            zznsVar.zzb(i, com.google.android.gms.internal.drive.zznd.zzl(t, iZzas & 1048575));
                        }
                        break;
                    case 8:
                        if (zza(t, length)) {
                            zza(i, com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar);
                        }
                        break;
                    case 9:
                        if (zza(t, length)) {
                            zznsVar.zza(i, com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zzap(length));
                        }
                        break;
                    case 10:
                        if (zza(t, length)) {
                            zznsVar.zza(i, (com.google.android.gms.internal.drive.zzjc) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575));
                        }
                        break;
                    case 11:
                        if (zza(t, length)) {
                            zznsVar.zzd(i, com.google.android.gms.internal.drive.zznd.zzj(t, iZzas & 1048575));
                        }
                        break;
                    case 12:
                        if (zza(t, length)) {
                            zznsVar.zzn(i, com.google.android.gms.internal.drive.zznd.zzj(t, iZzas & 1048575));
                        }
                        break;
                    case 13:
                        if (zza(t, length)) {
                            zznsVar.zzm(i, com.google.android.gms.internal.drive.zznd.zzj(t, iZzas & 1048575));
                        }
                        break;
                    case 14:
                        if (zza(t, length)) {
                            zznsVar.zzj(i, com.google.android.gms.internal.drive.zznd.zzk(t, iZzas & 1048575));
                        }
                        break;
                    case 15:
                        if (zza(t, length)) {
                            zznsVar.zze(i, com.google.android.gms.internal.drive.zznd.zzj(t, iZzas & 1048575));
                        }
                        break;
                    case 16:
                        if (zza(t, length)) {
                            zznsVar.zzb(i, com.google.android.gms.internal.drive.zznd.zzk(t, iZzas & 1048575));
                        }
                        break;
                    case 17:
                        if (zza(t, length)) {
                            zznsVar.zzb(i, com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zzap(length));
                        }
                        break;
                    case 18:
                        com.google.android.gms.internal.drive.zzmh.zza(this.zzud[length], (java.util.List<java.lang.Double>) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 19:
                        com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[length], (java.util.List<java.lang.Float>) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 20:
                        com.google.android.gms.internal.drive.zzmh.zzc(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 21:
                        com.google.android.gms.internal.drive.zzmh.zzd(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 22:
                        com.google.android.gms.internal.drive.zzmh.zzh(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 23:
                        com.google.android.gms.internal.drive.zzmh.zzf(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 24:
                        com.google.android.gms.internal.drive.zzmh.zzk(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 25:
                        com.google.android.gms.internal.drive.zzmh.zzn(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 26:
                        com.google.android.gms.internal.drive.zzmh.zza(this.zzud[length], (java.util.List<java.lang.String>) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar);
                        break;
                    case 27:
                        com.google.android.gms.internal.drive.zzmh.zza(this.zzud[length], (java.util.List<?>) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, zzap(length));
                        break;
                    case 28:
                        com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar);
                        break;
                    case 29:
                        com.google.android.gms.internal.drive.zzmh.zzi(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 30:
                        com.google.android.gms.internal.drive.zzmh.zzm(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 31:
                        com.google.android.gms.internal.drive.zzmh.zzl(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 32:
                        com.google.android.gms.internal.drive.zzmh.zzg(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 33:
                        com.google.android.gms.internal.drive.zzmh.zzj(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 34:
                        com.google.android.gms.internal.drive.zzmh.zze(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                        break;
                    case 35:
                        com.google.android.gms.internal.drive.zzmh.zza(this.zzud[length], (java.util.List<java.lang.Double>) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 36:
                        com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[length], (java.util.List<java.lang.Float>) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 37:
                        com.google.android.gms.internal.drive.zzmh.zzc(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 38:
                        com.google.android.gms.internal.drive.zzmh.zzd(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 39:
                        com.google.android.gms.internal.drive.zzmh.zzh(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 40:
                        com.google.android.gms.internal.drive.zzmh.zzf(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 41:
                        com.google.android.gms.internal.drive.zzmh.zzk(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 42:
                        com.google.android.gms.internal.drive.zzmh.zzn(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 43:
                        com.google.android.gms.internal.drive.zzmh.zzi(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 44:
                        com.google.android.gms.internal.drive.zzmh.zzm(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 45:
                        com.google.android.gms.internal.drive.zzmh.zzl(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 46:
                        com.google.android.gms.internal.drive.zzmh.zzg(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 47:
                        com.google.android.gms.internal.drive.zzmh.zzj(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 48:
                        com.google.android.gms.internal.drive.zzmh.zze(this.zzud[length], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                        break;
                    case 49:
                        com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[length], (java.util.List<?>) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar, zzap(length));
                        break;
                    case 50:
                        zza(zznsVar, i, com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), length);
                        break;
                    case 51:
                        if (zza(t, i, length)) {
                            zznsVar.zza(i, zze(t, iZzas & 1048575));
                        }
                        break;
                    case 52:
                        if (zza(t, i, length)) {
                            zznsVar.zza(i, zzf(t, iZzas & 1048575));
                        }
                        break;
                    case 53:
                        if (zza(t, i, length)) {
                            zznsVar.zzi(i, zzh(t, iZzas & 1048575));
                        }
                        break;
                    case 54:
                        if (zza(t, i, length)) {
                            zznsVar.zza(i, zzh(t, iZzas & 1048575));
                        }
                        break;
                    case 55:
                        if (zza(t, i, length)) {
                            zznsVar.zzc(i, zzg(t, iZzas & 1048575));
                        }
                        break;
                    case 56:
                        if (zza(t, i, length)) {
                            zznsVar.zzc(i, zzh(t, iZzas & 1048575));
                        }
                        break;
                    case 57:
                        if (zza(t, i, length)) {
                            zznsVar.zzf(i, zzg(t, iZzas & 1048575));
                        }
                        break;
                    case 58:
                        if (zza(t, i, length)) {
                            zznsVar.zzb(i, zzi(t, iZzas & 1048575));
                        }
                        break;
                    case 59:
                        if (zza(t, i, length)) {
                            zza(i, com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zznsVar);
                        }
                        break;
                    case 60:
                        if (zza(t, i, length)) {
                            zznsVar.zza(i, com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zzap(length));
                        }
                        break;
                    case 61:
                        if (zza(t, i, length)) {
                            zznsVar.zza(i, (com.google.android.gms.internal.drive.zzjc) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575));
                        }
                        break;
                    case 62:
                        if (zza(t, i, length)) {
                            zznsVar.zzd(i, zzg(t, iZzas & 1048575));
                        }
                        break;
                    case 63:
                        if (zza(t, i, length)) {
                            zznsVar.zzn(i, zzg(t, iZzas & 1048575));
                        }
                        break;
                    case 64:
                        if (zza(t, i, length)) {
                            zznsVar.zzm(i, zzg(t, iZzas & 1048575));
                        }
                        break;
                    case 65:
                        if (zza(t, i, length)) {
                            zznsVar.zzj(i, zzh(t, iZzas & 1048575));
                        }
                        break;
                    case 66:
                        if (zza(t, i, length)) {
                            zznsVar.zze(i, zzg(t, iZzas & 1048575));
                        }
                        break;
                    case 67:
                        if (zza(t, i, length)) {
                            zznsVar.zzb(i, zzh(t, iZzas & 1048575));
                        }
                        break;
                    case 68:
                        if (zza(t, i, length)) {
                            zznsVar.zzb(i, com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575), zzap(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                this.zzus.zza(zznsVar, entry2);
                entry2 = itDescendingIterator.hasNext() ? (java.util.Map.Entry) itDescendingIterator.next() : null;
            }
            return;
        }
        if (this.zzuk) {
            if (this.zzui) {
                com.google.android.gms.internal.drive.zzkb<T> zzkbVarZzb2 = this.zzus.zzb(t);
                if (zzkbVarZzb2.zzos.isEmpty()) {
                    it = null;
                    entry = null;
                } else {
                    it = zzkbVarZzb2.iterator();
                    entry = (java.util.Map.Entry) it.next();
                }
            } else {
                it = null;
                entry = null;
            }
            int length2 = this.zzud.length;
            for (int i2 = 0; i2 < length2; i2 += 3) {
                int iZzas2 = zzas(i2);
                int i3 = this.zzud[i2];
                while (entry != null && this.zzus.zza(entry) <= i3) {
                    this.zzus.zza(zznsVar, entry);
                    entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                }
                switch ((iZzas2 & 267386880) >>> 20) {
                    case 0:
                        if (zza(t, i2)) {
                            zznsVar.zza(i3, com.google.android.gms.internal.drive.zznd.zzn(t, iZzas2 & 1048575));
                        }
                        break;
                    case 1:
                        if (zza(t, i2)) {
                            zznsVar.zza(i3, com.google.android.gms.internal.drive.zznd.zzm(t, iZzas2 & 1048575));
                        }
                        break;
                    case 2:
                        if (zza(t, i2)) {
                            zznsVar.zzi(i3, com.google.android.gms.internal.drive.zznd.zzk(t, iZzas2 & 1048575));
                        }
                        break;
                    case 3:
                        if (zza(t, i2)) {
                            zznsVar.zza(i3, com.google.android.gms.internal.drive.zznd.zzk(t, iZzas2 & 1048575));
                        }
                        break;
                    case 4:
                        if (zza(t, i2)) {
                            zznsVar.zzc(i3, com.google.android.gms.internal.drive.zznd.zzj(t, iZzas2 & 1048575));
                        }
                        break;
                    case 5:
                        if (zza(t, i2)) {
                            zznsVar.zzc(i3, com.google.android.gms.internal.drive.zznd.zzk(t, iZzas2 & 1048575));
                        }
                        break;
                    case 6:
                        if (zza(t, i2)) {
                            zznsVar.zzf(i3, com.google.android.gms.internal.drive.zznd.zzj(t, iZzas2 & 1048575));
                        }
                        break;
                    case 7:
                        if (zza(t, i2)) {
                            zznsVar.zzb(i3, com.google.android.gms.internal.drive.zznd.zzl(t, iZzas2 & 1048575));
                        }
                        break;
                    case 8:
                        if (zza(t, i2)) {
                            zza(i3, com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar);
                        }
                        break;
                    case 9:
                        if (zza(t, i2)) {
                            zznsVar.zza(i3, com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zzap(i2));
                        }
                        break;
                    case 10:
                        if (zza(t, i2)) {
                            zznsVar.zza(i3, (com.google.android.gms.internal.drive.zzjc) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575));
                        }
                        break;
                    case 11:
                        if (zza(t, i2)) {
                            zznsVar.zzd(i3, com.google.android.gms.internal.drive.zznd.zzj(t, iZzas2 & 1048575));
                        }
                        break;
                    case 12:
                        if (zza(t, i2)) {
                            zznsVar.zzn(i3, com.google.android.gms.internal.drive.zznd.zzj(t, iZzas2 & 1048575));
                        }
                        break;
                    case 13:
                        if (zza(t, i2)) {
                            zznsVar.zzm(i3, com.google.android.gms.internal.drive.zznd.zzj(t, iZzas2 & 1048575));
                        }
                        break;
                    case 14:
                        if (zza(t, i2)) {
                            zznsVar.zzj(i3, com.google.android.gms.internal.drive.zznd.zzk(t, iZzas2 & 1048575));
                        }
                        break;
                    case 15:
                        if (zza(t, i2)) {
                            zznsVar.zze(i3, com.google.android.gms.internal.drive.zznd.zzj(t, iZzas2 & 1048575));
                        }
                        break;
                    case 16:
                        if (zza(t, i2)) {
                            zznsVar.zzb(i3, com.google.android.gms.internal.drive.zznd.zzk(t, iZzas2 & 1048575));
                        }
                        break;
                    case 17:
                        if (zza(t, i2)) {
                            zznsVar.zzb(i3, com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zzap(i2));
                        }
                        break;
                    case 18:
                        com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i2], (java.util.List<java.lang.Double>) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 19:
                        com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i2], (java.util.List<java.lang.Float>) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 20:
                        com.google.android.gms.internal.drive.zzmh.zzc(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 21:
                        com.google.android.gms.internal.drive.zzmh.zzd(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 22:
                        com.google.android.gms.internal.drive.zzmh.zzh(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 23:
                        com.google.android.gms.internal.drive.zzmh.zzf(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 24:
                        com.google.android.gms.internal.drive.zzmh.zzk(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 25:
                        com.google.android.gms.internal.drive.zzmh.zzn(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 26:
                        com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i2], (java.util.List<java.lang.String>) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar);
                        break;
                    case 27:
                        com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i2], (java.util.List<?>) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, zzap(i2));
                        break;
                    case 28:
                        com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar);
                        break;
                    case 29:
                        com.google.android.gms.internal.drive.zzmh.zzi(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 30:
                        com.google.android.gms.internal.drive.zzmh.zzm(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 31:
                        com.google.android.gms.internal.drive.zzmh.zzl(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 32:
                        com.google.android.gms.internal.drive.zzmh.zzg(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 33:
                        com.google.android.gms.internal.drive.zzmh.zzj(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 34:
                        com.google.android.gms.internal.drive.zzmh.zze(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                        break;
                    case 35:
                        com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i2], (java.util.List<java.lang.Double>) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 36:
                        com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i2], (java.util.List<java.lang.Float>) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 37:
                        com.google.android.gms.internal.drive.zzmh.zzc(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 38:
                        com.google.android.gms.internal.drive.zzmh.zzd(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 39:
                        com.google.android.gms.internal.drive.zzmh.zzh(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 40:
                        com.google.android.gms.internal.drive.zzmh.zzf(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 41:
                        com.google.android.gms.internal.drive.zzmh.zzk(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 42:
                        com.google.android.gms.internal.drive.zzmh.zzn(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 43:
                        com.google.android.gms.internal.drive.zzmh.zzi(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 44:
                        com.google.android.gms.internal.drive.zzmh.zzm(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 45:
                        com.google.android.gms.internal.drive.zzmh.zzl(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 46:
                        com.google.android.gms.internal.drive.zzmh.zzg(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 47:
                        com.google.android.gms.internal.drive.zzmh.zzj(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 48:
                        com.google.android.gms.internal.drive.zzmh.zze(this.zzud[i2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                        break;
                    case 49:
                        com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i2], (java.util.List<?>) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar, zzap(i2));
                        break;
                    case 50:
                        zza(zznsVar, i3, com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), i2);
                        break;
                    case 51:
                        if (zza(t, i3, i2)) {
                            zznsVar.zza(i3, zze(t, iZzas2 & 1048575));
                        }
                        break;
                    case 52:
                        if (zza(t, i3, i2)) {
                            zznsVar.zza(i3, zzf(t, iZzas2 & 1048575));
                        }
                        break;
                    case 53:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzi(i3, zzh(t, iZzas2 & 1048575));
                        }
                        break;
                    case 54:
                        if (zza(t, i3, i2)) {
                            zznsVar.zza(i3, zzh(t, iZzas2 & 1048575));
                        }
                        break;
                    case 55:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzc(i3, zzg(t, iZzas2 & 1048575));
                        }
                        break;
                    case 56:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzc(i3, zzh(t, iZzas2 & 1048575));
                        }
                        break;
                    case 57:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzf(i3, zzg(t, iZzas2 & 1048575));
                        }
                        break;
                    case 58:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzb(i3, zzi(t, iZzas2 & 1048575));
                        }
                        break;
                    case 59:
                        if (zza(t, i3, i2)) {
                            zza(i3, com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zznsVar);
                        }
                        break;
                    case 60:
                        if (zza(t, i3, i2)) {
                            zznsVar.zza(i3, com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zzap(i2));
                        }
                        break;
                    case 61:
                        if (zza(t, i3, i2)) {
                            zznsVar.zza(i3, (com.google.android.gms.internal.drive.zzjc) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575));
                        }
                        break;
                    case 62:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzd(i3, zzg(t, iZzas2 & 1048575));
                        }
                        break;
                    case 63:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzn(i3, zzg(t, iZzas2 & 1048575));
                        }
                        break;
                    case 64:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzm(i3, zzg(t, iZzas2 & 1048575));
                        }
                        break;
                    case 65:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzj(i3, zzh(t, iZzas2 & 1048575));
                        }
                        break;
                    case 66:
                        if (zza(t, i3, i2)) {
                            zznsVar.zze(i3, zzg(t, iZzas2 & 1048575));
                        }
                        break;
                    case 67:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzb(i3, zzh(t, iZzas2 & 1048575));
                        }
                        break;
                    case 68:
                        if (zza(t, i3, i2)) {
                            zznsVar.zzb(i3, com.google.android.gms.internal.drive.zznd.zzo(t, iZzas2 & 1048575), zzap(i2));
                        }
                        break;
                }
            }
            while (entry != null) {
                this.zzus.zza(zznsVar, entry);
                entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
            }
            zza(this.zzur, t, zznsVar);
            return;
        }
        zzb(t, zznsVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    private final void zzb(T t, com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        java.util.Iterator it;
        java.util.Map.Entry<?, ?> entry;
        int i;
        boolean z;
        if (this.zzui) {
            com.google.android.gms.internal.drive.zzkb<T> zzkbVarZzb = this.zzus.zzb(t);
            if (zzkbVarZzb.zzos.isEmpty()) {
                it = null;
                entry = null;
            } else {
                it = zzkbVarZzb.iterator();
                entry = (java.util.Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int length = this.zzud.length;
        sun.misc.Unsafe unsafe = zzuc;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iZzas = zzas(i4);
            int[] iArr = this.zzud;
            int i5 = iArr[i4];
            int i6 = (267386880 & iZzas) >>> 20;
            if (this.zzuk || i6 > 17) {
                i = 0;
            } else {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & 1048575;
                if (i8 != i2) {
                    i3 = unsafe.getInt(t, i8);
                    i2 = i8;
                }
                i = 1 << (i7 >>> 20);
            }
            while (entry != null && this.zzus.zza(entry) <= i5) {
                this.zzus.zza(zznsVar, entry);
                entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
            }
            long j = iZzas & 1048575;
            switch (i6) {
                case 0:
                    if ((i & i3) != 0) {
                        zznsVar.zza(i5, com.google.android.gms.internal.drive.zznd.zzn(t, j));
                    }
                    break;
                case 1:
                    if ((i & i3) != 0) {
                        zznsVar.zza(i5, com.google.android.gms.internal.drive.zznd.zzm(t, j));
                    }
                    break;
                case 2:
                    if ((i & i3) != 0) {
                        zznsVar.zzi(i5, unsafe.getLong(t, j));
                    }
                    break;
                case 3:
                    if ((i & i3) != 0) {
                        zznsVar.zza(i5, unsafe.getLong(t, j));
                    }
                    break;
                case 4:
                    if ((i & i3) != 0) {
                        zznsVar.zzc(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 5:
                    if ((i & i3) != 0) {
                        zznsVar.zzc(i5, unsafe.getLong(t, j));
                    }
                    break;
                case 6:
                    if ((i & i3) != 0) {
                        zznsVar.zzf(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 7:
                    if ((i & i3) != 0) {
                        zznsVar.zzb(i5, com.google.android.gms.internal.drive.zznd.zzl(t, j));
                    }
                    break;
                case 8:
                    if ((i & i3) != 0) {
                        zza(i5, unsafe.getObject(t, j), zznsVar);
                    }
                    break;
                case 9:
                    if ((i & i3) != 0) {
                        zznsVar.zza(i5, unsafe.getObject(t, j), zzap(i4));
                    }
                    break;
                case 10:
                    if ((i & i3) != 0) {
                        zznsVar.zza(i5, (com.google.android.gms.internal.drive.zzjc) unsafe.getObject(t, j));
                    }
                    break;
                case 11:
                    if ((i & i3) != 0) {
                        zznsVar.zzd(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 12:
                    if ((i & i3) != 0) {
                        zznsVar.zzn(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 13:
                    if ((i & i3) != 0) {
                        zznsVar.zzm(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 14:
                    if ((i & i3) != 0) {
                        zznsVar.zzj(i5, unsafe.getLong(t, j));
                    }
                    break;
                case 15:
                    if ((i & i3) != 0) {
                        zznsVar.zze(i5, unsafe.getInt(t, j));
                    }
                    break;
                case 16:
                    if ((i & i3) != 0) {
                        zznsVar.zzb(i5, unsafe.getLong(t, j));
                    }
                    break;
                case 17:
                    if ((i & i3) != 0) {
                        zznsVar.zzb(i5, unsafe.getObject(t, j), zzap(i4));
                    }
                    break;
                case 18:
                    com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i4], (java.util.List<java.lang.Double>) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 19:
                    com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i4], (java.util.List<java.lang.Float>) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 20:
                    com.google.android.gms.internal.drive.zzmh.zzc(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 21:
                    com.google.android.gms.internal.drive.zzmh.zzd(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 22:
                    com.google.android.gms.internal.drive.zzmh.zzh(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 23:
                    com.google.android.gms.internal.drive.zzmh.zzf(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 24:
                    com.google.android.gms.internal.drive.zzmh.zzk(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 25:
                    com.google.android.gms.internal.drive.zzmh.zzn(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 26:
                    com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i4], (java.util.List<java.lang.String>) unsafe.getObject(t, j), zznsVar);
                    break;
                case 27:
                    com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i4], (java.util.List<?>) unsafe.getObject(t, j), zznsVar, zzap(i4));
                    break;
                case 28:
                    com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar);
                    break;
                case 29:
                    z = false;
                    com.google.android.gms.internal.drive.zzmh.zzi(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 30:
                    z = false;
                    com.google.android.gms.internal.drive.zzmh.zzm(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 31:
                    z = false;
                    com.google.android.gms.internal.drive.zzmh.zzl(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 32:
                    z = false;
                    com.google.android.gms.internal.drive.zzmh.zzg(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 33:
                    z = false;
                    com.google.android.gms.internal.drive.zzmh.zzj(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 34:
                    z = false;
                    com.google.android.gms.internal.drive.zzmh.zze(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                    break;
                case 35:
                    com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i4], (java.util.List<java.lang.Double>) unsafe.getObject(t, j), zznsVar, true);
                    break;
                case 36:
                    com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i4], (java.util.List<java.lang.Float>) unsafe.getObject(t, j), zznsVar, true);
                    break;
                case 37:
                    com.google.android.gms.internal.drive.zzmh.zzc(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                    break;
                case 38:
                    com.google.android.gms.internal.drive.zzmh.zzd(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                    break;
                case 39:
                    com.google.android.gms.internal.drive.zzmh.zzh(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                    break;
                case 40:
                    com.google.android.gms.internal.drive.zzmh.zzf(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                    break;
                case 41:
                    com.google.android.gms.internal.drive.zzmh.zzk(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                    break;
                case 42:
                    com.google.android.gms.internal.drive.zzmh.zzn(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                    break;
                case 43:
                    com.google.android.gms.internal.drive.zzmh.zzi(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                    break;
                case 44:
                    com.google.android.gms.internal.drive.zzmh.zzm(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                    break;
                case 45:
                    com.google.android.gms.internal.drive.zzmh.zzl(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                    break;
                case 46:
                    com.google.android.gms.internal.drive.zzmh.zzg(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                    break;
                case 47:
                    com.google.android.gms.internal.drive.zzmh.zzj(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                    break;
                case 48:
                    com.google.android.gms.internal.drive.zzmh.zze(this.zzud[i4], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                    break;
                case 49:
                    com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i4], (java.util.List<?>) unsafe.getObject(t, j), zznsVar, zzap(i4));
                    break;
                case 50:
                    zza(zznsVar, i5, unsafe.getObject(t, j), i4);
                    break;
                case 51:
                    if (zza(t, i5, i4)) {
                        zznsVar.zza(i5, zze(t, j));
                    }
                    break;
                case 52:
                    if (zza(t, i5, i4)) {
                        zznsVar.zza(i5, zzf(t, j));
                    }
                    break;
                case 53:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzi(i5, zzh(t, j));
                    }
                    break;
                case 54:
                    if (zza(t, i5, i4)) {
                        zznsVar.zza(i5, zzh(t, j));
                    }
                    break;
                case 55:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzc(i5, zzg(t, j));
                    }
                    break;
                case 56:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzc(i5, zzh(t, j));
                    }
                    break;
                case 57:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzf(i5, zzg(t, j));
                    }
                    break;
                case 58:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzb(i5, zzi(t, j));
                    }
                    break;
                case 59:
                    if (zza(t, i5, i4)) {
                        zza(i5, unsafe.getObject(t, j), zznsVar);
                    }
                    break;
                case 60:
                    if (zza(t, i5, i4)) {
                        zznsVar.zza(i5, unsafe.getObject(t, j), zzap(i4));
                    }
                    break;
                case 61:
                    if (zza(t, i5, i4)) {
                        zznsVar.zza(i5, (com.google.android.gms.internal.drive.zzjc) unsafe.getObject(t, j));
                    }
                    break;
                case 62:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzd(i5, zzg(t, j));
                    }
                    break;
                case 63:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzn(i5, zzg(t, j));
                    }
                    break;
                case 64:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzm(i5, zzg(t, j));
                    }
                    break;
                case 65:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzj(i5, zzh(t, j));
                    }
                    break;
                case 66:
                    if (zza(t, i5, i4)) {
                        zznsVar.zze(i5, zzg(t, j));
                    }
                    break;
                case 67:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzb(i5, zzh(t, j));
                    }
                    break;
                case 68:
                    if (zza(t, i5, i4)) {
                        zznsVar.zzb(i5, unsafe.getObject(t, j), zzap(i4));
                    }
                    break;
                default:
                    break;
            }
        }
        while (entry != null) {
            this.zzus.zza(zznsVar, entry);
            entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
        }
        zza(this.zzur, t, zznsVar);
    }

    private final <K, V> void zza(com.google.android.gms.internal.drive.zzns zznsVar, int i, java.lang.Object obj, int i2) throws java.io.IOException {
        if (obj != null) {
            zznsVar.zza(i, this.zzut.zzm(zzaq(i2)), this.zzut.zzi(obj));
        }
    }

    private static <UT, UB> void zza(com.google.android.gms.internal.drive.zzmx<UT, UB> zzmxVar, T t, com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        zzmxVar.zza(zzmxVar.zzr(t), zznsVar);
    }

    private static com.google.android.gms.internal.drive.zzmy zzo(java.lang.Object obj) {
        com.google.android.gms.internal.drive.zzkk zzkkVar = (com.google.android.gms.internal.drive.zzkk) obj;
        com.google.android.gms.internal.drive.zzmy zzmyVar = zzkkVar.zzrq;
        if (zzmyVar != com.google.android.gms.internal.drive.zzmy.zzfa()) {
            return zzmyVar;
        }
        com.google.android.gms.internal.drive.zzmy zzmyVarZzfb = com.google.android.gms.internal.drive.zzmy.zzfb();
        zzkkVar.zzrq = zzmyVarZzfb;
        return zzmyVarZzfb;
    }

    private static int zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.drive.zznm zznmVar, java.lang.Class<?> cls, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        switch (com.google.android.gms.internal.drive.zzlv.zzox[zznmVar.ordinal()]) {
            case 1:
                int iZzb = com.google.android.gms.internal.drive.zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = java.lang.Boolean.valueOf(zzizVar.zznl != 0);
                return iZzb;
            case 2:
                return com.google.android.gms.internal.drive.zziy.zze(bArr, i, zzizVar);
            case 3:
                zzizVar.zznm = java.lang.Double.valueOf(com.google.android.gms.internal.drive.zziy.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzizVar.zznm = java.lang.Integer.valueOf(com.google.android.gms.internal.drive.zziy.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzizVar.zznm = java.lang.Long.valueOf(com.google.android.gms.internal.drive.zziy.zzb(bArr, i));
                return i + 8;
            case 8:
                zzizVar.zznm = java.lang.Float.valueOf(com.google.android.gms.internal.drive.zziy.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iZza = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
                zzizVar.zznm = java.lang.Integer.valueOf(zzizVar.zznk);
                return iZza;
            case 12:
            case 13:
                int iZzb2 = com.google.android.gms.internal.drive.zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = java.lang.Long.valueOf(zzizVar.zznl);
                return iZzb2;
            case 14:
                return com.google.android.gms.internal.drive.zziy.zza(com.google.android.gms.internal.drive.zzmd.zzej().zzf(cls), bArr, i, i2, zzizVar);
            case 15:
                int iZza2 = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
                zzizVar.zznm = java.lang.Integer.valueOf(com.google.android.gms.internal.drive.zzjo.zzw(zzizVar.zznk));
                return iZza2;
            case 16:
                int iZzb3 = com.google.android.gms.internal.drive.zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = java.lang.Long.valueOf(com.google.android.gms.internal.drive.zzjo.zzk(zzizVar.zznl));
                return iZzb3;
            case 17:
                return com.google.android.gms.internal.drive.zziy.zzd(bArr, i, zzizVar);
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        int iZza;
        int iZza2 = i;
        sun.misc.Unsafe unsafe = zzuc;
        com.google.android.gms.internal.drive.zzkp zzkpVarZzr = (com.google.android.gms.internal.drive.zzkp) unsafe.getObject(t, j2);
        if (!zzkpVarZzr.zzbo()) {
            int size = zzkpVarZzr.size();
            zzkpVarZzr = zzkpVarZzr.zzr(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j2, zzkpVarZzr);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzju zzjuVar = (com.google.android.gms.internal.drive.zzju) zzkpVarZzr;
                    int iZza3 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, zzizVar);
                    int i8 = zzizVar.zznk + iZza3;
                    while (iZza3 < i8) {
                        zzjuVar.zzc(com.google.android.gms.internal.drive.zziy.zzc(bArr, iZza3));
                        iZza3 += 8;
                    }
                    if (iZza3 == i8) {
                        return iZza3;
                    }
                    throw com.google.android.gms.internal.drive.zzkq.zzdi();
                }
                if (i5 == 1) {
                    com.google.android.gms.internal.drive.zzju zzjuVar2 = (com.google.android.gms.internal.drive.zzju) zzkpVarZzr;
                    zzjuVar2.zzc(com.google.android.gms.internal.drive.zziy.zzc(bArr, i));
                    while (true) {
                        int i9 = iZza2 + 8;
                        if (i9 >= i2) {
                            return i9;
                        }
                        iZza2 = com.google.android.gms.internal.drive.zziy.zza(bArr, i9, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i9;
                        }
                        zzjuVar2.zzc(com.google.android.gms.internal.drive.zziy.zzc(bArr, iZza2));
                    }
                }
                return iZza2;
            case 19:
            case 36:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzkh zzkhVar = (com.google.android.gms.internal.drive.zzkh) zzkpVarZzr;
                    int iZza4 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, zzizVar);
                    int i10 = zzizVar.zznk + iZza4;
                    while (iZza4 < i10) {
                        zzkhVar.zzc(com.google.android.gms.internal.drive.zziy.zzd(bArr, iZza4));
                        iZza4 += 4;
                    }
                    if (iZza4 == i10) {
                        return iZza4;
                    }
                    throw com.google.android.gms.internal.drive.zzkq.zzdi();
                }
                if (i5 == 5) {
                    com.google.android.gms.internal.drive.zzkh zzkhVar2 = (com.google.android.gms.internal.drive.zzkh) zzkpVarZzr;
                    zzkhVar2.zzc(com.google.android.gms.internal.drive.zziy.zzd(bArr, i));
                    while (true) {
                        int i11 = iZza2 + 4;
                        if (i11 >= i2) {
                            return i11;
                        }
                        iZza2 = com.google.android.gms.internal.drive.zziy.zza(bArr, i11, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i11;
                        }
                        zzkhVar2.zzc(com.google.android.gms.internal.drive.zziy.zzd(bArr, iZza2));
                    }
                }
                return iZza2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzle zzleVar = (com.google.android.gms.internal.drive.zzle) zzkpVarZzr;
                    int iZza5 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, zzizVar);
                    int i12 = zzizVar.zznk + iZza5;
                    while (iZza5 < i12) {
                        iZza5 = com.google.android.gms.internal.drive.zziy.zzb(bArr, iZza5, zzizVar);
                        zzleVar.zzv(zzizVar.zznl);
                    }
                    if (iZza5 == i12) {
                        return iZza5;
                    }
                    throw com.google.android.gms.internal.drive.zzkq.zzdi();
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.drive.zzle zzleVar2 = (com.google.android.gms.internal.drive.zzle) zzkpVarZzr;
                    int iZzb = com.google.android.gms.internal.drive.zziy.zzb(bArr, iZza2, zzizVar);
                    zzleVar2.zzv(zzizVar.zznl);
                    while (iZzb < i2) {
                        int iZza6 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZzb, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return iZzb;
                        }
                        iZzb = com.google.android.gms.internal.drive.zziy.zzb(bArr, iZza6, zzizVar);
                        zzleVar2.zzv(zzizVar.zznl);
                    }
                    return iZzb;
                }
                return iZza2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, (com.google.android.gms.internal.drive.zzkp<?>) zzkpVarZzr, zzizVar);
                }
                if (i5 == 0) {
                    return com.google.android.gms.internal.drive.zziy.zza(i3, bArr, i, i2, (com.google.android.gms.internal.drive.zzkp<?>) zzkpVarZzr, zzizVar);
                }
                return iZza2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzle zzleVar3 = (com.google.android.gms.internal.drive.zzle) zzkpVarZzr;
                    int iZza7 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, zzizVar);
                    int i13 = zzizVar.zznk + iZza7;
                    while (iZza7 < i13) {
                        zzleVar3.zzv(com.google.android.gms.internal.drive.zziy.zzb(bArr, iZza7));
                        iZza7 += 8;
                    }
                    if (iZza7 == i13) {
                        return iZza7;
                    }
                    throw com.google.android.gms.internal.drive.zzkq.zzdi();
                }
                if (i5 == 1) {
                    com.google.android.gms.internal.drive.zzle zzleVar4 = (com.google.android.gms.internal.drive.zzle) zzkpVarZzr;
                    zzleVar4.zzv(com.google.android.gms.internal.drive.zziy.zzb(bArr, i));
                    while (true) {
                        int i14 = iZza2 + 8;
                        if (i14 >= i2) {
                            return i14;
                        }
                        iZza2 = com.google.android.gms.internal.drive.zziy.zza(bArr, i14, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i14;
                        }
                        zzleVar4.zzv(com.google.android.gms.internal.drive.zziy.zzb(bArr, iZza2));
                    }
                }
                return iZza2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzkl zzklVar = (com.google.android.gms.internal.drive.zzkl) zzkpVarZzr;
                    int iZza8 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, zzizVar);
                    int i15 = zzizVar.zznk + iZza8;
                    while (iZza8 < i15) {
                        zzklVar.zzam(com.google.android.gms.internal.drive.zziy.zza(bArr, iZza8));
                        iZza8 += 4;
                    }
                    if (iZza8 == i15) {
                        return iZza8;
                    }
                    throw com.google.android.gms.internal.drive.zzkq.zzdi();
                }
                if (i5 == 5) {
                    com.google.android.gms.internal.drive.zzkl zzklVar2 = (com.google.android.gms.internal.drive.zzkl) zzkpVarZzr;
                    zzklVar2.zzam(com.google.android.gms.internal.drive.zziy.zza(bArr, i));
                    while (true) {
                        int i16 = iZza2 + 4;
                        if (i16 >= i2) {
                            return i16;
                        }
                        iZza2 = com.google.android.gms.internal.drive.zziy.zza(bArr, i16, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i16;
                        }
                        zzklVar2.zzam(com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2));
                    }
                }
                return iZza2;
            case 25:
            case 42:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzja zzjaVar = (com.google.android.gms.internal.drive.zzja) zzkpVarZzr;
                    iZza = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, zzizVar);
                    int i17 = zzizVar.zznk + iZza;
                    while (iZza < i17) {
                        iZza = com.google.android.gms.internal.drive.zziy.zzb(bArr, iZza, zzizVar);
                        zzjaVar.addBoolean(zzizVar.zznl != 0);
                    }
                    if (iZza != i17) {
                        throw com.google.android.gms.internal.drive.zzkq.zzdi();
                    }
                    return iZza;
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.drive.zzja zzjaVar2 = (com.google.android.gms.internal.drive.zzja) zzkpVarZzr;
                    iZza2 = com.google.android.gms.internal.drive.zziy.zzb(bArr, iZza2, zzizVar);
                    zzjaVar2.addBoolean(zzizVar.zznl != 0);
                    while (iZza2 < i2) {
                        int iZza9 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, zzizVar);
                        if (i3 == zzizVar.zznk) {
                            iZza2 = com.google.android.gms.internal.drive.zziy.zzb(bArr, iZza9, zzizVar);
                            zzjaVar2.addBoolean(zzizVar.zznl != 0);
                        }
                    }
                }
                return iZza2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZza10 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, zzizVar);
                        int i18 = zzizVar.zznk;
                        if (i18 < 0) {
                            throw com.google.android.gms.internal.drive.zzkq.zzdj();
                        }
                        if (i18 == 0) {
                            zzkpVarZzr.add("");
                        } else {
                            zzkpVarZzr.add(new java.lang.String(bArr, iZza10, i18, com.google.android.gms.internal.drive.zzkm.UTF_8));
                            iZza10 += i18;
                        }
                        while (iZza10 < i2) {
                            int iZza11 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza10, zzizVar);
                            if (i3 != zzizVar.zznk) {
                                return iZza10;
                            }
                            iZza10 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza11, zzizVar);
                            int i19 = zzizVar.zznk;
                            if (i19 < 0) {
                                throw com.google.android.gms.internal.drive.zzkq.zzdj();
                            }
                            if (i19 == 0) {
                                zzkpVarZzr.add("");
                            } else {
                                zzkpVarZzr.add(new java.lang.String(bArr, iZza10, i19, com.google.android.gms.internal.drive.zzkm.UTF_8));
                                iZza10 += i19;
                            }
                        }
                        return iZza10;
                    }
                    int iZza12 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, zzizVar);
                    int i20 = zzizVar.zznk;
                    if (i20 < 0) {
                        throw com.google.android.gms.internal.drive.zzkq.zzdj();
                    }
                    if (i20 == 0) {
                        zzkpVarZzr.add("");
                    } else {
                        int i21 = iZza12 + i20;
                        if (!com.google.android.gms.internal.drive.zznf.zze(bArr, iZza12, i21)) {
                            throw com.google.android.gms.internal.drive.zzkq.zzdn();
                        }
                        zzkpVarZzr.add(new java.lang.String(bArr, iZza12, i20, com.google.android.gms.internal.drive.zzkm.UTF_8));
                        iZza12 = i21;
                    }
                    while (iZza12 < i2) {
                        int iZza13 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza12, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return iZza12;
                        }
                        iZza12 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza13, zzizVar);
                        int i22 = zzizVar.zznk;
                        if (i22 < 0) {
                            throw com.google.android.gms.internal.drive.zzkq.zzdj();
                        }
                        if (i22 == 0) {
                            zzkpVarZzr.add("");
                        } else {
                            int i23 = iZza12 + i22;
                            if (!com.google.android.gms.internal.drive.zznf.zze(bArr, iZza12, i23)) {
                                throw com.google.android.gms.internal.drive.zzkq.zzdn();
                            }
                            zzkpVarZzr.add(new java.lang.String(bArr, iZza12, i22, com.google.android.gms.internal.drive.zzkm.UTF_8));
                            iZza12 = i23;
                        }
                    }
                    return iZza12;
                }
                return iZza2;
            case 27:
                if (i5 == 2) {
                    return com.google.android.gms.internal.drive.zziy.zza(zzap(i6), i3, bArr, i, i2, zzkpVarZzr, zzizVar);
                }
                return iZza2;
            case 28:
                if (i5 == 2) {
                    int iZza14 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, zzizVar);
                    int i24 = zzizVar.zznk;
                    if (i24 < 0) {
                        throw com.google.android.gms.internal.drive.zzkq.zzdj();
                    }
                    if (i24 > bArr.length - iZza14) {
                        throw com.google.android.gms.internal.drive.zzkq.zzdi();
                    }
                    if (i24 == 0) {
                        zzkpVarZzr.add(com.google.android.gms.internal.drive.zzjc.zznq);
                    } else {
                        zzkpVarZzr.add(com.google.android.gms.internal.drive.zzjc.zzb(bArr, iZza14, i24));
                        iZza14 += i24;
                    }
                    while (iZza14 < i2) {
                        int iZza15 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza14, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return iZza14;
                        }
                        iZza14 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza15, zzizVar);
                        int i25 = zzizVar.zznk;
                        if (i25 < 0) {
                            throw com.google.android.gms.internal.drive.zzkq.zzdj();
                        }
                        if (i25 > bArr.length - iZza14) {
                            throw com.google.android.gms.internal.drive.zzkq.zzdi();
                        }
                        if (i25 == 0) {
                            zzkpVarZzr.add(com.google.android.gms.internal.drive.zzjc.zznq);
                        } else {
                            zzkpVarZzr.add(com.google.android.gms.internal.drive.zzjc.zzb(bArr, iZza14, i25));
                            iZza14 += i25;
                        }
                    }
                    return iZza14;
                }
                return iZza2;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iZza = com.google.android.gms.internal.drive.zziy.zza(i3, bArr, i, i2, (com.google.android.gms.internal.drive.zzkp<?>) zzkpVarZzr, zzizVar);
                    }
                    return iZza2;
                }
                iZza = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, (com.google.android.gms.internal.drive.zzkp<?>) zzkpVarZzr, zzizVar);
                com.google.android.gms.internal.drive.zzkk zzkkVar = (com.google.android.gms.internal.drive.zzkk) t;
                com.google.android.gms.internal.drive.zzmy zzmyVar = zzkkVar.zzrq;
                if (zzmyVar == com.google.android.gms.internal.drive.zzmy.zzfa()) {
                    zzmyVar = null;
                }
                com.google.android.gms.internal.drive.zzmy zzmyVar2 = (com.google.android.gms.internal.drive.zzmy) com.google.android.gms.internal.drive.zzmh.zza(i4, zzkpVarZzr, zzar(i6), zzmyVar, this.zzur);
                if (zzmyVar2 != null) {
                    zzkkVar.zzrq = zzmyVar2;
                }
                return iZza;
            case 33:
            case 47:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzkl zzklVar3 = (com.google.android.gms.internal.drive.zzkl) zzkpVarZzr;
                    int iZza16 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, zzizVar);
                    int i26 = zzizVar.zznk + iZza16;
                    while (iZza16 < i26) {
                        iZza16 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza16, zzizVar);
                        zzklVar3.zzam(com.google.android.gms.internal.drive.zzjo.zzw(zzizVar.zznk));
                    }
                    if (iZza16 == i26) {
                        return iZza16;
                    }
                    throw com.google.android.gms.internal.drive.zzkq.zzdi();
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.drive.zzkl zzklVar4 = (com.google.android.gms.internal.drive.zzkl) zzkpVarZzr;
                    int iZza17 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, zzizVar);
                    zzklVar4.zzam(com.google.android.gms.internal.drive.zzjo.zzw(zzizVar.zznk));
                    while (iZza17 < i2) {
                        int iZza18 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza17, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return iZza17;
                        }
                        iZza17 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza18, zzizVar);
                        zzklVar4.zzam(com.google.android.gms.internal.drive.zzjo.zzw(zzizVar.zznk));
                    }
                    return iZza17;
                }
                return iZza2;
            case 34:
            case 48:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzle zzleVar5 = (com.google.android.gms.internal.drive.zzle) zzkpVarZzr;
                    int iZza19 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, zzizVar);
                    int i27 = zzizVar.zznk + iZza19;
                    while (iZza19 < i27) {
                        iZza19 = com.google.android.gms.internal.drive.zziy.zzb(bArr, iZza19, zzizVar);
                        zzleVar5.zzv(com.google.android.gms.internal.drive.zzjo.zzk(zzizVar.zznl));
                    }
                    if (iZza19 == i27) {
                        return iZza19;
                    }
                    throw com.google.android.gms.internal.drive.zzkq.zzdi();
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.drive.zzle zzleVar6 = (com.google.android.gms.internal.drive.zzle) zzkpVarZzr;
                    int iZzb2 = com.google.android.gms.internal.drive.zziy.zzb(bArr, iZza2, zzizVar);
                    zzleVar6.zzv(com.google.android.gms.internal.drive.zzjo.zzk(zzizVar.zznl));
                    while (iZzb2 < i2) {
                        int iZza20 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZzb2, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return iZzb2;
                        }
                        iZzb2 = com.google.android.gms.internal.drive.zziy.zzb(bArr, iZza20, zzizVar);
                        zzleVar6.zzv(com.google.android.gms.internal.drive.zzjo.zzk(zzizVar.zznl));
                    }
                    return iZzb2;
                }
                return iZza2;
            case 49:
                if (i5 == 3) {
                    com.google.android.gms.internal.drive.zzmf zzmfVarZzap = zzap(i6);
                    int i28 = (i3 & (-8)) | 4;
                    iZza2 = com.google.android.gms.internal.drive.zziy.zza(zzmfVarZzap, bArr, i, i2, i28, zzizVar);
                    zzkpVarZzr.add(zzizVar.zznm);
                    while (iZza2 < i2) {
                        int iZza21 = com.google.android.gms.internal.drive.zziy.zza(bArr, iZza2, zzizVar);
                        if (i3 == zzizVar.zznk) {
                            iZza2 = com.google.android.gms.internal.drive.zziy.zza(zzmfVarZzap, bArr, iZza21, i2, i28, zzizVar);
                            zzkpVarZzr.add(zzizVar.zznm);
                        }
                    }
                }
                return iZza2;
            default:
                return iZza2;
        }
    }

    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        sun.misc.Unsafe unsafe = zzuc;
        java.lang.Object objZzaq = zzaq(i3);
        java.lang.Object object = unsafe.getObject(t, j);
        if (this.zzut.zzj(object)) {
            java.lang.Object objZzl = this.zzut.zzl(objZzaq);
            this.zzut.zzb(objZzl, object);
            unsafe.putObject(t, j, objZzl);
            object = objZzl;
        }
        com.google.android.gms.internal.drive.zzlj<?, ?> zzljVarZzm = this.zzut.zzm(objZzaq);
        java.util.Map<?, ?> mapZzh = this.zzut.zzh(object);
        int iZza = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
        int i4 = zzizVar.zznk;
        if (i4 < 0 || i4 > i2 - iZza) {
            throw com.google.android.gms.internal.drive.zzkq.zzdi();
        }
        int i5 = i4 + iZza;
        K k = zzljVarZzm.zztv;
        V v = zzljVarZzm.zztx;
        while (iZza < i5) {
            int iZza2 = iZza + 1;
            int i6 = bArr[iZza];
            if (i6 < 0) {
                iZza2 = com.google.android.gms.internal.drive.zziy.zza(i6, bArr, iZza2, zzizVar);
                i6 = zzizVar.zznk;
            }
            int i7 = iZza2;
            int i8 = i6 >>> 3;
            int i9 = i6 & 7;
            if (i8 == 1) {
                if (i9 == zzljVarZzm.zztu.zzfk()) {
                    iZza = zza(bArr, i7, i2, zzljVarZzm.zztu, (java.lang.Class<?>) null, zzizVar);
                    k = (K) zzizVar.zznm;
                } else {
                    iZza = com.google.android.gms.internal.drive.zziy.zza(i6, bArr, i7, i2, zzizVar);
                }
            } else if (i8 == 2 && i9 == zzljVarZzm.zztw.zzfk()) {
                iZza = zza(bArr, i7, i2, zzljVarZzm.zztw, zzljVarZzm.zztx.getClass(), zzizVar);
                v = zzizVar.zznm;
            } else {
                iZza = com.google.android.gms.internal.drive.zziy.zza(i6, bArr, i7, i2, zzizVar);
            }
        }
        if (iZza != i5) {
            throw com.google.android.gms.internal.drive.zzkq.zzdm();
        }
        mapZzh.put(k, v);
        return i5;
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        int iZzb;
        sun.misc.Unsafe unsafe = zzuc;
        long j2 = this.zzud[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Double.valueOf(com.google.android.gms.internal.drive.zziy.zzc(bArr, i)));
                iZzb = i + 8;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Float.valueOf(com.google.android.gms.internal.drive.zziy.zzd(bArr, i)));
                iZzb = i + 4;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.drive.zziy.zzb(bArr, i, zzizVar);
                unsafe.putObject(t, j, java.lang.Long.valueOf(zzizVar.zznl));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
                unsafe.putObject(t, j, java.lang.Integer.valueOf(zzizVar.zznk));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Long.valueOf(com.google.android.gms.internal.drive.zziy.zzb(bArr, i)));
                iZzb = i + 8;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Integer.valueOf(com.google.android.gms.internal.drive.zziy.zza(bArr, i)));
                iZzb = i + 4;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.drive.zziy.zzb(bArr, i, zzizVar);
                unsafe.putObject(t, j, java.lang.Boolean.valueOf(zzizVar.zznl != 0));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iZza = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
                int i9 = zzizVar.zznk;
                if (i9 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !com.google.android.gms.internal.drive.zznf.zze(bArr, iZza, iZza + i9)) {
                        throw com.google.android.gms.internal.drive.zzkq.zzdn();
                    }
                    unsafe.putObject(t, j, new java.lang.String(bArr, iZza, i9, com.google.android.gms.internal.drive.zzkm.UTF_8));
                    iZza += i9;
                }
                unsafe.putInt(t, j2, i4);
                return iZza;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iZza2 = com.google.android.gms.internal.drive.zziy.zza(zzap(i8), bArr, i, i2, zzizVar);
                java.lang.Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object == null) {
                    unsafe.putObject(t, j, zzizVar.zznm);
                } else {
                    unsafe.putObject(t, j, com.google.android.gms.internal.drive.zzkm.zza(object, zzizVar.zznm));
                }
                unsafe.putInt(t, j2, i4);
                return iZza2;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.drive.zziy.zze(bArr, i, zzizVar);
                unsafe.putObject(t, j, zzizVar.zznm);
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iZza3 = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
                int i10 = zzizVar.zznk;
                com.google.android.gms.internal.drive.zzko zzkoVarZzar = zzar(i8);
                if (zzkoVarZzar == null || zzkoVarZzar.zzan(i10)) {
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(i10));
                    iZzb = iZza3;
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                zzo(t).zzb(i3, java.lang.Long.valueOf(i10));
                return iZza3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
                unsafe.putObject(t, j, java.lang.Integer.valueOf(com.google.android.gms.internal.drive.zzjo.zzw(zzizVar.zznk)));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.drive.zziy.zzb(bArr, i, zzizVar);
                unsafe.putObject(t, j, java.lang.Long.valueOf(com.google.android.gms.internal.drive.zzjo.zzk(zzizVar.zznl)));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.drive.zziy.zza(zzap(i8), bArr, i, i2, (i3 & (-8)) | 4, zzizVar);
                java.lang.Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object2 == null) {
                    unsafe.putObject(t, j, zzizVar.zznm);
                } else {
                    unsafe.putObject(t, j, com.google.android.gms.internal.drive.zzkm.zza(object2, zzizVar.zznm));
                }
                unsafe.putInt(t, j2, i4);
                return iZzb;
            default:
                return i;
        }
    }

    private final com.google.android.gms.internal.drive.zzmf zzap(int i) {
        int i2 = (i / 3) << 1;
        com.google.android.gms.internal.drive.zzmf zzmfVar = (com.google.android.gms.internal.drive.zzmf) this.zzue[i2];
        if (zzmfVar != null) {
            return zzmfVar;
        }
        com.google.android.gms.internal.drive.zzmf<T> zzmfVarZzf = com.google.android.gms.internal.drive.zzmd.zzej().zzf((java.lang.Class) this.zzue[i2 + 1]);
        this.zzue[i2] = zzmfVarZzf;
        return zzmfVarZzf;
    }

    private final java.lang.Object zzaq(int i) {
        return this.zzue[(i / 3) << 1];
    }

    private final com.google.android.gms.internal.drive.zzko zzar(int i) {
        return (com.google.android.gms.internal.drive.zzko) this.zzue[((i / 3) << 1) + 1];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13041. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zza(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.drive.zziz r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.drive.zziz):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0211, code lost:
    
        if (r0 == r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0230, code lost:
    
        if (r0 == r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0232, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e4, code lost:
    
        if (r0 == r15) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0062. Please report as an issue. */
    @Override // com.google.android.gms.internal.drive.zzmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        int i3;
        int iZza;
        int iZzau;
        int i4;
        int i5;
        int i6;
        int i7;
        int iZzb;
        com.google.android.gms.internal.drive.zzlu<T> zzluVar = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i8 = i2;
        com.google.android.gms.internal.drive.zziz zzizVar2 = zzizVar;
        if (zzluVar.zzuk) {
            sun.misc.Unsafe unsafe = zzuc;
            int i9 = -1;
            int iZza2 = i;
            int i10 = -1;
            int i11 = 0;
            while (iZza2 < i8) {
                int i12 = iZza2 + 1;
                byte b = bArr2[iZza2];
                if (b < 0) {
                    iZza = com.google.android.gms.internal.drive.zziy.zza(b, bArr2, i12, zzizVar2);
                    i3 = zzizVar2.zznk;
                } else {
                    i3 = b;
                    iZza = i12;
                }
                i10 = i3 >>> 3;
                int i13 = i3 & 7;
                if (i10 > i10) {
                    iZzau = zzluVar.zzp(i10, i11 / 3);
                } else {
                    iZzau = zzluVar.zzau(i10);
                }
                int i14 = iZzau;
                if (i14 == i9) {
                    i10 = i10;
                    i4 = iZza;
                    unsafe = unsafe;
                    i5 = i9;
                    i6 = 0;
                } else {
                    int i15 = zzluVar.zzud[i14 + 1];
                    int i16 = (267386880 & i15) >>> 20;
                    long j = 1048575 & i15;
                    if (i16 <= 17) {
                        switch (i16) {
                            case 0:
                                i7 = i14;
                                if (i13 != 1) {
                                    i6 = i7;
                                    i5 = -1;
                                } else {
                                    com.google.android.gms.internal.drive.zznd.zza(t2, j, com.google.android.gms.internal.drive.zziy.zzc(bArr2, iZza));
                                    iZza2 = iZza + 8;
                                    i11 = i7;
                                    i9 = -1;
                                }
                                break;
                            case 1:
                                i7 = i14;
                                if (i13 != 5) {
                                    i6 = i7;
                                    i5 = -1;
                                } else {
                                    com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t2, j, com.google.android.gms.internal.drive.zziy.zzd(bArr2, iZza));
                                    iZza2 = iZza + 4;
                                    i11 = i7;
                                    i9 = -1;
                                }
                                break;
                            case 2:
                            case 3:
                                i7 = i14;
                                if (i13 != 0) {
                                    i6 = i7;
                                    i5 = -1;
                                } else {
                                    iZzb = com.google.android.gms.internal.drive.zziy.zzb(bArr2, iZza, zzizVar2);
                                    unsafe.putLong(t, j, zzizVar2.zznl);
                                    iZza2 = iZzb;
                                    i11 = i7;
                                    i9 = -1;
                                }
                                break;
                            case 4:
                            case 11:
                                i7 = i14;
                                if (i13 != 0) {
                                    i6 = i7;
                                    i5 = -1;
                                } else {
                                    iZza2 = com.google.android.gms.internal.drive.zziy.zza(bArr2, iZza, zzizVar2);
                                    unsafe.putInt(t2, j, zzizVar2.zznk);
                                    i11 = i7;
                                    i9 = -1;
                                }
                                break;
                            case 5:
                            case 14:
                                if (i13 != 1) {
                                    i6 = i14;
                                    i5 = -1;
                                } else {
                                    i7 = i14;
                                    unsafe.putLong(t, j, com.google.android.gms.internal.drive.zziy.zzb(bArr2, iZza));
                                    iZza2 = iZza + 8;
                                    i11 = i7;
                                    i9 = -1;
                                }
                                break;
                            case 6:
                            case 13:
                                if (i13 != 5) {
                                    i6 = i14;
                                    i5 = -1;
                                } else {
                                    unsafe.putInt(t2, j, com.google.android.gms.internal.drive.zziy.zza(bArr2, iZza));
                                    iZza2 = iZza + 4;
                                    i11 = i14;
                                    i9 = -1;
                                }
                                break;
                            case 7:
                                if (i13 != 0) {
                                    i6 = i14;
                                    i5 = -1;
                                } else {
                                    int iZzb2 = com.google.android.gms.internal.drive.zziy.zzb(bArr2, iZza, zzizVar2);
                                    com.google.android.gms.internal.drive.zznd.zza(t2, j, zzizVar2.zznl != 0);
                                    iZza2 = iZzb2;
                                    i11 = i14;
                                    i9 = -1;
                                }
                                break;
                            case 8:
                                if (i13 != 2) {
                                    i6 = i14;
                                    i5 = -1;
                                } else {
                                    if ((536870912 & i15) == 0) {
                                        iZza2 = com.google.android.gms.internal.drive.zziy.zzc(bArr2, iZza, zzizVar2);
                                    } else {
                                        iZza2 = com.google.android.gms.internal.drive.zziy.zzd(bArr2, iZza, zzizVar2);
                                    }
                                    unsafe.putObject(t2, j, zzizVar2.zznm);
                                    i11 = i14;
                                    i9 = -1;
                                }
                                break;
                            case 9:
                                if (i13 != 2) {
                                    i6 = i14;
                                    i5 = -1;
                                } else {
                                    iZza2 = com.google.android.gms.internal.drive.zziy.zza(zzluVar.zzap(i14), bArr2, iZza, i8, zzizVar2);
                                    java.lang.Object object = unsafe.getObject(t2, j);
                                    if (object == null) {
                                        unsafe.putObject(t2, j, zzizVar2.zznm);
                                    } else {
                                        unsafe.putObject(t2, j, com.google.android.gms.internal.drive.zzkm.zza(object, zzizVar2.zznm));
                                    }
                                    i11 = i14;
                                    i9 = -1;
                                }
                                break;
                            case 10:
                                if (i13 != 2) {
                                    i6 = i14;
                                    i5 = -1;
                                } else {
                                    iZza2 = com.google.android.gms.internal.drive.zziy.zze(bArr2, iZza, zzizVar2);
                                    unsafe.putObject(t2, j, zzizVar2.zznm);
                                    i11 = i14;
                                    i9 = -1;
                                }
                                break;
                            case 12:
                                i7 = i14;
                                if (i13 != 0) {
                                    i6 = i7;
                                    i5 = -1;
                                } else {
                                    iZza2 = com.google.android.gms.internal.drive.zziy.zza(bArr2, iZza, zzizVar2);
                                    unsafe.putInt(t2, j, zzizVar2.zznk);
                                    i11 = i7;
                                    i9 = -1;
                                }
                                break;
                            case 15:
                                i7 = i14;
                                if (i13 != 0) {
                                    i6 = i7;
                                    i5 = -1;
                                } else {
                                    iZza2 = com.google.android.gms.internal.drive.zziy.zza(bArr2, iZza, zzizVar2);
                                    unsafe.putInt(t2, j, com.google.android.gms.internal.drive.zzjo.zzw(zzizVar2.zznk));
                                    i11 = i7;
                                    i9 = -1;
                                }
                                break;
                            case 16:
                                if (i13 != 0) {
                                    i6 = i14;
                                    i5 = -1;
                                } else {
                                    iZzb = com.google.android.gms.internal.drive.zziy.zzb(bArr2, iZza, zzizVar2);
                                    i7 = i14;
                                    unsafe.putLong(t, j, com.google.android.gms.internal.drive.zzjo.zzk(zzizVar2.zznl));
                                    iZza2 = iZzb;
                                    i11 = i7;
                                    i9 = -1;
                                }
                                break;
                            default:
                                i6 = i14;
                                i5 = -1;
                                break;
                        }
                    } else {
                        if (i16 != 27) {
                            i6 = i14;
                            if (i16 <= 49) {
                                i10 = i10;
                                int i17 = iZza;
                                unsafe = unsafe;
                                i5 = -1;
                                iZza2 = zza(t, bArr, iZza, i2, i3, i10, i13, i6, i15, i16, j, zzizVar);
                            } else {
                                i10 = i10;
                                iZza = iZza;
                                unsafe = unsafe;
                                i5 = -1;
                                if (i16 != 50) {
                                    iZza2 = zza(t, bArr, iZza, i2, i3, i10, i13, i15, i16, j, i6, zzizVar);
                                } else if (i13 == 2) {
                                    iZza2 = zza(t, bArr, iZza, i2, i6, j, zzizVar);
                                }
                            }
                        } else if (i13 == 2) {
                            com.google.android.gms.internal.drive.zzkp zzkpVarZzr = (com.google.android.gms.internal.drive.zzkp) unsafe.getObject(t2, j);
                            if (!zzkpVarZzr.zzbo()) {
                                int size = zzkpVarZzr.size();
                                zzkpVarZzr = zzkpVarZzr.zzr(size == 0 ? 10 : size << 1);
                                unsafe.putObject(t2, j, zzkpVarZzr);
                            }
                            iZza2 = com.google.android.gms.internal.drive.zziy.zza(zzluVar.zzap(i14), i3, bArr, iZza, i2, zzkpVarZzr, zzizVar);
                            i11 = i14;
                            i9 = -1;
                        } else {
                            i6 = i14;
                            i5 = -1;
                        }
                        zzluVar = this;
                        t2 = t;
                        bArr2 = bArr;
                        i8 = i2;
                        zzizVar2 = zzizVar;
                        unsafe = unsafe;
                        i11 = i6;
                        i10 = i10;
                        i9 = i5;
                    }
                    i4 = iZza;
                }
                iZza2 = com.google.android.gms.internal.drive.zziy.zza(i3, bArr, i4, i2, zzo(t), zzizVar);
                zzluVar = this;
                t2 = t;
                bArr2 = bArr;
                i8 = i2;
                zzizVar2 = zzizVar;
                unsafe = unsafe;
                i11 = i6;
                i10 = i10;
                i9 = i5;
            }
            if (iZza2 != i8) {
                throw com.google.android.gms.internal.drive.zzkq.zzdm();
            }
            return;
        }
        zza(t, bArr, i, i2, 0, zzizVar);
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzd(T t) {
        int i;
        int i2 = this.zzun;
        while (true) {
            i = this.zzuo;
            if (i2 >= i) {
                break;
            }
            long jZzas = zzas(this.zzum[i2]) & 1048575;
            java.lang.Object objZzo = com.google.android.gms.internal.drive.zznd.zzo(t, jZzas);
            if (objZzo != null) {
                com.google.android.gms.internal.drive.zznd.zza(t, jZzas, this.zzut.zzk(objZzo));
            }
            i2++;
        }
        int length = this.zzum.length;
        while (i < length) {
            this.zzuq.zza(t, this.zzum[i]);
            i++;
        }
        this.zzur.zzd(t);
        if (this.zzui) {
            this.zzus.zzd(t);
        }
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, java.util.Map<K, V> map, com.google.android.gms.internal.drive.zzko zzkoVar, UB ub, com.google.android.gms.internal.drive.zzmx<UT, UB> zzmxVar) {
        com.google.android.gms.internal.drive.zzlj<?, ?> zzljVarZzm = this.zzut.zzm(zzaq(i));
        java.util.Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<K, V> next = it.next();
            if (!zzkoVar.zzan(((java.lang.Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmxVar.zzez();
                }
                com.google.android.gms.internal.drive.zzjk zzjkVarZzu = com.google.android.gms.internal.drive.zzjc.zzu(com.google.android.gms.internal.drive.zzli.zza(zzljVarZzm, next.getKey(), next.getValue()));
                try {
                    com.google.android.gms.internal.drive.zzli.zza(zzjkVarZzu.zzby(), zzljVarZzm, next.getKey(), next.getValue());
                    zzmxVar.zza(ub, i2, zzjkVarZzu.zzbx());
                    it.remove();
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0 A[LOOP:2: B:57:0x00de->B:62:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.drive.zzmf] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [com.google.android.gms.internal.drive.zzmf] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    @Override // com.google.android.gms.internal.drive.zzmf
    public final boolean zzp(T t) {
        int i;
        java.util.List list;
        ?? Zzap;
        int i2;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= this.zzun) {
                return !this.zzui || this.zzus.zzb(t).isInitialized();
            }
            int i6 = this.zzum[i4];
            int i7 = this.zzud[i6];
            int iZzas = zzas(i6);
            if (this.zzuk) {
                i = 0;
            } else {
                int i8 = this.zzud[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i5 = zzuc.getInt(t, i9);
                    i3 = i9;
                }
            }
            if (((268435456 & iZzas) != 0) && !zza(t, i6, i5, i)) {
                return false;
            }
            int i10 = (267386880 & iZzas) >>> 20;
            if (i10 == 9 || i10 == 17) {
                if (zza(t, i6, i5, i) && !zza(t, iZzas, zzap(i6))) {
                    return false;
                }
            } else if (i10 == 27) {
                list = (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575);
                if (!list.isEmpty()) {
                    Zzap = zzap(i6);
                    for (i2 = 0; i2 < list.size(); i2++) {
                        if (!Zzap.zzp(list.get(i2))) {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (i10 == 60 || i10 == 68) {
                if (zza(t, i7, i6) && !zza(t, iZzas, zzap(i6))) {
                    return false;
                }
            } else if (i10 == 49) {
                list = (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575);
                if (!list.isEmpty()) {
                    Zzap = zzap(i6);
                    while (i2 < list.size()) {
                        if (!Zzap.zzp(list.get(i2))) {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (i10 != 50) {
                continue;
            } else {
                java.util.Map<?, ?> mapZzi = this.zzut.zzi(com.google.android.gms.internal.drive.zznd.zzo(t, iZzas & 1048575));
                if (!mapZzi.isEmpty()) {
                    if (this.zzut.zzm(zzaq(i6)).zztw.zzfj() == com.google.android.gms.internal.drive.zznr.MESSAGE) {
                        ?? Zzf = 0;
                        for (java.lang.Object obj : mapZzi.values()) {
                            if (Zzf == 0) {
                                Zzf = Zzf;
                                Zzf = com.google.android.gms.internal.drive.zzmd.zzej().zzf(obj.getClass());
                            }
                            Zzf = Zzf;
                            if (!Zzf.zzp(obj)) {
                                z = false;
                                break;
                            }
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i4++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(java.lang.Object obj, int i, com.google.android.gms.internal.drive.zzmf zzmfVar) {
        return zzmfVar.zzp(com.google.android.gms.internal.drive.zznd.zzo(obj, i & 1048575));
    }

    private static void zza(int i, java.lang.Object obj, com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            zznsVar.zza(i, (java.lang.String) obj);
        } else {
            zznsVar.zza(i, (com.google.android.gms.internal.drive.zzjc) obj);
        }
    }

    private final int zzas(int i) {
        return this.zzud[i + 1];
    }

    private final int zzat(int i) {
        return this.zzud[i + 2];
    }

    private static <T> double zze(T t, long j) {
        return ((java.lang.Double) com.google.android.gms.internal.drive.zznd.zzo(t, j)).doubleValue();
    }

    private static <T> float zzf(T t, long j) {
        return ((java.lang.Float) com.google.android.gms.internal.drive.zznd.zzo(t, j)).floatValue();
    }

    private static <T> int zzg(T t, long j) {
        return ((java.lang.Integer) com.google.android.gms.internal.drive.zznd.zzo(t, j)).intValue();
    }

    private static <T> long zzh(T t, long j) {
        return ((java.lang.Long) com.google.android.gms.internal.drive.zznd.zzo(t, j)).longValue();
    }

    private static <T> boolean zzi(T t, long j) {
        return ((java.lang.Boolean) com.google.android.gms.internal.drive.zznd.zzo(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza(t, i) == zza(t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzuk) {
            return zza(t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzuk) {
            int iZzas = zzas(i);
            long j = iZzas & 1048575;
            switch ((iZzas & 267386880) >>> 20) {
                case 0:
                    return com.google.android.gms.internal.drive.zznd.zzn(t, j) != 0.0d;
                case 1:
                    return com.google.android.gms.internal.drive.zznd.zzm(t, j) != 0.0f;
                case 2:
                    return com.google.android.gms.internal.drive.zznd.zzk(t, j) != 0;
                case 3:
                    return com.google.android.gms.internal.drive.zznd.zzk(t, j) != 0;
                case 4:
                    return com.google.android.gms.internal.drive.zznd.zzj(t, j) != 0;
                case 5:
                    return com.google.android.gms.internal.drive.zznd.zzk(t, j) != 0;
                case 6:
                    return com.google.android.gms.internal.drive.zznd.zzj(t, j) != 0;
                case 7:
                    return com.google.android.gms.internal.drive.zznd.zzl(t, j);
                case 8:
                    java.lang.Object objZzo = com.google.android.gms.internal.drive.zznd.zzo(t, j);
                    if (objZzo instanceof java.lang.String) {
                        return !((java.lang.String) objZzo).isEmpty();
                    }
                    if (objZzo instanceof com.google.android.gms.internal.drive.zzjc) {
                        return !com.google.android.gms.internal.drive.zzjc.zznq.equals(objZzo);
                    }
                    throw new java.lang.IllegalArgumentException();
                case 9:
                    return com.google.android.gms.internal.drive.zznd.zzo(t, j) != null;
                case 10:
                    return !com.google.android.gms.internal.drive.zzjc.zznq.equals(com.google.android.gms.internal.drive.zznd.zzo(t, j));
                case 11:
                    return com.google.android.gms.internal.drive.zznd.zzj(t, j) != 0;
                case 12:
                    return com.google.android.gms.internal.drive.zznd.zzj(t, j) != 0;
                case 13:
                    return com.google.android.gms.internal.drive.zznd.zzj(t, j) != 0;
                case 14:
                    return com.google.android.gms.internal.drive.zznd.zzk(t, j) != 0;
                case 15:
                    return com.google.android.gms.internal.drive.zznd.zzj(t, j) != 0;
                case 16:
                    return com.google.android.gms.internal.drive.zznd.zzk(t, j) != 0;
                case 17:
                    return com.google.android.gms.internal.drive.zznd.zzo(t, j) != null;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        int iZzat = zzat(i);
        return (com.google.android.gms.internal.drive.zznd.zzj(t, (long) (iZzat & 1048575)) & (1 << (iZzat >>> 20))) != 0;
    }

    private final void zzb(T t, int i) {
        if (this.zzuk) {
            return;
        }
        int iZzat = zzat(i);
        long j = iZzat & 1048575;
        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzj(t, j) | (1 << (iZzat >>> 20)));
    }

    private final boolean zza(T t, int i, int i2) {
        return com.google.android.gms.internal.drive.zznd.zzj(t, (long) (zzat(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, zzat(i2) & 1048575, i);
    }

    private final int zzau(int i) {
        if (i < this.zzuf || i > this.zzug) {
            return -1;
        }
        return zzq(i, 0);
    }

    private final int zzp(int i, int i2) {
        if (i < this.zzuf || i > this.zzug) {
            return -1;
        }
        return zzq(i, i2);
    }

    private final int zzq(int i, int i2) {
        int length = (this.zzud.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzud[i4];
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
}
