package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Q8 implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1033Te A00;

    public Q8(com.facebook.ads.redexgen.core.C1033Te c1033Te) {
        this.A00 = c1033Te;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0D(com.facebook.ads.redexgen.core.JE.A0Z);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
