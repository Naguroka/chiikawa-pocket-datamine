package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class En implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0643Dg A00;

    public En(com.facebook.ads.redexgen.core.C0643Dg c0643Dg) {
        this.A00 = c0643Dg;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
