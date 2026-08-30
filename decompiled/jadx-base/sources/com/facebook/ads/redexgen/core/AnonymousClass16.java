package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.16, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass16 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"rumqJp0zjtXTj7VCZC", "TMr6rmpz3eFeqFi1AyEescympmX4mKYs", "yKc30ML1ifcOIqfiQ1Y0n8yeP8tTgKvd", "ifxbXcWS1dksd5gxUX3XXpeR8fGAW9", "ARavVsGpFp1prhlT9X", "AJCuKBIGe5nliswM6BoL4M7qaWNzDabC", "wiV5dRZ8vBgNvrirj4IbquLjXKvqAP", "mqXFYOGhIorfWow0I7OGPDKbQEIe0IwJ"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.C1346cI A01(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, org.json.JSONObject jSONObject, java.lang.String str, boolean z, int i, int i2) {
        boolean zOptBoolean;
        int iOptInt;
        java.util.ArrayList arrayList;
        if (jSONObject == null) {
            return new com.facebook.ads.redexgen.core.C1346cI();
        }
        com.facebook.ads.redexgen.core.LC.A04(c1199Zs, A02(0, 23, 112));
        java.lang.String strOptString = jSONObject.optString(A02(371, 10, 72));
        int iOptInt2 = jSONObject.optInt(A02(116, 12, 106), 0);
        java.lang.String strOptString2 = jSONObject.optString(A02(253, 13, 18));
        java.lang.String strA02 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(266, 12, 52));
        android.net.Uri uriA00 = android.text.TextUtils.isEmpty(strA02) ? null : com.facebook.ads.redexgen.core.L5.A00(strA02);
        java.lang.String strA03 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(128, 4, 54));
        java.lang.String strA01 = com.facebook.ads.redexgen.core.AbstractC0834Ln.A01(strA03);
        java.lang.String strA04 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(101, 15, 34));
        java.lang.String strA05 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(485, 5, 32));
        java.lang.String strA06 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(477, 8, 43));
        java.lang.String strA07 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(278, 8, 99));
        java.lang.String strA08 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(431, 14, 94));
        java.lang.String strA09 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(295, 16, 122));
        java.lang.String strA010 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(445, 21, 1));
        java.lang.String strA011 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(87, 14, 99));
        java.lang.String strA012 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(351, 20, 125));
        java.lang.String strA013 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(335, 16, 114));
        java.lang.String strA014 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET, 17, 38));
        java.lang.String strA015 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(org.objectweb.asm.Opcodes.IINC, 14, 16));
        com.facebook.ads.redexgen.core.C0688Fl c0688FlA02 = com.facebook.ads.redexgen.core.C0688Fl.A02(jSONObject, c1199Zs);
        com.facebook.ads.redexgen.core.JU juA00 = com.facebook.ads.redexgen.core.JU.A00(jSONObject.optJSONObject(A02(286, 4, 38)));
        com.facebook.ads.redexgen.core.JU juA01 = com.facebook.ads.redexgen.core.JU.A00(jSONObject.optJSONObject(A02(290, 5, 12)));
        com.facebook.ads.redexgen.core.JV jvA00 = com.facebook.ads.redexgen.core.JV.A00(jSONObject.optJSONObject(A02(466, 11, 29)));
        java.lang.String strA016 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(490, 15, 41));
        boolean zOptBoolean2 = jSONObject.optBoolean(A02(238, 15, 64));
        boolean zOptBoolean3 = jSONObject.optBoolean(A02(219, 19, 54));
        int iOptInt3 = jSONObject.optInt(A02(406, 25, 123), 4);
        int iOptInt4 = jSONObject.optInt(A02(381, 25, 38), 0);
        int iOptInt5 = jSONObject.optInt(A02(569, 31, 83), 0);
        int iOptInt6 = jSONObject.optInt(A02(600, 26, 76), 1000);
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(53, 15, 30));
        com.facebook.ads.redexgen.core.JU juA02 = jSONObjectOptJSONObject != null ? com.facebook.ads.redexgen.core.JU.A00(jSONObjectOptJSONObject) : null;
        java.lang.String strA017 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(68, 19, 95));
        com.facebook.ads.redexgen.core.EnumC03270j enumC03270jA00 = com.facebook.ads.redexgen.core.AbstractC03290l.A00(jSONObject);
        java.util.Collection<java.lang.String> collectionA03 = com.facebook.ads.redexgen.core.AbstractC03290l.A03(c1199Zs, jSONObject);
        java.lang.String strA018 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(560, 9, 10));
        long jOptLong = jSONObject.optLong(A02(536, 24, 82), -1L);
        if (A01[2].charAt(6) == 'o') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[1] = "3DgIwYJYxCZHaga7jdAdEfDBKsaQLEaY";
        strArr[0] = "PJjdxes2PDM40JhdCx";
        java.lang.String strA019 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A02(com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 9, 123));
        java.lang.String strA020 = A02(505, 22, 124);
        com.facebook.ads.redexgen.core.JZ jz = jSONObject.has(strA020) ? jSONObject.optBoolean(strA020) ? com.facebook.ads.redexgen.core.JZ.A05 : com.facebook.ads.redexgen.core.JZ.A04 : com.facebook.ads.redexgen.core.JZ.A03;
        java.lang.String strA021 = A02(org.objectweb.asm.Opcodes.ARRAYLENGTH, 29, 111);
        if (A01[2].charAt(6) != 'o') {
            A01[5] = "EiaN2GrSxKmld9dBg6rLOOlJPXBJhn44";
            zOptBoolean = jSONObject.optBoolean(strA021);
            iOptInt = jSONObject.optInt(A02(154, 36, 107), 100);
            arrayList = null;
        } else {
            zOptBoolean = jSONObject.optBoolean(strA021);
            iOptInt = jSONObject.optInt(A02(154, 36, 107), 100);
            arrayList = null;
        }
        try {
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A02(org.objectweb.asm.Opcodes.I2C, 8, 26));
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(length);
                for (int i3 = 0; i3 < length; i3++) {
                    try {
                        arrayList2.add(A01(c1199Zs, jSONArrayOptJSONArray.getJSONObject(i3), str, true, i3, length));
                    } catch (org.json.JSONException e) {
                        e = e;
                        arrayList = arrayList2;
                        c1199Zs.A07().AA0(A02(311, 7, 111), com.facebook.ads.redexgen.core.C8E.A2A, new com.facebook.ads.redexgen.core.C8F(e));
                        android.util.Log.e(com.facebook.ads.redexgen.core.C1358cU.A0E, A02(23, 30, 97), e);
                        return new com.facebook.ads.redexgen.core.C1346cI(strA017, strA01, strA03, strA04, strA05, strA06, strA07, strA08, strA09, strA010, strA011, strA012, strA013, strA014, strA015, juA02, c0688FlA02, juA00, juA01, jvA00, strA018, strA019, jOptLong, jz, z, i, i2, arrayList, str, strOptString, iOptInt2, strOptString2, uriA00, strA016, zOptBoolean2, zOptBoolean3, iOptInt4, iOptInt3, iOptInt5, iOptInt6, enumC03270jA00, collectionA03, iOptInt, zOptBoolean);
                    }
                }
                arrayList = arrayList2;
            }
        } catch (org.json.JSONException e2) {
            e = e2;
        }
        return new com.facebook.ads.redexgen.core.C1346cI(strA017, strA01, strA03, strA04, strA05, strA06, strA07, strA08, strA09, strA010, strA011, strA012, strA013, strA014, strA015, juA02, c0688FlA02, juA00, juA01, jvA00, strA018, strA019, jOptLong, jz, z, i, i2, arrayList, str, strOptString, iOptInt2, strOptString2, uriA00, strA016, zOptBoolean2, zOptBoolean3, iOptInt4, iOptInt3, iOptInt5, iOptInt6, enumC03270jA00, collectionA03, iOptInt, zOptBoolean);
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 105);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{26, 78, kotlin.io.encoding.Base64.padSymbol, 66, 62, 71, 60, 62, -7, 39, 62, 77, 80, 72, 75, 68, -7, 37, 72, 58, kotlin.io.encoding.Base64.padSymbol, 62, kotlin.io.encoding.Base64.padSymbol, 31, 56, 43, 44, 54, 47, -22, 62, 57, -22, 58, 43, 60, kotlin.io.encoding.Base64.padSymbol, 47, -22, 45, 43, 60, 57, okio.Utf8.REPLACEMENT_BYTE, kotlin.io.encoding.Base64.padSymbol, 47, 54, -22, 46, 43, 62, 43, -8, -24, -21, -26, -22, -17, -10, -16, -22, -20, -6, -26, -16, -22, -10, -11, 41, 44, 39, 43, 48, 55, 49, 43, 45, 59, 39, 52, 49, 54, 51, 39, kotlin.io.encoding.Base64.padSymbol, 58, 52, 45, 48, 43, 64, 62, 45, 58, okio.Utf8.REPLACEMENT_BYTE, 56, 45, 64, 53, 59, 58, -20, -17, 1, -16, -3, -1, -12, -2, -16, -3, -22, -7, -20, -8, -16, 52, 65, 50, okio.Utf8.REPLACEMENT_BYTE, 66, 58, 66, 50, 71, 76, 67, 56, 1, 14, 3, 24, -36, -38, -27, -27, -40, -19, -24, -40, -38, -36, -19, -30, -24, -25, -26, -28, -11, -14, -8, -10, -24, -17, 55, 67, 66, 72, 53, kotlin.io.encoding.Base64.padSymbol, 66, 57, 70, 51, 74, kotlin.io.encoding.Base64.padSymbol, 57, 75, 53, 54, kotlin.io.encoding.Base64.padSymbol, 64, kotlin.io.encoding.Base64.padSymbol, 72, 77, 51, 55, 60, 57, 55, okio.Utf8.REPLACEMENT_BYTE, 51, kotlin.io.encoding.Base64.padSymbol, 66, 72, 57, 70, 74, 53, 64, 59, 71, 70, 76, 57, 65, 70, kotlin.io.encoding.Base64.padSymbol, 74, 55, 78, 65, kotlin.io.encoding.Base64.padSymbol, 79, 57, 58, 65, 68, 65, 76, 81, 55, kotlin.io.encoding.Base64.padSymbol, 70, 57, 58, 68, kotlin.io.encoding.Base64.padSymbol, 60, 4, 13, 0, 1, 11, 4, -2, 18, 13, 0, 15, 18, 7, 14, 19, -2, 11, 14, 6, 14, 23, 10, 11, 21, 14, 8, 31, 18, 14, 32, 8, 21, 24, 16, -32, -23, -34, -19, -12, -21, -17, -32, -33, -38, -34, -21, -24, 3, -1, -2, 1, -4, 0, 12, 10, 10, -2, 11, 1, 52, 49, 45, 48, 56, 53, 58, 49, -8, -14, -2, -3, -34, -30, -42, -36, -38, 79, 76, 81, 78, 66, 71, 72, 86, 70, 85, 76, 83, 87, 76, 82, 81, 72, 57, 74, 75, 65, 70, okio.Utf8.REPLACEMENT_BYTE, -1, -16, 4, 2, -12, -18, 3, 1, -16, -3, 2, -5, -16, 3, -8, -2, -3, 75, 71, 60, 84, 58, 79, 77, 60, 73, 78, 71, 60, 79, 68, 74, 73, 86, 88, 85, 83, 85, 90, 75, 74, 69, 90, 88, 71, 84, 89, 82, 71, 90, 79, 85, 84, 35, 22, 34, 38, 22, 36, 37, 16, 26, 21, 2, -3, -16, -1, 2, -9, -2, 3, -18, -14, -2, -4, -1, 1, -12, 2, 2, -18, 0, 4, -16, -5, -8, 3, 8, 87, 82, 69, 84, 87, 76, 83, 88, 67, 80, 83, 75, 67, 72, 73, 80, 69, 93, 67, 87, 73, 71, 83, 82, 72, 58, 54, 42, 48, 40, 51, 38, 42, 54, 53, 59, 44, okio.Utf8.REPLACEMENT_BYTE, 59, -35, -38, -39, -40, -35, -39, -36, -49, -50, -55, -34, -36, -53, -40, -35, -42, -53, -34, -45, -39, -40, -7, -6, -25, -8, -27, -8, -25, -6, -17, -12, -19, 7, 9, -10, 8, -3, 8, 0, -7, -3, -14, -3, -11, -18, 7, 5, -9, -10, -15, 4, -9, 2, 1, 4, 6, -15, 7, 4, -2, 91, 78, 73, 74, 84, 68, 70, 90, 89, 84, 85, 81, 70, 94, 68, 74, 83, 70, 71, 81, 74, 73, 90, 77, 72, 73, 83, 67, 81, 84, 72, 49, 36, 31, 32, 42, 26, 43, 45, 32, 39, 42, 28, 31, 26, 46, 36, 53, 32, 26, 29, 52, 47, 32, 46, -23, -36, -41, -40, -30, -46, -24, -27, -33, 50, 37, 33, 51, 29, 30, 37, 40, 37, 48, 53, 27, 31, 36, 33, 31, 39, 27, 37, 42, 37, 48, 37, 29, 40, 27, 32, 33, 40, 29, 53, 43, 30, 26, 44, 22, 23, 30, 33, 30, 41, 46, 20, 24, 29, 26, 24, 32, 20, 30, 35, 41, 26, 39, 43, 22, 33};
    }

    static {
        A03();
    }

    public static com.facebook.ads.redexgen.core.C1346cI A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, org.json.JSONObject jSONObject, java.lang.String str) {
        return A01(c1199Zs, jSONObject, str, false, -1, 0);
    }
}
