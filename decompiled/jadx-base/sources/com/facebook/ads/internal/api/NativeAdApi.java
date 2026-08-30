package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public interface NativeAdApi {
    com.facebook.ads.NativeAd.AdCreativeType getAdCreativeType();

    com.facebook.ads.VideoAutoplayBehavior getVideoAutoplayBehavior();

    void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView);

    void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, android.widget.ImageView imageView);

    void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, android.widget.ImageView imageView, java.util.List<android.view.View> list);

    void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, com.facebook.ads.MediaView mediaView2);

    void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, com.facebook.ads.MediaView mediaView2, java.util.List<android.view.View> list);

    void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, java.util.List<android.view.View> list);
}
