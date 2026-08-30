package com.unity3d.services.core.webview.bridge.invocation;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewBridgeInvocation implements com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation {
    private static com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback invocationCallback;
    private java.util.concurrent.ExecutorService _executorService;
    private com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker _webViewBridgeInvoker;

    public WebViewBridgeInvocation(java.util.concurrent.ExecutorService executorService, com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker iWebViewBridgeInvoker, com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback iWebViewBridgeInvocationCallback) {
        this._executorService = executorService;
        invocationCallback = iWebViewBridgeInvocationCallback;
        if (iWebViewBridgeInvoker == null) {
            throw new java.lang.IllegalArgumentException("webViewBridgeInvoker cannot be null");
        }
        this._webViewBridgeInvoker = iWebViewBridgeInvoker;
    }

    @Override // com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation
    public synchronized void invoke(java.lang.String str, java.lang.String str2, int i, java.lang.Object... objArr) {
        this._executorService.submit(new com.unity3d.services.core.webview.bridge.invocation.WebViewBridgeInvocationRunnable(invocationCallback, this._webViewBridgeInvoker, str, str2, i, objArr));
    }
}
