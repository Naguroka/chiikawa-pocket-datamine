package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgzf<T> implements com.google.android.gms.internal.ads.zzgzv<T> {
    private static final int[] zza = new int[0];
    private static final sun.misc.Unsafe zzb = com.google.android.gms.internal.ads.zzhao.zzi();
    private final int[] zzc;
    private final java.lang.Object[] zzd;
    private final int zze;
    private final int zzf;
    private final com.google.android.gms.internal.ads.zzgzc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final com.google.android.gms.internal.ads.zzhah zzm;
    private final com.google.android.gms.internal.ads.zzgxc zzn;

    private zzgzf(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.google.android.gms.internal.ads.zzgzc zzgzcVar, boolean z, int[] iArr2, int i3, int i4, com.google.android.gms.internal.ads.zzgzi zzgziVar, com.google.android.gms.internal.ads.zzgyp zzgypVar, com.google.android.gms.internal.ads.zzhah zzhahVar, com.google.android.gms.internal.ads.zzgxc zzgxcVar, com.google.android.gms.internal.ads.zzgyx zzgyxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgzcVar instanceof com.google.android.gms.internal.ads.zzgxr;
        boolean z2 = false;
        if (zzgxcVar != null && (zzgzcVar instanceof com.google.android.gms.internal.ads.zzgxn)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzhahVar;
        this.zzn = zzgxcVar;
        this.zzg = zzgzcVar;
    }

    private final java.lang.Object zzA(java.lang.Object obj, int i) {
        com.google.android.gms.internal.ads.zzgzv zzgzvVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzgzvVarZzx.zze();
        }
        java.lang.Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        java.lang.Object objZze = zzgzvVarZzx.zze();
        if (object != null) {
            zzgzvVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final java.lang.Object zzB(java.lang.Object obj, int i, int i2) {
        com.google.android.gms.internal.ads.zzgzv zzgzvVarZzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzgzvVarZzx.zze();
        }
        java.lang.Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        java.lang.Object objZze = zzgzvVarZzx.zze();
        if (object != null) {
            zzgzvVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static java.lang.reflect.Field zzC(java.lang.Class cls, java.lang.String str) {
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

    private static void zzD(java.lang.Object obj) {
        if (!zzQ(obj)) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
        }
    }

    private final void zzE(java.lang.Object obj, java.lang.Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzu = zzu(i) & 1048575;
            sun.misc.Unsafe unsafe = zzb;
            long j = iZzu;
            java.lang.Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            com.google.android.gms.internal.ads.zzgzv zzgzvVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    java.lang.Object objZze = zzgzvVarZzx.zze();
                    zzgzvVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                java.lang.Object objZze2 = zzgzvVarZzx.zze();
                zzgzvVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzgzvVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(java.lang.Object obj, java.lang.Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int iZzu = zzu(i) & 1048575;
            sun.misc.Unsafe unsafe = zzb;
            long j = iZzu;
            java.lang.Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            com.google.android.gms.internal.ads.zzgzv zzgzvVarZzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    java.lang.Object objZze = zzgzvVarZzx.zze();
                    zzgzvVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                java.lang.Object objZze2 = zzgzvVarZzx.zze();
                zzgzvVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzgzvVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(java.lang.Object obj, int i, com.google.android.gms.internal.ads.zzgzp zzgzpVar) throws java.io.IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            com.google.android.gms.internal.ads.zzhao.zzv(obj, j, zzgzpVar.zzs());
        } else if (this.zzi) {
            com.google.android.gms.internal.ads.zzhao.zzv(obj, j, zzgzpVar.zzr());
        } else {
            com.google.android.gms.internal.ads.zzhao.zzv(obj, j, zzgzpVar.zzp());
        }
    }

    private final void zzH(java.lang.Object obj, int i) {
        int iZzr = zzr(i);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        com.google.android.gms.internal.ads.zzhao.zzt(obj, j, (1 << (iZzr >>> 20)) | com.google.android.gms.internal.ads.zzhao.zzd(obj, j));
    }

    private final void zzI(java.lang.Object obj, int i, int i2) {
        com.google.android.gms.internal.ads.zzhao.zzt(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(java.lang.Object obj, int i, java.lang.Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(java.lang.Object obj, java.lang.Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(java.lang.Object obj, int i) {
        int iZzr = zzr(i);
        long j = iZzr & 1048575;
        if (j != 1048575) {
            return (com.google.android.gms.internal.ads.zzhao.zzd(obj, j) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i);
        long j2 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(com.google.android.gms.internal.ads.zzhao.zzb(obj, j2)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(com.google.android.gms.internal.ads.zzhao.zzc(obj, j2)) != 0;
            case 2:
                return com.google.android.gms.internal.ads.zzhao.zzf(obj, j2) != 0;
            case 3:
                return com.google.android.gms.internal.ads.zzhao.zzf(obj, j2) != 0;
            case 4:
                return com.google.android.gms.internal.ads.zzhao.zzd(obj, j2) != 0;
            case 5:
                return com.google.android.gms.internal.ads.zzhao.zzf(obj, j2) != 0;
            case 6:
                return com.google.android.gms.internal.ads.zzhao.zzd(obj, j2) != 0;
            case 7:
                return com.google.android.gms.internal.ads.zzhao.zzz(obj, j2);
            case 8:
                java.lang.Object objZzh = com.google.android.gms.internal.ads.zzhao.zzh(obj, j2);
                if (objZzh instanceof java.lang.String) {
                    return !((java.lang.String) objZzh).isEmpty();
                }
                if (objZzh instanceof com.google.android.gms.internal.ads.zzgwj) {
                    return !com.google.android.gms.internal.ads.zzgwj.zzb.equals(objZzh);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return com.google.android.gms.internal.ads.zzhao.zzh(obj, j2) != null;
            case 10:
                return !com.google.android.gms.internal.ads.zzgwj.zzb.equals(com.google.android.gms.internal.ads.zzhao.zzh(obj, j2));
            case 11:
                return com.google.android.gms.internal.ads.zzhao.zzd(obj, j2) != 0;
            case 12:
                return com.google.android.gms.internal.ads.zzhao.zzd(obj, j2) != 0;
            case 13:
                return com.google.android.gms.internal.ads.zzhao.zzd(obj, j2) != 0;
            case 14:
                return com.google.android.gms.internal.ads.zzhao.zzf(obj, j2) != 0;
            case 15:
                return com.google.android.gms.internal.ads.zzhao.zzd(obj, j2) != 0;
            case 16:
                return com.google.android.gms.internal.ads.zzhao.zzf(obj, j2) != 0;
            case 17:
                return com.google.android.gms.internal.ads.zzhao.zzh(obj, j2) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private final boolean zzO(java.lang.Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzP(java.lang.Object obj, int i, com.google.android.gms.internal.ads.zzgzv zzgzvVar) {
        return zzgzvVar.zzl(com.google.android.gms.internal.ads.zzhao.zzh(obj, i & 1048575));
    }

    private static boolean zzQ(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgxr) {
            return ((com.google.android.gms.internal.ads.zzgxr) obj).zzcd();
        }
        return true;
    }

    private final boolean zzR(java.lang.Object obj, int i, int i2) {
        return com.google.android.gms.internal.ads.zzhao.zzd(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(java.lang.Object obj, long j) {
        return ((java.lang.Boolean) com.google.android.gms.internal.ads.zzhao.zzh(obj, j)).booleanValue();
    }

    private static final void zzT(int i, java.lang.Object obj, com.google.android.gms.internal.ads.zzhaw zzhawVar) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            zzhawVar.zzG(i, (java.lang.String) obj);
        } else {
            zzhawVar.zzd(i, (com.google.android.gms.internal.ads.zzgwj) obj);
        }
    }

    static com.google.android.gms.internal.ads.zzhai zzd(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzgxr zzgxrVar = (com.google.android.gms.internal.ads.zzgxr) obj;
        com.google.android.gms.internal.ads.zzhai zzhaiVar = zzgxrVar.zzt;
        if (zzhaiVar != com.google.android.gms.internal.ads.zzhai.zzc()) {
            return zzhaiVar;
        }
        com.google.android.gms.internal.ads.zzhai zzhaiVarZzf = com.google.android.gms.internal.ads.zzhai.zzf();
        zzgxrVar.zzt = zzhaiVarZzf;
        return zzhaiVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:126:0x0268  */
    /* JADX WARN: Code duplicated, block: B:129:0x027f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0282  */
    /* JADX WARN: Code duplicated, block: B:184:0x0398  */
    static com.google.android.gms.internal.ads.zzgzf zzm(java.lang.Class cls, com.google.android.gms.internal.ads.zzgyz zzgyzVar, com.google.android.gms.internal.ads.zzgzi zzgziVar, com.google.android.gms.internal.ads.zzgyp zzgypVar, com.google.android.gms.internal.ads.zzhah zzhahVar, com.google.android.gms.internal.ads.zzgxc zzgxcVar, com.google.android.gms.internal.ads.zzgyx zzgyxVar) {
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
        java.lang.reflect.Field fieldZzC;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        java.lang.Object obj;
        java.lang.reflect.Field fieldZzC2;
        int i26;
        java.lang.Object obj2;
        java.lang.reflect.Field fieldZzC3;
        int i27;
        char cCharAt10;
        int i28;
        char cCharAt11;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        if (!(zzgyzVar instanceof com.google.android.gms.internal.ads.zzgzo)) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzo zzgzoVar = (com.google.android.gms.internal.ads.zzgzo) zzgyzVar;
        java.lang.String strZzd = zzgzoVar.zzd();
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
        java.lang.Object[] objArrZze = zzgzoVar.zze();
        java.lang.Class<?> cls2 = zzgzoVar.zza().getClass();
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
                        if (zzgzoVar.zzc() == 1 || i76 != 0) {
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
                        fieldZzC2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldZzC2 = zzC(cls2, (java.lang.String) obj);
                        objArrZze[i25] = fieldZzC2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC2);
                    i26 = i25 + 1;
                    obj2 = objArrZze[i26];
                    int i86 = i76;
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldZzC3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldZzC3 = zzC(cls2, (java.lang.String) obj2);
                        objArrZze[i26] = fieldZzC3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzC3);
                    strZzd = strZzd;
                    i18 = i4;
                    i19 = i83;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i20 = 0;
                    zzgzoVar = zzgzoVar;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i21 = i86;
                }
                i4 = i24;
                i25 = iCharAt12 + iCharAt12;
                obj = objArrZze[i25];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldZzC2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldZzC2 = zzC(cls2, (java.lang.String) obj);
                    objArrZze[i25] = fieldZzC2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldZzC2);
                i26 = i25 + 1;
                obj2 = objArrZze[i26];
                int i87 = i76;
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldZzC3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldZzC3 = zzC(cls2, (java.lang.String) obj2);
                    objArrZze[i26] = fieldZzC3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldZzC3);
                strZzd = strZzd;
                i18 = i4;
                i19 = i83;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i20 = 0;
                zzgzoVar = zzgzoVar;
                iObjectFieldOffset = iObjectFieldOffset5;
                i21 = i87;
            } else {
                i17 = i2;
                i18 = i4 + 1;
                java.lang.reflect.Field fieldZzC4 = zzC(cls2, (java.lang.String) objArrZze[i4]);
                if (i74 == 9 || i74 == 17) {
                    zzgzoVar = zzgzoVar;
                    int i88 = i65 / 3;
                    objArr[i88 + i88 + 1] = fieldZzC4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i22 = i18 + 1;
                        int i89 = i65 / 3;
                        objArr[i89 + i89 + 1] = objArrZze[i18];
                        i18 = i22;
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        zzgzoVar = zzgzoVar;
                        if (zzgzoVar.zzc() == 1 || i76 != 0) {
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
                            zzgzoVar = zzgzoVar;
                        } else {
                            i18 = i91;
                            i62 = i92;
                            i76 = 0;
                            zzgzoVar = zzgzoVar;
                        }
                    } else {
                        zzgzoVar = zzgzoVar;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
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
                            fieldZzC = (java.lang.reflect.Field) obj3;
                        } else {
                            fieldZzC = zzC(cls2, (java.lang.String) obj3);
                            objArrZze[i98] = fieldZzC;
                        }
                        i20 = iCharAt13 % 32;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC);
                    }
                    if (i74 >= 18 && i74 <= 49) {
                        iArr[i63] = iObjectFieldOffset;
                        i63++;
                    }
                    i21 = i76;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
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
            zzgzoVar = zzgzoVar;
            i32 = i19;
            i2 = i17;
            c = 55296;
        }
        return new com.google.android.gms.internal.ads.zzgzf(iArr3, objArr, i2, i5, zzgzoVar.zza(), false, iArr, i3, i60, zzgziVar, zzgypVar, zzhahVar, zzgxcVar, zzgyxVar);
    }

    private static double zzn(java.lang.Object obj, long j) {
        return ((java.lang.Double) com.google.android.gms.internal.ads.zzhao.zzh(obj, j)).doubleValue();
    }

    private static float zzo(java.lang.Object obj, long j) {
        return ((java.lang.Float) com.google.android.gms.internal.ads.zzhao.zzh(obj, j)).floatValue();
    }

    private static int zzp(java.lang.Object obj, long j) {
        return ((java.lang.Integer) com.google.android.gms.internal.ads.zzhao.zzh(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
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

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(java.lang.Object obj, long j) {
        return ((java.lang.Long) com.google.android.gms.internal.ads.zzhao.zzh(obj, j)).longValue();
    }

    private final com.google.android.gms.internal.ads.zzgxx zzw(int i) {
        int i2 = i / 3;
        return (com.google.android.gms.internal.ads.zzgxx) this.zzd[i2 + i2 + 1];
    }

    private final com.google.android.gms.internal.ads.zzgzv zzx(int i) {
        java.lang.Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        com.google.android.gms.internal.ads.zzgzv zzgzvVar = (com.google.android.gms.internal.ads.zzgzv) objArr[i3];
        if (zzgzvVar != null) {
            return zzgzvVar;
        }
        com.google.android.gms.internal.ads.zzgzv zzgzvVarZzb = com.google.android.gms.internal.ads.zzgzm.zza().zzb((java.lang.Class) objArr[i3 + 1]);
        this.zzd[i3] = zzgzvVarZzb;
        return zzgzvVarZzb;
    }

    private final java.lang.Object zzy(java.lang.Object obj, int i, java.lang.Object obj2, com.google.android.gms.internal.ads.zzhah zzhahVar, java.lang.Object obj3) {
        int i2 = this.zzc[i];
        java.lang.Object objZzh = com.google.android.gms.internal.ads.zzhao.zzh(obj, zzu(i) & 1048575);
        if (objZzh == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final java.lang.Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Code duplicated, block: B:137:0x038d  */
    /* JADX WARN: Code duplicated, block: B:207:0x054e  */
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
    /* JADX WARN: Type inference failed for: r1v120, types: [int] */
    /* JADX WARN: Type inference failed for: r1v123, types: [int] */
    /* JADX WARN: Type inference failed for: r1v162 */
    /* JADX WARN: Type inference failed for: r1v165 */
    /* JADX WARN: Type inference failed for: r1v166 */
    /* JADX WARN: Type inference failed for: r1v168 */
    /* JADX WARN: Type inference failed for: r1v169 */
    /* JADX WARN: Type inference failed for: r1v170 */
    /* JADX WARN: Type inference failed for: r1v80, types: [int] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r2v32, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38, types: [int] */
    /* JADX WARN: Type inference failed for: r2v42, types: [int] */
    /* JADX WARN: Type inference failed for: r2v46, types: [int] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55, types: [int] */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [int] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v39, types: [int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v46, types: [int] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzgzv
    public final int zza(java.lang.Object obj) {
        int i;
        ?? r16;
        ?? r5;
        int iZzD;
        int iZzD2;
        int iZzD3;
        int iZzE;
        int iZzD4;
        int iZzD5;
        int iZzd;
        int iZzD6;
        ?? Zzg;
        int size;
        int iZzD7;
        int iZzC;
        int iZzC2;
        ?? r3;
        int iZzA;
        ?? ZzD;
        ?? Zzh;
        int iZze;
        int iZzD8;
        int iZzD9;
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
        while (i3 < this.zzc.length) {
            int iZzu = zzu(i3);
            int iZzt = zzt(iZzu);
            int[] iArr = this.zzc;
            int i6 = iArr[i3];
            int i7 = iArr[i3 + 2];
            int i8 = i7 & i2;
            if (iZzt <= 17) {
                if (i8 != i5) {
                    r1 = i8 == i2 ? z : unsafe.getInt(obj, i8);
                    i5 = i8;
                }
                i = i5;
                r16 = r1;
                r5 = 1 << (i7 >>> 20);
            } else {
                r1 = r2;
                i = i5;
                r16 = r2 == true ? 1 : 0;
                r5 = z;
            }
            int i9 = iZzu & i2;
            if (iZzt >= com.google.android.gms.internal.ads.zzgxh.DOUBLE_LIST_PACKED.zza()) {
                com.google.android.gms.internal.ads.zzgxh.SINT64_LIST_PACKED.zza();
            }
            long j = i9;
            switch (iZzt) {
                case 0:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        iZzD = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        Zzh = iZzD + 8;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 1:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        iZzD2 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        Zzh = iZzD2 + 4;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 2:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = com.google.android.gms.internal.ads.zzgww.zzE(j2);
                        Zzh = iZzD3 + iZzE;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 3:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = com.google.android.gms.internal.ads.zzgww.zzE(j3);
                        Zzh = iZzD3 + iZzE;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 4:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = com.google.android.gms.internal.ads.zzgww.zzE(j4);
                        Zzh = iZzD3 + iZzE;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 5:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        iZzD = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        Zzh = iZzD + 8;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 6:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        iZzD2 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        Zzh = iZzD2 + 4;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 7:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        iZzD4 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        Zzh = iZzD4 + 1;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 8:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        int i10 = i6 << 3;
                        java.lang.Object object = unsafe.getObject(obj, j);
                        if (object instanceof com.google.android.gms.internal.ads.zzgwj) {
                            iZzD5 = com.google.android.gms.internal.ads.zzgww.zzD(i10);
                            iZzd = ((com.google.android.gms.internal.ads.zzgwj) object).zzd();
                            iZzD6 = com.google.android.gms.internal.ads.zzgww.zzD(iZzd);
                            Zzh = iZzD5 + iZzD6 + iZzd;
                            i4 += Zzh;
                        } else {
                            iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i10);
                            iZzE = com.google.android.gms.internal.ads.zzgww.zzC((java.lang.String) object);
                            Zzh = iZzD3 + iZzE;
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
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        Zzh = com.google.android.gms.internal.ads.zzgzx.zzh(i6, unsafe.getObject(obj, j), zzx(i3));
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 10:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        com.google.android.gms.internal.ads.zzgwj zzgwjVar = (com.google.android.gms.internal.ads.zzgwj) unsafe.getObject(obj, j);
                        iZzD5 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzd = zzgwjVar.zzd();
                        iZzD6 = com.google.android.gms.internal.ads.zzgww.zzD(iZzd);
                        Zzh = iZzD5 + iZzD6 + iZzd;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 11:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        int i11 = unsafe.getInt(obj, j);
                        iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = com.google.android.gms.internal.ads.zzgww.zzD(i11);
                        Zzh = iZzD3 + iZzE;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 12:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = com.google.android.gms.internal.ads.zzgww.zzE(j5);
                        Zzh = iZzD3 + iZzE;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 13:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        iZzD2 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        Zzh = iZzD2 + 4;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 14:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        iZzD = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        Zzh = iZzD + 8;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 15:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = com.google.android.gms.internal.ads.zzgww.zzD((i12 >> 31) ^ (i12 + i12));
                        Zzh = iZzD3 + iZzE;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 16:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = com.google.android.gms.internal.ads.zzgww.zzE((j6 >> 63) ^ (j6 + j6));
                        Zzh = iZzD3 + iZzE;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 17:
                    if (zzO(obj, i3, i, r16 == true ? 1 : 0, r5)) {
                        Zzh = com.google.android.gms.internal.ads.zzgww.zzy(i6, (com.google.android.gms.internal.ads.zzgzc) unsafe.getObject(obj, j), zzx(i3));
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 18:
                    Zzh = com.google.android.gms.internal.ads.zzgzx.zzd(i6, (java.util.List) unsafe.getObject(obj, j), z);
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 19:
                    Zzh = com.google.android.gms.internal.ads.zzgzx.zzb(i6, (java.util.List) unsafe.getObject(obj, j), z);
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 20:
                    java.util.List list = (java.util.List) unsafe.getObject(obj, j);
                    int i13 = com.google.android.gms.internal.ads.zzgzx.zza;
                    if (list.size() == 0) {
                        Zzg = z;
                    } else {
                        Zzg = com.google.android.gms.internal.ads.zzgzx.zzg(list) + (list.size() * com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3));
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
                    int i14 = com.google.android.gms.internal.ads.zzgzx.zza;
                    size = list2.size();
                    if (size == 0) {
                        Zzh = z;
                    } else {
                        iZzD3 = com.google.android.gms.internal.ads.zzgzx.zzl(list2);
                        iZzD7 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = size * iZzD7;
                        Zzh = iZzD3 + iZzE;
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
                    int i15 = com.google.android.gms.internal.ads.zzgzx.zza;
                    size = list3.size();
                    if (size == 0) {
                        Zzh = z;
                    } else {
                        iZzD3 = com.google.android.gms.internal.ads.zzgzx.zzf(list3);
                        iZzD7 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = size * iZzD7;
                        Zzh = iZzD3 + iZzE;
                    }
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 23:
                    Zzh = com.google.android.gms.internal.ads.zzgzx.zzd(i6, (java.util.List) unsafe.getObject(obj, j), z);
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 24:
                    Zzh = com.google.android.gms.internal.ads.zzgzx.zzb(i6, (java.util.List) unsafe.getObject(obj, j), z);
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 25:
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, j);
                    int i16 = com.google.android.gms.internal.ads.zzgzx.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        Zzh = z;
                    } else {
                        Zzh = size2 * (com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3) + 1);
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
                    int i17 = com.google.android.gms.internal.ads.zzgzx.zza;
                    int size3 = r0.size();
                    if (size3 == 0) {
                        Zzg = z;
                    } else {
                        int iZzD10 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3) * size3;
                        if (r0 instanceof com.google.android.gms.internal.ads.zzgyo) {
                            com.google.android.gms.internal.ads.zzgyo zzgyoVar = (com.google.android.gms.internal.ads.zzgyo) r0;
                            for (?? r7 = z; r7 < size3; r7++) {
                                java.lang.Object objZzc = zzgyoVar.zzc();
                                if (objZzc instanceof com.google.android.gms.internal.ads.zzgwj) {
                                    Zzg = iZzD10;
                                    int iZzd2 = ((com.google.android.gms.internal.ads.zzgwj) objZzc).zzd();
                                    iZzC2 = Zzg + com.google.android.gms.internal.ads.zzgww.zzD(iZzd2) + iZzd2;
                                } else {
                                    Zzg = iZzD10;
                                    iZzC2 = Zzg + com.google.android.gms.internal.ads.zzgww.zzC((java.lang.String) objZzc);
                                }
                                Zzg = iZzC2;
                            }
                            Zzg = iZzD10;
                        } else {
                            for (?? r8 = z; r8 < size3; r8++) {
                                java.lang.Object obj2 = r0.get(r8);
                                if (obj2 instanceof com.google.android.gms.internal.ads.zzgwj) {
                                    Zzg = iZzD10;
                                    int iZzd3 = ((com.google.android.gms.internal.ads.zzgwj) obj2).zzd();
                                    iZzC = Zzg + com.google.android.gms.internal.ads.zzgww.zzD(iZzd3) + iZzd3;
                                } else {
                                    Zzg = iZzD10;
                                    iZzC = Zzg + com.google.android.gms.internal.ads.zzgww.zzC((java.lang.String) obj2);
                                }
                                Zzg = iZzC;
                            }
                            Zzg = iZzD10;
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
                    com.google.android.gms.internal.ads.zzgzv zzgzvVarZzx = zzx(i3);
                    int i18 = com.google.android.gms.internal.ads.zzgzx.zza;
                    int size4 = r9.size();
                    if (size4 == 0) {
                        r3 = z;
                    } else {
                        int iZzD11 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3) * size4;
                        for (?? r10 = z; r10 < size4; r10++) {
                            java.lang.Object obj3 = r9.get(r10);
                            if (obj3 instanceof com.google.android.gms.internal.ads.zzgyn) {
                                r3 = iZzD11;
                                int iZza = ((com.google.android.gms.internal.ads.zzgyn) obj3).zza();
                                iZzA = (r3 == true ? 1 : 0) + com.google.android.gms.internal.ads.zzgww.zzD(iZza) + iZza;
                            } else {
                                r3 = iZzD11;
                                iZzA = (r3 == true ? 1 : 0) + com.google.android.gms.internal.ads.zzgww.zzA((com.google.android.gms.internal.ads.zzgzc) obj3, zzgzvVarZzx);
                            }
                            r3 = iZzA;
                        }
                        r3 = iZzD11;
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
                    int i19 = com.google.android.gms.internal.ads.zzgzx.zza;
                    int size5 = r11.size();
                    if (size5 == 0) {
                        ZzD = z;
                    } else {
                        ZzD = size5 * com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        for (?? r12 = z; r12 < r11.size(); r12++) {
                            int iZzd4 = ((com.google.android.gms.internal.ads.zzgwj) r11.get(r12)).zzd();
                            ZzD += com.google.android.gms.internal.ads.zzgww.zzD(iZzd4) + iZzd4;
                        }
                    }
                    i4 += ZzD;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 29:
                    java.util.List list5 = (java.util.List) unsafe.getObject(obj, j);
                    int i20 = com.google.android.gms.internal.ads.zzgzx.zza;
                    size = list5.size();
                    if (size == 0) {
                        Zzh = z;
                    } else {
                        iZzD3 = com.google.android.gms.internal.ads.zzgzx.zzk(list5);
                        iZzD7 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = size * iZzD7;
                        Zzh = iZzD3 + iZzE;
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
                    int i21 = com.google.android.gms.internal.ads.zzgzx.zza;
                    size = list6.size();
                    if (size == 0) {
                        Zzh = z;
                    } else {
                        iZzD3 = com.google.android.gms.internal.ads.zzgzx.zza(list6);
                        iZzD7 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = size * iZzD7;
                        Zzh = iZzD3 + iZzE;
                    }
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 31:
                    Zzh = com.google.android.gms.internal.ads.zzgzx.zzb(i6, (java.util.List) unsafe.getObject(obj, j), z);
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 32:
                    Zzh = com.google.android.gms.internal.ads.zzgzx.zzd(i6, (java.util.List) unsafe.getObject(obj, j), z);
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 33:
                    java.util.List list7 = (java.util.List) unsafe.getObject(obj, j);
                    int i22 = com.google.android.gms.internal.ads.zzgzx.zza;
                    size = list7.size();
                    if (size == 0) {
                        Zzh = z;
                    } else {
                        iZzD3 = com.google.android.gms.internal.ads.zzgzx.zzi(list7);
                        iZzD7 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = size * iZzD7;
                        Zzh = iZzD3 + iZzE;
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
                    int i23 = com.google.android.gms.internal.ads.zzgzx.zza;
                    size = list8.size();
                    if (size == 0) {
                        Zzh = z;
                    } else {
                        iZzD3 = com.google.android.gms.internal.ads.zzgzx.zzj(list8);
                        iZzD7 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = size * iZzD7;
                        Zzh = iZzD3 + iZzE;
                    }
                    i4 += Zzh;
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 35:
                    iZze = com.google.android.gms.internal.ads.zzgzx.zze((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzD9 = com.google.android.gms.internal.ads.zzgww.zzD(iZze);
                        ZzD = iZzD8 + iZzD9 + iZze;
                        i4 += ZzD;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 36:
                    iZze = com.google.android.gms.internal.ads.zzgzx.zzc((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzD9 = com.google.android.gms.internal.ads.zzgww.zzD(iZze);
                        ZzD = iZzD8 + iZzD9 + iZze;
                        i4 += ZzD;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 37:
                    iZze = com.google.android.gms.internal.ads.zzgzx.zzg((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzD9 = com.google.android.gms.internal.ads.zzgww.zzD(iZze);
                        ZzD = iZzD8 + iZzD9 + iZze;
                        i4 += ZzD;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 38:
                    iZze = com.google.android.gms.internal.ads.zzgzx.zzl((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzD9 = com.google.android.gms.internal.ads.zzgww.zzD(iZze);
                        ZzD = iZzD8 + iZzD9 + iZze;
                        i4 += ZzD;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 39:
                    iZze = com.google.android.gms.internal.ads.zzgzx.zzf((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzD9 = com.google.android.gms.internal.ads.zzgww.zzD(iZze);
                        ZzD = iZzD8 + iZzD9 + iZze;
                        i4 += ZzD;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 40:
                    iZze = com.google.android.gms.internal.ads.zzgzx.zze((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzD9 = com.google.android.gms.internal.ads.zzgww.zzD(iZze);
                        ZzD = iZzD8 + iZzD9 + iZze;
                        i4 += ZzD;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 41:
                    iZze = com.google.android.gms.internal.ads.zzgzx.zzc((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzD9 = com.google.android.gms.internal.ads.zzgww.zzD(iZze);
                        ZzD = iZzD8 + iZzD9 + iZze;
                        i4 += ZzD;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 42:
                    java.util.List list9 = (java.util.List) unsafe.getObject(obj, j);
                    int i24 = com.google.android.gms.internal.ads.zzgzx.zza;
                    iZze = list9.size();
                    if (iZze > 0) {
                        iZzD8 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzD9 = com.google.android.gms.internal.ads.zzgww.zzD(iZze);
                        ZzD = iZzD8 + iZzD9 + iZze;
                        i4 += ZzD;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 43:
                    iZze = com.google.android.gms.internal.ads.zzgzx.zzk((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzD9 = com.google.android.gms.internal.ads.zzgww.zzD(iZze);
                        ZzD = iZzD8 + iZzD9 + iZze;
                        i4 += ZzD;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 44:
                    iZze = com.google.android.gms.internal.ads.zzgzx.zza((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzD9 = com.google.android.gms.internal.ads.zzgww.zzD(iZze);
                        ZzD = iZzD8 + iZzD9 + iZze;
                        i4 += ZzD;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 45:
                    iZze = com.google.android.gms.internal.ads.zzgzx.zzc((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzD9 = com.google.android.gms.internal.ads.zzgww.zzD(iZze);
                        ZzD = iZzD8 + iZzD9 + iZze;
                        i4 += ZzD;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 46:
                    iZze = com.google.android.gms.internal.ads.zzgzx.zze((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzD9 = com.google.android.gms.internal.ads.zzgww.zzD(iZze);
                        ZzD = iZzD8 + iZzD9 + iZze;
                        i4 += ZzD;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 47:
                    iZze = com.google.android.gms.internal.ads.zzgzx.zzi((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzD9 = com.google.android.gms.internal.ads.zzgww.zzD(iZze);
                        ZzD = iZzD8 + iZzD9 + iZze;
                        i4 += ZzD;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 48:
                    iZze = com.google.android.gms.internal.ads.zzgzx.zzj((java.util.List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzD9 = com.google.android.gms.internal.ads.zzgww.zzD(iZze);
                        ZzD = iZzD8 + iZzD9 + iZze;
                        i4 += ZzD;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 49:
                    ?? r13 = (java.util.List) unsafe.getObject(obj, j);
                    com.google.android.gms.internal.ads.zzgzv zzgzvVarZzx2 = zzx(i3);
                    int i25 = com.google.android.gms.internal.ads.zzgzx.zza;
                    int size6 = r13.size();
                    if (size6 == 0) {
                        r4 = z;
                    } else {
                        boolean z2 = z;
                        r4 = z2;
                        while (r6 < size6) {
                            r6 = z2;
                            int iZzy = com.google.android.gms.internal.ads.zzgww.zzy(i6, (com.google.android.gms.internal.ads.zzgzc) r13.get(r6), zzgzvVarZzx2);
                            r6++;
                            r4 = (r4 == true ? 1 : 0) + iZzy;
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
                    com.google.android.gms.internal.ads.zzgyw zzgywVar = (com.google.android.gms.internal.ads.zzgyw) unsafe.getObject(obj, j);
                    if (zzgywVar.isEmpty()) {
                        continue;
                    } else {
                        java.util.Iterator it = zzgywVar.entrySet().iterator();
                        if (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                case 51:
                    if (zzR(obj, i6, i3)) {
                        iZzD = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        Zzh = iZzD + 8;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 52:
                    if (zzR(obj, i6, i3)) {
                        iZzD2 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        Zzh = iZzD2 + 4;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 53:
                    if (zzR(obj, i6, i3)) {
                        long jZzv = zzv(obj, j);
                        iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = com.google.android.gms.internal.ads.zzgww.zzE(jZzv);
                        Zzh = iZzD3 + iZzE;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 54:
                    if (zzR(obj, i6, i3)) {
                        long jZzv2 = zzv(obj, j);
                        iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = com.google.android.gms.internal.ads.zzgww.zzE(jZzv2);
                        Zzh = iZzD3 + iZzE;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 55:
                    if (zzR(obj, i6, i3)) {
                        long jZzp = zzp(obj, j);
                        iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = com.google.android.gms.internal.ads.zzgww.zzE(jZzp);
                        Zzh = iZzD3 + iZzE;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 56:
                    if (zzR(obj, i6, i3)) {
                        iZzD = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        Zzh = iZzD + 8;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 57:
                    if (zzR(obj, i6, i3)) {
                        iZzD2 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        Zzh = iZzD2 + 4;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 58:
                    if (zzR(obj, i6, i3)) {
                        iZzD4 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        Zzh = iZzD4 + 1;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 59:
                    if (zzR(obj, i6, i3)) {
                        int i26 = i6 << 3;
                        java.lang.Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof com.google.android.gms.internal.ads.zzgwj) {
                            iZzD5 = com.google.android.gms.internal.ads.zzgww.zzD(i26);
                            iZzd = ((com.google.android.gms.internal.ads.zzgwj) object2).zzd();
                            iZzD6 = com.google.android.gms.internal.ads.zzgww.zzD(iZzd);
                            Zzh = iZzD5 + iZzD6 + iZzd;
                            i4 += Zzh;
                        } else {
                            iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i26);
                            iZzE = com.google.android.gms.internal.ads.zzgww.zzC((java.lang.String) object2);
                            Zzh = iZzD3 + iZzE;
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
                    if (zzR(obj, i6, i3)) {
                        Zzh = com.google.android.gms.internal.ads.zzgzx.zzh(i6, unsafe.getObject(obj, j), zzx(i3));
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 61:
                    if (zzR(obj, i6, i3)) {
                        com.google.android.gms.internal.ads.zzgwj zzgwjVar2 = (com.google.android.gms.internal.ads.zzgwj) unsafe.getObject(obj, j);
                        iZzD5 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzd = zzgwjVar2.zzd();
                        iZzD6 = com.google.android.gms.internal.ads.zzgww.zzD(iZzd);
                        Zzh = iZzD5 + iZzD6 + iZzd;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 62:
                    if (zzR(obj, i6, i3)) {
                        int iZzp = zzp(obj, j);
                        iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = com.google.android.gms.internal.ads.zzgww.zzD(iZzp);
                        Zzh = iZzD3 + iZzE;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 63:
                    if (zzR(obj, i6, i3)) {
                        long jZzp2 = zzp(obj, j);
                        iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = com.google.android.gms.internal.ads.zzgww.zzE(jZzp2);
                        Zzh = iZzD3 + iZzE;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 64:
                    if (zzR(obj, i6, i3)) {
                        iZzD2 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        Zzh = iZzD2 + 4;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 65:
                    if (zzR(obj, i6, i3)) {
                        iZzD = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        Zzh = iZzD + 8;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 66:
                    if (zzR(obj, i6, i3)) {
                        int iZzp2 = zzp(obj, j);
                        iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = com.google.android.gms.internal.ads.zzgww.zzD((iZzp2 >> 31) ^ (iZzp2 + iZzp2));
                        Zzh = iZzD3 + iZzE;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 67:
                    if (zzR(obj, i6, i3)) {
                        long jZzv3 = zzv(obj, j);
                        iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(i6 << 3);
                        iZzE = com.google.android.gms.internal.ads.zzgww.zzE((jZzv3 >> 63) ^ (jZzv3 + jZzv3));
                        Zzh = iZzD3 + iZzE;
                        i4 += Zzh;
                    }
                    i3 += 3;
                    i5 = i;
                    r2 = r16;
                    z = false;
                    i2 = 1048575;
                    break;
                case 68:
                    if (zzR(obj, i6, i3)) {
                        Zzh = com.google.android.gms.internal.ads.zzgww.zzy(i6, (com.google.android.gms.internal.ads.zzgzc) unsafe.getObject(obj, j), zzx(i3));
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
        int iZza2 = i4 + ((com.google.android.gms.internal.ads.zzgxr) obj).zzt.zza();
        if (!this.zzh) {
            return iZza2;
        }
        com.google.android.gms.internal.ads.zzgxg zzgxgVar = ((com.google.android.gms.internal.ads.zzgxn) obj).zza;
        int iZzc = zzgxgVar.zza.zzc();
        int iZzc2 = 0;
        for (int i27 = 0; i27 < iZzc; i27++) {
            java.util.Map.Entry entryZzg = zzgxgVar.zza.zzg(i27);
            iZzc2 += com.google.android.gms.internal.ads.zzgxg.zzc((com.google.android.gms.internal.ads.zzgxf) ((com.google.android.gms.internal.ads.zzgzz) entryZzg).zza(), entryZzg.getValue());
        }
        for (java.util.Map.Entry entry2 : zzgxgVar.zza.zzd()) {
            iZzc2 += com.google.android.gms.internal.ads.zzgxg.zzc((com.google.android.gms.internal.ads.zzgxf) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final int zzb(java.lang.Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int iZzu = zzu(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i6 = iArr[i4];
            long j = i5;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.zzhao.zzb(obj, j));
                    byte[] bArr = com.google.android.gms.internal.ads.zzgye.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    iFloatToIntBits = java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.zzhao.zzc(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = com.google.android.gms.internal.ads.zzhao.zzf(obj, j);
                    byte[] bArr2 = com.google.android.gms.internal.ads.zzgye.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = com.google.android.gms.internal.ads.zzhao.zzf(obj, j);
                    byte[] bArr3 = com.google.android.gms.internal.ads.zzgye.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.ads.zzhao.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = com.google.android.gms.internal.ads.zzhao.zzf(obj, j);
                    byte[] bArr4 = com.google.android.gms.internal.ads.zzgye.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.ads.zzhao.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.ads.zzgye.zza(com.google.android.gms.internal.ads.zzhao.zzz(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((java.lang.String) com.google.android.gms.internal.ads.zzhao.zzh(obj, j)).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    java.lang.Object objZzh = com.google.android.gms.internal.ads.zzhao.zzh(obj, j);
                    if (objZzh != null) {
                        iHashCode = objZzh.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.ads.zzhao.zzh(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.ads.zzhao.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.ads.zzhao.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.ads.zzhao.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = com.google.android.gms.internal.ads.zzhao.zzf(obj, j);
                    byte[] bArr5 = com.google.android.gms.internal.ads.zzgye.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.ads.zzhao.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = com.google.android.gms.internal.ads.zzhao.zzf(obj, j);
                    byte[] bArr6 = com.google.android.gms.internal.ads.zzgye.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    java.lang.Object objZzh2 = com.google.android.gms.internal.ads.zzhao.zzh(obj, j);
                    if (objZzh2 != null) {
                        iHashCode = objZzh2.hashCode();
                    }
                    i3 = i2 + iHashCode;
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
                    i = i3 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.ads.zzhao.zzh(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.ads.zzhao.zzh(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = java.lang.Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = com.google.android.gms.internal.ads.zzgye.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = java.lang.Float.floatToIntBits(zzo(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = com.google.android.gms.internal.ads.zzgye.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = com.google.android.gms.internal.ads.zzgye.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = com.google.android.gms.internal.ads.zzgye.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = com.google.android.gms.internal.ads.zzgye.zza(zzS(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((java.lang.String) com.google.android.gms.internal.ads.zzhao.zzh(obj, j)).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = com.google.android.gms.internal.ads.zzhao.zzh(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = com.google.android.gms.internal.ads.zzhao.zzh(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = com.google.android.gms.internal.ads.zzgye.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = com.google.android.gms.internal.ads.zzgye.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = com.google.android.gms.internal.ads.zzhao.zzh(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i3 * 53) + ((com.google.android.gms.internal.ads.zzgxr) obj).zzt.hashCode();
        return this.zzh ? (iHashCode2 * 53) + ((com.google.android.gms.internal.ads.zzgxn) obj).zza.zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:396:0x08c2 A[PHI: r7 r8 r9 r10 r14
  0x08c2: PHI (r7v29 int) = (r7v6 int), (r7v8 int), (r7v9 int), (r7v14 int), (r7v19 int), (r7v25 int), (r7v33 int) binds: [B:385:0x0877, B:365:0x080a, B:345:0x07a4, B:335:0x0774, B:258:0x061a, B:208:0x053b, B:133:0x039e] A[DONT_GENERATE, DONT_INLINE]
  0x08c2: PHI (r8v91 int) = (r8v43 int), (r8v45 int), (r8v46 int), (r8v56 int), (r8v62 int), (r8v85 int), (r8v94 int) binds: [B:385:0x0877, B:365:0x080a, B:345:0x07a4, B:335:0x0774, B:258:0x061a, B:208:0x053b, B:133:0x039e] A[DONT_GENERATE, DONT_INLINE]
  0x08c2: PHI (r9v61 int) = (r9v37 int), (r9v39 int), (r9v40 int), (r9v42 int), (r9v44 int), (r9v59 int), (r9v64 int) binds: [B:385:0x0877, B:365:0x080a, B:345:0x07a4, B:335:0x0774, B:258:0x061a, B:208:0x053b, B:133:0x039e] A[DONT_GENERATE, DONT_INLINE]
  0x08c2: PHI (r10v53 int) = (r10v40 int), (r10v40 int), (r10v40 int), (r10v40 int), (r10v42 int), (r10v40 int), (r10v40 int) binds: [B:385:0x0877, B:365:0x080a, B:345:0x07a4, B:335:0x0774, B:258:0x061a, B:208:0x053b, B:133:0x039e] A[DONT_GENERATE, DONT_INLINE]
  0x08c2: PHI (r14v51 sun.misc.Unsafe) = 
  (r14v21 sun.misc.Unsafe)
  (r14v23 sun.misc.Unsafe)
  (r14v24 sun.misc.Unsafe)
  (r14v26 sun.misc.Unsafe)
  (r14v29 sun.misc.Unsafe)
  (r14v47 sun.misc.Unsafe)
  (r14v54 sun.misc.Unsafe)
 binds: [B:385:0x0877, B:365:0x080a, B:345:0x07a4, B:335:0x0774, B:258:0x061a, B:208:0x053b, B:133:0x039e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:481:0x0b86 A[PHI: r0 r6 r10 r20 r21 r35
  0x0b86: PHI (r0v224 int) = 
  (r0v193 int)
  (r0v194 int)
  (r0v195 int)
  (r0v196 int)
  (r0v197 int)
  (r0v198 int)
  (r0v199 int)
  (r0v200 int)
  (r0v203 int)
  (r0v212 int)
  (r0v225 int)
 binds: [B:479:0x0b6f, B:476:0x0b4b, B:473:0x0b2b, B:470:0x0b0b, B:467:0x0aeb, B:464:0x0aca, B:457:0x0aa0, B:443:0x0a61, B:441:0x0a44, B:437:0x0a07, B:413:0x0934] A[DONT_GENERATE, DONT_INLINE]
  0x0b86: PHI (r6v23 com.google.android.gms.internal.ads.zzgzf<T>) = 
  (r6v5 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v6 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v7 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v8 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v9 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v10 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v11 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v12 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v13 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v18 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v24 com.google.android.gms.internal.ads.zzgzf<T>)
 binds: [B:479:0x0b6f, B:476:0x0b4b, B:473:0x0b2b, B:470:0x0b0b, B:467:0x0aeb, B:464:0x0aca, B:457:0x0aa0, B:443:0x0a61, B:441:0x0a44, B:437:0x0a07, B:413:0x0934] A[DONT_GENERATE, DONT_INLINE]
  0x0b86: PHI (r10v81 com.google.android.gms.internal.ads.zzgvx) = 
  (r10v57 com.google.android.gms.internal.ads.zzgvx)
  (r10v58 com.google.android.gms.internal.ads.zzgvx)
  (r10v59 com.google.android.gms.internal.ads.zzgvx)
  (r10v60 com.google.android.gms.internal.ads.zzgvx)
  (r10v61 com.google.android.gms.internal.ads.zzgvx)
  (r10v62 com.google.android.gms.internal.ads.zzgvx)
  (r10v63 com.google.android.gms.internal.ads.zzgvx)
  (r10v64 com.google.android.gms.internal.ads.zzgvx)
  (r10v66 com.google.android.gms.internal.ads.zzgvx)
  (r10v73 com.google.android.gms.internal.ads.zzgvx)
  (r10v82 com.google.android.gms.internal.ads.zzgvx)
 binds: [B:479:0x0b6f, B:476:0x0b4b, B:473:0x0b2b, B:470:0x0b0b, B:467:0x0aeb, B:464:0x0aca, B:457:0x0aa0, B:443:0x0a61, B:441:0x0a44, B:437:0x0a07, B:413:0x0934] A[DONT_GENERATE, DONT_INLINE]
  0x0b86: PHI (r20v45 sun.misc.Unsafe) = 
  (r20v31 sun.misc.Unsafe)
  (r20v32 sun.misc.Unsafe)
  (r20v33 sun.misc.Unsafe)
  (r20v34 sun.misc.Unsafe)
  (r20v35 sun.misc.Unsafe)
  (r20v36 sun.misc.Unsafe)
  (r20v37 sun.misc.Unsafe)
  (r20v38 sun.misc.Unsafe)
  (r20v39 sun.misc.Unsafe)
  (r20v41 sun.misc.Unsafe)
  (r20v46 sun.misc.Unsafe)
 binds: [B:479:0x0b6f, B:476:0x0b4b, B:473:0x0b2b, B:470:0x0b0b, B:467:0x0aeb, B:464:0x0aca, B:457:0x0aa0, B:443:0x0a61, B:441:0x0a44, B:437:0x0a07, B:413:0x0934] A[DONT_GENERATE, DONT_INLINE]
  0x0b86: PHI (r21v19 int) = 
  (r21v5 int)
  (r21v6 int)
  (r21v7 int)
  (r21v8 int)
  (r21v9 int)
  (r21v10 int)
  (r21v11 int)
  (r21v12 int)
  (r21v13 int)
  (r21v15 int)
  (r21v20 int)
 binds: [B:479:0x0b6f, B:476:0x0b4b, B:473:0x0b2b, B:470:0x0b0b, B:467:0x0aeb, B:464:0x0aca, B:457:0x0aa0, B:443:0x0a61, B:441:0x0a44, B:437:0x0a07, B:413:0x0934] A[DONT_GENERATE, DONT_INLINE]
  0x0b86: PHI (r35v18 int) = 
  (r35v3 int)
  (r35v4 int)
  (r35v5 int)
  (r35v6 int)
  (r35v7 int)
  (r35v8 int)
  (r35v9 int)
  (r35v10 int)
  (r35v11 int)
  (r35v13 int)
  (r35v19 int)
 binds: [B:479:0x0b6f, B:476:0x0b4b, B:473:0x0b2b, B:470:0x0b0b, B:467:0x0aeb, B:464:0x0aca, B:457:0x0aa0, B:443:0x0a61, B:441:0x0a44, B:437:0x0a07, B:413:0x0934] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:497:0x0be7  */
    /* JADX WARN: Code duplicated, block: B:558:0x08c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:0x0b89 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x08d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x0b9e A[SYNTHETIC] */
    final int zzc(java.lang.Object obj, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.ads.zzgvx zzgvxVar) throws java.io.IOException {
        int i4;
        sun.misc.Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        sun.misc.Unsafe unsafe2;
        com.google.android.gms.internal.ads.zzgvx zzgvxVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzk;
        int i18;
        int i19;
        sun.misc.Unsafe unsafe3;
        int i20;
        int i21;
        int i22;
        int i23;
        sun.misc.Unsafe unsafe4;
        int i24;
        int i25;
        int i26;
        sun.misc.Unsafe unsafe5;
        int i27;
        int iZzf;
        int i28;
        java.lang.Object obj2;
        int i29;
        int iZzj;
        int i30;
        int i31;
        int i32;
        int iZzk2;
        int i33;
        int i34;
        com.google.android.gms.internal.ads.zzgvx zzgvxVar3;
        int iZza;
        com.google.android.gms.internal.ads.zzgzf<T> zzgzfVar = this;
        java.lang.Object obj3 = obj;
        i2 = i2;
        i3 = i3;
        com.google.android.gms.internal.ads.zzgvx zzgvxVar4 = zzgvxVar;
        zzD(obj);
        sun.misc.Unsafe unsafe6 = zzb;
        int i35 = -1;
        int iZzg = i;
        int i36 = -1;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 1048575;
        while (true) {
            if (iZzg < i2) {
                int i41 = iZzg + 1;
                int i42 = bArr[iZzg];
                if (i42 < 0) {
                    int iZzi = com.google.android.gms.internal.ads.zzgvy.zzi(i42, bArr, i41, zzgvxVar4);
                    i7 = zzgvxVar4.zza;
                    i41 = iZzi;
                } else {
                    i7 = i42;
                }
                int i43 = i7 >>> 3;
                int iZzs = i43 > i36 ? (i43 < zzgzfVar.zze || i43 > zzgzfVar.zzf) ? i35 : zzgzfVar.zzs(i43, i37 / 3) : zzgzfVar.zzq(i43);
                if (iZzs != i35) {
                    int i44 = i7 & 7;
                    int[] iArr = zzgzfVar.zzc;
                    int i45 = iArr[iZzs + 1];
                    int i46 = i43;
                    int iZzt = zzt(i45);
                    long j = i45 & 1048575;
                    int i47 = i7;
                    if (iZzt <= 17) {
                        int i48 = iArr[iZzs + 2];
                        int i49 = 1 << (i48 >>> 20);
                        int i50 = 1048575;
                        int i51 = i48 & 1048575;
                        if (i51 != i40) {
                            if (i40 != 1048575) {
                                unsafe6.putInt(obj3, i40, i39);
                                i50 = 1048575;
                            }
                            i39 = i51 == i50 ? 0 : unsafe6.getInt(obj3, i51);
                            i10 = i51;
                        } else {
                            i10 = i40;
                        }
                        switch (iZzt) {
                            case 0:
                                i14 = iZzs;
                                i15 = i46;
                                i16 = i47;
                                if (i44 == 1) {
                                    iZzg = i41 + 8;
                                    i39 |= i49;
                                    com.google.android.gms.internal.ads.zzhao.zzr(obj3, j, java.lang.Double.longBitsToDouble(com.google.android.gms.internal.ads.zzgvy.zzn(bArr, i41)));
                                    i2 = i2;
                                    i3 = i3;
                                    i38 = i16;
                                    i36 = i15;
                                    i37 = i14;
                                    i40 = i10;
                                    i35 = -1;
                                } else {
                                    i39 = i39;
                                    i18 = i16;
                                    i46 = i15;
                                    i19 = i14;
                                    i11 = -1;
                                    i4 = i3;
                                    i9 = i39;
                                    i13 = i19;
                                    i6 = i18;
                                    i8 = i41;
                                    zzgvxVar2 = zzgvxVar4;
                                    i12 = i46;
                                    unsafe2 = unsafe6;
                                }
                                break;
                            case 1:
                                i14 = iZzs;
                                i15 = i46;
                                i16 = i47;
                                if (i44 == 5) {
                                    iZzg = i41 + 4;
                                    i39 |= i49;
                                    com.google.android.gms.internal.ads.zzhao.zzs(obj3, j, java.lang.Float.intBitsToFloat(com.google.android.gms.internal.ads.zzgvy.zzb(bArr, i41)));
                                    i2 = i2;
                                    i3 = i3;
                                    i38 = i16;
                                    i36 = i15;
                                    i37 = i14;
                                    i40 = i10;
                                    i35 = -1;
                                } else {
                                    i39 = i39;
                                    i18 = i16;
                                    i46 = i15;
                                    i19 = i14;
                                    i11 = -1;
                                    i4 = i3;
                                    i9 = i39;
                                    i13 = i19;
                                    i6 = i18;
                                    i8 = i41;
                                    zzgvxVar2 = zzgvxVar4;
                                    i12 = i46;
                                    unsafe2 = unsafe6;
                                }
                                break;
                            case 2:
                            case 3:
                                i14 = iZzs;
                                i15 = i46;
                                i16 = i47;
                                if (i44 == 0) {
                                    i17 = i39 | i49;
                                    iZzk = com.google.android.gms.internal.ads.zzgvy.zzk(bArr, i41, zzgvxVar4);
                                    unsafe6.putLong(obj, j, zzgvxVar4.zzb);
                                    i2 = i2;
                                    i3 = i3;
                                    i38 = i16;
                                    i36 = i15;
                                    i37 = i14;
                                    i39 = i17;
                                    iZzg = iZzk;
                                    i40 = i10;
                                    i35 = -1;
                                } else {
                                    i39 = i39;
                                    i18 = i16;
                                    i46 = i15;
                                    i19 = i14;
                                    i11 = -1;
                                    i4 = i3;
                                    i9 = i39;
                                    i13 = i19;
                                    i6 = i18;
                                    i8 = i41;
                                    zzgvxVar2 = zzgvxVar4;
                                    i12 = i46;
                                    unsafe2 = unsafe6;
                                }
                                break;
                            case 4:
                            case 11:
                                i14 = iZzs;
                                i15 = i46;
                                i16 = i47;
                                if (i44 == 0) {
                                    i39 |= i49;
                                    iZzg = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i41, zzgvxVar4);
                                    unsafe6.putInt(obj3, j, zzgvxVar4.zza);
                                    i2 = i2;
                                    i3 = i3;
                                    i38 = i16;
                                    i36 = i15;
                                    i37 = i14;
                                    i40 = i10;
                                    i35 = -1;
                                } else {
                                    i39 = i39;
                                    i18 = i16;
                                    i46 = i15;
                                    i19 = i14;
                                    i11 = -1;
                                    i4 = i3;
                                    i9 = i39;
                                    i13 = i19;
                                    i6 = i18;
                                    i8 = i41;
                                    zzgvxVar2 = zzgvxVar4;
                                    i12 = i46;
                                    unsafe2 = unsafe6;
                                }
                                break;
                            case 5:
                            case 14:
                                i14 = iZzs;
                                i15 = i46;
                                i16 = i47;
                                if (i44 == 1) {
                                    iZzk = i41 + 8;
                                    i17 = i39 | i49;
                                    unsafe6.putLong(obj, j, com.google.android.gms.internal.ads.zzgvy.zzn(bArr, i41));
                                    i2 = i2;
                                    i3 = i3;
                                    i38 = i16;
                                    i36 = i15;
                                    i37 = i14;
                                    i39 = i17;
                                    iZzg = iZzk;
                                    i40 = i10;
                                    i35 = -1;
                                } else {
                                    i39 = i39;
                                    i18 = i16;
                                    i46 = i15;
                                    i19 = i14;
                                    i11 = -1;
                                    i4 = i3;
                                    i9 = i39;
                                    i13 = i19;
                                    i6 = i18;
                                    i8 = i41;
                                    zzgvxVar2 = zzgvxVar4;
                                    i12 = i46;
                                    unsafe2 = unsafe6;
                                }
                                break;
                            case 6:
                            case 13:
                                i14 = iZzs;
                                i15 = i46;
                                i16 = i47;
                                if (i44 == 5) {
                                    iZzg = i41 + 4;
                                    i39 |= i49;
                                    unsafe6.putInt(obj3, j, com.google.android.gms.internal.ads.zzgvy.zzb(bArr, i41));
                                    i2 = i2;
                                    i3 = i3;
                                    i38 = i16;
                                    i36 = i15;
                                    i37 = i14;
                                    i40 = i10;
                                    i35 = -1;
                                } else {
                                    i39 = i39;
                                    i18 = i16;
                                    i46 = i15;
                                    i19 = i14;
                                    i11 = -1;
                                    i4 = i3;
                                    i9 = i39;
                                    i13 = i19;
                                    i6 = i18;
                                    i8 = i41;
                                    zzgvxVar2 = zzgvxVar4;
                                    i12 = i46;
                                    unsafe2 = unsafe6;
                                }
                                break;
                            case 7:
                                i14 = iZzs;
                                i15 = i46;
                                i16 = i47;
                                if (i44 == 0) {
                                    i39 |= i49;
                                    iZzg = com.google.android.gms.internal.ads.zzgvy.zzk(bArr, i41, zzgvxVar4);
                                    com.google.android.gms.internal.ads.zzhao.zzp(obj3, j, zzgvxVar4.zzb != 0);
                                    i2 = i2;
                                    i3 = i3;
                                    i38 = i16;
                                    i36 = i15;
                                    i37 = i14;
                                    i40 = i10;
                                    i35 = -1;
                                } else {
                                    i39 = i39;
                                    i18 = i16;
                                    i46 = i15;
                                    i19 = i14;
                                    i11 = -1;
                                    i4 = i3;
                                    i9 = i39;
                                    i13 = i19;
                                    i6 = i18;
                                    i8 = i41;
                                    zzgvxVar2 = zzgvxVar4;
                                    i12 = i46;
                                    unsafe2 = unsafe6;
                                }
                                break;
                            case 8:
                                i14 = iZzs;
                                i15 = i46;
                                i16 = i47;
                                if (i44 == 2) {
                                    if (zzM(i45)) {
                                        iZzg = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i41, zzgvxVar4);
                                        int i52 = zzgvxVar4.zza;
                                        if (i52 < 0) {
                                            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        int i53 = i39 | i49;
                                        if (i52 == 0) {
                                            zzgvxVar4.zzc = "";
                                        } else {
                                            zzgvxVar4.zzc = com.google.android.gms.internal.ads.zzhat.zzh(bArr, iZzg, i52);
                                            iZzg += i52;
                                        }
                                        i39 = i53;
                                    } else {
                                        int i54 = i39 | i49;
                                        int iZzh = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i41, zzgvxVar4);
                                        int i55 = zzgvxVar4.zza;
                                        if (i55 < 0) {
                                            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i55 == 0) {
                                            zzgvxVar4.zzc = "";
                                        } else {
                                            zzgvxVar4.zzc = new java.lang.String(bArr, iZzh, i55, com.google.android.gms.internal.ads.zzgye.zza);
                                            iZzh += i55;
                                        }
                                        i39 = i54;
                                        iZzg = iZzh;
                                    }
                                    unsafe6.putObject(obj3, j, zzgvxVar4.zzc);
                                    i2 = i2;
                                    i3 = i3;
                                    i38 = i16;
                                    i36 = i15;
                                    i37 = i14;
                                    i40 = i10;
                                    i35 = -1;
                                } else {
                                    i39 = i39;
                                    i18 = i16;
                                    i46 = i15;
                                    i19 = i14;
                                    i11 = -1;
                                    i4 = i3;
                                    i9 = i39;
                                    i13 = i19;
                                    i6 = i18;
                                    i8 = i41;
                                    zzgvxVar2 = zzgvxVar4;
                                    i12 = i46;
                                    unsafe2 = unsafe6;
                                }
                                break;
                            case 9:
                                i14 = iZzs;
                                i15 = i46;
                                i16 = i47;
                                if (i44 == 2) {
                                    java.lang.Object objZzA = zzgzfVar.zzA(obj3, i14);
                                    iZzg = com.google.android.gms.internal.ads.zzgvy.zzm(objZzA, zzgzfVar.zzx(i14), bArr, i41, i2, zzgvxVar);
                                    zzgzfVar.zzJ(obj3, i14, objZzA);
                                    i2 = i2;
                                    i38 = i16;
                                    i36 = i15;
                                    i37 = i14;
                                    i39 |= i49;
                                    i40 = i10;
                                    i35 = -1;
                                    i3 = i3;
                                } else {
                                    i39 = i39;
                                    i18 = i16;
                                    i46 = i15;
                                    i19 = i14;
                                    i11 = -1;
                                    i4 = i3;
                                    i9 = i39;
                                    i13 = i19;
                                    i6 = i18;
                                    i8 = i41;
                                    zzgvxVar2 = zzgvxVar4;
                                    i12 = i46;
                                    unsafe2 = unsafe6;
                                }
                                break;
                            case 10:
                                i14 = iZzs;
                                i15 = i46;
                                i16 = i47;
                                if (i44 == 2) {
                                    i39 |= i49;
                                    iZzg = com.google.android.gms.internal.ads.zzgvy.zza(bArr, i41, zzgvxVar4);
                                    unsafe6.putObject(obj3, j, zzgvxVar4.zzc);
                                    i2 = i2;
                                    i3 = i3;
                                    i38 = i16;
                                    i36 = i15;
                                    i37 = i14;
                                    i40 = i10;
                                    i35 = -1;
                                } else {
                                    i39 = i39;
                                    i18 = i16;
                                    i46 = i15;
                                    i19 = i14;
                                    i11 = -1;
                                    i4 = i3;
                                    i9 = i39;
                                    i13 = i19;
                                    i6 = i18;
                                    i8 = i41;
                                    zzgvxVar2 = zzgvxVar4;
                                    i12 = i46;
                                    unsafe2 = unsafe6;
                                }
                                break;
                            case 12:
                                i14 = iZzs;
                                i15 = i46;
                                if (i44 == 0) {
                                    iZzg = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i41, zzgvxVar4);
                                    int i56 = zzgvxVar4.zza;
                                    com.google.android.gms.internal.ads.zzgxx zzgxxVarZzw = zzgzfVar.zzw(i14);
                                    if ((i45 & Integer.MIN_VALUE) == 0 || zzgxxVarZzw == null || zzgxxVarZzw.zza(i56)) {
                                        i16 = i47;
                                        i39 |= i49;
                                        unsafe6.putInt(obj3, j, i56);
                                    } else {
                                        i16 = i47;
                                        zzd(obj).zzj(i16, java.lang.Long.valueOf(i56));
                                    }
                                    i2 = i2;
                                    i3 = i3;
                                    i38 = i16;
                                    i36 = i15;
                                    i37 = i14;
                                    i40 = i10;
                                    i35 = -1;
                                } else {
                                    i46 = i15;
                                    i19 = i14;
                                    i18 = i47;
                                    i11 = -1;
                                    i4 = i3;
                                    i9 = i39;
                                    i13 = i19;
                                    i6 = i18;
                                    i8 = i41;
                                    zzgvxVar2 = zzgvxVar4;
                                    i12 = i46;
                                    unsafe2 = unsafe6;
                                }
                                break;
                            case 15:
                                i14 = iZzs;
                                i15 = i46;
                                if (i44 == 0) {
                                    i39 |= i49;
                                    iZzg = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i41, zzgvxVar4);
                                    unsafe6.putInt(obj3, j, com.google.android.gms.internal.ads.zzgwp.zzD(zzgvxVar4.zza));
                                    i36 = i15;
                                    i37 = i14;
                                    i38 = i47;
                                    i40 = i10;
                                    i35 = -1;
                                } else {
                                    i46 = i15;
                                    i19 = i14;
                                    i18 = i47;
                                    i11 = -1;
                                    i4 = i3;
                                    i9 = i39;
                                    i13 = i19;
                                    i6 = i18;
                                    i8 = i41;
                                    zzgvxVar2 = zzgvxVar4;
                                    i12 = i46;
                                    unsafe2 = unsafe6;
                                }
                                break;
                            case 16:
                                if (i44 == 0) {
                                    int i57 = i39 | i49;
                                    int iZzk3 = com.google.android.gms.internal.ads.zzgvy.zzk(bArr, i41, zzgvxVar4);
                                    i15 = i46;
                                    i14 = iZzs;
                                    unsafe6.putLong(obj, j, com.google.android.gms.internal.ads.zzgwp.zzF(zzgvxVar4.zzb));
                                    iZzg = iZzk3;
                                    i39 = i57;
                                    i36 = i15;
                                    i37 = i14;
                                    i38 = i47;
                                    i40 = i10;
                                    i35 = -1;
                                } else {
                                    i19 = iZzs;
                                    i18 = i47;
                                    i11 = -1;
                                    i4 = i3;
                                    i9 = i39;
                                    i13 = i19;
                                    i6 = i18;
                                    i8 = i41;
                                    zzgvxVar2 = zzgvxVar4;
                                    i12 = i46;
                                    unsafe2 = unsafe6;
                                }
                                break;
                            default:
                                i14 = iZzs;
                                i15 = i46;
                                i16 = i47;
                                if (i44 == 3) {
                                    int i58 = i39 | i49;
                                    java.lang.Object objZzA2 = zzgzfVar.zzA(obj3, i14);
                                    int iZzl = com.google.android.gms.internal.ads.zzgvy.zzl(objZzA2, zzgzfVar.zzx(i14), bArr, i41, i2, (i15 << 3) | 4, zzgvxVar);
                                    zzgzfVar.zzJ(obj3, i14, objZzA2);
                                    i3 = i3;
                                    zzgvxVar4 = zzgvxVar4;
                                    i2 = i2;
                                    unsafe6 = unsafe6;
                                    iZzg = iZzl;
                                    i35 = -1;
                                    i40 = i10;
                                    i39 = i58;
                                    i38 = i16;
                                    i37 = i14;
                                    i36 = i15;
                                } else {
                                    i39 = i39;
                                    i18 = i16;
                                    i46 = i15;
                                    i19 = i14;
                                    i11 = -1;
                                    i4 = i3;
                                    i9 = i39;
                                    i13 = i19;
                                    i6 = i18;
                                    i8 = i41;
                                    zzgvxVar2 = zzgvxVar4;
                                    i12 = i46;
                                    unsafe2 = unsafe6;
                                }
                                break;
                        }
                    } else {
                        i9 = i39;
                        i10 = i40;
                        sun.misc.Unsafe unsafe7 = unsafe6;
                        i6 = i47;
                        i11 = -1;
                        int i59 = i2;
                        if (iZzt != 27) {
                            zzgvxVar4 = zzgvxVar;
                            unsafe3 = unsafe7;
                            i20 = iZzs;
                            if (iZzt <= 49) {
                                long j2 = i45;
                                sun.misc.Unsafe unsafe8 = zzb;
                                com.google.android.gms.internal.ads.zzgyd zzgydVarZzf = (com.google.android.gms.internal.ads.zzgyd) unsafe8.getObject(obj3, j);
                                if (!zzgydVarZzf.zzc()) {
                                    int size = zzgydVarZzf.size();
                                    zzgydVarZzf = zzgydVarZzf.zzf(size + size);
                                    unsafe8.putObject(obj3, j, zzgydVarZzf);
                                }
                                com.google.android.gms.internal.ads.zzgyd zzgydVar = zzgydVarZzf;
                                switch (iZzt) {
                                    case 18:
                                    case 35:
                                        i22 = i41;
                                        i23 = i59;
                                        unsafe4 = unsafe3;
                                        i24 = i46;
                                        if (i44 == 2) {
                                            int i60 = com.google.android.gms.internal.ads.zzgvy.zza;
                                            com.google.android.gms.internal.ads.zzgwy zzgwyVar = (com.google.android.gms.internal.ads.zzgwy) zzgydVar;
                                            iZzg = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i22, zzgvxVar4);
                                            int i61 = zzgvxVar4.zza;
                                            int i62 = iZzg + i61;
                                            if (i62 > bArr.length) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgwyVar.zzi(zzgwyVar.size() + (i61 / 8));
                                            while (iZzg < i62) {
                                                zzgwyVar.zzh(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.ads.zzgvy.zzn(bArr, iZzg)));
                                                iZzg += 8;
                                            }
                                            if (iZzg != i62) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else if (i44 == 1) {
                                            i25 = i22 + 8;
                                            int i63 = com.google.android.gms.internal.ads.zzgvy.zza;
                                            com.google.android.gms.internal.ads.zzgwy zzgwyVar2 = (com.google.android.gms.internal.ads.zzgwy) zzgydVar;
                                            zzgwyVar2.zzh(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.ads.zzgvy.zzn(bArr, i22)));
                                            while (i25 < i23) {
                                                int iZzh2 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i25, zzgvxVar4);
                                                if (i6 == zzgvxVar4.zza) {
                                                    zzgwyVar2.zzh(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.ads.zzgvy.zzn(bArr, iZzh2)));
                                                    i25 = iZzh2 + 8;
                                                } else {
                                                    iZzg = i25;
                                                }
                                            }
                                            iZzg = i25;
                                        } else {
                                            iZzg = i22;
                                        }
                                        if (iZzg != i22) {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i3 = i3;
                                            i36 = i24;
                                            i37 = i20;
                                            i38 = i6;
                                            unsafe6 = unsafe4;
                                            i35 = -1;
                                            i39 = i9;
                                            i40 = i10;
                                            i2 = i23;
                                        } else {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i8 = iZzg;
                                            i12 = i24;
                                            i13 = i20;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe2 = unsafe4;
                                            i4 = i3;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        i22 = i41;
                                        i23 = i59;
                                        unsafe4 = unsafe3;
                                        i24 = i46;
                                        if (i44 == 2) {
                                            int i64 = com.google.android.gms.internal.ads.zzgvy.zza;
                                            com.google.android.gms.internal.ads.zzgxi zzgxiVar = (com.google.android.gms.internal.ads.zzgxi) zzgydVar;
                                            iZzg = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i22, zzgvxVar4);
                                            int i65 = zzgvxVar4.zza;
                                            int i66 = iZzg + i65;
                                            if (i66 > bArr.length) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgxiVar.zzi(zzgxiVar.size() + (i65 / 4));
                                            while (iZzg < i66) {
                                                zzgxiVar.zzh(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.ads.zzgvy.zzb(bArr, iZzg)));
                                                iZzg += 4;
                                            }
                                            if (iZzg != i66) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else if (i44 == 5) {
                                            i25 = i22 + 4;
                                            int i67 = com.google.android.gms.internal.ads.zzgvy.zza;
                                            com.google.android.gms.internal.ads.zzgxi zzgxiVar2 = (com.google.android.gms.internal.ads.zzgxi) zzgydVar;
                                            zzgxiVar2.zzh(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.ads.zzgvy.zzb(bArr, i22)));
                                            while (i25 < i23) {
                                                int iZzh3 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i25, zzgvxVar4);
                                                if (i6 == zzgvxVar4.zza) {
                                                    zzgxiVar2.zzh(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.ads.zzgvy.zzb(bArr, iZzh3)));
                                                    i25 = iZzh3 + 4;
                                                } else {
                                                    iZzg = i25;
                                                }
                                            }
                                            iZzg = i25;
                                        } else {
                                            iZzg = i22;
                                        }
                                        if (iZzg != i22) {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i3 = i3;
                                            i36 = i24;
                                            i37 = i20;
                                            i38 = i6;
                                            unsafe6 = unsafe4;
                                            i35 = -1;
                                            i39 = i9;
                                            i40 = i10;
                                            i2 = i23;
                                        } else {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i8 = iZzg;
                                            i12 = i24;
                                            i13 = i20;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe2 = unsafe4;
                                            i4 = i3;
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i22 = i41;
                                        i23 = i59;
                                        unsafe4 = unsafe3;
                                        i24 = i46;
                                        if (i44 == 2) {
                                            int i68 = com.google.android.gms.internal.ads.zzgvy.zza;
                                            com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) zzgydVar;
                                            iZzg = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i22, zzgvxVar4);
                                            int i69 = zzgvxVar4.zza + iZzg;
                                            while (iZzg < i69) {
                                                iZzg = com.google.android.gms.internal.ads.zzgvy.zzk(bArr, iZzg, zzgvxVar4);
                                                zzgyrVar.zzg(zzgvxVar4.zzb);
                                            }
                                            if (iZzg != i69) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else if (i44 == 0) {
                                            int i70 = com.google.android.gms.internal.ads.zzgvy.zza;
                                            com.google.android.gms.internal.ads.zzgyr zzgyrVar2 = (com.google.android.gms.internal.ads.zzgyr) zzgydVar;
                                            iZzg = com.google.android.gms.internal.ads.zzgvy.zzk(bArr, i22, zzgvxVar4);
                                            zzgyrVar2.zzg(zzgvxVar4.zzb);
                                            while (iZzg < i23) {
                                                int iZzh4 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, iZzg, zzgvxVar4);
                                                if (i6 == zzgvxVar4.zza) {
                                                    iZzg = com.google.android.gms.internal.ads.zzgvy.zzk(bArr, iZzh4, zzgvxVar4);
                                                    zzgyrVar2.zzg(zzgvxVar4.zzb);
                                                }
                                            }
                                        } else {
                                            iZzg = i22;
                                        }
                                        if (iZzg != i22) {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i3 = i3;
                                            i36 = i24;
                                            i37 = i20;
                                            i38 = i6;
                                            unsafe6 = unsafe4;
                                            i35 = -1;
                                            i39 = i9;
                                            i40 = i10;
                                            i2 = i23;
                                        } else {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i8 = iZzg;
                                            i12 = i24;
                                            i13 = i20;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe2 = unsafe4;
                                            i4 = i3;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i22 = i41;
                                        i26 = i59;
                                        unsafe5 = unsafe3;
                                        i27 = i46;
                                        if (i44 == 2) {
                                            iZzf = com.google.android.gms.internal.ads.zzgvy.zzf(bArr, i22, zzgydVar, zzgvxVar4);
                                            i23 = i26;
                                            iZzg = iZzf;
                                            unsafe4 = unsafe5;
                                            i24 = i27;
                                        } else if (i44 == 0) {
                                            i23 = i26;
                                            i24 = i27;
                                            unsafe4 = unsafe5;
                                            iZzg = com.google.android.gms.internal.ads.zzgvy.zzj(i6, bArr, i22, i2, zzgydVar, zzgvxVar);
                                        } else {
                                            i23 = i26;
                                            unsafe4 = unsafe5;
                                            i24 = i27;
                                            iZzg = i22;
                                        }
                                        if (iZzg != i22) {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i3 = i3;
                                            i36 = i24;
                                            i37 = i20;
                                            i38 = i6;
                                            unsafe6 = unsafe4;
                                            i35 = -1;
                                            i39 = i9;
                                            i40 = i10;
                                            i2 = i23;
                                        } else {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i8 = iZzg;
                                            i12 = i24;
                                            i13 = i20;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe2 = unsafe4;
                                            i4 = i3;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i22 = i41;
                                        i26 = i59;
                                        unsafe5 = unsafe3;
                                        i27 = i46;
                                        if (i44 != 2) {
                                            if (i44 == 1) {
                                                i28 = i22 + 8;
                                                int i71 = com.google.android.gms.internal.ads.zzgvy.zza;
                                                com.google.android.gms.internal.ads.zzgyr zzgyrVar3 = (com.google.android.gms.internal.ads.zzgyr) zzgydVar;
                                                zzgyrVar3.zzg(com.google.android.gms.internal.ads.zzgvy.zzn(bArr, i22));
                                                while (i28 < i26) {
                                                    int iZzh5 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i28, zzgvxVar4);
                                                    if (i6 != zzgvxVar4.zza) {
                                                        i23 = i26;
                                                        iZzg = i28;
                                                        unsafe4 = unsafe5;
                                                        i24 = i27;
                                                        if (iZzg != i22) {
                                                            i6 = i6;
                                                            zzgvxVar4 = zzgvxVar4;
                                                            i20 = i20;
                                                            obj3 = obj;
                                                            i3 = i3;
                                                            i36 = i24;
                                                            i37 = i20;
                                                            i38 = i6;
                                                            unsafe6 = unsafe4;
                                                            i35 = -1;
                                                            i39 = i9;
                                                            i40 = i10;
                                                            i2 = i23;
                                                        } else {
                                                            i6 = i6;
                                                            zzgvxVar4 = zzgvxVar4;
                                                            i20 = i20;
                                                            obj3 = obj;
                                                            i8 = iZzg;
                                                            i12 = i24;
                                                            i13 = i20;
                                                            zzgvxVar2 = zzgvxVar4;
                                                            unsafe2 = unsafe4;
                                                            i4 = i3;
                                                        }
                                                    } else {
                                                        zzgyrVar3.zzg(com.google.android.gms.internal.ads.zzgvy.zzn(bArr, iZzh5));
                                                        i28 = iZzh5 + 8;
                                                    }
                                                    break;
                                                }
                                                i23 = i26;
                                                iZzg = i28;
                                                unsafe4 = unsafe5;
                                                i24 = i27;
                                                if (iZzg != i22) {
                                                    i6 = i6;
                                                    zzgvxVar4 = zzgvxVar4;
                                                    i20 = i20;
                                                    obj3 = obj;
                                                    i3 = i3;
                                                    i36 = i24;
                                                    i37 = i20;
                                                    i38 = i6;
                                                    unsafe6 = unsafe4;
                                                    i35 = -1;
                                                    i39 = i9;
                                                    i40 = i10;
                                                    i2 = i23;
                                                } else {
                                                    i6 = i6;
                                                    zzgvxVar4 = zzgvxVar4;
                                                    i20 = i20;
                                                    obj3 = obj;
                                                    i8 = iZzg;
                                                    i12 = i24;
                                                    i13 = i20;
                                                    zzgvxVar2 = zzgvxVar4;
                                                    unsafe2 = unsafe4;
                                                    i4 = i3;
                                                }
                                            }
                                            i23 = i26;
                                            unsafe4 = unsafe5;
                                            i24 = i27;
                                            iZzg = i22;
                                            if (iZzg != i22) {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i3 = i3;
                                                i36 = i24;
                                                i37 = i20;
                                                i38 = i6;
                                                unsafe6 = unsafe4;
                                                i35 = -1;
                                                i39 = i9;
                                                i40 = i10;
                                                i2 = i23;
                                            } else {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i8 = iZzg;
                                                i12 = i24;
                                                i13 = i20;
                                                zzgvxVar2 = zzgvxVar4;
                                                unsafe2 = unsafe4;
                                                i4 = i3;
                                            }
                                            break;
                                        } else {
                                            int i72 = com.google.android.gms.internal.ads.zzgvy.zza;
                                            com.google.android.gms.internal.ads.zzgyr zzgyrVar4 = (com.google.android.gms.internal.ads.zzgyr) zzgydVar;
                                            iZzf = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i22, zzgvxVar4);
                                            int i73 = zzgvxVar4.zza;
                                            int i74 = iZzf + i73;
                                            if (i74 > bArr.length) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgyrVar4.zzi(zzgyrVar4.size() + (i73 / 8));
                                            while (iZzf < i74) {
                                                zzgyrVar4.zzg(com.google.android.gms.internal.ads.zzgvy.zzn(bArr, iZzf));
                                                iZzf += 8;
                                            }
                                            if (iZzf != i74) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i23 = i26;
                                            iZzg = iZzf;
                                            unsafe4 = unsafe5;
                                            i24 = i27;
                                            if (iZzg != i22) {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i3 = i3;
                                                i36 = i24;
                                                i37 = i20;
                                                i38 = i6;
                                                unsafe6 = unsafe4;
                                                i35 = -1;
                                                i39 = i9;
                                                i40 = i10;
                                                i2 = i23;
                                            } else {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i8 = iZzg;
                                                i12 = i24;
                                                i13 = i20;
                                                zzgvxVar2 = zzgvxVar4;
                                                unsafe2 = unsafe4;
                                                i4 = i3;
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i22 = i41;
                                        i26 = i59;
                                        unsafe5 = unsafe3;
                                        i27 = i46;
                                        if (i44 != 2) {
                                            if (i44 == 5) {
                                                i28 = i22 + 4;
                                                int i75 = com.google.android.gms.internal.ads.zzgvy.zza;
                                                com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) zzgydVar;
                                                zzgxsVar.zzi(com.google.android.gms.internal.ads.zzgvy.zzb(bArr, i22));
                                                while (i28 < i26) {
                                                    int iZzh6 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i28, zzgvxVar4);
                                                    if (i6 != zzgvxVar4.zza) {
                                                        i23 = i26;
                                                        iZzg = i28;
                                                        unsafe4 = unsafe5;
                                                        i24 = i27;
                                                        if (iZzg != i22) {
                                                            i6 = i6;
                                                            zzgvxVar4 = zzgvxVar4;
                                                            i20 = i20;
                                                            obj3 = obj;
                                                            i3 = i3;
                                                            i36 = i24;
                                                            i37 = i20;
                                                            i38 = i6;
                                                            unsafe6 = unsafe4;
                                                            i35 = -1;
                                                            i39 = i9;
                                                            i40 = i10;
                                                            i2 = i23;
                                                        } else {
                                                            i6 = i6;
                                                            zzgvxVar4 = zzgvxVar4;
                                                            i20 = i20;
                                                            obj3 = obj;
                                                            i8 = iZzg;
                                                            i12 = i24;
                                                            i13 = i20;
                                                            zzgvxVar2 = zzgvxVar4;
                                                            unsafe2 = unsafe4;
                                                            i4 = i3;
                                                        }
                                                    } else {
                                                        zzgxsVar.zzi(com.google.android.gms.internal.ads.zzgvy.zzb(bArr, iZzh6));
                                                        i28 = iZzh6 + 4;
                                                    }
                                                    break;
                                                }
                                                i23 = i26;
                                                iZzg = i28;
                                                unsafe4 = unsafe5;
                                                i24 = i27;
                                                if (iZzg != i22) {
                                                    i6 = i6;
                                                    zzgvxVar4 = zzgvxVar4;
                                                    i20 = i20;
                                                    obj3 = obj;
                                                    i3 = i3;
                                                    i36 = i24;
                                                    i37 = i20;
                                                    i38 = i6;
                                                    unsafe6 = unsafe4;
                                                    i35 = -1;
                                                    i39 = i9;
                                                    i40 = i10;
                                                    i2 = i23;
                                                } else {
                                                    i6 = i6;
                                                    zzgvxVar4 = zzgvxVar4;
                                                    i20 = i20;
                                                    obj3 = obj;
                                                    i8 = iZzg;
                                                    i12 = i24;
                                                    i13 = i20;
                                                    zzgvxVar2 = zzgvxVar4;
                                                    unsafe2 = unsafe4;
                                                    i4 = i3;
                                                }
                                            }
                                            i23 = i26;
                                            unsafe4 = unsafe5;
                                            i24 = i27;
                                            iZzg = i22;
                                            if (iZzg != i22) {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i3 = i3;
                                                i36 = i24;
                                                i37 = i20;
                                                i38 = i6;
                                                unsafe6 = unsafe4;
                                                i35 = -1;
                                                i39 = i9;
                                                i40 = i10;
                                                i2 = i23;
                                            } else {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i8 = iZzg;
                                                i12 = i24;
                                                i13 = i20;
                                                zzgvxVar2 = zzgvxVar4;
                                                unsafe2 = unsafe4;
                                                i4 = i3;
                                            }
                                            break;
                                        } else {
                                            int i76 = com.google.android.gms.internal.ads.zzgvy.zza;
                                            com.google.android.gms.internal.ads.zzgxs zzgxsVar2 = (com.google.android.gms.internal.ads.zzgxs) zzgydVar;
                                            iZzf = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i22, zzgvxVar4);
                                            int i77 = zzgvxVar4.zza;
                                            int i78 = iZzf + i77;
                                            if (i78 > bArr.length) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgxsVar2.zzj(zzgxsVar2.size() + (i77 / 4));
                                            while (iZzf < i78) {
                                                zzgxsVar2.zzi(com.google.android.gms.internal.ads.zzgvy.zzb(bArr, iZzf));
                                                iZzf += 4;
                                            }
                                            if (iZzf != i78) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i23 = i26;
                                            iZzg = iZzf;
                                            unsafe4 = unsafe5;
                                            i24 = i27;
                                            if (iZzg != i22) {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i3 = i3;
                                                i36 = i24;
                                                i37 = i20;
                                                i38 = i6;
                                                unsafe6 = unsafe4;
                                                i35 = -1;
                                                i39 = i9;
                                                i40 = i10;
                                                i2 = i23;
                                            } else {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i8 = iZzg;
                                                i12 = i24;
                                                i13 = i20;
                                                zzgvxVar2 = zzgvxVar4;
                                                unsafe2 = unsafe4;
                                                i4 = i3;
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i22 = i41;
                                        i26 = i59;
                                        unsafe5 = unsafe3;
                                        i27 = i46;
                                        if (i44 != 2) {
                                            if (i44 == 0) {
                                                int i79 = com.google.android.gms.internal.ads.zzgvy.zza;
                                                com.google.android.gms.internal.ads.zzgvz zzgvzVar = (com.google.android.gms.internal.ads.zzgvz) zzgydVar;
                                                iZzf = com.google.android.gms.internal.ads.zzgvy.zzk(bArr, i22, zzgvxVar4);
                                                zzgvzVar.zzg(zzgvxVar4.zzb != 0);
                                                while (iZzf < i26) {
                                                    int iZzh7 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, iZzf, zzgvxVar4);
                                                    if (i6 == zzgvxVar4.zza) {
                                                        iZzf = com.google.android.gms.internal.ads.zzgvy.zzk(bArr, iZzh7, zzgvxVar4);
                                                        zzgvzVar.zzg(zzgvxVar4.zzb != 0);
                                                    }
                                                }
                                            }
                                            i23 = i26;
                                            unsafe4 = unsafe5;
                                            i24 = i27;
                                            iZzg = i22;
                                            if (iZzg != i22) {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i3 = i3;
                                                i36 = i24;
                                                i37 = i20;
                                                i38 = i6;
                                                unsafe6 = unsafe4;
                                                i35 = -1;
                                                i39 = i9;
                                                i40 = i10;
                                                i2 = i23;
                                            } else {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i8 = iZzg;
                                                i12 = i24;
                                                i13 = i20;
                                                zzgvxVar2 = zzgvxVar4;
                                                unsafe2 = unsafe4;
                                                i4 = i3;
                                            }
                                        } else {
                                            int i80 = com.google.android.gms.internal.ads.zzgvy.zza;
                                            com.google.android.gms.internal.ads.zzgvz zzgvzVar2 = (com.google.android.gms.internal.ads.zzgvz) zzgydVar;
                                            iZzf = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i22, zzgvxVar4);
                                            int i81 = zzgvxVar4.zza + iZzf;
                                            while (iZzf < i81) {
                                                iZzf = com.google.android.gms.internal.ads.zzgvy.zzk(bArr, iZzf, zzgvxVar4);
                                                zzgvzVar2.zzg(zzgvxVar4.zzb != 0);
                                            }
                                            if (iZzf != i81) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i23 = i26;
                                        iZzg = iZzf;
                                        unsafe4 = unsafe5;
                                        i24 = i27;
                                        if (iZzg != i22) {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i3 = i3;
                                            i36 = i24;
                                            i37 = i20;
                                            i38 = i6;
                                            unsafe6 = unsafe4;
                                            i35 = -1;
                                            i39 = i9;
                                            i40 = i10;
                                            i2 = i23;
                                        } else {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i8 = iZzg;
                                            i12 = i24;
                                            i13 = i20;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe2 = unsafe4;
                                            i4 = i3;
                                        }
                                        break;
                                    case 26:
                                        i22 = i41;
                                        i27 = i46;
                                        if (i44 != 2) {
                                            i23 = i59;
                                            i24 = i27;
                                            unsafe4 = unsafe3;
                                            i20 = i20;
                                            iZzg = i22;
                                        } else if ((j2 & 536870912) == 0) {
                                            int iZzh8 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i22, zzgvxVar4);
                                            int i82 = zzgvxVar4.zza;
                                            if (i82 < 0) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i82 == 0) {
                                                obj2 = "";
                                                zzgydVar.add(obj2);
                                            } else {
                                                obj2 = "";
                                                zzgydVar.add(new java.lang.String(bArr, iZzh8, i82, com.google.android.gms.internal.ads.zzgye.zza));
                                                iZzh8 += i82;
                                            }
                                            while (iZzh8 < i59) {
                                                int iZzh9 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, iZzh8, zzgvxVar4);
                                                if (i6 == zzgvxVar4.zza) {
                                                    iZzh8 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, iZzh9, zzgvxVar4);
                                                    int i83 = zzgvxVar4.zza;
                                                    if (i83 < 0) {
                                                        throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i83 == 0) {
                                                        zzgydVar.add(obj2);
                                                    } else {
                                                        zzgydVar.add(new java.lang.String(bArr, iZzh8, i83, com.google.android.gms.internal.ads.zzgye.zza));
                                                        iZzh8 += i83;
                                                    }
                                                } else {
                                                    i23 = i59;
                                                    iZzg = iZzh8;
                                                    i24 = i27;
                                                    unsafe4 = unsafe3;
                                                    i20 = i20;
                                                }
                                            }
                                            i23 = i59;
                                            iZzg = iZzh8;
                                            i24 = i27;
                                            unsafe4 = unsafe3;
                                            i20 = i20;
                                        } else {
                                            int iZzh10 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i22, zzgvxVar4);
                                            int i84 = zzgvxVar4.zza;
                                            if (i84 < 0) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i84 == 0) {
                                                zzgydVar.add("");
                                            } else {
                                                int i85 = iZzh10 + i84;
                                                if (!com.google.android.gms.internal.ads.zzhat.zzi(bArr, iZzh10, i85)) {
                                                    throw new com.google.android.gms.internal.ads.zzgyg("Protocol message had invalid UTF-8.");
                                                }
                                                zzgydVar.add(new java.lang.String(bArr, iZzh10, i84, com.google.android.gms.internal.ads.zzgye.zza));
                                                iZzh10 = i85;
                                            }
                                            while (iZzh10 < i59) {
                                                int iZzh11 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, iZzh10, zzgvxVar4);
                                                if (i6 == zzgvxVar4.zza) {
                                                    iZzh10 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, iZzh11, zzgvxVar4);
                                                    int i86 = zzgvxVar4.zza;
                                                    if (i86 < 0) {
                                                        throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i86 == 0) {
                                                        zzgydVar.add("");
                                                    } else {
                                                        int i87 = iZzh10 + i86;
                                                        if (!com.google.android.gms.internal.ads.zzhat.zzi(bArr, iZzh10, i87)) {
                                                            throw new com.google.android.gms.internal.ads.zzgyg("Protocol message had invalid UTF-8.");
                                                        }
                                                        zzgydVar.add(new java.lang.String(bArr, iZzh10, i86, com.google.android.gms.internal.ads.zzgye.zza));
                                                        iZzh10 = i87;
                                                    }
                                                } else {
                                                    i23 = i59;
                                                    iZzg = iZzh10;
                                                    unsafe4 = unsafe3;
                                                    i20 = i20;
                                                    i24 = i27;
                                                }
                                            }
                                            i23 = i59;
                                            iZzg = iZzh10;
                                            unsafe4 = unsafe3;
                                            i20 = i20;
                                            i24 = i27;
                                        }
                                        if (iZzg != i22) {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i3 = i3;
                                            i36 = i24;
                                            i37 = i20;
                                            i38 = i6;
                                            unsafe6 = unsafe4;
                                            i35 = -1;
                                            i39 = i9;
                                            i40 = i10;
                                            i2 = i23;
                                        } else {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i8 = iZzg;
                                            i12 = i24;
                                            i13 = i20;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe2 = unsafe4;
                                            i4 = i3;
                                        }
                                        break;
                                    case 27:
                                        i29 = i41;
                                        i59 = i59;
                                        unsafe3 = unsafe3;
                                        if (i44 == 2) {
                                            i22 = i29;
                                            int iZze = com.google.android.gms.internal.ads.zzgvy.zze(zzgzfVar.zzx(i20), i6, bArr, i29, i2, zzgydVar, zzgvxVar);
                                            i24 = i46;
                                            unsafe4 = unsafe3;
                                            i23 = i59;
                                            iZzg = iZze;
                                        } else {
                                            i22 = i29;
                                            unsafe4 = unsafe3;
                                            i23 = i59;
                                            i24 = i46;
                                            iZzg = i22;
                                        }
                                        if (iZzg != i22) {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i3 = i3;
                                            i36 = i24;
                                            i37 = i20;
                                            i38 = i6;
                                            unsafe6 = unsafe4;
                                            i35 = -1;
                                            i39 = i9;
                                            i40 = i10;
                                            i2 = i23;
                                        } else {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i8 = iZzg;
                                            i12 = i24;
                                            i13 = i20;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe2 = unsafe4;
                                            i4 = i3;
                                        }
                                        break;
                                    case 28:
                                        i29 = i41;
                                        i59 = i59;
                                        unsafe3 = unsafe3;
                                        if (i44 == 2) {
                                            iZzg = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i29, zzgvxVar4);
                                            int i88 = zzgvxVar4.zza;
                                            if (i88 < 0) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i88 > bArr.length - iZzg) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i88 == 0) {
                                                zzgydVar.add(com.google.android.gms.internal.ads.zzgwj.zzb);
                                            } else {
                                                zzgydVar.add(com.google.android.gms.internal.ads.zzgwj.zzv(bArr, iZzg, i88));
                                                iZzg += i88;
                                            }
                                            while (iZzg < i59) {
                                                int iZzh12 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, iZzg, zzgvxVar4);
                                                if (i6 != zzgvxVar4.zza) {
                                                    i22 = i29;
                                                    unsafe4 = unsafe3;
                                                    i23 = i59;
                                                    i24 = i46;
                                                    if (iZzg != i22) {
                                                        i6 = i6;
                                                        zzgvxVar4 = zzgvxVar4;
                                                        i20 = i20;
                                                        obj3 = obj;
                                                        i3 = i3;
                                                        i36 = i24;
                                                        i37 = i20;
                                                        i38 = i6;
                                                        unsafe6 = unsafe4;
                                                        i35 = -1;
                                                        i39 = i9;
                                                        i40 = i10;
                                                        i2 = i23;
                                                    } else {
                                                        i6 = i6;
                                                        zzgvxVar4 = zzgvxVar4;
                                                        i20 = i20;
                                                        obj3 = obj;
                                                        i8 = iZzg;
                                                        i12 = i24;
                                                        i13 = i20;
                                                        zzgvxVar2 = zzgvxVar4;
                                                        unsafe2 = unsafe4;
                                                        i4 = i3;
                                                    }
                                                    break;
                                                } else {
                                                    iZzg = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, iZzh12, zzgvxVar4);
                                                    int i89 = zzgvxVar4.zza;
                                                    if (i89 < 0) {
                                                        throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i89 > bArr.length - iZzg) {
                                                        throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i89 == 0) {
                                                        zzgydVar.add(com.google.android.gms.internal.ads.zzgwj.zzb);
                                                    } else {
                                                        zzgydVar.add(com.google.android.gms.internal.ads.zzgwj.zzv(bArr, iZzg, i89));
                                                        iZzg += i89;
                                                    }
                                                }
                                            }
                                            i22 = i29;
                                            unsafe4 = unsafe3;
                                            i23 = i59;
                                            i24 = i46;
                                            if (iZzg != i22) {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i3 = i3;
                                                i36 = i24;
                                                i37 = i20;
                                                i38 = i6;
                                                unsafe6 = unsafe4;
                                                i35 = -1;
                                                i39 = i9;
                                                i40 = i10;
                                                i2 = i23;
                                            } else {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i8 = iZzg;
                                                i12 = i24;
                                                i13 = i20;
                                                zzgvxVar2 = zzgvxVar4;
                                                unsafe2 = unsafe4;
                                                i4 = i3;
                                            }
                                        }
                                        i22 = i29;
                                        unsafe4 = unsafe3;
                                        i23 = i59;
                                        i24 = i46;
                                        iZzg = i22;
                                        if (iZzg != i22) {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i3 = i3;
                                            i36 = i24;
                                            i37 = i20;
                                            i38 = i6;
                                            unsafe6 = unsafe4;
                                            i35 = -1;
                                            i39 = i9;
                                            i40 = i10;
                                            i2 = i23;
                                        } else {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i8 = iZzg;
                                            i12 = i24;
                                            i13 = i20;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe2 = unsafe4;
                                            i4 = i3;
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        if (i44 != 2) {
                                            if (i44 == 0) {
                                                iZzj = com.google.android.gms.internal.ads.zzgvy.zzj(i6, bArr, i41, i2, zzgydVar, zzgvxVar);
                                            }
                                            i22 = i41;
                                            i23 = i59;
                                            unsafe4 = unsafe3;
                                            i24 = i46;
                                            iZzg = i22;
                                            if (iZzg != i22) {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i3 = i3;
                                                i36 = i24;
                                                i37 = i20;
                                                i38 = i6;
                                                unsafe6 = unsafe4;
                                                i35 = -1;
                                                i39 = i9;
                                                i40 = i10;
                                                i2 = i23;
                                            } else {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i8 = iZzg;
                                                i12 = i24;
                                                i13 = i20;
                                                zzgvxVar2 = zzgvxVar4;
                                                unsafe2 = unsafe4;
                                                i4 = i3;
                                            }
                                        } else {
                                            iZzj = com.google.android.gms.internal.ads.zzgvy.zzf(bArr, i41, zzgydVar, zzgvxVar4);
                                        }
                                        com.google.android.gms.internal.ads.zzgzx.zzn(obj, i46, zzgydVar, zzgzfVar.zzw(i20), null, zzgzfVar.zzm);
                                        i22 = i41;
                                        iZzg = iZzj;
                                        unsafe4 = unsafe3;
                                        i23 = i59;
                                        i24 = i46;
                                        if (iZzg != i22) {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i3 = i3;
                                            i36 = i24;
                                            i37 = i20;
                                            i38 = i6;
                                            unsafe6 = unsafe4;
                                            i35 = -1;
                                            i39 = i9;
                                            i40 = i10;
                                            i2 = i23;
                                        } else {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i8 = iZzg;
                                            i12 = i24;
                                            i13 = i20;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe2 = unsafe4;
                                            i4 = i3;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        if (i44 != 2) {
                                            if (i44 == 0) {
                                                int i90 = com.google.android.gms.internal.ads.zzgvy.zza;
                                                com.google.android.gms.internal.ads.zzgxs zzgxsVar3 = (com.google.android.gms.internal.ads.zzgxs) zzgydVar;
                                                iZzg = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i41, zzgvxVar4);
                                                zzgxsVar3.zzi(com.google.android.gms.internal.ads.zzgwp.zzD(zzgvxVar4.zza));
                                                while (iZzg < i59) {
                                                    int iZzh13 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, iZzg, zzgvxVar4);
                                                    if (i6 == zzgvxVar4.zza) {
                                                        iZzg = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, iZzh13, zzgvxVar4);
                                                        zzgxsVar3.zzi(com.google.android.gms.internal.ads.zzgwp.zzD(zzgvxVar4.zza));
                                                    }
                                                }
                                            }
                                            i22 = i41;
                                            i23 = i59;
                                            unsafe4 = unsafe3;
                                            i24 = i46;
                                            iZzg = i22;
                                            if (iZzg != i22) {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i3 = i3;
                                                i36 = i24;
                                                i37 = i20;
                                                i38 = i6;
                                                unsafe6 = unsafe4;
                                                i35 = -1;
                                                i39 = i9;
                                                i40 = i10;
                                                i2 = i23;
                                            } else {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i8 = iZzg;
                                                i12 = i24;
                                                i13 = i20;
                                                zzgvxVar2 = zzgvxVar4;
                                                unsafe2 = unsafe4;
                                                i4 = i3;
                                            }
                                        } else {
                                            int i91 = com.google.android.gms.internal.ads.zzgvy.zza;
                                            com.google.android.gms.internal.ads.zzgxs zzgxsVar4 = (com.google.android.gms.internal.ads.zzgxs) zzgydVar;
                                            iZzg = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i41, zzgvxVar4);
                                            int i92 = zzgvxVar4.zza + iZzg;
                                            while (iZzg < i92) {
                                                iZzg = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, iZzg, zzgvxVar4);
                                                zzgxsVar4.zzi(com.google.android.gms.internal.ads.zzgwp.zzD(zzgvxVar4.zza));
                                            }
                                            if (iZzg != i92) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i22 = i41;
                                        i23 = i59;
                                        unsafe4 = unsafe3;
                                        i24 = i46;
                                        if (iZzg != i22) {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i3 = i3;
                                            i36 = i24;
                                            i37 = i20;
                                            i38 = i6;
                                            unsafe6 = unsafe4;
                                            i35 = -1;
                                            i39 = i9;
                                            i40 = i10;
                                            i2 = i23;
                                        } else {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i8 = iZzg;
                                            i12 = i24;
                                            i13 = i20;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe2 = unsafe4;
                                            i4 = i3;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i44 != 2) {
                                            if (i44 == 0) {
                                                int i93 = com.google.android.gms.internal.ads.zzgvy.zza;
                                                com.google.android.gms.internal.ads.zzgyr zzgyrVar5 = (com.google.android.gms.internal.ads.zzgyr) zzgydVar;
                                                iZzg = com.google.android.gms.internal.ads.zzgvy.zzk(bArr, i41, zzgvxVar4);
                                                zzgyrVar5.zzg(com.google.android.gms.internal.ads.zzgwp.zzF(zzgvxVar4.zzb));
                                                while (iZzg < i59) {
                                                    int iZzh14 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, iZzg, zzgvxVar4);
                                                    if (i6 == zzgvxVar4.zza) {
                                                        iZzg = com.google.android.gms.internal.ads.zzgvy.zzk(bArr, iZzh14, zzgvxVar4);
                                                        zzgyrVar5.zzg(com.google.android.gms.internal.ads.zzgwp.zzF(zzgvxVar4.zzb));
                                                    }
                                                }
                                            }
                                            i22 = i41;
                                            i23 = i59;
                                            unsafe4 = unsafe3;
                                            i24 = i46;
                                            iZzg = i22;
                                            if (iZzg != i22) {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i3 = i3;
                                                i36 = i24;
                                                i37 = i20;
                                                i38 = i6;
                                                unsafe6 = unsafe4;
                                                i35 = -1;
                                                i39 = i9;
                                                i40 = i10;
                                                i2 = i23;
                                            } else {
                                                i6 = i6;
                                                zzgvxVar4 = zzgvxVar4;
                                                i20 = i20;
                                                obj3 = obj;
                                                i8 = iZzg;
                                                i12 = i24;
                                                i13 = i20;
                                                zzgvxVar2 = zzgvxVar4;
                                                unsafe2 = unsafe4;
                                                i4 = i3;
                                            }
                                        } else {
                                            int i94 = com.google.android.gms.internal.ads.zzgvy.zza;
                                            com.google.android.gms.internal.ads.zzgyr zzgyrVar6 = (com.google.android.gms.internal.ads.zzgyr) zzgydVar;
                                            iZzg = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i41, zzgvxVar4);
                                            int i95 = zzgvxVar4.zza + iZzg;
                                            while (iZzg < i95) {
                                                iZzg = com.google.android.gms.internal.ads.zzgvy.zzk(bArr, iZzg, zzgvxVar4);
                                                zzgyrVar6.zzg(com.google.android.gms.internal.ads.zzgwp.zzF(zzgvxVar4.zzb));
                                            }
                                            if (iZzg != i95) {
                                                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i22 = i41;
                                        i23 = i59;
                                        unsafe4 = unsafe3;
                                        i24 = i46;
                                        if (iZzg != i22) {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i3 = i3;
                                            i36 = i24;
                                            i37 = i20;
                                            i38 = i6;
                                            unsafe6 = unsafe4;
                                            i35 = -1;
                                            i39 = i9;
                                            i40 = i10;
                                            i2 = i23;
                                        } else {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i8 = iZzg;
                                            i12 = i24;
                                            i13 = i20;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe2 = unsafe4;
                                            i4 = i3;
                                        }
                                        break;
                                    default:
                                        i22 = i41;
                                        i23 = i59;
                                        unsafe4 = unsafe3;
                                        i24 = i46;
                                        if (i44 == 3) {
                                            int i96 = (i6 & (-8)) | 4;
                                            com.google.android.gms.internal.ads.zzgzv zzgzvVarZzx = zzgzfVar.zzx(i20);
                                            iZzg = com.google.android.gms.internal.ads.zzgvy.zzc(zzgzvVarZzx, bArr, i22, i2, i96, zzgvxVar);
                                            zzgydVar.add(zzgvxVar4.zzc);
                                            while (iZzg < i23) {
                                                int iZzh15 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, iZzg, zzgvxVar4);
                                                if (i6 == zzgvxVar4.zza) {
                                                    iZzg = com.google.android.gms.internal.ads.zzgvy.zzc(zzgzvVarZzx, bArr, iZzh15, i2, i96, zzgvxVar);
                                                    zzgydVar.add(zzgvxVar4.zzc);
                                                }
                                            }
                                        } else {
                                            iZzg = i22;
                                        }
                                        if (iZzg != i22) {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i3 = i3;
                                            i36 = i24;
                                            i37 = i20;
                                            i38 = i6;
                                            unsafe6 = unsafe4;
                                            i35 = -1;
                                            i39 = i9;
                                            i40 = i10;
                                            i2 = i23;
                                        } else {
                                            i6 = i6;
                                            zzgvxVar4 = zzgvxVar4;
                                            i20 = i20;
                                            obj3 = obj;
                                            i8 = iZzg;
                                            i12 = i24;
                                            i13 = i20;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe2 = unsafe4;
                                            i4 = i3;
                                        }
                                        break;
                                }
                            } else {
                                int i97 = i41;
                                i12 = i46;
                                if (iZzt != 50) {
                                    obj3 = obj;
                                    sun.misc.Unsafe unsafe9 = zzb;
                                    long j3 = iArr[i20 + 2] & 1048575;
                                    switch (iZzt) {
                                        case 51:
                                            i30 = i97;
                                            i31 = i20;
                                            unsafe2 = unsafe3;
                                            zzgvxVar2 = zzgvxVar;
                                            i32 = i6;
                                            zzgzfVar = this;
                                            if (i44 == 1) {
                                                iZzk2 = i30 + 8;
                                                unsafe9.putObject(obj3, j, java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.ads.zzgvy.zzn(bArr, i30))));
                                                unsafe9.putInt(obj3, j3, i12);
                                            } else {
                                                iZzk2 = i30;
                                            }
                                            if (iZzk2 == i30) {
                                                i12 = i12;
                                                i37 = i31;
                                                i2 = i2;
                                                i3 = i3;
                                                iZzg = iZzk2;
                                                i36 = i12;
                                                zzgvxVar4 = zzgvxVar2;
                                                i35 = -1;
                                                i39 = i9;
                                                unsafe6 = unsafe2;
                                                i38 = i32;
                                                i40 = i10;
                                            } else {
                                                i12 = i12;
                                                i13 = i31;
                                                i4 = i3;
                                                i8 = iZzk2;
                                                i6 = i32;
                                            }
                                            break;
                                        case 52:
                                            i30 = i97;
                                            i31 = i20;
                                            unsafe2 = unsafe3;
                                            zzgvxVar2 = zzgvxVar;
                                            i32 = i6;
                                            zzgzfVar = this;
                                            if (i44 == 5) {
                                                iZzk2 = i30 + 4;
                                                unsafe9.putObject(obj3, j, java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.ads.zzgvy.zzb(bArr, i30))));
                                                unsafe9.putInt(obj3, j3, i12);
                                            } else {
                                                iZzk2 = i30;
                                            }
                                            if (iZzk2 == i30) {
                                                i12 = i12;
                                                i37 = i31;
                                                i2 = i2;
                                                i3 = i3;
                                                iZzg = iZzk2;
                                                i36 = i12;
                                                zzgvxVar4 = zzgvxVar2;
                                                i35 = -1;
                                                i39 = i9;
                                                unsafe6 = unsafe2;
                                                i38 = i32;
                                                i40 = i10;
                                            } else {
                                                i12 = i12;
                                                i13 = i31;
                                                i4 = i3;
                                                i8 = iZzk2;
                                                i6 = i32;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i30 = i97;
                                            i31 = i20;
                                            unsafe2 = unsafe3;
                                            zzgvxVar2 = zzgvxVar;
                                            i32 = i6;
                                            zzgzfVar = this;
                                            if (i44 == 0) {
                                                iZzk2 = com.google.android.gms.internal.ads.zzgvy.zzk(bArr, i30, zzgvxVar2);
                                                unsafe9.putObject(obj3, j, java.lang.Long.valueOf(zzgvxVar2.zzb));
                                                unsafe9.putInt(obj3, j3, i12);
                                            } else {
                                                iZzk2 = i30;
                                            }
                                            if (iZzk2 == i30) {
                                                i12 = i12;
                                                i37 = i31;
                                                i2 = i2;
                                                i3 = i3;
                                                iZzg = iZzk2;
                                                i36 = i12;
                                                zzgvxVar4 = zzgvxVar2;
                                                i35 = -1;
                                                i39 = i9;
                                                unsafe6 = unsafe2;
                                                i38 = i32;
                                                i40 = i10;
                                            } else {
                                                i12 = i12;
                                                i13 = i31;
                                                i4 = i3;
                                                i8 = iZzk2;
                                                i6 = i32;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i30 = i97;
                                            i31 = i20;
                                            unsafe2 = unsafe3;
                                            zzgvxVar2 = zzgvxVar;
                                            i32 = i6;
                                            zzgzfVar = this;
                                            if (i44 == 0) {
                                                iZzk2 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i30, zzgvxVar2);
                                                unsafe9.putObject(obj3, j, java.lang.Integer.valueOf(zzgvxVar2.zza));
                                                unsafe9.putInt(obj3, j3, i12);
                                            } else {
                                                iZzk2 = i30;
                                            }
                                            if (iZzk2 == i30) {
                                                i12 = i12;
                                                i37 = i31;
                                                i2 = i2;
                                                i3 = i3;
                                                iZzg = iZzk2;
                                                i36 = i12;
                                                zzgvxVar4 = zzgvxVar2;
                                                i35 = -1;
                                                i39 = i9;
                                                unsafe6 = unsafe2;
                                                i38 = i32;
                                                i40 = i10;
                                            } else {
                                                i12 = i12;
                                                i13 = i31;
                                                i4 = i3;
                                                i8 = iZzk2;
                                                i6 = i32;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i30 = i97;
                                            i31 = i20;
                                            unsafe2 = unsafe3;
                                            zzgvxVar2 = zzgvxVar;
                                            i32 = i6;
                                            zzgzfVar = this;
                                            if (i44 == 1) {
                                                iZzk2 = i30 + 8;
                                                unsafe9.putObject(obj3, j, java.lang.Long.valueOf(com.google.android.gms.internal.ads.zzgvy.zzn(bArr, i30)));
                                                unsafe9.putInt(obj3, j3, i12);
                                            } else {
                                                iZzk2 = i30;
                                            }
                                            if (iZzk2 == i30) {
                                                i12 = i12;
                                                i37 = i31;
                                                i2 = i2;
                                                i3 = i3;
                                                iZzg = iZzk2;
                                                i36 = i12;
                                                zzgvxVar4 = zzgvxVar2;
                                                i35 = -1;
                                                i39 = i9;
                                                unsafe6 = unsafe2;
                                                i38 = i32;
                                                i40 = i10;
                                            } else {
                                                i12 = i12;
                                                i13 = i31;
                                                i4 = i3;
                                                i8 = iZzk2;
                                                i6 = i32;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i30 = i97;
                                            i31 = i20;
                                            unsafe2 = unsafe3;
                                            zzgvxVar2 = zzgvxVar;
                                            i32 = i6;
                                            zzgzfVar = this;
                                            if (i44 == 5) {
                                                iZzk2 = i30 + 4;
                                                unsafe9.putObject(obj3, j, java.lang.Integer.valueOf(com.google.android.gms.internal.ads.zzgvy.zzb(bArr, i30)));
                                                unsafe9.putInt(obj3, j3, i12);
                                            } else {
                                                iZzk2 = i30;
                                            }
                                            if (iZzk2 == i30) {
                                                i12 = i12;
                                                i37 = i31;
                                                i2 = i2;
                                                i3 = i3;
                                                iZzg = iZzk2;
                                                i36 = i12;
                                                zzgvxVar4 = zzgvxVar2;
                                                i35 = -1;
                                                i39 = i9;
                                                unsafe6 = unsafe2;
                                                i38 = i32;
                                                i40 = i10;
                                            } else {
                                                i12 = i12;
                                                i13 = i31;
                                                i4 = i3;
                                                i8 = iZzk2;
                                                i6 = i32;
                                            }
                                            break;
                                        case 58:
                                            i30 = i97;
                                            i31 = i20;
                                            unsafe2 = unsafe3;
                                            zzgvxVar2 = zzgvxVar;
                                            i32 = i6;
                                            zzgzfVar = this;
                                            if (i44 == 0) {
                                                iZzk2 = com.google.android.gms.internal.ads.zzgvy.zzk(bArr, i30, zzgvxVar2);
                                                unsafe9.putObject(obj3, j, java.lang.Boolean.valueOf(zzgvxVar2.zzb != 0));
                                                unsafe9.putInt(obj3, j3, i12);
                                            } else {
                                                iZzk2 = i30;
                                            }
                                            if (iZzk2 == i30) {
                                                i12 = i12;
                                                i37 = i31;
                                                i2 = i2;
                                                i3 = i3;
                                                iZzg = iZzk2;
                                                i36 = i12;
                                                zzgvxVar4 = zzgvxVar2;
                                                i35 = -1;
                                                i39 = i9;
                                                unsafe6 = unsafe2;
                                                i38 = i32;
                                                i40 = i10;
                                            } else {
                                                i12 = i12;
                                                i13 = i31;
                                                i4 = i3;
                                                i8 = iZzk2;
                                                i6 = i32;
                                            }
                                            break;
                                        case 59:
                                            i30 = i97;
                                            i31 = i20;
                                            unsafe2 = unsafe3;
                                            zzgvxVar2 = zzgvxVar;
                                            i32 = i6;
                                            zzgzfVar = this;
                                            if (i44 == 2) {
                                                iZzk2 = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i30, zzgvxVar2);
                                                int i98 = zzgvxVar2.zza;
                                                if (i98 == 0) {
                                                    unsafe9.putObject(obj3, j, "");
                                                } else {
                                                    int i99 = iZzk2 + i98;
                                                    if ((i45 & 536870912) != 0 && !com.google.android.gms.internal.ads.zzhat.zzi(bArr, iZzk2, i99)) {
                                                        throw new com.google.android.gms.internal.ads.zzgyg("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe9.putObject(obj3, j, new java.lang.String(bArr, iZzk2, i98, com.google.android.gms.internal.ads.zzgye.zza));
                                                    iZzk2 = i99;
                                                }
                                                unsafe9.putInt(obj3, j3, i12);
                                            } else {
                                                iZzk2 = i30;
                                            }
                                            if (iZzk2 == i30) {
                                                i12 = i12;
                                                i37 = i31;
                                                i2 = i2;
                                                i3 = i3;
                                                iZzg = iZzk2;
                                                i36 = i12;
                                                zzgvxVar4 = zzgvxVar2;
                                                i35 = -1;
                                                i39 = i9;
                                                unsafe6 = unsafe2;
                                                i38 = i32;
                                                i40 = i10;
                                            } else {
                                                i12 = i12;
                                                i13 = i31;
                                                i4 = i3;
                                                i8 = iZzk2;
                                                i6 = i32;
                                            }
                                            break;
                                        case 60:
                                            zzgzfVar = this;
                                            if (i44 == 2) {
                                                java.lang.Object objZzB = zzgzfVar.zzB(obj3, i12, i20);
                                                com.google.android.gms.internal.ads.zzgzv zzgzvVarZzx2 = zzgzfVar.zzx(i20);
                                                i32 = i6;
                                                zzgvxVar2 = zzgvxVar;
                                                int iZzm = com.google.android.gms.internal.ads.zzgvy.zzm(objZzB, zzgzvVarZzx2, bArr, i97, i2, zzgvxVar);
                                                zzgzfVar.zzK(obj3, i12, i20, objZzB);
                                                iZzk2 = iZzm;
                                                i31 = i20;
                                                unsafe2 = unsafe3;
                                                i30 = i97;
                                            } else {
                                                i32 = i6;
                                                zzgvxVar2 = zzgvxVar;
                                                i31 = i20;
                                                i30 = i97;
                                                unsafe2 = unsafe3;
                                                iZzk2 = i30;
                                            }
                                            if (iZzk2 == i30) {
                                                i12 = i12;
                                                i37 = i31;
                                                i2 = i2;
                                                i3 = i3;
                                                iZzg = iZzk2;
                                                i36 = i12;
                                                zzgvxVar4 = zzgvxVar2;
                                                i35 = -1;
                                                i39 = i9;
                                                unsafe6 = unsafe2;
                                                i38 = i32;
                                                i40 = i10;
                                            } else {
                                                i12 = i12;
                                                i13 = i31;
                                                i4 = i3;
                                                i8 = iZzk2;
                                                i6 = i32;
                                            }
                                            break;
                                        case 61:
                                            i33 = i20;
                                            i34 = i6;
                                            zzgzfVar = this;
                                            zzgvxVar3 = zzgvxVar;
                                            if (i44 == 2) {
                                                iZza = com.google.android.gms.internal.ads.zzgvy.zza(bArr, i97, zzgvxVar3);
                                                unsafe9.putObject(obj3, j, zzgvxVar3.zzc);
                                                unsafe9.putInt(obj3, j3, i12);
                                                iZzk2 = iZza;
                                                i31 = i33;
                                                i30 = i97;
                                                unsafe2 = unsafe3;
                                                i32 = i34;
                                                zzgvxVar2 = zzgvxVar3;
                                                if (iZzk2 == i30) {
                                                    i12 = i12;
                                                    i37 = i31;
                                                    i2 = i2;
                                                    i3 = i3;
                                                    iZzg = iZzk2;
                                                    i36 = i12;
                                                    zzgvxVar4 = zzgvxVar2;
                                                    i35 = -1;
                                                    i39 = i9;
                                                    unsafe6 = unsafe2;
                                                    i38 = i32;
                                                    i40 = i10;
                                                } else {
                                                    i12 = i12;
                                                    i13 = i31;
                                                    i4 = i3;
                                                    i8 = iZzk2;
                                                    i6 = i32;
                                                }
                                            }
                                            i31 = i33;
                                            i30 = i97;
                                            unsafe2 = unsafe3;
                                            i32 = i34;
                                            zzgvxVar2 = zzgvxVar3;
                                            iZzk2 = i30;
                                            if (iZzk2 == i30) {
                                                i12 = i12;
                                                i37 = i31;
                                                i2 = i2;
                                                i3 = i3;
                                                iZzg = iZzk2;
                                                i36 = i12;
                                                zzgvxVar4 = zzgvxVar2;
                                                i35 = -1;
                                                i39 = i9;
                                                unsafe6 = unsafe2;
                                                i38 = i32;
                                                i40 = i10;
                                            } else {
                                                i12 = i12;
                                                i13 = i31;
                                                i4 = i3;
                                                i8 = iZzk2;
                                                i6 = i32;
                                            }
                                            break;
                                        case 63:
                                            i33 = i20;
                                            i34 = i6;
                                            zzgzfVar = this;
                                            zzgvxVar3 = zzgvxVar;
                                            if (i44 == 0) {
                                                iZza = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i97, zzgvxVar3);
                                                int i100 = zzgvxVar3.zza;
                                                com.google.android.gms.internal.ads.zzgxx zzgxxVarZzw2 = zzgzfVar.zzw(i33);
                                                if (zzgxxVarZzw2 == null || zzgxxVarZzw2.zza(i100)) {
                                                    unsafe9.putObject(obj3, j, java.lang.Integer.valueOf(i100));
                                                    unsafe9.putInt(obj3, j3, i12);
                                                } else {
                                                    zzd(obj).zzj(i34, java.lang.Long.valueOf(i100));
                                                }
                                                iZzk2 = iZza;
                                                i31 = i33;
                                                i30 = i97;
                                                unsafe2 = unsafe3;
                                                i32 = i34;
                                                zzgvxVar2 = zzgvxVar3;
                                                if (iZzk2 == i30) {
                                                    i12 = i12;
                                                    i37 = i31;
                                                    i2 = i2;
                                                    i3 = i3;
                                                    iZzg = iZzk2;
                                                    i36 = i12;
                                                    zzgvxVar4 = zzgvxVar2;
                                                    i35 = -1;
                                                    i39 = i9;
                                                    unsafe6 = unsafe2;
                                                    i38 = i32;
                                                    i40 = i10;
                                                } else {
                                                    i12 = i12;
                                                    i13 = i31;
                                                    i4 = i3;
                                                    i8 = iZzk2;
                                                    i6 = i32;
                                                }
                                            }
                                            i31 = i33;
                                            i30 = i97;
                                            unsafe2 = unsafe3;
                                            i32 = i34;
                                            zzgvxVar2 = zzgvxVar3;
                                            iZzk2 = i30;
                                            if (iZzk2 == i30) {
                                                i12 = i12;
                                                i37 = i31;
                                                i2 = i2;
                                                i3 = i3;
                                                iZzg = iZzk2;
                                                i36 = i12;
                                                zzgvxVar4 = zzgvxVar2;
                                                i35 = -1;
                                                i39 = i9;
                                                unsafe6 = unsafe2;
                                                i38 = i32;
                                                i40 = i10;
                                            } else {
                                                i12 = i12;
                                                i13 = i31;
                                                i4 = i3;
                                                i8 = iZzk2;
                                                i6 = i32;
                                            }
                                            break;
                                        case 66:
                                            i33 = i20;
                                            i34 = i6;
                                            zzgzfVar = this;
                                            zzgvxVar3 = zzgvxVar;
                                            if (i44 == 0) {
                                                iZza = com.google.android.gms.internal.ads.zzgvy.zzh(bArr, i97, zzgvxVar3);
                                                unsafe9.putObject(obj3, j, java.lang.Integer.valueOf(com.google.android.gms.internal.ads.zzgwp.zzD(zzgvxVar3.zza)));
                                                unsafe9.putInt(obj3, j3, i12);
                                                iZzk2 = iZza;
                                                i31 = i33;
                                                i30 = i97;
                                                unsafe2 = unsafe3;
                                                i32 = i34;
                                                zzgvxVar2 = zzgvxVar3;
                                                if (iZzk2 == i30) {
                                                    i12 = i12;
                                                    i37 = i31;
                                                    i2 = i2;
                                                    i3 = i3;
                                                    iZzg = iZzk2;
                                                    i36 = i12;
                                                    zzgvxVar4 = zzgvxVar2;
                                                    i35 = -1;
                                                    i39 = i9;
                                                    unsafe6 = unsafe2;
                                                    i38 = i32;
                                                    i40 = i10;
                                                } else {
                                                    i12 = i12;
                                                    i13 = i31;
                                                    i4 = i3;
                                                    i8 = iZzk2;
                                                    i6 = i32;
                                                }
                                            }
                                            i31 = i33;
                                            i30 = i97;
                                            unsafe2 = unsafe3;
                                            i32 = i34;
                                            zzgvxVar2 = zzgvxVar3;
                                            iZzk2 = i30;
                                            if (iZzk2 == i30) {
                                                i12 = i12;
                                                i37 = i31;
                                                i2 = i2;
                                                i3 = i3;
                                                iZzg = iZzk2;
                                                i36 = i12;
                                                zzgvxVar4 = zzgvxVar2;
                                                i35 = -1;
                                                i39 = i9;
                                                unsafe6 = unsafe2;
                                                i38 = i32;
                                                i40 = i10;
                                            } else {
                                                i12 = i12;
                                                i13 = i31;
                                                i4 = i3;
                                                i8 = iZzk2;
                                                i6 = i32;
                                            }
                                            break;
                                        case 67:
                                            i33 = i20;
                                            i34 = i6;
                                            zzgzfVar = this;
                                            zzgvxVar3 = zzgvxVar;
                                            if (i44 == 0) {
                                                int iZzk4 = com.google.android.gms.internal.ads.zzgvy.zzk(bArr, i97, zzgvxVar3);
                                                unsafe9.putObject(obj3, j, java.lang.Long.valueOf(com.google.android.gms.internal.ads.zzgwp.zzF(zzgvxVar3.zzb)));
                                                unsafe9.putInt(obj3, j3, i12);
                                                iZzk2 = iZzk4;
                                                i31 = i33;
                                                i30 = i97;
                                                unsafe2 = unsafe3;
                                                i32 = i34;
                                                zzgvxVar2 = zzgvxVar3;
                                                if (iZzk2 == i30) {
                                                    i12 = i12;
                                                    i37 = i31;
                                                    i2 = i2;
                                                    i3 = i3;
                                                    iZzg = iZzk2;
                                                    i36 = i12;
                                                    zzgvxVar4 = zzgvxVar2;
                                                    i35 = -1;
                                                    i39 = i9;
                                                    unsafe6 = unsafe2;
                                                    i38 = i32;
                                                    i40 = i10;
                                                } else {
                                                    i12 = i12;
                                                    i13 = i31;
                                                    i4 = i3;
                                                    i8 = iZzk2;
                                                    i6 = i32;
                                                }
                                            }
                                            i31 = i33;
                                            i30 = i97;
                                            unsafe2 = unsafe3;
                                            i32 = i34;
                                            zzgvxVar2 = zzgvxVar3;
                                            iZzk2 = i30;
                                            if (iZzk2 == i30) {
                                                i12 = i12;
                                                i37 = i31;
                                                i2 = i2;
                                                i3 = i3;
                                                iZzg = iZzk2;
                                                i36 = i12;
                                                zzgvxVar4 = zzgvxVar2;
                                                i35 = -1;
                                                i39 = i9;
                                                unsafe6 = unsafe2;
                                                i38 = i32;
                                                i40 = i10;
                                            } else {
                                                i12 = i12;
                                                i13 = i31;
                                                i4 = i3;
                                                i8 = iZzk2;
                                                i6 = i32;
                                            }
                                            break;
                                        case 68:
                                            if (i44 == 3) {
                                                zzgzfVar = this;
                                                java.lang.Object objZzB2 = zzgzfVar.zzB(obj3, i12, i20);
                                                int iZzl2 = com.google.android.gms.internal.ads.zzgvy.zzl(objZzB2, zzgzfVar.zzx(i20), bArr, i97, i2, (i6 & (-8)) | 4, zzgvxVar);
                                                zzgzfVar.zzK(obj3, i12, i20, objZzB2);
                                                i31 = i20;
                                                i30 = i97;
                                                zzgvxVar2 = zzgvxVar;
                                                unsafe2 = unsafe3;
                                                i32 = i6;
                                                iZzk2 = iZzl2;
                                            }
                                            if (iZzk2 == i30) {
                                                i12 = i12;
                                                i13 = i31;
                                                i4 = i3;
                                                i8 = iZzk2;
                                                i6 = i32;
                                                break;
                                            } else {
                                                i12 = i12;
                                                i37 = i31;
                                                i2 = i2;
                                                i3 = i3;
                                                iZzg = iZzk2;
                                                i36 = i12;
                                                zzgvxVar4 = zzgvxVar2;
                                                i35 = -1;
                                                i39 = i9;
                                                unsafe6 = unsafe2;
                                                i38 = i32;
                                                i40 = i10;
                                                break;
                                            }
                                        default:
                                            zzgzfVar = this;
                                            i30 = i97;
                                            i31 = i20;
                                            unsafe2 = unsafe3;
                                            zzgvxVar2 = zzgvxVar;
                                            i32 = i6;
                                            iZzk2 = i30;
                                            if (iZzk2 == i30) {
                                                i12 = i12;
                                                i37 = i31;
                                                i2 = i2;
                                                i3 = i3;
                                                iZzg = iZzk2;
                                                i36 = i12;
                                                zzgvxVar4 = zzgvxVar2;
                                                i35 = -1;
                                                i39 = i9;
                                                unsafe6 = unsafe2;
                                                i38 = i32;
                                                i40 = i10;
                                            } else {
                                                i12 = i12;
                                                i13 = i31;
                                                i4 = i3;
                                                i8 = iZzk2;
                                                i6 = i32;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i44 == 2) {
                                        sun.misc.Unsafe unsafe10 = zzb;
                                        java.lang.Object objZzz = zzgzfVar.zzz(i20);
                                        java.lang.Object object = unsafe10.getObject(obj, j);
                                        if (com.google.android.gms.internal.ads.zzgyx.zza(object)) {
                                            com.google.android.gms.internal.ads.zzgyw zzgywVarZzb = com.google.android.gms.internal.ads.zzgyw.zza().zzb();
                                            com.google.android.gms.internal.ads.zzgyx.zzb(zzgywVarZzb, object);
                                            unsafe10.putObject(obj, j, zzgywVarZzb);
                                        }
                                        throw null;
                                    }
                                    i21 = i97;
                                    obj3 = obj;
                                    i4 = i3;
                                    i8 = i21;
                                    i13 = i20;
                                    zzgvxVar2 = zzgvxVar4;
                                    unsafe2 = unsafe3;
                                }
                            }
                        } else if (i44 == 2) {
                            com.google.android.gms.internal.ads.zzgyd zzgydVarZzf2 = (com.google.android.gms.internal.ads.zzgyd) unsafe7.getObject(obj3, j);
                            if (!zzgydVarZzf2.zzc()) {
                                int size2 = zzgydVarZzf2.size();
                                zzgydVarZzf2 = zzgydVarZzf2.zzf(size2 == 0 ? 10 : size2 + size2);
                                unsafe7.putObject(obj3, j, zzgydVarZzf2);
                            }
                            int iZze2 = com.google.android.gms.internal.ads.zzgvy.zze(zzgzfVar.zzx(iZzs), i6, bArr, i41, i2, zzgydVarZzf2, zzgvxVar);
                            i3 = i3;
                            zzgvxVar4 = zzgvxVar;
                            i2 = i59;
                            unsafe6 = unsafe7;
                            i35 = -1;
                            i39 = i9;
                            i40 = i10;
                            i38 = i6;
                            i37 = iZzs;
                            i36 = i46;
                            iZzg = iZze2;
                        } else {
                            zzgvxVar4 = zzgvxVar;
                            unsafe3 = unsafe7;
                            i20 = iZzs;
                            i21 = i41;
                            i12 = i46;
                            i4 = i3;
                            i8 = i21;
                            i13 = i20;
                            zzgvxVar2 = zzgvxVar4;
                            unsafe2 = unsafe3;
                        }
                    }
                } else {
                    i8 = i41;
                    i9 = i39;
                    i10 = i40;
                    i11 = i35;
                    unsafe2 = unsafe6;
                    zzgvxVar2 = zzgvxVar4;
                    i4 = i3;
                    i12 = i43;
                    i6 = i7;
                    i13 = 0;
                }
                if (i6 != i4 || i4 == 0) {
                    if (zzgzfVar.zzh) {
                        com.google.android.gms.internal.ads.zzgxb zzgxbVar = zzgvxVar2.zzd;
                        int i101 = com.google.android.gms.internal.ads.zzgxb.zzb;
                        int i102 = com.google.android.gms.internal.ads.zzgzm.zza;
                        if (zzgxbVar != com.google.android.gms.internal.ads.zzgxb.zza) {
                            com.google.android.gms.internal.ads.zzgzc zzgzcVar = zzgzfVar.zzg;
                            com.google.android.gms.internal.ads.zzgxb zzgxbVar2 = zzgvxVar2.zzd;
                            int i103 = com.google.android.gms.internal.ads.zzgvy.zza;
                            if (zzgxbVar2.zzc(zzgzcVar, i12) != null) {
                                throw null;
                            }
                            iZzg = com.google.android.gms.internal.ads.zzgvy.zzg(i6, bArr, i8, i2, zzd(obj), zzgvxVar);
                        } else {
                            iZzg = com.google.android.gms.internal.ads.zzgvy.zzg(i6, bArr, i8, i2, zzd(obj), zzgvxVar);
                        }
                    } else {
                        iZzg = com.google.android.gms.internal.ads.zzgvy.zzg(i6, bArr, i8, i2, zzd(obj), zzgvxVar);
                    }
                    i37 = i13;
                    i38 = i6;
                    i36 = i12;
                    unsafe6 = unsafe2;
                    i39 = i9;
                    i40 = i10;
                    i3 = i4;
                    zzgvxVar4 = zzgvxVar2;
                    i35 = i11;
                } else {
                    i2 = i2;
                    i5 = i8;
                    i39 = i9;
                    unsafe = unsafe2;
                    i40 = i10;
                }
            } else {
                i4 = i3;
                unsafe = unsafe6;
                i5 = iZzg;
                i6 = i38;
            }
        }
        if (i40 != 1048575) {
            unsafe.putInt(obj3, i40, i39);
        }
        for (int i104 = zzgzfVar.zzk; i104 < zzgzfVar.zzl; i104++) {
            zzy(obj, zzgzfVar.zzj[i104], null, zzgzfVar.zzm, obj);
        }
        if (i4 == 0) {
            if (i5 != i2) {
                throw new com.google.android.gms.internal.ads.zzgyg("Failed to parse the message.");
            }
        } else if (i5 > i2 || i6 != i4) {
            throw new com.google.android.gms.internal.ads.zzgyg("Failed to parse the message.");
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final java.lang.Object zze() {
        return ((com.google.android.gms.internal.ads.zzgxr) this.zzg).zzbj();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzf(java.lang.Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof com.google.android.gms.internal.ads.zzgxr) {
                com.google.android.gms.internal.ads.zzgxr zzgxrVar = (com.google.android.gms.internal.ads.zzgxr) obj;
                zzgxrVar.zzbT();
                zzgxrVar.zzbS();
                zzgxrVar.zzbV();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzu = zzu(i);
                int i2 = 1048575 & iZzu;
                int iZzt = zzt(iZzu);
                long j = i2;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
                            case 17:
                                if (zzN(obj, i)) {
                                    zzx(i).zzf(zzb.getObject(obj, j));
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
                                ((com.google.android.gms.internal.ads.zzgyd) com.google.android.gms.internal.ads.zzhao.zzh(obj, j)).zzb();
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = zzb;
                                java.lang.Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((com.google.android.gms.internal.ads.zzgyw) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzg(java.lang.Object obj, java.lang.Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            int i2 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzr(obj, j, com.google.android.gms.internal.ads.zzhao.zzb(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzs(obj, j, com.google.android.gms.internal.ads.zzhao.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzu(obj, j, com.google.android.gms.internal.ads.zzhao.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzu(obj, j, com.google.android.gms.internal.ads.zzhao.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzt(obj, j, com.google.android.gms.internal.ads.zzhao.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzu(obj, j, com.google.android.gms.internal.ads.zzhao.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzt(obj, j, com.google.android.gms.internal.ads.zzhao.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzp(obj, j, com.google.android.gms.internal.ads.zzhao.zzz(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzv(obj, j, com.google.android.gms.internal.ads.zzhao.zzh(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzv(obj, j, com.google.android.gms.internal.ads.zzhao.zzh(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzt(obj, j, com.google.android.gms.internal.ads.zzhao.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzt(obj, j, com.google.android.gms.internal.ads.zzhao.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzt(obj, j, com.google.android.gms.internal.ads.zzhao.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzu(obj, j, com.google.android.gms.internal.ads.zzhao.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzt(obj, j, com.google.android.gms.internal.ads.zzhao.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzu(obj, j, com.google.android.gms.internal.ads.zzhao.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 17:
                    zzE(obj, obj2, i);
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
                    com.google.android.gms.internal.ads.zzgyd zzgydVarZzf = (com.google.android.gms.internal.ads.zzgyd) com.google.android.gms.internal.ads.zzhao.zzh(obj, j);
                    com.google.android.gms.internal.ads.zzgyd zzgydVar = (com.google.android.gms.internal.ads.zzgyd) com.google.android.gms.internal.ads.zzhao.zzh(obj2, j);
                    int size = zzgydVarZzf.size();
                    int size2 = zzgydVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzgydVarZzf.zzc()) {
                            zzgydVarZzf = zzgydVarZzf.zzf(size2 + size);
                        }
                        zzgydVarZzf.addAll(zzgydVar);
                    }
                    if (size > 0) {
                        zzgydVar = zzgydVarZzf;
                    }
                    com.google.android.gms.internal.ads.zzhao.zzv(obj, j, zzgydVar);
                    break;
                case 50:
                    int i4 = com.google.android.gms.internal.ads.zzgzx.zza;
                    com.google.android.gms.internal.ads.zzhao.zzv(obj, j, com.google.android.gms.internal.ads.zzgyx.zzb(com.google.android.gms.internal.ads.zzhao.zzh(obj, j), com.google.android.gms.internal.ads.zzhao.zzh(obj2, j)));
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
                    if (zzR(obj2, i3, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzv(obj, j, com.google.android.gms.internal.ads.zzhao.zzh(obj2, j));
                        zzI(obj, i3, i);
                    }
                    break;
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i3, i)) {
                        com.google.android.gms.internal.ads.zzhao.zzv(obj, j, com.google.android.gms.internal.ads.zzhao.zzh(obj2, j));
                        zzI(obj, i3, i);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        com.google.android.gms.internal.ads.zzgzx.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            com.google.android.gms.internal.ads.zzgzx.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x050e  */
    /* JADX WARN: Code duplicated, block: B:319:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzh(java.lang.Object obj, com.google.android.gms.internal.ads.zzgzp zzgzpVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException {
        zzgxbVar.getClass();
        zzD(obj);
        com.google.android.gms.internal.ads.zzhah zzhahVar = this.zzm;
        java.lang.Object objZza = null;
        while (true) {
            try {
                int iZzc = zzgzpVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    int iZzu = zzu(iZzq);
                    try {
                        switch (zzt(iZzu)) {
                            case 0:
                                com.google.android.gms.internal.ads.zzhao.zzr(obj, iZzu & 1048575, zzgzpVar.zza());
                                zzH(obj, iZzq);
                                break;
                            case 1:
                                com.google.android.gms.internal.ads.zzhao.zzs(obj, iZzu & 1048575, zzgzpVar.zzb());
                                zzH(obj, iZzq);
                                break;
                            case 2:
                                com.google.android.gms.internal.ads.zzhao.zzu(obj, iZzu & 1048575, zzgzpVar.zzl());
                                zzH(obj, iZzq);
                                break;
                            case 3:
                                com.google.android.gms.internal.ads.zzhao.zzu(obj, iZzu & 1048575, zzgzpVar.zzo());
                                zzH(obj, iZzq);
                                break;
                            case 4:
                                com.google.android.gms.internal.ads.zzhao.zzt(obj, iZzu & 1048575, zzgzpVar.zzg());
                                zzH(obj, iZzq);
                                break;
                            case 5:
                                com.google.android.gms.internal.ads.zzhao.zzu(obj, iZzu & 1048575, zzgzpVar.zzk());
                                zzH(obj, iZzq);
                                break;
                            case 6:
                                com.google.android.gms.internal.ads.zzhao.zzt(obj, iZzu & 1048575, zzgzpVar.zzf());
                                zzH(obj, iZzq);
                                break;
                            case 7:
                                com.google.android.gms.internal.ads.zzhao.zzp(obj, iZzu & 1048575, zzgzpVar.zzN());
                                zzH(obj, iZzq);
                                break;
                            case 8:
                                zzG(obj, iZzu, zzgzpVar);
                                zzH(obj, iZzq);
                                break;
                            case 9:
                                com.google.android.gms.internal.ads.zzgzc zzgzcVar = (com.google.android.gms.internal.ads.zzgzc) zzA(obj, iZzq);
                                zzgzpVar.zzu(zzgzcVar, zzx(iZzq), zzgxbVar);
                                zzJ(obj, iZzq, zzgzcVar);
                                break;
                            case 10:
                                com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, zzgzpVar.zzp());
                                zzH(obj, iZzq);
                                break;
                            case 11:
                                com.google.android.gms.internal.ads.zzhao.zzt(obj, iZzu & 1048575, zzgzpVar.zzj());
                                zzH(obj, iZzq);
                                break;
                            case 12:
                                int iZze = zzgzpVar.zze();
                                com.google.android.gms.internal.ads.zzgxx zzgxxVarZzw = zzw(iZzq);
                                if (zzgxxVarZzw == null || zzgxxVarZzw.zza(iZze)) {
                                    com.google.android.gms.internal.ads.zzhao.zzt(obj, iZzu & 1048575, iZze);
                                    zzH(obj, iZzq);
                                } else {
                                    objZza = com.google.android.gms.internal.ads.zzgzx.zzo(obj, iZzc, iZze, objZza, zzhahVar);
                                }
                                break;
                            case 13:
                                com.google.android.gms.internal.ads.zzhao.zzt(obj, iZzu & 1048575, zzgzpVar.zzh());
                                zzH(obj, iZzq);
                                break;
                            case 14:
                                com.google.android.gms.internal.ads.zzhao.zzu(obj, iZzu & 1048575, zzgzpVar.zzm());
                                zzH(obj, iZzq);
                                break;
                            case 15:
                                com.google.android.gms.internal.ads.zzhao.zzt(obj, iZzu & 1048575, zzgzpVar.zzi());
                                zzH(obj, iZzq);
                                break;
                            case 16:
                                com.google.android.gms.internal.ads.zzhao.zzu(obj, iZzu & 1048575, zzgzpVar.zzn());
                                zzH(obj, iZzq);
                                break;
                            case 17:
                                com.google.android.gms.internal.ads.zzgzc zzgzcVar2 = (com.google.android.gms.internal.ads.zzgzc) zzA(obj, iZzq);
                                zzgzpVar.zzt(zzgzcVar2, zzx(iZzq), zzgxbVar);
                                zzJ(obj, iZzq, zzgzcVar2);
                                break;
                            case 18:
                                zzgzpVar.zzx(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 19:
                                zzgzpVar.zzB(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 20:
                                zzgzpVar.zzE(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 21:
                                zzgzpVar.zzM(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 22:
                                zzgzpVar.zzD(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 23:
                                zzgzpVar.zzA(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 24:
                                zzgzpVar.zzz(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 25:
                                zzgzpVar.zzv(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 26:
                                if (zzM(iZzu)) {
                                    ((com.google.android.gms.internal.ads.zzgwq) zzgzpVar).zzK(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575), true);
                                } else {
                                    ((com.google.android.gms.internal.ads.zzgwq) zzgzpVar).zzK(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575), false);
                                }
                                break;
                            case 27:
                                zzgzpVar.zzF(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575), zzx(iZzq), zzgxbVar);
                                break;
                            case 28:
                                zzgzpVar.zzw(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 29:
                                zzgzpVar.zzL(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 30:
                                java.util.List listZza = com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575);
                                zzgzpVar.zzy(listZza);
                                objZza = com.google.android.gms.internal.ads.zzgzx.zzn(obj, iZzc, listZza, zzw(iZzq), objZza, zzhahVar);
                                break;
                            case 31:
                                zzgzpVar.zzG(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 32:
                                zzgzpVar.zzH(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 33:
                                zzgzpVar.zzI(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 34:
                                zzgzpVar.zzJ(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 35:
                                zzgzpVar.zzx(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 36:
                                zzgzpVar.zzB(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 37:
                                zzgzpVar.zzE(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 38:
                                zzgzpVar.zzM(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 39:
                                zzgzpVar.zzD(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 40:
                                zzgzpVar.zzA(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 41:
                                zzgzpVar.zzz(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 42:
                                zzgzpVar.zzv(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 43:
                                zzgzpVar.zzL(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 44:
                                java.util.List listZza2 = com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575);
                                zzgzpVar.zzy(listZza2);
                                objZza = com.google.android.gms.internal.ads.zzgzx.zzn(obj, iZzc, listZza2, zzw(iZzq), objZza, zzhahVar);
                                break;
                            case 45:
                                zzgzpVar.zzG(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 46:
                                zzgzpVar.zzH(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 47:
                                zzgzpVar.zzI(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 48:
                                zzgzpVar.zzJ(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575));
                                break;
                            case 49:
                                zzgzpVar.zzC(com.google.android.gms.internal.ads.zzgyp.zza(obj, iZzu & 1048575), zzx(iZzq), zzgxbVar);
                                break;
                            case 50:
                                java.lang.Object objZzz = zzz(iZzq);
                                long jZzu = zzu(iZzq) & 1048575;
                                java.lang.Object objZzh = com.google.android.gms.internal.ads.zzhao.zzh(obj, jZzu);
                                if (objZzh == null) {
                                    objZzh = com.google.android.gms.internal.ads.zzgyw.zza().zzb();
                                    com.google.android.gms.internal.ads.zzhao.zzv(obj, jZzu, objZzh);
                                } else if (com.google.android.gms.internal.ads.zzgyx.zza(objZzh)) {
                                    java.lang.Object objZzb = com.google.android.gms.internal.ads.zzgyw.zza().zzb();
                                    com.google.android.gms.internal.ads.zzgyx.zzb(objZzb, objZzh);
                                    com.google.android.gms.internal.ads.zzhao.zzv(obj, jZzu, objZzb);
                                    objZzh = objZzb;
                                }
                                throw null;
                            case 51:
                                com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, java.lang.Double.valueOf(zzgzpVar.zza()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 52:
                                com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, java.lang.Float.valueOf(zzgzpVar.zzb()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 53:
                                com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, java.lang.Long.valueOf(zzgzpVar.zzl()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 54:
                                com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, java.lang.Long.valueOf(zzgzpVar.zzo()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 55:
                                com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, java.lang.Integer.valueOf(zzgzpVar.zzg()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 56:
                                com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, java.lang.Long.valueOf(zzgzpVar.zzk()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 57:
                                com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, java.lang.Integer.valueOf(zzgzpVar.zzf()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 58:
                                com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, java.lang.Boolean.valueOf(zzgzpVar.zzN()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 59:
                                zzG(obj, iZzu, zzgzpVar);
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 60:
                                com.google.android.gms.internal.ads.zzgzc zzgzcVar3 = (com.google.android.gms.internal.ads.zzgzc) zzB(obj, iZzc, iZzq);
                                zzgzpVar.zzu(zzgzcVar3, zzx(iZzq), zzgxbVar);
                                zzK(obj, iZzc, iZzq, zzgzcVar3);
                                break;
                            case 61:
                                com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, zzgzpVar.zzp());
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 62:
                                com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, java.lang.Integer.valueOf(zzgzpVar.zzj()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 63:
                                int iZze2 = zzgzpVar.zze();
                                com.google.android.gms.internal.ads.zzgxx zzgxxVarZzw2 = zzw(iZzq);
                                if (zzgxxVarZzw2 == null || zzgxxVarZzw2.zza(iZze2)) {
                                    com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, java.lang.Integer.valueOf(iZze2));
                                    zzI(obj, iZzc, iZzq);
                                } else {
                                    objZza = com.google.android.gms.internal.ads.zzgzx.zzo(obj, iZzc, iZze2, objZza, zzhahVar);
                                }
                                break;
                            case 64:
                                com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, java.lang.Integer.valueOf(zzgzpVar.zzh()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 65:
                                com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, java.lang.Long.valueOf(zzgzpVar.zzm()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 66:
                                com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, java.lang.Integer.valueOf(zzgzpVar.zzi()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 67:
                                com.google.android.gms.internal.ads.zzhao.zzv(obj, iZzu & 1048575, java.lang.Long.valueOf(zzgzpVar.zzn()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 68:
                                com.google.android.gms.internal.ads.zzgzc zzgzcVar4 = (com.google.android.gms.internal.ads.zzgzc) zzB(obj, iZzc, iZzq);
                                zzgzpVar.zzt(zzgzcVar4, zzx(iZzq), zzgxbVar);
                                zzK(obj, iZzc, iZzq, zzgzcVar4);
                                break;
                            default:
                                if (objZza == null) {
                                    objZza = zzhahVar.zza(obj);
                                }
                                if (!zzhahVar.zzk(objZza, zzgzpVar, 0)) {
                                    for (int i = this.zzk; i < this.zzl; i++) {
                                        zzy(obj, this.zzj[i], objZza, zzhahVar, obj);
                                    }
                                }
                                break;
                        }
                    } catch (com.google.android.gms.internal.ads.zzgyf unused) {
                        if (objZza == null) {
                            objZza = zzhahVar.zza(obj);
                        }
                        if (!zzhahVar.zzk(objZza, zzgzpVar, 0)) {
                            for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                zzy(obj, this.zzj[i2], objZza, zzhahVar, obj);
                            }
                            if (objZza != null) {
                                zzhahVar.zzj(obj, objZza);
                            }
                        }
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                        zzy(obj, this.zzj[i3], objZza, zzhahVar, obj);
                    }
                } else {
                    if ((!this.zzh ? null : zzgxbVar.zzc(this.zzg, iZzc)) != null) {
                        throw null;
                    }
                    if (objZza == null) {
                        objZza = zzhahVar.zza(obj);
                    }
                    if (!zzhahVar.zzk(objZza, zzgzpVar, 0)) {
                        for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                            zzy(obj, this.zzj[i4], objZza, zzhahVar, obj);
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                for (int i5 = this.zzk; i5 < this.zzl; i5++) {
                    zzy(obj, this.zzj[i5], objZza, zzhahVar, obj);
                }
                if (objZza != null) {
                    zzhahVar.zzj(obj, objZza);
                }
                throw th;
            }
        }
        if (objZza != null) {
            zzhahVar.zzj(obj, objZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzi(java.lang.Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzgvx zzgvxVar) throws java.io.IOException {
        zzc(obj, bArr, i, i2, 0, zzgvxVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzj(java.lang.Object obj, com.google.android.gms.internal.ads.zzhaw zzhawVar) throws java.io.IOException {
        java.util.Map.Entry entry;
        java.util.Iterator it;
        int i;
        java.util.Map.Entry entry2;
        int i2;
        boolean z;
        boolean z2;
        if (this.zzh) {
            com.google.android.gms.internal.ads.zzgxg zzgxgVar = ((com.google.android.gms.internal.ads.zzgxn) obj).zza;
            if (zzgxgVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                java.util.Iterator itZzf = zzgxgVar.zzf();
                entry = (java.util.Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = this.zzc;
        sun.misc.Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < iArr.length) {
            int iZzu = zzu(i5);
            int[] iArr2 = this.zzc;
            int iZzt = zzt(iZzu);
            int i6 = iArr2[i5];
            if (iZzt <= 17) {
                int i7 = iArr2[i5 + 2];
                int i8 = i7 & 1048575;
                if (i8 != i3) {
                    i4 = i8 == 1048575 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                } else {
                    entry = entry;
                }
                i2 = 1 << (i7 >>> 20);
                i = i4;
                entry2 = entry;
            } else {
                i = i4;
                entry2 = entry;
                i2 = 0;
            }
            int i9 = i3;
            while (entry2 != null && ((com.google.android.gms.internal.ads.zzgxo) entry2.getKey()).zza <= i6) {
                this.zzn.zzb(zzhawVar, entry2);
                entry2 = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
            }
            long j = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzf(i6, com.google.android.gms.internal.ads.zzhao.zzb(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 1:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzo(i6, com.google.android.gms.internal.ads.zzhao.zzc(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 2:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzt(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 3:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzK(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 4:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzr(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 5:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzm(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 6:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzk(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 7:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzb(i6, com.google.android.gms.internal.ads.zzhao.zzz(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 8:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzT(i6, unsafe.getObject(obj, j), zzhawVar);
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 9:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzv(i6, unsafe.getObject(obj, j), zzx(i5));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 10:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzd(i6, (com.google.android.gms.internal.ads.zzgwj) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 11:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzI(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 12:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzi(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 13:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzx(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 14:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzz(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 15:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzB(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 16:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzD(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 17:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzq(i6, unsafe.getObject(obj, j), zzx(i5));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 18:
                    z = false;
                    com.google.android.gms.internal.ads.zzgzx.zzt(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, false);
                    it = it;
                    iArr = iArr;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 19:
                    z = false;
                    com.google.android.gms.internal.ads.zzgzx.zzx(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, false);
                    it = it;
                    iArr = iArr;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 20:
                    z = false;
                    com.google.android.gms.internal.ads.zzgzx.zzA(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, false);
                    it = it;
                    iArr = iArr;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 21:
                    z = false;
                    com.google.android.gms.internal.ads.zzgzx.zzI(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, false);
                    it = it;
                    iArr = iArr;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 22:
                    z = false;
                    com.google.android.gms.internal.ads.zzgzx.zzz(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, false);
                    it = it;
                    iArr = iArr;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 23:
                    z = false;
                    com.google.android.gms.internal.ads.zzgzx.zzw(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, false);
                    it = it;
                    iArr = iArr;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 24:
                    z = false;
                    com.google.android.gms.internal.ads.zzgzx.zzv(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, false);
                    it = it;
                    iArr = iArr;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 25:
                    z = false;
                    com.google.android.gms.internal.ads.zzgzx.zzr(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, false);
                    it = it;
                    iArr = iArr;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 26:
                    com.google.android.gms.internal.ads.zzgzx.zzG(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 27:
                    com.google.android.gms.internal.ads.zzgzx.zzB(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, zzx(i5));
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 28:
                    com.google.android.gms.internal.ads.zzgzx.zzs(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 29:
                    z2 = false;
                    com.google.android.gms.internal.ads.zzgzx.zzH(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, false);
                    it = it;
                    iArr = iArr;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 30:
                    z2 = false;
                    com.google.android.gms.internal.ads.zzgzx.zzu(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, false);
                    it = it;
                    iArr = iArr;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 31:
                    z2 = false;
                    com.google.android.gms.internal.ads.zzgzx.zzC(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, false);
                    it = it;
                    iArr = iArr;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 32:
                    z2 = false;
                    com.google.android.gms.internal.ads.zzgzx.zzD(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, false);
                    it = it;
                    iArr = iArr;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 33:
                    z2 = false;
                    com.google.android.gms.internal.ads.zzgzx.zzE(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, false);
                    it = it;
                    iArr = iArr;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 34:
                    z2 = false;
                    com.google.android.gms.internal.ads.zzgzx.zzF(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, false);
                    it = it;
                    iArr = iArr;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 35:
                    com.google.android.gms.internal.ads.zzgzx.zzt(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 36:
                    com.google.android.gms.internal.ads.zzgzx.zzx(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 37:
                    com.google.android.gms.internal.ads.zzgzx.zzA(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 38:
                    com.google.android.gms.internal.ads.zzgzx.zzI(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 39:
                    com.google.android.gms.internal.ads.zzgzx.zzz(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 40:
                    com.google.android.gms.internal.ads.zzgzx.zzw(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 41:
                    com.google.android.gms.internal.ads.zzgzx.zzv(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 42:
                    com.google.android.gms.internal.ads.zzgzx.zzr(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 43:
                    com.google.android.gms.internal.ads.zzgzx.zzH(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 44:
                    com.google.android.gms.internal.ads.zzgzx.zzu(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 45:
                    com.google.android.gms.internal.ads.zzgzx.zzC(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 46:
                    com.google.android.gms.internal.ads.zzgzx.zzD(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 47:
                    com.google.android.gms.internal.ads.zzgzx.zzE(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 48:
                    com.google.android.gms.internal.ads.zzgzx.zzF(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 49:
                    com.google.android.gms.internal.ads.zzgzx.zzy(this.zzc[i5], (java.util.List) unsafe.getObject(obj, j), zzhawVar, zzx(i5));
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 51:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzf(i6, zzn(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 52:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzo(i6, zzo(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 53:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzt(i6, zzv(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 54:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzK(i6, zzv(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 55:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzr(i6, zzp(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 56:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzm(i6, zzv(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 57:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzk(i6, zzp(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 58:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzb(i6, zzS(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 59:
                    if (zzR(obj, i6, i5)) {
                        zzT(i6, unsafe.getObject(obj, j), zzhawVar);
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 60:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzv(i6, unsafe.getObject(obj, j), zzx(i5));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 61:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzd(i6, (com.google.android.gms.internal.ads.zzgwj) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 62:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzI(i6, zzp(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 63:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzi(i6, zzp(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 64:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzx(i6, zzp(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 65:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzz(i6, zzv(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 66:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzB(i6, zzp(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 67:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzD(i6, zzv(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 68:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzq(i6, unsafe.getObject(obj, j), zzx(i5));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                default:
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
            }
        }
        java.util.Iterator it2 = it;
        while (entry != null) {
            this.zzn.zzb(zzhawVar, entry);
            entry = it2.hasNext() ? (java.util.Map.Entry) it2.next() : null;
        }
        ((com.google.android.gms.internal.ads.zzgxr) obj).zzt.zzl(zzhawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzk(java.lang.Object obj, java.lang.Object obj2) {
        boolean zZzJ;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.zzhao.zzb(obj, j)) != java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.zzhao.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.zzhao.zzc(obj, j)) != java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.zzhao.zzc(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || com.google.android.gms.internal.ads.zzhao.zzf(obj, j) != com.google.android.gms.internal.ads.zzhao.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || com.google.android.gms.internal.ads.zzhao.zzf(obj, j) != com.google.android.gms.internal.ads.zzhao.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || com.google.android.gms.internal.ads.zzhao.zzd(obj, j) != com.google.android.gms.internal.ads.zzhao.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || com.google.android.gms.internal.ads.zzhao.zzf(obj, j) != com.google.android.gms.internal.ads.zzhao.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || com.google.android.gms.internal.ads.zzhao.zzd(obj, j) != com.google.android.gms.internal.ads.zzhao.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || com.google.android.gms.internal.ads.zzhao.zzz(obj, j) != com.google.android.gms.internal.ads.zzhao.zzz(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !com.google.android.gms.internal.ads.zzgzx.zzJ(com.google.android.gms.internal.ads.zzhao.zzh(obj, j), com.google.android.gms.internal.ads.zzhao.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !com.google.android.gms.internal.ads.zzgzx.zzJ(com.google.android.gms.internal.ads.zzhao.zzh(obj, j), com.google.android.gms.internal.ads.zzhao.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !com.google.android.gms.internal.ads.zzgzx.zzJ(com.google.android.gms.internal.ads.zzhao.zzh(obj, j), com.google.android.gms.internal.ads.zzhao.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || com.google.android.gms.internal.ads.zzhao.zzd(obj, j) != com.google.android.gms.internal.ads.zzhao.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || com.google.android.gms.internal.ads.zzhao.zzd(obj, j) != com.google.android.gms.internal.ads.zzhao.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || com.google.android.gms.internal.ads.zzhao.zzd(obj, j) != com.google.android.gms.internal.ads.zzhao.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || com.google.android.gms.internal.ads.zzhao.zzf(obj, j) != com.google.android.gms.internal.ads.zzhao.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || com.google.android.gms.internal.ads.zzhao.zzd(obj, j) != com.google.android.gms.internal.ads.zzhao.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || com.google.android.gms.internal.ads.zzhao.zzf(obj, j) != com.google.android.gms.internal.ads.zzhao.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !com.google.android.gms.internal.ads.zzgzx.zzJ(com.google.android.gms.internal.ads.zzhao.zzh(obj, j), com.google.android.gms.internal.ads.zzhao.zzh(obj2, j))) {
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
                    zZzJ = com.google.android.gms.internal.ads.zzgzx.zzJ(com.google.android.gms.internal.ads.zzhao.zzh(obj, j), com.google.android.gms.internal.ads.zzhao.zzh(obj2, j));
                    break;
                case 50:
                    zZzJ = com.google.android.gms.internal.ads.zzgzx.zzJ(com.google.android.gms.internal.ads.zzhao.zzh(obj, j), com.google.android.gms.internal.ads.zzhao.zzh(obj2, j));
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
                    long jZzr = zzr(i) & 1048575;
                    if (com.google.android.gms.internal.ads.zzhao.zzd(obj, jZzr) != com.google.android.gms.internal.ads.zzhao.zzd(obj2, jZzr) || !com.google.android.gms.internal.ads.zzgzx.zzJ(com.google.android.gms.internal.ads.zzhao.zzh(obj, j), com.google.android.gms.internal.ads.zzhao.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzJ) {
                return false;
            }
        }
        if (!((com.google.android.gms.internal.ads.zzgxr) obj).zzt.equals(((com.google.android.gms.internal.ads.zzgxr) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((com.google.android.gms.internal.ads.zzgxn) obj).zza.equals(((com.google.android.gms.internal.ads.zzgxn) obj2).zza);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0 A[LOOP:1: B:45:0x00af->B:50:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzl(java.lang.Object obj) {
        int i;
        int i2;
        java.util.List list;
        com.google.android.gms.internal.ads.zzgzv zzgzvVarZzx;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int iZzu = zzu(i7);
            int i9 = this.zzc[i7 + 2];
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
            if ((268435456 & iZzu) != 0 && !zzO(obj, i7, i, i2, i11)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj, i7, i, i2, i11) && !zzP(obj, iZzu, zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 27) {
                list = (java.util.List) com.google.android.gms.internal.ads.zzhao.zzh(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgzvVarZzx = zzx(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzgzvVarZzx.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj, i8, i7) && !zzP(obj, iZzu, zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (java.util.List) com.google.android.gms.internal.ads.zzhao.zzh(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzgzvVarZzx = zzx(i7);
                    while (i3 < list.size()) {
                        if (!zzgzvVarZzx.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt == 50 && !((com.google.android.gms.internal.ads.zzgyw) com.google.android.gms.internal.ads.zzhao.zzh(obj, iZzu & 1048575)).isEmpty()) {
                throw null;
            }
            i5++;
            i6 = i;
            i4 = i2;
        }
        return !this.zzh || ((com.google.android.gms.internal.ads.zzgxn) obj).zza.zzi();
    }
}
