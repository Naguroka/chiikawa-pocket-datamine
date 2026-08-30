package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC03862r {
    public static java.lang.String[] A00 = {"nDiC2V", "xvPzB4voGkHgvzabNn8fejRwCVSwo6Ah", "OJIGMHO1ySc0mzACRtkWxwocBaSnW5m2", "JbsfTTx", "hwYl", "U04BYM1NuctRYg5sssH2", "d2TQ", "mxYxJu"};
    public static final int[] A01 = new int[0];
    public static final long[] A02 = new long[0];
    public static final java.lang.Object[] A03 = new java.lang.Object[0];

    public static int A00(int i) {
        return A01(i * 8) / 8;
    }

    public static int A01(int i) {
        int i2 = 4;
        while (A00[5].length() == 20) {
            A00[5] = "sf2HjvEbKVwFe9jamb5q";
            if (i2 < 32) {
                int i3 = 1 << i2;
                if (i <= i3 - 12) {
                    int i4 = (1 << i2) - 12;
                    return i4;
                }
                i2++;
            } else {
                return i;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static int A02(int[] iArr, int i, int i2) {
        int midVal = 0;
        int i3 = i - 1;
        while (midVal <= i3) {
            int i4 = midVal + i3;
            java.lang.String[] strArr = A00;
            java.lang.String str = strArr[1];
            java.lang.String str2 = strArr[2];
            int hi = str.charAt(26);
            int lo = str2.charAt(26);
            if (hi != lo) {
                throw new java.lang.RuntimeException();
            }
            A00[3] = "GyF3CdngjgIBS8WP";
            int hi2 = i4 >>> 1;
            int lo2 = iArr[hi2];
            if (lo2 < i2) {
                midVal = hi2 + 1;
            } else if (lo2 > i2) {
                i3 = hi2 - 1;
            } else {
                return hi2;
            }
        }
        int lo3 = midVal ^ (-1);
        return lo3;
    }

    public static int A03(long[] jArr, int i, long j) {
        int i2 = 0;
        int i3 = i - 1;
        while (i2 <= i3) {
            int lo = i2 + i3;
            int i4 = lo >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i2 = i4 + 1;
            } else {
                java.lang.String[] strArr = A00;
                java.lang.String str = strArr[4];
                java.lang.String str2 = strArr[6];
                int hi = str.length();
                int lo2 = str2.length();
                if (hi != lo2) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A00;
                strArr2[4] = "jlrm";
                strArr2[6] = "MXd0";
                if (j2 > j) {
                    i3 = i4 - 1;
                } else {
                    return i4;
                }
            }
        }
        int lo3 = i2 ^ (-1);
        return lo3;
    }

    public static boolean A04(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
