package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaoi implements com.google.android.gms.internal.ads.zzadm {
    private final com.google.android.gms.internal.ads.zzaof zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaoi(com.google.android.gms.internal.ads.zzaof zzaofVar, int i, long j, long j2) {
        this.zza = zzaofVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / ((long) zzaofVar.zzd);
        this.zzd = j3;
        this.zze = zzb(j3);
    }

    private final long zzb(long j) {
        return com.google.android.gms.internal.ads.zzei.zzu(j * ((long) this.zzb), 1000000L, this.zza.zzc, java.math.RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final com.google.android.gms.internal.ads.zzadk zzg(long j) {
        long jMax = java.lang.Math.max(0L, java.lang.Math.min((((long) this.zza.zzc) * j) / (((long) this.zzb) * 1000000), this.zzd - 1));
        long j2 = ((long) this.zza.zzd) * jMax;
        long jZzb = zzb(jMax);
        com.google.android.gms.internal.ads.zzadn zzadnVar = new com.google.android.gms.internal.ads.zzadn(jZzb, this.zzc + j2);
        if (jZzb >= j || jMax == this.zzd - 1) {
            return new com.google.android.gms.internal.ads.zzadk(zzadnVar, zzadnVar);
        }
        long j3 = jMax + 1;
        return new com.google.android.gms.internal.ads.zzadk(zzadnVar, new com.google.android.gms.internal.ads.zzadn(zzb(j3), this.zzc + (j3 * ((long) this.zza.zzd))));
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
