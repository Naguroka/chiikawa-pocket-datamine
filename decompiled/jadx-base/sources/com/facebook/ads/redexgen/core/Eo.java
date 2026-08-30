package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Eo implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0643Dg A00;

    public Eo(com.facebook.ads.redexgen.core.C0643Dg c0643Dg) {
        this.A00 = c0643Dg;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0G) {
                this.A00.A08.ABd(this.A00);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
