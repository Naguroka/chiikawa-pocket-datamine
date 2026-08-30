package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1357cT implements com.facebook.ads.redexgen.core.C6X {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0692Fq A00;

    public C1357cT(com.facebook.ads.redexgen.core.C0692Fq c0692Fq) {
        this.A00 = c0692Fq;
    }

    private void A00(boolean z) {
        if (!z) {
            this.A00.A01.ADU(this.A00, com.facebook.ads.AdError.CACHE_ERROR);
        } else {
            this.A00.A0C.set(true);
            this.A00.A01.ADR(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C6X
    public final void ABT() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.C6X
    public final void ABc() {
        A00(true);
    }
}
