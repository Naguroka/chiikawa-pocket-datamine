package com.applovin.sdk;

/* JADX INFO: loaded from: classes3.dex */
public interface AppLovinAdService {
    void collectBidToken(com.applovin.sdk.AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener);

    @java.lang.Deprecated
    java.lang.String getBidToken();

    void loadNextAd(com.applovin.sdk.AppLovinAdSize appLovinAdSize, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener);

    void loadNextAdForAdToken(java.lang.String str, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener);

    void loadNextAdForZoneId(java.lang.String str, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener);
}
