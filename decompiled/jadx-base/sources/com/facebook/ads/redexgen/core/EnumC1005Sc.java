package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC1005Sc {
    A03(A01(35, 4, 16)),
    A04(A01(39, 4, 41));

    public static byte[] A01;
    public java.lang.String A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 24);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{125, 110, 119, 119, 99, 68, 92, 75, 70, 67, 78, 10, 89, 79, 88, 92, 79, 88, 10, 88, 79, 89, 90, 69, 68, 89, 79, 16, 10, 15, 89, 40, 38, 38, 51, 110, 125, 100, 100, 90, 84, 84, 65};
    }

    static {
        A02();
    }

    EnumC1005Sc(java.lang.String str) {
        this.A00 = str;
    }

    public static com.facebook.ads.redexgen.core.EnumC1005Sc A00(java.lang.String str) {
        for (com.facebook.ads.redexgen.core.EnumC1005Sc enumC1005Sc : values()) {
            if (enumC1005Sc.A00.equals(str)) {
                return enumC1005Sc;
            }
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, A01(4, 27, 50), str));
    }
}
