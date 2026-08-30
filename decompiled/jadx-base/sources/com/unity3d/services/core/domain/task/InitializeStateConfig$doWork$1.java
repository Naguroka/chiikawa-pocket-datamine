package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateConfig.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfig", f = "InitializeStateConfig.kt", i = {}, l = {24}, m = "doWork-gIAlu-s", n = {}, s = {})
final class InitializeStateConfig$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfig$doWork$1(com.unity3d.services.core.domain.task.InitializeStateConfig initializeStateConfig, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objM1226doWorkgIAlus = this.this$0.m1226doWorkgIAlus((com.unity3d.services.core.domain.task.InitializeStateConfig.Params) null, (kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>>) this);
        return objM1226doWorkgIAlus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1226doWorkgIAlus : kotlin.Result.m1300boximpl(objM1226doWorkgIAlus);
    }
}
