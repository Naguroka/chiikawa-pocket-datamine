package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum SP {
    A03(A01(37, 3, 126)),
    A04(A01(40, 7, 55));

    public static byte[] A01;
    public java.lang.String A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 117);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{48, 50, 58, 108, 75, 83, 68, 73, 76, 65, 5, 86, 64, 87, 83, 64, 87, 5, 87, 64, 86, 85, 74, 75, 86, 64, 31, 5, 0, 86, 51, 40, 45, 40, 41, 49, 40, 106, 104, 96, 55, 44, 41, 44, 45, 53, 44};
    }

    static {
        A02();
    }

    SP(java.lang.String str) {
        this.A00 = str;
    }

    public static com.facebook.ads.redexgen.core.SP A00(java.lang.String str) {
        for (com.facebook.ads.redexgen.core.SP sp : values()) {
            if (sp.A00.equals(str)) {
                return sp;
            }
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, A01(3, 27, 80), str));
    }
}
