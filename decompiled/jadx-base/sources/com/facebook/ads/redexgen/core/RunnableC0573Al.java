package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0573Al implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0575An A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.BH A01;

    public RunnableC0573Al(com.facebook.ads.redexgen.core.C0575An c0575An, com.facebook.ads.redexgen.core.BH bh) {
        this.A00 = c0575An;
        this.A01 = bh;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A01.A00();
            this.A00.A01.ABF(this.A01);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
