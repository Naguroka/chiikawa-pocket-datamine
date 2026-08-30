package com.applovin.mediation;

/* JADX INFO: loaded from: classes3.dex */
class AppLovinBannerAdListener implements com.applovin.sdk.AppLovinAdLoadListener, com.applovin.sdk.AppLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener, com.applovin.adview.AppLovinAdViewEventListener {
    private final com.applovin.adview.AppLovinAdView adView;
    private final com.applovin.mediation.ApplovinAdapter adapter;
    private final com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener;
    private final java.lang.String zoneId;

    AppLovinBannerAdListener(java.lang.String str, com.applovin.adview.AppLovinAdView appLovinAdView, com.applovin.mediation.ApplovinAdapter applovinAdapter, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener) {
        this.adapter = applovinAdapter;
        this.mediationBannerListener = mediationBannerListener;
        this.adView = appLovinAdView;
        this.zoneId = str;
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
        com.applovin.mediation.ApplovinAdapter.log(3, "Banner did load ad for zone: " + this.zoneId);
        this.adView.renderAd(appLovinAd);
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.mediation.AppLovinBannerAdListener.1
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.mediation.AppLovinBannerAdListener.this.mediationBannerListener.onAdLoaded(com.applovin.mediation.AppLovinBannerAdListener.this.adapter);
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        final com.google.android.gms.ads.AdError adError = com.applovin.mediation.AppLovinUtils.getAdError(i);
        com.applovin.mediation.ApplovinAdapter.log(5, "Failed to load banner ad with error: " + i);
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.mediation.AppLovinBannerAdListener.2
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.mediation.AppLovinBannerAdListener.this.mediationBannerListener.onAdFailedToLoad(com.applovin.mediation.AppLovinBannerAdListener.this.adapter, adError);
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(com.applovin.sdk.AppLovinAd appLovinAd) {
        com.applovin.mediation.ApplovinAdapter.log(3, "Banner displayed.");
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(com.applovin.sdk.AppLovinAd appLovinAd) {
        com.applovin.mediation.ApplovinAdapter.log(3, "Banner dismissed.");
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(com.applovin.sdk.AppLovinAd appLovinAd) {
        com.applovin.mediation.ApplovinAdapter.log(3, "Banner clicked.");
        this.mediationBannerListener.onAdClicked(this.adapter);
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adOpenedFullscreen(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView) {
        com.applovin.mediation.ApplovinAdapter.log(3, "Banner opened fullscreen.");
        this.mediationBannerListener.onAdOpened(this.adapter);
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adClosedFullscreen(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView) {
        com.applovin.mediation.ApplovinAdapter.log(3, "Banner closed fullscreen.");
        this.mediationBannerListener.onAdClosed(this.adapter);
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adLeftApplication(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView) {
        com.applovin.mediation.ApplovinAdapter.log(3, "Banner left application.");
        this.mediationBannerListener.onAdLeftApplication(this.adapter);
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adFailedToDisplay(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView, com.applovin.adview.AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        com.applovin.mediation.ApplovinAdapter.log(5, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }
}
