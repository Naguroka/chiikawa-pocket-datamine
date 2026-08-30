package kotlinx.coroutines.android;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0011\u0010\b\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0002\u001a\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0002\u001a\u001d\u0010\u0010\u001a\u00020\u0003*\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\b\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0011*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"MAX_DELAY", "", "Main", "Lkotlinx/coroutines/android/HandlerDispatcher;", "getMain$annotations", "()V", "choreographer", "Landroid/view/Choreographer;", "awaitFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFrameSlowPath", "postFrameCallback", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "updateChoreographerAndPostFrameCallback", "asCoroutineDispatcher", "Landroid/os/Handler;", "name", "", "from", "asHandler", "Landroid/os/Looper;", "async", "", "kotlinx-coroutines-android"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HandlerDispatcherKt {
    private static final long MAX_DELAY = 4611686018427387903L;
    public static final kotlinx.coroutines.android.HandlerDispatcher Main;
    private static volatile android.view.Choreographer choreographer;

    public static final kotlinx.coroutines.android.HandlerDispatcher from(android.os.Handler handler) {
        return from$default(handler, null, 1, null);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void getMain$annotations() {
    }

    public static /* synthetic */ kotlinx.coroutines.android.HandlerDispatcher from$default(android.os.Handler handler, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return from(handler, str);
    }

    public static final kotlinx.coroutines.android.HandlerDispatcher from(android.os.Handler handler, java.lang.String str) {
        return new kotlinx.coroutines.android.HandlerContext(handler, str);
    }

    public static final android.os.Handler asHandler(android.os.Looper looper, boolean z) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        if (!z) {
            return new android.os.Handler(looper);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            java.lang.Object objInvoke = android.os.Handler.class.getDeclaredMethod("createAsync", android.os.Looper.class).invoke(null, looper);
            kotlin.jvm.internal.Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (android.os.Handler) objInvoke;
        }
        try {
            return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, true);
        } catch (java.lang.NoSuchMethodException unused) {
            return new android.os.Handler(looper);
        }
    }

    static {
        java.lang.Object objM1301constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(new kotlinx.coroutines.android.HandlerContext(asHandler(android.os.Looper.getMainLooper(), true), null, 2, null));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        Main = (kotlinx.coroutines.android.HandlerDispatcher) (kotlin.Result.m1307isFailureimpl(objM1301constructorimpl) ? null : objM1301constructorimpl);
    }

    public static final java.lang.Object awaitFrame(kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        android.view.Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return awaitFrameSlowPath(continuation);
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        postFrameCallback(choreographer2, cancellableContinuationImpl);
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateChoreographerAndPostFrameCallback(kotlinx.coroutines.CancellableContinuation<? super java.lang.Long> cancellableContinuation) {
        android.view.Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = android.view.Choreographer.getInstance();
            kotlin.jvm.internal.Intrinsics.checkNotNull(choreographer2);
            choreographer = choreographer2;
        }
        postFrameCallback(choreographer2, cancellableContinuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback(android.view.Choreographer choreographer2, final kotlinx.coroutines.CancellableContinuation<? super java.lang.Long> cancellableContinuation) {
        choreographer2.postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.HandlerDispatcherKt$$ExternalSyntheticLambda0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                kotlinx.coroutines.android.HandlerDispatcherKt.postFrameCallback$lambda$6(cancellableContinuation, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback$lambda$6(kotlinx.coroutines.CancellableContinuation cancellableContinuation, long j) {
        cancellableContinuation.resumeUndispatched(kotlinx.coroutines.Dispatchers.getMain(), java.lang.Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object awaitFrameSlowPath(kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            updateChoreographerAndPostFrameCallback(cancellableContinuationImpl2);
        } else {
            kotlinx.coroutines.Dispatchers.getMain().mo2860dispatch(cancellableContinuationImpl2.get$context(), new java.lang.Runnable() { // from class: kotlinx.coroutines.android.HandlerDispatcherKt$awaitFrameSlowPath$lambda$3$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    kotlinx.coroutines.android.HandlerDispatcherKt.updateChoreographerAndPostFrameCallback(cancellableContinuationImpl2);
                }
            });
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
