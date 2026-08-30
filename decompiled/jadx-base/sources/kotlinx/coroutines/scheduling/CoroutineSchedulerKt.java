package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0005"}, d2 = {"isSchedulerWorker", "", "thread", "Ljava/lang/Thread;", "mayNotBlock", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutineSchedulerKt {
    public static final boolean isSchedulerWorker(java.lang.Thread thread) {
        return thread instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker;
    }

    public static final boolean mayNotBlock(java.lang.Thread thread) {
        return (thread instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) && ((kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) thread).state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED;
    }
}
