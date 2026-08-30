package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EF implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.EI A00;

    public EF(com.facebook.ads.redexgen.core.EI ei) {
        this.A00 = ei;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0H(5, 3);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
