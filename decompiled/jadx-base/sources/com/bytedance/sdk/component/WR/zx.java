package com.bytedance.sdk.component.WR;

/* JADX INFO: loaded from: classes3.dex */
public class zx extends android.webkit.WebViewClient {
    private final com.bytedance.sdk.component.WR.bg.InterfaceC0101bg IL;
    private final java.util.List<java.lang.String> bX;
    private final android.webkit.WebViewClient bg;

    public zx(com.bytedance.sdk.component.WR.bg.InterfaceC0101bg interfaceC0101bg, android.webkit.WebViewClient webViewClient, java.util.List<java.lang.String> list) {
        this.IL = interfaceC0101bg;
        this.bg = webViewClient;
        this.bX = list;
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        return this.bg.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        com.bytedance.sdk.component.WR.bg.InterfaceC0101bg interfaceC0101bg;
        if (com.bytedance.sdk.component.WR.IL.bg(this.bX, webResourceRequest.getUrl().toString()) && (interfaceC0101bg = this.IL) != null) {
            interfaceC0101bg.bg();
        }
        return this.bg.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        com.bytedance.sdk.component.WR.bg.InterfaceC0101bg interfaceC0101bg = this.IL;
        if (interfaceC0101bg != null) {
            interfaceC0101bg.bg();
        }
        return this.bg.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        this.bg.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.bytedance.sdk.component.WR.bg.InterfaceC0101bg interfaceC0101bg = this.IL;
        if (interfaceC0101bg != null) {
            interfaceC0101bg.bg(bg(webView));
        }
        this.bg.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        this.bg.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        this.bg.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        this.bg.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        this.bg.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return this.bg.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    private int bg(android.webkit.WebView webView) {
        try {
            android.webkit.WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                return webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
            }
            return -1;
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }
}
