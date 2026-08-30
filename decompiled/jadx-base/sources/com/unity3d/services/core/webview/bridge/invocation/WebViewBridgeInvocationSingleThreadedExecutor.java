package com.unity3d.services.core.webview.bridge.invocation;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewBridgeInvocationSingleThreadedExecutor {
    private static com.unity3d.services.core.webview.bridge.invocation.WebViewBridgeInvocationSingleThreadedExecutor instance;
    private java.util.concurrent.ExecutorService _ExecutorService = java.util.concurrent.Executors.newSingleThreadExecutor();

    public static com.unity3d.services.core.webview.bridge.invocation.WebViewBridgeInvocationSingleThreadedExecutor getInstance() {
        if (instance == null) {
            instance = new com.unity3d.services.core.webview.bridge.invocation.WebViewBridgeInvocationSingleThreadedExecutor();
        }
        return instance;
    }

    private WebViewBridgeInvocationSingleThreadedExecutor() {
    }

    public java.util.concurrent.ExecutorService getExecutorService() {
        return this._ExecutorService;
    }
}
