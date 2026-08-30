package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum OC {
    A05(0),
    A04(1),
    A03(2);

    public static byte[] A01;
    public int A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 120);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{78, 67, 76, 70, 81, 65, 67, 82, 71, 56, 39, 58, 60, 58, 41, 33, 60, 22, 13, 16, 19, 6, 0, 10, 5, 10, 6, 7};
    }

    static {
        A02();
    }

    OC(int i) {
        this.A00 = i;
    }

    public static com.facebook.ads.redexgen.core.OC A00(int i) {
        for (com.facebook.ads.redexgen.core.OC oc : values()) {
            if (oc.A00 == i) {
                return oc;
            }
        }
        return A04;
    }

    public final int A04() {
        return this.A00;
    }
}
