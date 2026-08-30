package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class ug extends android.webkit.WebViewClient {
    private static final java.lang.String b = "ug";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.ironsource.qh.a f3469a;

    public ug(com.ironsource.qh.a aVar) {
        this.f3469a = aVar;
    }

    private java.lang.String a(java.lang.String str, java.lang.String str2) {
        return "ISNAdViewWebClient | External Adunit failed to load." + str + " Status code: " + str2;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        try {
            this.f3469a.a(a("onReceivedError", java.lang.String.valueOf(i)));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        try {
            this.f3469a.a(a("onReceivedErrorM", java.lang.String.valueOf(webResourceError.getErrorCode())));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        try {
            this.f3469a.a(a("onReceivedHttpError", java.lang.String.valueOf(webResourceResponse.getStatusCode())));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.json.sdk.utils.Logger.e(b, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            this.f3469a.b(renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system");
            return true;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return true;
        }
    }
}
