package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TX implements com.facebook.ads.redexgen.core.PG {
    public final /* synthetic */ com.facebook.ads.redexgen.core.TV A00;

    public TX(com.facebook.ads.redexgen.core.TV tv) {
        this.A00 = tv;
    }

    @Override // com.facebook.ads.redexgen.core.PG
    public final void ADw(int i) {
        this.A00.A0C(i, true);
        if (this.A00.A0H()) {
            this.A00.A07();
        } else {
            this.A00.A09(i);
        }
    }
}
