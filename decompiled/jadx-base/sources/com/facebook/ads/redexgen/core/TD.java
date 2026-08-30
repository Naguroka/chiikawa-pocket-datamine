package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TD extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.TC A00;

    public TD(com.facebook.ads.redexgen.core.TC tc) {
        this.A00 = tc;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        this.A00.A02.A06();
        this.A00.A03.getEventBus().A04(this.A00.A05, this.A00.A04);
    }
}
