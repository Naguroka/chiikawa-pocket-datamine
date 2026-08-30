package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VE implements com.facebook.ads.redexgen.core.LG {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.VA A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 116);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{69, 81, 80, 75, 71, 72, 77, 71, 79};
    }

    public VE(com.facebook.ads.redexgen.core.VA va) {
        this.A00 = va;
    }

    @Override // com.facebook.ads.redexgen.core.LG
    public final void ABb() {
        if (!this.A00.A0C && !this.A00.A0B) {
            this.A00.A0U(false, A00(0, 9, 80));
        }
    }

    @Override // com.facebook.ads.redexgen.core.LG
    public final void ADF(float f) {
    }
}
