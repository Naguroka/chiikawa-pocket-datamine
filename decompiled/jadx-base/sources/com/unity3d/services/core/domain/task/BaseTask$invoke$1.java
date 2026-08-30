package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: BaseTask.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", i = {}, l = {11}, m = "invoke-gIAlu-s", n = {}, s = {})
final class BaseTask$invoke$1<P extends com.unity3d.services.core.domain.task.BaseParams, R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;

    BaseTask$invoke$1(kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.BaseTask$invoke$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objM1220invokegIAlus = com.unity3d.services.core.domain.task.BaseTask.DefaultImpls.m1220invokegIAlus(null, null, this);
        return objM1220invokegIAlus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1220invokegIAlus : kotlin.Result.m1300boximpl(objM1220invokegIAlus);
    }
}
