package com.google.ads.mediation.applovin;

/* JADX INFO: loaded from: classes4.dex */
public class AppLovinSdkWrapper {
    public com.applovin.sdk.AppLovinSdk getInstance(com.applovin.sdk.AppLovinSdkSettings appLovinSdkSettings, android.content.Context context) {
        return com.applovin.sdk.AppLovinSdk.getInstance(appLovinSdkSettings, context);
    }

    public com.applovin.sdk.AppLovinSdk getInstance(java.lang.String str, com.applovin.sdk.AppLovinSdkSettings appLovinSdkSettings, android.content.Context context) {
        return com.applovin.sdk.AppLovinSdk.getInstance(str, appLovinSdkSettings, context);
    }

    public com.applovin.sdk.AppLovinSdkSettings getSdkSettings(android.content.Context context) {
        if (com.google.ads.mediation.applovin.AppLovinMediationAdapter.appLovinSdkSettings == null) {
            com.google.ads.mediation.applovin.AppLovinMediationAdapter.appLovinSdkSettings = new com.applovin.sdk.AppLovinSdkSettings(context);
        }
        return com.google.ads.mediation.applovin.AppLovinMediationAdapter.appLovinSdkSettings;
    }

    public java.lang.String getSdkVersion() {
        return com.applovin.sdk.AppLovinSdk.VERSION;
    }
}
