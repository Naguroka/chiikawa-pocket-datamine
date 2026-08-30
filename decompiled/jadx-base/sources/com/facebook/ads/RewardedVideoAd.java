package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class RewardedVideoAd implements com.facebook.ads.FullScreenAd {
    public static final int UNSET_VIDEO_DURATION = -1;
    private final com.facebook.ads.internal.api.RewardedVideoAdApi mRewardedVideoAdApi;

    public interface RewardedVideoAdLoadConfigBuilder extends com.facebook.ads.Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        com.facebook.ads.RewardedVideoAd.RewardedVideoLoadAdConfig build();

        com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdExperience(com.facebook.ads.AdExperienceType adExperienceType);

        com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdListener(com.facebook.ads.RewardedVideoAdListener rewardedVideoAdListener);

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withBid(java.lang.String str);

        com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z);

        com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData(com.facebook.ads.RewardData rewardData);
    }

    public interface RewardedVideoAdShowConfigBuilder extends com.facebook.ads.FullScreenAd.ShowConfigBuilder {
        @Override // com.facebook.ads.FullScreenAd.ShowConfigBuilder
        com.facebook.ads.RewardedVideoAd.RewardedVideoShowAdConfig build();

        com.facebook.ads.RewardedVideoAd.RewardedVideoAdShowConfigBuilder withAppOrientation(int i);
    }

    public interface RewardedVideoLoadAdConfig extends com.facebook.ads.Ad.LoadAdConfig {
    }

    public interface RewardedVideoShowAdConfig extends com.facebook.ads.FullScreenAd.ShowAdConfig {
    }

    public RewardedVideoAd(android.content.Context context, java.lang.String str) {
        this.mRewardedVideoAdApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createRewardedVideoAd(context, str, this);
    }

    @Override // com.facebook.ads.Ad
    @java.lang.Deprecated
    public void setExtraHints(com.facebook.ads.ExtraHints extraHints) {
        this.mRewardedVideoAdApi.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
        this.mRewardedVideoAdApi.loadAd();
    }

    public void loadAd(com.facebook.ads.RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        this.mRewardedVideoAdApi.loadAd(rewardedVideoLoadAdConfig);
    }

    @Override // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        return this.mRewardedVideoAdApi.isAdInvalidated();
    }

    @Override // com.facebook.ads.FullScreenAd
    public boolean show() {
        return this.mRewardedVideoAdApi.show();
    }

    public boolean show(com.facebook.ads.RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        return this.mRewardedVideoAdApi.show(rewardedVideoShowAdConfig);
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        this.mRewardedVideoAdApi.destroy();
    }

    public boolean isAdLoaded() {
        return this.mRewardedVideoAdApi.isAdLoaded();
    }

    @Override // com.facebook.ads.Ad
    public java.lang.String getPlacementId() {
        return this.mRewardedVideoAdApi.getPlacementId();
    }

    public int getVideoDuration() {
        return this.mRewardedVideoAdApi.getVideoDuration();
    }

    @Override // com.facebook.ads.FullScreenAd
    public com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mRewardedVideoAdApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.FullScreenAd
    public com.facebook.ads.RewardedVideoAd.RewardedVideoAdShowConfigBuilder buildShowAdConfig() {
        return this.mRewardedVideoAdApi.buildShowAdConfig();
    }
}
