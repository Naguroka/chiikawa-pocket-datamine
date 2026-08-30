package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class LV {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"k0KWJrtOeyRtx2YSOmZ2S9sZBWRzRtzR", "FhSJWxdRwKLMP9JOn6q1b2qMo", "vd4", "prNs3YfRmQWdH9Q7PHydrBddu2xVDtuC", "TQMlXyI0yqbHfDCacucNcvBBb28", "i9ckL4hGn3OwY3VfnpnVreAjs5dC9GVS", "Iva6FryQGZnTk8EX70gQNR0ykk5ruyon", ""};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 125);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{9, 18, 11, 11};
    }

    static {
        A05();
    }

    public static java.lang.String A01(java.util.Map<java.lang.String, java.lang.String> map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (map != null) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                if (A01[7].length() != 0) {
                    throw new java.lang.RuntimeException();
                }
                A01[6] = "jcZWkwS564qIWYGPRhtwMiRcu2uJOsmN";
                if (zHasNext) {
                    java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
                    try {
                        jSONObject.put(next.getKey(), next.getValue());
                    } catch (org.json.JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return jSONObject.toString();
    }

    public static java.lang.String A02(org.json.JSONObject jSONObject, java.lang.String str) {
        return A03(jSONObject, str, null);
    }

    public static java.lang.String A03(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        java.lang.String strOptString = jSONObject.optString(str, str2);
        java.lang.String value = A00(0, 4, 26);
        if (value.equals(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public static java.util.List<java.lang.String> A04(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            java.lang.String strOptString = jSONArray.optString(i);
            if (!android.text.TextUtils.isEmpty(strOptString)) {
                arrayList.add(strOptString);
            }
        }
        return arrayList;
    }
}
