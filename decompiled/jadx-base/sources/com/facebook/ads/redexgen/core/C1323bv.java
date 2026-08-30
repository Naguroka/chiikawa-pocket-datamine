package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1323bv extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1322bu A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0779Jg A01;

    public C1323bv(com.facebook.ads.redexgen.core.AbstractC1322bu abstractC1322bu, com.facebook.ads.redexgen.core.C0779Jg c0779Jg) {
        this.A00 = abstractC1322bu;
        this.A01 = c0779Jg;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        this.A00.A0B.A0E().A5F(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
