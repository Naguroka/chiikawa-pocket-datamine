package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class M9 implements com.facebook.ads.redexgen.core.RF {
    public android.animation.ValueAnimator A00;
    public com.facebook.ads.redexgen.core.RE A01 = com.facebook.ads.redexgen.core.RE.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final android.view.View A05;

    public M9(android.view.View view, int i, int i2, int i3) {
        this.A05 = view;
        this.A02 = i;
        this.A04 = i2;
        this.A03 = i3;
    }

    private android.animation.ValueAnimator A00(android.view.View view, int i, int i2) {
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(this.A02);
        valueAnimatorOfInt.addUpdateListener(new com.facebook.ads.redexgen.core.RO(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A00 != null) {
            this.A00.removeAllListeners();
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        if (z) {
            this.A01 = com.facebook.ads.redexgen.core.RE.A05;
            this.A00 = A00(this.A05, this.A03, this.A04);
            this.A00.addListener(new com.facebook.ads.redexgen.core.RN(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        com.facebook.ads.redexgen.core.M3.A0H(this.A05);
        this.A01 = com.facebook.ads.redexgen.core.RE.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z) {
        com.facebook.ads.redexgen.core.M3.A0L(this.A05);
        if (z) {
            this.A01 = com.facebook.ads.redexgen.core.RE.A03;
            this.A00 = A00(this.A05, this.A04, this.A03);
            this.A00.addListener(new com.facebook.ads.redexgen.core.RM(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A03);
        this.A01 = com.facebook.ads.redexgen.core.RE.A02;
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final void A3u(boolean z, boolean z2) {
        if (z2) {
            A08(z);
        } else {
            A09(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final com.facebook.ads.redexgen.core.RE A8Q() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
