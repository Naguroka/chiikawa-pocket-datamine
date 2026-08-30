package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VQ implements com.facebook.ads.redexgen.core.LG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.VP A01;

    public VQ(com.facebook.ads.redexgen.core.VP vp, int i) {
        this.A01 = vp;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.LG
    public final void ABb() {
        this.A01.A03 = false;
        this.A01.A0T();
        this.A01.A0E.setToolbarActionMode(this.A01.getCloseButtonStyle());
        if (this.A01.A07 && this.A01.A06 != null) {
            this.A01.A06.A05();
            this.A01.A09.A4P(new com.facebook.ads.redexgen.core.V5().A6F());
        }
    }

    @Override // com.facebook.ads.redexgen.core.LG
    public final void ADF(float f) {
        this.A01.A0E.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
