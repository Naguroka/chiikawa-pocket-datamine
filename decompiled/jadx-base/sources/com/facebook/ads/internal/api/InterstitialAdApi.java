package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public interface InterstitialAdApi extends com.facebook.ads.FullScreenAd {
    @Override // com.facebook.ads.FullScreenAd
    com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig();

    @Override // com.facebook.ads.FullScreenAd
    com.facebook.ads.InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig();

    boolean isAdLoaded();

    void loadAd(com.facebook.ads.InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig);

    @Override // com.facebook.ads.Ad
    @java.lang.Deprecated
    void setExtraHints(com.facebook.ads.ExtraHints extraHints);

    @Override // com.facebook.ads.FullScreenAd
    boolean show();

    boolean show(com.facebook.ads.InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig);
}
