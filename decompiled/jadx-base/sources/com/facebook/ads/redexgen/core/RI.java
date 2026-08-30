package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RI implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ android.view.View A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0869Mw A01;

    public RI(com.facebook.ads.redexgen.core.C0869Mw c0869Mw, android.view.View view) {
        this.A01 = c0869Mw;
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int iIntValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        android.view.ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
        layoutParams.height = iIntValue;
        this.A00.setLayoutParams(layoutParams);
    }
}
