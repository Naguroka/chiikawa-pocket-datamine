package com.applovin.mediation.adapters;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinMediationAdapter extends com.applovin.mediation.adapters.MediationAdapterBase implements com.applovin.mediation.adapter.MaxSignalProvider, com.applovin.mediation.adapter.MaxInterstitialAdapter, com.applovin.mediation.adapter.MaxAppOpenAdapter, com.applovin.mediation.adapter.MaxRewardedAdapter, com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter, com.applovin.mediation.adapter.MaxAdViewAdapter {
    protected com.applovin.adview.AppLovinAdView loadedAdView;
    protected com.applovin.sdk.AppLovinAd loadedAppOpenAd;
    protected com.applovin.sdk.AppLovinAd loadedInterstitialAd;
    protected com.applovin.impl.sdk.nativeAd.AppLovinNativeAd loadedNativeAd;
    protected com.applovin.sdk.AppLovinAd loadedRewardedAd;
    protected com.applovin.sdk.AppLovinAd loadedRewardedInterstitialAd;

    public AppLovinMediationAdapter(com.applovin.sdk.AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    protected static android.os.Bundle getExtraInfo(com.applovin.sdk.AppLovinAd appLovinAd) {
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putBundle("ad_values", ((com.applovin.impl.sdk.ad.AppLovinAdImpl) appLovinAd).getMAXAdValues());
        return bundle;
    }

    private void loadFullscreenAd(java.lang.String str, com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.Object obj) {
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading bidding " + maxAdFormat.getLabel() + " ad...");
            getWrappingSdk().getAdService().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), (com.applovin.impl.qb) obj);
        } else if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            log("Loading mediated " + maxAdFormat.getLabel() + " ad...");
            getWrappingSdk().getAdService().loadNextAdForZoneId(str, (com.applovin.impl.qb) obj);
        } else {
            java.lang.String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            log("Loading mediated " + maxAdFormat.getLabel() + " ad: " + thirdPartyAdPlacementId + "...");
            getWrappingSdk().getAdService().loadNextAdForZoneId(thirdPartyAdPlacementId, (com.applovin.impl.qb) obj);
        }
    }

    protected static com.applovin.mediation.adapter.MaxAdapterError toMaxError(com.applovin.impl.sdk.AppLovinError appLovinError) {
        com.applovin.mediation.adapter.MaxAdapterError maxAdapterError;
        if (appLovinError.getCode() == -1009) {
            maxAdapterError = com.applovin.mediation.adapter.MaxAdapterError.NO_CONNECTION;
        } else if (appLovinError.getCode() == 204) {
            maxAdapterError = com.applovin.mediation.adapter.MaxAdapterError.NO_FILL;
        } else if (appLovinError.getCode() == -1) {
            maxAdapterError = com.applovin.mediation.adapter.MaxAdapterError.INTERNAL_ERROR;
        } else {
            maxAdapterError = appLovinError.getCode() >= 500 ? com.applovin.mediation.adapter.MaxAdapterError.SERVER_ERROR : com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED;
        }
        return new com.applovin.mediation.adapter.MaxAdapterError(maxAdapterError.getCode(), maxAdapterError.getErrorMessage(), appLovinError.getCode(), appLovinError.getMessage());
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, android.app.Activity activity, final com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        if (((java.lang.Boolean) getWrappingSdk().a().a(com.applovin.impl.ue.H7)).booleanValue()) {
            getWrappingSdk().getAdService().collectBidToken(new com.applovin.sdk.AppLovinBidTokenCollectionListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.1
                @Override // com.applovin.sdk.AppLovinBidTokenCollectionListener
                public void onBidTokenCollected(java.lang.String str) {
                    com.applovin.mediation.adapters.AppLovinMediationAdapter.this.log("Signal collection successful");
                    maxSignalCollectionListener.onSignalCollected(str);
                }

                @Override // com.applovin.sdk.AppLovinBidTokenCollectionListener
                public void onBidTokenCollectionFailed(java.lang.String str) {
                    com.applovin.mediation.adapters.AppLovinMediationAdapter.this.log("Signal collection failed with error: " + str);
                    maxSignalCollectionListener.onSignalCollectionFailed(str);
                }
            });
        } else {
            maxSignalCollectionListener.onSignalCollected(getWrappingSdk().getAdService().getBidToken());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public java.lang.String getAdapterVersion() {
        return getSdkVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public java.lang.String getSdkVersion() {
        return com.applovin.sdk.AppLovinSdk.VERSION;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters maxAdapterInitializationParameters, android.app.Activity activity, com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener onCompletionListener) {
        onCompletionListener.onCompletion(com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.DOES_NOT_APPLY, null);
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, com.applovin.mediation.MaxAdFormat maxAdFormat, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener maxAdViewAdapterListener) {
        com.applovin.sdk.AppLovinAdSize appLovinAdSize;
        com.applovin.mediation.adapters.AppLovinAdapterAdViewListener appLovinAdapterAdViewListener = new com.applovin.mediation.adapters.AppLovinAdapterAdViewListener(this, maxAdFormat, maxAdViewAdapterListener);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading bidding " + maxAdFormat.getLabel() + " ad...");
            getWrappingSdk().getAdService().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), appLovinAdapterAdViewListener);
            return;
        }
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            java.lang.String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            log("Loading mediated " + maxAdFormat.getLabel() + " ad: " + thirdPartyAdPlacementId + "...");
            getWrappingSdk().getAdService().loadNextAdForZoneId(thirdPartyAdPlacementId, appLovinAdapterAdViewListener);
            return;
        }
        if (maxAdFormat == com.applovin.mediation.MaxAdFormat.BANNER) {
            appLovinAdSize = com.applovin.sdk.AppLovinAdSize.BANNER;
        } else if (maxAdFormat == com.applovin.mediation.MaxAdFormat.MREC) {
            appLovinAdSize = com.applovin.sdk.AppLovinAdSize.MREC;
        } else {
            appLovinAdSize = maxAdFormat == com.applovin.mediation.MaxAdFormat.LEADER ? com.applovin.sdk.AppLovinAdSize.LEADER : null;
        }
        if (appLovinAdSize != null) {
            log("Loading regular " + maxAdFormat.getLabel() + " ad...");
            getWrappingSdk().getAdService().loadNextAd(appLovinAdSize, appLovinAdapterAdViewListener);
        } else {
            log("Failed to load ad for format: " + maxAdFormat);
            maxAdViewAdapterListener.onAdViewAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError.INTERNAL_ERROR);
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void loadAppOpenAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        loadFullscreenAd("inter_appopen", maxAdapterResponseParameters, com.applovin.mediation.MaxAdFormat.APP_OPEN, new com.applovin.mediation.adapters.AppLovinAdapterAppOpenListener(this, maxAppOpenAdapterListener));
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        loadFullscreenAd("inter_regular", maxAdapterResponseParameters, com.applovin.mediation.MaxAdFormat.INTERSTITIAL, new com.applovin.mediation.adapters.AppLovinAdapterInterstitialListener(this, maxInterstitialAdapterListener));
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        if (android.text.TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            maxNativeAdAdapterListener.onNativeAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION);
        } else {
            d("Loading bidding native ad...");
            getWrappingSdk().a().T().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), new com.applovin.mediation.adapters.AppLovinAdapterNativeListener(maxAdapterResponseParameters, this, maxNativeAdAdapterListener));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener) {
        loadFullscreenAd("inter_videoa", maxAdapterResponseParameters, com.applovin.mediation.MaxAdFormat.REWARDED, new com.applovin.mediation.adapters.AppLovinAdapterRewardedListener(this, maxRewardedAdapterListener));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter
    public void loadRewardedInterstitialAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        loadFullscreenAd("inter_autorew", maxAdapterResponseParameters, com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL, new com.applovin.mediation.adapters.AppLovinAdapterRewardedInterstitialListener(this, maxRewardedInterstitialAdapterListener));
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        this.loadedInterstitialAd = null;
        this.loadedAppOpenAd = null;
        this.loadedRewardedAd = null;
        this.loadedRewardedInterstitialAd = null;
        com.applovin.adview.AppLovinAdView appLovinAdView = this.loadedAdView;
        if (appLovinAdView != null) {
            appLovinAdView.destroy();
            this.loadedAdView = null;
        }
        com.applovin.impl.sdk.nativeAd.AppLovinNativeAd appLovinNativeAd = this.loadedNativeAd;
        if (appLovinNativeAd instanceof com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl) {
            ((com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl) appLovinNativeAd).destroy();
            this.loadedNativeAd = null;
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void showAppOpenAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        log("Showing app open ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        com.applovin.impl.adview.AppLovinAppOpenAd appLovinAppOpenAd = new com.applovin.impl.adview.AppLovinAppOpenAd(getWrappingSdk());
        com.applovin.mediation.adapters.AppLovinAdapterAppOpenListener appLovinAdapterAppOpenListener = new com.applovin.mediation.adapters.AppLovinAdapterAppOpenListener(this, maxAppOpenAdapterListener);
        appLovinAppOpenAd.setAdDisplayListener(appLovinAdapterAppOpenListener);
        appLovinAppOpenAd.setAdClickListener(appLovinAdapterAppOpenListener);
        appLovinAppOpenAd.show(this.loadedAppOpenAd);
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        com.applovin.adview.AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = com.applovin.adview.AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        com.applovin.mediation.adapters.AppLovinAdapterInterstitialListener appLovinAdapterInterstitialListener = new com.applovin.mediation.adapters.AppLovinAdapterInterstitialListener(this, maxInterstitialAdapterListener);
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(appLovinAdapterInterstitialListener);
        appLovinInterstitialAdDialogCreate.setAdClickListener(appLovinAdapterInterstitialListener);
        appLovinInterstitialAdDialogCreate.showAndRender(this.loadedInterstitialAd);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        configureReward(maxAdapterResponseParameters);
        com.applovin.adview.AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitialCreate = com.applovin.adview.AppLovinIncentivizedInterstitial.create(getWrappingSdk());
        com.applovin.mediation.adapters.AppLovinAdapterRewardedListener appLovinAdapterRewardedListener = new com.applovin.mediation.adapters.AppLovinAdapterRewardedListener(this, maxRewardedAdapterListener);
        appLovinIncentivizedInterstitialCreate.show(this.loadedRewardedAd, activity, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter
    public void showRewardedInterstitialAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        log("Showing rewarded interstitial ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        com.applovin.mediation.adapters.AppLovinAdapterRewardedInterstitialListener appLovinAdapterRewardedInterstitialListener = new com.applovin.mediation.adapters.AppLovinAdapterRewardedInterstitialListener(this, maxRewardedInterstitialAdapterListener);
        if (this.loadedRewardedInterstitialAd.getType() == com.applovin.sdk.AppLovinAdType.AUTO_INCENTIVIZED) {
            configureReward(maxAdapterResponseParameters);
            com.applovin.impl.adview.AppLovinRewardedInterstitialAd appLovinRewardedInterstitialAd = new com.applovin.impl.adview.AppLovinRewardedInterstitialAd(getWrappingSdk());
            appLovinRewardedInterstitialAd.setAdDisplayListener(appLovinAdapterRewardedInterstitialListener);
            appLovinRewardedInterstitialAd.setAdClickListener(appLovinAdapterRewardedInterstitialListener);
            appLovinRewardedInterstitialAd.setAdVideoPlaybackListener(appLovinAdapterRewardedInterstitialListener);
            appLovinRewardedInterstitialAd.show(this.loadedRewardedInterstitialAd, activity, appLovinAdapterRewardedInterstitialListener);
            return;
        }
        log("Rewarded interstitial is regular interstitial");
        com.applovin.adview.AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = com.applovin.adview.AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(appLovinAdapterRewardedInterstitialListener);
        appLovinInterstitialAdDialogCreate.setAdClickListener(appLovinAdapterRewardedInterstitialListener);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(appLovinAdapterRewardedInterstitialListener);
        appLovinInterstitialAdDialogCreate.showAndRender(this.loadedRewardedInterstitialAd);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxRewardedAdViewAdapter
    public void showRewardedAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad view: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        configureReward(maxAdapterResponseParameters);
        com.applovin.adview.AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitialCreate = com.applovin.adview.AppLovinIncentivizedInterstitial.create(getWrappingSdk());
        com.applovin.mediation.adapters.AppLovinAdapterRewardedListener appLovinAdapterRewardedListener = new com.applovin.mediation.adapters.AppLovinAdapterRewardedListener(this, maxRewardedAdapterListener);
        appLovinIncentivizedInterstitialCreate.show(this.loadedRewardedAd, viewGroup, lifecycle, activity, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter
    public void showInterstitialAd(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad view: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        com.applovin.adview.AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = com.applovin.adview.AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        com.applovin.mediation.adapters.AppLovinAdapterInterstitialListener appLovinAdapterInterstitialListener = new com.applovin.mediation.adapters.AppLovinAdapterInterstitialListener(this, maxInterstitialAdapterListener);
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(appLovinAdapterInterstitialListener);
        appLovinInterstitialAdDialogCreate.setAdClickListener(appLovinAdapterInterstitialListener);
        appLovinInterstitialAdDialogCreate.showAndRender(this.loadedInterstitialAd, viewGroup, lifecycle);
    }
}
