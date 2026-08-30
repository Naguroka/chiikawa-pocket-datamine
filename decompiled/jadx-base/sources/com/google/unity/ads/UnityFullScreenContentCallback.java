package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public interface UnityFullScreenContentCallback {
    void onAdClicked();

    void onAdDismissedFullScreenContent();

    void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError error);

    void onAdImpression();

    void onAdShowedFullScreenContent();
}
