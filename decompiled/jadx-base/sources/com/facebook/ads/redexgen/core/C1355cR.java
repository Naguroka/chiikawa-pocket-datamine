package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1355cR implements com.facebook.ads.redexgen.core.AnonymousClass64 {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0692Fq A00;
    public final /* synthetic */ boolean A01;

    public C1355cR(com.facebook.ads.redexgen.core.C0692Fq c0692Fq, boolean z) {
        this.A00 = c0692Fq;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass64
    public final void ABB() {
        if (!com.facebook.ads.redexgen.core.C0762Im.A1j(this.A00.A04) || !this.A01) {
            this.A00.A0C.set(true);
            this.A00.A01.ADR(this.A00);
        } else {
            this.A00.A06 = com.facebook.ads.redexgen.core.AbstractC0927Pc.A01(this.A00.A04, (com.facebook.ads.redexgen.core.C0687Fk) this.A00.A03, 0, new com.facebook.ads.redexgen.core.C1356cS(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass64
    public final void ABC() {
        this.A00.A01.ADU(this.A00, com.facebook.ads.AdError.CACHE_ERROR);
    }
}
