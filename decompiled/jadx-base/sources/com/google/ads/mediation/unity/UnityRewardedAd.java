package com.google.ads.mediation.unity;

/* JADX INFO: loaded from: classes4.dex */
public class UnityRewardedAd implements com.google.android.gms.ads.mediation.MediationRewardedAd {
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback;
    private com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback;
    private final com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration;
    private java.lang.String objectId;
    private java.lang.String placementId;
    private final com.google.ads.mediation.unity.UnityAdsLoader unityAdsLoader;
    private final com.google.ads.mediation.unity.UnityInitializer unityInitializer;
    final com.unity3d.ads.IUnityAdsLoadListener unityLoadListener = new com.unity3d.ads.IUnityAdsLoadListener() { // from class: com.google.ads.mediation.unity.UnityRewardedAd.1
        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(java.lang.String str) {
            android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads rewarded ad successfully loaded placement ID: %s", str));
            com.google.ads.mediation.unity.UnityRewardedAd.this.placementId = str;
            com.google.ads.mediation.unity.UnityRewardedAd unityRewardedAd = com.google.ads.mediation.unity.UnityRewardedAd.this;
            unityRewardedAd.mediationRewardedAdCallback = (com.google.android.gms.ads.mediation.MediationRewardedAdCallback) unityRewardedAd.mediationAdLoadCallback.onSuccess(com.google.ads.mediation.unity.UnityRewardedAd.this);
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, java.lang.String str2) {
            com.google.ads.mediation.unity.UnityRewardedAd.this.placementId = str;
            com.google.android.gms.ads.AdError adErrorCreateSDKError = com.google.ads.mediation.unity.UnityAdsAdapterUtils.createSDKError(unityAdsLoadError, str2);
            android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, adErrorCreateSDKError.toString());
            com.google.ads.mediation.unity.UnityRewardedAd.this.mediationAdLoadCallback.onFailure(adErrorCreateSDKError);
        }
    };
    final com.unity3d.ads.IUnityAdsShowListener unityShowListener = new com.unity3d.ads.IUnityAdsShowListener() { // from class: com.google.ads.mediation.unity.UnityRewardedAd.2
        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowStart(java.lang.String str) {
            if (com.google.ads.mediation.unity.UnityRewardedAd.this.mediationRewardedAdCallback == null) {
                return;
            }
            com.google.ads.mediation.unity.UnityRewardedAd.this.mediationRewardedAdCallback.onAdOpened();
            com.google.ads.mediation.unity.UnityRewardedAd.this.mediationRewardedAdCallback.reportAdImpression();
            com.google.ads.mediation.unity.UnityRewardedAd.this.mediationRewardedAdCallback.onVideoStart();
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowClick(java.lang.String str) {
            if (com.google.ads.mediation.unity.UnityRewardedAd.this.mediationRewardedAdCallback != null) {
                com.google.ads.mediation.unity.UnityRewardedAd.this.mediationRewardedAdCallback.reportAdClicked();
            }
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowComplete(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            if (com.google.ads.mediation.unity.UnityRewardedAd.this.mediationRewardedAdCallback == null) {
                return;
            }
            if (unityAdsShowCompletionState == com.unity3d.ads.UnityAds.UnityAdsShowCompletionState.COMPLETED) {
                com.google.ads.mediation.unity.UnityRewardedAd.this.mediationRewardedAdCallback.onVideoComplete();
                com.google.ads.mediation.unity.UnityRewardedAd.this.mediationRewardedAdCallback.onUserEarnedReward(new com.google.ads.mediation.unity.UnityReward());
            }
            com.google.ads.mediation.unity.UnityRewardedAd.this.mediationRewardedAdCallback.onAdClosed();
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowFailure(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str2) {
            if (com.google.ads.mediation.unity.UnityRewardedAd.this.mediationRewardedAdCallback != null) {
                com.google.ads.mediation.unity.UnityRewardedAd.this.mediationRewardedAdCallback.onAdFailedToShow(com.google.ads.mediation.unity.UnityAdsAdapterUtils.createSDKError(unityAdsShowError, str2));
            }
        }
    };

    public UnityRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback, com.google.ads.mediation.unity.UnityInitializer unityInitializer, com.google.ads.mediation.unity.UnityAdsLoader unityAdsLoader) {
        this.mediationRewardedAdConfiguration = mediationRewardedAdConfiguration;
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.unityInitializer = unityInitializer;
        this.unityAdsLoader = unityAdsLoader;
    }

    public void loadAd() {
        android.content.Context context = this.mediationRewardedAdConfiguration.getContext();
        if (!(context instanceof android.app.Activity)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(105, "Unity Ads requires an Activity context to load ads.", "com.google.ads.mediation.unity");
            android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, adError.toString());
            this.mediationAdLoadCallback.onFailure(adError);
            return;
        }
        android.os.Bundle serverParameters = this.mediationRewardedAdConfiguration.getServerParameters();
        java.lang.String string = serverParameters.getString(com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID);
        java.lang.String string2 = serverParameters.getString("zoneId");
        if (!com.google.ads.mediation.unity.UnityAdsAdapterUtils.areValidIds(string, string2)) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(101, "Missing or invalid server parameters.", "com.google.ads.mediation.unity");
            android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, adError2.toString());
            this.mediationAdLoadCallback.onFailure(adError2);
        } else {
            this.unityInitializer.initializeUnityAds(context, string, new com.google.ads.mediation.unity.UnityRewardedAd.UnityAdsInitializationListener(context, string, string2, this.mediationRewardedAdConfiguration.getBidResponse()));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(android.content.Context context) {
        if (!(context instanceof android.app.Activity)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(105, "Unity Ads requires an Activity context to load ads.", "com.google.ads.mediation.unity");
            android.util.Log.e(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, adError.toString());
            com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
                return;
            }
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        if (this.placementId == null) {
            android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
        }
        com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptionsCreateUnityAdsShowOptionsWithId = this.unityAdsLoader.createUnityAdsShowOptionsWithId(this.objectId);
        unityAdsShowOptionsCreateUnityAdsShowOptionsWithId.set("watermark", this.mediationRewardedAdConfiguration.getWatermark());
        this.unityAdsLoader.show(activity, this.placementId, unityAdsShowOptionsCreateUnityAdsShowOptionsWithId, this.unityShowListener);
    }

    private class UnityAdsInitializationListener implements com.unity3d.ads.IUnityAdsInitializationListener {
        private final java.lang.String adMarkup;
        private final android.content.Context context;
        private final java.lang.String gameId;
        private final java.lang.String placementId;

        UnityAdsInitializationListener(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.context = context;
            this.gameId = str;
            this.placementId = str2;
            this.adMarkup = str3;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() {
            android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads is initialized for game ID '%s' and can now load rewarded ad with placement ID: %s", this.gameId, this.placementId));
            com.google.ads.mediation.unity.UnityAdsAdapterUtils.setCoppa(com.google.ads.mediation.unity.UnityRewardedAd.this.mediationRewardedAdConfiguration.taggedForChildDirectedTreatment(), this.context);
            com.google.ads.mediation.unity.UnityRewardedAd.this.objectId = java.util.UUID.randomUUID().toString();
            com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptionsCreateUnityAdsLoadOptionsWithId = com.google.ads.mediation.unity.UnityRewardedAd.this.unityAdsLoader.createUnityAdsLoadOptionsWithId(com.google.ads.mediation.unity.UnityRewardedAd.this.objectId);
            java.lang.String str = this.adMarkup;
            if (str != null) {
                unityAdsLoadOptionsCreateUnityAdsLoadOptionsWithId.setAdMarkup(str);
            }
            com.google.ads.mediation.unity.UnityRewardedAd.this.unityAdsLoader.load(this.placementId, unityAdsLoadOptionsCreateUnityAdsLoadOptionsWithId, com.google.ads.mediation.unity.UnityRewardedAd.this.unityLoadListener);
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError unityAdsInitializationError, java.lang.String str) {
            com.google.android.gms.ads.AdError adErrorCreateSDKError = com.google.ads.mediation.unity.UnityAdsAdapterUtils.createSDKError(unityAdsInitializationError, java.lang.String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", this.gameId, str));
            android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, adErrorCreateSDKError.toString());
            com.google.ads.mediation.unity.UnityRewardedAd.this.mediationAdLoadCallback.onFailure(adErrorCreateSDKError);
        }
    }
}
