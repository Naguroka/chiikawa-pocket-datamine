package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzwq extends com.google.android.gms.internal.ads.zzws {
    protected zzwq(com.google.android.gms.internal.ads.zzbr zzbrVar, int[] iArr, int i, com.google.android.gms.internal.ads.zzyj zzyjVar, long j, long j2, long j3, int i2, int i3, float f, float f2, java.util.List list, com.google.android.gms.internal.ads.zzcx zzcxVar) {
        super(zzbrVar, iArr, 0);
        com.google.android.gms.internal.ads.zzfxn.zzl(list);
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfxn zzh(com.google.android.gms.internal.ads.zzxu[] zzxuVarArr) {
        int i;
        int i2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i4 >= 2) {
                break;
            }
            com.google.android.gms.internal.ads.zzxu zzxuVar = zzxuVarArr[i4];
            if (zzxuVar == null || zzxuVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
                zzfxkVar.zzf(new com.google.android.gms.internal.ads.zzwo(0L, 0L));
                arrayList.add(zzfxkVar);
            }
            i4++;
        }
        long[][] jArr = new long[2][];
        for (int i5 = 0; i5 < 2; i5++) {
            com.google.android.gms.internal.ads.zzxu zzxuVar2 = zzxuVarArr[i5];
            if (zzxuVar2 == null) {
                jArr[i5] = new long[0];
            } else {
                jArr[i5] = new long[zzxuVar2.zzb.length];
                int i6 = 0;
                while (true) {
                    int[] iArr = zzxuVar2.zzb;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    long j = zzxuVar2.zza.zzb(iArr[i6]).zzj;
                    long[] jArr2 = jArr[i5];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i6] = j;
                    i6++;
                }
                java.util.Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i7 = 0; i7 < 2; i7++) {
            long[] jArr4 = jArr[i7];
            jArr3[i7] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzi(arrayList, jArr3);
        com.google.android.gms.internal.ads.zzfxy zzfxyVarZza = com.google.android.gms.internal.ads.zzfyt.zzc(com.google.android.gms.internal.ads.zzfyy.zzc()).zzb(2).zza();
        int i8 = 0;
        while (i8 < i) {
            int length = jArr[i8].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i9 = i3;
                while (true) {
                    long[] jArr5 = jArr[i8];
                    double dLog = 0.0d;
                    if (i9 >= jArr5.length) {
                        break;
                    }
                    long j2 = jArr5[i9];
                    if (j2 != -1) {
                        dLog = java.lang.Math.log(j2);
                    }
                    dArr[i9] = dLog;
                    i9++;
                }
                int i10 = length - 1;
                double d = dArr[i10] - dArr[i3];
                int i11 = i3;
                while (i11 < i10) {
                    double d2 = dArr[i11];
                    i11++;
                    zzfxyVarZza.zzq(java.lang.Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i11]) * 0.5d) - dArr[i3]) / d), java.lang.Integer.valueOf(i8));
                    i3 = 0;
                }
            }
            i8++;
            i3 = 0;
            i = 2;
            i2 = 1;
        }
        com.google.android.gms.internal.ads.zzfxn zzfxnVarZzl = com.google.android.gms.internal.ads.zzfxn.zzl(zzfxyVarZza.zzr());
        for (int i12 = 0; i12 < zzfxnVarZzl.size(); i12++) {
            int iIntValue = ((java.lang.Integer) zzfxnVarZzl.get(i12)).intValue();
            int i13 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i13;
            jArr3[iIntValue] = jArr[iIntValue][i13];
            zzi(arrayList, jArr3);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j3 = jArr3[i14];
                jArr3[i14] = j3 + j3;
            }
        }
        zzi(arrayList, jArr3);
        com.google.android.gms.internal.ads.zzfxk zzfxkVar2 = new com.google.android.gms.internal.ads.zzfxk();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            com.google.android.gms.internal.ads.zzfxk zzfxkVar3 = (com.google.android.gms.internal.ads.zzfxk) arrayList.get(i15);
            zzfxkVar2.zzf(zzfxkVar3 == null ? com.google.android.gms.internal.ads.zzfxn.zzn() : zzfxkVar3.zzi());
        }
        return zzfxkVar2.zzi();
    }

    private static void zzi(java.util.List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.google.android.gms.internal.ads.zzfxk zzfxkVar = (com.google.android.gms.internal.ads.zzfxk) list.get(i2);
            if (zzfxkVar != null) {
                zzfxkVar.zzf(new com.google.android.gms.internal.ads.zzwo(j, jArr[i2]));
            }
        }
    }
}
