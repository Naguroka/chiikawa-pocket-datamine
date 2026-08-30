package com.unity3d.services.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class Sdk {
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void loadComplete(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.log.DeviceLog.debug("Web Application loaded");
        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().setWebAppLoaded(true);
        java.lang.Object[] objArr = new java.lang.Object[18];
        objArr[0] = com.unity3d.services.core.properties.ClientProperties.getGameId();
        objArr[1] = java.lang.Boolean.valueOf(com.unity3d.services.core.properties.SdkProperties.isTestMode());
        objArr[2] = com.unity3d.services.core.properties.ClientProperties.getAppName();
        objArr[3] = com.unity3d.services.core.properties.ClientProperties.getAppVersion();
        objArr[4] = java.lang.Integer.valueOf(com.unity3d.services.core.properties.SdkProperties.getVersionCode());
        objArr[5] = com.unity3d.services.core.properties.SdkProperties.getVersionName();
        objArr[6] = java.lang.Boolean.valueOf(com.unity3d.services.core.properties.ClientProperties.isAppDebuggable());
        objArr[7] = com.unity3d.services.core.properties.SdkProperties.getConfigUrl();
        objArr[8] = com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getConfiguration().getWebViewUrl();
        objArr[9] = com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getConfiguration().getWebViewHash();
        objArr[10] = com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getConfiguration().getWebViewVersion();
        objArr[11] = java.lang.Long.valueOf(com.unity3d.services.core.properties.SdkProperties.getInitializationTime());
        objArr[12] = java.lang.Boolean.valueOf(com.unity3d.services.core.properties.SdkProperties.isReinitialized());
        objArr[13] = true;
        objArr[14] = java.lang.Boolean.valueOf(com.unity3d.services.core.properties.SdkProperties.getLatestConfiguration() != null);
        objArr[15] = java.lang.Long.valueOf(com.unity3d.services.core.device.Device.getElapsedRealtime());
        objArr[16] = com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getConfiguration().getStateId();
        objArr[17] = com.unity3d.services.core.configuration.PrivacyConfigStorage.getInstance().getPrivacyConfig().getPrivacyStatus().toLowerCase();
        webViewCallback.invoke(objArr);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void initComplete(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.log.DeviceLog.debug("Web Application initialized");
        com.unity3d.services.core.properties.SdkProperties.setInitialized(true);
        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().setWebAppInitialized(true);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void initError(java.lang.String str, java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().setWebAppFailureMessage(str);
        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().setWebAppFailureCode(num.intValue());
        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().setWebAppInitialized(false);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getTrrData(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getConfiguration().getRawConfigData().toString());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getSharedSessionID(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(com.unity3d.services.core.properties.Session.INSTANCE.getId());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setDebugMode(java.lang.Boolean bool, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.properties.SdkProperties.setDebugMode(bool.booleanValue());
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getDebugMode(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Boolean.valueOf(com.unity3d.services.core.properties.SdkProperties.getDebugMode()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void logError(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.log.DeviceLog.error(str);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void logWarning(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.log.DeviceLog.warning(str);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void logInfo(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.log.DeviceLog.info(str);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void logDebug(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.log.DeviceLog.debug(str);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void reinitialize(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.properties.SdkProperties.setReinitialized(true);
        com.unity3d.services.core.configuration.InitializeThread.initialize(com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getConfiguration());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void downloadLatestWebView(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init: WebView called download");
        webViewCallback.invoke(java.lang.Integer.valueOf(com.unity3d.services.core.configuration.InitializeThread.downloadLatestWebView().getValue()));
    }
}
