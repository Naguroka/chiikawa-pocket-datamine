package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class N2 implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.V7 A00;

    public N2(com.facebook.ads.redexgen.core.V7 v7) {
        this.A00 = v7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A07.ABy();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
