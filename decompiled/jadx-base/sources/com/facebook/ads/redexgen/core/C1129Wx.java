package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1129Wx extends com.facebook.ads.redexgen.core.H9 {
    public static byte[] A02;
    public final int A00;
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 10);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{21, 34, 52, 55, 40, 41, 52, 34, 103, 36, 40, 35, 34, 125, 103};
    }

    public C1129Wx(int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, com.facebook.ads.redexgen.core.H3 h3) {
        super(A00(0, 15, 77) + i, h3, 1);
        this.A00 = i;
        this.A01 = map;
    }
}
