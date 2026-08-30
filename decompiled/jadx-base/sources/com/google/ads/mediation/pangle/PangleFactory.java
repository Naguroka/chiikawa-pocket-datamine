package com.google.ads.mediation.pangle;

/* JADX INFO: loaded from: classes4.dex */
public class PangleFactory {
    com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder createPAGConfigBuilder() {
        return new com.bytedance.sdk.openadsdk.api.init.PAGConfig.Builder();
    }

    public com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest createPagAppOpenRequest() {
        return new com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest();
    }

    public com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest createPagBannerRequest(com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize pAGBannerSize) {
        return new com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest(pAGBannerSize);
    }

    public com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest createPagInterstitialRequest() {
        return new com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest();
    }

    public com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest createPagNativeRequest() {
        return new com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest();
    }

    public com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest createPagRewardedRequest() {
        return new com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest();
    }

    com.google.ads.mediation.pangle.renderer.PangleAppOpenAd createPangleAppOpenAd(com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationAppOpenAd, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback> mediationAdLoadCallback, com.google.ads.mediation.pangle.PangleInitializer pangleInitializer, com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper, com.google.ads.mediation.pangle.PanglePrivacyConfig panglePrivacyConfig) {
        return new com.google.ads.mediation.pangle.renderer.PangleAppOpenAd(mediationAppOpenAdConfiguration, mediationAdLoadCallback, pangleInitializer, pangleSdkWrapper, this, panglePrivacyConfig);
    }

    com.google.ads.mediation.pangle.renderer.PangleBannerAd createPangleBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback, com.google.ads.mediation.pangle.PangleInitializer pangleInitializer, com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper, com.google.ads.mediation.pangle.PanglePrivacyConfig panglePrivacyConfig) {
        return new com.google.ads.mediation.pangle.renderer.PangleBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback, pangleInitializer, pangleSdkWrapper, this, panglePrivacyConfig);
    }

    com.google.ads.mediation.pangle.renderer.PangleInterstitialAd createPangleInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback, com.google.ads.mediation.pangle.PangleInitializer pangleInitializer, com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper, com.google.ads.mediation.pangle.PanglePrivacyConfig panglePrivacyConfig) {
        return new com.google.ads.mediation.pangle.renderer.PangleInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, pangleInitializer, pangleSdkWrapper, this, panglePrivacyConfig);
    }

    com.google.ads.mediation.pangle.renderer.PangleNativeAd createPangleNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback, com.google.ads.mediation.pangle.PangleInitializer pangleInitializer, com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper, com.google.ads.mediation.pangle.PanglePrivacyConfig panglePrivacyConfig) {
        return new com.google.ads.mediation.pangle.renderer.PangleNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback, pangleInitializer, pangleSdkWrapper, this, panglePrivacyConfig);
    }

    com.google.ads.mediation.pangle.renderer.PangleRewardedAd createPangleRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback, com.google.ads.mediation.pangle.PangleInitializer pangleInitializer, com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper, com.google.ads.mediation.pangle.PanglePrivacyConfig panglePrivacyConfig) {
        return new com.google.ads.mediation.pangle.renderer.PangleRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, pangleInitializer, pangleSdkWrapper, this, panglePrivacyConfig);
    }
}
