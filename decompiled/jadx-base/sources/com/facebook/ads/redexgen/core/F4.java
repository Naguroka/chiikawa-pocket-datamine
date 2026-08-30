package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class F4 implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.F6 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.F8 A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.F9 A02;

    public F4(com.facebook.ads.redexgen.core.F6 f6, com.facebook.ads.redexgen.core.F9 f9, com.facebook.ads.redexgen.core.F8 f8) {
        this.A00 = f6;
        this.A02 = f9;
        this.A01 = f8;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A02.ABn(this.A00.A00, this.A00.A01, this.A01);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
