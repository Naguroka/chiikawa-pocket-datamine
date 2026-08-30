package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ironsource/nc;", "", "Landroid/os/Bundle;", "bundle", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "Ljava/lang/String;", "KEY_PREFIX", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.nc f3075a = new com.json.nc();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final java.lang.String KEY_PREFIX = "ext_";

    private nc() {
    }

    public final java.util.Map<java.lang.String, java.lang.String> a(android.os.Bundle bundle) {
        java.util.Set<java.lang.String> setKeySet = bundle != null ? bundle.keySet() : null;
        if (setKeySet == null) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(setKeySet, 10)), 16));
        for (java.lang.String str : setKeySet) {
            java.lang.String str2 = KEY_PREFIX + str;
            java.lang.Object obj = bundle.get(str);
            kotlin.Pair pair = kotlin.TuplesKt.to(str2, obj instanceof java.lang.Iterable ? kotlin.collections.CollectionsKt.joinToString$default((java.lang.Iterable) obj, ", ", null, null, 0, null, null, 62, null) : obj == null ? null : obj.toString());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
