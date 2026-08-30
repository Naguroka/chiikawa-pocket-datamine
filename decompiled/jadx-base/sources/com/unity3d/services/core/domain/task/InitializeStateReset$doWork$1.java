package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateReset.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateReset", f = "InitializeStateReset.kt", i = {}, l = {33}, m = "doWork-gIAlu-s$suspendImpl", n = {}, s = {})
final class InitializeStateReset$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateReset$doWork$1(com.unity3d.services.core.domain.task.InitializeStateReset initializeStateReset, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateReset$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateReset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objM1234doWorkgIAlus$suspendImpl = com.unity3d.services.core.domain.task.InitializeStateReset.m1234doWorkgIAlus$suspendImpl(this.this$0, null, this);
        return objM1234doWorkgIAlus$suspendImpl == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1234doWorkgIAlus$suspendImpl : kotlin.Result.m1300boximpl(objM1234doWorkgIAlus$suspendImpl);
    }
}
