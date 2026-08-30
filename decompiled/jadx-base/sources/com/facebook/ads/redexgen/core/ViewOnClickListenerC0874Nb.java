package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0874Nb implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.V1 A00;

    public ViewOnClickListenerC0874Nb(com.facebook.ads.redexgen.core.V1 v1) {
        this.A00 = v1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A8n();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
