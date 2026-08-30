package com.google.ads.mediation.pangle;

/* JADX INFO: loaded from: classes4.dex */
public class PangleMediationAdapter extends com.google.android.gms.ads.mediation.rtb.RtbAdapter {
    static final java.lang.String ERROR_MESSAGE_MISSING_OR_INVALID_APP_ID = "Missing or invalid App ID.";
    public static final java.lang.String TAG = "PangleMediationAdapter";
    private static int ccpa = -1;
    private static int gdpr = -1;
    private com.google.ads.mediation.pangle.renderer.PangleAppOpenAd appOpenAd;
    private com.google.ads.mediation.pangle.renderer.PangleBannerAd bannerAd;
    private com.google.ads.mediation.pangle.renderer.PangleInterstitialAd interstitialAd;
    private com.google.ads.mediation.pangle.renderer.PangleNativeAd nativeAd;
    private final com.google.ads.mediation.pangle.PangleFactory pangleFactory;
    private final com.google.ads.mediation.pangle.PangleInitializer pangleInitializer;
    private final com.google.ads.mediation.pangle.PanglePrivacyConfig panglePrivacyConfig;
    private final com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper;
    private com.google.ads.mediation.pangle.renderer.PangleRewardedAd rewardedAd;

    public PangleMediationAdapter() {
        this.pangleInitializer = com.google.ads.mediation.pangle.PangleInitializer.getInstance();
        com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper = new com.google.ads.mediation.pangle.PangleSdkWrapper();
        this.pangleSdkWrapper = pangleSdkWrapper;
        this.pangleFactory = new com.google.ads.mediation.pangle.PangleFactory();
        this.panglePrivacyConfig = new com.google.ads.mediation.pangle.PanglePrivacyConfig(pangleSdkWrapper);
    }

    PangleMediationAdapter(com.google.ads.mediation.pangle.PangleInitializer pangleInitializer, com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper, com.google.ads.mediation.pangle.PangleFactory pangleFactory, com.google.ads.mediation.pangle.PanglePrivacyConfig panglePrivacyConfig) {
        this.pangleInitializer = pangleInitializer;
        this.pangleSdkWrapper = pangleSdkWrapper;
        this.pangleFactory = pangleFactory;
        this.panglePrivacyConfig = panglePrivacyConfig;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(com.google.android.gms.ads.mediation.rtb.RtbSignalData rtbSignalData, final com.google.android.gms.ads.mediation.rtb.SignalCallbacks signalCallbacks) {
        android.os.Bundle networkExtras = rtbSignalData.getNetworkExtras();
        if (networkExtras != null && networkExtras.containsKey("user_data")) {
            this.pangleSdkWrapper.setUserData(networkExtras.getString("user_data", ""));
        }
        this.pangleSdkWrapper.getBiddingToken(new com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback() { // from class: com.google.ads.mediation.pangle.PangleMediationAdapter.1
            @Override // com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback
            public void onBiddingTokenCollected(java.lang.String str) {
                signalCallbacks.onSuccess(str);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(android.content.Context context, final com.google.android.gms.ads.mediation.InitializationCompleteCallback initializationCompleteCallback, java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> list) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<com.google.android.gms.ads.mediation.MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String string = it.next().getServerParameters().getString(com.google.ads.mediation.pangle.PangleConstants.APP_ID);
            if (!android.text.TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            com.google.android.gms.ads.AdError adErrorCreateAdapterError = com.google.ads.mediation.pangle.PangleConstants.createAdapterError(101, ERROR_MESSAGE_MISSING_OR_INVALID_APP_ID);
            android.util.Log.w(TAG, adErrorCreateAdapterError.toString());
            initializationCompleteCallback.onInitializationFailed(adErrorCreateAdapterError.toString());
        } else {
            java.lang.String str = (java.lang.String) hashSet.iterator().next();
            if (size > 1) {
                android.util.Log.w(TAG, java.lang.String.format("Found multiple app IDs in %s. Using %s to initialize Pangle SDK.", hashSet, str));
            }
            this.panglePrivacyConfig.setCoppa(com.google.android.gms.ads.MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
            this.pangleInitializer.initialize(context, str, new com.google.ads.mediation.pangle.PangleInitializer.Listener() { // from class: com.google.ads.mediation.pangle.PangleMediationAdapter.2
                @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
                public void onInitializeSuccess() {
                    initializationCompleteCallback.onInitializationSucceeded();
                }

                @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
                public void onInitializeError(com.google.android.gms.ads.AdError adError) {
                    android.util.Log.w(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, adError.toString());
                    initializationCompleteCallback.onInitializationFailed(adError.getMessage());
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getVersionInfo() {
        return getVersionInfo(com.google.ads.mediation.pangle.BuildConfig.ADAPTER_VERSION);
    }

    com.google.android.gms.ads.VersionInfo getVersionInfo(java.lang.String str) {
        java.lang.String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length >= 4) {
            int i = java.lang.Integer.parseInt(strArrSplit[0]);
            int i2 = java.lang.Integer.parseInt(strArrSplit[1]);
            int i3 = (java.lang.Integer.parseInt(strArrSplit[2]) * 100) + java.lang.Integer.parseInt(strArrSplit[3]);
            if (strArrSplit.length >= 5) {
                i3 = (i3 * 100) + java.lang.Integer.parseInt(strArrSplit[4]);
            }
            return new com.google.android.gms.ads.VersionInfo(i, i2, i3);
        }
        android.util.Log.w(TAG, java.lang.String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", str));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getSDKVersionInfo() {
        java.lang.String sdkVersion = this.pangleSdkWrapper.getSdkVersion();
        java.lang.String[] strArrSplit = sdkVersion.split("\\.");
        if (strArrSplit.length >= 3) {
            int i = java.lang.Integer.parseInt(strArrSplit[0]);
            int i2 = java.lang.Integer.parseInt(strArrSplit[1]);
            int i3 = java.lang.Integer.parseInt(strArrSplit[2]);
            if (strArrSplit.length >= 4) {
                i3 = (i3 * 100) + java.lang.Integer.parseInt(strArrSplit[3]);
            }
            return new com.google.android.gms.ads.VersionInfo(i, i2, i3);
        }
        android.util.Log.w(TAG, java.lang.String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sdkVersion));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationAppOpenAd, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.pangle.renderer.PangleAppOpenAd pangleAppOpenAdCreatePangleAppOpenAd = this.pangleFactory.createPangleAppOpenAd(mediationAppOpenAdConfiguration, mediationAdLoadCallback, this.pangleInitializer, this.pangleSdkWrapper, this.panglePrivacyConfig);
        this.appOpenAd = pangleAppOpenAdCreatePangleAppOpenAd;
        pangleAppOpenAdCreatePangleAppOpenAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.pangle.renderer.PangleBannerAd pangleBannerAdCreatePangleBannerAd = this.pangleFactory.createPangleBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback, this.pangleInitializer, this.pangleSdkWrapper, this.panglePrivacyConfig);
        this.bannerAd = pangleBannerAdCreatePangleBannerAd;
        pangleBannerAdCreatePangleBannerAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.pangle.renderer.PangleInterstitialAd pangleInterstitialAdCreatePangleInterstitialAd = this.pangleFactory.createPangleInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.pangleInitializer, this.pangleSdkWrapper, this.panglePrivacyConfig);
        this.interstitialAd = pangleInterstitialAdCreatePangleInterstitialAd;
        pangleInterstitialAdCreatePangleInterstitialAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.pangle.renderer.PangleNativeAd pangleNativeAdCreatePangleNativeAd = this.pangleFactory.createPangleNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback, this.pangleInitializer, this.pangleSdkWrapper, this.panglePrivacyConfig);
        this.nativeAd = pangleNativeAdCreatePangleNativeAd;
        pangleNativeAdCreatePangleNativeAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.pangle.renderer.PangleRewardedAd pangleRewardedAdCreatePangleRewardedAd = this.pangleFactory.createPangleRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.pangleInitializer, this.pangleSdkWrapper, this.panglePrivacyConfig);
        this.rewardedAd = pangleRewardedAdCreatePangleRewardedAd;
        pangleRewardedAdCreatePangleRewardedAd.render();
    }

    public static void setGDPRConsent(int i) {
        setGDPRConsent(i, new com.google.ads.mediation.pangle.PangleSdkWrapper());
    }

    static void setGDPRConsent(int i, com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper) {
        if (i != 1 && i != 0 && i != -1) {
            android.util.Log.w(TAG, "Invalid GDPR value. Pangle SDK only accepts -1, 0 or 1.");
            return;
        }
        if (pangleSdkWrapper.isInitSuccess()) {
            pangleSdkWrapper.setGdprConsent(i);
        }
        gdpr = i;
    }

    public static int getGDPRConsent() {
        return gdpr;
    }

    public static void setDoNotSell(int i) {
        setDoNotSell(i, new com.google.ads.mediation.pangle.PangleSdkWrapper());
    }

    static void setDoNotSell(int i, com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper) {
        if (i != 0 && i != 1 && i != -1) {
            android.util.Log.w(TAG, "Invalid CCPA value. Pangle SDK only accepts -1, 0 or 1.");
            return;
        }
        if (pangleSdkWrapper.isInitSuccess()) {
            pangleSdkWrapper.setDoNotSell(i);
        }
        ccpa = i;
    }

    public static int getDoNotSell() {
        return ccpa;
    }
}
