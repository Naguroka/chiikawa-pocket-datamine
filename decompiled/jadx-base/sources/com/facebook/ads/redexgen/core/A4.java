package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A4 extends com.facebook.ads.redexgen.core.AbstractC1045Tq {
    public static java.lang.String[] A06 = {"opNTFb7MfNeLnBf1OFt8H8u3IMVbRu1d", "IWQCWQwp5ID5RPcOdaIzYqbwlbVDrClG", "KvkPuVSJhScWrt17epNc", "F0ODCmRg5uMMagWpVfR8fmvJ1OUGt5pq", "F5r", "wG3QjEZJL94bFBL8PiZK", "A8E1xGSXICDDUeWE8x490gS0hcqgXwJC", "2T9PYA9x4VF1QbksNYikemvLXt0jGXOu"};
    public com.facebook.ads.redexgen.core.AbstractC0907Oi A00;
    public final android.widget.ImageView A01;
    public final com.facebook.ads.redexgen.core.C5W A02;
    public final java.util.concurrent.atomic.AtomicBoolean A03;
    public final java.util.concurrent.atomic.AtomicBoolean A04;
    public final java.util.concurrent.atomic.AtomicBoolean A05;

    public A4(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.N9 n9, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.MR mr) {
        super(c1199Zs, n9, j7, abstractC1341cD, c04766f, mr);
        this.A02 = new com.facebook.ads.redexgen.core.C1040Tl(this);
        this.A04 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A03 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A05 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A01 = new android.widget.ImageView(getContext());
        this.A01.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.A01.setAdjustViewBounds(true);
        new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A01, super.A03).A05(super.A01.A1P().A0E().A00(), super.A01.A1P().A0E().A01()).A06(new com.facebook.ads.redexgen.core.C1039Tk(this)).A07(super.A01.A1P().A0E().A07());
    }

    private com.facebook.ads.redexgen.core.AbstractC0907Oi A01(int i) {
        if (this.A01.getParent() != null) {
            com.facebook.ads.redexgen.core.M3.A0J(this.A01);
        }
        return com.facebook.ads.redexgen.core.AbstractC0908Oj.A00(new com.facebook.ads.redexgen.core.C0910Ol(super.A03, super.A04, this.A08, super.A01, this.A01, this.A0A, this.A06).A0F(this.A07.getToolbarHeight()).A0J(this.A07).A0E(i).A0M(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A04.get() && this.A03.get()) {
            A0V();
        }
    }

    private void A06(int i) {
        com.facebook.ads.redexgen.core.M3.A0J(this.A00);
        this.A00 = A01(i);
        com.facebook.ads.redexgen.core.C1O colors = this.A00.getColors();
        com.facebook.ads.redexgen.core.M3.A0M(this, colors.A07(this.A00 != null && (this.A00.A11() || (this.A00 instanceof com.facebook.ads.redexgen.core.AbstractC1058Ud))));
        this.A07.setFullscreen(this.A00.A11());
        this.A07.A09(colors, com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui.A08(super.A01));
        addView(this.A00, 0, com.facebook.ads.redexgen.core.AbstractC1045Tq.A0E);
        setUpFullscreenMode(this.A00 != null && this.A00.A11());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1045Tq
    public final void A0W() {
        com.facebook.ads.redexgen.core.M3.A0L(this.A00);
        com.facebook.ads.redexgen.core.M3.A0L(this.A07);
        this.A03.set(true);
        A05();
        int iA03 = super.A01.A1P().A0E().A03();
        if (iA03 > 0) {
            if (this.A00 != null) {
                this.A00.A0z();
            }
            A0X(iA03, new com.facebook.ads.redexgen.core.C1038Tj(this));
        } else {
            this.A05.set(true);
            com.facebook.ads.redexgen.core.MQ mq = this.A07;
            int unskippableSeconds = getCloseButtonStyle();
            mq.setToolbarActionMode(unskippableSeconds);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1045Tq
    public final void A0Y(com.facebook.ads.redexgen.core.C5Q c5q) {
        c5q.A0A(this.A02);
        int orientation = c5q.A05().getResources().getConfiguration().orientation;
        A06(orientation);
        addView(this.A07, new android.widget.FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        com.facebook.ads.redexgen.core.M3.A0H(this.A00);
        com.facebook.ads.redexgen.core.M3.A0H(this.A07);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1045Tq
    public final boolean A0Z() {
        if (this.A00 == null) {
            return false;
        }
        com.facebook.ads.redexgen.core.AbstractC0907Oi abstractC0907Oi = this.A00;
        if (A06[4].length() != 3) {
            throw new java.lang.RuntimeException();
        }
        A06[4] = "kMg";
        return abstractC0907Oi.A12(false);
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ACz(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ADN(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        if (this.A00 != null) {
            return this.A00.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1045Tq, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A01.A1P().A0P()) {
            A06(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1045Tq, com.facebook.ads.redexgen.core.MS
    public final void onDestroy() {
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(super.A03)) {
            super.A03.A0A().AHC(this.A01);
        }
        if (this.A00 != null) {
            com.facebook.ads.redexgen.core.AbstractC0907Oi abstractC0907Oi = this.A00;
            java.lang.String[] strArr = A06;
            if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
                throw new java.lang.RuntimeException();
            }
            A06[4] = "hIQ";
            abstractC0907Oi.A0v();
        }
        super.onDestroy();
    }
}
