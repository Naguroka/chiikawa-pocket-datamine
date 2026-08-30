package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public interface FiveAdViewEventListener {
    void onFiveAdClick(com.five_corp.ad.FiveAdInterface fiveAdInterface);

    void onFiveAdClose(com.five_corp.ad.FiveAdInterface fiveAdInterface);

    void onFiveAdImpression(com.five_corp.ad.FiveAdInterface fiveAdInterface);

    void onFiveAdPause(com.five_corp.ad.FiveAdInterface fiveAdInterface);

    void onFiveAdRecover(com.five_corp.ad.FiveAdInterface fiveAdInterface);

    void onFiveAdReplay(com.five_corp.ad.FiveAdInterface fiveAdInterface);

    void onFiveAdResume(com.five_corp.ad.FiveAdInterface fiveAdInterface);

    void onFiveAdStall(com.five_corp.ad.FiveAdInterface fiveAdInterface);

    void onFiveAdStart(com.five_corp.ad.FiveAdInterface fiveAdInterface);

    void onFiveAdViewError(com.five_corp.ad.FiveAdInterface fiveAdInterface, com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode);

    void onFiveAdViewThrough(com.five_corp.ad.FiveAdInterface fiveAdInterface);
}
