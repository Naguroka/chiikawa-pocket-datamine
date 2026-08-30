package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb", f = "InitializeStateLoadWeb.kt", i = {}, l = {39}, m = "doWork-gIAlu-s", n = {}, s = {})
final class InitializeStateLoadWeb$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateLoadWeb$doWork$1(com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objM1232doWorkgIAlus = this.this$0.m1232doWorkgIAlus((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params) null, (kotlin.coroutines.Continuation<? super kotlin.Result<com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult>>) this);
        return objM1232doWorkgIAlus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1232doWorkgIAlus : kotlin.Result.m1300boximpl(objM1232doWorkgIAlus);
    }
}
