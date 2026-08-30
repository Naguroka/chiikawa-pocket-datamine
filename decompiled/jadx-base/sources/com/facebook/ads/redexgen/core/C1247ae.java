package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1247ae extends com.facebook.ads.redexgen.core.AbstractC04394t {
    public boolean A00 = false;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1246ad A01;

    public C1247ae(com.facebook.ads.redexgen.core.AbstractC1246ad abstractC1246ad) {
        this.A01 = abstractC1246ad;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04394t
    public final void A0L(com.facebook.ads.redexgen.core.FL fl, int i) {
        super.A0L(fl, i);
        if (i == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04394t
    public final void A0M(com.facebook.ads.redexgen.core.FL fl, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.A00 = true;
        }
    }
}
