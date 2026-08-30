package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public abstract class ForwardingFuture<V> extends com.google.common.collect.ForwardingObject implements java.util.concurrent.Future<V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract java.util.concurrent.Future<? extends V> delegate();

    protected ForwardingFuture() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        return delegate().cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return delegate().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return delegate().isDone();
    }

    @Override // java.util.concurrent.Future
    @com.google.common.util.concurrent.ParametricNullness
    public V get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return delegate().get();
    }

    @Override // java.util.concurrent.Future
    @com.google.common.util.concurrent.ParametricNullness
    public V get(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return delegate().get(timeout, unit);
    }

    public static abstract class SimpleForwardingFuture<V> extends com.google.common.util.concurrent.ForwardingFuture<V> {
        private final java.util.concurrent.Future<V> delegate;

        protected SimpleForwardingFuture(java.util.concurrent.Future<V> delegate) {
            this.delegate = (java.util.concurrent.Future) com.google.common.base.Preconditions.checkNotNull(delegate);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final java.util.concurrent.Future<V> delegate() {
            return this.delegate;
        }
    }
}
