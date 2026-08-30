package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TW implements com.facebook.ads.redexgen.core.PH {
    public final /* synthetic */ com.facebook.ads.redexgen.core.TV A00;

    public TW(com.facebook.ads.redexgen.core.TV tv) {
        this.A00 = tv;
    }

    @Override // com.facebook.ads.redexgen.core.PH
    public final void AE4(android.view.View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.PH
    public final void AE6(android.view.View view) {
        com.facebook.ads.redexgen.core.UO uo = (com.facebook.ads.redexgen.core.UO) view;
        uo.A16();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((java.lang.Integer) uo.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
