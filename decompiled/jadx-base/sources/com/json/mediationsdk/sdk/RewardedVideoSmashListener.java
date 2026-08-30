package com.json.mediationsdk.sdk;

/* JADX INFO: loaded from: classes5.dex */
public interface RewardedVideoSmashListener {
    void onRewardedVideoAdClicked();

    void onRewardedVideoAdClosed();

    void onRewardedVideoAdEnded();

    void onRewardedVideoAdOpened();

    void onRewardedVideoAdRewarded();

    void onRewardedVideoAdShowFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError);

    void onRewardedVideoAdStarted();

    void onRewardedVideoAdVisible();

    void onRewardedVideoAvailabilityChanged(boolean z);

    void onRewardedVideoInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError);

    void onRewardedVideoInitSuccess();

    void onRewardedVideoLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError);

    void onRewardedVideoLoadSuccess();
}
