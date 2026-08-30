package com.google.common.cache;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
public abstract class ForwardingCache<K, V> extends com.google.common.collect.ForwardingObject implements com.google.common.cache.Cache<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract com.google.common.cache.Cache<K, V> delegate();

    protected ForwardingCache() {
    }

    @Override // com.google.common.cache.Cache
    @javax.annotation.CheckForNull
    public V getIfPresent(java.lang.Object key) {
        return delegate().getIfPresent(key);
    }

    @Override // com.google.common.cache.Cache
    public V get(K key, java.util.concurrent.Callable<? extends V> valueLoader) throws java.util.concurrent.ExecutionException {
        return delegate().get(key, valueLoader);
    }

    @Override // com.google.common.cache.Cache
    public com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<? extends java.lang.Object> keys) {
        return delegate().getAllPresent(keys);
    }

    @Override // com.google.common.cache.Cache
    public void put(K key, V value) {
        delegate().put(key, value);
    }

    @Override // com.google.common.cache.Cache
    public void putAll(java.util.Map<? extends K, ? extends V> m) {
        delegate().putAll(m);
    }

    @Override // com.google.common.cache.Cache
    public void invalidate(java.lang.Object key) {
        delegate().invalidate(key);
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll(java.lang.Iterable<? extends java.lang.Object> keys) {
        delegate().invalidateAll(keys);
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll() {
        delegate().invalidateAll();
    }

    @Override // com.google.common.cache.Cache
    public long size() {
        return delegate().size();
    }

    @Override // com.google.common.cache.Cache
    public com.google.common.cache.CacheStats stats() {
        return delegate().stats();
    }

    @Override // com.google.common.cache.Cache
    public java.util.concurrent.ConcurrentMap<K, V> asMap() {
        return delegate().asMap();
    }

    @Override // com.google.common.cache.Cache
    public void cleanUp() {
        delegate().cleanUp();
    }

    public static abstract class SimpleForwardingCache<K, V> extends com.google.common.cache.ForwardingCache<K, V> {
        private final com.google.common.cache.Cache<K, V> delegate;

        protected SimpleForwardingCache(com.google.common.cache.Cache<K, V> delegate) {
            this.delegate = (com.google.common.cache.Cache) com.google.common.base.Preconditions.checkNotNull(delegate);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final com.google.common.cache.Cache<K, V> delegate() {
            return this.delegate;
        }
    }
}
