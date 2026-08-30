package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzef {
    private long zza;
    private long zzb;
    private long zzc;
    private final java.lang.ThreadLocal zzd = new java.lang.ThreadLocal();

    public zzef(long j) {
        zzi(0L);
    }

    public static long zzg(long j) {
        return com.google.android.gms.internal.ads.zzei.zzu(j, 1000000L, 90000L, java.math.RoundingMode.DOWN);
    }

    public static long zzh(long j) {
        return com.google.android.gms.internal.ads.zzei.zzu(j, 90000L, 1000000L, java.math.RoundingMode.DOWN);
    }

    public final synchronized long zza(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        if (!zzj()) {
            long jLongValue = this.zza;
            if (jLongValue == androidx.media3.common.util.TimestampAdjuster.MODE_SHARED) {
                java.lang.Long l = (java.lang.Long) this.zzd.get();
                l.getClass();
                jLongValue = l.longValue();
            }
            this.zzb = jLongValue - j;
            notifyAll();
        }
        this.zzc = j;
        return j + this.zzb;
    }

    public final synchronized long zzb(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        long j2 = this.zzc;
        if (j2 != androidx.media3.common.C.TIME_UNSET) {
            long jZzh = zzh(j2);
            long j3 = (4294967296L + jZzh) / 8589934592L;
            long j4 = (((-1) + j3) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (java.lang.Math.abs(j4 - jZzh) < java.lang.Math.abs(j - jZzh)) {
                j = j4;
            }
        }
        return zza(zzg(j));
    }

    public final synchronized long zzc(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        long j2 = this.zzc;
        if (j2 != androidx.media3.common.C.TIME_UNSET) {
            long jZzh = zzh(j2);
            long j3 = jZzh / 8589934592L;
            long j4 = (j3 * 8589934592L) + j;
            j += (j3 + 1) * 8589934592L;
            if (j4 >= jZzh) {
                j = j4;
            }
        }
        return zza(zzg(j));
    }

    public final synchronized long zzd() {
        long j = this.zza;
        return (j == Long.MAX_VALUE || j == androidx.media3.common.util.TimestampAdjuster.MODE_SHARED) ? androidx.media3.common.C.TIME_UNSET : j;
    }

    public final synchronized long zze() {
        long j;
        j = this.zzc;
        return j != androidx.media3.common.C.TIME_UNSET ? j + this.zzb : zzd();
    }

    public final synchronized long zzf() {
        return this.zzb;
    }

    public final synchronized void zzi(long j) {
        this.zza = j;
        this.zzb = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = androidx.media3.common.C.TIME_UNSET;
    }

    public final synchronized boolean zzj() {
        return this.zzb != androidx.media3.common.C.TIME_UNSET;
    }
}
