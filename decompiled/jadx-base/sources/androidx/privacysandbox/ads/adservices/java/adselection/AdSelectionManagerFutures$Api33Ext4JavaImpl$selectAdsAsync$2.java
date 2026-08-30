package androidx.privacysandbox.ads.adservices.java.adselection;

/* JADX INFO: compiled from: AdSelectionManagerFutures.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2", f = "AdSelectionManagerFutures.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_EASING}, m = "invokeSuspend", n = {}, s = {})
final class AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome>, java.lang.Object> {
    final /* synthetic */ androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig $adSelectionFromOutcomesConfig;
    int label;
    final /* synthetic */ androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2(androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2> continuation) {
        super(2, continuation);
        this.this$0 = api33Ext4JavaImpl;
        this.$adSelectionFromOutcomesConfig = adSelectionFromOutcomesConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2(this.this$0, this.$adSelectionFromOutcomesConfig, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> continuation) {
        return ((androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
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
            obj = adSelectionManager.selectAds(this.$adSelectionFromOutcomesConfig, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
