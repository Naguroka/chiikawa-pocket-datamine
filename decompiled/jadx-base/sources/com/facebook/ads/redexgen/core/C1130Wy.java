package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1130Wy extends com.facebook.ads.redexgen.core.H9 {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"oXD3w3tUVJHNPl", "GdV70Wcz8", "", "DzmyP9XSV", "ggRTYYsXaYFY6DcFpfUTDxKOGTV0t8hM", "gCu8mLRj1GKWx9K1TPcxrUR4JUG", "r1pVudNzCyG", "yxqMOZmEiVbhC7e6Vd9eEudE3"};
    public final java.lang.String A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] ^ i3) ^ 46;
            if (A02[6].length() == 27) {
                throw new java.lang.RuntimeException();
            }
            A02[6] = "lZqD6G";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{53, 18, 10, 29, 16, 21, 24, 92, 31, 19, 18, 8, 25, 18, 8, 92, 8, 5, 12, 25, 70, 92};
    }

    static {
        A01();
    }

    public C1130Wy(java.lang.String str, com.facebook.ads.redexgen.core.H3 h3) {
        super(A00(0, 22, 82) + str, h3, 1);
        this.A00 = str;
    }
}
