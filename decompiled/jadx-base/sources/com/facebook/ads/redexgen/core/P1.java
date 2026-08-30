package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class P1 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.UQ A00;

    public P1(com.facebook.ads.redexgen.core.UQ uq) {
        this.A00 = uq;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
        this.A00.A0A.getLayoutParams().height = num.intValue();
        this.A00.A0A.requestLayout();
    }
}
