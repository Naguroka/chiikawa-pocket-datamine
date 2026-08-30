package com.google.android.gms.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public interface MediationBannerListener {
    void onAdClicked(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter);

    void onAdClosed(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter);

    @java.lang.Deprecated
    void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter, int i);

    void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter, com.google.android.gms.ads.AdError adError);

    void onAdLeftApplication(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter);

    void onAdLoaded(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter);

    void onAdOpened(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter);

    void zzb(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter, java.lang.String str, java.lang.String str2);
}
