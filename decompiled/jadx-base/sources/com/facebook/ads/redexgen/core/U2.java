package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class U2 extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"mPUp", "QaVG6HdjpkfaxAZj0g", "f", "awRGdU6dgRZhiPVlhe", "rFOzx0t9VnUrXKVKNhKeQ4JnbF82l9OW", "Jupus4hVDLzI", "SNB8L6kKTybUpjfk2kEtWCUyw", "zmy1APRNrfa5"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0563Ab A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C9O A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 26);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-43, 8, -7, -7, -8, 5, -4, 1, -6, -77, -4, 1, -9, -8, -7, -4, 1, -4, 7, -8, -1, 12};
    }

    static {
        A02();
    }

    public U2(com.facebook.ads.redexgen.core.C0563Ab c0563Ab, com.facebook.ads.redexgen.core.C9O c9o) {
        this.A00 = c0563Ab;
        this.A01 = c9o;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        if (this.A00.A0I.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A02) {
            com.facebook.ads.redexgen.core.C0563Ab c0563Ab = this.A00;
            java.lang.String[] strArr = A03;
            if (strArr[2].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A03[3] = "r7zn";
            if (c0563Ab.A0I.getCurrentPositionInMillis() == A00()) {
                this.A00.A0F.AE0(A00(0, 22, 121));
            }
        }
    }
}
