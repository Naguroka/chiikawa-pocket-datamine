package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzajj implements com.google.android.gms.internal.ads.zzajo {
    private final com.google.android.gms.internal.ads.zzacy zza;
    private final com.google.android.gms.internal.ads.zzacx zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzajj(com.google.android.gms.internal.ads.zzacy zzacyVar, com.google.android.gms.internal.ads.zzacx zzacxVar) {
        this.zza = zzacyVar;
        this.zzb = zzacxVar;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final long zzd(com.google.android.gms.internal.ads.zzaco zzacoVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final com.google.android.gms.internal.ads.zzadm zze() {
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzc != -1);
        return new com.google.android.gms.internal.ads.zzacw(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[com.google.android.gms.internal.ads.zzei.zzd(jArr, j, true, true)];
    }
}
