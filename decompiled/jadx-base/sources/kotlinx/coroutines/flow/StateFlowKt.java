package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0007\u001a6\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\t\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a2\u0010\u0011\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00050\u0013H\u0086\b¢\u0006\u0002\u0010\u0014\u001a-\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00050\u0013H\u0086\b\u001a2\u0010\u0017\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00050\u0013H\u0086\b¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"NONE", "Lkotlinx/coroutines/internal/Symbol;", "PENDING", "MutableStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "T", "value", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;", "fuseStateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/StateFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "getAndUpdate", "function", "Lkotlin/Function1;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "update", "", "updateAndGet", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StateFlowKt {
    private static final kotlinx.coroutines.internal.Symbol NONE = new kotlinx.coroutines.internal.Symbol("NONE");
    private static final kotlinx.coroutines.internal.Symbol PENDING = new kotlinx.coroutines.internal.Symbol("PENDING");

    public static final <T> kotlinx.coroutines.flow.MutableStateFlow<T> MutableStateFlow(T t) {
        if (t == null) {
            t = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
        }
        return new kotlinx.coroutines.flow.StateFlowImpl(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T updateAndGet(kotlinx.coroutines.flow.MutableStateFlow<T> mutableStateFlow, kotlin.jvm.functions.Function1<? super T, ? extends T> function1) {
        android.R r;
        T tInvoke;
        do {
            r = (java.lang.Object) mutableStateFlow.getValue();
            tInvoke = function1.invoke(r);
        } while (!mutableStateFlow.compareAndSet(r, tInvoke));
        return tInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T getAndUpdate(kotlinx.coroutines.flow.MutableStateFlow<T> mutableStateFlow, kotlin.jvm.functions.Function1<? super T, ? extends T> function1) {
        ?? r0;
        do {
            r0 = (java.lang.Object) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(r0, function1.invoke(r0)));
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(kotlinx.coroutines.flow.MutableStateFlow<T> mutableStateFlow, kotlin.jvm.functions.Function1<? super T, ? extends T> function1) {
        android.R r;
        do {
            r = (java.lang.Object) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(r, function1.invoke(r)));
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> fuseStateFlow(kotlinx.coroutines.flow.StateFlow<? extends T> stateFlow, kotlin.coroutines.CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(i != -1)) {
                throw new java.lang.AssertionError();
            }
        }
        if (((i >= 0 && i < 2) || i == -2) && bufferOverflow == kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST) {
            return stateFlow;
        }
        return kotlinx.coroutines.flow.SharedFlowKt.fuseSharedFlow(stateFlow, coroutineContext, i, bufferOverflow);
    }
}
