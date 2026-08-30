package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class V0 implements com.facebook.ads.redexgen.core.InterfaceC0892Nt {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0882Nj A00;

    public V0(com.facebook.ads.redexgen.core.C0882Nj c0882Nj) {
        this.A00 = c0882Nj;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0892Nt
    public final void ABL(boolean z) {
        if (this.A00.A08 && this.A00.A00 != null) {
            this.A00.A00.setEnabled(z);
            this.A00.A00.setAlpha(z ? 1.0f : 0.3f);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0892Nt
    public final void AC0(boolean z) {
        if (this.A00.A08 && this.A00.A02 != null) {
            this.A00.A02.setEnabled(z);
            this.A00.A02.setAlpha(z ? 1.0f : 0.3f);
        }
    }
}
