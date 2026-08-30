package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class NativeAd extends com.facebook.ads.NativeAdBase {
    private com.facebook.ads.internal.api.NativeAdApi mNativeAdApi;

    public enum AdCreativeType {
        IMAGE,
        VIDEO,
        CAROUSEL,
        UNKNOWN
    }

    public NativeAd(android.content.Context context, java.lang.String str) {
        super(context, str);
        this.mNativeAdApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public NativeAd(android.content.Context context, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        super(nativeAdBaseApi);
        this.mNativeAdApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public NativeAd(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase) {
        super(context, nativeAdBase);
        this.mNativeAdApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdApi(nativeAdBase, this, this.mNativeAdBaseApi);
    }

    public com.facebook.ads.internal.api.NativeAdApi getNativeAdApi() {
        return this.mNativeAdApi;
    }

    @java.lang.Deprecated
    com.facebook.ads.VideoAutoplayBehavior getVideoAutoplayBehavior() {
        return this.mNativeAdApi.getVideoAutoplayBehavior();
    }

    public com.facebook.ads.NativeAd.AdCreativeType getAdCreativeType() {
        return this.mNativeAdApi.getAdCreativeType();
    }

    public void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView);
    }

    public void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, com.facebook.ads.MediaView mediaView2) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, mediaView2);
    }

    public void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, java.util.List<android.view.View> list) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, list);
    }

    public void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, com.facebook.ads.MediaView mediaView2, java.util.List<android.view.View> list) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, mediaView2, list);
    }

    public void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, android.widget.ImageView imageView) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, imageView);
    }

    public void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, android.widget.ImageView imageView, java.util.List<android.view.View> list) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, imageView, list);
    }
}
