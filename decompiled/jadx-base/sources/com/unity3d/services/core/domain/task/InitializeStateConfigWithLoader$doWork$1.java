package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateConfigWithLoader.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader", f = "InitializeStateConfigWithLoader.kt", i = {}, l = {33}, m = "doWork-gIAlu-s", n = {}, s = {})
final class InitializeStateConfigWithLoader$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$1(com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader initializeStateConfigWithLoader, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateConfigWithLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objMo1218doWorkgIAlus = this.this$0.mo1218doWorkgIAlus((com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params) null, (kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>>) this);
        return objMo1218doWorkgIAlus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1218doWorkgIAlus : kotlin.Result.m1300boximpl(objMo1218doWorkgIAlus);
    }
}
