package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0017\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0002\u0010\u0006J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013H$¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\rH\u0014J\u001b\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/io/Serializable;", "completion", "(Lkotlin/coroutines/Continuation;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCompletion", "()Lkotlin/coroutines/Continuation;", "create", "", "value", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "resumeWith", "(Ljava/lang/Object;)V", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BaseContinuationImpl implements kotlin.coroutines.Continuation<java.lang.Object>, kotlin.coroutines.jvm.internal.CoroutineStackFrame, java.io.Serializable {
    private final kotlin.coroutines.Continuation<java.lang.Object> completion;

    protected abstract java.lang.Object invokeSuspend(java.lang.Object result);

    protected void releaseIntercepted() {
    }

    public BaseContinuationImpl(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        this.completion = continuation;
    }

    public final kotlin.coroutines.Continuation<java.lang.Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(java.lang.Object result) {
        kotlin.coroutines.Continuation<java.lang.Object> continuation = this;
        while (true) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineResumed(continuation);
            kotlin.coroutines.jvm.internal.BaseContinuationImpl baseContinuationImpl = (kotlin.coroutines.jvm.internal.BaseContinuationImpl) continuation;
            kotlin.coroutines.Continuation<java.lang.Object> continuation2 = baseContinuationImpl.completion;
            kotlin.jvm.internal.Intrinsics.checkNotNull(continuation2);
            try {
                java.lang.Object objInvokeSuspend = baseContinuationImpl.invokeSuspend(result);
                if (objInvokeSuspend == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return;
                }
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                result = kotlin.Result.m1301constructorimpl(objInvokeSuspend);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                result = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            baseContinuationImpl.releaseIntercepted();
            if (!(continuation2 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl)) {
                continuation2.resumeWith(result);
                return;
            }
            continuation = continuation2;
        }
    }

    public kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> completion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completion, "completion");
        throw new java.lang.UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object value, kotlin.coroutines.Continuation<?> completion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completion, "completion");
        throw new java.lang.UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Continuation at ");
        java.io.Serializable stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        return sb.append(stackTraceElement).toString();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
        kotlin.coroutines.Continuation<java.lang.Object> continuation = this.completion;
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            return (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
        return kotlin.coroutines.jvm.internal.DebugMetadataKt.getStackTraceElement(this);
    }
}
