package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0867Mu implements com.facebook.ads.redexgen.core.RF {
    public static byte[] A06;
    public android.animation.ValueAnimator A00;
    public com.facebook.ads.redexgen.core.RE A01 = com.facebook.ads.redexgen.core.RE.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final android.view.View A05;

    static {
        A05();
    }

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 16);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{49, 32, kotlin.io.encoding.Base64.padSymbol, 49, 6, 42, 41, 42, 55};
    }

    public C0867Mu(android.view.View view, int i, int i2, int i3) {
        this.A02 = i;
        this.A05 = view;
        this.A04 = i2;
        this.A03 = i3;
    }

    private void A06(int i, int i2) {
        this.A01 = i == this.A04 ? com.facebook.ads.redexgen.core.RE.A03 : com.facebook.ads.redexgen.core.RE.A05;
        this.A00 = android.animation.ObjectAnimator.ofInt((android.widget.TextView) this.A05, A04(0, 9, 85), i, i2);
        this.A00.setEvaluator(new android.animation.ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new com.facebook.ads.redexgen.core.RL(this, i, i2));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i, int i2, boolean z) {
        if (z) {
            A06(i, i2);
        } else {
            ((android.widget.TextView) this.A05).setTextColor(i2);
            this.A01 = i2 == this.A03 ? com.facebook.ads.redexgen.core.RE.A02 : com.facebook.ads.redexgen.core.RE.A04;
        }
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final void A3u(boolean z, boolean z2) {
        int endColor = z2 ? this.A03 : this.A04;
        int startColor = z2 ? this.A04 : this.A03;
        A07(endColor, startColor, z);
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
