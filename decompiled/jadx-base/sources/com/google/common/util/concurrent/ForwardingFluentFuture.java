package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
final class ForwardingFluentFuture<V> extends com.google.common.util.concurrent.FluentFuture<V> {
    private final com.google.common.util.concurrent.ListenableFuture<V> delegate;

    ForwardingFluentFuture(com.google.common.util.concurrent.ListenableFuture<V> delegate) {
        this.delegate = (com.google.common.util.concurrent.ListenableFuture) com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable listener, java.util.concurrent.Executor executor) {
        this.delegate.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        return this.delegate.cancel(mayInterruptIfRunning);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.delegate.isCancelled();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean isDone() {
        return this.delegate.isDone();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    @com.google.common.util.concurrent.ParametricNullness
    public V get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return this.delegate.get();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    @com.google.common.util.concurrent.ParametricNullness
    public V get(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return this.delegate.get(timeout, unit);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public java.lang.String toString() {
        return this.delegate.toString();
    }
}
