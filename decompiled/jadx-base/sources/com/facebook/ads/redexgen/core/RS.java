package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RS {
    public static byte[] A02;
    public final com.facebook.ads.redexgen.core.C0663Eb A00;
    public final com.facebook.ads.redexgen.core.X6 A01 = new com.facebook.ads.redexgen.core.X6();

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 50);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, 16, -73, 9, 14, 5, -6, -73, -75, -49, -75, -73};
    }

    public RS(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        com.facebook.ads.redexgen.core.InterfaceC0709Gk trackSelectionFactory = new com.facebook.ads.redexgen.core.XD(this.A01);
        this.A00 = com.facebook.ads.redexgen.core.AbstractC05469j.A00(new com.facebook.ads.redexgen.core.ZC(c1199Zs), new com.facebook.ads.redexgen.core.D1(trackSelectionFactory), new com.facebook.ads.redexgen.core.ZE());
    }

    public static java.lang.String A01(com.facebook.ads.redexgen.core.C05449h c05449h) {
        return A00(41, 11, 99) + c05449h.A01 + A00(14, 22, 98) + c05449h.A00 + A00(0, 14, 108) + c05449h.getCause() + A00(36, 2, 118);
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0J();
    }

    public final int A05() {
        return this.A00.A6Z();
    }

    public final long A06() {
        return this.A00.A71();
    }

    public final long A07() {
        return this.A00.A7E();
    }

    public final com.facebook.ads.redexgen.core.RQ A08() {
        com.facebook.ads.internal.exoplayer2.thirdparty.Format vf = this.A00.A0L();
        if (vf == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.RQ(vf.A0F, vf.A08);
    }

    public final void A09() {
        this.A00.AEy();
    }

    public final void A0A() {
        this.A00.AGA();
    }

    public final void A0B() {
        this.A00.A0M();
    }

    public final void A0C(float f) {
        this.A00.A0N(f);
    }

    public final void A0D(long j) {
        this.A00.AG9(j);
    }

    public final void A0E(android.view.Surface surface) {
        this.A00.A0O(surface);
    }

    public final void A0F(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, android.net.Uri uri) {
        if (com.facebook.ads.redexgen.core.C0762Im.A2m(c1198Zr, A03())) {
            com.facebook.ads.redexgen.core.RW cacheManager = com.facebook.ads.redexgen.core.RW.A05(c1198Zr);
            com.facebook.ads.redexgen.core.XW xw = new com.facebook.ads.redexgen.core.XW(cacheManager.A0F(c1198Zr));
            java.lang.String strA08 = com.facebook.ads.redexgen.core.RW.A08(c1198Zr, uri);
            if (strA08 != null) {
                xw.A00(strA08);
            }
            this.A00.A0P(xw.A01(uri));
            return;
        }
        com.facebook.ads.redexgen.core.Ev mediaSource = new com.facebook.ads.redexgen.core.XW(new com.facebook.ads.redexgen.core.X4(c1198Zr, com.facebook.ads.redexgen.core.IK.A0K(c1198Zr, A00(38, 3, 100)), this.A01)).A01(uri);
        this.A00.A0P(mediaSource);
    }

    public final void A0G(com.facebook.ads.redexgen.core.RP rp) {
        this.A00.A3m(new com.facebook.ads.redexgen.core.C0843Lw(this, rp));
    }

    public final void A0H(com.facebook.ads.redexgen.core.RR rr) {
        this.A00.A0Q(new com.facebook.ads.redexgen.core.M1(this, rr));
    }

    public final void A0I(boolean z) {
        this.A00.AGZ(z);
    }

    public final boolean A0J() {
        return this.A00.A84();
    }

    public final boolean A0K() {
        return this.A00.A0K() != null;
    }
}
