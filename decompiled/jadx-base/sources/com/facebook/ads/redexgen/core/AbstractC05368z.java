package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC05368z {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"DnTt6XIWuAOQU1Yv6ovRwSY", "69qI84ufJ2UhBtkQx2IBHzZ", "lNRa3H", "2y2Uq0vrRuc5d5uHsu4hqSSezWuXbHLJ", "zUBzfUPcj8uIEo8tGSc", "tyrfQSxRYtG07uuggB4oX54vdLL3Tqsi", "aO8Ix6JCuD3GiDZZv02FTTQkozyjIQFp", "pMzofq8cn4xP4Da44trMpLQAQtlXLUTp"};

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 25);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        java.lang.String[] strArr = A01;
        if (strArr[1].length() != strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        A01[4] = "";
        A00 = new byte[]{3, 20, 18, 30, 3, 21, 46, 21, 16, 5, 16, 19, 16, 2, 20};
    }

    static {
        A03();
    }

    public static com.facebook.ads.redexgen.core.AnonymousClass91 A00(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        try {
            return new com.facebook.ads.redexgen.core.ZI(c1198Zr);
        } catch (java.io.IOException e) {
            c1198Zr.A07().AA0(A02(0, 15, 104), com.facebook.ads.redexgen.core.C8E.A2K, new com.facebook.ads.redexgen.core.C8F(e));
            return new com.facebook.ads.redexgen.core.ZL();
        }
    }

    public static com.facebook.ads.redexgen.core.C0667Ef A01(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        return new com.facebook.ads.redexgen.core.C0667Ef(c1198Zr);
    }
}
