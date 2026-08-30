package com.iab.omid.library.applovin.publisher;

/* JADX INFO: loaded from: classes5.dex */
public class b extends com.iab.omid.library.applovin.publisher.AdSessionStatePublisher {
    private android.webkit.WebView g;
    private java.lang.Long h;
    private final java.util.Map<java.lang.String, com.iab.omid.library.applovin.adsession.VerificationScriptResource> i;
    private final java.lang.String j;

    class a extends android.webkit.WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
            android.util.Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (com.iab.omid.library.applovin.publisher.b.this.getWebView() == webView) {
                android.util.Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                com.iab.omid.library.applovin.publisher.b.this.a((android.webkit.WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0215b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.webkit.WebView f2369a;

        RunnableC0215b() {
            this.f2369a = com.iab.omid.library.applovin.publisher.b.this.g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2369a.destroy();
        }
    }

    public b(java.lang.String str, java.util.Map<java.lang.String, com.iab.omid.library.applovin.adsession.VerificationScriptResource> map, java.lang.String str2) {
        super(str);
        this.h = null;
        this.i = map;
        this.j = str2;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new android.os.Handler().postDelayed(new com.iab.omid.library.applovin.publisher.b.RunnableC0215b(), java.lang.Math.max(4000 - (this.h == null ? 4000L : java.util.concurrent.TimeUnit.MILLISECONDS.convert(com.iab.omid.library.applovin.utils.f.b() - this.h.longValue(), java.util.concurrent.TimeUnit.NANOSECONDS)), 2000L));
        this.g = null;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    void j() {
        android.webkit.WebView webView = new android.webkit.WebView(com.iab.omid.library.applovin.internal.g.b().a());
        this.g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.g.getSettings().setAllowContentAccess(false);
        this.g.getSettings().setAllowFileAccess(false);
        this.g.setWebViewClient(new com.iab.omid.library.applovin.publisher.b.a());
        a(this.g);
        com.iab.omid.library.applovin.internal.h.a().c(this.g, this.j);
        for (java.lang.String str : this.i.keySet()) {
            com.iab.omid.library.applovin.internal.h.a().c(this.g, this.i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.h = java.lang.Long.valueOf(com.iab.omid.library.applovin.utils.f.b());
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.applovin.adsession.a aVar, com.iab.omid.library.applovin.adsession.AdSessionContext adSessionContext) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Map<java.lang.String, com.iab.omid.library.applovin.adsession.VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (java.lang.String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.applovin.utils.c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
