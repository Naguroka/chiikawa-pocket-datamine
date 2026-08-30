package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0868Mv implements com.facebook.ads.redexgen.core.RF {
    public android.view.ViewPropertyAnimator A00;
    public com.facebook.ads.redexgen.core.RE A01 = com.facebook.ads.redexgen.core.RE.A04;
    public final int A02;
    public final android.view.View A03;
    public final boolean A04;

    public C0868Mv(android.view.View view, int i, boolean z) {
        this.A02 = i;
        this.A03 = view;
        this.A04 = z;
    }

    private void A04(boolean z) {
        this.A01 = com.facebook.ads.redexgen.core.RE.A03;
        if (this.A04) {
            com.facebook.ads.redexgen.core.M3.A0L(this.A03);
        }
        if (!z) {
            this.A03.setAlpha(1.0f);
            this.A01 = com.facebook.ads.redexgen.core.RE.A02;
        } else {
            this.A00 = this.A03.animate().alpha(1.0f).setDuration(this.A02).setListener(new com.facebook.ads.redexgen.core.RJ(this));
        }
    }

    private void A05(boolean z) {
        this.A01 = com.facebook.ads.redexgen.core.RE.A05;
        if (!z) {
            this.A03.setAlpha(0.0f);
            this.A01 = com.facebook.ads.redexgen.core.RE.A04;
        } else {
            this.A00 = this.A03.animate().alpha(0.0f).setDuration(this.A02).setListener(new com.facebook.ads.redexgen.core.RK(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final void A3u(boolean z, boolean z2) {
        if (z2) {
            A05(z);
        } else {
            A04(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final com.facebook.ads.redexgen.core.RE A8Q() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final void cancel() {
        this.A03.clearAnimation();
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
