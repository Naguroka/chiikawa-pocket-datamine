package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1225aI extends com.facebook.ads.redexgen.core.KL {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1222aF A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0779Jg A01;

    public C1225aI(com.facebook.ads.redexgen.core.C1222aF c1222aF, com.facebook.ads.redexgen.core.C0779Jg c0779Jg) {
        this.A00 = c1222aF;
        this.A01 = c0779Jg;
    }

    @Override // com.facebook.ads.redexgen.core.KL
    public final void A01() {
        if (this.A00.A00.A00() != null) {
            this.A00.A00.A00().onAdError(com.facebook.ads.redexgen.core.L8.A00(this.A01));
        }
    }
}
