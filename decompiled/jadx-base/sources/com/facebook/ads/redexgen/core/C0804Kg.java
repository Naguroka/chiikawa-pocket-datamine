package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0804Kg {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 49);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-19, -7, -9, -72, -16, -21, -19, -17, -20, -7, -7, -11, -72, -21, -18, -3, -72, -13, -8, -2, -17, -4, -8, -21, -10, -72, -21, -18, -3, -23, -3, -6, -23, -3, -2, -7, -4, -21, -15, -17};
    }

    public static android.content.SharedPreferences A00(com.facebook.ads.redexgen.core.C7j c7j) {
        return c7j.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A01(0, 40, 89), c7j), 0);
    }

    public final int A03(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, int i) {
        return A00(c7j).getInt(str, i);
    }

    public final java.lang.String A04(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, java.lang.String str2) {
        return A00(c7j).getString(str, str2);
    }

    public final void A05(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, int i) {
        android.content.SharedPreferences btSP = A00(c7j);
        btSP.edit().putInt(str, i).apply();
    }

    public final void A06(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences btSP = A00(c7j);
        btSP.edit().putString(str, str2).apply();
    }
}
