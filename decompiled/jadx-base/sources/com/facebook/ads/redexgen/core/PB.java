package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PB implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.UP A00;

    public PB(com.facebook.ads.redexgen.core.UP up) {
        this.A00 = up;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02 == null) {
                return;
            }
            this.A00.A02.AGm();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
