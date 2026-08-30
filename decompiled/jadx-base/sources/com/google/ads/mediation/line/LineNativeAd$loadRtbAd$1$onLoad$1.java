package com.google.ads.mediation.line;

/* JADX INFO: compiled from: LineNativeAd.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.ads.mediation.line.LineNativeAd$loadRtbAd$1$onLoad$1", f = "LineNativeAd.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
final class LineNativeAd$loadRtbAd$1$onLoad$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.google.ads.mediation.line.LineNativeAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LineNativeAd$loadRtbAd$1$onLoad$1(com.google.ads.mediation.line.LineNativeAd lineNativeAd, kotlin.coroutines.Continuation<? super com.google.ads.mediation.line.LineNativeAd$loadRtbAd$1$onLoad$1> continuation) {
        super(2, continuation);
        this.this$0 = lineNativeAd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.google.ads.mediation.line.LineNativeAd$loadRtbAd$1$onLoad$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.google.ads.mediation.line.LineNativeAd$loadRtbAd$1$onLoad$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.this$0.mapNativeAd(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.google.ads.mediation.line.LineNativeAd lineNativeAd = this.this$0;
        lineNativeAd.mediationNativeAdCallback = (com.google.android.gms.ads.mediation.MediationNativeAdCallback) lineNativeAd.mediationNativeAdLoadCallback.onSuccess(this.this$0);
        com.five_corp.ad.FiveAdNative fiveAdNative = this.this$0.nativeAd;
        if (fiveAdNative == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
            fiveAdNative = null;
        }
        fiveAdNative.setEventListener(this.this$0);
        return kotlin.Unit.INSTANCE;
    }
}
