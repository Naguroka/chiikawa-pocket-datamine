package com.bytedance.sdk.openadsdk.api.factory;

/* JADX INFO: loaded from: classes4.dex */
public interface IADTypeLoaderFactory {
    com.bytedance.sdk.openadsdk.api.factory.IADLoader<com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest, com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener> createBannerAdLoader();

    com.bytedance.sdk.openadsdk.api.factory.IADLoader<com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener> createInterstitialAdLoader();

    com.bytedance.sdk.openadsdk.api.factory.IADLoader<com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener> createNativeAdLoader();

    com.bytedance.sdk.openadsdk.api.factory.IADLoader<com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest, com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener> createOpenAdLoader();

    com.bytedance.sdk.openadsdk.api.factory.IADLoader<com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener> createRewardAdLoader();
}
