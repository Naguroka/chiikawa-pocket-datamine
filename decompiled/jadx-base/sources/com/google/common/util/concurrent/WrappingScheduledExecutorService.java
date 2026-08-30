package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
abstract class WrappingScheduledExecutorService extends com.google.common.util.concurrent.WrappingExecutorService implements java.util.concurrent.ScheduledExecutorService {
    final java.util.concurrent.ScheduledExecutorService delegate;

    protected WrappingScheduledExecutorService(java.util.concurrent.ScheduledExecutorService delegate) {
        super(delegate);
        this.delegate = delegate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable command, long delay, java.util.concurrent.TimeUnit unit) {
        return this.delegate.schedule(wrapTask(command), delay, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> java.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> task, long delay, java.util.concurrent.TimeUnit unit) {
        return this.delegate.schedule(wrapTask(task), delay, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable command, long initialDelay, long period, java.util.concurrent.TimeUnit unit) {
        return this.delegate.scheduleAtFixedRate(wrapTask(command), initialDelay, period, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable command, long initialDelay, long delay, java.util.concurrent.TimeUnit unit) {
        return this.delegate.scheduleWithFixedDelay(wrapTask(command), initialDelay, delay, unit);
    }
}
