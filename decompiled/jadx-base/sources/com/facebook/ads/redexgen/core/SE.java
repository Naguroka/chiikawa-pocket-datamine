package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class SE {
    public static java.lang.String[] A00 = {"GvbI", "ZazQ", "jGVKLNF9IyZZC6yZD7vUdND", "cIibDuYBy4iZiWhBa7aDKVcHYQepg0dA", "kp8Ba6lLXDz7KYAXK4DvfF3NzckJKvFL", "SSvAaaHsDdE6RjWizyVCXkVcp0DozyD6", "SP8di31m2uLOcP53jnkdZfwtPUUyGlI0", "zoV6YIxZR0JxBorwnPIpT"};

    public static boolean A00(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2) {
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i = 0; i < i; i++) {
            com.facebook.ads.redexgen.core.SD t1 = com.facebook.ads.redexgen.core.SD.A00(jSONArray, i);
            if (t1 != com.facebook.ads.redexgen.core.SD.A00(jSONArray2, i) || !t1.A06(jSONArray, jSONArray2, i)) {
                return false;
            }
        }
        java.lang.String[] strArr = A00;
        if (strArr[5].charAt(10) == strArr[6].charAt(10)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A00;
        strArr2[7] = "kAUv4Go12E5I6bj9gVym2";
        strArr2[2] = "RoQebNbND8hZkGW6Dl9KhdG";
        return true;
    }

    public static boolean A02(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        com.facebook.ads.redexgen.core.SD sdA01;
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            if (A00[3].charAt(27) != 'p') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A00;
            strArr[1] = "ADTX";
            strArr[0] = "wJhB";
            java.lang.String str = next;
            if (!jSONObject2.has(str) || (sdA01 = com.facebook.ads.redexgen.core.SD.A01(jSONObject, str)) != com.facebook.ads.redexgen.core.SD.A01(jSONObject2, str) || !sdA01.A08(jSONObject, jSONObject2, str)) {
                return false;
            }
        }
        java.lang.String[] strArr2 = A00;
        java.lang.String key = strArr2[7];
        if (key.length() == strArr2[2].length()) {
            throw new java.lang.RuntimeException();
        }
        A00[4] = "f4NlNCElPjJB5pPYNhX2WTR6iFmKnfGM";
        return true;
    }
}
