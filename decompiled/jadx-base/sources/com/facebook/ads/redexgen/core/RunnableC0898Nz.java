package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0898Nz implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.O0 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.O1 A01;

    public RunnableC0898Nz(com.facebook.ads.redexgen.core.O0 o0, com.facebook.ads.redexgen.core.O1 o1) {
        this.A00 = o0;
        this.A01 = o1;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A01.ABD();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
