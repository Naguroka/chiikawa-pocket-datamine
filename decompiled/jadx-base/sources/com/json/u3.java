package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/ironsource/u3;", "", "", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "Lcom/ironsource/p;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/Map;", "()Ljava/util/Map;", "adFormats", "Lorg/json/JSONObject;", "applicationAuctionSettings", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.json.p> adFormats;

    public u3(org.json.JSONObject applicationAuctionSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationAuctionSettings, "applicationAuctionSettings");
        com.unity3d.mediation.LevelPlay.AdFormat[] adFormatArrValues = com.unity3d.mediation.LevelPlay.AdFormat.values();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(adFormatArrValues.length), 16));
        for (com.unity3d.mediation.LevelPlay.AdFormat adFormat : adFormatArrValues) {
            org.json.JSONObject jSONObjectOptJSONObject = applicationAuctionSettings.optJSONObject(com.json.rt.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new org.json.JSONObject();
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "applicationAuctionSettin…ormatKey) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new com.json.p(jSONObjectOptJSONObject));
        }
        this.adFormats = linkedHashMap;
    }

    public final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.json.p> a() {
        return this.adFormats;
    }
}
