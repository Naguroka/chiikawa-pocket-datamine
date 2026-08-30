package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GP extends com.facebook.ads.redexgen.core.AbstractC1376cm {
    public static byte[] A02;
    public static final java.lang.String A03;
    public final android.net.Uri A00;
    public final java.util.Map<java.lang.String, java.lang.String> A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 108);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{93, 122, 114, 119, 126, 127, 59, 111, 116, 59, 116, 107, 126, 117, 59, 119, 114, 117, 112, 59, 110, 105, 119, 33, 59, 67, 70, 65, 68};
    }

    static {
        A01();
        A03 = com.facebook.ads.redexgen.core.GP.class.getSimpleName();
    }

    public GP(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> mExtraData, com.facebook.ads.redexgen.core.C03310o c03310o, boolean z) {
        super(c1199Zs, j7, str, c03310o, z);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1376cm
    public final com.facebook.ads.redexgen.core.EnumC03240g A0D() {
        com.facebook.ads.redexgen.core.EnumC03240g enumC03240gA0G = com.facebook.ads.redexgen.core.EnumC03240g.A09;
        if (((com.facebook.ads.redexgen.core.AbstractC1376cm) this).A02) {
            enumC03240gA0G = A0G();
        }
        A0E(this.A01, enumC03240gA0G);
        return enumC03240gA0G;
    }

    public final com.facebook.ads.redexgen.core.EnumC03240g A0G() {
        com.facebook.ads.redexgen.core.EnumC03240g enumC03240g = com.facebook.ads.redexgen.core.EnumC03240g.A09;
        try {
            com.facebook.ads.redexgen.core.L2.A0C(new com.facebook.ads.redexgen.core.L2(), ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A00, com.facebook.ads.redexgen.core.L5.A00(this.A00.getQueryParameter(A00(25, 4, 67))), ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A02);
            return enumC03240g;
        } catch (java.lang.Exception unused) {
            java.lang.String str = A00(0, 25, 119) + this.A00.toString();
            return com.facebook.ads.redexgen.core.EnumC03240g.A04;
        }
    }
}
