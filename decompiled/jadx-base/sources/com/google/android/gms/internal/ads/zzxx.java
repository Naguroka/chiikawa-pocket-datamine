package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzxx {
    private final int[] zza;
    private final com.google.android.gms.internal.ads.zzwj[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final com.google.android.gms.internal.ads.zzwj zze;

    zzxx(java.lang.String[] strArr, int[] iArr, com.google.android.gms.internal.ads.zzwj[] zzwjVarArr, int[] iArr2, int[][][] iArr3, com.google.android.gms.internal.ads.zzwj zzwjVar) {
        this.zza = iArr;
        this.zzb = zzwjVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzwjVar;
    }

    public final int zza(int i, int i2, boolean z) {
        int i3 = this.zzb[i].zzb(i2).zza;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if ((this.zzd[i][i2][i6] & 7) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i5);
        java.lang.String str = null;
        int i7 = 0;
        int iMin = 16;
        boolean z2 = false;
        while (i4 < iArrCopyOf.length) {
            java.lang.String str2 = this.zzb[i].zzb(i2).zzb(iArrCopyOf[i4]).zzo;
            int i8 = i7 + 1;
            if (i7 == 0) {
                str = str2;
            } else {
                z2 |= !java.util.Objects.equals(str, str2);
            }
            iMin = java.lang.Math.min(iMin, this.zzd[i][i2][i4] & 24);
            i4++;
            i7 = i8;
        }
        return z2 ? java.lang.Math.min(iMin, this.zzc[i]) : iMin;
    }

    public final int zzb(int i, int i2, int i3) {
        return this.zzd[i][i2][i3];
    }

    public final int zzc(int i) {
        return this.zza[i];
    }

    public final com.google.android.gms.internal.ads.zzwj zzd(int i) {
        return this.zzb[i];
    }

    public final com.google.android.gms.internal.ads.zzwj zze() {
        return this.zze;
    }
}
