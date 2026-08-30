package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0859Mm extends android.widget.FrameLayout {
    public static byte[] A0C;
    public static java.lang.String[] A0D = {"EYRP1PEEhxzmFZofVXiCCrEXWQs6qPAa", "IPRTBS", "NsAYUXCCkxBbK0XyUhCt1xHChz5fZfMK", "fEJJ0", "6651Qynk9CVpAvzNTMvYSQKVDYa6iazW", "nD7S5n7VHEDKGeK1PzI1a27Vk58dSaaa", "vFV0GS7SjmRPmH7mLZ5yrXn6gSrRknN8", "LPfldR2r"};
    public static final int A0E;
    public boolean A00;
    public final com.facebook.ads.redexgen.core.C1346cI A01;
    public final com.facebook.ads.redexgen.core.C1199Zs A02;
    public final com.facebook.ads.redexgen.core.J7 A03;
    public final com.facebook.ads.redexgen.core.JF A04;
    public final com.facebook.ads.redexgen.core.C0842Lv A05;
    public final com.facebook.ads.redexgen.core.VO A06;
    public final com.facebook.ads.redexgen.core.AbstractC0853Mg A07;
    public final com.facebook.ads.redexgen.core.AbstractC0986Rj A08;
    public final com.facebook.ads.redexgen.core.C0987Rk A09;
    public final java.lang.String A0A;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC0858Ml> A0B;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C0859Mm(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C04766f c04766f, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC0858Ml> weakReference, int i, int i2, int i3, int i4, com.facebook.ads.redexgen.core.C1346cI c1346cI, java.lang.String str) {
        super(c1199Zs);
        this.A05 = new com.facebook.ads.redexgen.core.C0842Lv();
        this.A02 = c1199Zs;
        this.A03 = j7;
        this.A01 = c1346cI;
        this.A0B = weakReference;
        this.A0A = str;
        com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cDA0C = this.A01.A0C();
        if (abstractC1341cDA0C == null) {
            throw new java.lang.IllegalStateException(A09(0, 32, 86));
        }
        com.facebook.ads.redexgen.core.M3.A0M(this, -1);
        this.A04 = new com.facebook.ads.redexgen.core.JF(this.A01.A6r(), this.A03);
        this.A08 = A06();
        this.A09 = A07(i, i4, i2, i3);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(c1199Zs);
        linearLayout.setOrientation(1);
        addView(linearLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.A07 = A04(c04766f);
        if (this.A07 != null) {
            linearLayout.addView(this.A07, new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A06 = A02(abstractC1341cDA0C);
        linearLayout.addView(this.A06, new android.widget.LinearLayout.LayoutParams(-1, -2));
    }

    public static java.lang.String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 99);
            if (A0D[6].charAt(17) == 'I') {
                throw new java.lang.RuntimeException();
            }
            A0D[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            bArrCopyOfRange[i4] = b;
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0F() {
        A0C = new byte[]{-6, 29, -39, 29, 26, 45, 26, -39, 27, 46, 39, 29, 37, 30, -39, 34, 44, -39, 28, 26, 39, 39, 40, 45, -39, 27, 30, -39, 39, 46, 37, 37, 52, 64, 62, -1, 55, 50, 52, 54, 51, 64, 64, 60, -1, 50, 53, 68, -1, 51, 50, okio.Utf8.REPLACEMENT_BYTE, okio.Utf8.REPLACEMENT_BYTE, 54, 67, -1, 52, kotlin.io.encoding.Base64.padSymbol, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0E = (int) (com.facebook.ads.redexgen.core.LP.A02 * 40.0f);
    }

    private com.facebook.ads.redexgen.core.VO A02(com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        com.facebook.ads.redexgen.core.C1O c1oA00;
        com.facebook.ads.redexgen.core.C1F c1fA1P = abstractC1341cD.A1P();
        com.facebook.ads.redexgen.core.C0603Br c0603Br = new com.facebook.ads.redexgen.core.C0603Br(this);
        if (getOrientation() == 1) {
            c1oA00 = abstractC1341cD.A1O().A01();
        } else {
            com.facebook.ads.redexgen.core.C1B c1bA1O = abstractC1341cD.A1O();
            java.lang.String[] strArr = A0D;
            if (strArr[1].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            A0D[7] = "bY8FFe1Y";
            c1oA00 = c1bA1O.A00();
        }
        com.facebook.ads.redexgen.core.VO vo = new com.facebook.ads.redexgen.core.VO(this.A02, A0E, c1oA00, c1fA1P.A0G().A06(), A09(32, 31, 110), this.A03, c0603Br, this.A09, this.A05, abstractC1341cD.A1Q());
        vo.setInfo(c1fA1P.A0F(), c1fA1P.A0G(), this.A01.A6r(), abstractC1341cD.A1S().A01(), null, null);
        if (com.facebook.ads.redexgen.core.C0762Im.A1G(this.A02)) {
            vo.A0C();
        }
        return vo;
    }

    private com.facebook.ads.redexgen.core.AbstractC0853Mg A04(com.facebook.ads.redexgen.core.C04766f c04766f) {
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0856Mj viewOnClickListenerC0856Mj = new com.facebook.ads.redexgen.core.ViewOnClickListenerC0856Mj(this);
        java.lang.String strA0b = this.A01.A0b();
        if (A0H(c04766f, this.A01) && strA0b != null) {
            com.facebook.ads.redexgen.core.VJ vj = new com.facebook.ads.redexgen.core.VJ(this.A02, this.A03, c04766f, this.A04, viewOnClickListenerC0856Mj);
            java.lang.String strA6r = this.A01.A6r();
            java.lang.String videoUrl = this.A01.A0E() != null ? this.A01.A0E().getUrl() : null;
            com.facebook.ads.redexgen.core.VJ videoView = vj.A0F(strA6r, strA0b, videoUrl, this.A01.A0O(), this.A01.A0N());
            if (com.facebook.ads.redexgen.core.C0762Im.A1K(this.A02)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        com.facebook.ads.redexgen.core.JU juA0E = this.A01.A0E();
        if (juA0E == null) {
            return null;
        }
        com.facebook.ads.redexgen.core.VM vmA0F = new com.facebook.ads.redexgen.core.VM(this.A02, viewOnClickListenerC0856Mj).A0F(juA0E.getUrl());
        if (com.facebook.ads.redexgen.core.C0762Im.A1I(this.A02)) {
            setViewAsCTA(vmA0F);
        }
        return vmA0F;
    }

    private com.facebook.ads.redexgen.core.VI A06() {
        return new com.facebook.ads.redexgen.core.VI(this);
    }

    private com.facebook.ads.redexgen.core.C0987Rk A07(int i, int i2, int i3, int i4) {
        com.facebook.ads.redexgen.core.C0987Rk c0987Rk = new com.facebook.ads.redexgen.core.C0987Rk(this, i, i2, true, new java.lang.ref.WeakReference(this.A08), this.A02);
        c0987Rk.A0W(i3);
        c0987Rk.A0X(i4);
        return c0987Rk;
    }

    private void A0C() {
        java.lang.String strA0J = this.A01.A0J();
        if (!android.text.TextUtils.isEmpty(strA0J)) {
            com.facebook.ads.redexgen.core.L2 l2 = new com.facebook.ads.redexgen.core.L2();
            com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A02;
            android.net.Uri uriA00 = com.facebook.ads.redexgen.core.L5.A00(strA0J);
            java.lang.String adChoicesLinkUrl = this.A01.A6r();
            com.facebook.ads.redexgen.core.L2.A0M(l2, c1199Zs, uriA00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A04.A04(com.facebook.ads.redexgen.core.JE.A0A, null);
        if (!com.facebook.ads.redexgen.core.C2T.A00(this.A02.A01()).A0O(this.A02, false)) {
            A0C();
            return;
        }
        com.facebook.ads.redexgen.core.NE neA01 = com.facebook.ads.redexgen.core.NF.A01(this.A02, this.A03, this.A01.A6r(), this);
        if (neA01 == null) {
            A0C();
            return;
        }
        com.facebook.ads.redexgen.core.M3.A0T(this);
        addView(neA01, new android.widget.FrameLayout.LayoutParams(-1, -1));
        neA01.A0K();
    }

    private void A0E() {
        if (getVisibility() == 0 && this.A00 && hasWindowFocus()) {
            this.A09.A0U();
        } else {
            this.A09.A0V();
        }
    }

    public static boolean A0H(com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.C1346cI c1346cI) {
        java.lang.String strA0b = c1346cI.A0b();
        if (android.text.TextUtils.isEmpty(strA0b) || android.os.Build.VERSION.SDK_INT < 14) {
            return false;
        }
        java.lang.String videoUrl = c04766f.A0S(strA0b);
        return !android.text.TextUtils.isEmpty(videoUrl);
    }

    public final void A0I() {
        if (this.A07 != null) {
            this.A07.A0A();
        }
        if (this.A09 != null) {
            this.A09.A0V();
        }
        com.facebook.ads.redexgen.core.M3.A0J(this);
    }

    public final void A0J() {
        if (this.A07 != null) {
            com.facebook.ads.redexgen.core.AbstractC0853Mg abstractC0853Mg = this.A07;
            if (A0D[2].charAt(13) == 'c') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0D;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC0853Mg.A0B();
        }
    }

    private int getOrientation() {
        android.app.Activity activity = this.A02.A0D();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public com.facebook.ads.redexgen.core.C0987Rk getViewabilityChecker() {
        return this.A09;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00 = true;
        A0E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00 = false;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        this.A05.A06(this.A02, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        A0E();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0E();
    }

    private void setViewAsCTA(android.view.View view) {
        view.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC0857Mk(this));
    }
}
