package com.unity3d.services.core.network.mapper;

/* JADX INFO: compiled from: HttpResponseHeaderToJSONArray.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0004\u0018\u00010\u0002¨\u0006\u0005"}, d2 = {"toResponseHeadersMap", "Lorg/json/JSONArray;", "", "", "", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HttpResponseHeaderToJSONArrayKt {
    public static final org.json.JSONArray toResponseHeadersMap(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
        java.util.Set<java.util.Map.Entry<java.lang.String, ? extends java.util.List<java.lang.String>>> setEntrySet;
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                jSONArray = jSONArray.put(new org.json.JSONArray((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.String) entry.getKey(), (java.util.List) entry.getValue())));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray, "acc.put(JSONArray(listOf(key, value)))");
            }
            if (jSONArray != null) {
                return jSONArray;
            }
        }
        return new org.json.JSONArray();
    }
}
