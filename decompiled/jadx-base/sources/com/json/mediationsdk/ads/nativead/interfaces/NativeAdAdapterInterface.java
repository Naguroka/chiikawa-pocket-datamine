package com.json.mediationsdk.ads.nativead.interfaces;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J,\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J,\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H&J,\u0010\u0013\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H&J\"\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0012H&J,\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0012H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdAdapterInterface;", "Lcom/ironsource/mediationsdk/sdk/AdUnitAdapterInterface;", "collectNativeAdBiddingData", "", "config", "Lorg/json/JSONObject;", "adData", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "destroyNativeAd", "getNativeAdBiddingData", "", "", "", "initNativeAdForBidding", "appKey", "userId", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdSmashListener;", "initNativeAds", "loadNativeAd", "loadNativeAdForBidding", com.json.j5.s, "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface NativeAdAdapterInterface extends com.json.mediationsdk.sdk.AdUnitAdapterInterface {
    void collectNativeAdBiddingData(org.json.JSONObject config, org.json.JSONObject adData, com.json.mediationsdk.bidding.BiddingDataCallback biddingDataCallback);

    void destroyNativeAd(org.json.JSONObject config);

    java.util.Map<java.lang.String, java.lang.Object> getNativeAdBiddingData(org.json.JSONObject config, org.json.JSONObject adData);

    void initNativeAdForBidding(java.lang.String appKey, java.lang.String userId, org.json.JSONObject config, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener);

    void initNativeAds(java.lang.String appKey, java.lang.String userId, org.json.JSONObject config, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener);

    void loadNativeAd(org.json.JSONObject config, org.json.JSONObject adData, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener);

    void loadNativeAdForBidding(org.json.JSONObject config, org.json.JSONObject adData, java.lang.String serverData, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener);
}
