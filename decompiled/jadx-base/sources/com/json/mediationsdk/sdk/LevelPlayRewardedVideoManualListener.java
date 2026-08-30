package com.json.mediationsdk.sdk;

/* JADX INFO: loaded from: classes5.dex */
public interface LevelPlayRewardedVideoManualListener extends com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener {
    void onAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError);

    void onAdReady(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo);
}
