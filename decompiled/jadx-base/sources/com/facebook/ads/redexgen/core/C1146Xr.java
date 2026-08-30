package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1146Xr implements com.facebook.ads.redexgen.core.InterfaceC0609Bx {
    public static byte[] A05;
    public static final com.facebook.ads.redexgen.core.C0 A06;
    public int A00;
    public int A01;
    public com.facebook.ads.redexgen.core.InterfaceC0611Bz A02;
    public com.facebook.ads.redexgen.core.C9 A03;
    public com.facebook.ads.redexgen.core.C1145Xq A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 64);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-97, -72, -67, -65, -70, -70, -71, -68, -66, -81, -82, 106, -71, -68, 106, -65, -72, -68, -81, -83, -71, -79, -72, -77, -60, -81, -82, 106, -63, -85, -64, 106, -78, -81, -85, -82, -81, -68, 120, -33, -13, -30, -25, -19, -83, -16, -33, -11};
    }

    static {
        A01();
        A06 = new com.facebook.ads.redexgen.core.C1147Xs();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void A9D(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz) {
        this.A02 = interfaceC0611Bz;
        this.A03 = interfaceC0611Bz.AHA(0, 1);
        this.A04 = null;
        interfaceC0611Bz.A5u();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final int AEk(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C4 c4) throws java.lang.InterruptedException, java.io.IOException {
        if (this.A04 == null) {
            this.A04 = com.facebook.ads.redexgen.core.DK.A00(interfaceC0610By);
            if (this.A04 != null) {
                this.A03.A69(com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(null, A00(39, 9, 62), null, this.A04.A00(), 32768, this.A04.A03(), this.A04.A04(), this.A04.A02(), null, null, 0, null));
                this.A00 = this.A04.A01();
            } else {
                throw new com.facebook.ads.redexgen.core.A0(A00(0, 39, 10));
            }
        }
        if (!this.A04.A07()) {
            com.facebook.ads.redexgen.core.DK.A03(interfaceC0610By, this.A04);
            this.A02.AG8(this.A04);
        }
        int iAFu = this.A03.AFu(interfaceC0610By, 32768 - this.A01, true);
        if (iAFu != -1) {
            this.A01 += iAFu;
        }
        int i = this.A01 / this.A00;
        if (i > 0) {
            long jA05 = this.A04.A05(interfaceC0610By.A86() - ((long) this.A01));
            int i2 = this.A00 * i;
            this.A01 -= i2;
            this.A03.AFw(jA05, 1, i2, this.A01, null);
        }
        return iAFu == -1 ? -1 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void AG7(long j, long j2) {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final boolean AGs(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        return com.facebook.ads.redexgen.core.DK.A00(interfaceC0610By) != null;
    }
}
