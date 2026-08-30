package com.applovin.adview;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinInterstitialAd {
    public static com.applovin.adview.AppLovinInterstitialAdDialog create(com.applovin.sdk.AppLovinSdk appLovinSdk, android.content.Context context) {
        if (appLovinSdk == null) {
            throw new java.lang.IllegalArgumentException("No sdk specified");
        }
        if (context != null) {
            return new com.applovin.impl.sb(appLovinSdk, context);
        }
        throw new java.lang.IllegalArgumentException("No context specified");
    }

    public java.lang.String toString() {
        return "AppLovinInterstitialAd{}";
    }
}
