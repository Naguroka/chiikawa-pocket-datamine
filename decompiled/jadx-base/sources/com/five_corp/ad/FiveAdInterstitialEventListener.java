package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public interface FiveAdInterstitialEventListener {
    default void onClick(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial) {
    }

    default void onFullScreenClose(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial) {
    }

    default void onFullScreenOpen(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial) {
    }

    default void onImpression(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial) {
    }

    default void onPause(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial) {
    }

    default void onPlay(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial) {
    }

    void onViewError(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial, com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode);

    default void onViewThrough(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial) {
    }
}
