package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class RewardedInterstitialAd implements com.facebook.ads.FullScreenAd {
    public static final int UNSET_VIDEO_DURATION = -1;
    private final com.facebook.ads.internal.api.RewardedInterstitialAdApi mRewardedInterstitialAdApi;

    public interface RewardedInterstitialAdLoadConfigBuilder extends com.facebook.ads.Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialLoadAdConfig build();

        com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withAdListener(com.facebook.ads.RewardedInterstitialAdListener rewardedInterstitialAdListener);

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withBid(java.lang.String str);

        com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z);

        com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withRewardData(com.facebook.ads.RewardData rewardData);
    }

    public interface RewardedInterstitialAdShowConfigBuilder extends com.facebook.ads.FullScreenAd.ShowConfigBuilder {
        @Override // com.facebook.ads.FullScreenAd.ShowConfigBuilder
        com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialShowAdConfig build();

        com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder withAppOrientation(int i);
    }

    public interface RewardedInterstitialLoadAdConfig extends com.facebook.ads.Ad.LoadAdConfig {
    }

    public interface RewardedInterstitialShowAdConfig extends com.facebook.ads.FullScreenAd.ShowAdConfig {
    }

    public RewardedInterstitialAd(android.content.Context context, java.lang.String str) {
        this.mRewardedInterstitialAdApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createRewardedInterstitialAd(context, str, this);
    }

    @Override // com.facebook.ads.Ad
    @java.lang.Deprecated
    public void setExtraHints(com.facebook.ads.ExtraHints extraHints) {
        this.mRewardedInterstitialAdApi.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
        this.mRewardedInterstitialAdApi.loadAd();
    }

    public void loadAd(com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig) {
        this.mRewardedInterstitialAdApi.loadAd(rewardedInterstitialLoadAdConfig);
    }

    @Override // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        return this.mRewardedInterstitialAdApi.isAdInvalidated();
    }

    @Override // com.facebook.ads.FullScreenAd
    public boolean show() {
        return this.mRewardedInterstitialAdApi.show();
    }

    public boolean show(com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig) {
        return this.mRewardedInterstitialAdApi.show(rewardedInterstitialShowAdConfig);
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        this.mRewardedInterstitialAdApi.destroy();
    }

    public boolean isAdLoaded() {
        return this.mRewardedInterstitialAdApi.isAdLoaded();
    }

    @Override // com.facebook.ads.Ad
    public java.lang.String getPlacementId() {
        return this.mRewardedInterstitialAdApi.getPlacementId();
    }

    public int getVideoDuration() {
        return this.mRewardedInterstitialAdApi.getVideoDuration();
    }

    @Override // com.facebook.ads.FullScreenAd
    public com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mRewardedInterstitialAdApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.FullScreenAd
    public com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder buildShowAdConfig() {
        return this.mRewardedInterstitialAdApi.buildShowAdConfig();
    }
}
