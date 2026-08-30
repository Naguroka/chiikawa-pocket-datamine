package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinRewardedInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.adview.AppLovinIncentivizedInterstitial f592a;
    private com.applovin.sdk.AppLovinAdDisplayListener b;
    private com.applovin.sdk.AppLovinAdClickListener c;
    private com.applovin.sdk.AppLovinAdVideoPlaybackListener d;

    public AppLovinRewardedInterstitialAd(com.applovin.sdk.AppLovinSdk appLovinSdk) {
        this.f592a = new com.applovin.adview.AppLovinIncentivizedInterstitial(appLovinSdk);
    }

    public void setAdClickListener(com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
        this.c = appLovinAdClickListener;
    }

    public void setAdDisplayListener(com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.b = appLovinAdDisplayListener;
    }

    public void setAdVideoPlaybackListener(com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.d = appLovinAdVideoPlaybackListener;
    }

    public void show(com.applovin.sdk.AppLovinAd appLovinAd, android.content.Context context, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f592a.show(appLovinAd, context, appLovinAdRewardListener, this.d, this.b, this.c);
    }

    public java.lang.String toString() {
        return "AppLovinRewardedInterstitialAd{}";
    }
}
