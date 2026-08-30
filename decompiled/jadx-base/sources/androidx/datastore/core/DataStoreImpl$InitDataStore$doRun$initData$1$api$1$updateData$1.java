package androidx.datastore.core;

/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", i = {0, 0, 1, 2, 2}, l = {544, 447, 449}, m = "updateData", n = {"transform", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "newData"}, s = {"L$0", "L$1", "L$0", "L$0", "L$2"})
final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1<T> dataStoreImpl$InitDataStore$doRun$initData$1$api$1, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1> continuation) {
        super(continuation);
        this.this$0 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateData(null, this);
    }
}
