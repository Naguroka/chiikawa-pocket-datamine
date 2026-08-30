package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BZ extends com.facebook.ads.redexgen.core.UO {
    public com.facebook.ads.redexgen.core.C0872Mz A00;
    public com.facebook.ads.redexgen.core.PF A01;
    public com.facebook.ads.redexgen.core.QM A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public android.widget.RelativeLayout A06;
    public com.facebook.ads.redexgen.core.TV A07;
    public final com.facebook.ads.redexgen.core.C1199Zs A08;
    public final com.facebook.ads.redexgen.core.AbstractC1012Sj A09;
    public final com.facebook.ads.redexgen.core.AbstractC1006Sd A0A;
    public final com.facebook.ads.redexgen.core.AbstractC0990Rn A0B;
    public final com.facebook.ads.redexgen.core.R9 A0C;
    public final com.facebook.ads.redexgen.core.AbstractC0956Qf A0D;
    public final java.lang.String A0E;
    public final android.graphics.Paint A0F;
    public final android.graphics.Path A0G;
    public final android.graphics.RectF A0H;
    public final com.facebook.ads.redexgen.core.C0911Om A0I;
    public static java.lang.String[] A0J = {"MpRqvkZj1q70y", "JmeA7cKwz52Cf66UfzrPr0LMRH4SYAx7", "6sdDVsKAMYqDcEUPGSGZSzHS1QCr5tGd", "kTGZxaoWJV94XtNMqSwvdL", "Mc6tnSsqpweEwwZBrEzxWewdD5U0ZBnH", "pH8A6EuZ6tOwC2LEaYgoPeYfMAE", "hIXMP87egv28CzL5Z81pRvvAccgq29VA", "kjeLkimcHFb7T02SebLVQF"};
    public static final int A0L = (int) (com.facebook.ads.redexgen.core.LP.A02 * 0.0f);
    public static final int A0M = (int) (com.facebook.ads.redexgen.core.LP.A02 * 9.0f);
    public static final int A0K = (int) (com.facebook.ads.redexgen.core.LP.A02 * 9.0f);

    public BZ(com.facebook.ads.redexgen.core.C0911Om c0911Om, boolean z, java.lang.String str, com.facebook.ads.redexgen.core.TV tv) {
        super(c0911Om, z);
        this.A0G = new android.graphics.Path();
        this.A0H = new android.graphics.RectF();
        this.A0D = new com.facebook.ads.redexgen.core.C0596Bk(this);
        this.A09 = new com.facebook.ads.redexgen.core.C0595Bj(this);
        this.A0B = new com.facebook.ads.redexgen.core.C0594Bi(this);
        this.A0A = new com.facebook.ads.redexgen.core.C0591Bf(this);
        this.A0C = new com.facebook.ads.redexgen.core.C0590Be(this);
        this.A0I = c0911Om;
        this.A07 = tv;
        this.A0E = str;
        this.A08 = c0911Om.A05();
        setGravity(17);
        setPadding(A0L, 0, A0L, A0L);
        com.facebook.ads.redexgen.core.M3.A0M(this, 0);
        setUpView(this.A08);
        this.A0F = new android.graphics.Paint();
        this.A0F.setColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.A0F.setStyle(android.graphics.Paint.Style.FILL);
        this.A0F.setAlpha(16);
        this.A0F.setAntiAlias(true);
        if (android.os.Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A0I.A0B() != null && this.A02 != null) {
            com.facebook.ads.redexgen.core.N5 n5A0B = this.A0I.A0B();
            com.facebook.ads.redexgen.core.T7 simpleVideoView = this.A02.getSimpleVideoView();
            if (A0J[2].charAt(30) != 'G') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0J;
            strArr[6] = "7Tm7E6hvxl2lrINlaGqN4b4kJs9I709m";
            strArr[1] = "njm7q4dCrj2NJr9FsCrNNlLowJdEGDJD";
            n5A0B.A9r(simpleVideoView);
            if (com.facebook.ads.redexgen.core.C0762Im.A2A(getContext())) {
                this.A0I.A0B().A07(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        if (this.A0I.A0B() != null) {
            this.A0I.A0B().A05();
            if (this.A02 != null) {
                this.A0I.A0B().AHD(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    public void A04() {
        if (this.A01 == null) {
            return;
        }
        if (!A18()) {
            if (!A18()) {
                return;
            } else {
                return;
            }
        }
        boolean z = this.A05;
        if (A0J[4].charAt(16) == 'S') {
            throw new java.lang.RuntimeException();
        }
        A0J[4] = "H2PvwmHOgvOi5klEuL8elNjNTBtJADxS";
        if (!z) {
            if (!A18() || !this.A04) {
                return;
            }
        }
        this.A01.ABD();
    }

    private void A05(android.view.View view) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A06(android.view.View view) {
        view.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
        com.facebook.ads.redexgen.core.M3.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final boolean A0C() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final boolean A11() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.UO
    public final void A14() {
        if (A18() && this.A02 != null) {
            com.facebook.ads.redexgen.core.QM qm = this.A02;
            if (A0J[4].charAt(16) == 'S') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0J;
            strArr[0] = "PPsdw83Xwgr8n";
            strArr[5] = "5ciU0wOzbld7CiHKSmuHpDfStOE";
            qm.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.UO
    public final void A15() {
        if (A18()) {
            A16();
            if (this.A02 != null) {
                this.A02.A05(com.facebook.ads.redexgen.core.EnumC0969Qs.A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.UO
    public final void A16() {
        float volume = this.A07.A0P().getVolume();
        if (!A18() || this.A02 == null) {
            return;
        }
        float newVolume = this.A02.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.core.UO
    public final boolean A17() {
        return A18() && this.A02 != null && this.A02.A06();
    }

    @Override // com.facebook.ads.redexgen.core.UO
    public final boolean A18() {
        return this.A03;
    }

    public final void A19(java.util.Map<java.lang.String, java.lang.String> extraParams) {
        if (this.A02 != null) {
            this.A02.A02();
            if (A18()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    public final com.facebook.ads.redexgen.core.QM getVideoView() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z = radius == 1;
        if (z) {
            i = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i, i, android.graphics.Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        android.graphics.RectF rectF = this.A0H;
        int radius2 = A0L;
        float f = radius2;
        int width = getWidth();
        int radius3 = A0L;
        float f2 = width - radius3;
        int height = getHeight();
        int radius4 = A0L;
        rectF.set(f, 0.0f, f2, height - radius4);
        if (z) {
            i = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i, i, android.graphics.Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setCTAInfo(com.facebook.ads.redexgen.core.C1P c1p, java.util.Map<java.lang.String, java.lang.String> extraData) {
        getCtaButton().setCta(c1p, this.A0E, extraData);
    }

    public void setImageUrl(java.lang.String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(0);
            new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A00, this.A08).A04().A06(new com.facebook.ads.redexgen.core.C1060Uf(this, null)).A07(str);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z) {
        this.A03 = z;
    }

    public void setOnAssetsLoadedListener(com.facebook.ads.redexgen.core.PF pf) {
        this.A01 = pf;
    }

    public void setUpImageView(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A00 = new com.facebook.ads.redexgen.core.C0872Mz(c1199Zs);
        if (com.facebook.ads.redexgen.core.C0762Im.A1C(c1199Zs)) {
            com.facebook.ads.redexgen.core.OB.A00(this.A00, com.facebook.ads.redexgen.core.C0762Im.A1D(c1199Zs), new com.facebook.ads.redexgen.core.OM(this));
        }
        A06(this.A00);
    }

    public void setUpMediaContainer(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A06 = new android.widget.RelativeLayout(c1199Zs);
        A06(this.A06);
        if (this.A00 != null) {
            this.A06.addView(this.A00);
            A05(this.A00);
        }
        if (this.A02 != null) {
            this.A06.addView(this.A02);
            A05(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A02 = new com.facebook.ads.redexgen.core.QM(c1199Zs, new com.facebook.ads.redexgen.core.JF(this.A0E, getAdEventManager()));
        if (com.facebook.ads.redexgen.core.C0762Im.A1E(c1199Zs)) {
            com.facebook.ads.redexgen.core.OB.A00(this.A02, com.facebook.ads.redexgen.core.C0762Im.A1F(c1199Zs), new com.facebook.ads.redexgen.core.ON(this));
        }
        com.facebook.ads.redexgen.core.QM qm = this.A02;
        if (A0J[2].charAt(30) != 'G') {
            throw new java.lang.RuntimeException();
        }
        A0J[4] = "tNSgYVifT5FMSy2OwNBjuNxtKDkDnPPF";
        A06(qm);
    }

    private void setUpView(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        setUpImageView(c1199Zs);
        setUpVideoView(c1199Zs);
        setUpMediaContainer(c1199Zs);
    }

    public void setVideoPlaceholderUrl(java.lang.String str) {
        if (this.A02 != null) {
            this.A02.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(java.lang.String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(8);
        }
        com.facebook.ads.redexgen.core.QM qm = this.A02;
        java.lang.String[] strArr = A0J;
        if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
            throw new java.lang.RuntimeException();
        }
        A0J[2] = "Key351avhXFGNIES0xzUdjVz8AR1nkGO";
        if (qm != null) {
            this.A02.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
