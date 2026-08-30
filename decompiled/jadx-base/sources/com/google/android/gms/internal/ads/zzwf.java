package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzwf implements com.google.android.gms.internal.ads.zzvy {
    private final com.google.android.gms.internal.ads.zzvy zza;
    private final long zzb;

    public zzwf(com.google.android.gms.internal.ads.zzvy zzvyVar, long j) {
        this.zza = zzvyVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zza(com.google.android.gms.internal.ads.zzke zzkeVar, com.google.android.gms.internal.ads.zzhh zzhhVar, int i) {
        int iZza = this.zza.zza(zzkeVar, zzhhVar, i);
        if (iZza != -4) {
            return iZza;
        }
        zzhhVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final com.google.android.gms.internal.ads.zzvy zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzd() throws java.io.IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final boolean zze() {
        return this.zza.zze();
    }
}
