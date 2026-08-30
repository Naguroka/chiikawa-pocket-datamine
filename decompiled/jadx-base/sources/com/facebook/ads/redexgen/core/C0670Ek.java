package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0670Ek extends com.facebook.ads.redexgen.core.C1228aL {
    public com.facebook.ads.redexgen.core.InterfaceC0957Qg A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A04(com.facebook.ads.NativeAdLayout nativeAdLayout, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.redexgen.core.JW jw) {
        com.facebook.ads.redexgen.core.OU ou = new com.facebook.ads.redexgen.core.OU(c1199Zs);
        com.facebook.ads.MediaView mediaView = new com.facebook.ads.MediaView(c1199Zs);
        com.facebook.ads.AdOptionsView adOptionsView = new com.facebook.ads.AdOptionsView(c1199Zs, nativeAd, nativeAdLayout);
        jw.A09(adOptionsView, 28);
        this.A00 = new com.facebook.ads.redexgen.core.TE(c1199Zs, nativeAd, jw, com.facebook.ads.redexgen.core.W7.A0L(nativeAd.getInternalNativeAd()).A17(), ou, mediaView, adOptionsView);
        com.facebook.ads.redexgen.core.M3.A0M(nativeAdLayout, jw.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, ou, this.A00.getViewsForInteraction());
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
