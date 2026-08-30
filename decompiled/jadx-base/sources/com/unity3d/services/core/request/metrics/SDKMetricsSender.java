package com.unity3d.services.core.request.metrics;

/* JADX INFO: compiled from: SDKMetricsSender.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0016J2\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bH&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u0010\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "", "metricEndPoint", "", "getMetricEndPoint", "()Ljava/lang/String;", "sendEvent", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "value", "tags", "", "sendMetric", "metric", "Lcom/unity3d/services/core/request/metrics/Metric;", "sendMetricWithInitState", "sendMetrics", "metrics", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SDKMetricsSender {
    java.lang.String getMetricEndPoint();

    void sendEvent(java.lang.String event);

    void sendEvent(java.lang.String event, java.lang.String value, java.util.Map<java.lang.String, java.lang.String> tags);

    void sendMetric(com.unity3d.services.core.request.metrics.Metric metric);

    void sendMetricWithInitState(com.unity3d.services.core.request.metrics.Metric metric);

    void sendMetrics(java.util.List<com.unity3d.services.core.request.metrics.Metric> metrics);

    /* JADX INFO: compiled from: SDKMetricsSender.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void sendEvent(com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender, java.lang.String event) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
            sendEvent$default(sDKMetricsSender, event, null, null, 4, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void sendEvent$default(com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            sDKMetricsSender.sendEvent(str, str2, map);
        }
    }
}
