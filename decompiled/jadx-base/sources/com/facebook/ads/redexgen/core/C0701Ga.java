package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0701Ga extends com.facebook.ads.redexgen.core.AbstractC1376cm {
    public static byte[] A03;
    public java.util.Map<java.lang.String, java.lang.String> A00;
    public boolean A01;
    public final android.net.Uri A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 77);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{88, 93, 90, 95, 59, 60, 39, 58, 45, 23, kotlin.io.encoding.Base64.padSymbol, 58, 36, 23, okio.Utf8.REPLACEMENT_BYTE, 45, 42, 23, 46, 41, 36, 36, 42, 41, 43, 35};
    }

    public C0701Ga(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> mExtraData) {
        super(c1199Zs, j7, str, null, true, true);
        this.A02 = uri;
        this.A00 = mExtraData;
    }

    public C0701Ga(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> mExtraData, boolean z) {
        this(c1199Zs, j7, str, uri, mExtraData);
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1376cm
    public final com.facebook.ads.redexgen.core.EnumC03240g A0D() {
        A0E(this.A00, null);
        return com.facebook.ads.redexgen.core.EnumC03240g.A09;
    }

    public final android.net.Uri A0G() {
        java.lang.String queryParameter = this.A02.getQueryParameter(A00(4, 22, 5));
        if (this.A01 && !android.text.TextUtils.isEmpty(queryParameter)) {
            return com.facebook.ads.redexgen.core.L5.A00(queryParameter);
        }
        android.net.Uri uri = this.A02;
        java.lang.String url = A00(0, 4, 121);
        return com.facebook.ads.redexgen.core.L5.A00(uri.getQueryParameter(url));
    }
}
