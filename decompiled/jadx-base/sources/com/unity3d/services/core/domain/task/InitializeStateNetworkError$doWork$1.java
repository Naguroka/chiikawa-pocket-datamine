package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateNetworkError.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError", f = "InitializeStateNetworkError.kt", i = {}, l = {33}, m = "doWork-gIAlu-s", n = {}, s = {})
final class InitializeStateNetworkError$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateNetworkError$doWork$1(com.unity3d.services.core.domain.task.InitializeStateNetworkError initializeStateNetworkError, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateNetworkError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objM1233doWorkgIAlus = this.this$0.m1233doWorkgIAlus((com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params) null, (kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>>) this);
        return objM1233doWorkgIAlus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1233doWorkgIAlus : kotlin.Result.m1300boximpl(objM1233doWorkgIAlus);
    }
}
