package com.unity3d.services.core.request;

/* JADX INFO: loaded from: classes6.dex */
public class CancelableThreadPoolExecutor extends java.util.concurrent.ThreadPoolExecutor {
    private final java.util.List<java.lang.Runnable> _activeRunnable;

    public CancelableThreadPoolExecutor(int i, int i2, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> linkedBlockingQueue) {
        super(i, i2, j, timeUnit, linkedBlockingQueue);
        this._activeRunnable = new java.util.LinkedList();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected synchronized void beforeExecute(java.lang.Thread thread, java.lang.Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this._activeRunnable.add(runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected synchronized void afterExecute(java.lang.Runnable runnable, java.lang.Throwable th) {
        super.afterExecute(runnable, th);
        this._activeRunnable.remove(runnable);
    }

    public synchronized void cancel() {
        for (java.lang.Runnable runnable : this._activeRunnable) {
            if (runnable instanceof com.unity3d.services.core.request.WebRequestRunnable) {
                ((com.unity3d.services.core.request.WebRequestRunnable) runnable).setCancelStatus(true);
            }
        }
    }
}
