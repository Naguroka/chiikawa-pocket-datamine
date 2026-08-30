package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QM extends android.widget.FrameLayout {
    public static final int A08 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
    public com.facebook.ads.redexgen.core.C0602Bq A00;
    public com.facebook.ads.redexgen.core.TC A01;
    public com.facebook.ads.redexgen.core.C9S A02;
    public com.facebook.ads.redexgen.core.C0896Nx A03;
    public com.facebook.ads.redexgen.core.C7V A04;
    public com.facebook.ads.redexgen.core.C7G A05;
    public final com.facebook.ads.redexgen.core.C1199Zs A06;
    public final com.facebook.ads.redexgen.core.JF A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A04(com.facebook.ads.redexgen.core.J7 j7, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        A02();
        this.A02 = new com.facebook.ads.redexgen.core.C9S(this.A06, j7, this.A00, str, null, map);
        if (com.facebook.ads.redexgen.core.C0762Im.A1q(this.A06)) {
            this.A01 = new com.facebook.ads.redexgen.core.TC(this.A06, j7, this.A00, str, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public QM(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.JF jf) {
        super(c1199Zs);
        this.A07 = jf;
        this.A06 = c1199Zs;
        setUpView(c1199Zs);
    }

    public final void A01() {
        this.A00.A0e(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A05();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0o();
            this.A02 = null;
        }
    }

    public final void A03(com.facebook.ads.redexgen.core.AbstractC05348x abstractC05348x) {
        this.A00.getEventBus().A05(abstractC05348x);
    }

    public final void A05(com.facebook.ads.redexgen.core.EnumC0969Qs enumC0969Qs) {
        this.A00.A0b(enumC0969Qs, 13);
    }

    public final boolean A06() {
        return this.A00.A0l();
    }

    public com.facebook.ads.redexgen.core.T7 getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return this.A00.getVolume();
    }

    public void setPlaceholderUrl(java.lang.String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A00.A0X();
        this.A04 = new com.facebook.ads.redexgen.core.C7V(c1199Zs);
        this.A00.A0c(this.A04);
        this.A03 = new com.facebook.ads.redexgen.core.C0896Nx(c1199Zs, this.A07);
        this.A00.A0c(new com.facebook.ads.redexgen.core.C8S(c1199Zs));
        this.A00.A0c(this.A03);
        this.A05 = new com.facebook.ads.redexgen.core.C7G(c1199Zs, true, this.A07);
        this.A00.A0c(this.A05);
        this.A00.A0c(new com.facebook.ads.redexgen.core.OY(this.A05, com.facebook.ads.redexgen.core.R5.A02, true, true));
        if (!this.A00.A0g()) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        this.A00.addView(this.A03);
    }

    private void setUpVideo(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A00 = new com.facebook.ads.redexgen.core.C0602Bq(c1199Zs);
        this.A00.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        com.facebook.ads.redexgen.core.M3.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new com.facebook.ads.redexgen.core.QL(this));
    }

    private void setUpView(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        setUpVideo(c1199Zs);
        setUpPlugins(c1199Zs);
    }

    public void setVideoURI(java.lang.String str) {
        this.A00.setVideoURI(str);
    }

    public void setVolume(float f) {
        this.A00.setVolume(f);
        this.A03.A09();
    }
}
