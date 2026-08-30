package com.unity3d.services.banners.api;

/* JADX INFO: loaded from: classes6.dex */
public class Banner {

    private enum BannerViewType {
        WEB_PLAYER,
        UNKNOWN;

        public static com.unity3d.services.banners.api.Banner.BannerViewType fromString(java.lang.String str) {
            try {
                return valueOf(str);
            } catch (java.lang.IllegalArgumentException unused) {
                return UNKNOWN;
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.banners.api.Banner$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$banners$api$Banner$BannerViewType;

        static {
            int[] iArr = new int[com.unity3d.services.banners.api.Banner.BannerViewType.values().length];
            $SwitchMap$com$unity3d$services$banners$api$Banner$BannerViewType = iArr;
            try {
                iArr[com.unity3d.services.banners.api.Banner.BannerViewType.WEB_PLAYER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$api$Banner$BannerViewType[com.unity3d.services.banners.api.Banner.BannerViewType.UNKNOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void load(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        int i = com.unity3d.services.banners.api.Banner.AnonymousClass1.$SwitchMap$com$unity3d$services$banners$api$Banner$BannerViewType[com.unity3d.services.banners.api.Banner.BannerViewType.fromString(str).ordinal()];
        if (i == 1) {
            com.unity3d.services.ads.operation.load.LoadBannerOperationState bannerOperationState = getBannerOperationState(str2);
            if (bannerOperationState != null) {
                bannerOperationState.setSize(new com.unity3d.services.banners.UnityBannerSize(num.intValue(), num2.intValue()));
                com.unity3d.services.banners.BannerViewCache.getInstance().loadBanner(bannerOperationState);
            }
        } else if (i == 2) {
            com.unity3d.services.ads.operation.load.LoadBannerModule.getInstance().onUnityAdsFailedToLoad(str2, com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "Unknown banner type");
        }
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void loadScar(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, java.lang.Integer num2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.ads.operation.load.LoadBannerOperationState bannerOperationState = getBannerOperationState(str);
        if (bannerOperationState == null) {
            webViewCallback.invoke(new java.lang.Object[0]);
            return;
        }
        bannerOperationState.setSize(new com.unity3d.services.banners.UnityBannerSize(num.intValue(), num2.intValue()));
        bannerOperationState.setScarAdMetadata(new com.unity3d.scar.adapter.common.scarads.ScarAdMetadata(str2, str3, str4, str5, 0));
        com.unity3d.services.banners.BannerViewCache.getInstance().loadBanner(bannerOperationState);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setRefreshRate(java.lang.String str, java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (str != null && num != null) {
            com.unity3d.services.banners.properties.BannerRefreshInfo.getInstance().setRefreshRate(str, num);
        }
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    private static com.unity3d.services.ads.operation.load.LoadBannerOperationState getBannerOperationState(java.lang.String str) {
        com.unity3d.services.ads.operation.load.ILoadOperation iLoadOperation = (com.unity3d.services.ads.operation.load.ILoadOperation) com.unity3d.services.ads.operation.load.LoadBannerModule.getInstance().get(str);
        if (iLoadOperation == null || iLoadOperation.getLoadOperationState() == null) {
            com.unity3d.services.ads.operation.load.LoadBannerModule.getInstance().onUnityAdsFailedToLoad(str, com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "No operation found for requested banner");
            return null;
        }
        com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState = iLoadOperation.getLoadOperationState();
        if (loadOperationState instanceof com.unity3d.services.ads.operation.load.LoadBannerOperationState) {
            return (com.unity3d.services.ads.operation.load.LoadBannerOperationState) loadOperationState;
        }
        com.unity3d.services.ads.operation.load.LoadBannerModule.getInstance().onUnityAdsFailedToLoad(str, com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "Operation state found is not for banner ad");
        return null;
    }
}
