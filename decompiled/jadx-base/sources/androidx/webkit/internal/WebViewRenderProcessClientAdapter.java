package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewRenderProcessClientAdapter implements org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface {
    private static final java.lang.String[] sSupportedFeatures = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};
    private final java.util.concurrent.Executor mExecutor;
    private final androidx.webkit.WebViewRenderProcessClient mWebViewRenderProcessClient;

    public WebViewRenderProcessClientAdapter(java.util.concurrent.Executor executor, androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        this.mExecutor = executor;
        this.mWebViewRenderProcessClient = webViewRenderProcessClient;
    }

    public androidx.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient() {
        return this.mWebViewRenderProcessClient;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final java.lang.String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(final android.webkit.WebView webView, java.lang.reflect.InvocationHandler invocationHandler) {
        final androidx.webkit.internal.WebViewRenderProcessImpl webViewRenderProcessImplForInvocationHandler = androidx.webkit.internal.WebViewRenderProcessImpl.forInvocationHandler(invocationHandler);
        final androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient = this.mWebViewRenderProcessClient;
        java.util.concurrent.Executor executor = this.mExecutor;
        if (executor == null) {
            webViewRenderProcessClient.onRenderProcessUnresponsive(webView, webViewRenderProcessImplForInvocationHandler);
        } else {
            executor.execute(new java.lang.Runnable() { // from class: androidx.webkit.internal.WebViewRenderProcessClientAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    webViewRenderProcessClient.onRenderProcessUnresponsive(webView, webViewRenderProcessImplForInvocationHandler);
                }
            });
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(final android.webkit.WebView webView, java.lang.reflect.InvocationHandler invocationHandler) {
        final androidx.webkit.internal.WebViewRenderProcessImpl webViewRenderProcessImplForInvocationHandler = androidx.webkit.internal.WebViewRenderProcessImpl.forInvocationHandler(invocationHandler);
        final androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient = this.mWebViewRenderProcessClient;
        java.util.concurrent.Executor executor = this.mExecutor;
        if (executor == null) {
            webViewRenderProcessClient.onRenderProcessResponsive(webView, webViewRenderProcessImplForInvocationHandler);
        } else {
            executor.execute(new java.lang.Runnable() { // from class: androidx.webkit.internal.WebViewRenderProcessClientAdapter.2
                @Override // java.lang.Runnable
                public void run() {
                    webViewRenderProcessClient.onRenderProcessResponsive(webView, webViewRenderProcessImplForInvocationHandler);
                }
            });
        }
    }
}
