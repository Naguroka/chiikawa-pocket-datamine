package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: DebugProbes.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000¨\u0006\b"}, d2 = {"probeCoroutineCreated", "Lkotlin/coroutines/Continuation;", "T", "completion", "probeCoroutineResumed", "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "probeCoroutineSuspended", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DebugProbesKt {
    public static final void probeCoroutineResumed(kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.probeCoroutineResumed$kotlinx_coroutines_core(continuation);
    }

    public static final void probeCoroutineSuspended(kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.probeCoroutineSuspended$kotlinx_coroutines_core(continuation);
    }

    public static final <T> kotlin.coroutines.Continuation<T> probeCoroutineCreated(kotlin.coroutines.Continuation<? super T> continuation) {
        return kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.probeCoroutineCreated$kotlinx_coroutines_core(continuation);
    }
}
