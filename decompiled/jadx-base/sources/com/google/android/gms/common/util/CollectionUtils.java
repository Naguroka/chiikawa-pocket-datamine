package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static boolean isEmpty(java.util.Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf() {
        return java.util.Collections.emptyList();
    }

    public static <K, V> java.util.Map<K, V> mapOf(K k, V v, K k2, V v2, K k3, V v3) {
        java.util.Map mapZza = zza(3, false);
        mapZza.put(k, v);
        mapZza.put(k2, v2);
        mapZza.put(k3, v3);
        return java.util.Collections.unmodifiableMap(mapZza);
    }

    public static <K, V> java.util.Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new java.lang.IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return java.util.Collections.emptyMap();
        }
        if (length == 1) {
            return java.util.Collections.singletonMap(kArr[0], vArr[0]);
        }
        java.util.Map mapZza = zza(length, false);
        for (int i = 0; i < kArr.length; i++) {
            mapZza.put(kArr[i], vArr[i]);
        }
        return java.util.Collections.unmodifiableMap(mapZza);
    }

    public static <T> java.util.Set<T> mutableSetOfWithSize(int i) {
        return i == 0 ? new androidx.collection.ArraySet() : zzb(i, true);
    }

    @java.lang.Deprecated
    public static <T> java.util.Set<T> setOf(T t, T t2, T t3) {
        java.util.Set setZzb = zzb(3, false);
        setZzb.add(t);
        setZzb.add(t2);
        setZzb.add(t3);
        return java.util.Collections.unmodifiableSet(setZzb);
    }

    private static java.util.Map zza(int i, boolean z) {
        return i <= 256 ? new androidx.collection.ArrayMap(i) : new java.util.HashMap(i, 1.0f);
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf(T t) {
        return java.util.Collections.singletonList(t);
    }

    private static java.util.Set zzb(int i, boolean z) {
        if (i <= (true != z ? 256 : 128)) {
            return new androidx.collection.ArraySet(i);
        }
        return new java.util.HashSet(i, true != z ? 1.0f : 0.75f);
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return java.util.Collections.emptyList();
        }
        if (length == 1) {
            return java.util.Collections.singletonList(tArr[0]);
        }
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(tArr));
    }

    public static <K, V> java.util.Map<K, V> mapOf(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        java.util.Map mapZza = zza(6, false);
        mapZza.put(k, v);
        mapZza.put(k2, v2);
        mapZza.put(k3, v3);
        mapZza.put(k4, v4);
        mapZza.put(k5, v5);
        mapZza.put(k6, v6);
        return java.util.Collections.unmodifiableMap(mapZza);
    }

    @java.lang.Deprecated
    public static <T> java.util.Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return java.util.Collections.emptySet();
        }
        if (length == 1) {
            return java.util.Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            java.util.Set setZzb = zzb(2, false);
            setZzb.add(t);
            setZzb.add(t2);
            return java.util.Collections.unmodifiableSet(setZzb);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length == 4) {
            T t3 = tArr[0];
            T t4 = tArr[1];
            T t5 = tArr[2];
            T t6 = tArr[3];
            java.util.Set setZzb2 = zzb(4, false);
            setZzb2.add(t3);
            setZzb2.add(t4);
            setZzb2.add(t5);
            setZzb2.add(t6);
            return java.util.Collections.unmodifiableSet(setZzb2);
        }
        java.util.Set setZzb3 = zzb(length, false);
        java.util.Collections.addAll(setZzb3, tArr);
        return java.util.Collections.unmodifiableSet(setZzb3);
    }
}
