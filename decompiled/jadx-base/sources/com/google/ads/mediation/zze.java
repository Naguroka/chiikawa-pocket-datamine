package com.google.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zze extends com.google.android.gms.ads.AdListener implements com.google.android.gms.ads.formats.zzi, com.google.android.gms.ads.formats.zzg, com.google.android.gms.ads.formats.zzf {
    final com.google.ads.mediation.AbstractAdViewAdapter zza;
    final com.google.android.gms.ads.mediation.MediationNativeListener zzb;

    public zze(com.google.ads.mediation.AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.MediationNativeListener mediationNativeListener) {
        this.zza = abstractAdViewAdapter;
        this.zzb = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.onAdClicked(this.zza);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.zzb.onAdClosed(this.zza);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
        this.zzb.onAdFailedToLoad(this.zza, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.zzb.onAdImpression(this.zza);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.zzb.onAdOpened(this.zza);
    }

    @Override // com.google.android.gms.ads.formats.zzi
    public final void zza(com.google.android.gms.ads.formats.UnifiedNativeAd unifiedNativeAd) {
        this.zzb.onAdLoaded(this.zza, new com.google.ads.mediation.zza(unifiedNativeAd));
    }

    @Override // com.google.android.gms.ads.formats.zzf
    public final void zzb(com.google.android.gms.internal.ads.zzbgr zzbgrVar, java.lang.String str) {
        this.zzb.zze(this.zza, zzbgrVar, str);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zzc(com.google.android.gms.internal.ads.zzbgr zzbgrVar) {
        this.zzb.zzd(this.zza, zzbgrVar);
    }
}
