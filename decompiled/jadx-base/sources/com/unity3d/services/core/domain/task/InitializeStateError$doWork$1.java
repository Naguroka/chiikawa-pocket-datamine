package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateError.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateError", f = "InitializeStateError.kt", i = {}, l = {27}, m = "doWork-gIAlu-s", n = {}, s = {})
final class InitializeStateError$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateError$doWork$1(com.unity3d.services.core.domain.task.InitializeStateError initializeStateError, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateError$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objM1230doWorkgIAlus = this.this$0.m1230doWorkgIAlus((com.unity3d.services.core.domain.task.InitializeStateError.Params) null, (kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>>) this);
        return objM1230doWorkgIAlus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1230doWorkgIAlus : kotlin.Result.m1300boximpl(objM1230doWorkgIAlus);
    }
}
