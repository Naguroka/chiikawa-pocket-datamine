package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0825Le {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 67);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-33, -41, -38, -31, -41, -39};
    }

    public static android.os.Bundle A00(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.facebook.ads.redexgen.core.C2M.A01, A01(0, 6, 102));
        bundle.putString(com.facebook.ads.redexgen.core.C2M.A00, str);
        return bundle;
    }
}
