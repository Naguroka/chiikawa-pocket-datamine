package com.unity3d.services.core.request.metrics;

/* JADX INFO: compiled from: MetricSender.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J.\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0016\u0010 \u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\"H\u0016J\u0006\u0010#\u001a\u00020\u0018R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0016*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/unity3d/services/core/request/metrics/MetricSender;", "Lcom/unity3d/services/core/request/metrics/MetricSenderBase;", "Lcom/unity3d/services/core/di/IServiceComponent;", "configuration", "Lcom/unity3d/services/core/configuration/Configuration;", "initializationStatusReader", "Lcom/unity3d/services/core/properties/InitializationStatusReader;", "(Lcom/unity3d/services/core/configuration/Configuration;Lcom/unity3d/services/core/properties/InitializationStatusReader;)V", "commonTags", "Lcom/unity3d/services/core/request/metrics/MetricCommonTags;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "httpClient", "Lcom/unity3d/services/core/network/core/HttpClient;", "metricEndPoint", "", "getMetricEndPoint", "()Ljava/lang/String;", "metricSampleRate", "scope", "Lkotlinx/coroutines/CoroutineScope;", "sessionToken", "kotlin.jvm.PlatformType", "sendEvent", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "value", "tags", "", "sendMetric", "metric", "Lcom/unity3d/services/core/request/metrics/Metric;", "sendMetrics", "metrics", "", "shutdown", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class MetricSender extends com.unity3d.services.core.request.metrics.MetricSenderBase implements com.unity3d.services.core.di.IServiceComponent {
    private final com.unity3d.services.core.request.metrics.MetricCommonTags commonTags;
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;
    private final com.unity3d.services.core.network.core.HttpClient httpClient;
    private final java.lang.String metricEndPoint;
    private final java.lang.String metricSampleRate;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final java.lang.String sessionToken;

    @Override // com.unity3d.services.core.di.IServiceComponent
    public com.unity3d.services.core.di.IServiceProvider getServiceProvider() {
        return com.unity3d.services.core.di.IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender(com.unity3d.services.core.configuration.Configuration configuration, com.unity3d.services.core.properties.InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationStatusReader, "initializationStatusReader");
        com.unity3d.services.core.request.metrics.MetricCommonTags metricCommonTags = new com.unity3d.services.core.request.metrics.MetricCommonTags();
        metricCommonTags.updateWithConfig(configuration);
        this.commonTags = metricCommonTags;
        this.metricSampleRate = java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(configuration.getMetricSampleRate()));
        this.sessionToken = configuration.getSessionToken();
        com.unity3d.services.core.request.metrics.MetricSender metricSender = this;
        com.unity3d.services.core.domain.ISDKDispatchers iSDKDispatchers = (com.unity3d.services.core.domain.ISDKDispatchers) metricSender.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class));
        this.dispatchers = iSDKDispatchers;
        this.httpClient = (com.unity3d.services.core.network.core.HttpClient) metricSender.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.network.core.HttpClient.class));
        this.scope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(iSDKDispatchers.getIo());
        this.metricEndPoint = configuration.getMetricsUrl();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public java.lang.String getMetricEndPoint() {
        return this.metricEndPoint;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(java.lang.String event, java.lang.String value, java.util.Map<java.lang.String, java.lang.String> tags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "tags");
        if (event.length() == 0) {
            com.unity3d.services.core.log.DeviceLog.debug("Metric event not sent due to being null or empty: " + event);
        } else {
            sendMetrics(kotlin.collections.CollectionsKt.listOf(new com.unity3d.services.core.request.metrics.Metric(event, value, tags)));
        }
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(com.unity3d.services.core.request.metrics.Metric metric) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metric, "metric");
        sendMetrics(kotlin.collections.CollectionsKt.listOf(metric));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetrics(java.util.List<com.unity3d.services.core.request.metrics.Metric> metrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metrics, "metrics");
        if (metrics.isEmpty()) {
            com.unity3d.services.core.log.DeviceLog.debug("Metrics event not send due to being empty");
            return;
        }
        java.lang.String metricEndPoint = getMetricEndPoint();
        if (!(metricEndPoint == null || kotlin.text.StringsKt.isBlank(metricEndPoint))) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, new com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE, metrics), null, new com.unity3d.services.core.request.metrics.MetricSender.AnonymousClass1(metrics, null), 2, null);
        } else {
            com.unity3d.services.core.log.DeviceLog.debug("Metrics: " + metrics + " was not sent to null or empty endpoint: " + getMetricEndPoint());
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1, reason: invalid class name */
    /* JADX INFO: compiled from: MetricSender.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1", f = "MetricSender.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.util.List<com.unity3d.services.core.request.metrics.Metric> $metrics;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(java.util.List<com.unity3d.services.core.request.metrics.Metric> list, kotlin.coroutines.Continuation<? super com.unity3d.services.core.request.metrics.MetricSender.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$metrics = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.services.core.request.metrics.MetricSender.this.new AnonymousClass1(this.$metrics, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.services.core.request.metrics.MetricSender.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object objExecute;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String string = new org.json.JSONObject(new com.unity3d.services.core.request.metrics.MetricsContainer(com.unity3d.services.core.request.metrics.MetricSender.this.metricSampleRate, com.unity3d.services.core.request.metrics.MetricSender.this.commonTags, this.$metrics, com.unity3d.services.core.request.metrics.MetricSender.this.sessionToken).toMap()).toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "JSONObject(container.toMap()).toString()");
                java.lang.String metricEndPoint = com.unity3d.services.core.request.metrics.MetricSender.this.getMetricEndPoint();
                if (metricEndPoint == null) {
                    metricEndPoint = "";
                }
                com.unity3d.services.core.network.model.HttpRequest httpRequest = new com.unity3d.services.core.network.model.HttpRequest(metricEndPoint, null, com.unity3d.services.core.network.model.RequestType.POST, string, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131058, null);
                this.label = 1;
                objExecute = com.unity3d.services.core.request.metrics.MetricSender.this.httpClient.execute(httpRequest, this);
                if (objExecute == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                objExecute = obj;
            }
            com.unity3d.services.core.network.model.HttpResponse httpResponse = (com.unity3d.services.core.network.model.HttpResponse) objExecute;
            if (httpResponse.getStatusCode() / 100 == 2) {
                com.unity3d.services.core.log.DeviceLog.debug("Metric " + this.$metrics + " sent to " + com.unity3d.services.core.request.metrics.MetricSender.this.getMetricEndPoint());
            } else {
                com.unity3d.services.core.log.DeviceLog.debug("Metric " + this.$metrics + " failed to send with response code: " + httpResponse.getStatusCode());
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public final void shutdown() {
        this.commonTags.shutdown();
    }
}
