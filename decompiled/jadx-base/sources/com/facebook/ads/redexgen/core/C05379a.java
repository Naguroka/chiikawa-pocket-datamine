package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05379a extends com.facebook.ads.redexgen.core.AbstractC1045Tq {
    public static byte[] A0T;
    public static java.lang.String[] A0U = {"", "YtQm2387uXJs", "MlRkJczYYxJD4Wwp0SHW4B9CEOUSnddR", "Rw6HEQ3C6e1KGOQ0gaz0SQKaqXM6WP6s", "SVsTOXJGQLTRlrov45UN9nTiloFn5X8Y", "Icuwm310fXqoj23c8ds7ElfBFjsMoXLO", "Pjvv6hw4WD5DyhE4XvR8T7jl", "KYBHBzoeYb2kbTAqfKJN2TrMGpQFpmBq"};
    public int A00;
    public com.facebook.ads.redexgen.core.JE A01;
    public com.facebook.ads.redexgen.core.AbstractC0907Oi A02;
    public com.facebook.ads.redexgen.core.QC A03;
    public com.facebook.ads.redexgen.core.C0953Qc A04;
    public com.facebook.ads.redexgen.core.EnumC0969Qs A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final android.os.Handler A0F;
    public final com.facebook.ads.redexgen.core.C5W A0G;
    public final com.facebook.ads.redexgen.core.QB A0H;
    public final com.facebook.ads.redexgen.core.TC A0I;
    public final com.facebook.ads.redexgen.core.T7 A0J;
    public final com.facebook.ads.redexgen.core.C9S A0K;
    public final com.facebook.ads.redexgen.core.AbstractC1012Sj A0L;
    public final com.facebook.ads.redexgen.core.AbstractC1010Sh A0M;
    public final com.facebook.ads.redexgen.core.AbstractC1006Sd A0N;
    public final com.facebook.ads.redexgen.core.AbstractC0990Rn A0O;
    public final com.facebook.ads.redexgen.core.R9 A0P;
    public final com.facebook.ads.redexgen.core.R8 A0Q;
    public final com.facebook.ads.redexgen.core.C0896Nx A0R;
    public final com.facebook.ads.redexgen.core.N5 A0S;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0T, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 126);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0T = new byte[]{23, okio.Utf8.REPLACEMENT_BYTE, 41, 47, okio.Utf8.REPLACEMENT_BYTE, 17};
    }

    static {
        A0B();
    }

    public C05379a(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.N9 n9, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.MR mr) {
        super(c1199Zs, n9, j7, abstractC1341cD, c04766f, mr);
        this.A0G = new com.facebook.ads.redexgen.core.C1032Td(this);
        this.A0P = new com.facebook.ads.redexgen.core.A3(this);
        this.A0O = new com.facebook.ads.redexgen.core.AbstractC0990Rn() { // from class: com.facebook.ads.redexgen.X.9i
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.SZ sz) {
                this.A00.A0E = true;
                this.A00.A0V();
            }
        };
        this.A0N = new com.facebook.ads.redexgen.core.AbstractC1006Sd() { // from class: com.facebook.ads.redexgen.X.9g
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C9P c9p) {
            }
        };
        this.A0Q = new com.facebook.ads.redexgen.core.R8() { // from class: com.facebook.ads.redexgen.X.9f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C9O c9o) {
                this.A00.A0L(c9o);
                this.A00.A0K(c9o);
                this.A00.A02.A0E(c9o);
            }
        };
        this.A0L = new com.facebook.ads.redexgen.core.AbstractC1012Sj() { // from class: com.facebook.ads.redexgen.X.9d
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C9R c9r) {
                this.A00.A0J(c9r, this.A00.A0J.getState() != com.facebook.ads.redexgen.core.EnumC0984Rh.A06, false);
            }
        };
        this.A0M = new com.facebook.ads.redexgen.core.C05399c(this);
        boolean z = false;
        this.A0D = false;
        this.A0E = false;
        this.A0C = false;
        this.A0B = false;
        this.A09 = false;
        this.A00 = 0;
        this.A06 = false;
        this.A08 = false;
        this.A01 = com.facebook.ads.redexgen.core.JE.A0a;
        this.A0F = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0H = new com.facebook.ads.redexgen.core.C1031Tc(this);
        this.A0J = new com.facebook.ads.redexgen.core.T7(super.A03);
        this.A0J.setFunnelLoggingHandler(super.A05);
        this.A0J.getEventBus().A03(this.A0P, this.A0O, this.A0N, this.A0Q, this.A0L, this.A0M);
        this.A0A = abstractC1341cD.A1E();
        this.A0K = new com.facebook.ads.redexgen.core.C9S(super.A03, super.A04, this.A0J, super.A01.A1U());
        if (com.facebook.ads.redexgen.core.C0762Im.A1q(super.A03)) {
            this.A0I = new com.facebook.ads.redexgen.core.TC(super.A03, super.A04, this.A0J, super.A01.A1U(), this.A0K, null);
        } else {
            this.A0I = null;
        }
        this.A04 = new com.facebook.ads.redexgen.core.C0953Qc(super.A03, super.A09, super.A01.A0m(), mr);
        this.A0R = new com.facebook.ads.redexgen.core.C0896Nx(super.A03, super.A05);
        this.A0S = new com.facebook.ads.redexgen.core.N5(super.A03);
        if (this.A0A) {
            this.A0S.setVisibility(8);
        }
        A0A();
        this.A0J.setVideoURI(super.A02.A0S(super.A01.A1P().A0E().A08()));
        A08();
        int iA03 = super.A01.A1P().A0E().A03();
        if (com.facebook.ads.redexgen.core.C0762Im.A2F(super.A03)) {
            this.A0B = iA03 == 0;
        } else {
            this.A0B = iA03 <= 0;
        }
        if (super.A01.A1P().A0O() && super.A01.A1P().A0E().A02() > 0) {
            z = true;
        }
        this.A07 = z;
        com.facebook.ads.redexgen.core.M3.A0M(this, super.A01.A1O().A01().A07(true));
        if (com.facebook.ads.redexgen.core.C0762Im.A29(super.A03)) {
            super.A07.setProgressSpinnerInvisible(true);
        }
    }

    private int A00(int i, int i2, int i3) {
        int i4 = 0;
        if (this.A0A) {
            int completedVideoCycleDuration = this.A00;
            i4 = i3 * completedVideoCycleDuration;
        }
        int completedVideoCycleDuration2 = i / 1000;
        return (i2 - i4) - completedVideoCycleDuration2;
    }

    private com.facebook.ads.redexgen.core.AbstractC0907Oi A02(int i) {
        com.facebook.ads.redexgen.core.C0910Ol c0910OlA0K = new com.facebook.ads.redexgen.core.C0910Ol(super.A03, super.A04, super.A08, super.A01, this.A0J, super.A0A, super.A06).A0F(super.A07.getToolbarHeight()).A0J(super.A07).A0E(i).A0G(this.A0R).A0K(this.A0S);
        if (super.A01.A1P().A0O() && com.facebook.ads.redexgen.core.C0762Im.A1T(super.A03) && super.A01.A1P().A0I() != null) {
            c0910OlA0K.A0I(getPackageInstallListener());
        }
        return com.facebook.ads.redexgen.core.AbstractC0908Oj.A00(c0910OlA0K.A0M(), null, true);
    }

    private void A07() {
        this.A0J.postDelayed(new com.facebook.ads.redexgen.core.C1030Tb(this), com.facebook.ads.redexgen.core.C0762Im.A0M(super.A03));
    }

    private void A08() {
        this.A0J.postDelayed(new com.facebook.ads.redexgen.core.C1035Tg(this), com.facebook.ads.redexgen.core.C0762Im.A0N(super.A03));
    }

    private void A09() {
        this.A0B = true;
        super.A07.A06();
        if (this.A02 != null) {
            this.A02.A0y();
        }
    }

    private void A0A() {
        this.A0J.A0c(this.A0S);
        this.A0J.A0c(this.A0R);
        if (!android.text.TextUtils.isEmpty(super.A01.A1P().A0E().A07())) {
            com.facebook.ads.redexgen.core.C7V c7v = new com.facebook.ads.redexgen.core.C7V(super.A03);
            this.A0J.A0c(c7v);
            c7v.setImage(super.A01.A1P().A0E().A07());
        }
        com.facebook.ads.redexgen.core.C7G c7g = new com.facebook.ads.redexgen.core.C7G(super.A03, true, super.A05);
        this.A0J.A0c(c7g);
        this.A0J.A0c(new com.facebook.ads.redexgen.core.OY(c7g, com.facebook.ads.redexgen.core.R5.A02, true));
        this.A0J.A0c(new com.facebook.ads.redexgen.core.C7L(super.A03));
    }

    private void A0C(com.facebook.ads.redexgen.core.JE je) {
        new com.facebook.ads.redexgen.core.JF(super.A01.A1U(), super.A03.A09()).A04(je, null);
        super.A08.A4P(super.A09.A6F());
        this.A04.A05();
        if (this.A02 instanceof com.facebook.ads.redexgen.core.BX) {
            ((com.facebook.ads.redexgen.core.BX) this.A02).A17();
        }
        this.A0F.postDelayed(new com.facebook.ads.redexgen.core.Q9(this), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(com.facebook.ads.redexgen.core.JE je) {
        if (!this.A06) {
            this.A08 = true;
            this.A01 = je;
        } else {
            A0C(je);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(com.facebook.ads.redexgen.core.C9R c9r, boolean z, boolean z2) {
        if (this.A03 != null) {
            this.A03.AFf();
            return;
        }
        if (this.A0C) {
            return;
        }
        if (!z && this.A07 && this.A0A) {
            this.A00++;
            this.A0J.A0b(com.facebook.ads.redexgen.core.EnumC0969Qs.A02, 20);
            return;
        }
        if (!this.A0B) {
            A09();
        }
        this.A0C = true;
        if (this.A02 != null) {
            this.A02.A0D(c9r);
        }
        super.A07.setToolbarActionMessage(A06(0, 0, 98));
        A0N(z, z2);
        super.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(com.facebook.ads.redexgen.core.C9O c9o) {
        if (this.A0J.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A02 && com.facebook.ads.redexgen.core.C0762Im.A1U(super.A03)) {
            this.A0J.postDelayed(new com.facebook.ads.redexgen.core.C1034Tf(this, c9o), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(com.facebook.ads.redexgen.core.C9O c9o) {
        float fMin;
        int iA00 = c9o.A00();
        if (this.A07) {
            int totalSecondsForReward = super.A01.A1P().A0E().A02();
            int currentPosMs = super.A01.A1P().A0E().A04();
            int iA01 = A00(iA00, totalSecondsForReward, currentPosMs);
            if (!com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui.A08(super.A01)) {
                boolean zA1F = super.A01.A1F();
                java.lang.String strA06 = A06(0, 0, 98);
                if (!zA1F && !super.A01.A1D() && iA01 > 0) {
                    super.A07.setToolbarActionMessage(super.A01.A1T().A02().replace(A06(0, 6, 50), java.lang.String.valueOf(iA01)));
                } else {
                    super.A07.setToolbarActionMessage(strA06);
                }
            }
            if (iA01 <= 0) {
                A0N(false, false);
            }
        }
        boolean z = this.A0A;
        if (A0U[3].charAt(17) != 'M') {
            java.lang.String[] strArr = A0U;
            strArr[7] = "uMQCRWrhYQnYLwhLQAgpxQMv5WWv5BZx";
            strArr[2] = "9L1nBY5kYCpH57KFfLoLkWPFyXHXe8tQ";
            if (!z) {
                int iA03 = super.A01.A1P().A0E().A03();
                java.lang.String[] strArr2 = A0U;
                java.lang.String str = strArr2[0];
                java.lang.String str2 = strArr2[1];
                int length = str.length();
                int currentPosMs2 = str2.length();
                if (length != currentPosMs2) {
                    java.lang.String[] strArr3 = A0U;
                    strArr3[7] = "qF0wWRoQYNHbRw7kiC8WRpThpP8Fmr54";
                    strArr3[2] = "3pcRB14MY6MyksHgyK5pJeiIhpnbS9OL";
                    int currentPosMs3 = this.A0J.getDuration();
                    fMin = java.lang.Math.min(iA03 * 1000.0f, currentPosMs3);
                }
            } else {
                int currentPosMs4 = super.A01.A1P().A0E().A03();
                fMin = currentPosMs4 * 1000.0f;
            }
            float f = iA00;
            if (this.A0A) {
                float unskippableSeconds = this.A0J.getDuration() * this.A00;
                f += unskippableSeconds;
            }
            float f2 = f / fMin;
            if (!super.A01.A1D()) {
                super.A07.setProgress(100.0f * f2);
            } else {
                int i = 0;
                float totalCurrentPosMs = fMin - f;
                if (totalCurrentPosMs > 0.0f) {
                    int currentPosMs5 = (int) (fMin - f);
                    i = currentPosMs5 / 1000;
                }
                super.A07.A08(100.0f * f2, i);
            }
            if (f2 >= 1.0f && !this.A0B) {
                A09();
                com.facebook.ads.redexgen.core.MQ mq = super.A07;
                int currentPosMs6 = getCloseButtonStyle();
                mq.setToolbarActionMode(currentPosMs6);
                return;
            }
            return;
        }
        throw new java.lang.RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(java.lang.String str) {
        int currentPositionInMillis = 0;
        int duration = 0;
        if (this.A0J != null) {
            currentPositionInMillis = this.A0J.getCurrentPositionInMillis();
            duration = this.A0J.getDuration();
            this.A0J.A0Z(3);
        }
        super.A03.A0E().A3L(str);
        if (com.facebook.ads.redexgen.core.C0762Im.A1V(super.A03)) {
            A0J(new com.facebook.ads.redexgen.core.C9R(currentPositionInMillis, duration), false, true);
        } else {
            super.A08.A4P(super.A09.A7M());
            super.A08.A4P(super.A09.A7I());
        }
    }

    private synchronized void A0N(boolean z, boolean z2) {
        if (this.A03 != null) {
            this.A07 = false;
            return;
        }
        if (this.A07 && !z && !z2) {
            super.A08.A4P(super.A09.A6F());
            this.A04.A05();
            this.A07 = false;
            if (this.A02 != null) {
                this.A02.A0w();
            }
            return;
        }
        this.A07 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1045Tq
    public final void A0W() {
        com.facebook.ads.redexgen.core.M3.A0L(this.A02);
        this.A0J.setVisibility(4);
        if (!super.A01.A1C()) {
            A0a();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1045Tq
    public final void A0Y(com.facebook.ads.redexgen.core.C5Q c5q) {
        c5q.A0A(this.A0G);
        int orientation = c5q.A05().getResources().getConfiguration().orientation;
        this.A02 = A02(orientation);
        addView(this.A02, com.facebook.ads.redexgen.core.AbstractC1045Tq.A0E);
        addView(super.A07, new android.widget.FrameLayout.LayoutParams(-1, super.A07.getToolbarHeight()));
        com.facebook.ads.redexgen.core.M3.A0H(this.A02);
        com.facebook.ads.redexgen.core.M3.A0H(super.A07);
        if (super.A01.A1C() && (this.A02 instanceof com.facebook.ads.redexgen.core.BX)) {
            ((com.facebook.ads.redexgen.core.BX) this.A02).setVideoAdViewListener(this.A0H);
        }
        setUpFullscreenMode(this.A02 != null && this.A02.A11());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1045Tq
    public final boolean A0Z() {
        if (this.A02 != null) {
            boolean zA12 = this.A02.A12(this.A07);
            java.lang.String[] strArr = A0U;
            if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
                throw new java.lang.RuntimeException();
            }
            A0U[5] = "3q2LSuBAfmgZDuIIO8XYef2gzNnaMySy";
            if (zA12) {
                return true;
            }
        }
        return false;
    }

    public final void A0a() {
        this.A0J.setVisibility(0);
        com.facebook.ads.redexgen.core.M3.A0L(super.A07);
        this.A0J.setVolume(super.A01.A1P().A0E().A09() ? 0.0f : 1.0f);
        this.A0J.A0b(com.facebook.ads.redexgen.core.EnumC0969Qs.A02, 20);
        if (this.A02 != null) {
            boolean z = this.A07;
            if (A0U[6].length() == 22) {
                throw new java.lang.RuntimeException();
            }
            A0U[3] = "XEZroGEyqnXPxT1Op21Zo9PGFXXX4LGG";
            if (z) {
                this.A02.A0x();
            }
        }
        if (this.A02 != null && !this.A0B) {
            this.A02.A0z();
        }
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ACz(boolean z) {
        this.A06 = false;
        if (this.A0J.getVisibility() != 0 || this.A0J.A0j()) {
            return;
        }
        this.A05 = this.A0J.getVideoStartReason();
        this.A09 = z;
        this.A0J.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ADN(boolean z) {
        this.A06 = true;
        if (this.A08) {
            this.A08 = false;
            A0C(this.A01);
        }
        if (this.A0J.getVisibility() != 0 || this.A0J.A0k() || this.A0C || this.A0J.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A06 || this.A05 == null) {
            return;
        }
        if (!this.A09 || z) {
            this.A0J.A0b(this.A05, 19);
        }
    }

    private int getCloseButtonStyle() {
        if (this.A02 != null) {
            return this.A02.getCloseButtonStyle();
        }
        return 0;
    }

    private com.facebook.ads.redexgen.core.LZ getPackageInstallListener() {
        return new com.facebook.ads.redexgen.core.C1033Te(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1045Tq, com.facebook.ads.redexgen.core.MS
    public final void onDestroy() {
        super.onDestroy();
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(super.A03)) {
            super.A03.A0A().AHC(this.A0J);
        }
        if (this.A02 != null) {
            this.A02.A0v();
        }
        if (this.A0J != null) {
            if (!this.A0C) {
                this.A0J.A0a(com.facebook.ads.redexgen.core.EnumC0964Qn.A05);
            }
            this.A0J.getEventBus().A04(this.A0P, this.A0O, this.A0N, this.A0Q, this.A0L, this.A0M);
            this.A0J.A0V();
        }
        if (this.A0I != null) {
            this.A0I.A05();
        }
        com.facebook.ads.redexgen.core.C9S c9s = this.A0K;
        if (A0U[3].charAt(17) == 'M') {
            throw new java.lang.RuntimeException();
        }
        A0U[5] = "JW7Ky8SZfj6uPXM0M3owDCnBT69Er2UJ";
        c9s.A0o();
        this.A0F.removeCallbacksAndMessages(null);
    }

    public void setServerSideRewardHandler(com.facebook.ads.redexgen.core.C0953Qc c0953Qc) {
        this.A04 = c0953Qc;
    }

    public void setVideoLeadingPlayableAdListener(com.facebook.ads.redexgen.core.QC qc) {
        this.A03 = qc;
    }
}
