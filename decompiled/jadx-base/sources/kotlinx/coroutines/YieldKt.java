package kotlinx.coroutines;

/* JADX INFO: compiled from: Yield.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"yield", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class YieldKt {
    public static final java.lang.Object yield(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutine_suspended;
        kotlin.coroutines.CoroutineContext coroutineContext = continuation.getContext();
        kotlinx.coroutines.JobKt.ensureActive(coroutineContext);
        kotlin.coroutines.Continuation continuationIntercepted = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation);
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = continuationIntercepted instanceof kotlinx.coroutines.internal.DispatchedContinuation ? (kotlinx.coroutines.internal.DispatchedContinuation) continuationIntercepted : null;
        if (dispatchedContinuation == null) {
            coroutine_suspended = kotlin.Unit.INSTANCE;
        } else {
            if (dispatchedContinuation.dispatcher.isDispatchNeeded(coroutineContext)) {
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(coroutineContext, kotlin.Unit.INSTANCE);
            } else {
                kotlinx.coroutines.YieldContext yieldContext = new kotlinx.coroutines.YieldContext();
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(coroutineContext.plus(yieldContext), kotlin.Unit.INSTANCE);
                coroutine_suspended = (!yieldContext.dispatcherWasUnconfined || kotlinx.coroutines.internal.DispatchedContinuationKt.yieldUndispatched(dispatchedContinuation)) ? kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() : kotlin.Unit.INSTANCE;
            }
            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : kotlin.Unit.INSTANCE;
    }
}
