package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ApiHelperForO {
    private ApiHelperForO() {
    }

    public static void setSafeBrowsingEnabled(android.webkit.WebSettings webSettings, boolean z) {
        webSettings.setSafeBrowsingEnabled(z);
    }

    public static boolean getSafeBrowsingEnabled(android.webkit.WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    public static android.webkit.WebViewClient getWebViewClient(android.webkit.WebView webView) {
        return webView.getWebViewClient();
    }

    public static android.webkit.WebChromeClient getWebChromeClient(android.webkit.WebView webView) {
        return webView.getWebChromeClient();
    }

    public static android.content.pm.PackageInfo getCurrentWebViewPackage() {
        return android.webkit.WebView.getCurrentWebViewPackage();
    }
}
