package androidx.datastore.core.okio;

/* JADX INFO: compiled from: Atomic.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"Landroidx/datastore/core/okio/Synchronizer;", "", "()V", "withLock", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Synchronizer {
    public final <T> T withLock(kotlin.jvm.functions.Function0<? extends T> block) {
        T tInvoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this) {
            try {
                tInvoke = block.invoke();
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
            } finally {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            }
        }
        return tInvoke;
    }
}
