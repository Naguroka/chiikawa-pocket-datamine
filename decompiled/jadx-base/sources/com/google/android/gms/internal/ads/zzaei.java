package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaei {
    protected final com.google.android.gms.internal.ads.zzadt zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private long[] zzl;
    private int[] zzm;

    public zzaei(int i, int i2, long j, int i3, com.google.android.gms.internal.ads.zzadt zzadtVar) {
        i2 = i2 != 1 ? 2 : i2;
        this.zzd = j;
        this.zze = i3;
        this.zza = zzadtVar;
        this.zzb = zzh(i, i2 == 2 ? 1667497984 : 1651965952);
        this.zzc = i2 == 2 ? zzh(i, 1650720768) : -1;
        this.zzk = -1L;
        this.zzl = new long[512];
        this.zzm = new int[512];
    }

    private static int zzh(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private final long zzi(int i) {
        return (this.zzd * ((long) i)) / ((long) this.zze);
    }

    private final com.google.android.gms.internal.ads.zzadn zzj(int i) {
        return new com.google.android.gms.internal.ads.zzadn(((long) this.zzm[i]) * zzi(1), this.zzl[i]);
    }

    public final com.google.android.gms.internal.ads.zzadk zza(long j) {
        if (this.zzj == 0) {
            com.google.android.gms.internal.ads.zzadn zzadnVar = new com.google.android.gms.internal.ads.zzadn(0L, this.zzk);
            return new com.google.android.gms.internal.ads.zzadk(zzadnVar, zzadnVar);
        }
        int iZzi = (int) (j / zzi(1));
        int iZzc = com.google.android.gms.internal.ads.zzei.zzc(this.zzm, iZzi, true, true);
        if (this.zzm[iZzc] == iZzi) {
            com.google.android.gms.internal.ads.zzadn zzadnVarZzj = zzj(iZzc);
            return new com.google.android.gms.internal.ads.zzadk(zzadnVarZzj, zzadnVarZzj);
        }
        com.google.android.gms.internal.ads.zzadn zzadnVarZzj2 = zzj(iZzc);
        int i = iZzc + 1;
        return i < this.zzl.length ? new com.google.android.gms.internal.ads.zzadk(zzadnVarZzj2, zzj(i)) : new com.google.android.gms.internal.ads.zzadk(zzadnVarZzj2, zzadnVarZzj2);
    }

    public final void zzb(long j, boolean z) {
        if (this.zzk == -1) {
            this.zzk = j;
        }
        if (z) {
            if (this.zzj == this.zzm.length) {
                long[] jArr = this.zzl;
                this.zzl = java.util.Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzm;
                this.zzm = java.util.Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzl;
            int i = this.zzj;
            jArr2[i] = j;
            this.zzm[i] = this.zzi;
            this.zzj = i + 1;
        }
        this.zzi++;
    }

    public final void zzc() {
        this.zzl = java.util.Arrays.copyOf(this.zzl, this.zzj);
        this.zzm = java.util.Arrays.copyOf(this.zzm, this.zzj);
    }

    public final void zzd(int i) {
        this.zzf = i;
        this.zzg = i;
    }

    public final void zze(long j) {
        if (this.zzj == 0) {
            this.zzh = 0;
        } else {
            this.zzh = this.zzm[com.google.android.gms.internal.ads.zzei.zzd(this.zzl, j, true, true)];
        }
    }

    public final boolean zzf(int i) {
        return this.zzb == i || this.zzc == i;
    }

    public final boolean zzg(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        int i = this.zzg;
        int iZzf = i - this.zza.zzf(zzacoVar, i, false);
        this.zzg = iZzf;
        boolean z = iZzf == 0;
        if (z) {
            if (this.zzf > 0) {
                this.zza.zzt(zzi(this.zzh), java.util.Arrays.binarySearch(this.zzm, this.zzh) >= 0 ? 1 : 0, this.zzf, 0, null);
            }
            this.zzh++;
        }
        return z;
    }
}
