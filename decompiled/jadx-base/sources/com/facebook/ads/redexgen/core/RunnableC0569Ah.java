package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0569Ah implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0575An A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.BH A01;

    public RunnableC0569Ah(com.facebook.ads.redexgen.core.C0575An c0575An, com.facebook.ads.redexgen.core.BH bh) {
        this.A00 = c0575An;
        this.A01 = bh;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A01.ABG(this.A01);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
