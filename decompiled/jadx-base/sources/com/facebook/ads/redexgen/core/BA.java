package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BA extends com.facebook.ads.redexgen.core.AbstractC1012Sj {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.PT A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 95);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{107, 103, 101, 120, 100, 109, 124, 109, 108};
    }

    public BA(com.facebook.ads.redexgen.core.PT pt) {
        this.A00 = pt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C9R c9r) {
        this.A00.A07();
        this.A00.A0B.AE1(A00(0, 9, 87), this.A00.A04(this.A00.A0D.getDuration()));
    }
}
