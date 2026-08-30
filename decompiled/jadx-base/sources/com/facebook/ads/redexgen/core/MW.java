package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MW implements android.view.animation.Animation.AnimationListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.CI A00;

    public MW(com.facebook.ads.redexgen.core.CI ci) {
        this.A00 = ci;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        ((com.facebook.ads.redexgen.core.VY) this.A00).A07.finish(16);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
    }
}
