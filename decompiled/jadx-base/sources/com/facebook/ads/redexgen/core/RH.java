package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RH implements android.animation.Animator.AnimatorListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0869Mw A00;

    public RH(com.facebook.ads.redexgen.core.C0869Mw c0869Mw) {
        this.A00 = c0869Mw;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.A00.A08(false);
        if (this.A00.A01 != null) {
            this.A00.A01.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.A00.A02 = com.facebook.ads.redexgen.core.RE.A04;
        com.facebook.ads.redexgen.core.M3.A0H(this.A00.A05);
        if (this.A00.A01 != null) {
            this.A00.A01.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
