package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8H, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C8H extends com.facebook.ads.redexgen.core.AbstractC0974Qx {
    public final /* synthetic */ com.facebook.ads.redexgen.core.OY A00;

    public C8H(com.facebook.ads.redexgen.core.OY oy) {
        this.A00 = oy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C0975Qy c0975Qy) {
        if (this.A00.A01 == null || c0975Qy.A00().getAction() != 0) {
            return;
        }
        this.A00.A04.removeCallbacksAndMessages(null);
        this.A00.A07(new com.facebook.ads.redexgen.core.R3(this));
    }
}
