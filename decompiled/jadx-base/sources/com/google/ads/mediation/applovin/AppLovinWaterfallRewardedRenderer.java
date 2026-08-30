package com.google.ads.mediation.applovin;

/* JADX INFO: loaded from: classes4.dex */
public class AppLovinWaterfallRewardedRenderer extends com.google.ads.mediation.applovin.AppLovinRewardedRenderer implements com.google.android.gms.ads.mediation.MediationRewardedAd {
    private static final java.lang.String DEFAULT_ZONE = "";
    protected static final java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer>> incentivizedAdsMap = new java.util.HashMap<>();
    private boolean enableMultipleAdLoading;
    private java.lang.String zoneId;

    protected AppLovinWaterfallRewardedRenderer(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback, com.google.ads.mediation.applovin.AppLovinInitializer appLovinInitializer, com.google.ads.mediation.applovin.AppLovinAdFactory appLovinAdFactory, com.google.ads.mediation.applovin.AppLovinSdkUtilsWrapper appLovinSdkUtilsWrapper) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, appLovinInitializer, appLovinAdFactory, appLovinSdkUtilsWrapper);
        this.enableMultipleAdLoading = false;
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer
    public void loadAd() {
        final android.content.Context context = this.adConfiguration.getContext();
        final android.os.Bundle serverParameters = this.adConfiguration.getServerParameters();
        java.lang.String string = serverParameters.getString(com.applovin.mediation.AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Missing or invalid SDK Key.", com.google.ads.mediation.applovin.AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
            android.util.Log.e(TAG, adError.toString());
            this.adLoadCallback.onFailure(adError);
        } else {
            if (com.applovin.mediation.AppLovinUtils.isMultiAdsEnabled()) {
                this.enableMultipleAdLoading = true;
            }
            this.appLovinInitializer.initialize(context, string, new com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener() { // from class: com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.1
                @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
                public void onInitializeSuccess(java.lang.String str) {
                    com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.this.zoneId = com.applovin.mediation.AppLovinUtils.retrieveZoneId(serverParameters);
                    com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer = com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.this;
                    appLovinWaterfallRewardedRenderer.appLovinSdk = appLovinWaterfallRewardedRenderer.appLovinInitializer.retrieveSdk(serverParameters, context);
                    boolean z = true;
                    android.util.Log.d(com.google.ads.mediation.applovin.AppLovinRewardedRenderer.TAG, java.lang.String.format("Requesting rewarded video for zone '%s'", com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.this.zoneId));
                    if (!com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.incentivizedAdsMap.containsKey(com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.this.zoneId)) {
                        com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.incentivizedAdsMap.put(com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.this.zoneId, new java.lang.ref.WeakReference<>(com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.this));
                        z = false;
                    }
                    if (!z) {
                        if (java.util.Objects.equals(com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.this.zoneId, "")) {
                            com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer2 = com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.this;
                            appLovinWaterfallRewardedRenderer2.incentivizedInterstitial = appLovinWaterfallRewardedRenderer2.appLovinAdFactory.createIncentivizedInterstitial(com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.this.appLovinSdk);
                        } else {
                            com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer3 = com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.this;
                            appLovinWaterfallRewardedRenderer3.incentivizedInterstitial = appLovinWaterfallRewardedRenderer3.appLovinAdFactory.createIncentivizedInterstitial(com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.this.zoneId, com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.this.appLovinSdk);
                        }
                        com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.this.incentivizedInterstitial.preload(com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.this);
                        return;
                    }
                    com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(105, "Cannot load multiple rewarded ads with the same Zone ID. Display one ad before attempting to load another.", com.google.ads.mediation.applovin.AppLovinMediationAdapter.ERROR_DOMAIN);
                    android.util.Log.e(com.google.ads.mediation.applovin.AppLovinRewardedRenderer.TAG, adError2.toString());
                    com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer.this.adLoadCallback.onFailure(adError2);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(android.content.Context context) {
        this.appLovinSdk.getSettings().setMuted(com.applovin.mediation.AppLovinUtils.shouldMuteAudio(this.adConfiguration.getMediationExtras()));
        java.lang.String str = this.zoneId;
        if (str != null) {
            android.util.Log.d(TAG, java.lang.String.format("Showing rewarded video for zone '%s'", str));
        }
        if (!this.incentivizedInterstitial.isAdReadyToDisplay()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(106, "Ad not ready to show.", com.google.ads.mediation.applovin.AppLovinMediationAdapter.ERROR_DOMAIN);
            android.util.Log.e(TAG, adError.toString());
            this.rewardedAdCallback.onAdFailedToShow(adError);
            return;
        }
        this.incentivizedInterstitial.show(context, this, this, this, this);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
        if (this.enableMultipleAdLoading) {
            incentivizedAdsMap.remove(this.zoneId);
        }
        super.adReceived(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        incentivizedAdsMap.remove(this.zoneId);
        super.failedToReceiveAd(i);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(com.applovin.sdk.AppLovinAd appLovinAd) {
        incentivizedAdsMap.remove(this.zoneId);
        super.adHidden(appLovinAd);
    }
}
