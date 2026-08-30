package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class LC {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"jE5XhhYKQHpatPcaqKauHRorLHvmx36n", "j5XcoEcQeBll47Gmx6jJ35WP8DJmwvrw", "kVl1RLZeBZp6BFsBugJhIVOAvqqMASOM", "QSUK5zHpyvdae", "vPHRoVXEMWzbN", "yuxZo0oeIJp1om754wFfCKw5qfu7K2sC", "XIj7zi9aVzSGRkWRza9PLbW8qplNkm3M", "NShUMjU8EFbasu9WAPG4eHHUTqko21N4"};
    public static final android.os.Handler A02;
    public static final java.util.Set<java.lang.String> A03;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 4);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{39, 47, 107, 112, 122, 119, 115, 104, -128, 108, 107, 39, 109, 118, 121, 39, 123, 108, 122, 123, 39, 104, 107, 122, 39, 118, 117, 115, -128, 48, -78, -66, -68, 125, -75, -80, -78, -76, -79, -66, -66, -70, 125, -70, -80, -61, -80, -67, -80, -87, -75, -77, 116, -84, -89, -87, -85, -88, -75, -75, -79, 116, -67, -89, -79, -81, -64, -89, -71, -82, -81};
    }

    static {
        A03();
        A03 = new java.util.HashSet();
        A02 = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static void A04(android.content.Context context, java.lang.String str) {
        if (com.facebook.ads.internal.settings.AdInternalSettings.isTestMode(context)) {
            java.lang.String str2 = str + A01(0, 30, 3);
        }
    }

    public static void A05(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.redexgen.core.LZ lz, java.lang.String str) {
        if (str == null || A03.contains(str)) {
            return;
        }
        boolean isPackageInstalled = A08(c1198Zr.getPackageManager(), str);
        if (isPackageInstalled) {
            lz.ACu(str);
            return;
        }
        A03.add(str);
        A02.removeCallbacksAndMessages(null);
        A02.postDelayed(new com.facebook.ads.redexgen.core.LB(new int[]{0}, str, c1198Zr, lz), 1000L);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004d  */
    public static void A06(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, java.lang.String str) {
        boolean isWithinFB;
        if (c1198Zr.getPackageName().equals(A01(30, 19, 75))) {
            isWithinFB = true;
        } else {
            java.lang.String packageName = c1198Zr.getPackageName();
            java.lang.String[] strArr = A01;
            if (strArr[1].charAt(0) != strArr[0].charAt(0)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[1] = "j02YsboHYugdBqu3W2eQxUFjhHj6b2oh";
            strArr2[0] = "jTJN86H0DvMYpZ5S4bGPoLkC3Jk4zW8z";
            if (packageName.equals(A01(49, 22, 66))) {
                isWithinFB = true;
            } else {
                isWithinFB = false;
            }
        }
        if (isWithinFB) {
            A02.removeCallbacksAndMessages(null);
            A03.remove(str);
        } else {
            com.facebook.ads.redexgen.core.C2B.A00(c1198Zr).A0A(str, null, 5);
        }
    }

    public static void A07(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, java.lang.String str, com.facebook.ads.redexgen.core.LZ lz) {
        boolean isWithinFB = c1198Zr.getPackageName().equals(A01(30, 19, 75)) || c1198Zr.getPackageName().equals(A01(49, 22, 66));
        if (isWithinFB) {
            A05(c1198Zr, lz, str);
        } else {
            com.facebook.ads.redexgen.core.C2B.A00(c1198Zr).A0A(str, lz, 4);
        }
    }

    public static boolean A08(android.content.pm.PackageManager packageManager, java.lang.String str) {
        if (packageManager == null) {
            return false;
        }
        try {
            packageManager.getPackageGids(str);
            return true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
