package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8U, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8U {
    public static byte[] A04;
    public final java.lang.String A00;
    public final java.lang.String A01;
    public final java.util.Map<com.facebook.ads.redexgen.core.C8Y, java.util.List<java.lang.String>> A02 = new java.util.HashMap();
    public final org.json.JSONObject A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 6);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{81, 92, 85, 64, 113, 118, 104};
    }

    public C8U(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, org.json.JSONArray jSONArray) {
        java.util.List<java.lang.String> list;
        this.A00 = str;
        this.A01 = str2;
        this.A03 = jSONObject;
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (com.facebook.ads.redexgen.core.C8Y c8y : com.facebook.ads.redexgen.core.C8Y.values()) {
            this.A02.put(c8y, new java.util.LinkedList());
        }
        for (int i = 0; i < i; i++) {
            try {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                java.lang.String trackerUrl = jSONObject2.getString(A00(0, 4, 35));
                java.lang.String trackerTypeStr = jSONObject2.getString(A00(4, 3, 2));
                com.facebook.ads.redexgen.core.C8Y c8yValueOf = com.facebook.ads.redexgen.core.C8Y.valueOf(trackerUrl.toUpperCase(java.util.Locale.US));
                if (!android.text.TextUtils.isEmpty(trackerTypeStr) && (list = this.A02.get(c8yValueOf)) != null) {
                    list.add(trackerTypeStr);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public final java.lang.String A02() {
        return this.A00;
    }

    public final java.util.List<java.lang.String> A03(com.facebook.ads.redexgen.core.C8Y c8y) {
        return this.A02.get(c8y);
    }

    public final org.json.JSONObject A04() {
        return this.A03;
    }
}
