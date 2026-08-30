package com.json.mediationsdk.sdk;

/* JADX INFO: loaded from: classes5.dex */
@java.lang.Deprecated
public interface LevelPlayBannerListener {
    @java.lang.Deprecated
    void onAdClicked(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);

    @java.lang.Deprecated
    void onAdLeftApplication(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);

    @java.lang.Deprecated
    void onAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError);

    @java.lang.Deprecated
    void onAdLoaded(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);

    @java.lang.Deprecated
    void onAdScreenDismissed(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);

    @java.lang.Deprecated
    void onAdScreenPresented(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);
}
