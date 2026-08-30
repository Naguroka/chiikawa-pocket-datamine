package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class B8 extends com.facebook.ads.redexgen.core.U6 {
    public static final android.widget.RelativeLayout.LayoutParams A07 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
    public com.facebook.ads.redexgen.core.LH A00;
    public com.facebook.ads.redexgen.core.AbstractC0907Oi A01;
    public final int A02;
    public final android.widget.ImageView A03;
    public final com.facebook.ads.redexgen.core.MQ A04;
    public final com.facebook.ads.redexgen.core.Q4 A05;
    public final java.util.concurrent.atomic.AtomicBoolean A06;

    public B8(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.N9 n9, int i, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.internal.view.FullScreenAdToolbar fullScreenAdToolbar, boolean z, boolean z2, com.facebook.ads.redexgen.core.Q4 q4, int i2) {
        super(c1199Zs, n9, j7, abstractC1341cD, i, z, z2, mr);
        this.A06 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A02 = i2;
        this.A05 = q4;
        this.A03 = new android.widget.ImageView(getContext());
        this.A04 = fullScreenAdToolbar;
        this.A03.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.A03.setAdjustViewBounds(true);
        new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A03, c1199Zs).A05(abstractC1341cD.A1P().A0E().A00(), abstractC1341cD.A1P().A0E().A01()).A06(new com.facebook.ads.redexgen.core.U5(this)).A07(abstractC1341cD.A1P().A0E().A07());
        A05(c1199Zs.getResources().getConfiguration().orientation);
    }

    private com.facebook.ads.redexgen.core.AbstractC0907Oi A01(int i) {
        if (this.A03.getParent() != null) {
            com.facebook.ads.redexgen.core.M3.A0J(this.A03);
        }
        return com.facebook.ads.redexgen.core.AbstractC0908Oj.A00(new com.facebook.ads.redexgen.core.C0910Ol(super.A06, this.A07, this.A0A, super.A05, this.A03, this.A0C, this.A09).A0F(this.A04.getToolbarHeight()).A0J(this.A04).A0E(i).A0L(i != 2).A0M(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A06.get()) {
            A10();
        }
    }

    private void A05(int i) {
        com.facebook.ads.redexgen.core.M3.A0J(this.A01);
        this.A01 = A01(i);
        addView(this.A01, 0, A07);
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final void A0z() {
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(super.A06)) {
            super.A06.A0A().AHC(this.A03);
        }
        if (this.A01 != null) {
            this.A01.A0v();
        }
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final void A11() {
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final void A12() {
        if (this.A02 > 0) {
            this.A00 = new com.facebook.ads.redexgen.core.LH(this.A02, 100.0f, 100L, new android.os.Handler(android.os.Looper.getMainLooper()), new com.facebook.ads.redexgen.core.U4(this));
            this.A00.A07();
        } else {
            this.A05.ADa(false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final void A13(boolean z) {
        if (this.A00 != null && this.A00.A05()) {
            this.A00.A06();
        }
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final void A14(boolean z) {
        if (this.A00 != null && !this.A00.A04()) {
            this.A00.A07();
        }
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final boolean A15() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final boolean A16() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public com.facebook.ads.redexgen.core.Q3 getFullScreenAdStyle() {
        com.facebook.ads.redexgen.core.C1O colors = this.A01.getColors();
        return new com.facebook.ads.redexgen.core.Q3(this.A01.A11(), com.facebook.ads.redexgen.core.Q3.A07, colors, com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui.A08(super.A05), colors.A07(this.A01.A11() || (this.A01 instanceof com.facebook.ads.redexgen.core.AbstractC1058Ud)), null);
    }

    @Override // com.facebook.ads.redexgen.core.U6, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A05.A1P().A0P()) {
            A05(configuration.orientation);
        }
    }
}
