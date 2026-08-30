package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6V, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6V {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"OKQe8hXRO9IjIcE", "fZKFXGCnlijKRnd4C4GIjN8U9jomZ", "zd2g3FUlSdy4niS", "DQ1eYrU0vgUbRV2buV2T3UhVrDT8jNOj", "Q6rIf3Izbhrm2WD", "9gkLXGbOvBYKsW5YBwzKkub2Nn3K8ZPa", "2O7yMssiHcBFdM45gqp1TjJS", "Fkq1E5"};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[3].charAt(10) == 'G') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[2] = "GMwx2CjIRojg5Fd";
            strArr[4] = "kdR397QSXvrHcnb";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 100);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{74, 92, 119, 77, 80, 92, 90, 73, 91, 24, 20, 22, 85, 29, 26, 24, 30, 25, 20, 20, 16, 85, 26, 31, 8, 85, 18, 21, 15, 30, 9, 21, 26, 23, 85, 25, 15, 30, 3, 15, 9, 26, 8};
    }

    static {
        A02();
    }

    public static android.content.SharedPreferences A00(com.facebook.ads.redexgen.core.C7j c7j) {
        return c7j.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A01(9, 34, 31), c7j), 0);
    }

    public final java.lang.String A03(com.facebook.ads.redexgen.core.C7j c7j) {
        return A00(c7j).getString(A01(0, 9, 76), null);
    }

    public final void A04(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        android.content.SharedPreferences btSP = A00(c7j);
        btSP.edit().putString(A01(0, 9, 76), str).apply();
    }
}
