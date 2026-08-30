package com.applovin.adview;

/* JADX INFO: loaded from: classes3.dex */
public interface AppLovinAdViewEventListener {
    void adClosedFullscreen(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView);

    void adFailedToDisplay(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView, com.applovin.adview.AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode);

    void adLeftApplication(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView);

    void adOpenedFullscreen(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView);
}
