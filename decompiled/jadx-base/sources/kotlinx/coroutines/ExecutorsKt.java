package kotlinx.coroutines;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\b\u0003\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0001*\u0010\b\u0007\u0010\u0007\"\u00020\u00042\u00020\u0004B\u0002\b\b¨\u0006\t"}, d2 = {"asCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "from", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/ExecutorService;", "asExecutor", "CloseableCoroutineDispatcher", "Lkotlinx/coroutines/ExperimentalCoroutinesApi;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExecutorsKt {
    public static /* synthetic */ void CloseableCoroutineDispatcher$annotations() {
    }

    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher from(java.util.concurrent.ExecutorService executorService) {
        return new kotlinx.coroutines.ExecutorCoroutineDispatcherImpl(executorService);
    }

    public static final kotlinx.coroutines.CoroutineDispatcher from(java.util.concurrent.Executor executor) {
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        kotlinx.coroutines.DispatcherExecutor dispatcherExecutor = executor instanceof kotlinx.coroutines.DispatcherExecutor ? (kotlinx.coroutines.DispatcherExecutor) executor : null;
        return (dispatcherExecutor == null || (coroutineDispatcher = dispatcherExecutor.dispatcher) == null) ? new kotlinx.coroutines.ExecutorCoroutineDispatcherImpl(executor) : coroutineDispatcher;
    }

    public static final java.util.concurrent.Executor asExecutor(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        java.util.concurrent.Executor executor;
        kotlinx.coroutines.ExecutorCoroutineDispatcher executorCoroutineDispatcher = coroutineDispatcher instanceof kotlinx.coroutines.ExecutorCoroutineDispatcher ? (kotlinx.coroutines.ExecutorCoroutineDispatcher) coroutineDispatcher : null;
        return (executorCoroutineDispatcher == null || (executor = executorCoroutineDispatcher.getExecutor()) == null) ? new kotlinx.coroutines.DispatcherExecutor(coroutineDispatcher) : executor;
    }
}
