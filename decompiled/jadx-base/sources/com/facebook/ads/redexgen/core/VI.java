package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VI extends com.facebook.ads.redexgen.core.AbstractC0986Rj {
    public static java.lang.String[] A01 = {"M3Te92XvVv4q3bfKEkaCq6oPQP87x4vv", "LzmiiHhJsyKuUkJv7K1Ir2o", "KopJ75", "b4r1pmUHtrvrrbICXjY", "ceBgm8EiRhrot5ffXZtZ35omPt2ZFFf0", "0EayevzsZQe4lRY4RLfa4MEWre", "N9h8Vj", "K1Ob6mZ8MwS9WZtXZ80XEzEALvtTcRJ2"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0859Mm A00;

    public VI(com.facebook.ads.redexgen.core.C0859Mm c0859Mm) {
        this.A00 = c0859Mm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0986Rj
    public final void A03() {
        if (this.A00.A07 == null || this.A00.A07.A0D()) {
            this.A00.A09.A0V();
            if (!this.A00.A05.A07()) {
                this.A00.A05.A05();
            }
            com.facebook.ads.redexgen.core.InterfaceC0858Ml listener = (com.facebook.ads.redexgen.core.InterfaceC0858Ml) this.A00.A0B.get();
            if (listener != null) {
                listener.ACA();
            }
            com.facebook.ads.redexgen.core.C0859Mm c0859Mm = this.A00;
            java.lang.String[] strArr = A01;
            if (strArr[1].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[1] = "2rS8p9kEkH8XxeBlGl7RSlB";
            strArr2[3] = "nqXy6qNf0NylKakjBUJ";
            c0859Mm.A09.A0V();
            return;
        }
        this.A00.A09.A0T();
    }
}
