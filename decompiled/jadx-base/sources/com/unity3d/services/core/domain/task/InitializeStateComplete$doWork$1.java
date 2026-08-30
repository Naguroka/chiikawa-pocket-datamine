package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateComplete.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateComplete", f = "InitializeStateComplete.kt", i = {}, l = {18}, m = "doWork-gIAlu-s", n = {}, s = {})
final class InitializeStateComplete$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateComplete this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateComplete$doWork$1(com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateComplete;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objM1225doWorkgIAlus = this.this$0.m1225doWorkgIAlus((com.unity3d.services.core.domain.task.InitializeStateComplete.Params) null, (kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>>) this);
        return objM1225doWorkgIAlus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1225doWorkgIAlus : kotlin.Result.m1300boximpl(objM1225doWorkgIAlus);
    }
}
