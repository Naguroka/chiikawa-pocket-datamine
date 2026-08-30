package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class L2 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"T4dPy6oALRnRtXie0LYtNa7PXoaz5xNV", "GuB", "", "N5ZcwGbFLOfjQt8i7LOYdNhhAY9bfZ8J", "XGEF2r9HzP4eyBZiq0puzcaX55o", "r68Pu4BAqG0jUrZ19Ek7iVXcY822rh1q", "w97ZnD7u", "Y1Vl"};

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{77, 66, 83, 74, 78, 56, 77, 83, 95, 73, 79, 89, 94, 73, 83, 88, 67, 71, 73, 66, 84, 91, 74, 82, 69, 70, 74, 84, 81, 74, 86, 90, 91, 65, 80, 91, 65, 85, 87, 90, 90, 83, 68, 73, 82, 89, 91, 87, 95, 88, 88, 122, 117, 60, 111, 59, 104, 111, 122, 105, 111, 59, 90, 110, 127, 114, 126, 117, 120, 126, 85, 126, 111, 108, 116, 105, 112, 90, 120, 111, 114, 109, 114, 111, 98, 53, 59, 86, 122, 112, 126, 59, 104, 110, 105, 126, 59, 111, 115, 122, 111, 59, 114, 111, 60, 104, 59, 114, 117, 59, 98, 116, 110, 105, 59, 90, 117, 127, 105, 116, 114, 127, 86, 122, 117, 114, 125, 126, 104, 111, 53, 99, 118, 119, 59, 125, 114, 119, 126, 53, 28, 1, 13, 11, 24, 6, 12, 11, 21, 21, 17, 18, 38, 55, 58, 54, kotlin.io.encoding.Base64.padSymbol, 48, 54, 29, 54, 39, 36, 60, 33, 56, 26, 104, 64, 79, 126, 64, 66, 85, 72, 87, 72, 85, 88, 41, 38, 44, 58, 39, 33, 44, 36, 43, 33, 55, 42, 44, 33, 107, 44, 43, 49, 32, 43, 49, 107, 36, 38, 49, 44, 42, 43, 107, 19, 12, 0, 18, 58, 53, okio.Utf8.REPLACEMENT_BYTE, 41, 52, 50, okio.Utf8.REPLACEMENT_BYTE, 117, 50, 53, 47, 62, 53, 47, 117, 56, 58, 47, 62, 60, 52, 41, 34, 117, 25, 9, 20, 12, 8, 26, 25, 23, 30, 112, 125, 125, 126, 70, 86, 75, 83, 87, 65, 86, 113, 118, 104, 50, 48, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 52, 35, 24, 53, 20, 22, 27, 27, 18, 5, 35, 14, 7, 18, 54, 57, 60, 48, 59, 33, 1, 58, 62, 48, 59, 113, 125, 127, 60, 115, 124, 118, 96, 125, 123, 118, 60, 112, 96, 125, 101, 97, 119, 96, 60, 115, 98, 98, 126, 123, 113, 115, 102, 123, 125, 124, 77, 123, 118, 15, 3, 1, 66, 13, 2, 8, 30, 3, 5, 8, 66, 26, 9, 2, 8, 5, 2, 11, 103, 107, 105, 42, 98, 101, 103, 97, 102, 107, 107, 111, 42, 99, 107, 107, 99, 104, 97, 116, 104, 101, 125, 119, 112, 107, 118, 97, 101, 106, 42, 67, 107, 107, 99, 104, 97, 84, 104, 101, 125, 87, 112, 107, 118, 97, 69, 74, 75, 114, 97, 118, 104, 101, 125, 65, 124, 112, 97, 118, 106, 101, 104, 69, 103, 112, 109, 114, 109, 112, 125, 109, 97, 99, 32, 104, 111, 109, 107, 108, 97, 97, 101, 32, 101, 111, 122, 111, 96, 111, 66, 78, 79, 71, 72, 70, 126, 82, 84, 81, 81, 78, 83, 85, 82, 108, 84, 77, 85, 72, 118, 72, 79, 69, 78, 86, 3, 15, 14, 6, 9, 7, okio.Utf8.REPLACEMENT_BYTE, 19, 21, 16, 16, 15, 18, 20, 19, 51, 16, 12, 9, 20, 51, 3, 18, 5, 5, 14, 45, 21, 12, 20, 9, 55, 9, 14, 4, 15, 23, 5, 20, 3, 7, 18, 3, 57, 8, 3, 17, 57, 18, 7, 4, 75, 79, 4, 11, 14, 22, 7, 16, 7, 6, kotlin.io.encoding.Base64.padSymbol, 1, 14, 11, 1, 9, kotlin.io.encoding.Base64.padSymbol, 6, 7, 14, 3, 27, kotlin.io.encoding.Base64.padSymbol, 15, 17, 39, 46, 33, 43, 35, 42, kotlin.io.encoding.Base64.padSymbol, 27, 38, 34, 42, 23, 11, 11, 15, 36, 56, 56, 60, 118, 99, 99, 60, 32, 45, 53, 98, 43, 35, 35, 43, 32, 41, 98, 47, 35, 33, 99, okio.Utf8.REPLACEMENT_BYTE, 56, 35, 62, 41, 99, 45, 60, 60, okio.Utf8.REPLACEMENT_BYTE, 99, 38, 58, 58, 62, kotlin.io.encoding.Base64.padSymbol, 83, 94, 24, 31, 2, 5, 16, 31, 5, 46, 22, 16, 28, 20, 2, 64, 90, 118, 74, 72, 74, 118, 79, 64, 69, 93, 76, 91, 118, 74, 69, 64, 74, 66, 90, 118, 70, 71, 118, 74, 93, 72, kotlin.io.encoding.Base64.padSymbol, 39, 11, 55, 38, 49, 53, 32, kotlin.io.encoding.Base64.padSymbol, 34, 49, 11, 53, 39, 11, 55, 32, 53, 11, 34, 102, 9, 5, 22, 15, 1, 16, 104, 113, 98, 117, 107, 102, 126, 74, 86, 91, 67, 20, 93, 85, 85, 93, 86, 95, 20, 89, 85, 87, 59, 44, 58, 32, 51, 44, 4, 38, 45, 44, 50, 41, 46, 54, 50, 34, 14, 35, 32, okio.Utf8.REPLACEMENT_BYTE, 51, 33, 2, 47, 38, 51};
    }

    static {
        A08();
    }

    private int A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        android.content.pm.PackageInfo packageInfo;
        try {
            android.content.pm.PackageManager packageManager = c1199Zs.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(A06(com.bytedance.sdk.openadsdk.TTAdConstant.IMAGE_URL_CODE, 19, 65), 0)) != null && !android.text.TextUtils.isEmpty(packageInfo.versionName)) {
                return java.lang.Integer.parseInt(packageInfo.versionName.split(A06(org.objectweb.asm.Opcodes.IF_ACMPNE, 2, 9), 2)[0]);
            }
            return -1;
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    public static android.content.Intent A01(android.net.Uri uri) {
        android.content.Intent intent = new android.content.Intent(A06(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 26, 10), uri);
        intent.setComponent(null);
        if (android.os.Build.VERSION.SDK_INT >= 15) {
            intent.setSelector(null);
        }
        return intent;
    }

    public static android.content.Intent A02(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.net.Uri uri) {
        android.content.Intent intentA01 = A01(uri);
        intentA01.addCategory(A06(212, 33, 20));
        intentA01.addFlags(268435456);
        intentA01.putExtra(A06(288, 34, 93), c1199Zs.getPackageName());
        intentA01.putExtra(A06(494, 14, 41), false);
        if (com.facebook.ads.redexgen.core.C0762Im.A1u(c1199Zs)) {
            if (A06(508, 2, 98).equals(uri.getScheme())) {
                intentA01.setPackage(A06(com.bytedance.sdk.openadsdk.TTAdConstant.IMAGE_URL_CODE, 19, 65));
            }
        }
        return intentA01;
    }

    public static android.content.Intent A03(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.net.Uri uri) {
        android.content.Intent intentA01 = A01(uri);
        intentA01.setPackage(A06(322, 19, 35));
        intentA01.putExtra(A06(259, 8, 30), c1199Zs.getPackageName());
        intentA01.putExtra(A06(656, 7, 72), true);
        return intentA01;
    }

    private final com.facebook.ads.redexgen.core.EnumC03240g A04(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.net.Uri uri, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) throws com.facebook.ads.redexgen.core.C0811Ko {
        boolean zA05 = com.facebook.ads.redexgen.core.AbstractC0763In.A05(c1199Zs);
        boolean isInAppBrowserEnabled = A0E(uri);
        if (isInAppBrowserEnabled && zA05) {
            A0B(c1199Zs, uri, str, map);
            com.facebook.ads.redexgen.core.EnumC03240g enumC03240g = com.facebook.ads.redexgen.core.EnumC03240g.A08;
            if (A01[7].length() == 30) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[2] = "";
            strArr[1] = "Q7p";
            return enumC03240g;
        }
        c1199Zs.A0E().A94(zA05);
        A09(c1199Zs, uri);
        return com.facebook.ads.redexgen.core.EnumC03240g.A07;
    }

    public static com.facebook.ads.redexgen.core.EnumC03240g A05(com.facebook.ads.redexgen.core.L2 l2, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.net.Uri uri, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> extraData) throws com.facebook.ads.redexgen.core.C0811Ko {
        boolean z = A0E(uri) && A06(663, 15, 117).equals(uri.getHost());
        boolean isGooglePlayWebLink = A06(650, 6, 43).equals(uri.getScheme());
        if (!isGooglePlayWebLink && !z) {
            return l2.A04(c1199Zs, uri, str, extraData);
        }
        try {
            l2.A0A(c1199Zs, uri, str);
            return com.facebook.ads.redexgen.core.EnumC03240g.A03;
        } catch (com.facebook.ads.redexgen.core.L0 unused) {
            return l2.A04(c1199Zs, uri, str, extraData);
        }
    }

    private java.lang.String A07(java.lang.String str) {
        return android.util.Base64.encodeToString(str.getBytes(), 0);
    }

    private void A09(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.net.Uri uri) throws com.facebook.ads.redexgen.core.C0811Ko {
        com.facebook.ads.redexgen.core.C0813Kq.A0C(c1199Zs, A02(c1199Zs, uri));
    }

    private final void A0A(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.net.Uri uri, java.lang.String str) throws com.facebook.ads.redexgen.core.C0811Ko, com.facebook.ads.redexgen.core.L0 {
        if (A0G(c1199Zs)) {
            if (com.facebook.ads.redexgen.core.C0762Im.A1B(c1199Zs)) {
                java.lang.String queryParameter = uri.getQueryParameter(A06(587, 2, 117));
                if (!android.text.TextUtils.isEmpty(queryParameter)) {
                    if (A01[3].charAt(29) != 'Z') {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A01;
                    strArr[4] = "AXwrjbGi2NqoDqohSkmHlyhQGK6";
                    strArr[6] = "xSKC0PNk";
                    java.lang.String strA06 = A06(589, 13, 62);
                    java.lang.String packageName = uri.toString();
                    com.facebook.ads.redexgen.core.C2M.A03(queryParameter, strA06, packageName);
                }
            }
            boolean z = (c1199Zs.A0G().A01() && com.facebook.ads.redexgen.core.C0762Im.A1W(c1199Zs)) || (com.facebook.ads.redexgen.core.C0762Im.A1v(c1199Zs) && A0H(c1199Zs));
            if (!z) {
                boolean shouldTryToOpenSplitScreen = com.facebook.ads.redexgen.core.C0762Im.A2H(c1199Zs);
                if (shouldTryToOpenSplitScreen) {
                    boolean shouldTryToOpenSplitScreen2 = com.facebook.ads.redexgen.core.C0813Kq.A0D(c1199Zs, A03(c1199Zs, uri));
                    if (shouldTryToOpenSplitScreen2) {
                        return;
                    }
                }
            }
            boolean zA0K = A0K(c1199Zs, uri, str);
            if (A01[3].charAt(29) != 'Z') {
                A01[7] = "w5Gj6271lmeoEbiTTMEsWTdaWp";
                if (zA0K) {
                    return;
                }
            } else {
                A01[3] = "TMuIQjN9vpUXBqY7VYY4Z8DVMg5lcZnK";
                if (zA0K) {
                    return;
                }
            }
            android.content.Intent intentA02 = A02(c1199Zs, uri);
            intentA02.setPackage(A06(322, 19, 35));
            if (android.os.Build.VERSION.SDK_INT >= 24 && z) {
                intentA02.addFlags(268472320);
            }
            com.facebook.ads.redexgen.core.C0813Kq.A0C(c1199Zs, intentA02);
            return;
        }
        throw new com.facebook.ads.redexgen.core.L0();
    }

    private void A0B(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.net.Uri uri, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        com.facebook.ads.internal.util.activity.AdActivityIntent adActivityIntentA04 = com.facebook.ads.redexgen.core.C0813Kq.A04(c1199Zs);
        if (!com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            adActivityIntentA04.addFlags(268435456);
        }
        adActivityIntentA04.putExtra(A06(696, 8, 25), com.facebook.ads.redexgen.core.KG.A03);
        adActivityIntentA04.putExtra(A06(249, 10, 107), uri.toString());
        adActivityIntentA04.putExtra(A06(277, 11, 26), str);
        adActivityIntentA04.putExtra(A06(533, 11, 0), java.lang.System.currentTimeMillis());
        if (map != null) {
            java.lang.String strA06 = A06(267, 10, 56);
            adActivityIntentA04.putExtra(strA06, map.get(strA06));
            java.lang.String strA07 = A06(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, 21, 27);
            adActivityIntentA04.putExtra(strA07, map.get(strA07));
            java.lang.String strA08 = A06(602, 27, 102);
            adActivityIntentA04.putExtra(strA08, map.get(strA08));
            java.lang.String strA09 = A06(510, 23, 45);
            adActivityIntentA04.putExtra(strA09, map.get(strA09));
            java.lang.String strA010 = A06(688, 8, 8);
            java.lang.String str2 = map.get(strA010);
            if (str2 != null) {
                adActivityIntentA04.putExtra(strA010, str2);
            }
        }
        try {
            com.facebook.ads.redexgen.core.C0813Kq.A0A(c1199Zs, adActivityIntentA04);
        } catch (com.facebook.ads.redexgen.core.C0811Ko e) {
            java.lang.Throwable cause = e.getCause();
            com.facebook.ads.redexgen.core.C0811Ko cause2 = e;
            if (cause != null) {
                cause2 = e.getCause();
            }
            c1199Zs.A07().AA0(A06(org.objectweb.asm.Opcodes.JSR, 11, 110), com.facebook.ads.redexgen.core.C8E.A0D, new com.facebook.ads.redexgen.core.C8F(cause2));
            android.util.Log.e(A06(org.objectweb.asm.Opcodes.FCMPL, 17, 28), A06(50, 90, 84), cause2);
        }
    }

    public static void A0C(com.facebook.ads.redexgen.core.L2 l2, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.net.Uri uri, java.lang.String str) {
        l2.A0L(c1199Zs, uri, str);
    }

    public static void A0D(com.facebook.ads.redexgen.core.L2 l2, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.net.Uri uri, java.lang.String str) throws com.facebook.ads.redexgen.core.C0811Ko {
        A05(l2, c1199Zs, uri, str, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    public static boolean A0E(android.net.Uri uri) {
        boolean isHttpPermitted;
        boolean isHttpPermitted2 = android.os.Build.VERSION.SDK_INT < 24 || android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() || android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(uri.getHost());
        java.lang.String scheme = uri.getScheme();
        if (isHttpPermitted2) {
            boolean isHttpPermitted3 = A06(544, 4, 48).equalsIgnoreCase(scheme);
            if (!isHttpPermitted3) {
                isHttpPermitted = A06(582, 5, 1).equalsIgnoreCase(scheme);
                if (isHttpPermitted) {
                    return false;
                }
            }
        } else {
            isHttpPermitted = A06(582, 5, 1).equalsIgnoreCase(scheme);
            if (isHttpPermitted) {
                return false;
            }
        }
        return true;
    }

    private boolean A0F(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        if (!com.facebook.ads.redexgen.core.C0762Im.A19(c1199Zs)) {
            return false;
        }
        int deviceFBVersion = com.facebook.ads.redexgen.core.C0762Im.A0E(c1199Zs);
        int iA00 = A00(c1199Zs);
        if (deviceFBVersion == -1 || iA00 == -1 || deviceFBVersion > iA00) {
            return false;
        }
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.String[] strArr = A01;
        java.lang.String str = strArr[4];
        java.lang.String str2 = strArr[6];
        int length = str.length();
        int fbVersionWithGPOverlay = str2.length();
        if (length == fbVersionWithGPOverlay) {
            throw new java.lang.RuntimeException();
        }
        A01[7] = "9F";
        if (i < 28) {
            return false;
        }
        java.lang.String[] strArr2 = A01;
        java.lang.String str3 = strArr2[2];
        java.lang.String str4 = strArr2[1];
        int length2 = str3.length();
        int fbVersionWithGPOverlay2 = str4.length();
        if (length2 != fbVersionWithGPOverlay2) {
            java.lang.String[] strArr3 = A01;
            strArr3[4] = "HTEWLbQNfCJbfH7LEcJTogLCYG9";
            strArr3[6] = "jIuteURS";
            return true;
        }
        return true;
    }

    private boolean A0G(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        android.content.Intent playStoreIntent = new android.content.Intent(A06(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 26, 10), com.facebook.ads.redexgen.core.L5.A00(A06(548, 34, 3)));
        java.util.Iterator<android.content.pm.ResolveInfo> it = c1199Zs.getPackageManager().queryIntentActivities(playStoreIntent, 0).iterator();
        do {
            boolean zHasNext = it.hasNext();
            java.lang.String[] strArr = A01;
            if (strArr[5].charAt(7) != strArr[0].charAt(7)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[4] = "NqbTETCkL6wtg2G74gvKWlTJws9";
            strArr2[6] = "JszVyiBC";
            if (!zHasNext) {
                return false;
            }
        } while (!it.next().activityInfo.applicationInfo.packageName.equals(A06(322, 19, 35)));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0079 A[PHI: r0 r1 r5
  0x0079: PHI (r0v21 int) = (r0v17 int), (r0v25 int) binds: [B:33:0x00d7, B:19:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r1v15 java.lang.String) = (r1v12 java.lang.String), (r1v19 java.lang.String) binds: [B:33:0x00d7, B:19:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:33:0x00d7, B:19:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean A0H(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        java.lang.String strA06;
        java.lang.String strA07;
        int identifier;
        boolean z = android.os.Build.VERSION.SDK_INT >= 24;
        boolean zA0I = A0I(c1199Zs);
        java.lang.String[] strArr = A01;
        if (strArr[5].charAt(7) != strArr[0].charAt(7)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[2] = "";
        strArr2[1] = "LeI";
        boolean z2 = z && zA0I;
        boolean z3 = true;
        boolean supportsSplitScreenMultiWindow = true;
        boolean appResizingSupported = true;
        boolean onAndAboveNOS = com.facebook.ads.redexgen.core.C0762Im.A24(c1199Zs);
        if (onAndAboveNOS) {
            android.content.res.Resources system = android.content.res.Resources.getSystem();
            java.lang.String[] strArr3 = A01;
            if (strArr3[5].charAt(7) != strArr3[0].charAt(7)) {
                java.lang.String strA08 = A06(431, 26, 110);
                strA06 = A06(245, 4, 93);
                strA07 = A06(org.objectweb.asm.Opcodes.PUTSTATIC, 7, 7);
                identifier = system.getIdentifier(strA08, strA06, strA07);
                if (identifier != 0) {
                    z3 = android.content.res.Resources.getSystem().getBoolean(identifier);
                }
            } else {
                java.lang.String[] strArr4 = A01;
                strArr4[2] = "";
                strArr4[1] = "Rqc";
                java.lang.String strA09 = A06(431, 26, 110);
                strA06 = A06(245, 4, 93);
                strA07 = A06(org.objectweb.asm.Opcodes.PUTSTATIC, 7, 7);
                identifier = system.getIdentifier(strA09, strA06, strA07);
                if (identifier != 0) {
                    z3 = android.content.res.Resources.getSystem().getBoolean(identifier);
                }
            }
            int identifier2 = system.getIdentifier(A06(457, 37, 47), strA06, strA07);
            if (identifier2 != 0) {
                supportsSplitScreenMultiWindow = android.content.res.Resources.getSystem().getBoolean(identifier2);
            }
            appResizingSupported = com.facebook.ads.redexgen.core.LE.A0C(c1199Zs);
            z2 &= z3 && supportsSplitScreenMultiWindow && appResizingSupported;
        }
        c1199Zs.A0E().AAX(zA0I, z2, z3, supportsSplitScreenMultiWindow, appResizingSupported);
        return z2;
    }

    public static boolean A0I(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        android.content.pm.ActivityInfo activityInfo;
        try {
            android.app.Activity activityA0D = c1199Zs.A0D();
            android.content.pm.PackageManager packageManager = c1199Zs.getPackageManager();
            if (activityA0D == null || packageManager == null) {
                return false;
            }
            if (android.os.Build.VERSION.SDK_INT > 32) {
                activityInfo = packageManager.getActivityInfo(activityA0D.getComponentName(), android.content.pm.PackageManager.ComponentInfoFlags.of(0L));
            } else {
                activityInfo = packageManager.getActivityInfo(activityA0D.getComponentName(), 128);
            }
            java.lang.reflect.Field declaredField = android.content.pm.ActivityInfo.class.getDeclaredField(A06(678, 10, 6));
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(activityInfo);
            return (obj instanceof java.lang.Integer) && ((java.lang.Integer) obj).intValue() != 0;
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException e) {
            c1199Zs.A0E().AAV(e.getMessage());
        }
        return false;
    }

    private boolean A0J(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.net.Uri uri, java.lang.String str) throws com.facebook.ads.redexgen.core.C0811Ko {
        try {
            android.app.Activity activityA0D = c1199Zs.A0D();
            java.lang.String string = uri.toString();
            if (activityA0D != null && !android.text.TextUtils.isEmpty(string)) {
                android.content.Intent fbIntent = new android.content.Intent();
                if (com.facebook.ads.redexgen.core.C0762Im.A1A(c1199Zs)) {
                    java.lang.String strA06 = com.facebook.ads.redexgen.core.AbstractC1341cD.A06(str);
                    if (android.text.TextUtils.isEmpty(strA06)) {
                        return false;
                    }
                    fbIntent.putExtra(A06(0, 20, 67), A07(strA06));
                }
                fbIntent.setComponent(new android.content.ComponentName(A06(com.bytedance.sdk.openadsdk.TTAdConstant.IMAGE_URL_CODE, 19, 65), A06(341, 71, 75)));
                fbIntent.putExtra(A06(140, 9, 22), string);
                fbIntent.putExtra(A06(37, 13, 89), A07(A06(20, 17, 90)));
                if (!com.facebook.ads.redexgen.core.C0813Kq.A0D(c1199Zs, fbIntent)) {
                    activityA0D.startActivityForResult(fbIntent, 2);
                    return true;
                }
                return true;
            }
            return false;
        } catch (android.content.ActivityNotFoundException | java.lang.IllegalStateException e) {
            c1199Zs.A0E().AA4(e.getMessage());
            return false;
        }
    }

    private boolean A0K(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.net.Uri uri, java.lang.String str) throws com.facebook.ads.redexgen.core.C0811Ko {
        return A0F(c1199Zs) && A0J(c1199Zs, uri, str);
    }

    private final boolean A0L(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.net.Uri uri, java.lang.String str) {
        return com.facebook.ads.redexgen.core.C0813Kq.A0H(c1199Zs, uri, str);
    }

    public static boolean A0M(com.facebook.ads.redexgen.core.L2 l2, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.net.Uri uri, java.lang.String str) {
        try {
            A0D(l2, c1199Zs, uri, str);
            return true;
        } catch (com.facebook.ads.redexgen.core.C0811Ko e) {
            java.lang.Throwable cause = e.getCause();
            com.facebook.ads.redexgen.core.C0811Ko cause2 = e;
            if (cause != null) {
                cause2 = e.getCause();
            }
            c1199Zs.A07().AA0(A06(org.objectweb.asm.Opcodes.JSR, 11, 110), com.facebook.ads.redexgen.core.C8E.A05, new com.facebook.ads.redexgen.core.C8F(cause2));
            return false;
        }
    }
}
