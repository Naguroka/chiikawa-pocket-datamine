package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0933Pi implements java.lang.Runnable {
    public static byte[] A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0937Pm A00;
    public final /* synthetic */ java.lang.String A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 97);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{13, 33, 59, 34, 42, 110, 32, 33, 58, 110, 62, 47, 60, kotlin.io.encoding.Base64.padSymbol, 43, 110, kotlin.io.encoding.Base64.padSymbol, 43, 60, 56, 43, 60, 110, 35, 43, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 47, 41, 43, 72, 127, 127, 98, 127, 45, 125, 108, 127, 126, 100, 99, 106, 45, 71, 94, 66, 67, 45, 100, 99, 45, 125, 98, 126, 121, 64, 104, 126, 126, 108, 106, 104, 45, 87, 67, 66, 94, 125, 83, 79, 53, 40, 36, 34, 49, 15, 52, 49, 36, 49, 14, 3, 10, 31, 58, 60};
    }

    public RunnableC0933Pi(com.facebook.ads.redexgen.core.C0937Pm c0937Pm, java.lang.String str) {
        this.A00 = c0937Pm;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.A01);
                if (this.A00.A05.equals(jSONObject.optString(A00(64, 7, 87)))) {
                    this.A00.A0C(com.facebook.ads.redexgen.core.EnumC0935Pk.A00(jSONObject.optString(A00(81, 4, 27))), jSONObject.optString(A00(71, 10, 49), A00(85, 2, 32)));
                } else {
                    this.A00.A04.A04(com.facebook.ads.redexgen.core.C8E.A11, A00(0, 30, 47));
                }
            } catch (org.json.JSONException e) {
                this.A00.A04.A04(com.facebook.ads.redexgen.core.C8E.A15, A00(30, 34, 108) + e.getMessage());
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
