package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class R4 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ com.facebook.ads.redexgen.core.OY A00;

    public R4(com.facebook.ads.redexgen.core.OY oy) {
        this.A00 = oy;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.A00.A00.setVisibility(8);
    }
}
