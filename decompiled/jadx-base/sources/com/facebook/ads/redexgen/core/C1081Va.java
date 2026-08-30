package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1081Va implements com.facebook.ads.redexgen.core.InterfaceC0881Ni {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.VY A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -19, -33, -20, -39, -36, -17, -32, -32, -33, -20, -33, -34, -39, -35, -26, -29, -35, -27, -39, -29, -37, -36, -39, -33, -14, -18, -33, -20, -24, -37, -26, -39, -24, -37, -16, -29, -31, -37, -18, -29, -23, -24};
    }

    public C1081Va(com.facebook.ads.redexgen.core.VY vy) {
        this.A00 = vy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0881Ni
    public final void ABX() {
        this.A00.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0881Ni
    public final void ACs() {
        this.A00.A0H(A00(0, 43, 56));
    }
}
