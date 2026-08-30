package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
class SafeLoggingExecutor implements java.util.concurrent.Executor {
    private final java.util.concurrent.Executor delegate;

    SafeLoggingExecutor(java.util.concurrent.Executor executor) {
        this.delegate = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.delegate.execute(new com.google.android.datatransport.runtime.SafeLoggingExecutor.SafeLoggingRunnable(runnable));
    }

    static class SafeLoggingRunnable implements java.lang.Runnable {
        private final java.lang.Runnable delegate;

        SafeLoggingRunnable(java.lang.Runnable runnable) {
            this.delegate = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.delegate.run();
            } catch (java.lang.Exception e) {
                com.google.android.datatransport.runtime.logging.Logging.e("Executor", "Background execution failure.", e);
            }
        }
    }
}
