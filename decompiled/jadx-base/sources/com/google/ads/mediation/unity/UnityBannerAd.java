package com.google.ads.mediation.unity;

/* JADX INFO: loaded from: classes4.dex */
public class UnityBannerAd extends com.google.ads.mediation.unity.UnityMediationAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter {
    private java.lang.String bannerPlacementId;
    private com.unity3d.services.banners.BannerView bannerView;
    private com.google.ads.mediation.unity.eventadapters.UnityBannerEventAdapter eventAdapter;
    private java.lang.String gameId;
    private com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener;
    private com.unity3d.services.banners.BannerView.IListener unityBannerListener = new com.unity3d.services.banners.BannerView.Listener() { // from class: com.google.ads.mediation.unity.UnityBannerAd.1
        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public void onBannerLoaded(com.unity3d.services.banners.BannerView bannerView) {
            logBannerMessage("Unity Ads finished loading banner ad for placement ID: %s", bannerView);
            com.google.ads.mediation.unity.UnityBannerAd.this.eventAdapter.sendAdEvent(com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.LOADED);
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public void onBannerClick(com.unity3d.services.banners.BannerView bannerView) {
            logBannerMessage("Unity Ads banner ad was clicked for placement ID: %s", bannerView);
            com.google.ads.mediation.unity.UnityBannerAd.this.eventAdapter.sendAdEvent(com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.CLICKED);
            com.google.ads.mediation.unity.UnityBannerAd.this.eventAdapter.sendAdEvent(com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.OPENED);
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public void onBannerFailedToLoad(com.unity3d.services.banners.BannerView bannerView, com.unity3d.services.banners.BannerErrorInfo bannerErrorInfo) {
            com.google.ads.mediation.unity.UnityBannerAd.this.sendBannerFailedToLoad(com.google.ads.mediation.unity.UnityAdsAdapterUtils.getMediationErrorCode(bannerErrorInfo), bannerErrorInfo.errorMessage);
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public void onBannerLeftApplication(com.unity3d.services.banners.BannerView bannerView) {
            logBannerMessage("Unity Ads banner ad left application for placement ID: %s", bannerView);
            com.google.ads.mediation.unity.UnityBannerAd.this.eventAdapter.sendAdEvent(com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION);
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public void onBannerShown(com.unity3d.services.banners.BannerView bannerView) {
            logBannerMessage("Unity Ads banner ad was shown for placement ID: %s", bannerView);
            com.google.ads.mediation.unity.UnityBannerAd.this.eventAdapter.sendAdEvent(com.google.ads.mediation.unity.UnityAdsAdapterUtils.AdEvent.IMPRESSION);
        }

        private void logBannerMessage(java.lang.String str, com.unity3d.services.banners.BannerView bannerView) {
            if (bannerView != null) {
                android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format(str, bannerView.getPlacementId()));
            }
        }
    };

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        com.unity3d.services.banners.BannerView bannerView = this.bannerView;
        if (bannerView != null) {
            bannerView.destroy();
        }
        this.bannerView = null;
        this.mediationBannerListener = null;
        this.unityBannerListener = null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(final android.content.Context context, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener, android.os.Bundle bundle, com.google.android.gms.ads.AdSize adSize, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle2) {
        this.mediationBannerListener = mediationBannerListener;
        this.eventAdapter = new com.google.ads.mediation.unity.eventadapters.UnityBannerEventAdapter(this.mediationBannerListener, this);
        this.gameId = bundle.getString(com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID);
        java.lang.String string = bundle.getString("zoneId");
        this.bannerPlacementId = string;
        if (!com.google.ads.mediation.unity.UnityAdsAdapterUtils.areValidIds(this.gameId, string)) {
            sendBannerFailedToLoad(101, "Missing or invalid server parameters.");
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            sendBannerFailedToLoad(105, "Unity Ads requires an Activity context to load ads.");
            return;
        }
        final android.app.Activity activity = (android.app.Activity) context;
        final com.unity3d.services.banners.UnityBannerSize unityBannerSize = com.google.ads.mediation.unity.UnityAdsAdapterUtils.getUnityBannerSize(context, adSize);
        if (unityBannerSize == null) {
            sendBannerFailedToLoad(110, java.lang.String.format("There is no matching Unity Ads ad size for Google ad size: %s", adSize));
        } else {
            com.google.ads.mediation.unity.UnityInitializer.getInstance().initializeUnityAds(context, this.gameId, new com.unity3d.ads.IUnityAdsInitializationListener() { // from class: com.google.ads.mediation.unity.UnityBannerAd.2
                @Override // com.unity3d.ads.IUnityAdsInitializationListener
                public void onInitializationComplete() {
                    android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads is initialized for game ID '%s' and can now load banner ad with placement ID: %s", com.google.ads.mediation.unity.UnityBannerAd.this.gameId, com.google.ads.mediation.unity.UnityBannerAd.this.bannerPlacementId));
                    if (com.google.ads.mediation.unity.UnityBannerAd.this.bannerView == null) {
                        com.google.ads.mediation.unity.UnityBannerAd.this.bannerView = new com.unity3d.services.banners.BannerView(activity, com.google.ads.mediation.unity.UnityBannerAd.this.bannerPlacementId, unityBannerSize);
                    }
                    com.google.ads.mediation.unity.UnityAdsAdapterUtils.setCoppa(com.google.android.gms.ads.MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment(), context);
                    com.google.ads.mediation.unity.UnityBannerAd.this.bannerView.setListener(com.google.ads.mediation.unity.UnityBannerAd.this.unityBannerListener);
                    com.google.ads.mediation.unity.UnityBannerAd.this.bannerView.load();
                }

                @Override // com.unity3d.ads.IUnityAdsInitializationListener
                public void onInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError unityAdsInitializationError, java.lang.String str) {
                    com.google.android.gms.ads.AdError adErrorCreateSDKError = com.google.ads.mediation.unity.UnityAdsAdapterUtils.createSDKError(unityAdsInitializationError, java.lang.String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", com.google.ads.mediation.unity.UnityBannerAd.this.gameId, str));
                    android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, adErrorCreateSDKError.toString());
                    if (com.google.ads.mediation.unity.UnityBannerAd.this.mediationBannerListener != null) {
                        com.google.ads.mediation.unity.UnityBannerAd.this.mediationBannerListener.onAdFailedToLoad(com.google.ads.mediation.unity.UnityBannerAd.this, adErrorCreateSDKError);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public android.view.View getBannerView() {
        return this.bannerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendBannerFailedToLoad(int i, java.lang.String str) {
        com.google.android.gms.ads.AdError adErrorCreateAdError = com.google.ads.mediation.unity.UnityAdsAdapterUtils.createAdError(i, str);
        android.util.Log.w(TAG, adErrorCreateAdError.toString());
        com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener = this.mediationBannerListener;
        if (mediationBannerListener != null) {
            mediationBannerListener.onAdFailedToLoad(this, adErrorCreateAdError);
        }
    }
}
