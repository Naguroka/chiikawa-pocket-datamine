package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NS implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2W A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.NI A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.V2 A02;

    public NS(com.facebook.ads.redexgen.core.V2 v2, com.facebook.ads.redexgen.core.NI ni, com.facebook.ads.redexgen.core.C2W c2w) {
        this.A02 = v2;
        this.A01 = ni;
        this.A00 = c2w;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.ACt(this.A00);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
