package androidx.arch.core.executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class TaskExecutor {
    public abstract void executeOnDiskIO(java.lang.Runnable runnable);

    public abstract boolean isMainThread();

    public abstract void postToMainThread(java.lang.Runnable runnable);

    public void executeOnMainThread(java.lang.Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            postToMainThread(runnable);
        }
    }
}
