package com.unity3d.services.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class ClassDetection {
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void isMadeWithUnity(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Boolean.valueOf(com.unity3d.services.core.properties.MadeWithUnityDetector.isMadeWithUnity()));
    }
}
