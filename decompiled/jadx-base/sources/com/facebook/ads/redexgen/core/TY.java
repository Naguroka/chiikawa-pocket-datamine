package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TY implements com.facebook.ads.redexgen.core.PI {
    public final /* synthetic */ com.facebook.ads.redexgen.core.TV A00;

    public TY(com.facebook.ads.redexgen.core.TV tv) {
        this.A00 = tv;
    }

    @Override // com.facebook.ads.redexgen.core.PI
    public final float getVolume() {
        return this.A00.A00;
    }

    @Override // com.facebook.ads.redexgen.core.PI
    public final void setVolume(float f) {
        this.A00.A00 = f;
    }
}
