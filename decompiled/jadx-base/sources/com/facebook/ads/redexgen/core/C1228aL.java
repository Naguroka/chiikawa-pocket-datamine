package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1228aL extends com.facebook.ads.redexgen.core.C5Y implements com.facebook.ads.internal.api.NativeAdLayoutApi {
    public android.view.View A02;
    public com.facebook.ads.NativeAdLayout A03;
    public int A01 = 0;
    public int A00 = 0;

    public final void A02() {
        com.facebook.ads.redexgen.core.M3.A0T(this.A03);
        this.A03.removeView(this.A02);
        this.A02 = null;
    }

    public final void A03(com.facebook.ads.redexgen.core.NE ne) {
        this.A02 = ne;
        ne.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        com.facebook.ads.redexgen.core.M3.A0T(this.A03);
        this.A03.addView(this.A02);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final com.facebook.ads.internal.api.AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void initialize(com.facebook.ads.NativeAdLayout nativeAdLayout) {
        this.A03 = nativeAdLayout;
    }

    @Override // com.facebook.ads.redexgen.core.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00 > 0 && this.A03.getMeasuredWidth() > this.A00) {
            setMeasuredDimension(this.A00, this.A03.getMeasuredHeight());
        } else {
            if (this.A03.getMeasuredWidth() >= this.A01) {
                return;
            }
            setMeasuredDimension(this.A01, this.A03.getMeasuredHeight());
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void setMaxWidth(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.ads.internal.api.NativeAdLayoutApi
    public final void setMinWidth(int i) {
        this.A01 = i;
    }
}
