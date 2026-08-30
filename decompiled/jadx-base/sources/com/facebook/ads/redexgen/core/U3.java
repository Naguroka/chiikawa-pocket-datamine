package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class U3 extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0563Ab A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 23);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-56, -37, -42, -41, -31, -110, -23, -45, -27, -110, -32, -41, -24, -41, -28, -110, -30, -28, -41, -30, -45, -28, -41, -42};
    }

    public U3(com.facebook.ads.redexgen.core.C0563Ab c0563Ab) {
        this.A00 = c0563Ab;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        if (!this.A00.A07) {
            this.A00.A0F.AE0(A00(0, 24, 91));
        }
    }
}
