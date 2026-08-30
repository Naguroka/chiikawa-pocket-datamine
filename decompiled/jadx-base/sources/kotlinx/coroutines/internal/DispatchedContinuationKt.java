package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0003\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082\b\u001aU\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00122%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u0012\u0010\u001a\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\r0\u0005H\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"REUSABLE_CLAIMED", "Lkotlinx/coroutines/internal/Symbol;", "UNDEFINED", "executeUnconfined", "", "Lkotlinx/coroutines/internal/DispatchedContinuation;", "contState", "", com.ironsource.y8.a.t, "", "doYield", "block", "Lkotlin/Function0;", "", "resumeCancellableWith", "T", "Lkotlin/coroutines/Continuation;", "result", "Lkotlin/Result;", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "yieldUndispatched", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DispatchedContinuationKt {
    private static final kotlinx.coroutines.internal.Symbol UNDEFINED = new kotlinx.coroutines.internal.Symbol("UNDEFINED");
    public static final kotlinx.coroutines.internal.Symbol REUSABLE_CLAIMED = new kotlinx.coroutines.internal.Symbol("REUSABLE_CLAIMED");

    public static /* synthetic */ void resumeCancellableWith$default(kotlin.coroutines.Continuation continuation, java.lang.Object obj, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        resumeCancellableWith(continuation, obj, function1);
    }

    public static final <T> void resumeCancellableWith(kotlin.coroutines.Continuation<? super T> continuation, java.lang.Object obj, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function1) {
        boolean z;
        if (!(continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation)) {
            continuation.resumeWith(obj);
            return;
        }
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.internal.DispatchedContinuation) continuation;
        java.lang.Object state = kotlinx.coroutines.CompletionStateKt.toState(obj, function1);
        if (dispatchedContinuation.dispatcher.isDispatchNeeded(dispatchedContinuation.getContext())) {
            dispatchedContinuation._state = state;
            dispatchedContinuation.resumeMode = 1;
            dispatchedContinuation.dispatcher.mo2860dispatch(dispatchedContinuation.getContext(), dispatchedContinuation);
            return;
        }
        kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED();
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = state;
            dispatchedContinuation.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return;
        }
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation2 = dispatchedContinuation;
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) dispatchedContinuation.getContext().get(kotlinx.coroutines.Job.INSTANCE);
            if (job == null || job.isActive()) {
                z = false;
            } else {
                java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
                dispatchedContinuation.cancelCompletedResult$kotlinx_coroutines_core(state, cancellationException);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                dispatchedContinuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(cancellationException)));
                z = true;
            }
            if (!z) {
                kotlin.coroutines.Continuation<T> continuation2 = dispatchedContinuation.continuation;
                java.lang.Object obj2 = dispatchedContinuation.countOrElement;
                kotlin.coroutines.CoroutineContext context = continuation2.getContext();
                java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, obj2);
                kotlinx.coroutines.UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS ? kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(continuation2, context, objUpdateThreadContext) : null;
                try {
                    dispatchedContinuation.continuation.resumeWith(obj);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                        kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    }
                } catch (java.lang.Throwable th) {
                    if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                        kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    }
                    throw th;
                }
            }
            while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
            }
        } catch (java.lang.Throwable th2) {
            try {
                dispatchedContinuation2.handleFatalException$kotlinx_coroutines_core(th2, null);
            } finally {
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            }
        }
    }

    public static final boolean yieldUndispatched(kotlinx.coroutines.internal.DispatchedContinuation<? super kotlin.Unit> dispatchedContinuation) {
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED();
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = unit;
            dispatchedContinuation.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return true;
        }
        kotlinx.coroutines.internal.DispatchedContinuation<? super kotlin.Unit> dispatchedContinuation2 = dispatchedContinuation;
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            dispatchedContinuation.run();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } catch (java.lang.Throwable th) {
            try {
                dispatchedContinuation2.handleFatalException$kotlinx_coroutines_core(th, null);
            } finally {
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean executeUnconfined(kotlinx.coroutines.internal.DispatchedContinuation<?> dispatchedContinuation, java.lang.Object obj, int i, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if ((i != -1) == false) {
                throw new java.lang.AssertionError();
            }
        }
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (z && eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = obj;
            dispatchedContinuation.resumeMode = i;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return true;
        }
        kotlinx.coroutines.internal.DispatchedContinuation<?> dispatchedContinuation2 = dispatchedContinuation;
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            function0.invoke();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
        } catch (java.lang.Throwable th) {
            try {
                dispatchedContinuation2.handleFatalException$kotlinx_coroutines_core(th, null);
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
            } finally {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean executeUnconfined$default(kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation, java.lang.Object obj, int i, boolean z, kotlin.jvm.functions.Function0 function0, int i2, java.lang.Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if ((i != -1) == false) {
                throw new java.lang.AssertionError();
            }
        }
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (z && eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = obj;
            dispatchedContinuation.resumeMode = i;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return true;
        }
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation2 = dispatchedContinuation;
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            function0.invoke();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
        } catch (java.lang.Throwable th) {
            try {
                dispatchedContinuation2.handleFatalException$kotlinx_coroutines_core(th, null);
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
            } finally {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            }
        }
        return false;
    }
}
