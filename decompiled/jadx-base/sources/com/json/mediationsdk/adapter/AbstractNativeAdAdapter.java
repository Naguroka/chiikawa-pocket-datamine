package com.json.mediationsdk.adapter;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J,\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tJ,\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J,\u0010\u0019\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\"\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J,\u0010\u001b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¨\u0006\u001d"}, d2 = {"Lcom/ironsource/mediationsdk/adapter/AbstractNativeAdAdapter;", "AdNetworkAdapter", "Lcom/ironsource/mediationsdk/adapter/AbstractAdUnitAdapter;", "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdAdapterInterface;", "adapter", "(Ljava/lang/Object;)V", "collectNativeAdBiddingData", "", "config", "Lorg/json/JSONObject;", "adData", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "destroyNativeAd", "getNativeAdBiddingData", "", "", "", "getNativeAdProperties", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/NativeAdProperties;", "initNativeAdForBidding", "appKey", "userId", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdSmashListener;", "initNativeAds", "loadNativeAd", "loadNativeAdForBidding", com.json.j5.s, "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractNativeAdAdapter<AdNetworkAdapter> extends com.json.mediationsdk.adapter.AbstractAdUnitAdapter<AdNetworkAdapter> implements com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface {
    public AbstractNativeAdAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void collectNativeAdBiddingData(org.json.JSONObject config, org.json.JSONObject adData, com.json.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        java.util.Map<java.lang.String, java.lang.Object> nativeAdBiddingData = getNativeAdBiddingData(config, adData);
        if (nativeAdBiddingData != null) {
            biddingDataCallback.onSuccess(nativeAdBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void destroyNativeAd(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
    }

    public java.util.Map<java.lang.String, java.lang.Object> getNativeAdBiddingData(org.json.JSONObject config, org.json.JSONObject adData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return null;
    }

    public final com.json.mediationsdk.adunit.adapter.utility.NativeAdProperties getNativeAdProperties(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return new com.json.mediationsdk.adunit.adapter.utility.NativeAdProperties(config);
    }

    public void initNativeAdForBidding(java.lang.String appKey, java.lang.String userId, org.json.JSONObject config, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAds(java.lang.String appKey, java.lang.String userId, org.json.JSONObject config, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAd(org.json.JSONObject config, org.json.JSONObject adData, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public void loadNativeAdForBidding(org.json.JSONObject config, org.json.JSONObject adData, java.lang.String serverData, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
