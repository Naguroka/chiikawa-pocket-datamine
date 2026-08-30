package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0745Hu {
    public static byte[] A02;
    public int A00;
    public long[] A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 103);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-56, -68, 15, 5, 22, 1, -68, 5, 15, -68, 41, 78, 86, 65, 76, 73, 68, 0, 73, 78, 68, 69, 88, 0};
    }

    public C0745Hu() {
        this(32);
    }

    public C0745Hu(int i) {
        this.A01 = new long[i];
    }

    public final int A02() {
        return this.A00;
    }

    public final long A03(int i) {
        if (i >= 0 && i < this.A00) {
            return this.A01[i];
        }
        throw new java.lang.IndexOutOfBoundsException(A00(10, 14, 121) + i + A00(0, 10, 53) + this.A00);
    }

    public final void A04(long j) {
        if (this.A00 == this.A01.length) {
            this.A01 = java.util.Arrays.copyOf(this.A01, this.A00 * 2);
        }
        long[] jArr = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        jArr[i] = j;
    }

    public final long[] A05() {
        return java.util.Arrays.copyOf(this.A01, this.A00);
    }
}
