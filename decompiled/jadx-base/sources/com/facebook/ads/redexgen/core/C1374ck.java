package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1374ck extends com.facebook.ads.redexgen.core.AbstractC03250h {
    public static byte[] A01;
    public static final java.lang.String A02;
    public final android.net.Uri A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 98);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{16, 43, 51, 54, 47, 46, -22, 62, 57, -22, 57, 58, 47, 56, -22, 54, 51, 56, 53, -22, okio.Utf8.REPLACEMENT_BYTE, 60, 54, 4, -22};
    }

    static {
        A01();
        A02 = com.facebook.ads.redexgen.core.C1374ck.class.getSimpleName();
    }

    public C1374ck(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str, android.net.Uri uri) {
        super(c1199Zs, j7, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03250h
    public final com.facebook.ads.redexgen.core.EnumC03240g A0C() {
        try {
            com.facebook.ads.redexgen.core.L2.A0D(new com.facebook.ads.redexgen.core.L2(), super.A00, this.A00, this.A02);
        } catch (java.lang.Exception unused) {
            java.lang.String str = A00(0, 25, 104) + this.A00.toString();
        }
        return com.facebook.ads.redexgen.core.EnumC03240g.A09;
    }
}
