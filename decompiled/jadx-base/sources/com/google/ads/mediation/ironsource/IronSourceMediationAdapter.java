package com.google.ads.mediation.ironsource;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceMediationAdapter extends com.google.android.gms.ads.mediation.rtb.RtbAdapter {
    public static final java.lang.String ADAPTER_ERROR_DOMAIN = "com.google.ads.mediation.ironsource";
    public static final int ERROR_AD_ALREADY_LOADED = 103;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 105;
    public static final int ERROR_CALL_SHOW_BEFORE_LOADED_SUCCESS = 107;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 102;
    public static final int ERROR_SDK_NOT_INITIALIZED = 106;
    public static final java.lang.String IRONSOURCE_SDK_ERROR_DOMAIN = "com.ironsource.mediationsdk";
    private static final java.util.concurrent.atomic.AtomicBoolean isInitialized = new java.util.concurrent.atomic.AtomicBoolean(false);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getSDKVersionInfo() {
        java.lang.String sDKVersion = com.json.mediationsdk.utils.IronSourceUtils.getSDKVersion();
        java.lang.String[] strArrSplit = sDKVersion.split("\\.");
        if (strArrSplit.length >= 3) {
            int i = java.lang.Integer.parseInt(strArrSplit[0]);
            int i2 = java.lang.Integer.parseInt(strArrSplit[1]);
            int i3 = java.lang.Integer.parseInt(strArrSplit[2]);
            if (strArrSplit.length >= 4) {
                i3 = (i3 * 100) + java.lang.Integer.parseInt(strArrSplit[3]);
            }
            return new com.google.android.gms.ads.VersionInfo(i, i2, i3);
        }
        android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sDKVersion));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getVersionInfo() {
        java.lang.String adapterVersion = com.google.ads.mediation.ironsource.IronSourceAdapterUtils.getAdapterVersion();
        java.lang.String[] strArrSplit = adapterVersion.split("\\.");
        if (strArrSplit.length >= 4) {
            int i = java.lang.Integer.parseInt(strArrSplit[0]);
            int i2 = java.lang.Integer.parseInt(strArrSplit[1]);
            int i3 = (java.lang.Integer.parseInt(strArrSplit[2]) * 100) + java.lang.Integer.parseInt(strArrSplit[3]);
            if (strArrSplit.length >= 5) {
                i3 = (i3 * 100) + java.lang.Integer.parseInt(strArrSplit[4]);
            }
            return new com.google.android.gms.ads.VersionInfo(i, i2, i3);
        }
        android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", adapterVersion));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(android.content.Context context, final com.google.android.gms.ads.mediation.InitializationCompleteCallback initializationCompleteCallback, java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> list) {
        if (isInitialized.get()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<com.google.android.gms.ads.mediation.MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String string = it.next().getServerParameters().getString("appKey");
            if (!android.text.TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(new com.google.android.gms.ads.AdError(101, "Missing or invalid app key.", "com.google.ads.mediation.ironsource").getMessage());
            return;
        }
        java.lang.String str = (java.lang.String) hashSet.iterator().next();
        if (android.text.TextUtils.isEmpty(str)) {
            initializationCompleteCallback.onInitializationFailed(new com.google.android.gms.ads.AdError(101, "Missing or invalid app key.", "com.google.ads.mediation.ironsource").getMessage());
            return;
        }
        if (size > 1) {
            android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("Multiple '%s' entries found: %s. Using app key '%s' to initialize the IronSource SDK.", "appKey", hashSet, str));
        }
        com.json.mediationsdk.IronSource.setMediationType(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.getMediationType());
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, "Initializing IronSource SDK with app key: " + str);
        com.unity3d.ironsourceads.IronSourceAds.init(context, new com.unity3d.ironsourceads.InitRequest.Builder(str).withLegacyAdFormats(new java.util.ArrayList(java.util.Arrays.asList(com.unity3d.ironsourceads.IronSourceAds.AdFormat.BANNER, com.unity3d.ironsourceads.IronSourceAds.AdFormat.INTERSTITIAL, com.unity3d.ironsourceads.IronSourceAds.AdFormat.REWARDED))).build(), new com.unity3d.ironsourceads.InitListener() { // from class: com.google.ads.mediation.ironsource.IronSourceMediationAdapter.1
            @Override // com.unity3d.ironsourceads.InitListener
            public void onInitSuccess() {
                com.google.ads.mediation.ironsource.IronSourceMediationAdapter.isInitialized.set(true);
                initializationCompleteCallback.onInitializationSucceeded();
            }

            @Override // com.unity3d.ironsourceads.InitListener
            public void onInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
                initializationCompleteCallback.onInitializationFailed(ironSourceError.getErrorMessage());
            }
        });
        com.json.mediationsdk.IronSource.setISDemandOnlyInterstitialListener(com.google.ads.mediation.ironsource.IronSourceInterstitialAd.getIronSourceInterstitialListener());
        com.json.mediationsdk.IronSource.setISDemandOnlyRewardedVideoListener(com.google.ads.mediation.ironsource.IronSourceRewardedAd.getIronSourceRewardedListener());
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(com.google.android.gms.ads.mediation.rtb.RtbSignalData rtbSignalData, com.google.android.gms.ads.mediation.rtb.SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(com.json.mediationsdk.IronSource.getISDemandOnlyBiddingData(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (!isInitialized.get()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(106, "Failed to load IronSource rewarded ad since IronSource SDK is not initialized.", "com.google.ads.mediation.ironsource");
            android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        new com.google.ads.mediation.ironsource.IronSourceRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback).loadWaterfallAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (!isInitialized.get()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(106, "Failed to load IronSource RTB rewarded ad since IronSource SDK is not initialized.", "com.google.ads.mediation.ironsource");
            android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        new com.google.ads.mediation.ironsource.IronSourceRtbRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback).loadRtbAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, "IronSource adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from IronSource.");
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (!isInitialized.get()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(106, "Failed to load IronSource interstitial ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        new com.google.ads.mediation.ironsource.IronSourceInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback).loadWaterfallAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (!isInitialized.get()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(106, "Failed to load IronSource RTB interstitial ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        new com.google.ads.mediation.ironsource.IronSourceRtbInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback).loadRtbAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        if (!isInitialized.get()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(106, "Failed to load IronSource RTB interstitial ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        new com.google.ads.mediation.ironsource.IronSourceRtbBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback).loadRtbAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        if (!isInitialized.get()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(106, "Failed to load IronSource banner ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        new com.google.ads.mediation.ironsource.IronSourceBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback).loadAd();
    }

    public void setIsInitialized(boolean z) {
        isInitialized.set(z);
    }
}
