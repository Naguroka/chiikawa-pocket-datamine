package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1350cM extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1349cL A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 14);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C1350cM(com.facebook.ads.redexgen.core.C1349cL c1349cL) {
        this.A00 = c1349cL;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        this.A00.A03.A0E().AHX();
        this.A00.A05.loadUrl(A00(0, 11, 29) + this.A00.A00.A03());
    }
}
