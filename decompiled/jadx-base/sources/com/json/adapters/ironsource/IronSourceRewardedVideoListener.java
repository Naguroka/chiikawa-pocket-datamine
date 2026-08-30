package com.json.adapters.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceRewardedVideoListener implements com.json.ho {
    public final java.lang.String AD_VISIBLE_EVENT_NAME = "impressions";
    private final java.lang.String mDemandSourceName;
    boolean mIsRvDemandOnly;
    com.json.mediationsdk.sdk.RewardedVideoSmashListener mListener;

    IronSourceRewardedVideoListener(com.json.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener, java.lang.String str, boolean z) {
        this.mDemandSourceName = str;
        this.mListener = rewardedVideoSmashListener;
        this.mIsRvDemandOnly = z;
    }

    @Override // com.json.ho
    public void onInterstitialAdRewarded(java.lang.String str, int i) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener demandSourceId=" + str + " amount=" + i);
        this.mListener.onRewardedVideoAdRewarded();
    }

    @Override // com.json.ho
    public void onInterstitialClick() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
        this.mListener.onRewardedVideoAdClicked();
    }

    @Override // com.json.ho
    public void onInterstitialClose() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
        this.mListener.onRewardedVideoAdClosed();
    }

    @Override // com.json.ho
    public void onInterstitialEventNotificationReceived(java.lang.String str, org.json.JSONObject jSONObject) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener eventName = " + str);
        if ("impressions".equals(str)) {
            this.mListener.onRewardedVideoAdVisible();
        }
    }

    @Override // com.json.ho
    public void onInterstitialInitFailed(java.lang.String str) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
    }

    @Override // com.json.ho
    public void onInterstitialInitSuccess() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
    }

    @Override // com.json.ho
    public void onInterstitialLoadFailed(java.lang.String str) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener " + str);
        this.mListener.onRewardedVideoLoadFailed(com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(str));
        if (this.mIsRvDemandOnly) {
            return;
        }
        this.mListener.onRewardedVideoAvailabilityChanged(false);
    }

    @Override // com.json.ho
    public void onInterstitialLoadSuccess(com.json.mj mjVar) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
        if (this.mIsRvDemandOnly) {
            this.mListener.onRewardedVideoLoadSuccess();
        } else {
            this.mListener.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.json.ho
    public void onInterstitialOpen() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
        this.mListener.onRewardedVideoAdOpened();
    }

    @Override // com.json.ho
    public void onInterstitialShowFailed(java.lang.String str) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + "rewardedVideoListener " + str);
        this.mListener.onRewardedVideoAdShowFailed(com.json.mediationsdk.utils.ErrorBuilder.buildShowFailedError(com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str));
    }

    @Override // com.json.ho
    public void onInterstitialShowSuccess() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
    }
}
