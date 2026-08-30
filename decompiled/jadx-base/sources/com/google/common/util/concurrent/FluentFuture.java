package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use FluentFuture.from(Futures.immediate*Future) or SettableFuture")
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public abstract class FluentFuture<V> extends com.google.common.util.concurrent.GwtFluentFutureCatchingSpecialization<V> {

    static abstract class TrustedFuture<V> extends com.google.common.util.concurrent.FluentFuture<V> implements com.google.common.util.concurrent.AbstractFuture.Trusted<V> {
        TrustedFuture() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @com.google.common.util.concurrent.ParametricNullness
        public final V get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @com.google.common.util.concurrent.ParametricNullness
        public final V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            return (V) super.get(j, timeUnit);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
        public final void addListener(java.lang.Runnable listener, java.util.concurrent.Executor executor) {
            super.addListener(listener, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean cancel(boolean mayInterruptIfRunning) {
            return super.cancel(mayInterruptIfRunning);
        }
    }

    FluentFuture() {
    }

    public static <V> com.google.common.util.concurrent.FluentFuture<V> from(com.google.common.util.concurrent.ListenableFuture<V> future) {
        if (future instanceof com.google.common.util.concurrent.FluentFuture) {
            return (com.google.common.util.concurrent.FluentFuture) future;
        }
        return new com.google.common.util.concurrent.ForwardingFluentFuture(future);
    }

    @java.lang.Deprecated
    public static <V> com.google.common.util.concurrent.FluentFuture<V> from(com.google.common.util.concurrent.FluentFuture<V> future) {
        return (com.google.common.util.concurrent.FluentFuture) com.google.common.base.Preconditions.checkNotNull(future);
    }

    public final <X extends java.lang.Throwable> com.google.common.util.concurrent.FluentFuture<V> catching(java.lang.Class<X> exceptionType, com.google.common.base.Function<? super X, ? extends V> fallback, java.util.concurrent.Executor executor) {
        return (com.google.common.util.concurrent.FluentFuture) com.google.common.util.concurrent.Futures.catching(this, exceptionType, fallback, executor);
    }

    public final <X extends java.lang.Throwable> com.google.common.util.concurrent.FluentFuture<V> catchingAsync(java.lang.Class<X> exceptionType, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> fallback, java.util.concurrent.Executor executor) {
        return (com.google.common.util.concurrent.FluentFuture) com.google.common.util.concurrent.Futures.catchingAsync(this, exceptionType, fallback, executor);
    }

    public final com.google.common.util.concurrent.FluentFuture<V> withTimeout(long timeout, java.util.concurrent.TimeUnit unit, java.util.concurrent.ScheduledExecutorService scheduledExecutor) {
        return (com.google.common.util.concurrent.FluentFuture) com.google.common.util.concurrent.Futures.withTimeout(this, timeout, unit, scheduledExecutor);
    }

    public final <T> com.google.common.util.concurrent.FluentFuture<T> transformAsync(com.google.common.util.concurrent.AsyncFunction<? super V, T> function, java.util.concurrent.Executor executor) {
        return (com.google.common.util.concurrent.FluentFuture) com.google.common.util.concurrent.Futures.transformAsync(this, function, executor);
    }

    public final <T> com.google.common.util.concurrent.FluentFuture<T> transform(com.google.common.base.Function<? super V, T> function, java.util.concurrent.Executor executor) {
        return (com.google.common.util.concurrent.FluentFuture) com.google.common.util.concurrent.Futures.transform(this, function, executor);
    }

    public final void addCallback(com.google.common.util.concurrent.FutureCallback<? super V> callback, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.Futures.addCallback(this, callback, executor);
    }
}
