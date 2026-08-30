package com.unity3d.services.ads.adunit;

/* JADX INFO: loaded from: classes6.dex */
public class AdUnitOpen {
    private static com.unity3d.services.core.configuration.Configuration _configuration;
    private static final com.unity3d.services.core.request.metrics.SDKMetricsSender _sdkMetricsSender = (com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class);
    private static android.os.ConditionVariable _waitShowStatus;

    public static synchronized boolean open(java.lang.String str, org.json.JSONObject jSONObject) throws java.lang.NoSuchMethodException {
        boolean zBlock;
        java.lang.reflect.Method method = com.unity3d.services.ads.adunit.AdUnitOpen.class.getMethod("showCallback", com.unity3d.services.core.webview.bridge.CallbackStatus.class);
        _waitShowStatus = new android.os.ConditionVariable();
        if (_configuration == null) {
            _configuration = new com.unity3d.services.core.configuration.Configuration();
        }
        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().invokeMethod(com.ironsource.y8.h.K, com.json.j5.v, method, str, jSONObject);
        zBlock = _waitShowStatus.block(_configuration.getShowTimeout());
        _waitShowStatus = null;
        if (!zBlock) {
            _sdkMetricsSender.sendMetric(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdShowFailure(com.unity3d.services.core.request.metrics.AdOperationError.timeout, java.lang.Long.valueOf(_configuration.getShowTimeout())));
        }
        return zBlock;
    }

    public static void showCallback(com.unity3d.services.core.webview.bridge.CallbackStatus callbackStatus) {
        if (_waitShowStatus == null || !callbackStatus.equals(com.unity3d.services.core.webview.bridge.CallbackStatus.OK)) {
            return;
        }
        _waitShowStatus.open();
    }

    public static void setConfiguration(com.unity3d.services.core.configuration.Configuration configuration) {
        _configuration = configuration;
    }
}
