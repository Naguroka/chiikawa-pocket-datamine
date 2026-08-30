package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzacb implements com.google.android.gms.internal.ads.zzadm {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzacb(long j, long j2, int i, int i2, boolean z) {
        long jZzc;
        this.zza = j;
        this.zzb = j2;
        this.zzc = i2 == -1 ? 1 : i2;
        this.zze = i;
        if (j == -1) {
            this.zzd = -1L;
            jZzc = androidx.media3.common.C.TIME_UNSET;
        } else {
            this.zzd = j - j2;
            jZzc = zzc(j, j2, i);
        }
        this.zzf = jZzc;
    }

    private static long zzc(long j, long j2, int i) {
        return (java.lang.Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j) {
        return zzc(j, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final com.google.android.gms.internal.ads.zzadk zzg(long j) {
        long j2 = this.zzd;
        if (j2 == -1) {
            com.google.android.gms.internal.ads.zzadn zzadnVar = new com.google.android.gms.internal.ads.zzadn(0L, this.zzb);
            return new com.google.android.gms.internal.ads.zzadk(zzadnVar, zzadnVar);
        }
        long j3 = ((long) this.zze) * j;
        long j4 = this.zzc;
        long jMin = ((j3 / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = java.lang.Math.min(jMin, j2 - j4);
        }
        long jMax = this.zzb + java.lang.Math.max(jMin, 0L);
        long jZzb = zzb(jMax);
        com.google.android.gms.internal.ads.zzadn zzadnVar2 = new com.google.android.gms.internal.ads.zzadn(jZzb, jMax);
        if (this.zzd != -1 && jZzb < j) {
            long j5 = jMax + ((long) this.zzc);
            if (j5 < this.zza) {
                return new com.google.android.gms.internal.ads.zzadk(zzadnVar2, new com.google.android.gms.internal.ads.zzadn(zzb(j5), j5));
            }
        }
        return new com.google.android.gms.internal.ads.zzadk(zzadnVar2, zzadnVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
