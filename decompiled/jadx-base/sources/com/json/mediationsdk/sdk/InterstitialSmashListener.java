package com.json.mediationsdk.sdk;

/* JADX INFO: loaded from: classes5.dex */
public interface InterstitialSmashListener {
    void onInterstitialAdClicked();

    void onInterstitialAdClosed();

    void onInterstitialAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError);

    void onInterstitialAdOpened();

    void onInterstitialAdReady();

    void onInterstitialAdShowFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError);

    void onInterstitialAdShowSucceeded();

    void onInterstitialAdVisible();

    void onInterstitialInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError);

    void onInterstitialInitSuccess();
}
