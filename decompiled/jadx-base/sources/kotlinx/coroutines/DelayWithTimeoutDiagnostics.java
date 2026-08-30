package kotlinx.coroutines;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/DelayWithTimeoutDiagnostics;", "Lkotlinx/coroutines/Delay;", "timeoutMessage", "", "timeout", "Lkotlin/time/Duration;", "timeoutMessage-LRDsOJo", "(J)Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DelayWithTimeoutDiagnostics extends kotlinx.coroutines.Delay {
    /* JADX INFO: renamed from: timeoutMessage-LRDsOJo, reason: not valid java name */
    java.lang.String m2794timeoutMessageLRDsOJo(long timeout);

    /* JADX INFO: compiled from: Delay.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        public static java.lang.Object delay(kotlinx.coroutines.DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            java.lang.Object objDelay = kotlinx.coroutines.Delay.DefaultImpls.delay(delayWithTimeoutDiagnostics, j, continuation);
            return objDelay == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDelay : kotlin.Unit.INSTANCE;
        }

        public static kotlinx.coroutines.DisposableHandle invokeOnTimeout(kotlinx.coroutines.DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j, java.lang.Runnable runnable, kotlin.coroutines.CoroutineContext coroutineContext) {
            return kotlinx.coroutines.Delay.DefaultImpls.invokeOnTimeout(delayWithTimeoutDiagnostics, j, runnable, coroutineContext);
        }
    }
}
