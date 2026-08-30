package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WT extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"Cp4y0jGzgjmlhNOtolFVOVefspLcmrKL", "5GK8sLOcHtszB", "AOLPTOXU9sJ8f7mkW5imzLW9uvMXwnIa", "cYEf6saXY9z3veQOBiLayO", "AetyrNGNYAsiijDpUFLgJdlj31dZpeYf", "GwgqZOf2k60xdBESFLM8urtE7U9bH", "vGNTznilo2MQ1OpS5sYGGd", "eyCkGrJdBkkJqznMzmMtN6FzCpyOGqXF"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7j A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[4].charAt(20) == '2') {
                throw new java.lang.RuntimeException();
            }
            A02[5] = "yU9Q3i2imseGifaShK33hUjg5wmSv";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 100);
            i4++;
        }
    }

    public static void A02() {
        A01 = new byte[]{4, 16, 14, -49, 7, 2, 4, 6, 3, 16, 16, 12, -49, 2, 5, 20, -49, -19, -16, -28, -30, -19, 0, -28, -16, -10, -17, -11, -26, -13, -12, -2, 1, -11, -13, -2, -15, -11, 1, 7, 0, 6, -9, 4, 5, -13, -21, -25, -7, -5, -8, -21, -22, -27, -7, -21, -7, -7, -17, -11, -12, -27, -17, -22, 67, 59, 55, 73, 75, 72, 59, 58, 53, 73, 59, 73, 73, okio.Utf8.REPLACEMENT_BYTE, 69, 68, 53, 74, okio.Utf8.REPLACEMENT_BYTE, 67, 59};
    }

    static {
        A02();
    }

    public WT(com.facebook.ads.redexgen.core.C7j c7j) {
        this.A00 = c7j;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        android.content.SharedPreferences sharedPreferences = null;
        try {
            sharedPreferences = this.A00.getApplicationContext().getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A00(0, 31, 61), this.A00), 0);
            java.util.Map<java.lang.String, ?> all = sharedPreferences.getAll();
            if (all.size() > 1) {
                com.facebook.ads.redexgen.core.JI.A06(this.A00, com.facebook.ads.redexgen.core.S8.A00(this.A00), all);
            }
            sharedPreferences.edit().clear().apply();
            sharedPreferences.edit().putString(A00(45, 19, 34), this.A00.A08().A02()).putString(A00(64, 21, 114), com.facebook.ads.redexgen.core.C0841Lu.A02(this.A00.A08().A01())).apply();
        } catch (org.json.JSONException e) {
            this.A00.A07().AA0(A00(31, 14, 46), com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_SUCCESS, new com.facebook.ads.redexgen.core.C8F(e));
            sharedPreferences.edit().clear().apply();
        }
        synchronized (com.facebook.ads.redexgen.core.JI.class) {
            android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            for (java.util.Map.Entry entry : com.facebook.ads.redexgen.core.JI.A02.entrySet()) {
                editorEdit.putInt((java.lang.String) entry.getKey(), ((java.lang.Integer) entry.getValue()).intValue());
            }
            editorEdit.apply();
            com.facebook.ads.redexgen.core.JI.A03.set(2);
        }
    }
}
