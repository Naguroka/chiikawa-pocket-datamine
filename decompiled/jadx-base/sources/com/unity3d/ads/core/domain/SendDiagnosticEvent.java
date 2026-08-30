package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: SendDiagnosticEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ^\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH¦\u0002¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "", "invoke", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "value", "", "tags", "", "intTags", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;)V", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SendDiagnosticEvent {
    public static final java.lang.String APP_ACTIVE = "app_active";
    public static final java.lang.String ATTEMPT_INSERT_NULL_DIAGNOSTIC_EVENT = "attempt_insert_null_diagnostic_event";
    public static final java.lang.String AWAITED_INIT = "awaited_init";
    public static final java.lang.String BILLING_SERVICE_UNAVAILABLE = "billing_service_unavailable";
    public static final java.lang.String BRIDGE_SEND_EVENT_FAILED = "bridge_send_event_failed";
    public static final java.lang.String CACHE_SOURCE = "cache_source";
    public static final java.lang.String COMPLETE_STATE = "complete_state";
    public static final java.lang.String COROUTINE_NAME = "coroutine_name";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion INSTANCE = com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.$$INSTANCE;
    public static final java.lang.String HB_FAILURE = "native_gateway_token_failure_time";
    public static final java.lang.String HB_STARTED = "native_gateway_token_started";
    public static final java.lang.String HB_SUCCESS = "native_gateway_token_success_time";
    public static final java.lang.String INIT_CLEAR_CACHE = "native_initialize_clear_cache_time";
    public static final java.lang.String INIT_COMPLETED_FAILURE = "native_initialize_completed_task_failure_time";
    public static final java.lang.String INIT_COMPLETED_STARTED = "native_initialization_completed_started";
    public static final java.lang.String INIT_COMPLETED_SUCCESS = "native_initialize_completed_task_success_time";
    public static final java.lang.String INIT_FAILURE = "native_initialize_task_failure_time";
    public static final java.lang.String INIT_MISSED_NATIVE_PARSING = "native_initialize_missed_native_parsing";
    public static final java.lang.String INIT_STARTED = "native_initialization_started";
    public static final java.lang.String INIT_SUCCESS = "native_initialize_task_success_time";
    public static final java.lang.String LOAD_CACHE_FAILURE = "native_load_cache_failure_time";
    public static final java.lang.String LOAD_CACHE_SUCCESS = "native_load_cache_success_time";
    public static final java.lang.String LOAD_FAILURE = "native_load_failure_time";
    public static final java.lang.String LOAD_STARTED = "native_load_started";
    public static final java.lang.String LOAD_STARTED_AD_VIEWER = "native_load_started_ad_viewer";
    public static final java.lang.String LOAD_SUCCESS = "native_load_success_time";
    public static final java.lang.String NETWORK_CLIENT = "network_client";
    public static final java.lang.String NETWORK_FAILURE = "native_network_failure_time";
    public static final java.lang.String NETWORK_PARSE = "native_network_parse_failure";
    public static final java.lang.String NETWORK_SUCCESS = "native_network_success_time";
    public static final java.lang.String NULL_DIAGNOSTIC_EVENT = "null_diagnostic_event";
    public static final java.lang.String OM_ACTIVATE_FAILURE = "om_activate_failure_time";
    public static final java.lang.String OM_ACTIVATE_STARTED = "om_activate_started";
    public static final java.lang.String OM_ACTIVATE_SUCCESS = "om_activate_success_time";
    public static final java.lang.String OM_IMPRESSION_OCCURRED_FAILURE = "om_impression_occurred_failure";
    public static final java.lang.String OM_IMPRESSION_OCCURRED_SUCCESS = "om_impression_occurred_success";
    public static final java.lang.String OM_SESSION_FINISH_FAILURE = "om_session_finish_failure";
    public static final java.lang.String OM_SESSION_FINISH_SUCCESS = "om_session_finish_success";
    public static final java.lang.String OM_SESSION_START_FAILURE = "om_session_start_failure";
    public static final java.lang.String OM_SESSION_START_SUCCESS = "om_session_start_success";
    public static final java.lang.String OPERATION = "operation";
    public static final java.lang.String PROTOCOL = "protocol";
    public static final java.lang.String REASON = "reason";
    public static final java.lang.String REASON_AD_MARKUP_PARSE = "invalid_admarkup";
    public static final java.lang.String REASON_AD_OBJECT_NOT_FOUND = "ad_object_not_found";
    public static final java.lang.String REASON_AD_PLAYER_SCOPE = "ad_player_scope_not_active";
    public static final java.lang.String REASON_AD_VIEWER = "adviewer";
    public static final java.lang.String REASON_ALREADY_SHOWING = "already_showing";
    public static final java.lang.String REASON_CODE = "reason_code";
    public static final java.lang.String REASON_DEBUG = "reason_debug";
    public static final java.lang.String REASON_GATEWAY = "gateway";
    public static final java.lang.String REASON_INVALID_ENTRY_POINT = "invalid_url";
    public static final java.lang.String REASON_LISTENER_NULL = "listener_null";
    public static final java.lang.String REASON_NETWORK = "network";
    public static final java.lang.String REASON_NOT_INITIALIZED = "not_initialized";
    public static final java.lang.String REASON_NO_FILL = "no_fill";
    public static final java.lang.String REASON_NO_WEBVIEW_ENTRY_POINT = "no_webview_entry_point";
    public static final java.lang.String REASON_OM_ALREADY_ACTIVE = "om_already_active";
    public static final java.lang.String REASON_OM_CREATIVE_TYPE_INVALID = "om_creative_type_invalid";
    public static final java.lang.String REASON_OM_CREATIVE_TYPE_NULL = "om_creative_type_null";
    public static final java.lang.String REASON_OM_NOT_ACTIVE = "om_not_active";
    public static final java.lang.String REASON_OM_SESSION_ALREADY_EXISTS = "om_session_already_exists";
    public static final java.lang.String REASON_OM_SESSION_NOT_FOUND = "om_session_not_found";
    public static final java.lang.String REASON_OPPORTUNITY_ID = "no_opportunity_id";
    public static final java.lang.String REASON_OPPORTUNITY_USED = "opportunity_id_used";
    public static final java.lang.String REASON_PLACEMENT_NULL = "placement_null";
    public static final java.lang.String REASON_PLACEMENT_VALIDATION = "placement_validation";
    public static final java.lang.String REASON_PROTOBUF_PARSING = "protobuf_parsing";
    public static final java.lang.String REASON_TIMEOUT = "timeout";
    public static final java.lang.String REASON_UNCAUGHT_EXCEPTION = "uncaught_exception";
    public static final java.lang.String REASON_UNKNOWN = "unknown";
    public static final java.lang.String RETRIES = "retries";
    public static final java.lang.String SAME_SESSION = "same_session";
    public static final java.lang.String SHOW_CANCEL_TIMEOUT = "native_show_cancel_timeout";
    public static final java.lang.String SHOW_CLICKED = "native_show_clicked";
    public static final java.lang.String SHOW_FAILURE = "native_show_failure_time";
    public static final java.lang.String SHOW_HAS_STARTED = "show_has_started";
    public static final java.lang.String SHOW_IS_FILE_CACHED_FAILURE = "native_show_is_file_cached_failure_time";
    public static final java.lang.String SHOW_IS_FILE_CACHED_SUCCESS = "native_show_is_file_cached_success_time";
    public static final java.lang.String SHOW_LEFT_APPLICATION = "native_show_left_app";
    public static final java.lang.String SHOW_STARTED = "native_show_started";
    public static final java.lang.String SHOW_STARTED_AD_VIEWER = "native_show_started_ad_viewer";
    public static final java.lang.String SHOW_SUCCESS = "native_show_success_time";
    public static final java.lang.String SHOW_WV_STARTED = "native_show_wv_started";
    public static final java.lang.String SIZE_KB = "size_kb";
    public static final java.lang.String STATE = "state";
    public static final java.lang.String SYNC = "sync";
    public static final java.lang.String SYSTEM_CRONET_FAILURE = "native_cronet_failure_time";
    public static final java.lang.String SYSTEM_CRONET_SUCCESS = "native_cronet_success_time";
    public static final java.lang.String URL = "url";
    public static final java.lang.String WEBVIEW_ERROR = "webview_error";
    public static final java.lang.String WEBVIEW_ERROR_CODE = "webview_error_code";
    public static final java.lang.String WEBVIEW_URL = "webview_url";

    void invoke(java.lang.String event, java.lang.Double value, java.util.Map<java.lang.String, java.lang.String> tags, java.util.Map<java.lang.String, java.lang.Integer> intTags, com.unity3d.ads.core.data.model.AdObject adObject);

    /* JADX INFO: compiled from: SendDiagnosticEvent.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void invoke$default(com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, java.lang.String str, java.lang.Double d, java.util.Map map, java.util.Map map2, com.unity3d.ads.core.data.model.AdObject adObject, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            sendDiagnosticEvent.invoke(str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : map2, (i & 16) != 0 ? null : adObject);
        }
    }

    /* JADX INFO: compiled from: SendDiagnosticEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\\\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lcom/unity3d/ads/core/domain/SendDiagnosticEvent$Companion;", "", "()V", "APP_ACTIVE", "", "ATTEMPT_INSERT_NULL_DIAGNOSTIC_EVENT", "AWAITED_INIT", "BILLING_SERVICE_UNAVAILABLE", "BRIDGE_SEND_EVENT_FAILED", "CACHE_SOURCE", "COMPLETE_STATE", "COROUTINE_NAME", "HB_FAILURE", "HB_STARTED", "HB_SUCCESS", "INIT_CLEAR_CACHE", "INIT_COMPLETED_FAILURE", "INIT_COMPLETED_STARTED", "INIT_COMPLETED_SUCCESS", "INIT_FAILURE", "INIT_MISSED_NATIVE_PARSING", "INIT_STARTED", "INIT_SUCCESS", "LOAD_CACHE_FAILURE", "LOAD_CACHE_SUCCESS", "LOAD_FAILURE", "LOAD_STARTED", "LOAD_STARTED_AD_VIEWER", "LOAD_SUCCESS", "NETWORK_CLIENT", "NETWORK_FAILURE", "NETWORK_PARSE", "NETWORK_SUCCESS", "NULL_DIAGNOSTIC_EVENT", "OM_ACTIVATE_FAILURE", "OM_ACTIVATE_STARTED", "OM_ACTIVATE_SUCCESS", "OM_IMPRESSION_OCCURRED_FAILURE", "OM_IMPRESSION_OCCURRED_SUCCESS", "OM_SESSION_FINISH_FAILURE", "OM_SESSION_FINISH_SUCCESS", "OM_SESSION_START_FAILURE", "OM_SESSION_START_SUCCESS", "OPERATION", "PROTOCOL", "REASON", "REASON_AD_MARKUP_PARSE", "REASON_AD_OBJECT_NOT_FOUND", "REASON_AD_PLAYER_SCOPE", "REASON_AD_VIEWER", "REASON_ALREADY_SHOWING", "REASON_CODE", "REASON_DEBUG", "REASON_GATEWAY", "REASON_INVALID_ENTRY_POINT", "REASON_LISTENER_NULL", "REASON_NETWORK", "REASON_NOT_INITIALIZED", "REASON_NO_FILL", "REASON_NO_WEBVIEW_ENTRY_POINT", "REASON_OM_ALREADY_ACTIVE", "REASON_OM_CREATIVE_TYPE_INVALID", "REASON_OM_CREATIVE_TYPE_NULL", "REASON_OM_NOT_ACTIVE", "REASON_OM_SESSION_ALREADY_EXISTS", "REASON_OM_SESSION_NOT_FOUND", "REASON_OPPORTUNITY_ID", "REASON_OPPORTUNITY_USED", "REASON_PLACEMENT_NULL", "REASON_PLACEMENT_VALIDATION", "REASON_PROTOBUF_PARSING", "REASON_TIMEOUT", "REASON_UNCAUGHT_EXCEPTION", "REASON_UNKNOWN", "RETRIES", "SAME_SESSION", "SHOW_CANCEL_TIMEOUT", "SHOW_CLICKED", "SHOW_FAILURE", "SHOW_HAS_STARTED", "SHOW_IS_FILE_CACHED_FAILURE", "SHOW_IS_FILE_CACHED_SUCCESS", "SHOW_LEFT_APPLICATION", "SHOW_STARTED", "SHOW_STARTED_AD_VIEWER", "SHOW_SUCCESS", "SHOW_WV_STARTED", "SIZE_KB", "STATE", "SYNC", "SYSTEM_CRONET_FAILURE", "SYSTEM_CRONET_SUCCESS", "URL", "WEBVIEW_ERROR", "WEBVIEW_ERROR_CODE", "WEBVIEW_URL", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion $$INSTANCE = new com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion();
        public static final java.lang.String APP_ACTIVE = "app_active";
        public static final java.lang.String ATTEMPT_INSERT_NULL_DIAGNOSTIC_EVENT = "attempt_insert_null_diagnostic_event";
        public static final java.lang.String AWAITED_INIT = "awaited_init";
        public static final java.lang.String BILLING_SERVICE_UNAVAILABLE = "billing_service_unavailable";
        public static final java.lang.String BRIDGE_SEND_EVENT_FAILED = "bridge_send_event_failed";
        public static final java.lang.String CACHE_SOURCE = "cache_source";
        public static final java.lang.String COMPLETE_STATE = "complete_state";
        public static final java.lang.String COROUTINE_NAME = "coroutine_name";
        public static final java.lang.String HB_FAILURE = "native_gateway_token_failure_time";
        public static final java.lang.String HB_STARTED = "native_gateway_token_started";
        public static final java.lang.String HB_SUCCESS = "native_gateway_token_success_time";
        public static final java.lang.String INIT_CLEAR_CACHE = "native_initialize_clear_cache_time";
        public static final java.lang.String INIT_COMPLETED_FAILURE = "native_initialize_completed_task_failure_time";
        public static final java.lang.String INIT_COMPLETED_STARTED = "native_initialization_completed_started";
        public static final java.lang.String INIT_COMPLETED_SUCCESS = "native_initialize_completed_task_success_time";
        public static final java.lang.String INIT_FAILURE = "native_initialize_task_failure_time";
        public static final java.lang.String INIT_MISSED_NATIVE_PARSING = "native_initialize_missed_native_parsing";
        public static final java.lang.String INIT_STARTED = "native_initialization_started";
        public static final java.lang.String INIT_SUCCESS = "native_initialize_task_success_time";
        public static final java.lang.String LOAD_CACHE_FAILURE = "native_load_cache_failure_time";
        public static final java.lang.String LOAD_CACHE_SUCCESS = "native_load_cache_success_time";
        public static final java.lang.String LOAD_FAILURE = "native_load_failure_time";
        public static final java.lang.String LOAD_STARTED = "native_load_started";
        public static final java.lang.String LOAD_STARTED_AD_VIEWER = "native_load_started_ad_viewer";
        public static final java.lang.String LOAD_SUCCESS = "native_load_success_time";
        public static final java.lang.String NETWORK_CLIENT = "network_client";
        public static final java.lang.String NETWORK_FAILURE = "native_network_failure_time";
        public static final java.lang.String NETWORK_PARSE = "native_network_parse_failure";
        public static final java.lang.String NETWORK_SUCCESS = "native_network_success_time";
        public static final java.lang.String NULL_DIAGNOSTIC_EVENT = "null_diagnostic_event";
        public static final java.lang.String OM_ACTIVATE_FAILURE = "om_activate_failure_time";
        public static final java.lang.String OM_ACTIVATE_STARTED = "om_activate_started";
        public static final java.lang.String OM_ACTIVATE_SUCCESS = "om_activate_success_time";
        public static final java.lang.String OM_IMPRESSION_OCCURRED_FAILURE = "om_impression_occurred_failure";
        public static final java.lang.String OM_IMPRESSION_OCCURRED_SUCCESS = "om_impression_occurred_success";
        public static final java.lang.String OM_SESSION_FINISH_FAILURE = "om_session_finish_failure";
        public static final java.lang.String OM_SESSION_FINISH_SUCCESS = "om_session_finish_success";
        public static final java.lang.String OM_SESSION_START_FAILURE = "om_session_start_failure";
        public static final java.lang.String OM_SESSION_START_SUCCESS = "om_session_start_success";
        public static final java.lang.String OPERATION = "operation";
        public static final java.lang.String PROTOCOL = "protocol";
        public static final java.lang.String REASON = "reason";
        public static final java.lang.String REASON_AD_MARKUP_PARSE = "invalid_admarkup";
        public static final java.lang.String REASON_AD_OBJECT_NOT_FOUND = "ad_object_not_found";
        public static final java.lang.String REASON_AD_PLAYER_SCOPE = "ad_player_scope_not_active";
        public static final java.lang.String REASON_AD_VIEWER = "adviewer";
        public static final java.lang.String REASON_ALREADY_SHOWING = "already_showing";
        public static final java.lang.String REASON_CODE = "reason_code";
        public static final java.lang.String REASON_DEBUG = "reason_debug";
        public static final java.lang.String REASON_GATEWAY = "gateway";
        public static final java.lang.String REASON_INVALID_ENTRY_POINT = "invalid_url";
        public static final java.lang.String REASON_LISTENER_NULL = "listener_null";
        public static final java.lang.String REASON_NETWORK = "network";
        public static final java.lang.String REASON_NOT_INITIALIZED = "not_initialized";
        public static final java.lang.String REASON_NO_FILL = "no_fill";
        public static final java.lang.String REASON_NO_WEBVIEW_ENTRY_POINT = "no_webview_entry_point";
        public static final java.lang.String REASON_OM_ALREADY_ACTIVE = "om_already_active";
        public static final java.lang.String REASON_OM_CREATIVE_TYPE_INVALID = "om_creative_type_invalid";
        public static final java.lang.String REASON_OM_CREATIVE_TYPE_NULL = "om_creative_type_null";
        public static final java.lang.String REASON_OM_NOT_ACTIVE = "om_not_active";
        public static final java.lang.String REASON_OM_SESSION_ALREADY_EXISTS = "om_session_already_exists";
        public static final java.lang.String REASON_OM_SESSION_NOT_FOUND = "om_session_not_found";
        public static final java.lang.String REASON_OPPORTUNITY_ID = "no_opportunity_id";
        public static final java.lang.String REASON_OPPORTUNITY_USED = "opportunity_id_used";
        public static final java.lang.String REASON_PLACEMENT_NULL = "placement_null";
        public static final java.lang.String REASON_PLACEMENT_VALIDATION = "placement_validation";
        public static final java.lang.String REASON_PROTOBUF_PARSING = "protobuf_parsing";
        public static final java.lang.String REASON_TIMEOUT = "timeout";
        public static final java.lang.String REASON_UNCAUGHT_EXCEPTION = "uncaught_exception";
        public static final java.lang.String REASON_UNKNOWN = "unknown";
        public static final java.lang.String RETRIES = "retries";
        public static final java.lang.String SAME_SESSION = "same_session";
        public static final java.lang.String SHOW_CANCEL_TIMEOUT = "native_show_cancel_timeout";
        public static final java.lang.String SHOW_CLICKED = "native_show_clicked";
        public static final java.lang.String SHOW_FAILURE = "native_show_failure_time";
        public static final java.lang.String SHOW_HAS_STARTED = "show_has_started";
        public static final java.lang.String SHOW_IS_FILE_CACHED_FAILURE = "native_show_is_file_cached_failure_time";
        public static final java.lang.String SHOW_IS_FILE_CACHED_SUCCESS = "native_show_is_file_cached_success_time";
        public static final java.lang.String SHOW_LEFT_APPLICATION = "native_show_left_app";
        public static final java.lang.String SHOW_STARTED = "native_show_started";
        public static final java.lang.String SHOW_STARTED_AD_VIEWER = "native_show_started_ad_viewer";
        public static final java.lang.String SHOW_SUCCESS = "native_show_success_time";
        public static final java.lang.String SHOW_WV_STARTED = "native_show_wv_started";
        public static final java.lang.String SIZE_KB = "size_kb";
        public static final java.lang.String STATE = "state";
        public static final java.lang.String SYNC = "sync";
        public static final java.lang.String SYSTEM_CRONET_FAILURE = "native_cronet_failure_time";
        public static final java.lang.String SYSTEM_CRONET_SUCCESS = "native_cronet_success_time";
        public static final java.lang.String URL = "url";
        public static final java.lang.String WEBVIEW_ERROR = "webview_error";
        public static final java.lang.String WEBVIEW_ERROR_CODE = "webview_error_code";
        public static final java.lang.String WEBVIEW_URL = "webview_url";

        private Companion() {
        }
    }
}
