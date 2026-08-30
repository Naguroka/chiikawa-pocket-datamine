package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends android.webkit.WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.view.r f2105a;
    public final /* synthetic */ com.five_corp.ad.internal.logger.a b;

    public q(com.five_corp.ad.internal.view.r rVar, com.five_corp.ad.internal.logger.a aVar) {
        this.f2105a = rVar;
        this.b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(final android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        java.lang.String str = "onRenderProcessGone, didCrash:" + renderProcessGoneDetail.didCrash() + ", rendererPriorityAtExit: " + renderProcessGoneDetail.rendererPriorityAtExit();
        ((com.five_corp.ad.internal.layouter.e) this.f2105a).h.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.O6, str, null, null));
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.view.q$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.five_corp.ad.internal.view.M.a(webView);
            }
        });
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        return com.five_corp.ad.internal.view.s.a(webResourceRequest.getUrl(), this.f2105a, this.b);
    }
}
