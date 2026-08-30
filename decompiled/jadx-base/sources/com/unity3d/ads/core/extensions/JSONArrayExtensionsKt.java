package com.unity3d.ads.core.extensions;

/* JADX INFO: compiled from: JSONArrayExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001*\u00020\u0004\u001a\u001d\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006*\u00020\u0004¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"getHeadersMap", "", "", "", "Lorg/json/JSONArray;", "toTypedArray", "", "", "kotlin.jvm.PlatformType", "(Lorg/json/JSONArray;)[Ljava/lang/Object;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JSONArrayExtensionsKt {
    public static final java.lang.Object[] toTypedArray(org.json.JSONArray jSONArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        kotlin.ranges.IntRange intRangeUntil = kotlin.ranges.RangesKt.until(0, jSONArray.length());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        java.util.Iterator<java.lang.Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((kotlin.collections.IntIterator) it).nextInt()));
        }
        return arrayList.toArray(new java.lang.Object[0]);
    }

    public static final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeadersMap(org.json.JSONArray jSONArray) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            java.lang.Object obj = jSONArray.get(i);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
            org.json.JSONArray jSONArray2 = (org.json.JSONArray) obj;
            java.util.ArrayList arrayList = (java.util.List) linkedHashMap.get(jSONArray2.getString(0));
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            java.lang.String string = jSONArray2.getString(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "header.getString(1)");
            arrayList.add(string);
            java.lang.String string2 = jSONArray2.getString(0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "header.getString(0)");
            linkedHashMap.put(string2, arrayList);
        }
        return linkedHashMap;
    }
}
