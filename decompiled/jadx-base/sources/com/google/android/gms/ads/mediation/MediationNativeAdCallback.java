package com.google.android.gms.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface MediationNativeAdCallback extends com.google.android.gms.ads.mediation.MediationAdCallback {
    void onAdLeftApplication();

    void onVideoComplete();

    void onVideoMute();

    void onVideoPause();

    void onVideoPlay();

    void onVideoUnmute();
}
