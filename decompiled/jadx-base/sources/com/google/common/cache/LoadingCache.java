package com.google.common.cache;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
public interface LoadingCache<K, V> extends com.google.common.cache.Cache<K, V>, com.google.common.base.Function<K, V> {
    @Override // com.google.common.base.Function
    @java.lang.Deprecated
    V apply(K key);

    @Override // com.google.common.cache.Cache
    java.util.concurrent.ConcurrentMap<K, V> asMap();

    V get(K key) throws java.util.concurrent.ExecutionException;

    com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> keys) throws java.util.concurrent.ExecutionException;

    V getUnchecked(K key);

    void refresh(K key);
}
