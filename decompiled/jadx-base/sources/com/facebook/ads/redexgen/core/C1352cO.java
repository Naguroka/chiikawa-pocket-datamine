package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1352cO implements com.facebook.ads.redexgen.core.InterfaceC03581p {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0692Fq A00;

    public C1352cO(com.facebook.ads.redexgen.core.C0692Fq c0692Fq) {
        this.A00 = c0692Fq;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03581p
    public final void AD2(com.facebook.ads.AdError adError) {
        this.A00.A01.ADU(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03581p
    public final void AD3() {
        this.A00.A0C.set(true);
        this.A00.A01.ADR(this.A00);
    }
}
