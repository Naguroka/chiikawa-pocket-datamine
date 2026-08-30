package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SM implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0795Jx A00;

    public SM(com.facebook.ads.redexgen.core.C0795Jx c0795Jx) {
        this.A00 = c0795Jx;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            com.facebook.ads.redexgen.core.C0795Jx.A03(this.A00);
            throw null;
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
