package com.json.adapters.ironsource.nativeAd;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J,\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J,\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J,\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ironsource/adapters/ironsource/nativeAd/IronSourceNativeAdAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractNativeAdAdapter;", "Lcom/ironsource/adapters/ironsource/IronSourceAdapter;", "Lorg/json/JSONObject;", "config", "", com.json.j5.s, "prepareLoadParams", "appKey", "userId", "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdSmashListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "initNativeAdForBidding", "adData", "loadNativeAdForBidding", "", "", "getNativeAdBiddingData", "destroyNativeAd", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "releaseMemory", "Lcom/ironsource/kh;", "nativeAd", "Lcom/ironsource/kh;", "adapter", "<init>", "(Lcom/ironsource/adapters/ironsource/IronSourceAdapter;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class IronSourceNativeAdAdapter extends com.json.mediationsdk.adapter.AbstractNativeAdAdapter<com.json.adapters.ironsource.IronSourceAdapter> {
    private com.json.kh nativeAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IronSourceNativeAdAdapter(com.json.adapters.ironsource.IronSourceAdapter adapter) {
        super(adapter);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNativeAdForBidding$lambda$0(com.json.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter this$0, org.json.JSONObject config, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "$config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        try {
            com.json.kh khVarA = com.json.kh.INSTANCE.a();
            khVarA.a(new com.json.adapters.ironsource.nativeAd.IronSourceNativeAdListener(new com.json.adapters.ironsource.nativeAd.IronSourceNativeAdViewBinder(khVarA, this$0.getNativeAdProperties(config)), listener));
            android.app.Activity activity = com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity();
            org.json.JSONObject jSONObjectPrepareLoadParams = this$0.prepareLoadParams(config, str);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "activity");
            khVarA.a(activity, jSONObjectPrepareLoadParams);
            this$0.nativeAd = khVarA;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            listener.onNativeAdLoadFailed(new com.json.mediationsdk.logger.IronSourceError(510, "IronSourceAdapter loadNativeAd exception " + e.getMessage()));
        }
    }

    private final org.json.JSONObject prepareLoadParams(org.json.JSONObject config, java.lang.String serverData) throws org.json.JSONException {
        org.json.JSONObject loadParams = new org.json.JSONObject().put("demandSourceName", getAdapter().getDemandSourceName(config)).put(com.json.y8.r, "2").put("inAppBidding", true).put(getAdapter().ADM_KEY, com.json.mediationsdk.d.b().a(serverData));
        java.util.HashMap<java.lang.String, java.lang.String> extraParams = getAdapter().getInitParams();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(extraParams, "extraParams");
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : extraParams.entrySet()) {
            loadParams.put(entry.getKey(), entry.getValue());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadParams, "loadParams");
        return loadParams;
    }

    @Override // com.json.mediationsdk.adapter.AbstractNativeAdAdapter, com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        com.json.kh khVar = this.nativeAd;
        if (khVar != null) {
            khVar.destroy();
        }
    }

    @Override // com.json.mediationsdk.adapter.AbstractNativeAdAdapter, com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getNativeAdBiddingData(org.json.JSONObject config, org.json.JSONObject adData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return new java.util.HashMap();
    }

    @Override // com.json.mediationsdk.adapter.AbstractNativeAdAdapter, com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(java.lang.String appKey, java.lang.String userId, org.json.JSONObject config, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        getAdapter().initSDK(appKey, config);
        listener.onNativeAdInitSuccess();
    }

    @Override // com.json.mediationsdk.adapter.AbstractNativeAdAdapter, com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(final org.json.JSONObject config, org.json.JSONObject adData, final java.lang.String serverData, final com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        postOnUIThread(new java.lang.Runnable() { // from class: com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter.loadNativeAdForBidding$lambda$0(this.f$0, config, listener, serverData);
            }
        });
    }

    @Override // com.json.mediationsdk.sdk.ReleaseMemoryAdapterInterface
    public void releaseMemory(com.ironsource.mediationsdk.IronSource.AD_UNIT adUnit, org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
    }
}
