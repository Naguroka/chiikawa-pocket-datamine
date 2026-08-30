package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C04746d {
    public static byte[] A08;
    public com.facebook.ads.redexgen.core.C6l A00;
    public java.lang.String A01 = A00(0, 4, 75);
    public boolean A02 = false;
    public final int A03;
    public final int A04;
    public final java.lang.String A05;
    public final java.lang.String A06;
    public final java.lang.String A07;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 80);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{7, 10, -4, -1};
    }

    public C04746d(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3) {
        this.A07 = str;
        this.A03 = i;
        this.A04 = i2;
        this.A06 = str2;
        this.A05 = str3;
    }
}
