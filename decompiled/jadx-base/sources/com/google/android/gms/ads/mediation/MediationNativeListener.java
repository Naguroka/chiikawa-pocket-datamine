package com.google.android.gms.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public interface MediationNativeListener {
    void onAdClicked(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter);

    void onAdClosed(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter);

    @java.lang.Deprecated
    void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter, int i);

    void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.AdError adError);

    void onAdImpression(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter);

    void onAdLeftApplication(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter);

    void onAdLoaded(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.mediation.UnifiedNativeAdMapper unifiedNativeAdMapper);

    void onAdOpened(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter);

    void onVideoEnd(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter);

    void zzd(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.internal.ads.zzbgr zzbgrVar);

    void zze(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.internal.ads.zzbgr zzbgrVar, java.lang.String str);
}
