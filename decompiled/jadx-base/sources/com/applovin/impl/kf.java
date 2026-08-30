package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class kf implements com.applovin.mediation.MaxAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f960a;
    private final com.applovin.mediation.MaxAdFormat b;
    private final java.lang.String c;

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getAdReviewCreativeId() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getAdValue(java.lang.String str) {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getAdValue(java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getCreativeId() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getDspId() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getDspName() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public com.applovin.mediation.nativeAds.MaxNativeAd getNativeAd() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getNetworkName() {
        return "";
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getNetworkPlacement() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return 0L;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        return 0.0d;
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getRevenuePrecision() {
        return com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN;
    }

    @Override // com.applovin.mediation.MaxAd
    public com.applovin.mediation.MaxAdWaterfallInfo getWaterfall() {
        return new com.applovin.impl.mediation.MaxAdWaterfallInfoImpl(null, "", "", 0L, new java.util.ArrayList(), java.util.Collections.EMPTY_LIST, "");
    }

    public java.lang.String toString() {
        return "MaxAd{adUnitId=" + this.f960a + ", format=" + this.b + "}";
    }

    public kf(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str2) {
        this.f960a = str;
        this.b = maxAdFormat;
        this.c = str2;
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getAdUnitId() {
        return this.f960a;
    }

    @Override // com.applovin.mediation.MaxAd
    public com.applovin.mediation.MaxAdFormat getFormat() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getPlacement() {
        return this.c;
    }

    @Override // com.applovin.mediation.MaxAd
    public com.applovin.sdk.AppLovinSdkUtils.Size getSize() {
        return getFormat().getSize();
    }
}
