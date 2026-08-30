package androidx.datastore.core;

/* JADX INFO: compiled from: DataStoreInMemoryCache.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006R \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/datastore/core/DataStoreInMemoryCache;", "T", "", "()V", "cachedValue", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/datastore/core/State;", "getCachedValue$annotations", "currentState", "getCurrentState", "()Landroidx/datastore/core/State;", "flow", "Lkotlinx/coroutines/flow/Flow;", "getFlow", "()Lkotlinx/coroutines/flow/Flow;", "tryUpdate", "newState", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreInMemoryCache<T> {
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> cachedValue;

    private static /* synthetic */ void getCachedValue$annotations() {
    }

    public DataStoreInMemoryCache() {
        androidx.datastore.core.UnInitialized unInitialized = androidx.datastore.core.UnInitialized.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(unInitialized, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(unInitialized);
    }

    public final androidx.datastore.core.State<T> getCurrentState() {
        return this.cachedValue.getValue();
    }

    public final kotlinx.coroutines.flow.Flow<androidx.datastore.core.State<T>> getFlow() {
        return this.cachedValue;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public final androidx.datastore.core.State<T> tryUpdate(androidx.datastore.core.State<T> newState) {
        androidx.datastore.core.State<T> value;
        androidx.datastore.core.State<T> state;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "newState");
        kotlinx.coroutines.flow.MutableStateFlow<androidx.datastore.core.State<T>> mutableStateFlow = this.cachedValue;
        do {
            value = mutableStateFlow.getValue();
            state = value;
            if (state instanceof androidx.datastore.core.ReadException ? true : kotlin.jvm.internal.Intrinsics.areEqual(state, androidx.datastore.core.UnInitialized.INSTANCE)) {
                state = newState;
            } else if (state instanceof androidx.datastore.core.Data) {
                if (newState.getVersion() > state.getVersion()) {
                    state = newState;
                }
            } else if (!(state instanceof androidx.datastore.core.Final)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } while (!mutableStateFlow.compareAndSet(value, state));
        return state;
    }
}
