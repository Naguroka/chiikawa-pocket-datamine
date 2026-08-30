package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.61, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass61 implements com.facebook.ads.RewardedVideoAd.RewardedVideoAdShowConfigBuilder, com.facebook.ads.RewardedVideoAd.RewardedVideoShowAdConfig {
    public int A00 = -1;
    public long A01;

    public final int A00() {
        return this.A00;
    }

    public final long A01() {
        return this.A01;
    }

    public final com.facebook.ads.redexgen.core.AnonymousClass61 A02(long j) {
        this.A01 = j;
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdShowConfigBuilder, com.facebook.ads.FullScreenAd.ShowConfigBuilder
    public final com.facebook.ads.RewardedVideoAd.RewardedVideoShowAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdShowConfigBuilder
    public final com.facebook.ads.RewardedVideoAd.RewardedVideoAdShowConfigBuilder withAppOrientation(int i) {
        this.A00 = i;
        return this;
    }
}
