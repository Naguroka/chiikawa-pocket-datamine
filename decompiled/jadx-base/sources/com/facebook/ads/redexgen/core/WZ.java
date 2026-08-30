package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WZ extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.WY A00;

    public WZ(com.facebook.ads.redexgen.core.WY wy) {
        this.A00 = wy;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        this.A00.A0C = false;
        if (this.A00.A0B.getQueue().isEmpty()) {
            this.A00.A0B.execute(this.A00.A0A);
        }
    }
}
