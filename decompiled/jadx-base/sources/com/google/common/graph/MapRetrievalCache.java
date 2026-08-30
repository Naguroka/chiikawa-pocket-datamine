package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class MapRetrievalCache<K, V> extends com.google.common.graph.MapIteratorCache<K, V> {

    @javax.annotation.CheckForNull
    private volatile transient com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> cacheEntry1;

    @javax.annotation.CheckForNull
    private volatile transient com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> cacheEntry2;

    MapRetrievalCache(java.util.Map<K, V> backingMap) {
        super(backingMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.MapIteratorCache
    @javax.annotation.CheckForNull
    V get(java.lang.Object key) {
        com.google.common.base.Preconditions.checkNotNull(key);
        V ifCached = getIfCached(key);
        if (ifCached != null) {
            return ifCached;
        }
        V withoutCaching = getWithoutCaching(key);
        if (withoutCaching != null) {
            addToCache(key, withoutCaching);
        }
        return withoutCaching;
    }

    @Override // com.google.common.graph.MapIteratorCache
    @javax.annotation.CheckForNull
    V getIfCached(@javax.annotation.CheckForNull java.lang.Object obj) {
        V v = (V) super.getIfCached(obj);
        if (v != null) {
            return v;
        }
        com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> cacheEntry = this.cacheEntry1;
        if (cacheEntry != null && cacheEntry.key == obj) {
            return cacheEntry.value;
        }
        com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> cacheEntry2 = this.cacheEntry2;
        if (cacheEntry2 == null || cacheEntry2.key != obj) {
            return null;
        }
        addToCache(cacheEntry2);
        return cacheEntry2.value;
    }

    @Override // com.google.common.graph.MapIteratorCache
    void clearCache() {
        super.clearCache();
        this.cacheEntry1 = null;
        this.cacheEntry2 = null;
    }

    private void addToCache(K key, V value) {
        addToCache(new com.google.common.graph.MapRetrievalCache.CacheEntry<>(key, value));
    }

    private void addToCache(com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> entry) {
        this.cacheEntry2 = this.cacheEntry1;
        this.cacheEntry1 = entry;
    }

    private static final class CacheEntry<K, V> {
        final K key;
        final V value;

        CacheEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
