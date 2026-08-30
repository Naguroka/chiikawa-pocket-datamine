package com.google.ads.mediation.applovin;

/* JADX INFO: loaded from: classes4.dex */
public class AppLovinBannerAd implements com.google.android.gms.ads.mediation.MediationBannerAd, com.applovin.sdk.AppLovinAdLoadListener, com.applovin.sdk.AppLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener, com.applovin.adview.AppLovinAdViewEventListener {
    private static final java.lang.String TAG = "AppLovinBannerAd";
    private final com.google.ads.mediation.applovin.AppLovinAdFactory appLovinAdFactory;
    private com.google.ads.mediation.applovin.AppLovinAdViewWrapper appLovinAdViewWrapper;
    private final com.google.ads.mediation.applovin.AppLovinInitializer appLovinInitializer;
    private com.google.android.gms.ads.mediation.MediationBannerAdCallback bannerAdCallback;
    private android.content.Context context;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback;
    private final com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration;
    private com.applovin.sdk.AppLovinSdk sdk;
    private java.lang.String zoneId;

    private AppLovinBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback, com.google.ads.mediation.applovin.AppLovinInitializer appLovinInitializer, com.google.ads.mediation.applovin.AppLovinAdFactory appLovinAdFactory) {
        this.mediationBannerAdConfiguration = mediationBannerAdConfiguration;
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.appLovinInitializer = appLovinInitializer;
        this.appLovinAdFactory = appLovinAdFactory;
    }

    public static com.google.ads.mediation.applovin.AppLovinBannerAd newInstance(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback, com.google.ads.mediation.applovin.AppLovinInitializer appLovinInitializer, com.google.ads.mediation.applovin.AppLovinAdFactory appLovinAdFactory) {
        return new com.google.ads.mediation.applovin.AppLovinBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback, appLovinInitializer, appLovinAdFactory);
    }

    public void loadAd() {
        this.context = this.mediationBannerAdConfiguration.getContext();
        final android.os.Bundle serverParameters = this.mediationBannerAdConfiguration.getServerParameters();
        com.google.android.gms.ads.AdSize adSize = this.mediationBannerAdConfiguration.getAdSize();
        java.lang.String string = serverParameters.getString(com.applovin.mediation.AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Missing or invalid SDK Key.", com.google.ads.mediation.applovin.AppLovinMediationAdapter.ERROR_DOMAIN);
            android.util.Log.e(TAG, adError.getMessage());
            this.mediationAdLoadCallback.onFailure(adError);
            return;
        }
        final com.applovin.sdk.AppLovinAdSize appLovinAdSizeAppLovinAdSizeFromAdMobAdSize = com.applovin.mediation.AppLovinUtils.appLovinAdSizeFromAdMobAdSize(this.context, adSize);
        if (appLovinAdSizeAppLovinAdSizeFromAdMobAdSize == null) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(101, "Failed to request banner with unsupported size.", com.google.ads.mediation.applovin.AppLovinMediationAdapter.ERROR_DOMAIN);
            android.util.Log.e(TAG, adError2.getMessage());
            this.mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.appLovinInitializer.initialize(this.context, string, new com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener() { // from class: com.google.ads.mediation.applovin.AppLovinBannerAd.1
            @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
            public void onInitializeSuccess(java.lang.String str) {
                com.google.ads.mediation.applovin.AppLovinBannerAd appLovinBannerAd = com.google.ads.mediation.applovin.AppLovinBannerAd.this;
                appLovinBannerAd.sdk = appLovinBannerAd.appLovinInitializer.retrieveSdk(serverParameters, com.google.ads.mediation.applovin.AppLovinBannerAd.this.context);
                com.google.ads.mediation.applovin.AppLovinBannerAd.this.zoneId = com.applovin.mediation.AppLovinUtils.retrieveZoneId(serverParameters);
                android.util.Log.d(com.google.ads.mediation.applovin.AppLovinBannerAd.TAG, "Requesting banner of size " + appLovinAdSizeAppLovinAdSizeFromAdMobAdSize + " for zone: " + com.google.ads.mediation.applovin.AppLovinBannerAd.this.zoneId);
                com.google.ads.mediation.applovin.AppLovinBannerAd appLovinBannerAd2 = com.google.ads.mediation.applovin.AppLovinBannerAd.this;
                appLovinBannerAd2.appLovinAdViewWrapper = appLovinBannerAd2.appLovinAdFactory.createAdView(com.google.ads.mediation.applovin.AppLovinBannerAd.this.sdk, appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, com.google.ads.mediation.applovin.AppLovinBannerAd.this.context);
                com.google.ads.mediation.applovin.AppLovinBannerAd.this.appLovinAdViewWrapper.setAdDisplayListener(com.google.ads.mediation.applovin.AppLovinBannerAd.this);
                com.google.ads.mediation.applovin.AppLovinBannerAd.this.appLovinAdViewWrapper.setAdClickListener(com.google.ads.mediation.applovin.AppLovinBannerAd.this);
                com.google.ads.mediation.applovin.AppLovinBannerAd.this.appLovinAdViewWrapper.setAdViewEventListener(com.google.ads.mediation.applovin.AppLovinBannerAd.this);
                if (!android.text.TextUtils.isEmpty(com.google.ads.mediation.applovin.AppLovinBannerAd.this.zoneId)) {
                    com.google.ads.mediation.applovin.AppLovinBannerAd.this.sdk.getAdService().loadNextAdForZoneId(com.google.ads.mediation.applovin.AppLovinBannerAd.this.zoneId, com.google.ads.mediation.applovin.AppLovinBannerAd.this);
                } else {
                    com.google.ads.mediation.applovin.AppLovinBannerAd.this.sdk.getAdService().loadNextAd(appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, com.google.ads.mediation.applovin.AppLovinBannerAd.this);
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public android.view.View getView() {
        return this.appLovinAdViewWrapper.getAppLovinAdView();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
        android.util.Log.d(TAG, "Banner did load ad for zone: " + this.zoneId);
        this.appLovinAdViewWrapper.renderAd(appLovinAd);
        this.bannerAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        com.google.android.gms.ads.AdError adError = com.applovin.mediation.AppLovinUtils.getAdError(i);
        android.util.Log.w(TAG, "Failed to load banner ad with error: " + i);
        this.mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(com.applovin.sdk.AppLovinAd appLovinAd) {
        android.util.Log.d(TAG, "Banner displayed.");
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(com.applovin.sdk.AppLovinAd appLovinAd) {
        android.util.Log.d(TAG, "Banner dismissed.");
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(com.applovin.sdk.AppLovinAd appLovinAd) {
        android.util.Log.d(TAG, "Banner clicked.");
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adOpenedFullscreen(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView) {
        android.util.Log.d(TAG, "Banner opened fullscreen.");
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adClosedFullscreen(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView) {
        android.util.Log.d(TAG, "Banner closed fullscreen.");
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adLeftApplication(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView) {
        android.util.Log.d(TAG, "Banner left application.");
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adFailedToDisplay(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView, com.applovin.adview.AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        android.util.Log.w(TAG, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }
}
