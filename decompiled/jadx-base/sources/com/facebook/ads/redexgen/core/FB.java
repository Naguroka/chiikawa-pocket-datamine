package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FB extends com.facebook.ads.redexgen.core.AbstractC0990Rn {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04525h A00;

    public FB(com.facebook.ads.redexgen.core.C04525h c04525h) {
        this.A00 = c04525h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.SZ sz) {
        if (this.A00.A08 != null) {
            com.facebook.ads.redexgen.core.W7.A0L(this.A00.A08.getInternalNativeAd()).A1e(true, true);
        }
        this.A00.A00.onPlayed();
    }
}
