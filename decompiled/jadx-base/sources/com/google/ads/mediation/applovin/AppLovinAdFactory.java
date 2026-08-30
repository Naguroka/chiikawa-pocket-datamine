package com.google.ads.mediation.applovin;

/* JADX INFO: loaded from: classes4.dex */
public class AppLovinAdFactory {
    com.google.ads.mediation.applovin.AppLovinAdViewWrapper createAdView(com.applovin.sdk.AppLovinSdk appLovinSdk, com.applovin.sdk.AppLovinAdSize appLovinAdSize, android.content.Context context) {
        return com.google.ads.mediation.applovin.AppLovinAdViewWrapper.newInstance(appLovinSdk, appLovinAdSize, context);
    }

    public com.applovin.adview.AppLovinInterstitialAdDialog createInterstitialAdDialog(com.applovin.sdk.AppLovinSdk appLovinSdk, android.content.Context context) {
        return com.applovin.adview.AppLovinInterstitialAd.create(appLovinSdk, context);
    }

    public com.applovin.adview.AppLovinIncentivizedInterstitial createIncentivizedInterstitial(com.applovin.sdk.AppLovinSdk appLovinSdk) {
        return com.applovin.adview.AppLovinIncentivizedInterstitial.create(appLovinSdk);
    }

    public com.applovin.adview.AppLovinIncentivizedInterstitial createIncentivizedInterstitial(java.lang.String str, com.applovin.sdk.AppLovinSdk appLovinSdk) {
        return com.applovin.adview.AppLovinIncentivizedInterstitial.create(str, appLovinSdk);
    }
}
