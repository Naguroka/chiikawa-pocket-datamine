package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1348cK extends com.facebook.ads.redexgen.core.AbstractC03340r {
    public static byte[] A02;
    public final com.facebook.ads.redexgen.core.C1346cI A00;
    public final com.facebook.ads.redexgen.core.J7 A01;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 26);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 69, 74, 74, 65, 86};
    }

    public C1348cK(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC03350s abstractC03350s, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C1346cI c1346cI) {
        super(c1199Zs, abstractC03350s, c0987Rk);
        this.A01 = j7;
        this.A00 = c1346cI;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03340r
    public final void A06(java.util.Map<java.lang.String, java.lang.String> map) {
        if (this.A00 != null && !android.text.TextUtils.isEmpty(this.A00.A6r())) {
            this.A02.A0E().A36();
            com.facebook.ads.redexgen.core.C2M.A02(this.A00.A0X(), com.facebook.ads.redexgen.core.AbstractC0825Le.A00(A01(0, 6, 62)));
            this.A01.AA6(this.A00.A6r(), map);
            if (com.facebook.ads.redexgen.core.C0762Im.A14(this.A02)) {
                java.lang.String string = com.facebook.ads.internal.protocol.AdPlacementType.MEDIUM_RECTANGLE.toString();
                com.facebook.ads.redexgen.core.C0805Kh c0805KhA00 = com.facebook.ads.redexgen.core.C0805Kh.A00(this.A02);
                java.lang.String placementType = this.A00.A6r();
                c0805KhA00.A0E(string, placementType);
            }
        }
    }
}
