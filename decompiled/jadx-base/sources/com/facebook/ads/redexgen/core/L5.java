package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class L5 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"h7TbtU4Y3aavuK2RNDrR490o97xA3UQR", "nWlFT6gMh83RN55hOK2s7jkd0", "m7AJmaDY7", "gyeYb9LWXFqsSrKIVSRt0Co29LGYuhaR", "EW8hQNBuni4zfziLp651zBZrhIaSPPe", "twQOenmklhEl", "GklYvNYuNnGVP8xhiRThcatIgfshVE", "s31M0lMjYrtgq4OJcDKBiGgiocxpngd"};

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 121);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{12, 127, 69, 9, 94, 101, 9, 126, 121, 127, 69, 9, 94, 101, 9, 126, 20, 9, 29, 15, 10, 9, 121, 14, 13, 27, 112, 65, 82, 83, 73, 78, 71, 0, 85, 82, 76, 0, 5, 83, 0, 67, 65, 85, 83, 69, 68, 0, 69, 88, 67, 69, 80, 84, 73, 79, 78, 26, 0, 5, 83, 14, 55, 72, 67, 84, 67, 2, 87, 80, 75, 2, 0, 7, 81, 0, 2, 76, 77, 86, 2, 71, 83, 87, 67, 78, 2, 86, 77, 2, 67, 76, 70, 80, 77, 75, 70, 2, 87, 80, 75, 2, 0, 7, 81, 0, 12, 2, 102, 71, 64, 87, 69, 2, 75, 76, 68, 77, 24, 2, 7, 81, 12, 2, 109, 80, 75, 69, 75, 76, 67, 78, 2, 87, 80, 75, 24, 2, 7, 81, 116, 127, 104, 127, 75, 108, 119, 62, 127, 107, 106, 118, 113, 108, 119, 106, 103, 36, 62, 60, 59, 109, 60, 48, 62, 127, 112, 122, 108, 113, 119, 122, 75, 108, 119, 62, 127, 107, 106, 118, 113, 108, 119, 106, 103, 36, 62, 60, 59, 109, 60, 48, 51, 56, 47, 56, 12, 43, 48, 121, 54, 41, 56, 40, 44, 60, 121, 41, 56, 43, 45, 99, 121, 123, 124, 42, 123, 119, 121, 56, 55, kotlin.io.encoding.Base64.padSymbol, 43, 54, 48, kotlin.io.encoding.Base64.padSymbol, 12, 43, 48, 121, 54, 41, 56, 40, 44, 60, 121, 41, 56, 43, 45, 99, 121, 123, 124, 42, 123, 119, 35, 40, okio.Utf8.REPLACEMENT_BYTE, 40, 28, 59, 32, 105, 57, 40, kotlin.io.encoding.Base64.padSymbol, 33, 115, 105, 107, 108, 58, 107, 103, 105, 40, 39, 45, 59, 38, 32, 45, 28, 59, 32, 105, 57, 40, kotlin.io.encoding.Base64.padSymbol, 33, 115, 105, 107, 108, 58, 107, 103, 5, 14, 25, 14, 58, 29, 6, 79, 28, 12, 7, 10, 2, 10, 85, 79, 77, 74, 28, 77, 65, 79, 14, 1, 11, 29, 0, 6, 11, 58, 29, 6, 79, 28, 12, 7, 10, 2, 10, 85, 79, 77, 74, 28, 77, 65};
    }

    static {
        A09();
    }

    public static android.net.Uri A00(java.lang.String str) {
        android.net.Uri uri = android.net.Uri.parse(str);
        com.facebook.ads.redexgen.core.C1198Zr c1198ZrA00 = com.facebook.ads.redexgen.core.AbstractC04997i.A00();
        if (c1198ZrA00 != null && !com.facebook.ads.redexgen.core.C0762Im.A2k(c1198ZrA00)) {
            return uri;
        }
        if (!A0D(uri)) {
            android.net.Uri androidUri = A01(str);
            return androidUri;
        }
        A0A(str, uri);
        return uri;
    }

    public static android.net.Uri A01(java.lang.String str) {
        try {
            java.net.URI uri = new java.net.URI(str);
            if (uri.isOpaque()) {
                android.net.Uri androidUri = A03(uri);
                A0B(str, uri, androidUri);
                return androidUri;
            }
            android.net.Uri androidUri2 = A02(uri);
            A0C(str, uri, androidUri2, false);
            return androidUri2;
        } catch (java.net.URISyntaxException e) {
            throw A04(str, e);
        }
    }

    public static android.net.Uri A02(java.net.URI uri) {
        return new android.net.Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getRawAuthority()).encodedPath(uri.getRawPath()).encodedQuery(uri.getRawQuery()).encodedFragment(uri.getRawFragment()).build();
    }

    public static android.net.Uri A03(java.net.URI uri) {
        return new android.net.Uri.Builder().scheme(uri.getScheme()).encodedOpaquePart(uri.getRawSchemeSpecificPart()).encodedFragment(uri.getRawFragment()).build();
    }

    public static java.lang.SecurityException A04(java.lang.String str, java.net.URISyntaxException uRISyntaxException) {
        return new java.lang.SecurityException(java.lang.String.format(java.util.Locale.US, A05(26, 36, 89), str, uRISyntaxException.getMessage()));
    }

    public static java.net.URI A06(android.net.Uri uri) {
        try {
            java.net.URI javaUri = new java.net.URI(uri.toString());
            if (A0F(javaUri, uri)) {
                return javaUri;
            }
            return null;
        } catch (java.net.URISyntaxException unused) {
            return null;
        }
    }

    public static java.net.URI A07(java.lang.String str, android.net.Uri uri) {
        try {
            return new java.net.URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (java.net.URISyntaxException e) {
            java.net.URI uriA06 = A06(uri);
            if (uriA06 != null) {
                return uriA06;
            }
            throw A04(str, e);
        }
    }

    public static java.net.URI A08(java.lang.String str, android.net.Uri uri) {
        try {
            return new java.net.URI(uri.getScheme(), uri.getSchemeSpecificPart(), uri.getFragment());
        } catch (java.net.URISyntaxException e) {
            throw A04(str, e);
        }
    }

    public static void A0A(java.lang.String str, android.net.Uri uri) throws java.lang.SecurityException {
        if (uri.isOpaque()) {
            java.net.URI uriA08 = A08(str, uri);
            if (A01[6].length() != 30) {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "XZATJK5ui";
            A0B(str, uriA08, uri);
            return;
        }
        java.net.URI uriA07 = A07(str, uri);
        A0C(str, uriA07, uri, A0F(uriA07, uri));
    }

    public static void A0B(java.lang.String str, java.net.URI uri, android.net.Uri uri2) {
        boolean zA0E = A0E(uri.getScheme(), uri2.getScheme());
        boolean zA0E2 = A0E(uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        if (zA0E && zA0E2) {
            return;
        }
        java.lang.String strA05 = A05(0, 0, 3);
        if (!zA0E) {
            strA05 = strA05 + java.lang.String.format(java.util.Locale.US, A05(290, 46, 22), uri.getScheme(), uri2.getScheme());
        }
        if (!zA0E2) {
            strA05 = strA05 + java.lang.String.format(java.util.Locale.US, A05(192, 56, 32), uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        }
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String debugInfo = uri.toString();
        throw new java.lang.SecurityException(java.lang.String.format(locale, A05(63, 77, 91), debugInfo, uri2.toString(), strA05, str));
    }

    public static void A0C(java.lang.String str, java.net.URI uri, android.net.Uri uri2, boolean z) {
        boolean zA0E = A0E(uri.getScheme(), uri2.getScheme());
        boolean zA0E2 = A0E(uri.getAuthority(), uri2.getAuthority());
        boolean zA0E3 = A0E(uri.getPath(), uri2.getPath());
        java.lang.String strA05 = A05(0, 0, 3);
        if (!zA0E) {
            strA05 = strA05 + java.lang.String.format(java.util.Locale.US, A05(290, 46, 22), uri.getScheme(), uri2.getScheme());
        }
        if (!z && !zA0E2) {
            strA05 = strA05 + java.lang.String.format(java.util.Locale.US, A05(140, 52, 103), uri.getAuthority(), uri2.getAuthority());
        }
        if (!zA0E3) {
            strA05 = strA05 + java.lang.String.format(java.util.Locale.US, A05(248, 42, 48), uri.getPath(), uri2.getPath());
        }
        if (zA0E && zA0E2 && zA0E3) {
        } else {
            throw new java.lang.SecurityException(java.lang.String.format(java.util.Locale.US, A05(63, 77, 91), uri.toString(), uri2.toString(), strA05, str));
        }
    }

    public static boolean A0D(android.net.Uri uri) {
        if (uri.getScheme() == null) {
            return true;
        }
        return uri.getScheme().matches(A05(0, 26, 93));
    }

    public static boolean A0E(java.lang.String str, java.lang.String str2) {
        java.lang.String strA05 = A05(0, 0, 3);
        if (str == null || str.equals(strA05)) {
            return str2 == null || str2.equals(strA05);
        }
        return str.equals(str2);
    }

    public static boolean A0F(java.net.URI uri, android.net.Uri uri2) {
        java.lang.String host = uri2.getHost();
        java.lang.String androidHost = uri.getHost();
        if (androidHost == null && host != null) {
            java.lang.String androidHost2 = A05(62, 1, 17);
            if (host.contains(androidHost2)) {
                return true;
            }
        }
        return false;
    }
}
