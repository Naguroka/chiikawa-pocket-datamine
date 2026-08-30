package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1379cp<T> implements com.facebook.ads.redexgen.core.C0Z<T> {
    public static byte[] A01;
    public final java.lang.String A00;

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 21);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-90, -83, -92, -92};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cp != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    public AbstractC1379cp(java.lang.String str) {
        this.A00 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cp != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    public com.facebook.ads.redexgen.core.C0Y A04(T t) {
        return new com.facebook.ads.redexgen.core.C0Y(this, t == null ? A02(0, 4, 35) : t.toString());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cp != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    @Override // com.facebook.ads.redexgen.core.C0Z
    public final java.lang.String getName() {
        return this.A00;
    }
}
