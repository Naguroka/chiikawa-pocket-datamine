package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewRenderProcessClientFrameworkAdapter extends android.webkit.WebViewRenderProcessClient {
    private androidx.webkit.WebViewRenderProcessClient mWebViewRenderProcessClient;

    public WebViewRenderProcessClientFrameworkAdapter(androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        this.mWebViewRenderProcessClient = webViewRenderProcessClient;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessUnresponsive(android.webkit.WebView webView, android.webkit.WebViewRenderProcess webViewRenderProcess) {
        this.mWebViewRenderProcessClient.onRenderProcessUnresponsive(webView, androidx.webkit.internal.WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess));
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessResponsive(android.webkit.WebView webView, android.webkit.WebViewRenderProcess webViewRenderProcess) {
        this.mWebViewRenderProcessClient.onRenderProcessResponsive(webView, androidx.webkit.internal.WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess));
    }

    public androidx.webkit.WebViewRenderProcessClient getFrameworkRenderProcessClient() {
        return this.mWebViewRenderProcessClient;
    }
}
