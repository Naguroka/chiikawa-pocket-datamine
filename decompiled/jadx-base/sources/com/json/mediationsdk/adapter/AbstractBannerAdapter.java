package com.json.mediationsdk.adapter;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J,\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0016J,\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J,\u0010\u001d\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J*\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J4\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J,\u0010#\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010$2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006'"}, d2 = {"Lcom/ironsource/mediationsdk/adapter/AbstractBannerAdapter;", "AdNetworkAdapter", "Lcom/ironsource/mediationsdk/adapter/AbstractAdUnitAdapter;", "Lcom/ironsource/mediationsdk/sdk/BannerAdapterInterface;", "adapter", "(Ljava/lang/Object;)V", "collectBannerBiddingData", "", "config", "Lorg/json/JSONObject;", "adData", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", com.ironsource.y8.g.R, "getAdaptiveHeight", "", "width", "getBannerBiddingData", "", "", "", "getBannerLoadWhileShowSupportState", "Lcom/ironsource/mediationsdk/LoadWhileShowSupportState;", "adUnitSettings", "initBannerForBidding", "appKey", "userId", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "initBanners", com.ironsource.y8.g.M, "banner", "Lcom/ironsource/mediationsdk/IronSourceBannerLayout;", "loadBannerForBidding", com.json.j5.s, "loadBannerForDemandOnlyForBidding", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyBannerLayout;", "onBannerViewBound", "onBannerViewWillBind", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractBannerAdapter<AdNetworkAdapter> extends com.json.mediationsdk.adapter.AbstractAdUnitAdapter<AdNetworkAdapter> implements com.json.mediationsdk.sdk.BannerAdapterInterface {
    public AbstractBannerAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(org.json.JSONObject config, org.json.JSONObject adData, com.json.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        java.util.Map<java.lang.String, java.lang.Object> bannerBiddingData = getBannerBiddingData(config, adData);
        if (bannerBiddingData != null) {
            biddingDataCallback.onSuccess(bannerBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public int getAdaptiveHeight(int width) {
        return -1;
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getBannerBiddingData(org.json.JSONObject config, org.json.JSONObject adData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return null;
    }

    public com.json.mediationsdk.LoadWhileShowSupportState getBannerLoadWhileShowSupportState(org.json.JSONObject adUnitSettings) {
        return com.json.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(java.lang.String appKey, java.lang.String userId, org.json.JSONObject config, com.json.mediationsdk.sdk.BannerSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(java.lang.String appKey, java.lang.String userId, org.json.JSONObject config, com.json.mediationsdk.sdk.BannerSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(org.json.JSONObject config, org.json.JSONObject adData, com.json.mediationsdk.IronSourceBannerLayout banner, com.json.mediationsdk.sdk.BannerSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(banner, "banner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(org.json.JSONObject config, org.json.JSONObject adData, java.lang.String serverData, com.json.mediationsdk.IronSourceBannerLayout banner, com.json.mediationsdk.sdk.BannerSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(banner, "banner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForDemandOnlyForBidding(org.json.JSONObject config, java.lang.String serverData, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout banner, com.json.mediationsdk.sdk.BannerSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewBound(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewWillBind(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
    }
}
