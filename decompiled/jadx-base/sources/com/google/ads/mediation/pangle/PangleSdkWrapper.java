package com.google.ads.mediation.pangle;

/* JADX INFO: loaded from: classes4.dex */
public class PangleSdkWrapper {
    public void init(android.content.Context context, com.bytedance.sdk.openadsdk.api.init.PAGConfig pAGConfig, com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback pAGInitCallback) {
        com.bytedance.sdk.openadsdk.api.init.PAGSdk.init(context, pAGConfig, pAGInitCallback);
    }

    boolean isInitSuccess() {
        return com.bytedance.sdk.openadsdk.api.init.PAGSdk.isInitSuccess();
    }

    void setChildDirected(int i) {
        com.bytedance.sdk.openadsdk.api.init.PAGConfig.setChildDirected(i);
    }

    void setGdprConsent(int i) {
        com.bytedance.sdk.openadsdk.api.init.PAGConfig.setGDPRConsent(i);
    }

    void setDoNotSell(int i) {
        com.bytedance.sdk.openadsdk.api.init.PAGConfig.setDoNotSell(i);
    }

    void setUserData(java.lang.String str) {
        com.bytedance.sdk.openadsdk.api.init.PAGConfig.setUserData(str);
    }

    void getBiddingToken(com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback biddingTokenCallback) {
        com.bytedance.sdk.openadsdk.api.init.PAGSdk.getBiddingToken(biddingTokenCallback);
    }

    java.lang.String getSdkVersion() {
        return com.bytedance.sdk.openadsdk.api.init.PAGSdk.getSDKVersion();
    }

    public void loadBannerAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest pAGBannerRequest, com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd.loadAd(str, pAGBannerRequest, pAGBannerAdLoadListener);
    }

    public void loadInterstitialAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest pAGInterstitialRequest, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd.loadAd(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener);
    }

    public void loadNativeAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest pAGNativeRequest, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd.loadAd(str, pAGNativeRequest, pAGNativeAdLoadListener);
    }

    public void loadRewardedAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest pAGRewardedRequest, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd.loadAd(str, pAGRewardedRequest, pAGRewardedAdLoadListener);
    }

    public void loadAppOpenAd(java.lang.String str, com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest pAGAppOpenRequest, com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd.loadAd(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener);
    }
}
