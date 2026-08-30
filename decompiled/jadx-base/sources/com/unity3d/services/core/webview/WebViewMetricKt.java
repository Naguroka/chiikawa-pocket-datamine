package com.unity3d.services.core.webview;

/* JADX INFO: compiled from: WebViewMetric.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"webMessageListenerDisabledMetric", "Lcom/unity3d/services/core/request/metrics/Metric;", "webMessageListenerEnabledMetric", "webMessageListenerSupportedMetric", "webMessageListenerUnsupportedMetric", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WebViewMetricKt {
    public static final com.unity3d.services.core.request.metrics.Metric webMessageListenerSupportedMetric() {
        return new com.unity3d.services.core.request.metrics.Metric("web_message_listener_supported", null, null, 6, null);
    }

    public static final com.unity3d.services.core.request.metrics.Metric webMessageListenerUnsupportedMetric() {
        return new com.unity3d.services.core.request.metrics.Metric("web_message_listener_unsupported", null, null, 6, null);
    }

    public static final com.unity3d.services.core.request.metrics.Metric webMessageListenerDisabledMetric() {
        return new com.unity3d.services.core.request.metrics.Metric("web_message_listener_disabled", null, null, 6, null);
    }

    public static final com.unity3d.services.core.request.metrics.Metric webMessageListenerEnabledMetric() {
        return new com.unity3d.services.core.request.metrics.Metric("web_message_listener_enabled", null, null, 6, null);
    }
}
