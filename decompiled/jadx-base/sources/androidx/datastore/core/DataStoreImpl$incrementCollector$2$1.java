package androidx.datastore.core;

/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", i = {}, l = {134, 135}, m = "invokeSuspend", n = {}, s = {})
final class DataStoreImpl$incrementCollector$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$incrementCollector$2$1(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$incrementCollector$2$1> continuation) {
        super(2, continuation);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.datastore.core.DataStoreImpl$incrementCollector$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (((androidx.datastore.core.DataStoreImpl) this.this$0).readAndInit.awaitComplete(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.flow.Flow flowConflate = kotlinx.coroutines.flow.FlowKt.conflate(this.this$0.getCoordinator().getUpdateNotifications());
        final androidx.datastore.core.DataStoreImpl<T> dataStoreImpl = this.this$0;
        this.label = 2;
        if (flowConflate.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.datastore.core.DataStoreImpl$incrementCollector$2$1.1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((kotlin.Unit) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                if (!(((androidx.datastore.core.DataStoreImpl) dataStoreImpl).inMemoryCache.getCurrentState() instanceof androidx.datastore.core.Final)) {
                    java.lang.Object dataAndUpdateCache = dataStoreImpl.readDataAndUpdateCache(true, continuation);
                    return dataAndUpdateCache == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? dataAndUpdateCache : kotlin.Unit.INSTANCE;
                }
                return kotlin.Unit.INSTANCE;
            }
        }, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
