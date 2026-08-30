package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Px, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0948Px implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.A6 A00;

    public C0948Px(com.facebook.ads.redexgen.core.A6 a6) {
        this.A00 = a6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
        this.A00.A0Z.getLayoutParams().height = num.intValue();
        this.A00.A0Z.requestLayout();
    }
}
