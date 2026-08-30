package com.json.adapters.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceInterstitialListener implements com.json.ho {
    public final java.lang.String AD_VISIBLE_EVENT_NAME = "impressions";
    private final java.lang.String mDemandSourceName;
    private final com.json.mediationsdk.sdk.InterstitialSmashListener mListener;

    IronSourceInterstitialListener(com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener, java.lang.String str) {
        this.mDemandSourceName = str;
        this.mListener = interstitialSmashListener;
    }

    @Override // com.json.ho
    public void onInterstitialAdRewarded(java.lang.String str, int i) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener demandSourceId=" + str + " amount=" + i);
    }

    @Override // com.json.ho
    public void onInterstitialClick() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdClicked();
    }

    @Override // com.json.ho
    public void onInterstitialClose() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdClosed();
    }

    @Override // com.json.ho
    public void onInterstitialEventNotificationReceived(java.lang.String str, org.json.JSONObject jSONObject) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener eventName = " + str);
        if ("impressions".equals(str)) {
            this.mListener.onInterstitialAdVisible();
        }
    }

    @Override // com.json.ho
    public void onInterstitialInitFailed(java.lang.String str) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
    }

    @Override // com.json.ho
    public void onInterstitialInitSuccess() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
    }

    @Override // com.json.ho
    public void onInterstitialLoadFailed(java.lang.String str) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdLoadFailed(com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(str));
    }

    @Override // com.json.ho
    public void onInterstitialLoadSuccess(com.json.mj mjVar) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdReady();
    }

    @Override // com.json.ho
    public void onInterstitialOpen() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdOpened();
    }

    @Override // com.json.ho
    public void onInterstitialShowFailed(java.lang.String str) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdShowFailed(com.json.mediationsdk.utils.ErrorBuilder.buildShowFailedError("Interstitial", str));
    }

    @Override // com.json.ho
    public void onInterstitialShowSuccess() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdShowSucceeded();
    }
}
