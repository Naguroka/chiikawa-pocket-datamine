package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
class MapIteratorCache<K, V> {
    private final java.util.Map<K, V> backingMap;

    @javax.annotation.CheckForNull
    private volatile transient java.util.Map.Entry<K, V> cacheEntry;

    MapIteratorCache(java.util.Map<K, V> backingMap) {
        this.backingMap = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(backingMap);
    }

    @javax.annotation.CheckForNull
    final V put(K key, V value) {
        com.google.common.base.Preconditions.checkNotNull(key);
        com.google.common.base.Preconditions.checkNotNull(value);
        clearCache();
        return this.backingMap.put(key, value);
    }

    @javax.annotation.CheckForNull
    final V remove(java.lang.Object key) {
        com.google.common.base.Preconditions.checkNotNull(key);
        clearCache();
        return this.backingMap.remove(key);
    }

    final void clear() {
        clearCache();
        this.backingMap.clear();
    }

    @javax.annotation.CheckForNull
    V get(java.lang.Object key) {
        com.google.common.base.Preconditions.checkNotNull(key);
        V ifCached = getIfCached(key);
        return ifCached == null ? getWithoutCaching(key) : ifCached;
    }

    @javax.annotation.CheckForNull
    final V getWithoutCaching(java.lang.Object key) {
        com.google.common.base.Preconditions.checkNotNull(key);
        return this.backingMap.get(key);
    }

    final boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return getIfCached(key) != null || this.backingMap.containsKey(key);
    }

    final java.util.Set<K> unmodifiableKeySet() {
        return new java.util.AbstractSet<K>() { // from class: com.google.common.graph.MapIteratorCache.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<K> iterator() {
                final java.util.Iterator<java.util.Map.Entry<K, V>> it = com.google.common.graph.MapIteratorCache.this.backingMap.entrySet().iterator();
                return new com.google.common.collect.UnmodifiableIterator<K>() { // from class: com.google.common.graph.MapIteratorCache.1.1
                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public K next() {
                        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                        com.google.common.graph.MapIteratorCache.this.cacheEntry = entry;
                        return (K) entry.getKey();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.graph.MapIteratorCache.this.backingMap.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object key) {
                return com.google.common.graph.MapIteratorCache.this.containsKey(key);
            }
        };
    }

    @javax.annotation.CheckForNull
    V getIfCached(@javax.annotation.CheckForNull java.lang.Object key) {
        java.util.Map.Entry<K, V> entry = this.cacheEntry;
        if (entry == null || entry.getKey() != key) {
            return null;
        }
        return entry.getValue();
    }

    void clearCache() {
        this.cacheEntry = null;
    }
}
