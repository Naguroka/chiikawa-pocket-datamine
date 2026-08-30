package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinAppOpenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.adview.AppLovinInterstitialAdDialog f591a;

    public AppLovinAppOpenAd(com.applovin.sdk.AppLovinSdk appLovinSdk) {
        this.f591a = com.applovin.adview.AppLovinInterstitialAd.create(appLovinSdk, com.applovin.impl.sdk.j.m());
    }

    public void setAdClickListener(com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
        this.f591a.setAdClickListener(appLovinAdClickListener);
    }

    public void setAdDisplayListener(com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f591a.setAdDisplayListener(appLovinAdDisplayListener);
    }

    public void setAdVideoPlaybackListener(com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f591a.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
    }

    public void show(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.f591a.showAndRender(appLovinAd);
    }

    public java.lang.String toString() {
        return "AppLovinAppOpenAd{}";
    }
}
