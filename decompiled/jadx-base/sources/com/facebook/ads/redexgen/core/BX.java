package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BX extends com.facebook.ads.redexgen.core.AbstractC1058Ud {
    public static byte[] A0G;
    public static java.lang.String[] A0H = {"zra6hnpaifP7bxfZB5bQOHnqie2tQjg", "wy9og3M9LeWlDzkU0RS7zgtaq3xQKlMR", "jyAiwm88v9hsYzrfl9gFIABQTfRULZfl", "Wwy1p0nUO1H5ggrsb6VvEsAvpBZyxSvp", "wjN7zQjrZyyYli8cgu97rk5B2y3BycTh", "DSxnyYt0igg0K0GbJ5jSMl2rvJzineXI", "irrLwQMNjn2DglpbBC8hfvG7oGwbzPRC", "9jAewdJckPVrzkqluL1z0QkIRDh51Ovv"};
    public static final int A0I;
    public static final int A0J;
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
    public android.view.View A00;
    public android.view.View A01;
    public com.facebook.ads.redexgen.core.C1199Zs A02;
    public com.facebook.ads.redexgen.core.LH A03;
    public com.facebook.ads.redexgen.core.MQ A04;
    public com.facebook.ads.redexgen.core.UP A05;
    public com.facebook.ads.redexgen.core.C0951Qa A06;
    public com.facebook.ads.redexgen.core.M9 A07;
    public boolean A08;
    public boolean A09;
    public final com.facebook.ads.redexgen.core.MR A0A;
    public final com.facebook.ads.redexgen.core.OR A0B;
    public final com.facebook.ads.redexgen.core.OS A0C;
    public final com.facebook.ads.redexgen.core.T7 A0D;
    public final com.facebook.ads.redexgen.core.N5 A0E;
    public final java.util.concurrent.atomic.AtomicBoolean A0F;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 85);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A09() {
        A0G = new byte[]{-23, -117, 1, -6, 15, -2, 24, 12, 13, -6, 11, 13, 2, 7, 0, 24, -6, 7, 2, 6, -6, 13, 2, 8, 7, 12, 24, 9, 5, -6, 18, -2, -3, 26, 29, 33, 19, 45, 32, 19, 37, 15, 32, 18, 45, 33, 17, 32, 19, 19, 28, 45, 33, 22, 29, 37, 28, -7, -29, -11, 1, -25, -16, -26, 1, -27, -29, -12, -26, 1, -11, -22, -15, -7, -16, -17, -19, -33, -20, -35, -26, -29, -35, -27};
    }

    static {
        A09();
        A0L = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
        A0T = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
        A0I = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
        A0J = (int) (com.facebook.ads.redexgen.core.LP.A02 * 10.0f);
        A0O = (int) (com.facebook.ads.redexgen.core.LP.A02 * 20.0f);
        A0P = (int) (com.facebook.ads.redexgen.core.LP.A02 * 13.0f);
        A0M = (int) (com.facebook.ads.redexgen.core.LP.A02 * 48.0f);
        A0S = (int) (com.facebook.ads.redexgen.core.LP.A02 * 14.0f);
        A0Q = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
        A0K = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
        A0R = com.facebook.ads.redexgen.core.AbstractC03842p.A01(-1, 77);
        A0N = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
        A0U = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
    }

    public BX(com.facebook.ads.redexgen.core.C0911Om c0911Om) {
        super(c0911Om, false);
        this.A0F = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A09 = false;
        this.A08 = false;
        this.A02 = c0911Om.A05();
        this.A04 = c0911Om.A09();
        this.A01 = new android.view.View(this.A02);
        com.facebook.ads.redexgen.core.M3.A0K(this.A01);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A06();
        this.A0A = c0911Om.A0A();
        com.facebook.ads.redexgen.core.AbstractC0900Ob.A00(c0911Om.A05(), this, getAdInfo().A0E().A07());
        this.A0D = A01(c0911Om);
        getAdDetailsView().bringToFront();
        this.A0E = A02(c0911Om);
        if (getAdDataBundle().A1F()) {
            this.A0E.setVisibility(8);
            getAdDetailsView().setVisibility(8);
            A05();
        }
        A14();
        this.A06 = new com.facebook.ads.redexgen.core.C0951Qa(this.A02, c0911Om.A06(), getAdDataBundle());
        this.A0B = new com.facebook.ads.redexgen.core.C1056Ub(this);
        this.A0C = new com.facebook.ads.redexgen.core.OS(c0911Om, getAdDataBundle(), this.A0D, this.A0E, getAdDetailsView(), this.A0A, this.A0B);
        com.facebook.ads.redexgen.core.LK lkA0A = super.A07.A0A(getAdDataBundle());
        this.A02.A0G().A00(lkA0A.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(super.A07);
        if (lkA0A.A00) {
            this.A0D.getVideoImplView().setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC0914Op(this));
        } else if (com.facebook.ads.redexgen.core.C0762Im.A1E(getAdContextWrapper())) {
            com.facebook.ads.redexgen.core.OB.A00(this.A0D.getVideoImplView(), com.facebook.ads.redexgen.core.C0762Im.A1F(getAdContextWrapper()), new com.facebook.ads.redexgen.core.ViewOnClickListenerC0915Oq(this));
        }
        if (c0911Om.A04().A1C()) {
            this.A05 = new com.facebook.ads.redexgen.core.UP(c0911Om);
            android.view.View view = this.A05;
            android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            addView(view, layoutParams2);
            getAdDetailsView().setVisibility(8);
        }
    }

    private com.facebook.ads.redexgen.core.T7 A01(com.facebook.ads.redexgen.core.C0911Om c0911Om) {
        com.facebook.ads.redexgen.core.T7 t7 = (com.facebook.ads.redexgen.core.T7) c0911Om.A02();
        int iA13 = A13(c0911Om.A09());
        android.widget.ImageView imageView = (android.widget.ImageView) c0911Om.A03();
        int i = com.facebook.ads.redexgen.core.AbstractC1058Ud.A0F;
        int i2 = com.facebook.ads.redexgen.core.AbstractC1058Ud.A0F;
        int toolbarHeight = com.facebook.ads.redexgen.core.AbstractC1058Ud.A0F;
        imageView.setPadding(i, i2, toolbarHeight, com.facebook.ads.redexgen.core.AbstractC1058Ud.A0F);
        int toolbarHeight2 = com.facebook.ads.redexgen.core.AbstractC1058Ud.A0G;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(toolbarHeight2, com.facebook.ads.redexgen.core.AbstractC1058Ud.A0G);
        int toolbarHeight3 = com.facebook.ads.redexgen.core.AbstractC1058Ud.A0E;
        layoutParams.setMargins(0, iA13, toolbarHeight3, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        if (getAdDataBundle().A1F() && t7 != null) {
            android.view.View videoView = t7.getVideoView();
            int paddingLeft = t7.getVideoView().getPaddingLeft();
            int paddingTop = t7.getVideoView().getPaddingTop();
            int paddingRight = t7.getVideoView().getPaddingRight();
            int toolbarHeight4 = t7.getVideoView().getPaddingBottom();
            videoView.setPadding(paddingLeft, paddingTop, paddingRight, toolbarHeight4 + A0U);
        }
        layoutParams2.addRule(13);
        addView(t7, layoutParams2);
        t7.addView(imageView, layoutParams);
        return t7;
    }

    private com.facebook.ads.redexgen.core.N5 A02(com.facebook.ads.redexgen.core.C0911Om c0911Om) {
        com.facebook.ads.redexgen.core.N5 n5A0B = c0911Om.A0B();
        n5A0B.A06(-1, com.facebook.ads.redexgen.core.AbstractC1058Ud.A0B);
        n5A0B.setPadding(com.facebook.ads.redexgen.core.AbstractC1058Ud.A0J, com.facebook.ads.redexgen.core.AbstractC1058Ud.A0J, com.facebook.ads.redexgen.core.AbstractC1058Ud.A0J, com.facebook.ads.redexgen.core.AbstractC1058Ud.A0J);
        android.widget.RelativeLayout.LayoutParams progressBarLayoutParams = new android.widget.RelativeLayout.LayoutParams(-1, com.facebook.ads.redexgen.core.AbstractC1058Ud.A0I);
        progressBarLayoutParams.addRule(12);
        addView(n5A0B, progressBarLayoutParams);
        return n5A0B;
    }

    private void A04() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0E();
            this.A0D.A0d(getAnimationPlugin());
        }
    }

    private void A05() {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(getContext());
        A0A(relativeLayout);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A0L, 0);
        android.widget.RelativeLayout relativeLayout2 = new android.widget.RelativeLayout(getContext());
        android.widget.RelativeLayout.LayoutParams appMetadataLayoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        appMetadataLayoutParams.setMargins(A0L, A0T, A0L, A0T);
        appMetadataLayoutParams.addRule(12);
        relativeLayout2.addView(relativeLayout, layoutParams2);
        com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui ctaButton = getCtaButton();
        ctaButton.setTextSize(14.0f);
        ctaButton.setIncludeFontPadding(false);
        ctaButton.setTextColor(-1);
        layoutParams2.addRule(0, ctaButton.getId());
        if (!getAdDataBundle().A1D()) {
            ctaButton.setPadding(A0J, A0J, A0J, A0J);
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(6, relativeLayout.getId());
            layoutParams.addRule(8, relativeLayout.getId());
            ctaButton.setBackgroundColor(-12549889);
        } else {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            com.facebook.ads.redexgen.core.M3.A0S(ctaButton, com.facebook.ads.redexgen.core.M3.A06(-16738826, A0I));
            ctaButton.setPadding(A0O, A0P, A0O, A0P);
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                ctaButton.setStateListAnimator(null);
            }
            com.facebook.ads.redexgen.core.M3.A0X(ctaButton);
        }
        layoutParams.addRule(11);
        relativeLayout2.addView(ctaButton, layoutParams);
        addView(relativeLayout2, appMetadataLayoutParams);
        relativeLayout2.bringToFront();
    }

    private void A06() {
        if (this.A04 == null) {
            return;
        }
        this.A07 = new com.facebook.ads.redexgen.core.M9(this.A04, 400, -this.A04.getToolbarHeight(), 0);
    }

    private void A07() {
        new com.facebook.ads.redexgen.core.JF(getAdDataBundle().A1U(), getAdEventManager()).A04(com.facebook.ads.redexgen.core.JE.A0x, null);
        if (!getAdInfo().A0Q()) {
            return;
        }
        this.A0F.set(true);
        com.facebook.ads.redexgen.core.M3.A0T(this);
        com.facebook.ads.redexgen.core.M3.A0H(this.A0D);
        com.facebook.ads.redexgen.core.M3.A0b(this.A0D, this.A0E, this.A0C, this.A00);
        com.facebook.ads.redexgen.core.M3.A0L(this.A04);
        this.A00 = (android.view.View) this.A06.A03(getCtaButton()).second;
        switch ((com.facebook.ads.redexgen.core.QZ) r2.first) {
            case A03:
                getAdDetailsView().setVisibility(0);
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, A13(this.A04), 0, 0);
                layoutParams.addRule(2, getAdDetailsView().getId());
                addView(this.A00, layoutParams);
                break;
            case A02:
                com.facebook.ads.redexgen.core.M3.A0b(getAdDetailsView());
                android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(com.facebook.ads.redexgen.core.AbstractC1058Ud.A0H, com.facebook.ads.redexgen.core.AbstractC1058Ud.A0H, com.facebook.ads.redexgen.core.AbstractC1058Ud.A0H, com.facebook.ads.redexgen.core.AbstractC1058Ud.A0H);
                addView(this.A00, layoutParams2);
                break;
        }
        if (getAdInfo().A0H().A00() >= 0) {
            this.A08 = true;
            if (this.A04 != null) {
                com.facebook.ads.redexgen.core.MQ mq = this.A04;
                if (A0H[4].charAt(31) != 'A') {
                    java.lang.String[] strArr = A0H;
                    strArr[7] = "UaTQnuhxewL8mviYe9uecfBlI4rRsh4E";
                    strArr[5] = "UwFrvZ1NGiSQNsqiRCXgjyhu92nLe3Sn";
                    mq.setToolbarActionMode(2);
                    this.A04.setProgressImmediate(0.0f);
                } else {
                    throw new java.lang.RuntimeException();
                }
            }
            this.A03 = new com.facebook.ads.redexgen.core.LH((int) getAdInfo().A0H().A00(), 20.0f, 20L, new android.os.Handler(android.os.Looper.getMainLooper()), new com.facebook.ads.redexgen.core.C1055Ua(this));
            this.A03.A07();
        }
    }

    private void A08() {
        if (this.A07 != null) {
            this.A07.A3u(true, false);
        }
        if (getAdDataBundle().A1F()) {
            return;
        }
        com.facebook.ads.redexgen.core.M9 adDetailsAnimation = getAdDetailsAnimation();
        java.lang.String[] strArr = A0H;
        if (strArr[7].charAt(16) == strArr[5].charAt(16)) {
            throw new java.lang.RuntimeException();
        }
        A0H[1] = "1INNplzEPPEJhw482VYN3vhqC3uVrete";
        if (adDetailsAnimation != null) {
            getAdDetailsAnimation().A3u(true, false);
        }
    }

    private void A0A(android.widget.RelativeLayout relativeLayout) {
        int i;
        java.lang.String formattingRatingCount;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0M, A0M);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        com.facebook.ads.redexgen.core.OU ou = new com.facebook.ads.redexgen.core.OU(this.A02);
        com.facebook.ads.redexgen.core.M3.A0M(ou, 0);
        com.facebook.ads.redexgen.core.M3.A0K(ou);
        new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(ou, this.A02).A05(A0M, A0M).A07(getAdDataBundle().A1S().A01());
        android.widget.TextView textView = new android.widget.TextView(this.A02);
        com.facebook.ads.redexgen.core.M3.A0K(textView);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(getAdDataBundle().A1O().A01().A06(true));
        textView.setText(getAdDataBundle().A1P().A0F().A08());
        textView.setTextSize(!getAdDataBundle().A1D() ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A02;
        if (!getAdDataBundle().A1D()) {
            i = A0S;
        } else {
            i = A0Q;
        }
        com.facebook.ads.redexgen.core.OW ow = new com.facebook.ads.redexgen.core.OW(c1199Zs, i, 5, A0R, -1);
        ow.setGravity(16);
        android.widget.LinearLayout.LayoutParams ratingCountParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
        android.widget.TextView textView2 = new android.widget.TextView(this.A02);
        textView2.setTextColor(getAdDataBundle().A1O().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        if (!getAdDataBundle().A1D()) {
            textView2.setTextSize(13.0f);
        }
        android.widget.LinearLayout.LayoutParams starRatingContainerParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
        starRatingContainerParams.leftMargin = A0K;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A02);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        android.widget.RelativeLayout.LayoutParams ratingInfoContainerParams = new android.widget.RelativeLayout.LayoutParams(-2, A0N);
        ratingInfoContainerParams.topMargin = A0K / 2;
        ratingInfoContainerParams.addRule(3, textView.getId());
        linearLayout.addView(ow, ratingCountParams);
        linearLayout.addView(textView2, starRatingContainerParams);
        android.widget.RelativeLayout.LayoutParams iconParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        iconParams.leftMargin = A0K;
        iconParams.addRule(1, ou.getId());
        iconParams.addRule(15);
        android.widget.RelativeLayout relativeLayout2 = new android.widget.RelativeLayout(getContext());
        relativeLayout2.addView(linearLayout, ratingInfoContainerParams);
        relativeLayout2.addView(textView);
        relativeLayout.addView(relativeLayout2, iconParams);
        relativeLayout.addView(ou, layoutParams);
        if (android.text.TextUtils.isEmpty(getAdDataBundle().A1P().A0F().A05())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        ow.setRating(java.lang.Float.parseFloat(getAdDataBundle().A1P().A0F().A05()));
        if (getAdDataBundle().A1P().A0F().A04() == null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(A03(0, 1, 108));
        if (!getAdDataBundle().A1D()) {
            formattingRatingCount = java.text.NumberFormat.getNumberInstance().format(java.lang.Integer.parseInt(getAdDataBundle().A1P().A0F().A04()));
        } else {
            formattingRatingCount = com.facebook.ads.redexgen.core.LY.A01(java.lang.Integer.parseInt(getAdDataBundle().A1P().A0F().A04()));
        }
        sb.append(formattingRatingCount);
        java.lang.String formattingRatingCount2 = A03(1, 1, 13);
        sb.append(formattingRatingCount2);
        java.lang.String formattingRatingCount3 = sb.toString();
        textView2.setText(formattingRatingCount3);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A0D(com.facebook.ads.redexgen.core.C9R c9r) {
        super.A0D(c9r);
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A0E(com.facebook.ads.redexgen.core.C9O c9o) {
        super.A0E(c9o);
        int iA00 = c9o.A00();
        int videoLengthMs = this.A0D.getDuration();
        int videoLengthMs2 = videoLengthMs - iA00;
        if (getAnimationPlugin() != null && videoLengthMs2 < 3000 && getAnimationPlugin().A0J()) {
            getAnimationPlugin().A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1058Ud, com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A0v() {
        super.A0v();
        A04();
        this.A04 = null;
        this.A05 = null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1058Ud, com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A10(com.facebook.ads.redexgen.core.C1F c1f, java.lang.String str, double d, android.os.Bundle bundle) {
        super.A10(c1f, str, d, bundle);
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        if (!bundle.getBoolean(A03(2, 31, 100), false)) {
            A08();
        }
        if (bundle.getBoolean(A03(57, 18, 77), false)) {
            A07();
        }
        if (bundle.getBoolean(A03(33, 24, 121), false)) {
            this.A0C.A07(this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final boolean A11() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final boolean A12(boolean z) {
        if (z && !this.A09 && !this.A0F.get()) {
            this.A0C.A07(this);
            return true;
        }
        if (!getAdInfo().A0Q()) {
            return false;
        }
        boolean z2 = this.A0F.get();
        if (A0H[4].charAt(31) == 'A') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0H;
        strArr[3] = "EPxoCM5ZHywZjaL2iUUSFMk3WFd5m6XL";
        strArr[6] = "lTBjgNJWw5Z4CB7iubQhWZLtOmC1X7yD";
        if (!z2) {
            this.A0D.A0a(com.facebook.ads.redexgen.core.EnumC0964Qn.A08);
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1058Ud
    public final void A14() {
        super.A14();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A9r(this.A0D);
        }
    }

    public final void A16() {
        getCtaButton().A09(A03(75, 9, 37));
    }

    public final void A17() {
        new com.facebook.ads.redexgen.core.JF(((com.facebook.ads.redexgen.core.AbstractC0907Oi) this).A06.A04().A1U(), getAdEventManager()).A04(com.facebook.ads.redexgen.core.JE.A0f, null);
        if (((com.facebook.ads.redexgen.core.AbstractC0907Oi) this).A06.A09() != null) {
            com.facebook.ads.redexgen.core.MQ mqA09 = ((com.facebook.ads.redexgen.core.AbstractC0907Oi) this).A06.A09();
            if (A0H[4].charAt(31) == 'A') {
                throw new java.lang.RuntimeException();
            }
            A0H[2] = "qVUXWES3bTCAG5k5pbCpCu4g17099rEp";
            mqA09.setVisibility(8);
            removeView(((com.facebook.ads.redexgen.core.AbstractC0907Oi) this).A06.A09());
        }
        removeView(this.A05);
        removeView(this.A0D);
        A04();
        removeView(getAdDetailsView());
        removeView(this.A0E);
        A15();
    }

    public final void A18(com.facebook.ads.redexgen.core.C9S c9s) {
        if (this.A05 != null) {
            this.A05.A13(c9s);
            this.A05.A0v();
            removeView(this.A05);
            this.A05 = null;
        }
        getAdDetailsView().setVisibility(0);
    }

    public final boolean A19() {
        return getAdInfo().A0Q();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public int getCloseButtonStyle() {
        if (this.A08) {
            return 2;
        }
        if (A19() && !this.A0F.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1058Ud, com.facebook.ads.redexgen.core.AbstractC0907Oi, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A05 != null) {
            com.facebook.ads.redexgen.core.UP up = this.A05;
            if (A0H[0].length() == 5) {
                throw new java.lang.RuntimeException();
            }
            A0H[4] = "EpyE2nRNkziEqwhglEeRfTluajKoT9IB";
            if (up.getVisibility() == 0) {
                getAdDetailsView().setVisibility(8);
            }
        }
    }

    public void setVideoAdViewListener(com.facebook.ads.redexgen.core.QB qb) {
        if (this.A05 != null) {
            this.A05.setVideoAdViewListener(qb);
        }
    }
}
