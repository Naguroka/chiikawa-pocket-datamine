package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0929Pe {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"eh8tV3BTVZyC4rnOdi11vwqGDRDascht", "hSOppPlOOrNO5T03Qep3cNil6G", "x5hMgXdYM31n8nDkX", "IhAz4sh6yfr7m3vuoMOIViRRm", "oslkPdCCfDrrZGVIb", "MBT8adsCaGk0kR1DcVhNdi7i", "wD9Je1AYBIOAT7r9Cd3JTv7t", "5GZdk8oKlkryNJR3gzyJyFU7wNJ92iGQ"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static android.webkit.WebResourceResponse A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.webkit.WebResourceRequest webResourceRequest, android.net.Uri uri, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> map) throws java.io.IOException {
        java.lang.String strA02 = A02(85, 5, 72);
        com.facebook.ads.redexgen.core.C1120Wo c1120WoA0F = com.facebook.ads.redexgen.core.RW.A05(c1199Zs.A01()).A0F(c1199Zs);
        com.facebook.ads.redexgen.core.C04766f.A0H(c1199Zs, uri.toString());
        try {
            com.facebook.ads.redexgen.core.C0930Pf c0930Pf = new com.facebook.ads.redexgen.core.C0930Pf(c1199Zs.A01(), uri, c1120WoA0F);
            int iAvailable = c0930Pf.available();
            if (iAvailable <= 0) {
                A05(c1199Zs, 1, new android.util.Pair[]{new android.util.Pair(A02(61, 9, 112), java.lang.String.valueOf(iAvailable))});
                return null;
            }
            java.lang.String strA03 = A03(webResourceRequest.getRequestHeaders());
            if (strA03 == null) {
                c1199Zs.A0E().A5k();
                A06(map, iAvailable);
                return new android.webkit.WebResourceResponse(str, null, 200, A02(44, 2, 60), map, c0930Pf);
            }
            try {
                com.facebook.ads.redexgen.core.C0928Pd c0928PdA01 = A01(strA03);
                if (c0928PdA01.A03) {
                    int i = c0928PdA01.A01;
                    int i2 = c0928PdA01.A00 == -1 ? iAvailable - 1 : c0928PdA01.A00;
                    A06(map, iAvailable);
                    map.put(A02(31, 13, 100), A02(75, 6, 25) + i + A02(1, 1, 53) + i2 + A02(2, 1, 58) + iAvailable);
                    c1199Zs.A0E().A5k();
                    return new android.webkit.WebResourceResponse(str, null, com.ironsource.g3.c.b.INSTANCE_NOT_FOUND_IN_LOAD, A02(46, 15, 58), map, c0930Pf);
                }
                android.util.Pair[] pairArr = new android.util.Pair[1];
                if (A01[1].length() == 10) {
                    throw new java.lang.RuntimeException();
                }
                A01[7] = "IAvs1VPG9ddgEdFHiUWOtiyrkkO9RlnS";
                pairArr[0] = new android.util.Pair(A02(94, 5, 70), c0928PdA01.A02 != null ? c0928PdA01.A02 : A02(90, 4, 17));
                A05(c1199Zs, 0, pairArr);
                return null;
            } catch (java.lang.NumberFormatException e) {
                A05(c1199Zs, 3, new android.util.Pair[]{new android.util.Pair(strA02, e.toString())});
                return null;
            }
        } catch (java.io.IOException e2) {
            A05(c1199Zs, 2, new android.util.Pair[]{new android.util.Pair(strA02, e2.toString())});
            return null;
        }
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 80);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-39, -78, -71, -85, -18, 16, 16, 18, 29, 33, -38, -1, 14, 27, 20, 18, 32, -82, -38, -39, -33, -48, -39, -33, -104, -73, -48, -39, -46, -33, -45, -9, 35, 34, 40, 25, 34, 40, -31, 6, 21, 34, 27, 25, -37, -41, -38, -21, -4, -2, -13, -21, -10, -86, -51, -7, -8, -2, -17, -8, -2, 33, 54, 33, 41, 44, 33, 34, 44, 37, 19, 42, 37, 22, 36, -53, -30, -35, -50, -36, -119, -4, 8, -3, -2, -3, 10, 10, 7, 10, -49, -42, -51, -51, 8, -9, 4, -3, -5};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A05(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, int i, android.util.Pair<java.lang.String, java.lang.String>[] pairArr) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(A02(81, 4, 73), i);
            for (android.util.Pair<java.lang.String, java.lang.String> pair : pairArr) {
                jSONObject.put((java.lang.String) pair.first, pair.second);
            }
        } catch (org.json.JSONException unused) {
        }
        c1199Zs.A0E().A5j(jSONObject.toString());
    }

    static {
        A04();
    }

    public static com.facebook.ads.redexgen.core.C0928Pd A01(java.lang.String str) {
        if (str == null) {
            com.facebook.ads.redexgen.core.C0928Pd parseResult = new com.facebook.ads.redexgen.core.C0928Pd();
            parseResult.A03 = false;
            parseResult.A02 = null;
            return parseResult;
        }
        java.lang.String[] strArrSplit = str.split(A02(3, 1, 30));
        if (strArrSplit.length >= 2) {
            if (A02(70, 5, 97).equals(strArrSplit[0].toLowerCase(java.util.Locale.US).trim())) {
                if (strArrSplit[1].trim().split(A02(0, 1, 93)).length != 1) {
                    com.facebook.ads.redexgen.core.C0928Pd c0928Pd = new com.facebook.ads.redexgen.core.C0928Pd();
                    c0928Pd.A03 = false;
                    c0928Pd.A02 = str;
                    return c0928Pd;
                }
                java.lang.String[] ranges = strArrSplit[1].trim().split(A02(1, 1, 53));
                com.facebook.ads.redexgen.core.C0928Pd c0928Pd2 = new com.facebook.ads.redexgen.core.C0928Pd();
                c0928Pd2.A03 = true;
                c0928Pd2.A02 = str;
                c0928Pd2.A01 = android.text.TextUtils.isEmpty(ranges[0]) ? 0 : java.lang.Integer.parseInt(ranges[0]);
                if (ranges.length > 1) {
                    c0928Pd2.A00 = android.text.TextUtils.isEmpty(ranges[1]) ? -1 : java.lang.Integer.parseInt(ranges[1]);
                } else {
                    c0928Pd2.A00 = -1;
                }
                return c0928Pd2;
            }
        }
        com.facebook.ads.redexgen.core.C0928Pd c0928Pd3 = new com.facebook.ads.redexgen.core.C0928Pd();
        c0928Pd3.A03 = false;
        c0928Pd3.A02 = str;
        return c0928Pd3;
    }

    public static java.lang.String A03(java.util.Map<java.lang.String, java.lang.String> map) {
        for (java.lang.String str : map.keySet()) {
            if (A01[1].length() != 10) {
                A01[1] = "Cf1eqBqAOspOHDMpApIZdhtZXzC";
                if (A02(94, 5, 70).equals(str.toLowerCase(java.util.Locale.US))) {
                    java.lang.String str2 = map.get(str);
                    if (A01[1].length() != 10) {
                        A01[1] = "1CCmnR2TaHvOXaAch";
                        return str2;
                    }
                }
            }
            throw new java.lang.RuntimeException();
        }
        return null;
    }

    public static void A06(java.util.HashMap<java.lang.String, java.lang.String> map, int i) {
        map.put(A02(4, 13, 93), A02(70, 5, 97));
        map.put(A02(17, 14, 27), java.lang.String.valueOf(i));
    }
}
