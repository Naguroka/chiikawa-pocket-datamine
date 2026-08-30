package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.We, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ViewOnAttachStateChangeListenerC1110We extends com.facebook.ads.redexgen.core.AbstractC1425dm implements android.view.View.OnAttachStateChangeListener {
    public final android.view.View A00;

    public ViewOnAttachStateChangeListenerC1110We(android.view.View view) {
        this.A00 = view;
        this.A00.addOnAttachStateChangeListener(this);
        if (A04()) {
            A00();
        }
    }

    public final void A03() {
        A00();
    }

    public final boolean A04() {
        return com.facebook.ads.redexgen.core.C3T.A0H(this.A00);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        A00();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        A01();
    }
}
