package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a8\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\u0012H\u0080\b¢\u0006\u0002\u0010\u0013\u001a4\u0010\u0014\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\u0012H\u0080\b¢\u0006\u0002\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\n*\u00020\u0003H\u0002\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0003H\u0007\u001a\u0013\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c*\u00020\u001dH\u0080\u0010\u001a(\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006 "}, d2 = {"DEBUG_THREAD_NAME_SEPARATOR", "", "coroutineName", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "foldCopies", "originalContext", "appendContext", "isNewCoroutine", "", "withContinuationContext", "T", "continuation", "Lkotlin/coroutines/Continuation;", "countOrElement", "", "block", "Lkotlin/Function0;", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withCoroutineContext", "context", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hasCopyableElements", "newCoroutineContext", "addedContext", "Lkotlinx/coroutines/CoroutineScope;", "undispatchedCompletion", "Lkotlinx/coroutines/UndispatchedCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "updateUndispatchedCompletion", "oldValue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutineContextKt {
    private static final java.lang.String DEBUG_THREAD_NAME_SEPARATOR = " @";

    public static final kotlin.coroutines.CoroutineContext newCoroutineContext(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.coroutines.CoroutineContext coroutineContextFoldCopies = foldCopies(coroutineScope.getCoroutineContext(), coroutineContext, true);
        kotlin.coroutines.CoroutineContext coroutineContextPlus = kotlinx.coroutines.DebugKt.getDEBUG() ? coroutineContextFoldCopies.plus(new kotlinx.coroutines.CoroutineId(kotlinx.coroutines.DebugKt.getCOROUTINE_ID().incrementAndGet())) : coroutineContextFoldCopies;
        return (coroutineContextFoldCopies == kotlinx.coroutines.Dispatchers.getDefault() || coroutineContextFoldCopies.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE) != null) ? coroutineContextPlus : coroutineContextPlus.plus(kotlinx.coroutines.Dispatchers.getDefault());
    }

    public static final kotlin.coroutines.CoroutineContext newCoroutineContext(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2) {
        return !hasCopyableElements(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : foldCopies(coroutineContext, coroutineContext2, false);
    }

    private static final boolean hasCopyableElements(kotlin.coroutines.CoroutineContext coroutineContext) {
        return ((java.lang.Boolean) coroutineContext.fold(false, new kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.CoroutineContext.Element, java.lang.Boolean>() { // from class: kotlinx.coroutines.CoroutineContextKt.hasCopyableElements.1
            public final java.lang.Boolean invoke(boolean z, kotlin.coroutines.CoroutineContext.Element element) {
                return java.lang.Boolean.valueOf(z || (element instanceof kotlinx.coroutines.CopyableThreadContextElement));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool, kotlin.coroutines.CoroutineContext.Element element) {
                return invoke(bool.booleanValue(), element);
            }
        })).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Object] */
    private static final kotlin.coroutines.CoroutineContext foldCopies(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, final boolean z) {
        boolean zHasCopyableElements = hasCopyableElements(coroutineContext);
        boolean zHasCopyableElements2 = hasCopyableElements(coroutineContext2);
        if (!zHasCopyableElements && !zHasCopyableElements2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        kotlin.coroutines.CoroutineContext coroutineContext3 = (kotlin.coroutines.CoroutineContext) coroutineContext.fold(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, new kotlin.jvm.functions.Function2<kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.coroutines.CoroutineContext] */
            @Override // kotlin.jvm.functions.Function2
            public final kotlin.coroutines.CoroutineContext invoke(kotlin.coroutines.CoroutineContext coroutineContext4, kotlin.coroutines.CoroutineContext.Element element) {
                if (!(element instanceof kotlinx.coroutines.CopyableThreadContextElement)) {
                    return coroutineContext4.plus(element);
                }
                kotlin.coroutines.CoroutineContext.Element element2 = objectRef.element.get(element.getKey());
                if (element2 == null) {
                    kotlinx.coroutines.CopyableThreadContextElement copyableThreadContextElementCopyForChild = (kotlinx.coroutines.CopyableThreadContextElement) element;
                    if (z) {
                        copyableThreadContextElementCopyForChild = copyableThreadContextElementCopyForChild.copyForChild();
                    }
                    return coroutineContext4.plus(copyableThreadContextElementCopyForChild);
                }
                kotlin.jvm.internal.Ref.ObjectRef<kotlin.coroutines.CoroutineContext> objectRef2 = objectRef;
                objectRef2.element = objectRef2.element.minusKey(element.getKey());
                return coroutineContext4.plus(((kotlinx.coroutines.CopyableThreadContextElement) element).mergeForChild(element2));
            }
        });
        if (zHasCopyableElements2) {
            objectRef.element = ((kotlin.coroutines.CoroutineContext) objectRef.element).fold(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, new kotlin.jvm.functions.Function2<kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt.foldCopies.1
                @Override // kotlin.jvm.functions.Function2
                public final kotlin.coroutines.CoroutineContext invoke(kotlin.coroutines.CoroutineContext coroutineContext4, kotlin.coroutines.CoroutineContext.Element element) {
                    if (element instanceof kotlinx.coroutines.CopyableThreadContextElement) {
                        return coroutineContext4.plus(((kotlinx.coroutines.CopyableThreadContextElement) element).copyForChild());
                    }
                    return coroutineContext4.plus(element);
                }
            });
        }
        return coroutineContext3.plus((kotlin.coroutines.CoroutineContext) objectRef.element);
    }

    public static final <T> T withCoroutineContext(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0) {
        java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(coroutineContext, obj);
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(coroutineContext, objUpdateThreadContext);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[DONT_GENERATE] */
    public static final <T> T withContinuationContext(kotlin.coroutines.Continuation<?> continuation, java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.coroutines.CoroutineContext context = continuation.getContext();
        java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, obj);
        kotlinx.coroutines.UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS ? updateUndispatchedCompletion(continuation, context, objUpdateThreadContext) : null;
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public static final kotlinx.coroutines.UndispatchedCoroutine<?> updateUndispatchedCompletion(kotlin.coroutines.Continuation<?> continuation, kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj) {
        if (!(continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
            return null;
        }
        if (!(coroutineContext.get(kotlinx.coroutines.UndispatchedMarker.INSTANCE) != null)) {
            return null;
        }
        kotlinx.coroutines.UndispatchedCoroutine<?> undispatchedCoroutineUndispatchedCompletion = undispatchedCompletion((kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
        if (undispatchedCoroutineUndispatchedCompletion != null) {
            undispatchedCoroutineUndispatchedCompletion.saveThreadContext(coroutineContext, obj);
        }
        return undispatchedCoroutineUndispatchedCompletion;
    }

    public static final kotlinx.coroutines.UndispatchedCoroutine<?> undispatchedCompletion(kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof kotlinx.coroutines.DispatchedCoroutine) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof kotlinx.coroutines.UndispatchedCoroutine) {
                return (kotlinx.coroutines.UndispatchedCoroutine) coroutineStackFrame;
            }
        }
        return null;
    }

    public static final java.lang.String getCoroutineName(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.CoroutineId coroutineId;
        java.lang.String name;
        if (!kotlinx.coroutines.DebugKt.getDEBUG() || (coroutineId = (kotlinx.coroutines.CoroutineId) coroutineContext.get(kotlinx.coroutines.CoroutineId.INSTANCE)) == null) {
            return null;
        }
        kotlinx.coroutines.CoroutineName coroutineName = (kotlinx.coroutines.CoroutineName) coroutineContext.get(kotlinx.coroutines.CoroutineName.INSTANCE);
        if (coroutineName == null || (name = coroutineName.getName()) == null) {
            name = "coroutine";
        }
        return name + '#' + coroutineId.getId();
    }
}
