package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OQ implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.OS A00;

    public OQ(com.facebook.ads.redexgen.core.OS os) {
        this.A00 = os;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A04();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
