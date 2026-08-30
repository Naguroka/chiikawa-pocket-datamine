package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VT implements com.facebook.ads.redexgen.core.MP {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C5Q A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.VP A01;

    public VT(com.facebook.ads.redexgen.core.VP vp, com.facebook.ads.redexgen.core.C5Q c5q) {
        this.A01 = vp;
        this.A00 = c5q;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final void ABX() {
        this.A01.A0D.A04(com.facebook.ads.redexgen.core.JE.A07, null);
        if (this.A01.A0b()) {
            return;
        }
        if (this.A01.A0Y()) {
            this.A01.A0X(this.A00);
        } else {
            this.A00.finish(1);
        }
    }
}
