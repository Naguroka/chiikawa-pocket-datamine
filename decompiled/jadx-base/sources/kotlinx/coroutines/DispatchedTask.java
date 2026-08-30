package kotlinx.coroutines;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\b!\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0002\b\u0014J\u001f\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u001bJ\u0006\u0010\u001c\u001a\u00020\fJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u000eH ¢\u0006\u0002\b\u001eR\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/DispatchedTask;", "T", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", "", "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "cancelCompletedResult", "", "takenState", "", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "getExceptionalResult", "state", "getExceptionalResult$kotlinx_coroutines_core", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "handleFatalException", "exception", "finallyException", "handleFatalException$kotlinx_coroutines_core", "run", "takeState", "takeState$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DispatchedTask<T> extends kotlinx.coroutines.scheduling.Task {
    public int resumeMode;

    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object takenState, java.lang.Throwable cause) {
    }

    public abstract kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core();

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(java.lang.Object state) {
        return state;
    }

    public abstract java.lang.Object takeState$kotlinx_coroutines_core();

    public DispatchedTask(int i) {
        this.resumeMode = i;
    }

    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(java.lang.Object state) {
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = state instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) state : null;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object objM1301constructorimpl;
        java.lang.Object objM1301constructorimpl2;
        java.util.concurrent.CancellationException cancellationExceptionRecoverFromStackFrame;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(this.resumeMode != -1)) {
                throw new java.lang.AssertionError();
            }
        }
        kotlinx.coroutines.scheduling.TaskContext taskContext = this.taskContext;
        try {
            kotlin.coroutines.Continuation<T> delegate$kotlinx_coroutines_core = getDelegate$kotlinx_coroutines_core();
            kotlin.jvm.internal.Intrinsics.checkNotNull(delegate$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.internal.DispatchedContinuation) delegate$kotlinx_coroutines_core;
            kotlin.coroutines.Continuation<T> continuation = dispatchedContinuation.continuation;
            java.lang.Object obj = dispatchedContinuation.countOrElement;
            kotlin.coroutines.CoroutineContext context = continuation.get$context();
            java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, obj);
            kotlinx.coroutines.UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS ? kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(continuation, context, objUpdateThreadContext) : null;
            try {
                kotlin.coroutines.CoroutineContext context2 = continuation.get$context();
                java.lang.Object objTakeState$kotlinx_coroutines_core = takeState$kotlinx_coroutines_core();
                java.lang.Throwable exceptionalResult$kotlinx_coroutines_core = getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
                kotlinx.coroutines.Job job = (exceptionalResult$kotlinx_coroutines_core == null && kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(this.resumeMode)) ? (kotlinx.coroutines.Job) context2.get(kotlinx.coroutines.Job.INSTANCE) : null;
                if (job != null && !job.isActive()) {
                    java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
                    cancelCompletedResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core, cancellationException);
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                        cancellationExceptionRecoverFromStackFrame = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(cancellationException, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
                    } else {
                        cancellationExceptionRecoverFromStackFrame = cancellationException;
                    }
                    continuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(cancellationExceptionRecoverFromStackFrame)));
                } else if (exceptionalResult$kotlinx_coroutines_core != null) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(exceptionalResult$kotlinx_coroutines_core)));
                } else {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m1301constructorimpl(getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core)));
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                    kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                }
                try {
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    kotlinx.coroutines.DispatchedTask<T> dispatchedTask = this;
                    taskContext.afterTask();
                    objM1301constructorimpl2 = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                    objM1301constructorimpl2 = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                handleFatalException$kotlinx_coroutines_core(null, kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl2));
            } catch (java.lang.Throwable th2) {
                if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                    kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                }
                throw th2;
            }
        } catch (java.lang.Throwable th3) {
            try {
                kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
                taskContext.afterTask();
                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
            } catch (java.lang.Throwable th4) {
                kotlin.Result.Companion companion7 = kotlin.Result.INSTANCE;
                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th4));
            }
            handleFatalException$kotlinx_coroutines_core(th3, kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl));
        }
    }

    public final void handleFatalException$kotlinx_coroutines_core(java.lang.Throwable exception, java.lang.Throwable finallyException) {
        if (exception == null && finallyException == null) {
            return;
        }
        if (exception != null && finallyException != null) {
            kotlin.ExceptionsKt.addSuppressed(exception, finallyException);
        }
        if (exception == null) {
            exception = finallyException;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(exception);
        kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(getDelegate$kotlinx_coroutines_core().get$context(), new kotlinx.coroutines.CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", exception));
    }
}
