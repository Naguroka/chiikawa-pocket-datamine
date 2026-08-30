package com.iab.omid.library.ironsrc.publisher;

/* JADX INFO: loaded from: classes5.dex */
public class b extends com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher {
    private android.webkit.WebView f;
    private java.lang.Long g = null;
    private final java.util.Map<java.lang.String, com.iab.omid.library.ironsrc.adsession.VerificationScriptResource> h;
    private final java.lang.String i;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.webkit.WebView f2437a;

        a() {
            this.f2437a = com.iab.omid.library.ironsrc.publisher.b.this.f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2437a.destroy();
        }
    }

    public b(java.util.Map<java.lang.String, com.iab.omid.library.ironsrc.adsession.VerificationScriptResource> map, java.lang.String str) {
        this.h = map;
        this.i = str;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.ironsrc.adsession.a aVar, com.iab.omid.library.ironsrc.adsession.AdSessionContext adSessionContext) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Map<java.lang.String, com.iab.omid.library.ironsrc.adsession.VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (java.lang.String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new android.os.Handler().postDelayed(new com.iab.omid.library.ironsrc.publisher.b.a(), java.lang.Math.max(4000 - (this.g == null ? 4000L : java.util.concurrent.TimeUnit.MILLISECONDS.convert(com.iab.omid.library.ironsrc.utils.f.b() - this.g.longValue(), java.util.concurrent.TimeUnit.NANOSECONDS)), 2000L));
        this.f = null;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    void j() {
        android.webkit.WebView webView = new android.webkit.WebView(com.iab.omid.library.ironsrc.internal.f.b().a());
        this.f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f.getSettings().setAllowContentAccess(false);
        a(this.f);
        com.iab.omid.library.ironsrc.internal.g.a().c(this.f, this.i);
        for (java.lang.String str : this.h.keySet()) {
            com.iab.omid.library.ironsrc.internal.g.a().a(this.f, this.h.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.g = java.lang.Long.valueOf(com.iab.omid.library.ironsrc.utils.f.b());
    }
}
