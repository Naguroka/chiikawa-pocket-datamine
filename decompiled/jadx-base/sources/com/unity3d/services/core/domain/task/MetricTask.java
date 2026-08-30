package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: MetricTask.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0 H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0002J*\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010&\u001a\u00028\u0000H\u0096Bø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\b\u0010)\u001a\u00020\u0013H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Lcom/unity3d/services/core/domain/task/MetricTask;", "P", "Lcom/unity3d/services/core/domain/task/BaseParams;", "R", "Lcom/unity3d/services/core/domain/task/BaseTask;", "()V", "duration", "", "getDuration", "()J", "setDuration", "(J)V", "taskStatus", "", "getTaskStatus", "()Ljava/lang/String;", "setTaskStatus", "(Ljava/lang/String;)V", "captureMetric", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "getMetric", "Lcom/unity3d/services/core/request/metrics/Metric;", "getMetricName", "getMetricNameForInitializeTask", "name", "getMetricNameForTask", "task", "", "getMetricTagsForState", "", "getSDKMetrics", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "getStatePrefixLength", "", "invoke", "params", "invoke-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/BaseParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMetric", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class MetricTask<P extends com.unity3d.services.core.domain.task.BaseParams, R> implements com.unity3d.services.core.domain.task.BaseTask<P, R> {
    private long duration;
    private java.lang.String taskStatus = "unknown";

    private final int getStatePrefixLength() {
        return 15;
    }

    public java.lang.String getMetricName() {
        return null;
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: invoke-gIAlu-s */
    public java.lang.Object mo1219invokegIAlus(P p, kotlin.coroutines.Continuation<? super kotlin.Result<? extends R>> continuation) {
        return m1236invokegIAlus$suspendImpl(this, p, continuation);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public com.unity3d.services.core.di.IServiceProvider getServiceProvider() {
        return com.unity3d.services.core.domain.task.BaseTask.DefaultImpls.getServiceProvider(this);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final java.lang.String getTaskStatus() {
        return this.taskStatus;
    }

    public final void setTaskStatus(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.taskStatus = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: invoke-gIAlu-s$suspendImpl, reason: not valid java name */
    static /* synthetic */ java.lang.Object m1236invokegIAlus$suspendImpl(com.unity3d.services.core.domain.task.MetricTask<? super P, R> metricTask, P p, kotlin.coroutines.Continuation<? super kotlin.Result<? extends R>> continuation) {
        com.unity3d.services.core.domain.task.MetricTask$invoke$1 metricTask$invoke$1;
        long jNanoTime;
        com.unity3d.services.core.domain.task.MetricTask<? super P, R> metricTask2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.util.concurrent.TimeUnit timeUnit;
        T value;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        if (continuation instanceof com.unity3d.services.core.domain.task.MetricTask$invoke$1) {
            metricTask$invoke$1 = (com.unity3d.services.core.domain.task.MetricTask$invoke$1) continuation;
            if ((metricTask$invoke$1.label & Integer.MIN_VALUE) != 0) {
                metricTask$invoke$1.label -= Integer.MIN_VALUE;
            } else {
                metricTask$invoke$1 = new com.unity3d.services.core.domain.task.MetricTask$invoke$1(metricTask, continuation);
            }
        } else {
            metricTask$invoke$1 = new com.unity3d.services.core.domain.task.MetricTask$invoke$1(metricTask, continuation);
        }
        java.lang.Object obj = metricTask$invoke$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = metricTask$invoke$1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
            java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.NANOSECONDS;
            jNanoTime = java.lang.System.nanoTime();
            metricTask$invoke$1.L$0 = metricTask;
            metricTask$invoke$1.L$1 = objectRef3;
            metricTask$invoke$1.L$2 = objectRef3;
            metricTask$invoke$1.L$3 = metricTask;
            metricTask$invoke$1.L$4 = timeUnit2;
            metricTask$invoke$1.J$0 = jNanoTime;
            metricTask$invoke$1.label = 1;
            java.lang.Object objM1220invokegIAlus = com.unity3d.services.core.domain.task.BaseTask.DefaultImpls.m1220invokegIAlus(metricTask, p, metricTask$invoke$1);
            if (objM1220invokegIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
            metricTask2 = metricTask;
            objectRef = objectRef3;
            timeUnit = timeUnit2;
            value = objM1220invokegIAlus;
            objectRef2 = objectRef;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = metricTask$invoke$1.J$0;
            timeUnit = (java.util.concurrent.TimeUnit) metricTask$invoke$1.L$4;
            com.unity3d.services.core.domain.task.MetricTask<? super P, R> metricTask3 = (com.unity3d.services.core.domain.task.MetricTask) metricTask$invoke$1.L$3;
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) metricTask$invoke$1.L$2;
            kotlin.jvm.internal.Ref.ObjectRef objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) metricTask$invoke$1.L$1;
            metricTask2 = (com.unity3d.services.core.domain.task.MetricTask) metricTask$invoke$1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            metricTask = metricTask3;
            objectRef2 = objectRef4;
            jNanoTime = j;
            value = ((kotlin.Result) obj).getValue();
        }
        objectRef.element = value;
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        ((com.unity3d.services.core.domain.task.MetricTask) metricTask).duration = timeUnit.toMillis(java.lang.System.nanoTime() - jNanoTime);
        metricTask2.captureMetric(objectRef2.element);
        return objectRef2.element;
    }

    private final void captureMetric(java.lang.Object result) {
        this.taskStatus = kotlin.Result.m1308isSuccessimpl(result) ? "success" : "failure";
        sendMetric();
    }

    private final void sendMetric() {
        java.lang.String metricName = getMetricName();
        if (metricName == null || metricName.length() == 0) {
            return;
        }
        getSDKMetrics().sendMetric(getMetric());
    }

    private final com.unity3d.services.core.request.metrics.Metric getMetric() {
        return new com.unity3d.services.core.request.metrics.Metric(getMetricName(), java.lang.Long.valueOf(this.duration), getMetricTagsForState());
    }

    private final java.util.Map<java.lang.String, java.lang.String> getMetricTagsForState() {
        java.util.Map<java.lang.String, java.lang.String> retryTags = com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().getRetryTags();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(retryTags, "getInstance().retryTags");
        return retryTags;
    }

    private final com.unity3d.services.core.request.metrics.SDKMetricsSender getSDKMetrics() {
        return (com.unity3d.services.core.request.metrics.SDKMetricsSender) getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.request.metrics.SDKMetricsSender.class));
    }

    public final java.lang.String getMetricNameForTask(java.lang.Object task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        java.lang.String className = task.getClass().getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "className");
        if (className.length() == 0) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "className");
        java.lang.String strSubstring = className.substring(getStatePrefixLength());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        java.lang.String lowerCase = strSubstring.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return new java.lang.StringBuilder(7 + lowerCase.length() + 6).append("native_").append(lowerCase).append("_state").toString();
    }

    public final java.lang.String getMetricNameForInitializeTask(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return "native_" + name + "_task_" + this.taskStatus + "_time";
    }
}
