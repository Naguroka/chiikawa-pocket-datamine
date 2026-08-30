package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WM implements com.facebook.ads.redexgen.core.O7 {
    public final /* synthetic */ com.facebook.ads.redexgen.core.WJ A00;

    public WM(com.facebook.ads.redexgen.core.WJ wj) {
        this.A00 = wj;
    }

    @Override // com.facebook.ads.redexgen.core.O7
    public final void AC8(boolean z) {
        this.A00.A0D.set(z);
        if (this.A00.A0E.get() && this.A00.A02 != null) {
            this.A00.A02.AD0(z);
        }
    }
}
