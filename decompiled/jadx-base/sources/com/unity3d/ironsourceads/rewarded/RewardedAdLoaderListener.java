package com.unity3d.ironsourceads.rewarded;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/unity3d/ironsourceads/rewarded/RewardedAdLoaderListener;", "", "onRewardedAdLoadFailed", "", "error", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "onRewardedAdLoaded", "rewardedAd", "Lcom/unity3d/ironsourceads/rewarded/RewardedAd;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface RewardedAdLoaderListener {
    void onRewardedAdLoadFailed(com.json.mediationsdk.logger.IronSourceError error);

    void onRewardedAdLoaded(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd);
}
