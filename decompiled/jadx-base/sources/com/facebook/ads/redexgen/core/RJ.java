package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RJ extends android.animation.AnimatorListenerAdapter {
    public static java.lang.String[] A01 = {"TrZNDxp7XgPrLwMeMcKKV4LE6uuIfYVU", "ULEyXJCc47teQ6YZ0eXPV0V7C", "At5pbwNHr2LiheLI", "DEC0Eom9qK7OI0oKL1WQ5oYEbz9lc5Gt", "Go2f3K9Z", "jmF0Wp1VVfzp13IVqL", "AKLTgtcpjio1lTTBDL2vrOjYxOjCOJfp", "yZ5UHZcmQhcxGg9JLD5yPnSTYa225zYb"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0868Mv A00;

    public RJ(com.facebook.ads.redexgen.core.C0868Mv c0868Mv) {
        this.A00 = c0868Mv;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        if (this.A00.A04) {
            com.facebook.ads.redexgen.core.M3.A0H(this.A00.A03);
        }
        com.facebook.ads.redexgen.core.C0868Mv c0868Mv = this.A00;
        if (A01[5].length() == 4) {
            throw new java.lang.RuntimeException();
        }
        A01[2] = "6jsFEd17ts6f8PQH6w";
        c0868Mv.A03.setAlpha(0.0f);
        this.A00.A01 = com.facebook.ads.redexgen.core.RE.A04;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.A00.A01 = com.facebook.ads.redexgen.core.RE.A02;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }
}
