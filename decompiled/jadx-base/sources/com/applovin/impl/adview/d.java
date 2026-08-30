package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f607a;
    private final android.webkit.WebViewRenderProcessClient b = new com.applovin.impl.adview.d.a();

    class a extends android.webkit.WebViewRenderProcessClient {
        a() {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(android.webkit.WebView webView, android.webkit.WebViewRenderProcess webViewRenderProcess) {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(android.webkit.WebView webView, android.webkit.WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof com.applovin.impl.adview.b) {
                com.applovin.impl.sdk.ad.b currentAd = ((com.applovin.impl.adview.b) webView).getCurrentAd();
                com.applovin.impl.adview.d.this.f607a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.adview.d.this.f607a.I().b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    }

    d(com.applovin.impl.sdk.j jVar) {
        this.f607a = jVar;
    }

    android.webkit.WebViewRenderProcessClient a() {
        return this.b;
    }
}
