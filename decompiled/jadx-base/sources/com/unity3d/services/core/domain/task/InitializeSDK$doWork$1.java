package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeSDK.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", i = {}, l = {37}, m = "doWork-gIAlu-s", n = {}, s = {})
final class InitializeSDK$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeSDK$doWork$1(com.unity3d.services.core.domain.task.InitializeSDK initializeSDK, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeSDK$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objM1224doWorkgIAlus = this.this$0.m1224doWorkgIAlus((com.unity3d.services.core.domain.task.EmptyParams) null, (kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>>) this);
        return objM1224doWorkgIAlus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1224doWorkgIAlus : kotlin.Result.m1300boximpl(objM1224doWorkgIAlus);
    }
}
