package com.adjust.sdk.scheduler;

/* JADX INFO: loaded from: classes3.dex */
public class SingleThreadFutureScheduler implements com.adjust.sdk.scheduler.FutureScheduler {
    private java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;

    public class a implements java.util.concurrent.RejectedExecutionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f111a;

        public a(java.lang.String str) {
            this.f111a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
            com.adjust.sdk.AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), this.f111a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    public class b<V> implements java.util.concurrent.Callable<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.util.concurrent.Callable f112a;

        public b(java.util.concurrent.Callable callable) {
            this.f112a = callable;
        }

        @Override // java.util.concurrent.Callable
        public final V call() {
            try {
                return (V) this.f112a.call();
            } catch (java.lang.Throwable th) {
                com.adjust.sdk.AdjustFactory.getLogger().error("Callable error [%s] of type [%s]", th.getMessage(), th.getClass().getCanonicalName());
                return null;
            }
        }
    }

    public SingleThreadFutureScheduler(java.lang.String str, boolean z) {
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new com.adjust.sdk.scheduler.ThreadFactoryWrapper(str), new com.adjust.sdk.scheduler.SingleThreadFutureScheduler.a(str));
        this.scheduledThreadPoolExecutor = scheduledThreadPoolExecutor;
        if (z) {
            return;
        }
        scheduledThreadPoolExecutor.setKeepAliveTime(10L, java.util.concurrent.TimeUnit.MILLISECONDS);
        this.scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public java.util.concurrent.ScheduledFuture<?> scheduleFuture(java.lang.Runnable runnable, long j) {
        return this.scheduledThreadPoolExecutor.schedule(new com.adjust.sdk.scheduler.RunnableWrapper(runnable), j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public java.util.concurrent.ScheduledFuture<?> scheduleFutureWithFixedDelay(java.lang.Runnable runnable, long j, long j2) {
        return this.scheduledThreadPoolExecutor.scheduleWithFixedDelay(new com.adjust.sdk.scheduler.RunnableWrapper(runnable), j, j2, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public <V> java.util.concurrent.ScheduledFuture<V> scheduleFutureWithReturn(java.util.concurrent.Callable<V> callable, long j) {
        return this.scheduledThreadPoolExecutor.schedule(new com.adjust.sdk.scheduler.SingleThreadFutureScheduler.b(callable), j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public void teardown() {
        this.scheduledThreadPoolExecutor.shutdownNow();
    }
}
