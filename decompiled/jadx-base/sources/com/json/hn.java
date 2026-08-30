package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÂ\u0003J\u000e\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u0005\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u001f\u0010\u0005\u001a\u00020\u00002\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/ironsource/hn;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lorg/json/JSONObject;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/v;", "networkData", "", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "adapter", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseWrapper;", "adapterWrapper", "networkDataMap", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class hn {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, org.json.JSONObject> networkDataMap;

    /* JADX WARN: Multi-variable type inference failed */
    public hn() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public hn(java.util.concurrent.ConcurrentHashMap<java.lang.String, org.json.JSONObject> networkDataMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkDataMap, "networkDataMap");
        this.networkDataMap = networkDataMap;
    }

    public /* synthetic */ hn(java.util.concurrent.ConcurrentHashMap concurrentHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.concurrent.ConcurrentHashMap() : concurrentHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.json.hn a(com.json.hn hnVar, java.util.concurrent.ConcurrentHashMap concurrentHashMap, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            concurrentHashMap = hnVar.networkDataMap;
        }
        return hnVar.a((java.util.concurrent.ConcurrentHashMap<java.lang.String, org.json.JSONObject>) concurrentHashMap);
    }

    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, org.json.JSONObject> a() {
        return this.networkDataMap;
    }

    public final com.json.hn a(java.util.concurrent.ConcurrentHashMap<java.lang.String, org.json.JSONObject> networkDataMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkDataMap, "networkDataMap");
        return new com.json.hn(networkDataMap);
    }

    public final void a(com.json.mediationsdk.AbstractAdapter adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "adapter");
        java.util.Set<java.util.Map.Entry<java.lang.String, org.json.JSONObject>> setEntrySet = this.networkDataMap.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(setEntrySet, "networkDataMap.entries");
        java.util.ArrayList<java.util.Map.Entry> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setEntrySet) {
            if (com.json.mediationsdk.c.a((java.lang.String) ((java.util.Map.Entry) obj).getKey(), adapter)) {
                arrayList.add(obj);
            }
        }
        for (java.util.Map.Entry entry : arrayList) {
            java.lang.Object key = entry.getKey();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "it.key");
            java.lang.Object value = entry.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "it.value");
            adapter.setNetworkData(new com.json.mediationsdk.v((java.lang.String) key, (org.json.JSONObject) value));
        }
    }

    public final void a(com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper adapterWrapper) {
        java.util.Set<java.util.Map.Entry<java.lang.String, org.json.JSONObject>> setEntrySet = this.networkDataMap.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(setEntrySet, "networkDataMap.entries");
        java.util.ArrayList<java.util.Map.Entry> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setEntrySet) {
            if (com.json.mediationsdk.c.a((java.lang.String) ((java.util.Map.Entry) obj).getKey(), adapterWrapper)) {
                arrayList.add(obj);
            }
        }
        for (java.util.Map.Entry entry : arrayList) {
            com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface = adapterWrapper != null ? adapterWrapper.getAdapterBaseInterface() : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(adapterBaseInterface, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface");
            java.lang.Object key = entry.getKey();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "it.key");
            java.lang.Object value = entry.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "it.value");
            ((com.json.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface) adapterBaseInterface).setNetworkData(new com.json.mediationsdk.v((java.lang.String) key, (org.json.JSONObject) value));
        }
    }

    public final void a(com.json.mediationsdk.v networkData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkData, "networkData");
        if (!this.networkDataMap.containsKey(networkData.getNetworkName())) {
            this.networkDataMap.put(networkData.getNetworkName(), networkData.getNetworkData());
            return;
        }
        try {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.json.JSONObject> concurrentHashMap = this.networkDataMap;
            java.lang.String networkName = networkData.getNetworkName();
            org.json.JSONObject jSONObject = this.networkDataMap.get(networkData.getNetworkName());
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            org.json.JSONObject jSONObjectDeepMergeJSONObjects = com.json.mediationsdk.utils.IronSourceUtils.deepMergeJSONObjects(jSONObject, networkData.getNetworkData());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObjectDeepMergeJSONObjects, "deepMergeJSONObjects(\n  …), networkData.allData())");
            concurrentHashMap.put(networkName, jSONObjectDeepMergeJSONObjects);
        } catch (java.lang.Exception e) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("error while merging network data: " + e.getMessage());
        }
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.json.hn) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkDataMap, ((com.json.hn) other).networkDataMap);
    }

    public int hashCode() {
        return this.networkDataMap.hashCode();
    }

    public java.lang.String toString() {
        return "NetworkDataStore(networkDataMap=" + this.networkDataMap + ')';
    }
}
