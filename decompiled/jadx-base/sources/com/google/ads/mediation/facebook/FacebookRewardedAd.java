package com.google.ads.mediation.facebook;

/* JADX INFO: loaded from: classes4.dex */
public class FacebookRewardedAd implements com.google.android.gms.ads.mediation.MediationRewardedAd, com.facebook.ads.RewardedVideoAdExtendedListener {
    private final com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration adConfiguration;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback;
    private final com.google.ads.mediation.facebook.MetaFactory metaFactory;
    private com.facebook.ads.RewardedVideoAd rewardedAd;
    private com.google.android.gms.ads.mediation.MediationRewardedAdCallback rewardedAdCallback;
    private final java.util.concurrent.atomic.AtomicBoolean showAdCalled = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean didRewardedAdClose = new java.util.concurrent.atomic.AtomicBoolean();

    public FacebookRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback, com.google.ads.mediation.facebook.MetaFactory metaFactory) {
        this.adConfiguration = mediationRewardedAdConfiguration;
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.metaFactory = metaFactory;
    }

    public void render() {
        android.content.Context context = this.adConfiguration.getContext();
        java.lang.String placementID = com.google.ads.mediation.facebook.FacebookMediationAdapter.getPlacementID(this.adConfiguration.getServerParameters());
        if (android.text.TextUtils.isEmpty(placementID)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            android.util.Log.e(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError.getMessage());
            this.mediationAdLoadCallback.onFailure(adError);
        } else {
            com.google.ads.mediation.facebook.FacebookMediationAdapter.setMixedAudience(this.adConfiguration);
            this.rewardedAd = this.metaFactory.createRewardedAd(context, placementID);
            if (!android.text.TextUtils.isEmpty(this.adConfiguration.getWatermark())) {
                this.rewardedAd.setExtraHints(new com.facebook.ads.ExtraHints.Builder().mediationData(this.adConfiguration.getWatermark()).build());
            }
            com.facebook.ads.RewardedVideoAd rewardedVideoAd = this.rewardedAd;
            rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(this.adConfiguration.getBidResponse()).withAdExperience(getAdExperienceType()).build());
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(android.content.Context context) {
        this.showAdCalled.set(true);
        if (!this.rewardedAd.show()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Failed to present rewarded ad.", "com.google.ads.mediation.facebook");
            android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError.getMessage());
            com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
            }
            this.rewardedAd.destroy();
            return;
        }
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback2 = this.rewardedAdCallback;
        if (mediationRewardedAdCallback2 != null) {
            mediationRewardedAdCallback2.onVideoStart();
            this.rewardedAdCallback.onAdOpened();
        }
    }

    com.facebook.ads.AdExperienceType getAdExperienceType() {
        return com.facebook.ads.AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
        this.rewardedAdCallback.onVideoComplete();
        this.rewardedAdCallback.onUserEarnedReward(new com.google.ads.mediation.facebook.FacebookReward());
    }

    @Override // com.facebook.ads.AdListener
    public void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
        com.google.android.gms.ads.AdError adError2 = com.google.ads.mediation.facebook.FacebookMediationAdapter.getAdError(adError);
        if (this.showAdCalled.get()) {
            android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError2.getMessage());
            com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError2);
            }
        } else {
            android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError2.getMessage());
            com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError2);
            }
        }
        this.rewardedAd.destroy();
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(com.facebook.ads.Ad ad) {
        com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.rewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(com.facebook.ads.Ad ad) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(com.facebook.ads.Ad ad) {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.didRewardedAdClose.getAndSet(true) && (mediationRewardedAdCallback = this.rewardedAdCallback) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        com.facebook.ads.RewardedVideoAd rewardedVideoAd = this.rewardedAd;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public void onRewardedVideoActivityDestroyed() {
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.didRewardedAdClose.getAndSet(true) && (mediationRewardedAdCallback = this.rewardedAdCallback) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        com.facebook.ads.RewardedVideoAd rewardedVideoAd = this.rewardedAd;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }
}
