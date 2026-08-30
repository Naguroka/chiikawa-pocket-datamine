package com.adjust.sdk.scheduler;

/* JADX INFO: loaded from: classes3.dex */
public class RunnableWrapper implements java.lang.Runnable {
    private java.lang.Runnable runnable;

    public RunnableWrapper(java.lang.Runnable runnable) {
        this.runnable = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.runnable.run();
        } catch (java.lang.Throwable th) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Runnable error [%s] of type [%s]", th.getMessage(), th.getClass().getCanonicalName());
        }
    }
}
