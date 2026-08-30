package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UD extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.PT A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 19);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-87, -68, -73, -72, -62, 115, -63, -72, -55, -72, -59, 115, -58, -57, -76, -59, -57, -72, -73, 115, -61, -65, -76, -52, -68, -63, -70};
    }

    public UD(com.facebook.ads.redexgen.core.PT pt) {
        this.A00 = pt;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        if (!this.A00.A04) {
            this.A00.A0I(A00(0, 27, 64));
        }
    }
}
