package com.google.ads.mediation.applovin;

/* JADX INFO: loaded from: classes4.dex */
public class AppLovinWaterfallInterstitialAd extends com.google.ads.mediation.applovin.AppLovinInterstitialRenderer implements com.google.android.gms.ads.mediation.MediationInterstitialAd {
    protected static final java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd>> appLovinWaterfallInterstitialAds = new java.util.HashMap<>();
    private android.content.Context context;
    private boolean enableMultipleAdLoading;
    private android.os.Bundle networkExtras;
    private com.applovin.sdk.AppLovinSdk sdk;

    public AppLovinWaterfallInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback, com.google.ads.mediation.applovin.AppLovinInitializer appLovinInitializer, com.google.ads.mediation.applovin.AppLovinAdFactory appLovinAdFactory) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, appLovinInitializer, appLovinAdFactory);
        this.enableMultipleAdLoading = false;
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer
    public void loadAd() {
        this.context = this.interstitialAdConfiguration.getContext();
        final android.os.Bundle serverParameters = this.interstitialAdConfiguration.getServerParameters();
        java.lang.String string = serverParameters.getString(com.applovin.mediation.AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Missing or invalid SDK Key.", com.google.ads.mediation.applovin.AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
            android.util.Log.e(TAG, adError.getMessage());
            this.interstitialAdLoadCallback.onFailure(adError);
        } else {
            if (com.applovin.mediation.AppLovinUtils.isMultiAdsEnabled()) {
                this.enableMultipleAdLoading = true;
            }
            this.appLovinInitializer.initialize(this.context, string, new com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener() { // from class: com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.1
                @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
                public void onInitializeSuccess(java.lang.String str) {
                    com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this.zoneId = com.applovin.mediation.AppLovinUtils.retrieveZoneId(serverParameters);
                    if (com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.appLovinWaterfallInterstitialAds.containsKey(com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this.zoneId) && com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.appLovinWaterfallInterstitialAds.get(com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this.zoneId).get() != null) {
                        com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(105, com.google.ads.mediation.applovin.AppLovinInterstitialRenderer.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD, com.google.ads.mediation.applovin.AppLovinMediationAdapter.ERROR_DOMAIN);
                        android.util.Log.e(com.google.ads.mediation.applovin.AppLovinInterstitialRenderer.TAG, adError2.getMessage());
                        com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this.interstitialAdLoadCallback.onFailure(adError2);
                        return;
                    }
                    com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.appLovinWaterfallInterstitialAds.put(com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this.zoneId, new java.lang.ref.WeakReference<>(com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this));
                    com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd appLovinWaterfallInterstitialAd = com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this;
                    appLovinWaterfallInterstitialAd.sdk = appLovinWaterfallInterstitialAd.appLovinInitializer.retrieveSdk(serverParameters, com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this.context);
                    com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd appLovinWaterfallInterstitialAd2 = com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this;
                    appLovinWaterfallInterstitialAd2.networkExtras = appLovinWaterfallInterstitialAd2.networkExtras;
                    android.util.Log.d(com.google.ads.mediation.applovin.AppLovinInterstitialRenderer.TAG, "Requesting interstitial for zone: " + com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this.zoneId);
                    if (!android.text.TextUtils.isEmpty(com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this.zoneId)) {
                        com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this.sdk.getAdService().loadNextAdForZoneId(com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this.zoneId, com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this);
                    } else {
                        com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this.sdk.getAdService().loadNextAd(com.applovin.sdk.AppLovinAdSize.INTERSTITIAL, com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd.this);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(android.content.Context context) {
        this.sdk.getSettings().setMuted(com.applovin.mediation.AppLovinUtils.shouldMuteAudio(this.networkExtras));
        com.applovin.adview.AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreateInterstitialAdDialog = this.appLovinAdFactory.createInterstitialAdDialog(this.sdk, context);
        appLovinInterstitialAdDialogCreateInterstitialAdDialog.setAdDisplayListener(this);
        appLovinInterstitialAdDialogCreateInterstitialAdDialog.setAdClickListener(this);
        appLovinInterstitialAdDialogCreateInterstitialAdDialog.setAdVideoPlaybackListener(this);
        if (this.appLovinInterstitialAd == null) {
            android.util.Log.d(TAG, "Attempting to show interstitial before one was loaded.");
            if (android.text.TextUtils.isEmpty(this.zoneId)) {
                android.util.Log.d(TAG, "Showing interstitial preloaded by SDK.");
                appLovinInterstitialAdDialogCreateInterstitialAdDialog.show();
                return;
            }
            return;
        }
        android.util.Log.d(TAG, "Showing interstitial for zone: " + this.zoneId);
        appLovinInterstitialAdDialogCreateInterstitialAdDialog.showAndRender(this.appLovinInterstitialAd);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
        if (this.enableMultipleAdLoading) {
            unregister();
        }
        super.adReceived(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        unregister();
        super.failedToReceiveAd(i);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(com.applovin.sdk.AppLovinAd appLovinAd) {
        unregister();
        super.adHidden(appLovinAd);
    }

    void unregister() {
        if (android.text.TextUtils.isEmpty(this.zoneId)) {
            return;
        }
        java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd>> map = appLovinWaterfallInterstitialAds;
        if (map.containsKey(this.zoneId) && equals(map.get(this.zoneId).get())) {
            map.remove(this.zoneId);
        }
    }
}
