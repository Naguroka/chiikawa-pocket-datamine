package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1088Vh extends com.facebook.ads.redexgen.core.M2 {
    public final /* synthetic */ android.view.View A00;
    public final /* synthetic */ android.view.animation.ScaleAnimation A01;

    public C1088Vh(android.view.View view, android.view.animation.ScaleAnimation scaleAnimation) {
        this.A00 = view;
        this.A01 = scaleAnimation;
    }

    @Override // com.facebook.ads.redexgen.core.M2, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        this.A00.startAnimation(this.A01);
    }
}
