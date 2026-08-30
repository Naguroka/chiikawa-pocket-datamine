package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1095Vo extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.LH A00;

    public C1095Vo(com.facebook.ads.redexgen.core.LH lh) {
        this.A00 = lh;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        if (this.A00.A05()) {
            this.A00.A02();
            this.A00.A05.postDelayed(this, this.A00.A02);
        }
    }
}
