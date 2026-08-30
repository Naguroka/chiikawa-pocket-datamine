package com.google.common.cache;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
public abstract class CacheLoader<K, V> {
    public abstract V load(K key) throws java.lang.Exception;

    protected CacheLoader() {
    }

    public com.google.common.util.concurrent.ListenableFuture<V> reload(K key, V oldValue) throws java.lang.Exception {
        com.google.common.base.Preconditions.checkNotNull(key);
        com.google.common.base.Preconditions.checkNotNull(oldValue);
        return com.google.common.util.concurrent.Futures.immediateFuture(load(key));
    }

    public java.util.Map<K, V> loadAll(java.lang.Iterable<? extends K> keys) throws java.lang.Exception {
        throw new com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException();
    }

    public static <K, V> com.google.common.cache.CacheLoader<K, V> from(com.google.common.base.Function<K, V> function) {
        return new com.google.common.cache.CacheLoader.FunctionToCacheLoader(function);
    }

    public static <V> com.google.common.cache.CacheLoader<java.lang.Object, V> from(com.google.common.base.Supplier<V> supplier) {
        return new com.google.common.cache.CacheLoader.SupplierToCacheLoader(supplier);
    }

    private static final class FunctionToCacheLoader<K, V> extends com.google.common.cache.CacheLoader<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Function<K, V> computingFunction;

        public FunctionToCacheLoader(com.google.common.base.Function<K, V> computingFunction) {
            this.computingFunction = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(computingFunction);
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k) {
            return this.computingFunction.apply((K) com.google.common.base.Preconditions.checkNotNull(k));
        }
    }

    public static <K, V> com.google.common.cache.CacheLoader<K, V> asyncReloading(final com.google.common.cache.CacheLoader<K, V> loader, final java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(loader);
        com.google.common.base.Preconditions.checkNotNull(executor);
        return loader.new AnonymousClass1(executor);
    }

    /* JADX INFO: renamed from: com.google.common.cache.CacheLoader$1, reason: invalid class name */
    class AnonymousClass1 extends com.google.common.cache.CacheLoader<K, V> {
        final /* synthetic */ java.util.concurrent.Executor val$executor;

        AnonymousClass1(final java.util.concurrent.Executor val$executor) {
            this.val$executor = val$executor;
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k) throws java.lang.Exception {
            return (V) com.google.common.cache.CacheLoader.this.load(k);
        }

        @Override // com.google.common.cache.CacheLoader
        public com.google.common.util.concurrent.ListenableFuture<V> reload(final K key, final V oldValue) {
            final com.google.common.cache.CacheLoader cacheLoader = com.google.common.cache.CacheLoader.this;
            com.google.common.util.concurrent.ListenableFutureTask listenableFutureTaskCreate = com.google.common.util.concurrent.ListenableFutureTask.create(new java.util.concurrent.Callable() { // from class: com.google.common.cache.CacheLoader$1$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return cacheLoader.reload(key, oldValue).get();
                }
            });
            this.val$executor.execute(listenableFutureTaskCreate);
            return listenableFutureTaskCreate;
        }

        @Override // com.google.common.cache.CacheLoader
        public java.util.Map<K, V> loadAll(java.lang.Iterable<? extends K> keys) throws java.lang.Exception {
            return com.google.common.cache.CacheLoader.this.loadAll(keys);
        }
    }

    private static final class SupplierToCacheLoader<V> extends com.google.common.cache.CacheLoader<java.lang.Object, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Supplier<V> computingSupplier;

        public SupplierToCacheLoader(com.google.common.base.Supplier<V> computingSupplier) {
            this.computingSupplier = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(computingSupplier);
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(java.lang.Object key) {
            com.google.common.base.Preconditions.checkNotNull(key);
            return this.computingSupplier.get();
        }
    }

    public static final class UnsupportedLoadingOperationException extends java.lang.UnsupportedOperationException {
        UnsupportedLoadingOperationException() {
        }
    }

    public static final class InvalidCacheLoadException extends java.lang.RuntimeException {
        public InvalidCacheLoadException(java.lang.String message) {
            super(message);
        }
    }
}
