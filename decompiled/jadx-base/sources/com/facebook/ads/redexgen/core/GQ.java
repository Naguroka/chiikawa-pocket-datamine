package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GQ extends com.facebook.ads.redexgen.core.AbstractC1376cm {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"FXNBCWXiStej7hPExkUYAqHU7xYJWQz0", "1k", "9V456DvY4LqOh9I9hdT7Vdo5", "hY2FptqSd7XbZZsJCz2yOGxQcUuE9Eo6", "F2N3RsuOcTrAQaEUExDI4U65CqttWDRl", "hYiRMwjZqKFmNKhRfgQ6FfhFwFErfvFO", "BBwXtDWFWjLC6NycZYUWGAP3M0YJ", ""};
    public static final java.lang.String A04;
    public final android.net.Uri A00;
    public final java.util.Map<java.lang.String, java.lang.String> A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 84);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-100, -73, -65, -62, -69, -70, 118, -54, -59, 118, -59, -58, -69, -60, 118, -62, -65, -60, -63, 118, -53, -56, -62, -112, 118, -45, -48, -43, -46};
        if (A03[3].charAt(0) == 'g') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A03;
        strArr[4] = "n2WgzR0RMCkX50JDMRkryQ8YygezODnU";
        strArr[5] = "Oz9myBlwI7NBoyftyrFAavzWMm25M0Ie";
    }

    static {
        A01();
        A04 = com.facebook.ads.redexgen.core.GQ.class.getSimpleName();
    }

    public GQ(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> mExtraData, com.facebook.ads.redexgen.core.C03310o c03310o, boolean z) {
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
        if (!com.facebook.ads.redexgen.core.M3.A0g(((com.facebook.ads.redexgen.core.AbstractC03250h) this).A00, enumC03240gA0G, this.A01)) {
            A0E(this.A01, enumC03240gA0G);
        }
        return enumC03240gA0G;
    }

    public final com.facebook.ads.redexgen.core.EnumC03240g A0G() {
        if (A0F(this.A00)) {
            com.facebook.ads.redexgen.core.EnumC03240g actionOutcome = com.facebook.ads.redexgen.core.EnumC03240g.A0A;
            return actionOutcome;
        }
        try {
            com.facebook.ads.redexgen.core.EnumC03240g actionOutcome2 = com.facebook.ads.redexgen.core.L2.A05(new com.facebook.ads.redexgen.core.L2(), ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A00, com.facebook.ads.redexgen.core.L5.A00(this.A00.getQueryParameter(A00(25, 4, 19))), ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A02, this.A01);
            return actionOutcome2;
        } catch (java.lang.Exception unused) {
            java.lang.String str = A00(0, 25, 2) + this.A00.toString();
            com.facebook.ads.redexgen.core.EnumC03240g actionOutcome3 = com.facebook.ads.redexgen.core.EnumC03240g.A04;
            return actionOutcome3;
        }
    }
}
