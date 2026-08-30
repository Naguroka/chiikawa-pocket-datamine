package kotlinx.coroutines;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\r\u000eB\u001b\u0012\u0014\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\t\u0010\b\u001a\u00020\tX\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/AwaitAll;", "T", "", "deferreds", "", "Lkotlinx/coroutines/Deferred;", "([Lkotlinx/coroutines/Deferred;)V", "[Lkotlinx/coroutines/Deferred;", "notCompletedCount", "Lkotlinx/atomicfu/AtomicInt;", "await", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AwaitAllNode", "DisposeHandlersOnCancel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AwaitAll<T> {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater notCompletedCount$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.AwaitAll.class, "notCompletedCount");
    private final kotlinx.coroutines.Deferred<T>[] deferreds;

    @kotlin.jvm.Volatile
    private volatile int notCompletedCount;

    /* JADX WARN: Multi-variable type inference failed */
    public AwaitAll(kotlinx.coroutines.Deferred<? extends T>[] deferredArr) {
        this.deferreds = deferredArr;
        this.notCompletedCount = deferredArr.length;
    }

    /* JADX INFO: compiled from: Await.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R \u0010\u0002\u001a\u0012\u0012\u000e\u0012\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "nodes", "", "Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/AwaitAll;", "(Lkotlinx/coroutines/AwaitAll;[Lkotlinx/coroutines/AwaitAll$AwaitAllNode;)V", "[Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "disposeAll", "", "invoke", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class DisposeHandlersOnCancel extends kotlinx.coroutines.CancelHandler {
        private final kotlinx.coroutines.AwaitAll<T>.AwaitAllNode[] nodes;

        public DisposeHandlersOnCancel(kotlinx.coroutines.AwaitAll<T>.AwaitAllNode[] awaitAllNodeArr) {
            this.nodes = awaitAllNodeArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            invoke2(th);
            return kotlin.Unit.INSTANCE;
        }

        public final void disposeAll() {
            for (kotlinx.coroutines.AwaitAll<T>.AwaitAllNode awaitAllNode : this.nodes) {
                awaitAllNode.getHandle().dispose();
            }
        }

        @Override // kotlinx.coroutines.CancelHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable cause) {
            disposeAll();
        }

        public java.lang.String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + ']';
        }
    }

    /* JADX INFO: compiled from: Await.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002R\u001b\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\bR\b\u0012\u0004\u0012\u00028\u00000\t0\u0007X\u0082\u0004R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R<\u0010\u000b\u001a\u000e\u0018\u00010\bR\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\n\u001a\u000e\u0018\u00010\bR\b\u0012\u0004\u0012\u00028\u00000\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/JobNode;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/AwaitAll;Lkotlinx/coroutines/CancellableContinuation;)V", "_disposer", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/AwaitAll;", "value", "disposer", "getDisposer", "()Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "setDisposer", "(Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;)V", "handle", "Lkotlinx/coroutines/DisposableHandle;", "getHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setHandle", "(Lkotlinx/coroutines/DisposableHandle;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class AwaitAllNode extends kotlinx.coroutines.JobNode {
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _disposer$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.AwaitAll.AwaitAllNode.class, java.lang.Object.class, "_disposer");

        @kotlin.jvm.Volatile
        private volatile java.lang.Object _disposer;
        private final kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> continuation;
        public kotlinx.coroutines.DisposableHandle handle;

        /* JADX WARN: Multi-variable type inference failed */
        public AwaitAllNode(kotlinx.coroutines.CancellableContinuation<? super java.util.List<? extends T>> cancellableContinuation) {
            this.continuation = cancellableContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            invoke2(th);
            return kotlin.Unit.INSTANCE;
        }

        public final kotlinx.coroutines.DisposableHandle getHandle() {
            kotlinx.coroutines.DisposableHandle disposableHandle = this.handle;
            if (disposableHandle != null) {
                return disposableHandle;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }

        public final void setHandle(kotlinx.coroutines.DisposableHandle disposableHandle) {
            this.handle = disposableHandle;
        }

        public final kotlinx.coroutines.AwaitAll<T>.DisposeHandlersOnCancel getDisposer() {
            return (kotlinx.coroutines.AwaitAll.DisposeHandlersOnCancel) _disposer$FU.get(this);
        }

        public final void setDisposer(kotlinx.coroutines.AwaitAll<T>.DisposeHandlersOnCancel disposeHandlersOnCancel) {
            _disposer$FU.set(this, disposeHandlersOnCancel);
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable cause) {
            if (cause != null) {
                java.lang.Object objTryResumeWithException = this.continuation.tryResumeWithException(cause);
                if (objTryResumeWithException != null) {
                    this.continuation.completeResume(objTryResumeWithException);
                    kotlinx.coroutines.AwaitAll<T>.DisposeHandlersOnCancel disposer = getDisposer();
                    if (disposer != null) {
                        disposer.disposeAll();
                        return;
                    }
                    return;
                }
                return;
            }
            if (kotlinx.coroutines.AwaitAll.notCompletedCount$FU.decrementAndGet(kotlinx.coroutines.AwaitAll.this) == 0) {
                kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> cancellableContinuation = this.continuation;
                kotlinx.coroutines.Deferred[] deferredArr = ((kotlinx.coroutines.AwaitAll) kotlinx.coroutines.AwaitAll.this).deferreds;
                java.util.ArrayList arrayList = new java.util.ArrayList(deferredArr.length);
                for (kotlinx.coroutines.Deferred deferred : deferredArr) {
                    arrayList.add(deferred.getCompleted());
                }
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m1301constructorimpl(arrayList));
            }
        }
    }

    public final java.lang.Object await(kotlin.coroutines.Continuation<? super java.util.List<? extends T>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        int length = this.deferreds.length;
        kotlinx.coroutines.AwaitAll.AwaitAllNode[] awaitAllNodeArr = new kotlinx.coroutines.AwaitAll.AwaitAllNode[length];
        for (int i = 0; i < length; i++) {
            kotlinx.coroutines.Deferred deferred = this.deferreds[i];
            deferred.start();
            kotlinx.coroutines.AwaitAll.AwaitAllNode awaitAllNode = new kotlinx.coroutines.AwaitAll.AwaitAllNode(cancellableContinuationImpl2);
            awaitAllNode.setHandle(deferred.invokeOnCompletion(awaitAllNode));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            awaitAllNodeArr[i] = awaitAllNode;
        }
        kotlinx.coroutines.AwaitAll<T>.DisposeHandlersOnCancel disposeHandlersOnCancel = new kotlinx.coroutines.AwaitAll.DisposeHandlersOnCancel(awaitAllNodeArr);
        for (int i2 = 0; i2 < length; i2++) {
            awaitAllNodeArr[i2].setDisposer(disposeHandlersOnCancel);
        }
        if (cancellableContinuationImpl2.isCompleted()) {
            disposeHandlersOnCancel.disposeAll();
        } else {
            cancellableContinuationImpl2.invokeOnCancellation(disposeHandlersOnCancel);
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
