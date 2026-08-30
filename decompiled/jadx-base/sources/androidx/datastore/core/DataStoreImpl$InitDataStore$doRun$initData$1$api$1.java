package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JA\u0010\u0002\u001a\u00028\u000021\u0010\u0003\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004H\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"androidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1", "Landroidx/datastore/core/InitializerApi;", "updateData", "transform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1<T> implements androidx.datastore.core.InitializerApi<T> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<T> $currentData;
    final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef $initializationComplete;
    final /* synthetic */ kotlinx.coroutines.sync.Mutex $updateLock;
    final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

    DataStoreImpl$InitDataStore$doRun$initData$1$api$1(kotlinx.coroutines.sync.Mutex mutex, kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlin.jvm.internal.Ref.ObjectRef<T> objectRef, androidx.datastore.core.DataStoreImpl<T> dataStoreImpl) {
        this.$updateLock = mutex;
        this.$initializationComplete = booleanRef;
        this.$currentData = objectRef;
        this.this$0 = dataStoreImpl;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b9 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #1 {all -> 0x0057, blocks: (B:21:0x0053, B:35:0x00b1, B:37:0x00b9), top: B:53:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.datastore.core.InitializerApi
    public java.lang.Object updateData(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) throws java.lang.Throwable {
        androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlin.jvm.internal.Ref.ObjectRef<T> objectRef;
        androidx.datastore.core.DataStoreImpl dataStoreImpl;
        kotlinx.coroutines.sync.Mutex mutex2;
        kotlinx.coroutines.sync.Mutex mutex3;
        androidx.datastore.core.DataStoreImpl dataStoreImpl2;
        T t;
        kotlin.jvm.internal.Ref.ObjectRef<T> objectRef2;
        if (continuation instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) continuation;
            if ((dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label -= Integer.MIN_VALUE;
            } else {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuation);
            }
        } else {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuation);
        }
        java.lang.Object obj = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = this.$updateLock;
                booleanRef = this.$initializationComplete;
                objectRef = this.$currentData;
                dataStoreImpl = this.this$0;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = function2;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = mutex;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = booleanRef;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = objectRef;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = dataStoreImpl;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 1;
                if (mutex.lock(null, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t = (T) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                        objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                        mutex2 = (kotlinx.coroutines.sync.Mutex) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            objectRef2.element = t;
                            objectRef = objectRef2;
                            T t2 = objectRef.element;
                            mutex2.unlock(null);
                            return t2;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    androidx.datastore.core.DataStoreImpl dataStoreImpl3 = (androidx.datastore.core.DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                    mutex3 = (kotlinx.coroutines.sync.Mutex) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        dataStoreImpl2 = dataStoreImpl3;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(obj, objectRef.element)) {
                            mutex2 = mutex3;
                        } else {
                            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = mutex3;
                            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = objectRef;
                            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj;
                            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                            if (dataStoreImpl2.writeData$datastore_core_release(obj, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            t = (T) obj;
                            objectRef2 = objectRef;
                            mutex2 = mutex3;
                            objectRef2.element = t;
                            objectRef = objectRef2;
                        }
                        T t3 = objectRef.element;
                        mutex2.unlock(null);
                        return t3;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        mutex2 = mutex3;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                androidx.datastore.core.DataStoreImpl dataStoreImpl4 = (androidx.datastore.core.DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4;
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3;
                booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                kotlinx.coroutines.sync.Mutex mutex4 = (kotlinx.coroutines.sync.Mutex) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3 = (kotlin.jvm.functions.Function2) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = mutex4;
                dataStoreImpl = dataStoreImpl4;
                function2 = function3;
            }
            if (!(true ^ booleanRef.element)) {
                throw new java.lang.IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.".toString());
            }
            T t4 = objectRef.element;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = mutex;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = objectRef;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = dataStoreImpl;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 2;
            java.lang.Object objInvoke = function2.invoke(t4, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex3 = mutex;
            obj = objInvoke;
            dataStoreImpl2 = dataStoreImpl;
            if (kotlin.jvm.internal.Intrinsics.areEqual(obj, objectRef.element)) {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = mutex3;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = objectRef;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                if (dataStoreImpl2.writeData$datastore_core_release(obj, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                t = (T) obj;
                objectRef2 = objectRef;
                mutex2 = mutex3;
                objectRef2.element = t;
                objectRef = objectRef2;
            } else {
                mutex2 = mutex3;
            }
            T t5 = objectRef.element;
            mutex2.unlock(null);
            return t5;
        } catch (java.lang.Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }
}
