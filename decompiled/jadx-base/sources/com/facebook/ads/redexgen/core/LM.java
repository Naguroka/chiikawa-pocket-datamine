package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum LM {
    A04(0),
    A05(1),
    A03(2);

    public static byte[] A01;
    public final int A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 127);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{37, 56, 56, 35, 50, 51, 101, 126, 123, 126, 127, 103, 126, 86, 77, 81, 76, 76, 87, 70, 71};
    }

    static {
        A01();
    }

    LM(int i) {
        this.A00 = i;
    }
}
