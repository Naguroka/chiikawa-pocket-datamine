package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NA implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.ND A00;

    public NA(com.facebook.ads.redexgen.core.ND nd) {
        this.A00 = nd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (this.A00.A05) {
                this.A00.A04.A4h();
            } else {
                this.A00.A04.A4i();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
