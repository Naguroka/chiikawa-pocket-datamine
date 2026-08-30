package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.06, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass06 {
    public static byte[] A0B;
    public int A00;
    public int A01;
    public java.lang.Integer A02;
    public java.lang.String A03;
    public java.lang.String A04;
    public boolean A05;
    public final java.lang.String A06;
    public final java.lang.String A07;
    public final java.lang.String A08;
    public final java.lang.String A09;
    public final boolean A0A;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{58, 51, 48, 51, 52, 60, 51};
    }

    public AnonymousClass06(com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = anonymousClass06.A09;
        this.A08 = anonymousClass06.A08;
        this.A06 = anonymousClass06.A06;
        this.A07 = anonymousClass06.A07;
        this.A02 = anonymousClass06.A02;
        this.A03 = anonymousClass06.A03;
        this.A0A = anonymousClass06.A0A;
    }

    public AnonymousClass06(java.lang.String str) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = str;
        java.lang.String strA00 = A00(0, 7, 100);
        this.A08 = strA00;
        this.A06 = strA00;
        this.A07 = strA00;
        this.A02 = null;
        this.A03 = strA00;
        this.A0A = false;
    }

    public AnonymousClass06(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A02 = null;
        this.A03 = str5;
        this.A0A = z;
    }
}
