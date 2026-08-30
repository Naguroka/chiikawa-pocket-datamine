package com.applovin.mediation.nativeAds;

/* JADX INFO: loaded from: classes3.dex */
public class MaxNativeAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl f1592a;

    public MaxNativeAdLoader(java.lang.String str, android.content.Context context) {
        this(str, com.applovin.sdk.AppLovinSdk.getInstance(context), context);
    }

    public void a(java.util.List<android.view.View> list, android.view.ViewGroup viewGroup, com.applovin.mediation.MaxAd maxAd) {
        this.f1592a.logApiCall("a()");
        this.f1592a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(com.applovin.mediation.MaxAd maxAd) {
        this.f1592a.logApiCall("b()");
        this.f1592a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.f1592a.logApiCall("destroy()");
        this.f1592a.destroy();
    }

    public java.lang.String getAdUnitId() {
        return this.f1592a.getAdUnitId();
    }

    public java.lang.String getPlacement() {
        this.f1592a.logApiCall("getPlacement()");
        return this.f1592a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public boolean render(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView, com.applovin.mediation.MaxAd maxAd) {
        this.f1592a.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f1592a.render(maxNativeAdView, maxAd);
    }

    public void setAdReviewListener(com.applovin.mediation.MaxAdReviewListener maxAdReviewListener) {
        this.f1592a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f1592a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(java.lang.String str) {
        this.f1592a.logApiCall("setCustomData(value=" + str + ")");
        this.f1592a.setCustomData(str);
    }

    public void setExtraParameter(java.lang.String str, java.lang.String str2) {
        this.f1592a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f1592a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(java.lang.String str, java.lang.Object obj) {
        this.f1592a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f1592a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(com.applovin.mediation.nativeAds.MaxNativeAdListener maxNativeAdListener) {
        this.f1592a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f1592a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(java.lang.String str) {
        this.f1592a.logApiCall("setPlacement(placement=" + str + ")");
        this.f1592a.setPlacement(str);
    }

    public void setRevenueListener(com.applovin.mediation.MaxAdRevenueListener maxAdRevenueListener) {
        this.f1592a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f1592a.setRevenueListener(maxAdRevenueListener);
    }

    public MaxNativeAdLoader(java.lang.String str, com.applovin.sdk.AppLovinSdk appLovinSdk, android.content.Context context) {
        com.applovin.impl.mediation.ads.a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str == null) {
            throw new java.lang.IllegalArgumentException("No ad unit ID specified");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Empty ad unit ID specified");
        }
        if (appLovinSdk == null) {
            throw new java.lang.IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new java.lang.IllegalArgumentException("No context specified");
        }
        this.f1592a = new com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl(str, appLovinSdk.a());
    }

    public void loadAd(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView) {
        this.f1592a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f1592a.loadAd(maxNativeAdView);
    }

    public void destroy(com.applovin.mediation.MaxAd maxAd) {
        this.f1592a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f1592a.destroy(maxAd);
    }
}
