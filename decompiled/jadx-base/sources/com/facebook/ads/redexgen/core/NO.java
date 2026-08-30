package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NO implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.NI A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.V2 A01;

    public NO(com.facebook.ads.redexgen.core.V2 v2, com.facebook.ads.redexgen.core.NI ni) {
        this.A01 = v2;
        this.A00 = ni;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ACj(com.facebook.ads.redexgen.core.C2U.A04);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
