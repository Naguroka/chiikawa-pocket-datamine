package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public abstract class ForwardingListeningExecutorService extends com.google.common.util.concurrent.ForwardingExecutorService implements com.google.common.util.concurrent.ListeningExecutorService {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.ForwardingExecutorService, com.google.common.collect.ForwardingObject
    public abstract com.google.common.util.concurrent.ListeningExecutorService delegate();

    protected ForwardingListeningExecutorService() {
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.util.concurrent.Callable<T> task) {
        return delegate().submit((java.util.concurrent.Callable) task);
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public com.google.common.util.concurrent.ListenableFuture<?> submit(java.lang.Runnable task) {
        return delegate().submit(task);
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.lang.Runnable task, @com.google.common.util.concurrent.ParametricNullness T result) {
        return delegate().submit(task, (java.lang.Object) result);
    }
}
