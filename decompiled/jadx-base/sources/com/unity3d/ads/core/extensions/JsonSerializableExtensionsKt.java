package com.unity3d.ads.core.extensions;

/* JADX INFO: compiled from: JsonSerializableExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"toJsonArray", "Lorg/json/JSONArray;", "", "Lcom/unity3d/services/store/JsonSerializable;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JsonSerializableExtensionsKt {
    public static final org.json.JSONArray toJsonArray(java.util.List<? extends com.unity3d.services.store.JsonSerializable> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<? extends com.unity3d.services.store.JsonSerializable> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJson());
        }
        return jSONArray;
    }
}
