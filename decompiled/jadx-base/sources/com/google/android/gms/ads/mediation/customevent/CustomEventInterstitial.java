package com.google.android.gms.ads.mediation.customevent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public interface CustomEventInterstitial extends com.google.android.gms.ads.mediation.customevent.CustomEvent {
    void requestInterstitialAd(android.content.Context context, com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener customEventInterstitialListener, java.lang.String str, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle);

    void showInterstitial();
}
