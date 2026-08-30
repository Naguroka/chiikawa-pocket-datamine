package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public interface UnityRewardedAdCallback extends com.google.unity.ads.UnityPaidEventListener, com.google.unity.ads.UnityFullScreenContentCallback {
    void onRewardedAdFailedToLoad(com.google.android.gms.ads.LoadAdError error);

    void onRewardedAdLoaded();

    void onUserEarnedReward(java.lang.String type, float amount);
}
