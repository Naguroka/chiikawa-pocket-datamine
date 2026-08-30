package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1059Ue extends com.facebook.ads.redexgen.core.OE {
    public static byte[] A0I;
    public static java.lang.String[] A0J = {"U1MfpI1C6bH5E6SUUi1isARh9jp", "U", "Ubu5RVHkDHh3GnMyAX4EkYenDqWvQs6J", "Crj7vvGLMnYJtX1VpNFn8xcnVkyg9fPV", "3oNG9AhO9bk5LTGV0GcEQxoD", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "kfjfnNCZtD", "orAcnrCTNYiJWv2aZLW"};
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public int A00;
    public int A01;
    public android.widget.LinearLayout A02;
    public android.widget.TextView A03;
    public android.widget.TextView A04;
    public android.widget.TextView A05;
    public com.facebook.ads.redexgen.core.C1M A06;
    public com.facebook.ads.redexgen.core.C1O A07;
    public com.facebook.ads.redexgen.core.C1P A08;
    public com.facebook.ads.redexgen.core.OW A09;
    public boolean A0A;
    public boolean A0B;
    public final android.widget.LinearLayout A0C;
    public final android.widget.RelativeLayout A0D;
    public final android.widget.RelativeLayout A0E;
    public final android.widget.TextView A0F;
    public final com.facebook.ads.redexgen.core.C1199Zs A0G;
    public final boolean A0H;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 95);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A05() {
        this.A0D.removeAllViews();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = A0N;
        this.A0D.setLayoutParams(layoutParams);
        com.facebook.ads.redexgen.core.M3.A0K(this.A0D);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(super.A04, super.A04);
        layoutParams2.addRule(15);
        layoutParams2.addRule(9);
        this.A0D.addView(super.A09, layoutParams2);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = A0O;
        layoutParams3.addRule(1, super.A09.getId());
        layoutParams3.addRule(15);
        this.A0D.addView(this.A0E, layoutParams3);
        this.A0E.removeAllViews();
        com.facebook.ads.redexgen.core.M3.A0K(this.A05);
        this.A05.setLayoutParams(com.facebook.ads.redexgen.core.OE.A0B);
        this.A05.setTextColor(this.A0A ? this.A07.A06(true) : -1);
        com.facebook.ads.redexgen.core.M3.A0Y(this.A05, true, 18);
        this.A0E.addView(this.A05);
        this.A02.setOrientation(0);
        this.A02.setGravity(16);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(-2, A0P);
        layoutParams4.topMargin = A0O / 2;
        layoutParams4.addRule(3, this.A05.getId());
        this.A0E.addView(this.A02, layoutParams4);
        this.A02.removeAllViews();
        this.A09.setGravity(16);
        this.A02.addView(this.A09, new android.widget.LinearLayout.LayoutParams(-2, -1));
        this.A04.setTextColor(this.A0A ? this.A07.A06(true) : -1);
        this.A04.setGravity(16);
        this.A04.setIncludeFontPadding(false);
        com.facebook.ads.redexgen.core.M3.A0Y(this.A04, false, 14);
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(-2, -1);
        layoutParams5.leftMargin = A0O;
        this.A02.addView(this.A04, layoutParams5);
    }

    public static void A0B() {
        A0I = new byte[]{-80, -64};
    }

    static {
        A0B();
        A0T = com.facebook.ads.redexgen.core.AbstractC03842p.A01(-1, 77);
        A0N = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
        A0O = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
        A0K = (int) (com.facebook.ads.redexgen.core.LP.A02 * 26.0f);
        A0M = (int) (com.facebook.ads.redexgen.core.LP.A02 * 144.0f);
        A0L = (int) (com.facebook.ads.redexgen.core.LP.A02 * 48.0f);
        A0P = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
        A0U = (int) (com.facebook.ads.redexgen.core.LP.A02 * 14.0f);
        A0Q = (int) (com.facebook.ads.redexgen.core.AbstractC03732e.A08 * 21.0f);
        A0R = (int) (com.facebook.ads.redexgen.core.AbstractC03732e.A08 * 12.0f);
        A0S = (int) (com.facebook.ads.redexgen.core.AbstractC03732e.A08 * 10.0f);
    }

    public C1059Ue(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, int i, boolean z, com.facebook.ads.redexgen.core.C1O c1o, boolean z2, java.lang.String str, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, com.facebook.ads.redexgen.core.C1T c1t, boolean z3, java.lang.String str2, boolean z4) {
        super(c1199Zs, i, c1o, z2, str, j7, mr, c0987Rk, c0842Lv, c1t, z3, str2);
        this.A0B = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A0G = c1199Zs;
        super.A09.setFullCircleCorners(z);
        setPadding(A0N, A0N, A0N, A0K);
        this.A0D = new android.widget.RelativeLayout(getContext());
        this.A05 = new android.widget.TextView(getContext());
        this.A02 = new android.widget.LinearLayout(getContext());
        this.A09 = new com.facebook.ads.redexgen.core.OW(this.A0G, A0U, 5, A0T, -1);
        this.A0E = new android.widget.RelativeLayout(getContext());
        this.A0C = new android.widget.LinearLayout(getContext());
        this.A04 = new android.widget.TextView(getContext());
        this.A03 = new android.widget.TextView(getContext());
        super.A06.addView(this.A0D);
        super.A06.addView(this.A0C);
        this.A0F = new android.widget.TextView(getContext());
        this.A07 = c1o;
        this.A0H = com.facebook.ads.redexgen.core.C0762Im.A12(c1199Zs);
        com.facebook.ads.redexgen.core.M3.A0R(this, c1199Zs);
        this.A0A = com.facebook.ads.redexgen.core.C0762Im.A2P(this.A0G);
        A09();
        if (z4) {
            this.A03.setVisibility(8);
            this.A0C.setVisibility(8);
        }
    }

    public C1059Ue(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, int i, boolean z, com.facebook.ads.redexgen.core.C1O c1o, boolean z2, java.lang.String str, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        this(c1199Zs, i, z, c1o, false, str, j7, mr, c0987Rk, c0842Lv, abstractC1341cD.A1Q(), abstractC1341cD.A1A(), abstractC1341cD.A0e(), abstractC1341cD.A1E());
    }

    private android.graphics.drawable.GradientDrawable A01(int i, float f) {
        android.graphics.drawable.GradientDrawable drawable = new android.graphics.drawable.GradientDrawable();
        drawable.setCornerRadius(f);
        drawable.setColor(i);
        return drawable;
    }

    private void A03() {
        super.A08.setPadding(0, 0, 0, 0);
        super.A08.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, A0L));
    }

    private void A04() {
        android.widget.LinearLayout.LayoutParams layoutParams;
        this.A0C.setOrientation(1);
        this.A0C.setPadding(0, 0, 0, A0N);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A0D.getId());
        this.A0C.setLayoutParams(layoutParams2);
        this.A0C.removeAllViews();
        this.A03.setMaxLines(2);
        this.A03.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A03.setGravity(16);
        this.A03.setTextColor(this.A0A ? this.A07.A05(true) : -1);
        com.facebook.ads.redexgen.core.M3.A0Y(this.A03, false, 16);
        if (this.A0H) {
            layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        }
        this.A0C.addView(this.A03, layoutParams);
    }

    private void A06() {
        if (super.A01 != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            super.A01.setPadding(0, 0, 0, A0R);
            super.A01.setText(super.A02);
            super.A01.setTextColor(-1);
            com.facebook.ads.redexgen.core.M3.A0Y(super.A01, false, 15);
            super.A01.setLayoutParams(layoutParams);
        }
    }

    private void A07() {
        if (super.A00 != null) {
            super.A00.removeAllViews();
            super.A00.setOrientation(1);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
            layoutParams.setMargins(0, A0Q, 0, A0Q);
            super.A00.setGravity(17);
            super.A00.setPadding(A0R, A0R, A0R, A0R);
            super.A00.setLayoutParams(layoutParams);
            com.facebook.ads.redexgen.core.M3.A0S(super.A00, A01(-1121112787, A0S));
            A06();
            A03();
            if (super.A01 != null) {
                super.A00.addView(super.A01);
            }
            super.A00.addView(super.A08);
        }
    }

    private void A08() {
        android.widget.LinearLayout.LayoutParams layoutParams;
        this.A0F.setMaxLines(1);
        this.A0F.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A0F.setGravity(17);
        this.A0F.setTextColor(this.A0A ? this.A07.A06(true) : -1);
        this.A0F.setAllCaps(true);
        com.facebook.ads.redexgen.core.M3.A0Y(this.A0F, false, 12);
        new android.widget.LinearLayout.LayoutParams(-1, -2);
        if (this.A0H) {
            layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams.topMargin = A0N;
        this.A0F.setLayoutParams(layoutParams);
    }

    private void A09() {
        removeAllViews();
        super.A06.setLayoutParams(com.facebook.ads.redexgen.core.OE.A0B);
        A05();
        A04();
        if (!super.A03) {
            A03();
        } else {
            A07();
        }
        A08();
        A0A();
        com.facebook.ads.redexgen.core.M3.A0J(super.A06);
        if (!super.A03) {
            com.facebook.ads.redexgen.core.M3.A0J(super.A08);
        }
        com.facebook.ads.redexgen.core.M3.A0J(this.A0F);
        addView(super.A06);
        if (!super.A03) {
            addView(super.A08);
        } else if (super.A00 != null) {
            addView(super.A00);
        }
        addView(this.A0F);
    }

    private void A0A() {
        if (this.A06 == null) {
            return;
        }
        android.widget.TextView textView = this.A05;
        com.facebook.ads.redexgen.core.C1M c1m = this.A06;
        if (A0J[2].charAt(28) == 'n') {
            throw new java.lang.RuntimeException();
        }
        A0J[2] = "SIvKbfulzllrpdkfdrym2tho7PogZ3oV";
        textView.setText(c1m.A08());
        this.A03.setText(this.A06.A02());
        this.A0F.setText(this.A06.A06());
        if (android.text.TextUtils.isEmpty(this.A08.A04())) {
            com.facebook.ads.redexgen.core.M3.A0H(super.A08);
        }
        if (android.text.TextUtils.isEmpty(this.A06.A06())) {
            com.facebook.ads.redexgen.core.M3.A0H(this.A0F);
        }
        if (android.text.TextUtils.isEmpty(this.A06.A05())) {
            this.A02.setVisibility(8);
            return;
        }
        this.A02.setVisibility(0);
        this.A09.setRating(java.lang.Float.parseFloat(this.A06.A05()));
        if (this.A06.A04() == null) {
            return;
        }
        this.A04.setText(A02(0, 1, 41) + java.text.NumberFormat.getNumberInstance().format(java.lang.Integer.parseInt(this.A06.A04())) + A02(1, 1, 56));
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public final void A0C() {
        super.A0C();
        this.A09.setOnClickListener(super.A05);
        this.A0F.setOnClickListener(super.A05);
        this.A04.setOnClickListener(super.A05);
        this.A03.setOnClickListener(super.A05);
        this.A05.setOnClickListener(super.A05);
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public final void A0D(int i) {
        boolean z = i == 1;
        setOrientation(z ? 1 : 0);
        if (!z) {
            setWeightSum(5.0f);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = !super.A03 ? 4.0f : 3.0f;
            layoutParams.bottomMargin = A0K - A0N;
            super.A06.setLayoutParams(layoutParams);
            if (!super.A03) {
                android.widget.LinearLayout.LayoutParams auxContainerParams = new android.widget.LinearLayout.LayoutParams(0, A0L);
                auxContainerParams.bottomMargin = A0K / 2;
                auxContainerParams.weight = 1.0f;
                auxContainerParams.gravity = 80;
                super.A08.setLayoutParams(auxContainerParams);
                super.A08.setMinWidth(A0M);
            } else if (super.A00 != null) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, -2);
                layoutParams2.weight = 2.0f;
                super.A00.setLayoutParams(layoutParams2);
                super.A00.requestLayout();
            }
            com.facebook.ads.redexgen.core.M3.A0J(this.A0F);
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -1);
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = A0O;
            this.A0C.addView(this.A0F, layoutParams3);
            this.A0C.setPadding(0, 0, 0, 0);
            this.A0F.setGravity(3);
        } else {
            A09();
        }
        bringToFront();
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public final android.view.View getExpandableLayout() {
        return this.A0C;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A00 == 0) {
            this.A00 = this.A03.getHeight();
            this.A01 = this.A0F.getHeight();
        }
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public void setInfo(com.facebook.ads.redexgen.core.C1M c1m, com.facebook.ads.redexgen.core.C1P c1p, java.lang.String str, java.lang.String str2, com.facebook.ads.redexgen.core.LZ lz, com.facebook.ads.redexgen.core.OG og) {
        super.setInfo(c1m, c1p, str, str2, lz, og);
        this.A06 = c1m;
        this.A08 = c1p;
        A0A();
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public void setTitleMaxLines(int i) {
        this.A05.setMaxLines(i);
        this.A05.setEllipsize(android.text.TextUtils.TruncateAt.END);
    }
}
