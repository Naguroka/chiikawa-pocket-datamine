package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public interface FiveAdCustomLayoutEventListener {
    default void onClick(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout) {
    }

    default void onImpression(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout) {
    }

    default void onPause(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout) {
    }

    default void onPlay(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout) {
    }

    default void onRemove(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout) {
    }

    void onViewError(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout, com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode);

    default void onViewThrough(com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout) {
    }
}
