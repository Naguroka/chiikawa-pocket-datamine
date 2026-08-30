package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class NativeBannerAd extends com.facebook.ads.NativeAdBase {
    private final com.facebook.ads.internal.api.NativeBannerAdApi mNativeBannerAdApi;

    public NativeBannerAd(android.content.Context context, java.lang.String str) {
        super(context, str);
        this.mNativeBannerAdApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeBannerAdApi(this, this.mNativeAdBaseApi);
    }

    public NativeBannerAd(android.content.Context context, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        super(nativeAdBaseApi);
        this.mNativeBannerAdApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeBannerAdApi(this, this.mNativeAdBaseApi);
    }

    public void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view, mediaView);
    }

    public void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, java.util.List<android.view.View> list) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view, mediaView, list);
    }

    public void registerViewForInteraction(android.view.View view, android.widget.ImageView imageView) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view, imageView);
    }

    public void registerViewForInteraction(android.view.View view, android.widget.ImageView imageView, java.util.List<android.view.View> list) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view, imageView, list);
    }
}
