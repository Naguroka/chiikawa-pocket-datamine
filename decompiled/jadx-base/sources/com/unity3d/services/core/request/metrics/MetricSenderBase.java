package com.unity3d.services.core.request.metrics;

/* JADX INFO: compiled from: MetricSenderBase.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/services/core/request/metrics/MetricSenderBase;", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "_initStatusReader", "Lcom/unity3d/services/core/properties/InitializationStatusReader;", "(Lcom/unity3d/services/core/properties/InitializationStatusReader;)V", "sendMetricWithInitState", "", "metric", "Lcom/unity3d/services/core/request/metrics/Metric;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class MetricSenderBase implements com.unity3d.services.core.request.metrics.SDKMetricsSender {
    private final com.unity3d.services.core.properties.InitializationStatusReader _initStatusReader;

    public MetricSenderBase(com.unity3d.services.core.properties.InitializationStatusReader _initStatusReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(_initStatusReader, "_initStatusReader");
        this._initStatusReader = _initStatusReader;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(java.lang.String str) {
        com.unity3d.services.core.request.metrics.SDKMetricsSender.DefaultImpls.sendEvent(this, str);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetricWithInitState(com.unity3d.services.core.request.metrics.Metric metric) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metric, "metric");
        sendMetric(com.unity3d.services.core.request.metrics.Metric.copy$default(metric, null, null, kotlin.collections.MapsKt.plus(metric.getTags(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", this._initStatusReader.getInitializationStateString(com.unity3d.services.core.properties.SdkProperties.getCurrentInitializationState())))), 3, null));
    }
}
