package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public interface NativeAdViewApi {
    android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd);

    @java.lang.Deprecated
    android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdView.Type type);

    @java.lang.Deprecated
    android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes);

    android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes);
}
