package kotlinx.coroutines;

/* JADX INFO: compiled from: ThreadPoolDispatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"newFixedThreadPoolContext", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "nThreads", "", "name", "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/ThreadPoolDispatcherKt")
final /* synthetic */ class ThreadPoolDispatcherKt__ThreadPoolDispatcherKt {
    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher newFixedThreadPoolContext(final int i, final java.lang.String str) {
        if (!(i >= 1)) {
            throw new java.lang.IllegalArgumentException(("Expected at least one thread, but " + i + " specified").toString());
        }
        final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
        return kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.ExecutorService) java.util.concurrent.Executors.newScheduledThreadPool(i, new java.util.concurrent.ThreadFactory() { // from class: kotlinx.coroutines.ThreadPoolDispatcherKt__ThreadPoolDispatcherKt$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return kotlinx.coroutines.ThreadPoolDispatcherKt__ThreadPoolDispatcherKt.newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt(i, str, atomicInteger, runnable);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Thread newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt(int i, java.lang.String str, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.lang.Runnable runnable) {
        if (i != 1) {
            str = str + org.objectweb.asm.signature.SignatureVisitor.SUPER + atomicInteger.incrementAndGet();
        }
        java.lang.Thread thread = new java.lang.Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
