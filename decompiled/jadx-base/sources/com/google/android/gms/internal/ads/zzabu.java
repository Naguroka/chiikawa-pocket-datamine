package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzabu {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    protected zzabu(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.zza = j;
        this.zzb = j2;
        this.zze = j4;
        this.zzf = j5;
        this.zzg = j6;
        this.zzc = j7;
        this.zzh = zzf(j2, 0L, j4, j5, j6, j7);
    }

    protected static long zzf(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return java.lang.Math.max(j4, java.lang.Math.min(((j4 + j7) - j6) - (j7 / 20), j5 - 1));
    }

    static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzabu zzabuVar, long j, long j2) {
        zzabuVar.zze = j;
        zzabuVar.zzg = j2;
        zzabuVar.zzi();
    }

    static /* bridge */ /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzabu zzabuVar, long j, long j2) {
        zzabuVar.zzd = j;
        zzabuVar.zzf = j2;
        zzabuVar.zzi();
    }

    private final void zzi() {
        this.zzh = zzf(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}
