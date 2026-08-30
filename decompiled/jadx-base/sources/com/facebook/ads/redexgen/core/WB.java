package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WB extends com.facebook.ads.redexgen.core.AbstractC0986Rj {
    public static java.lang.String[] A04 = {"hBf0w5eWi1Spl1ubHLZPwgySyKwDkFls", "R1QfRDzVW3llag6pkWHTLJyFxLfuZYUb", "hIMvI", "VChjXPEjBKz9WEtkkyfZeEDOAtDm6pyS", "ZAoFS", "FLKekHrPvHjWwOMiUj748H2wUl", "P5m22x1ZKo3VUkYY2cMyPktUJxi7JgjH", "Nk3fSWmW4cxCKGmv1zm92qMESviF4Rnt"};
    public final /* synthetic */ android.view.View A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1358cU A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.W7 A02;
    public final /* synthetic */ boolean A03;

    public WB(com.facebook.ads.redexgen.core.W7 w7, android.view.View view, boolean z, com.facebook.ads.redexgen.core.C1358cU c1358cU) {
        this.A02 = w7;
        this.A00 = view;
        this.A03 = z;
        this.A01 = c1358cU;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0986Rj
    public final void A00() {
        this.A02.A0e.A06();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0986Rj
    public final void A02() {
        this.A02.A0e.A0A();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0986Rj
    public final void A03() {
        this.A02.A0e.A0B();
        if (com.facebook.ads.redexgen.core.C0762Im.A27(this.A02.A11()) && (this.A00 instanceof com.facebook.ads.internal.api.AdNativeComponentView)) {
            android.view.View adContentsView = ((com.facebook.ads.internal.api.AdNativeComponentView) this.A00).getAdContentsView();
            if ((adContentsView instanceof com.facebook.ads.redexgen.core.C0966Qp) && !((com.facebook.ads.redexgen.core.C0966Qp) adContentsView).A02()) {
                this.A02.A0R.A0T();
                this.A02.A0e.A08();
                return;
            }
        }
        if (this.A03) {
            android.widget.ImageView imageView = (android.widget.ImageView) this.A00;
            android.graphics.drawable.Drawable drawable = this.A02.A01;
            if (drawable == null) {
                this.A02.A0R.A0T();
                this.A02.A0e.A07();
                return;
            }
            com.facebook.ads.redexgen.core.W7.A0e(drawable, imageView);
        }
        this.A02.A0e.A0C(this.A02.A0c, this.A01.A0G());
        if (this.A02.A0R != null) {
            this.A02.A0R.A0V();
        }
        if (this.A02.A0V != null && this.A02.A0V.get() != null) {
            ((com.facebook.ads.redexgen.core.AbstractC0986Rj) this.A02.A0V.get()).A03();
        }
        if (this.A02.A0f.A07()) {
            this.A02.A0e.A04();
            return;
        }
        this.A02.A0b();
        if (this.A02.A09 != null && this.A02.A04 != null) {
            android.view.View view = this.A02.A06;
            if (A04[6].charAt(19) == 'P') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A04;
            strArr[0] = "XqswFkrS2Yg5WXkyCZy0rAQHDfEy407U";
            strArr[3] = "6zRr91flYJNmh2JhyLNuVxqP1ZintOSM";
            if (view != null) {
                this.A02.A09.A08(this.A02.A04);
                this.A02.A09.A07(this.A02.A06);
                this.A02.A09.A0B(this.A02.A0I);
                this.A02.A09.A0E(this.A02.A0W);
                this.A02.A09.A0I(this.A02.A0Z);
                this.A02.A09.A0H(this.A02.A0Y);
                this.A02.A09.A0F(this.A02.A0p());
                this.A02.A09.A09(this.A02.A08);
                this.A02.A09.A0G(this.A02.A0X);
                this.A02.A09.A0A(com.facebook.ads.redexgen.core.NF.A00(this.A02.A07));
                this.A02.A09.A0C(this.A02.A0S);
                this.A02.A09.A0J(this.A03);
                this.A02.A09.A03();
            }
        }
    }
}
