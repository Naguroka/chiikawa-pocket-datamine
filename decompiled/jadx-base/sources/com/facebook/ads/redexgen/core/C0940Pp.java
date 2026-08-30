package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0940Pp {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"qx9J4yAnPXaVyRX1wkhfMyD35E0bVkcp", "bG7a76MJuQYCTQVI4bECP0jat3LYDm8S", "3sji", "WOIjjsVKw0oGTZJ8bV1Eiv07MXmRBJ4e", "zigTdk", "jLtidcNh89Szai5k4uiuh5UaOWCNfF4m", "9OqLRA6IbqecmBl4IJChXH2akamtN0Bd", "1PwXl0SmV68MCkNjB88Y7o3DlBd3CbFY"};
    public static final java.lang.String A02;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 99);
            java.lang.String[] strArr = A01;
            if (strArr[4].length() == strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[3] = "3GrjuQcpYdFWBcs25Ezt7MBLI0wjxHRp";
            strArr2[7] = "nD922LhxjrSAIQnDmHWR8rAyvz5NrvSF";
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-71, -41, -39, -34, -37, -106, -29, -33, -23, -23, -106, -36, -27, -24, -106, -36, -33, -30, -37, -106, -21, -24, -30, -80, -106, 18, 48, 50, 55, 52, -17, 60, 56, 66, 66, -17, 53, 62, 65, -17, 56, 60, 48, 54, 52, -17, 68, 65, 59, 9, -17, -47, -43, -32, -24, 21, 21, 18, 21, -61, 18, 19, 8, 17, 12, 17, 10, -61, 6, 4, 6, 11, 8, 7, -61, 9, 12, 15, 8, -61, 9, 18, 21, -61, 24, 21, 15, -35, -61, -36, -40, -41, 11, -6, -1, -5, 4, -7, -5, -28, -5, 10, 13, 5, 8, 1, -17, -21, -46, -12, -15, -27, -25, -11, -11, -21, -16, -23, -94, -24, -21, -18, -25, -94, -9, -12, -18, -68, -94, -16, 18, 15, 3, 5, 19, 19, 9, 14, 7, -64, 9, 13, 1, 7, 5, -64, 21, 18, 12, -38, -64, 34, 68, 65, 53, 55, 69, 69, 59, 64, 57, -14, 72, 59, 54, 55, 65, -14, 71, 68, 62, 12, -14, 15, 30, 23, -19, -8, -9, -12, -18};
    }

    static {
        A04();
        A02 = com.facebook.ads.redexgen.core.C0940Pp.class.getSimpleName();
    }

    public static android.webkit.WebResourceResponse A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C04766f c04766f, android.webkit.WebResourceRequest webResourceRequest, com.facebook.ads.redexgen.core.C0938Pn c0938Pn, boolean z) {
        java.lang.String string = webResourceRequest.getUrl().toString();
        if (c0938Pn.A05) {
            return null;
        }
        try {
            java.util.HashMap map = new java.util.HashMap();
            java.lang.String strGuessContentTypeFromName = java.net.URLConnection.guessContentTypeFromName(string);
            if (c0938Pn.A01.contains(string)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String url = A03(108, 21, 31);
                sb.append(url).append(string).toString();
                java.io.File cachedFile = c04766f.A0O(string);
                if (cachedFile != null) {
                    if (z) {
                        java.lang.String url2 = c0938Pn.A00;
                        if (string.equals(url2)) {
                            return A02(map, strGuessContentTypeFromName, new com.facebook.ads.redexgen.core.C0932Ph(c1199Zs.A01(), new java.io.FileInputStream(cachedFile), new com.facebook.ads.redexgen.core.U8(c1199Zs, string)));
                        }
                    }
                    return A01(map, strGuessContentTypeFromName, cachedFile);
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.String url3 = A03(0, 25, 19);
                sb2.append(url3).append(string).toString();
            }
            if (c0938Pn.A02.contains(string)) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                java.lang.String url4 = A03(129, 22, 61);
                sb3.append(url4).append(string).toString();
                java.io.File fileA0P = c04766f.A0P(string);
                if (fileA0P != null) {
                    return A01(map, strGuessContentTypeFromName, fileA0P);
                }
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                java.lang.String url5 = A03(25, 26, 108);
                sb4.append(url5).append(string).toString();
            }
            if (c0938Pn.A03.contains(string)) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                java.lang.String url6 = A03(org.objectweb.asm.Opcodes.DCMPL, 22, 111);
                sb5.append(url6).append(string).toString();
                return com.facebook.ads.redexgen.core.AbstractC0929Pe.A00(c1199Zs, webResourceRequest, webResourceRequest.getUrl(), strGuessContentTypeFromName, map);
            }
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String url7 = A03(54, 35, 64);
            java.lang.String mimeType = sb6.append(url7).append(string).toString();
            java.lang.String url8 = A03(89, 17, 51);
            android.util.Log.e(url8, mimeType, e);
        }
        return null;
    }

    public static android.webkit.WebResourceResponse A01(java.util.HashMap<java.lang.String, java.lang.String> responseHeaders, java.lang.String str, java.io.File file) throws java.io.FileNotFoundException {
        return A02(responseHeaders, str, new java.io.FileInputStream(file));
    }

    public static android.webkit.WebResourceResponse A02(java.util.HashMap<java.lang.String, java.lang.String> responseHeaders, java.lang.String str, java.io.InputStream inputStream) {
        return new android.webkit.WebResourceResponse(str, null, 200, A03(106, 2, 61), responseHeaders, inputStream);
    }

    public static void A05(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, java.lang.String str2) {
        com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(A03(51, 3, 42));
        c8f.A05(1);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(A03(org.objectweb.asm.Opcodes.ARETURN, 2, 34), str);
            jSONObject.put(A03(org.objectweb.asm.Opcodes.GETSTATIC, 3, 31), str2);
            c8f.A07(jSONObject);
        } catch (org.json.JSONException unused) {
        }
        c7j.A07().AA1(A03(org.objectweb.asm.Opcodes.LRETURN, 3, 72), com.facebook.ads.redexgen.core.C8E.A12, c8f);
    }
}
