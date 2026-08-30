package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Q1 implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.A6 A00;

    public Q1(com.facebook.ads.redexgen.core.A6 a6) {
        this.A00 = a6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0K) {
                this.A00.A0L = true;
                this.A00.A0e(((com.facebook.ads.redexgen.core.C0701Ga) this.A00.A0T).A0G().toString());
                if (((com.facebook.ads.redexgen.core.U6) this.A00).A05.A0U() >= 0) {
                    this.A00.A08.postDelayed(this.A00.A0j, ((com.facebook.ads.redexgen.core.U6) this.A00).A05.A0U());
                }
            }
            this.A00.A0h(this.A00.A0K ? false : true);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
