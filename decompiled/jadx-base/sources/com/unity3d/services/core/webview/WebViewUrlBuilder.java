package com.unity3d.services.core.webview;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewUrlBuilder {
    private final com.unity3d.services.core.request.metrics.SDKMetricsSender _sdkMetricsSender = (com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class);
    private final java.lang.String _urlWithQueryString;

    public WebViewUrlBuilder(java.lang.String str, com.unity3d.services.core.configuration.Configuration configuration) {
        this._urlWithQueryString = str + ((("?platform=android" + buildQueryParam("origin", configuration.getWebViewUrl())) + buildQueryParam("version", configuration.getWebViewVersion())) + buildQueryParam("isNativeCollectingMetrics", java.lang.String.valueOf(configuration.areMetricsEnabledForCurrentSession())));
    }

    public java.lang.String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }

    private java.lang.String buildQueryParam(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return "";
        }
        try {
            return com.ironsource.y8.i.c + str + com.ironsource.y8.i.b + java.net.URLEncoder.encode(str2, com.adjust.sdk.Constants.ENCODING);
        } catch (java.io.UnsupportedEncodingException e) {
            com.unity3d.services.core.log.DeviceLog.exception(java.lang.String.format("Unsupported charset when encoding %s", str), e);
            return "";
        }
    }
}
