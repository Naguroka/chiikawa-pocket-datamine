package com.json.mediationsdk.sdk;

/* JADX INFO: loaded from: classes5.dex */
public interface LevelPlayRewardedVideoBaseListener {
    void onAdClicked(com.json.mediationsdk.model.Placement placement, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);

    void onAdClosed(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);

    void onAdOpened(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);

    void onAdRewarded(com.json.mediationsdk.model.Placement placement, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);

    void onAdShowFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);
}
