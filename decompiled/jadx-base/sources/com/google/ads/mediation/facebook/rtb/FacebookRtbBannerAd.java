package com.google.ads.mediation.facebook.rtb;

/* JADX INFO: loaded from: classes4.dex */
public class FacebookRtbBannerAd implements com.google.android.gms.ads.mediation.MediationBannerAd, com.facebook.ads.AdListener {
    private final com.google.android.gms.ads.mediation.MediationBannerAdConfiguration adConfiguration;
    private com.facebook.ads.AdView adView;
    private com.google.android.gms.ads.mediation.MediationBannerAdCallback bannerAdCallback;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> callback;
    private final com.google.ads.mediation.facebook.MetaFactory metaFactory;
    private android.widget.FrameLayout wrappedAdView;

    public FacebookRtbBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback, com.google.ads.mediation.facebook.MetaFactory metaFactory) {
        this.adConfiguration = mediationBannerAdConfiguration;
        this.callback = mediationAdLoadCallback;
        this.metaFactory = metaFactory;
    }

    public void render() {
        java.lang.String placementID = com.google.ads.mediation.facebook.FacebookMediationAdapter.getPlacementID(this.adConfiguration.getServerParameters());
        if (android.text.TextUtils.isEmpty(placementID)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            android.util.Log.e(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError.getMessage());
            this.callback.onFailure(adError);
            return;
        }
        com.google.ads.mediation.facebook.FacebookMediationAdapter.setMixedAudience(this.adConfiguration);
        try {
            this.adView = this.metaFactory.createMetaAdView(this.adConfiguration.getContext(), placementID, this.adConfiguration.getBidResponse());
            if (!android.text.TextUtils.isEmpty(this.adConfiguration.getWatermark())) {
                this.adView.setExtraHints(new com.facebook.ads.ExtraHints.Builder().mediationData(this.adConfiguration.getWatermark()).build());
            }
            android.content.Context context = this.adConfiguration.getContext();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.adConfiguration.getAdSize().getWidthInPixels(context), -2);
            this.wrappedAdView = new android.widget.FrameLayout(context);
            this.adView.setLayoutParams(layoutParams);
            this.wrappedAdView.addView(this.adView);
            com.facebook.ads.AdView adView = this.adView;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(this).withBid(this.adConfiguration.getBidResponse()).build());
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(111, "Failed to create banner ad: " + e.getMessage(), "com.google.ads.mediation.facebook");
            android.util.Log.e(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError2.getMessage());
            this.callback.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public android.view.View getView() {
        return this.wrappedAdView;
    }

    @Override // com.facebook.ads.AdListener
    public void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
        com.google.android.gms.ads.AdError adError2 = com.google.ads.mediation.facebook.FacebookMediationAdapter.getAdError(adError);
        android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError2.getMessage());
        this.callback.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(com.facebook.ads.Ad ad) {
        this.bannerAdCallback = this.callback.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(com.facebook.ads.Ad ad) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.bannerAdCallback.onAdOpened();
            this.bannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(com.facebook.ads.Ad ad) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
