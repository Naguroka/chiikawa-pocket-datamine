package kotlinx.coroutines;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001b\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103J;\u0010.\u001a\u00020/2'\u00100\u001a#\u0012\u0015\u0012\u0013\u0018\u000103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/04j\u0002`72\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u0017\u00108\u001a\u00020/2\f\u00109\u001a\b\u0012\u0004\u0012\u00020/0:H\u0082\bJ1\u0010;\u001a\u00020/2!\u0010<\u001a\u001d\u0012\u0013\u0012\u001103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/042\u0006\u00102\u001a\u000203J\u001e\u0010=\u001a\u00020/2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030?2\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u0012\u0010@\u001a\u00020\u001d2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u001f\u0010A\u001a\u00020/2\b\u0010B\u001a\u0004\u0018\u00010\u00122\u0006\u00102\u001a\u000203H\u0010¢\u0006\u0002\bCJ\u0010\u0010D\u001a\u00020\u001d2\u0006\u00102\u001a\u000203H\u0002J\u0010\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020\u0012H\u0016J\r\u0010G\u001a\u00020/H\u0000¢\u0006\u0002\bHJ\b\u0010I\u001a\u00020/H\u0002J\u0010\u0010J\u001a\u00020/2\u0006\u0010K\u001a\u00020\nH\u0002J\u0010\u0010L\u001a\u0002032\u0006\u0010M\u001a\u00020NH\u0016J\u0019\u0010O\u001a\u0004\u0018\u0001032\b\u0010$\u001a\u0004\u0018\u00010\u0012H\u0010¢\u0006\u0002\bPJ\n\u0010Q\u001a\u0004\u0018\u00010\u0012H\u0001J\u0010\u0010R\u001a\n\u0018\u00010Sj\u0004\u0018\u0001`TH\u0016J\u001f\u0010U\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010$\u001a\u0004\u0018\u00010\u0012H\u0010¢\u0006\u0004\bV\u0010WJ\b\u0010X\u001a\u00020/H\u0016J\n\u0010Y\u001a\u0004\u0018\u00010\u0010H\u0002J1\u0010Z\u001a\u00020/2'\u00100\u001a#\u0012\u0015\u0012\u0013\u0018\u000103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/04j\u0002`7H\u0016J\u001c\u0010Z\u001a\u00020/2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030?2\u0006\u0010[\u001a\u00020\nH\u0016J\u0010\u0010\\\u001a\u00020/2\u0006\u00100\u001a\u00020\u0012H\u0002J\b\u0010]\u001a\u00020\u001dH\u0002J1\u0010^\u001a\u0002012'\u00100\u001a#\u0012\u0015\u0012\u0013\u0018\u000103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/04j\u0002`7H\u0002J\u001a\u0010_\u001a\u00020/2\u0006\u00100\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010`\u001a\u00020(H\u0014J\u0015\u0010a\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0000¢\u0006\u0002\bbJ\r\u0010c\u001a\u00020/H\u0000¢\u0006\u0002\bdJ\b\u0010e\u001a\u00020\u001dH\u0001J:\u0010f\u001a\u00020/2\u0006\u0010g\u001a\u00028\u00002#\u0010<\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u000104H\u0016¢\u0006\u0002\u0010hJA\u0010i\u001a\u00020/2\b\u0010-\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\n2%\b\u0002\u0010<\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u000104H\u0002J\u001e\u0010j\u001a\u00020/2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000lH\u0016ø\u0001\u0000¢\u0006\u0002\u0010mJS\u0010n\u001a\u0004\u0018\u00010\u00122\u0006\u0010$\u001a\u00020o2\b\u0010-\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\n2#\u0010<\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u0001042\b\u0010p\u001a\u0004\u0018\u00010\u0012H\u0002J\u000f\u0010q\u001a\u0004\u0018\u00010\u0012H\u0010¢\u0006\u0002\brJ\b\u0010s\u001a\u00020(H\u0016J\b\u0010t\u001a\u00020\u001dH\u0002J!\u0010t\u001a\u0004\u0018\u00010\u00122\u0006\u0010g\u001a\u00028\u00002\b\u0010p\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010uJF\u0010t\u001a\u0004\u0018\u00010\u00122\u0006\u0010g\u001a\u00028\u00002\b\u0010p\u001a\u0004\u0018\u00010\u00122#\u0010<\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u000104H\u0016¢\u0006\u0002\u0010vJC\u0010w\u001a\u0004\u0018\u00010x2\b\u0010-\u001a\u0004\u0018\u00010\u00122\b\u0010p\u001a\u0004\u0018\u00010\u00122#\u0010<\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u000104H\u0002J\u0012\u0010y\u001a\u0004\u0018\u00010\u00122\u0006\u0010z\u001a\u000203H\u0016J\b\u0010{\u001a\u00020\u001dH\u0002J\u0019\u0010|\u001a\u00020/*\u00020}2\u0006\u0010g\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010~J\u0014\u0010\u007f\u001a\u00020/*\u00020}2\u0006\u0010z\u001a\u000203H\u0016R\t\u0010\f\u001a\u00020\rX\u0082\u0004R\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004R\u0011\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fX\u0082\u0004R\u001c\u0010\u0013\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0080\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/Waiter;", "delegate", "Lkotlin/coroutines/Continuation;", "resumeMode", "", "(Lkotlin/coroutines/Continuation;I)V", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicInt;", "_parentHandle", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/DisposableHandle;", "_state", "", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "isActive", "", "()Z", "isCancelled", "isCompleted", "parentHandle", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "stateDebugRepresentation", "", "getStateDebugRepresentation", "()Ljava/lang/String;", "alreadyResumedError", "", "proposedUpdate", "callCancelHandler", "", "handler", "Lkotlinx/coroutines/CancelHandler;", "cause", "", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "callCancelHandlerSafely", "block", "Lkotlin/Function0;", "callOnCancellation", "onCancellation", "callSegmentOnCancellation", com.json.y3.i, "Lkotlinx/coroutines/internal/Segment;", "cancel", "cancelCompletedResult", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "cancelLater", "completeResume", "token", "detachChild", "detachChild$kotlinx_coroutines_core", "detachChildIfNonResuable", "dispatchResume", com.ironsource.y8.a.t, "getContinuationCancellationCause", "parent", "Lkotlinx/coroutines/Job;", "getExceptionalResult", "getExceptionalResult$kotlinx_coroutines_core", "getResult", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "initCancellability", "installParentHandle", "invokeOnCancellation", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "invokeOnCancellationImpl", "isReusable", "makeCancelHandler", "multipleHandlersError", "nameString", "parentCancelled", "parentCancelled$kotlinx_coroutines_core", "releaseClaimedReusableContinuation", "releaseClaimedReusableContinuation$kotlinx_coroutines_core", "resetStateReusable", "resume", "value", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeImpl", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "resumedState", "Lkotlinx/coroutines/NotCompleted;", "idempotent", "takeState", "takeState$kotlinx_coroutines_core", "toString", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tryResumeImpl", "Lkotlinx/coroutines/internal/Symbol;", "tryResumeWithException", "exception", "trySuspend", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class CancellableContinuationImpl<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlinx.coroutines.CancellableContinuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.Waiter {

    @kotlin.jvm.Volatile
    private volatile int _decisionAndIndex;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object _parentHandle;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object _state;
    private final kotlin.coroutines.CoroutineContext context;
    private final kotlin.coroutines.Continuation<T> delegate;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _decisionAndIndex$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.CancellableContinuationImpl.class, "_decisionAndIndex");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.CancellableContinuationImpl.class, java.lang.Object.class, "_state");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _parentHandle$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.CancellableContinuationImpl.class, java.lang.Object.class, "_parentHandle");

    private final void loop$atomicfu(java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, java.lang.Object obj) {
        while (true) {
            function1.invoke(java.lang.Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final void loop$atomicfu(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1, java.lang.Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final void update$atomicfu(java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1, java.lang.Object obj) {
        int i;
        do {
            i = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i, function1.invoke(java.lang.Integer.valueOf(i)).intValue()));
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
        return null;
    }

    protected java.lang.String nameString() {
        return "CancellableContinuation";
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this.delegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl(kotlin.coroutines.Continuation<? super T> continuation, int i) {
        super(i);
        this.delegate = continuation;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(i != -1)) {
                throw new java.lang.AssertionError();
            }
        }
        this.context = continuation.get$context();
        this._decisionAndIndex = 536870911;
        this._state = kotlinx.coroutines.Active.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public kotlin.coroutines.CoroutineContext get$context() {
        return this.context;
    }

    private final kotlinx.coroutines.DisposableHandle getParentHandle() {
        return (kotlinx.coroutines.DisposableHandle) _parentHandle$FU.get(this);
    }

    public final java.lang.Object getState$kotlinx_coroutines_core() {
        return _state$FU.get(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
        return getState$kotlinx_coroutines_core() instanceof kotlinx.coroutines.NotCompleted;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof kotlinx.coroutines.NotCompleted);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
        return getState$kotlinx_coroutines_core() instanceof kotlinx.coroutines.CancelledContinuation;
    }

    private final java.lang.String getStateDebugRepresentation() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.NotCompleted) {
            return "Active";
        }
        return state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CancelledContinuation ? "Cancelled" : "Completed";
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
        kotlinx.coroutines.DisposableHandle disposableHandleInstallParentHandle = installParentHandle();
        if (disposableHandleInstallParentHandle != null && isCompleted()) {
            disposableHandleInstallParentHandle.dispose();
            _parentHandle$FU.set(this, kotlinx.coroutines.NonDisposableHandle.INSTANCE);
        }
    }

    private final boolean isReusable() {
        if (kotlinx.coroutines.DispatchedTaskKt.isReusableMode(this.resumeMode)) {
            kotlin.coroutines.Continuation<T> continuation = this.delegate;
            kotlin.jvm.internal.Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((kotlinx.coroutines.internal.DispatchedContinuation) continuation).isReusable$kotlinx_coroutines_core()) {
                return true;
            }
        }
        return false;
    }

    public final boolean resetStateReusable() {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(this.resumeMode == 2)) {
                throw new java.lang.AssertionError();
            }
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(getParentHandle() != kotlinx.coroutines.NonDisposableHandle.INSTANCE)) {
                throw new java.lang.AssertionError();
            }
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(!(obj instanceof kotlinx.coroutines.NotCompleted))) {
            throw new java.lang.AssertionError();
        }
        if ((obj instanceof kotlinx.coroutines.CompletedContinuation) && ((kotlinx.coroutines.CompletedContinuation) obj).idempotentResume != null) {
            detachChild$kotlinx_coroutines_core();
            return false;
        }
        _decisionAndIndex$FU.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, kotlinx.coroutines.Active.INSTANCE);
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
        kotlin.coroutines.Continuation<T> continuation = this.delegate;
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            return (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Object takeState$kotlinx_coroutines_core() {
        return getState$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object takenState, java.lang.Throwable cause) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof kotlinx.coroutines.NotCompleted) {
                throw new java.lang.IllegalStateException("Not completed".toString());
            }
            if (obj instanceof kotlinx.coroutines.CompletedExceptionally) {
                return;
            }
            if (obj instanceof kotlinx.coroutines.CompletedContinuation) {
                kotlinx.coroutines.CompletedContinuation completedContinuation = (kotlinx.coroutines.CompletedContinuation) obj;
                if (!(!completedContinuation.getCancelled())) {
                    throw new java.lang.IllegalStateException("Must be called at most once".toString());
                }
                if (kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, obj, kotlinx.coroutines.CompletedContinuation.copy$default(completedContinuation, null, null, null, null, cause, 15, null))) {
                    completedContinuation.invokeHandlers(this, cause);
                    return;
                }
            } else if (kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, obj, new kotlinx.coroutines.CompletedContinuation(obj, null, null, null, cause, 14, null))) {
                return;
            }
        }
    }

    private final boolean cancelLater(java.lang.Throwable cause) {
        if (!isReusable()) {
            return false;
        }
        kotlin.coroutines.Continuation<T> continuation = this.delegate;
        kotlin.jvm.internal.Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((kotlinx.coroutines.internal.DispatchedContinuation) continuation).postponeCancellation$kotlinx_coroutines_core(cause);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(java.lang.Throwable cause) {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof kotlinx.coroutines.NotCompleted)) {
                return false;
            }
        } while (!kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, obj, new kotlinx.coroutines.CancelledContinuation(this, cause, (obj instanceof kotlinx.coroutines.CancelHandler) || (obj instanceof kotlinx.coroutines.internal.Segment))));
        kotlinx.coroutines.NotCompleted notCompleted = (kotlinx.coroutines.NotCompleted) obj;
        if (notCompleted instanceof kotlinx.coroutines.CancelHandler) {
            callCancelHandler((kotlinx.coroutines.CancelHandler) obj, cause);
        } else if (notCompleted instanceof kotlinx.coroutines.internal.Segment) {
            callSegmentOnCancellation((kotlinx.coroutines.internal.Segment) obj, cause);
        }
        detachChildIfNonResuable();
        dispatchResume(this.resumeMode);
        return true;
    }

    public final void parentCancelled$kotlinx_coroutines_core(java.lang.Throwable cause) {
        if (cancelLater(cause)) {
            return;
        }
        cancel(cause);
        detachChildIfNonResuable();
    }

    private final void callCancelHandlerSafely(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        try {
            block.invoke();
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(get$context(), new kotlinx.coroutines.CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    public final void callCancelHandler(kotlinx.coroutines.CancelHandler handler, java.lang.Throwable cause) {
        try {
            handler.invoke(cause);
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(get$context(), new kotlinx.coroutines.CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    private final void callSegmentOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, java.lang.Throwable cause) {
        int i = _decisionAndIndex$FU.get(this) & 536870911;
        if (!(i != 536870911)) {
            throw new java.lang.IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            segment.onCancellation(i, cause, get$context());
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(get$context(), new kotlinx.coroutines.CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    public final void callOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onCancellation, java.lang.Throwable cause) {
        try {
            onCancellation.invoke(cause);
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(get$context(), new kotlinx.coroutines.CompletionHandlerException("Exception in resume onCancellation handler for " + this, th));
        }
    }

    public java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job parent) {
        return parent.getCancellationException();
    }

    private final boolean trySuspend() {
        int i;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new java.lang.IllegalStateException("Already suspended".toString());
            }
        } while (!_decisionAndIndex$FU.compareAndSet(this, i, 536870912 + (536870911 & i)));
        return true;
    }

    private final boolean tryResume() {
        int i;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new java.lang.IllegalStateException("Already resumed".toString());
            }
        } while (!_decisionAndIndex$FU.compareAndSet(this, i, 1073741824 + (536870911 & i)));
        return true;
    }

    public final java.lang.Object getResult() {
        kotlinx.coroutines.Job job;
        boolean zIsReusable = isReusable();
        if (trySuspend()) {
            if (getParentHandle() == null) {
                installParentHandle();
            }
            if (zIsReusable) {
                releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            }
            return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (zIsReusable) {
            releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally)) {
            if (kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(this.resumeMode) && (job = (kotlinx.coroutines.Job) get$context().get(kotlinx.coroutines.Job.INSTANCE)) != null && !job.isActive()) {
                java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
                cancelCompletedResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core, cancellationException);
                if (!kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
                    throw cancellationException;
                }
                kotlinx.coroutines.CancellableContinuationImpl<T> cancellableContinuationImpl = this;
                if (cancellableContinuationImpl instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
                    throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(cancellationException, cancellableContinuationImpl);
                }
                throw cancellationException;
            }
            return getSuccessfulResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
        }
        java.lang.Throwable th = ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        if (!kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
            throw th;
        }
        kotlinx.coroutines.CancellableContinuationImpl<T> cancellableContinuationImpl2 = this;
        if (cancellableContinuationImpl2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th, cancellableContinuationImpl2);
        }
        throw th;
    }

    private final kotlinx.coroutines.DisposableHandle installParentHandle() {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) get$context().get(kotlinx.coroutines.Job.INSTANCE);
        if (job == null) {
            return null;
        }
        kotlinx.coroutines.DisposableHandle disposableHandleInvokeOnCompletion$default = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new kotlinx.coroutines.ChildContinuation(this), 2, null);
        kotlin.UByte$$ExternalSyntheticBackport0.m(_parentHandle$FU, this, (java.lang.Object) null, disposableHandleInvokeOnCompletion$default);
        return disposableHandleInvokeOnCompletion$default;
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        java.lang.Throwable thTryReleaseClaimedContinuation$kotlinx_coroutines_core;
        kotlin.coroutines.Continuation<T> continuation = this.delegate;
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation ? (kotlinx.coroutines.internal.DispatchedContinuation) continuation : null;
        if (dispatchedContinuation == null || (thTryReleaseClaimedContinuation$kotlinx_coroutines_core = dispatchedContinuation.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this)) == null) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
        cancel(thTryReleaseClaimedContinuation$kotlinx_coroutines_core);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object result) {
        resumeImpl$default(this, kotlinx.coroutines.CompletionStateKt.toState(result, this), this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T value, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onCancellation) {
        resumeImpl(value, this.resumeMode, onCancellation);
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index) {
        int i;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (!((i & 536870911) == 536870911)) {
                throw new java.lang.IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, ((i >> 29) << 29) + index));
        invokeOnCancellationImpl(segment);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        invokeOnCancellationImpl(makeCancelHandler(handler));
    }

    private final void invokeOnCancellationImpl(java.lang.Object handler) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!((handler instanceof kotlinx.coroutines.CancelHandler) || (handler instanceof kotlinx.coroutines.internal.Segment))) {
                throw new java.lang.AssertionError();
            }
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof kotlinx.coroutines.Active) {
                if (kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, obj, handler)) {
                    return;
                }
            } else {
                if (obj instanceof kotlinx.coroutines.CancelHandler ? true : obj instanceof kotlinx.coroutines.internal.Segment) {
                    multipleHandlersError(handler, obj);
                } else {
                    boolean z = obj instanceof kotlinx.coroutines.CompletedExceptionally;
                    if (z) {
                        kotlinx.coroutines.CompletedExceptionally completedExceptionally = (kotlinx.coroutines.CompletedExceptionally) obj;
                        if (!completedExceptionally.makeHandled()) {
                            multipleHandlersError(handler, obj);
                        }
                        if (obj instanceof kotlinx.coroutines.CancelledContinuation) {
                            if (!z) {
                                completedExceptionally = null;
                            }
                            java.lang.Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
                            if (handler instanceof kotlinx.coroutines.CancelHandler) {
                                callCancelHandler((kotlinx.coroutines.CancelHandler) handler, th);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                callSegmentOnCancellation((kotlinx.coroutines.internal.Segment) handler, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj instanceof kotlinx.coroutines.CompletedContinuation) {
                        kotlinx.coroutines.CompletedContinuation completedContinuation = (kotlinx.coroutines.CompletedContinuation) obj;
                        if (completedContinuation.cancelHandler != null) {
                            multipleHandlersError(handler, obj);
                        }
                        if (handler instanceof kotlinx.coroutines.internal.Segment) {
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        kotlinx.coroutines.CancelHandler cancelHandler = (kotlinx.coroutines.CancelHandler) handler;
                        if (completedContinuation.getCancelled()) {
                            callCancelHandler(cancelHandler, completedContinuation.cancelCause);
                            return;
                        } else {
                            if (kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, obj, kotlinx.coroutines.CompletedContinuation.copy$default(completedContinuation, null, cancelHandler, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (handler instanceof kotlinx.coroutines.internal.Segment) {
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, obj, new kotlinx.coroutines.CompletedContinuation(obj, (kotlinx.coroutines.CancelHandler) handler, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private final void multipleHandlersError(java.lang.Object handler, java.lang.Object state) {
        throw new java.lang.IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    private final kotlinx.coroutines.CancelHandler makeCancelHandler(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        return handler instanceof kotlinx.coroutines.CancelHandler ? (kotlinx.coroutines.CancelHandler) handler : new kotlinx.coroutines.InvokeOnCancel(handler);
    }

    private final void dispatchResume(int mode) {
        if (tryResume()) {
            return;
        }
        kotlinx.coroutines.DispatchedTaskKt.dispatch(this, mode);
    }

    private final java.lang.Object resumedState(kotlinx.coroutines.NotCompleted state, java.lang.Object proposedUpdate, int resumeMode, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onCancellation, java.lang.Object idempotent) {
        if (proposedUpdate instanceof kotlinx.coroutines.CompletedExceptionally) {
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                if (!(idempotent == null)) {
                    throw new java.lang.AssertionError();
                }
            }
            if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                return proposedUpdate;
            }
            if (onCancellation == null) {
                return proposedUpdate;
            }
            throw new java.lang.AssertionError();
        }
        if (!kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(resumeMode) && idempotent == null) {
            return proposedUpdate;
        }
        if (onCancellation == null && !(state instanceof kotlinx.coroutines.CancelHandler) && idempotent == null) {
            return proposedUpdate;
        }
        return new kotlinx.coroutines.CompletedContinuation(proposedUpdate, state instanceof kotlinx.coroutines.CancelHandler ? (kotlinx.coroutines.CancelHandler) state : null, onCancellation, idempotent, null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void resumeImpl$default(kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl, java.lang.Object obj, int i, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        cancellableContinuationImpl.resumeImpl(obj, i, function1);
    }

    private final void resumeImpl(java.lang.Object proposedUpdate, int resumeMode, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onCancellation) {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof kotlinx.coroutines.NotCompleted) {
            } else {
                if (obj instanceof kotlinx.coroutines.CancelledContinuation) {
                    kotlinx.coroutines.CancelledContinuation cancelledContinuation = (kotlinx.coroutines.CancelledContinuation) obj;
                    if (cancelledContinuation.makeResumed()) {
                        if (onCancellation != null) {
                            callOnCancellation(onCancellation, cancelledContinuation.cause);
                            return;
                        }
                        return;
                    }
                }
                alreadyResumedError(proposedUpdate);
                throw new kotlin.KotlinNothingValueException();
            }
        } while (!kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, obj, resumedState((kotlinx.coroutines.NotCompleted) obj, proposedUpdate, resumeMode, onCancellation, null)));
        detachChildIfNonResuable();
        dispatchResume(resumeMode);
    }

    private final kotlinx.coroutines.internal.Symbol tryResumeImpl(java.lang.Object proposedUpdate, java.lang.Object idempotent, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onCancellation) {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof kotlinx.coroutines.NotCompleted) {
            } else {
                if (!(obj instanceof kotlinx.coroutines.CompletedContinuation) || idempotent == null) {
                    return null;
                }
                kotlinx.coroutines.CompletedContinuation completedContinuation = (kotlinx.coroutines.CompletedContinuation) obj;
                if (completedContinuation.idempotentResume != idempotent) {
                    return null;
                }
                if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() || kotlin.jvm.internal.Intrinsics.areEqual(completedContinuation.result, proposedUpdate)) {
                    return kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN;
                }
                throw new java.lang.AssertionError();
            }
        } while (!kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, obj, resumedState((kotlinx.coroutines.NotCompleted) obj, proposedUpdate, this.resumeMode, onCancellation, idempotent)));
        detachChildIfNonResuable();
        return kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN;
    }

    private final java.lang.Void alreadyResumedError(java.lang.Object proposedUpdate) {
        throw new java.lang.IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    private final void detachChildIfNonResuable() {
        if (isReusable()) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
    }

    public final void detachChild$kotlinx_coroutines_core() {
        kotlinx.coroutines.DisposableHandle parentHandle = getParentHandle();
        if (parentHandle == null) {
            return;
        }
        parentHandle.dispose();
        _parentHandle$FU.set(this, kotlinx.coroutines.NonDisposableHandle.INSTANCE);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResume(T value, java.lang.Object idempotent) {
        return tryResumeImpl(value, idempotent, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResume(T value, java.lang.Object idempotent, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onCancellation) {
        return tryResumeImpl(value, idempotent, onCancellation);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResumeWithException(java.lang.Throwable exception) {
        return tryResumeImpl(new kotlinx.coroutines.CompletedExceptionally(exception, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(java.lang.Object token) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(token == kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN)) {
                throw new java.lang.AssertionError();
            }
        }
        dispatchResume(this.resumeMode);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, T t) {
        kotlin.coroutines.Continuation<T> continuation = this.delegate;
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation ? (kotlinx.coroutines.internal.DispatchedContinuation) continuation : null;
        resumeImpl$default(this, t, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, java.lang.Throwable th) {
        kotlin.coroutines.Continuation<T> continuation = this.delegate;
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation ? (kotlinx.coroutines.internal.DispatchedContinuation) continuation : null;
        resumeImpl$default(this, new kotlinx.coroutines.CompletedExceptionally(th, false, 2, null), (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(java.lang.Object state) {
        return state instanceof kotlinx.coroutines.CompletedContinuation ? (T) ((kotlinx.coroutines.CompletedContinuation) state).result : state;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(java.lang.Object state) {
        java.lang.Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(state);
        if (exceptionalResult$kotlinx_coroutines_core == null) {
            return null;
        }
        kotlin.coroutines.Continuation<T> continuation = this.delegate;
        return (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) ? kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(exceptionalResult$kotlinx_coroutines_core, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation) : exceptionalResult$kotlinx_coroutines_core;
    }

    public java.lang.String toString() {
        return nameString() + '(' + kotlinx.coroutines.DebugStringsKt.toDebugString(this.delegate) + "){" + getStateDebugRepresentation() + "}@" + kotlinx.coroutines.DebugStringsKt.getHexAddress(this);
    }

    private final void callCancelHandler(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler, java.lang.Throwable cause) {
        try {
            handler.invoke(cause);
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(get$context(), new kotlinx.coroutines.CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }
}
