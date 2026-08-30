package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Q9 implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05379a A00;

    public Q9(com.facebook.ads.redexgen.core.C05379a c05379a) {
        this.A00 = c05379a;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            ((com.facebook.ads.redexgen.core.AbstractC1045Tq) this.A00).A08.A4P(((com.facebook.ads.redexgen.core.AbstractC1045Tq) this.A00).A09.A7I());
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
