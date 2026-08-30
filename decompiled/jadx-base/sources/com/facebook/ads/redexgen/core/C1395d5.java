package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1395d5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 86);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{49, 53, 46, 54, 51, 52, 116, 48, 44, 55, 116, 60, 47, 52, 57, 46, 51, 53, 52, 41, 116};
    }

    public final java.lang.String A02(com.facebook.ads.redexgen.core.HY hy) {
        java.lang.String string = hy.getClass().getGenericInterfaces()[0].toString();
        java.lang.String strA00 = A00(0, 21, 12);
        return string.startsWith(strA00) ? string.substring(strA00.length()) : string;
    }

    public final java.lang.String A03(com.facebook.ads.redexgen.core.AbstractC04866r abstractC04866r) {
        return A02(abstractC04866r);
    }
}
