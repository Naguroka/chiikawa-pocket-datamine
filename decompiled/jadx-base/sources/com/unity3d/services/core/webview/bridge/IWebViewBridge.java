package com.unity3d.services.core.webview.bridge;

/* JADX INFO: compiled from: IWebViewBridge.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bH&¢\u0006\u0002\u0010\tJ=\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;", "", "handleCallback", "", "callbackId", "", "callbackStatus", "parameters", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "handleInvocation", "className", "methodName", "callback", "Lcom/unity3d/services/core/webview/bridge/WebViewCallback;", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lcom/unity3d/services/core/webview/bridge/WebViewCallback;)V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IWebViewBridge {
    void handleCallback(java.lang.String callbackId, java.lang.String callbackStatus, java.lang.Object[] parameters) throws java.lang.Exception;

    void handleInvocation(java.lang.String className, java.lang.String methodName, java.lang.Object[] parameters, com.unity3d.services.core.webview.bridge.WebViewCallback callback) throws java.lang.Exception;
}
