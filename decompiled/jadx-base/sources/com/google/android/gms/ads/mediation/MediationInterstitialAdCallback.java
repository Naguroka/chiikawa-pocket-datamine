package com.google.android.gms.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface MediationInterstitialAdCallback extends com.google.android.gms.ads.mediation.MediationAdCallback {
    void onAdFailedToShow(com.google.android.gms.ads.AdError adError);

    @java.lang.Deprecated
    void onAdFailedToShow(java.lang.String str);

    void onAdLeftApplication();
}
