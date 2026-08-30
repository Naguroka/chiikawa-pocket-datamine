package kotlinx.coroutines;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001aI\u0010\b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012%\b\u0002\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a.\u0010\b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"recoverResult", "Lkotlin/Result;", "T", "state", "", "uCont", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toState", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "caller", "Lkotlinx/coroutines/CancellableContinuation;", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CompletionStateKt {
    public static /* synthetic */ java.lang.Object toState$default(java.lang.Object obj, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return toState(obj, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) function1);
    }

    public static final <T> java.lang.Object toState(java.lang.Object obj, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function1) {
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(obj);
        if (thM1304exceptionOrNullimpl == null) {
            return function1 != null ? new kotlinx.coroutines.CompletedWithCancellation(obj, function1) : obj;
        }
        return new kotlinx.coroutines.CompletedExceptionally(thM1304exceptionOrNullimpl, false, 2, null);
    }

    public static final <T> java.lang.Object toState(java.lang.Object obj, kotlinx.coroutines.CancellableContinuation<?> cancellableContinuation) {
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(obj);
        if (thM1304exceptionOrNullimpl != null) {
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
                kotlinx.coroutines.CancellableContinuation<?> cancellableContinuation2 = cancellableContinuation;
                if (cancellableContinuation2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
                    thM1304exceptionOrNullimpl = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(thM1304exceptionOrNullimpl, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) cancellableContinuation2);
                }
            }
            obj = new kotlinx.coroutines.CompletedExceptionally(thM1304exceptionOrNullimpl, false, 2, null);
        }
        return obj;
    }

    public static final <T> java.lang.Object recoverResult(java.lang.Object obj, kotlin.coroutines.Continuation<? super T> continuation) {
        if (obj instanceof kotlinx.coroutines.CompletedExceptionally) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Throwable thRecoverFromStackFrame = ((kotlinx.coroutines.CompletedExceptionally) obj).cause;
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                thRecoverFromStackFrame = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(thRecoverFromStackFrame, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
            }
            return kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thRecoverFromStackFrame));
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        return kotlin.Result.m1301constructorimpl(obj);
    }
}
