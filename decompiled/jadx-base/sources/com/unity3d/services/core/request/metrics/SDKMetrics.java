package com.unity3d.services.core.request.metrics;

/* JADX INFO: loaded from: classes6.dex */
public final class SDKMetrics {
    private static final java.lang.String NULL_INSTANCE_METRICS_URL = "nullInstanceMetricsUrl";
    private static com.unity3d.services.core.request.metrics.MetricSenderWithBatch _batchedSender;
    private static final java.util.concurrent.atomic.AtomicBoolean _configurationIsSet = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static com.unity3d.services.core.request.metrics.SDKMetricsSender _instance;

    public static void setConfiguration(com.unity3d.services.core.configuration.Configuration configuration) {
        if (configuration == null) {
            com.unity3d.services.core.log.DeviceLog.debug("Metrics will not be sent from the device for this session due to misconfiguration");
            return;
        }
        if (isAllowedToSetConfiguration(configuration)) {
            com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender = _instance;
            if (sDKMetricsSender instanceof com.unity3d.services.core.request.metrics.MetricSender) {
                ((com.unity3d.services.core.request.metrics.MetricSender) sDKMetricsSender).shutdown();
            }
            if (configuration.areMetricsEnabledForCurrentSession().booleanValue()) {
                _instance = new com.unity3d.services.core.request.metrics.MetricSender(configuration, new com.unity3d.services.core.properties.InitializationStatusReader());
            } else {
                com.unity3d.services.core.log.DeviceLog.debug("Metrics will not be sent from the device for this session");
                _instance = new com.unity3d.services.core.request.metrics.SDKMetrics.NullInstance(NULL_INSTANCE_METRICS_URL);
            }
            com.unity3d.services.core.request.metrics.MetricSenderWithBatch metricSenderWithBatch = _batchedSender;
            if (metricSenderWithBatch == null) {
                _batchedSender = new com.unity3d.services.core.request.metrics.MetricSenderWithBatch(_instance, new com.unity3d.services.core.properties.InitializationStatusReader());
            } else {
                metricSenderWithBatch.updateOriginal(_instance);
            }
            _batchedSender.sendQueueIfNeeded();
        }
    }

    public static synchronized com.unity3d.services.core.request.metrics.SDKMetricsSender getInstance() {
        if (_instance == null) {
            _instance = new com.unity3d.services.core.request.metrics.SDKMetrics.NullInstance(null);
        }
        if (_batchedSender == null) {
            _batchedSender = new com.unity3d.services.core.request.metrics.MetricSenderWithBatch(_instance, new com.unity3d.services.core.properties.InitializationStatusReader());
        }
        return _batchedSender;
    }

    private static boolean isAllowedToSetConfiguration(com.unity3d.services.core.configuration.Configuration configuration) {
        return !android.text.TextUtils.isEmpty(configuration.getMetricsUrl()) && _configurationIsSet.compareAndSet(false, true);
    }

    private static final class NullInstance implements com.unity3d.services.core.request.metrics.SDKMetricsSender {
        private final java.lang.String _metricEndpoint;

        public NullInstance(java.lang.String str) {
            this._metricEndpoint = str;
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendEvent(java.lang.String str) {
            com.unity3d.services.core.log.DeviceLog.debug("Metric " + str + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendEvent(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
            sendEvent(str);
        }

        public void sendEvent(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
            sendEvent(str);
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendMetric(com.unity3d.services.core.request.metrics.Metric metric) {
            com.unity3d.services.core.log.DeviceLog.debug("Metric " + metric + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendMetrics(java.util.List<com.unity3d.services.core.request.metrics.Metric> list) {
            com.unity3d.services.core.log.DeviceLog.debug("Metrics: " + list + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendMetricWithInitState(com.unity3d.services.core.request.metrics.Metric metric) {
            sendMetric(metric);
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public java.lang.String getMetricEndPoint() {
            return this._metricEndpoint;
        }
    }
}
