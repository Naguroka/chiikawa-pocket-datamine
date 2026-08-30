package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0014J\u0006\u0010\u0011\u001a\u00020\tJ\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "threadLocalIsSet", "", "threadStateToRecover", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "", "afterResume", "", "state", "clearThreadContext", "saveThreadContext", "oldValue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UndispatchedCoroutine<T> extends kotlinx.coroutines.internal.ScopeCoroutine<T> {
    private volatile boolean threadLocalIsSet;
    private final java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> threadStateToRecover;

    public UndispatchedCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super T> continuation) {
        super(coroutineContext.get(kotlinx.coroutines.UndispatchedMarker.INSTANCE) == null ? coroutineContext.plus(kotlinx.coroutines.UndispatchedMarker.INSTANCE) : coroutineContext, continuation);
        this.threadStateToRecover = new java.lang.ThreadLocal<>();
        if (continuation.getContext().get(kotlin.coroutines.ContinuationInterceptor.INSTANCE) instanceof kotlinx.coroutines.CoroutineDispatcher) {
            return;
        }
        java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(coroutineContext, null);
        kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(coroutineContext, objUpdateThreadContext);
        saveThreadContext(coroutineContext, objUpdateThreadContext);
    }

    public final void saveThreadContext(kotlin.coroutines.CoroutineContext context, java.lang.Object oldValue) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(kotlin.TuplesKt.to(context, oldValue));
    }

    public final boolean clearThreadContext() {
        boolean z = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z;
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    protected void afterResume(java.lang.Object state) {
        if (this.threadLocalIsSet) {
            kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object> pair = this.threadStateToRecover.get();
            if (pair != null) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(pair.component1(), pair.component2());
            }
            this.threadStateToRecover.remove();
        }
        java.lang.Object objRecoverResult = kotlinx.coroutines.CompletionStateKt.recoverResult(state, this.uCont);
        kotlin.coroutines.Continuation<T> continuation = this.uCont;
        kotlin.coroutines.CoroutineContext context = continuation.getContext();
        java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, null);
        kotlinx.coroutines.UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS ? kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(continuation, context, objUpdateThreadContext) : null;
        try {
            this.uCont.resumeWith(objRecoverResult);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }
}
