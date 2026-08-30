package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04595o implements com.facebook.ads.internal.api.NativeAdsManagerApi {
    public static java.lang.String[] A0A = {"gDYqLx0JK9708AoJnxJgyKqjnvDR", "XqufOA6aif4bGdY", "Su6jQEbJiG4f8aKvZwQ5GnKoGxisXaGJ", "amq5QC2giq7rrMPed26NLD1vQWHXorDG", "da4TAb4G8iALXV3W79mvavYrQ", "laLk", "uFxB7CH2AwGOjVY1RRN9", "Lrv7"};
    public static final java.lang.String A0B = com.facebook.ads.NativeAdsManager.class.getSimpleName();
    public com.facebook.ads.NativeAdsManager.Listener A01;
    public com.facebook.ads.redexgen.core.C1316bo A02;
    public java.lang.String A03;
    public final int A06;
    public final com.facebook.ads.redexgen.core.C1199Zs A07;
    public final java.lang.String A08;
    public final java.util.List<com.facebook.ads.NativeAd> A09;
    public int A00 = -1;
    public boolean A04 = false;
    public boolean A05 = false;

    public C04595o(android.content.Context context, java.lang.String str, int i) {
        this.A07 = com.facebook.ads.redexgen.core.C04465b.A03(context);
        this.A08 = str;
        this.A06 = java.lang.Math.max(i, 0);
        this.A09 = new java.util.ArrayList(i);
    }

    public final com.facebook.ads.NativeAdsManager.Listener A00() {
        return this.A01;
    }

    public final com.facebook.ads.redexgen.core.C1316bo A01() {
        return this.A02;
    }

    public final void A02() {
        this.A09.clear();
    }

    public final void A03(int i) {
        this.A00 = i;
    }

    public final void A04(com.facebook.ads.NativeAd nativeAd) {
        this.A09.add(nativeAd);
    }

    public final void A05(boolean z) {
        this.A04 = z;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void disableAutoRefresh() {
        this.A05 = true;
        if (this.A02 != null) {
            this.A02.A06();
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final int getUniqueNativeAdCount() {
        return this.A09.size();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final boolean isLoaded() {
        return this.A04;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds() {
        loadAds(com.facebook.ads.NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds(com.facebook.ads.NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        com.facebook.ads.redexgen.core.EnumC0783Jl enumC0783Jl = com.facebook.ads.redexgen.core.EnumC0783Jl.A06;
        int i = this.A06;
        com.facebook.ads.redexgen.core.C1316bo c1316bo = this.A02;
        this.A02 = new com.facebook.ads.redexgen.core.C1316bo(this.A07, this.A08, enumC0783Jl, null, i);
        if (this.A05) {
            this.A02.A06();
        }
        this.A02.A09(this.A03);
        this.A02.A08(new com.facebook.ads.redexgen.core.C1222aF(this, this.A07, mediaCacheFlag));
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final com.facebook.ads.NativeAd nextNativeAd() {
        return nextNativeAd(null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final com.facebook.ads.NativeAd nextNativeAd(com.facebook.ads.NativeAdListener nativeAdListener) {
        if (this.A09.size() == 0) {
            if (A0A[0].length() != 28) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0A;
            strArr[6] = "mJMTRUXqz4crzwTyllZM";
            strArr[4] = "KHUxr2V0BkfXxoUOzUh0cEJhB";
            return null;
        }
        int i = this.A00;
        this.A00 = i + 1;
        java.util.List<com.facebook.ads.NativeAd> list = this.A09;
        int pos = this.A09.size();
        com.facebook.ads.NativeAd nativeAd = list.get(i % pos);
        if (nativeAdListener != null) {
            ((com.facebook.ads.redexgen.core.W7) nativeAd.getInternalNativeAd()).A1T(nativeAd, nativeAdListener);
        }
        int pos2 = this.A09.size();
        if (i >= pos2) {
            return new com.facebook.ads.NativeAd(this.A07, nativeAd);
        }
        return nativeAd;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setExtraHints(java.lang.String str) {
        this.A03 = str;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setListener(com.facebook.ads.NativeAdsManager.Listener listener) {
        this.A01 = listener;
    }
}
