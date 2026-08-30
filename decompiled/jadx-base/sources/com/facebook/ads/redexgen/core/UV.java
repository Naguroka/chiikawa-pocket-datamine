package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UV implements com.facebook.ads.redexgen.core.InterfaceC0891Ns {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.UQ A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 104);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{73, 71, 57, 70, 51, 66, 53, 74, kotlin.io.encoding.Base64.padSymbol, 59, 53, 72, kotlin.io.encoding.Base64.padSymbol, 67, 66, 51, kotlin.io.encoding.Base64.padSymbol, 53, 54};
    }

    public UV(com.facebook.ads.redexgen.core.UQ uq) {
        this.A00 = uq;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Ns
    public final void ACw(java.lang.String str) {
        this.A00.A0U = false;
        this.A00.A0I.setProgress(100);
        com.facebook.ads.redexgen.core.M3.A0N(this.A00.A0I, 8);
        if (this.A00.A0G.A1B() && this.A00.A0J != null) {
            java.lang.String strA0f = this.A00.A0G.A0f();
            if (!android.text.TextUtils.isEmpty(strA0f)) {
                this.A00.A0J.loadUrl(strA0f);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Ns
    public final void ACy(java.lang.String str) {
        this.A00.A0U = true;
        com.facebook.ads.redexgen.core.M3.A0N(this.A00.A0I, 0);
        this.A00.A0H.setUrl(str);
        if (!this.A00.A0T && this.A00.A01 > 1) {
            this.A00.A0T = true;
            this.A00.A0f(A00(0, 19, 108));
        }
        com.facebook.ads.redexgen.core.UQ.A03(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Ns
    public final void ADG(int i) {
        if (this.A00.A0U) {
            this.A00.A0I.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Ns
    public final void ADJ(java.lang.String str) {
        this.A00.A0H.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Ns
    public final void ADL() {
        this.A00.A0L.A0A().ABR(14);
    }
}
