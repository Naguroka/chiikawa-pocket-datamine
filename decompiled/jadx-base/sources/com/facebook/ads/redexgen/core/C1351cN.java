package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1351cN implements com.facebook.ads.redexgen.core.InterfaceC03280k {
    public static byte[] A08;
    public final com.facebook.ads.redexgen.core.EnumC03270j A00;
    public final java.lang.String A01;
    public final java.lang.String A02;
    public final java.lang.String A03;
    public final java.lang.String A04;
    public final java.lang.String A05;
    public final java.util.Collection<java.lang.String> A06;
    public final java.util.Map<java.lang.String, java.lang.String> A07;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.C1351cN A00(com.facebook.ads.redexgen.core.C0669Ei c0669Ei, org.json.JSONObject jSONObject) {
        java.lang.String strOptString = jSONObject.optString(A01(33, 6, 120));
        java.lang.String strOptString2 = jSONObject.optString(A01(0, 18, 118));
        java.lang.String strOptString3 = jSONObject.optString(A01(47, 10, 52));
        java.lang.String strA02 = com.facebook.ads.redexgen.core.LV.A02(jSONObject, A01(18, 2, 83));
        com.facebook.ads.redexgen.core.EnumC03270j enumC03270jA00 = com.facebook.ads.redexgen.core.AbstractC03290l.A00(jSONObject);
        java.util.Collection<java.lang.String> collectionA03 = com.facebook.ads.redexgen.core.AbstractC03290l.A03(c0669Ei, jSONObject);
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(39, 8, 66));
        java.util.HashMap map = new java.util.HashMap();
        if (jSONObjectOptJSONObject != null) {
            java.util.Iterator<java.lang.String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject.optString(next));
            }
        }
        return new com.facebook.ads.redexgen.core.C1351cN(strOptString, strOptString2, enumC03270jA00, collectionA03, map, strOptString3, strA02, com.facebook.ads.redexgen.core.LV.A02(jSONObject, A01(20, 13, 89)));
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 119);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{78, 80, 97, 86, 99, 78, 97, 86, 92, 91, 76, 80, 92, 90, 90, 78, 91, 81, 45, 62, 53, 62, 51, 66, 73, 64, 68, 53, 52, 47, 51, 64, kotlin.io.encoding.Base64.padSymbol, 92, 80, 97, 90, 100, 95, 38, 30, 45, 26, 29, 26, 45, 26, 29, 16, 28, 32, 16, 30, 31, 10, 20, 15};
    }

    public C1351cN(java.lang.String str, java.lang.String str2, com.facebook.ads.redexgen.core.EnumC03270j enumC03270j, java.util.Collection<java.lang.String> detectionStrings, java.util.Map<java.lang.String, java.lang.String> metadata, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = enumC03270j;
        this.A06 = detectionStrings;
        this.A07 = metadata;
        this.A05 = str3;
        this.A02 = str4;
        this.A03 = str5;
    }

    public final java.lang.String A03() {
        return this.A01;
    }

    public final java.lang.String A04() {
        return this.A04;
    }

    public final java.lang.String A05() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03280k
    public final java.lang.String A6r() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03280k
    public final java.util.Collection<java.lang.String> A7B() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03280k
    public final com.facebook.ads.redexgen.core.EnumC03270j A7c() {
        return this.A00;
    }
}
