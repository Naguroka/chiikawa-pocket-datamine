package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03380v {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"yonrCQ0uoeCYCSmT5ejKLJLtf9VOp321", "NDuBqnzzJqzb1WeHMragxAHoyIt26Von", "hWL4zdMk8yywijkAtqHNVn2pZmfj34f9", "9i7qyia1evnFwuCuocWilq3mxIKRQ8Gt", "sdkV7vC", "3a", "fP", "wcot"};
    public final java.util.LinkedHashSet<java.lang.String> A01 = new java.util.LinkedHashSet<>();
    public org.json.JSONObject A00 = new org.json.JSONObject();
    public final java.util.concurrent.atomic.AtomicReference<java.lang.String> A02 = new java.util.concurrent.atomic.AtomicReference<>(A01(0, 2, 32));

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-67, -65, -63, -65, -50, -3, 6, -5, 10, 17, 8, 12, -3, -4, -9, -7, -4, -9, 1, -4, -9, 7, 10, 1, -1, 1, 6, -7, 4, -19, -10, -21, -6, 1, -8, -4, -19, -20, -25, -15, -20, 25, 13, 36, 11, 15, 13, 28, 28, 17, 16, 11, 13, 30, 30, 13, 37, 11, 24, 17, 26, 19, 32, 20, 47, 35, 35, 53, 50, 50, 37, 46, 35, 37, 51, -1, -12, 1, -8, -2, -13, 37, 28, 34, 33, 12, 28, 16, 16, 34, 31, 31, 18, 27, 16, 18, 12, 32, 18, 16, 32, 30, 21, 27, 26, 5, 22, 11, 24, 15, 21, 10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0A(java.lang.String str) throws org.json.JSONException, com.facebook.ads.redexgen.core.C8F {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                this.A00 = new org.json.JSONObject(str);
                java.util.HashMap map = new java.util.HashMap();
                java.util.Iterator<java.lang.String> itKeys = this.A00.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    if (this.A00.get(next) instanceof java.lang.String) {
                        map.put(next, A00(next, new org.json.JSONObject((java.lang.String) this.A00.get(next))));
                    }
                }
                for (java.util.Map.Entry entry : map.entrySet()) {
                    this.A00.put((java.lang.String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    static {
        A02();
    }

    private final synchronized com.facebook.ads.redexgen.core.C1S A00(java.lang.String str, org.json.JSONObject jSONObject) throws org.json.JSONException, com.facebook.ads.redexgen.core.C8F {
        com.facebook.ads.redexgen.core.C1S frequencyCappingData;
        if (str.equals(jSONObject.optString(A01(29, 12, 70), null))) {
            frequencyCappingData = new com.facebook.ads.redexgen.core.C1S(str);
            A03(frequencyCappingData, jSONObject);
        } else {
            com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(new java.lang.IllegalArgumentException());
            jSONObject.put(A01(5, 24, 86), str);
            c8f.A07(jSONObject);
            c8f.A05(1);
            throw c8f;
        }
        return frequencyCappingData;
    }

    private void A03(com.facebook.ads.redexgen.core.C1S c1s, org.json.JSONObject jSONObject) throws org.json.JSONException {
        int iOptInt = jSONObject.optInt(A01(75, 6, 77));
        int iOptInt2 = jSONObject.optInt(A01(101, 11, 100));
        int maxCappedArrayLength = jSONObject.optInt(A01(41, 23, 106), 50);
        long jOptLong = jSONObject.optLong(A01(2, 3, 28));
        java.lang.String strA01 = A01(64, 11, 126);
        if (jSONObject.has(strA01)) {
            c1s.A06((org.json.JSONArray) jSONObject.get(strA01));
        }
        java.lang.String strA02 = A01(81, 20, 107);
        if (jSONObject.has(strA02)) {
            int cappingTimeSecs = jSONObject.optInt(strA02);
            c1s.A04(cappingTimeSecs);
        }
        c1s.A05(iOptInt, iOptInt2, jOptLong, maxCappedArrayLength);
    }

    public final java.lang.String A04() {
        java.lang.String list = this.A02.get();
        if (list != null) {
            return list;
        }
        if (A04[0].charAt(21) != 'J') {
            throw new java.lang.RuntimeException();
        }
        A04[7] = "Yd8WV87KlA8AS9IbyfadEkj";
        return A01(0, 2, 32);
    }

    public final synchronized org.json.JSONObject A05() {
        return this.A00;
    }

    public final synchronized void A06() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<java.lang.String> it = this.A01.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        this.A02.set(jSONArray.toString());
    }

    public final synchronized void A07(java.lang.String str) {
        if (this.A01.size() >= com.facebook.ads.redexgen.core.C1S.A00()) {
            java.util.Iterator<java.lang.String> it = this.A01.iterator();
            if (it.hasNext()) {
                this.A01.remove(it.next());
            }
        }
        this.A01.add(str);
        com.facebook.ads.redexgen.core.C6W.A03();
    }

    public final synchronized void A08(java.lang.String str) throws org.json.JSONException {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                for (int i = 0; i < jSONArray.length() && i < com.facebook.ads.redexgen.core.C1S.A00(); i++) {
                    this.A01.add(jSONArray.getString(i));
                }
            }
        }
    }

    public final synchronized void A09(java.lang.String str) {
        this.A01.remove(str);
        com.facebook.ads.redexgen.core.C6W.A03();
    }

    public final synchronized void A0B(org.json.JSONObject jSONObject) throws org.json.JSONException {
        com.facebook.ads.redexgen.core.C1S frequencyCappingData;
        java.lang.String strOptString = jSONObject.optString(A01(29, 12, 70), null);
        if (strOptString == null) {
            return;
        }
        if (this.A00.has(strOptString) && (this.A00.get(strOptString) instanceof com.facebook.ads.redexgen.core.C1S)) {
            frequencyCappingData = (com.facebook.ads.redexgen.core.C1S) this.A00.get(strOptString);
        } else {
            frequencyCappingData = new com.facebook.ads.redexgen.core.C1S(strOptString);
        }
        A03(frequencyCappingData, jSONObject);
        this.A00.put(strOptString, frequencyCappingData);
    }
}
