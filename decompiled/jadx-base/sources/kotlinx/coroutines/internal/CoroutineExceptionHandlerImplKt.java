package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"platformExceptionHandlers", "", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getPlatformExceptionHandlers", "()Ljava/util/Collection;", "ensurePlatformExceptionHandlerLoaded", "", "callback", "propagateExceptionFinalResort", "exception", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutineExceptionHandlerImplKt {
    private static final java.util.Collection<kotlinx.coroutines.CoroutineExceptionHandler> platformExceptionHandlers = kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.asSequence(java.util.ServiceLoader.load(kotlinx.coroutines.CoroutineExceptionHandler.class, kotlinx.coroutines.CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    public static final java.util.Collection<kotlinx.coroutines.CoroutineExceptionHandler> getPlatformExceptionHandlers() {
        return platformExceptionHandlers;
    }

    public static final void ensurePlatformExceptionHandlerLoaded(kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler) {
        if (!platformExceptionHandlers.contains(coroutineExceptionHandler)) {
            throw new java.lang.IllegalStateException("Exception handler was not found via a ServiceLoader".toString());
        }
    }

    public static final void propagateExceptionFinalResort(java.lang.Throwable th) {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
