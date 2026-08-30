package com.applovin.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class ApplovinAdapter extends com.google.ads.mediation.applovin.AppLovinMediationAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.OnContextChangedListener {
    private static final boolean LOGGING_ENABLED = true;
    private static final java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<com.applovin.mediation.ApplovinAdapter>> appLovinInterstitialAds = new java.util.HashMap<>();
    private com.applovin.adview.AppLovinAdView adView;
    private com.applovin.sdk.AppLovinAd appLovinInterstitialAd;
    private android.content.Context context;
    private boolean enableMultipleAdLoading = false;
    private com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener;
    private android.os.Bundle networkExtras;
    private com.applovin.sdk.AppLovinSdk sdk;
    private java.lang.String zoneId;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(android.content.Context context, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener, android.os.Bundle bundle, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle2) {
        if (com.applovin.mediation.AppLovinUtils.isChildUser()) {
            mediationInterstitialListener.onAdFailedToLoad(this, com.applovin.mediation.AppLovinUtils.getChildUserError());
            return;
        }
        java.lang.String string = bundle.getString(com.applovin.mediation.AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Missing or invalid SDK Key.", com.google.ads.mediation.applovin.AppLovinMediationAdapter.ERROR_DOMAIN);
            log(6, adError.getMessage());
            mediationInterstitialListener.onAdFailedToLoad(this, adError);
        } else {
            if (com.applovin.mediation.AppLovinUtils.isMultiAdsEnabled()) {
                this.enableMultipleAdLoading = true;
            }
            com.google.ads.mediation.applovin.AppLovinInitializer.getInstance().initialize(context, string, new com.applovin.mediation.ApplovinAdapter.AnonymousClass1(bundle, mediationInterstitialListener, context, bundle2));
        }
    }

    /* JADX INFO: renamed from: com.applovin.mediation.ApplovinAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener {
        final /* synthetic */ android.content.Context val$context;
        final /* synthetic */ com.google.android.gms.ads.mediation.MediationInterstitialListener val$interstitialListener;
        final /* synthetic */ android.os.Bundle val$networkExtras;
        final /* synthetic */ android.os.Bundle val$serverParameters;

        AnonymousClass1(android.os.Bundle bundle, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener, android.content.Context context, android.os.Bundle bundle2) {
            this.val$serverParameters = bundle;
            this.val$interstitialListener = mediationInterstitialListener;
            this.val$context = context;
            this.val$networkExtras = bundle2;
        }

        @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
        public void onInitializeSuccess(java.lang.String str) {
            com.applovin.mediation.ApplovinAdapter.this.zoneId = com.applovin.mediation.AppLovinUtils.retrieveZoneId(this.val$serverParameters);
            if (!com.applovin.mediation.ApplovinAdapter.appLovinInterstitialAds.containsKey(com.applovin.mediation.ApplovinAdapter.this.zoneId) || ((java.lang.ref.WeakReference) com.applovin.mediation.ApplovinAdapter.appLovinInterstitialAds.get(com.applovin.mediation.ApplovinAdapter.this.zoneId)).get() == null) {
                com.applovin.mediation.ApplovinAdapter.appLovinInterstitialAds.put(com.applovin.mediation.ApplovinAdapter.this.zoneId, new java.lang.ref.WeakReference(com.applovin.mediation.ApplovinAdapter.this));
                com.applovin.mediation.ApplovinAdapter.this.sdk = com.google.ads.mediation.applovin.AppLovinInitializer.getInstance().retrieveSdk(this.val$serverParameters, this.val$context);
                com.applovin.mediation.ApplovinAdapter.this.context = this.val$context;
                com.applovin.mediation.ApplovinAdapter.this.networkExtras = this.val$networkExtras;
                com.applovin.mediation.ApplovinAdapter.this.mediationInterstitialListener = this.val$interstitialListener;
                com.applovin.mediation.ApplovinAdapter.log(3, "Requesting interstitial for zone: " + com.applovin.mediation.ApplovinAdapter.this.zoneId);
                com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener = new com.applovin.sdk.AppLovinAdLoadListener() { // from class: com.applovin.mediation.ApplovinAdapter.1.1
                    @Override // com.applovin.sdk.AppLovinAdLoadListener
                    public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
                        com.applovin.mediation.ApplovinAdapter.log(3, "Interstitial did load ad: for zone: " + com.applovin.mediation.ApplovinAdapter.this.zoneId);
                        com.applovin.mediation.ApplovinAdapter.this.appLovinInterstitialAd = appLovinAd;
                        if (com.applovin.mediation.ApplovinAdapter.this.enableMultipleAdLoading) {
                            com.applovin.mediation.ApplovinAdapter.this.unregister();
                        }
                        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.mediation.ApplovinAdapter.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com.applovin.mediation.ApplovinAdapter.this.mediationInterstitialListener.onAdLoaded(com.applovin.mediation.ApplovinAdapter.this);
                            }
                        });
                    }

                    @Override // com.applovin.sdk.AppLovinAdLoadListener
                    public void failedToReceiveAd(int i) {
                        final com.google.android.gms.ads.AdError adError = com.applovin.mediation.AppLovinUtils.getAdError(i);
                        com.applovin.mediation.ApplovinAdapter.log(5, adError.getMessage());
                        com.applovin.mediation.ApplovinAdapter.this.unregister();
                        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.mediation.ApplovinAdapter.1.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                com.applovin.mediation.ApplovinAdapter.this.mediationInterstitialListener.onAdFailedToLoad(com.applovin.mediation.ApplovinAdapter.this, adError);
                            }
                        });
                    }
                };
                if (!android.text.TextUtils.isEmpty(com.applovin.mediation.ApplovinAdapter.this.zoneId)) {
                    com.applovin.mediation.ApplovinAdapter.this.sdk.getAdService().loadNextAdForZoneId(com.applovin.mediation.ApplovinAdapter.this.zoneId, appLovinAdLoadListener);
                    return;
                } else {
                    com.applovin.mediation.ApplovinAdapter.this.sdk.getAdService().loadNextAd(com.applovin.sdk.AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
                    return;
                }
            }
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(105, com.google.ads.mediation.applovin.AppLovinInterstitialRenderer.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD, com.google.ads.mediation.applovin.AppLovinMediationAdapter.ERROR_DOMAIN);
            com.applovin.mediation.ApplovinAdapter.log(6, adError.getMessage());
            this.val$interstitialListener.onAdFailedToLoad(com.applovin.mediation.ApplovinAdapter.this, adError);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.sdk.getSettings().setMuted(com.applovin.mediation.AppLovinUtils.shouldMuteAudio(this.networkExtras));
        com.applovin.adview.AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = com.applovin.adview.AppLovinInterstitialAd.create(this.sdk, this.context);
        com.applovin.mediation.AppLovinInterstitialAdListener appLovinInterstitialAdListener = new com.applovin.mediation.AppLovinInterstitialAdListener(this, this.mediationInterstitialListener);
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(appLovinInterstitialAdListener);
        appLovinInterstitialAdDialogCreate.setAdClickListener(appLovinInterstitialAdListener);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(appLovinInterstitialAdListener);
        if (this.appLovinInterstitialAd == null) {
            log(3, "Attempting to show interstitial before one was loaded.");
            if (android.text.TextUtils.isEmpty(this.zoneId)) {
                log(3, "Showing interstitial preloaded by SDK.");
                appLovinInterstitialAdDialogCreate.show();
                return;
            } else {
                this.mediationInterstitialListener.onAdOpened(this);
                this.mediationInterstitialListener.onAdClosed(this);
                return;
            }
        }
        log(3, "Showing interstitial for zone: " + this.zoneId);
        appLovinInterstitialAdDialogCreate.showAndRender(this.appLovinInterstitialAd);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(final android.content.Context context, final com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener, final android.os.Bundle bundle, com.google.android.gms.ads.AdSize adSize, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle2) {
        if (com.applovin.mediation.AppLovinUtils.isChildUser()) {
            mediationBannerListener.onAdFailedToLoad(this, com.applovin.mediation.AppLovinUtils.getChildUserError());
            return;
        }
        java.lang.String string = bundle.getString(com.applovin.mediation.AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Missing or invalid SDK Key.", com.google.ads.mediation.applovin.AppLovinMediationAdapter.ERROR_DOMAIN);
            log(6, adError.getMessage());
            mediationBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        final com.applovin.sdk.AppLovinAdSize appLovinAdSizeAppLovinAdSizeFromAdMobAdSize = com.applovin.mediation.AppLovinUtils.appLovinAdSizeFromAdMobAdSize(context, adSize);
        if (appLovinAdSizeAppLovinAdSizeFromAdMobAdSize == null) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(101, "Failed to request banner with unsupported size.", com.google.ads.mediation.applovin.AppLovinMediationAdapter.ERROR_DOMAIN);
            log(6, adError2.getMessage());
            mediationBannerListener.onAdFailedToLoad(this, adError2);
            return;
        }
        com.google.ads.mediation.applovin.AppLovinInitializer.getInstance().initialize(context, string, new com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener() { // from class: com.applovin.mediation.ApplovinAdapter.2
            @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
            public void onInitializeSuccess(java.lang.String str) {
                com.applovin.mediation.ApplovinAdapter.this.sdk = com.google.ads.mediation.applovin.AppLovinInitializer.getInstance().retrieveSdk(bundle, context);
                com.applovin.mediation.ApplovinAdapter.this.zoneId = com.applovin.mediation.AppLovinUtils.retrieveZoneId(bundle);
                com.applovin.mediation.ApplovinAdapter.log(3, "Requesting banner of size " + appLovinAdSizeAppLovinAdSizeFromAdMobAdSize + " for zone: " + com.applovin.mediation.ApplovinAdapter.this.zoneId);
                com.applovin.mediation.ApplovinAdapter.this.adView = new com.applovin.adview.AppLovinAdView(com.applovin.mediation.ApplovinAdapter.this.sdk, appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, context);
                com.applovin.mediation.AppLovinBannerAdListener appLovinBannerAdListener = new com.applovin.mediation.AppLovinBannerAdListener(com.applovin.mediation.ApplovinAdapter.this.zoneId, com.applovin.mediation.ApplovinAdapter.this.adView, com.applovin.mediation.ApplovinAdapter.this, mediationBannerListener);
                com.applovin.mediation.ApplovinAdapter.this.adView.setAdDisplayListener(appLovinBannerAdListener);
                com.applovin.mediation.ApplovinAdapter.this.adView.setAdClickListener(appLovinBannerAdListener);
                com.applovin.mediation.ApplovinAdapter.this.adView.setAdViewEventListener(appLovinBannerAdListener);
                if (!android.text.TextUtils.isEmpty(com.applovin.mediation.ApplovinAdapter.this.zoneId)) {
                    com.applovin.mediation.ApplovinAdapter.this.sdk.getAdService().loadNextAdForZoneId(com.applovin.mediation.ApplovinAdapter.this.zoneId, appLovinBannerAdListener);
                } else {
                    com.applovin.mediation.ApplovinAdapter.this.sdk.getAdService().loadNextAd(appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, appLovinBannerAdListener);
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public android.view.View getBannerView() {
        return this.adView;
    }

    @Override // com.google.android.gms.ads.mediation.OnContextChangedListener
    public void onContextChanged(android.content.Context context) {
        log(3, "Context changed: " + context);
        this.context = context;
    }

    public static void log(int i, java.lang.String str) {
        android.util.Log.println(i, "AppLovinAdapter", str);
    }

    void unregister() {
        if (android.text.TextUtils.isEmpty(this.zoneId)) {
            return;
        }
        java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<com.applovin.mediation.ApplovinAdapter>> map = appLovinInterstitialAds;
        if (map.containsKey(this.zoneId) && equals(map.get(this.zoneId).get())) {
            map.remove(this.zoneId);
        }
    }
}
