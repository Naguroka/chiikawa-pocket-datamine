package com.google.ads.mediation.applovin;

/* JADX INFO: loaded from: classes4.dex */
class AppLovinAdViewWrapper {
    private final com.applovin.adview.AppLovinAdView appLovinAdView;

    private AppLovinAdViewWrapper(com.applovin.sdk.AppLovinSdk appLovinSdk, com.applovin.sdk.AppLovinAdSize appLovinAdSize, android.content.Context context) {
        this.appLovinAdView = new com.applovin.adview.AppLovinAdView(appLovinSdk, appLovinAdSize, context);
    }

    public static com.google.ads.mediation.applovin.AppLovinAdViewWrapper newInstance(com.applovin.sdk.AppLovinSdk appLovinSdk, com.applovin.sdk.AppLovinAdSize appLovinAdSize, android.content.Context context) {
        return new com.google.ads.mediation.applovin.AppLovinAdViewWrapper(appLovinSdk, appLovinAdSize, context);
    }

    public void setAdDisplayListener(com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.appLovinAdView.setAdDisplayListener(appLovinAdDisplayListener);
    }

    public void setAdClickListener(com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
        this.appLovinAdView.setAdClickListener(appLovinAdClickListener);
    }

    public void setAdViewEventListener(com.applovin.adview.AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.appLovinAdView.setAdViewEventListener(appLovinAdViewEventListener);
    }

    public void renderAd(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.appLovinAdView.renderAd(appLovinAd);
    }

    public com.applovin.adview.AppLovinAdView getAppLovinAdView() {
        return this.appLovinAdView;
    }
}
