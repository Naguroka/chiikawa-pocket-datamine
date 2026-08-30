package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J-\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0010H\u0016J&\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002J\u0006\u0010\t\u001a\u00020\u0005R\u0017\u0010\u0019\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/ironsource/mediationsdk/v;", "Lcom/ironsource/mediationsdk/AdapterNetworkData;", "", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "adapters", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseWrapper;", "networkAdapters", "b", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "Lorg/json/JSONObject;", "networkDataByAdUnit", "allData", "T", "", "desiredKey", "Ljava/lang/Class;", "valueType", "dataByKeyIgnoreCase", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "toString", "Ljava/lang/String;", "()Ljava/lang/String;", "networkName", "Lorg/json/JSONObject;", "networkData", "data", "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class v implements com.json.mediationsdk.AdapterNetworkData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String networkName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final org.json.JSONObject networkData;

    public v(java.lang.String networkName, org.json.JSONObject data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkName, "networkName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        this.networkName = networkName;
        this.networkData = new org.json.JSONObject(data.toString());
    }

    private final void a(java.util.Collection<? extends com.json.mediationsdk.AbstractAdapter> adapters) {
        java.util.List listFilterNotNull = kotlin.collections.CollectionsKt.filterNotNull(adapters);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listFilterNotNull) {
            if (com.json.mediationsdk.c.a(this.networkName, (com.json.mediationsdk.AbstractAdapter) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.json.mediationsdk.AbstractAdapter) it.next()).setNetworkData(this);
        }
    }

    private final void b(java.util.Collection<? extends com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> networkAdapters) {
        java.util.List listFilterNotNull = kotlin.collections.CollectionsKt.filterNotNull(networkAdapters);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listFilterNotNull) {
            if (com.json.mediationsdk.c.a(this.networkName, (com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper) it.next()).getAdapterBaseInterface());
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            if (obj2 instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface) {
                arrayList3.add(obj2);
            }
        }
        java.util.Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((com.json.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface) it2.next()).setNetworkData(this);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.String getNetworkName() {
        return this.networkName;
    }

    public final void a(java.util.Collection<? extends com.json.mediationsdk.AbstractAdapter> adapters, java.util.Collection<? extends com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> networkAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapters, "adapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        try {
            a(adapters);
            b(networkAdapters);
        } catch (java.lang.Exception e) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("error while setting network data: " + e.getMessage());
        }
    }

    @Override // com.json.mediationsdk.AdapterNetworkData
    /* JADX INFO: renamed from: allData, reason: from getter */
    public org.json.JSONObject getNetworkData() {
        return this.networkData;
    }

    public final void b() {
        java.util.Iterator<java.lang.String> itKeys = this.networkData.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(itKeys, "networkData.keys()");
        com.json.jj.i().a(new com.json.wb(57, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false).put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, this.networkName + " - " + kotlin.collections.CollectionsKt.joinToString$default(kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.asSequence(itKeys)), ",", null, null, 0, null, null, 62, null))));
    }

    @Override // com.json.mediationsdk.AdapterNetworkData
    public <T> T dataByKeyIgnoreCase(java.lang.String desiredKey, java.lang.Class<T> valueType) {
        T next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(desiredKey, "desiredKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueType, "valueType");
        java.util.Iterator<java.lang.String> itKeys = getNetworkData().keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(itKeys, "allData()\n          .keys()");
        java.util.Iterator<T> it = kotlin.sequences.SequencesKt.asSequence(itKeys).iterator();
        do {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
        } while (!kotlin.text.StringsKt.equals((java.lang.String) next, desiredKey, true));
        java.lang.String str = next;
        if (str == null) {
            return null;
        }
        java.lang.Object objOpt = getNetworkData().opt(str);
        if (!valueType.isInstance(objOpt)) {
            objOpt = null;
        }
        if (objOpt != null) {
            return valueType.cast(objOpt);
        }
        return null;
    }

    @Override // com.json.mediationsdk.AdapterNetworkData
    public org.json.JSONObject networkDataByAdUnit(com.ironsource.mediationsdk.IronSource.AD_UNIT adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        org.json.JSONObject jSONObjectOptJSONObject = this.networkData.optJSONObject(adUnit.toString());
        return jSONObjectOptJSONObject == null ? new org.json.JSONObject() : jSONObjectOptJSONObject;
    }

    public java.lang.String toString() {
        return "NetworkData(networkName=" + this.networkName + ", networkData=" + this.networkData + ')';
    }
}
