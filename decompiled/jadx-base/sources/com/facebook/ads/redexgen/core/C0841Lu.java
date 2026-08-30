package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0841Lu {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"kzsYhm9LKsU0BkYF5GBD4cHOfO5I2S", "FiiX6q", "juV27aOscABEXHLMFQmBucT", "1EXxaj", "f1sOyyKe81qkTfSynlEtElAllv4GRKo", "lzeqJRba", "GXB72S", "F9UQYukVDOEwI1lxcupNtKixpZh4OtVr"};
    public static final com.facebook.ads.redexgen.core.InterfaceC0840Lt A02 = null;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 22);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{64, 75, 86, 3, 23, 8, 20, 21, 18, 16, 50, kotlin.io.encoding.Base64.padSymbol, 116, 39, 115, 53, 60, 33, 62, 50, 39, 115, 39, 58, 62, 54, 125};
    }

    static {
        A07();
    }

    public static long A00() {
        if (A02 != null) {
            return A02.A5M();
        }
        return java.lang.System.currentTimeMillis();
    }

    public static long A01(long j) {
        if (j == -1) {
            return -1L;
        }
        return java.lang.System.currentTimeMillis() - j;
    }

    public static java.lang.String A02(double d) throws java.lang.Exception {
        try {
            return java.lang.String.format(java.util.Locale.US, A03(0, 4, 115), java.lang.Double.valueOf(d));
        } catch (java.lang.Exception e) {
            java.lang.String simpleName = com.facebook.ads.redexgen.core.C0841Lu.class.getSimpleName();
            if (A01[3].length() == 20) {
                java.lang.Exception e2 = new java.lang.RuntimeException();
                throw e2;
            }
            A01[0] = "ylDYykVZ0MQgZWbzvTC4Y0QCoTAruV";
            android.util.Log.e(simpleName, A03(9, 18, 69), e);
            return A03(4, 5, 48);
        }
    }

    public static java.lang.String A04(long j) {
        return java.lang.String.valueOf(A01(j));
    }

    @java.lang.Deprecated
    public static java.lang.String A05(long j) {
        return A02(j / 1000.0d);
    }

    public static java.lang.String A06(long j) {
        return java.lang.Long.toString(j);
    }
}
