package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Py, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0949Py extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ com.facebook.ads.redexgen.core.A6 A00;
    public final /* synthetic */ boolean A01;

    public C0949Py(com.facebook.ads.redexgen.core.A6 a6, boolean z) {
        this.A00 = a6;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0H.setTranslationY(0.0f);
        this.A00.A0T();
        if (!this.A01 && this.A00.A0G != null) {
            this.A00.A0G.destroy();
        }
    }
}
