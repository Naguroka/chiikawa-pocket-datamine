package com.google.unity.ads.nativead;

/* JADX INFO: loaded from: classes5.dex */
public interface UnityNativeTemplateAdCallback extends com.google.unity.ads.UnityPaidEventListener, com.google.unity.ads.UnityFullScreenContentCallback {
    void onNativeAdFailedToLoad(com.google.android.gms.ads.LoadAdError error);

    void onNativeAdLoaded();
}
