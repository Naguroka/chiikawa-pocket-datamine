package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\tJ\r\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!J\u001f\u0010\"\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010$\u001a\u00020%H\u0010¢\u0006\u0002\b&J\u0015\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001cH\u0000¢\u0006\u0002\b(J\u001f\u0010)\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010*\u001a\u00028\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\n\u0018\u00010.j\u0004\u0018\u0001`/H\u0016J\r\u00100\u001a\u000201H\u0000¢\u0006\u0002\b2J\u0015\u00103\u001a\u0002012\u0006\u0010$\u001a\u00020%H\u0000¢\u0006\u0002\b4J\r\u00105\u001a\u00020 H\u0000¢\u0006\u0002\b6JH\u00107\u001a\u00020 2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000092%\b\b\u0010:\u001a\u001f\u0012\u0013\u0012\u00110%¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b($\u0012\u0004\u0012\u00020 \u0018\u00010;H\u0080\bø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u0002012\b\u0010A\u001a\u0004\u0018\u00010\fH\u0080\b¢\u0006\u0002\bBJ!\u0010C\u001a\u00020 2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0080\bø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u001e\u0010F\u001a\u00020 2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0016ø\u0001\u0000¢\u0006\u0002\u0010EJ\u000f\u0010G\u001a\u0004\u0018\u00010\fH\u0010¢\u0006\u0002\bHJ\b\u0010I\u001a\u00020JH\u0016J\u001b\u0010K\u001a\u0004\u0018\u00010%2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030LH\u0000¢\u0006\u0002\bMR\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\u001a\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "continuation", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "_reusableCancellableContinuation", "Lkotlinx/atomicfu/AtomicRef;", "", "_state", "get_state$kotlinx_coroutines_core$annotations", "()V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "countOrElement", "delegate", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "reusableCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "getReusableCancellableContinuation", "()Lkotlinx/coroutines/CancellableContinuationImpl;", "awaitReusability", "", "awaitReusability$kotlinx_coroutines_core", "cancelCompletedResult", "takenState", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "claimReusableCancellableContinuation", "claimReusableCancellableContinuation$kotlinx_coroutines_core", "dispatchYield", "value", "dispatchYield$kotlinx_coroutines_core", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "isReusable", "", "isReusable$kotlinx_coroutines_core", "postponeCancellation", "postponeCancellation$kotlinx_coroutines_core", "release", "release$kotlinx_coroutines_core", "resumeCancellableWith", "result", "Lkotlin/Result;", "onCancellation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "resumeCancellableWith$kotlinx_coroutines_core", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeCancelled", "state", "resumeCancelled$kotlinx_coroutines_core", "resumeUndispatchedWith", "resumeUndispatchedWith$kotlinx_coroutines_core", "(Ljava/lang/Object;)V", "resumeWith", "takeState", "takeState$kotlinx_coroutines_core", "toString", "", "tryReleaseClaimedContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "tryReleaseClaimedContinuation$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DispatchedContinuation<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.Continuation<T> {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _reusableCancellableContinuation$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.DispatchedContinuation.class, java.lang.Object.class, "_reusableCancellableContinuation");

    @kotlin.jvm.Volatile
    private volatile java.lang.Object _reusableCancellableContinuation;
    public java.lang.Object _state;
    public final kotlin.coroutines.Continuation<T> continuation;
    public final java.lang.Object countOrElement;
    public final kotlinx.coroutines.CoroutineDispatcher dispatcher;

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
    }

    private final void loop$atomicfu(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1, java.lang.Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DispatchedContinuation(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.coroutines.Continuation<? super T> continuation) {
        super(-1);
        this.dispatcher = coroutineDispatcher;
        this.continuation = continuation;
        this._state = kotlinx.coroutines.internal.DispatchedContinuationKt.UNDEFINED;
        this.countOrElement = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(getContext());
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
        kotlin.coroutines.Continuation<T> continuation = this.continuation;
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            return (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation;
        }
        return null;
    }

    private final kotlinx.coroutines.CancellableContinuationImpl<?> getReusableCancellableContinuation() {
        java.lang.Object obj = _reusableCancellableContinuation$FU.get(this);
        if (obj instanceof kotlinx.coroutines.CancellableContinuationImpl) {
            return (kotlinx.coroutines.CancellableContinuationImpl) obj;
        }
        return null;
    }

    public final boolean isReusable$kotlinx_coroutines_core() {
        return _reusableCancellableContinuation$FU.get(this) != null;
    }

    public final void awaitReusability$kotlinx_coroutines_core() {
        while (_reusableCancellableContinuation$FU.get(this) == kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED) {
        }
    }

    public final void release$kotlinx_coroutines_core() {
        awaitReusability$kotlinx_coroutines_core();
        kotlinx.coroutines.CancellableContinuationImpl<?> reusableCancellableContinuation = getReusableCancellableContinuation();
        if (reusableCancellableContinuation != null) {
            reusableCancellableContinuation.detachChild$kotlinx_coroutines_core();
        }
    }

    public final kotlinx.coroutines.CancellableContinuationImpl<T> claimReusableCancellableContinuation$kotlinx_coroutines_core() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$FU;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                _reusableCancellableContinuation$FU.set(this, kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED);
                return null;
            }
            if (obj instanceof kotlinx.coroutines.CancellableContinuationImpl) {
                if (kotlin.UByte$$ExternalSyntheticBackport0.m(_reusableCancellableContinuation$FU, this, obj, kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED)) {
                    return (kotlinx.coroutines.CancellableContinuationImpl) obj;
                }
            } else if (obj != kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED && !(obj instanceof java.lang.Throwable)) {
                throw new java.lang.IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final java.lang.Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core(kotlinx.coroutines.CancellableContinuation<?> continuation) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$FU;
        do {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED) {
                if (obj instanceof java.lang.Throwable) {
                    if (!kotlin.UByte$$ExternalSyntheticBackport0.m(_reusableCancellableContinuation$FU, this, obj, (java.lang.Object) null)) {
                        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                    }
                    return (java.lang.Throwable) obj;
                }
                throw new java.lang.IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!kotlin.UByte$$ExternalSyntheticBackport0.m(_reusableCancellableContinuation$FU, this, kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED, continuation));
        return null;
    }

    public final boolean postponeCancellation$kotlinx_coroutines_core(java.lang.Throwable cause) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$FU;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (kotlin.jvm.internal.Intrinsics.areEqual(obj, kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED)) {
                if (kotlin.UByte$$ExternalSyntheticBackport0.m(_reusableCancellableContinuation$FU, this, kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof java.lang.Throwable) {
                    return true;
                }
                if (kotlin.UByte$$ExternalSyntheticBackport0.m(_reusableCancellableContinuation$FU, this, obj, (java.lang.Object) null)) {
                    return false;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Object takeState$kotlinx_coroutines_core() {
        java.lang.Object obj = this._state;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(obj != kotlinx.coroutines.internal.DispatchedContinuationKt.UNDEFINED)) {
                throw new java.lang.AssertionError();
            }
        }
        this._state = kotlinx.coroutines.internal.DispatchedContinuationKt.UNDEFINED;
        return obj;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object result) {
        kotlin.coroutines.CoroutineContext context = this.continuation.getContext();
        java.lang.Object state$default = kotlinx.coroutines.CompletionStateKt.toState$default(result, null, 1, null);
        if (this.dispatcher.isDispatchNeeded(context)) {
            this._state = state$default;
            this.resumeMode = 0;
            this.dispatcher.mo2860dispatch(context, this);
            return;
        }
        kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED();
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this._state = state$default;
            this.resumeMode = 0;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        kotlinx.coroutines.internal.DispatchedContinuation<T> dispatchedContinuation = this;
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            kotlin.coroutines.CoroutineContext context2 = getContext();
            java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context2, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
                while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
                }
            } catch (java.lang.Throwable th) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            try {
                dispatchedContinuation.handleFatalException$kotlinx_coroutines_core(th2, null);
            } finally {
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            }
        }
    }

    public final void resumeCancellableWith$kotlinx_coroutines_core(java.lang.Object result, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onCancellation) {
        boolean z;
        java.lang.Object state = kotlinx.coroutines.CompletionStateKt.toState(result, onCancellation);
        if (this.dispatcher.isDispatchNeeded(getContext())) {
            this._state = state;
            this.resumeMode = 1;
            this.dispatcher.mo2860dispatch(getContext(), this);
            return;
        }
        kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED();
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this._state = state;
            this.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        kotlinx.coroutines.internal.DispatchedContinuation<T> dispatchedContinuation = this;
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) getContext().get(kotlinx.coroutines.Job.INSTANCE);
            if (job == null || job.isActive()) {
                z = false;
            } else {
                java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
                cancelCompletedResult$kotlinx_coroutines_core(state, cancellationException);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(cancellationException)));
                z = true;
            }
            if (!z) {
                kotlin.coroutines.Continuation<T> continuation = this.continuation;
                java.lang.Object obj = this.countOrElement;
                kotlin.coroutines.CoroutineContext context = continuation.getContext();
                java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, obj);
                kotlinx.coroutines.UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS ? kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(continuation, context, objUpdateThreadContext) : null;
                try {
                    this.continuation.resumeWith(result);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                        kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    }
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                } finally {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                        kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    }
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                }
            }
            while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
            }
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
        } catch (java.lang.Throwable th) {
            try {
                dispatchedContinuation.handleFatalException$kotlinx_coroutines_core(th, null);
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
            } finally {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            }
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object takenState, java.lang.Throwable cause) {
        if (takenState instanceof kotlinx.coroutines.CompletedWithCancellation) {
            ((kotlinx.coroutines.CompletedWithCancellation) takenState).onCancellation.invoke(cause);
        }
    }

    public final boolean resumeCancelled$kotlinx_coroutines_core(java.lang.Object state) {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) getContext().get(kotlinx.coroutines.Job.INSTANCE);
        if (job == null || job.isActive()) {
            return false;
        }
        java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(state, cancellationException);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(cancellationException)));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029 A[DONT_GENERATE] */
    public final void resumeUndispatchedWith$kotlinx_coroutines_core(java.lang.Object result) {
        kotlin.coroutines.Continuation<T> continuation = this.continuation;
        java.lang.Object obj = this.countOrElement;
        kotlin.coroutines.CoroutineContext context = continuation.getContext();
        java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, obj);
        kotlinx.coroutines.UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS ? kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(continuation, context, objUpdateThreadContext) : null;
        try {
            this.continuation.resumeWith(result);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public final void dispatchYield$kotlinx_coroutines_core(kotlin.coroutines.CoroutineContext context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(context, this);
    }

    public java.lang.String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + kotlinx.coroutines.DebugStringsKt.toDebugString(this.continuation) + ']';
    }
}
