package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UP extends com.facebook.ads.redexgen.core.AbstractC0907Oi {
    public android.widget.RelativeLayout A00;
    public android.widget.RelativeLayout A01;
    public com.facebook.ads.redexgen.core.QB A02;
    public com.facebook.ads.redexgen.core.TC A03;
    public com.facebook.ads.redexgen.core.T7 A04;
    public com.facebook.ads.redexgen.core.C9S A05;
    public final android.widget.LinearLayout A06;
    public final android.widget.LinearLayout A07;
    public final android.widget.LinearLayout A08;
    public final android.widget.LinearLayout A09;
    public final android.widget.RelativeLayout A0A;
    public final com.facebook.ads.redexgen.core.C1199Zs A0B;
    public final com.facebook.ads.redexgen.core.C0911Om A0C;
    public final com.facebook.ads.redexgen.core.AbstractC1012Sj A0D;
    public final com.facebook.ads.redexgen.core.AbstractC0990Rn A0E;
    public static java.lang.String[] A0F = {"dHduAtxHUODsuZJhGBZCL", "yuyhTKr6448pVSOhbbO3QanDkg1Btrke", "", "Gtku4tEVnL9u23uc2EIXKUUStEslbjmu", "uz", "Ug", "s4BqeuLW7FPjKDKoSZG73iWJUNxNcWet", "kGKRi0uYqdf74JFz2mP0bKfaoGbNkKkY"};
    public static final int A0V = (int) (com.facebook.ads.redexgen.core.LP.A02 * 24.0f);
    public static final int A0U = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    public static final int A0N = (int) (com.facebook.ads.redexgen.core.LP.A02 * 1.0f);
    public static final int A0O = (int) (com.facebook.ads.redexgen.core.LP.A02 * 24.0f);
    public static final int A0T = (int) (com.facebook.ads.redexgen.core.LP.A02 * 3.0f);
    public static final int A0I = (int) (com.facebook.ads.redexgen.core.LP.A02 * 5.0f);
    public static final int A0W = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    public static final int A0J = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
    public static final int A0L = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
    public static final int A0K = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    public static final int A0M = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    public static final int A0P = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
    public static final int A0H = (int) (com.facebook.ads.redexgen.core.LP.A02 * 40.0f);
    public static final int A0S = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
    public static final int A0R = (int) (com.facebook.ads.redexgen.core.LP.A02 * 24.0f);
    public static final int A0Q = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
    public static final int A0G = (int) (com.facebook.ads.redexgen.core.LP.A02 * 6.0f);

    public UP(com.facebook.ads.redexgen.core.C0911Om c0911Om) {
        super(c0911Om, false);
        this.A0E = new com.facebook.ads.redexgen.core.BW(this);
        this.A0D = new com.facebook.ads.redexgen.core.BV(this);
        this.A0B = c0911Om.A05();
        this.A0C = c0911Om;
        this.A06 = new android.widget.LinearLayout(this.A0B);
        this.A09 = new android.widget.LinearLayout(this.A0B);
        this.A0A = new android.widget.RelativeLayout(this.A0B);
        this.A08 = new android.widget.LinearLayout(this.A0B);
        this.A07 = new android.widget.LinearLayout(this.A0B);
        A08();
    }

    private android.widget.LinearLayout A00() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A0B);
        linearLayout.setOrientation(0);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        linearLayout.setWeightSum(3.0f);
        linearLayout.setPadding(A0U, A0U, A0U, A0U);
        java.lang.String strA05 = this.A0C.A04().A1P().A0F().A05();
        java.lang.String strA01 = this.A0C.A04().A1P().A0F().A01();
        java.lang.String strA03 = this.A0C.A04().A1P().A0F().A03();
        if (!android.text.TextUtils.isEmpty(strA05)) {
            com.facebook.ads.redexgen.core.MB mb = com.facebook.ads.redexgen.core.MB.RATINGS;
            com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cDA04 = this.A0C.A04();
            java.lang.String[] strArr = A0F;
            if (strArr[4].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A0F[2] = "";
            android.widget.LinearLayout videoMetaDataLayout = A01(mb, abstractC1341cDA04.A1P().A0F().A05());
            linearLayout.addView(videoMetaDataLayout);
        }
        if (!android.text.TextUtils.isEmpty(strA03)) {
            android.widget.LinearLayout videoMetaDataLayout2 = A01(com.facebook.ads.redexgen.core.MB.APP_DOWNLOAD_ICON, this.A0C.A04().A1P().A0F().A03());
            linearLayout.addView(videoMetaDataLayout2);
        }
        if (!android.text.TextUtils.isEmpty(strA01)) {
            android.widget.LinearLayout videoMetaDataLayout3 = A01(com.facebook.ads.redexgen.core.MB.APP_SIZE_ICON, this.A0C.A04().A1P().A0F().A01());
            linearLayout.addView(videoMetaDataLayout3);
        }
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(1);
        return linearLayout;
    }

    private android.widget.LinearLayout A01(com.facebook.ads.redexgen.core.MB mb, java.lang.String str) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A0B);
        linearLayout.setOrientation(0);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, A0V);
        layoutParams.weight = 1.0f;
        linearLayout.setGravity(17);
        layoutParams.setMargins(A0T, A0T, A0T, A0T);
        linearLayout.setLayoutParams(layoutParams);
        com.facebook.ads.redexgen.core.M3.A0S(linearLayout, com.facebook.ads.redexgen.core.M3.A06(Integer.MIN_VALUE, A0Q));
        com.facebook.ads.redexgen.core.OO oo = new com.facebook.ads.redexgen.core.OO(this.A0C.A05(), 0, -1, mb);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(A0P, A0P);
        layoutParams2.gravity = 16;
        oo.setLayoutParams(layoutParams2);
        linearLayout.addView(oo);
        android.widget.TextView textView = new android.widget.TextView(this.A0B);
        textView.setText(str);
        textView.setTextColor(-1);
        com.facebook.ads.redexgen.core.M3.A0Y(textView, false, 12);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        layoutParams3.setMargins(A0W, 0, 0, 0);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        return linearLayout;
    }

    private final android.widget.RelativeLayout A02(java.lang.String str, int i, com.facebook.ads.redexgen.core.MB mb) {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.A0B);
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, A0H);
        relativeLayout.setPadding(A0J, 0, A0J, 0);
        com.facebook.ads.redexgen.core.M3.A0S(relativeLayout, com.facebook.ads.redexgen.core.M3.A06(i, A0G));
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(16);
        android.widget.TextView textView = new android.widget.TextView(this.A0B);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(9);
        textView.setText(str);
        textView.setTextColor(-1);
        com.facebook.ads.redexgen.core.M3.A0Y(textView, true, 15);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        com.facebook.ads.redexgen.core.OO iconView = new com.facebook.ads.redexgen.core.OO(this.A0C.A05(), 0, -1, mb);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(A0P, A0P);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(0, A0I, 0, 0);
        iconView.setLayoutParams(layoutParams3);
        relativeLayout.addView(iconView);
        return relativeLayout;
    }

    private android.widget.TextView A03(java.lang.String str, boolean z, int i, int i2, int i3) {
        android.widget.TextView textView = new android.widget.TextView(this.A0B);
        textView.setText(str);
        textView.setTextColor(i2);
        com.facebook.ads.redexgen.core.M3.A0Y(textView, z, i);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(A0K, 0, A0K, i3);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private com.facebook.ads.redexgen.core.T7 A05() {
        com.facebook.ads.redexgen.core.T7 t7 = new com.facebook.ads.redexgen.core.T7(this.A0C.A05());
        com.facebook.ads.redexgen.core.M3.A0S(t7, com.facebook.ads.redexgen.core.M3.A06(436207616, A0Q));
        t7.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.A05 = new com.facebook.ads.redexgen.core.C9S(this.A0B, getAdEventManager(), t7, this.A0C.A04().A1U(), 0, 0, true, null, null);
        if (com.facebook.ads.redexgen.core.C0762Im.A1q(this.A0B)) {
            this.A03 = new com.facebook.ads.redexgen.core.TC(this.A0B, getAdEventManager(), t7, this.A0C.A04().A1U(), this.A05, null);
        } else {
            this.A03 = null;
        }
        return t7;
    }

    private void A07() {
        this.A00 = A02(this.A0C.A04().A0h(), -14977820, com.facebook.ads.redexgen.core.MB.RIGHT_ARROW_ICON);
        this.A01 = A02(this.A0C.A04().A0k(), -13816531, com.facebook.ads.redexgen.core.MB.SKIP_ARROW);
        android.view.View divider = getDivider();
        android.widget.LinearLayout linearLayout = this.A09;
        android.view.View divider2 = this.A00;
        linearLayout.addView(divider2);
        this.A09.addView(divider);
        android.widget.LinearLayout linearLayout2 = this.A09;
        android.view.View divider3 = this.A01;
        linearLayout2.addView(divider3);
        this.A00.setOnClickListener(new com.facebook.ads.redexgen.core.PA(this));
        this.A01.setOnClickListener(new com.facebook.ads.redexgen.core.PB(this));
    }

    private void A08() {
        new com.facebook.ads.redexgen.core.JF(this.A0C.A04().A1U(), getAdEventManager()).A04(com.facebook.ads.redexgen.core.JE.A0d, null);
        com.facebook.ads.redexgen.core.AbstractC0900Ob.A00(this.A0C.A05(), this, this.A0C.A04().A1P().A0E().A07());
        int iA00 = this.A0C.A00();
        this.A09.setOrientation(1);
        A09();
        A0A(iA00);
        addView(this.A06);
        A0B(iA00);
        android.widget.RelativeLayout relativeLayout = this.A0A;
        int orientation = A0Q;
        com.facebook.ads.redexgen.core.M3.A0S(relativeLayout, com.facebook.ads.redexgen.core.M3.A06(436207616, orientation));
        A0C(iA00);
        this.A04 = A05();
        this.A0A.addView(this.A04);
        this.A0A.addView(A00());
        this.A06.addView(this.A0A);
        A07();
        this.A06.addView(this.A09);
        this.A04.setVideoURI(this.A0C.A04().A1P().A0E().A08());
        this.A04.A0b(com.facebook.ads.redexgen.core.EnumC0969Qs.A02, 20);
        this.A04.getEventBus().A03(this.A0E, this.A0D);
    }

    private void A09() {
        this.A08.setOrientation(1);
        this.A07.setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
        this.A08.setLayoutParams(layoutParams);
        layoutParams.weight = 1.0f;
        A0D(this.A08);
        A0D(this.A07);
        this.A06.addView(this.A08);
        this.A09.addView(this.A07);
    }

    private void A0A(int i) {
        int height;
        int width;
        this.A06.setOrientation(i == 1 ? 1 : 0);
        if (this.A0B.A0D() == null || this.A0B.A0D().getWindowManager() == null) {
            return;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        this.A0B.A0D().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int marginHorizontal = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i == 1) {
            height = marginHorizontal / 6;
            width = i2 / 8;
            this.A06.setWeightSum(6.0f);
        } else {
            height = marginHorizontal / 8;
            width = i2 / 6;
            this.A06.setWeightSum(2.0f);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(height, width, height, width);
        layoutParams.addRule(14);
        this.A06.setLayoutParams(layoutParams);
        setRewardDescContainerVisibility(i);
    }

    private void A0B(int i) {
        android.widget.LinearLayout.LayoutParams layoutParams;
        if (i == 1) {
            layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
            layoutParams.setMargins(0, A0S, 0, 0);
            layoutParams.weight = 2.0f;
            this.A09.setGravity(0);
        } else {
            layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1);
            layoutParams.setMargins(A0R, 0, 0, 0);
            layoutParams.weight = 1.0f;
            this.A09.setGravity(16);
        }
        this.A09.setLayoutParams(layoutParams);
    }

    private void A0C(int i) {
        android.widget.LinearLayout.LayoutParams layoutParams;
        if (i == 1) {
            layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
        } else {
            layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1);
        }
        layoutParams.weight = i == 1 ? 3.0f : 1.0f;
        this.A0A.setLayoutParams(layoutParams);
    }

    private void A0D(android.widget.LinearLayout linearLayout) {
        android.widget.TextView summaryView = A03(this.A0C.A04().A0j(), true, 24, -657931, A0M);
        android.widget.TextView titleView = A03(this.A0C.A04().A0i(), false, 15, -1, A0L);
        linearLayout.addView(summaryView);
        linearLayout.addView(titleView);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A0v() {
        super.A0v();
        if (this.A03 != null) {
            this.A03.A05();
        }
        if (this.A05 != null) {
            this.A05.A0o();
        }
        this.A04.getEventBus().A04(this.A0E, this.A0D);
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final boolean A11() {
        return true;
    }

    public final void A13(com.facebook.ads.redexgen.core.C9S c9s) {
        if (this.A05 != null) {
            this.A05.A0n(c9s);
        }
    }

    private android.view.View getDivider() {
        android.view.View view = new android.view.View(this.A0B);
        view.setBackgroundColor(-10131605);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, A0N);
        layoutParams.setMargins(0, A0O, 0, A0O);
        view.setLayoutParams(layoutParams);
        return view;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0A(configuration.orientation);
        A0B(configuration.orientation);
        A0C(configuration.orientation);
        requestLayout();
    }

    private void setRewardDescContainerVisibility(int i) {
        if (i == 1) {
            this.A08.setVisibility(0);
            this.A07.setVisibility(8);
        } else {
            this.A08.setVisibility(8);
            this.A07.setVisibility(0);
        }
    }

    public void setVideoAdViewListener(com.facebook.ads.redexgen.core.QB qb) {
        this.A02 = qb;
    }
}
