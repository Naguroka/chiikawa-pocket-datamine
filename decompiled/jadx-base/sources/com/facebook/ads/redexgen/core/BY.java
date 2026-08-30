package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BY extends com.facebook.ads.redexgen.core.AbstractC1058Ud {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"ccLmdgMtf", "50lpHgsnQSuWf1CWCacJGyiAwAWsDUud", "Nq2vo108Bdlpu7LWCjcAC5dDG31maruF", "TAe0PaklKNA7XHBVlxrhZCtyBfgeydAO", "ouUdcivF6", "IAXVD4SBpgtyrGYWX4yc8p2wBrUpSeUf", "nA5GNdAWyE31pAGlKcdnPdOQEY7Q2fwD", "a5Dyr8HKQP9cZfy0xnx35qJg31dQk6"};
    public static final int A04;
    public final android.view.View A00;
    public final boolean A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[7].length() != 30) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A03;
            strArr[0] = "FT3046kmt";
            strArr[4] = "J6Q3a22Lt";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 71);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{37, 33, 45, 43, 41};
    }

    static {
        A01();
        A04 = android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public BY(com.facebook.ads.redexgen.core.C0911Om c0911Om, boolean z) {
        super(c0911Om, true);
        this.A01 = z;
        this.A00 = c0911Om.A02();
        A14();
        if (this.A01) {
            addView(c0911Om.A02(), new android.widget.RelativeLayout.LayoutParams(-1, -1));
        } else {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(c0911Om.A05());
            android.widget.RelativeLayout.LayoutParams insideContainerParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            insideContainerParams.addRule(2, getAdDetailsView().getId());
            frameLayout.setLayoutParams(insideContainerParams);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            layoutParams.setMargins(com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, 0, com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, 0);
            frameLayout.addView(this.A00, layoutParams);
            addView(frameLayout);
        }
        com.facebook.ads.redexgen.core.LK lkA0A = this.A07.A0A(getAdDataBundle());
        c0911Om.A05().A0G().A00(lkA0A.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A07);
        if (this.A00 != null) {
            if (lkA0A.A00) {
                this.A00.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.On
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        this.A00.A16(view);
                    }
                });
            } else if (com.facebook.ads.redexgen.core.C0762Im.A1C(getAdContextWrapper())) {
                com.facebook.ads.redexgen.core.OB.A00(this.A00, com.facebook.ads.redexgen.core.C0762Im.A1D(getAdContextWrapper()), new com.facebook.ads.redexgen.core.ViewOnClickListenerC0913Oo(this));
            }
        }
        getAdDetailsView().bringToFront();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final boolean A02() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final boolean A0C() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1058Ud, com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A10(com.facebook.ads.redexgen.core.C1F c1f, java.lang.String str, double d, android.os.Bundle bundle) {
        super.A10(c1f, str, d, bundle);
        if (!this.A01 && d > 0.0d) {
            int mediaHeight = (int) (((double) (A04 - (com.facebook.ads.redexgen.core.AbstractC0907Oi.A07 * 2))) / d);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, mediaHeight);
            layoutParams.gravity = 17;
            int i = com.facebook.ads.redexgen.core.AbstractC0907Oi.A07;
            int mediaHeight2 = com.facebook.ads.redexgen.core.AbstractC0907Oi.A07;
            layoutParams.setMargins(i, 0, mediaHeight2, 0);
            this.A00.setLayoutParams(layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final boolean A11() {
        return this.A01;
    }

    public final /* synthetic */ void A16(android.view.View view) {
        getCtaButton().A09(A00(0, 5, 11));
    }
}
