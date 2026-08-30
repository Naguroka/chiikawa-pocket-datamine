package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04555k implements com.facebook.ads.internal.api.NativeAdApi {
    public static java.lang.String[] A02 = {"Qf6uI4y6btMkRXvA96gvAPpQqYMeMLVQ", "xsH0pc0gEvMtYCBpu3k37P2MSYje76", "eIeN", "vYRtnf0lNdhCyq", "4", "0cPKH6qR821KJSq9ovGwsT1tt", "LdRpqMhVSgJGWZUoheR2iPgR57uht61Q", "hYjvJgOs8spNmgMi7B8jHFIGUAKFh9RM"};
    public final com.facebook.ads.NativeAd A00;
    public final com.facebook.ads.internal.api.NativeAdBaseApi A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, java.util.List<android.view.View> list) {
        registerViewForInteraction(view, mediaView, (com.facebook.ads.MediaView) null, list);
    }

    public C04555k(com.facebook.ads.NativeAd nativeAd, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
        com.facebook.ads.redexgen.core.W7.A0L(nativeAdBaseApi).A1a(com.facebook.ads.redexgen.core.EnumC0783Jl.A06);
    }

    public C04555k(com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
    }

    private com.facebook.ads.redexgen.core.W7 A00() {
        return com.facebook.ads.redexgen.core.W7.A0L(this.A01);
    }

    public final java.lang.String A01() {
        return A00().A1F();
    }

    public final java.lang.String A02() {
        return A00().A1G();
    }

    public final java.util.List<com.facebook.ads.NativeAd> A03() {
        if (A00().A1H() == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.facebook.ads.redexgen.core.W7 internalNativeAd : A00().A1H()) {
            arrayList.add(new com.facebook.ads.NativeAd(internalNativeAd.A11(), internalNativeAd));
        }
        return arrayList;
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final com.facebook.ads.NativeAd.AdCreativeType getAdCreativeType() {
        if (!android.text.TextUtils.isEmpty(A00().A1G())) {
            return com.facebook.ads.NativeAd.AdCreativeType.VIDEO;
        }
        if (A00().A1H() != null && !A00().A1H().isEmpty()) {
            return com.facebook.ads.NativeAd.AdCreativeType.CAROUSEL;
        }
        if (A00().getAdCoverImage() != null && !android.text.TextUtils.isEmpty(A00().getAdCoverImage().getUrl())) {
            com.facebook.ads.NativeAd.AdCreativeType adCreativeType = com.facebook.ads.NativeAd.AdCreativeType.IMAGE;
            if (A02[1].length() == 22) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[5] = "KhCZfMyUHPJBMWXSGegcdmWrt";
            strArr[3] = "8FosuavNBsKEQf";
            return adCreativeType;
        }
        return com.facebook.ads.NativeAd.AdCreativeType.UNKNOWN;
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final com.facebook.ads.VideoAutoplayBehavior getVideoAutoplayBehavior() {
        return com.facebook.ads.redexgen.core.JZ.A00(A00().A18());
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView) {
        registerViewForInteraction(view, mediaView, (com.facebook.ads.MediaView) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, android.widget.ImageView imageView) {
        registerViewForInteraction(view, mediaView, imageView, (java.util.List<android.view.View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, android.widget.ImageView imageView, java.util.List<android.view.View> clickableViews) {
        if (imageView != null) {
            com.facebook.ads.redexgen.core.C1199Zs c1199ZsA11 = A00().A11();
            com.facebook.ads.redexgen.core.C1199Zs downloadContext = com.facebook.ads.redexgen.core.C04465b.A03(imageView.getContext());
            downloadContext.A0K(c1199ZsA11);
            com.facebook.ads.redexgen.core.W7.A0j(A00().getAdIcon(), imageView, downloadContext);
        }
        registerViewForInteraction(view, mediaView, (com.facebook.ads.MediaView) null, clickableViews);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, com.facebook.ads.MediaView mediaView2) {
        registerViewForInteraction(view, mediaView, mediaView2, (java.util.List<android.view.View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, com.facebook.ads.MediaView mediaView2, java.util.List<android.view.View> list) {
        if (mediaView != null) {
            ((com.facebook.ads.redexgen.core.C1229aM) mediaView.getMediaViewApi()).A0L(this.A00);
        }
        if (mediaView2 != null) {
            ((com.facebook.ads.redexgen.core.C1229aM) mediaView2.getMediaViewApi()).A0M(this.A01, false);
        }
        if (list != null) {
            A00().A1O(view, mediaView, list);
            return;
        }
        com.facebook.ads.redexgen.core.W7 w7A00 = A00();
        java.lang.String[] strArr = A02;
        if (strArr[0].charAt(20) == strArr[7].charAt(20)) {
            throw new java.lang.RuntimeException();
        }
        A02[4] = "Y8dslRp9uWVtvGXxjU2U0Td790Xm7bcp";
        w7A00.A1N(view, mediaView);
    }
}
