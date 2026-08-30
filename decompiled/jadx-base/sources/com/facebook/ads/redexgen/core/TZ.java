package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TZ extends android.widget.FrameLayout implements com.facebook.ads.redexgen.core.MS {
    public static final android.widget.RelativeLayout.LayoutParams A0B = new android.widget.RelativeLayout.LayoutParams(-1, -1);
    public com.facebook.ads.redexgen.core.C5Q A00;
    public android.content.Intent A01;
    public android.os.Bundle A02;
    public com.facebook.ads.redexgen.core.MS A03;
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A04;
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A05;
    public final com.facebook.ads.redexgen.core.C5Q A06;
    public final com.facebook.ads.redexgen.core.C1199Zs A07;
    public final com.facebook.ads.redexgen.core.J7 A08;
    public final com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC0837Lq A09;
    public final com.facebook.ads.redexgen.core.MR A0A;

    public TZ(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD2, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.C5Q c5q) {
        super(c1199Zs);
        this.A07 = c1199Zs;
        this.A08 = j7;
        this.A05 = abstractC1341cD;
        this.A04 = abstractC1341cD2;
        this.A0A = mr;
        this.A06 = c5q;
        this.A09 = new com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC0837Lq(this);
        this.A09.A05(com.facebook.ads.redexgen.core.EnumC0836Lp.A02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.ads.redexgen.core.VA A05() {
        return new com.facebook.ads.redexgen.core.VA(this.A07, this.A08, new com.facebook.ads.redexgen.core.Ej(this.A06), this.A04, this.A04.A0m(), new com.facebook.ads.redexgen.core.V5(), true);
    }

    private com.facebook.ads.redexgen.core.C05379a A06() {
        if (this.A04.A1P().A0E().A06() != null) {
            this.A05.A0y(this.A04.A1P().A0E().A06().A0M());
            this.A05.A0z(this.A04.A1P().A0E().A06().A0O());
        }
        com.facebook.ads.redexgen.core.C05379a c05379a = new com.facebook.ads.redexgen.core.C05379a(this.A07, new com.facebook.ads.redexgen.core.V5(), this.A08, this.A05, new com.facebook.ads.redexgen.core.C04766f(this.A07), new com.facebook.ads.redexgen.core.Ej(this.A06));
        c05379a.setVideoLeadingPlayableAdListener(new com.facebook.ads.redexgen.core.C1029Ta(this));
        return c05379a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A03 != null) {
            this.A03.onDestroy();
            if (this.A03 instanceof android.view.View) {
                removeView((android.view.View) this.A03);
            }
        }
    }

    private final void A08(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C5Q c5q) {
        this.A03 = A06();
        this.A03.A9q(intent, bundle, c5q);
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void A9q(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C5Q c5q) {
        this.A01 = intent;
        this.A02 = bundle;
        this.A00 = c5q;
        this.A0A.A3q(this, A0B);
        A08(intent, bundle, c5q);
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ACz(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ADN(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void AFx(android.os.Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public java.lang.String getCurrentClientToken() {
        return this.A05.A1U();
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void onDestroy() {
    }

    public void setListener(com.facebook.ads.redexgen.core.MR mr) {
    }
}
