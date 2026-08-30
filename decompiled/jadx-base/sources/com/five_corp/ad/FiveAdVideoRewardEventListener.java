package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public interface FiveAdVideoRewardEventListener {
    default void onClick(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onFullScreenClose(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onFullScreenOpen(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onImpression(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onPause(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onPlay(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward) {
    }

    void onReward(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward);

    void onViewError(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward, com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode);

    default void onViewThrough(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward) {
    }
}
