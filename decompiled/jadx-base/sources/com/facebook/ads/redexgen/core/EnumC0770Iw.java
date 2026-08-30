package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC0770Iw {
    A06,
    A07,
    A04,
    A05,
    A03,
    A02;

    public static byte[] A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 95);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 5, 13, 16, 9, 8, -3, 0, -8, -8, -10, -11, -11, -8, -16, -16, -14, -9, -16, -27, -24, -32, -32, -30, -25, -32, -8, -27, -34, -20, -20, -8, -20, -19, -21, -30, -36, -19, -37, -36, -31, -20, -39, -36, -44, -44, -46, -47, -73, -84, -75, -85, -80, -75, -82};
    }

    static {
        A01();
    }
}
