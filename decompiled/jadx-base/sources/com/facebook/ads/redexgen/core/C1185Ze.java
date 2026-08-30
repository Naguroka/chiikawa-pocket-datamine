package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1185Ze extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1198Zr A00;

    public C1185Ze(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        this.A00 = c1198Zr;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        com.facebook.ads.internal.dynamicloading.DynamicLoader dynamicLoader = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
