package com.adjust.sdk.scheduler;

/* JADX INFO: loaded from: classes3.dex */
public class ThreadFactoryWrapper implements java.util.concurrent.ThreadFactory {
    private java.lang.String source;

    public class a implements java.lang.Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Thread [%s] with error [%s]", thread.getName(), th.getMessage());
        }
    }

    public ThreadFactoryWrapper(java.lang.String str) {
        this.source = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread threadNewThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(runnable);
        threadNewThread.setPriority(9);
        threadNewThread.setName(com.adjust.sdk.Constants.THREAD_PREFIX + threadNewThread.getName() + "-" + this.source);
        threadNewThread.setDaemon(true);
        threadNewThread.setUncaughtExceptionHandler(new com.adjust.sdk.scheduler.ThreadFactoryWrapper.a());
        return threadNewThread;
    }
}
