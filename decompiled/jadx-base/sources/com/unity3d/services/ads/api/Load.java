package com.unity3d.services.ads.api;

/* JADX INFO: loaded from: classes6.dex */
public class Load {
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void sendAdLoaded(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.ads.operation.load.LoadModule.getInstance().onUnityAdsAdLoaded(str2);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void sendAdFailedToLoad(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.ads.operation.load.LoadModule.getInstance().onUnityAdsFailedToLoad(str2, com.unity3d.ads.UnityAds.UnityAdsLoadError.valueOf(str3), str4);
        webViewCallback.invoke(new java.lang.Object[0]);
    }
}
