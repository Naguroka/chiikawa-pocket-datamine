package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4L, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C4L {
    public static byte[] A06;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public com.facebook.ads.redexgen.core.AnonymousClass56 A04;
    public com.facebook.ads.redexgen.core.AnonymousClass56 A05;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 67);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{118, 122, 60, 40, 53, 55, 2, 103, 14, 2, 68, 80, 77, 79, 123, 31, 76, 64, 14, 5, 23, 40, 15, 12, 4, 5, 18, 93, 86, 90, 14, 21, 34, 71, 71, 75, 31, 4, 50, 86, 109, 70, 79, 64, 73, 75, 103, 64, 72, 65, 85, 65, 66, 74, 102, 65, 66, 74, 75, 92, 19};
    }

    public C4L(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass57) {
        this.A05 = anonymousClass56;
        this.A04 = anonymousClass57;
    }

    public C4L(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass57, int i, int i2, int i3, int i4) {
        this(anonymousClass56, anonymousClass57);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public final java.lang.String toString() {
        return A00(40, 21, 109) + this.A05 + A00(16, 12, 35) + this.A04 + A00(0, 8, 25) + this.A00 + A00(8, 8, 97) + this.A01 + A00(28, 6, 57) + this.A02 + A00(34, 6, 40) + this.A03 + '}';
    }
}
