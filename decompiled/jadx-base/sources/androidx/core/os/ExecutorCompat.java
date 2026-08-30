package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class ExecutorCompat {
    public static java.util.concurrent.Executor create(android.os.Handler handler) {
        return new androidx.core.os.ExecutorCompat.HandlerExecutor(handler);
    }

    private ExecutorCompat() {
    }

    private static class HandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler;

        HandlerExecutor(android.os.Handler handler) {
            this.mHandler = (android.os.Handler) androidx.core.util.Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            if (!this.mHandler.post((java.lang.Runnable) androidx.core.util.Preconditions.checkNotNull(runnable))) {
                throw new java.util.concurrent.RejectedExecutionException(this.mHandler + " is shutting down");
            }
        }
    }
}
