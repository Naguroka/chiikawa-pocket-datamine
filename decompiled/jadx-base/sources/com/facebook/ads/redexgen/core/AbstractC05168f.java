package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC05168f {
    public static byte[] A00;

    static {
        A03();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 105);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{6, 6, 19, 7, -7, 6, 10, -3, -9, -7, 19, -7, 12, 8, 6, -11, 7, -5, -5, 8, -4, -18, -5, -1, -14, -20, -18, 8, -4, -19, -12, 8, -1, -18, -5, -4, -14, -8, -9};
    }

    public static java.lang.String A01(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        return com.facebook.ads.redexgen.core.KJ.A00(c1198Zr).getString(A00(0, 17, 75), null);
    }

    public static java.lang.String A02(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        return com.facebook.ads.redexgen.core.KJ.A00(c1198Zr).getString(A00(17, 22, 64), null);
    }

    public static void A04(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        com.facebook.ads.redexgen.core.KJ.A00(c1198Zr).edit().remove(A00(17, 22, 64)).apply();
    }

    public static void A05(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, java.lang.String str, java.lang.String str2) {
        com.facebook.ads.redexgen.core.KJ.A00(c1198Zr).edit().putString(A00(17, 22, 64), str).putString(A00(0, 17, 75), str2).apply();
    }
}
