package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public interface UnityAdListener extends com.google.unity.ads.UnityPaidEventListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError error);

    void onAdImpression();

    void onAdLeftApplication();

    void onAdLoaded();

    void onAdOpened();
}
