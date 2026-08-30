package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ironsource/op;", "", "T", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "valueExtractor", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lorg/json/JSONArray;", "Lorg/json/JSONArray;", com.json.op.c, "configuration", "<init>", "(Lorg/json/JSONObject;)V", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class op {
    public static final java.lang.String c = "placements";
    public static final java.lang.String d = "placementName";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final org.json.JSONArray placements;

    public op(org.json.JSONObject configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.placements = configuration.optJSONArray(c);
    }

    public final <T> java.util.Map<java.lang.String, T> a(kotlin.jvm.functions.Function1<? super org.json.JSONObject, ? extends T> valueExtractor) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        org.json.JSONArray jSONArray = this.placements;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                org.json.JSONObject jsonObject = jSONArray.getJSONObject(i);
                java.lang.String key = jsonObject.optString(d);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonObject, "jsonObject");
                T tInvoke = valueExtractor.invoke(jsonObject);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(key, tInvoke);
            }
        }
        return linkedHashMap;
    }
}
