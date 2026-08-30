package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8O, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8O {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"ksHi49HeyLxhEuEQ3ZpH94jUoJqLqgaO", "OjCJx3NFQ0DFgiyf16DgggNozGEs4R4q", "GEO9tIl26J6KBxgfZlF82GfP7HtNAY9Z", "nOASZQwcdTvox6Zrqcm6Ob1f72Bs0sPe", "97ugpJwHRGNEpoGk3FmXenG", "0hX3UIoeWP89IzRfugcPHePTUXouBxgf", "dDjk4aEiSkmoIE6VCcWXk7EEukMkdVWT", "2G0bY4RpV1kXQIyv7KcyHSXfT8fWnCKY"};
    public static final java.lang.String A04;
    public final com.facebook.ads.redexgen.core.C7j A00;
    public final java.lang.String A01;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 19);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-57, -44, -54, -40, -43, -49, -54, -108, -42, -53, -40, -45, -49, -39, -39, -49, -43, -44, -108, -88, -81, -76, -86, -59, -89, -87, -87, -85, -71, -71, -81, -88, -81, -78, -81, -70, -65, -59, -71, -85, -72, -68, -81, -87, -85, -103, -105, -96, -105, -92, -101, -107, -65, -73, -66, -67, -76};
    }

    static {
        A02();
        A04 = android.os.Build.VERSION.RELEASE;
    }

    public C8O(com.facebook.ads.redexgen.core.C7j c7j) {
        this(c7j, null);
    }

    public C8O(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        this.A00 = c7j;
        this.A01 = str;
    }

    private java.lang.String A00() {
        int i;
        if (this.A01 != null) {
            return this.A01;
        }
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            i = 67108864;
        } else {
            i = 0;
        }
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(this.A00, 0, new android.content.Intent(), i);
        if (activity == null) {
            return A01(0, 0, 54);
        }
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return activity.getCreatorPackage();
        }
        return activity.getTargetPackage();
    }

    public final int A03() {
        return com.facebook.ads.redexgen.core.LE.A01(this.A00);
    }

    public final int A04() {
        try {
            return this.A00.getPackageManager().getPackageInfo(A00(), 0).versionCode;
        } catch (java.lang.Throwable t) {
            this.A00.A07().AA0(A01(45, 7, 31), com.facebook.ads.redexgen.core.C8E.A1M, new com.facebook.ads.redexgen.core.C8F(t));
            return 0;
        }
    }

    public final java.lang.String A05() {
        try {
            java.lang.CharSequence appLabel = this.A00.getPackageManager().getApplicationLabel(this.A00.getPackageManager().getApplicationInfo(A00(), 0));
            if (appLabel != null && appLabel.length() > 0) {
                return appLabel.toString();
            }
        } catch (java.lang.Throwable th) {
            this.A00.A07().AA0(A01(45, 7, 31), com.facebook.ads.redexgen.core.C8E.A1M, new com.facebook.ads.redexgen.core.C8F(th));
        }
        return A01(0, 0, 54);
    }

    public final java.lang.String A06() {
        java.lang.String str = null;
        try {
            str = this.A00.getPackageManager().getPackageInfo(A00(), 0).versionName;
        } catch (java.lang.Throwable t) {
            com.facebook.ads.redexgen.core.C8D c8dA07 = this.A00.A07();
            int i = com.facebook.ads.redexgen.core.C8E.A1M;
            com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(t);
            java.lang.String appVersionName = A01(45, 7, 31);
            c8dA07.AAS(appVersionName, i, c8f);
        }
        return !android.text.TextUtils.isEmpty(str) ? str : A01(0, 0, 54);
    }

    public final java.lang.String A07() {
        java.lang.String bundleOverride = this.A00.A04().A6c();
        if (bundleOverride != null) {
            return bundleOverride;
        }
        return A00();
    }

    public final java.lang.String A08() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) this.A00.getSystemService(A01(52, 5, 60));
        if (telephonyManager != null) {
            java.lang.String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (A03[2].charAt(10) != '6') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A03;
            strArr[5] = "Y0rO6junFBlFHafjvJcSeB7fUCyZ4Mo6";
            strArr[7] = "E4dacaRM3DS0bJ8W8Pcl72SYoh6IL0u8";
            if (networkOperatorName != null && networkOperatorName.length() > 0) {
                return networkOperatorName;
            }
        }
        return A01(0, 0, 54);
    }

    public final java.lang.String A09() {
        if (android.os.Build.MANUFACTURER != null) {
            java.lang.String str = android.os.Build.MANUFACTURER;
            java.lang.String[] strArr = A03;
            if (strArr[3].charAt(20) == strArr[0].charAt(20)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[3] = "17co7YvrhvaQQJ3lRMCxQ7nYKJi0wzqK";
            strArr2[0] = "xVh8HKEIQLp4oZwybdpyhu7U8ElYQBbb";
            if (str.length() > 0) {
                return android.os.Build.MANUFACTURER;
            }
        }
        return A01(0, 0, 54);
    }

    public final java.lang.String A0A() {
        return (android.os.Build.MODEL == null || android.os.Build.MODEL.length() <= 0) ? A01(0, 0, 54) : android.os.Build.MODEL;
    }

    public final java.lang.String A0B() {
        java.lang.String installer_name;
        try {
            java.lang.String strA00 = A00();
            if (strA00 != null && strA00.length() >= 0 && (installer_name = this.A00.getPackageManager().getInstallerPackageName(strA00)) != null && installer_name.length() > 0) {
                return installer_name;
            }
        } catch (java.lang.Throwable th) {
            this.A00.A07().AAS(A01(45, 7, 31), com.facebook.ads.redexgen.core.C8E.A1M, new com.facebook.ads.redexgen.core.C8F(th));
        }
        return A01(0, 0, 54);
    }

    public final boolean A0C() {
        return this.A00.checkCallingOrSelfPermission(A01(0, 45, 83)) == 0;
    }
}
