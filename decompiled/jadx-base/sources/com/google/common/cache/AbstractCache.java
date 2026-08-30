package com.google.common.cache;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
public abstract class AbstractCache<K, V> implements com.google.common.cache.Cache<K, V> {

    public interface StatsCounter {
        void recordEviction();

        void recordHits(int count);

        void recordLoadException(long loadTime);

        void recordLoadSuccess(long loadTime);

        void recordMisses(int count);

        com.google.common.cache.CacheStats snapshot();
    }

    @Override // com.google.common.cache.Cache
    public void cleanUp() {
    }

    protected AbstractCache() {
    }

    @Override // com.google.common.cache.Cache
    public V get(K key, java.util.concurrent.Callable<? extends V> valueLoader) throws java.util.concurrent.ExecutionException {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<? extends java.lang.Object> keys) {
        V ifPresent;
        java.util.LinkedHashMap linkedHashMapNewLinkedHashMap = com.google.common.collect.Maps.newLinkedHashMap();
        for (java.lang.Object obj : keys) {
            if (!linkedHashMapNewLinkedHashMap.containsKey(obj) && (ifPresent = getIfPresent(obj)) != null) {
                linkedHashMapNewLinkedHashMap.put(obj, ifPresent);
            }
        }
        return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) linkedHashMapNewLinkedHashMap);
    }

    @Override // com.google.common.cache.Cache
    public void put(K key, V value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void putAll(java.util.Map<? extends K, ? extends V> m) {
        for (java.util.Map.Entry<? extends K, ? extends V> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.cache.Cache
    public long size() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void invalidate(java.lang.Object key) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll(java.lang.Iterable<? extends java.lang.Object> keys) {
        java.util.Iterator<? extends java.lang.Object> it = keys.iterator();
        while (it.hasNext()) {
            invalidate(it.next());
        }
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public com.google.common.cache.CacheStats stats() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public java.util.concurrent.ConcurrentMap<K, V> asMap() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static final class SimpleStatsCounter implements com.google.common.cache.AbstractCache.StatsCounter {
        private final com.google.common.cache.LongAddable hitCount = com.google.common.cache.LongAddables.create();
        private final com.google.common.cache.LongAddable missCount = com.google.common.cache.LongAddables.create();
        private final com.google.common.cache.LongAddable loadSuccessCount = com.google.common.cache.LongAddables.create();
        private final com.google.common.cache.LongAddable loadExceptionCount = com.google.common.cache.LongAddables.create();
        private final com.google.common.cache.LongAddable totalLoadTime = com.google.common.cache.LongAddables.create();
        private final com.google.common.cache.LongAddable evictionCount = com.google.common.cache.LongAddables.create();

        private static long negativeToMaxValue(long value) {
            if (value >= 0) {
                return value;
            }
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordHits(int count) {
            this.hitCount.add(count);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordMisses(int count) {
            this.missCount.add(count);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadSuccess(long loadTime) {
            this.loadSuccessCount.increment();
            this.totalLoadTime.add(loadTime);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadException(long loadTime) {
            this.loadExceptionCount.increment();
            this.totalLoadTime.add(loadTime);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordEviction() {
            this.evictionCount.increment();
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public com.google.common.cache.CacheStats snapshot() {
            return new com.google.common.cache.CacheStats(negativeToMaxValue(this.hitCount.sum()), negativeToMaxValue(this.missCount.sum()), negativeToMaxValue(this.loadSuccessCount.sum()), negativeToMaxValue(this.loadExceptionCount.sum()), negativeToMaxValue(this.totalLoadTime.sum()), negativeToMaxValue(this.evictionCount.sum()));
        }

        public void incrementBy(com.google.common.cache.AbstractCache.StatsCounter other) {
            com.google.common.cache.CacheStats cacheStatsSnapshot = other.snapshot();
            this.hitCount.add(cacheStatsSnapshot.hitCount());
            this.missCount.add(cacheStatsSnapshot.missCount());
            this.loadSuccessCount.add(cacheStatsSnapshot.loadSuccessCount());
            this.loadExceptionCount.add(cacheStatsSnapshot.loadExceptionCount());
            this.totalLoadTime.add(cacheStatsSnapshot.totalLoadTime());
            this.evictionCount.add(cacheStatsSnapshot.evictionCount());
        }
    }
}
