package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C1N {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 78);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{24, 26, 9, 20, 14, 8, 30, 23, 100, 117, 102, 103, 125, 122, 115, 85, 74, 71, 70, 76, 124, 86, 81, 79};
    }

    public static java.util.List<com.facebook.ads.redexgen.core.C1F> A01(org.json.JSONArray jSONArray, org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1R c1r) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (i == 0) {
                    A03(jSONObject2, jSONObject);
                }
                com.facebook.ads.redexgen.core.C1F c1fA00 = com.facebook.ads.redexgen.core.C1F.A00(jSONObject2);
                c1r.A3j(c1fA00, jSONObject2);
                arrayList.add(c1fA00);
            } catch (org.json.JSONException e) {
                c1199Zs.A07().AA0(A00(8, 7, 90), com.facebook.ads.redexgen.core.C8E.A2B, new com.facebook.ads.redexgen.core.C8F(e));
            }
        }
        return arrayList;
    }

    public static void A03(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) throws org.json.JSONException {
        java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            if (!next.equals(A00(15, 9, 109)) && !next.equals(A00(0, 8, 53)) && !jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
    }
}
