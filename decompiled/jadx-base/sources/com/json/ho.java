package com.json;

/* JADX INFO: loaded from: classes5.dex */
public interface ho extends com.json.eo {
    void onInterstitialAdRewarded(java.lang.String str, int i);

    void onInterstitialClick();

    void onInterstitialClose();

    void onInterstitialEventNotificationReceived(java.lang.String str, org.json.JSONObject jSONObject);

    void onInterstitialInitFailed(java.lang.String str);

    void onInterstitialInitSuccess();

    void onInterstitialLoadFailed(java.lang.String str);

    void onInterstitialLoadSuccess(com.json.mj mjVar);

    void onInterstitialOpen();

    void onInterstitialShowFailed(java.lang.String str);

    void onInterstitialShowSuccess();
}
