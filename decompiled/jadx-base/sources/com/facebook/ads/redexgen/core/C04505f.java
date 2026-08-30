package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04505f implements com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder, com.facebook.ads.InterstitialAd.InterstitialLoadAdConfig {
    public com.facebook.ads.redexgen.core.C04495e A00;
    public java.lang.String A01;
    public java.util.EnumSet<com.facebook.ads.CacheFlag> A02;

    public C04505f(com.facebook.ads.redexgen.core.C04495e c04495e) {
        this.A00 = c04495e;
    }

    public final void A00() {
        if (this.A02 == null) {
            this.A02 = com.facebook.ads.CacheFlag.ALL;
        }
        this.A00.A05(this.A02, this.A01);
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final com.facebook.ads.InterstitialAd.InterstitialLoadAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder
    public final com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener(com.facebook.ads.InterstitialAdListener interstitialAdListener) {
        this.A00.A02(interstitialAdListener);
        if (interstitialAdListener instanceof com.facebook.ads.InterstitialAdExtendedListener) {
            this.A00.A04((com.facebook.ads.InterstitialAdExtendedListener) interstitialAdListener);
        }
        return this;
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withBid(java.lang.String str) {
        this.A01 = str;
        return this;
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder
    public final com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags(java.util.EnumSet<com.facebook.ads.CacheFlag> cacheFlags) {
        this.A02 = cacheFlags;
        return this;
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder
    public final com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withRewardData(com.facebook.ads.RewardData rewardData) {
        this.A00.A03(rewardData);
        return this;
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder
    public final com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder withRewardedAdListener(com.facebook.ads.RewardedAdListener rewardedAdListener) {
        this.A00.A04(rewardedAdListener);
        return this;
    }
}
