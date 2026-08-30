package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EG implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.EI A00;
    public final /* synthetic */ java.lang.Throwable A01;

    public EG(com.facebook.ads.redexgen.core.EI ei, java.lang.Throwable th) {
        this.A00 = ei;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0I(1, this.A01 != null ? 4 : 2, this.A01) && !this.A00.A0H(6, 3) && !this.A00.A0H(7, 0)) {
                throw new java.lang.IllegalStateException();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
