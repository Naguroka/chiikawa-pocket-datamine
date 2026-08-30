package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0725Ha {
    public static byte[] A00;

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 64);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{36, 55, 46, 30, 43, 36, 45, -41, -22, -31, -47, -28, -41, -42, -37, -28};
    }

    public static long A00(com.facebook.ads.redexgen.core.HZ hz) {
        return hz.A6B(A02(0, 7, 127), -1L);
    }

    public static android.net.Uri A01(com.facebook.ads.redexgen.core.HZ hz) {
        java.lang.String strA6D = hz.A6D(A02(7, 9, 50), null);
        if (strA6D == null) {
            return null;
        }
        return android.net.Uri.parse(strA6D);
    }

    public static void A04(com.facebook.ads.redexgen.core.C0726Hb c0726Hb) {
        c0726Hb.A01(A02(7, 9, 50));
    }

    public static void A05(com.facebook.ads.redexgen.core.C0726Hb c0726Hb, long j) {
        c0726Hb.A02(A02(0, 7, 127), j);
    }

    public static void A06(com.facebook.ads.redexgen.core.C0726Hb c0726Hb, android.net.Uri uri) {
        c0726Hb.A03(A02(7, 9, 50), uri.toString());
    }
}
