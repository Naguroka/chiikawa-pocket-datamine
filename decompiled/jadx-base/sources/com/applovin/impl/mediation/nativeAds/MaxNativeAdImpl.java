package com.applovin.impl.mediation.nativeAds;

/* JADX INFO: loaded from: classes3.dex */
public class MaxNativeAdImpl {
    private com.applovin.impl.mediation.ads.b adViewTracker;
    private java.util.List<android.view.View> clickableViews;

    public com.applovin.impl.mediation.ads.b getAdViewTracker() {
        return this.adViewTracker;
    }

    public java.util.List<android.view.View> getClickableViews() {
        return this.clickableViews;
    }

    public void setAdViewTracker(com.applovin.impl.mediation.ads.b bVar) {
        this.adViewTracker = bVar;
    }

    public void setClickableViews(java.util.List<android.view.View> list) {
        this.clickableViews = list;
    }
}
