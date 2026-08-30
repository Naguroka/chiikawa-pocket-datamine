package com.google.firebase.sessions.settings;

/* JADX INFO: compiled from: RemoteSettings.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class RemoteSettings$updateSettings$2$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;

    RemoteSettings$updateSettings$2$2(kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2(continuation);
        remoteSettings$updateSettings$2$2.L$0 = obj;
        return remoteSettings$updateSettings$2$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2) create(str, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        android.util.Log.e(com.google.firebase.sessions.settings.RemoteSettings.TAG, "Error failing to fetch the remote configs: " + ((java.lang.String) this.L$0));
        return kotlin.Unit.INSTANCE;
    }
}
