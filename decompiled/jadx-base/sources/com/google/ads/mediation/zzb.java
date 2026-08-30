package com.google.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzb extends com.google.android.gms.ads.AdListener implements com.google.android.gms.ads.admanager.AppEventListener, com.google.android.gms.ads.internal.client.zza {
    final com.google.ads.mediation.AbstractAdViewAdapter zza;
    final com.google.android.gms.ads.mediation.MediationBannerListener zzb;

    public zzb(com.google.ads.mediation.AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener) {
        this.zza = abstractAdViewAdapter;
        this.zzb = mediationBannerListener;
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
    public final void onAdLoaded() {
        this.zzb.onAdLoaded(this.zza);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.zzb.onAdOpened(this.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(java.lang.String str, java.lang.String str2) {
        this.zzb.zzb(this.zza, str, str2);
    }
}
