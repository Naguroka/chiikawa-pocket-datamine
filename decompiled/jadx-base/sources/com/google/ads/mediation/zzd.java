package com.google.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzd extends com.google.android.gms.ads.FullScreenContentCallback {
    final com.google.ads.mediation.AbstractAdViewAdapter zza;
    final com.google.android.gms.ads.mediation.MediationInterstitialListener zzb;

    public zzd(com.google.ads.mediation.AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener) {
        this.zza = abstractAdViewAdapter;
        this.zzb = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.zzb.onAdClosed(this.zza);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.zzb.onAdOpened(this.zza);
    }
}
