package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends android.webkit.WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.view.r f2104a;
    public final /* synthetic */ com.five_corp.ad.internal.logger.a b;

    public p(com.five_corp.ad.internal.view.r rVar, com.five_corp.ad.internal.logger.a aVar) {
        this.f2104a = rVar;
        this.b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        return com.five_corp.ad.internal.view.s.a(webResourceRequest.getUrl(), this.f2104a, this.b);
    }
}
