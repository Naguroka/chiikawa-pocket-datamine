package com.unity3d.services.banners.bridge;

/* JADX INFO: loaded from: classes6.dex */
public class BannerBridge {

    public enum BannerEvent {
        BANNER_VISIBILITY_CHANGED,
        BANNER_RESIZED,
        BANNER_LOADED,
        BANNER_DESTROYED,
        BANNER_ATTACHED,
        BANNER_DETACHED,
        BANNER_LOAD_PLACEMENT,
        BANNER_DESTROY_BANNER,
        SCAR_BANNER_LOADED,
        SCAR_BANNER_LOAD_FAILED,
        SCAR_BANNER_ATTACHED,
        SCAR_BANNER_DETACHED,
        SCAR_BANNER_OPENED,
        SCAR_BANNER_CLOSED,
        SCAR_BANNER_IMPRESSION,
        SCAR_BANNER_CLICKED
    }

    public static void load(java.lang.String str, java.lang.String str2, com.unity3d.services.banners.UnityBannerSize unityBannerSize) {
        com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.BANNER_LOAD_PLACEMENT, str, str2, java.lang.Integer.valueOf(unityBannerSize.getWidth()), java.lang.Integer.valueOf(unityBannerSize.getHeight()));
            return;
        }
        com.unity3d.services.banners.BannerView bannerView = com.unity3d.services.banners.BannerViewCache.getInstance().getBannerView(str2);
        if (bannerView == null || bannerView.getListener() == null) {
            return;
        }
        bannerView.getListener().onBannerFailedToLoad(bannerView, new com.unity3d.services.banners.BannerErrorInfo("WebViewApp was not available, this is likely because UnityAds has not been initialized", com.unity3d.services.banners.BannerErrorCode.WEBVIEW_ERROR));
    }

    public static void load(java.lang.String str, final java.lang.String str2, com.unity3d.services.banners.UnityBannerSize unityBannerSize, final com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions) {
        final com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender = (com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class);
        final java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<java.lang.String, java.lang.String>(isHeaderBidding(unityAdsLoadOptions.getData())) { // from class: com.unity3d.services.banners.bridge.BannerBridge.1
            final /* synthetic */ boolean val$isHB;

            {
                this.val$isHB = z;
                put("is_header_bidding", java.lang.String.valueOf(z));
            }
        };
        final com.unity3d.services.banners.BannerView bannerView = com.unity3d.services.banners.BannerViewCache.getInstance().getBannerView(str2);
        if (bannerView == null) {
            sDKMetricsSender.sendMetricWithInitState(new com.unity3d.services.core.request.metrics.Metric("native_banner_load_not_found", null, map));
            return;
        }
        final boolean zInvoke = ((com.unity3d.ads.core.configuration.AlternativeFlowReader) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.ads.core.configuration.AlternativeFlowReader.class)).invoke();
        boolean z = unityAdsLoadOptions.getObjectId() != null;
        if (zInvoke && !z) {
            unityAdsLoadOptions.setObjectId(str2);
        }
        final com.unity3d.services.banners.BannerView.IListener listener = bannerView.getListener();
        com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener = new com.unity3d.ads.IUnityAdsLoadListener() { // from class: com.unity3d.services.banners.bridge.BannerBridge.2
            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(java.lang.String str3) {
                if (listener == null) {
                    sDKMetricsSender.sendMetricWithInitState(new com.unity3d.services.core.request.metrics.Metric("native_banner_listener_loaded_not_found", null, map));
                }
                if (zInvoke) {
                    com.unity3d.services.banners.BannerView.IListener iListener = listener;
                    if (iListener != null) {
                        iListener.onBannerLoaded(bannerView);
                    }
                    com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions = new com.unity3d.ads.UnityAdsShowOptions();
                    unityAdsShowOptions.setObjectId(unityAdsLoadOptions.getObjectId());
                    com.unity3d.services.UnityAdsSDK.INSTANCE.show(str3, unityAdsShowOptions, new com.unity3d.ads.core.data.model.Listeners() { // from class: com.unity3d.services.banners.bridge.BannerBridge.2.1
                        @Override // com.unity3d.ads.core.data.model.Listeners
                        public void onComplete(java.lang.String str4, com.unity3d.ads.UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                        }

                        @Override // com.unity3d.ads.core.data.model.Listeners
                        public void onError(java.lang.String str4, com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str5) {
                        }

                        @Override // com.unity3d.ads.core.data.model.Listeners
                        public void onLeftApplication(java.lang.String str4) {
                            if (listener != null) {
                                listener.onBannerLeftApplication(bannerView);
                            }
                        }

                        @Override // com.unity3d.ads.core.data.model.Listeners
                        public void onClick(java.lang.String str4) {
                            if (listener != null) {
                                listener.onBannerClick(bannerView);
                            }
                        }

                        @Override // com.unity3d.ads.core.data.model.Listeners
                        public void onStart(java.lang.String str4) {
                            if (listener != null) {
                                listener.onBannerShown(bannerView);
                            }
                        }
                    });
                }
            }

            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(java.lang.String str3, com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, java.lang.String str4) {
                com.unity3d.services.banners.BannerView bannerView2 = com.unity3d.services.banners.BannerViewCache.getInstance().getBannerView(str2);
                if (bannerView2 == null || bannerView2.getListener() == null) {
                    sDKMetricsSender.sendMetricWithInitState(new com.unity3d.services.core.request.metrics.Metric("native_banner_listener_load_fail_not_found", null, map));
                } else {
                    bannerView2.getListener().onBannerFailedToLoad(bannerView2, com.unity3d.services.banners.BannerErrorInfo.fromLoadError(unityAdsLoadError, str4));
                }
            }
        };
        if (zInvoke) {
            com.unity3d.services.UnityAdsSDK.INSTANCE.load(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize);
        } else {
            com.unity3d.services.ads.operation.load.LoadBannerModule.getInstance().executeAdOperation(new com.unity3d.services.core.webview.bridge.WebViewBridgeInvoker(), new com.unity3d.services.ads.operation.load.LoadBannerOperationState(str, str2, unityBannerSize, iUnityAdsLoadListener, unityAdsLoadOptions, new com.unity3d.services.core.configuration.ConfigurationReader().getCurrentConfiguration()));
        }
    }

    private static boolean isHeaderBidding(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has("adMarkup");
    }

    public static void destroy(java.lang.String str) {
        com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.BANNER_DESTROY_BANNER, str);
        }
    }

    public static void resize(java.lang.String str, int i, int i2, int i3, int i4, float f) {
        com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.BANNER_RESIZED, str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Float.valueOf(f));
        }
    }

    public static void visibilityChanged(java.lang.String str, int i) {
        com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.BANNER_VISIBILITY_CHANGED, str, java.lang.Integer.valueOf(i));
        }
    }

    public static void didLoad(java.lang.String str) {
        com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.BANNER_LOADED, str);
        }
    }

    public static void didDestroy(java.lang.String str) {
        com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.BANNER_DESTROYED, str);
        }
    }

    public static void didAttach(java.lang.String str) {
        com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.BANNER_ATTACHED, str);
        }
    }

    public static void didDetach(java.lang.String str) {
        com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.BANNER_DETACHED, str);
        }
    }

    public static void didAttachScarBanner(java.lang.String str) {
        com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.SCAR_BANNER_ATTACHED, str);
        }
    }

    public static void didDetachScarBanner(java.lang.String str) {
        com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.SCAR_BANNER_DETACHED, str);
        }
    }
}
