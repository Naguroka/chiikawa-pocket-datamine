package com.unity3d.services.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class Connectivity {
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setConnectionMonitoring(java.lang.Boolean bool, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.connectivity.ConnectivityMonitor.setConnectionMonitoring(bool.booleanValue());
        webViewCallback.invoke(new java.lang.Object[0]);
    }
}
