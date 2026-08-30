package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BN extends android.widget.FrameLayout implements com.facebook.ads.redexgen.core.U9 {
    public static byte[] A0A;
    public static java.lang.String[] A0B = {"cNW8ZlUzhquZSz6XSi", "gKIjGDOIeaOzZR9qeyStr8duZ", "mQKfIuNnQZgt5ES8sx19fjwTYxycx0Lp", "WvoZHe7VElSdYX15O8PPMcOC5YskUK4l", "BfRVnLJiFu3hDnD", "WxgvJAZOXh", "crPtNK55mSnLeOXFeJGYeBq3ABMrpYK", "K6RBlZSEjGoukPcRXJY4znE0whNpCjIj"};
    public com.facebook.ads.redexgen.core.C0987Rk A00;
    public final int A01;
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A02;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;
    public final com.facebook.ads.redexgen.core.J7 A04;
    public final com.facebook.ads.redexgen.core.C0842Lv A05;
    public final com.facebook.ads.redexgen.core.PQ A06;
    public final com.facebook.ads.redexgen.core.C0926Pb A07;
    public final java.lang.String A08;
    public final boolean A09;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 14);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{100, 70, 73, 0, 83, 7, 84, 83, 70, 85, 83, 7, 102, 82, 67, 78, 66, 73, 68, 66, 105, 66, 83, 80, 72, 85, 76, 102, 68, 83, 78, 81, 78, 83, 94, 9, 7, 106, 70, 76, 66, 7, 84, 82, 85, 66, 7, 83, 79, 70, 83, 7, 78, 83, 0, 84, 7, 78, 73, 7, 94, 72, 82, 85, 7, 102, 73, 67, 85, 72, 78, 67, 106, 70, 73, 78, 65, 66, 84, 83, 9, 95, 74, 75, 7, 65, 78, 75, 66, 9, 24, 28, 31, 43, 58, 55, 59, 48, kotlin.io.encoding.Base64.padSymbol, 59, 16, 59, 42, 41, 49, 44, 53, 69, 74, 123, 69, 71, 80, 77, 82, 77, 80, 93, 4, 11, 14, 4, 12, 56, 20, 8, 18, 21, 4, 2, 90, 85, 64, 93, 66, 81, 117, 80, 112, 85, 64, 85, 118, 65, 90, 80, 88, 81, 27, 29, 11, 28, 13, 2, 7, 13, 5, 22, 9, 5, 23, 52, 25, 16, 5};
    }

    static {
        A02();
    }

    public BN(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.PQ pq, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, java.lang.String str, int i, com.facebook.ads.redexgen.core.C0842Lv c0842Lv) {
        super(c1199Zs);
        this.A03 = c1199Zs;
        this.A04 = j7;
        this.A02 = abstractC1341cD;
        this.A08 = str;
        this.A06 = pq;
        this.A01 = i;
        com.facebook.ads.redexgen.core.C0926Pb preloadedDynamicWebViewController = com.facebook.ads.redexgen.core.AbstractC0927Pc.A02(abstractC1341cD.A0l());
        if (preloadedDynamicWebViewController != null) {
            this.A07 = preloadedDynamicWebViewController;
            this.A09 = true;
        } else {
            this.A07 = new com.facebook.ads.redexgen.core.C0926Pb(this.A03, abstractC1341cD, j7, i);
            com.facebook.ads.redexgen.core.AbstractC0927Pc.A03(abstractC1341cD, this.A07);
            this.A09 = false;
        }
        if (c0842Lv != null) {
            this.A05 = c0842Lv;
            this.A07.A0Z(c0842Lv);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new com.facebook.ads.redexgen.core.UG(this));
        this.A07.A0a(pq);
        com.facebook.ads.redexgen.core.LU.A04(this, com.facebook.ads.redexgen.core.LU.A0B);
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(c1199Zs)) {
            c1199Zs.A0A().AHQ(this.A07.A0O(), abstractC1341cD.A1U(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0E().A5d();
            this.A07.A0X();
        } else {
            this.A03.A0E().A5e();
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    if (this.A06 != null) {
                        this.A06.ABp(this);
                    }
                    if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A03)) {
                        com.facebook.ads.redexgen.core.JJ jjA0A = this.A03.A0A();
                        if (A0B[1].length() != 25) {
                            throw new java.lang.RuntimeException();
                        }
                        A0B[5] = "";
                        jjA0A.ABh();
                    }
                } else {
                    AGz();
                }
            }
        }
        A08();
    }

    private final void A04() {
        com.facebook.ads.redexgen.core.C0926Pb.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(android.content.Intent intent, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        intent.putExtra(A01(157, 8, 110), com.facebook.ads.redexgen.core.KG.A07);
        intent.putExtra(A01(130, 18, 58), abstractC1341cD);
        intent.addFlags(268435456);
    }

    private final void A06(com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        com.facebook.ads.internal.util.activity.AdActivityIntent adActivityIntentA04 = com.facebook.ads.redexgen.core.C0813Kq.A04(this.A03);
        A05(adActivityIntentA04, abstractC1341cD);
        try {
            com.facebook.ads.redexgen.core.C0813Kq.A0A(this.A03, adActivityIntentA04);
        } catch (java.lang.Exception e) {
            this.A03.A07().AA0(A01(107, 11, 42), com.facebook.ads.redexgen.core.C8E.A0D, new com.facebook.ads.redexgen.core.C8F(e));
            android.util.Log.e(A01(90, 17, 80), A01(0, 90, 41), e);
        }
    }

    private void A07(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.facebook.ads.redexgen.core.OH oh = new com.facebook.ads.redexgen.core.OH(this.A03, this.A08, this.A00, this.A05, this.A04, this.A02.A1Q());
        java.util.HashMap map = new java.util.HashMap();
        map.put(A01(118, 12, 105), A01(org.objectweb.asm.Opcodes.LCMP, 9, 96));
        oh.A08(this.A02.A1U(), str, map);
    }

    public final void A08() {
        com.facebook.ads.redexgen.core.M3.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void A8q() {
        A07(this.A02.A1P().A0G().A05());
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void A8r(java.lang.String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void A8v() {
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void A9j() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facebook.ads.redexgen.core.UF(this));
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void AC2() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void AC6() {
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void ACm(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void ADb() {
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void AE5(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void AE7(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void AEK(java.lang.String str) {
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void AGz() {
        if (this.A06 != null) {
            this.A06.ABp(this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.U9
    public final void close() {
    }

    public com.facebook.ads.redexgen.core.J7 getAdEventManager() {
        return this.A04;
    }

    public com.facebook.ads.redexgen.core.C0926Pb getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(com.facebook.ads.redexgen.core.C0987Rk c0987Rk) {
        this.A00 = c0987Rk;
        this.A07.A0e(c0987Rk);
    }
}
