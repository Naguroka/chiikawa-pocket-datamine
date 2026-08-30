package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1224aH extends com.facebook.ads.redexgen.core.KL {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1223aG A00;

    public C1224aH(com.facebook.ads.redexgen.core.C1223aG c1223aG) {
        this.A00 = c1223aG;
    }

    @Override // com.facebook.ads.redexgen.core.KL
    public final void A01() {
        if (this.A00.A01.A00.A00() != null) {
            this.A00.A01.A00.A00().onAdsLoaded();
        }
    }
}
