package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class GX {
    public static byte[] A00;
    public static final java.util.regex.Pattern A01;
    public static final java.util.regex.Pattern A02;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 81);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{43, 23, 99, 94, 86, 67, 69, 82, 67, 66, 6, 113, 99, 100, 112, 114, 114, 8, 6, 97, 73, 82, 6, 15, 58, 45, 60, 58, 49, 43, 62, 56, 58, 44, 127, 50, 42, 44, 43, 127, 58, 49, 59, 127, 40, 54, 43, 55, 127, 122, 35, 81, 37, 53, 52, 47, 62, 83, 83, 91, 7, 114, 82, 85, 81, 82, 68, 95, 97, -48, -124, -128, 0, 104, 122, 125, 105, 107, 107, 23, 23, 31, 67, 54, 22, 17, 21, 22, 0, 27};
    }

    static {
        A03();
        A01 = java.util.regex.Pattern.compile(A02(52, 16, 42));
        A02 = java.util.regex.Pattern.compile(A02(68, 22, 110));
    }

    public static float A00(java.lang.String str) throws java.lang.NumberFormatException {
        if (str.endsWith(A02(0, 1, 95))) {
            return java.lang.Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new java.lang.NumberFormatException(A02(23, 27, 14));
    }

    public static long A01(java.lang.String str) throws java.lang.NumberFormatException {
        long j = 0;
        java.lang.String[] strArrA0m = com.facebook.ads.redexgen.core.IK.A0m(str, A02(50, 2, 46));
        for (java.lang.String str2 : com.facebook.ads.redexgen.core.IK.A0l(strArrA0m[0], A02(1, 1, 124))) {
            long value = java.lang.Long.parseLong(str2);
            j = (60 * j) + value;
        }
        long j2 = j * 1000;
        if (strArrA0m.length == 2) {
            long value2 = java.lang.Long.parseLong(strArrA0m[1]);
            j2 += value2;
        }
        return 1000 * j2;
    }

    public static void A04(com.facebook.ads.redexgen.core.I4 i4) throws com.facebook.ads.redexgen.core.C0695Fu {
        java.lang.String strA0P = i4.A0P();
        if (strA0P != null && A02.matcher(strA0P).matches()) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String line = A02(2, 21, 119);
        throw new com.facebook.ads.redexgen.core.C0695Fu(sb.append(line).append(strA0P).toString());
    }
}
