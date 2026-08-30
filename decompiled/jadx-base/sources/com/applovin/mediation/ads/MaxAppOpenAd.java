package com.applovin.mediation.ads;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAppOpenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.ads.MaxFullscreenAdImpl f1585a;

    public MaxAppOpenAd(java.lang.String str, android.content.Context context) {
        this(str, com.applovin.sdk.AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.f1585a.logApiCall("destroy()");
        this.f1585a.destroy();
    }

    public java.lang.String getAdUnitId() {
        return this.f1585a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f1585a.isReady();
        this.f1585a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f1585a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f1585a.logApiCall("loadAd()");
        this.f1585a.loadAd();
    }

    public void setAdReviewListener(com.applovin.mediation.MaxAdReviewListener maxAdReviewListener) {
        this.f1585a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f1585a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(com.applovin.mediation.MaxAdExpirationListener maxAdExpirationListener) {
        this.f1585a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f1585a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(java.lang.String str, java.lang.String str2) {
        this.f1585a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f1585a.setExtraParameter(str, str2);
    }

    public void setListener(com.applovin.mediation.MaxAdListener maxAdListener) {
        this.f1585a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f1585a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(java.lang.String str, java.lang.Object obj) {
        this.f1585a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f1585a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(com.applovin.mediation.MaxAdRequestListener maxAdRequestListener) {
        this.f1585a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f1585a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(com.applovin.mediation.MaxAdRevenueListener maxAdRevenueListener) {
        this.f1585a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f1585a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public java.lang.String toString() {
        return "" + this.f1585a;
    }

    public MaxAppOpenAd(java.lang.String str, com.applovin.sdk.AppLovinSdk appLovinSdk) {
        this(str, appLovinSdk, com.applovin.impl.sdk.j.m());
    }

    public void showAd(java.lang.String str) {
        showAd(str, null);
    }

    private MaxAppOpenAd(java.lang.String str, com.applovin.sdk.AppLovinSdk appLovinSdk, android.content.Context context) {
        com.applovin.impl.mediation.ads.a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        this.f1585a = new com.applovin.impl.mediation.ads.MaxFullscreenAdImpl(str.trim(), com.applovin.mediation.MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.a(), context);
    }

    public void showAd(java.lang.String str, java.lang.String str2) {
        this.f1585a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        com.applovin.impl.yp.b(str2, "MaxAppOpenAd");
        this.f1585a.showAd(str, str2, null);
    }
}
