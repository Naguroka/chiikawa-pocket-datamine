package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public class ListenableFutureTask<V> extends java.util.concurrent.FutureTask<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    private final com.google.common.util.concurrent.ExecutionList executionList;

    public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> create(java.util.concurrent.Callable<V> callable) {
        return new com.google.common.util.concurrent.ListenableFutureTask<>(callable);
    }

    public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> create(java.lang.Runnable runnable, @com.google.common.util.concurrent.ParametricNullness V result) {
        return new com.google.common.util.concurrent.ListenableFutureTask<>(runnable, result);
    }

    ListenableFutureTask(java.util.concurrent.Callable<V> callable) {
        super(callable);
        this.executionList = new com.google.common.util.concurrent.ExecutionList();
    }

    ListenableFutureTask(java.lang.Runnable runnable, @com.google.common.util.concurrent.ParametricNullness V result) {
        super(runnable, result);
        this.executionList = new com.google.common.util.concurrent.ExecutionList();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable listener, java.util.concurrent.Executor exec) {
        this.executionList.add(listener, exec);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    @com.google.common.util.concurrent.ParametricNullness
    public V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (nanos <= 2147483647999999999L) {
            return (V) super.get(j, timeUnit);
        }
        return (V) super.get(java.lang.Math.min(nanos, 2147483647999999999L), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
        this.executionList.execute();
    }
}
