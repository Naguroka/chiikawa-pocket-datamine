package com.unity3d.services.core.webview.bridge;

/* JADX INFO: compiled from: WebViewBridgeInterface.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0007J.\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J.\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;", "", "webViewBridge", "Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;", "webViewAppInvocationCallbackInvoker", "Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;", "(Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;)V", "handleCallback", "", "callbackId", "", "callbackStatus", "rawParameters", "handleInvocation", "data", "onHandleCallback", "view", "Landroid/webkit/WebView;", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "Landroidx/webkit/WebMessageCompat;", "sourceOrigin", "Landroid/net/Uri;", "isMainFrame", "", "replyProxy", "Landroidx/webkit/JavaScriptReplyProxy;", "onHandleInvocation", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebViewBridgeInterface {
    private final com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker;
    private final com.unity3d.services.core.webview.bridge.IWebViewBridge webViewBridge;

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewBridgeInterface() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public WebViewBridgeInterface(com.unity3d.services.core.webview.bridge.IWebViewBridge webViewBridge, com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewBridge, "webViewBridge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewAppInvocationCallbackInvoker, "webViewAppInvocationCallbackInvoker");
        this.webViewBridge = webViewBridge;
        this.webViewAppInvocationCallbackInvoker = webViewAppInvocationCallbackInvoker;
    }

    public /* synthetic */ WebViewBridgeInterface(com.unity3d.services.core.webview.bridge.IWebViewBridge iWebViewBridge, com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker iInvocationCallbackInvoker, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i & 2) != 0 ? com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker);
    }

    @android.webkit.JavascriptInterface
    public final void handleInvocation(java.lang.String data) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        com.unity3d.services.core.log.DeviceLog.debug("handleInvocation " + data);
        org.json.JSONArray jSONArray = new org.json.JSONArray(data);
        com.unity3d.services.core.webview.bridge.Invocation invocation = new com.unity3d.services.core.webview.bridge.Invocation(this.webViewAppInvocationCallbackInvoker, this.webViewBridge);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            java.lang.Object obj = jSONArray.get(i);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
            org.json.JSONArray jSONArray2 = (org.json.JSONArray) obj;
            java.lang.Object obj2 = jSONArray2.get(0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj3 = jSONArray2.get(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj4 = jSONArray2.get(2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            java.lang.Object obj5 = jSONArray2.get(3);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
            invocation.addInvocation((java.lang.String) obj2, (java.lang.String) obj3, com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray((org.json.JSONArray) obj4), new com.unity3d.services.core.webview.bridge.WebViewCallback((java.lang.String) obj5, invocation.getId()));
            invocation.nextInvocation();
        }
        invocation.sendInvocationCallback();
    }

    @android.webkit.JavascriptInterface
    public final void handleCallback(java.lang.String callbackId, java.lang.String callbackStatus, java.lang.String rawParameters) throws java.lang.Exception {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackStatus, "callbackStatus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawParameters, "rawParameters");
        com.unity3d.services.core.log.DeviceLog.debug("handleCallback " + callbackId + ' ' + callbackStatus + ' ' + rawParameters);
        this.webViewBridge.handleCallback(callbackId, callbackStatus, com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(new org.json.JSONArray(rawParameters)));
    }

    public final void onHandleInvocation(android.webkit.WebView view, androidx.webkit.WebMessageCompat message, android.net.Uri sourceOrigin, boolean isMainFrame, androidx.webkit.JavaScriptReplyProxy replyProxy) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceOrigin, "sourceOrigin");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replyProxy, "replyProxy");
        java.lang.String data = message.getData();
        if (isMainFrame) {
            java.lang.String str = data;
            if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                return;
            }
            handleInvocation(data);
        }
    }

    public final void onHandleCallback(android.webkit.WebView view, androidx.webkit.WebMessageCompat message, android.net.Uri sourceOrigin, boolean isMainFrame, androidx.webkit.JavaScriptReplyProxy replyProxy) throws java.lang.Exception {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceOrigin, "sourceOrigin");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replyProxy, "replyProxy");
        java.lang.String data = message.getData();
        if (isMainFrame) {
            java.lang.String str = data;
            if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(data);
            java.lang.String callbackId = jSONObject.getString("id");
            java.lang.String callbackStatus = jSONObject.getString("status");
            java.lang.String rawParameters = jSONObject.getString("parameters");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(callbackId, "callbackId");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(callbackStatus, "callbackStatus");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rawParameters, "rawParameters");
            handleCallback(callbackId, callbackStatus, rawParameters);
        }
    }
}
