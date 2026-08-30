package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1321bt extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1363cZ A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C03631u A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0685Fi A02;

    public C1321bt(com.facebook.ads.redexgen.core.C0685Fi c0685Fi, com.facebook.ads.redexgen.core.C03631u c03631u, com.facebook.ads.redexgen.core.C1363cZ c1363cZ) {
        this.A02 = c0685Fi;
        this.A01 = c03631u;
        this.A00 = c1363cZ;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        this.A02.A0S(this.A01);
        this.A02.A0P(this.A00);
        this.A02.A00 = null;
        com.facebook.ads.redexgen.core.C0779Jg c0779JgA00 = com.facebook.ads.redexgen.core.C0779Jg.A00(com.facebook.ads.internal.protocol.AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0E().A5F(c0779JgA00.A03().getErrorCode(), c0779JgA00.A04());
        this.A02.A07.A0G(c0779JgA00);
    }
}
