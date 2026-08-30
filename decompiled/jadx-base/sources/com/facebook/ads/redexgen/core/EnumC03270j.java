package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC03270j {
    A03,
    A02,
    A04;

    public static byte[] A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 36);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{68, 67, 94, 89, 76, 65, 65, 72, 73, 31, 30, 31, 20, 114, 115, 104, 99, 117, 114, 111, 104, 125, 112, 112, 121, 120};
    }

    static {
        A02();
    }

    public static com.facebook.ads.redexgen.core.EnumC03270j A00(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return A03;
        }
        try {
            return valueOf(str.toUpperCase(java.util.Locale.US));
        } catch (java.lang.IllegalArgumentException unused) {
            return A03;
        }
    }
}
