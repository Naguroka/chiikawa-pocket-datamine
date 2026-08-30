package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CD extends com.facebook.ads.redexgen.core.C1261at {
    public static java.lang.String[] A08 = {"3Z4oVcBXIxTGfHDkJENHcNR3oKWZn0O4", "rFv82zPhlr6ageKpcxYW53i7WQEhI", "2tYR0SC80tVMegpE61nD", "NxUbiyfiYIyXyrFLuBvPtjT94e88s", "0hjSAQsR9gnR7LOOW", "3YJcpQnZmcsLDiaVOnEQeEpmcgGPkAOH", "Bqc2ZUTwiywYobMvaWapE1roD64Q2E5u", "7wlgBc9wtLyqXjV7RP"};
    public float A00;
    public int A01;
    public int A02;
    public com.facebook.ads.redexgen.core.CG A03;
    public int[] A04;
    public final com.facebook.ads.redexgen.core.C1199Zs A05;
    public final com.facebook.ads.redexgen.core.QD A06;
    public final com.facebook.ads.redexgen.core.QE A07;

    public CD(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.QE qe, com.facebook.ads.redexgen.core.QD qd) {
        super(c1199Zs);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c1199Zs;
        this.A07 = qe;
        this.A06 = qd;
        this.A01 = -1;
        this.A03 = new com.facebook.ads.redexgen.core.CG(this, this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final void A1J(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, int i, int widthMode) {
        int[] iArrA02;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int mode2 = android.view.View.MeasureSpec.getMode(widthMode);
        if ((mode == 1073741824 && A26() == 1) || (mode2 == 1073741824 && A26() == 0)) {
            super.A1J(c04414w, anonymousClass53, i, widthMode);
            return;
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(widthMode);
        if (this.A06.A01(this.A01)) {
            iArrA02 = this.A06.A02(this.A01);
        } else {
            iArrA02 = new int[]{0, 0};
            if (anonymousClass53.A03() >= 1) {
                int i2 = A0W() > 0 ? 1 : A0W();
                for (int heightMode = 0; heightMode < i2; heightMode++) {
                    android.view.View viewA1m = A1m(heightMode);
                    if (viewA1m == null) {
                        break;
                    }
                    this.A04 = this.A07.A00(viewA1m, android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (A26() == 0) {
                        iArrA02[0] = iArrA02[0] + this.A04[0];
                        if (heightMode == 0) {
                            iArrA02[1] = this.A04[1] + A0g() + A0d();
                        }
                    } else {
                        iArrA02[1] = iArrA02[1] + this.A04[1];
                        if (heightMode == 0) {
                            iArrA02[0] = this.A04[0] + A0e() + A0f();
                        }
                    }
                }
                int i3 = this.A01;
                java.lang.String[] strArr = A08;
                if (strArr[1].length() != strArr[3].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A08;
                strArr2[0] = "c7gaApi93PYPuTyj4vut3Dl9rZW6DyZw";
                strArr2[7] = "eCokdcVdwhThfuMVf9";
                if (i3 != -1) {
                    this.A06.A00(this.A01, iArrA02);
                }
            }
        }
        if (mode == 1073741824) {
            iArrA02[0] = size;
        }
        if (mode2 == 1073741824) {
            iArrA02[1] = size2;
        }
        A13(iArrA02[0], iArrA02[1]);
    }

    @Override // com.facebook.ads.redexgen.core.C1261at, com.facebook.ads.redexgen.core.AbstractC04344o
    public final void A1p(int i) {
        A2B(i, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.C1261at, com.facebook.ads.redexgen.core.AbstractC04344o
    public final void A1x(com.facebook.ads.redexgen.core.FL fl, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, int i) {
        this.A03.A0A(i);
        A1L(this.A03);
    }

    public final void A2G(double d) {
        if (d <= 0.0d) {
            d = 1.0d;
        }
        this.A00 = (float) (50.0d / d);
        this.A03 = new com.facebook.ads.redexgen.core.CG(this, this.A05);
    }

    public final void A2H(int i) {
        this.A01 = i;
    }

    public final void A2I(int i) {
        this.A02 = i;
    }
}
