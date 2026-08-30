package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0019\u0010\u0002\u001a\u00020\u00032\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\b\u001a\b\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\b\u0010\b\u001a\u00020\u0007H\u0001\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0001¨\u0006\f"}, d2 = {"createEventLoop", "Lkotlinx/coroutines/EventLoop;", "platformAutoreleasePool", "", "block", "Lkotlin/Function0;", "processNextEventInCurrentThread", "", "runSingleTaskFromCurrentSystemDispatcher", "isIoDispatcherThread", "", "Ljava/lang/Thread;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EventLoopKt {
    public static final kotlinx.coroutines.EventLoop createEventLoop() {
        return new kotlinx.coroutines.BlockingEventLoop(java.lang.Thread.currentThread());
    }

    public static final long processNextEventInCurrentThread() {
        kotlinx.coroutines.EventLoop eventLoopCurrentOrNull$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
        if (eventLoopCurrentOrNull$kotlinx_coroutines_core != null) {
            return eventLoopCurrentOrNull$kotlinx_coroutines_core.processNextEvent();
        }
        return Long.MAX_VALUE;
    }

    public static final void platformAutoreleasePool(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        function0.invoke();
    }

    public static final long runSingleTaskFromCurrentSystemDispatcher() {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        if (!(threadCurrentThread instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker)) {
            throw new java.lang.IllegalStateException("Expected CoroutineScheduler.Worker, but got " + threadCurrentThread);
        }
        return ((kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) threadCurrentThread).runSingleTask();
    }

    public static final boolean isIoDispatcherThread(java.lang.Thread thread) {
        if (thread instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) {
            return ((kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) thread).isIo();
        }
        return false;
    }
}
