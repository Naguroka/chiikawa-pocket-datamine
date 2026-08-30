package kotlinx.coroutines;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\u0007R\t\u0010\t\u001a\u00020\nX\u0082\u0004¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/CancelledContinuation;", "Lkotlinx/coroutines/CompletedExceptionally;", "continuation", "Lkotlin/coroutines/Continuation;", "cause", "", "handled", "", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;Z)V", "_resumed", "Lkotlinx/atomicfu/AtomicBoolean;", "makeResumed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CancelledContinuation extends kotlinx.coroutines.CompletedExceptionally {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _resumed$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.CancelledContinuation.class, "_resumed");

    @kotlin.jvm.Volatile
    private volatile int _resumed;

    public CancelledContinuation(kotlin.coroutines.Continuation<?> continuation, java.util.concurrent.CancellationException cancellationException, boolean z) {
        super(cancellationException == null ? new java.util.concurrent.CancellationException("Continuation " + continuation + " was cancelled normally") : cancellationException, z);
        this._resumed = 0;
    }

    public final boolean makeResumed() {
        return _resumed$FU.compareAndSet(this, 0, 1);
    }
}
