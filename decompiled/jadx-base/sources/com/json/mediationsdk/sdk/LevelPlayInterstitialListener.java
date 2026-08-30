package com.json.mediationsdk.sdk;

/* JADX INFO: loaded from: classes5.dex */
@java.lang.Deprecated
public interface LevelPlayInterstitialListener {
    @java.lang.Deprecated
    void onAdClicked(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);

    @java.lang.Deprecated
    void onAdClosed(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);

    @java.lang.Deprecated
    void onAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError);

    @java.lang.Deprecated
    void onAdOpened(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);

    @java.lang.Deprecated
    void onAdReady(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);

    @java.lang.Deprecated
    void onAdShowFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);

    @java.lang.Deprecated
    void onAdShowSucceeded(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);
}
