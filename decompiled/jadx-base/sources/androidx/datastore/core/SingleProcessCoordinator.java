package androidx.datastore.core;

/* JADX INFO: compiled from: SingleProcessCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J2\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0096@¢\u0006\u0002\u0010\u0018J8\u0010\u0019\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001aH\u0096@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/datastore/core/SingleProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", com.ironsource.rc.c.c, "", "(Ljava/lang/String;)V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "updateNotifications", "Lkotlinx/coroutines/flow/Flow;", "", "getUpdateNotifications", "()Lkotlinx/coroutines/flow/Flow;", "version", "Landroidx/datastore/core/AtomicInt;", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.versionMethodName, "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", "lock", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryLock", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SingleProcessCoordinator implements androidx.datastore.core.InterProcessCoordinator {
    private final java.lang.String filePath;
    private final kotlinx.coroutines.sync.Mutex mutex;
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> updateNotifications;
    private final androidx.datastore.core.AtomicInt version;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessCoordinator$lock$1, reason: invalid class name */
    /* JADX INFO: compiled from: SingleProcessCoordinator.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", i = {0, 0, 1}, l = {66, 41}, m = "lock", n = {"block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super androidx.datastore.core.SingleProcessCoordinator.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return androidx.datastore.core.SingleProcessCoordinator.this.lock(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessCoordinator$tryLock$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SingleProcessCoordinator.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", i = {0, 0}, l = {50}, m = "tryLock", n = {"$this$withTryLock_u24default$iv", "locked$iv"}, s = {"L$0", "Z$0"})
    static final class C02981<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C02981(kotlin.coroutines.Continuation<? super androidx.datastore.core.SingleProcessCoordinator.C02981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return androidx.datastore.core.SingleProcessCoordinator.this.tryLock(null, this);
        }
    }

    public SingleProcessCoordinator(java.lang.String filePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
        this.mutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.version = new androidx.datastore.core.AtomicInt(0);
        this.updateNotifications = kotlinx.coroutines.flow.FlowKt.flow(new androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1(null));
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public kotlinx.coroutines.flow.Flow<kotlin.Unit> getUpdateNotifications() {
        return this.updateNotifications;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public <T> java.lang.Object lock(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) throws java.lang.Throwable {
        androidx.datastore.core.SingleProcessCoordinator.AnonymousClass1 anonymousClass1;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Throwable th;
        kotlinx.coroutines.sync.Mutex mutex2;
        if (continuation instanceof androidx.datastore.core.SingleProcessCoordinator.AnonymousClass1) {
            anonymousClass1 = (androidx.datastore.core.SingleProcessCoordinator.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new androidx.datastore.core.SingleProcessCoordinator.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new androidx.datastore.core.SingleProcessCoordinator.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = this.mutex;
                anonymousClass1.L$0 = function1;
                anonymousClass1.L$1 = mutex;
                anonymousClass1.label = 1;
                if (mutex.lock(null, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (kotlinx.coroutines.sync.Mutex) anonymousClass1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex2.unlock(null);
                        return obj;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) anonymousClass1.L$1;
                kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2 = (kotlin.jvm.functions.Function1) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = mutex3;
                function1 = function2;
            }
            anonymousClass1.L$0 = mutex;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            java.lang.Object objInvoke = function1.invoke(anonymousClass1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            kotlinx.coroutines.sync.Mutex mutex4 = mutex;
            obj = objInvoke;
            mutex2 = mutex4;
            mutex2.unlock(null);
            return obj;
        } catch (java.lang.Throwable th3) {
            kotlinx.coroutines.sync.Mutex mutex5 = mutex;
            th = th3;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public <T> java.lang.Object tryLock(kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) throws java.lang.Throwable {
        androidx.datastore.core.SingleProcessCoordinator.C02981 c02981;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Throwable th;
        boolean z;
        if (continuation instanceof androidx.datastore.core.SingleProcessCoordinator.C02981) {
            c02981 = (androidx.datastore.core.SingleProcessCoordinator.C02981) continuation;
            if ((c02981.label & Integer.MIN_VALUE) != 0) {
                c02981.label -= Integer.MIN_VALUE;
            } else {
                c02981 = new androidx.datastore.core.SingleProcessCoordinator.C02981(continuation);
            }
        } else {
            c02981 = new androidx.datastore.core.SingleProcessCoordinator.C02981(continuation);
        }
        java.lang.Object obj = c02981.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c02981.label;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c02981.Z$0;
            mutex = (kotlinx.coroutines.sync.Mutex) c02981.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                if (z) {
                    mutex.unlock(null);
                }
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (z) {
                    mutex.unlock(null);
                }
                throw th;
            }
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.sync.Mutex mutex2 = this.mutex;
        boolean zTryLock = mutex2.tryLock(null);
        try {
            java.lang.Boolean boolBoxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(zTryLock);
            c02981.L$0 = mutex2;
            c02981.Z$0 = zTryLock;
            c02981.label = 1;
            java.lang.Object objInvoke = function2.invoke(boolBoxBoolean, c02981);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
            obj = objInvoke;
            z = zTryLock;
            if (z) {
                mutex.unlock(null);
            }
            return obj;
        } catch (java.lang.Throwable th3) {
            mutex = mutex2;
            th = th3;
            z = zTryLock;
            if (z) {
                mutex.unlock(null);
            }
            throw th;
        }
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public java.lang.Object getVersion(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(this.version.get());
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public java.lang.Object incrementAndGetVersion(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(this.version.incrementAndGet());
    }
}
