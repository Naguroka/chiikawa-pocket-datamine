package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public interface UnityInterstitialAdCallback extends com.google.unity.ads.UnityPaidEventListener, com.google.unity.ads.UnityFullScreenContentCallback {
    void onInterstitialAdFailedToLoad(com.google.android.gms.ads.LoadAdError error);

    void onInterstitialAdLoaded();
}
