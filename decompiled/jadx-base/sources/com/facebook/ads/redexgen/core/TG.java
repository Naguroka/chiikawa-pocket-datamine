package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TG implements com.facebook.ads.redexgen.core.S9 {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0953Qc A00;

    public TG(com.facebook.ads.redexgen.core.C0953Qc c0953Qc) {
        this.A00 = c0953Qc;
    }

    @Override // com.facebook.ads.redexgen.core.S9
    public final void AEd() {
        if (this.A00.A02 != null) {
            this.A00.A02.A4P(this.A00.A03.A8K());
        }
    }

    @Override // com.facebook.ads.redexgen.core.S9
    public final void AEf(com.facebook.ads.redexgen.core.SB sb) {
        if (this.A00.A02 == null) {
            return;
        }
        if (sb != null && sb.A00()) {
            this.A00.A02.A4P(this.A00.A03.A8L());
        } else {
            this.A00.A02.A4P(this.A00.A03.A8K());
        }
    }
}
