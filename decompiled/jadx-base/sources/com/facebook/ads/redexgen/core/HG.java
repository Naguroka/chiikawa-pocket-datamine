package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class HG extends com.facebook.ads.redexgen.core.AbstractC1379cp<com.facebook.ads.redexgen.core.C0Q> {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 44);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -49, -58, -58};
    }

    public HG(java.lang.String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1379cp
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C0Y A04(com.facebook.ads.redexgen.core.C0Q c0q) {
        return new com.facebook.ads.redexgen.core.C0Y(this, c0q == null ? A00(0, 4, 46) : A00(0, 0, 18) + c0q.A03());
    }
}
