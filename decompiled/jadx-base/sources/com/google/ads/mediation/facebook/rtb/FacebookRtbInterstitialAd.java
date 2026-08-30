package com.google.ads.mediation.facebook.rtb;

/* JADX INFO: loaded from: classes4.dex */
public class FacebookRtbInterstitialAd implements com.google.android.gms.ads.mediation.MediationInterstitialAd, com.facebook.ads.InterstitialAdExtendedListener {
    private final com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration adConfiguration;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> callback;
    private com.google.android.gms.ads.mediation.MediationInterstitialAdCallback interstitalAdCallback;
    private com.facebook.ads.InterstitialAd interstitialAd;
    private final com.google.ads.mediation.facebook.MetaFactory metaFactory;
    private final java.util.concurrent.atomic.AtomicBoolean showAdCalled = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean didInterstitialAdClose = new java.util.concurrent.atomic.AtomicBoolean();

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
    }

    public FacebookRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback, com.google.ads.mediation.facebook.MetaFactory metaFactory) {
        this.adConfiguration = mediationInterstitialAdConfiguration;
        this.callback = mediationAdLoadCallback;
        this.metaFactory = metaFactory;
    }

    public void render() {
        java.lang.String placementID = com.google.ads.mediation.facebook.FacebookMediationAdapter.getPlacementID(this.adConfiguration.getServerParameters());
        if (android.text.TextUtils.isEmpty(placementID)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty. ", "com.google.ads.mediation.facebook");
            android.util.Log.e(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError.getMessage());
            this.callback.onFailure(adError);
        } else {
            com.google.ads.mediation.facebook.FacebookMediationAdapter.setMixedAudience(this.adConfiguration);
            this.interstitialAd = this.metaFactory.createInterstitialAd(this.adConfiguration.getContext(), placementID);
            if (!android.text.TextUtils.isEmpty(this.adConfiguration.getWatermark())) {
                this.interstitialAd.setExtraHints(new com.facebook.ads.ExtraHints.Builder().mediationData(this.adConfiguration.getWatermark()).build());
            }
            com.facebook.ads.InterstitialAd interstitialAd = this.interstitialAd;
            interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(this.adConfiguration.getBidResponse()).withAdListener(this).build());
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(android.content.Context context) {
        this.showAdCalled.set(true);
        if (this.interstitialAd.show()) {
            return;
        }
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Failed to present interstitial ad.", "com.google.ads.mediation.facebook");
        android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError.toString());
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitalAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(com.facebook.ads.Ad ad) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitalAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(com.facebook.ads.Ad ad) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.didInterstitialAdClose.getAndSet(true) || (mediationInterstitialAdCallback = this.interstitalAdCallback) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.AdListener
    public void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
        com.google.android.gms.ads.AdError adError2 = com.google.ads.mediation.facebook.FacebookMediationAdapter.getAdError(adError);
        android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError2.getMessage());
        if (this.showAdCalled.get()) {
            com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitalAdCallback;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdFailedToShow(adError2);
                return;
            }
            return;
        }
        this.callback.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(com.facebook.ads.Ad ad) {
        this.interstitalAdCallback = this.callback.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(com.facebook.ads.Ad ad) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitalAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
            this.interstitalAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(com.facebook.ads.Ad ad) {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitalAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.didInterstitialAdClose.getAndSet(true) || (mediationInterstitialAdCallback = this.interstitalAdCallback) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }
}
