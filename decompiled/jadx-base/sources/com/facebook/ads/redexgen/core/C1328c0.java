package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1328c0 implements com.facebook.ads.redexgen.core.C6X {
    public final com.facebook.ads.redexgen.core.C03441b A00;
    public final com.facebook.ads.redexgen.core.InterfaceC03581p A01;
    public final com.facebook.ads.redexgen.core.C04766f A02;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;
    public final boolean A04;

    public C1328c0(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.InterfaceC03581p interfaceC03581p, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.C03441b c03441b, boolean z) {
        this.A03 = c1199Zs;
        this.A01 = interfaceC03581p;
        this.A02 = c04766f;
        this.A00 = c03441b;
        this.A04 = z;
    }

    private final void A00() {
        android.webkit.WebView webView = new android.webkit.WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        com.facebook.ads.redexgen.core.C03591q playableWebViewClient = new com.facebook.ads.redexgen.core.C03591q(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0F());
        playableWebViewClient.A03();
    }

    private void A01(boolean z) {
        if (this.A00.A0A() == com.facebook.ads.redexgen.core.EnumC03451c.A05) {
            A00();
            return;
        }
        java.lang.String strA0F = this.A00.A0F();
        if (z) {
            com.facebook.ads.redexgen.core.C04766f c04766f = this.A02;
            java.lang.String markupUrlResult = this.A00.A0F();
            strA0F = c04766f.A0R(markupUrlResult);
        }
        this.A00.A0K(strA0F);
        this.A01.AD3();
    }

    @Override // com.facebook.ads.redexgen.core.C6X
    public final void ABT() {
        if (this.A04) {
            this.A01.AD2(com.facebook.ads.AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C6X
    public final void ABc() {
        A01(true);
    }
}
