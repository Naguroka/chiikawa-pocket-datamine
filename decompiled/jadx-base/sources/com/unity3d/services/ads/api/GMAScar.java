package com.unity3d.services.ads.api;

/* JADX INFO: loaded from: classes6.dex */
public class GMAScar {
    private static final com.unity3d.services.ads.gmascar.GMAScarAdapterBridge gmaScarAdapterBridge = com.unity3d.services.ads.gmascar.GMA.getInstance().getBridge();

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void initializeScar(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        gmaScarAdapterBridge.initializeScar();
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getVersion(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        gmaScarAdapterBridge.getVersion();
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    public static void isInitialized(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        gmaScarAdapterBridge.isInitialized();
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getSCARSignal(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        gmaScarAdapterBridge.getSCARSignal(str, com.unity3d.scar.adapter.common.scarads.UnityAdFormat.valueOf(str2.toUpperCase()));
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void load(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3, java.lang.String str4, java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        gmaScarAdapterBridge.load(bool.booleanValue(), str, str2, str4, str3, num.intValue());
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void show(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        gmaScarAdapterBridge.show(str, str2, bool.booleanValue());
        webViewCallback.invoke(new java.lang.Object[0]);
    }
}
