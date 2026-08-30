package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TB extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.T7 A00;

    public TB(com.facebook.ads.redexgen.core.T7 t7) {
        this.A00 = t7;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        if (!this.A00.A03) {
            com.facebook.ads.redexgen.core.C05338w c05338w = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c05338w.A02(new com.facebook.ads.redexgen.core.AbstractC1013Sk(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.9O
            });
            this.A00.A07.postDelayed(this, this.A00.A00);
        }
    }
}
