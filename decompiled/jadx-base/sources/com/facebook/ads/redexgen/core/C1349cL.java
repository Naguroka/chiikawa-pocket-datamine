package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1349cL extends com.facebook.ads.redexgen.core.AbstractC03340r {
    public static byte[] A06;
    public static final java.lang.String A07;
    public com.facebook.ads.redexgen.core.C1351cN A00;
    public com.facebook.ads.redexgen.core.EnumC0781Jj A01;
    public boolean A02;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;
    public final com.facebook.ads.redexgen.core.J7 A04;
    public final com.facebook.ads.redexgen.core.AbstractC0897Ny A05;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 53);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = com.facebook.ads.redexgen.core.C1349cL.class.getSimpleName();
    }

    public C1349cL(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.AbstractC0897Ny abstractC0897Ny, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.AbstractC03350s abstractC03350s, com.facebook.ads.redexgen.core.EnumC0781Jj enumC0781Jj) {
        super(c1199Zs, abstractC03350s, c0987Rk);
        this.A04 = j7;
        this.A05 = abstractC0897Ny;
        this.A03 = c1199Zs;
        this.A01 = enumC0781Jj;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03340r
    public final void A06(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String string;
        if (this.A00 != null && !android.text.TextUtils.isEmpty(this.A00.A6r())) {
            this.A03.A0E().A36();
            com.facebook.ads.redexgen.core.C2M.A02(this.A00.A05(), com.facebook.ads.redexgen.core.AbstractC0825Le.A00(A04(0, 6, 50)));
            this.A04.AA6(this.A00.A6r(), map);
            if (com.facebook.ads.redexgen.core.C0762Im.A14(this.A03)) {
                if (this.A01 == com.facebook.ads.redexgen.core.EnumC0781Jj.A09) {
                    string = com.facebook.ads.internal.protocol.AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    string = com.facebook.ads.internal.protocol.AdPlacementType.BANNER.toString();
                }
                com.facebook.ads.redexgen.core.C0805Kh c0805KhA00 = com.facebook.ads.redexgen.core.C0805Kh.A00(this.A03);
                java.lang.String placementType = this.A00.A6r();
                c0805KhA00.A0E(string, placementType);
            }
        }
    }

    public final synchronized void A07() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!android.text.TextUtils.isEmpty(this.A00.A03())) {
                com.facebook.ads.redexgen.core.ExecutorC0844Lx.A00(new com.facebook.ads.redexgen.core.C1350cM(this));
            }
        }
    }

    public final void A08(com.facebook.ads.redexgen.core.C1351cN c1351cN) {
        this.A00 = c1351cN;
    }
}
