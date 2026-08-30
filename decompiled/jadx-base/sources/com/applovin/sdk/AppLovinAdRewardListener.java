package com.applovin.sdk;

/* JADX INFO: loaded from: classes3.dex */
public interface AppLovinAdRewardListener {
    void userOverQuota(com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map<java.lang.String, java.lang.String> map);

    void userRewardRejected(com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map<java.lang.String, java.lang.String> map);

    void userRewardVerified(com.applovin.sdk.AppLovinAd appLovinAd, java.util.Map<java.lang.String, java.lang.String> map);

    void validationRequestFailed(com.applovin.sdk.AppLovinAd appLovinAd, int i);
}
