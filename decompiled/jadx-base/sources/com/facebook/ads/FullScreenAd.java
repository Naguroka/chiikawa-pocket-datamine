package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public interface FullScreenAd extends com.facebook.ads.Ad {

    public interface ShowAdConfig {
    }

    public interface ShowConfigBuilder {
        com.facebook.ads.FullScreenAd.ShowAdConfig build();
    }

    com.facebook.ads.Ad.LoadConfigBuilder buildLoadAdConfig();

    com.facebook.ads.FullScreenAd.ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
