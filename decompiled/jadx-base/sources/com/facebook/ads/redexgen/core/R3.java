package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class R3 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C8H A00;

    public R3(com.facebook.ads.redexgen.core.C8H c8h) {
        this.A00 = c8h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.A00.A00.A04.postDelayed(new com.facebook.ads.redexgen.core.OZ(this), 2000L);
    }
}
