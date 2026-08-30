package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A6 extends com.facebook.ads.redexgen.core.U6 {
    public static byte[] A0k;
    public static java.lang.String[] A0l = {"uilIZmuHzpP0N9Y8quer6Kb2u", "9UUD4l8CpJqeXgkdEQyriIYmJbPiqOP7", "EZE4mnuFogdbCIqsVVCLHtYnmK0aZj", "syebs7ncPc1rj4O1rMWtVdBIydy8e5", "8mpGklwdfsm8yo", "l0wQPHeYLTHnG4", "V5rJxyMt8frjvUGIYtzHbFROecFIJypl", "I99F1f62ejGluaFUQtWt4OKUQ"};
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public android.os.Handler A08;
    public android.view.inputmethod.InputMethodManager A09;
    public android.widget.LinearLayout A0A;
    public android.widget.LinearLayout A0B;
    public android.widget.TextView A0C;
    public com.facebook.ads.redexgen.core.C1O A0D;
    public com.facebook.ads.redexgen.core.C0882Nj A0E;
    public com.facebook.ads.redexgen.core.C0883Nk A0F;
    public com.facebook.ads.redexgen.core.C1079Uy A0G;
    public com.facebook.ads.redexgen.core.PD A0H;
    public com.facebook.ads.redexgen.core.EnumC0969Qs A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final com.facebook.ads.redexgen.core.AbstractC03250h A0T;
    public final com.facebook.ads.redexgen.core.C1199Zs A0U;
    public final com.facebook.ads.redexgen.core.JF A0V;
    public final com.facebook.ads.internal.view.FullScreenAdToolbar A0W;
    public final com.facebook.ads.redexgen.core.Q4 A0X;
    public final com.facebook.ads.redexgen.core.TC A0Y;
    public final com.facebook.ads.redexgen.core.T7 A0Z;
    public final com.facebook.ads.redexgen.core.C9S A0a;
    public final com.facebook.ads.redexgen.core.AbstractC1012Sj A0b;
    public final com.facebook.ads.redexgen.core.AbstractC1010Sh A0c;
    public final com.facebook.ads.redexgen.core.AbstractC1006Sd A0d;
    public final com.facebook.ads.redexgen.core.AbstractC0990Rn A0e;
    public final com.facebook.ads.redexgen.core.R9 A0f;
    public final com.facebook.ads.redexgen.core.R8 A0g;
    public final com.facebook.ads.redexgen.core.C0896Nx A0h;
    public final com.facebook.ads.redexgen.core.N5 A0i;
    public final java.lang.Runnable A0j;

    public static java.lang.String A0J(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0k, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 55);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0V() {
        byte[] bArr = {-15, -6, -9, -15, -7, -19, 1, -3, 3, 0, -15, -13, -70, -72, -57, -91, -76, -54, -101, -72, -68, -70, -69, -57, -38, -33, -31, -26, -27, -48, -34, -42, -27, -39, -32, -43, -42, -44, -58, -45, -60, -51, -54, -60, -52, -64, -57, -54, -51, -43, -58, -45, -58, -59, 45, 31, 36, 26, 37, 45, -63};
        java.lang.String[] strArr = A0l;
        if (strArr[4].length() != strArr[5].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0l;
        strArr2[4] = "nVqp18ph7ekHb6";
        strArr2[5] = "wg1nH4uIQgdKmM";
        A0k = bArr;
    }

    static {
        A0V();
        A0m = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
        A0n = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
        A0o = com.facebook.ads.redexgen.core.AbstractC03842p.A01(-1, 77);
        A0s = (int) (com.facebook.ads.redexgen.core.LP.A02 * 26.0f);
        A0t = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
        A0q = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
        A0r = (int) (com.facebook.ads.redexgen.core.LP.A02 * 44.0f);
        A0p = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    }

    public A6(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.internal.view.FullScreenAdToolbar fullScreenAdToolbar, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.N9 n9, int i, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.JF jf, int i2, boolean z, boolean z2, com.facebook.ads.redexgen.core.Q4 q4) {
        com.facebook.ads.redexgen.core.C1O c1oA00;
        super(c1199Zs, n9, j7, abstractC1341cD, i, z, z2, mr);
        this.A03 = 0;
        this.A0J = false;
        this.A0Q = false;
        this.A0N = false;
        this.A0P = false;
        this.A0O = false;
        this.A0M = false;
        this.A07 = 0;
        this.A02 = 0;
        this.A0j = new com.facebook.ads.redexgen.core.RunnableC0950Pz(this);
        this.A0L = false;
        this.A0S = false;
        this.A01 = 0.0f;
        this.A0f = new com.facebook.ads.redexgen.core.C0562Aa(this);
        this.A0e = new com.facebook.ads.redexgen.core.AT(this);
        this.A0d = new com.facebook.ads.redexgen.core.AE(this);
        this.A0g = new com.facebook.ads.redexgen.core.A9(this);
        this.A0b = new com.facebook.ads.redexgen.core.A8(this);
        this.A0c = new com.facebook.ads.redexgen.core.A7(this);
        this.A0W = fullScreenAdToolbar;
        this.A08 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A09 = (android.view.inputmethod.InputMethodManager) c1199Zs.getSystemService(A0J(24, 12, 58));
        this.A0T = com.facebook.ads.redexgen.core.C03260i.A01(c1199Zs, j7, abstractC1341cD.A1U(), com.facebook.ads.redexgen.core.L5.A00(abstractC1341cD.A1P().A0G().A05()), new java.util.HashMap(), false, true, abstractC1341cD.A1Q());
        this.A0U = c1199Zs;
        this.A0V = jf;
        this.A0h = new com.facebook.ads.redexgen.core.C0896Nx(this.A0U, this.A0V);
        this.A0i = new com.facebook.ads.redexgen.core.N5(this.A0U);
        this.A0X = q4;
        if (i2 == 1) {
            c1oA00 = super.A05.A1O().A01();
        } else {
            c1oA00 = super.A05.A1O().A00();
        }
        this.A0D = c1oA00;
        this.A0Z = new com.facebook.ads.redexgen.core.T7(this.A0U);
        this.A0Z.getEventBus().A03(this.A0f, this.A0e, this.A0d, this.A0g, this.A0b, this.A0c);
        this.A0a = new com.facebook.ads.redexgen.core.C9S(c1199Zs, j7, this.A0Z, abstractC1341cD.A1U());
        A0S();
        this.A0Z.setVideoURI(c04766f.A0S(super.A05.A1P().A0E().A08()));
        A0P();
        A0M();
        A0L();
        com.facebook.ads.redexgen.core.AbstractC0900Ob.A00(this.A0U, this, abstractC1341cD.A1P().A0E().A07());
        setupLayoutConfiguration(false);
        A0R();
        A0Q();
        postDelayed(new com.facebook.ads.redexgen.core.C1050Tv(this), 1000L);
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A0U)) {
            this.A0U.A0A().AHO(this.A0Z, super.A05.A1U(), true);
        }
        if (com.facebook.ads.redexgen.core.C0762Im.A1q(this.A0U)) {
            this.A0Y = new com.facebook.ads.redexgen.core.TC(this.A0U, j7, this.A0Z, super.A05.A1U(), this.A0a, null);
        } else {
            this.A0Y = null;
        }
        A0W(abstractC1341cD.A1P());
    }

    public static /* synthetic */ float A03(com.facebook.ads.redexgen.core.A6 a6, float f) {
        float f2 = a6.A01 + f;
        a6.A01 = f2;
        return f2;
    }

    public static /* synthetic */ int A05(com.facebook.ads.redexgen.core.A6 a6) {
        int i = a6.A02;
        a6.A02 = i + 1;
        return i;
    }

    public static /* synthetic */ int A07(com.facebook.ads.redexgen.core.A6 a6) {
        int i = a6.A07;
        a6.A07 = i + 1;
        return i;
    }

    private void A0K() {
        com.facebook.ads.redexgen.core.M3.A0J(this.A0B);
        this.A0B = new android.widget.LinearLayout(this.A0U);
        com.facebook.ads.redexgen.core.M3.A0R(this.A0B, this.A0U);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0B.setLayoutParams(layoutParams);
        addView(this.A0B, 2);
    }

    private void A0L() {
        this.A0i.A06(-1, A0o);
        this.A0i.setPadding(A0t, A0t, A0t, A0t);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, A0s);
        layoutParams.addRule(12);
        addView(this.A0i, layoutParams);
    }

    private void A0M() {
        this.A0h.setPadding(A0q, A0q, A0q, A0q);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0r, A0r);
        layoutParams.setMargins(0, com.facebook.ads.redexgen.core.MQ.A00, A0p, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        android.view.ViewGroup.LayoutParams videoViewParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0Z, videoViewParams);
        addView(this.A0h, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (super.A05.A17() && this.A0L) {
            this.A0L = false;
            A0f(A0J(36, 18, 42));
        }
    }

    private void A0O() {
        if (super.A05.A17() && this.A0L) {
            this.A0L = false;
            java.util.Map<java.lang.String, java.lang.String> mapA05 = new com.facebook.ads.redexgen.core.O8().A03(null).A02(null).A05();
            mapA05.put(A0J(0, 12, 87), A0J(36, 18, 42));
            super.A07.A9w(super.A05.A1U(), mapA05);
        }
    }

    private void A0P() {
        postDelayed(new com.facebook.ads.redexgen.core.C1052Tx(this), com.facebook.ads.redexgen.core.C0762Im.A0N(this.A0U));
    }

    private void A0Q() {
        com.facebook.ads.redexgen.core.M3.A0J(this.A0A);
        this.A0A = new android.widget.LinearLayout(this.A0U);
        this.A0A.setOrientation(1);
        com.facebook.ads.redexgen.core.M3.A0K(this.A0A);
        A0T();
        this.A0A.setBackgroundColor(-1);
        addView(this.A0A);
    }

    private void A0R() {
        android.view.View view = this.A0Z;
        if (super.A05.A17()) {
            view.setOnClickListener(new com.facebook.ads.redexgen.core.Q1(this));
        }
        com.facebook.ads.redexgen.core.M3.A0J(view);
        com.facebook.ads.redexgen.core.M3.A0K(view);
        android.widget.RelativeLayout.LayoutParams mediaLayoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        mediaLayoutParams.addRule(15);
        addView(view, 1, mediaLayoutParams);
        this.A0C = new android.widget.TextView(this.A0U);
        android.view.View mMediaView = this.A0C;
        com.facebook.ads.redexgen.core.M3.A0K(mMediaView);
        this.A0C.setGravity(17);
        this.A0C.setTextColor(getColors().A05(true));
        this.A0C.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A0C.setMaxLines(2);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(A0n, A0n / 2, A0n, A0s);
        android.view.View mMediaView2 = this.A0C;
        addView(mMediaView2, layoutParams);
        android.view.View mMediaView3 = this.A0C;
        com.facebook.ads.redexgen.core.M3.A0K(mMediaView3);
        this.A0H = new com.facebook.ads.redexgen.core.PD(this.A0U, super.A05, super.A07, super.A0A, super.A0C, super.A09, getColors(), new com.facebook.ads.redexgen.core.U0(this));
        android.view.View mMediaView4 = this.A0H;
        com.facebook.ads.redexgen.core.M3.A0G(1001, mMediaView4);
        android.view.View mMediaView5 = this.A0H;
        addView(mMediaView5);
        A0U();
        A0K();
        if (com.facebook.ads.redexgen.core.C0762Im.A12(this.A0U)) {
            this.A0B.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC0944Pt(this));
            android.view.View mMediaView6 = this.A0W;
            if (mMediaView6 != null) {
                this.A0W.setCTAClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC0945Pu(this));
            }
        }
    }

    private void A0S() {
        this.A0Z.A0c(this.A0i);
        this.A0Z.A0c(this.A0h);
        if (!android.text.TextUtils.isEmpty(super.A05.A1P().A0E().A07())) {
            com.facebook.ads.redexgen.core.C7V c7v = new com.facebook.ads.redexgen.core.C7V(this.A0U);
            this.A0Z.A0c(c7v);
            c7v.setImage(super.A05.A1P().A0E().A07());
        }
        this.A0Z.A0c(new com.facebook.ads.redexgen.core.C7L(this.A0U));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0T() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, this.A05);
        if (this.A0K) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            this.A0A.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        android.widget.LinearLayout linearLayout = this.A0A;
        java.lang.String[] strArr = A0l;
        if (strArr[4].length() != strArr[5].length()) {
            throw new java.lang.RuntimeException();
        }
        A0l[1] = "4k5LHuHIhnjzZvLx7p7MkTP5YYpiYy7M";
        linearLayout.setTranslationY(0.0f);
        this.A0A.setLayoutParams(layoutParams);
    }

    private void A0U() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0C.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0H.setLayoutParams(layoutParams);
    }

    private void A0W(com.facebook.ads.redexgen.core.C1F c1f) {
        double dA00 = com.facebook.ads.redexgen.core.AbstractC0904Of.A00(c1f);
        java.lang.String strA07 = c1f.A0F().A07();
        if (strA07 == null || strA07.trim().length() == 0) {
            com.facebook.ads.redexgen.core.M3.A0N(this.A0B, 8);
            if (com.facebook.ads.redexgen.core.C0762Im.A12(this.A0U)) {
                this.A0B.setClickable(false);
            }
        } else {
            this.A0C.setText(strA07);
            if (com.facebook.ads.redexgen.core.C0762Im.A12(this.A0U)) {
                this.A0B.setClickable(true);
            }
        }
        if (dA00 > 0.0d) {
            this.A03 = (int) (((double) this.A06) / dA00);
        }
        this.A03 = this.A0J ? this.A04 : this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d(com.facebook.ads.redexgen.core.C9O c9o) {
        if (this.A0Z.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A02 && com.facebook.ads.redexgen.core.C0762Im.A1U(this.A0U)) {
            postDelayed(new com.facebook.ads.redexgen.core.C1051Tw(this, c9o), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0e(java.lang.String str) {
        com.facebook.ads.redexgen.core.C1079Uy c1079Uy;
        com.facebook.ads.redexgen.core.M3.A0J(this.A0G);
        com.facebook.ads.redexgen.core.C1054Tz c1054Tz = new com.facebook.ads.redexgen.core.C1054Tz(this);
        if (this.A0U.A0D() == null) {
            this.A0U.A0E().A93();
        }
        boolean zA02 = com.facebook.ads.redexgen.core.AbstractC0763In.A02(this.A0U);
        if (A0l[6].charAt(12) != 'v') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0l;
        strArr[4] = "Q7cFr2gPd7sCHl";
        strArr[5] = "KP59UR8sut1qsy";
        if (zA02 || this.A0U.A0D() == null) {
            c1079Uy = new com.facebook.ads.redexgen.core.C1079Uy(this.A0U, c1054Tz);
        } else {
            c1079Uy = new com.facebook.ads.redexgen.core.C1079Uy(this.A0U, this.A0U.A0D(), c1054Tz);
        }
        this.A0G = c1079Uy;
        this.A0G.setOnTouchListener(new com.facebook.ads.redexgen.core.ViewOnTouchListenerC0946Pv(this));
        setUpBrowserControls(this.A0G);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A0A.addView(this.A0G, layoutParams);
        this.A0G.loadUrl(str);
    }

    private void A0f(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> mapA05 = new com.facebook.ads.redexgen.core.O8().A03(null).A02(null).A05();
        mapA05.put(A0J(0, 12, 87), str);
        this.A0V.A04(com.facebook.ads.redexgen.core.JE.A0J, mapA05);
        super.A0A.A4P(super.A05.A0Y());
        super.A07.AA9(super.A05.A1U(), mapA05);
        if (com.facebook.ads.redexgen.core.C0762Im.A2J(this.A0U)) {
            java.util.HashMap map = new java.util.HashMap();
            map.put(com.facebook.ads.redexgen.core.AbstractC1376cm.A03, java.lang.Boolean.TRUE.toString());
            map.put(com.facebook.ads.redexgen.core.AbstractC1376cm.A04, java.lang.Boolean.TRUE.toString());
            map.put(com.facebook.ads.redexgen.core.AbstractC1376cm.A05, java.lang.Boolean.TRUE.toString());
            super.A07.AAI(super.A05.A1U(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0g(java.lang.String str) {
        if (super.A05.A1M() > 0) {
            if (super.A05.A1b()) {
                boolean z = this.A0M;
                if (A0l[1].charAt(27) != 'i') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0l;
                strArr[4] = "wgFga5xemtqUSQ";
                strArr[5] = "c72BHAWejdxIIo";
                if (z) {
                    return;
                }
            }
            this.A0M = true;
            A0f(str);
            return;
        }
        boolean zA16 = super.A05.A16();
        if (A0l[1].charAt(27) == 'i') {
            java.lang.String[] strArr2 = A0l;
            strArr2[4] = "tZ3pnOdiXKjC0M";
            strArr2[5] = "WpWfv8IGy682Ke";
            if (!zA16) {
                return;
            }
        } else if (!zA16) {
            return;
        }
        A0N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0h(boolean z) {
        this.A0K = z;
        android.animation.ObjectAnimator browserTransAnim = null;
        if (z) {
            this.A02 = 0;
            this.A07 = 0;
            this.A0N = false;
            this.A0O = false;
            this.A0P = false;
            this.A0M = false;
        } else {
            android.os.Handler handler = this.A08;
            java.lang.String[] strArr = A0l;
            if (strArr[4].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0l;
            strArr2[2] = "oSgdFQK8N6jMCdYHFrH2lNgRRSqq6R";
            strArr2[3] = "578emeYNAgGRKMd25cCRfBfCVjWlDp";
            handler.removeCallbacksAndMessages(null);
        }
        java.lang.String strA0J = A0J(60, 1, 17);
        if (z) {
            browserTransAnim = android.animation.ObjectAnimator.ofFloat(this.A0H, strA0J, this.A0H.getY(), this.A05 / 5);
        }
        android.widget.LinearLayout linearLayout = this.A0A;
        float y = this.A0A.getY();
        int i = this.A05;
        if (z) {
            i /= 5;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(linearLayout, strA0J, y, i);
        objectAnimatorOfFloat.setDuration(500L);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this.A0Z, strA0J, this.A0Z.getY(), 0.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        int height = this.A0Z.getHeight();
        int i2 = this.A05;
        if (z) {
            i2 /= 5;
        }
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(height, i2).setDuration(500L);
        duration.addUpdateListener(new com.facebook.ads.redexgen.core.C0948Px(this));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, duration);
        if (browserTransAnim != null) {
            browserTransAnim.setDuration(500L);
            animatorSet.playTogether(browserTransAnim);
        }
        animatorSet.addListener(new com.facebook.ads.redexgen.core.C0949Py(this, z));
        animatorSet.start();
    }

    private void A0i(boolean z) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z);
        com.facebook.ads.redexgen.core.M3.A0J(this.A0Z);
        if (this.A0K) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0Q();
        }
        this.A0Z.setTranslationY(0.0f);
        addView(this.A0Z, 1, layoutParams);
        A0K();
        A0U();
    }

    private final boolean A0j() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final void A0z() {
        A0O();
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A0U)) {
            this.A0U.A0A().AHC(this.A0Z);
        }
        if (this.A0Y != null) {
            com.facebook.ads.redexgen.core.TC tc = this.A0Y;
            if (A0l[6].charAt(12) != 'v') {
                throw new java.lang.RuntimeException();
            }
            A0l[6] = "qZF2LURQ0N2avpQsVigAjVMCIAfnIk4T";
            tc.A05();
        }
        if (this.A0Z != null) {
            this.A0Z.getEventBus().A04(this.A0f, this.A0e, this.A0d, this.A0g, this.A0b, this.A0c);
            com.facebook.ads.redexgen.core.M3.A0H(this.A0Z);
            this.A0Z.A0V();
        }
        this.A0a.A0o();
        com.facebook.ads.redexgen.core.M3.A0b(this.A0Z, this.A0i, this.A0h);
        super.A0C.A0V();
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final void A11() {
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final void A12() {
        this.A0Z.setVolume(super.A05.A1P().A0E().A09() ? 0.0f : 1.0f);
        this.A0Z.A0b(com.facebook.ads.redexgen.core.EnumC0969Qs.A02, 20);
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final void A13(boolean z) {
        if (this.A0Z.A0j()) {
            return;
        }
        this.A0I = this.A0Z.getVideoStartReason();
        this.A0R = z;
        this.A0Z.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final void A14(boolean z) {
        if (this.A0Z.getState() != com.facebook.ads.redexgen.core.EnumC0984Rh.A06) {
            com.facebook.ads.redexgen.core.EnumC0969Qs enumC0969Qs = this.A0I;
            java.lang.String[] strArr = A0l;
            if (strArr[4].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0l;
            strArr2[4] = "XPxqC5lbhdZAQT";
            strArr2[5] = "OGUEg1S7IFb9ga";
            if (enumC0969Qs != null) {
                if (!this.A0R || z) {
                    this.A0Z.A0b(this.A0I, 19);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final boolean A15() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.U6
    public final boolean A16() {
        return false;
    }

    public com.facebook.ads.redexgen.core.C1O getColors() {
        return this.A0D;
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
        super.onConfigurationChanged(configuration);
        A0i(A0j());
        setupLayoutConfiguration(A0j());
        A0T();
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

    private void setUpBrowserControls(com.facebook.ads.redexgen.core.C1079Uy c1079Uy) {
        com.facebook.ads.redexgen.core.M3.A0J(this.A0E);
        this.A0E = new com.facebook.ads.redexgen.core.C0882Nj(this.A0U, c1079Uy);
        c1079Uy.setBrowserNavigationListener(this.A0E.getBrowserNavigationListener());
        com.facebook.ads.redexgen.core.M3.A0K(this.A0E);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0E.setListener(new com.facebook.ads.redexgen.core.C1053Ty(this));
        this.A0E.setOnTouchListener(new com.facebook.ads.redexgen.core.ViewOnTouchListenerC0947Pw(this));
        this.A0A.addView(this.A0E, layoutParams);
        com.facebook.ads.redexgen.core.M3.A0J(this.A0F);
        this.A0F = new com.facebook.ads.redexgen.core.C0883Nk(this.A0U, null, android.R.attr.progressBarStyleHorizontal);
        this.A0A.addView(this.A0F, new android.widget.LinearLayout.LayoutParams(-1, A0m));
    }

    private void setupLayoutConfiguration(boolean z) {
        this.A0J = getResources().getConfiguration().orientation == 2;
        this.A0K = z;
        this.A04 = android.content.res.Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
        android.graphics.Point point = new android.graphics.Point();
        android.view.WindowManager windowManager = (android.view.WindowManager) this.A0U.getSystemService(A0J(54, 6, 127));
        if (windowManager != null) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                android.view.WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                if (android.os.Build.VERSION.SDK_INT >= 17) {
                    defaultDisplay.getRealSize(point);
                } else {
                    try {
                        java.lang.Integer num = (java.lang.Integer) android.view.Display.class.getMethod(A0J(12, 12, 28), new java.lang.Class[0]).invoke(defaultDisplay, new java.lang.Object[0]);
                        point.y = num != null ? num.intValue() : 0;
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        }
        this.A05 = point.y > 0 ? point.y : this.A04;
        this.A03 = this.A04;
    }
}
