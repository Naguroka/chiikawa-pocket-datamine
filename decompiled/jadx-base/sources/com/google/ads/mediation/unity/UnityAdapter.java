package com.google.ads.mediation.unity;

/* JADX INFO: loaded from: classes4.dex */
public class UnityAdapter extends com.google.ads.mediation.unity.UnityMediationAdapter implements com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationBannerAdapter {
    private java.lang.ref.WeakReference<android.app.Activity> activityWeakReference;
    private com.google.ads.mediation.unity.UnityBannerAd bannerAd;
    private com.google.ads.mediation.unity.eventadapters.UnityInterstitialEventAdapter eventAdapter;
    private com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener;
    private java.lang.String objectId;
    private java.lang.String placementId;
    private final com.unity3d.ads.IUnityAdsLoadListener unityLoadListener = new com.unity3d.ads.IUnityAdsLoadListener() { // from class: com.google.ads.mediation.unity.UnityAdapter.1
        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(java.lang.String str) {
            android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads interstitial ad successfully loaded for placement ID: %s", str));
            com.google.ads.mediation.unity.UnityAdapter.this.placementId = str;
            com.google.ads.mediation.unity.UnityAdapter.this.eventAdapter.sendAdEvent(com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.LOADED);
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, java.lang.String str2) {
            com.google.ads.mediation.unity.UnityAdapter.this.placementId = str;
            com.google.android.gms.ads.AdError adErrorCreateSDKError = com.google.ads.mediation.unity.UnityAdsAdapterUtils.createSDKError(unityAdsLoadError, str2);
            android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, adErrorCreateSDKError.toString());
            if (com.google.ads.mediation.unity.UnityAdapter.this.mediationInterstitialListener != null) {
                com.google.ads.mediation.unity.UnityAdapter.this.mediationInterstitialListener.onAdFailedToLoad(com.google.ads.mediation.unity.UnityAdapter.this, adErrorCreateSDKError);
            }
        }
    };
    private final com.unity3d.ads.IUnityAdsShowListener unityShowListener = new com.unity3d.ads.IUnityAdsShowListener() { // from class: com.google.ads.mediation.unity.UnityAdapter.3
        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowStart(java.lang.String str) {
            android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads interstitial ad started for placement ID: %s", com.google.ads.mediation.unity.UnityAdapter.this.placementId));
            com.google.ads.mediation.unity.UnityAdapter.this.eventAdapter.sendAdEvent(com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.OPENED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowClick(java.lang.String str) {
            android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads interstitial ad was clicked for placement ID: %s", com.google.ads.mediation.unity.UnityAdapter.this.placementId));
            com.google.ads.mediation.unity.UnityAdapter.this.eventAdapter.sendAdEvent(com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.CLICKED);
            com.google.ads.mediation.unity.UnityAdapter.this.eventAdapter.sendAdEvent(com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowComplete(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads interstitial ad finished playing for placement ID: %s", com.google.ads.mediation.unity.UnityAdapter.this.placementId));
            com.google.ads.mediation.unity.UnityAdapter.this.eventAdapter.sendAdEvent(com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.CLOSED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowFailure(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str2) {
            android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, com.google.ads.mediation.unity.UnityAdsAdapterUtils.createSDKError(unityAdsShowError, str2).toString());
            com.google.ads.mediation.unity.UnityAdapter.this.eventAdapter.sendAdEvent(com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.OPENED);
            com.google.ads.mediation.unity.UnityAdapter.this.eventAdapter.sendAdEvent(com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.CLOSED);
        }
    };

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(android.content.Context context, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener, android.os.Bundle bundle, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle2) {
        this.mediationInterstitialListener = mediationInterstitialListener;
        this.eventAdapter = new com.google.ads.mediation.unity.eventadapters.UnityInterstitialEventAdapter(this.mediationInterstitialListener, this);
        final java.lang.String string = bundle.getString(com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID);
        java.lang.String string2 = bundle.getString("zoneId");
        this.placementId = string2;
        if (!com.google.ads.mediation.unity.UnityAdsAdapterUtils.areValidIds(string, string2)) {
            sendAdFailedToLoad(101, "Missing or invalid server parameters.");
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            sendAdFailedToLoad(105, "Unity Ads requires an Activity context to load ads.");
            return;
        }
        this.activityWeakReference = new java.lang.ref.WeakReference<>((android.app.Activity) context);
        com.google.ads.mediation.unity.UnityInitializer.getInstance().initializeUnityAds(context, string, new com.unity3d.ads.IUnityAdsInitializationListener() { // from class: com.google.ads.mediation.unity.UnityAdapter.2
            @Override // com.unity3d.ads.IUnityAdsInitializationListener
            public void onInitializationComplete() {
                android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads is initialized for game ID '%s' and can now load interstitial ad with placement ID: %s", string, com.google.ads.mediation.unity.UnityAdapter.this.placementId));
            }

            @Override // com.unity3d.ads.IUnityAdsInitializationListener
            public void onInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError unityAdsInitializationError, java.lang.String str) {
                com.google.android.gms.ads.AdError adErrorCreateSDKError = com.google.ads.mediation.unity.UnityAdsAdapterUtils.createSDKError(unityAdsInitializationError, java.lang.String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", string, str));
                android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, adErrorCreateSDKError.toString());
                if (com.google.ads.mediation.unity.UnityAdapter.this.mediationInterstitialListener != null) {
                    com.google.ads.mediation.unity.UnityAdapter.this.mediationInterstitialListener.onAdFailedToLoad(com.google.ads.mediation.unity.UnityAdapter.this, adErrorCreateSDKError);
                }
            }
        });
        com.google.ads.mediation.unity.UnityAdsAdapterUtils.setCoppa(com.google.android.gms.ads.MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment(), context);
        this.objectId = java.util.UUID.randomUUID().toString();
        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions = new com.unity3d.ads.UnityAdsLoadOptions();
        unityAdsLoadOptions.setObjectId(this.objectId);
        com.unity3d.ads.UnityAds.load(this.placementId, unityAdsLoadOptions, this.unityLoadListener);
    }

    private void sendAdFailedToLoad(int i, java.lang.String str) {
        com.google.android.gms.ads.AdError adErrorCreateAdError = com.google.ads.mediation.unity.UnityAdsAdapterUtils.createAdError(i, str);
        android.util.Log.w(TAG, adErrorCreateAdError.toString());
        com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener = this.mediationInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener.onAdFailedToLoad(this, adErrorCreateAdError);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        java.lang.ref.WeakReference<android.app.Activity> weakReference = this.activityWeakReference;
        android.app.Activity activity = weakReference == null ? null : weakReference.get();
        if (activity == null) {
            android.util.Log.w(TAG, "Failed to show interstitial ad for placement ID '" + this.placementId + "' from Unity Ads: Activity context is null.");
            this.eventAdapter.sendAdEvent(com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.CLOSED);
            return;
        }
        if (this.placementId == null) {
            android.util.Log.w(TAG, "Unity Ads received call to show before successfully loading an ad.");
        }
        com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions = new com.unity3d.ads.UnityAdsShowOptions();
        unityAdsShowOptions.setObjectId(this.objectId);
        com.unity3d.ads.UnityAds.show(activity, this.placementId, unityAdsShowOptions, this.unityShowListener);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(android.content.Context context, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener, android.os.Bundle bundle, com.google.android.gms.ads.AdSize adSize, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle2) {
        com.google.ads.mediation.unity.UnityBannerAd unityBannerAd = new com.google.ads.mediation.unity.UnityBannerAd();
        this.bannerAd = unityBannerAd;
        unityBannerAd.requestBannerAd(context, mediationBannerListener, bundle, adSize, mediationAdRequest, bundle2);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        this.mediationInterstitialListener = null;
        com.google.ads.mediation.unity.UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        com.google.ads.mediation.unity.UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        com.google.ads.mediation.unity.UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public android.view.View getBannerView() {
        return this.bannerAd.getBannerView();
    }
}
