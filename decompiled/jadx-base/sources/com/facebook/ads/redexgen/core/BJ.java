package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BJ extends java.lang.Thread {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1175Yu A00;

    public BJ(com.facebook.ads.redexgen.core.AbstractC1175Yu abstractC1175Yu) {
        this.A00 = abstractC1175Yu;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
