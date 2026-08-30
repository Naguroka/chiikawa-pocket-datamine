package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1W, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1W implements java.io.Serializable {
    public static byte[] A04 = null;
    public static final long serialVersionUID = 351643298236575729L;
    public final java.lang.String A00;
    public final java.lang.String A01;
    public final java.lang.String A02;
    public final java.lang.String A03;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 63);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-124, -2, -26, -8, -11, -11, -24, -15, -26, -4, 0, -36, -46, -42, -62, -49, -43, -54, -43, -38, -34};
    }

    public C1W(com.facebook.ads.redexgen.core.C1V c1v) {
        this.A02 = c1v.A02;
        this.A03 = c1v.A03;
        this.A00 = c1v.A00;
        this.A01 = c1v.A01;
    }

    public static java.lang.String A01(java.lang.String str, java.lang.String str2, int i) {
        java.lang.String strReplace = str.replace(A00(1, 10, 68), str2);
        java.lang.String strA00 = A00(0, 0, 39);
        if (i > 0) {
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(i);
            java.lang.String updatedString = A00(0, 1, 37);
            strA00 = sbAppend.append(updatedString).toString();
        }
        java.lang.String updatedString2 = A00(11, 10, 34);
        return strReplace.replace(updatedString2, strA00);
    }

    public final java.lang.String A03() {
        return this.A00;
    }

    public final java.lang.String A04() {
        return this.A01;
    }

    public final java.lang.String A05() {
        return this.A02;
    }

    public final java.lang.String A06(java.lang.String str, int i) {
        return A01(this.A03, str, i);
    }
}
