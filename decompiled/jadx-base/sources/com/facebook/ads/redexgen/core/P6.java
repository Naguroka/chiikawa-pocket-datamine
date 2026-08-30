package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class P6 implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.UQ A00;

    public P6(com.facebook.ads.redexgen.core.UQ uq) {
        this.A00 = uq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0O) {
                this.A00.A0P = true;
                this.A00.A0d(((com.facebook.ads.redexgen.core.C0701Ga) this.A00.A0c).A0G().toString());
                if (this.A00.A0G.A0U() >= 0) {
                    this.A00.A09.postDelayed(this.A00.A0i, this.A00.A0G.A0U());
                }
            }
            this.A00.A0g(this.A00.A0O ? false : true);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
