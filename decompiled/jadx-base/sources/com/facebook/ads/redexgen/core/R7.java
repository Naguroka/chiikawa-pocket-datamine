package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class R7 implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0896Nx A00;

    public R7(com.facebook.ads.redexgen.core.C0896Nx c0896Nx) {
        this.A00 = c0896Nx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A04.A04(com.facebook.ads.redexgen.core.JE.A0j, null);
            this.A00.A03.A0E().A3X();
            if (this.A00.A00 != null) {
                if (this.A00.A07()) {
                    this.A00.A00.setVolume(1.0f);
                } else {
                    this.A00.A00.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
