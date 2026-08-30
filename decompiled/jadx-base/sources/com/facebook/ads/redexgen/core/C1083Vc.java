package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1083Vc implements com.facebook.ads.redexgen.core.InterfaceC0891Ns {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.CI A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 72);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-36, -38, -52, -39, -58, -55, -36, -51, -51, -52, -39, -52, -53, -58, -54, -45, -48, -54, -46, -58, -48, -56, -55, -58, -43, -56, -35, -48, -50, -56, -37, -48, -42, -43};
    }

    public C1083Vc(com.facebook.ads.redexgen.core.CI ci) {
        this.A00 = ci;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Ns
    public final void ACw(java.lang.String str) {
        this.A00.A0C.setProgress(100);
        ((com.facebook.ads.redexgen.core.VY) this.A00).A05 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Ns
    public final void ACy(java.lang.String str) {
        ((com.facebook.ads.redexgen.core.VY) this.A00).A05 = true;
        this.A00.A0B.setUrl(str);
        if (this.A00.A00 > 1) {
            this.A00.A0H(A00(0, 34, 31));
        }
        com.facebook.ads.redexgen.core.CI.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Ns
    public final void ADG(int i) {
        if (((com.facebook.ads.redexgen.core.VY) this.A00).A05) {
            this.A00.A0C.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Ns
    public final void ADJ(java.lang.String str) {
        this.A00.A0B.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Ns
    public final void ADL() {
        this.A00.A0A.ABR(14);
    }
}
