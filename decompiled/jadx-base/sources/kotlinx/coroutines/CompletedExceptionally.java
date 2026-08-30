package kotlinx.coroutines;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\u0005J\b\u0010\f\u001a\u00020\rH\u0016R\t\u0010\u0007\u001a\u00020\bX\u0082\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/CompletedExceptionally;", "", "cause", "", "handled", "", "(Ljava/lang/Throwable;Z)V", "_handled", "Lkotlinx/atomicfu/AtomicBoolean;", "getHandled", "()Z", "makeHandled", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class CompletedExceptionally {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _handled$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.CompletedExceptionally.class, "_handled");

    @kotlin.jvm.Volatile
    private volatile int _handled;
    public final java.lang.Throwable cause;

    public CompletedExceptionally(java.lang.Throwable th, boolean z) {
        this.cause = th;
        this._handled = z ? 1 : 0;
    }

    public /* synthetic */ CompletedExceptionally(java.lang.Throwable th, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }

    public final boolean getHandled() {
        return _handled$FU.get(this) != 0;
    }

    public final boolean makeHandled() {
        return _handled$FU.compareAndSet(this, 0, 1);
    }

    public java.lang.String toString() {
        return kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this) + '[' + this.cause + ']';
    }
}
