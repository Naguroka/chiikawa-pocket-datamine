package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends android.webkit.WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.view.r f2103a;
    public final /* synthetic */ com.five_corp.ad.internal.logger.a b;

    public o(com.five_corp.ad.internal.view.r rVar, com.five_corp.ad.internal.logger.a aVar) {
        this.f2103a = rVar;
        this.b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        return com.five_corp.ad.internal.view.s.a(android.net.Uri.parse(str), this.f2103a, this.b);
    }
}
