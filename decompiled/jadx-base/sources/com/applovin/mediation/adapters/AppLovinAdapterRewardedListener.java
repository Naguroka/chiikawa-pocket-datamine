package com.applovin.mediation.adapters;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinAdapterRewardedListener implements com.applovin.impl.qb, com.applovin.sdk.AppLovinAdRewardListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdClickListener, com.applovin.impl.pb {
    private boolean hasGrantedReward;
    private final com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener listener;
    private final com.applovin.mediation.adapters.AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterRewardedListener(com.applovin.mediation.adapters.AppLovinMediationAdapter appLovinMediationAdapter, com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxRewardedAdapterListener;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded ad clicked");
        this.listener.onRewardedAdClicked(com.applovin.mediation.adapters.AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded ad shown");
        android.os.Bundle bundle = new android.os.Bundle(1);
        if (appLovinAd instanceof com.applovin.impl.sdk.ad.b) {
            bundle.putBundle("applovin_ad_view_info", ((com.applovin.impl.sdk.ad.b) appLovinAd).e());
        }
        this.listener.onRewardedAdDisplayed(bundle);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(com.applovin.sdk.AppLovinAd appLovinAd) {
        if (this.hasGrantedReward || this.parentAdapter.shouldAlwaysRewardUser()) {
            com.applovin.mediation.MaxReward reward = this.parentAdapter.getReward();
            this.parentAdapter.log("Rewarded user with reward: " + reward);
            this.listener.onUserRewarded(reward);
        }
        this.parentAdapter.log("Rewarded ad hidden");
        this.listener.onRewardedAdHidden(com.applovin.mediation.adapters.AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded ad loaded");
        this.parentAdapter.loadedRewardedAd = appLovinAd;
        this.listener.onRewardedAdLoaded();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new com.applovin.impl.sdk.AppLovinError(i, ""));
    }

    @Override // com.applovin.impl.qb
    public void failedToReceiveAdV2(com.applovin.impl.sdk.AppLovinError appLovinError) {
        this.parentAdapter.log("Rewarded ad failed to load with error code: " + appLovinError);
        this.listener.onRewardedAdLoadFailed(com.applovin.mediation.adapters.AppLovinMediationAdapter.toMaxError(appLovinError));
    }

    @Override // com.applovin.impl.pb
    public void onAdDisplayFailed(java.lang.String str) {
        this.parentAdapter.log("Rewarded ad failed to display with error: " + str);
        this.listener.onRewardedAdDisplayFailed(new com.applovin.mediation.adapter.MaxAdapterError(com.applovin.mediation.adapter.MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userOverQuota(com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map<java.lang.String, java.lang.String> map) {
        this.parentAdapter.log("User is over quota: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardRejected(com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map<java.lang.String, java.lang.String> map) {
        this.parentAdapter.log("Reward rejected: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardVerified(com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map<java.lang.String, java.lang.String> map) {
        this.parentAdapter.log("Reward verified");
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void validationRequestFailed(com.applovin.sdk.AppLovinAd appLovinAd, int i) {
        this.parentAdapter.log("Reward validation request failed with code: " + i);
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackBegan(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded ad video started");
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackEnded(com.applovin.sdk.AppLovinAd appLovinAd, double d, boolean z) {
        this.parentAdapter.log("Rewarded ad video ended at " + d + "% and is fully watched: " + z);
        this.hasGrantedReward = z;
    }
}
