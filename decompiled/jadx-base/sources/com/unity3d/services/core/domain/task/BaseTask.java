package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: BaseTask.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004J*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0096Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/services/core/domain/task/BaseTask;", "P", "Lcom/unity3d/services/core/domain/task/BaseParams;", "R", "Lcom/unity3d/services/core/di/IServiceComponent;", "doWork", "Lkotlin/Result;", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/BaseParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "invoke-gIAlu-s", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface BaseTask<P extends com.unity3d.services.core.domain.task.BaseParams, R> extends com.unity3d.services.core.di.IServiceComponent {
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    java.lang.Object mo1218doWorkgIAlus(P p, kotlin.coroutines.Continuation<? super kotlin.Result<? extends R>> continuation);

    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    java.lang.Object mo1219invokegIAlus(P p, kotlin.coroutines.Continuation<? super kotlin.Result<? extends R>> continuation);

    /* JADX INFO: compiled from: BaseTask.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <P extends com.unity3d.services.core.domain.task.BaseParams, R> com.unity3d.services.core.di.IServiceProvider getServiceProvider(com.unity3d.services.core.domain.task.BaseTask<? super P, R> baseTask) {
            return com.unity3d.services.core.di.IServiceComponent.DefaultImpls.getServiceProvider(baseTask);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
        public static <P extends com.unity3d.services.core.domain.task.BaseParams, R> java.lang.Object m1220invokegIAlus(com.unity3d.services.core.domain.task.BaseTask<? super P, R> baseTask, P p, kotlin.coroutines.Continuation<? super kotlin.Result<? extends R>> continuation) {
            com.unity3d.services.core.domain.task.BaseTask$invoke$1 baseTask$invoke$1;
            if (continuation instanceof com.unity3d.services.core.domain.task.BaseTask$invoke$1) {
                baseTask$invoke$1 = (com.unity3d.services.core.domain.task.BaseTask$invoke$1) continuation;
                if ((baseTask$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    baseTask$invoke$1.label -= Integer.MIN_VALUE;
                } else {
                    baseTask$invoke$1 = new com.unity3d.services.core.domain.task.BaseTask$invoke$1(continuation);
                }
            } else {
                baseTask$invoke$1 = new com.unity3d.services.core.domain.task.BaseTask$invoke$1(continuation);
            }
            java.lang.Object obj = baseTask$invoke$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = baseTask$invoke$1.label;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return ((kotlin.Result) obj).getValue();
            }
            kotlin.ResultKt.throwOnFailure(obj);
            baseTask$invoke$1.label = 1;
            java.lang.Object objMo1218doWorkgIAlus = baseTask.mo1218doWorkgIAlus(p, baseTask$invoke$1);
            return objMo1218doWorkgIAlus == coroutine_suspended ? coroutine_suspended : objMo1218doWorkgIAlus;
        }
    }
}
