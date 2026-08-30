package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes5.dex */
final class LimitedConcurrencyExecutorService extends com.google.firebase.concurrent.LimitedConcurrencyExecutor implements java.util.concurrent.ExecutorService {
    private final java.util.concurrent.ExecutorService delegate;

    LimitedConcurrencyExecutorService(java.util.concurrent.ExecutorService executorService, int i) {
        super(executorService, i);
        this.delegate = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List<java.lang.Runnable> shutdownNow() {
        throw new java.lang.UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.delegate.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> callable) {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(callable);
        execute(futureTask);
        return futureTask;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(final java.lang.Runnable runnable, final T t) {
        return submit(new java.util.concurrent.Callable() { // from class: com.google.firebase.concurrent.LimitedConcurrencyExecutorService$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.firebase.concurrent.LimitedConcurrencyExecutorService.lambda$submit$0(runnable, t);
            }
        });
    }

    static /* synthetic */ java.lang.Object lambda$submit$0(java.lang.Runnable runnable, java.lang.Object obj) throws java.lang.Exception {
        runnable.run();
        return obj;
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future<?> submit(final java.lang.Runnable runnable) {
        return submit(new java.util.concurrent.Callable() { // from class: com.google.firebase.concurrent.LimitedConcurrencyExecutorService$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.firebase.concurrent.LimitedConcurrencyExecutorService.lambda$submit$1(runnable);
            }
        });
    }

    static /* synthetic */ java.lang.Object lambda$submit$1(java.lang.Runnable runnable) throws java.lang.Exception {
        runnable.run();
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection) throws java.lang.InterruptedException {
        return this.delegate.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.delegate.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return (T) this.delegate.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return (T) this.delegate.invokeAny(collection, j, timeUnit);
    }
}
