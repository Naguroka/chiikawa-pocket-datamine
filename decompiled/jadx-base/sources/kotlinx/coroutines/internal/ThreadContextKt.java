package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0002\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "countAll", "Lkotlin/Function2;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "findOne", "Lkotlinx/coroutines/ThreadContextElement;", "updateState", "Lkotlinx/coroutines/internal/ThreadState;", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "threadContextElements", "updateThreadContext", "countOrElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ThreadContextKt {
    public static final kotlinx.coroutines.internal.Symbol NO_THREAD_ELEMENTS = new kotlinx.coroutines.internal.Symbol("NO_THREAD_ELEMENTS");
    private static final kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.CoroutineContext.Element, java.lang.Object> countAll = new kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.CoroutineContext.Element, java.lang.Object>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.CoroutineContext.Element element) {
            if (!(element instanceof kotlinx.coroutines.ThreadContextElement)) {
                return obj;
            }
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? element : java.lang.Integer.valueOf(iIntValue + 1);
        }
    };
    private static final kotlin.jvm.functions.Function2<kotlinx.coroutines.ThreadContextElement<?>, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.ThreadContextElement<?>> findOne = new kotlin.jvm.functions.Function2<kotlinx.coroutines.ThreadContextElement<?>, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.ThreadContextElement<?>>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // kotlin.jvm.functions.Function2
        public final kotlinx.coroutines.ThreadContextElement<?> invoke(kotlinx.coroutines.ThreadContextElement<?> threadContextElement, kotlin.coroutines.CoroutineContext.Element element) {
            if (threadContextElement != null) {
                return threadContextElement;
            }
            if (element instanceof kotlinx.coroutines.ThreadContextElement) {
                return (kotlinx.coroutines.ThreadContextElement) element;
            }
            return null;
        }
    };
    private static final kotlin.jvm.functions.Function2<kotlinx.coroutines.internal.ThreadState, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.internal.ThreadState> updateState = new kotlin.jvm.functions.Function2<kotlinx.coroutines.internal.ThreadState, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.internal.ThreadState>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // kotlin.jvm.functions.Function2
        public final kotlinx.coroutines.internal.ThreadState invoke(kotlinx.coroutines.internal.ThreadState threadState, kotlin.coroutines.CoroutineContext.Element element) {
            if (element instanceof kotlinx.coroutines.ThreadContextElement) {
                kotlinx.coroutines.ThreadContextElement<?> threadContextElement = (kotlinx.coroutines.ThreadContextElement) element;
                threadState.append(threadContextElement, threadContextElement.updateThreadContext(threadState.context));
            }
            return threadState;
        }
    };

    public static final java.lang.Object threadContextElements(kotlin.coroutines.CoroutineContext coroutineContext) {
        java.lang.Object objFold = coroutineContext.fold(0, countAll);
        kotlin.jvm.internal.Intrinsics.checkNotNull(objFold);
        return objFold;
    }

    public static final java.lang.Object updateThreadContext(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj) {
        if (obj == null) {
            obj = threadContextElements(coroutineContext);
        }
        if (obj == 0) {
            return NO_THREAD_ELEMENTS;
        }
        if (obj instanceof java.lang.Integer) {
            return coroutineContext.fold(new kotlinx.coroutines.internal.ThreadState(coroutineContext, ((java.lang.Number) obj).intValue()), updateState);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((kotlinx.coroutines.ThreadContextElement) obj).updateThreadContext(coroutineContext);
    }

    public static final void restoreThreadContext(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof kotlinx.coroutines.internal.ThreadState) {
            ((kotlinx.coroutines.internal.ThreadState) obj).restore(coroutineContext);
            return;
        }
        java.lang.Object objFold = coroutineContext.fold(null, findOne);
        kotlin.jvm.internal.Intrinsics.checkNotNull(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((kotlinx.coroutines.ThreadContextElement) objFold).restoreThreadContext(coroutineContext, obj);
    }
}
