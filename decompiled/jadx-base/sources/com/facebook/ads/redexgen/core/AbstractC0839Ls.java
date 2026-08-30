package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0839Ls {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 89);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-19, -6, -16, -2, -5, -11, -16, -70, -4, -15, -2, -7, -11, -1, -1, -11, -5, -6, -70, -51, -49, -49, -47, -33, -33, -21, -38, -47, -32, -29, -37, -34, -41, -21, -33, -32, -51, -32, -47, 5, 17, 16, 16, 7, 5, 22, 11, 24, 11, 22, 27};
    }

    public static com.facebook.ads.redexgen.core.EnumC0838Lr A00(android.content.Context context) {
        int result = context.checkCallingOrSelfPermission(A01(0, 39, 51));
        if (result != 0) {
            return com.facebook.ads.redexgen.core.EnumC0838Lr.A08;
        }
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getSystemService(A01(39, 12, 73))).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return com.facebook.ads.redexgen.core.EnumC0838Lr.A07;
        }
        int result2 = activeNetworkInfo.getType();
        if (result2 == 0) {
            int result3 = activeNetworkInfo.getSubtype();
            switch (result3) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return com.facebook.ads.redexgen.core.EnumC0838Lr.A03;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return com.facebook.ads.redexgen.core.EnumC0838Lr.A04;
                case 13:
                    return com.facebook.ads.redexgen.core.EnumC0838Lr.A05;
                default:
                    return com.facebook.ads.redexgen.core.EnumC0838Lr.A08;
            }
        }
        return com.facebook.ads.redexgen.core.EnumC0838Lr.A06;
    }
}
