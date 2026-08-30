package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0574Am implements java.lang.Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0575An A01;

    public RunnableC0574Am(com.facebook.ads.redexgen.core.C0575An c0575An, int i) {
        this.A01 = c0575An;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A01.A01.ABI(this.A00);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
