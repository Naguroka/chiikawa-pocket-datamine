package kotlinx.coroutines;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u000f\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002R\u000b\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/DispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "_decision", "Lkotlinx/atomicfu/AtomicInt;", "afterCompletion", "", "state", "", "afterResume", "getResult", "getResult$kotlinx_coroutines_core", "tryResume", "", "trySuspend", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DispatchedCoroutine<T> extends kotlinx.coroutines.internal.ScopeCoroutine<T> {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _decision$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.DispatchedCoroutine.class, "_decision");

    @kotlin.jvm.Volatile
    private volatile int _decision;

    private final void loop$atomicfu(java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, java.lang.Object obj) {
        while (true) {
            function1.invoke(java.lang.Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    public DispatchedCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
    }

    private final boolean trySuspend() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decision$FU;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new java.lang.IllegalStateException("Already suspended".toString());
            }
        } while (!_decision$FU.compareAndSet(this, 0, 1));
        return true;
    }

    private final boolean tryResume() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decision$FU;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new java.lang.IllegalStateException("Already resumed".toString());
            }
        } while (!_decision$FU.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    protected void afterCompletion(java.lang.Object state) {
        afterResume(state);
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    protected void afterResume(java.lang.Object state) {
        if (tryResume()) {
            return;
        }
        kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith$default(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(this.uCont), kotlinx.coroutines.CompletionStateKt.recoverResult(state, this.uCont), null, 2, null);
    }

    public final java.lang.Object getResult$kotlinx_coroutines_core() {
        if (trySuspend()) {
            return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        java.lang.Object objUnboxState = kotlinx.coroutines.JobSupportKt.unboxState(getState$kotlinx_coroutines_core());
        if (objUnboxState instanceof kotlinx.coroutines.CompletedExceptionally) {
            throw ((kotlinx.coroutines.CompletedExceptionally) objUnboxState).cause;
        }
        return objUnboxState;
    }
}
