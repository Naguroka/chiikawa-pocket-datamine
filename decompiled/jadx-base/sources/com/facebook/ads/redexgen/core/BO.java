package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BO extends android.widget.FrameLayout implements com.facebook.ads.redexgen.core.MS, com.facebook.ads.redexgen.core.U9 {
    public static byte[] A0I;
    public static java.lang.String[] A0J = {"UTx0mthy689a2sWy4JVu0tmbo5tf7DAX", "DpQrJfF4GGVCKG366ycalUQvQmaAeTpv", "eTaJ9UlZkoiVo78onrsfkh8qyWU6l07Y", "ASk", "tRl9yBUHWghtVC3MTlEkON1DGIMHt5L9", "IjjI8eijgHBxehc5IxL2bCSmbEZHlZYm", "ajbOHBl4KDnxYMWXO0J67", "uiq3lL8JcMvDgND3txStxUQziaPHduab"};
    public com.facebook.ads.redexgen.core.C5Q A00;
    public com.facebook.ads.redexgen.core.C5W A01;
    public com.facebook.ads.redexgen.core.InterfaceC0936Pl A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A06;
    public final com.facebook.ads.redexgen.core.C1199Zs A07;
    public final com.facebook.ads.redexgen.core.J7 A08;
    public final com.facebook.ads.redexgen.core.JF A09;
    public final com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC0837Lq A0A;
    public final com.facebook.ads.redexgen.core.C0842Lv A0B;
    public final com.facebook.ads.redexgen.core.MR A0C;
    public final com.facebook.ads.redexgen.core.N9 A0D;
    public final com.facebook.ads.redexgen.core.PT A0E;
    public final com.facebook.ads.redexgen.core.C0926Pb A0F;
    public final com.facebook.ads.redexgen.core.AbstractC0986Rj A0G;
    public final com.facebook.ads.redexgen.core.C0987Rk A0H;

    public static java.lang.String A0B(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{24, 47, 47, 50, 47, 125, 62, 47, 56, 60, 41, 52, 51, 58, 125, 62, 50, 51, 59, 52, 58, 125, 23, 14, 18, 19, 78, 69, 76, 68, 67, 72, 73, 114, 76, 73, 36, 47, 38, 46, 41, 34, 35, 24, 38, 35, 24, 46, 41, 35, 34, okio.Utf8.REPLACEMENT_BYTE, 46, 37, 44, 36, 35, 40, 41, 18, 44, 41, 18, 57, 34, 57, 44, 33, 91, 80, 89, 81, 86, 93, 92, 103, 76, 81, 85, 93, 103, 75, 72, 93, 86, 76, 35, 44, 41, 35, 43, 31, 51, 47, 53, 50, 35, 37, 74, 76, 90, 77, 92, 83, 86, 92, 84};
    }

    static {
        A0D();
    }

    public BO(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.N9 n9, int i) {
        super(c1199Zs);
        this.A01 = new com.facebook.ads.redexgen.core.UM(this);
        this.A0G = new com.facebook.ads.redexgen.core.UL(this);
        this.A03 = true;
        this.A07 = c1199Zs;
        this.A08 = j7;
        this.A0C = mr;
        this.A06 = abstractC1341cD;
        this.A0D = n9;
        com.facebook.ads.redexgen.core.C0926Pb c0926PbA02 = com.facebook.ads.redexgen.core.AbstractC0927Pc.A02(abstractC1341cD.A0l());
        if (c0926PbA02 == null) {
            this.A0F = new com.facebook.ads.redexgen.core.C0926Pb(this.A07, abstractC1341cD, j7, i);
            this.A04 = false;
        } else {
            this.A0F = c0926PbA02;
            this.A04 = true;
        }
        this.A09 = this.A0F.A0K();
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new com.facebook.ads.redexgen.core.UK(this));
        com.facebook.ads.redexgen.core.M3.A0G(1003, this.A0F.A0O());
        if (this.A06.A11()) {
            this.A0E = new com.facebook.ads.redexgen.core.PT(this.A07, this.A08, this.A06, new com.facebook.ads.redexgen.core.C04766f(this.A07), this.A09, this.A0C, this.A0D, new com.facebook.ads.redexgen.core.UJ(this));
            this.A0E.A0N();
            this.A0F.A0O().setOnTouchListener(new com.facebook.ads.redexgen.core.PP(this));
            addView(this.A0E, new android.widget.FrameLayout.LayoutParams(-1, -1));
        } else {
            this.A0E = null;
        }
        android.view.ViewGroup mediaView = getMediaView();
        this.A0H = new com.facebook.ads.redexgen.core.C0987Rk(mediaView, 1, new java.lang.ref.WeakReference(this.A0G), this.A07);
        this.A0H.A0W(this.A06.A0O());
        this.A0H.A0X(this.A06.A0P());
        this.A0F.A0e(this.A0H);
        this.A0A = new com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC0837Lq(this);
        this.A0A.A05(com.facebook.ads.redexgen.core.EnumC0836Lp.A02);
        setBackgroundColor(0);
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(c1199Zs)) {
            c1199Zs.A0A().AHQ(mediaView, abstractC1341cD.A1U(), false, false, true);
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean zA1a = abstractC1341cD.A1a();
            java.lang.String strA0B = A0B(68, 18, 20);
            java.lang.String strA0B2 = A0B(36, 16, 107);
            java.lang.String strA0B3 = A0B(52, 16, 97);
            java.lang.String strA0B4 = A0B(26, 10, 1);
            if (zA1a) {
                jSONObject.put(strA0B4, true);
                jSONObject.put(strA0B3, 2);
                jSONObject.put(strA0B2, 0);
                jSONObject.put(strA0B, this.A06.A0V());
            } else if (com.facebook.ads.redexgen.core.L6.A05(abstractC1341cD.A0b())) {
                jSONObject.put(strA0B4, true);
                jSONObject.put(strA0B3, 2);
                jSONObject.put(strA0B2, 1);
                jSONObject.put(strA0B, this.A06.A0V());
            }
            this.A0F.A0j(jSONObject);
        } catch (org.json.JSONException unused) {
            this.A0F.A0M().A04(com.facebook.ads.redexgen.core.C8E.A15, A0B(0, 26, 113));
        }
    }

    private void A0C() {
        com.facebook.ads.redexgen.core.Q7 q7A0F = new com.facebook.ads.redexgen.core.Q5(this.A07, this.A06.A1P().A0F(), this.A06.A1S()).A0A(this.A06.A1O().A01()).A0F();
        addView(q7A0F, new android.widget.FrameLayout.LayoutParams(-1, -1));
        q7A0F.A04(new com.facebook.ads.redexgen.core.UH(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0E().A5d();
            this.A0F.A0X();
        } else {
            this.A07.A0E().A5e();
            if (this.A0F.A0k()) {
                AGz();
                if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A07)) {
                    this.A07.A0A().ABh();
                }
            }
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.A0F.A0O().getParent();
        if (viewGroup != null) {
            com.facebook.ads.redexgen.core.C0926Pb c0926Pb = this.A0F;
            java.lang.String[] strArr = A0J;
            if (strArr[0].charAt(1) != strArr[2].charAt(1)) {
                throw new java.lang.RuntimeException();
            }
            A0J[6] = "m5i7x933C7hHEFpC39NkE";
            android.view.ViewGroup parent = c0926Pb.A0O();
            viewGroup.removeView(parent);
        }
        addView(this.A0F.A0O(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3q(this, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        if (android.os.Build.VERSION.SDK_INT >= 19 && this.A06.A12()) {
            this.A0A.A05(com.facebook.ads.redexgen.core.EnumC0836Lp.A03);
        }
    }

    private void A0F(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.facebook.ads.redexgen.core.OH oh = new com.facebook.ads.redexgen.core.OH(this.A07, this.A0D.A6p(), this.A0H, this.A0B, this.A08, this.A06.A1Q(), this.A0C);
        java.util.HashMap map = new java.util.HashMap();
        map.put(A0B(86, 12, 108), A0B(98, 9, 19));
        oh.A08(this.A06.A1U(), str, map);
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void A8q() {
        A0F(this.A06.A1P().A0G().A05());
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void A8r(java.lang.String str) {
        A0F(str);
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void A8v() {
        this.A0C.A4P(this.A0D.A6F());
        com.facebook.ads.redexgen.core.C0953Qc serverSideRewardHandler = new com.facebook.ads.redexgen.core.C0953Qc(this.A07, this.A0D, this.A06.A0m(), this.A0C);
        serverSideRewardHandler.A05();
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void A9j() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facebook.ads.redexgen.core.UI(this));
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void A9q(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C5Q c5q) {
        com.facebook.ads.redexgen.core.C0926Pb.A0B().incrementAndGet();
        c5q.A0A(this.A01);
        this.A00 = c5q;
        A0E();
        if (this.A06.A1P().A0R()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void AC2() {
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void AC6() {
        if (this.A0E != null) {
            this.A0E.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void ACm(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0R(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ACz(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0S(z);
        }
        if (z) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ADN(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0T(z);
        }
        if (this.A03) {
            this.A03 = false;
        } else if (z) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void ADb() {
        if (this.A0E != null) {
            this.A0E.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void AE5(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0U(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void AE7(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0V(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void AEK(java.lang.String str) {
        java.lang.String urlString = this.A06.A1V(str);
        if (urlString == null) {
            return;
        }
        com.facebook.ads.redexgen.core.L2.A0M(new com.facebook.ads.redexgen.core.L2(), this.A07, com.facebook.ads.redexgen.core.L5.A00(urlString), this.A06.A1U());
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void AFx(android.os.Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void AGz() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void close() {
        if (this.A00 == null) {
            return;
        }
        this.A00.finish(4);
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public java.lang.String getCurrentClientToken() {
        return this.A06.A1U();
    }

    private android.view.ViewGroup getMediaView() {
        if (this.A0E != null) {
            return this.A0E;
        }
        return this.A0F.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void onDestroy() {
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A07)) {
            this.A07.A0A().AHC(getMediaView());
        }
        com.facebook.ads.redexgen.core.PT pt = this.A0E;
        java.lang.String[] strArr = A0J;
        if (strArr[4].charAt(27) != strArr[5].charAt(27)) {
            throw new java.lang.RuntimeException();
        }
        A0J[6] = "GZe1biqFkGajjfTMFdC84";
        if (pt != null) {
            this.A0E.A0O();
        }
        this.A0A.A03();
        this.A08.A9x(this.A06.A1U(), new com.facebook.ads.redexgen.core.O8().A02(this.A0B).A03(this.A0H).A05());
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        com.facebook.ads.redexgen.core.AbstractC0927Pc.A04(this.A06.A0l());
        com.facebook.ads.redexgen.core.C0926Pb.A0B().decrementAndGet();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(com.facebook.ads.redexgen.core.MR mr) {
    }

    public void setRtfActionsJavascriptListener(com.facebook.ads.redexgen.core.InterfaceC0936Pl interfaceC0936Pl) {
        this.A02 = interfaceC0936Pl;
    }
}
