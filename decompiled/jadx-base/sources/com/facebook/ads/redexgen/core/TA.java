package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TA extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.T7 A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.EnumC0984Rh A03;

    public TA(com.facebook.ads.redexgen.core.T7 t7, com.facebook.ads.redexgen.core.EnumC0984Rh enumC0984Rh, int i, int i2) {
        this.A02 = t7;
        this.A03 = enumC0984Rh;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        if (this.A03 == com.facebook.ads.redexgen.core.EnumC0984Rh.A07) {
            this.A02.A0L(com.facebook.ads.redexgen.core.JE.A0w);
            this.A02.A0A.A0E().A3U();
            this.A02.A0B.A02(com.facebook.ads.redexgen.core.T7.A0I);
            return;
        }
        if (this.A03 == com.facebook.ads.redexgen.core.EnumC0984Rh.A03) {
            this.A02.A0L(com.facebook.ads.redexgen.core.JE.A0r);
            this.A02.A03 = true;
            this.A02.A0B.A02(com.facebook.ads.redexgen.core.T7.A0G);
            this.A02.A0K(this.A00);
            return;
        }
        if (this.A03 == com.facebook.ads.redexgen.core.EnumC0984Rh.A06) {
            this.A02.A0L(com.facebook.ads.redexgen.core.JE.A0q);
            this.A02.A0A.A0E().A3M();
            this.A02.A03 = true;
            this.A02.A07.removeCallbacksAndMessages(null);
            this.A02.A0B.A02(new com.facebook.ads.redexgen.core.C9R(this.A01, this.A01));
            this.A02.A0K(this.A01);
            return;
        }
        if (this.A03 == com.facebook.ads.redexgen.core.EnumC0984Rh.A0A) {
            if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A02.A0A)) {
                this.A02.A0A.A0A().AE9();
            }
            this.A02.A0L(com.facebook.ads.redexgen.core.JE.A0u);
            this.A02.A0A.A0E().A3b();
            this.A02.A0B.A02(com.facebook.ads.redexgen.core.T7.A0H);
            this.A02.A07.removeCallbacksAndMessages(null);
            this.A02.A0H();
            return;
        }
        if (this.A03 == com.facebook.ads.redexgen.core.EnumC0984Rh.A05) {
            this.A02.A0L(com.facebook.ads.redexgen.core.JE.A0t);
            this.A02.A0A.A0E().A3Q();
            com.facebook.ads.redexgen.core.C05338w c05338w = this.A02.A0B;
            final int i = this.A00;
            c05338w.A02(new com.facebook.ads.redexgen.core.AbstractC1013Sk(i) { // from class: com.facebook.ads.redexgen.X.9P
            });
            this.A02.A07.removeCallbacksAndMessages(null);
            this.A02.A0K(this.A00);
            return;
        }
        if (this.A03 == com.facebook.ads.redexgen.core.EnumC0984Rh.A04) {
            this.A02.A0L(com.facebook.ads.redexgen.core.JE.A0s);
            this.A02.A0A.A0E().A3N();
            this.A02.A0B.A02(com.facebook.ads.redexgen.core.T7.A0K);
            this.A02.A07.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == com.facebook.ads.redexgen.core.EnumC0984Rh.A09) {
            this.A02.A0L(com.facebook.ads.redexgen.core.JE.A0q);
            this.A02.A0A.A0E().A3W();
            this.A02.A03 = true;
            this.A02.A07.removeCallbacksAndMessages(null);
            this.A02.A0B.A02(new com.facebook.ads.redexgen.core.C9R(this.A00, this.A01));
            this.A02.A0K(this.A00);
        }
    }
}
