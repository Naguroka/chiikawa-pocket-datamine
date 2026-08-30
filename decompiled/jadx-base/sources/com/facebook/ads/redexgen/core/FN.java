package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FN extends com.facebook.ads.redexgen.core.C1260as {
    public final /* synthetic */ com.facebook.ads.redexgen.core.FM A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FN(com.facebook.ads.redexgen.core.FM fm, android.content.Context context) {
        super(context);
        this.A00 = fm;
    }

    @Override // com.facebook.ads.redexgen.core.C1260as, com.facebook.ads.redexgen.core.AnonymousClass51
    public final void A0I(android.view.View view, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.C04444z c04444z) {
        int[] iArrA0H = this.A00.A0H(((com.facebook.ads.redexgen.core.AbstractC1246ad) this.A00).A00.getLayoutManager(), view);
        int time = iArrA0H[0];
        int dy = iArrA0H[1];
        int dx = A0M(java.lang.Math.max(java.lang.Math.abs(time), java.lang.Math.abs(dy)));
        if (dx > 0) {
            c04444z.A04(time, dy, dx, ((com.facebook.ads.redexgen.core.C1260as) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C1260as
    public final float A0J(android.util.DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.core.C1260as
    public final int A0L(int i) {
        return java.lang.Math.min(100, super.A0L(i));
    }
}
