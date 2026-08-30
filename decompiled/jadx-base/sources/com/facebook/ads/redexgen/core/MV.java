package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MV implements android.view.animation.Animation.AnimationListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.CI A00;

    public MV(com.facebook.ads.redexgen.core.CI ci) {
        this.A00 = ci;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        this.A00.A06();
        if (this.A00.A04 > 0) {
            this.A00.A05.postDelayed(this.A00.A07, this.A00.A04);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
    }
}
