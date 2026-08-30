package com.google.common.cache;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use CacheBuilder.newBuilder().build()")
@com.google.common.cache.ElementTypesAreNonnullByDefault
public interface Cache<K, V> {
    java.util.concurrent.ConcurrentMap<K, V> asMap();

    void cleanUp();

    V get(K key, java.util.concurrent.Callable<? extends V> loader) throws java.util.concurrent.ExecutionException;

    com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<? extends java.lang.Object> keys);

    @javax.annotation.CheckForNull
    V getIfPresent(java.lang.Object key);

    void invalidate(java.lang.Object key);

    void invalidateAll();

    void invalidateAll(java.lang.Iterable<? extends java.lang.Object> keys);

    void put(K key, V value);

    void putAll(java.util.Map<? extends K, ? extends V> m);

    long size();

    com.google.common.cache.CacheStats stats();
}
