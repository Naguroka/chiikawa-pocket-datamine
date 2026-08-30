package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1303bb implements com.facebook.ads.redexgen.core.AnonymousClass22 {
    public static byte[] A09;
    public static final java.lang.String A0A;
    public long A00 = -1;
    public com.facebook.ads.InterstitialAd A01;
    public com.facebook.ads.redexgen.core.C1E A02;
    public com.facebook.ads.redexgen.core.C0685Fi A03;
    public boolean A04;
    public boolean A05;
    public final com.facebook.ads.redexgen.core.C1199Zs A06;
    public final com.facebook.ads.InterstitialAdExtendedListener A07;
    public final com.facebook.ads.redexgen.core.C1299bX A08;

    public static java.lang.String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 58);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0A() {
        A09 = new byte[]{-88, -43, -121, -56, -53, -121, -45, -42, -56, -53, -121, -48, -38, -121, -56, -45, -39, -52, -56, -53, -32, -121, -48, -43, -121, -41, -39, -42, -50, -39, -52, -38, -38, -107, -121, -64, -42, -36, -121, -38, -49, -42, -36, -45, -53, -121, -34, -56, -48, -37, -121, -51, -42, -39, -121, -56, -53, -77, -42, -56, -53, -52, -53, -113, -112, -121, -37, -42, -121, -55, -52, -121, -54, -56, -45, -45, -52, -53, -103, -66, -60, -75, -62, -61, -60, -71, -60, -71, -79, -68, 112, -68, -65, -79, -76, 112, -77, -79, -68, -68, -75, -76, 112, -57, -72, -71, -68, -75, 112, -61, -72, -65, -57, -71, -66, -73, 112, -71, -66, -60, -75, -62, -61, -60, -71, -60, -71, -79, -68, 126, -33, -18, -25};
    }

    static {
        A0A();
        A0A = com.facebook.ads.redexgen.core.C1303bb.class.getSimpleName();
    }

    public C1303bb(com.facebook.ads.redexgen.core.C1299bX c1299bX, com.facebook.ads.redexgen.core.C2I c2i, java.lang.String str) {
        this.A08 = c1299bX;
        this.A06 = c1299bX.A05();
        this.A07 = new com.facebook.ads.redexgen.core.C1288bM(str, c2i, this);
    }

    public final long A0D() {
        if (this.A03 != null) {
            return this.A03.A0F();
        }
        return -1L;
    }

    public final com.facebook.ads.redexgen.core.C1299bX A0E() {
        return this.A08;
    }

    public final com.facebook.ads.redexgen.core.C1199Zs A0F() {
        return this.A06;
    }

    public final void A0G(java.util.EnumSet<com.facebook.ads.CacheFlag> cacheFlags, java.lang.String str) {
        java.lang.String strA02;
        this.A00 = java.lang.System.currentTimeMillis();
        if (!this.A05 && this.A03 != null) {
            android.util.Log.w(A0A, A09(0, 78, 45));
        }
        this.A05 = false;
        if (this.A04 && !com.facebook.ads.redexgen.core.C0762Im.A0g(this.A06)) {
            this.A06.A07().AA0(A09(130, 3, 68), com.facebook.ads.redexgen.core.C8E.A0L, new com.facebook.ads.redexgen.core.C8F(A09(78, 52, 22)));
            com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD;
            this.A06.A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            this.A07.onError(this.A08.A6E(), new com.facebook.ads.AdError(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage()));
            return;
        }
        if (this.A03 != null) {
            this.A03.A0R(new com.facebook.ads.redexgen.core.C1308bg(this));
            this.A03.A0M();
            this.A03.A0J();
            this.A03 = null;
        }
        com.facebook.ads.redexgen.core.C03621t c03621t = new com.facebook.ads.redexgen.core.C03621t(this.A08.A0A(), com.facebook.ads.redexgen.core.AbstractC0785Jn.A00(this.A06.getResources().getDisplayMetrics()), com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL, com.facebook.ads.redexgen.core.EnumC0781Jj.A08, 1, cacheFlags, this.A08.A06());
        if (com.facebook.ads.redexgen.core.C0762Im.A2T(this.A06) && (strA02 = com.facebook.ads.redexgen.core.L6.A02(this.A06, this.A08.A08())) != null) {
            this.A08.A0I(strA02);
        }
        c03621t.A06(this.A08.A08());
        c03621t.A07(this.A08.A09());
        c03621t.A04(this.A08.A03());
        this.A03 = new com.facebook.ads.redexgen.core.C0685Fi(this.A06, c03621t);
        this.A03.A0R(new com.facebook.ads.redexgen.core.C1305bd(this));
        this.A03.A0V(str);
    }

    public final boolean A0H() {
        return this.A03 == null || this.A03.A0Y();
    }

    public final boolean A0I() {
        return this.A05;
    }

    public final boolean A0J() {
        com.facebook.ads.AdError adError = com.facebook.ads.AdError.SHOW_CALLED_BEFORE_LOAD_ERROR;
        if (!this.A05) {
            this.A06.A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A07.onError(this.A08.A6E(), adError);
            return false;
        }
        if (this.A03 == null) {
            this.A06.A07().AA0(A09(130, 3, 68), com.facebook.ads.redexgen.core.C8E.A0S, new com.facebook.ads.redexgen.core.C8F(com.facebook.ads.internal.protocol.AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL.getDefaultErrorMessage()));
            this.A06.A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A07.onError(this.A08.A6E(), adError);
            return false;
        }
        this.A03.A0L();
        this.A04 = true;
        this.A05 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass22
    public final void destroy() {
        if (this.A03 != null) {
            this.A03.A0R(new com.facebook.ads.redexgen.core.C1304bc(this));
            this.A03.A0X(true);
            this.A03.A0J();
            this.A03 = null;
            this.A05 = false;
            this.A04 = false;
        }
    }
}
