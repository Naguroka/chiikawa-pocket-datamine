package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.La, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0821La {
    public static byte[] A00;

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 108);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{62, 50, 48, 115, 59, 60, 62, 56, okio.Utf8.REPLACEMENT_BYTE, 50, 50, 54, 115, 54, 60, 41, 60, 51, 60};
    }

    public static android.content.pm.PackageInfo A00(com.facebook.ads.redexgen.core.C7j c7j) {
        return A01(c7j, A02(0, 19, 49));
    }

    public static android.content.pm.PackageInfo A01(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        android.content.pm.PackageManager packageManager;
        if (android.text.TextUtils.isEmpty(str) || (packageManager = c7j.getPackageManager()) == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(str, 1);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        } catch (java.lang.RuntimeException unused2) {
            return null;
        }
    }

    public static boolean A04(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        android.content.pm.PackageInfo packageInfo = A01(c7j, str);
        return packageInfo != null;
    }
}
