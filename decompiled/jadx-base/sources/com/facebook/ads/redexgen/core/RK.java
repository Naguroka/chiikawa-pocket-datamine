package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RK extends android.animation.AnimatorListenerAdapter {
    public static java.lang.String[] A01 = {"GafIPb7LWAiViAmPwlKEWLDLjss8g6Ws", "GmgIBltz4NMSrZrLjhCSQUR2lVK3nFE3", "EM6stZgjBHDzdWE7fS4BkrJy", "N0axt6y48e2BEk8smmzy4ee5", "dltbLtM4ojsXN2KUcmFBCOrEHNkSvQMG", "uja4KtsxSl5i0Xy4u8CYRakEDe0zRqlk", "vzw9JeJO1xcQXP0eAZjCAk8tucW9kQEs", "5sufJRWLYSrz8Qvpedy6kGMFzpd6V4cT"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0868Mv A00;

    public RK(com.facebook.ads.redexgen.core.C0868Mv c0868Mv) {
        this.A00 = c0868Mv;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        if (this.A00.A04) {
            com.facebook.ads.redexgen.core.M3.A0L(this.A00.A03);
        }
        this.A00.A03.setAlpha(1.0f);
        this.A00.A01 = com.facebook.ads.redexgen.core.RE.A02;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            java.lang.String[] strArr = A01;
            if (strArr[2].length() != strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[7] = "SL0VqGGoYjOg4No5xWkpM0ju1xWwOnF6";
            this.A00.A00 = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (this.A00.A04) {
            com.facebook.ads.redexgen.core.M3.A0H(this.A00.A03);
        }
        this.A00.A01 = com.facebook.ads.redexgen.core.RE.A04;
        java.lang.String[] strArr = A01;
        if (strArr[4].charAt(13) == strArr[1].charAt(13)) {
            throw new java.lang.RuntimeException();
        }
        A01[7] = "UFxXeO2yYsCLDJeld9s6oynUImAPkk9q";
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }
}
