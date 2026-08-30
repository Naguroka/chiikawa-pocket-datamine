package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RL implements android.animation.Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0867Mu A02;

    public RL(com.facebook.ads.redexgen.core.C0867Mu c0867Mu, int i, int i2) {
        this.A02 = c0867Mu;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.A02.A07(this.A00, this.A01, false);
        if (this.A02.A00 != null) {
            this.A02.A00.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        com.facebook.ads.redexgen.core.RE re;
        com.facebook.ads.redexgen.core.C0867Mu c0867Mu = this.A02;
        if (this.A01 == this.A02.A04) {
            re = com.facebook.ads.redexgen.core.RE.A02;
        } else {
            re = com.facebook.ads.redexgen.core.RE.A04;
        }
        c0867Mu.A01 = re;
        if (this.A02.A00 != null) {
            this.A02.A00.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
