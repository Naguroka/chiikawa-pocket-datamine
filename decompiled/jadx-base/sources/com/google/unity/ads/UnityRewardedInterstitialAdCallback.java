package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public interface UnityRewardedInterstitialAdCallback extends com.google.unity.ads.UnityPaidEventListener, com.google.unity.ads.UnityFullScreenContentCallback {
    void onRewardedInterstitialAdFailedToLoad(com.google.android.gms.ads.LoadAdError error);

    void onRewardedInterstitialAdLoaded();

    void onUserEarnedReward(java.lang.String type, float amount);
}
