package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/ironsource/p2;", "Lcom/ironsource/mediationsdk/h;", "", "", "Lcom/ironsource/f0;", "waterfallPerformance", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/vv;", "waterfallInstances", "instanceName", "Lcom/ironsource/h0;", "e", "Ljava/util/Map;", "allInstancesPerformance", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "providers", "", "limit", "<init>", "(Ljava/util/List;I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class p2 extends com.json.mediationsdk.h {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.json.h0> allInstancesPerformance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(java.util.List<? extends com.json.mediationsdk.model.NetworkSettings> providers, int i) {
        super(providers, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providers, "providers");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(providers, 10)), 16));
        java.util.Iterator<T> it = providers.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = kotlin.TuplesKt.to(((com.json.mediationsdk.model.NetworkSettings) it.next()).getProviderName(), new com.json.h0(i));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.allInstancesPerformance = linkedHashMap;
    }

    private final void a(java.util.Map<java.lang.String, com.json.f0> waterfallPerformance) {
        for (java.util.Map.Entry<java.lang.String, com.json.h0> entry : this.allInstancesPerformance.entrySet()) {
            entry.getValue().a(waterfallPerformance.get(entry.getKey()));
        }
    }

    @Override // com.json.mediationsdk.h
    public java.lang.String a(java.lang.String instanceName) {
        java.lang.String strD;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        com.json.h0 h0Var = this.allInstancesPerformance.get(instanceName);
        return (h0Var == null || (strD = h0Var.d()) == null) ? "" : strD;
    }

    public final void a(com.json.vv waterfallInstances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        java.util.List<com.json.y> listB = waterfallInstances.b();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listB, 10)), 16));
        for (com.json.y yVar : listB) {
            kotlin.Pair pair = kotlin.TuplesKt.to(yVar.getInstanceName(), yVar.getPerformance());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        a(linkedHashMap);
    }
}
