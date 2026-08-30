package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LQ {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"fKOq3CLbRisV2HCvxbP8DswDC3h61WtS", "qQcG8iivYcbnleQXnFNfPBjKpUSTKwt1", "90Y8NMpYXvys60lz4Y4AY7bkcR6rkmkz", "C2raqoqRf1xXuaxgLg", "Co6wMAKL4SYYucOnnpwSDFFGSy", "pPL6tu27HuVGqH4ILm", "ywYYaeUt5bOEJr09A3", "jMc4mNTDFQmf2DaMzWYBnxz0IZlySjfz"};
    public static final java.lang.String A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 23);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{27, 57, 54, 127, 44, 120, 60, kotlin.io.encoding.Base64.padSymbol, 44, kotlin.io.encoding.Base64.padSymbol, 42, 53, 49, 54, kotlin.io.encoding.Base64.padSymbol, 120, 49, 62, 120, 57, 40, 40, 120, 49, 43, 120, 13, 54, 49, 44, 33, 118, 55, 13, 94, 43, 16, 23, 10, 7, 94, 31, 14, 14, 68, 94, 88, 84, 86, 21, 93, 90, 88, 94, 89, 84, 84, 80, 21, 73, 94, 90, 88, 79, 21, 105, 94, 90, 88, 79, 122, 88, 79, 82, 77, 82, 79, 66, 18, 30, 28, 95, 4, 31, 24, 5, 8, 66, 21, 95, 1, 29, 16, 8, 20, 3, 95, 36, 31, 24, 5, 8, 33, 29, 16, 8, 20, 3, 48, 18, 5, 24, 7, 24, 5, 8};
    }

    static {
        A01();
        A02 = com.facebook.ads.redexgen.core.LQ.class.getSimpleName();
    }

    public static boolean A02() {
        try {
            java.lang.Class.forName(A00(46, 32, 44));
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            java.lang.Class.forName(A00(78, 38, 102));
            if (A01[2].charAt(21) != '7') {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "fqSGPLRwldKX66WDmKKlg7YQ1V3cstss";
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i, int i2) {
        return i >= 640 && i2 >= 640;
    }

    public static boolean A05(com.facebook.ads.redexgen.core.C7j c7j) {
        boolean z = false;
        try {
            android.content.pm.PackageManager packageManager = c7j.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean isUnity = true;
            android.content.pm.ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(c7j.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                for (android.content.pm.ActivityInfo activityInfo : activityInfoArr) {
                    boolean activityDeclared = A00(78, 38, 102).equals(activityInfo.name);
                    if (activityDeclared) {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                boolean activityDeclared2 = A03();
                if (!activityDeclared2) {
                    isUnity = false;
                }
            }
            boolean activityDeclared3 = c7j.A04().A9O();
            if (activityDeclared3) {
                java.lang.String str = A00(32, 14, 105) + isUnity;
            }
            return isUnity;
        } catch (java.lang.Throwable th) {
            if (c7j.A04().A9O()) {
                android.util.Log.e(A02, A00(0, 32, 79), th);
            }
            return false;
        }
    }
}
