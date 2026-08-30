package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class V2 extends com.facebook.ads.redexgen.core.NE {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final android.widget.HorizontalScrollView A00;
    public final android.widget.ImageView A01;
    public final android.widget.LinearLayout A02;
    public final android.widget.LinearLayout A03;
    public final com.facebook.ads.redexgen.core.C2S A04;
    public final com.facebook.ads.redexgen.core.C1199Zs A05;

    public static java.lang.String A0B(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 20);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0C() {
        A06 = new byte[]{3, 32, 34, 42, 3, 44, 47, 51, 37, 96, 1, 36, 96, 18, 37, 48, 47, 50, 52, 41, 46, 39};
    }

    static {
        A0C();
        A09 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
        A08 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 10.0f);
        A07 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 44.0f);
    }

    public V2(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str) {
        super(c1199Zs, j7, str);
        this.A05 = c1199Zs;
        this.A04 = com.facebook.ads.redexgen.core.C2T.A00(c1199Zs.A01());
        this.A01 = new android.widget.ImageView(getContext());
        this.A01.setPadding(A08, A08, A08, A08);
        this.A01.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A07, A07);
        layoutParams.gravity = 16;
        this.A02 = new android.widget.LinearLayout(getContext());
        this.A02.setOrientation(0);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new android.widget.HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new android.widget.LinearLayout(getContext());
        this.A03.setOrientation(0);
        com.facebook.ads.redexgen.core.M3.A0M(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.core.NE
    public final void A0L() {
        this.A01.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.CROSS));
        this.A01.setOnClickListener(new com.facebook.ads.redexgen.core.NN(this));
        this.A01.setContentDescription(A0B(4, 18, 84));
        com.facebook.ads.redexgen.core.NI ni = new com.facebook.ads.redexgen.core.NI(this.A05);
        ni.setData(this.A04.A0H(), com.facebook.ads.redexgen.core.MB.HIDE_AD);
        ni.setOnClickListener(new com.facebook.ads.redexgen.core.NO(this, ni));
        com.facebook.ads.redexgen.core.NI ni2 = new com.facebook.ads.redexgen.core.NI(this.A05);
        ni2.setData(this.A04.A0L(), com.facebook.ads.redexgen.core.MB.REPORT_AD);
        ni2.setOnClickListener(new com.facebook.ads.redexgen.core.NP(this, ni2));
        com.facebook.ads.redexgen.core.NI ni3 = new com.facebook.ads.redexgen.core.NI(this.A05);
        ni3.setData(this.A04.A0M(), com.facebook.ads.redexgen.core.MB.AD_CHOICES_ICON);
        ni3.setOnClickListener(new com.facebook.ads.redexgen.core.NQ(this, ni3));
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        com.facebook.ads.redexgen.core.M3.A0T(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(ni, layoutParams);
        this.A02.addView(ni2, layoutParams);
        this.A02.addView(ni3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.NE
    public final void A0M() {
        com.facebook.ads.redexgen.core.M3.A0I(this);
        com.facebook.ads.redexgen.core.M3.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.core.NE
    public final void A0N(com.facebook.ads.redexgen.core.C2W c2w, com.facebook.ads.redexgen.core.C2U c2u) {
        this.A01.setOnClickListener(null);
        android.widget.TextView textView = new android.widget.TextView(getContext());
        com.facebook.ads.redexgen.core.M3.A0Y(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        com.facebook.ads.redexgen.core.M3.A0T(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new android.widget.LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.NE
    public final void A0O(com.facebook.ads.redexgen.core.C2W c2w, com.facebook.ads.redexgen.core.C2U c2u) {
        com.facebook.ads.redexgen.core.M3.A0T(this.A03);
        this.A01.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.BACK_ARROW));
        this.A01.setOnClickListener(new com.facebook.ads.redexgen.core.NR(this));
        this.A01.setContentDescription(A0B(0, 4, 85));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        for (com.facebook.ads.redexgen.core.C2W c2w2 : c2w.A05()) {
            com.facebook.ads.redexgen.core.NI ni = new com.facebook.ads.redexgen.core.NI(this.A05);
            ni.setData(c2w2.A04(), null);
            ni.setOnClickListener(new com.facebook.ads.redexgen.core.NS(this, ni, c2w2));
            this.A02.addView(ni, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.NE
    public final boolean A0P() {
        return true;
    }
}
