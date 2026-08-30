package com.unity3d.services.banners;

/* JADX INFO: loaded from: classes6.dex */
public class BannerView extends android.widget.RelativeLayout {
    private com.unity3d.services.banners.view.BannerWebPlayerContainer bannerWebPlayerContainer;
    private final com.unity3d.services.ads.gmascar.GMAScarAdapterBridge gmaScarAdapterBridge;
    private com.unity3d.services.core.configuration.IInitializationListener initializationListener;
    private com.unity3d.services.banners.BannerView.IListener listener;
    private java.lang.String placementId;
    private com.unity3d.services.banners.view.ScarBannerContainer scarBannerContainer;
    private com.unity3d.services.banners.UnityBannerSize size;
    private java.lang.String viewId;

    public interface IListener {
        void onBannerClick(com.unity3d.services.banners.BannerView bannerView);

        void onBannerFailedToLoad(com.unity3d.services.banners.BannerView bannerView, com.unity3d.services.banners.BannerErrorInfo bannerErrorInfo);

        void onBannerLeftApplication(com.unity3d.services.banners.BannerView bannerView);

        void onBannerLoaded(com.unity3d.services.banners.BannerView bannerView);

        void onBannerShown(com.unity3d.services.banners.BannerView bannerView);
    }

    public static abstract class Listener implements com.unity3d.services.banners.BannerView.IListener {
        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerClick(com.unity3d.services.banners.BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerFailedToLoad(com.unity3d.services.banners.BannerView bannerView, com.unity3d.services.banners.BannerErrorInfo bannerErrorInfo) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLeftApplication(com.unity3d.services.banners.BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLoaded(com.unity3d.services.banners.BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerShown(com.unity3d.services.banners.BannerView bannerView) {
        }
    }

    public BannerView(android.app.Activity activity, java.lang.String str, com.unity3d.services.banners.UnityBannerSize unityBannerSize) {
        super(activity);
        this.gmaScarAdapterBridge = com.unity3d.services.ads.gmascar.GMA.getInstance().getBridge();
        this.viewId = java.util.UUID.randomUUID().toString();
        this.placementId = str;
        this.size = unityBannerSize;
        setupLayoutParams();
        setBackgroundColor(0);
        com.unity3d.services.core.properties.ClientProperties.setActivity(activity);
        com.unity3d.services.banners.BannerViewCache.getInstance().addBannerView(this);
    }

    public java.lang.String getPlacementId() {
        return this.placementId;
    }

    public com.unity3d.services.banners.UnityBannerSize getSize() {
        return this.size;
    }

    public void setListener(com.unity3d.services.banners.BannerView.IListener iListener) {
        this.listener = iListener;
    }

    public com.unity3d.services.banners.BannerView.IListener getListener() {
        return this.listener;
    }

    public void load() {
        bridgeLoad();
    }

    public void load(com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions) {
        bridgeLoad(unityAdsLoadOptions);
    }

    public void destroy() {
        com.unity3d.services.banners.BannerViewCache.getInstance().removeBannerView(this.viewId);
        unregisterInitializeListener();
        com.unity3d.services.UnityAdsSDK.INSTANCE.finishOMIDSession(this.viewId);
        com.unity3d.services.banners.bridge.BannerBridge.destroy(this.placementId);
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.banners.BannerView.1
            @Override // java.lang.Runnable
            public void run() {
                android.view.ViewParent parent = this.getParent();
                if (parent == null || !(parent instanceof android.view.ViewManager)) {
                    return;
                }
                ((android.view.ViewManager) parent).removeView(this);
            }
        });
        com.unity3d.services.banners.view.BannerWebPlayerContainer bannerWebPlayerContainer = this.bannerWebPlayerContainer;
        if (bannerWebPlayerContainer != null) {
            bannerWebPlayerContainer.destroy();
        }
        com.unity3d.services.banners.view.ScarBannerContainer scarBannerContainer = this.scarBannerContainer;
        if (scarBannerContainer != null) {
            scarBannerContainer.destroy();
        }
        com.unity3d.services.core.log.DeviceLog.info("Banner [" + this.placementId + "] was destroyed");
        this.viewId = null;
        this.listener = null;
        this.bannerWebPlayerContainer = null;
    }

    void loadScarPlayer(java.lang.String str, com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, com.unity3d.services.banners.UnityBannerSize unityBannerSize) {
        this.gmaScarAdapterBridge.loadBanner(getContext(), this, str, scarAdMetadata, unityBannerSize);
    }

    public void addScarContainer() {
        this.scarBannerContainer = new com.unity3d.services.banners.view.ScarBannerContainer(getContext(), this.viewId);
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.banners.BannerView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1217x2c39d1d7();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$addScarContainer$0$com-unity3d-services-banners-BannerView, reason: not valid java name */
    /* synthetic */ void m1217x2c39d1d7() {
        addView(this.scarBannerContainer);
    }

    void loadWebPlayer(final com.unity3d.services.banners.UnityBannerSize unityBannerSize) {
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.banners.BannerView.2
            @Override // java.lang.Runnable
            public void run() {
                org.json.JSONObject webSettings = com.unity3d.services.ads.webplayer.WebPlayerSettingsCache.getInstance().getWebSettings(this.viewId);
                org.json.JSONObject webPlayerSettings = com.unity3d.services.ads.webplayer.WebPlayerSettingsCache.getInstance().getWebPlayerSettings(this.viewId);
                org.json.JSONObject webPlayerEventSettings = com.unity3d.services.ads.webplayer.WebPlayerSettingsCache.getInstance().getWebPlayerEventSettings(this.viewId);
                if (this.bannerWebPlayerContainer != null) {
                    this.bannerWebPlayerContainer.setWebPlayerSettings(webSettings, webPlayerSettings);
                    this.bannerWebPlayerContainer.setWebPlayerEventSettings(webPlayerEventSettings);
                } else {
                    this.bannerWebPlayerContainer = new com.unity3d.services.banners.view.BannerWebPlayerContainer(this.getContext(), this.viewId, webSettings, webPlayerSettings, webPlayerEventSettings, unityBannerSize);
                    com.unity3d.services.banners.BannerView bannerView = this;
                    bannerView.addView(bannerView.bannerWebPlayerContainer);
                }
            }
        });
    }

    java.lang.String getViewId() {
        return this.viewId;
    }

    private void registerInitializeListener() {
        unregisterInitializeListener();
        this.initializationListener = new com.unity3d.services.core.configuration.IInitializationListener() { // from class: com.unity3d.services.banners.BannerView.3
            @Override // com.unity3d.services.core.configuration.IInitializationListener
            public void onSdkInitialized() {
                this.unregisterInitializeListener();
                this.bridgeLoad();
            }

            @Override // com.unity3d.services.core.configuration.IInitializationListener
            public void onSdkInitializationFailed(java.lang.String str, com.unity3d.services.core.configuration.ErrorState errorState, int i) {
                this.unregisterInitializeListener();
                if (this.getListener() != null) {
                    this.getListener().onBannerFailedToLoad(this, new com.unity3d.services.banners.BannerErrorInfo("UnityAds sdk initialization failed", com.unity3d.services.banners.BannerErrorCode.NATIVE_ERROR));
                }
            }
        };
        com.unity3d.services.core.configuration.InitializationNotificationCenter.getInstance().addListener(this.initializationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterInitializeListener() {
        if (this.initializationListener != null) {
            com.unity3d.services.core.configuration.InitializationNotificationCenter.getInstance().removeListener(this.initializationListener);
        }
        this.initializationListener = null;
    }

    private void setupLayoutParams() {
        setLayoutParams(new android.widget.RelativeLayout.LayoutParams(java.lang.Math.round(com.unity3d.services.core.misc.ViewUtilities.pxFromDp(getContext(), this.size.getWidth())), java.lang.Math.round(com.unity3d.services.core.misc.ViewUtilities.pxFromDp(getContext(), this.size.getHeight()))));
        setGravity(17);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bridgeLoad() {
        com.unity3d.services.banners.bridge.BannerBridge.load(this.placementId, this.viewId, this.size, new com.unity3d.ads.UnityAdsLoadOptions());
    }

    private void bridgeLoad(com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions) {
        java.lang.String objectId;
        if (unityAdsLoadOptions != null && (objectId = unityAdsLoadOptions.getObjectId()) != null) {
            com.unity3d.services.banners.BannerViewCache bannerViewCache = com.unity3d.services.banners.BannerViewCache.getInstance();
            bannerViewCache.removeBannerView(this.viewId);
            this.viewId = objectId;
            bannerViewCache.addBannerView(this);
        }
        com.unity3d.services.banners.bridge.BannerBridge.load(this.placementId, this.viewId, this.size, unityAdsLoadOptions);
    }
}
