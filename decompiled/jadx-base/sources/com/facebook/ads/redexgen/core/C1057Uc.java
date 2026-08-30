package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1057Uc extends com.facebook.ads.redexgen.core.AbstractC0907Oi implements com.facebook.ads.redexgen.core.LJ {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"jViytUMb8W4ggVUJxJM4ipopCTL5", "9aLNfhHGIgyW1yw0lAvb2knTk6C61HAs", "tSRmVjXXTSnTtzrce7INiQjRTYiInlbV", "4hcdJiGUQmFME9vgh87fiTmYWHBJid0b", "Sl93MFe7LYTqHCUKgRBPFfcYUFdC2Wx2", "6CReOOSeiw7R4vGYWPFAi839J8MszZAI", "rkSedGSxOJTtoP7gEY2R8PFp4jzzUrYJ", "HZKY5YyrBfN27m9O42YnVDeAUeo6GkfS"};
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A00;
    public final com.facebook.ads.redexgen.core.LL A01;
    public final com.facebook.ads.redexgen.core.MR A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[0].length() != 28) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A04;
            strArr[1] = "P3g3yiO3ICi92ZTGqQIjITPfAPWFUEMm";
            strArr[2] = "pyBqNmisWoZkDTGCi8bHuToayw1uFlPn";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 78);
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{64, 68, 72, 78, 76};
    }

    static {
        A01();
    }

    public C1057Uc(com.facebook.ads.redexgen.core.C0911Om c0911Om, boolean z) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        super(c0911Om, true);
        this.A02 = c0911Om.A0A();
        this.A00 = c0911Om.A04();
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(c0911Om.A05());
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        com.facebook.ads.redexgen.core.M3.A0R(relativeLayout, getAdContextWrapper());
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(c0911Om.A05());
        linearLayout.setOrientation(!z ? 1 : 0);
        linearLayout.setGravity(80);
        com.facebook.ads.redexgen.core.M3.A0K(linearLayout);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, 0, com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, com.facebook.ads.redexgen.core.AbstractC0907Oi.A07);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(z ? -2 : -1, -2);
        layoutParams4.setMargins(z ? com.facebook.ads.redexgen.core.AbstractC0907Oi.A07 : 0, z ? 0 : com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, 0, 0);
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(z ? 0 : -1, -2);
        layoutParams5.setMargins(0, 0, 0, 0);
        layoutParams5.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams5);
        this.A01 = com.facebook.ads.redexgen.core.LL.A01(c0911Om.A05(), this.A00, this);
        com.facebook.ads.redexgen.core.LK lkA0A = this.A01.A0A(this.A00);
        c0911Om.A05().A0G().A00(lkA0A.A01);
        if (c0911Om.A0D() && !z) {
            com.facebook.ads.redexgen.core.QJ qj = new com.facebook.ads.redexgen.core.QJ(c0911Om.A05());
            qj.setPageDetails(c0911Om.A04().A1S());
            int iA04 = this.A06.A04().A1O().A00().A04(true);
            qj.A02(iA04, iA04);
            com.facebook.ads.redexgen.core.M3.A0G(1007, qj);
            android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(0, com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, 0, 0);
            linearLayout.addView(qj, layoutParams6);
            if (com.facebook.ads.redexgen.core.C0762Im.A13(c0911Om.A05())) {
                qj.setOnClickListener(getCtaButton());
            }
        }
        linearLayout.addView(getCtaButton(), layoutParams4);
        relativeLayout.addView(linearLayout, layoutParams3);
        getCtaButton().A0A(c0911Om.A04(), c0911Om.A09());
        android.view.View viewA02 = c0911Om.A02();
        if (viewA02 != null && (lkA0A.A00 || com.facebook.ads.redexgen.core.C0762Im.A1C(getAdContextWrapper()))) {
            if (z) {
                layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -1);
            } else {
                layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            }
            layoutParams.gravity = 17;
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(c0911Om.A05());
            frameLayout.addView(viewA02, layoutParams);
            addView(frameLayout, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
            if (lkA0A.A00) {
                viewA02.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Og
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        this.A00.A13(view);
                    }
                });
            } else {
                com.facebook.ads.redexgen.core.OB.A00(viewA02, com.facebook.ads.redexgen.core.C0762Im.A1D(getAdContextWrapper()), new com.facebook.ads.redexgen.core.ViewOnClickListenerC0906Oh(this));
            }
        } else if (viewA02 != null) {
            addView(viewA02, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams2);
        if (com.facebook.ads.redexgen.core.C0762Im.A12(c0911Om.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c0911Om.A09() != null) {
                c0911Om.A09().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A0v() {
        super.A0v();
        this.A01.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A10(com.facebook.ads.redexgen.core.C1F c1f, java.lang.String str, double d, android.os.Bundle bundle) {
        super.A10(c1f, str, d, bundle);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final boolean A11() {
        return true;
    }

    public final /* synthetic */ void A13(android.view.View view) {
        getCtaButton().A09(A00(0, 5, 103));
    }

    @Override // com.facebook.ads.redexgen.core.LJ
    public final void ACa() {
        this.A02.A4P(this.A00.A0Y());
    }
}
