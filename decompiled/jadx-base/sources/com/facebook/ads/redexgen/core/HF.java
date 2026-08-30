package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HF implements java.lang.Runnable {
    public final com.facebook.ads.redexgen.core.HE A00;

    public HF(com.facebook.ads.redexgen.core.HE he) {
        this.A00 = he;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.ACX();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
