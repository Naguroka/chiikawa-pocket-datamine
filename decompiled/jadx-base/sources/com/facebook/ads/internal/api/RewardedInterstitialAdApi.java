package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public interface RewardedInterstitialAdApi extends com.facebook.ads.FullScreenAd {
    @Override // com.facebook.ads.FullScreenAd
    com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig();

    @Override // com.facebook.ads.FullScreenAd
    com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder buildShowAdConfig();

    @Override // com.facebook.ads.Ad
    void destroy();

    @Override // com.facebook.ads.Ad
    java.lang.String getPlacementId();

    int getVideoDuration();

    boolean isAdLoaded();

    @Override // com.facebook.ads.Ad
    void loadAd();

    void loadAd(com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig);

    @Override // com.facebook.ads.Ad
    @java.lang.Deprecated
    void setExtraHints(com.facebook.ads.ExtraHints extraHints);

    @Override // com.facebook.ads.FullScreenAd
    boolean show();

    boolean show(com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig);
}
