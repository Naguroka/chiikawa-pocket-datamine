package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1367cd extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1366cc A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.BN A01;

    public C1367cd(com.facebook.ads.redexgen.core.C1366cc c1366cc, com.facebook.ads.redexgen.core.BN bn) {
        this.A00 = c1366cc;
        this.A01 = bn;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        this.A00.A00.A0A();
        if (this.A00.A00.A0C != null) {
            this.A01.setAdViewabilityChecker(this.A00.A00.A0C);
            this.A00.A00.A0C.A0U();
        }
    }
}
