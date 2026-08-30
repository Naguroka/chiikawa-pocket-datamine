package androidx.privacysandbox.ads.adservices.java.adselection;

/* JADX INFO: compiled from: AdSelectionManagerFutures.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$updateAdCounterHistogramAsync$1", f = "AdSelectionManagerFutures.kt", i = {}, l = {338}, m = "invokeSuspend", n = {}, s = {})
final class AdSelectionManagerFutures$Api33Ext4JavaImpl$updateAdCounterHistogramAsync$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.privacysandbox.ads.adservices.adselection.UpdateAdCounterHistogramRequest $updateAdCounterHistogramRequest;
    int label;
    final /* synthetic */ androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdSelectionManagerFutures$Api33Ext4JavaImpl$updateAdCounterHistogramAsync$1(androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, androidx.privacysandbox.ads.adservices.adselection.UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$updateAdCounterHistogramAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = api33Ext4JavaImpl;
        this.$updateAdCounterHistogramRequest = updateAdCounterHistogramRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$updateAdCounterHistogramAsync$1(this.this$0, this.$updateAdCounterHistogramRequest, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$updateAdCounterHistogramAsync$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager adSelectionManager = this.this$0.mAdSelectionManager;
            kotlin.jvm.internal.Intrinsics.checkNotNull(adSelectionManager);
            this.label = 1;
            if (adSelectionManager.updateAdCounterHistogram(this.$updateAdCounterHistogramRequest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
