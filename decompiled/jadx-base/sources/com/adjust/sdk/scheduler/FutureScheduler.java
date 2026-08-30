package com.adjust.sdk.scheduler;

/* JADX INFO: loaded from: classes3.dex */
public interface FutureScheduler {
    java.util.concurrent.ScheduledFuture<?> scheduleFuture(java.lang.Runnable runnable, long j);

    java.util.concurrent.ScheduledFuture<?> scheduleFutureWithFixedDelay(java.lang.Runnable runnable, long j, long j2);

    <V> java.util.concurrent.ScheduledFuture<V> scheduleFutureWithReturn(java.util.concurrent.Callable<V> callable, long j);

    void teardown();
}
