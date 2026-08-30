package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0698Fx extends com.facebook.ads.redexgen.core.AbstractC1326by {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0692Fq A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1345cH A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0687Fk A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0698Fx(com.facebook.ads.redexgen.core.C0692Fq c0692Fq, boolean z, boolean z2, com.facebook.ads.redexgen.core.C0687Fk c0687Fk, com.facebook.ads.redexgen.core.AbstractC1345cH abstractC1345cH) {
        super(z);
        this.A00 = c0692Fq;
        this.A03 = z2;
        this.A02 = c0687Fk;
        this.A01 = abstractC1345cH;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1326by
    public final void A00() {
        this.A00.A01.ADU(this.A01, com.facebook.ads.AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1326by
    public final void A01(boolean z) {
        if (!com.facebook.ads.redexgen.core.C0762Im.A1j(this.A00.A04) || !this.A03) {
            this.A00.A0C.set(true);
            this.A00.A01.ADR(this.A01);
        } else {
            this.A00.A06 = com.facebook.ads.redexgen.core.AbstractC0927Pc.A01(this.A00.A04, this.A02, 0, new com.facebook.ads.redexgen.core.C1354cQ(this));
        }
    }
}
