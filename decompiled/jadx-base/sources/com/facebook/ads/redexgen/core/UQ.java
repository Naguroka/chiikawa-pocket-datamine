package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UQ extends com.facebook.ads.redexgen.core.AbstractC0907Oi {
    public static byte[] A0k;
    public static java.lang.String[] A0l = {"fr3Y9tf6ePgTPq", "pEcG", "X6n0DjY1D3c56kEYNT7NkudbHULcUpi8", "xLfqb7j3EStc", "2nglUwJ7J1gVDM", "1eQzmRPEbuFcZFemJlVYaDXjMdIAS51D", "mnsD3rfSZRPYnMaeA3V0PZWjFbonJuRI", "JvQjcWyuZKXxmxTpCuNSfYxSgxmPRmOD"};
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public android.os.Handler A09;
    public android.view.View A0A;
    public android.view.inputmethod.InputMethodManager A0B;
    public android.widget.LinearLayout A0C;
    public android.widget.LinearLayout A0D;
    public android.widget.RelativeLayout A0E;
    public android.widget.TextView A0F;
    public com.facebook.ads.redexgen.core.AbstractC1341cD A0G;
    public com.facebook.ads.redexgen.core.C0882Nj A0H;
    public com.facebook.ads.redexgen.core.C0883Nk A0I;
    public com.facebook.ads.redexgen.core.C1079Uy A0J;
    public com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui A0K;
    public com.facebook.ads.redexgen.core.C0911Om A0L;
    public com.facebook.ads.redexgen.core.PD A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final android.os.Handler A0a;
    public final android.view.View A0b;
    public final com.facebook.ads.redexgen.core.AbstractC03250h A0c;
    public final com.facebook.ads.redexgen.core.JF A0d;
    public final com.facebook.ads.redexgen.core.OR A0e;
    public final com.facebook.ads.redexgen.core.OS A0f;
    public final com.facebook.ads.redexgen.core.N5 A0g;
    public final java.lang.Runnable A0h;
    public final java.lang.Runnable A0i;
    public final java.util.Set<java.lang.String> A0j;

    public static java.lang.String A0J(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0k, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A0l;
            if (strArr[3].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0l;
            strArr2[3] = "BAn7g4Tg6kNh";
            strArr2[1] = "sSvO";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 34);
            i4++;
        }
    }

    public static void A0X() {
        A0k = new byte[]{8, 92, 83, 86, 92, 84, 96, 76, 80, 74, 77, 92, 90, 121, 123, 106, 76, 127, 105, 86, 123, 119, 121, 118, 106, 124, 123, 101, 96, 97, 74, 120, 112, 97, 125, 122, 113, 77, 75, 93, 74, 91, 84, 81, 91, 83, 103, 94, 81, 84, 76, 93, 74, 93, 92, 64, 94, 89, 83, 88, 64, 78, 87, 80, 102, 90, 77, 88, 102, 91, 76, 77, 77, 86, 87, 119, 110, 105, 95, 119, 101, 98, 95, 105, 110, 115, 116, 97, 108, 108, 95, 98, 117, 116, 116, 111, 110, 41};
    }

    static {
        A0X();
        A0p = (int) (com.facebook.ads.redexgen.core.LP.A02 * 26.0f);
        A0m = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
        A0r = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
        A0n = (int) (com.facebook.ads.redexgen.core.LP.A02 * 24.0f);
        A0o = com.facebook.ads.redexgen.core.AbstractC03842p.A01(-1, 77);
        A0q = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
    }

    public UQ(com.facebook.ads.redexgen.core.C0911Om c0911Om) {
        super(c0911Om, true);
        this.A0X = false;
        this.A02 = -1;
        this.A0Y = false;
        this.A03 = 0;
        this.A0N = false;
        this.A0U = false;
        this.A0W = false;
        this.A0V = false;
        this.A0Z = false;
        this.A0R = false;
        this.A0T = false;
        this.A0S = false;
        this.A0Q = false;
        this.A08 = 0;
        this.A01 = 0;
        this.A0i = new com.facebook.ads.redexgen.core.P3(this);
        this.A0P = false;
        this.A0j = new java.util.HashSet();
        this.A0a = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0h = new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.Oy
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A16();
            }
        };
        this.A09 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0B = (android.view.inputmethod.InputMethodManager) c0911Om.A05().getSystemService(A0J(25, 12, 55));
        this.A0L = c0911Om;
        this.A0G = this.A0L.A04();
        this.A0d = new com.facebook.ads.redexgen.core.JF(c0911Om.A04().A1U(), c0911Om.A06());
        this.A0g = this.A0L.A0B();
        if (this.A0g != null) {
            com.facebook.ads.redexgen.core.M3.A0K(this.A0g);
        }
        this.A0b = this.A0L.A03();
        this.A0c = com.facebook.ads.redexgen.core.C03260i.A01(c0911Om.A05(), c0911Om.A06(), c0911Om.A04().A1U(), com.facebook.ads.redexgen.core.L5.A00(c0911Om.A04().A1P().A0G().A05()), new java.util.HashMap(), false, true, this.A0G.A1Q());
        com.facebook.ads.redexgen.core.AbstractC0900Ob.A00(c0911Om.A05(), this, c0911Om.A04().A1P().A0E().A07());
        setupLayoutConfiguration(false);
        A0T();
        A0P();
        postDelayed(new com.facebook.ads.redexgen.core.UT(this), 1000L);
        A0W();
        this.A0e = new com.facebook.ads.redexgen.core.US(this);
        com.facebook.ads.redexgen.core.T7 t7 = this.A0L.A02() instanceof com.facebook.ads.redexgen.core.T7 ? (com.facebook.ads.redexgen.core.T7) this.A0L.A02() : null;
        this.A0f = new com.facebook.ads.redexgen.core.OS(c0911Om, this.A0G, t7, this.A0L.A0A(), this.A0e, this.A0F, this.A0M, this.A0g, this.A0b);
        if (t7 != null && com.facebook.ads.redexgen.core.C0762Im.A1E(getAdContextWrapper())) {
            com.facebook.ads.redexgen.core.OB.A00(t7.getVideoImplView(), com.facebook.ads.redexgen.core.C0762Im.A1F(getAdContextWrapper()), new com.facebook.ads.redexgen.core.P4(this));
        } else if (t7 == null && this.A0A != null && com.facebook.ads.redexgen.core.C0762Im.A1C(getAdContextWrapper())) {
            com.facebook.ads.redexgen.core.OB.A00(this.A0A, com.facebook.ads.redexgen.core.C0762Im.A1D(getAdContextWrapper()), new com.facebook.ads.redexgen.core.P5(this));
        }
        this.A0E = null;
        this.A0K = null;
    }

    public UQ(com.facebook.ads.redexgen.core.C0911Om c0911Om, boolean z) {
        this(c0911Om);
        this.A0X = z;
        com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cDA04 = c0911Om.A04();
        this.A0Y = this.A0X && abstractC1341cDA04.A1G();
        if (this.A0X) {
            this.A02 = abstractC1341cDA04.A0Q();
            if (this.A02 == 0) {
                A16();
            } else if (this.A02 > 0 && this.A02 <= 10000) {
                this.A0a.postDelayed(this.A0h, this.A02);
            }
            java.lang.String strA0n = abstractC1341cDA04.A0n();
            if (!android.text.TextUtils.isEmpty(strA0n)) {
                for (java.lang.String stringToCheck : strA0n.split(A0J(0, 1, 10))) {
                    this.A0j.add(stringToCheck);
                }
            }
        }
    }

    public static /* synthetic */ int A03(com.facebook.ads.redexgen.core.UQ uq) {
        int i = uq.A01;
        uq.A01 = i + 1;
        return i;
    }

    public static /* synthetic */ int A05(com.facebook.ads.redexgen.core.UQ uq) {
        int i = uq.A08;
        uq.A08 = i + 1;
        return i;
    }

    private void A0K() {
        com.facebook.ads.redexgen.core.M3.A0J(this.A0D);
        this.A0D = new android.widget.LinearLayout(this.A0L.A05());
        com.facebook.ads.redexgen.core.M3.A0R(this.A0D, getAdContextWrapper());
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, this.A0N ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0D.setLayoutParams(layoutParams);
        addView(this.A0D, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public void A16() {
        A0d(((com.facebook.ads.redexgen.core.C0701Ga) this.A0c).A0G().toString());
        A0g(true);
    }

    private void A0M() {
        com.facebook.ads.redexgen.core.ExecutorC0844Lx.A00(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.Ox
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A15();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (this.A0G.A17() && this.A0P) {
            this.A0P = false;
            A0e(A0J(37, 18, 26));
        }
    }

    private void A0O() {
        if (this.A0G.A17() && this.A0P) {
            this.A0P = false;
            java.util.Map<java.lang.String, java.lang.String> mapA05 = new com.facebook.ads.redexgen.core.O8().A03(null).A02(null).A05();
            mapA05.put(A0J(1, 12, 29), A0J(37, 18, 26));
            getAdEventManager().A9w(this.A0G.A1U(), mapA05);
        }
    }

    private void A0P() {
        com.facebook.ads.redexgen.core.M3.A0J(this.A0C);
        this.A0C = new android.widget.LinearLayout(this.A0L.A05());
        this.A0C.setOrientation(1);
        com.facebook.ads.redexgen.core.M3.A0K(this.A0C);
        A0U();
        this.A0C.setBackgroundColor(-1);
        addView(this.A0C);
    }

    private void A0Q() {
        if (this.A0b != null) {
            com.facebook.ads.redexgen.core.M3.A0J(this.A0b);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(com.facebook.ads.redexgen.core.AbstractC0907Oi.A08, com.facebook.ads.redexgen.core.AbstractC0907Oi.A08);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, this.A07, com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, com.facebook.ads.redexgen.core.AbstractC0907Oi.A07);
            addView(this.A0b, layoutParams);
        }
    }

    private void A0R() {
        if (this.A0g != null) {
            com.facebook.ads.redexgen.core.M3.A0J(this.A0g);
            this.A0g.setPadding(A0q, A0q, A0q, A0q);
            this.A0g.A06(-1, A0o);
            this.A0g.setTranslationY(0.0f);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, A0p);
            layoutParams.addRule(12);
            addView(this.A0g, layoutParams);
        }
    }

    private void A0S() {
        com.facebook.ads.redexgen.core.MQ mqA09 = this.A0L.A09();
        if (mqA09 == null) {
            return;
        }
        mqA09.setPageDetailsVisible((this.A0O || mqA09.A0A()) ? false : true);
    }

    private void A0T() {
        this.A0A = this.A0L.A02();
        if (this.A0G.A17()) {
            this.A0A.setOnClickListener(new com.facebook.ads.redexgen.core.P6(this));
        }
        com.facebook.ads.redexgen.core.M3.A0J(this.A0A);
        com.facebook.ads.redexgen.core.M3.A0K(this.A0A);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        addView(this.A0A, 1, layoutParams);
        this.A0F = new android.widget.TextView(this.A0L.A05());
        com.facebook.ads.redexgen.core.M3.A0K(this.A0F);
        this.A0F.setGravity(17);
        this.A0F.setTextColor(getColors().A05(true));
        this.A0F.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A0F.setMaxLines(2);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        layoutParams2.setMargins(A0r, A0r / 2, A0r, this.A0g == null ? A0r : A0p);
        addView(this.A0F, layoutParams2);
        com.facebook.ads.redexgen.core.M3.A0K(this.A0F);
        this.A0M = new com.facebook.ads.redexgen.core.PD(this.A0L.A05(), this.A0L.A04(), this.A0L.A06(), this.A0L.A0A(), this.A0L.A0C(), this.A0L.A08(), getColors(), new com.facebook.ads.redexgen.core.UR(this));
        this.A0M.setAutoClickTime(this.A0L.A04(), this.A0L.A09());
        com.facebook.ads.redexgen.core.M3.A0G(1001, this.A0M);
        addView(this.A0M);
        A0V();
        A0K();
        if (com.facebook.ads.redexgen.core.C0762Im.A12(this.A0L.A05())) {
            this.A0D.setOnClickListener(new com.facebook.ads.redexgen.core.P7(this));
            if (this.A0L.A09() != null) {
                this.A0L.A09().setCTAClickListener(new com.facebook.ads.redexgen.core.P8(this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0U() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, this.A05);
        if (A19()) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            java.lang.String[] strArr = A0l;
            if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0l;
            strArr2[3] = "lVu96jIJ4wtN";
            strArr2[1] = "vEsO";
            this.A0C.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        android.widget.LinearLayout linearLayout = this.A0C;
        java.lang.String[] strArr3 = A0l;
        if (strArr3[4].length() != strArr3[0].length()) {
            linearLayout.setTranslationY(0.0f);
            this.A0C.setLayoutParams(layoutParams);
            return;
        }
        java.lang.String[] strArr4 = A0l;
        strArr4[6] = "ao8FhOByUXKbyI2dbjVU10hQSvAA73UK";
        strArr4[5] = "1fPkz4yBU6BXLdgQ7SVXdDzzX5ZOz4LN";
        linearLayout.setTranslationY(0.0f);
        this.A0C.setLayoutParams(layoutParams);
    }

    private void A0V() {
        com.facebook.ads.redexgen.core.C1O adColors;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, this.A0N ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0F.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0M.setLayoutParams(layoutParams);
        if (this.A0Y && this.A0K != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(this.A0N ? -2 : -1, -2);
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            layoutParams2.setMargins(A0n, 0, A0n, A0n);
            if (getContext().getResources().getConfiguration().orientation == 1) {
                adColors = this.A0L.A04().A1O().A01();
            } else {
                adColors = this.A0L.A04().A1O().A00();
            }
            this.A0K.setUpButtonColors(adColors);
            if (this.A0N) {
                this.A0K.setPadding(A0n, 0, A0n, 0);
            }
            com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui viewOnClickListenerC1063Ui = this.A0K;
            java.lang.String[] strArr = A0l;
            if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0l;
            strArr2[6] = "AuovlskRS4ra5LnKaHVdb744ygVoFjY2";
            strArr2[5] = "ls1L1tiwYnJTmONbQbVaT3PDhb5OoAVQ";
            viewOnClickListenerC1063Ui.setLayoutParams(layoutParams2);
        }
    }

    private void A0W() {
        A0R();
        A0Q();
        A0S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d(java.lang.String str) {
        com.facebook.ads.redexgen.core.C1079Uy c1079Uy;
        com.facebook.ads.redexgen.core.C1O c1oA00;
        com.facebook.ads.redexgen.core.C1O c1oA01;
        if (this.A0Y) {
            com.facebook.ads.redexgen.core.M3.A0J(this.A0E);
            com.facebook.ads.redexgen.core.M3.A0J(this.A0K);
        }
        com.facebook.ads.redexgen.core.M3.A0J(this.A0J);
        com.facebook.ads.redexgen.core.UV uv = new com.facebook.ads.redexgen.core.UV(this);
        if (this.A0L.A05().A0D() == null) {
            this.A0L.A05().A0E().A93();
        }
        if (!com.facebook.ads.redexgen.core.AbstractC0763In.A02(this.A0L.A05()) && this.A0L.A05().A0D() != null) {
            c1079Uy = new com.facebook.ads.redexgen.core.C1079Uy(this.A0L.A05(), this.A0L.A05().A0D(), uv);
        } else {
            c1079Uy = new com.facebook.ads.redexgen.core.C1079Uy(this.A0L.A05(), uv);
        }
        this.A0J = c1079Uy;
        if (this.A0X) {
            this.A0J.setInterceptRedirectRequest(new com.facebook.ads.redexgen.core.InterfaceC0890Nr() { // from class: com.facebook.ads.redexgen.X.UY
                @Override // com.facebook.ads.redexgen.core.InterfaceC0890Nr
                public final boolean A9c(java.lang.String str2) {
                    return this.A00.A1A(str2);
                }
            });
        }
        if (this.A0G.A1B() && android.os.Build.VERSION.SDK_INT > 16) {
            this.A0J.addJavascriptInterface(new com.facebook.ads.redexgen.core.C0902Od(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Ou
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.A00.A17(view);
                }
            }, this.A0J, new com.facebook.ads.redexgen.core.InterfaceC0901Oc() { // from class: com.facebook.ads.redexgen.X.UX
                @Override // com.facebook.ads.redexgen.core.InterfaceC0901Oc
                public final void ABW() {
                    this.A00.A13();
                }
            }), com.facebook.ads.redexgen.core.C0902Od.A01());
        }
        this.A0J.setOnTouchListener(new com.facebook.ads.redexgen.core.P0(this));
        setUpBrowserControls(this.A0J);
        android.widget.LinearLayout.LayoutParams webViewParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        webViewParams.weight = 0.9f;
        if (this.A0Y || this.A0G.A1B()) {
            com.facebook.ads.redexgen.core.C1199Zs c1199ZsA05 = this.A0L.A05();
            java.lang.String strA0Y = this.A0L.A04().A0Y();
            if (this.A0L.A00() == 1) {
                c1oA00 = this.A0L.A04().A1O().A01();
            } else {
                com.facebook.ads.redexgen.core.C0911Om c0911Om = this.A0L;
                java.lang.String[] strArr = A0l;
                if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0l;
                strArr2[3] = "2TqJYCounOPF";
                strArr2[1] = "eAOM";
                c1oA00 = c0911Om.A04().A1O().A00();
            }
            this.A0K = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui(c1199ZsA05, strA0Y, c1oA00, this.A0L.A04().A1P().A0G().A06(), this.A0L.A06(), this.A0L.A0A(), this.A0L.A0C(), this.A0L.A08(), this.A0L.A04().A1Q());
            this.A0K.setCta(this.A0L.A04().A1P().A0G(), this.A0L.A04().A1U(), new java.util.HashMap());
        }
        if (!this.A0Y || this.A0K == null) {
            this.A0C.addView(this.A0J, webViewParams);
        } else {
            this.A0E = new android.widget.RelativeLayout(getContext());
            this.A0E.addView(this.A0J, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            com.facebook.ads.redexgen.core.M3.A0K(this.A0K);
            this.A0K.setRoundedCornersEnabled(A00());
            this.A0K.setViewShowsOverMedia(A0C());
            if (getContext().getResources().getConfiguration().orientation == 1) {
                c1oA01 = this.A0L.A04().A1O().A01();
            } else {
                c1oA01 = this.A0L.A04().A1O().A00();
            }
            this.A0K.setUpButtonColors(c1oA01);
            if (this.A0N) {
                this.A0K.setPadding(A0n, 0, A0n, 0);
            }
            this.A0K.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Ov
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.A00.A18(view);
                }
            });
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(this.A0N ? -2 : -1, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            layoutParams.setMargins(A0n, 0, A0n, A0n);
            this.A0E.addView(this.A0K, layoutParams);
            this.A0C.addView(this.A0E, webViewParams);
        }
        this.A0J.loadUrl(str);
    }

    private void A0e(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> mapA05 = new com.facebook.ads.redexgen.core.O8().A03(null).A02(null).A05();
        mapA05.put(A0J(1, 12, 29), str);
        this.A0d.A04(com.facebook.ads.redexgen.core.JE.A0J, mapA05);
        this.A0L.A0A().A4P(this.A0G.A0Y());
        getAdEventManager().AA9(this.A0G.A1U(), mapA05);
        if (com.facebook.ads.redexgen.core.C0762Im.A2J(this.A0L.A05())) {
            java.util.HashMap map = new java.util.HashMap();
            map.put(com.facebook.ads.redexgen.core.AbstractC1376cm.A03, java.lang.Boolean.TRUE.toString());
            map.put(com.facebook.ads.redexgen.core.AbstractC1376cm.A04, java.lang.Boolean.TRUE.toString());
            map.put(com.facebook.ads.redexgen.core.AbstractC1376cm.A05, java.lang.Boolean.TRUE.toString());
            getAdEventManager().AAI(this.A0G.A1U(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0f(java.lang.String str) {
        if (this.A0G.A1M() > 0) {
            if (this.A0G.A1b() && this.A0Q) {
                return;
            }
            this.A0Q = true;
            A0e(str);
            return;
        }
        if (this.A0G.A16()) {
            A0N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0g(boolean z) {
        this.A0O = z;
        if (this.A0X && z) {
            this.A0a.removeCallbacks(this.A0h);
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = null;
        if (!z) {
            this.A09.removeCallbacksAndMessages(null);
        } else {
            this.A01 = 0;
            this.A08 = 0;
            this.A0R = false;
            this.A0S = false;
            this.A0T = false;
            this.A0Q = false;
        }
        postDelayed(new com.facebook.ads.redexgen.core.UU(this, z), 250L);
        java.lang.String strA0J = A0J(97, 1, 114);
        if (z) {
            objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.A0M, strA0J, this.A0M.getY(), this.A05 / 5);
        }
        android.widget.LinearLayout linearLayout = this.A0C;
        float y = this.A0C.getY();
        int i = this.A05;
        if (z) {
            i /= 5;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(linearLayout, strA0J, y, i);
        objectAnimatorOfFloat2.setDuration(500L);
        android.animation.ObjectAnimator browserTransAnim = android.animation.ObjectAnimator.ofFloat(this.A0A, strA0J, this.A0A.getY(), 0.0f);
        browserTransAnim.setDuration(500L);
        int height = this.A0A.getHeight();
        int i2 = this.A05;
        if (z) {
            i2 /= 5;
        }
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(height, i2).setDuration(500L);
        duration.addUpdateListener(new com.facebook.ads.redexgen.core.P1(this));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat2, browserTransAnim, duration);
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setDuration(500L);
            animatorSet.playTogether(objectAnimatorOfFloat);
        }
        animatorSet.addListener(new com.facebook.ads.redexgen.core.P2(this, z));
        animatorSet.start();
    }

    private void A0h(boolean z) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z);
        com.facebook.ads.redexgen.core.M3.A0J(this.A0A);
        if (this.A0A == null) {
            this.A0A = this.A0L.A02();
            com.facebook.ads.redexgen.core.M3.A0K(this.A0A);
        }
        boolean z2 = this.A0O;
        java.lang.String[] strArr = A0l;
        if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0l;
        strArr2[2] = "vsQMzuL85pElT0uyLkCOYkbLp6FYZ6Kp";
        strArr2[7] = "Jg0wEDfumSgIDDBadFZcUW5HjHx0Xq4t";
        if (z2) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            if (com.facebook.ads.redexgen.core.C0762Im.A1C(getAdContextWrapper()) && getResources().getConfiguration().orientation == 2 && !(this.A0A instanceof com.facebook.ads.redexgen.core.T7)) {
                layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -1);
            }
            layoutParams.addRule(13);
            A0P();
        }
        this.A0A.setTranslationY(0.0f);
        addView(this.A0A, 1, layoutParams);
        A0K();
        A0V();
    }

    private boolean A0i() {
        return this.A0G.A1P().A0E().A0A() && this.A0V && !this.A0Z && !this.A0W;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A0v() {
        if (this.A0X) {
            this.A0a.removeCallbacks(this.A0h);
        }
        A0O();
        super.A0v();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A0w() {
        com.facebook.ads.redexgen.core.MQ mqA09 = this.A0L.A09();
        if (mqA09 != null) {
            mqA09.setPageDetailsVisible((A19() || mqA09.A0A()) ? false : true);
        }
        this.A0V = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A0x() {
        if (this.A0L.A09() != null) {
            this.A0L.A09().setPageDetailsVisible(false);
        }
        this.A0V = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A0y() {
        this.A0W = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A0z() {
        this.A0W = this.A0G.A1P().A0E().A03() > 0;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0017  */
    /* JADX WARN: Code duplicated, block: B:8:0x002a  */
    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final void A10(com.facebook.ads.redexgen.core.C1F c1f, java.lang.String str, double d, android.os.Bundle bundle) {
        super.A10(c1f, str, d, bundle);
        java.lang.String strA07 = c1f.A0F().A07();
        if (strA07 != null) {
            java.lang.String description = strA07.trim();
            if (description.length() == 0) {
                com.facebook.ads.redexgen.core.M3.A0N(this.A0D, 8);
                if (com.facebook.ads.redexgen.core.C0762Im.A12(this.A0L.A05())) {
                    this.A0D.setClickable(false);
                }
            } else {
                this.A0F.setText(strA07);
                if (com.facebook.ads.redexgen.core.C0762Im.A12(this.A0L.A05())) {
                    android.widget.LinearLayout linearLayout = this.A0D;
                    java.lang.String[] strArr = A0l;
                    if (strArr[2].charAt(25) == strArr[7].charAt(25)) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A0l;
                    strArr2[3] = "eomTAZA5kOTO";
                    strArr2[1] = "I37n";
                    linearLayout.setClickable(true);
                }
            }
        } else {
            com.facebook.ads.redexgen.core.M3.A0N(this.A0D, 8);
            if (com.facebook.ads.redexgen.core.C0762Im.A12(this.A0L.A05())) {
                this.A0D.setClickable(false);
            }
        }
        if (d > 0.0d) {
            this.A03 = (int) (((double) this.A06) / d);
        }
        this.A03 = this.A0N ? this.A04 : this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final boolean A11() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public final boolean A12(boolean z) {
        if (A19()) {
            A0g(false);
            return true;
        }
        if (!A0i()) {
            return false;
        }
        this.A0f.A07(this);
        return true;
    }

    public final /* synthetic */ void A13() {
        this.A0L.A05().A0E().AAd();
    }

    public final /* synthetic */ void A14() {
        if (this.A0K != null) {
            this.A0L.A05().A0E().AAc();
            this.A0K.A09(A0J(61, 14, 27));
        }
    }

    public final /* synthetic */ void A15() {
        if (this.A0K != null) {
            this.A0L.A05().A0E().AAg();
            this.A0K.A09(A0J(75, 22, 34));
        }
    }

    public final /* synthetic */ void A17(android.view.View view) {
        A0M();
    }

    public final /* synthetic */ void A18(android.view.View view) {
        com.facebook.ads.redexgen.core.ExecutorC0844Lx.A00(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.Ow
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A14();
            }
        });
    }

    public final boolean A19() {
        return this.A0O;
    }

    public final /* synthetic */ boolean A1A(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.A0j.isEmpty()) {
            return true;
        }
        java.util.Iterator<java.lang.String> it = this.A0j.iterator();
        while (it.hasNext()) {
            if (!str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public int getCloseButtonStyle() {
        if (A19()) {
            return 3;
        }
        if (this.A0W) {
            return 2;
        }
        if (this.A0G.A1P().A0E().A0A()) {
            return 1;
        }
        if (this.A0V) {
            return 4;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0h(A19());
        A0W();
        setupLayoutConfiguration(A19());
        A0U();
    }

    private void setUpBrowserControls(com.facebook.ads.redexgen.core.C1079Uy c1079Uy) {
        com.facebook.ads.redexgen.core.M3.A0J(this.A0H);
        this.A0H = new com.facebook.ads.redexgen.core.C0882Nj(this.A0L.A05(), c1079Uy, true);
        c1079Uy.setBrowserNavigationListener(this.A0H.getBrowserNavigationListener());
        com.facebook.ads.redexgen.core.M3.A0K(this.A0H);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0H.setListener(new com.facebook.ads.redexgen.core.UW(this));
        this.A0H.setOnTouchListener(new com.facebook.ads.redexgen.core.ViewOnTouchListenerC0924Oz(this));
        this.A0C.addView(this.A0H, layoutParams);
        com.facebook.ads.redexgen.core.M3.A0J(this.A0I);
        this.A0I = new com.facebook.ads.redexgen.core.C0883Nk(this.A0L.A05(), null, android.R.attr.progressBarStyleHorizontal);
        this.A0C.addView(this.A0I, new android.widget.LinearLayout.LayoutParams(-1, A0m));
    }

    private void setupLayoutConfiguration(boolean z) {
        this.A0N = getResources().getConfiguration().orientation == 2;
        this.A07 = this.A0L.A09() == null ? 0 : this.A0L.A09().getToolbarHeight();
        this.A0O = z;
        this.A04 = android.content.res.Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
        android.graphics.Point point = new android.graphics.Point();
        android.view.WindowManager windowManager = (android.view.WindowManager) getAdContextWrapper().getSystemService(A0J(55, 6, 21));
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
                        java.lang.Integer num = (java.lang.Integer) android.view.Display.class.getMethod(A0J(13, 12, 60), new java.lang.Class[0]).invoke(defaultDisplay, new java.lang.Object[0]);
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
