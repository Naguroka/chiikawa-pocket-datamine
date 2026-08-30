package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: FullScreenWebViewDisplay.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1$1", f = "FullScreenWebViewDisplay.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
final class FullScreenWebViewDisplay$onCreate$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.unity3d.ads.adplayer.FullScreenWebViewDisplay $this_run;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullScreenWebViewDisplay$onCreate$1$1(com.unity3d.ads.adplayer.FullScreenWebViewDisplay fullScreenWebViewDisplay, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1$1> continuation) {
        super(2, continuation);
        this.$this_run = fullScreenWebViewDisplay;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1$1(this.$this_run, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages().emit(new com.unity3d.ads.adplayer.DisplayMessage.DisplayError(this.$this_run.opportunityId, "Opportunity ID not found"), this) == coroutine_suspended) {
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
