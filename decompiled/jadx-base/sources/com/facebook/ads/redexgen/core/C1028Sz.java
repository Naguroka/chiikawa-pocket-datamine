package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1028Sz extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C9S A00;

    public C1028Sz(com.facebook.ads.redexgen.core.C9S c9s) {
        this.A00 = c9s;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        this.A00.A0C.getEventBus().A04(this.A00.A0E, this.A00.A06, this.A00.A08, this.A00.A05, this.A00.A04, this.A00.A03, this.A00.A07, this.A00.A0A, this.A00.A0B, this.A00.A0D, this.A00.A09);
        if (this.A00.A01 != null) {
            this.A00.A01.A06();
        }
    }
}
