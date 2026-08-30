package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class JavaScriptReplyProxyImpl extends androidx.webkit.JavaScriptReplyProxy {
    private org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface mBoundaryInterface;

    public JavaScriptReplyProxyImpl(org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.mBoundaryInterface = jsReplyProxyBoundaryInterface;
    }

    public static androidx.webkit.internal.JavaScriptReplyProxyImpl forInvocationHandler(java.lang.reflect.InvocationHandler invocationHandler) {
        final org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (androidx.webkit.internal.JavaScriptReplyProxyImpl) jsReplyProxyBoundaryInterface.getOrCreatePeer(new java.util.concurrent.Callable<java.lang.Object>() { // from class: androidx.webkit.internal.JavaScriptReplyProxyImpl.1
            @Override // java.util.concurrent.Callable
            public java.lang.Object call() {
                return new androidx.webkit.internal.JavaScriptReplyProxyImpl(jsReplyProxyBoundaryInterface);
            }
        });
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            this.mBoundaryInterface.postMessage(str);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(byte[] bArr) {
        java.util.Objects.requireNonNull(bArr, "ArrayBuffer must be non-null");
        if (androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView()) {
            this.mBoundaryInterface.postMessageWithPayload(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebMessagePayloadAdapter(bArr)));
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
