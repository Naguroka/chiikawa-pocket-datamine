package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NM implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.V3 A00;

    public NM(com.facebook.ads.redexgen.core.V3 v3) {
        this.A00 = v3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A9n();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
