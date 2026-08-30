package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnimationAnimationListenerC0850Md implements android.view.animation.Animation.AnimationListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C5Q A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.VP A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.VP A02;

    public AnimationAnimationListenerC0850Md(com.facebook.ads.redexgen.core.VP vp, com.facebook.ads.redexgen.core.VP vp2, com.facebook.ads.redexgen.core.C5Q c5q) {
        this.A01 = vp;
        this.A02 = vp2;
        this.A00 = c5q;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        this.A01.A04 = false;
        com.facebook.ads.redexgen.core.M3.A0H(this.A02);
        new android.os.Handler().postDelayed(new com.facebook.ads.redexgen.core.VS(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
    }
}
