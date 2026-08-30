package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JL implements com.facebook.ads.AdView.AdViewLoadConfigBuilder, com.facebook.ads.AdView.AdViewLoadConfig {
    public java.lang.String A00;
    public final com.facebook.ads.redexgen.core.C5P A01;

    public JL(com.facebook.ads.redexgen.core.C5P c5p) {
        this.A01 = c5p;
    }

    public final java.lang.String A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final com.facebook.ads.AdView.AdViewLoadConfig build() {
        return this;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder
    public final com.facebook.ads.AdView.AdViewLoadConfigBuilder withAdListener(com.facebook.ads.AdListener adListener) {
        this.A01.A0C(adListener);
        return this;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final com.facebook.ads.AdView.AdViewLoadConfigBuilder withBid(java.lang.String str) {
        this.A00 = str;
        return this;
    }
}
