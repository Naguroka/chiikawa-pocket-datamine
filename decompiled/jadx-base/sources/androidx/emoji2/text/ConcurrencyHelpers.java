package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
class ConcurrencyHelpers {
    private static final int FONT_LOAD_TIMEOUT_SECONDS = 15;

    private ConcurrencyHelpers() {
    }

    static java.util.concurrent.ThreadPoolExecutor createBackgroundPriorityExecutor(final java.lang.String str) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 15L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque(), new java.util.concurrent.ThreadFactory() { // from class: androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return androidx.emoji2.text.ConcurrencyHelpers.lambda$createBackgroundPriorityExecutor$0(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static /* synthetic */ java.lang.Thread lambda$createBackgroundPriorityExecutor$0(java.lang.String str, java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    static android.os.Handler mainHandlerAsync() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.emoji2.text.ConcurrencyHelpers.Handler28Impl.createAsync(android.os.Looper.getMainLooper());
        }
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    @java.lang.Deprecated
    static java.util.concurrent.Executor convertHandlerToExecutor(final android.os.Handler handler) {
        java.util.Objects.requireNonNull(handler);
        return new java.util.concurrent.Executor() { // from class: androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    static class Handler28Impl {
        private Handler28Impl() {
        }

        public static android.os.Handler createAsync(android.os.Looper looper) {
            return android.os.Handler.createAsync(looper);
        }
    }
}
