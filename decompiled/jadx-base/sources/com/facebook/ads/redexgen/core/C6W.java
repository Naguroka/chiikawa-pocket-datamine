package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6W, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6W {
    public static byte[] A03;
    public static final java.util.concurrent.atomic.AtomicBoolean A04;
    public com.facebook.ads.redexgen.core.C1198Zr A00;
    public java.lang.String A01;
    public final com.facebook.ads.redexgen.core.C0824Ld A02 = new com.facebook.ads.redexgen.core.C0824Ld(300000000000L, new com.facebook.ads.redexgen.core.C1206Zz(this));

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 80);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-56, -43, -56, -45, -42, -50, -86, -95, -80, -77, -85, -82, -89, -69, -80, -75, -84, -95, -64, -78, -64, -64, -74, -68, -69, -52, -63, -74, -70, -78};
    }

    static {
        A04();
        A04 = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static com.facebook.ads.redexgen.core.InterfaceC05248n A00(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        return com.facebook.ads.redexgen.core.C0762Im.A15(c1198Zr) ? com.facebook.ads.redexgen.core.C05258o.A01(A01(0, 6, 55), A01(18, 12, 29), A01(6, 12, 12)) : com.facebook.ads.redexgen.core.C05258o.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        com.facebook.ads.redexgen.core.C1198Zr c1198Zr;
        synchronized (this) {
            c1198Zr = this.A00;
        }
        if (c1198Zr == null) {
            return;
        }
        java.lang.String strA04 = com.facebook.ads.redexgen.core.C05278q.A00().A01(c1198Zr, true).A04(A00(c1198Zr));
        synchronized (this) {
            this.A01 = strA04;
        }
    }

    public static void A03() {
        A04.set(true);
    }

    public final synchronized java.lang.String A06(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        this.A00 = c1198Zr;
        this.A00.A07().AAl();
        this.A00.A03().ABQ(c1198Zr);
        if (this.A00.A06().AGj() || ((A04.get() && com.facebook.ads.redexgen.core.C0762Im.A1r(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A04.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
