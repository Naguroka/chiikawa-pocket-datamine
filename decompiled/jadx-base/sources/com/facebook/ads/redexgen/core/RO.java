package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RO implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ android.view.View A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.M9 A01;

    public RO(com.facebook.ads.redexgen.core.M9 m9, android.view.View view) {
        this.A01 = m9;
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int value = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        this.A00.setTranslationY(value);
    }
}
