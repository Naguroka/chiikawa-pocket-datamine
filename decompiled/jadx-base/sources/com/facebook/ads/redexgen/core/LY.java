package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class LY {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 124);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-16, -7, -3, 49, -85, -83, -83, 1, -2, -9};
    }

    public static java.lang.String A01(long j) {
        java.lang.String string;
        java.lang.String strA00 = A00(0, 0, 78);
        if (j < 1000) {
            string = j + strA00;
        } else {
            java.lang.String strA01 = A00(0, 4, 79);
            if (j < 1000000) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String formattedNumber = java.lang.String.format(java.util.Locale.US, strA01, java.lang.Double.valueOf(j / 1000.0d));
                java.lang.StringBuilder sbAppend = sb.append(formattedNumber);
                java.lang.String formattedNumber2 = A00(8, 1, 55);
                string = sbAppend.append(formattedNumber2).toString();
            } else if (j < androidx.media3.common.C.NANOS_PER_SECOND) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.String formattedNumber3 = java.lang.String.format(java.util.Locale.US, strA01, java.lang.Double.valueOf(j / 1000000.0d));
                java.lang.StringBuilder sbAppend2 = sb2.append(formattedNumber3);
                java.lang.String formattedNumber4 = A00(9, 1, 46);
                string = sbAppend2.append(formattedNumber4).toString();
            } else {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                java.lang.String formattedNumber5 = java.lang.String.format(java.util.Locale.US, strA01, java.lang.Double.valueOf(j / 1.0E9d));
                java.lang.StringBuilder sbAppend3 = sb3.append(formattedNumber5);
                java.lang.String formattedNumber6 = A00(7, 1, 67);
                string = sbAppend3.append(formattedNumber6).toString();
            }
        }
        java.lang.String strA02 = A00(4, 3, 1);
        if (string.contains(strA02)) {
            return string.replace(strA02, strA00);
        }
        return string;
    }
}
