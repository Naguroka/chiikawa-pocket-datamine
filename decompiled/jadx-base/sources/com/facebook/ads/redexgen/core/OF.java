package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OF implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1065Uk A00;

    public OF(com.facebook.ads.redexgen.core.C1065Uk c1065Uk) {
        this.A00 = c1065Uk;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
