package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UB extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.PT A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C9O A01;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 40);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-103, -52, -67, -67, -68, -55, -64, -59, -66, 119, -64, -59, -69, -68, -67, -64, -59, -64, -53, -68, -61, -48};
    }

    public UB(com.facebook.ads.redexgen.core.PT pt, com.facebook.ads.redexgen.core.C9O c9o) {
        this.A00 = pt;
        this.A01 = c9o;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        if (this.A00.A0D.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A02 && this.A00.A0D.getCurrentPositionInMillis() == A00()) {
            this.A00.A0I(A00(0, 22, 47));
        }
    }
}
