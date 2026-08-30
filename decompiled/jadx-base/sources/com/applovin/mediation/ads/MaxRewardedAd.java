package com.applovin.mediation.ads;

/* JADX INFO: loaded from: classes3.dex */
public class MaxRewardedAd implements com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b {
    private static final java.util.Map b = new java.util.HashMap();
    private static final java.lang.Object c = new java.lang.Object();
    private static java.lang.ref.WeakReference d = new java.lang.ref.WeakReference(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.ads.MaxFullscreenAdImpl f1587a;

    private MaxRewardedAd(java.lang.String str, com.applovin.sdk.AppLovinSdk appLovinSdk, android.content.Context context) {
        this.f1587a = new com.applovin.impl.mediation.ads.MaxFullscreenAdImpl(str.trim(), com.applovin.mediation.MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.a(), context);
    }

    public static com.applovin.mediation.ads.MaxRewardedAd getInstance(java.lang.String str, android.content.Context context) {
        return getInstance(str, com.applovin.sdk.AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.f1587a.logApiCall("destroy()");
        synchronized (c) {
            b.remove(this.f1587a.getAdUnitId());
        }
        this.f1587a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b
    public android.app.Activity getActivity() {
        this.f1587a.logApiCall("getActivity()");
        return (android.app.Activity) d.get();
    }

    public java.lang.String getAdUnitId() {
        return this.f1587a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f1587a.isReady();
        this.f1587a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f1587a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f1587a.logApiCall("loadAd()");
        this.f1587a.loadAd();
    }

    public void setAdReviewListener(com.applovin.mediation.MaxAdReviewListener maxAdReviewListener) {
        this.f1587a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f1587a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(com.applovin.mediation.MaxAdExpirationListener maxAdExpirationListener) {
        this.f1587a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f1587a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(java.lang.String str, java.lang.String str2) {
        this.f1587a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f1587a.setExtraParameter(str, str2);
    }

    public void setListener(com.applovin.mediation.MaxRewardedAdListener maxRewardedAdListener) {
        this.f1587a.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f1587a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(java.lang.String str, java.lang.Object obj) {
        this.f1587a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f1587a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(com.applovin.mediation.MaxAdRequestListener maxAdRequestListener) {
        this.f1587a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f1587a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(com.applovin.mediation.MaxAdRevenueListener maxAdRevenueListener) {
        this.f1587a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f1587a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(android.app.Activity activity) {
        showAd((java.lang.String) null, activity);
    }

    public java.lang.String toString() {
        return "" + this.f1587a;
    }

    public static com.applovin.mediation.ads.MaxRewardedAd getInstance(java.lang.String str, com.applovin.sdk.AppLovinSdk appLovinSdk, android.content.Context context) {
        com.applovin.impl.mediation.ads.a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
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
            d = new java.lang.ref.WeakReference((android.app.Activity) context);
        }
        synchronized (c) {
            java.util.Map map = b;
            com.applovin.mediation.ads.MaxRewardedAd maxRewardedAd = (com.applovin.mediation.ads.MaxRewardedAd) map.get(str);
            if (maxRewardedAd != null) {
                return maxRewardedAd;
            }
            com.applovin.mediation.ads.MaxRewardedAd maxRewardedAd2 = new com.applovin.mediation.ads.MaxRewardedAd(str, appLovinSdk, context);
            map.put(str, maxRewardedAd2);
            return maxRewardedAd2;
        }
    }

    public void showAd(java.lang.String str, android.app.Activity activity) {
        showAd(str, (java.lang.String) null, activity);
    }

    public void showAd(java.lang.String str, java.lang.String str2, android.app.Activity activity) {
        this.f1587a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", activity=" + activity + ")");
        com.applovin.impl.yp.b(str2, "MaxRewardedAd");
        this.f1587a.showAd(str, str2, activity);
    }

    public void showAd(android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.app.Activity activity) {
        showAd((java.lang.String) null, viewGroup, lifecycle, activity);
    }

    public void showAd(java.lang.String str, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.app.Activity activity) {
        showAd(str, null, viewGroup, lifecycle, activity);
    }

    public void showAd(java.lang.String str, java.lang.String str2, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.app.Activity activity) {
        this.f1587a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + lifecycle + ", activity=" + activity + ")");
        this.f1587a.showAd(str, str2, viewGroup, lifecycle, activity);
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
        this.f1587a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        com.applovin.impl.yp.b(str2, "MaxRewardedAd");
        this.f1587a.showAd(str, str2, getActivity());
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
        this.f1587a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + lifecycle + ")");
        this.f1587a.showAd(str, str2, viewGroup, lifecycle, getActivity());
    }
}
