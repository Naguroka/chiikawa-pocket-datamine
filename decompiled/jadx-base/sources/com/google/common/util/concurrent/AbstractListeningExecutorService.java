package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.errorprone.annotations.CheckReturnValue
public abstract class AbstractListeningExecutorService extends java.util.concurrent.AbstractExecutorService implements com.google.common.util.concurrent.ListeningExecutorService {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.lang.Runnable runnable, @com.google.common.util.concurrent.ParametricNullness T value) {
        return com.google.common.util.concurrent.TrustedListenableFutureTask.create(runnable, value);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.util.concurrent.Callable<T> callable) {
        return com.google.common.util.concurrent.TrustedListenableFutureTask.create(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    public com.google.common.util.concurrent.ListenableFuture<?> submit(java.lang.Runnable task) {
        return (com.google.common.util.concurrent.ListenableFuture) super.submit(task);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    public <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.lang.Runnable task, @com.google.common.util.concurrent.ParametricNullness T result) {
        return (com.google.common.util.concurrent.ListenableFuture) super.submit(task, (java.lang.Object) result);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    public <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.util.concurrent.Callable<T> task) {
        return (com.google.common.util.concurrent.ListenableFuture) super.submit((java.util.concurrent.Callable) task);
    }
}
