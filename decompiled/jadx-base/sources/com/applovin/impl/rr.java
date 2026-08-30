package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class rr extends com.applovin.impl.pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f1235a;
    private java.lang.ref.WeakReference b;

    public interface a {
        void a(android.net.Uri uri, com.applovin.impl.adview.l lVar);

        void a(com.applovin.impl.adview.l lVar);

        void a(com.applovin.impl.adview.l lVar, android.os.Bundle bundle);

        void b(android.net.Uri uri, com.applovin.impl.adview.l lVar);

        void b(com.applovin.impl.adview.l lVar);

        void c(com.applovin.impl.adview.l lVar);

        void d(com.applovin.impl.adview.l lVar);
    }

    public rr(com.applovin.impl.sdk.j jVar) {
        this.f1235a = jVar.I();
    }

    public void a(java.lang.ref.WeakReference weakReference) {
        this.b = weakReference;
    }

    private void a(android.webkit.WebView webView, java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f1235a.d("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str == null || !(webView instanceof com.applovin.impl.adview.l)) {
            return;
        }
        com.applovin.impl.adview.l lVar = (com.applovin.impl.adview.l) webView;
        android.net.Uri uri = android.net.Uri.parse(str);
        java.lang.String scheme = uri.getScheme();
        java.lang.String host = uri.getHost();
        java.lang.String path = uri.getPath();
        com.applovin.impl.rr.a aVar = (com.applovin.impl.rr.a) this.b.get();
        if ("applovin".equalsIgnoreCase(scheme) && com.google.ads.mediation.applovin.AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) && aVar != null) {
            if ("/track_click".equals(path)) {
                aVar.b(lVar);
                return;
            }
            if ("/close_ad".equals(path)) {
                aVar.a(lVar);
                return;
            }
            if ("/skip_ad".equals(path)) {
                aVar.d(lVar);
                return;
            }
            if ("/direct_download".equals(path)) {
                aVar.a(lVar, com.applovin.impl.tp.a(uri));
                return;
            }
            if ("/load_url".equals(path)) {
                aVar.a(uri, lVar);
                return;
            }
            if ("/template_error".equals(path)) {
                aVar.b(uri, lVar);
                return;
            }
            if ("/fully_watched".equals(path)) {
                aVar.c(lVar);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f1235a.k("WebViewButtonClient", "Unknown URL: " + str);
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f1235a.k("WebViewButtonClient", "Path: " + path);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        a(webView, str);
        return true;
    }
}
