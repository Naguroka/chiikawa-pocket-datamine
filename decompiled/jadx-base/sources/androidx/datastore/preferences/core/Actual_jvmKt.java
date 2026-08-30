package androidx.datastore.preferences.core;

/* JADX INFO: compiled from: Actual.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a4\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005H\u0000\u001a\b\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, d2 = {"immutableCopyOfSet", "", "T", "set", "immutableMap", "", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "map", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "datastore-preferences-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Actual_jvmKt {
    public static final <K, V> java.util.Map<K, V> immutableMap(java.util.Map<K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "map");
        java.util.Map<K, V> mapUnmodifiableMap = java.util.Collections.unmodifiableMap(map);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public static final <T> java.util.Set<T> immutableCopyOfSet(java.util.Set<? extends T> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "set");
        java.util.Set<T> setUnmodifiableSet = java.util.Collections.unmodifiableSet(kotlin.collections.CollectionsKt.toSet(set));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    public static final kotlinx.coroutines.CoroutineDispatcher ioDispatcher() {
        return kotlinx.coroutines.Dispatchers.getIO();
    }
}
