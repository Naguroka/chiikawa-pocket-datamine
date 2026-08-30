package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FK extends com.facebook.ads.redexgen.core.C1228aL {
    public com.facebook.ads.redexgen.core.InterfaceC0957Qg A00;

    public final void A04(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.redexgen.core.JW jw, com.facebook.ads.NativeAdLayout nativeAdLayout) {
        com.facebook.ads.MediaView mediaView = new com.facebook.ads.MediaView(nativeAdLayout.getContext());
        com.facebook.ads.AdOptionsView adOptionsView = new com.facebook.ads.AdOptionsView(nativeAdLayout.getContext(), nativeBannerAd, nativeAdLayout);
        jw.A09(adOptionsView, 20);
        this.A00 = new com.facebook.ads.redexgen.core.TF(c1199Zs, nativeBannerAd, jw, com.facebook.ads.redexgen.core.W7.A0L(nativeBannerAd.getInternalNativeAd()).A17(), mediaView, adOptionsView);
        com.facebook.ads.redexgen.core.M3.A0M(nativeAdLayout, jw.A00());
        nativeBannerAd.registerViewForInteraction(nativeAdLayout, mediaView, this.A00.getViewsForInteraction());
        android.widget.FrameLayout.LayoutParams contentParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        contentParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), contentParams);
    }

    @Override // com.facebook.ads.redexgen.core.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
