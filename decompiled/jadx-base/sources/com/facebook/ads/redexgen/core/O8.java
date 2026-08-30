package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class O8 {
    public static byte[] A01;
    public final java.util.Map<java.lang.String, java.lang.String> A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 55);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-25, -6, -10, -12, -29, -31, -22, -21, -16, -10, -11, -37, -42, -36, -54, -49};
    }

    public O8() {
        this.A00 = new java.util.HashMap();
    }

    public O8(java.util.Map<java.lang.String, java.lang.String> extraData) {
        this.A00 = extraData;
    }

    public final com.facebook.ads.redexgen.core.O8 A02(com.facebook.ads.redexgen.core.C0842Lv c0842Lv) {
        if (c0842Lv != null) {
            this.A00.put(A00(11, 5, 48), com.facebook.ads.redexgen.core.LV.A01(c0842Lv.A04()));
        }
        return this;
    }

    public final com.facebook.ads.redexgen.core.O8 A03(com.facebook.ads.redexgen.core.C0987Rk c0987Rk) {
        if (c0987Rk != null) {
            this.A00.putAll(c0987Rk.A0S());
        }
        return this;
    }

    public final com.facebook.ads.redexgen.core.O8 A04(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.A00.put(A00(0, 11, 75), str);
        }
        return this;
    }

    public final java.util.Map<java.lang.String, java.lang.String> A05() {
        return this.A00;
    }
}
