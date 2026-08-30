package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1315bn extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0692Fq A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C03631u A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0681Fe A02;

    public C1315bn(com.facebook.ads.redexgen.core.C0681Fe c0681Fe, com.facebook.ads.redexgen.core.C03631u c03631u, com.facebook.ads.redexgen.core.C0692Fq c0692Fq) {
        this.A02 = c0681Fe;
        this.A01 = c03631u;
        this.A00 = c0692Fq;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        this.A02.A0S(this.A01);
        this.A02.A0P(this.A00);
        this.A02.A00 = null;
        com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0E().A5F(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new com.facebook.ads.redexgen.core.C0779Jg(adErrorType, ""));
    }
}
