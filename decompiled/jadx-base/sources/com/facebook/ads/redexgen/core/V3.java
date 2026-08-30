package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class V3 extends com.facebook.ads.redexgen.core.NE {
    public static java.lang.String[] A03 = {"ps9u6Kn8p", "fRCCllxRFm9XYnsS5Nz0CDYYbd8rz98F", "veZY5LUK4HkumILqtvhVtf9OT9QK1Jmh", "8c6Edyt19YE2bwpDp37rWBgdyfN4I4si", "Dgwj6SSLqT", "biYcUlACC5CMDg3zbjwwDR7mq5XP76DA", "rp5V5gFYHfFnaijOqqdMDMWavMrEx7HP", "ycj43TNZcka4uMSCxDz6fuqQ2r9gi3g6"};
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    public final android.widget.RelativeLayout A00;
    public final com.facebook.ads.redexgen.core.C2S A01;
    public final com.facebook.ads.redexgen.core.C1199Zs A02;

    public V3(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str, com.facebook.ads.redexgen.core.C1Z c1z, com.facebook.ads.redexgen.core.MS ms, com.facebook.ads.redexgen.core.MR mr) {
        super(c1199Zs, j7, str, c1z, ms, mr);
        this.A02 = c1199Zs;
        this.A01 = com.facebook.ads.redexgen.core.C2T.A00(c1199Zs.A01());
        this.A00 = new android.widget.RelativeLayout(getContext());
        addView(this.A00, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        com.facebook.ads.redexgen.core.M3.A0M(this.A00, -1728053248);
        this.A00.setOnClickListener(new com.facebook.ads.redexgen.core.NJ(this));
    }

    public static android.widget.RelativeLayout.LayoutParams A0B(boolean z) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0C() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new android.transition.ChangeBounds()).addTransition(new android.transition.Explode());
            com.facebook.ads.redexgen.core.M3.A0V(this, transitionSet);
            return;
        }
        com.facebook.ads.redexgen.core.M3.A0T(this);
    }

    @Override // com.facebook.ads.redexgen.core.NE
    public final void A0L() {
        com.facebook.ads.redexgen.core.C2W c2wA0A = this.A01.A0A();
        com.facebook.ads.redexgen.core.NT nt = new com.facebook.ads.redexgen.core.NT(this.A02);
        nt.setInfo(com.facebook.ads.redexgen.core.MB.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        nt.setOnClickListener(new com.facebook.ads.redexgen.core.NK(this));
        com.facebook.ads.redexgen.core.C2W c2wA0B = this.A01.A0B();
        com.facebook.ads.redexgen.core.NT nt2 = new com.facebook.ads.redexgen.core.NT(this.A02);
        nt2.setInfo(com.facebook.ads.redexgen.core.MB.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        nt2.setOnClickListener(new com.facebook.ads.redexgen.core.NL(this));
        com.facebook.ads.redexgen.core.NT nt3 = new com.facebook.ads.redexgen.core.NT(this.A02);
        nt3.setInfo(com.facebook.ads.redexgen.core.MB.AD_CHOICES_ICON, this.A01.A0M(), "");
        nt3.setOnClickListener(new com.facebook.ads.redexgen.core.NM(this));
        android.widget.LinearLayout.LayoutParams itemParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04 * 2, A04, A04 * 2, A04);
        com.facebook.ads.redexgen.core.M3.A0M(linearLayout, -1);
        if (!c2wA0A.A05().isEmpty()) {
            linearLayout.addView(nt, itemParams);
        }
        if (!c2wA0B.A05().isEmpty()) {
            linearLayout.addView(nt2, itemParams);
        }
        linearLayout.addView(nt3, itemParams);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.core.NE
    public final void A0M() {
        com.facebook.ads.redexgen.core.M3.A0I(this);
        this.A00.removeAllViews();
        com.facebook.ads.redexgen.core.M3.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.core.NE
    public final void A0N(com.facebook.ads.redexgen.core.C2W c2w, com.facebook.ads.redexgen.core.C2U c2u) {
        java.lang.String strA0E;
        int i;
        java.lang.String strA01;
        if (c2u == com.facebook.ads.redexgen.core.C2U.A05) {
            return;
        }
        boolean z = c2u == com.facebook.ads.redexgen.core.C2U.A06;
        com.facebook.ads.redexgen.core.NC nc = new com.facebook.ads.redexgen.core.NC(this.A02, this.A0B);
        if (z) {
            com.facebook.ads.redexgen.core.C2S c2s = this.A01;
            if (A03[4].length() != 10) {
                throw new java.lang.RuntimeException();
            }
            A03[6] = "KfE81dulHFmzGO7NxqDM7oaE1pV2dKkX";
            strA0E = c2s.A0F();
        } else {
            strA0E = this.A01.A0E();
        }
        com.facebook.ads.redexgen.core.NC ncA0E = nc.A0I(strA0E).A0H(this.A01.A0D()).A0F(c2w.A04()).A0E(z ? com.facebook.ads.redexgen.core.MB.REPORT_AD : com.facebook.ads.redexgen.core.MB.HIDE_AD);
        if (z) {
            i = -552389;
        } else {
            i = -13272859;
        }
        com.facebook.ads.redexgen.core.NC ncA0D = ncA0E.A0D(i);
        if (this.A0A != null) {
            com.facebook.ads.redexgen.core.C1Z c1z = this.A0A;
            if (A03[1].charAt(11) != 'X') {
                strA01 = c1z.A01();
            } else {
                A03[0] = "vLdx3pZGf";
                strA01 = c1z.A01();
            }
        } else {
            strA01 = "";
        }
        com.facebook.ads.redexgen.core.ND adHiddenView = ncA0D.A0G(strA01).A0M();
        com.facebook.ads.redexgen.core.M3.A0M(adHiddenView, -1);
        com.facebook.ads.redexgen.core.M3.A0T(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A0B(true));
    }

    @Override // com.facebook.ads.redexgen.core.NE
    public final void A0O(com.facebook.ads.redexgen.core.C2W c2w, com.facebook.ads.redexgen.core.C2U c2u) {
        java.lang.String strA0H;
        boolean z = c2u == com.facebook.ads.redexgen.core.C2U.A06;
        com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A02;
        com.facebook.ads.redexgen.core.NG ng = this.A0B;
        if (z) {
            strA0H = this.A01.A0L();
        } else {
            strA0H = this.A01.A0H();
        }
        com.facebook.ads.redexgen.core.NW nw = new com.facebook.ads.redexgen.core.NW(c1199Zs, c2w, ng, strA0H, z ? com.facebook.ads.redexgen.core.MB.REPORT_AD : com.facebook.ads.redexgen.core.MB.HIDE_AD);
        nw.setClickable(true);
        com.facebook.ads.redexgen.core.M3.A0M(nw, -1);
        nw.setPadding(A04 * 2, A04, A04 * 2, A04);
        A0C();
        this.A00.removeAllViews();
        android.widget.RelativeLayout relativeLayout = this.A00;
        java.lang.String[] strArr = A03;
        if (strArr[3].charAt(9) == strArr[5].charAt(9)) {
            throw new java.lang.RuntimeException();
        }
        A03[1] = "OoQvJ70CiRWXlhIiWSDPNsGTFrOY4nX1";
        relativeLayout.addView(nw, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.core.NE
    public final boolean A0P() {
        return false;
    }
}
