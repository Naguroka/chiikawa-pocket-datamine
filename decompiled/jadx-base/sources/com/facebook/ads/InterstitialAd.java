package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class InterstitialAd implements com.facebook.ads.FullScreenAd {
    private final com.facebook.ads.internal.api.InterstitialAdApi mInterstitialAdApi;

    public interface InterstitialAdLoadConfigBuilder extends com.facebook.ads.Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        com.facebook.ads.InterstitialAd.InterstitialLoadAdConfig build();

        com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener(com.facebook.ads.InterstitialAdListener interstitialAdListener);

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withBid(java.lang.String str);

        com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags(java.util.EnumSet<com.facebook.ads.CacheFlag> enumSet);

        com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withRewardData(com.facebook.ads.RewardData rewardData);

        com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withRewardedAdListener(com.facebook.ads.RewardedAdListener rewardedAdListener);
    }

    public interface InterstitialAdShowConfigBuilder extends com.facebook.ads.FullScreenAd.ShowConfigBuilder {
        @Override // com.facebook.ads.FullScreenAd.ShowConfigBuilder
        com.facebook.ads.InterstitialAd.InterstitialShowAdConfig build();
    }

    public interface InterstitialLoadAdConfig extends com.facebook.ads.Ad.LoadAdConfig {
    }

    public interface InterstitialShowAdConfig extends com.facebook.ads.FullScreenAd.ShowAdConfig {
    }

    public InterstitialAd(android.content.Context context, java.lang.String str) {
        this.mInterstitialAdApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createInterstitialAd(context, str, this);
    }

    @Override // com.facebook.ads.Ad
    @java.lang.Deprecated
    public void setExtraHints(com.facebook.ads.ExtraHints extraHints) {
        this.mInterstitialAdApi.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
        this.mInterstitialAdApi.loadAd();
    }

    public void loadAd(com.facebook.ads.InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig) {
        this.mInterstitialAdApi.loadAd(interstitialLoadAdConfig);
    }

    @Override // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        return this.mInterstitialAdApi.isAdInvalidated();
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        this.mInterstitialAdApi.destroy();
    }

    @Override // com.facebook.ads.Ad
    public java.lang.String getPlacementId() {
        return this.mInterstitialAdApi.getPlacementId();
    }

    public boolean isAdLoaded() {
        return this.mInterstitialAdApi.isAdLoaded();
    }

    @Override // com.facebook.ads.FullScreenAd
    public boolean show() {
        return this.mInterstitialAdApi.show();
    }

    public boolean show(com.facebook.ads.InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        return this.mInterstitialAdApi.show(interstitialShowAdConfig);
    }

    @Override // com.facebook.ads.FullScreenAd
    public com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mInterstitialAdApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.FullScreenAd
    public com.facebook.ads.InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return this.mInterstitialAdApi.buildShowAdConfig();
    }
}
