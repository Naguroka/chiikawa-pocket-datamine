package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C04726b {
    public static byte[] A09;
    public long A00;
    public java.lang.Integer A01;
    public java.lang.String A02;
    public java.lang.String A03;
    public boolean A04;
    public boolean A05;
    public final java.lang.String A06;
    public final java.lang.String A07;
    public final java.lang.String A08;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 14);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{-107, -104, -118, -115};
    }

    public C04726b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.A03 = A00(0, 0, 68);
        this.A02 = A00(0, 4, 27);
        this.A00 = -1L;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A01 = null;
    }

    public C04726b(java.lang.String str, java.lang.String str2, java.lang.String str3, long j) {
        this.A03 = A00(0, 0, 68);
        this.A02 = A00(0, 4, 27);
        this.A00 = -1L;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A01 = null;
        this.A00 = j;
    }
}
