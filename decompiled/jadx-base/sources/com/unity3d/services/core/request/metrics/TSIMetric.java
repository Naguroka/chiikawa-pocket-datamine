package com.unity3d.services.core.request.metrics;

/* JADX INFO: loaded from: classes6.dex */
public class TSIMetric {
    private static final java.lang.String TSI_METRIC_COLLECTION_LATENCY = "native_device_info_collection_latency";
    private static final java.lang.String TSI_METRIC_COMPRESSION_LATENCY = "native_device_info_compression_latency";
    private static final java.lang.String TSI_METRIC_CONFIG_REQUEST_FAILURE = "native_config_request_failure_time";
    private static final java.lang.String TSI_METRIC_CONFIG_REQUEST_SUCCESS = "native_config_request_success_time";
    private static final java.lang.String TSI_METRIC_EMERGENCY_OFF = "native_emergency_switch_off";
    private static final java.lang.String TSI_METRIC_INIT_STARTED = "native_initialization_started";
    private static final java.lang.String TSI_METRIC_MISSING_GAME_SESSION_ID = "native_missing_game_session_id";
    private static final java.lang.String TSI_METRIC_MISSING_STATE_ID = "native_missing_state_id";
    private static final java.lang.String TSI_METRIC_MISSING_TOKEN = "native_missing_token";
    private static final java.lang.String TSI_METRIC_PRIVACY_REQUEST_FAILURE = "native_privacy_request_failure_time";
    private static final java.lang.String TSI_METRIC_PRIVACY_REQUEST_SUCCESS = "native_privacy_request_success_time";
    private static final java.lang.String TSI_METRIC_PRIVACY_RESOLUTION_FAILURE = "native_privacy_resolution_request_latency_failure";
    private static final java.lang.String TSI_METRIC_PRIVACY_RESOLUTION_SUCCESS = "native_privacy_resolution_request_latency_success";
    private static final java.lang.String TSI_METRIC_TOKEN_ASYNC_AVAILABLE = "native_async_token_available";
    private static final java.lang.String TSI_METRIC_TOKEN_ASYNC_NULL = "native_async_token_null";
    private static final java.lang.String TSI_METRIC_TOKEN_AVAILABLE = "native_generated_token_available";
    private static final java.lang.String TSI_METRIC_TOKEN_CONFIG = "native_token_availability_latency_config";
    private static final java.lang.String TSI_METRIC_TOKEN_NULL = "native_generated_token_null";
    private static final java.lang.String TSI_METRIC_TOKEN_RESOLUTION = "native_token_resolution_request_latency";
    private static final java.lang.String TSI_METRIC_TOKEN_WEBVIEW = "native_token_availability_latency_webview";

    public static com.unity3d.services.core.request.metrics.Metric newMissingToken() {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_MISSING_TOKEN, null);
    }

    public static com.unity3d.services.core.request.metrics.Metric newMissingStateId() {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_MISSING_STATE_ID, null);
    }

    public static com.unity3d.services.core.request.metrics.Metric newMissingGameSessionId() {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_MISSING_GAME_SESSION_ID, null);
    }

    public static com.unity3d.services.core.request.metrics.Metric newInitStarted() {
        return new com.unity3d.services.core.request.metrics.Metric("native_initialization_started", null);
    }

    public static com.unity3d.services.core.request.metrics.Metric newTokenAvailabilityLatencyConfig(java.lang.Long l, java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_TOKEN_CONFIG, l, map);
    }

    public static com.unity3d.services.core.request.metrics.Metric newTokenAvailabilityLatencyWebview(java.lang.Long l, java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_TOKEN_WEBVIEW, l, map);
    }

    public static com.unity3d.services.core.request.metrics.Metric newTokenResolutionRequestLatency(java.lang.Long l, java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_TOKEN_RESOLUTION, l, map);
    }

    public static com.unity3d.services.core.request.metrics.Metric newPrivacyResolutionRequestLatencySuccess(java.lang.Long l) {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_PRIVACY_RESOLUTION_SUCCESS, l);
    }

    public static com.unity3d.services.core.request.metrics.Metric newPrivacyResolutionRequestLatencyFailure(java.lang.Long l) {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_PRIVACY_RESOLUTION_FAILURE, l);
    }

    public static com.unity3d.services.core.request.metrics.Metric newPrivacyRequestLatencySuccess(java.lang.Long l) {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_PRIVACY_REQUEST_SUCCESS, l);
    }

    public static com.unity3d.services.core.request.metrics.Metric newPrivacyRequestLatencyFailure(java.lang.Long l) {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_PRIVACY_REQUEST_FAILURE, l);
    }

    public static com.unity3d.services.core.request.metrics.Metric newConfigRequestLatencySuccess(java.lang.Long l) {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_CONFIG_REQUEST_SUCCESS, l);
    }

    public static com.unity3d.services.core.request.metrics.Metric newConfigRequestLatencyFailure(java.lang.Long l) {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_CONFIG_REQUEST_FAILURE, l);
    }

    public static com.unity3d.services.core.request.metrics.Metric newEmergencySwitchOff() {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_EMERGENCY_OFF, null);
    }

    public static com.unity3d.services.core.request.metrics.Metric newDeviceInfoCollectionLatency(java.lang.Long l) {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_COLLECTION_LATENCY, l);
    }

    public static com.unity3d.services.core.request.metrics.Metric newDeviceInfoCompressionLatency(java.lang.Long l) {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_COMPRESSION_LATENCY, l);
    }

    public static com.unity3d.services.core.request.metrics.Metric newNativeGeneratedTokenAvailable(java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_TOKEN_AVAILABLE, null, map);
    }

    public static com.unity3d.services.core.request.metrics.Metric newNativeGeneratedTokenNull(java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_TOKEN_NULL, null, map);
    }

    public static com.unity3d.services.core.request.metrics.Metric newAsyncTokenNull(java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_TOKEN_ASYNC_NULL, null, map);
    }

    public static com.unity3d.services.core.request.metrics.Metric newAsyncTokenAvailable(java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.unity3d.services.core.request.metrics.Metric(TSI_METRIC_TOKEN_ASYNC_AVAILABLE, null, map);
    }
}
