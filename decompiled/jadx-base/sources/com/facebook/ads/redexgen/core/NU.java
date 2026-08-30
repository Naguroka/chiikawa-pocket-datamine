package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NU implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.NW A00;

    public NU(com.facebook.ads.redexgen.core.NW nw) {
        this.A00 = nw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A02.A8n();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
