package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0563Ab extends com.facebook.ads.redexgen.core.U6 {
    public static byte[] A0W;
    public static java.lang.String[] A0X = {"uwiFFMiPjkxeIpnCelDmRbiHk5Vwnfgt", "wLfFuslsjBH4uPGwj2Xycf6hIgRvR8Oe", "HvNwre", "LU1P5nNd", "IrSP0rhp", "3tH6XBAURu1AudBFEixfPGQY1Q", "mKjuxDaulnRYw", "yhw0zrPGEZfB7fyQoDKXN69L0o"};
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public com.facebook.ads.redexgen.core.C1O A00;
    public com.facebook.ads.redexgen.core.LH A01;
    public com.facebook.ads.redexgen.core.EnumC0969Qs A02;
    public com.facebook.ads.redexgen.core.C0869Mw A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final com.facebook.ads.redexgen.core.C1199Zs A0C;
    public final com.facebook.ads.redexgen.core.OE A0D;
    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui A0E;
    public final com.facebook.ads.redexgen.core.Q4 A0F;
    public final com.facebook.ads.redexgen.core.C0951Qa A0G;
    public final com.facebook.ads.redexgen.core.TC A0H;
    public final com.facebook.ads.redexgen.core.T7 A0I;
    public final com.facebook.ads.redexgen.core.C9S A0J;
    public final com.facebook.ads.redexgen.core.AbstractC1012Sj A0K;
    public final com.facebook.ads.redexgen.core.AbstractC1010Sh A0L;
    public final com.facebook.ads.redexgen.core.AbstractC1006Sd A0M;
    public final com.facebook.ads.redexgen.core.AbstractC0990Rn A0N;
    public final com.facebook.ads.redexgen.core.R9 A0O;
    public final com.facebook.ads.redexgen.core.R8 A0P;
    public final com.facebook.ads.redexgen.core.QG A0Q;
    public final com.facebook.ads.redexgen.core.C0896Nx A0R;
    public final com.facebook.ads.redexgen.core.N5 A0S;
    public final com.facebook.ads.redexgen.core.M9 A0T;
    public final boolean A0U;
    public final boolean A0V;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0W, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 71);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0W = new byte[]{82, 94, 92, 31, 87, 80, 82, 84, 83, 94, 94, 90, 31, 80, 85, 66, 31, 88, 95, 69, 84, 67, 66, 69, 88, 69, 88, 80, 93, 31, 82, 93, 88, 82, 90, 84, 85, 54, 33, 51, 37, 54, 32, 33, 32, 27, 50, 45, 32, 33, 43, 105, 118, 123, 122, 112};
    }

    static {
        A0A();
        A0b = (int) (com.facebook.ads.redexgen.core.LP.A02 * 48.0f);
        A0Z = com.facebook.ads.redexgen.core.AbstractC03842p.A01(-1, 77);
        A0g = (int) (com.facebook.ads.redexgen.core.LP.A02 * 26.0f);
        A0h = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
        A0d = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
        A0e = (int) (com.facebook.ads.redexgen.core.LP.A02 * 44.0f);
        A0c = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
        A0f = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
        A0a = com.facebook.ads.redexgen.core.AbstractC03842p.A01(A0Z, 90);
        A0Y = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
    }

    public C0563Ab(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.N9 n9, int i, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.JF jf, int i2, int i3, int i4, boolean z, int i5, boolean z2, boolean z3, boolean z4, com.facebook.ads.redexgen.core.Q4 q4) {
        com.facebook.ads.redexgen.core.C1O c1oA00;
        super(c1199Zs, n9, j7, abstractC1341cD, i, z3, z4, mr);
        this.A04 = false;
        this.A05 = false;
        this.A07 = false;
        this.A0O = new com.facebook.ads.redexgen.core.B5(this);
        this.A0N = new com.facebook.ads.redexgen.core.C0586Ay(this);
        this.A0M = new com.facebook.ads.redexgen.core.C0583Av(this);
        this.A0P = new com.facebook.ads.redexgen.core.C0566Ae(this);
        this.A0K = new com.facebook.ads.redexgen.core.C0565Ad(this);
        this.A0L = new com.facebook.ads.redexgen.core.C0564Ac(this);
        this.A0C = c1199Zs;
        this.A0R = new com.facebook.ads.redexgen.core.C0896Nx(this.A0C, jf);
        this.A0S = new com.facebook.ads.redexgen.core.N5(this.A0C);
        this.A0A = i5;
        this.A0V = z2;
        this.A09 = i2;
        this.A0B = i3;
        this.A0F = q4;
        this.A08 = i4;
        this.A0U = z;
        this.A0G = new com.facebook.ads.redexgen.core.C0951Qa(this.A0C, j7, super.A05);
        if (i3 == 1) {
            c1oA00 = super.A05.A1O().A01();
        } else {
            c1oA00 = super.A05.A1O().A00();
        }
        this.A00 = c1oA00;
        this.A0I = new com.facebook.ads.redexgen.core.T7(this.A0C);
        this.A0I.getEventBus().A03(this.A0O, this.A0N, this.A0M, this.A0P, this.A0K, this.A0L);
        this.A0J = new com.facebook.ads.redexgen.core.C9S(c1199Zs, j7, this.A0I, abstractC1341cD.A1U());
        A09();
        this.A0I.setVideoURI(c04766f.A0S(super.A05.A1P().A0E().A08()));
        A08();
        com.facebook.ads.redexgen.core.LK lkA0A = super.A08.A0A(abstractC1341cD);
        this.A0C.A0G().A00(lkA0A.A01);
        this.A0D = A02();
        this.A0T = new com.facebook.ads.redexgen.core.M9(this.A0D, 400, 100, 0);
        this.A0T.A3u(true, false);
        this.A0Q = new com.facebook.ads.redexgen.core.QG(true);
        A0B();
        this.A0E = this.A0D.getCTAButton();
        if (lkA0A.A00) {
            this.A0I.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Pq
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.A00.A17(view);
                }
            });
        }
        com.facebook.ads.redexgen.core.M3.A0G(1001, this.A0E);
        A07();
        A06();
        this.A0D.bringToFront();
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A0C)) {
            this.A0C.A0A().AHO(this.A0I, super.A05.A1U(), true);
        }
        if (com.facebook.ads.redexgen.core.C0762Im.A1q(this.A0C)) {
            this.A0H = new com.facebook.ads.redexgen.core.TC(this.A0C, j7, this.A0I, super.A05.A1U(), this.A0J, null);
        } else {
            this.A0H = null;
        }
    }

    private com.facebook.ads.redexgen.core.C1059Ue A02() {
        java.lang.String strA05;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (super.A05.A0c().equals(A05(37, 14, 3))) {
            strA05 = com.facebook.ads.redexgen.core.EnumC0972Qv.A04.A03();
        } else {
            strA05 = A05(0, 37, 118);
        }
        com.facebook.ads.redexgen.core.C1059Ue c1059Ue = new com.facebook.ads.redexgen.core.C1059Ue(this.A0C, A0b, super.A05.A1P().A0F().A00() == com.facebook.ads.redexgen.core.C1K.A05, getColors(), super.A05.A1P().A0G().A06(), strA05, super.A07, super.A0A, super.A0C, super.A09, super.A05);
        c1059Ue.getCTAButton().getCtaActionHelper().A04(super.A05);
        c1059Ue.getCTAButton().setCreativeAsCtaLoggingHelper(super.A08);
        com.facebook.ads.redexgen.core.M3.A0G(1008, c1059Ue);
        c1059Ue.A0D(this.A0B);
        addView(c1059Ue, layoutParams);
        c1059Ue.setInfo(super.A05.A1P().A0F(), super.A05.A1P().A0G(), super.A05.A1U(), super.A05.A1S().A01(), null, null);
        return c1059Ue;
    }

    private void A06() {
        this.A0S.A06(-1, A0Z);
        this.A0S.setPadding(A0h, A0h, A0h, A0h);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, A0g);
        layoutParams.addRule(12);
        addView(this.A0S, layoutParams);
    }

    private void A07() {
        this.A0R.setPadding(A0d, A0d, A0d, A0d);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0e, A0e);
        layoutParams.setMargins(0, com.facebook.ads.redexgen.core.MQ.A00, A0c, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        android.view.ViewGroup.LayoutParams videoViewParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0I, videoViewParams);
        addView(this.A0R, layoutParams);
    }

    private void A08() {
        postDelayed(new com.facebook.ads.redexgen.core.U3(this), com.facebook.ads.redexgen.core.C0762Im.A0N(this.A0C));
    }

    private void A09() {
        this.A0I.A0c(this.A0S);
        this.A0I.A0c(this.A0R);
        if (!android.text.TextUtils.isEmpty(super.A05.A1P().A0E().A07())) {
            com.facebook.ads.redexgen.core.C7V c7v = new com.facebook.ads.redexgen.core.C7V(this.A0C);
            this.A0I.A0c(c7v);
            c7v.setImage(super.A05.A1P().A0E().A07());
        }
        this.A0I.A0c(new com.facebook.ads.redexgen.core.C7L(this.A0C));
    }

    private final void A0B() {
        android.view.View expandableLayout = this.A0D.getExpandableLayout();
        if (expandableLayout != null) {
            if (this.A03 != null) {
                com.facebook.ads.redexgen.core.QG qg = this.A0Q;
                com.facebook.ads.redexgen.core.C0869Mw c0869Mw = this.A03;
                java.lang.String[] strArr = A0X;
                if (strArr[5].length() != strArr[7].length()) {
                    throw new java.lang.RuntimeException();
                }
                A0X[1] = "yPUFQNIw4jpGFPLG5nXj9YsdQuCVJrWl";
                qg.A0I(c0869Mw);
            }
            com.facebook.ads.redexgen.core.C1O c1oA01 = super.A05.A1O().A01();
            this.A0Q.A0I(new com.facebook.ads.redexgen.core.C0867Mu(this.A0D.getCTAButton(), com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, -1, c1oA01.A09(true)));
            android.graphics.drawable.Drawable drawableA08 = com.facebook.ads.redexgen.core.M3.A08(A0Z, A0a, A0Y);
            android.graphics.drawable.Drawable endDrawable = com.facebook.ads.redexgen.core.M3.A05(c1oA01.A08(true), A0Y);
            this.A0Q.A0I(new com.facebook.ads.redexgen.core.C0870Mx(this.A0D.getCTAButton(), com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, drawableA08, endDrawable));
            this.A0Q.A0I(new com.facebook.ads.redexgen.core.C0868Mv(expandableLayout, 150, false));
            this.A0Q.A9r(this.A0I);
            this.A0Q.A0H(2300);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(com.facebook.ads.redexgen.core.C9O c9o) {
        if (this.A0I.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A02 && com.facebook.ads.redexgen.core.C0762Im.A1U(this.A0C)) {
            postDelayed(new com.facebook.ads.redexgen.core.U2(this, c9o), 5000L);
        }
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final void A0z() {
        super.A0z();
        if (this.A01 != null) {
            com.facebook.ads.redexgen.core.LH lh = this.A01;
            java.lang.String[] strArr = A0X;
            if (strArr[4].length() != strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0X;
            strArr2[4] = "vVds5dTr";
            strArr2[3] = "mwltsewL";
            lh.A06();
        }
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A0C)) {
            this.A0C.A0A().AHC(this.A0I);
        }
        if (this.A0H != null) {
            this.A0H.A05();
        }
        if (this.A0I != null) {
            this.A0I.getEventBus().A04(this.A0O, this.A0N, this.A0M, this.A0P, this.A0K, this.A0L);
            com.facebook.ads.redexgen.core.M3.A0H(this.A0I);
            this.A0I.A0V();
        }
        this.A0J.A0o();
        com.facebook.ads.redexgen.core.M3.A0b(this.A0I, this.A0S, this.A0R);
        super.A0C.A0V();
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final void A11() {
        this.A0C.A0E().A4b();
        this.A04 = true;
        com.facebook.ads.redexgen.core.M3.A0T(this);
        com.facebook.ads.redexgen.core.M3.A0H(this.A0I);
        com.facebook.ads.redexgen.core.M3.A0b(this.A0I, this.A0S, this.A0R);
        android.util.Pair<com.facebook.ads.redexgen.core.QZ, android.view.View> pairA03 = this.A0G.A03(this.A0E);
        android.view.View view = (android.view.View) pairA03.second;
        com.facebook.ads.redexgen.core.M3.A0G(com.json.mediationsdk.utils.IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE, view);
        switch (com.facebook.ads.redexgen.core.C0942Pr.A00[((com.facebook.ads.redexgen.core.QZ) pairA03.first).ordinal()]) {
            case 1:
                this.A0D.setVisibility(0);
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, com.facebook.ads.redexgen.core.MQ.A00, 0, 0);
                layoutParams.addRule(2, this.A0D.getId());
                addView(view, layoutParams);
                break;
            case 2:
                com.facebook.ads.redexgen.core.M3.A0b(this.A0D);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(A0f, A0f, A0f, A0f);
                addView(view, layoutParams2);
                break;
        }
        if (this.A08 == 0 && this.A0U) {
            if (this.A0V) {
                this.A0F.AHI();
            }
            this.A01 = new com.facebook.ads.redexgen.core.LH(this.A0A, 100.0f, 100L, new android.os.Handler(android.os.Looper.getMainLooper()), new com.facebook.ads.redexgen.core.U1(this));
            this.A01.A07();
            return;
        }
        this.A05 = true;
        this.A0F.ADa(true);
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final void A12() {
        this.A0I.setVolume(super.A05.A1P().A0E().A09() ? 0.0f : 1.0f);
        this.A0I.A0b(com.facebook.ads.redexgen.core.EnumC0969Qs.A02, 20);
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final void A13(boolean z) {
        if (this.A01 != null) {
            this.A01.A06();
        }
        if (this.A0I.A0j()) {
            return;
        }
        this.A02 = this.A0I.getVideoStartReason();
        this.A06 = z;
        this.A0I.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final void A14(boolean z) {
        if (this.A01 != null && !this.A01.A05()) {
            this.A01.A07();
        }
        if (this.A04 || this.A0I.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A06 || this.A02 == null) {
            return;
        }
        if (!this.A06 || z) {
            this.A0I.A0b(this.A02, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final boolean A15() {
        if (this.A08 != 2 && super.A05.A1P().A0Q() && !this.A04) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final boolean A16() {
        return this.A04;
    }

    public final /* synthetic */ void A17(android.view.View view) {
        this.A0E.A09(A05(51, 5, 88));
    }

    @Override // com.facebook.ads.redexgen.core.U6, com.facebook.ads.redexgen.core.LJ
    public final void ACa() {
        super.A0A.A4P(super.A05.A0Y());
    }

    public com.facebook.ads.redexgen.core.C1O getColors() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public com.facebook.ads.redexgen.core.Q3 getFullScreenAdStyle() {
        return new com.facebook.ads.redexgen.core.Q3(true, com.facebook.ads.redexgen.core.Q3.A06, super.A05.A1O().A01(), com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui.A08(super.A05), super.A05.A1O().A01().A07(true), super.A05.A1P().A0E().A07());
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public com.facebook.ads.redexgen.core.C0842Lv getTouchDataRecorder() {
        return super.A09;
    }

    @Override // com.facebook.ads.redexgen.core.U6, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.facebook.ads.redexgen.core.C1O c1oA00;
        super.onConfigurationChanged(configuration);
        if (!this.A04) {
            if (configuration.orientation == 1) {
                c1oA00 = super.A05.A1O().A01();
            } else {
                com.facebook.ads.redexgen.core.C1B c1bA1O = super.A05.A1O();
                java.lang.String[] strArr = A0X;
                if (strArr[4].length() != strArr[3].length()) {
                    throw new java.lang.RuntimeException();
                }
                A0X[1] = "ZWQFADQdeKHmDIXasxpY6pydlWSUwrFV";
                c1oA00 = c1bA1O.A00();
            }
            this.A00 = c1oA00;
            this.A0E.setViewShowsOverMedia(true);
            this.A0E.setUpButtonColors(this.A00);
            this.A0D.A0D(configuration.orientation);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        android.view.View expandableLayout = this.A0D.getExpandableLayout();
        if (expandableLayout != null && z && this.A03 == null) {
            this.A03 = new com.facebook.ads.redexgen.core.C0869Mw(expandableLayout, com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, expandableLayout.getHeight(), 0);
            this.A0Q.A0I(this.A03);
            this.A0Q.A0G();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A14(false);
        } else {
            A13(false);
        }
    }
}
