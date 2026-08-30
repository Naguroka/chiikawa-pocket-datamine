package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0869Mw implements com.facebook.ads.redexgen.core.RF {
    public int A00;
    public android.animation.ValueAnimator A01;
    public com.facebook.ads.redexgen.core.RE A02 = com.facebook.ads.redexgen.core.RE.A04;
    public final int A03;
    public final int A04;
    public final android.view.View A05;

    public C0869Mw(android.view.View view, int i, int i2, int i3) {
        this.A05 = view;
        this.A03 = i;
        this.A00 = i2;
        this.A04 = i3;
    }

    private android.animation.ValueAnimator A00(int i, int i2, android.view.View view) {
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(this.A03);
        valueAnimatorOfInt.addUpdateListener(new com.facebook.ads.redexgen.core.RI(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z) {
        if (z) {
            this.A02 = com.facebook.ads.redexgen.core.RE.A05;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new com.facebook.ads.redexgen.core.RH(this));
            this.A01.start();
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        com.facebook.ads.redexgen.core.M3.A0H(this.A05);
        this.A02 = com.facebook.ads.redexgen.core.RE.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        com.facebook.ads.redexgen.core.M3.A0L(this.A05);
        if (z) {
            this.A02 = com.facebook.ads.redexgen.core.RE.A03;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new com.facebook.ads.redexgen.core.RG(this));
            this.A01.start();
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = com.facebook.ads.redexgen.core.RE.A02;
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final void A3u(boolean z, boolean z2) {
        if (z2) {
            A07(z);
        } else {
            A08(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final com.facebook.ads.redexgen.core.RE A8Q() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final void cancel() {
        if (this.A01 != null) {
            this.A01.cancel();
        }
    }
}
