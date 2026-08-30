package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0677Fa extends com.facebook.ads.redexgen.core.C1273b6 {
    @Override // com.facebook.ads.redexgen.core.C3S
    public final int A03(android.view.View view) {
        return view.getImportantForAccessibility();
    }

    @Override // com.facebook.ads.redexgen.core.C3S
    public final int A05(android.view.View view) {
        return view.getMinimumHeight();
    }

    @Override // com.facebook.ads.redexgen.core.C3S
    public final int A06(android.view.View view) {
        return view.getMinimumWidth();
    }

    @Override // com.facebook.ads.redexgen.core.C3S
    public final void A0A(android.view.View view) {
        view.postInvalidateOnAnimation();
    }

    @Override // com.facebook.ads.redexgen.core.C3S
    public void A0C(android.view.View view, int i) {
        if (i == 4) {
            i = 2;
        }
        view.setImportantForAccessibility(i);
    }

    @Override // com.facebook.ads.redexgen.core.C3S
    public final void A0D(android.view.View view, android.graphics.drawable.Drawable drawable) {
        view.setBackground(drawable);
    }

    @Override // com.facebook.ads.redexgen.core.C3S
    public final void A0G(android.view.View view, java.lang.Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Override // com.facebook.ads.redexgen.core.C3S
    public final void A0H(android.view.View view, java.lang.Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    @Override // com.facebook.ads.redexgen.core.C3S
    public final boolean A0I(android.view.View view) {
        return view.hasTransientState();
    }
}
