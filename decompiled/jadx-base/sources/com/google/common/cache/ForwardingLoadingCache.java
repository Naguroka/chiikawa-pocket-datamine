package com.google.common.cache;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
public abstract class ForwardingLoadingCache<K, V> extends com.google.common.cache.ForwardingCache<K, V> implements com.google.common.cache.LoadingCache<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
    public abstract com.google.common.cache.LoadingCache<K, V> delegate();

    protected ForwardingLoadingCache() {
    }

    @Override // com.google.common.cache.LoadingCache
    public V get(K key) throws java.util.concurrent.ExecutionException {
        return delegate().get(key);
    }

    @Override // com.google.common.cache.LoadingCache
    public V getUnchecked(K key) {
        return delegate().getUnchecked(key);
    }

    @Override // com.google.common.cache.LoadingCache
    public com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> keys) throws java.util.concurrent.ExecutionException {
        return delegate().getAll(keys);
    }

    @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
    public V apply(K key) {
        return delegate().apply(key);
    }

    @Override // com.google.common.cache.LoadingCache
    public void refresh(K key) {
        delegate().refresh(key);
    }

    public static abstract class SimpleForwardingLoadingCache<K, V> extends com.google.common.cache.ForwardingLoadingCache<K, V> {
        private final com.google.common.cache.LoadingCache<K, V> delegate;

        protected SimpleForwardingLoadingCache(com.google.common.cache.LoadingCache<K, V> delegate) {
            this.delegate = (com.google.common.cache.LoadingCache) com.google.common.base.Preconditions.checkNotNull(delegate);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final com.google.common.cache.LoadingCache<K, V> delegate() {
            return this.delegate;
        }
    }
}
