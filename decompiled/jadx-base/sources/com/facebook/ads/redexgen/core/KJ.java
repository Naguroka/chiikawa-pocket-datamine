package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class KJ {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 118);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-1, -5, -6, 29, 9, 43, 30, 31, 44};
    }

    public static android.content.SharedPreferences A00(android.content.Context context) {
        return context.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A01(0, 9, 67), context), 0);
    }
}
