package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1209a2 implements com.facebook.ads.redexgen.core.C6C {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"frztuTbk90jgHBlm3zQJyLa", "1t5yWCu7Rr8GJSKN0jLr3suU4yLwpLao", "qy8Ulx", "lpakeOCplwfUbPlWH1mKRjN93sjJNeLK", "9U38xP8piwyhajLb0oPtN8g0SrDQbMul", "5doBkCOudtbbit2jQfjyLRk0HEXNCLN", "an6q6r3Pxi3Yd1Uxl34WEMAekK7mvAv", "C2viYzQ805EsgOX4y3n8lLHcCQmdv4Bq"};
    public final com.facebook.ads.redexgen.core.C6D A00;
    public final java.lang.String A01;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A03;
            if (strArr[7].charAt(16) == strArr[3].charAt(16)) {
                throw new java.lang.RuntimeException();
            }
            A03[1] = "szQ1vN1s54Hk3y1OQ1NRUBnkClWieIjw";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 62);
            i4++;
        }
    }

    public static void A02() {
        A02 = new byte[]{-1, 4, -5, -16, -69, -72, -78};
    }

    static {
        A02();
    }

    public C1209a2(com.facebook.ads.redexgen.core.C6D c6d, java.lang.String str) {
        this.A00 = c6d;
        this.A01 = str;
    }

    public static com.facebook.ads.redexgen.core.C1209a2 A00(org.json.JSONObject jSONObject) {
        com.facebook.ads.redexgen.core.C6D c6dA00 = com.facebook.ads.redexgen.core.C6D.A00(jSONObject.optString(A01(0, 4, 77)));
        java.lang.String url = jSONObject.optString(A01(4, 3, 8));
        if (c6dA00 == null || url == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C1209a2(c6dA00, url);
    }

    @Override // com.facebook.ads.redexgen.core.C6C
    public final com.facebook.ads.redexgen.core.C6D A8b() {
        return this.A00;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            java.lang.Class<?> cls = getClass();
            if (A03[1].charAt(30) == 'F') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A03;
            strArr[6] = "4HA6u4Nz4keiLa8sOcHfyEhD3wtH4bT";
            strArr[5] = "zctnvSkfK8HVemf9ezG6OofbW6HL5VM";
            if (cls == obj.getClass()) {
                com.facebook.ads.redexgen.core.C1209a2 c1209a2 = (com.facebook.ads.redexgen.core.C1209a2) obj;
                if (this.A00 != c1209a2.A00) {
                    return false;
                }
                return this.A01.equals(c1209a2.A01);
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.C6C
    public final java.lang.String getUrl() {
        return this.A01;
    }

    public final int hashCode() {
        int result = this.A00.hashCode();
        int i = result * 31;
        int result2 = this.A01.hashCode();
        return i + result2;
    }
}
