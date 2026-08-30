package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XX implements com.facebook.ads.redexgen.core.FG {
    public final int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0643Dg A01;

    public XX(com.facebook.ads.redexgen.core.C0643Dg c0643Dg, int i) {
        this.A01 = c0643Dg;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.FG
    public final boolean A9b() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.FG
    public final void AAm() throws java.io.IOException {
        this.A01.A0Q();
    }

    @Override // com.facebook.ads.redexgen.core.FG
    public final int AEn(com.facebook.ads.redexgen.core.C05569u c05569u, com.facebook.ads.redexgen.core.C1177Yw c1177Yw, boolean z) {
        return this.A01.A0P(this.A00, c05569u, c1177Yw, z);
    }

    @Override // com.facebook.ads.redexgen.core.FG
    public final int AGp(long j) {
        return this.A01.A0O(this.A00, j);
    }
}
