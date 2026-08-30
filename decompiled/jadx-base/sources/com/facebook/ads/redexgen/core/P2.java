package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class P2 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ com.facebook.ads.redexgen.core.UQ A00;
    public final /* synthetic */ boolean A01;

    public P2(com.facebook.ads.redexgen.core.UQ uq, boolean z) {
        this.A00 = uq;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0M.setTranslationY(0.0f);
        this.A00.A0U();
        if (!this.A01 && this.A00.A0J != null) {
            this.A00.A0J.destroy();
        }
        if (this.A00.A0g == null) {
            return;
        }
        this.A00.A0g.setVisibility(this.A01 ? 8 : 0);
    }
}
