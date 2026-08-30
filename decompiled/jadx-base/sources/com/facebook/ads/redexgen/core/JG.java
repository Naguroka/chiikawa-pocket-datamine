package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JG implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.JE A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.JF A01;

    public JG(com.facebook.ads.redexgen.core.JF jf, com.facebook.ads.redexgen.core.JE je) {
        this.A01 = jf;
        this.A00 = je;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
    }
}
