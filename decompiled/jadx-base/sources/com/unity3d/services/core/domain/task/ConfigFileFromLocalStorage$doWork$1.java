package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: ConfigFileFromLocalStorage.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage", f = "ConfigFileFromLocalStorage.kt", i = {}, l = {27}, m = "doWork-gIAlu-s", n = {}, s = {})
final class ConfigFileFromLocalStorage$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigFileFromLocalStorage$doWork$1(com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage configFileFromLocalStorage, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1> continuation) {
        super(continuation);
        this.this$0 = configFileFromLocalStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objM1221doWorkgIAlus = this.this$0.m1221doWorkgIAlus((com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params) null, (kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>>) this);
        return objM1221doWorkgIAlus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1221doWorkgIAlus : kotlin.Result.m1300boximpl(objM1221doWorkgIAlus);
    }
}
