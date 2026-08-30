package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RT implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.RW A00;

    public RT(com.facebook.ads.redexgen.core.RW rw) {
        this.A00 = rw;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
            this.A00.A04.removeCallbacks(this);
            this.A00.A04.postDelayed(this, 250L);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
