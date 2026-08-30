package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0870Mx implements com.facebook.ads.redexgen.core.RF {
    public android.graphics.drawable.TransitionDrawable A00;
    public android.graphics.drawable.TransitionDrawable A01;
    public final int A03;
    public final android.graphics.drawable.Drawable A04;
    public final android.graphics.drawable.Drawable A05;
    public final android.view.View A07;
    public final android.os.Handler A06 = new android.os.Handler();
    public com.facebook.ads.redexgen.core.RE A02 = com.facebook.ads.redexgen.core.RE.A04;

    public C0870Mx(android.view.View view, int i, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        this.A03 = i;
        this.A07 = view;
        this.A05 = drawable;
        this.A04 = drawable2;
        this.A01 = new android.graphics.drawable.TransitionDrawable(new android.graphics.drawable.Drawable[]{drawable, drawable2});
        this.A01.setCrossFadeEnabled(true);
        this.A00 = new android.graphics.drawable.TransitionDrawable(new android.graphics.drawable.Drawable[]{drawable2, drawable});
        this.A00.setCrossFadeEnabled(true);
        com.facebook.ads.redexgen.core.M3.A0S(this.A07, this.A01);
    }

    private void A04(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = com.facebook.ads.redexgen.core.RE.A05;
            com.facebook.ads.redexgen.core.M3.A0S(this.A07, this.A00);
            this.A00.startTransition(this.A03);
            this.A06.postDelayed(new com.facebook.ads.redexgen.core.C0871My(this), this.A03);
            return;
        }
        com.facebook.ads.redexgen.core.M3.A0S(this.A07, this.A05);
        this.A02 = com.facebook.ads.redexgen.core.RE.A04;
    }

    private void A05(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = com.facebook.ads.redexgen.core.RE.A03;
            com.facebook.ads.redexgen.core.M3.A0S(this.A07, this.A01);
            this.A01.startTransition(this.A03);
            this.A06.postDelayed(new com.facebook.ads.redexgen.core.N0(this), this.A03);
            return;
        }
        com.facebook.ads.redexgen.core.M3.A0S(this.A07, this.A04);
        this.A02 = com.facebook.ads.redexgen.core.RE.A02;
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final void A3u(boolean z, boolean z2) {
        if (z2) {
            A04(z);
        } else {
            A05(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final com.facebook.ads.redexgen.core.RE A8Q() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final void cancel() {
        com.facebook.ads.redexgen.core.RE re;
        this.A06.removeCallbacksAndMessages(null);
        this.A01.resetTransition();
        this.A00.resetTransition();
        if (this.A02 == com.facebook.ads.redexgen.core.RE.A03) {
            re = com.facebook.ads.redexgen.core.RE.A04;
        } else {
            re = com.facebook.ads.redexgen.core.RE.A02;
        }
        this.A02 = re;
    }
}
