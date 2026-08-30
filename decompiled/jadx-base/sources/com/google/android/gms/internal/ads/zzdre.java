package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public enum zzdre {
    PUBLIC_API_CALL("api-call"),
    DYNAMITE_ENTER("dynamite-enter"),
    READ_FROM_DISK_START("read-from-disk-start"),
    READ_FROM_DISK_END("read-from-disk-end"),
    CLIENT_SIGNALS_START("client-signals-start"),
    CLIENT_SIGNALS_END("client-signals-end"),
    SERVICE_CONNECTED("service-connected"),
    GMS_SIGNALS_START("gms-signals-start"),
    GMS_SIGNALS_END("gms-signals-end"),
    GET_SIGNALS_SDKCORE_START("get-signals-sdkcore-start"),
    GET_SIGNALS_SDKCORE_END("get-signals-sdkcore-end"),
    GET_AD_DICTIONARY_SDKCORE_START("get-ad-dictionary-sdkcore-start"),
    GET_AD_DICTIONARY_SDKCORE_END("get-ad-dictionary-sdkcore-end"),
    HTTP_RESPONSE_READY("http-response-ready"),
    NORMALIZATION_AD_RESPONSE_START("normalize-ad-response-start"),
    NORMALIZATION_AD_RESPONSE_END("normalize-ad-response-end"),
    BINDER_CALL_START("binder-call-start"),
    SERVER_RESPONSE_PARSE_START("server-response-parse-start"),
    RENDERING_START("rendering-start"),
    PUBLIC_API_CALLBACK("public-api-callback"),
    RENDERING_WEBVIEW_CREATION_START("rendering-webview-creation-start"),
    RENDERING_WEBVIEW_CREATION_END("rendering-webview-creation-end"),
    RENDERING_AD_COMPONENT_CREATION_END("rendering-ad-component-creation-end"),
    RENDERING_CONFIGURE_WEBVIEW_START("rendering-configure-webview-start"),
    RENDERING_CONFIGURE_WEBVIEW_END("rendering-configure-webview-end"),
    RENDERING_WEBVIEW_LOAD_HTML_START("rendering-webview-load-html-start"),
    RENDERING_WEBVIEW_LOAD_HTML_END("rendering-webview-load-html-end"),
    RENDERING_ADSTRING_TYPE2_FETCH_START("type2-fetch-start"),
    RENDERING_ADSTRING_TYPE2_FETCH_END("type2-fetch-end"),
    SIGNAL_ON_DISK_VALIDATION_START("sod-validation-start"),
    SIGNAL_ON_DISK_VALIDATION_END("sod-validation-end"),
    SIGNAL_ON_DISK_CACHE_KEY_START("sod-cache-key-start"),
    SIGNAL_ON_DISK_CACHE_KEY_END("sod-cache-key-end"),
    SIGNAL_ON_DISK_READ_AND_REMOVE_START("sod-read-and-remove-start"),
    SIGNAL_ON_DISK_READ_AND_REMOVE_END("sod-read-and-remove-end"),
    SIGNAL_ON_DISK_DECODE_START("sod-decode-start"),
    SIGNAL_ON_DISK_DECODE_END("sod-decode-end");

    private final java.lang.String zzM;

    zzdre(java.lang.String str) {
        this.zzM = str;
    }

    public final java.lang.String zza() {
        return this.zzM;
    }
}
