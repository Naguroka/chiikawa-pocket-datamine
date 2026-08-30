package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public interface Ad {

    public interface LoadAdConfig {
    }

    public interface LoadConfigBuilder {
        com.facebook.ads.Ad.LoadAdConfig build();

        com.facebook.ads.Ad.LoadConfigBuilder withBid(java.lang.String str);
    }

    void destroy();

    java.lang.String getPlacementId();

    boolean isAdInvalidated();

    void loadAd();

    @java.lang.Deprecated
    void setExtraHints(com.facebook.ads.ExtraHints extraHints);
}
