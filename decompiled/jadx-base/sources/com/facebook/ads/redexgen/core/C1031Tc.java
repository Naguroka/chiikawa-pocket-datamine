package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1031Tc implements com.facebook.ads.redexgen.core.QB {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05379a A00;

    public C1031Tc(com.facebook.ads.redexgen.core.C05379a c05379a) {
        this.A00 = c05379a;
    }

    @Override // com.facebook.ads.redexgen.core.QB
    public final void A8w() {
        if (this.A00.A02 instanceof com.facebook.ads.redexgen.core.BX) {
            ((com.facebook.ads.redexgen.core.BX) this.A00.A02).A16();
            com.facebook.ads.redexgen.core.JF.A02(com.facebook.ads.redexgen.core.JE.A0c, null, ((com.facebook.ads.redexgen.core.AbstractC1045Tq) this.A00).A01.A1U(), ((com.facebook.ads.redexgen.core.AbstractC1045Tq) this.A00).A03.A09());
        }
    }

    @Override // com.facebook.ads.redexgen.core.QB
    public final void AGm() {
        if (this.A00.A02 instanceof com.facebook.ads.redexgen.core.BX) {
            ((com.facebook.ads.redexgen.core.BX) this.A00.A02).A18(this.A00.A0K);
            com.facebook.ads.redexgen.core.JF.A02(com.facebook.ads.redexgen.core.JE.A0c, null, ((com.facebook.ads.redexgen.core.AbstractC1045Tq) this.A00).A01.A1U(), ((com.facebook.ads.redexgen.core.AbstractC1045Tq) this.A00).A03.A09());
        }
        this.A00.A0a();
    }

    @Override // com.facebook.ads.redexgen.core.QB
    public final void AH0() {
        this.A00.A0V();
        if (this.A00.A02 instanceof com.facebook.ads.redexgen.core.BX) {
            ((com.facebook.ads.redexgen.core.BX) this.A00.A02).getAdDetailsView().setVisibility(8);
        }
    }
}
