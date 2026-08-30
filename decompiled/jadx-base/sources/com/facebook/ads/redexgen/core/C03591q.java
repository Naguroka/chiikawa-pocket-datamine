package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C03591q extends android.webkit.WebViewClient {
    public boolean A00 = false;
    public final com.facebook.ads.redexgen.core.C03441b A01;
    public final com.facebook.ads.redexgen.core.InterfaceC03581p A02;
    public final boolean A03;

    public C03591q(com.facebook.ads.redexgen.core.C03441b c03441b, com.facebook.ads.redexgen.core.InterfaceC03581p interfaceC03581p, boolean z) {
        this.A01 = c03441b;
        this.A02 = interfaceC03581p;
        this.A03 = z;
    }

    private void A00() {
        if (this.A03) {
            this.A02.AD2(com.facebook.ads.AdError.CACHE_ERROR);
        } else {
            A01();
        }
    }

    private void A01() {
        if (this.A02 != null) {
            this.A02.AD3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        new android.os.Handler().postDelayed(new com.facebook.ads.redexgen.core.C1327bz(this), this.A01.A09());
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        this.A00 = true;
        A01();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        A03();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        this.A00 = true;
        A02();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        com.facebook.ads.redexgen.core.AbstractC0897Ny.A02(com.facebook.ads.redexgen.core.C8E.A2g);
        A00();
        return true;
    }
}
