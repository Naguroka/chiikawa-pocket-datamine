package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VA extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.MS {
    public static byte[] A0b;
    public static java.lang.String[] A0c = {"HOR7o31Iej4cYWuhQXExnEuENMywT0cc", "lMe4cl58LNQGNUAHyasApQ9JUE0svDiV", "D3sd2x1kxAGmbwUwbgSwAdGIbJmc5gOO", "0qcoppWNPh", "IKOWodR4Z8ze5gnDmb", "KTSiIx6w", "wnW3I4EzpNnUTo4gipPMifUFglZZiY67", "f8O"};
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public static final int A0i;
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final android.widget.RelativeLayout.LayoutParams A0q;
    public android.view.View A00;
    public android.widget.RelativeLayout A01;
    public android.widget.RelativeLayout A02;
    public android.widget.Toast A03;
    public com.facebook.ads.redexgen.core.C5Q A04;
    public com.facebook.ads.redexgen.core.LH A05;
    public com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui A06;
    public com.facebook.ads.redexgen.core.QV A07;
    public com.facebook.ads.redexgen.core.C0953Qc A08;
    public java.lang.String A09;
    public java.lang.String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A0I;
    public final com.facebook.ads.redexgen.core.C03441b A0J;
    public final com.facebook.ads.redexgen.core.C5W A0K;
    public final com.facebook.ads.redexgen.core.C1199Zs A0L;
    public final com.facebook.ads.redexgen.core.J7 A0M;
    public final com.facebook.ads.redexgen.core.JF A0N;
    public final com.facebook.ads.redexgen.core.LH A0O;
    public final com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC0837Lq A0P;
    public final com.facebook.ads.redexgen.core.MR A0Q;
    public final com.facebook.ads.redexgen.core.N9 A0R;
    public final com.facebook.ads.redexgen.core.OR A0S;
    public final com.facebook.ads.redexgen.core.OS A0T;
    public final com.facebook.ads.redexgen.core.C0951Qa A0U;
    public final java.util.concurrent.atomic.AtomicBoolean A0V;
    public final java.util.concurrent.atomic.AtomicBoolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final com.facebook.ads.redexgen.core.MQ A0a;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public VA(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, java.lang.String str, com.facebook.ads.redexgen.core.N9 n9, boolean z) {
        super(c1199Zs);
        java.lang.String strA0D = A0D(0, 0, 113);
        this.A0A = strA0D;
        this.A09 = strA0D;
        this.A0K = new com.facebook.ads.redexgen.core.VH(this);
        this.A0W = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A0V = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A0F = false;
        this.A0H = true;
        this.A0C = false;
        this.A0B = false;
        this.A0Z = z;
        this.A0L = c1199Zs;
        this.A0Q = mr;
        this.A0M = j7;
        this.A0I = abstractC1341cD;
        this.A0J = abstractC1341cD.A1P().A0E().A06();
        this.A0N = new com.facebook.ads.redexgen.core.JF(this.A0I.A1U(), this.A0M);
        this.A0R = n9;
        this.A08 = new com.facebook.ads.redexgen.core.C0953Qc(c1199Zs, this.A0R, str, this.A0Q);
        if (abstractC1341cD.A1P().A0E().A06() != null) {
            this.A0D = abstractC1341cD.A1P().A0E().A06().A0M();
            this.A0A = abstractC1341cD.A1P().A0E().A06().A0H();
            this.A09 = abstractC1341cD.A1P().A0E().A06().A0G();
        }
        this.A0E = this.A0I.A1P().A0O() && this.A0I.A1P().A0E().A02() > 0;
        this.A0Y = this.A0I.A1P().A0E().A0A();
        if (this.A0J == null) {
            this.A0Q.A4P(this.A0R.A7M());
            this.A0Q.A4P(this.A0R.A7I());
        }
        int iA02 = this.A0J != null ? !this.A0J.A0O() ? (this.A0E && this.A0Y) ? this.A0I.A1P().A0E().A02() : this.A0J.A07() : this.A0J.A08() : 0;
        this.A0W.set(!this.A0J.A0L());
        com.facebook.ads.redexgen.core.VH vh = null;
        this.A0O = new com.facebook.ads.redexgen.core.LH(iA02, new com.facebook.ads.redexgen.core.VC(this, vh));
        this.A0X = com.facebook.ads.redexgen.core.C0762Im.A0l(this.A0L);
        this.A0a = A07();
        if (this.A0J.A0O()) {
            this.A0a.A05();
        }
        this.A0U = new com.facebook.ads.redexgen.core.C0951Qa(this.A0L, this.A0M, this.A0I);
        com.facebook.ads.redexgen.core.AbstractC0900Ob.A00(c1199Zs, this, abstractC1341cD.A1P().A0E().A07());
        this.A0P = new com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC0837Lq(this);
        this.A0P.A05(com.facebook.ads.redexgen.core.EnumC0836Lp.A02);
        if (com.facebook.ads.redexgen.core.C0762Im.A29(this.A0L)) {
            this.A0a.setProgressSpinnerInvisible(true);
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put(A0D(56, 9, 90), this.A0R.A83());
        this.A07 = new com.facebook.ads.redexgen.core.QV(this.A0L, this.A0I, this.A0J, this.A0M, new com.facebook.ads.redexgen.core.VB(this, vh), map);
        A0K();
        this.A0Q.A3q(this, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        A0H();
        this.A0S = new com.facebook.ads.redexgen.core.VG(this);
        this.A0T = new com.facebook.ads.redexgen.core.OS(this.A0L, this.A0a, this.A0I, (com.facebook.ads.redexgen.core.T7) null, this.A0Q, this.A0S, this.A06, this.A01, this.A07);
    }

    public static java.lang.String A0D(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0b, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 107);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0N() {
        A0b = new byte[]{124, 85, 123, 83, 69, 67, 83, 125, 49, 62, 59, 49, 57, 13, kotlin.io.encoding.Base64.padSymbol, 32, 59, 53, 59, 60, 15, 0, 5, 15, 7, 51, 31, 3, 25, 30, 15, 9, 62, 57, 35, 50, 37, 36, 35, 62, 35, 62, 54, 59, 87, 88, 77, 80, 79, 92, 102, 90, 85, 80, 90, 82, 65, 93, 80, 82, 84, 92, 84, 95, 69, 104, 127, 109, 123, 104, 126, 127, 126, 69, 108, 115, 126, 127, 117, 30, 12, 11, 31, 0, 12, 30, 54, 10, 5, 0, 10, 2};
    }

    static {
        A0N();
        A0o = (int) (com.facebook.ads.redexgen.core.LP.A02 * 64.0f);
        A0g = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
        A0p = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
        A0e = (int) (com.facebook.ads.redexgen.core.LP.A02 * 10.0f);
        A0q = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        A0h = (int) (com.facebook.ads.redexgen.core.LP.A02 * 48.0f);
        A0i = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
        A0n = (int) (com.facebook.ads.redexgen.core.LP.A02 * 14.0f);
        A0l = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
        A0m = com.facebook.ads.redexgen.core.AbstractC03842p.A01(-1, 77);
        A0d = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
        A0j = (int) (com.facebook.ads.redexgen.core.LP.A02 * 20.0f);
        A0k = (int) (com.facebook.ads.redexgen.core.LP.A02 * 13.0f);
        A0f = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    }

    public VA(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, java.lang.String str, com.facebook.ads.redexgen.core.N9 n9) {
        this(c1199Zs, j7, mr, abstractC1341cD, str, n9, false);
    }

    private com.facebook.ads.internal.view.FullScreenAdToolbar A07() {
        com.facebook.ads.internal.view.FullScreenAdToolbar fullScreenAdToolbar = new com.facebook.ads.internal.view.FullScreenAdToolbar(this.A0L, this.A0Q, this.A0N, 0, this.A0I.A1J(), this.A0D);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.A09(this.A0I.A1O().A01(), com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui.A08(this.A0I));
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0I.A1S(), this.A0I.A1U(), this.A0J.A07(), this.A0I.A1T());
        fullScreenAdToolbar.setToolbarListener(new com.facebook.ads.redexgen.core.VD(this));
        return fullScreenAdToolbar;
    }

    private com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui A09() {
        if (this.A07 == null || this.A07.getViewabilityChecker() == null || this.A07.getTouchDataRecorder() == null) {
            return null;
        }
        com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui viewOnClickListenerC1063Ui = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui(this.A0L, this.A0R.A6p(), this.A0I.A1O().A01(), this.A0M, this.A0Q, this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0I.A1Q());
        com.facebook.ads.redexgen.core.M3.A0K(viewOnClickListenerC1063Ui);
        viewOnClickListenerC1063Ui.setText(this.A0I.A1P().A0G().A04());
        viewOnClickListenerC1063Ui.setTextSize(14.0f);
        viewOnClickListenerC1063Ui.setPadding(A0e, A0e, A0e, A0e);
        viewOnClickListenerC1063Ui.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC0863Mq(this));
        return viewOnClickListenerC1063Ui;
    }

    private com.facebook.ads.redexgen.core.C0899Oa A0B() {
        com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A0L;
        com.facebook.ads.redexgen.core.C1O c1oA01 = this.A0I.A1O().A01();
        int i = !this.A0E ? 16 : 17;
        boolean z = this.A0E;
        java.lang.String[] strArr = A0c;
        if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0c;
        strArr2[7] = "YLS";
        strArr2[4] = "sNsC3VBoYaF6TxGjee";
        com.facebook.ads.redexgen.core.C0899Oa c0899Oa = new com.facebook.ads.redexgen.core.C0899Oa(c1199Zs, c1oA01, true, i, !z ? 14 : 13, 0);
        c0899Oa.A03(this.A0I.A1P().A0F().A08(), this.A0I.A1P().A0F().A07(), null, false, true);
        android.widget.TextView descriptionTv = c0899Oa.getDescriptionTextView();
        descriptionTv.setAlpha(0.8f);
        descriptionTv.setMaxLines(1);
        descriptionTv.setEllipsize(android.text.TextUtils.TruncateAt.END);
        android.widget.TextView descriptionTv2 = c0899Oa.getTitleTextView();
        descriptionTv2.setMaxLines(1);
        descriptionTv2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        return c0899Oa;
    }

    private void A0G() {
        java.lang.String strA01;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0h, A0h);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        com.facebook.ads.redexgen.core.OU ou = new com.facebook.ads.redexgen.core.OU(this.A0L);
        com.facebook.ads.redexgen.core.M3.A0M(ou, 0);
        com.facebook.ads.redexgen.core.M3.A0K(ou);
        new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(ou, this.A0L).A05(A0h, A0h).A07(this.A0I.A1S().A01());
        android.widget.TextView textView = new android.widget.TextView(this.A0L);
        com.facebook.ads.redexgen.core.M3.A0K(textView);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(this.A0I.A1O().A01().A06(true));
        textView.setText(this.A0I.A1P().A0F().A08());
        textView.setTextSize(!this.A0D ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        com.facebook.ads.redexgen.core.OW ow = new com.facebook.ads.redexgen.core.OW(this.A0L, !this.A0D ? A0n : A0l, 5, A0m, -1);
        ow.setGravity(16);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -1);
        android.widget.TextView textView2 = new android.widget.TextView(this.A0L);
        textView2.setTextColor(this.A0I.A1O().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        if (!this.A0D) {
            textView2.setTextSize(13.0f);
        }
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -1);
        layoutParams3.leftMargin = A0f;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A0L);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(-2, A0i);
        layoutParams4.topMargin = A0f / 2;
        layoutParams4.addRule(3, textView.getId());
        linearLayout.addView(ow, layoutParams2);
        linearLayout.addView(textView2, layoutParams3);
        android.widget.RelativeLayout.LayoutParams ratingInfoContainerParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ratingInfoContainerParams.leftMargin = A0f;
        ratingInfoContainerParams.addRule(1, ou.getId());
        ratingInfoContainerParams.addRule(15);
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams4);
        relativeLayout.addView(textView);
        if (this.A02 != null) {
            this.A02.removeAllViews();
            this.A02.addView(relativeLayout, ratingInfoContainerParams);
            this.A02.addView(ou, layoutParams);
        }
        if (android.text.TextUtils.isEmpty(this.A0I.A1P().A0F().A05())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        ow.setRating(java.lang.Float.parseFloat(this.A0I.A1P().A0F().A05()));
        if (this.A0I.A1P().A0F().A04() == null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(A0D(0, 1, 63));
        if (!this.A0D) {
            strA01 = java.text.NumberFormat.getNumberInstance().format(java.lang.Integer.parseInt(this.A0I.A1P().A0F().A04()));
        } else {
            strA01 = com.facebook.ads.redexgen.core.LY.A01(java.lang.Integer.parseInt(this.A0I.A1P().A0F().A04()));
        }
        sb.append(strA01);
        sb.append(A0D(1, 1, 23));
        textView2.setText(sb.toString());
    }

    private void A0H() {
        if (this.A0J.A0L()) {
            A0J();
        } else {
            A0M();
        }
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            this.A0P.A05(com.facebook.ads.redexgen.core.EnumC0836Lp.A03);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A0G = true;
        if (this.A0I.A1P().A0O()) {
            this.A08.A05();
            this.A0Q.A4Q(this.A0R.A6F(), new com.facebook.ads.redexgen.core.C9R(0, 0));
        }
    }

    private void A0J() {
        com.facebook.ads.redexgen.core.Q7 q7A0F = new com.facebook.ads.redexgen.core.Q5(this.A0L, this.A0I.A1P().A0F(), this.A0I.A1S()).A0A(this.A0I.A1O().A01()).A0D(this.A0J.A0J()).A0C(this.A0J.A0E()).A09(2000).A0E(this.A0D).A0B(this.A0A).A0F();
        com.facebook.ads.redexgen.core.JH.A04(q7A0F, this.A0N, com.facebook.ads.redexgen.core.JE.A0U);
        addView(q7A0F, A0q);
        q7A0F.A04(new com.facebook.ads.redexgen.core.VF(this));
    }

    private void A0K() {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        this.A06 = A09();
        this.A01 = new android.widget.RelativeLayout(getContext());
        com.facebook.ads.redexgen.core.M3.A0K(this.A01);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(A0g, A0p, A0g, A0p);
        layoutParams2.addRule(12);
        this.A02 = new android.widget.RelativeLayout(getContext());
        com.facebook.ads.redexgen.core.M3.A0K(this.A02);
        if (this.A0X) {
            A0G();
        } else {
            android.widget.RelativeLayout relativeLayout = this.A02;
            com.facebook.ads.redexgen.core.C0899Oa c0899OaA0B = A0B();
            android.widget.RelativeLayout.LayoutParams appMetadataLayoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.addView(c0899OaA0B, appMetadataLayoutParams);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, A0g, 0);
        this.A01.addView(this.A02, layoutParams3);
        if (this.A06 != null) {
            com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui viewOnClickListenerC1063Ui = this.A06;
            java.lang.String[] strArr = A0c;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new java.lang.RuntimeException();
            }
            A0c[3] = "f";
            layoutParams3.addRule(0, viewOnClickListenerC1063Ui.getId());
            if (!this.A0D) {
                layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(6, this.A02.getId());
                layoutParams.addRule(8, this.A02.getId());
            } else {
                layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                com.facebook.ads.redexgen.core.M3.A0S(this.A06, com.facebook.ads.redexgen.core.M3.A06(-16738826, A0d));
                if (android.os.Build.VERSION.SDK_INT >= 21) {
                    this.A06.setStateListAnimator(null);
                }
                this.A06.setPadding(A0j, A0k, A0j, A0k);
                com.facebook.ads.redexgen.core.M3.A0X(this.A06);
            }
            layoutParams.addRule(11);
            this.A01.addView(this.A06, layoutParams);
        }
        com.facebook.ads.redexgen.core.M3.A0K(this.A0a);
        android.widget.RelativeLayout.LayoutParams adWebViewParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        adWebViewParams.addRule(10);
        android.widget.RelativeLayout.LayoutParams iconAndMetaDataContainerParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        iconAndMetaDataContainerParams.setMargins(A0g, 0, A0g, 0);
        iconAndMetaDataContainerParams.addRule(3, this.A0a.getId());
        iconAndMetaDataContainerParams.addRule(2, this.A01.getId());
        this.A0a.setVisibility(4);
        this.A07.setVisibility(4);
        this.A01.setVisibility(4);
        addView(this.A0a, adWebViewParams);
        addView(this.A07, iconAndMetaDataContainerParams);
        addView(this.A01, layoutParams2);
        if (this.A0J.A0N()) {
            this.A07.A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        new com.facebook.ads.redexgen.core.JF(this.A0I.A1U(), this.A0M).A04(com.facebook.ads.redexgen.core.JE.A0x, null);
        this.A0V.set(true);
        com.facebook.ads.redexgen.core.M3.A0T(this);
        com.facebook.ads.redexgen.core.M3.A0H(this.A07);
        com.facebook.ads.redexgen.core.M3.A0b(this.A0T, this.A00, this.A07);
        if (this.A0D) {
            if (this.A0X) {
                com.facebook.ads.redexgen.core.M3.A0H(this.A0a);
            }
        } else {
            com.facebook.ads.redexgen.core.M3.A0L(this.A0a);
        }
        com.facebook.ads.redexgen.core.M3.A0L(this.A06);
        android.util.Pair<com.facebook.ads.redexgen.core.QZ, android.view.View> pairA03 = this.A0U.A03(this.A06);
        this.A00 = (android.view.View) pairA03.second;
        switch (com.facebook.ads.redexgen.core.C0864Mr.A00[((com.facebook.ads.redexgen.core.QZ) pairA03.first).ordinal()]) {
            case 1:
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, this.A0a.getToolbarHeight(), 0, 0);
                if (!this.A0D) {
                    com.facebook.ads.redexgen.core.M3.A0L(this.A01);
                    android.widget.RelativeLayout relativeLayout = this.A01;
                    java.lang.String[] strArr = A0c;
                    if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A0c;
                    strArr2[0] = "NCG6dD1sAPFbWTySRxInyY8ppXyMF33j";
                    strArr2[2] = "WdNFAV1bp8QAHjjZXwWCxzFqJ2u0nxRS";
                    if (relativeLayout != null) {
                        layoutParams.addRule(2, this.A01.getId());
                    }
                    addView(this.A00, layoutParams);
                    return;
                }
                addView(new com.facebook.ads.redexgen.core.Q2(this.A0L, this.A0I.A1S(), this.A0I.A1P().A0F(), A09(), this.A09, new com.facebook.ads.redexgen.core.ViewOnClickListenerC0862Mp(this)), new android.widget.RelativeLayout.LayoutParams(-1, -1));
                removeView(this.A0a);
                return;
            case 2:
                if (this.A01 != null) {
                    com.facebook.ads.redexgen.core.M3.A0b(this.A01);
                }
                android.view.ViewGroup.LayoutParams infoParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                addView(this.A00, infoParams);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M() {
        com.facebook.ads.redexgen.core.M3.A0T(this);
        if (!this.A0J.A0N()) {
            this.A07.A0B();
        }
        this.A0a.setVisibility(0);
        this.A07.setVisibility(0);
        if (this.A01 != null) {
            android.widget.RelativeLayout relativeLayout = this.A01;
            java.lang.String[] strArr = A0c;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new java.lang.RuntimeException();
            }
            A0c[3] = "XO2ZpTY6Mgvz2u";
            relativeLayout.setVisibility(0);
        }
        if (this.A06 != null && this.A0I.A1M() > 0 && this.A05 == null) {
            this.A05 = new com.facebook.ads.redexgen.core.LH(this.A0I.A1M(), new com.facebook.ads.redexgen.core.VE(this));
            this.A05.A07();
        }
        this.A0O.A07();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(int i) {
        java.lang.String strValueOf = java.lang.String.valueOf(i);
        android.widget.Toast toast = this.A03;
        java.lang.String strA0D = this.A0J.A0D();
        java.lang.String progress = A0D(2, 6, 75);
        com.facebook.ads.redexgen.core.M3.A0Z(toast, strA0D.replace(progress, strValueOf), 49, 0, A0o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0U(boolean z, java.lang.String str) {
        this.A0C = true;
        java.util.HashMap map = new java.util.HashMap();
        map.put(A0D(8, 12, 57), z ? A0D(79, 13, 2) : A0D(44, 12, 82));
        map.put(A0D(20, 12, 7), str);
        new com.facebook.ads.redexgen.core.OH(this.A0L, this.A0R.A6p(), this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0M, this.A0I.A1Q(), this.A0Q).A08(this.A0I.A1U(), this.A0I.A1P().A0G().A05(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0V() {
        return this.A0I.A0c().equals(A0D(65, 14, 113)) || (this.A0I.A0c().equals(A0D(32, 12, 60)) && this.A0I.A1P().A0Q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0W() {
        return this.A0Y && !this.A0F && !this.A0H && this.A0J.A07() < this.A0I.A1P().A0E().A02();
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void A9q(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C5Q c5q) {
        this.A04 = c5q;
        this.A04.A0A(this.A0K);
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ACz(boolean z) {
        this.A0O.A06();
        this.A0B = true;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ADN(boolean z) {
        if ((!this.A0Y || !this.A0H) && !this.A0F) {
            boolean z2 = this.A0W.get();
            java.lang.String[] strArr = A0c;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0c;
            strArr2[0] = "5YF9hd1VnayjDYXn8X9NIXHiJcVpNWhU";
            strArr2[2] = "6mHNY01g6eF3bUPoEn1oonlPgYyDS663";
            if (z2) {
                com.facebook.ads.redexgen.core.LH lh = this.A0O;
                java.lang.String[] strArr3 = A0c;
                if (strArr3[6].charAt(22) != strArr3[1].charAt(22)) {
                    java.lang.String[] strArr4 = A0c;
                    strArr4[7] = "SY9";
                    strArr4[4] = "T1jNCZgiG5fRSAcWDF";
                    if (lh.A05()) {
                        return;
                    }
                } else {
                    java.lang.String[] strArr5 = A0c;
                    strArr5[7] = "0UX";
                    strArr5[4] = "cSjXeSxWsZqlnq3791";
                    if (lh.A05()) {
                        return;
                    }
                }
                this.A0O.A07();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void AFx(android.os.Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public java.lang.String getCurrentClientToken() {
        return this.A0I.A1U();
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void onDestroy() {
        this.A0P.A03();
        if (this.A04 != null) {
            this.A04.A0B(this.A0K);
        }
        if (this.A07 != null) {
            if (!android.text.TextUtils.isEmpty(this.A0I.A1U())) {
                this.A0M.A9x(this.A0I.A1U(), new com.facebook.ads.redexgen.core.O8().A03(this.A07.getViewabilityChecker()).A02(this.A07.getTouchDataRecorder()).A05());
            }
            this.A07.A0C();
        }
        this.A0O.A06();
        this.A0a.setToolbarListener(null);
        this.A03 = null;
        this.A04 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            ADN(false);
        } else {
            ACz(false);
        }
    }

    public void setListener(com.facebook.ads.redexgen.core.MR mr) {
    }

    public void setServerSideRewardHandler(com.facebook.ads.redexgen.core.C0953Qc c0953Qc) {
        this.A08 = c0953Qc;
    }
}
