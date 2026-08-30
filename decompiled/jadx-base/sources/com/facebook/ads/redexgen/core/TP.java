package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TP extends com.facebook.ads.redexgen.core.AbstractC0986Rj {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C9Z A00;

    public TP(com.facebook.ads.redexgen.core.C9Z c9z) {
        this.A00 = c9z;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0986Rj
    public final void A03() {
        if (!this.A00.A0E.A07()) {
            this.A00.setImpressionRecordingFlag(this.A00.A0E);
            if (!android.text.TextUtils.isEmpty(this.A00.A0A)) {
                ((com.facebook.ads.redexgen.core.VP) ((com.facebook.ads.redexgen.core.VP) this.A00)).A0C.AA6(this.A00.A0A, new com.facebook.ads.redexgen.core.O8().A03(this.A00.A09).A02(this.A00.A0E).A04(((com.facebook.ads.redexgen.core.VP) ((com.facebook.ads.redexgen.core.VP) this.A00)).A0A.A0b()).A05());
                com.facebook.ads.redexgen.core.C1T.A07(((com.facebook.ads.redexgen.core.VP) ((com.facebook.ads.redexgen.core.VP) this.A00)).A0A.A1Q(), this.A00.A0D);
                this.A00.A0D.A0E().A36();
                com.facebook.ads.redexgen.core.C2M.A02(this.A00.A03.A0a(), com.facebook.ads.redexgen.core.AbstractC0825Le.A00(((com.facebook.ads.redexgen.core.VP) ((com.facebook.ads.redexgen.core.VP) this.A00)).A0A.A0c()));
            }
        }
    }
}
