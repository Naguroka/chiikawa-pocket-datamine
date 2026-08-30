package com.google.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzc extends com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback {
    final com.google.ads.mediation.AbstractAdViewAdapter zza;
    final com.google.android.gms.ads.mediation.MediationInterstitialListener zzb;

    public zzc(com.google.ads.mediation.AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener) {
        this.zza = abstractAdViewAdapter;
        this.zzb = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
        this.zzb.onAdFailedToLoad(this.zza, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
        com.google.ads.mediation.AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd;
        abstractAdViewAdapter.mInterstitialAd.setFullScreenContentCallback(new com.google.ads.mediation.zzd(abstractAdViewAdapter, this.zzb));
        this.zzb.onAdLoaded(this.zza);
    }
}
