package androidx.arch.core.executor;

/* JADX INFO: loaded from: classes.dex */
public class ArchTaskExecutor extends androidx.arch.core.executor.TaskExecutor {
    private static volatile androidx.arch.core.executor.ArchTaskExecutor sInstance;
    private final androidx.arch.core.executor.TaskExecutor mDefaultTaskExecutor;
    private androidx.arch.core.executor.TaskExecutor mDelegate;
    private static final java.util.concurrent.Executor sMainThreadExecutor = new java.util.concurrent.Executor() { // from class: androidx.arch.core.executor.ArchTaskExecutor$$ExternalSyntheticLambda0
        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
            androidx.arch.core.executor.ArchTaskExecutor.getInstance().postToMainThread(runnable);
        }
    };
    private static final java.util.concurrent.Executor sIOThreadExecutor = new java.util.concurrent.Executor() { // from class: androidx.arch.core.executor.ArchTaskExecutor$$ExternalSyntheticLambda1
        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
            androidx.arch.core.executor.ArchTaskExecutor.getInstance().executeOnDiskIO(runnable);
        }
    };

    private ArchTaskExecutor() {
        androidx.arch.core.executor.DefaultTaskExecutor defaultTaskExecutor = new androidx.arch.core.executor.DefaultTaskExecutor();
        this.mDefaultTaskExecutor = defaultTaskExecutor;
        this.mDelegate = defaultTaskExecutor;
    }

    public static androidx.arch.core.executor.ArchTaskExecutor getInstance() {
        if (sInstance != null) {
            return sInstance;
        }
        synchronized (androidx.arch.core.executor.ArchTaskExecutor.class) {
            if (sInstance == null) {
                sInstance = new androidx.arch.core.executor.ArchTaskExecutor();
            }
        }
        return sInstance;
    }

    public void setDelegate(androidx.arch.core.executor.TaskExecutor taskExecutor) {
        if (taskExecutor == null) {
            taskExecutor = this.mDefaultTaskExecutor;
        }
        this.mDelegate = taskExecutor;
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(java.lang.Runnable runnable) {
        this.mDelegate.executeOnDiskIO(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(java.lang.Runnable runnable) {
        this.mDelegate.postToMainThread(runnable);
    }

    public static java.util.concurrent.Executor getMainThreadExecutor() {
        return sMainThreadExecutor;
    }

    public static java.util.concurrent.Executor getIOThreadExecutor() {
        return sIOThreadExecutor;
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
        return this.mDelegate.isMainThread();
    }
}
