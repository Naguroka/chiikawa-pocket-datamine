package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JU implements com.facebook.ads.internal.api.NativeAdImageApi {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"", "VJJRZ", "cZdb6ZeXWXZ9VUL9rLCw743uVGQUpxOO", "", "", "", "WdMLtMmdaAcYUdhsZ0J", "wLMa4MLdUcqpCAe5uR"};
    public final int A00;
    public final int A01;
    public final java.lang.String A02;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A04;
            if (strArr[0].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A04[7] = "EG8fSiCn7c4UcgqXgi";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            byte b = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 66);
            if (A04[7].length() != 18) {
                java.lang.String[] strArr2 = A04;
                strArr2[4] = "";
                strArr2[3] = "";
                bArrCopyOfRange[i4] = b;
                i4 += 0;
            } else {
                A04[7] = "dmTYix46cwH5S26Htz";
                bArrCopyOfRange[i4] = b;
                i4++;
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{118, 123, 119, 121, 118, 106, 124, 123, 101, 72, 86, 91, 75, 87};
    }

    static {
        A02();
    }

    public JU(java.lang.String str, int i, int i2) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public static com.facebook.ads.redexgen.core.JU A00(org.json.JSONObject jSONObject) {
        java.lang.String strOptString;
        if (jSONObject == null || (strOptString = jSONObject.optString(A01(6, 3, 75))) == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.JU(strOptString, jSONObject.optInt(A01(9, 5, 125), 0), jSONObject.optInt(A01(0, 6, 92), 0));
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final int getHeight() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final java.lang.String getUrl() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final int getWidth() {
        return this.A01;
    }
}
