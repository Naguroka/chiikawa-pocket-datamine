package com.google.common.cache;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
public abstract class AbstractLoadingCache<K, V> extends com.google.common.cache.AbstractCache<K, V> implements com.google.common.cache.LoadingCache<K, V> {
    protected AbstractLoadingCache() {
    }

    @Override // com.google.common.cache.LoadingCache
    public V getUnchecked(K key) {
        try {
            return get(key);
        } catch (java.util.concurrent.ExecutionException e) {
            throw new com.google.common.util.concurrent.UncheckedExecutionException(e.getCause());
        }
    }

    @Override // com.google.common.cache.LoadingCache
    public com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> keys) throws java.util.concurrent.ExecutionException {
        java.util.LinkedHashMap linkedHashMapNewLinkedHashMap = com.google.common.collect.Maps.newLinkedHashMap();
        for (K k : keys) {
            if (!linkedHashMapNewLinkedHashMap.containsKey(k)) {
                linkedHashMapNewLinkedHashMap.put(k, get(k));
            }
        }
        return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) linkedHashMapNewLinkedHashMap);
    }

    @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
    public final V apply(K key) {
        return getUnchecked(key);
    }

    @Override // com.google.common.cache.LoadingCache
    public void refresh(K key) {
        throw new java.lang.UnsupportedOperationException();
    }
}
