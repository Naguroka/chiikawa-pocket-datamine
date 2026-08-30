package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeep implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzeeq zza;

    zzeep(com.google.android.gms.internal.ads.zzeeq zzeeqVar) {
        this.zza = zzeeqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zza.zza.zzd().zza(th);
        this.zza.zzd.zzdz(zzeVarZza);
        com.google.android.gms.internal.ads.zzfdg.zzb(zzeVarZza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* synthetic */ void zzb(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.zzcom) obj).zzk();
    }
}
