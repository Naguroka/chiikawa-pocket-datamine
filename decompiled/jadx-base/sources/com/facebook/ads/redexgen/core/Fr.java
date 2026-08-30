package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Fr extends com.facebook.ads.redexgen.core.AbstractC1326by {
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0692Fq A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1339cB A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0687Fk A03;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1199Zs A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fr(com.facebook.ads.redexgen.core.C0692Fq c0692Fq, boolean z, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C0687Fk c0687Fk, com.facebook.ads.redexgen.core.C1339cB c1339cB, int i) {
        super(z);
        this.A01 = c0692Fq;
        this.A04 = c1199Zs;
        this.A03 = c0687Fk;
        this.A02 = c1339cB;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1326by
    public final void A00() {
        this.A01.A01.ADU(this.A01, com.facebook.ads.AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1326by
    public final void A01(boolean z) {
        com.facebook.ads.redexgen.core.C0692Fq.A0D = null;
        if (z) {
            this.A04.A00().AGG(this.A03.A1U(), this.A02.A1O());
        }
        if (this.A00 == 0) {
            this.A01.A0C.set(true);
            this.A01.A01.ADR(this.A01);
        }
        this.A01.A0B(this.A04, this.A02, this.A00 + 1);
    }
}
