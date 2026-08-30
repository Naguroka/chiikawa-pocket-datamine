package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C5Y implements com.facebook.ads.internal.api.AdComponentViewApi {
    public com.facebook.ads.internal.api.AdComponentView A00;
    public com.facebook.ads.internal.api.AdComponentViewParentApi A01;
    public com.facebook.ads.internal.api.AdComponentViewParentApi A02;
    public boolean A03;

    public final void A00(com.facebook.ads.internal.api.AdComponentViewApi adComponentViewApi) {
        this.A02 = adComponentViewApi;
        ((com.facebook.ads.internal.api.AdComponentViewApi) this.A02).onAttachedToView(this.A00, this.A01);
    }

    public final void A01(boolean z) {
        this.A03 = z;
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(android.view.View view) {
        if (!this.A03) {
            this.A02.addView(view);
        }
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(android.view.View view, int i) {
        if (!this.A03) {
            this.A02.addView(view, i);
        }
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(android.view.View view, int i, int i2) {
        if (!this.A03) {
            this.A02.addView(view, i, i2);
        }
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        this.A02.addView(view, i, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
    public final void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!this.A03) {
            this.A02.addView(view, layoutParams);
        }
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void bringChildToFront(android.view.View view) {
        this.A02.bringChildToFront(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApi
    public void onAttachedToView(com.facebook.ads.internal.api.AdComponentView adComponentView, com.facebook.ads.internal.api.AdComponentViewParentApi adComponentViewParentApi) {
        this.A01 = adComponentViewParentApi;
        this.A00 = adComponentView;
        this.A02 = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onAttachedToWindow() {
        this.A02.onAttachedToWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onDetachedFromWindow() {
        this.A02.onDetachedFromWindow();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onMeasure(int i, int i2) {
        this.A02.onMeasure(i, i2);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onVisibilityChanged(android.view.View view, int i) {
        this.A02.onVisibilityChanged(view, i);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void onWindowFocusChanged(boolean z) {
        this.A02.onWindowFocusChanged(z);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        this.A02.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void setMeasuredDimension(int i, int i2) {
        this.A02.setMeasuredDimension(i, i2);
    }
}
