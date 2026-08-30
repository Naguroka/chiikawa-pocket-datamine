package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KA {
    public static com.facebook.ads.redexgen.core.KA A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"1xbaBrS", "A5o8L0K", "NCBBTtQ91bL4qNkC9", "VOiFjhrLKrSiOl", "IzdWV2mN1IZOPy8q", "dzpcam", "yMP3JjbsUfzn40YA", "FhpQzKItQmfQ6pj5K9dUgRwf2x"};

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 36);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{118, 115, 72, 101, 114, 103, 120, 101, 99, 126, 121, 112, 72, 116, 120, 121, 113, 126, 112, 77, 72, 77, 92, 88, 73, 94, 24, 29, 10, 100, 107, 90, 115, 100, 105, 108, 97, 100, 113, 108, 106, 107, 90, 112, 112, 108, 97, 44, 46, 44, 39, 42, 105, 98, 107, 99, 100, 85, 122, 107, 120, 107, 103, 121, 39, 43, 32, 33, 122, 127, 106, 127, 16, 21, 0, 21, 59, 22, 30, 17, 23, 0, 84, 29, 7, 84, 26, 1, 24, 24, 108, 105, 124, 105, 87, 101, 103, 108, 109, 100, 87, 124, 113, 120, 109, 120, 121, 122, 117, 114, 117, 104, 117, 115, 114, 27, 12, 12, 17, 12, 27, 24, 28, 9, 8, 15, 24, 34, 30, 18, 19, 27, 20, 26, 75, 65, 76, 94, 69, 114, 78, 66, 67, 75, 68, 74, 89, 81, 71, 71, 85, 83, 81, 50, 46, 35, 33, 39, 47, 39, 44, 54, 49, 71, 80, 95, 107, 87, 85, 87, 92, 81, 125, 123, 104, 106, 98, 108, 123, 122, 116, 121, 112, 101};
    }

    static {
        A05();
        A00 = new com.facebook.ads.redexgen.core.KA();
    }

    public static synchronized com.facebook.ads.redexgen.core.KA A00() {
        return A00;
    }

    private com.facebook.ads.redexgen.core.Vu A01(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, org.json.JSONObject ad, long j) throws org.json.JSONException {
        org.json.JSONArray placements = ad.getJSONArray(A04(153, 10, 102));
        org.json.JSONObject jSONObject = placements.getJSONObject(0);
        com.facebook.ads.redexgen.core.C8X c8xA00 = com.facebook.ads.redexgen.core.C8X.A00(jSONObject.getJSONObject(A04(105, 10, 56)));
        java.lang.String adReportingConfig = jSONObject.optString(A04(120, 14, 89));
        java.lang.String strA04 = A04(47, 5, 107);
        java.lang.String str = null;
        java.lang.String flashConfig = jSONObject.has(strA04) ? jSONObject.optString(strA04) : null;
        java.lang.String strA05 = A04(org.objectweb.asm.Opcodes.IF_ICMPGT, 9, 16);
        java.lang.String strOptString = jSONObject.has(strA05) ? jSONObject.optString(strA05) : null;
        java.lang.String strOptString2 = jSONObject.optString(A04(0, 19, 51));
        java.lang.String strA06 = A04(134, 12, 9);
        java.lang.String cache = jSONObject.has(strA06) ? jSONObject.optString(strA06) : null;
        com.facebook.ads.redexgen.core.C8W c8w = new com.facebook.ads.redexgen.core.C8W(c8xA00, adReportingConfig, strOptString2, cache, flashConfig, strOptString);
        java.lang.String strA07 = A04(26, 3, 93);
        if (jSONObject.has(strA07)) {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(strA07);
            int i = 0;
            while (i < jSONArray.length()) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                com.facebook.ads.redexgen.core.JH.A06(c1199Zs, jSONObject2, j, str);
                java.lang.String strOptString3 = jSONObject2.optString(A04(19, 7, 8));
                java.lang.String strOptString4 = jSONObject2.optString(A04(90, 15, 44));
                org.json.JSONObject ad2 = jSONObject2.optJSONObject(A04(68, 4, 58));
                org.json.JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(A04(172, 8, 45));
                if (ad2 != null) {
                    c8w.A0F(new com.facebook.ads.redexgen.core.C8U(strOptString3, strOptString4, ad2, jSONArrayOptJSONArray));
                } else {
                    com.facebook.ads.redexgen.core.C0S c0sA0E = c1199Zs.A0E();
                    int errorCode = com.facebook.ads.internal.protocol.AdErrorType.UNKNOWN_ERROR.getErrorCode();
                    java.lang.String[] strArr = A02;
                    if (strArr[0].length() != strArr[1].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    A02[7] = "vhqatTRLHh1uNEmkPYajEb8nOj";
                    c0sA0E.A5F(errorCode, A04(72, 18, 80));
                }
                i++;
                str = null;
            }
        }
        java.lang.String strA08 = A04(52, 12, 46);
        if (jSONObject.has(strA08)) {
            c8w.A0G(jSONObject.getJSONObject(strA08));
        }
        java.lang.String anValidationUuid = ad.optString(A04(29, 18, 33));
        return new com.facebook.ads.redexgen.core.Vu(c8w, anValidationUuid);
    }

    private com.facebook.ads.redexgen.core.C1100Vt A02(org.json.JSONObject jSONObject) {
        return new com.facebook.ads.redexgen.core.C1100Vt(jSONObject.optString(A04(org.objectweb.asm.Opcodes.I2C, 7, 16), A04(0, 0, 92)), jSONObject.optInt(A04(64, 4, 96), 0), null);
    }

    private com.facebook.ads.redexgen.core.C1100Vt A03(org.json.JSONObject jSONObject) {
        java.lang.String strA04 = A04(org.objectweb.asm.Opcodes.IF_ICMPGT, 9, 16);
        java.lang.String strA05 = A04(47, 5, 107);
        try {
            org.json.JSONObject placement = jSONObject.getJSONArray(A04(153, 10, 102)).getJSONObject(0);
            com.facebook.ads.redexgen.core.C8X placementDefinition = com.facebook.ads.redexgen.core.C8X.A00(placement.getJSONObject(A04(105, 10, 56)));
            java.lang.String featureConfig = placement.optString(A04(120, 14, 89));
            java.lang.String cache = placement.has(strA05) ? placement.optString(strA05) : null;
            java.lang.String sdkManagedCache = placement.has(strA04) ? placement.optString(strA04) : null;
            java.lang.String adReportingConfig = placement.optString(A04(0, 19, 51));
            return new com.facebook.ads.redexgen.core.C1100Vt(jSONObject.optString(A04(org.objectweb.asm.Opcodes.I2C, 7, 16), A04(0, 0, 92)), jSONObject.optInt(A04(64, 4, 96), 0), new com.facebook.ads.redexgen.core.C8W(placementDefinition, featureConfig, adReportingConfig, null, cache, sdkManagedCache));
        } catch (org.json.JSONException unused) {
            return A02(jSONObject);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x0028  */
    public final com.facebook.ads.redexgen.core.KC A06(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, long j) throws org.json.JSONException {
        byte b;
        if (!android.text.TextUtils.isEmpty(str)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String strOptString = jSONObject.optString(A04(org.objectweb.asm.Opcodes.GETFIELD, 4, 36));
            int iHashCode = strOptString.hashCode();
            java.lang.String strA04 = A04(115, 5, 90);
            switch (iHashCode) {
                case 96432:
                    if (!strOptString.equals(A04(26, 3, 93))) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 96784904:
                    if (!strOptString.equals(strA04)) {
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
                    return A01(c1199Zs, jSONObject, j);
                case 1:
                    return A03(jSONObject);
                default:
                    org.json.JSONObject jsonResponse = jSONObject.optJSONObject(strA04);
                    if (jsonResponse != null) {
                        return A02(jsonResponse);
                    }
                    break;
            }
        }
        return new com.facebook.ads.redexgen.core.KC(com.facebook.ads.redexgen.core.KB.A04);
    }
}
