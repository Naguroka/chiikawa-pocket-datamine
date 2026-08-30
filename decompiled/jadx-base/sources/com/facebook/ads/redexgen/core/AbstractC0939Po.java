package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Po, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0939Po {
    public static byte[] A00;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.C0938Pn A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.JF jf, com.facebook.ads.redexgen.core.PO po, boolean z) {
        boolean z2;
        java.lang.String strA0R;
        boolean z3 = z;
        java.lang.String strA01 = A01(101, 3, 41);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.String strOptString = jSONObject.optString(A01(51, 26, 104));
        arrayList3.add(strOptString);
        if (z3) {
            strA0R = c04766f.A0R(strOptString);
            if (strOptString.equals(strA0R)) {
                z3 = false;
                z2 = false;
            } else {
                z2 = z3;
            }
        } else {
            z2 = z3;
            strA0R = strOptString;
        }
        jf.A04(com.facebook.ads.redexgen.core.JE.A0P, null);
        try {
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(92, 4, 49));
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optString(strA01) != null) {
                arrayList.add(jSONObjectOptJSONObject.optString(strA01));
                if (z2) {
                    jSONObjectOptJSONObject.put(strA01, c04766f.A0Q(jSONObjectOptJSONObject.optString(strA01)));
                }
            }
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A01(77, 15, 113));
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    java.lang.String strOptString2 = jSONArrayOptJSONArray.optString(i);
                    arrayList.add(strOptString2);
                    if (z2) {
                        jSONArrayOptJSONArray.put(i, c04766f.A0Q(strOptString2));
                    }
                }
            }
            org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(A01(43, 8, 37));
            if (jSONArrayOptJSONArray2 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    A03(arrayList, arrayList2, jSONArrayOptJSONArray2.optJSONObject(i2), c04766f, z2);
                }
            } else {
                A03(arrayList, arrayList2, jSONObject, c04766f, z2);
            }
        } catch (org.json.JSONException unused) {
            po.A04(com.facebook.ads.redexgen.core.C8E.A15, A01(0, 43, 35));
        }
        return new com.facebook.ads.redexgen.core.C0938Pn(jSONObject, strA0R, arrayList, arrayList2, arrayList3, z3);
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 65);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-87, -42, -42, -45, -42, -124, -40, -42, -59, -46, -41, -54, -45, -42, -47, -51, -46, -53, -124, -82, -73, -77, -78, -124, -51, -46, -124, -39, -44, -56, -59, -40, -55, -89, -59, -57, -52, -55, -56, -71, -42, -48, -41, -55, -57, -40, -43, -37, -39, -53, -46, 13, 34, 23, 10, 22, 18, 12, 8, 28, 13, 20, 8, 21, 10, 34, 14, 27, 8, 17, 29, 22, 21, 8, 30, 27, 21, 23, 32, 22, 17, 21, 19, 36, 22, 17, 27, 31, 19, 25, 23, 37, -37, -43, -31, -32, -35, -31, -43, -37, -39, -33, -36, -42, -32, -45, -50, -49, -39, -55, -33, -36, -42};
    }

    public static void A03(java.util.ArrayList<java.lang.String> imageUrls, java.util.ArrayList<java.lang.String> videoUrls, org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C04766f c04766f, boolean z) throws org.json.JSONException {
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(96, 5, 51));
        if (jSONObjectOptJSONObject != null) {
            java.lang.String strA01 = A01(101, 3, 41);
            if (jSONObjectOptJSONObject.optString(strA01) != null) {
                java.lang.String strOptString = jSONObjectOptJSONObject.optString(strA01);
                imageUrls.add(strOptString);
                if (z) {
                    jSONObjectOptJSONObject.put(strA01, c04766f.A0Q(strOptString));
                }
            }
        }
        java.lang.String strA02 = A01(104, 9, 41);
        if (!android.text.TextUtils.isEmpty(jSONObject.optString(strA02))) {
            java.lang.String strOptString2 = jSONObject.optString(strA02);
            videoUrls.add(strOptString2);
            if (z) {
                jSONObject.put(strA02, c04766f.A0R(strOptString2));
            }
        }
    }
}
