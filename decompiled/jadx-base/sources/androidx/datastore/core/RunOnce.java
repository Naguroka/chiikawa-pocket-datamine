package androidx.datastore.core;

/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u0005H¤@¢\u0006\u0002\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/datastore/core/RunOnce;", "", "()V", "didRun", "Lkotlinx/coroutines/CompletableDeferred;", "", "runMutex", "Lkotlinx/coroutines/sync/Mutex;", "awaitComplete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doRun", "runIfNeeded", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RunOnce {
    private final kotlinx.coroutines.sync.Mutex runMutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    private final kotlinx.coroutines.CompletableDeferred<kotlin.Unit> didRun = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);

    /* JADX INFO: renamed from: androidx.datastore.core.RunOnce$runIfNeeded$1, reason: invalid class name */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", i = {0, 0, 1, 1}, l = {544, 497}, m = "runIfNeeded", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super androidx.datastore.core.RunOnce.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return androidx.datastore.core.RunOnce.this.runIfNeeded(this);
        }
    }

    protected abstract java.lang.Object doRun(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public final java.lang.Object awaitComplete(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objAwait = this.didRun.await(continuation);
        return objAwait == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwait : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object runIfNeeded(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        androidx.datastore.core.RunOnce.AnonymousClass1 anonymousClass1;
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.datastore.core.RunOnce runOnce;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.Throwable th;
        androidx.datastore.core.RunOnce runOnce2;
        if (continuation instanceof androidx.datastore.core.RunOnce.AnonymousClass1) {
            anonymousClass1 = (androidx.datastore.core.RunOnce.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new androidx.datastore.core.RunOnce.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new androidx.datastore.core.RunOnce.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.didRun.isCompleted()) {
                    return kotlin.Unit.INSTANCE;
                }
                mutex = this.runMutex;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = mutex;
                anonymousClass1.label = 1;
                if (mutex.lock(null, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                runOnce = this;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (kotlinx.coroutines.sync.Mutex) anonymousClass1.L$1;
                    runOnce2 = (androidx.datastore.core.RunOnce) anonymousClass1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        runOnce2.didRun.complete(kotlin.Unit.INSTANCE);
                        mutex2.unlock(null);
                        return kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) anonymousClass1.L$1;
                runOnce = (androidx.datastore.core.RunOnce) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = mutex3;
            }
            if (!runOnce.didRun.isCompleted()) {
                anonymousClass1.L$0 = runOnce;
                anonymousClass1.L$1 = mutex;
                anonymousClass1.label = 2;
                if (runOnce.doRun(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex2 = mutex;
                runOnce2 = runOnce;
                runOnce2.didRun.complete(kotlin.Unit.INSTANCE);
                mutex2.unlock(null);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            return unit;
        } catch (java.lang.Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }
}
