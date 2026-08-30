package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1239aW extends com.facebook.ads.redexgen.core.KL {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1238aV A00;

    public C1239aW(com.facebook.ads.redexgen.core.C1238aV c1238aV) {
        this.A00 = c1238aV;
    }

    @Override // com.facebook.ads.redexgen.core.KL
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onLoggingImpression(this.A00.A01.A07());
        }
    }
}
