package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use TestingExecutors.sameThreadScheduledExecutor, or wrap a real Executor from java.util.concurrent.Executors with MoreExecutors.listeningDecorator")
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public interface ListeningExecutorService extends java.util.concurrent.ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks) throws java.lang.InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    com.google.common.util.concurrent.ListenableFuture<?> submit(java.lang.Runnable task);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.lang.Runnable task, @com.google.common.util.concurrent.ParametricNullness T result);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.util.concurrent.Callable<T> task);
}
