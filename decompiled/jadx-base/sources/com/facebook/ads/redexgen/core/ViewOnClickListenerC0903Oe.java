package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0903Oe implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui A00;
    public final /* synthetic */ java.lang.String A01;

    public ViewOnClickListenerC0903Oe(com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui viewOnClickListenerC1063Ui, java.lang.String str) {
        this.A00 = viewOnClickListenerC1063Ui;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A09(this.A01);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
