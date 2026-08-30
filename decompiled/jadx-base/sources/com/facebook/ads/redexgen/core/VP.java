package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class VP extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.MS {
    public static byte[] A0F;
    public android.view.View A00;
    public com.facebook.ads.redexgen.core.LH A01;
    public com.facebook.ads.redexgen.core.Q7 A02;
    public boolean A03;
    public boolean A04;
    public com.facebook.ads.redexgen.core.C1B A05;
    public com.facebook.ads.redexgen.core.C0953Qc A06;
    public boolean A07;
    public final com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC0837Lq A08;
    public final com.facebook.ads.redexgen.core.MR A09;
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A0A;
    public final com.facebook.ads.redexgen.core.C1199Zs A0B;
    public final com.facebook.ads.redexgen.core.J7 A0C;
    public final com.facebook.ads.redexgen.core.JF A0D;
    public final com.facebook.ads.redexgen.core.MQ A0E;

    static {
        A0P();
    }

    public static java.lang.String A0M(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 37);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0P() {
        A0F = new byte[]{-93, -81, -83, 110, -90, -95, -93, -91, -94, -81, -81, -85, 110, -95, -92, -77, 110, -87, -82, -76, -91, -78, -77, -76, -87, -76, -87, -95, -84, 110, -87, -83, -80, -78, -91, -77, -77, -87, -81, -82, 110, -84, -81, -89, -89, -91, -92};
    }

    public abstract boolean A0b();

    public abstract int getCloseButtonStyle();

    public VP(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        super(c1199Zs);
        this.A07 = false;
        this.A04 = false;
        this.A03 = false;
        this.A0B = c1199Zs;
        this.A0C = j7;
        this.A09 = mr;
        this.A08 = new com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC0837Lq(this);
        this.A0A = abstractC1341cD;
        this.A0D = new com.facebook.ads.redexgen.core.JF(this.A0A.A1U(), this.A0C);
        this.A0E = new com.facebook.ads.internal.view.FullScreenAdToolbar(this.A0B, getAudienceNetworkListener(), this.A0D, 0, this.A0A.A1J(), false);
    }

    private com.facebook.ads.redexgen.core.C1O A0K(int i) {
        if (i == 1) {
            return this.A05.A01();
        }
        return this.A05.A00();
    }

    private void A0N() {
        removeAllViews();
        com.facebook.ads.redexgen.core.M3.A0J(this);
    }

    private void A0O() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        if (A0Y() && this.A02 == null) {
            this.A04 = true;
            this.A02 = new com.facebook.ads.redexgen.core.Q5(this.A0B, this.A0A.A1P().A0F(), this.A0A.A1S()).A0A(this.A0A.A1O().A01()).A0F();
            com.facebook.ads.redexgen.core.JH.A04(this.A02, this.A0D, com.facebook.ads.redexgen.core.JE.A0U);
            this.A09.A3p(this, 0, layoutParams);
            this.A09.A3p(this.A02, 1, layoutParams);
            this.A02.A04(new com.facebook.ads.redexgen.core.VR(this));
            return;
        }
        this.A09.A3p(this, 0, layoutParams);
    }

    private void A0Q(com.facebook.ads.redexgen.core.C1O c1o, boolean z) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, this.A0E.getToolbarHeight());
        layoutParams.addRule(10);
        this.A0E.A09(c1o, com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui.A08(this.A0A));
        addView(this.A0E, layoutParams);
    }

    public final void A0T() {
        if (this.A00 == null || !(this.A00 instanceof com.facebook.ads.redexgen.core.AbstractC0907Oi)) {
            return;
        }
        if (A0Z()) {
            ((com.facebook.ads.redexgen.core.AbstractC0907Oi) this.A00).A0z();
        } else {
            ((com.facebook.ads.redexgen.core.AbstractC0907Oi) this.A00).A0y();
        }
    }

    public final void A0U(int i) {
        this.A01 = new com.facebook.ads.redexgen.core.LH(i, new com.facebook.ads.redexgen.core.VQ(this, i));
        this.A03 = true;
        A0T();
        this.A01.A07();
    }

    public final void A0V(android.view.View view, boolean z, int i) {
        this.A0E.setFullscreen(z);
        this.A00 = view;
        this.A08.A05(com.facebook.ads.redexgen.core.EnumC0836Lp.A02);
        A0N();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z ? 0 : this.A0E.getToolbarHeight(), 0, 0);
        layoutParams.addRule(12);
        addView(view, layoutParams);
        com.facebook.ads.redexgen.core.C1O c1oA0K = A0K(i);
        A0Q(c1oA0K, z);
        com.facebook.ads.redexgen.core.M3.A0M(this, c1oA0K.A07(false));
        if (this.A09 != null) {
            A0O();
            if (z && android.os.Build.VERSION.SDK_INT >= 19) {
                this.A08.A05(com.facebook.ads.redexgen.core.EnumC0836Lp.A03);
            }
        }
    }

    public final void A0W(com.facebook.ads.redexgen.core.C5Q c5q) {
        this.A08.A04(c5q.A05().getWindow());
        this.A05 = this.A0A.A1O();
        com.facebook.ads.redexgen.core.C1F c1fA1P = null;
        com.facebook.ads.redexgen.core.C1F adInfo = this.A0A.A1P();
        if (adInfo != null) {
            com.facebook.ads.redexgen.core.C1F adInfo2 = this.A0A.A1P();
            if (adInfo2 != null) {
                c1fA1P = this.A0A.A1P();
            }
        }
        this.A0E.setPageDetails(this.A0A.A1S(), this.A0A.A1U(), c1fA1P != null ? c1fA1P.A0E().A03() : 0, this.A0A.A1T());
        this.A0E.setToolbarListener(new com.facebook.ads.redexgen.core.VT(this, c5q));
    }

    public final void A0X(com.facebook.ads.redexgen.core.C5Q c5q) {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new com.facebook.ads.redexgen.core.AnimationAnimationListenerC0850Md(this, this, c5q));
        startAnimation(alphaAnimation);
    }

    public final boolean A0Y() {
        return !this.A0A.A1W().isEmpty() && this.A0A.A1P().A0R();
    }

    public final boolean A0Z() {
        return this.A03;
    }

    public final boolean A0a() {
        return this.A04;
    }

    public void ACz(boolean z) {
        if (this.A01 != null && this.A01.A05()) {
            this.A01.A06();
        }
    }

    public void ADN(boolean z) {
        if (this.A01 != null && !this.A01.A04()) {
            this.A01.A07();
        }
    }

    public com.facebook.ads.redexgen.core.J7 getAdEventManager() {
        return this.A0C;
    }

    public com.facebook.ads.redexgen.core.MR getAudienceNetworkListener() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public java.lang.String getCurrentClientToken() {
        return this.A0A.A1U();
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A08.A03();
        this.A0E.setToolbarListener(null);
        A0N();
    }

    public void setImpressionRecordingFlag(com.facebook.ads.redexgen.core.C0842Lv c0842Lv) {
        c0842Lv.A05();
        if (getAudienceNetworkListener() != null) {
            if (this.A07) {
                getAudienceNetworkListener().A4P(new com.facebook.ads.redexgen.core.V5().A7Z());
            } else {
                getAudienceNetworkListener().A4P(A0M(0, 47, 27));
            }
        }
    }

    public void setListener(com.facebook.ads.redexgen.core.MR mr) {
    }

    public void setServerSideRewardHandler(com.facebook.ads.redexgen.core.C0953Qc c0953Qc) {
        this.A06 = c0953Qc;
    }
}
