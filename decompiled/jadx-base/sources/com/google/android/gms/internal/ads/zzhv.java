package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhv {
    private final long zza;
    private final long zzb;
    private long zzc = androidx.media3.common.C.TIME_UNSET;
    private long zzd = androidx.media3.common.C.TIME_UNSET;
    private long zzf = androidx.media3.common.C.TIME_UNSET;
    private long zzg = androidx.media3.common.C.TIME_UNSET;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = androidx.media3.common.C.TIME_UNSET;
    private long zze = androidx.media3.common.C.TIME_UNSET;
    private long zzh = androidx.media3.common.C.TIME_UNSET;
    private long zzm = androidx.media3.common.C.TIME_UNSET;
    private long zzn = androidx.media3.common.C.TIME_UNSET;

    /* synthetic */ zzhv(float f, float f2, long j, float f3, long j2, long j3, float f4, com.google.android.gms.internal.ads.zzhu zzhuVar) {
        this.zza = j2;
        this.zzb = j3;
    }

    private static long zzf(long j, long j2, float f) {
        return (long) ((j * 0.999f) + (j2 * 9.999871E-4f));
    }

    private final void zzg() {
        long j;
        long j2 = this.zzc;
        if (j2 != androidx.media3.common.C.TIME_UNSET) {
            j = this.zzd;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                long j3 = this.zzf;
                if (j3 != androidx.media3.common.C.TIME_UNSET && j2 < j3) {
                    j2 = j3;
                }
                j = this.zzg;
                if (j == androidx.media3.common.C.TIME_UNSET || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.zze == j) {
            return;
        }
        this.zze = j;
        this.zzh = j;
        this.zzm = androidx.media3.common.C.TIME_UNSET;
        this.zzn = androidx.media3.common.C.TIME_UNSET;
        this.zzl = androidx.media3.common.C.TIME_UNSET;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long j = this.zzh;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return;
        }
        long j2 = j + this.zzb;
        this.zzh = j2;
        long j3 = this.zzg;
        if (j3 != androidx.media3.common.C.TIME_UNSET && j2 > j3) {
            this.zzh = j3;
        }
        this.zzl = androidx.media3.common.C.TIME_UNSET;
    }

    public final void zzd(com.google.android.gms.internal.ads.zzal zzalVar) {
        long j = zzalVar.zza;
        this.zzc = com.google.android.gms.internal.ads.zzei.zzs(androidx.media3.common.C.TIME_UNSET);
        long j2 = zzalVar.zzb;
        this.zzf = com.google.android.gms.internal.ads.zzei.zzs(androidx.media3.common.C.TIME_UNSET);
        long j3 = zzalVar.zzc;
        this.zzg = com.google.android.gms.internal.ads.zzei.zzs(androidx.media3.common.C.TIME_UNSET);
        float f = zzalVar.zzd;
        this.zzj = 0.97f;
        float f2 = zzalVar.zze;
        this.zzi = 1.03f;
        zzg();
    }

    public final void zze(long j) {
        this.zzd = j;
        zzg();
    }

    public final float zza(long j, long j2) {
        if (this.zzc == androidx.media3.common.C.TIME_UNSET) {
            return 1.0f;
        }
        long j3 = j - j2;
        long j4 = this.zzm;
        if (j4 == androidx.media3.common.C.TIME_UNSET) {
            this.zzm = j3;
            this.zzn = 0L;
        } else {
            long jMax = java.lang.Math.max(j3, zzf(j4, j3, 0.999f));
            this.zzm = jMax;
            this.zzn = zzf(this.zzn, java.lang.Math.abs(j3 - jMax), 0.999f);
        }
        if (this.zzl != androidx.media3.common.C.TIME_UNSET && android.os.SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = android.os.SystemClock.elapsedRealtime();
        long jMax2 = this.zzm + (this.zzn * 3);
        if (this.zzh > jMax2) {
            float fZzs = com.google.android.gms.internal.ads.zzei.zzs(1000L);
            long[] jArr = {jMax2, this.zze, this.zzh - (((long) ((this.zzk - 1.0f) * fZzs)) + ((long) ((this.zzi - 1.0f) * fZzs)))};
            for (int i = 1; i < 3; i++) {
                long j5 = jArr[i];
                if (j5 > jMax2) {
                    jMax2 = j5;
                }
            }
            this.zzh = jMax2;
        } else {
            jMax2 = java.lang.Math.max(this.zzh, java.lang.Math.min(j - ((long) (java.lang.Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f)), jMax2));
            this.zzh = jMax2;
            long j6 = this.zzg;
            if (j6 != androidx.media3.common.C.TIME_UNSET && jMax2 > j6) {
                this.zzh = j6;
                jMax2 = j6;
            }
        }
        long j7 = j - jMax2;
        if (java.lang.Math.abs(j7) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float fMax = java.lang.Math.max(this.zzj, java.lang.Math.min((j7 * 1.0E-7f) + 1.0f, this.zzi));
        this.zzk = fMax;
        return fMax;
    }
}
