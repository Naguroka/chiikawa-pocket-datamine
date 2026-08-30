package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
class ImmediateFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    static final com.google.common.util.concurrent.ListenableFuture<?> NULL = new com.google.common.util.concurrent.ImmediateFuture(null);
    private static final com.google.common.util.concurrent.LazyLogger log = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.ImmediateFuture.class);

    @com.google.common.util.concurrent.ParametricNullness
    private final V value;

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    ImmediateFuture(@com.google.common.util.concurrent.ParametricNullness V value) {
        this.value = value;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable listener, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(listener, "Runnable was null.");
        com.google.common.base.Preconditions.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(listener);
        } catch (java.lang.Exception e) {
            log.get().log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable " + listener + " with executor " + executor, (java.lang.Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    @com.google.common.util.concurrent.ParametricNullness
    public V get() {
        return this.value;
    }

    @Override // java.util.concurrent.Future
    @com.google.common.util.concurrent.ParametricNullness
    public V get(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.ExecutionException {
        com.google.common.base.Preconditions.checkNotNull(unit);
        return get();
    }

    public java.lang.String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.value + "]]";
    }

    static final class ImmediateFailedFuture<V> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V> {
        ImmediateFailedFuture(java.lang.Throwable thrown) {
            setException(thrown);
        }
    }

    static final class ImmediateCancelledFuture<V> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V> {

        @javax.annotation.CheckForNull
        static final com.google.common.util.concurrent.ImmediateFuture.ImmediateCancelledFuture<java.lang.Object> INSTANCE;

        static {
            INSTANCE = com.google.common.util.concurrent.AbstractFuture.GENERATE_CANCELLATION_CAUSES ? null : new com.google.common.util.concurrent.ImmediateFuture.ImmediateCancelledFuture<>();
        }

        ImmediateCancelledFuture() {
            cancel(false);
        }
    }
}
