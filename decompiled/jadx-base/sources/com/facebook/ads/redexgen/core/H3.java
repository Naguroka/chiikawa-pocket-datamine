package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class H3 {
    public static byte[] A07;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final android.net.Uri A04;
    public final java.lang.String A05;
    public final byte[] A06;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 105);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{111, 99, 110, 75, 94, 75, 121, 90, 79, 73, 113, 71};
    }

    public H3(android.net.Uri uri, long j, long j2, long j3, java.lang.String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public H3(android.net.Uri uri, long j, long j2, java.lang.String str) {
        this(uri, j, j, j2, str, 0);
    }

    public H3(android.net.Uri uri, long j, long j2, java.lang.String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public H3(android.net.Uri uri, byte[] bArr, long j, long j2, long j3, java.lang.String str, int i) {
        boolean z = true;
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(j >= 0);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(z);
        this.A04 = uri;
        this.A06 = bArr;
        this.A01 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A05 = str;
        this.A00 = i;
    }

    public final boolean A02(int i) {
        return (this.A00 & i) == i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A00(2, 9, 67)).append(this.A04);
        java.lang.String strA00 = A00(0, 2, 42);
        return sbAppend.append(strA00).append(java.util.Arrays.toString(this.A06)).append(strA00).append(this.A01).append(strA00).append(this.A03).append(strA00).append(this.A02).append(strA00).append(this.A05).append(strA00).append(this.A00).append(A00(11, 1, 115)).toString();
    }
}
