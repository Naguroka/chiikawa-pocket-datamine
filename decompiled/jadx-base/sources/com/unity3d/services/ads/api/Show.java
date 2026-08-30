package com.unity3d.services.ads.api;

/* JADX INFO: loaded from: classes6.dex */
public class Show {
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void sendShowFailedEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.ads.operation.show.ShowModule.getInstance().onUnityAdsShowFailure(str2, com.unity3d.ads.UnityAds.UnityAdsShowError.valueOf(str3), str4);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void sendShowConsentEvent(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.ads.operation.show.ShowModule.getInstance().onUnityAdsShowConsent(str2);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void sendShowStartEvent(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.ads.operation.show.ShowModule.getInstance().onUnityAdsShowStart(str2);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void sendShowClickEvent(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.ads.operation.show.ShowModule.getInstance().onUnityAdsShowClick(str2);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void sendShowCompleteEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.ads.operation.show.ShowModule.getInstance().onUnityAdsShowComplete(str2, com.unity3d.ads.UnityAds.UnityAdsShowCompletionState.valueOf(str3));
        webViewCallback.invoke(new java.lang.Object[0]);
    }
}
