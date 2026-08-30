package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0005\rB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/ironsource/vp;", "", "", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "Lcom/ironsource/vp$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/Map;", "()Ljava/util/Map;", "adFormats", "Lorg/json/JSONObject;", com.json.pr.f3168a, "<init>", "(Lorg/json/JSONObject;)V", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class vp {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.ironsource.vp.a> adFormats;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/ironsource/vp$a;", "", "", "", "Lcom/ironsource/vp$b;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/Map;", "()Ljava/util/Map;", "adUnitIds", "Lorg/json/JSONObject;", "adFormatProviderOrder", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.util.Map<java.lang.String, com.ironsource.vp.b> adUnitIds;

        public a(org.json.JSONObject adFormatProviderOrder) throws org.json.JSONException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatProviderOrder, "adFormatProviderOrder");
            java.util.List<java.lang.String> listB = com.json.hk.b(adFormatProviderOrder.names());
            listB = listB == null ? kotlin.collections.CollectionsKt.emptyList() : listB;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listB, 10)), 16));
            for (java.lang.Object obj : listB) {
                org.json.JSONArray jSONArrayOptJSONArray = adFormatProviderOrder.optJSONArray((java.lang.String) obj);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new org.json.JSONArray();
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "adFormatProviderOrder.op…(adUnitId) ?: JSONArray()");
                }
                linkedHashMap.put(obj, new com.ironsource.vp.b(jSONArrayOptJSONArray));
            }
            this.adUnitIds = linkedHashMap;
        }

        public final java.util.Map<java.lang.String, com.ironsource.vp.b> a() {
            return this.adUnitIds;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ironsource/vp$b;", "", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/List;", "()Ljava/util/List;", com.json.pr.f3168a, "Lorg/json/JSONArray;", "<init>", "(Lorg/json/JSONArray;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.util.List<java.lang.String> providerOrder;

        public b(org.json.JSONArray providerOrder) throws org.json.JSONException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
            java.util.List<java.lang.String> listB = com.json.hk.b(providerOrder);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listB, "jsonArrayToStringList(providerOrder)");
            this.providerOrder = listB;
        }

        public final java.util.List<java.lang.String> a() {
            return this.providerOrder;
        }
    }

    public vp(org.json.JSONObject providerOrder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        com.unity3d.mediation.LevelPlay.AdFormat[] adFormatArrValues = com.unity3d.mediation.LevelPlay.AdFormat.values();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(adFormatArrValues.length), 16));
        for (com.unity3d.mediation.LevelPlay.AdFormat adFormat : adFormatArrValues) {
            org.json.JSONObject jSONObjectOptJSONObject = providerOrder.optJSONObject(com.json.rt.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new org.json.JSONObject();
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "providerOrder.optJSONObj…dFormat)) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new com.ironsource.vp.a(jSONObjectOptJSONObject));
        }
        this.adFormats = linkedHashMap;
    }

    public final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.ironsource.vp.a> a() {
        return this.adFormats;
    }
}
