package androidx.lifecycle;

/* JADX INFO: compiled from: WithLifecycleState.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a>\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0081@¢\u0006\u0002\u0010\u000b\u001a(\u0010\f\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H¢\u0006\u0002\u0010\r\u001a(\u0010\f\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000e2\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H¢\u0006\u0002\u0010\u000f\u001a(\u0010\u0010\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H¢\u0006\u0002\u0010\r\u001a(\u0010\u0010\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000e2\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H¢\u0006\u0002\u0010\u000f\u001a(\u0010\u0011\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H¢\u0006\u0002\u0010\r\u001a(\u0010\u0011\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000e2\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H¢\u0006\u0002\u0010\u000f\u001a0\u0010\u0012\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H¢\u0006\u0002\u0010\u0013\u001a0\u0010\u0012\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H¢\u0006\u0002\u0010\u0014\u001a0\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0081H¢\u0006\u0002\u0010\u0013¨\u0006\u0016"}, d2 = {"suspendWithStateAtLeastUnchecked", "R", "Landroidx/lifecycle/Lifecycle;", "state", "Landroidx/lifecycle/Lifecycle$State;", "dispatchNeeded", "", "lifecycleDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "block", "Lkotlin/Function0;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;ZLkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withCreated", "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withResumed", "withStarted", "withStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withStateAtLeastUnchecked", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WithLifecycleStateKt {
    public static final <R> java.lang.Object withStateAtLeast(androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        if (!(state.compareTo(androidx.lifecycle.Lifecycle.State.CREATED) >= 0)) {
            throw new java.lang.IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        kotlinx.coroutines.MainCoroutineDispatcher immediate = kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        boolean zIsDispatchNeeded = immediate.isDispatchNeeded(continuation.get$context());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
                throw new androidx.lifecycle.LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(state) >= 0) {
                return function0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, new androidx.lifecycle.WithLifecycleStateKt.AnonymousClass2(function0), continuation);
    }

    private static final <R> java.lang.Object withStateAtLeast$$forInline(androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        if (!(state.compareTo(androidx.lifecycle.Lifecycle.State.CREATED) >= 0)) {
            throw new java.lang.IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        kotlin.jvm.internal.InlineMarker.mark(3);
        kotlin.coroutines.Continuation continuation2 = null;
        continuation2.get$context();
        throw null;
    }

    public static final <R> java.lang.Object withCreated(androidx.lifecycle.Lifecycle lifecycle, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.lifecycle.Lifecycle.State state = androidx.lifecycle.Lifecycle.State.CREATED;
        kotlinx.coroutines.MainCoroutineDispatcher immediate = kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        boolean zIsDispatchNeeded = immediate.isDispatchNeeded(continuation.get$context());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
                throw new androidx.lifecycle.LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(state) >= 0) {
                return function0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, new androidx.lifecycle.WithLifecycleStateKt.AnonymousClass2(function0), continuation);
    }

    private static final <R> java.lang.Object withCreated$$forInline(androidx.lifecycle.Lifecycle lifecycle, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.lifecycle.Lifecycle.State state = androidx.lifecycle.Lifecycle.State.CREATED;
        kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        kotlin.jvm.internal.InlineMarker.mark(3);
        kotlin.coroutines.Continuation continuation2 = null;
        continuation2.get$context();
        throw null;
    }

    public static final <R> java.lang.Object withStarted(androidx.lifecycle.Lifecycle lifecycle, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.lifecycle.Lifecycle.State state = androidx.lifecycle.Lifecycle.State.STARTED;
        kotlinx.coroutines.MainCoroutineDispatcher immediate = kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        boolean zIsDispatchNeeded = immediate.isDispatchNeeded(continuation.get$context());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
                throw new androidx.lifecycle.LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(state) >= 0) {
                return function0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, new androidx.lifecycle.WithLifecycleStateKt.AnonymousClass2(function0), continuation);
    }

    private static final <R> java.lang.Object withStarted$$forInline(androidx.lifecycle.Lifecycle lifecycle, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.lifecycle.Lifecycle.State state = androidx.lifecycle.Lifecycle.State.STARTED;
        kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        kotlin.jvm.internal.InlineMarker.mark(3);
        kotlin.coroutines.Continuation continuation2 = null;
        continuation2.get$context();
        throw null;
    }

    public static final <R> java.lang.Object withResumed(androidx.lifecycle.Lifecycle lifecycle, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.lifecycle.Lifecycle.State state = androidx.lifecycle.Lifecycle.State.RESUMED;
        kotlinx.coroutines.MainCoroutineDispatcher immediate = kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        boolean zIsDispatchNeeded = immediate.isDispatchNeeded(continuation.get$context());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
                throw new androidx.lifecycle.LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(state) >= 0) {
                return function0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, new androidx.lifecycle.WithLifecycleStateKt.AnonymousClass2(function0), continuation);
    }

    private static final <R> java.lang.Object withResumed$$forInline(androidx.lifecycle.Lifecycle lifecycle, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.lifecycle.Lifecycle.State state = androidx.lifecycle.Lifecycle.State.RESUMED;
        kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        kotlin.jvm.internal.InlineMarker.mark(3);
        kotlin.coroutines.Continuation continuation2 = null;
        continuation2.get$context();
        throw null;
    }

    public static final <R> java.lang.Object withStateAtLeast(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.lifecycle.Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (!(state.compareTo(androidx.lifecycle.Lifecycle.State.CREATED) >= 0)) {
            throw new java.lang.IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        kotlinx.coroutines.MainCoroutineDispatcher immediate = kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        boolean zIsDispatchNeeded = immediate.isDispatchNeeded(continuation.get$context());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
                throw new androidx.lifecycle.LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(state) >= 0) {
                return function0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, new androidx.lifecycle.WithLifecycleStateKt.AnonymousClass2(function0), continuation);
    }

    private static final <R> java.lang.Object withStateAtLeast$$forInline(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        lifecycleOwner.getLifecycle();
        if (!(state.compareTo(androidx.lifecycle.Lifecycle.State.CREATED) >= 0)) {
            throw new java.lang.IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        kotlin.jvm.internal.InlineMarker.mark(3);
        kotlin.coroutines.Continuation continuation2 = null;
        continuation2.get$context();
        throw null;
    }

    public static final <R> java.lang.Object withCreated(androidx.lifecycle.LifecycleOwner lifecycleOwner, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.lifecycle.Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        androidx.lifecycle.Lifecycle.State state = androidx.lifecycle.Lifecycle.State.CREATED;
        kotlinx.coroutines.MainCoroutineDispatcher immediate = kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        boolean zIsDispatchNeeded = immediate.isDispatchNeeded(continuation.get$context());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
                throw new androidx.lifecycle.LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(state) >= 0) {
                return function0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, new androidx.lifecycle.WithLifecycleStateKt.AnonymousClass2(function0), continuation);
    }

    private static final <R> java.lang.Object withCreated$$forInline(androidx.lifecycle.LifecycleOwner lifecycleOwner, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        lifecycleOwner.getLifecycle();
        androidx.lifecycle.Lifecycle.State state = androidx.lifecycle.Lifecycle.State.CREATED;
        kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        kotlin.jvm.internal.InlineMarker.mark(3);
        kotlin.coroutines.Continuation continuation2 = null;
        continuation2.get$context();
        throw null;
    }

    public static final <R> java.lang.Object withStarted(androidx.lifecycle.LifecycleOwner lifecycleOwner, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.lifecycle.Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        androidx.lifecycle.Lifecycle.State state = androidx.lifecycle.Lifecycle.State.STARTED;
        kotlinx.coroutines.MainCoroutineDispatcher immediate = kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        boolean zIsDispatchNeeded = immediate.isDispatchNeeded(continuation.get$context());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
                throw new androidx.lifecycle.LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(state) >= 0) {
                return function0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, new androidx.lifecycle.WithLifecycleStateKt.AnonymousClass2(function0), continuation);
    }

    private static final <R> java.lang.Object withStarted$$forInline(androidx.lifecycle.LifecycleOwner lifecycleOwner, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        lifecycleOwner.getLifecycle();
        androidx.lifecycle.Lifecycle.State state = androidx.lifecycle.Lifecycle.State.STARTED;
        kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        kotlin.jvm.internal.InlineMarker.mark(3);
        kotlin.coroutines.Continuation continuation2 = null;
        continuation2.get$context();
        throw null;
    }

    public static final <R> java.lang.Object withResumed(androidx.lifecycle.LifecycleOwner lifecycleOwner, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.lifecycle.Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        androidx.lifecycle.Lifecycle.State state = androidx.lifecycle.Lifecycle.State.RESUMED;
        kotlinx.coroutines.MainCoroutineDispatcher immediate = kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        boolean zIsDispatchNeeded = immediate.isDispatchNeeded(continuation.get$context());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
                throw new androidx.lifecycle.LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(state) >= 0) {
                return function0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, new androidx.lifecycle.WithLifecycleStateKt.AnonymousClass2(function0), continuation);
    }

    private static final <R> java.lang.Object withResumed$$forInline(androidx.lifecycle.LifecycleOwner lifecycleOwner, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        lifecycleOwner.getLifecycle();
        androidx.lifecycle.Lifecycle.State state = androidx.lifecycle.Lifecycle.State.RESUMED;
        kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        kotlin.jvm.internal.InlineMarker.mark(3);
        kotlin.coroutines.Continuation continuation2 = null;
        continuation2.get$context();
        throw null;
    }

    public static final <R> java.lang.Object withStateAtLeastUnchecked(androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.MainCoroutineDispatcher immediate = kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        boolean zIsDispatchNeeded = immediate.isDispatchNeeded(continuation.get$context());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
                throw new androidx.lifecycle.LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(state) >= 0) {
                return function0.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, new androidx.lifecycle.WithLifecycleStateKt.AnonymousClass2(function0), continuation);
    }

    private static final <R> java.lang.Object withStateAtLeastUnchecked$$forInline(androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        kotlin.jvm.internal.InlineMarker.mark(3);
        kotlin.coroutines.Continuation continuation2 = null;
        continuation2.get$context();
        throw null;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2, reason: invalid class name */
    /* JADX INFO: compiled from: WithLifecycleState.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "R", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    public static final class AnonymousClass2<R> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<R> {
        final /* synthetic */ kotlin.jvm.functions.Function0<R> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(kotlin.jvm.functions.Function0<? extends R> function0) {
            super(0);
            this.$block = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final R invoke() {
            return this.$block.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    public static final <R> java.lang.Object suspendWithStateAtLeastUnchecked(final androidx.lifecycle.Lifecycle lifecycle, final androidx.lifecycle.Lifecycle.State state, boolean z, final kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, final kotlin.jvm.functions.Function0<? extends R> function0, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final ?? r2 = new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(androidx.lifecycle.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
                java.lang.Object objM1301constructorimpl;
                if (event == androidx.lifecycle.Lifecycle.Event.INSTANCE.upTo(state)) {
                    lifecycle.removeObserver(this);
                    kotlin.coroutines.Continuation continuation2 = cancellableContinuationImpl2;
                    kotlin.jvm.functions.Function0<R> function1 = function0;
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(function1.invoke());
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    continuation2.resumeWith(objM1301constructorimpl);
                    return;
                }
                if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
                    lifecycle.removeObserver(this);
                    kotlin.coroutines.Continuation continuation3 = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    continuation3.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(new androidx.lifecycle.LifecycleDestroyedException())));
                }
            }
        };
        if (z) {
            coroutineDispatcher.mo2860dispatch(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, new java.lang.Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    lifecycle.addObserver(r2);
                }
            });
        } else {
            lifecycle.addObserver((androidx.lifecycle.LifecycleObserver) r2);
        }
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                if (coroutineDispatcher.isDispatchNeeded(kotlin.coroutines.EmptyCoroutineContext.INSTANCE)) {
                    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
                    kotlin.coroutines.EmptyCoroutineContext emptyCoroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
                    final androidx.lifecycle.Lifecycle lifecycle2 = lifecycle;
                    final androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1<R> withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = r2;
                    coroutineDispatcher2.mo2860dispatch(emptyCoroutineContext, new java.lang.Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            lifecycle2.removeObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
                        }
                    });
                    return;
                }
                lifecycle.removeObserver(r2);
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
