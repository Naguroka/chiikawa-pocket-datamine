package com.json.mediationsdk.sdk;

/* JADX INFO: loaded from: classes5.dex */
public interface InterstitialAdapterInterface extends com.json.mediationsdk.sdk.AdUnitAdapterInterface {
    void collectInterstitialBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.bidding.BiddingDataCallback biddingDataCallback);

    void disposeInterstitialAd(org.json.JSONObject jSONObject);

    java.util.Map<java.lang.String, java.lang.Object> getInterstitialBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2);

    void initInterstitial(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener);

    void initInterstitialForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener);

    boolean isInterstitialReady(org.json.JSONObject jSONObject);

    void loadInterstitial(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener);

    void loadInterstitialForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener);

    void showInterstitial(org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener);
}
