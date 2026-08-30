package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PO {
    public static byte[] A03;
    public final int A00;
    public final java.lang.String A01;
    public final java.lang.String A02;

    static {
        A03();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 76);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-88, -73, -80, -80, -45, -53, -53, -55, -42, -74, -49, -62, -61, -51, -58, -127, -43, -48, -127, -60, -45, -58, -62, -43, -58, -127, -62, -59, -59, -54, -43, -54, -48, -49, -62, -51, -86, -49, -57, -48, -28, -25, -30, -26, -11, -24, -28, -9, -20, -7, -24, -30, -9, -4, -13, -24, -44, -41, -46, -39, -30, -27, -32, -44, -25, -46, -25, -20, -29, -40, 16, 19, 14, 33, 20, 32, 36, 20, 34, 35, 14, 24, 19, -26, -11, -18, -39, -35, -47, -41, -43, -6, -19, -24, -23, -13};
    }

    public PO(java.lang.String str, java.lang.String str2, int i) {
        java.lang.String strA01;
        this.A02 = str;
        this.A00 = i;
        if (!android.text.TextUtils.isEmpty(str2)) {
            strA01 = A01(91, 5, 56);
        } else {
            strA01 = A01(86, 5, 36);
        }
        this.A01 = strA01;
    }

    private com.facebook.ads.redexgen.core.C8F A00(java.lang.String str) {
        com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(str);
        c8f.A07(A02());
        c8f.A05(1);
        return c8f;
    }

    private org.json.JSONObject A02() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(A01(56, 14, 39), this.A00);
            jSONObject.put(A01(70, 13, 99), this.A02);
            jSONObject.put(A01(40, 16, 55), this.A01);
        } catch (org.json.JSONException e) {
            android.util.Log.w(A01(0, 9, 24), A01(9, 31, 21), e);
        }
        return jSONObject;
    }

    public final void A04(int i, java.lang.String str) {
        com.facebook.ads.redexgen.core.C1198Zr sdkContext = com.facebook.ads.redexgen.core.AbstractC04997i.A00();
        if (sdkContext != null) {
            sdkContext.A07().AA0(A01(83, 3, 54), i, A00(str));
        }
    }
}
