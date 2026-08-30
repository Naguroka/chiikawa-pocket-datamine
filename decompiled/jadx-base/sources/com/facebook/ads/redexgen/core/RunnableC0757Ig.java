package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0757Ig implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.BH A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0758Ih A01;

    public RunnableC0757Ig(com.facebook.ads.redexgen.core.C0758Ih c0758Ih, com.facebook.ads.redexgen.core.BH bh) {
        this.A01 = c0758Ih;
        this.A00 = bh;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            this.A01.A01.ADy(this.A00);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
