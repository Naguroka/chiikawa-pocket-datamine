package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1353cP implements com.facebook.ads.redexgen.core.AnonymousClass64 {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0692Fq A00;

    public C1353cP(com.facebook.ads.redexgen.core.C0692Fq c0692Fq) {
        this.A00 = c0692Fq;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass64
    public final void ABB() {
        this.A00.A0C.set(true);
        this.A00.A01.ADR(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass64
    public final void ABC() {
        this.A00.A01.ADU(this.A00, com.facebook.ads.AdError.CACHE_ERROR);
    }
}
