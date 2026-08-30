package kotlinx.coroutines;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0000\u001a.\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000fH\u0002\u001a\u0019\u0010\u0016\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a'\u0010\u0019\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n\"\u0018\u0010\u000b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001e"}, d2 = {"MODE_ATOMIC", "", "MODE_CANCELLABLE", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE_REUSABLE", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "isCancellableMode", "", "(I)Z", "isReusableMode", "dispatch", "", "T", "Lkotlinx/coroutines/DispatchedTask;", com.ironsource.y8.a.t, "resume", "delegate", "Lkotlin/coroutines/Continuation;", "undispatched", "resumeUnconfined", "resumeWithStackTrace", "exception", "", "runUnconfinedEventLoop", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "block", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DispatchedTaskKt {
    public static final int MODE_ATOMIC = 0;
    public static final int MODE_CANCELLABLE = 1;
    public static final int MODE_CANCELLABLE_REUSABLE = 2;
    public static final int MODE_UNDISPATCHED = 4;
    public static final int MODE_UNINITIALIZED = -1;

    public static /* synthetic */ void getMODE_CANCELLABLE$annotations() {
    }

    public static final boolean isCancellableMode(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean isReusableMode(int i) {
        return i == 2;
    }

    public static final <T> void dispatch(kotlinx.coroutines.DispatchedTask<? super T> dispatchedTask, int i) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(i != -1)) {
                throw new java.lang.AssertionError();
            }
        }
        kotlin.coroutines.Continuation<? super T> delegate$kotlinx_coroutines_core = dispatchedTask.getDelegate$kotlinx_coroutines_core();
        boolean z = i == 4;
        if (!z && (delegate$kotlinx_coroutines_core instanceof kotlinx.coroutines.internal.DispatchedContinuation) && isCancellableMode(i) == isCancellableMode(dispatchedTask.resumeMode)) {
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = ((kotlinx.coroutines.internal.DispatchedContinuation) delegate$kotlinx_coroutines_core).dispatcher;
            kotlin.coroutines.CoroutineContext coroutineContext = delegate$kotlinx_coroutines_core.get$context();
            if (coroutineDispatcher.isDispatchNeeded(coroutineContext)) {
                coroutineDispatcher.mo2860dispatch(coroutineContext, dispatchedTask);
                return;
            } else {
                resumeUnconfined(dispatchedTask);
                return;
            }
        }
        resume(dispatchedTask, delegate$kotlinx_coroutines_core, z);
    }

    public static final <T> void resume(kotlinx.coroutines.DispatchedTask<? super T> dispatchedTask, kotlin.coroutines.Continuation<? super T> continuation, boolean z) {
        java.lang.Object successfulResult$kotlinx_coroutines_core;
        boolean zClearThreadContext;
        java.lang.Object objTakeState$kotlinx_coroutines_core = dispatchedTask.takeState$kotlinx_coroutines_core();
        java.lang.Throwable exceptionalResult$kotlinx_coroutines_core = dispatchedTask.getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            successfulResult$kotlinx_coroutines_core = kotlin.ResultKt.createFailure(exceptionalResult$kotlinx_coroutines_core);
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            successfulResult$kotlinx_coroutines_core = dispatchedTask.getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        }
        java.lang.Object objM1301constructorimpl = kotlin.Result.m1301constructorimpl(successfulResult$kotlinx_coroutines_core);
        if (z) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.internal.DispatchedContinuation) continuation;
            kotlin.coroutines.Continuation<T> continuation2 = dispatchedContinuation.continuation;
            java.lang.Object obj = dispatchedContinuation.countOrElement;
            kotlin.coroutines.CoroutineContext coroutineContext = continuation2.get$context();
            java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(coroutineContext, obj);
            kotlinx.coroutines.UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS ? kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(continuation2, coroutineContext, objUpdateThreadContext) : null;
            try {
                dispatchedContinuation.continuation.resumeWith(objM1301constructorimpl);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                if (undispatchedCoroutineUpdateUndispatchedCompletion != null) {
                    if (!zClearThreadContext) {
                        return;
                    }
                }
                return;
            } finally {
                if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                    kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(coroutineContext, objUpdateThreadContext);
                }
            }
        }
        continuation.resumeWith(objM1301constructorimpl);
    }

    private static final void resumeUnconfined(kotlinx.coroutines.DispatchedTask<?> dispatchedTask) {
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedTask);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            resume(dispatchedTask, dispatchedTask.getDelegate$kotlinx_coroutines_core(), true);
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } catch (java.lang.Throwable th) {
            try {
                dispatchedTask.handleFatalException$kotlinx_coroutines_core(th, null);
            } finally {
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            }
        }
    }

    public static final void runUnconfinedEventLoop(kotlinx.coroutines.DispatchedTask<?> dispatchedTask, kotlinx.coroutines.EventLoop eventLoop, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        eventLoop.incrementUseCount(true);
        try {
            function0.invoke();
            do {
            } while (eventLoop.processUnconfinedEvent());
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
        } catch (java.lang.Throwable th) {
            try {
                dispatchedTask.handleFatalException$kotlinx_coroutines_core(th, null);
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
            } finally {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                eventLoop.decrementUseCount(true);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            }
        }
    }

    public static final void resumeWithStackTrace(kotlin.coroutines.Continuation<?> continuation, java.lang.Throwable th) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
            th = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
        }
        continuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th)));
    }
}
