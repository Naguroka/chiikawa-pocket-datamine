package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1052Tx extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.A6 A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 122);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -1, -6, -5, 5, -74, 13, -9, 9, -74, 4, -5, 12, -5, 8, -74, 6, 8, -5, 6, -9, 8, -5, -6};
    }

    public C1052Tx(com.facebook.ads.redexgen.core.A6 a6) {
        this.A00 = a6;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        if (!this.A00.A0S) {
            this.A00.A0X.AE0(A00(0, 24, 28));
        }
    }
}
