package com.json.mediationsdk.adapter;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J,\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J6\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J,\u0010\u0017\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J,\u0010\u0018\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\tH\u0016J\"\u0010\u001b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J,\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u001f"}, d2 = {"Lcom/ironsource/mediationsdk/adapter/AbstractRewardedVideoAdapter;", "AdNetworkAdapter", "Lcom/ironsource/mediationsdk/adapter/AbstractAdUnitAdapter;", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoAdapterInterface;", "adapter", "(Ljava/lang/Object;)V", "collectRewardedVideoBiddingData", "", "config", "Lorg/json/JSONObject;", "adData", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "disposeRewardedVideoAd", "getRewardedVideoBiddingData", "", "", "", "initAndLoadRewardedVideo", "appKey", "userId", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", "initRewardedVideoForDemandOnly", "initRewardedVideoWithCallback", "isRewardedVideoAvailable", "", "loadRewardedVideo", "loadRewardedVideoForBidding", com.json.j5.s, com.ironsource.y8.g.h, "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractRewardedVideoAdapter<AdNetworkAdapter> extends com.json.mediationsdk.adapter.AbstractAdUnitAdapter<AdNetworkAdapter> implements com.json.mediationsdk.sdk.RewardedVideoAdapterInterface {
    public AbstractRewardedVideoAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(org.json.JSONObject config, org.json.JSONObject adData, com.json.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        java.util.Map<java.lang.String, java.lang.Object> rewardedVideoBiddingData = getRewardedVideoBiddingData(config, adData);
        if (rewardedVideoBiddingData != null) {
            biddingDataCallback.onSuccess(rewardedVideoBiddingData);
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void disposeRewardedVideoAd(org.json.JSONObject config) {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getRewardedVideoBiddingData(org.json.JSONObject config, org.json.JSONObject adData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return null;
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(java.lang.String appKey, java.lang.String userId, org.json.JSONObject config, org.json.JSONObject adData, com.json.mediationsdk.sdk.RewardedVideoSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(java.lang.String appKey, java.lang.String userId, org.json.JSONObject config, com.json.mediationsdk.sdk.RewardedVideoSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(java.lang.String appKey, java.lang.String userId, org.json.JSONObject config, com.json.mediationsdk.sdk.RewardedVideoSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return false;
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(org.json.JSONObject config, org.json.JSONObject adData, com.json.mediationsdk.sdk.RewardedVideoSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(org.json.JSONObject config, org.json.JSONObject adData, java.lang.String serverData, com.json.mediationsdk.sdk.RewardedVideoSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(org.json.JSONObject config, com.json.mediationsdk.sdk.RewardedVideoSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
