package com.google.ads.mediation.unity;

/* JADX INFO: loaded from: classes4.dex */
public class UnityMediationAdapter extends com.google.android.gms.ads.mediation.rtb.RtbAdapter {
    public static final java.lang.String ADAPTER_ERROR_DOMAIN = "com.google.ads.mediation.unity";
    static final int ERROR_AD_NOT_READY = 106;
    static final int ERROR_BANNER_SIZE_MISMATCH = 110;
    static final int ERROR_CONTEXT_NOT_ACTIVITY = 105;
    static final int ERROR_FINISH = 109;
    static final int ERROR_INITIALIZATION_FAILURE = 111;
    static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    static final java.lang.String ERROR_MSG_CONTEXT_NULL = "Activity context is null.";
    static final java.lang.String ERROR_MSG_INITIALIZATION_FAILURE = "Unity Ads initialization failed: [%s] %s";
    static final java.lang.String ERROR_MSG_MISSING_PARAMETERS = "Missing or invalid server parameters.";
    static final java.lang.String ERROR_MSG_NON_ACTIVITY = "Unity Ads requires an Activity context to load ads.";
    static final int ERROR_NULL_CONTEXT = 104;
    static final int ERROR_PLACEMENT_STATE_DISABLED = 103;
    static final int ERROR_PLACEMENT_STATE_NO_FILL = 102;
    static final int ERROR_UNITY_ADS_NOT_SUPPORTED = 107;
    static final java.lang.String KEY_GAME_ID = "gameId";
    static final java.lang.String KEY_PLACEMENT_ID = "zoneId";
    static final java.lang.String KEY_WATERMARK = "watermark";
    public static final java.lang.String SDK_ERROR_DOMAIN = "com.unity3d.ads";
    static final java.lang.String TAG = "UnityMediationAdapter";
    private com.google.ads.mediation.unity.UnityMediationBannerAd bannerAd;
    private com.google.ads.mediation.unity.UnityMediationBannerAd bannerRtbAd;
    private com.google.ads.mediation.unity.UnityInterstitialAd interstitialAd;
    private com.google.ads.mediation.unity.UnityInterstitialAd interstitialRtbAd;
    private com.google.ads.mediation.unity.UnityRewardedAd rewardedAd;
    private com.google.ads.mediation.unity.UnityRewardedAd rewardedRtbAd;
    private final com.google.ads.mediation.unity.UnityAdsLoader unityAdsLoader;
    private final com.google.ads.mediation.unity.UnityBannerViewFactory unityBannerViewFactory;
    private final com.google.ads.mediation.unity.UnityInitializer unityInitializer;

    public UnityMediationAdapter() {
        this.unityInitializer = com.google.ads.mediation.unity.UnityInitializer.getInstance();
        this.unityBannerViewFactory = new com.google.ads.mediation.unity.UnityBannerViewFactory();
        this.unityAdsLoader = new com.google.ads.mediation.unity.UnityAdsLoader();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(com.google.android.gms.ads.mediation.rtb.RtbSignalData rtbSignalData, final com.google.android.gms.ads.mediation.rtb.SignalCallbacks signalCallbacks) {
        com.unity3d.ads.UnityAds.getToken(new com.unity3d.ads.IUnityAdsTokenListener() { // from class: com.google.ads.mediation.unity.UnityMediationAdapter$$ExternalSyntheticLambda0
            @Override // com.unity3d.ads.IUnityAdsTokenListener
            public final void onUnityAdsTokenReady(java.lang.String str) {
                com.google.ads.mediation.unity.UnityMediationAdapter.lambda$collectSignals$0(signalCallbacks, str);
            }
        });
    }

    static /* synthetic */ void lambda$collectSignals$0(com.google.android.gms.ads.mediation.rtb.SignalCallbacks signalCallbacks, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        signalCallbacks.onSuccess(str);
    }

    UnityMediationAdapter(com.google.ads.mediation.unity.UnityInitializer unityInitializer, com.google.ads.mediation.unity.UnityBannerViewFactory unityBannerViewFactory, com.google.ads.mediation.unity.UnityAdsLoader unityAdsLoader) {
        this.unityInitializer = unityInitializer;
        this.unityBannerViewFactory = unityBannerViewFactory;
        this.unityAdsLoader = unityAdsLoader;
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getVersionInfo() {
        java.lang.String[] strArrSplit = com.google.ads.mediation.unity.BuildConfig.ADAPTER_VERSION.split("\\.");
        if (strArrSplit.length >= 4) {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(strArrSplit[0]), java.lang.Integer.parseInt(strArrSplit[1]), (java.lang.Integer.parseInt(strArrSplit[2]) * 100) + java.lang.Integer.parseInt(strArrSplit[3]));
        }
        android.util.Log.w(TAG, java.lang.String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", com.google.ads.mediation.unity.BuildConfig.ADAPTER_VERSION));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getSDKVersionInfo() {
        java.lang.String version = com.unity3d.ads.UnityAds.getVersion();
        java.lang.String[] strArrSplit = version.split("\\.");
        if (strArrSplit.length >= 3) {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(strArrSplit[0]), java.lang.Integer.parseInt(strArrSplit[1]), java.lang.Integer.parseInt(strArrSplit[2]));
        }
        android.util.Log.w(TAG, java.lang.String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", version));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(android.content.Context context, final com.google.android.gms.ads.mediation.InitializationCompleteCallback initializationCompleteCallback, java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> list) {
        java.lang.String str;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<com.google.android.gms.ads.mediation.MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String string = it.next().getServerParameters().getString("gameId");
            if (!android.text.TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            str = (java.lang.String) hashSet.iterator().next();
            if (size > 1) {
                android.util.Log.w(TAG, java.lang.String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the UnityAds SDK", "gameId", hashSet, str));
            }
        } else {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(str)) {
            initializationCompleteCallback.onInitializationFailed(new com.google.android.gms.ads.AdError(101, "Missing or invalid Game ID.", "com.google.ads.mediation.unity").toString());
        } else {
            this.unityInitializer.initializeUnityAds(context, str, new com.unity3d.ads.IUnityAdsInitializationListener() { // from class: com.google.ads.mediation.unity.UnityMediationAdapter.1
                @Override // com.unity3d.ads.IUnityAdsInitializationListener
                public void onInitializationComplete() {
                    android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, "Unity Ads initialized successfully.");
                    initializationCompleteCallback.onInitializationSucceeded();
                }

                @Override // com.unity3d.ads.IUnityAdsInitializationListener
                public void onInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError unityAdsInitializationError, java.lang.String str2) {
                    com.google.android.gms.ads.AdError adErrorCreateSDKError = com.google.ads.mediation.unity.UnityAdsAdapterUtils.createSDKError(unityAdsInitializationError, java.lang.String.format(com.google.ads.mediation.unity.UnityMediationAdapter.ERROR_MSG_INITIALIZATION_FAILURE, unityAdsInitializationError, str2));
                    android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, adErrorCreateSDKError.toString());
                    initializationCompleteCallback.onInitializationFailed(adErrorCreateSDKError.toString());
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.unity.UnityRewardedAd unityRewardedAd = new com.google.ads.mediation.unity.UnityRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.unityInitializer, this.unityAdsLoader);
        this.rewardedAd = unityRewardedAd;
        unityRewardedAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.unity.UnityMediationBannerAd unityMediationBannerAd = new com.google.ads.mediation.unity.UnityMediationBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback, this.unityInitializer, this.unityBannerViewFactory, this.unityAdsLoader);
        this.bannerAd = unityMediationBannerAd;
        unityMediationBannerAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.unity.UnityMediationBannerAd unityMediationBannerAd = new com.google.ads.mediation.unity.UnityMediationBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback, this.unityInitializer, this.unityBannerViewFactory, this.unityAdsLoader);
        this.bannerRtbAd = unityMediationBannerAd;
        unityMediationBannerAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.unity.UnityInterstitialAd unityInterstitialAd = new com.google.ads.mediation.unity.UnityInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.unityInitializer, this.unityAdsLoader);
        this.interstitialAd = unityInterstitialAd;
        unityInterstitialAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public final void loadRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.unity.UnityInterstitialAd unityInterstitialAd = new com.google.ads.mediation.unity.UnityInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.unityInitializer, this.unityAdsLoader);
        this.interstitialRtbAd = unityInterstitialAd;
        unityInterstitialAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.unity.UnityRewardedAd unityRewardedAd = new com.google.ads.mediation.unity.UnityRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.unityInitializer, this.unityAdsLoader);
        this.rewardedRtbAd = unityRewardedAd;
        unityRewardedAd.loadAd();
    }
}
