package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VJ extends com.facebook.ads.redexgen.core.AbstractC0853Mg {
    public com.facebook.ads.redexgen.core.C9S A00;
    public boolean A01;
    public boolean A02;
    public final android.view.ViewGroup A03;
    public final com.facebook.ads.redexgen.core.C04766f A04;
    public final com.facebook.ads.redexgen.core.J7 A05;
    public final com.facebook.ads.redexgen.core.T7 A06;
    public final com.facebook.ads.redexgen.core.AbstractC1012Sj A07;
    public final com.facebook.ads.redexgen.core.AbstractC1010Sh A08;
    public final com.facebook.ads.redexgen.core.PC A09;
    public final com.facebook.ads.redexgen.core.OD A0A;
    public final com.facebook.ads.redexgen.core.C0896Nx A0B;
    public final com.facebook.ads.redexgen.core.AbstractC0986Rj A0C;
    public final com.facebook.ads.redexgen.core.C0987Rk A0D;

    public VJ(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.JF jf, android.view.View.OnClickListener onClickListener) {
        super(c1199Zs, onClickListener);
        this.A02 = false;
        this.A01 = false;
        this.A07 = new com.facebook.ads.redexgen.core.C0605Bt(this);
        this.A08 = new com.facebook.ads.redexgen.core.C0604Bs(this);
        this.A05 = j7;
        this.A04 = c04766f;
        this.A0C = A00();
        this.A0D = A07();
        this.A03 = new android.widget.FrameLayout(c1199Zs);
        addView(this.A03, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.A06 = A01(jf);
        this.A0A = A04();
        this.A09 = A03();
        this.A0B = A06(jf);
        A0C();
    }

    private com.facebook.ads.redexgen.core.VL A00() {
        return new com.facebook.ads.redexgen.core.VL(this);
    }

    private com.facebook.ads.redexgen.core.T7 A01(com.facebook.ads.redexgen.core.JF jf) {
        com.facebook.ads.redexgen.core.T7 t7 = new com.facebook.ads.redexgen.core.T7(super.A01);
        com.facebook.ads.redexgen.core.M3.A0K(t7);
        t7.setFunnelLoggingHandler(jf);
        t7.getEventBus().A03(this.A07, this.A08);
        if (com.facebook.ads.redexgen.core.C0762Im.A1O(super.A01)) {
            t7.setVolume(0.0f);
        }
        if (!com.facebook.ads.redexgen.core.C0762Im.A1J(super.A01)) {
            t7.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC0855Mi(this));
        }
        android.widget.RelativeLayout.LayoutParams videoLayoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        videoLayoutParams.addRule(13);
        addView(t7, videoLayoutParams);
        return t7;
    }

    private com.facebook.ads.redexgen.core.PC A03() {
        com.facebook.ads.redexgen.core.PC pc = new com.facebook.ads.redexgen.core.PC(super.A01);
        pc.setTextColor(-1);
        com.facebook.ads.redexgen.core.M3.A0Y(pc, false, 12);
        pc.setGravity(17);
        this.A06.A0c(pc);
        return pc;
    }

    private com.facebook.ads.redexgen.core.OD A04() {
        com.facebook.ads.redexgen.core.OD od = new com.facebook.ads.redexgen.core.OD(super.A01);
        this.A06.A0c(od);
        return od;
    }

    private com.facebook.ads.redexgen.core.C0896Nx A06(com.facebook.ads.redexgen.core.JF jf) {
        com.facebook.ads.redexgen.core.C0896Nx c0896Nx = new com.facebook.ads.redexgen.core.C0896Nx(super.A01, jf, true);
        c0896Nx.setBackgroundPaintColor(855638016);
        this.A06.A0c(c0896Nx);
        return c0896Nx;
    }

    private com.facebook.ads.redexgen.core.C0987Rk A07() {
        return new com.facebook.ads.redexgen.core.C0987Rk(this, 50, true, new java.lang.ref.WeakReference(this.A0C), super.A01);
    }

    private void A08() {
        if (getVisibility() == 0 && this.A01 && hasWindowFocus()) {
            this.A0D.A0U();
        } else {
            this.A0D.A0V();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0853Mg
    public final void A0A() {
        this.A0D.A0V();
        this.A06.getEventBus().A04(this.A07, this.A08);
        this.A06.A0V();
        com.facebook.ads.redexgen.core.M3.A0J(this.A06);
        if (this.A00 != null) {
            this.A00.A0o();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0853Mg
    public final void A0B() {
        this.A0B.A09();
        this.A02 = true;
        this.A0D.A0U();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0853Mg
    public final void A0C() {
        super.A0C();
        if (com.facebook.ads.redexgen.core.C0762Im.A1P(super.A01)) {
            com.facebook.ads.redexgen.core.M3.A0J(this.A0A);
            this.A0A.setLayoutParams(A00(true, false));
            addView(this.A0A);
        }
        if (com.facebook.ads.redexgen.core.C0762Im.A1L(super.A01)) {
            com.facebook.ads.redexgen.core.M3.A0J(this.A09);
            this.A09.setLayoutParams(A00(true, true));
            addView(this.A09);
        }
        if (com.facebook.ads.redexgen.core.C0762Im.A1N(super.A01)) {
            com.facebook.ads.redexgen.core.M3.A0J(this.A0B);
            this.A0B.setLayoutParams(A00(false, false));
            addView(this.A0B);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0853Mg
    public final boolean A0D() {
        return this.A06.A0h();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0853Mg
    public final boolean A0E() {
        if (getMeasuredWidth() <= 0 || this.A06.getMeasuredWidth() <= 0) {
            return true;
        }
        int measuredWidth = (int) (((double) (getMeasuredWidth() - this.A06.getMeasuredWidth())) / 2.0d);
        int i = com.facebook.ads.redexgen.core.AbstractC0853Mg.A05;
        int widthGap = com.facebook.ads.redexgen.core.AbstractC0853Mg.A04;
        return measuredWidth > i + (widthGap * 2);
    }

    public final com.facebook.ads.redexgen.core.VJ A0F(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.A06.setVideoURI(this.A04.A0S(str2));
        this.A00 = new com.facebook.ads.redexgen.core.C9S(super.A01, this.A05, this.A06, str);
        if (str3 != null && !android.text.TextUtils.isEmpty(str3)) {
            new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A03, super.A01).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new com.facebook.ads.redexgen.core.VK(this)).A07(str3);
        }
        if (str5 != null) {
            this.A0A.setPlayAccessibilityLabel(str4);
        }
        if (str5 != null) {
            this.A0A.setPauseAccessibilityLabel(str5);
        }
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0853Mg
    public int getMediaViewId() {
        return this.A06.getId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A01 = true;
        A08();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A01 = false;
        A08();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        A08();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A08();
    }
}
