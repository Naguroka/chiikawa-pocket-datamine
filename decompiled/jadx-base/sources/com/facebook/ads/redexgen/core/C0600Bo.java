package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0600Bo extends com.facebook.ads.redexgen.core.AbstractC1006Sd {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.V7 A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 120);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{38, 57, 52, 53, okio.Utf8.REPLACEMENT_BYTE, 25, 62, 36, 53, 34, 35, 36, 57, 36, 49, 60, 21, 38, 53, 62, 36};
    }

    public C0600Bo(com.facebook.ads.redexgen.core.V7 v7) {
        this.A00 = v7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C9P c9p) {
        this.A00.A06.A4Q(A00(0, 21, 40), c9p);
    }
}
