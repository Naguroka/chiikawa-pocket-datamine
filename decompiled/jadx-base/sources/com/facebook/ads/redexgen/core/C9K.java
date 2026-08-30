package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9K, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C9K extends com.facebook.ads.redexgen.core.AbstractC0990Rn {
    public final /* synthetic */ com.facebook.ads.redexgen.core.QG A00;

    public C9K(com.facebook.ads.redexgen.core.QG qg) {
        this.A00 = qg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.SZ sz) {
        if (!this.A00.A03 || !this.A00.A02) {
            return;
        }
        this.A00.A03 = false;
        if (!this.A00.A0D(com.facebook.ads.redexgen.core.RE.A03) && !this.A00.A04) {
            if (!this.A00.A0D(com.facebook.ads.redexgen.core.RE.A02)) {
                return;
            }
            this.A00.A03();
            this.A00.A06(true, true);
            return;
        }
        this.A00.A04 = false;
        this.A00.A05.postDelayed(new com.facebook.ads.redexgen.core.QO(this), this.A00.A00);
    }
}
