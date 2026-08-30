package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class EnvironmentCheck {
    public static boolean isEnvironmentOk() {
        return testProGuard() && testCacheDirectory();
    }

    public static boolean testProGuard() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.unity3d.services.core.webview.bridge.WebViewBridgeInterface");
            java.lang.reflect.Method method = cls.getMethod("handleInvocation", java.lang.String.class);
            java.lang.reflect.Method method2 = cls.getMethod("handleCallback", java.lang.String.class, java.lang.String.class, java.lang.String.class);
            if (hasJavascriptInterface(method) && hasJavascriptInterface(method2)) {
                com.unity3d.services.core.log.DeviceLog.debug("Unity Ads ProGuard check OK");
                return true;
            }
            com.unity3d.services.core.log.DeviceLog.error("Unity Ads ProGuard check fail: missing @JavascriptInterface annotations in Unity Ads web bridge");
            return false;
        } catch (java.lang.ClassNotFoundException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Unity Ads ProGuard check fail: Unity Ads web bridge class not found", e);
            return false;
        } catch (java.lang.NoSuchMethodException e2) {
            com.unity3d.services.core.log.DeviceLog.exception("Unity Ads ProGuard check fail: Unity Ads web bridge methods not found", e2);
            return false;
        } catch (java.lang.Exception e3) {
            com.unity3d.services.core.log.DeviceLog.exception("Unknown exception during Unity Ads ProGuard check: " + e3.getMessage(), e3);
            return true;
        }
    }

    public static boolean testCacheDirectory() {
        java.io.File cacheDirectory = com.unity3d.services.core.properties.SdkProperties.getCacheDirectory();
        java.io.File webViewCacheDirectory = com.unity3d.services.core.properties.SdkProperties.getWebViewCacheDirectory();
        if (cacheDirectory != null && webViewCacheDirectory != null) {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads cache directory check OK");
            return true;
        }
        com.unity3d.services.core.log.DeviceLog.error("Unity Ads cache directory check fail: no working cache directory available");
        return false;
    }

    private static boolean hasJavascriptInterface(java.lang.reflect.Method method) {
        java.lang.annotation.Annotation[] annotations = method.getAnnotations();
        if (annotations != null) {
            for (java.lang.annotation.Annotation annotation : annotations) {
                if (annotation instanceof android.webkit.JavascriptInterface) {
                    return true;
                }
            }
        }
        return false;
    }
}
