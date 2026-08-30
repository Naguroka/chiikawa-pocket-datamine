package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0007\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/oa;", "", "", "eventId", "", "instanceId", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/vr;", "initState", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface oa {

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001J\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0007R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\r"}, d2 = {"Lcom/ironsource/oa$a;", "", "", com.ironsource.y8.h.W, "value", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "Ljava/util/Map;", "data", "providerName", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.util.Map<java.lang.String, java.lang.Object> data;

        public a(java.lang.String providerName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "providerName");
            this.data = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, providerName), kotlin.TuplesKt.to(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        public final java.util.Map<java.lang.String, java.lang.Object> a() {
            return kotlin.collections.MapsKt.toMutableMap(this.data);
        }

        public final void a(java.lang.String key, java.lang.Object value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.data.put(key, value);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/oa$b;", "Lcom/ironsource/oa;", "", "eventId", "", "instanceId", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/vr;", "initState", "Lcom/ironsource/mf;", "Lcom/ironsource/mf;", "eventManager", "Lcom/ironsource/oa$a;", "b", "Lcom/ironsource/oa$a;", "eventBaseData", "<init>", "(Lcom/ironsource/mf;Lcom/ironsource/oa$a;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements com.json.oa {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.json.mf eventManager;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final com.ironsource.oa.a eventBaseData;

        public b(com.json.mf eventManager, com.ironsource.oa.a eventBaseData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
            this.eventManager = eventManager;
            this.eventBaseData = eventBaseData;
        }

        @Override // com.json.oa
        public void a(int eventId, com.json.vr initState) {
            java.util.Map<java.lang.String, java.lang.Object> mapA = this.eventBaseData.a();
            mapA.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, java.lang.String.valueOf(initState));
            this.eventManager.a(new com.json.wb(eventId, new org.json.JSONObject(kotlin.collections.MapsKt.toMap(mapA))));
        }

        @Override // com.json.oa
        public void a(int eventId, java.lang.String instanceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            java.util.Map<java.lang.String, java.lang.Object> mapA = this.eventBaseData.a();
            mapA.put("spId", instanceId);
            this.eventManager.a(new com.json.wb(eventId, new org.json.JSONObject(kotlin.collections.MapsKt.toMap(mapA))));
        }
    }

    void a(int eventId, com.json.vr initState);

    void a(int eventId, java.lang.String instanceId);
}
