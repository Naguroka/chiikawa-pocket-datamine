package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {437, 458, 546, 468}, m = "invokeSuspend", n = {"updateLock", "initializationComplete", "currentData", "updateLock", "initializationComplete", "currentData", "api", "initializationComplete", "currentData", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
final class DataStoreImpl$InitDataStore$doRun$initData$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super androidx.datastore.core.Data<T>>, java.lang.Object> {
    int I$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    int label;
    final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;
    final /* synthetic */ androidx.datastore.core.DataStoreImpl<T>.InitDataStore this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$initData$1(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, androidx.datastore.core.DataStoreImpl<T>.InitDataStore initDataStore, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1> continuation) {
        super(1, continuation);
        this.this$0 = dataStoreImpl;
        this.this$1 = initDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super androidx.datastore.core.Data<T>> continuation) {
        return ((androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:39:0x011b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:22:0x00af->B:50:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws androidx.datastore.core.CorruptionException {
        kotlinx.coroutines.sync.Mutex mutexMutex$default;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1<T> dataStoreImpl$InitDataStore$doRun$initData$1;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
        kotlinx.coroutines.sync.Mutex mutex;
        java.util.Iterator<T> it;
        kotlinx.coroutines.sync.Mutex mutex2;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        kotlin.jvm.functions.Function2 function2;
        java.lang.Object obj2;
        int iHashCode;
        int i;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutexMutex$default = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
            booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            this.L$0 = mutexMutex$default;
            this.L$1 = booleanRef;
            this.L$2 = objectRef;
            this.L$3 = objectRef;
            this.label = 1;
            obj = this.this$0.readDataOrHandleCorruption(true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef2 = objectRef;
        } else {
            if (i2 == 1) {
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.L$3;
                objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
                booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.L$1;
                mutexMutex$default = (kotlinx.coroutines.sync.Mutex) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            } else if (i2 == 2) {
                it = (java.util.Iterator) this.L$4;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1) this.L$3;
                objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
                booleanRef3 = (kotlin.jvm.internal.Ref.BooleanRef) this.L$1;
                mutex2 = (kotlinx.coroutines.sync.Mutex) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                dataStoreImpl$InitDataStore$doRun$initData$1 = this;
                while (it.hasNext()) {
                    function2 = (kotlin.jvm.functions.Function2) it.next();
                    dataStoreImpl$InitDataStore$doRun$initData$1.L$0 = mutex2;
                    dataStoreImpl$InitDataStore$doRun$initData$1.L$1 = booleanRef3;
                    dataStoreImpl$InitDataStore$doRun$initData$1.L$2 = objectRef3;
                    dataStoreImpl$InitDataStore$doRun$initData$1.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                    dataStoreImpl$InitDataStore$doRun$initData$1.L$4 = it;
                    dataStoreImpl$InitDataStore$doRun$initData$1.label = 2;
                    if (function2.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, dataStoreImpl$InitDataStore$doRun$initData$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                objectRef2 = objectRef3;
                booleanRef2 = booleanRef3;
                mutex = mutex2;
                ((androidx.datastore.core.DataStoreImpl.InitDataStore) dataStoreImpl$InitDataStore$doRun$initData$1.this$1).initTasks = null;
                dataStoreImpl$InitDataStore$doRun$initData$1.L$0 = booleanRef2;
                dataStoreImpl$InitDataStore$doRun$initData$1.L$1 = objectRef2;
                dataStoreImpl$InitDataStore$doRun$initData$1.L$2 = mutex;
                dataStoreImpl$InitDataStore$doRun$initData$1.L$3 = null;
                dataStoreImpl$InitDataStore$doRun$initData$1.L$4 = null;
                dataStoreImpl$InitDataStore$doRun$initData$1.label = 3;
                if (mutex.lock(null, dataStoreImpl$InitDataStore$doRun$initData$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef4 = objectRef2;
                booleanRef2.element = true;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                mutex.unlock(null);
                obj2 = objectRef4.element;
                T t = objectRef4.element;
                if (t != null) {
                }
                dataStoreImpl$InitDataStore$doRun$initData$1.L$0 = obj2;
                dataStoreImpl$InitDataStore$doRun$initData$1.L$1 = null;
                dataStoreImpl$InitDataStore$doRun$initData$1.L$2 = null;
                dataStoreImpl$InitDataStore$doRun$initData$1.I$0 = iHashCode;
                dataStoreImpl$InitDataStore$doRun$initData$1.label = 4;
                obj = dataStoreImpl$InitDataStore$doRun$initData$1.this$0.getCoordinator().getVersion(dataStoreImpl$InitDataStore$doRun$initData$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = iHashCode;
            } else if (i2 == 3) {
                mutex = (kotlinx.coroutines.sync.Mutex) this.L$2;
                objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                booleanRef2 = (kotlin.jvm.internal.Ref.BooleanRef) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                dataStoreImpl$InitDataStore$doRun$initData$1 = this;
                try {
                    booleanRef2.element = true;
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    obj2 = objectRef4.element;
                    T t2 = objectRef4.element;
                    iHashCode = t2 != null ? t2.hashCode() : 0;
                    dataStoreImpl$InitDataStore$doRun$initData$1.L$0 = obj2;
                    dataStoreImpl$InitDataStore$doRun$initData$1.L$1 = null;
                    dataStoreImpl$InitDataStore$doRun$initData$1.L$2 = null;
                    dataStoreImpl$InitDataStore$doRun$initData$1.I$0 = iHashCode;
                    dataStoreImpl$InitDataStore$doRun$initData$1.label = 4;
                    obj = dataStoreImpl$InitDataStore$doRun$initData$1.this$0.getCoordinator().getVersion(dataStoreImpl$InitDataStore$doRun$initData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = iHashCode;
                } catch (java.lang.Throwable th) {
                    mutex.unlock(null);
                    throw th;
                }
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                obj2 = this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return new androidx.datastore.core.Data(obj2, i, ((java.lang.Number) obj).intValue());
        }
        objectRef.element = (T) ((androidx.datastore.core.Data) obj).getValue();
        androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$2 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1(mutexMutex$default, booleanRef, objectRef2, this.this$0);
        java.util.List list = ((androidx.datastore.core.DataStoreImpl.InitDataStore) this.this$1).initTasks;
        if (list != null) {
            it = list.iterator();
            mutex2 = mutexMutex$default;
            booleanRef3 = booleanRef;
            objectRef3 = objectRef2;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = dataStoreImpl$InitDataStore$doRun$initData$1$api$2;
            dataStoreImpl$InitDataStore$doRun$initData$1 = this;
            while (it.hasNext()) {
                function2 = (kotlin.jvm.functions.Function2) it.next();
                dataStoreImpl$InitDataStore$doRun$initData$1.L$0 = mutex2;
                dataStoreImpl$InitDataStore$doRun$initData$1.L$1 = booleanRef3;
                dataStoreImpl$InitDataStore$doRun$initData$1.L$2 = objectRef3;
                dataStoreImpl$InitDataStore$doRun$initData$1.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                dataStoreImpl$InitDataStore$doRun$initData$1.L$4 = it;
                dataStoreImpl$InitDataStore$doRun$initData$1.label = 2;
                if (function2.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, dataStoreImpl$InitDataStore$doRun$initData$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            objectRef2 = objectRef3;
            booleanRef2 = booleanRef3;
            mutex = mutex2;
        } else {
            dataStoreImpl$InitDataStore$doRun$initData$1 = this;
            booleanRef2 = booleanRef;
            mutex = mutexMutex$default;
        }
        ((androidx.datastore.core.DataStoreImpl.InitDataStore) dataStoreImpl$InitDataStore$doRun$initData$1.this$1).initTasks = null;
        dataStoreImpl$InitDataStore$doRun$initData$1.L$0 = booleanRef2;
        dataStoreImpl$InitDataStore$doRun$initData$1.L$1 = objectRef2;
        dataStoreImpl$InitDataStore$doRun$initData$1.L$2 = mutex;
        dataStoreImpl$InitDataStore$doRun$initData$1.L$3 = null;
        dataStoreImpl$InitDataStore$doRun$initData$1.L$4 = null;
        dataStoreImpl$InitDataStore$doRun$initData$1.label = 3;
        if (mutex.lock(null, dataStoreImpl$InitDataStore$doRun$initData$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        objectRef4 = objectRef2;
        booleanRef2.element = true;
        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
        mutex.unlock(null);
        obj2 = objectRef4.element;
        T t3 = objectRef4.element;
        if (t3 != null) {
        }
        dataStoreImpl$InitDataStore$doRun$initData$1.L$0 = obj2;
        dataStoreImpl$InitDataStore$doRun$initData$1.L$1 = null;
        dataStoreImpl$InitDataStore$doRun$initData$1.L$2 = null;
        dataStoreImpl$InitDataStore$doRun$initData$1.I$0 = iHashCode;
        dataStoreImpl$InitDataStore$doRun$initData$1.label = 4;
        obj = dataStoreImpl$InitDataStore$doRun$initData$1.this$0.getCoordinator().getVersion(dataStoreImpl$InitDataStore$doRun$initData$1);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        i = iHashCode;
        return new androidx.datastore.core.Data(obj2, i, ((java.lang.Number) obj).intValue());
    }
}
