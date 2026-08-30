package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class InitializeEventsMetricSender implements com.unity3d.services.core.configuration.IInitializeEventsMetricSender, com.unity3d.services.core.configuration.IInitializationListener {
    private static com.unity3d.services.core.configuration.InitializeEventsMetricSender _instance;
    private long _startTime = 0;
    private long _privacyConfigStartTime = 0;
    private long _privacyConfigEndTime = 0;
    private long _configStartTime = 0;
    private long _configEndTime = 0;
    private int _configRetryCount = 0;
    private int _webviewRetryCount = 0;
    private boolean _initMetricSent = false;
    private boolean _tokenMetricSent = false;
    private final com.unity3d.services.core.request.metrics.SDKMetricsSender _sdkMetricsSender = (com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class);

    public static com.unity3d.services.core.configuration.IInitializeEventsMetricSender getInstance() {
        if (_instance == null) {
            _instance = new com.unity3d.services.core.configuration.InitializeEventsMetricSender();
        }
        return _instance;
    }

    private InitializeEventsMetricSender() {
        com.unity3d.services.core.configuration.InitializationNotificationCenter.getInstance().addListener(this);
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didInitStart() {
        this._startTime = java.lang.System.nanoTime();
        this._configRetryCount = 0;
        this._webviewRetryCount = 0;
        sendMetric(com.unity3d.services.core.request.metrics.TSIMetric.newInitStarted());
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didConfigRequestStart() {
        this._configStartTime = java.lang.System.nanoTime();
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didConfigRequestEnd(boolean z) {
        this._configEndTime = java.lang.System.nanoTime();
        sendConfigResolutionRequestIfNeeded(z);
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didPrivacyConfigRequestStart() {
        this._privacyConfigStartTime = java.lang.System.nanoTime();
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didPrivacyConfigRequestEnd(boolean z) {
        this._privacyConfigEndTime = java.lang.System.nanoTime();
        sendPrivacyResolutionRequestIfNeeded(z);
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public synchronized void sdkDidInitialize() {
        if (initializationStartTimeStamp().longValue() == 0) {
            com.unity3d.services.core.log.DeviceLog.debug("sdkDidInitialize called before didInitStart, skipping metric");
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public java.lang.Long initializationStartTimeStamp() {
        return java.lang.Long.valueOf(this._startTime);
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public synchronized void sdkInitializeFailed(java.lang.String str, com.unity3d.services.core.configuration.ErrorState errorState) {
        if (this._startTime == 0) {
            com.unity3d.services.core.log.DeviceLog.debug("sdkInitializeFailed called before didInitStart, skipping metric");
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public synchronized void sdkTokenDidBecomeAvailableWithConfig(boolean z) {
        if (!this._tokenMetricSent) {
            sendTokenAvailabilityMetricWithConfig(z);
            if (z) {
                sendTokenResolutionRequestMetricIfNeeded();
            }
            this._tokenMetricSent = true;
        }
    }

    private void sendTokenAvailabilityMetricWithConfig(boolean z) {
        com.unity3d.services.core.request.metrics.Metric metricNewTokenAvailabilityLatencyWebview;
        if (this._startTime == 0) {
            com.unity3d.services.core.log.DeviceLog.debug("sendTokenAvailabilityMetricWithConfig called before didInitStart, skipping metric");
            return;
        }
        java.lang.Long lValueOf = java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - this._startTime));
        java.util.Map<java.lang.String, java.lang.String> retryTags = getRetryTags();
        if (z) {
            metricNewTokenAvailabilityLatencyWebview = com.unity3d.services.core.request.metrics.TSIMetric.newTokenAvailabilityLatencyConfig(lValueOf, retryTags);
        } else {
            metricNewTokenAvailabilityLatencyWebview = com.unity3d.services.core.request.metrics.TSIMetric.newTokenAvailabilityLatencyWebview(lValueOf, retryTags);
        }
        sendMetric(metricNewTokenAvailabilityLatencyWebview);
    }

    private void sendTokenResolutionRequestMetricIfNeeded() {
        if (this._configStartTime == 0) {
            com.unity3d.services.core.log.DeviceLog.debug("sendTokenResolutionRequestMetricIfNeeded called before didInitStart, skipping metric");
        } else {
            sendMetric(com.unity3d.services.core.request.metrics.TSIMetric.newTokenResolutionRequestLatency(tokenDuration(), getRetryTags()));
        }
    }

    private void sendPrivacyResolutionRequestIfNeeded(boolean z) {
        if (this._privacyConfigStartTime == 0 || this._privacyConfigEndTime == 0) {
            com.unity3d.services.core.log.DeviceLog.debug("sendPrivacyResolutionRequestIfNeeded called with invalid timestamps, skipping metric");
        } else {
            sendMetric(getPrivacyRequestMetric(z));
        }
    }

    private com.unity3d.services.core.request.metrics.Metric getPrivacyRequestMetric(boolean z) {
        if (z) {
            return com.unity3d.services.core.request.metrics.TSIMetric.newPrivacyRequestLatencySuccess(privacyConfigDuration());
        }
        return com.unity3d.services.core.request.metrics.TSIMetric.newPrivacyRequestLatencyFailure(privacyConfigDuration());
    }

    private void sendConfigResolutionRequestIfNeeded(boolean z) {
        if (this._configStartTime == 0 || this._configEndTime == 0) {
            com.unity3d.services.core.log.DeviceLog.debug("sendConfigResolutionRequestIfNeeded called with invalid timestamps, skipping metric");
        } else if (z) {
            sendMetric(com.unity3d.services.core.request.metrics.TSIMetric.newConfigRequestLatencySuccess(configRequestDuration()));
        } else {
            sendMetric(com.unity3d.services.core.request.metrics.TSIMetric.newConfigRequestLatencyFailure(configRequestDuration()));
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void onRetryConfig() {
        this._configRetryCount++;
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void onRetryWebview() {
        this._webviewRetryCount++;
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public java.lang.Long duration() {
        return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - this._startTime));
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public java.lang.Long tokenDuration() {
        return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - this._configStartTime));
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public java.lang.Long privacyConfigDuration() {
        return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this._privacyConfigEndTime - this._privacyConfigStartTime));
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public java.lang.Long configRequestDuration() {
        return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this._configEndTime - this._configStartTime));
    }

    public java.util.Map<java.lang.String, java.lang.String> getErrorStateTags(com.unity3d.services.core.configuration.ErrorState errorState) {
        java.util.Map<java.lang.String, java.lang.String> retryTags = getRetryTags();
        retryTags.put("stt", errorState.getMetricName());
        return retryTags;
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public java.util.Map<java.lang.String, java.lang.String> getRetryTags() {
        return new java.util.HashMap<java.lang.String, java.lang.String>() { // from class: com.unity3d.services.core.configuration.InitializeEventsMetricSender.1
            {
                put("c_retry", java.lang.String.valueOf(com.unity3d.services.core.configuration.InitializeEventsMetricSender.this._configRetryCount));
                put("wv_retry", java.lang.String.valueOf(com.unity3d.services.core.configuration.InitializeEventsMetricSender.this._webviewRetryCount));
            }
        };
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void sendMetric(com.unity3d.services.core.request.metrics.Metric metric) {
        this._sdkMetricsSender.sendMetric(metric);
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public void onSdkInitialized() {
        sdkDidInitialize();
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public void onSdkInitializationFailed(java.lang.String str, com.unity3d.services.core.configuration.ErrorState errorState, int i) {
        sdkInitializeFailed(str, errorState);
    }
}
