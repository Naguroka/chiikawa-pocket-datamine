package com.applovin.mediation.ads;

/* JADX INFO: loaded from: classes3.dex */
public class MaxInterstitialAd implements com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b {
    private static java.lang.ref.WeakReference b = new java.lang.ref.WeakReference(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.ads.MaxFullscreenAdImpl f1586a;

    public MaxInterstitialAd(java.lang.String str, android.content.Context context) {
        this(str, com.applovin.sdk.AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.f1586a.logApiCall("destroy()");
        this.f1586a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b
    public android.app.Activity getActivity() {
        this.f1586a.logApiCall("getActivity()");
        return (android.app.Activity) b.get();
    }

    public java.lang.String getAdUnitId() {
        return this.f1586a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f1586a.isReady();
        this.f1586a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f1586a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f1586a.logApiCall("loadAd()");
        this.f1586a.loadAd();
    }

    public void setAdReviewListener(com.applovin.mediation.MaxAdReviewListener maxAdReviewListener) {
        this.f1586a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f1586a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(com.applovin.mediation.MaxAdExpirationListener maxAdExpirationListener) {
        this.f1586a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f1586a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(java.lang.String str, java.lang.String str2) {
        this.f1586a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f1586a.setExtraParameter(str, str2);
    }

    public void setListener(com.applovin.mediation.MaxAdListener maxAdListener) {
        this.f1586a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f1586a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(java.lang.String str, java.lang.Object obj) {
        this.f1586a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f1586a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(com.applovin.mediation.MaxAdRequestListener maxAdRequestListener) {
        this.f1586a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f1586a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(com.applovin.mediation.MaxAdRevenueListener maxAdRevenueListener) {
        this.f1586a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f1586a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(android.app.Activity activity) {
        showAd((java.lang.String) null, activity);
    }

    public java.lang.String toString() {
        return "" + this.f1586a;
    }

    public MaxInterstitialAd(java.lang.String str, com.applovin.sdk.AppLovinSdk appLovinSdk, android.content.Context context) {
        com.applovin.impl.mediation.ads.a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str == null) {
            throw new java.lang.IllegalArgumentException("No ad unit ID specified");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Empty ad unit ID specified");
        }
        if (context == null) {
            throw new java.lang.IllegalArgumentException("No context specified");
        }
        if (appLovinSdk == null) {
            throw new java.lang.IllegalArgumentException("No sdk specified");
        }
        if (context instanceof android.app.Activity) {
            b = new java.lang.ref.WeakReference((android.app.Activity) context);
        }
        this.f1586a = new com.applovin.impl.mediation.ads.MaxFullscreenAdImpl(str.trim(), com.applovin.mediation.MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.a(), context);
    }

    public void showAd(java.lang.String str, android.app.Activity activity) {
        showAd(str, (java.lang.String) null, activity);
    }

    public void showAd(java.lang.String str, java.lang.String str2, android.app.Activity activity) {
        this.f1586a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", activity=" + activity + ")");
        com.applovin.impl.yp.b(str2, "MaxInterstitialAd");
        this.f1586a.showAd(str, str2, activity);
    }

    public void showAd(android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.app.Activity activity) {
        showAd((java.lang.String) null, viewGroup, lifecycle, activity);
    }

    public void showAd(java.lang.String str, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.app.Activity activity) {
        showAd(str, null, viewGroup, lifecycle, activity);
    }

    public void showAd(java.lang.String str, java.lang.String str2, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.app.Activity activity) {
        this.f1586a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + lifecycle + ", activity=" + activity + ")");
        this.f1586a.showAd(str, str2, viewGroup, lifecycle, activity);
    }

    @java.lang.Deprecated
    public void showAd() {
        showAd((java.lang.String) null);
    }

    @java.lang.Deprecated
    public void showAd(java.lang.String str) {
        showAd(str, (java.lang.String) null);
    }

    @java.lang.Deprecated
    public void showAd(java.lang.String str, java.lang.String str2) {
        this.f1586a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        com.applovin.impl.yp.b(str2, "MaxInterstitialAd");
        this.f1586a.showAd(str, str2, getActivity());
    }

    @java.lang.Deprecated
    public void showAd(android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle) {
        showAd((java.lang.String) null, viewGroup, lifecycle);
    }

    @java.lang.Deprecated
    public void showAd(java.lang.String str, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle) {
        showAd(str, (java.lang.String) null, viewGroup, lifecycle);
    }

    @java.lang.Deprecated
    public void showAd(java.lang.String str, java.lang.String str2, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle) {
        this.f1586a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + lifecycle + ")");
        this.f1586a.showAd(str, str2, viewGroup, lifecycle, getActivity());
    }
}
