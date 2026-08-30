package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03260i {
    public static byte[] A00;
    public static final java.lang.String A01;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 9);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{44, 23, 24, 27, 21, 28, 89, 13, 22, 89, 9, 24, 11, 10, 28, 89, 19, 10, 22, 23, 89, 29, 24, 13, 24, 89, 16, 23, 89, 56, 29, 56, 26, 13, 16, 22, 23, okio.Utf8.REPLACEMENT_BYTE, 24, 26, 13, 22, 11, 0, 87, 114, 119, 98, 119, 51, 50, 47, 53, 40, 57, 126, 97, 116, 127, 78, 125, 120, 127, 122, 49, 32, 51, 50, 40, 47, 38, 62, 47, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 58, 38, 60, 33, 59, 41, 38, 42, 45, 54, 43, 60, 88, 95, 68, 89, 78, 116, 94, 89, 71, 116, 92, 78, 73, 116, 77, 74, 71, 71, 73, 74, 72, 64, 50, 52, 51, 35, 76, 83, 94, 95, 85, 101, 79, 72, 86};
    }

    static {
        A03();
        A01 = com.facebook.ads.redexgen.core.C03260i.class.getSimpleName();
    }

    public static com.facebook.ads.redexgen.core.AbstractC03250h A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> extraData, com.facebook.ads.redexgen.core.C1T c1t) {
        return A01(c1199Zs, j7, str, uri, extraData, true, false, c1t);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:47:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    public static com.facebook.ads.redexgen.core.AbstractC03250h A01(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String action, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> map, boolean z, boolean z2, com.facebook.ads.redexgen.core.C1T c1t) {
        com.facebook.ads.redexgen.core.C03310o c03310oA00;
        byte b;
        if (uri == null || uri.getAuthority() == null) {
            return null;
        }
        java.lang.String key = uri.getAuthority();
        java.lang.String queryParameter = uri.getQueryParameter(A02(113, 9, 51));
        java.lang.String queryParameter2 = uri.getQueryParameter(A02(45, 4, 31));
        if (queryParameter2 != null && !android.text.TextUtils.isEmpty(queryParameter2)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(queryParameter2);
                java.util.Iterator<java.lang.String> dataIterator = jSONObject.keys();
                while (dataIterator.hasNext()) {
                    java.lang.String next = dataIterator.next();
                    try {
                        map.put(next, jSONObject.getString(next));
                    } catch (org.json.JSONException e) {
                        e = e;
                        c1199Zs.A07().AA0(A02(64, 7, 72), com.facebook.ads.redexgen.core.C8E.A23, new com.facebook.ads.redexgen.core.C8F(e));
                        android.util.Log.w(A01, A02(0, 45, 112), e);
                        c03310oA00 = com.facebook.ads.redexgen.core.C03310o.A00(j7, com.facebook.ads.internal.util.activity.ActivityUtils.A00());
                        switch (key.hashCode()) {
                            case -1458789996:
                                if (key.equals(A02(71, 11, 71))) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 109770977:
                                if (key.equals(A02(82, 5, 80))) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case 1546100943:
                                if (key.equals(A02(55, 9, 24))) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                                if (queryParameter != null) {
                                    return null;
                                }
                                if (z2) {
                                }
                                break;
                            case 1:
                                if (A02(109, 4, 79).equals(uri.getQueryParameter(A02(49, 6, 85)))) {
                                    return new com.facebook.ads.redexgen.core.GP(c1199Zs, j7, action, uri, map, c03310oA00, z);
                                }
                                return z2 ? new com.facebook.ads.redexgen.core.C0701Ga(c1199Zs, j7, action, uri, map) : new com.facebook.ads.redexgen.core.GQ(c1199Zs, j7, action, uri, map, c03310oA00, z);
                            case 2:
                                return new com.facebook.ads.redexgen.core.C1375cl(c1199Zs, j7, action, uri, map);
                            default:
                                return new com.facebook.ads.redexgen.core.C1374ck(c1199Zs, j7, action, uri);
                        }
                    }
                }
            } catch (org.json.JSONException e2) {
                e = e2;
            }
        }
        c03310oA00 = com.facebook.ads.redexgen.core.C03310o.A00(j7, com.facebook.ads.internal.util.activity.ActivityUtils.A00());
        switch (key.hashCode()) {
            case -1458789996:
                if (key.equals(A02(71, 11, 71))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 109770977:
                if (key.equals(A02(82, 5, 80))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 1546100943:
                if (key.equals(A02(55, 9, 24))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                if (queryParameter != null) {
                    return null;
                }
                return (z2 || android.text.TextUtils.isEmpty(uri.getQueryParameter(A02(87, 22, 34)))) ? new com.facebook.ads.redexgen.core.C0705Gf(c1199Zs, j7, action, uri, map, c03310oA00, z, c1t) : new com.facebook.ads.redexgen.core.C0701Ga(c1199Zs, j7, action, uri, map, true);
            case 1:
                if (A02(109, 4, 79).equals(uri.getQueryParameter(A02(49, 6, 85)))) {
                    return new com.facebook.ads.redexgen.core.GP(c1199Zs, j7, action, uri, map, c03310oA00, z);
                }
                if (z2) {
                }
            case 2:
                return new com.facebook.ads.redexgen.core.C1375cl(c1199Zs, j7, action, uri, map);
            default:
                return new com.facebook.ads.redexgen.core.C1374ck(c1199Zs, j7, action, uri);
        }
    }

    public static boolean A04(java.lang.String str) {
        return A02(82, 5, 80).equalsIgnoreCase(str) || A02(55, 9, 24).equalsIgnoreCase(str);
    }
}
