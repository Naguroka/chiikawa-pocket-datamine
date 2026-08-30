package com.unity3d.services.banners.api;

/* JADX INFO: loaded from: classes6.dex */
public class BannerListener {
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void sendLoadEvent(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.banners.BannerViewCache.getInstance().triggerBannerLoadEvent(str);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void sendShowEvent(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.banners.BannerViewCache.getInstance().triggerBannerShowEvent(str);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void sendClickEvent(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.banners.BannerViewCache.getInstance().triggerBannerClickEvent(str);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void sendErrorEvent(java.lang.String str, java.lang.Integer num, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.banners.BannerViewCache.getInstance().triggerBannerErrorEvent(str, new com.unity3d.services.banners.BannerErrorInfo(str2, com.unity3d.services.banners.BannerErrorCode.values()[num.intValue()]));
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void sendLeaveApplicationEvent(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.banners.BannerViewCache.getInstance().triggerBannerLeftApplicationEvent(str);
        webViewCallback.invoke(new java.lang.Object[0]);
    }
}
