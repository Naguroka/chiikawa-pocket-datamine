package com.applovin.impl.sdk.nativeAd;

/* JADX INFO: loaded from: classes3.dex */
public interface AppLovinNativeAd {
    void destroy();

    long getAdIdNumber();

    java.lang.String getAdvertiser();

    java.lang.String getBody();

    java.lang.String getCallToAction();

    android.net.Uri getIconUri();

    com.applovin.impl.sdk.nativeAd.AppLovinMediaView getMediaView();

    com.applovin.impl.sdk.nativeAd.AppLovinOptionsView getOptionsView();

    java.lang.Double getStarRating();

    java.lang.String getTitle();

    void registerViewsForInteraction(java.util.List<android.view.View> list, android.view.ViewGroup viewGroup);

    void unregisterViewsForInteraction();
}
