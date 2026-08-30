package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0907Oi extends android.widget.RelativeLayout {
    public static final int A07 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
    public static final int A08 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 28.0f);
    public com.facebook.ads.redexgen.core.C1O A00;
    public boolean A01;
    public final com.facebook.ads.redexgen.core.C1199Zs A02;
    public final com.facebook.ads.redexgen.core.J7 A03;
    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui A04;
    public final com.facebook.ads.redexgen.core.C0899Oa A05;
    public final com.facebook.ads.redexgen.core.C0911Om A06;

    public abstract boolean A11();

    public AbstractC0907Oi(com.facebook.ads.redexgen.core.C0911Om c0911Om, boolean z) {
        com.facebook.ads.redexgen.core.C1O c1oA00;
        super(c0911Om.A05());
        this.A06 = c0911Om;
        this.A02 = c0911Om.A05();
        this.A03 = c0911Om.A06();
        if (c0911Om.A00() == 1) {
            c1oA00 = c0911Om.A04().A1O().A01();
        } else {
            c1oA00 = c0911Om.A04().A1O().A00();
        }
        this.A00 = c1oA00;
        this.A01 = z;
        this.A04 = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui(c0911Om.A05(), c0911Om.A04(), this.A00, c0911Om.A06(), c0911Om.A0A(), c0911Om.A0C(), c0911Om.A08(), c0911Om.A07());
        this.A04.setRoundedCornersEnabled(A00());
        this.A04.setViewShowsOverMedia(A0C());
        com.facebook.ads.redexgen.core.M3.A0G(1001, this.A04);
        this.A05 = new com.facebook.ads.redexgen.core.C0899Oa(this.A02, this.A00, this.A01, A01(), A02());
        com.facebook.ads.redexgen.core.M3.A0K(this.A05);
    }

    public boolean A00() {
        return true;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public boolean A0C() {
        return true;
    }

    public void A0D(com.facebook.ads.redexgen.core.C9R c9r) {
    }

    public void A0E(com.facebook.ads.redexgen.core.C9O c9o) {
    }

    public void A0v() {
    }

    public void A0w() {
    }

    public void A0x() {
    }

    public void A0y() {
    }

    public void A0z() {
    }

    public void A10(com.facebook.ads.redexgen.core.C1F c1f, java.lang.String str, double d, android.os.Bundle bundle) {
        this.A05.A03(c1f.A0F().A07(), c1f.A0F().A02(), null, false, !A11() && d > 0.0d && d < 1.0d);
        this.A04.setCta(c1f.A0G(), str, new java.util.HashMap());
    }

    public boolean A12(boolean z) {
        return false;
    }

    public com.facebook.ads.redexgen.core.C1199Zs getAdContextWrapper() {
        return this.A02;
    }

    public com.facebook.ads.redexgen.core.J7 getAdEventManager() {
        return this.A03;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public com.facebook.ads.redexgen.core.C1O getColors() {
        return this.A00;
    }

    public com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui getCtaButton() {
        return this.A04;
    }

    public com.facebook.ads.redexgen.core.C0899Oa getTitleDescContainer() {
        return this.A05;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.facebook.ads.redexgen.core.C1O c1oA00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            c1oA00 = this.A06.A04().A1O().A01();
        } else {
            c1oA00 = this.A06.A04().A1O().A00();
        }
        this.A00 = c1oA00;
        this.A04.setViewShowsOverMedia(A0C());
        this.A04.setUpButtonColors(this.A00);
        this.A05.A02(this.A00, this.A01);
    }
}
