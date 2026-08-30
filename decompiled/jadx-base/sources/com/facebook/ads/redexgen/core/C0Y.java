package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0Y {
    public static byte[] A02;
    public final com.facebook.ads.redexgen.core.C0Z A00;
    public final java.lang.String A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 50);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{55, 36, okio.Utf8.REPLACEMENT_BYTE, okio.Utf8.REPLACEMENT_BYTE, 52, kotlin.io.encoding.Base64.padSymbol, 14};
    }

    public C0Y(com.facebook.ads.redexgen.core.C0Z c0z, java.lang.String str) {
        this.A00 = c0z;
        this.A01 = str;
    }

    public final void A02(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put(A00(0, 7, 99) + this.A00.getName(), this.A01);
        } catch (org.json.JSONException unused) {
        }
    }
}
