package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.60, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass60 implements com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder, com.facebook.ads.RewardedVideoAd.RewardedVideoLoadAdConfig {
    public com.facebook.ads.AdExperienceType A00;
    public com.facebook.ads.redexgen.core.C04705z A01;
    public java.lang.String A02;
    public boolean A03;

    public AnonymousClass60(com.facebook.ads.redexgen.core.C04705z c04705z) {
        this.A01 = c04705z;
    }

    public final void A00() {
        this.A01.A07(this.A02, this.A00, this.A03);
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final com.facebook.ads.RewardedVideoAd.RewardedVideoLoadAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder
    public final com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdExperience(com.facebook.ads.AdExperienceType adExperienceType) {
        this.A00 = adExperienceType;
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder
    public final com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdListener(com.facebook.ads.RewardedVideoAdListener rewardedVideoAdListener) {
        this.A01.A06(rewardedVideoAdListener);
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withBid(java.lang.String str) {
        this.A02 = str;
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder
    public final com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z) {
        this.A03 = z;
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder
    public final com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData(com.facebook.ads.RewardData rewardData) {
        this.A01.A05(rewardData);
        return this;
    }
}
