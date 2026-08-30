package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: loaded from: classes4.dex */
public interface PAGNativeAdData {

    public enum PAGNativeMediaType {
        PAGNativeMediaTypeImage,
        PAGNativeMediaTypeVideo
    }

    android.view.View getAdChoicesView();

    android.view.View getAdLogoView();

    java.lang.String getButtonText();

    java.lang.String getDescription();

    com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem getIcon();

    com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData.PAGNativeMediaType getMediaType();

    com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView getMediaView();

    java.lang.String getTitle();
}
