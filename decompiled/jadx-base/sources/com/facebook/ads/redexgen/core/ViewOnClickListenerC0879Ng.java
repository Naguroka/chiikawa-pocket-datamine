package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0879Ng implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0882Nj A00;

    public ViewOnClickListenerC0879Ng(com.facebook.ads.redexgen.core.C0882Nj c0882Nj) {
        this.A00 = c0882Nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0A.canGoForward()) {
                return;
            }
            this.A00.A0A.goForward();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
