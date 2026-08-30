package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.12, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum AnonymousClass12 {
    A03(A00(13, 3, 104)),
    A05(A00(22, 4, 126)),
    A04(A00(16, 6, 26));

    public static byte[] A01;
    public final java.lang.String A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 113);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-52, -41, -41, -56, -68, -55, -48, -68, -57, kotlin.io.encoding.Base64.padSymbol, 62, kotlin.io.encoding.Base64.padSymbol, 52, 58, 69, 69, -8, -20, -7, 0, -20, -9, 93, 94, 93, 84};
    }

    static {
        A01();
    }

    AnonymousClass12(java.lang.String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.A00;
    }
}
