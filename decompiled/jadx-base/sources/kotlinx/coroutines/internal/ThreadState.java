package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/internal/ThreadState;", "", "context", "Lkotlin/coroutines/CoroutineContext;", com.json.zb.q, "", "(Lkotlin/coroutines/CoroutineContext;I)V", "elements", "", "Lkotlinx/coroutines/ThreadContextElement;", "[Lkotlinx/coroutines/ThreadContextElement;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "values", "[Ljava/lang/Object;", org.jacoco.core.runtime.AgentOptions.APPEND, "", "element", "value", "restore", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ThreadState {
    public final kotlin.coroutines.CoroutineContext context;
    private final kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] elements;
    private int i;
    private final java.lang.Object[] values;

    public ThreadState(kotlin.coroutines.CoroutineContext coroutineContext, int i) {
        this.context = coroutineContext;
        this.values = new java.lang.Object[i];
        this.elements = new kotlinx.coroutines.ThreadContextElement[i];
    }

    public final void append(kotlinx.coroutines.ThreadContextElement<?> element, java.lang.Object value) {
        java.lang.Object[] objArr = this.values;
        int i = this.i;
        objArr[i] = value;
        kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] threadContextElementArr = this.elements;
        this.i = i + 1;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        threadContextElementArr[i] = element;
    }

    public final void restore(kotlin.coroutines.CoroutineContext context) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            kotlinx.coroutines.ThreadContextElement<java.lang.Object> threadContextElement = this.elements[length];
            kotlin.jvm.internal.Intrinsics.checkNotNull(threadContextElement);
            threadContextElement.restoreThreadContext(context, this.values[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
