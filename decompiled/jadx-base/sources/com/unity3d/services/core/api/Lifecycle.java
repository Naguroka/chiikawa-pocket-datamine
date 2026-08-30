package com.unity3d.services.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class Lifecycle {
    private static com.unity3d.services.core.lifecycle.LifecycleListener _listener;

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void register(org.json.JSONArray jSONArray, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (com.unity3d.services.core.properties.ClientProperties.getApplication() != null) {
            if (getLifecycleListener() == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        arrayList.add((java.lang.String) jSONArray.get(i));
                    } catch (org.json.JSONException unused) {
                        webViewCallback.error(com.unity3d.services.core.lifecycle.LifecycleError.JSON_ERROR, new java.lang.Object[0]);
                        return;
                    }
                }
                setLifecycleListener(new com.unity3d.services.core.lifecycle.LifecycleListener(arrayList));
                com.unity3d.services.core.properties.ClientProperties.getApplication().registerActivityLifecycleCallbacks(getLifecycleListener());
                webViewCallback.invoke(new java.lang.Object[0]);
                return;
            }
            webViewCallback.error(com.unity3d.services.core.lifecycle.LifecycleError.LISTENER_NOT_NULL, new java.lang.Object[0]);
            return;
        }
        webViewCallback.error(com.unity3d.services.core.lifecycle.LifecycleError.APPLICATION_NULL, new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void unregister(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (com.unity3d.services.core.properties.ClientProperties.getApplication() != null) {
            if (getLifecycleListener() != null) {
                com.unity3d.services.core.properties.ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(getLifecycleListener());
                setLifecycleListener(null);
            }
            webViewCallback.invoke(new java.lang.Object[0]);
            return;
        }
        webViewCallback.error(com.unity3d.services.core.lifecycle.LifecycleError.APPLICATION_NULL, new java.lang.Object[0]);
    }

    public static com.unity3d.services.core.lifecycle.LifecycleListener getLifecycleListener() {
        return _listener;
    }

    public static void setLifecycleListener(com.unity3d.services.core.lifecycle.LifecycleListener lifecycleListener) {
        _listener = lifecycleListener;
    }
}
