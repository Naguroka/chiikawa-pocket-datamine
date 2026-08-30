package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0010\u0010\u0012\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0012\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/a0;", "Lcom/ironsource/a2;", "Lcom/ironsource/y1;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/t2;", "Lcom/ironsource/t2;", "adTools", "Lcom/ironsource/z;", "b", "Lcom/ironsource/z;", "instanceData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", "c", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", "adapter", "<init>", "(Lcom/ironsource/t2;Lcom/ironsource/z;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class a0 implements com.json.a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.t2 adTools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.z instanceData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> adapter;

    public a0(com.json.t2 adTools, com.json.z instanceData, com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> baseAdAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        this.adTools = adTools;
        this.instanceData = instanceData;
        this.adapter = baseAdAdapter;
    }

    @Override // com.json.a2
    public java.util.Map<java.lang.String, java.lang.Object> a(com.json.y1 event) {
        java.lang.String adapterVersion;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        java.util.HashMap map = new java.util.HashMap();
        try {
            com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> baseAdAdapter = this.adapter;
            java.lang.String networkSDKVersion = "";
            if (baseAdAdapter != null) {
                com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
                kotlin.jvm.internal.Intrinsics.checkNotNull(networkAdapter);
                adapterVersion = networkAdapter.getAdapterVersion();
            } else {
                adapterVersion = "";
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapterVersion, "if (adapter != null) ada…!!.adapterVersion else \"\"");
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterVersion);
            com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> baseAdAdapter2 = this.adapter;
            if (baseAdAdapter2 != null) {
                com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface networkAdapter2 = baseAdAdapter2.getNetworkAdapter();
                kotlin.jvm.internal.Intrinsics.checkNotNull(networkAdapter2);
                networkSDKVersion = networkAdapter2.getNetworkSDKVersion();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(networkSDKVersion);
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, networkSDKVersion);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(com.json.l1.a(this.adTools, "could not get adapter version for event data " + this.instanceData.getCom.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE java.lang.String(), (java.lang.String) null, 2, (java.lang.Object) null));
        }
        java.lang.String strI = this.instanceData.j().i();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strI, "instanceData.adapterConfig.subProviderId");
        map.put("spId", strI);
        java.lang.String strA = this.instanceData.j().a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strA, "instanceData.adapterConfig.adSourceNameForEvents");
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, strA);
        map.put("instanceType", java.lang.Integer.valueOf(this.instanceData.getInstanceType()));
        java.lang.String serverData = this.instanceData.n().k();
        com.json.t2 t2Var = this.adTools;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serverData, "serverData");
        java.lang.String strE = t2Var.e(serverData);
        if (!android.text.TextUtils.isEmpty(strE)) {
            map.put("dynamicDemandSource", strE);
        }
        map.put("sessionDepth", java.lang.Integer.valueOf(this.instanceData.v()));
        if (!android.text.TextUtils.isEmpty(this.instanceData.u().getCustomNetwork())) {
            java.lang.String customNetwork = this.instanceData.u().getCustomNetwork();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(customNetwork, "instanceData.providerSettings.customNetwork");
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, customNetwork);
        }
        return map;
    }
}
