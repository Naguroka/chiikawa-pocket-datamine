package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1375cl extends com.facebook.ads.redexgen.core.AbstractC03250h {
    public static byte[] A02;
    public static final java.lang.String A03;
    public final android.net.Uri A00;
    public final java.util.Map<java.lang.String, java.lang.String> A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 87);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{52, 54, 45, 51, 54, 45, 56, kotlin.io.encoding.Base64.padSymbol, -32, -27, -36, -47};
    }

    static {
        A01();
        A03 = com.facebook.ads.redexgen.core.C1375cl.class.getSimpleName();
    }

    public C1375cl(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> mExtraData) {
        super(c1199Zs, j7, str);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03250h
    public final com.facebook.ads.redexgen.core.EnumC03240g A0C() {
        com.facebook.ads.redexgen.core.J9 j9 = com.facebook.ads.redexgen.core.J9.A05;
        java.lang.String queryParameter = this.A00.getQueryParameter(A00(0, 8, 109));
        if (!android.text.TextUtils.isEmpty(queryParameter)) {
            try {
                j9 = com.facebook.ads.redexgen.core.J9.values()[java.lang.Integer.valueOf(queryParameter).intValue()];
            } catch (java.lang.Exception unused) {
            }
        }
        super.A01.AAL(this.A02, this.A01, this.A00.getQueryParameter(A00(8, 4, 21)), j9);
        return com.facebook.ads.redexgen.core.EnumC03240g.A09;
    }
}
