package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewFeature {
    public static final java.lang.String ALGORITHMIC_DARKENING = "ALGORITHMIC_DARKENING";
    public static final java.lang.String ATTRIBUTION_REGISTRATION_BEHAVIOR = "ATTRIBUTION_REGISTRATION_BEHAVIOR";
    public static final java.lang.String CREATE_WEB_MESSAGE_CHANNEL = "CREATE_WEB_MESSAGE_CHANNEL";
    public static final java.lang.String DISABLED_ACTION_MODE_MENU_ITEMS = "DISABLED_ACTION_MODE_MENU_ITEMS";
    public static final java.lang.String DOCUMENT_START_SCRIPT = "DOCUMENT_START_SCRIPT";
    public static final java.lang.String ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY = "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY";
    public static final java.lang.String FORCE_DARK = "FORCE_DARK";
    public static final java.lang.String FORCE_DARK_STRATEGY = "FORCE_DARK_STRATEGY";
    public static final java.lang.String GET_COOKIE_INFO = "GET_COOKIE_INFO";
    public static final java.lang.String GET_VARIATIONS_HEADER = "GET_VARIATIONS_HEADER";
    public static final java.lang.String GET_WEB_CHROME_CLIENT = "GET_WEB_CHROME_CLIENT";
    public static final java.lang.String GET_WEB_VIEW_CLIENT = "GET_WEB_VIEW_CLIENT";
    public static final java.lang.String GET_WEB_VIEW_RENDERER = "GET_WEB_VIEW_RENDERER";
    public static final java.lang.String MULTI_PROCESS = "MULTI_PROCESS";
    public static final java.lang.String MULTI_PROFILE = "MULTI_PROFILE";
    public static final java.lang.String MUTE_AUDIO = "MUTE_AUDIO";
    public static final java.lang.String OFF_SCREEN_PRERASTER = "OFF_SCREEN_PRERASTER";
    public static final java.lang.String POST_WEB_MESSAGE = "POST_WEB_MESSAGE";
    public static final java.lang.String PROXY_OVERRIDE = "PROXY_OVERRIDE";
    public static final java.lang.String PROXY_OVERRIDE_REVERSE_BYPASS = "PROXY_OVERRIDE_REVERSE_BYPASS";
    public static final java.lang.String RECEIVE_HTTP_ERROR = "RECEIVE_HTTP_ERROR";
    public static final java.lang.String RECEIVE_WEB_RESOURCE_ERROR = "RECEIVE_WEB_RESOURCE_ERROR";
    public static final java.lang.String REQUESTED_WITH_HEADER_ALLOW_LIST = "REQUESTED_WITH_HEADER_ALLOW_LIST";
    public static final java.lang.String SAFE_BROWSING_ALLOWLIST = "SAFE_BROWSING_ALLOWLIST";
    public static final java.lang.String SAFE_BROWSING_ENABLE = "SAFE_BROWSING_ENABLE";
    public static final java.lang.String SAFE_BROWSING_HIT = "SAFE_BROWSING_HIT";
    public static final java.lang.String SAFE_BROWSING_PRIVACY_POLICY_URL = "SAFE_BROWSING_PRIVACY_POLICY_URL";
    public static final java.lang.String SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY = "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY";
    public static final java.lang.String SAFE_BROWSING_RESPONSE_PROCEED = "SAFE_BROWSING_RESPONSE_PROCEED";
    public static final java.lang.String SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL = "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL";

    @java.lang.Deprecated
    public static final java.lang.String SAFE_BROWSING_WHITELIST = "SAFE_BROWSING_WHITELIST";
    public static final java.lang.String SERVICE_WORKER_BASIC_USAGE = "SERVICE_WORKER_BASIC_USAGE";
    public static final java.lang.String SERVICE_WORKER_BLOCK_NETWORK_LOADS = "SERVICE_WORKER_BLOCK_NETWORK_LOADS";
    public static final java.lang.String SERVICE_WORKER_CACHE_MODE = "SERVICE_WORKER_CACHE_MODE";
    public static final java.lang.String SERVICE_WORKER_CONTENT_ACCESS = "SERVICE_WORKER_CONTENT_ACCESS";
    public static final java.lang.String SERVICE_WORKER_FILE_ACCESS = "SERVICE_WORKER_FILE_ACCESS";
    public static final java.lang.String SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST = "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST";
    public static final java.lang.String SHOULD_OVERRIDE_WITH_REDIRECTS = "SHOULD_OVERRIDE_WITH_REDIRECTS";
    public static final java.lang.String STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX = "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX";
    public static final java.lang.String STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS = "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS";
    public static final java.lang.String START_SAFE_BROWSING = "START_SAFE_BROWSING";
    public static final java.lang.String TRACING_CONTROLLER_BASIC_USAGE = "TRACING_CONTROLLER_BASIC_USAGE";
    public static final java.lang.String USER_AGENT_METADATA = "USER_AGENT_METADATA";
    public static final java.lang.String VISUAL_STATE_CALLBACK = "VISUAL_STATE_CALLBACK";
    public static final java.lang.String WEBVIEW_MEDIA_INTEGRITY_API_STATUS = "WEBVIEW_MEDIA_INTEGRITY_API_STATUS";
    public static final java.lang.String WEB_MESSAGE_ARRAY_BUFFER = "WEB_MESSAGE_ARRAY_BUFFER";
    public static final java.lang.String WEB_MESSAGE_CALLBACK_ON_MESSAGE = "WEB_MESSAGE_CALLBACK_ON_MESSAGE";
    public static final java.lang.String WEB_MESSAGE_LISTENER = "WEB_MESSAGE_LISTENER";
    public static final java.lang.String WEB_MESSAGE_PORT_CLOSE = "WEB_MESSAGE_PORT_CLOSE";
    public static final java.lang.String WEB_MESSAGE_PORT_POST_MESSAGE = "WEB_MESSAGE_PORT_POST_MESSAGE";
    public static final java.lang.String WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK = "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK";
    public static final java.lang.String WEB_RESOURCE_ERROR_GET_CODE = "WEB_RESOURCE_ERROR_GET_CODE";
    public static final java.lang.String WEB_RESOURCE_ERROR_GET_DESCRIPTION = "WEB_RESOURCE_ERROR_GET_DESCRIPTION";
    public static final java.lang.String WEB_RESOURCE_REQUEST_IS_REDIRECT = "WEB_RESOURCE_REQUEST_IS_REDIRECT";
    public static final java.lang.String WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE = "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE";
    public static final java.lang.String WEB_VIEW_RENDERER_TERMINATE = "WEB_VIEW_RENDERER_TERMINATE";

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface WebViewStartupFeature {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface WebViewSupportFeature {
    }

    private WebViewFeature() {
    }

    public static boolean isFeatureSupported(java.lang.String str) {
        return androidx.webkit.internal.WebViewFeatureInternal.isSupported(str);
    }

    public static boolean isStartupFeatureSupported(android.content.Context context, java.lang.String str) {
        return androidx.webkit.internal.WebViewFeatureInternal.isStartupFeatureSupported(str, context);
    }
}
