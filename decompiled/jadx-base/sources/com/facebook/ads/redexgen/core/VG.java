package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VG implements com.facebook.ads.redexgen.core.OR {
    public final /* synthetic */ com.facebook.ads.redexgen.core.VA A00;

    public VG(com.facebook.ads.redexgen.core.VA va) {
        this.A00 = va;
    }

    @Override // com.facebook.ads.redexgen.core.OR
    public final void AB7() {
        if (this.A00.A0V()) {
            this.A00.A0L();
            this.A00.A0a.setToolbarActionMessage("");
            this.A00.A0a.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.OR
    public final void ACc() {
        this.A00.A0F = false;
        this.A00.A0O.A07();
    }

    @Override // com.facebook.ads.redexgen.core.OR
    public final void ACd() {
        this.A00.A0F = true;
        this.A00.A0O.A06();
    }
}
