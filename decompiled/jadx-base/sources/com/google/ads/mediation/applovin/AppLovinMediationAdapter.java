package com.google.ads.mediation.applovin;

/* JADX INFO: loaded from: classes4.dex */
public class AppLovinMediationAdapter extends com.google.android.gms.ads.mediation.rtb.RtbAdapter {
    public static final java.lang.String APPLOVIN_SDK_ERROR_DOMAIN = "com.applovin.sdk";
    public static final int ERROR_AD_ALREADY_REQUESTED = 105;
    public static final int ERROR_AD_FORMAT_UNSUPPORTED = 108;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 101;
    public static final int ERROR_CHILD_USER = 112;
    public static final java.lang.String ERROR_DOMAIN = "com.google.ads.mediation.applovin";
    public static final int ERROR_EMPTY_BID_TOKEN = 104;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 110;
    static final java.lang.String ERROR_MSG_BANNER_SIZE_MISMATCH = "Failed to request banner with unsupported size.";
    static final java.lang.String ERROR_MSG_MISSING_SDK = "Missing or invalid SDK Key.";
    public static final int ERROR_PRESENTATON_AD_NOT_READY = 106;
    private static final java.lang.String TAG = "AppLovinMediationAdapter";
    public static com.applovin.sdk.AppLovinSdkSettings appLovinSdkSettings;
    private final com.google.ads.mediation.applovin.AppLovinAdFactory appLovinAdFactory;
    private final com.google.ads.mediation.applovin.AppLovinInitializer appLovinInitializer;
    private final com.google.ads.mediation.applovin.AppLovinSdkUtilsWrapper appLovinSdkUtilsWrapper;
    private final com.google.ads.mediation.applovin.AppLovinSdkWrapper appLovinSdkWrapper;
    private com.google.ads.mediation.applovin.AppLovinBannerAd bannerAd;
    private com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer rewardedRenderer;
    private com.applovin.mediation.rtb.AppLovinRtbInterstitialRenderer rtbInterstitialRenderer;
    private com.applovin.mediation.rtb.AppLovinRtbRewardedRenderer rtbRewardedRenderer;
    private com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd waterfallInterstitialAd;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    public AppLovinMediationAdapter() {
        this.appLovinInitializer = com.google.ads.mediation.applovin.AppLovinInitializer.getInstance();
        this.appLovinAdFactory = new com.google.ads.mediation.applovin.AppLovinAdFactory();
        this.appLovinSdkWrapper = new com.google.ads.mediation.applovin.AppLovinSdkWrapper();
        this.appLovinSdkUtilsWrapper = new com.google.ads.mediation.applovin.AppLovinSdkUtilsWrapper();
    }

    AppLovinMediationAdapter(com.google.ads.mediation.applovin.AppLovinInitializer appLovinInitializer, com.google.ads.mediation.applovin.AppLovinAdFactory appLovinAdFactory, com.google.ads.mediation.applovin.AppLovinSdkWrapper appLovinSdkWrapper, com.google.ads.mediation.applovin.AppLovinSdkUtilsWrapper appLovinSdkUtilsWrapper) {
        this.appLovinInitializer = appLovinInitializer;
        this.appLovinAdFactory = appLovinAdFactory;
        this.appLovinSdkWrapper = appLovinSdkWrapper;
        this.appLovinSdkUtilsWrapper = appLovinSdkUtilsWrapper;
    }

    public static com.applovin.sdk.AppLovinSdkSettings getSdkSettings(android.content.Context context) {
        if (appLovinSdkSettings == null) {
            appLovinSdkSettings = new com.applovin.sdk.AppLovinSdkSettings(context);
        }
        return appLovinSdkSettings;
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(android.content.Context context, final com.google.android.gms.ads.mediation.InitializationCompleteCallback initializationCompleteCallback, java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> list) {
        if (com.applovin.mediation.AppLovinUtils.isChildUser()) {
            initializationCompleteCallback.onInitializationFailed(com.applovin.mediation.AppLovinUtils.ERROR_MSG_CHILD_USER);
            return;
        }
        final java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<com.google.android.gms.ads.mediation.MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String string = it.next().getServerParameters().getString(com.applovin.mediation.AppLovinUtils.ServerParameterKeys.SDK_KEY);
            if (!android.text.TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        if (hashSet.isEmpty()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, ERROR_MSG_MISSING_SDK, ERROR_DOMAIN);
            android.util.Log.w(TAG, adError.getMessage());
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
        } else {
            final java.util.HashSet hashSet2 = new java.util.HashSet();
            java.util.Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                this.appLovinInitializer.initialize(context, (java.lang.String) it2.next(), new com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener() { // from class: com.google.ads.mediation.applovin.AppLovinMediationAdapter.1
                    @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
                    public void onInitializeSuccess(java.lang.String str) {
                        hashSet2.add(str);
                        if (hashSet2.equals(hashSet)) {
                            initializationCompleteCallback.onInitializationSucceeded();
                        }
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getVersionInfo() {
        return getVersionInfo(com.applovin.mediation.BuildConfig.ADAPTER_VERSION);
    }

    com.google.android.gms.ads.VersionInfo getVersionInfo(java.lang.String str) {
        java.lang.String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length >= 4) {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(strArrSplit[0]), java.lang.Integer.parseInt(strArrSplit[1]), (java.lang.Integer.parseInt(strArrSplit[2]) * 100) + java.lang.Integer.parseInt(strArrSplit[3]));
        }
        android.util.Log.w(TAG, java.lang.String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", str));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getSDKVersionInfo() {
        java.lang.String sdkVersion = this.appLovinSdkWrapper.getSdkVersion();
        java.lang.String[] strArrSplit = sdkVersion.split("\\.");
        if (strArrSplit.length >= 3) {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(strArrSplit[0]), java.lang.Integer.parseInt(strArrSplit[1]), java.lang.Integer.parseInt(strArrSplit[2]));
        }
        android.util.Log.w(TAG, java.lang.String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sdkVersion));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(com.google.android.gms.ads.mediation.rtb.RtbSignalData rtbSignalData, com.google.android.gms.ads.mediation.rtb.SignalCallbacks signalCallbacks) {
        if (com.applovin.mediation.AppLovinUtils.isChildUser()) {
            signalCallbacks.onFailure(com.applovin.mediation.AppLovinUtils.getChildUserError());
            return;
        }
        com.google.android.gms.ads.mediation.MediationConfiguration configuration = rtbSignalData.getConfiguration();
        if (configuration.getFormat() == com.google.android.gms.ads.AdFormat.NATIVE) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(108, "Requested to collect signal for unsupported native ad format. Ignoring...", ERROR_DOMAIN);
            android.util.Log.e(TAG, adError.getMessage());
            signalCallbacks.onFailure(adError);
            return;
        }
        java.lang.String str = TAG;
        android.util.Log.i(str, "Extras for signal collection: " + rtbSignalData.getNetworkExtras());
        java.lang.String bidToken = this.appLovinInitializer.retrieveSdk(configuration.getServerParameters(), rtbSignalData.getContext()).getAdService().getBidToken();
        if (android.text.TextUtils.isEmpty(bidToken)) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(104, "Failed to generate bid token.", ERROR_DOMAIN);
            android.util.Log.e(str, adError2.getMessage());
            signalCallbacks.onFailure(adError2);
        } else {
            android.util.Log.i(str, "Generated bid token: " + bidToken);
            signalCallbacks.onSuccess(bidToken);
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        if (com.applovin.mediation.AppLovinUtils.isChildUser()) {
            mediationAdLoadCallback.onFailure(com.applovin.mediation.AppLovinUtils.getChildUserError());
            return;
        }
        com.google.ads.mediation.applovin.AppLovinBannerAd appLovinBannerAdNewInstance = com.google.ads.mediation.applovin.AppLovinBannerAd.newInstance(mediationBannerAdConfiguration, mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory);
        this.bannerAd = appLovinBannerAdNewInstance;
        appLovinBannerAdNewInstance.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (com.applovin.mediation.AppLovinUtils.isChildUser()) {
            mediationAdLoadCallback.onFailure(com.applovin.mediation.AppLovinUtils.getChildUserError());
            return;
        }
        com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd appLovinWaterfallInterstitialAd = new com.google.ads.mediation.applovin.AppLovinWaterfallInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory);
        this.waterfallInterstitialAd = appLovinWaterfallInterstitialAd;
        appLovinWaterfallInterstitialAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (com.applovin.mediation.AppLovinUtils.isChildUser()) {
            mediationAdLoadCallback.onFailure(com.applovin.mediation.AppLovinUtils.getChildUserError());
            return;
        }
        com.applovin.mediation.rtb.AppLovinRtbInterstitialRenderer appLovinRtbInterstitialRenderer = new com.applovin.mediation.rtb.AppLovinRtbInterstitialRenderer(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory);
        this.rtbInterstitialRenderer = appLovinRtbInterstitialRenderer;
        appLovinRtbInterstitialRenderer.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (com.applovin.mediation.AppLovinUtils.isChildUser()) {
            mediationAdLoadCallback.onFailure(com.applovin.mediation.AppLovinUtils.getChildUserError());
            return;
        }
        com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer = new com.google.ads.mediation.applovin.AppLovinWaterfallRewardedRenderer(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory, this.appLovinSdkUtilsWrapper);
        this.rewardedRenderer = appLovinWaterfallRewardedRenderer;
        appLovinWaterfallRewardedRenderer.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (com.applovin.mediation.AppLovinUtils.isChildUser()) {
            mediationAdLoadCallback.onFailure(com.applovin.mediation.AppLovinUtils.getChildUserError());
            return;
        }
        com.applovin.mediation.rtb.AppLovinRtbRewardedRenderer appLovinRtbRewardedRenderer = new com.applovin.mediation.rtb.AppLovinRtbRewardedRenderer(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory, this.appLovinSdkUtilsWrapper);
        this.rtbRewardedRenderer = appLovinRtbRewardedRenderer;
        appLovinRtbRewardedRenderer.loadAd();
    }
}
