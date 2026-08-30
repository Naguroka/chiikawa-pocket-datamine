package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public final class AMoAdBuildConfig {
    public static java.lang.String API_URL_AD = "https://d.amoad.com/ad/json/";
    public static java.lang.String API_URL_NATIVE_AD = "https://n.amoad.com/n/v1/";
    public static final java.lang.String DOMAIN_NAME = "amoad";
    public static java.lang.String HTML_URL = "https://j.amoad.com/js/webview/native.html";
    public static final java.lang.String SDK_VERSION = "5.2.29";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static java.lang.String[] f118a = {".amoad.com", "amoad.com"};
    static java.lang.String[] b = {"d.amoad.com"};

    public static void toStaging() {
        API_URL_AD = "https://stg-d.amoad.net/ad/json/";
        API_URL_NATIVE_AD = "https://stg-n.amoad.net/n/v1/";
        f118a = new java.lang.String[]{".amoad.com", "amoad.com", ".amoad.net", "amoad.net"};
        b = new java.lang.String[]{"d.amoad.com", "stg-d.amoad.net"};
        HTML_URL = "https://stg-j.amoad.net/js/webview/native.html";
    }
}
