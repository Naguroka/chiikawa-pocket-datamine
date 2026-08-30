package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class V1 extends com.facebook.ads.redexgen.core.NE {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final android.widget.ImageView A00;
    public final android.widget.LinearLayout A01;
    public final android.widget.ScrollView A02;
    public final com.facebook.ads.redexgen.core.C2S A03;
    public final com.facebook.ads.redexgen.core.C1199Zs A04;

    public static java.lang.String A0B(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 24);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{-52, -21, -19, -11, 120, -95, -92, -88, -102, 85, 118, -103, 85, -121, -102, -91, -92, -89, -87, -98, -93, -100};
    }

    static {
        A0C();
        A08 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
        A07 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 10.0f);
        A06 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 44.0f);
    }

    public V1(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str) {
        super(c1199Zs, j7, str);
        this.A04 = c1199Zs;
        this.A03 = com.facebook.ads.redexgen.core.C2T.A00(this.A04.A01());
        this.A00 = new android.widget.ImageView(getContext());
        this.A00.setPadding(A07, A07, A07, A07);
        this.A00.setColorFilter(-10459280);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new android.widget.ScrollView(getContext());
        this.A02.setFillViewport(true);
        com.facebook.ads.redexgen.core.M3.A0M(this.A02, -218103809);
        this.A01 = new android.widget.LinearLayout(getContext());
        this.A01.setOrientation(1);
        this.A01.setPadding(A08, A08, A08, A08);
        this.A02.addView(this.A01, new android.widget.FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.NE
    public final void A0L() {
        this.A00.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.CROSS));
        this.A00.setOnClickListener(new com.facebook.ads.redexgen.core.NX(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        com.facebook.ads.redexgen.core.NI ni = new com.facebook.ads.redexgen.core.NI(this.A04);
        ni.setData(this.A03.A0H(), com.facebook.ads.redexgen.core.MB.HIDE_AD);
        ni.setOnClickListener(new com.facebook.ads.redexgen.core.NY(this, ni));
        com.facebook.ads.redexgen.core.NI ni2 = new com.facebook.ads.redexgen.core.NI(this.A04);
        ni2.setData(this.A03.A0L(), com.facebook.ads.redexgen.core.MB.REPORT_AD);
        ni2.setOnClickListener(new com.facebook.ads.redexgen.core.NZ(this, ni2));
        com.facebook.ads.redexgen.core.NI ni3 = new com.facebook.ads.redexgen.core.NI(this.A04);
        ni3.setData(this.A03.A0M(), com.facebook.ads.redexgen.core.MB.AD_CHOICES_ICON);
        ni3.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC0873Na(this, ni3));
        android.widget.LinearLayout.LayoutParams menuParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        menuParams.setMargins(A08, A08, A08, A08);
        menuParams.gravity = 17;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        com.facebook.ads.redexgen.core.M3.A0T(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(ni, menuParams);
        linearLayout.addView(ni2, menuParams);
        linearLayout.addView(ni3, menuParams);
    }

    @Override // com.facebook.ads.redexgen.core.NE
    public final void A0M() {
        com.facebook.ads.redexgen.core.M3.A0I(this);
        com.facebook.ads.redexgen.core.M3.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.core.NE
    public final void A0N(com.facebook.ads.redexgen.core.C2W c2w, com.facebook.ads.redexgen.core.C2U c2u) {
        java.lang.String strA0H;
        com.facebook.ads.redexgen.core.MB mb;
        int i;
        this.A00.setOnClickListener(null);
        if (c2u == com.facebook.ads.redexgen.core.C2U.A06) {
            strA0H = this.A03.A0F();
            mb = com.facebook.ads.redexgen.core.MB.REPORT_AD;
            i = -552389;
        } else {
            strA0H = this.A03.A0H();
            mb = com.facebook.ads.redexgen.core.MB.HIDE_AD;
            i = -13272859;
        }
        com.facebook.ads.redexgen.core.NC ncA0I = new com.facebook.ads.redexgen.core.NC(this.A04, this.A0B).A0I(strA0H);
        java.lang.String title = this.A03.A0D();
        com.facebook.ads.redexgen.core.NC ncA0H = ncA0I.A0H(title);
        java.lang.String title2 = c2w.A04();
        com.facebook.ads.redexgen.core.ND adHiddenView = ncA0H.A0F(title2).A0K(false).A0E(mb).A0D(i).A0L(false).A0J(false).A0M();
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        com.facebook.ads.redexgen.core.M3.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.NE
    public final void A0O(com.facebook.ads.redexgen.core.C2W c2w, com.facebook.ads.redexgen.core.C2U c2u) {
        boolean isReportFlow = c2u == com.facebook.ads.redexgen.core.C2U.A06;
        com.facebook.ads.redexgen.core.NW nw = new com.facebook.ads.redexgen.core.NW(this.A04, c2w, this.A0B, isReportFlow ? com.facebook.ads.redexgen.core.MB.REPORT_AD : com.facebook.ads.redexgen.core.MB.HIDE_AD);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.BACK_ARROW));
        this.A00.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC0874Nb(this));
        this.A00.setContentDescription(A0B(0, 4, 114));
        com.facebook.ads.redexgen.core.M3.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(nw, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.NE
    public final boolean A0P() {
        return true;
    }
}
