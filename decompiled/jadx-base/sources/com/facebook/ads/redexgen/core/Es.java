package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Es extends com.facebook.ads.redexgen.core.AbstractC1012Sj {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04525h A00;

    public Es(com.facebook.ads.redexgen.core.C04525h c04525h) {
        this.A00 = c04525h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C9R c9r) {
        this.A00.A00.onCompleted();
        if (com.facebook.ads.redexgen.core.C0762Im.A1Z(this.A00.A00.getContext())) {
            this.A00.A00.play(com.facebook.ads.VideoStartReason.AUTO_STARTED);
        }
    }
}
