package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class U4 implements com.facebook.ads.redexgen.core.LG {
    public final /* synthetic */ com.facebook.ads.redexgen.core.B8 A00;

    public U4(com.facebook.ads.redexgen.core.B8 b8) {
        this.A00 = b8;
    }

    @Override // com.facebook.ads.redexgen.core.LG
    public final void ABb() {
        this.A00.A05.ADa(false);
        this.A00.A05.ABi(this.A00.A02);
    }

    @Override // com.facebook.ads.redexgen.core.LG
    public final void ADF(float f) {
        this.A00.A05.ABz(this.A00.A02 - f);
    }
}
