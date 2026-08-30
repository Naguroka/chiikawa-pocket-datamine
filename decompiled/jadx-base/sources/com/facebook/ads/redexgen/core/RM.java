package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RM implements android.animation.Animator.AnimatorListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.M9 A00;

    public RM(com.facebook.ads.redexgen.core.M9 m9) {
        this.A00 = m9;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.A00.A08(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.A00.A00 = null;
        this.A00.A01 = com.facebook.ads.redexgen.core.RE.A02;
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
