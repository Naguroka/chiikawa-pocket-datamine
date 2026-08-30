package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UZ extends com.facebook.ads.redexgen.core.AbstractC0907Oi implements com.facebook.ads.redexgen.core.LJ {
    public static byte[] A05;
    public static final int A06;
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A00;
    public final com.facebook.ads.redexgen.core.LL A01;
    public final com.facebook.ads.redexgen.core.MR A02;
    public final com.facebook.ads.redexgen.core.P9 A03;
    public final com.facebook.ads.redexgen.core.QJ A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 86);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{38, 42, 30, 36, 34};
    }

    static {
        A01();
        A06 = android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public UZ(com.facebook.ads.redexgen.core.C0911Om c0911Om, boolean z) {
        int id;
        int iA01;
        super(c0911Om, z);
        this.A02 = c0911Om.A0A();
        this.A00 = c0911Om.A04();
        this.A03 = new com.facebook.ads.redexgen.core.P9(c0911Om.A05(), c0911Om.A02());
        this.A03.A01(getTitleDescContainer(), z);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, com.facebook.ads.redexgen.core.AbstractC0907Oi.A07);
        getCtaButton().setLayoutParams(layoutParams);
        if (c0911Om.A0D()) {
            this.A04 = new com.facebook.ads.redexgen.core.QJ(c0911Om.A05());
            this.A04.setPageDetails(c0911Om.A04().A1S());
            com.facebook.ads.redexgen.core.M3.A0G(1007, this.A04);
            android.widget.RelativeLayout.LayoutParams pageDetailsParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            pageDetailsParams.addRule(2, getCtaButton().getId());
            pageDetailsParams.setMargins(com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, com.facebook.ads.redexgen.core.AbstractC0907Oi.A07 - (com.facebook.ads.redexgen.core.AbstractC0907Oi.A07 / 2), com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, 0);
            this.A04.setLayoutParams(pageDetailsParams);
            id = this.A04.getId();
            iA01 = c0911Om.A01() - (com.facebook.ads.redexgen.core.AbstractC0907Oi.A07 / 2);
        } else {
            id = getCtaButton().getId();
            iA01 = c0911Om.A01();
            this.A04 = null;
        }
        android.widget.FrameLayout insideContainerLayout = new android.widget.FrameLayout(c0911Om.A05());
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(10);
        layoutParams2.addRule(2, id);
        layoutParams2.setMargins(0, iA01, 0, 0);
        insideContainerLayout.setLayoutParams(layoutParams2);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, 0, com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, 0);
        insideContainerLayout.addView(this.A03, layoutParams3);
        addView(insideContainerLayout);
        if (this.A04 != null) {
            addView(this.A04);
        }
        addView(getCtaButton());
        getCtaButton().A0A(c0911Om.A04(), c0911Om.A09());
        android.view.View viewA02 = c0911Om.A02();
        this.A01 = com.facebook.ads.redexgen.core.LL.A01(c0911Om.A05(), this.A00, this);
        com.facebook.ads.redexgen.core.LK lkA0A = this.A01.A0A(this.A00);
        c0911Om.A05().A0G().A00(lkA0A.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
        if (viewA02 != null && lkA0A.A00) {
            viewA02.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Os
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.A00.A13(view);
                }
            });
        } else if (viewA02 != null && com.facebook.ads.redexgen.core.C0762Im.A1C(getAdContextWrapper())) {
            com.facebook.ads.redexgen.core.OB.A00(viewA02, com.facebook.ads.redexgen.core.C0762Im.A1D(getAdContextWrapper()), new com.facebook.ads.redexgen.core.ViewOnClickListenerC0918Ot(this));
        }
        if (com.facebook.ads.redexgen.core.C0762Im.A12(c0911Om.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c0911Om.A09() != null) {
                c0911Om.A09().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && com.facebook.ads.redexgen.core.C0762Im.A13(c0911Om.A05())) {
            this.A04.setOnClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final boolean A02() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final boolean A0C() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A0v() {
        super.A0v();
        this.A01.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A10(com.facebook.ads.redexgen.core.C1F c1f, java.lang.String str, double d, android.os.Bundle bundle) {
        super.A10(c1f, str, d, bundle);
        if (d > 0.0d) {
            int mediaHeight = (int) (((double) (A06 - (com.facebook.ads.redexgen.core.AbstractC0907Oi.A07 * 2))) / d);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final boolean A11() {
        return false;
    }

    public final /* synthetic */ void A13(android.view.View view) {
        getCtaButton().A09(A00(0, 5, 103));
    }

    @Override // com.facebook.ads.redexgen.core.LJ
    public final void ACa() {
        this.A02.A4P(this.A00.A0Y());
    }
}
