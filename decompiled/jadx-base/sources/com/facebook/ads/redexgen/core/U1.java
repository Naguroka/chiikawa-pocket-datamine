package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class U1 implements com.facebook.ads.redexgen.core.LG {
    public static java.lang.String[] A01 = {"", "vSeS2rx23zUd4am5Wdo", "UtlZDzt7", "dNEruPHPdkyj182N7GwirLXq8Db2eecB", "b1VGcsOgsecYYY6uN1zNid8VodysKnsR", "yg", "RqC1uxvv784HDfNbZXUq5U9jCsQW0kUg", "5jFX4DLWV5nBObgEbVC73yk5ncCVY3Kv"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0563Ab A00;

    public U1(com.facebook.ads.redexgen.core.C0563Ab c0563Ab) {
        this.A00 = c0563Ab;
    }

    @Override // com.facebook.ads.redexgen.core.LG
    public final void ABb() {
        this.A00.A0F.ABi(this.A00.A0A);
        this.A00.A0F.ABK();
    }

    @Override // com.facebook.ads.redexgen.core.LG
    public final void ADF(float f) {
        int i;
        float duration = (this.A00.A0A - f) + (this.A00.A0V ? 0 : this.A00.A0I.getDuration());
        com.facebook.ads.redexgen.core.C0563Ab c0563Ab = this.A00;
        if (A01[4].charAt(2) != 'V') {
            throw new java.lang.RuntimeException();
        }
        A01[7] = "iUY2DHYRiluzyO05ci2O9gzQrrq6c2GK";
        if (!c0563Ab.A0V) {
            i = this.A00.A09;
        } else {
            com.facebook.ads.redexgen.core.C0563Ab c0563Ab2 = this.A00;
            java.lang.String[] strArr = A01;
            if (strArr[5].length() != strArr[1].length()) {
                A01[4] = "jZVNpY3PkhFJgbxs6TiKD4bRtw9FJmgD";
                i = c0563Ab2.A0A;
            } else {
                throw new java.lang.RuntimeException();
            }
        }
        float seenTime = i;
        this.A00.A0F.AHJ(duration / seenTime);
    }
}
