package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Th, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1036Th extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.Q6 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.Q7 A01;

    public C1036Th(com.facebook.ads.redexgen.core.Q7 q7, com.facebook.ads.redexgen.core.Q6 q6) {
        this.A01 = q7;
        this.A00 = q6;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new android.view.animation.AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new com.facebook.ads.redexgen.core.C1037Ti(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
