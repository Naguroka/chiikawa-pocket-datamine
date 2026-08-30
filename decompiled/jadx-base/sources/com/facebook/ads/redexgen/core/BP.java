package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class BP extends com.facebook.ads.redexgen.core.UO implements com.facebook.ads.redexgen.core.LJ {
    public static byte[] A0L;
    public static java.lang.String[] A0M = {"XgHadHW09EVAxZ9Csjyh8Iwd", "cGY", "0gnHO0byxZtUV0t5q6", "nitlVKI6s75UlUdu4qHy2TBluRJ6Vnqb", "dqu", "CAnKNEP5j3LNWAO1IgUwk41cBq", "Gj8h5dX0pUMTu0Q6FRM85YsFx7LjGw4a", "ydUjPQqek3X4wwrCfoz9Rz5n"};
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public android.widget.RelativeLayout A00;
    public com.facebook.ads.redexgen.core.C0872Mz A01;
    public com.facebook.ads.redexgen.core.PF A02;
    public com.facebook.ads.redexgen.core.TV A03;
    public com.facebook.ads.redexgen.core.QM A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final android.graphics.Paint A08;
    public final android.graphics.Path A09;
    public final android.graphics.RectF A0A;
    public final com.facebook.ads.redexgen.core.C1199Zs A0B;
    public final com.facebook.ads.redexgen.core.LL A0C;
    public final com.facebook.ads.redexgen.core.MR A0D;
    public final com.facebook.ads.redexgen.core.C0911Om A0E;
    public final com.facebook.ads.redexgen.core.AbstractC1012Sj A0F;
    public final com.facebook.ads.redexgen.core.AbstractC1006Sd A0G;
    public final com.facebook.ads.redexgen.core.AbstractC0990Rn A0H;
    public final com.facebook.ads.redexgen.core.R9 A0I;
    public final com.facebook.ads.redexgen.core.AbstractC0956Qf A0J;
    public final java.lang.String A0K;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0L, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A0M;
            if (strArr[0].length() != strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[1] = "5LW";
            strArr2[4] = "hlZ";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 11);
            i4++;
        }
    }

    public static void A06() {
        A0L = new byte[]{68, 70, 85, 72, 82, 84, 66, 75, 120, 68, 70, 85, 67};
    }

    public abstract void A1A(com.facebook.ads.redexgen.core.C1199Zs c1199Zs);

    static {
        A06();
        A0O = (int) (com.facebook.ads.redexgen.core.LP.A02 * 1.0f);
        A0P = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
        A0N = (int) (com.facebook.ads.redexgen.core.LP.A02 * 6.0f);
    }

    public BP(com.facebook.ads.redexgen.core.C0911Om c0911Om, boolean z, java.lang.String str, com.facebook.ads.redexgen.core.TV tv) {
        super(c0911Om, z);
        this.A09 = new android.graphics.Path();
        this.A0A = new android.graphics.RectF();
        this.A0J = new com.facebook.ads.redexgen.core.BU(this);
        this.A0F = new com.facebook.ads.redexgen.core.BT(this);
        this.A0H = new com.facebook.ads.redexgen.core.BS(this);
        this.A0G = new com.facebook.ads.redexgen.core.BR(this);
        this.A0I = new com.facebook.ads.redexgen.core.BQ(this);
        this.A0D = c0911Om.A0A();
        this.A0E = c0911Om;
        this.A03 = tv;
        this.A0K = str;
        this.A0B = c0911Om.A05();
        this.A0C = com.facebook.ads.redexgen.core.LL.A01(c0911Om.A05(), c0911Om.A04(), this);
        setGravity(17);
        setPadding(A0O, 0, A0O, A0O);
        com.facebook.ads.redexgen.core.M3.A0M(this, 0);
        setUpView(this.A0B);
        this.A08 = new android.graphics.Paint();
        this.A08.setColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.A08.setStyle(android.graphics.Paint.Style.FILL);
        this.A08.setAlpha(16);
        this.A08.setAntiAlias(true);
        if (android.os.Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A02 == null) {
            return;
        }
        if ((A18() && this.A07) || (!A18() && this.A06)) {
            this.A02.ABD();
        }
    }

    private void A07(android.view.View view) {
        view.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
        com.facebook.ads.redexgen.core.M3.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public boolean A0C() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A0v() {
        super.A0v();
        this.A0C.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final boolean A11() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.UO
    public final void A14() {
        if (A18()) {
            this.A04.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.UO
    public final void A15() {
        if (A18()) {
            A16();
            com.facebook.ads.redexgen.core.QM qm = this.A04;
            com.facebook.ads.redexgen.core.EnumC0969Qs enumC0969Qs = com.facebook.ads.redexgen.core.EnumC0969Qs.A02;
            if (A0M[2].length() == 4) {
                throw new java.lang.RuntimeException();
            }
            A0M[2] = "GrzUS";
            qm.A05(enumC0969Qs);
        }
    }

    @Override // com.facebook.ads.redexgen.core.UO
    public final void A16() {
        float volume = this.A03.A0P().getVolume();
        if (A18()) {
            float newVolume = this.A04.getVolume();
            if (volume != newVolume) {
                com.facebook.ads.redexgen.core.QM qm = this.A04;
                if (A0M[5].length() == 9) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0M;
                strArr[1] = "cdp";
                strArr[4] = "iOc";
                qm.setVolume(volume);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.UO
    public final boolean A17() {
        if (A18()) {
            boolean zA06 = this.A04.A06();
            if (A0M[2].length() == 4) {
                throw new java.lang.RuntimeException();
            }
            A0M[2] = "SbvNib3Q04NWLkmSI4CaBbpy";
            if (zA06) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.UO
    public final boolean A18() {
        return this.A05;
    }

    public final /* synthetic */ void A19(android.view.View view) {
        getCtaButton().A09(A04(0, 13, 44));
    }

    public final void A1B(java.util.Map<java.lang.String, java.lang.String> extraParams) {
        this.A04.A02();
        if (A18()) {
            this.A04.A04(getAdEventManager(), this.A0K, extraParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LJ
    public final void ACa() {
        this.A0D.A4P(this.A0E.A04().A0Y());
    }

    public final android.widget.RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.QM getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        this.A09.addRoundRect(this.A0A, A0N, A0N, android.graphics.Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0O, 0.0f, getWidth() - A0O, getHeight() - A0O);
        this.A09.addRoundRect(this.A0A, A0P, A0P, android.graphics.Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(java.lang.String str, java.lang.String str2) {
        getTitleDescContainer().A03(str, str2, null, true, false);
    }

    public void setCTAInfo(com.facebook.ads.redexgen.core.C1P c1p, java.util.Map<java.lang.String, java.lang.String> extraData) {
        getCtaButton().setCta(c1p, this.A0K, extraData);
    }

    public void setImageUrl(java.lang.String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A01, this.A0B).A04().A06(new com.facebook.ads.redexgen.core.UN(this, null)).A07(str);
    }

    public void setIsVideo(boolean z) {
        this.A05 = z;
    }

    public void setOnAssetsLoadedListener(com.facebook.ads.redexgen.core.PF pf) {
        this.A02 = pf;
    }

    public void setUpImageView(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A01 = new com.facebook.ads.redexgen.core.C0872Mz(c1199Zs);
        if (com.facebook.ads.redexgen.core.C0762Im.A1C(c1199Zs)) {
            com.facebook.ads.redexgen.core.OB.A00(this.A01, com.facebook.ads.redexgen.core.C0762Im.A1D(c1199Zs), new com.facebook.ads.redexgen.core.PL(this));
        }
        A07(this.A01);
    }

    public void setUpMediaContainer(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A00 = new android.widget.RelativeLayout(c1199Zs);
        A07(this.A00);
        com.facebook.ads.redexgen.core.LK lkA0A = this.A0C.A0A(this.A0E.A04());
        this.A0E.A05().A0G().A00(lkA0A.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A0C);
        if (this.A0E.A04().A17() && com.facebook.ads.redexgen.core.C0762Im.A2j(this.A0B)) {
            this.A00.setOnClickListener(new com.facebook.ads.redexgen.core.PK(this));
        } else {
            if (!lkA0A.A00) {
                return;
            }
            this.A00.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.PJ
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.A00.A19(view);
                }
            });
        }
    }

    public void setUpVideoView(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A04 = new com.facebook.ads.redexgen.core.QM(c1199Zs, new com.facebook.ads.redexgen.core.JF(this.A0K, getAdEventManager()));
        if (com.facebook.ads.redexgen.core.C0762Im.A1E(c1199Zs)) {
            com.facebook.ads.redexgen.core.OB.A00(this.A04, com.facebook.ads.redexgen.core.C0762Im.A1F(c1199Zs), new com.facebook.ads.redexgen.core.PM(this));
        }
        A07(this.A04);
    }

    private void setUpView(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        setUpImageView(c1199Zs);
        setUpVideoView(c1199Zs);
        setUpMediaContainer(c1199Zs);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A1A(c1199Zs);
    }

    public void setVideoPlaceholderUrl(java.lang.String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(java.lang.String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0J);
        this.A04.A03(this.A0F);
        this.A04.A03(this.A0H);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0I);
    }
}
