package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class WebMessageListenerAdapter implements org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface {
    private androidx.webkit.WebViewCompat.WebMessageListener mWebMessageListener;

    public WebMessageListenerAdapter(androidx.webkit.WebViewCompat.WebMessageListener webMessageListener) {
        this.mWebMessageListener = webMessageListener;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(android.webkit.WebView webView, java.lang.reflect.InvocationHandler invocationHandler, android.net.Uri uri, boolean z, java.lang.reflect.InvocationHandler invocationHandler2) {
        androidx.webkit.WebMessageCompat webMessageCompatWebMessageCompatFromBoundaryInterface = androidx.webkit.internal.WebMessageAdapter.webMessageCompatFromBoundaryInterface((org.chromium.support_lib_boundary.WebMessageBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class, invocationHandler));
        if (webMessageCompatWebMessageCompatFromBoundaryInterface != null) {
            this.mWebMessageListener.onPostMessage(webView, webMessageCompatWebMessageCompatFromBoundaryInterface, uri, z, androidx.webkit.internal.JavaScriptReplyProxyImpl.forInvocationHandler(invocationHandler2));
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
        return new java.lang.String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }
}
