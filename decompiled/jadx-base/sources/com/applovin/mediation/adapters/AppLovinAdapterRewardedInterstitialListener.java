package com.applovin.mediation.adapters;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinAdapterRewardedInterstitialListener implements com.applovin.impl.qb, com.applovin.sdk.AppLovinAdRewardListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener, com.applovin.sdk.AppLovinAdClickListener, com.applovin.impl.pb {
    private boolean hasGrantedReward;
    private final com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener listener;
    private final com.applovin.mediation.adapters.AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterRewardedInterstitialListener(com.applovin.mediation.adapters.AppLovinMediationAdapter appLovinMediationAdapter, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxRewardedInterstitialAdapterListener;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded interstitial ad clicked");
        this.listener.onRewardedInterstitialAdClicked(com.applovin.mediation.adapters.AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded interstitial ad shown");
        android.os.Bundle bundle = new android.os.Bundle(1);
        if (appLovinAd instanceof com.applovin.impl.sdk.ad.b) {
            bundle.putBundle("applovin_ad_view_info", ((com.applovin.impl.sdk.ad.b) appLovinAd).e());
        }
        this.listener.onRewardedInterstitialAdDisplayed(bundle);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(com.applovin.sdk.AppLovinAd appLovinAd) {
        if (this.hasGrantedReward || this.parentAdapter.shouldAlwaysRewardUser()) {
            com.applovin.mediation.MaxReward reward = this.parentAdapter.getReward();
            this.parentAdapter.log("Rewarded interstitial rewarded user with reward: " + reward);
            this.listener.onUserRewarded(reward);
        }
        this.parentAdapter.log("Rewarded interstitial ad hidden");
        this.listener.onRewardedInterstitialAdHidden(com.applovin.mediation.adapters.AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded interstitial ad loaded");
        this.parentAdapter.loadedRewardedInterstitialAd = appLovinAd;
        this.listener.onRewardedInterstitialAdLoaded();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new com.applovin.impl.sdk.AppLovinError(i, ""));
    }

    @Override // com.applovin.impl.qb
    public void failedToReceiveAdV2(com.applovin.impl.sdk.AppLovinError appLovinError) {
        this.parentAdapter.log("Rewarded interstitial ad failed to load with error: " + appLovinError);
        this.listener.onRewardedInterstitialAdLoadFailed(com.applovin.mediation.adapters.AppLovinMediationAdapter.toMaxError(appLovinError));
    }

    @Override // com.applovin.impl.pb
    public void onAdDisplayFailed(java.lang.String str) {
        this.parentAdapter.log("Rewarded interstitial ad failed to display with error: " + str);
        this.listener.onRewardedInterstitialAdDisplayFailed(new com.applovin.mediation.adapter.MaxAdapterError(com.applovin.mediation.adapter.MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
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
        this.parentAdapter.log("Rewarded interstitial ad video started");
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackEnded(com.applovin.sdk.AppLovinAd appLovinAd, double d, boolean z) {
        this.parentAdapter.log("Rewarded interstitial ad video ended at " + d + "% and is fully watched: " + z);
        this.hasGrantedReward = z;
    }
}
