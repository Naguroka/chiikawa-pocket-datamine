package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0849Mc extends com.facebook.ads.internal.api.AdNativeComponentView {
    public static final int A01 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 1.0f);
    public final android.widget.ImageView A00;

    public C0849Mc(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A00 = new com.facebook.ads.redexgen.core.C0872Mz(c1199Zs);
        this.A00.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        com.facebook.ads.redexgen.core.LU.A04(this.A00, com.facebook.ads.redexgen.core.LU.A0B);
        addView(this.A00, new android.view.ViewGroup.LayoutParams(-1, -1));
        com.facebook.ads.redexgen.core.M3.A0M(this.A00, -2130706433);
        setPadding(A01, A01, A01, A01);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public android.view.View getAdContentsView() {
        return this.A00;
    }

    public android.widget.ImageView getImageCardView() {
        return this.A00;
    }
}
