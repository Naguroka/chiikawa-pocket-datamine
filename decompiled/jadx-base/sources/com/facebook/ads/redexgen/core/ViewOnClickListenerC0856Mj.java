package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0856Mj implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0859Mm A00;

    public ViewOnClickListenerC0856Mj(com.facebook.ads.redexgen.core.C0859Mm c0859Mm) {
        this.A00 = c0859Mm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0D();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
