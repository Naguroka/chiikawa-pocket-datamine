package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public enum zzfgh {
    SIGNALS("signals"),
    REQUEST_PARCEL("request-parcel"),
    SERVER_TRANSACTION("server-transaction"),
    RENDERER("renderer"),
    GMS_SIGNALS("gms-signals"),
    AD_REQUEST("ad_request"),
    BUILD_URL("build-url"),
    PREPARE_HTTP_REQUEST("prepare-http-request"),
    HTTP(androidx.webkit.ProxyConfig.MATCH_HTTP),
    PROXY("proxy"),
    PRE_PROCESS("preprocess"),
    GET_SIGNALS("get-signals"),
    JS_SIGNALS("js-signals"),
    RENDER_CONFIG_INIT("render-config-init"),
    RENDER_CONFIG_WATERFALL("render-config-waterfall"),
    RENDER_CONFIG_PARALLEL("render-config-parallel"),
    ADAPTER_LOAD_AD_SYN("adapter-load-ad-syn"),
    ADAPTER_LOAD_AD_ACK("adapter-load-ad-ack"),
    ADAPTER_WRAP_ADAPTER("wrap-adapter"),
    CUSTOM_RENDER_SYN("custom-render-syn"),
    CUSTOM_RENDER_ACK("custom-render-ack"),
    WEBVIEW_COOKIE("webview-cookie"),
    GENERATE_SIGNALS("generate-signals"),
    GET_CACHE_KEY("get-cache-key"),
    NOTIFY_CACHE_HIT("notify-cache-hit"),
    GET_URL_AND_CACHE_KEY("get-url-and-cache-key"),
    PRELOADED_LOADER("preloaded-loader");

    private final java.lang.String zzC;

    zzfgh(java.lang.String str) {
        this.zzC = str;
    }

    final java.lang.String zza() {
        return this.zzC;
    }
}
