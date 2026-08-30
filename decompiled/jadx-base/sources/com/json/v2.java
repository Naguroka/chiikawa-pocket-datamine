package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/ironsource/v2;", "", "T", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "valueExtractor", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lorg/json/JSONObject;", com.json.v2.c, "configurations", "<init>", "(Lorg/json/JSONObject;)V", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class v2 {
    public static final java.lang.String c = "adUnits";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final org.json.JSONObject adUnits;

    public v2(org.json.JSONObject configurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.adUnits = configurations.optJSONObject(c);
    }

    public final <T> java.util.Map<java.lang.String, T> a(kotlin.jvm.functions.Function1<? super org.json.JSONObject, ? extends T> valueExtractor) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        org.json.JSONObject jSONObject = this.adUnits;
        if (jSONObject == null) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(itKeys, "adUnits.keys()");
        kotlin.sequences.Sequence sequenceAsSequence = kotlin.sequences.SequencesKt.asSequence(itKeys);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (T t : sequenceAsSequence) {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject((java.lang.String) t);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(t, valueExtractor.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}
