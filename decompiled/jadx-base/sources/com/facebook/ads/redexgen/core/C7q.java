package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7q {
    public static byte[] A03;
    public final int A00;
    public final java.lang.String A01;
    public final java.lang.String A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 64);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{94};
    }

    public C7q(int i, java.lang.String str, java.lang.String str2) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public final java.lang.String A02() {
        return this.A01 + A00(0, 1, 62) + this.A02;
    }
}
