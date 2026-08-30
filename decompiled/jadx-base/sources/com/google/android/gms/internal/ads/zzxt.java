package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzxt extends com.google.android.gms.internal.ads.zzxy implements com.google.android.gms.internal.ads.zzll {
    public static final /* synthetic */ int zzb = 0;
    private static final com.google.android.gms.internal.ads.zzfyy zzc = com.google.android.gms.internal.ads.zzfyy.zzb(new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzwt
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Integer num = (java.lang.Integer) obj;
            java.lang.Integer num2 = (java.lang.Integer) obj2;
            int i = com.google.android.gms.internal.ads.zzxt.zzb;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    public final android.content.Context zza;
    private final java.lang.Object zzd;
    private final boolean zze;
    private com.google.android.gms.internal.ads.zzxh zzf;
    private com.google.android.gms.internal.ads.zzxl zzg;
    private com.google.android.gms.internal.ads.zze zzh;
    private final com.google.android.gms.internal.ads.zzwp zzi;

    public zzxt(android.content.Context context) {
        com.google.android.gms.internal.ads.zzwp zzwpVar = new com.google.android.gms.internal.ads.zzwp();
        com.google.android.gms.internal.ads.zzxh zzxhVarZzd = com.google.android.gms.internal.ads.zzxh.zzd(context);
        this.zzd = new java.lang.Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzi = zzwpVar;
        this.zzf = zzxhVarZzd;
        this.zzh = com.google.android.gms.internal.ads.zze.zza;
        boolean z = false;
        if (context != null && com.google.android.gms.internal.ads.zzei.zzM(context)) {
            z = true;
        }
        this.zze = z;
        if (!z && context != null && com.google.android.gms.internal.ads.zzei.zza >= 32) {
            this.zzg = com.google.android.gms.internal.ads.zzxl.zza(context);
        }
        if (this.zzf.zzN && context == null) {
            com.google.android.gms.internal.ads.zzdo.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    static /* bridge */ /* synthetic */ int zzb(int i, int i2) {
        if (i == 0 || i != i2) {
            return java.lang.Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    protected static int zzc(com.google.android.gms.internal.ads.zzab zzabVar, java.lang.String str, boolean z) {
        if (!android.text.TextUtils.isEmpty(str) && str.equals(zzabVar.zzd)) {
            return 4;
        }
        java.lang.String strZzh = zzh(str);
        java.lang.String strZzh2 = zzh(zzabVar.zzd);
        if (strZzh2 == null || strZzh == null) {
            return (z && strZzh2 == null) ? 1 : 0;
        }
        if (strZzh2.startsWith(strZzh) || strZzh.startsWith(strZzh2)) {
            return 3;
        }
        int i = com.google.android.gms.internal.ads.zzei.zza;
        return strZzh2.split("-", 2)[0].equals(strZzh.split("-", 2)[0]) ? 2 : 0;
    }

    protected static java.lang.String zzh(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.equals(str, androidx.media3.common.C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static /* synthetic */ boolean zzm(com.google.android.gms.internal.ads.zzxt zzxtVar, com.google.android.gms.internal.ads.zzab zzabVar) {
        boolean z;
        com.google.android.gms.internal.ads.zzxl zzxlVar;
        com.google.android.gms.internal.ads.zzxl zzxlVar2;
        synchronized (zzxtVar.zzd) {
            z = true;
            if (zzxtVar.zzf.zzN && !zzxtVar.zze) {
                int i = zzabVar.zzD;
                byte b = -1;
                if (i != -1 && i > 2) {
                    java.lang.String str = zzabVar.zzo;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC)) {
                                    b = 2;
                                }
                                break;
                            case 187078296:
                                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_AC3)) {
                                    b = 0;
                                }
                                break;
                            case 187078297:
                                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_AC4)) {
                                    b = 3;
                                }
                                break;
                            case 1504578661:
                                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_E_AC3)) {
                                    b = 1;
                                }
                                break;
                        }
                        if ((b != 0 && b != 1 && b != 2 && b != 3) || (com.google.android.gms.internal.ads.zzei.zza >= 32 && (zzxlVar = zzxtVar.zzg) != null && zzxlVar.zzg())) {
                        }
                    }
                    if (com.google.android.gms.internal.ads.zzei.zza < 32 || (zzxlVar2 = zzxtVar.zzg) == null || !zzxlVar2.zzg() || !zzxlVar2.zze() || !zzxtVar.zzg.zzf() || !zzxtVar.zzg.zzd(zzxtVar.zzh, zzabVar)) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    private static void zzt(com.google.android.gms.internal.ads.zzwj zzwjVar, com.google.android.gms.internal.ads.zzbw zzbwVar, java.util.Map map) {
        for (int i = 0; i < zzwjVar.zzb; i++) {
            if (((com.google.android.gms.internal.ads.zzbs) zzbwVar.zzB.get(zzwjVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        boolean z;
        com.google.android.gms.internal.ads.zzxl zzxlVar;
        synchronized (this.zzd) {
            z = false;
            if (this.zzf.zzN && !this.zze && com.google.android.gms.internal.ads.zzei.zza >= 32 && (zzxlVar = this.zzg) != null && zzxlVar.zzg()) {
                z = true;
            }
        }
        if (z) {
            zzs();
        }
    }

    private static final android.util.Pair zzv(int i, com.google.android.gms.internal.ads.zzxx zzxxVar, int[][][] iArr, com.google.android.gms.internal.ads.zzxn zzxnVar, java.util.Comparator comparator) {
        java.util.RandomAccess randomAccessZzo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == zzxxVar.zzc(i2)) {
                com.google.android.gms.internal.ads.zzwj zzwjVarZzd = zzxxVar.zzd(i2);
                for (int i3 = 0; i3 < zzwjVarZzd.zzb; i3++) {
                    com.google.android.gms.internal.ads.zzbr zzbrVarZzb = zzwjVarZzd.zzb(i3);
                    java.util.List listZza = zzxnVar.zza(i2, zzbrVarZzb, iArr[i2][i3]);
                    boolean[] zArr = new boolean[zzbrVarZzb.zza];
                    int i4 = 0;
                    while (i4 < zzbrVarZzb.zza) {
                        int i5 = i4 + 1;
                        com.google.android.gms.internal.ads.zzxo zzxoVar = (com.google.android.gms.internal.ads.zzxo) listZza.get(i4);
                        int iZzb = zzxoVar.zzb();
                        if (!zArr[i4] && iZzb != 0) {
                            if (iZzb == 1) {
                                randomAccessZzo = com.google.android.gms.internal.ads.zzfxn.zzo(zzxoVar);
                            } else {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                arrayList2.add(zzxoVar);
                                for (int i6 = i5; i6 < zzbrVarZzb.zza; i6++) {
                                    com.google.android.gms.internal.ads.zzxo zzxoVar2 = (com.google.android.gms.internal.ads.zzxo) listZza.get(i6);
                                    if (zzxoVar2.zzb() == 2 && zzxoVar.zzc(zzxoVar2)) {
                                        arrayList2.add(zzxoVar2);
                                        zArr[i6] = true;
                                    }
                                }
                                randomAccessZzo = arrayList2;
                            }
                            arrayList.add(randomAccessZzo);
                        }
                        i4 = i5;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        java.util.List list = (java.util.List) java.util.Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((com.google.android.gms.internal.ads.zzxo) list.get(i7)).zzc;
        }
        com.google.android.gms.internal.ads.zzxo zzxoVar3 = (com.google.android.gms.internal.ads.zzxo) list.get(0);
        return android.util.Pair.create(new com.google.android.gms.internal.ads.zzxu(zzxoVar3.zzb, iArr2, 0), java.lang.Integer.valueOf(zzxoVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zza(com.google.android.gms.internal.ads.zzlj zzljVar) {
        synchronized (this.zzd) {
            boolean z = this.zzf.zzR;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    protected final android.util.Pair zzd(com.google.android.gms.internal.ads.zzxx zzxxVar, int[][][] iArr, final int[] iArr2, com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzbq zzbqVar) throws com.google.android.gms.internal.ads.zzib {
        final com.google.android.gms.internal.ads.zzxh zzxhVar;
        int i;
        final boolean z;
        android.util.Pair pairZzv;
        int[] iArr3;
        int length;
        com.google.android.gms.internal.ads.zzxl zzxlVar;
        synchronized (this.zzd) {
            zzxhVar = this.zzf;
            if (zzxhVar.zzN && com.google.android.gms.internal.ads.zzei.zza >= 32 && (zzxlVar = this.zzg) != null) {
                android.os.Looper looperMyLooper = android.os.Looper.myLooper();
                com.google.android.gms.internal.ads.zzcw.zzb(looperMyLooper);
                android.os.Looper looper = looperMyLooper;
                zzxlVar.zzb(this, looperMyLooper);
            }
        }
        int i2 = 2;
        com.google.android.gms.internal.ads.zzxu[] zzxuVarArr = new com.google.android.gms.internal.ads.zzxu[2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                z = false;
                break;
            }
            if (zzxxVar.zzc(i4) == 2 && zzxxVar.zzd(i4).zzb > 0) {
                z = true;
                break;
            }
            i4++;
        }
        android.util.Pair pairZzv2 = zzv(1, zzxxVar, iArr, new com.google.android.gms.internal.ads.zzxn() { // from class: com.google.android.gms.internal.ads.zzwy
            @Override // com.google.android.gms.internal.ads.zzxn
            public final java.util.List zza(int i5, com.google.android.gms.internal.ads.zzbr zzbrVar, int[] iArr4) {
                final com.google.android.gms.internal.ads.zzxt zzxtVar = this.zza;
                com.google.android.gms.internal.ads.zzfuo zzfuoVar = new com.google.android.gms.internal.ads.zzfuo() { // from class: com.google.android.gms.internal.ads.zzxa
                    @Override // com.google.android.gms.internal.ads.zzfuo
                    public final boolean zza(java.lang.Object obj) {
                        return com.google.android.gms.internal.ads.zzxt.zzm(zzxtVar, (com.google.android.gms.internal.ads.zzab) obj);
                    }
                };
                int i6 = iArr2[i5];
                com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
                for (int i7 = 0; i7 < zzbrVar.zza; i7++) {
                    zzfxkVar.zzf(new com.google.android.gms.internal.ads.zzxd(i5, zzbrVar, i7, zzxhVar, iArr4[i7], z, zzfuoVar, i6));
                }
                return zzfxkVar.zzi();
            }
        }, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzwz
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.android.gms.internal.ads.zzxd) java.util.Collections.max((java.util.List) obj)).zza((com.google.android.gms.internal.ads.zzxd) java.util.Collections.max((java.util.List) obj2));
            }
        });
        if (pairZzv2 != null) {
            zzxuVarArr[((java.lang.Integer) pairZzv2.second).intValue()] = (com.google.android.gms.internal.ads.zzxu) pairZzv2.first;
        }
        final java.lang.String str = pairZzv2 == null ? null : ((com.google.android.gms.internal.ads.zzxu) pairZzv2.first).zza.zzb(((com.google.android.gms.internal.ads.zzxu) pairZzv2.first).zzb[0]).zzd;
        com.google.android.gms.internal.ads.zzbu zzbuVar = zzxhVar.zzt;
        android.util.Pair pairZzv3 = zzv(2, zzxxVar, iArr, new com.google.android.gms.internal.ads.zzxn() { // from class: com.google.android.gms.internal.ads.zzww
            /* JADX WARN: Code duplicated, block: B:22:0x003f  */
            @Override // com.google.android.gms.internal.ads.zzxn
            public final java.util.List zza(int i5, com.google.android.gms.internal.ads.zzbr zzbrVar, int[] iArr4) {
                int i6;
                byte b;
                int i7;
                int i8;
                int i9;
                android.graphics.Point point;
                com.google.android.gms.internal.ads.zzww zzwwVar = this;
                int i10 = com.google.android.gms.internal.ads.zzxt.zzb;
                com.google.android.gms.internal.ads.zzxh zzxhVar2 = zzxhVar;
                int i11 = iArr2[i5];
                int i12 = zzxhVar2.zzi;
                int i13 = zzxhVar2.zzj;
                boolean z2 = zzxhVar2.zzk;
                if (i12 == Integer.MAX_VALUE) {
                    i6 = Integer.MAX_VALUE;
                } else if (i13 == Integer.MAX_VALUE) {
                    i6 = Integer.MAX_VALUE;
                } else {
                    int i14 = Integer.MAX_VALUE;
                    for (int i15 = 0; i15 < zzbrVar.zza; i15++) {
                        com.google.android.gms.internal.ads.zzab zzabVarZzb = zzbrVar.zzb(i15);
                        int i16 = zzabVarZzb.zzv;
                        if (i16 > 0 && (i7 = zzabVarZzb.zzw) > 0) {
                            if (!z2) {
                                i8 = i12;
                                i9 = i13;
                            } else if ((i16 > i7) != (i12 > i13)) {
                                i9 = i12;
                                i8 = i13;
                            } else {
                                i8 = i12;
                                i9 = i13;
                            }
                            int i17 = i16 * i9;
                            int i18 = i7 * i8;
                            if (i17 >= i18) {
                                int i19 = com.google.android.gms.internal.ads.zzei.zza;
                                point = new android.graphics.Point(i8, ((i18 + i16) - 1) / i16);
                            } else {
                                int i20 = com.google.android.gms.internal.ads.zzei.zza;
                                point = new android.graphics.Point(((i17 + i7) - 1) / i7, i9);
                            }
                            int i21 = zzabVarZzb.zzv;
                            int i22 = zzabVarZzb.zzw * i21;
                            if (i21 >= ((int) (point.x * 0.98f)) && zzabVarZzb.zzw >= ((int) (point.y * 0.98f)) && i22 < i14) {
                                i14 = i22;
                            }
                        }
                    }
                    i6 = i14;
                }
                com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
                int i23 = 0;
                while (i23 < zzbrVar.zza) {
                    int iZza = zzbrVar.zzb(i23).zza();
                    if (i6 != Integer.MAX_VALUE) {
                        b = -1;
                        boolean z3 = iZza != -1 && iZza <= i6;
                        zzfxkVar.zzf(new com.google.android.gms.internal.ads.zzxr(i5, zzbrVar, i23, zzxhVar2, iArr4[i23], str, i11, z3));
                        i23++;
                        zzwwVar = this;
                    } else {
                        b = -1;
                    }
                    zzfxkVar.zzf(new com.google.android.gms.internal.ads.zzxr(i5, zzbrVar, i23, zzxhVar2, iArr4[i23], str, i11, z3));
                    i23++;
                    zzwwVar = this;
                }
                return zzfxkVar.zzi();
            }
        }, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzwx
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                java.util.List list = (java.util.List) obj;
                java.util.List list2 = (java.util.List) obj2;
                return com.google.android.gms.internal.ads.zzfxc.zzj().zzc((com.google.android.gms.internal.ads.zzxr) java.util.Collections.max(list, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzxp
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.google.android.gms.internal.ads.zzxr.zzd((com.google.android.gms.internal.ads.zzxr) obj3, (com.google.android.gms.internal.ads.zzxr) obj4);
                    }
                }), (com.google.android.gms.internal.ads.zzxr) java.util.Collections.max(list2, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzxp
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.google.android.gms.internal.ads.zzxr.zzd((com.google.android.gms.internal.ads.zzxr) obj3, (com.google.android.gms.internal.ads.zzxr) obj4);
                    }
                }), new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzxp
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.google.android.gms.internal.ads.zzxr.zzd((com.google.android.gms.internal.ads.zzxr) obj3, (com.google.android.gms.internal.ads.zzxr) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzc((com.google.android.gms.internal.ads.zzxr) java.util.Collections.max(list, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzxq
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.google.android.gms.internal.ads.zzxr.zza((com.google.android.gms.internal.ads.zzxr) obj3, (com.google.android.gms.internal.ads.zzxr) obj4);
                    }
                }), (com.google.android.gms.internal.ads.zzxr) java.util.Collections.max(list2, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzxq
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.google.android.gms.internal.ads.zzxr.zza((com.google.android.gms.internal.ads.zzxr) obj3, (com.google.android.gms.internal.ads.zzxr) obj4);
                    }
                }), new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzxq
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.google.android.gms.internal.ads.zzxr.zza((com.google.android.gms.internal.ads.zzxr) obj3, (com.google.android.gms.internal.ads.zzxr) obj4);
                    }
                }).zza();
            }
        });
        boolean z2 = zzxhVar.zzy;
        int i5 = 4;
        if (pairZzv3 == null) {
            com.google.android.gms.internal.ads.zzbu zzbuVar2 = zzxhVar.zzt;
            pairZzv = zzv(4, zzxxVar, iArr, new com.google.android.gms.internal.ads.zzxn() { // from class: com.google.android.gms.internal.ads.zzwu
                @Override // com.google.android.gms.internal.ads.zzxn
                public final java.util.List zza(int i6, com.google.android.gms.internal.ads.zzbr zzbrVar, int[] iArr4) {
                    int i7 = com.google.android.gms.internal.ads.zzxt.zzb;
                    com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
                    for (int i8 = 0; i8 < zzbrVar.zza; i8++) {
                        zzfxkVar.zzf(new com.google.android.gms.internal.ads.zzxe(i6, zzbrVar, i8, zzxhVar, iArr4[i8]));
                    }
                    return zzfxkVar.zzi();
                }
            }, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzwv
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return ((com.google.android.gms.internal.ads.zzxe) ((java.util.List) obj).get(0)).compareTo((com.google.android.gms.internal.ads.zzxe) ((java.util.List) obj2).get(0));
                }
            });
        } else {
            pairZzv = null;
        }
        if (pairZzv != null) {
            zzxuVarArr[((java.lang.Integer) pairZzv.second).intValue()] = (com.google.android.gms.internal.ads.zzxu) pairZzv.first;
        } else if (pairZzv3 != null) {
            zzxuVarArr[((java.lang.Integer) pairZzv3.second).intValue()] = (com.google.android.gms.internal.ads.zzxu) pairZzv3.first;
        }
        com.google.android.gms.internal.ads.zzbu zzbuVar3 = zzxhVar.zzt;
        int i6 = 3;
        android.util.Pair pairZzv4 = zzv(3, zzxxVar, iArr, new com.google.android.gms.internal.ads.zzxn() { // from class: com.google.android.gms.internal.ads.zzxb
            @Override // com.google.android.gms.internal.ads.zzxn
            public final java.util.List zza(int i7, com.google.android.gms.internal.ads.zzbr zzbrVar, int[] iArr4) {
                int i8 = com.google.android.gms.internal.ads.zzxt.zzb;
                com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
                for (int i9 = 0; i9 < zzbrVar.zza; i9++) {
                    int i10 = i9;
                    zzfxkVar.zzf(new com.google.android.gms.internal.ads.zzxm(i7, zzbrVar, i10, zzxhVar, iArr4[i9], str));
                }
                return zzfxkVar.zzi();
            }
        }, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzxc
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.android.gms.internal.ads.zzxm) ((java.util.List) obj).get(0)).zza((com.google.android.gms.internal.ads.zzxm) ((java.util.List) obj2).get(0));
            }
        });
        if (pairZzv4 != null) {
            zzxuVarArr[((java.lang.Integer) pairZzv4.second).intValue()] = (com.google.android.gms.internal.ads.zzxu) pairZzv4.first;
        }
        int i7 = 0;
        while (i7 < i2) {
            int iZzc = zzxxVar.zzc(i7);
            if (iZzc != i2 && iZzc != i && iZzc != i6 && iZzc != i5) {
                com.google.android.gms.internal.ads.zzwj zzwjVarZzd = zzxxVar.zzd(i7);
                int[][] iArr4 = iArr[i7];
                com.google.android.gms.internal.ads.zzbu zzbuVar4 = zzxhVar.zzt;
                int i8 = i3;
                int i9 = i8;
                com.google.android.gms.internal.ads.zzbr zzbrVar = null;
                com.google.android.gms.internal.ads.zzxf zzxfVar = null;
                while (i8 < zzwjVarZzd.zzb) {
                    com.google.android.gms.internal.ads.zzbr zzbrVarZzb = zzwjVarZzd.zzb(i8);
                    int[] iArr5 = iArr4[i8];
                    com.google.android.gms.internal.ads.zzxf zzxfVar2 = zzxfVar;
                    for (int i10 = i3; i10 < zzbrVarZzb.zza; i10++) {
                        if (com.google.android.gms.internal.ads.zzlk.zza(iArr5[i10], zzxhVar.zzO)) {
                            com.google.android.gms.internal.ads.zzxf zzxfVar3 = new com.google.android.gms.internal.ads.zzxf(zzbrVarZzb.zzb(i10), iArr5[i10]);
                            if (zzxfVar2 == null || zzxfVar3.compareTo(zzxfVar2) > 0) {
                                zzxfVar2 = zzxfVar3;
                                i9 = i10;
                                zzbrVar = zzbrVarZzb;
                            }
                        }
                    }
                    i8++;
                    zzxfVar = zzxfVar2;
                    i3 = 0;
                }
                zzxuVarArr[i7] = zzbrVar == null ? null : new com.google.android.gms.internal.ads.zzxu(zzbrVar, new int[]{i9}, 0);
            }
            i7++;
            i2 = 2;
            i3 = 0;
            i = 1;
            i5 = 4;
            i6 = 3;
        }
        java.util.HashMap map = new java.util.HashMap();
        int i11 = 2;
        for (int i12 = 0; i12 < 2; i12++) {
            zzt(zzxxVar.zzd(i12), zzxhVar, map);
        }
        zzt(zzxxVar.zze(), zzxhVar, map);
        for (int i13 = 0; i13 < 2; i13++) {
            if (((com.google.android.gms.internal.ads.zzbs) map.get(java.lang.Integer.valueOf(zzxxVar.zzc(i13)))) != null) {
                throw null;
            }
        }
        int i14 = 0;
        while (i14 < i11) {
            com.google.android.gms.internal.ads.zzwj zzwjVarZzd2 = zzxxVar.zzd(i14);
            if (zzxhVar.zzg(i14, zzwjVarZzd2)) {
                if (zzxhVar.zze(i14, zzwjVarZzd2) != null) {
                    throw null;
                }
                zzxuVarArr[i14] = null;
            }
            i14++;
            i11 = 2;
        }
        int i15 = 0;
        for (int i16 = i11; i15 < i16; i16 = 2) {
            int iZzc2 = zzxxVar.zzc(i15);
            if (zzxhVar.zzf(i15) || zzxhVar.zzC.contains(java.lang.Integer.valueOf(iZzc2))) {
                zzxuVarArr[i15] = null;
            }
            i15++;
        }
        com.google.android.gms.internal.ads.zzwp zzwpVar = this.zzi;
        com.google.android.gms.internal.ads.zzyj zzyjVarZzq = zzq();
        com.google.android.gms.internal.ads.zzfxn zzfxnVarZzh = com.google.android.gms.internal.ads.zzwq.zzh(zzxuVarArr);
        int i17 = 2;
        com.google.android.gms.internal.ads.zzxv[] zzxvVarArr = new com.google.android.gms.internal.ads.zzxv[2];
        int i18 = 0;
        while (i18 < i17) {
            com.google.android.gms.internal.ads.zzxu zzxuVar = zzxuVarArr[i18];
            if (zzxuVar != null && (length = (iArr3 = zzxuVar.zzb).length) != 0) {
                zzxvVarArr[i18] = length == 1 ? new com.google.android.gms.internal.ads.zzxw(zzxuVar.zza, iArr3[0], 0, 0, null) : zzwpVar.zza(zzxuVar.zza, iArr3, 0, zzyjVarZzq, (com.google.android.gms.internal.ads.zzfxn) zzfxnVarZzh.get(i18));
            }
            i18++;
            i17 = 2;
        }
        com.google.android.gms.internal.ads.zzln[] zzlnVarArr = new com.google.android.gms.internal.ads.zzln[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            zzlnVarArr[i19] = (zzxhVar.zzf(i19) || zzxhVar.zzC.contains(java.lang.Integer.valueOf(zzxxVar.zzc(i19))) || (zzxxVar.zzc(i19) != -2 && zzxvVarArr[i19] == null)) ? null : com.google.android.gms.internal.ads.zzln.zza;
        }
        boolean z3 = zzxhVar.zzP;
        com.google.android.gms.internal.ads.zzbu zzbuVar5 = zzxhVar.zzt;
        return android.util.Pair.create(zzlnVarArr, zzxvVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final com.google.android.gms.internal.ads.zzll zze() {
        return this;
    }

    public final com.google.android.gms.internal.ads.zzxh zzf() {
        com.google.android.gms.internal.ads.zzxh zzxhVar;
        synchronized (this.zzd) {
            zzxhVar = this.zzf;
        }
        return zzxhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final void zzj() {
        com.google.android.gms.internal.ads.zzxl zzxlVar;
        synchronized (this.zzd) {
            if (com.google.android.gms.internal.ads.zzei.zza >= 32 && (zzxlVar = this.zzg) != null) {
                zzxlVar.zzc();
            }
        }
        super.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final void zzk(com.google.android.gms.internal.ads.zze zzeVar) {
        boolean z;
        synchronized (this.zzd) {
            z = !this.zzh.equals(zzeVar);
            this.zzh = zzeVar;
        }
        if (z) {
            zzu();
        }
    }

    public final void zzl(com.google.android.gms.internal.ads.zzxg zzxgVar) {
        boolean z;
        com.google.android.gms.internal.ads.zzxh zzxhVar = new com.google.android.gms.internal.ads.zzxh(zzxgVar);
        synchronized (this.zzd) {
            z = !this.zzf.equals(zzxhVar);
            this.zzf = zzxhVar;
        }
        if (z) {
            if (zzxhVar.zzN && this.zza == null) {
                com.google.android.gms.internal.ads.zzdo.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final boolean zzn() {
        return true;
    }
}
