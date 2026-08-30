package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: MetricTask.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.MetricTask", f = "MetricTask.kt", i = {0, 0, 0}, l = {24}, m = "invoke-gIAlu-s$suspendImpl", n = {"$this", "result", "start$iv"}, s = {"L$0", "L$1", "J$0"})
final class MetricTask$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.services.core.domain.task.MetricTask<P, R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MetricTask$invoke$1(com.unity3d.services.core.domain.task.MetricTask<? super P, R> metricTask, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.MetricTask$invoke$1> continuation) {
        super(continuation);
        this.this$0 = metricTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objM1236invokegIAlus$suspendImpl = com.unity3d.services.core.domain.task.MetricTask.m1236invokegIAlus$suspendImpl(this.this$0, null, this);
        return objM1236invokegIAlus$suspendImpl == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1236invokegIAlus$suspendImpl : kotlin.Result.m1300boximpl(objM1236invokegIAlus$suspendImpl);
    }
}
