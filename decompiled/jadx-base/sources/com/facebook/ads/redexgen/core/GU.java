package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GU {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"JhUegHxCNjOzCxSr", "5gQD8Y8UzOmVvx7", "QqvGYdLSjaASY2OhI4i6KQ0w0ePoKf8h", "WBkkAIsrii16acJ5rPC2mCALWvIHjj77", "I0VCU9c7aI83", "rLOqK8wyyMztHLJUVhhhpDxqL", "Qb", "hV"};
    public static final java.lang.String[] A06;
    public final int A00;
    public final java.lang.String A01;
    public final java.lang.String A02;
    public final java.lang.String[] A03;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 22);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{52, 101, 23};
    }

    static {
        A03();
        A06 = new java.lang.String[0];
    }

    public GU(java.lang.String str, int i, java.lang.String str2, java.lang.String[] strArr) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = strArr;
    }

    public static com.facebook.ads.redexgen.core.GU A00() {
        java.lang.String strA02 = A02(0, 0, 72);
        return new com.facebook.ads.redexgen.core.GU(strA02, 0, strA02, new java.lang.String[0]);
    }

    public static com.facebook.ads.redexgen.core.GU A01(java.lang.String str, int i) {
        java.lang.String strTrim;
        java.lang.String[] strArr;
        java.lang.String strTrim2 = str.trim();
        if (strTrim2.isEmpty()) {
            return null;
        }
        int iIndexOf = strTrim2.indexOf(A02(0, 1, 2));
        if (iIndexOf == -1) {
            strTrim = A02(0, 0, 72);
        } else {
            strTrim = strTrim2.substring(iIndexOf).trim();
            if (A05[4].length() == 12) {
                A05[0] = "AC4YCOMzy3EpJr";
                strTrim2 = strTrim2.substring(0, iIndexOf);
            }
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArrA0l = com.facebook.ads.redexgen.core.IK.A0l(strTrim2, A02(1, 2, 47));
        java.lang.String voice = A05[3];
        if (voice.charAt(13) != 'L') {
            A05[3] = "AognuA3Gp5BMXUBAwXIZSKPi0LSslNIr";
            java.lang.String name = strArrA0l[0];
            if (strArrA0l.length > 1) {
                strArr = (java.lang.String[]) java.util.Arrays.copyOfRange(strArrA0l, 1, strArrA0l.length);
            } else {
                strArr = A06;
            }
            return new com.facebook.ads.redexgen.core.GU(name, i, strTrim, strArr);
        }
        throw new java.lang.RuntimeException();
    }
}
