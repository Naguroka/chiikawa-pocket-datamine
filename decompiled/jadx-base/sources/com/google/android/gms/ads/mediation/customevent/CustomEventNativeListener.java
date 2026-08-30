package com.google.android.gms.ads.mediation.customevent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public interface CustomEventNativeListener extends com.google.android.gms.ads.mediation.customevent.CustomEventListener {
    void onAdImpression();

    void onAdLoaded(com.google.android.gms.ads.mediation.UnifiedNativeAdMapper unifiedNativeAdMapper);
}
