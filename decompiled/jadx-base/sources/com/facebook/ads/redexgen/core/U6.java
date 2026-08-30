package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class U6 extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.LJ {
    public boolean A00;
    public final int A01;
    public final com.facebook.ads.redexgen.core.AbstractC0986Rj A02;
    public final boolean A03;
    public final boolean A04;
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A05;
    public final com.facebook.ads.redexgen.core.C1199Zs A06;
    public final com.facebook.ads.redexgen.core.J7 A07;
    public final com.facebook.ads.redexgen.core.LL A08;
    public final com.facebook.ads.redexgen.core.C0842Lv A09;
    public final com.facebook.ads.redexgen.core.MR A0A;
    public final com.facebook.ads.redexgen.core.N9 A0B;
    public final com.facebook.ads.redexgen.core.C0987Rk A0C;

    public abstract void A11();

    public abstract void A12();

    public abstract void A13(boolean z);

    public abstract void A14(boolean z);

    public abstract boolean A15();

    public abstract boolean A16();

    public abstract com.facebook.ads.redexgen.core.Q3 getFullScreenAdStyle();

    public U6(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.N9 n9, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, int i, boolean z, boolean z2, com.facebook.ads.redexgen.core.MR mr) {
        super(c1199Zs);
        this.A09 = new com.facebook.ads.redexgen.core.C0842Lv();
        this.A00 = false;
        this.A02 = new com.facebook.ads.redexgen.core.U7(this);
        this.A01 = i;
        this.A06 = c1199Zs;
        this.A04 = z;
        this.A03 = z2;
        this.A0A = mr;
        this.A0B = n9;
        this.A05 = abstractC1341cD;
        this.A07 = j7;
        this.A0C = new com.facebook.ads.redexgen.core.C0987Rk(this, 1, new java.lang.ref.WeakReference(this.A02), c1199Zs);
        this.A0C.A0W(abstractC1341cD.A0O());
        this.A0C.A0X(abstractC1341cD.A0P());
        this.A08 = com.facebook.ads.redexgen.core.LL.A01(this.A06, this.A05, this);
    }

    public void A0z() {
        this.A08.A0B();
    }

    public final void A10() {
        if (!this.A00) {
            this.A0C.A0U();
            this.A00 = true;
        }
    }

    public void ACa() {
        this.A0A.A4P(this.A05.A0Y());
    }

    public com.facebook.ads.redexgen.core.AbstractC1341cD getAdDataBundle() {
        return this.A05;
    }

    public com.facebook.ads.redexgen.core.C0987Rk getAdViewabilityChecker() {
        return this.A0C;
    }

    public com.facebook.ads.redexgen.core.C0842Lv getTouchDataRecorder() {
        return this.A09;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
