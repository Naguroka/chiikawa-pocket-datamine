package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public abstract class ForwardingExecutorService extends com.google.common.collect.ForwardingObject implements java.util.concurrent.ExecutorService {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract java.util.concurrent.ExecutorService delegate();

    protected ForwardingExecutorService() {
    }

    @Override // java.util.concurrent.ExecutorService
    @com.google.errorprone.annotations.CheckReturnValue
    public boolean awaitTermination(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        return delegate().awaitTermination(timeout, unit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks) throws java.lang.InterruptedException {
        return delegate().invokeAll(tasks);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
        return delegate().invokeAll(tasks, timeout, unit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return (T) delegate().invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return (T) delegate().invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return delegate().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return delegate().isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        delegate().shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List<java.lang.Runnable> shutdownNow() {
        return delegate().shutdownNow();
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        delegate().execute(command);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> task) {
        return delegate().submit(task);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future<?> submit(java.lang.Runnable task) {
        return delegate().submit(task);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.lang.Runnable task, @com.google.common.util.concurrent.ParametricNullness T result) {
        return delegate().submit(task, result);
    }
}
