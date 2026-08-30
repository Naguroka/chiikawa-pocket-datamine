package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/datastore/core/WriteScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", i = {0}, l = {352, 353}, m = "invokeSuspend", n = {"$this$writeScope"}, s = {"L$0"})
final class DataStoreImpl$writeData$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.core.WriteScope<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ T $newData;
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef $newVersion;
    final /* synthetic */ boolean $updateCache;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$writeData$2(kotlin.jvm.internal.Ref.IntRef intRef, androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, T t, boolean z, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$writeData$2> continuation) {
        super(2, continuation);
        this.$newVersion = intRef;
        this.this$0 = dataStoreImpl;
        this.$newData = t;
        this.$updateCache = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.datastore.core.DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new androidx.datastore.core.DataStoreImpl$writeData$2(this.$newVersion, this.this$0, this.$newData, this.$updateCache, continuation);
        dataStoreImpl$writeData$2.L$0 = obj;
        return dataStoreImpl$writeData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.datastore.core.WriteScope<T> writeScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.datastore.core.DataStoreImpl$writeData$2) create(writeScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.IntRef intRef;
        androidx.datastore.core.WriteScope writeScope;
        T t;
        int iHashCode;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.datastore.core.WriteScope writeScope2 = (androidx.datastore.core.WriteScope) this.L$0;
            intRef = this.$newVersion;
            this.L$0 = writeScope2;
            this.L$1 = intRef;
            this.label = 1;
            java.lang.Object objIncrementAndGetVersion = this.this$0.getCoordinator().incrementAndGetVersion(this);
            if (objIncrementAndGetVersion == coroutine_suspended) {
                return coroutine_suspended;
            }
            writeScope = writeScope2;
            obj = objIncrementAndGetVersion;
        } else {
            if (i == 1) {
                intRef = (kotlin.jvm.internal.Ref.IntRef) this.L$1;
                writeScope = (androidx.datastore.core.WriteScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (this.$updateCache) {
                androidx.datastore.core.DataStoreInMemoryCache dataStoreInMemoryCache = ((androidx.datastore.core.DataStoreImpl) this.this$0).inMemoryCache;
                t = this.$newData;
                if (t != null) {
                    iHashCode = t.hashCode();
                } else {
                    iHashCode = 0;
                }
                dataStoreInMemoryCache.tryUpdate(new androidx.datastore.core.Data(t, iHashCode, this.$newVersion.element));
            }
            return kotlin.Unit.INSTANCE;
        }
        intRef.element = ((java.lang.Number) obj).intValue();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (writeScope.writeData(this.$newData, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (this.$updateCache) {
            androidx.datastore.core.DataStoreInMemoryCache dataStoreInMemoryCache2 = ((androidx.datastore.core.DataStoreImpl) this.this$0).inMemoryCache;
            t = this.$newData;
            if (t != null) {
                iHashCode = t.hashCode();
            } else {
                iHashCode = 0;
            }
            dataStoreInMemoryCache2.tryUpdate(new androidx.datastore.core.Data(t, iHashCode, this.$newVersion.element));
        }
        return kotlin.Unit.INSTANCE;
    }
}
