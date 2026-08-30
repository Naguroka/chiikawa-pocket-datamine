package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1235aS extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1234aR A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.BN A01;

    public C1235aS(com.facebook.ads.redexgen.core.C1234aR c1234aR, com.facebook.ads.redexgen.core.BN bn) {
        this.A00 = c1234aR;
        this.A01 = bn;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1A());
        this.A00.A02.A1e(true, true);
    }
}
