package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: WebViewAdPlayer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/ShowEvent;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "isCompletedManually", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$onShowEvent$3", f = "WebViewAdPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class WebViewAdPlayer$onShowEvent$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<com.unity3d.ads.core.data.model.ShowEvent, java.lang.Boolean, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.ShowEvent>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    WebViewAdPlayer$onShowEvent$3(kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.WebViewAdPlayer$onShowEvent$3> continuation) {
        super(3, continuation);
    }

    public final java.lang.Object invoke(com.unity3d.ads.core.data.model.ShowEvent showEvent, boolean z, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.ShowEvent> continuation) {
        com.unity3d.ads.adplayer.WebViewAdPlayer$onShowEvent$3 webViewAdPlayer$onShowEvent$3 = new com.unity3d.ads.adplayer.WebViewAdPlayer$onShowEvent$3(continuation);
        webViewAdPlayer$onShowEvent$3.L$0 = showEvent;
        webViewAdPlayer$onShowEvent$3.Z$0 = z;
        return webViewAdPlayer$onShowEvent$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(com.unity3d.ads.core.data.model.ShowEvent showEvent, java.lang.Boolean bool, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.ShowEvent> continuation) {
        return invoke(showEvent, bool.booleanValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return this.Z$0 ? new com.unity3d.ads.core.data.model.ShowEvent.Completed(com.unity3d.ads.adplayer.model.ShowStatus.COMPLETED) : (com.unity3d.ads.core.data.model.ShowEvent) this.L$0;
    }
}
