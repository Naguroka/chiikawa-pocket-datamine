package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.82, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass82 {
    public static byte[] A03;
    public final java.lang.String A00;
    public final java.lang.String A01;
    public final java.util.Map<java.lang.String, java.lang.String> A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 113);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{8, 101, 2, 0, 20, 6, 9, 21, 62, 4, 25, 2, 4, 17, 21, 8, 14, 15, 29, 26, 15, 13, 5, 26, 28, 15, 13, 11};
    }

    public AnonymousClass82(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> mStaticEnvironmentData) {
        this(str, mStaticEnvironmentData, false);
    }

    public AnonymousClass82(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z) {
        this.A01 = str;
        this.A02 = map;
        this.A00 = z ? A00(1, 1, 37) : A00(0, 1, 73);
    }

    public final java.util.Map<java.lang.String, java.lang.String> A02() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(A00(18, 10, 31), this.A01);
        map.put(A00(2, 16, 16), this.A00);
        java.util.Map<java.lang.String, java.lang.String> data = this.A02;
        map.putAll(data);
        return map;
    }
}
