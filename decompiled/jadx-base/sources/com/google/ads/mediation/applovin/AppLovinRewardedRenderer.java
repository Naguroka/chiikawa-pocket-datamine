package com.google.ads.mediation.applovin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AppLovinRewardedRenderer implements com.google.android.gms.ads.mediation.MediationRewardedAd, com.applovin.sdk.AppLovinAdLoadListener, com.applovin.sdk.AppLovinAdRewardListener, com.applovin.sdk.AppLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener {
    protected static final java.lang.String ERROR_MSG_AD_NOT_READY = "Ad not ready to show.";
    protected static final java.lang.String ERROR_MSG_MULTIPLE_REWARDED_AD = "Cannot load multiple rewarded ads with the same Zone ID. Display one ad before attempting to load another.";
    protected static final java.lang.String TAG = "AppLovinRewardedRenderer";
    protected final com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration adConfiguration;
    protected final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> adLoadCallback;
    protected final com.google.ads.mediation.applovin.AppLovinAdFactory appLovinAdFactory;
    protected final com.google.ads.mediation.applovin.AppLovinInitializer appLovinInitializer;
    protected com.applovin.sdk.AppLovinSdk appLovinSdk;
    protected final com.google.ads.mediation.applovin.AppLovinSdkUtilsWrapper appLovinSdkUtilsWrapper;
    private boolean fullyWatched;
    protected com.applovin.adview.AppLovinIncentivizedInterstitial incentivizedInterstitial;
    private com.google.ads.mediation.applovin.AppLovinRewardItem rewardItem;
    protected com.google.android.gms.ads.mediation.MediationRewardedAdCallback rewardedAdCallback;

    public abstract void loadAd();

    protected AppLovinRewardedRenderer(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback, com.google.ads.mediation.applovin.AppLovinInitializer appLovinInitializer, com.google.ads.mediation.applovin.AppLovinAdFactory appLovinAdFactory, com.google.ads.mediation.applovin.AppLovinSdkUtilsWrapper appLovinSdkUtilsWrapper) {
        this.adConfiguration = mediationRewardedAdConfiguration;
        this.adLoadCallback = mediationAdLoadCallback;
        this.appLovinInitializer = appLovinInitializer;
        this.appLovinAdFactory = appLovinAdFactory;
        this.appLovinSdkUtilsWrapper = appLovinSdkUtilsWrapper;
    }

    public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
        android.util.Log.i(TAG, "Rewarded video did load ad.");
        this.appLovinSdkUtilsWrapper.runOnUiThread(new java.lang.Runnable() { // from class: com.google.ads.mediation.applovin.AppLovinRewardedRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                com.google.ads.mediation.applovin.AppLovinRewardedRenderer appLovinRewardedRenderer = com.google.ads.mediation.applovin.AppLovinRewardedRenderer.this;
                appLovinRewardedRenderer.rewardedAdCallback = appLovinRewardedRenderer.adLoadCallback.onSuccess(com.google.ads.mediation.applovin.AppLovinRewardedRenderer.this);
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        final com.google.android.gms.ads.AdError adError = com.applovin.mediation.AppLovinUtils.getAdError(i);
        android.util.Log.w(TAG, adError.toString());
        this.appLovinSdkUtilsWrapper.runOnUiThread(new java.lang.Runnable() { // from class: com.google.ads.mediation.applovin.AppLovinRewardedRenderer.2
            @Override // java.lang.Runnable
            public void run() {
                com.google.ads.mediation.applovin.AppLovinRewardedRenderer.this.adLoadCallback.onFailure(adError);
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(com.applovin.sdk.AppLovinAd appLovinAd) {
        android.util.Log.d(TAG, "Rewarded video displayed.");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        this.rewardedAdCallback.reportAdImpression();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(com.applovin.sdk.AppLovinAd appLovinAd) {
        android.util.Log.d(TAG, "Rewarded video dismissed.");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        if (this.fullyWatched) {
            mediationRewardedAdCallback.onUserEarnedReward(this.rewardItem);
        }
        this.rewardedAdCallback.onAdClosed();
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(com.applovin.sdk.AppLovinAd appLovinAd) {
        android.util.Log.d(TAG, "Rewarded video clicked.");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackBegan(com.applovin.sdk.AppLovinAd appLovinAd) {
        android.util.Log.d(TAG, "Rewarded video playback began.");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackEnded(com.applovin.sdk.AppLovinAd appLovinAd, double d, boolean z) {
        android.util.Log.d(TAG, "Rewarded video playback ended at playback percent: " + d + "%.");
        this.fullyWatched = z;
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null || !z) {
            return;
        }
        mediationRewardedAdCallback.onVideoComplete();
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userOverQuota(com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map<java.lang.String, java.lang.String> map) {
        android.util.Log.e(TAG, "Rewarded video validation request for ad did exceed quota with response: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void validationRequestFailed(com.applovin.sdk.AppLovinAd appLovinAd, int i) {
        android.util.Log.e(TAG, "Rewarded video validation request for ad failed with error code: " + i);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardRejected(com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map<java.lang.String, java.lang.String> map) {
        android.util.Log.e(TAG, "Rewarded video validation request was rejected with response: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardVerified(com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str = map.get("currency");
        int i = (int) java.lang.Double.parseDouble(map.get("amount"));
        android.util.Log.d(TAG, "Rewarded " + i + " " + str);
        this.rewardItem = new com.google.ads.mediation.applovin.AppLovinRewardItem(i, str);
    }
}
