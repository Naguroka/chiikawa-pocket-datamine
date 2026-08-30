package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HH extends java.io.IOException {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 23);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-59, -85, -44, -19, -28, -9, -17, -28, -30, -13, -28, -29, -97};
    }

    public HH(java.lang.Throwable th) {
        super(A00(2, 11, 104) + th.getClass().getSimpleName() + A00(0, 2, 116) + th.getMessage(), th);
    }
}
