package androidx.arch.core.executor;

/* JADX INFO: loaded from: classes.dex */
public class DefaultTaskExecutor extends androidx.arch.core.executor.TaskExecutor {
    private volatile android.os.Handler mMainHandler;
    private final java.lang.Object mLock = new java.lang.Object();
    private final java.util.concurrent.ExecutorService mDiskIO = java.util.concurrent.Executors.newFixedThreadPool(4, new java.util.concurrent.ThreadFactory() { // from class: androidx.arch.core.executor.DefaultTaskExecutor.1
        private static final java.lang.String THREAD_NAME_STEM = "arch_disk_io_";
        private final java.util.concurrent.atomic.AtomicInteger mThreadId = new java.util.concurrent.atomic.AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable);
            thread.setName(THREAD_NAME_STEM + this.mThreadId.getAndIncrement());
            return thread;
        }
    });

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(java.lang.Runnable runnable) {
        this.mDiskIO.execute(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(java.lang.Runnable runnable) {
        if (this.mMainHandler == null) {
            synchronized (this.mLock) {
                if (this.mMainHandler == null) {
                    this.mMainHandler = createAsync(android.os.Looper.getMainLooper());
                }
            }
        }
        this.mMainHandler.post(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }

    private static android.os.Handler createAsync(android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.arch.core.executor.DefaultTaskExecutor.Api28Impl.createAsync(looper);
        }
        try {
            return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, true);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException unused) {
            return new android.os.Handler(looper);
        } catch (java.lang.reflect.InvocationTargetException unused2) {
            return new android.os.Handler(looper);
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
        }

        public static android.os.Handler createAsync(android.os.Looper looper) {
            return android.os.Handler.createAsync(looper);
        }
    }
}
