package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzadc {
    public final java.util.List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final int zzj;
    public final java.lang.String zzk;
    public final com.google.android.gms.internal.ads.zzfh zzl;

    private zzadc(java.util.List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, int i10, java.lang.String str, com.google.android.gms.internal.ads.zzfh zzfhVar) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = i9;
        this.zzi = f;
        this.zzj = i10;
        this.zzk = str;
        this.zzl = zzfhVar;
    }

    public static com.google.android.gms.internal.ads.zzadc zza(com.google.android.gms.internal.ads.zzdy zzdyVar) throws com.google.android.gms.internal.ads.zzbc {
        return zzc(zzdyVar, false, null);
    }

    public static com.google.android.gms.internal.ads.zzadc zzb(com.google.android.gms.internal.ads.zzdy zzdyVar, com.google.android.gms.internal.ads.zzfh zzfhVar) throws com.google.android.gms.internal.ads.zzbc {
        return zzc(zzdyVar, true, zzfhVar);
    }

    private static com.google.android.gms.internal.ads.zzadc zzc(com.google.android.gms.internal.ads.zzdy zzdyVar, boolean z, com.google.android.gms.internal.ads.zzfh zzfhVar) throws com.google.android.gms.internal.ads.zzbc {
        boolean z2;
        int i;
        com.google.android.gms.internal.ads.zzfd zzfdVar;
        int i2 = 4;
        boolean z3 = true;
        try {
            if (z) {
                zzdyVar.zzM(4);
            } else {
                zzdyVar.zzM(21);
            }
            int iZzm = zzdyVar.zzm() & 3;
            int iZzm2 = zzdyVar.zzm();
            int iZzd = zzdyVar.zzd();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < iZzm2; i5++) {
                zzdyVar.zzM(1);
                int iZzq = zzdyVar.zzq();
                for (int i6 = 0; i6 < iZzq; i6++) {
                    int iZzq2 = zzdyVar.zzq();
                    i4 += iZzq2 + 4;
                    zzdyVar.zzM(iZzq2);
                }
            }
            zzdyVar.zzL(iZzd);
            byte[] bArr = new byte[i4];
            com.google.android.gms.internal.ads.zzfh zzfhVar2 = zzfhVar;
            int i7 = 0;
            float f = 1.0f;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            java.lang.String strZzd = null;
            int i17 = 0;
            while (i17 < iZzm2) {
                int iZzm3 = zzdyVar.zzm() & 63;
                int iZzq3 = zzdyVar.zzq();
                int i18 = i3;
                com.google.android.gms.internal.ads.zzfh zzfhVarZzd = zzfhVar2;
                while (i18 < iZzq3) {
                    try {
                        int iZzq4 = zzdyVar.zzq();
                        int i19 = iZzm2;
                        java.lang.System.arraycopy(com.google.android.gms.internal.ads.zzfk.zza, i3, bArr, i7, i2);
                        int i20 = i7 + 4;
                        java.lang.System.arraycopy(zzdyVar.zzN(), zzdyVar.zzd(), bArr, i20, iZzq4);
                        int i21 = 32;
                        if (iZzm3 == 32) {
                            if (i18 == 0) {
                                zzfhVarZzd = com.google.android.gms.internal.ads.zzfk.zzd(bArr, i20, i20 + iZzq4);
                                i18 = i3;
                                iZzq3 = iZzq3;
                                iZzm3 = iZzm3;
                            }
                            i7 = i20 + iZzq4;
                            zzdyVar.zzM(iZzq4);
                            i18++;
                            iZzm2 = i19;
                            iZzq3 = iZzq3;
                            iZzm3 = iZzm3;
                            i2 = 4;
                        } else {
                            i21 = iZzm3;
                        }
                        int i22 = 8;
                        if (i21 != 33) {
                            iZzq3 = iZzq3;
                            iZzm3 = iZzm3;
                            if (i21 == 39 && i18 == 0) {
                                int i23 = i20 + 2;
                                int i24 = (i20 + iZzq4) - 1;
                                while (true) {
                                    byte b = bArr[i24];
                                    if (b != 0) {
                                        if (b != 0 && i24 > i23) {
                                            com.google.android.gms.internal.ads.zzfl zzflVar = new com.google.android.gms.internal.ads.zzfl(bArr, i23, i24 + 1);
                                            while (true) {
                                                if (zzflVar.zzg(16)) {
                                                    int iZza = zzflVar.zza(i22);
                                                    int i25 = 0;
                                                    while (iZza == 255) {
                                                        i25 += 255;
                                                        iZza = zzflVar.zza(i22);
                                                    }
                                                    int i26 = i25 + iZza;
                                                    int iZza2 = zzflVar.zza(i22);
                                                    int i27 = 0;
                                                    while (iZza2 == 255) {
                                                        i27 += 255;
                                                        iZza2 = zzflVar.zza(8);
                                                    }
                                                    int i28 = i27 + iZza2;
                                                    if (i28 != 0 && zzflVar.zzg(i28)) {
                                                        if (i26 == 176) {
                                                            int iZzc = zzflVar.zzc();
                                                            boolean zZzh = zzflVar.zzh();
                                                            int iZzc2 = zZzh ? zzflVar.zzc() : 0;
                                                            int iZzc3 = zzflVar.zzc();
                                                            int i29 = 0;
                                                            int iZzc4 = -1;
                                                            int iZzc5 = -1;
                                                            int i30 = -1;
                                                            int iZza3 = -1;
                                                            int i31 = -1;
                                                            int iZza4 = -1;
                                                            while (true) {
                                                                if (i29 <= iZzc3) {
                                                                    iZzc4 = zzflVar.zzc();
                                                                    iZzc5 = zzflVar.zzc();
                                                                    i = i18;
                                                                    int iZza5 = zzflVar.zza(6);
                                                                    if (iZza5 != 63) {
                                                                        iZza3 = zzflVar.zza(iZza5 == 0 ? java.lang.Math.max(0, iZzc - 30) : java.lang.Math.max(0, (iZza5 + iZzc) - 31));
                                                                        if (zZzh) {
                                                                            int iZza6 = zzflVar.zza(6);
                                                                            if (iZza6 != 63) {
                                                                                iZza4 = zzflVar.zza(iZza6 == 0 ? java.lang.Math.max(0, iZzc2 - 30) : java.lang.Math.max(0, (iZza6 + iZzc2) - 31));
                                                                                i31 = iZza6;
                                                                            }
                                                                        } else {
                                                                            zZzh = zZzh;
                                                                        }
                                                                        if (zzflVar.zzh()) {
                                                                            zzflVar.zzf(10);
                                                                        }
                                                                        i29++;
                                                                        i30 = iZza5;
                                                                        i18 = i;
                                                                        zZzh = zZzh;
                                                                        i8 = i8;
                                                                    }
                                                                    zzfdVar = null;
                                                                } else {
                                                                    i = i18;
                                                                    i8 = i8;
                                                                    zzfdVar = new com.google.android.gms.internal.ads.zzfd(iZzc, iZzc2, iZzc3 + 1, iZzc4, iZzc5, i30, iZza3, i31, iZza4);
                                                                }
                                                            }
                                                        } else {
                                                            i22 = 8;
                                                        }
                                                    }
                                                    i8 = i8;
                                                    zzfdVar = null;
                                                }
                                            }
                                        }
                                        if (zzfdVar == null && zzfhVarZzd != null) {
                                            i3 = 0;
                                            if (zzfdVar.zza == ((com.google.android.gms.internal.ads.zzex) zzfhVarZzd.zza.get(0)).zzb) {
                                                i18 = i;
                                                i8 = i8;
                                                i15 = 4;
                                            } else {
                                                i15 = 5;
                                            }
                                        }
                                        i18 = i;
                                        i8 = i8;
                                    } else if (i24 > i23) {
                                        i24--;
                                    }
                                    i = i18;
                                    i8 = i8;
                                    zzfdVar = null;
                                    if (zzfdVar == null) {
                                    }
                                }
                            } else {
                                i = i18;
                                i8 = i8;
                            }
                            i3 = 0;
                            i18 = i;
                            i8 = i8;
                        } else if (i18 == 0) {
                            com.google.android.gms.internal.ads.zzfe zzfeVarZzc = com.google.android.gms.internal.ads.zzfk.zzc(bArr, i20, i20 + iZzq4, zzfhVarZzd);
                            int i32 = zzfeVarZzc.zzd;
                            int i33 = zzfeVarZzc.zze;
                            i10 = zzfeVarZzc.zzb + 8;
                            int i34 = zzfeVarZzc.zzc + 8;
                            int i35 = zzfeVarZzc.zzh;
                            i11 = i34;
                            int i36 = zzfeVarZzc.zzi;
                            int i37 = zzfeVarZzc.zzj;
                            float f2 = zzfeVarZzc.zzf;
                            int i38 = zzfeVarZzc.zzg;
                            com.google.android.gms.internal.ads.zzez zzezVar = zzfeVarZzc.zza;
                            if (zzezVar != null) {
                                strZzd = com.google.android.gms.internal.ads.zzcy.zzd(zzezVar.zza, zzezVar.zzb, zzezVar.zzc, zzezVar.zzd, zzezVar.zze, zzezVar.zzf);
                            }
                            i8 = i32;
                            i9 = i33;
                            i3 = 0;
                            i13 = i36;
                            i12 = i35;
                            i16 = i38;
                            f = f2;
                            i14 = i37;
                        } else {
                            iZzq3 = iZzq3;
                            iZzm3 = iZzm3;
                            i = i18;
                            i8 = i8;
                            i3 = 0;
                            i18 = i;
                            i8 = i8;
                        }
                        i7 = i20 + iZzq4;
                        zzdyVar.zzM(iZzq4);
                        i18++;
                        iZzm2 = i19;
                        iZzq3 = iZzq3;
                        iZzm3 = iZzm3;
                        i2 = 4;
                    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                        e = e;
                        z2 = true;
                        throw com.google.android.gms.internal.ads.zzbc.zza("Error parsing".concat(z2 != z ? "HEVC config" : "L-HEVC config"), e);
                    }
                }
                i17++;
                zzfhVar2 = zzfhVarZzd;
                i2 = 4;
                z3 = true;
            }
            return new com.google.android.gms.internal.ads.zzadc(i4 == 0 ? java.util.Collections.emptyList() : java.util.Collections.singletonList(bArr), iZzm + 1, i8, i9, i10, i11, i12, i13, i14, i15, f, i16, strZzd, zzfhVar2);
        } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
            e = e2;
            z2 = z3;
        }
    }
}
