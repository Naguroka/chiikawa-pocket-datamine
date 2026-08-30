package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ApiHelperForQ {
    private ApiHelperForQ() {
    }

    @java.lang.Deprecated
    public static void setForceDark(android.webkit.WebSettings webSettings, int i) {
        webSettings.setForceDark(i);
    }

    @java.lang.Deprecated
    public static int getForceDark(android.webkit.WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    public static android.webkit.WebViewRenderProcess getWebViewRenderProcess(android.webkit.WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    public static boolean terminate(android.webkit.WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }

    public static void setWebViewRenderProcessClient(android.webkit.WebView webView, java.util.concurrent.Executor executor, androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        webView.setWebViewRenderProcessClient(executor, webViewRenderProcessClient != null ? new androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter(webViewRenderProcessClient) : null);
    }

    public static void setWebViewRenderProcessClient(android.webkit.WebView webView, androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        webView.setWebViewRenderProcessClient(webViewRenderProcessClient != null ? new androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter(webViewRenderProcessClient) : null);
    }

    public static android.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient(android.webkit.WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }
}
