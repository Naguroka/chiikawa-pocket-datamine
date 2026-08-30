package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public interface NativeAdBaseApi {
    com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(com.facebook.ads.NativeAdBase nativeAdBase);

    void destroy();

    void downloadMedia();

    java.lang.String getAdBodyText();

    java.lang.String getAdCallToAction();

    com.facebook.ads.internal.api.NativeAdImageApi getAdChoicesIcon();

    java.lang.String getAdChoicesImageUrl();

    java.lang.String getAdChoicesLinkUrl();

    java.lang.String getAdChoicesText();

    com.facebook.ads.internal.api.NativeAdImageApi getAdCoverImage();

    java.lang.String getAdHeadline();

    com.facebook.ads.internal.api.NativeAdImageApi getAdIcon();

    java.lang.String getAdLinkDescription();

    java.lang.String getAdSocialContext();

    @java.lang.Deprecated
    com.facebook.ads.internal.api.NativeAdRatingApi getAdStarRating();

    java.lang.String getAdTranslation();

    java.lang.String getAdUntrimmedBodyText();

    java.lang.String getAdvertiserName();

    float getAspectRatio();

    java.lang.String getId();

    java.lang.String getPlacementId();

    android.graphics.drawable.Drawable getPreloadedIconViewDrawable();

    java.lang.String getPromotedTranslation();

    java.lang.String getSponsoredTranslation();

    boolean hasCallToAction();

    boolean isAdInvalidated();

    boolean isAdLoaded();

    void loadAd();

    void loadAd(com.facebook.ads.NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig);

    void onCtaBroadcast();

    void setExtraHints(com.facebook.ads.ExtraHints extraHints);

    void setOnTouchListener(android.view.View.OnTouchListener onTouchListener);

    void unregisterView();
}
