package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public interface ListeningScheduledExecutorService extends java.util.concurrent.ScheduledExecutorService, com.google.common.util.concurrent.ListeningExecutorService {
    @Override // java.util.concurrent.ScheduledExecutorService
    com.google.common.util.concurrent.ListenableScheduledFuture<?> schedule(java.lang.Runnable command, long delay, java.util.concurrent.TimeUnit unit);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> com.google.common.util.concurrent.ListenableScheduledFuture<V> schedule(java.util.concurrent.Callable<V> callable, long delay, java.util.concurrent.TimeUnit unit);

    @Override // java.util.concurrent.ScheduledExecutorService
    com.google.common.util.concurrent.ListenableScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable command, long initialDelay, long period, java.util.concurrent.TimeUnit unit);

    @Override // java.util.concurrent.ScheduledExecutorService
    com.google.common.util.concurrent.ListenableScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable command, long initialDelay, long delay, java.util.concurrent.TimeUnit unit);
}
