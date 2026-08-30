package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PV extends com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.C9O> {
    public final /* synthetic */ com.facebook.ads.redexgen.core.PC A00;

    public PV(com.facebook.ads.redexgen.core.PC pc) {
        this.A00 = pc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C9O c9o) {
        if (this.A00.A00 == null) {
            return;
        }
        this.A00.setText(this.A00.A02(this.A00.A00.getDuration() - this.A00.A00.getCurrentPositionInMillis()));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    public final java.lang.Class<com.facebook.ads.redexgen.core.C9O> A01() {
        return com.facebook.ads.redexgen.core.C9O.class;
    }
}
