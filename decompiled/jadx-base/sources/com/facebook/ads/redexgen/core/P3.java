package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class P3 implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.UQ A00;

    public P3(com.facebook.ads.redexgen.core.UQ uq) {
        this.A00 = uq;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0O) {
                return;
            }
            this.A00.A0N();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
