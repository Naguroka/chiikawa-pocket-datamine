package kotlinx.coroutines.tasks;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/tasks/DirectExecutor;", "Ljava/util/concurrent/Executor;", "()V", "execute", "", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "Ljava/lang/Runnable;", "kotlinx-coroutines-play-services"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DirectExecutor implements java.util.concurrent.Executor {
    public static final kotlinx.coroutines.tasks.DirectExecutor INSTANCE = new kotlinx.coroutines.tasks.DirectExecutor();

    private DirectExecutor() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r) {
        r.run();
    }
}
