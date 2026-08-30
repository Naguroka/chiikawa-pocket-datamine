package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0774Ja implements com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder, com.facebook.ads.NativeAdBase.NativeLoadAdConfig {
    public com.facebook.ads.NativeAdBase.MediaCacheFlag A02;
    public java.lang.String A03;
    public boolean A04;
    public final com.facebook.ads.NativeAdBase A05;
    public final com.facebook.ads.redexgen.core.W7 A06;
    public int A01 = -1;
    public int A00 = -1;

    public C0774Ja(com.facebook.ads.redexgen.core.W7 w7, com.facebook.ads.NativeAdBase nativeAdBase) {
        this.A06 = w7;
        this.A05 = nativeAdBase;
    }

    public final void A00() {
        if (this.A02 == null) {
            this.A02 = com.facebook.ads.NativeAdBase.MediaCacheFlag.ALL;
        }
        this.A06.A1X(com.facebook.ads.redexgen.core.JQ.A00(this.A02), this.A03, new com.facebook.ads.redexgen.core.C6l(this.A04, this.A01, this.A00));
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final com.facebook.ads.NativeAdBase.NativeLoadAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder withAdListener(com.facebook.ads.NativeAdListener nativeAdListener) {
        this.A06.A1T(this.A05, nativeAdListener);
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder withBid(java.lang.String str) {
        this.A03 = str;
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder withMediaCacheFlag(com.facebook.ads.NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A02 = mediaCacheFlag;
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder withPreloadedIconView(int i, int i2) {
        this.A04 = true;
        this.A01 = i;
        this.A00 = i2;
        return this;
    }
}
