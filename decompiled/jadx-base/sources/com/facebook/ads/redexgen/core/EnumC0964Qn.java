package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC0964Qn {
    A06(101),
    A09(102),
    A0A(103),
    A07(104),
    A08(105),
    A05(106),
    A04(107),
    A03(108);

    public static byte[] A01;
    public final int A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 118);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-67, -52, -59, -40, -63, -46, -69, -53, -62, -67, -40, -56, -57, -40, -67, -66, -52, -51, -53, -56, -46, -20, -5, -12, 7, -16, 1, -22, -6, -15, -20, 7, -5, -13, -15, -8, -66, -51, -60, -60, -53, -69, -54, -67, -67, -58, -41, -50, -63, -68, -67, -57, -41, -50, -63, -67, -49, -41, -57, -58, -41, -68, -67, -53, -52, -54, -57, -47, 2, 7, 13, -2, 11, 12, 13, 2, 13, 2, -6, 5, 24, 15, 2, -3, -2, 8, 24, 15, 2, -2, 16, 24, -3, -2, 12, 13, 11, 8, 18, 16, 7, 25, 33, 24, 11, 6, 7, 17, 33, 11, 16, 22, 7, 20, 21, 22, 11, 22, 11, 3, 14, 33, 16, 9, 22, 33, 4, 23, 22, 22, 17, 16, 7, -2, 16, 24, 15, 2, -3, -2, 8, 24, 2, 7, 13, -2, 11, 12, 13, 2, 13, 2, -6, 5, 24, 13, 8, 8, 5, -5, -6, 11, 24, -4, 5, 8, 12, -2, 24, -4, 5, 2, -4, 4, -2, -3, -35, -48, -30, -52, -35, -49, -48, -49, -22, -31, -44, -49, -48, -38, -22, -33, -38, -38, -41, -51, -52, -35, -22, -50, -41, -38, -34, -48, -22, -50, -41, -44, -50, -42, -48, -49, -39, -47, -49, -42, -27, -42, -46, -37, -51, -49, -44};
    }

    static {
        A01();
    }

    EnumC0964Qn(int i) {
        this.A00 = i;
    }

    public final int A03() {
        return this.A00;
    }
}
