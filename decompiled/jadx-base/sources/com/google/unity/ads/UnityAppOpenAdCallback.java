package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public interface UnityAppOpenAdCallback extends com.google.unity.ads.UnityFullScreenContentCallback, com.google.unity.ads.UnityPaidEventListener {
    void onAppOpenAdFailedToLoad(com.google.android.gms.ads.LoadAdError error);

    void onAppOpenAdLoaded();
}
