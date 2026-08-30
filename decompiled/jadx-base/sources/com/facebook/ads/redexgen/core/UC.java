package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UC extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.PT A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 114);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{87, 104, 101, 100, 110, 33, 118, 96, 114, 33, 111, 100, 119, 100, 115, 33, 113, 115, 100, 113, 96, 115, 100, 101};
    }

    public UC(com.facebook.ads.redexgen.core.PT pt) {
        this.A00 = pt;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        if (!this.A00.A03) {
            this.A00.A0I(A00(0, 24, 115));
        }
    }
}
