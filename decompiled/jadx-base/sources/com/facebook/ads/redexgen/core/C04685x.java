package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04685x implements com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder, com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialLoadAdConfig {
    public final com.facebook.ads.redexgen.core.AnonymousClass60 A00;

    public C04685x(com.facebook.ads.redexgen.core.AnonymousClass60 anonymousClass60) {
        this.A00 = anonymousClass60;
        this.A00.withAdExperience(com.facebook.ads.AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL);
    }

    public final void A00() {
        this.A00.A00();
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialLoadAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withAdListener(com.facebook.ads.RewardedInterstitialAdListener rewardedInterstitialAdListener) {
        this.A00.withAdListener(new com.facebook.ads.redexgen.core.C04675w(rewardedInterstitialAdListener));
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withBid(java.lang.String str) {
        this.A00.withBid(str);
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z) {
        this.A00.withFailOnCacheFailureEnabled(z);
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withRewardData(com.facebook.ads.RewardData rewardData) {
        this.A00.withRewardData(rewardData);
        return this;
    }
}
