package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0862Mp implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.VA A00;

    public ViewOnClickListenerC0862Mp(com.facebook.ads.redexgen.core.VA va) {
        this.A00 = va;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0N.A04(com.facebook.ads.redexgen.core.JE.A07, null);
            this.A00.A0Q.A4P(this.A00.A0R.A7I());
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
